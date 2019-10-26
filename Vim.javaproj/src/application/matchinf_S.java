package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * spell.c: code for spell checking
 *
 * See spellfile.c for the Vim spell file format.
 *
 * The spell checking mechanism uses a tree (aka trie).  Each node in the tree
 * has a list of bytes that can appear (siblings).  For each byte there is a
 * pointer to the node with the byte that follows in the word (child).
 *
 * A NUL byte is used where the word may end.  The bytes are sorted, so that
 * binary searching can be used and the NUL bytes are at the start.  The
 * number of possible bytes is stored before the list of bytes.
 *
 * The tree uses two arrays: "byts" stores the characters, "idxs" stores
 * either the next index or flags.  The tree starts at index 0.  For example,
 * to lookup "vi" this sequence is followed:
 *	i = 0
 *	len = byts[i]
 *	n = where "v" appears in byts[i + 1] to byts[i + len]
 *	i = idxs[n]
 *	len = byts[i]
 *	n = where "i" appears in byts[i + 1] to byts[i + len]
 *	i = idxs[n]
 *	len = byts[i]
 *	find that byts[i + 1] is 0, idxs[i + 1] has flags for "vi".
 *
 * There are two word trees: one with case-folded words and one with words in
 * original case.  The second one is only used for keep-case words and is
 * usually small.
 *
 * There is one additional tree for when not all prefixes are applied when
 * generating the .spl file.  This tree stores all the possible prefixes, as
 * if they were words.  At each word (prefix) end the prefix nr is stored, the
 * following word must support this prefix nr.  And the condition nr is
 * stored, used to lookup the condition that the word must match with.
 *
 * Thanks to Olaf Seibert for providing an example implementation of this tree
 * and the compression mechanism.
 * LZ trie ideas:
 *	http://www.irb.hr/hr/home/ristov/papers/RistovLZtrieRevision1.pdf
 * More papers: http://www-igm.univ-mlv.fr/~laporte/publi_en.html
 *
 * Matching involves checking the caps type: Onecap ALLCAP KeepCap.
 *
 * Why doesn't Vim use aspell/ispell/myspell/etc.?
 * See ":help develop-spell".
 */
/* it's in os_unix.h for Unix */
/* for time_t */
/* for time_t */
/* word valid in all regions */
/* string at start of Vim .sug file */
/* Result values.  Lower number is accepted over higher one. */
/*
 * Structure to store info for word matching.
 */
public class matchinf_S {
	private langp_S mi_lp;
	private Object mi_word;
	private Object mi_end;
	private Object mi_fend;
	private Object mi_cend;
	private Object mi_fword;
	private int mi_fwordlen;
	private int mi_prefarridx;
	private int mi_prefcnt;
	private int mi_prefixlen;
	private int mi_cprefixlen;
	private int mi_compoff;
	private Object mi_compflags;
	private int mi_complen;
	private int mi_compextra;
	private int mi_result;
	private int mi_capflags;
	private window_S mi_win;
	private int mi_result2;
	private Object mi_end2;
	
	public matchinf_S(langp_S mi_lp, Object mi_word, Object mi_end, Object mi_fend, Object mi_cend, Object mi_fword, int mi_fwordlen, int mi_prefarridx, int mi_prefcnt, int mi_prefixlen, int mi_cprefixlen, int mi_compoff, Object mi_compflags, int mi_complen, int mi_compextra, int mi_result, int mi_capflags, window_S mi_win, int mi_result2, Object mi_end2) {
		setMi_lp(mi_lp);
		setMi_word(mi_word);
		setMi_end(mi_end);
		setMi_fend(mi_fend);
		setMi_cend(mi_cend);
		setMi_fword(mi_fword);
		setMi_fwordlen(mi_fwordlen);
		setMi_prefarridx(mi_prefarridx);
		setMi_prefcnt(mi_prefcnt);
		setMi_prefixlen(mi_prefixlen);
		setMi_cprefixlen(mi_cprefixlen);
		setMi_compoff(mi_compoff);
		setMi_compflags(mi_compflags);
		setMi_complen(mi_complen);
		setMi_compextra(mi_compextra);
		setMi_result(mi_result);
		setMi_capflags(mi_capflags);
		setMi_win(mi_win);
		setMi_result2(mi_result2);
		setMi_end2(mi_end2);
	}
	public matchinf_S() {
	}
	
	/* find word after prefix */
	/* find case-folded compound word */
	/* find keep-case compound word */
	public void find_word(int mode) {
		idx_T arridx = 0;
		int[] endlen = new int[/* length at possible word endings */254];
		idx_T[] endidx = new idx_T();
		int endidxcnt = 0;
		int len;
		int wlen = 0;
		int flen;
		int c;
		char_u ptr = new char_u();
		idx_T lo = new idx_T();
		idx_T hi = new idx_T();
		idx_T m = new idx_T();
		char_u s = new char_u();
		char_u p = new char_u();
		int res = 3;
		langp_S generatedMi_lp = this.getMi_lp();
		slang_S generatedLp_slang = generatedMi_lp.getLp_slang();
		slang_T slang = generatedLp_slang;
		int flags;
		char_u byts = new char_u();
		idx_T idxs = new idx_T();
		int word_ends;
		int prefix_found;
		int nobreak_result;
		Object generatedMi_word = this.getMi_word();
		Object generatedSl_kbyts = slang.getSl_kbyts();
		Object generatedSl_kidxs = slang.getSl_kidxs();
		int generatedMi_compoff = this.getMi_compoff();
		Object generatedMi_fword = this.getMi_fword();
		int generatedMi_fwordlen = this.getMi_fwordlen();
		Object generatedSl_fbyts = slang.getSl_fbyts();
		Object generatedSl_fidxs = slang.getSl_fidxs();
		int generatedMi_prefixlen = this.getMi_prefixlen();
		if (mode == 1 || mode == 4) {
			ptr = generatedMi_word;
			flen = /* no case folding, always enough bytes */9999;
			byts = generatedSl_kbyts;
			idxs = generatedSl_kidxs;
			if (mode == 4) {
				wlen += generatedMi_compoff;
			} 
		} else {
				ptr = generatedMi_fword;
				flen = generatedMi_fwordlen;
				byts = generatedSl_fbyts;
				idxs = generatedSl_fidxs;
				if (mode == 2) {
					wlen = generatedMi_prefixlen;
					flen -= generatedMi_prefixlen;
				}  else if (mode == 3) {
					wlen = generatedMi_compoff;
					flen -= generatedMi_compoff;
				} 
		} 
		if (byts == ((Object)0)) {
			return ;
		} 
		Object generatedMi_fend = this.getMi_fend();
		for (; ; ) {
			if (flen <= 0 && generatedMi_fend != (byte)'\000') {
				flen = mip.fold_more();
			} 
			len = byts[arridx++];
			if (byts[arridx] == /* If the first possible byte is a zero the word could end here.
				 * Remember this index, we first check for the longest word. */0) {
				if (endidxcnt == 254) {
					ModernizedCProgram.emsg(((byte)(/* Must be a corrupted spell file. */e_format)));
					return ;
				} 
				endlen[endidxcnt] = wlen;
				endidx[endidxcnt++] = arridx++;
				--len;
				while (len > 0 && byts[arridx] == /* Skip over the zeros, there can be several flag/region
					     * combinations. */0) {
					++arridx;
					--len;
				}
				if (len == 0) {
					break;
				} 
			} 
			if (ptr[wlen] == /* Stop looking at end of the line. */(byte)'\000') {
				break;
			} 
			c = ptr[/* Perform a binary search in the list of accepted bytes. */wlen];
			if (c == /* <Tab> is handled like <Space> */(byte)'\011') {
				c = (byte)' ';
			} 
			lo = arridx;
			hi = arridx + len - 1;
			while (lo < hi) {
				m = (lo + hi) / 2;
				if (byts[m] > c) {
					hi = m - 1;
				}  else if (byts[m] < c) {
					lo = m + 1;
				} else {
						lo = hi = m;
						break;
				} 
			}
			if (hi < lo || byts[lo] != /* Stop if there is no matching byte. */c) {
				break;
			} 
			arridx = idxs[/* Continue at the child (if there is one). */lo];
			++wlen;
			--flen;
			if (c == /* One space in the good word may stand for several spaces in the
				 * checked word. */(byte)' ') {
				for (; ; ) {
					if (flen <= 0 && generatedMi_fend != (byte)'\000') {
						flen = mip.fold_more();
					} 
					if (ptr[wlen] != (byte)' ' && ptr[wlen] != (byte)'\011') {
						break;
					} 
					++wlen;
					--flen;
				}
			} 
		}
		window_S generatedMi_win = this.getMi_win();
		Object generatedSl_compprog = slang.getSl_compprog();
		Object generatedSl_nobreak = slang.getSl_nobreak();
		Object generatedMi_cend = this.getMi_cend();
		int generatedMi_capflags = this.getMi_capflags();
		int generatedMi_prefcnt = this.getMi_prefcnt();
		int generatedMi_prefarridx = this.getMi_prefarridx();
		int generatedMi_cprefixlen = this.getMi_cprefixlen();
		int generatedSl_compminlen = slang.getSl_compminlen();
		int generatedMi_complen = this.getMi_complen();
		int generatedMi_compextra = this.getMi_compextra();
		int generatedSl_compmax = slang.getSl_compmax();
		int generatedSl_compsylmax = slang.getSl_compsylmax();
		Object generatedSl_compstartflags = slang.getSl_compstartflags();
		Object generatedSl_compallflags = slang.getSl_compallflags();
		Object generatedSl_comppat = slang.getSl_comppat();
		Object generatedMi_compflags = this.getMi_compflags();
		Object generatedSl_comprules = slang.getSl_comprules();
		int generatedMi_result = this.getMi_result();
		Object generatedMi_end = this.getMi_end();
		Object generatedW_s = generatedMi_win.getW_s();
		int generatedLp_region = generatedMi_lp.getLp_region();
		int generatedMi_result2 = this.getMi_result2();
		Object generatedMi_end2 = this.getMi_end2();
		while (endidxcnt > /*
		     * Verify that one of the possible endings is valid.  Try the longest
		     * first.
		     */0) {
			--endidxcnt;
			arridx = endidx[endidxcnt];
			wlen = endlen[endidxcnt];
			if (.UNRECOGNIZEDFUNCTIONNAME(ptr, ptr + wlen) > 0) {
				continue;
			} 
			if (generatedMi_win.spell_iswordp(ptr + wlen)) {
				if (generatedSl_compprog == ((Object)0) && !generatedSl_nobreak) {
					continue;
				} 
				word_ends = 0;
			} else {
					word_ends = 1/* The prefix flag is before compound flags.  Once a valid prefix flag
						 * has been found we try compound flags. */;
			} 
			prefix_found = 0;
			if (mode != 1 && has_mbyte/* Compute byte length in original word, length may change
				     * when folding case.  This can be slow, take a shortcut when the
				     * case-folded word is equal to the keep-case word. */) {
				p = generatedMi_word;
				if (.strncmp((byte)(ptr), (byte)(p), (size_t)(wlen)) != 0) {
					for (s = ptr; s < ptr + wlen; s += .UNRECOGNIZEDFUNCTIONNAME(s)) {
						p += .UNRECOGNIZEDFUNCTIONNAME(p);
					}
					wlen = (int)(p - generatedMi_word);
				} 
			} 
			res = /* Check flags and region.  For FIND_PREFIX check the condition and
				 * prefix ID.
				 * Repeat this if there are more flags/region alternatives until there
				 * is a match. */3;
			for (len = byts[arridx - 1]; len > 0 && byts[arridx] == 0; ) {
				flags = idxs[arridx/* For the fold-case tree check that the case of the checked word
					     * matches with what the word in the tree requires.
					     * For keep-case tree the case is always right.  For prefixes we
					     * don't bother to check. */];
				if (mode == 0) {
					if (generatedMi_cend != generatedMi_word + wlen) {
						this.setMi_cend(generatedMi_word + /* mi_capflags was set for a different word length, need
								     * to do it again. */wlen);
						this.setMi_capflags(ModernizedCProgram.captype(generatedMi_word, generatedMi_cend));
					} 
					if (generatedMi_capflags == -1024 || !ModernizedCProgram.spell_valid_case(generatedMi_capflags, flags)) {
						continue;
					} 
				}  else if (mode == 2 && !/* When mode is FIND_PREFIX the word must support the prefix:
					     * check the prefix ID and the condition.  Do that for the list at
					     * mip->mi_prefarridx that find_prefix() filled. */prefix_found) {
					c = slang.valid_word_prefix(generatedMi_prefcnt, generatedMi_prefarridx, flags, generatedMi_word + generatedMi_cprefixlen, 0);
					if (c == 0) {
						continue;
					} 
					if (c & (-1024 << /* Use the WF_RARE flag for a rare prefix. */24)) {
						flags |=  -1024;
					} 
					prefix_found = 1;
				} 
				if (generatedSl_nobreak) {
					if ((mode == 3 || mode == 4) && (flags & -1024) == 0) {
						this.setMi_result(/* NOBREAK: found a valid following word.  That's all we
								     * need to know, so return. */0);
						break;
					} 
				}  else if ((mode == 3 || mode == 4 || !word_ends/* If there is no compound flag or the word is shorter than
						 * COMPOUNDMIN reject it quickly.
						 * Makes you wonder why someone puts a compound flag on a word
						 * that's too short...  Myspell compatibility requires this
						 * anyway. */)) {
					if (((int)flags >> 24) == 0 || wlen - generatedMi_compoff < generatedSl_compminlen) {
						continue;
					} 
					if (has_mbyte && generatedSl_compminlen > 0 && ModernizedCProgram.mb_charlen_len(generatedMi_word + generatedMi_compoff, wlen - generatedMi_compoff) < generatedSl_compminlen) {
						continue;
					} 
					if (!word_ends && generatedMi_complen + generatedMi_compextra + /* Limit the number of compound words to COMPOUNDWORDMAX if no
							 * maximum for syllables is specified. */2 > generatedSl_compmax && generatedSl_compsylmax == 254) {
						continue;
					} 
					if (generatedMi_complen > 0 && (flags & /* Don't allow compounding on a side where an affix was added,
							 * unless COMPOUNDPERMITFLAG was used. */-1024)) {
						continue;
					} 
					if (!word_ends && (flags & -1024)) {
						continue;
					} 
					if (!ModernizedCProgram.byte_in_str(generatedMi_complen == /* Quickly check if compounding is possible with this flag. */0 ? generatedSl_compstartflags : generatedSl_compallflags, ((int)flags >> 24))) {
						continue;
					} 
					if (generatedSl_comppat.match_checkcompoundpattern(ptr, wlen)) {
						continue;
					} 
					if (mode == 3) {
						int capflags;
						if (has_mbyte && .strncmp((byte)(ptr), (byte)(generatedMi_word), (size_t)(generatedMi_compoff)) != 0) {
							p = generatedMi_word;
							for (s = ptr; s < ptr + generatedMi_compoff; s += .UNRECOGNIZEDFUNCTIONNAME(s)) {
								p += .UNRECOGNIZEDFUNCTIONNAME(p);
							}
						} else {
								p = generatedMi_word + generatedMi_compoff;
						} 
						capflags = ModernizedCProgram.captype(p, generatedMi_word + wlen);
						if (capflags == -1024 || (capflags == -1024 && (flags & -1024) != 0)) {
							continue;
						} 
						if (capflags != -1024/* When the character before the word is a word
									 * character we do not accept a Onecap word.  We do
									 * accept a no-caps word, even when the dictionary
									 * word specifies ONECAP. */) {
							p -= has_mbyte ? (.UNRECOGNIZEDFUNCTIONNAME(generatedMi_word, p - 1) + 1) : 1;
							if (generatedMi_win.spell_iswordp_nmw(p) ? capflags == -1024 : (flags & -1024) != 0 && capflags != -1024) {
								continue;
							} 
						} 
					} 
					generatedMi_compflags[generatedMi_complen] = ((int)flags >> /* If the word ends the sequence of compound flags of the
							 * words must match with one of the COMPOUNDRULE items and
							 * the number of syllables must not be too large. */24);
					generatedMi_compflags[generatedMi_complen + 1] = (byte)'\000';
					if (word_ends) {
						char_u[] fword = new char_u();
						if (generatedSl_compsylmax < 254) {
							if (ptr == generatedMi_word) {
								(Object)ModernizedCProgram.spell_casefold(ptr, wlen, fword, 254);
							} else {
									ModernizedCProgram.vim_strncpy(fword, ptr, endlen[endidxcnt]);
							} 
						} 
						if (!slang.can_compound(fword, generatedMi_compflags)) {
							continue;
						} 
					}  else if (generatedSl_comprules != ((Object)0) && !slang.match_compoundrule(generatedMi_compflags)) {
						continue;
					} 
				}  else if (flags & /* Check NEEDCOMPOUND: can't use word without compounding. */-1024) {
					continue;
				} 
				nobreak_result = 0;
				if (!word_ends) {
					int save_result = generatedMi_result;
					char_u save_end = generatedMi_end;
					langp_T save_lp = generatedMi_lp;
					int lpi;
					if (generatedSl_nobreak) {
						this.setMi_result(3);
					} 
					this.setMi_compoff(endlen[/* Find following word in case-folded tree. */endidxcnt]);
					if (has_mbyte && mode == 1/* Compute byte length in case-folded word from "wlen":
							     * byte length in keep-case word.  Length may change when
							     * folding case.  This can be slow, take a shortcut when
							     * the case-folded word is equal to the keep-case word. */) {
						p = generatedMi_fword;
						if (.strncmp((byte)(ptr), (byte)(p), (size_t)(wlen)) != 0) {
							for (s = ptr; s < ptr + wlen; s += .UNRECOGNIZEDFUNCTIONNAME(s)) {
								p += .UNRECOGNIZEDFUNCTIONNAME(p);
							}
							this.setMi_compoff((int)(p - generatedMi_fword));
						} 
					} 
					++generatedMi_complen;
					if (flags & -1024) {
						++generatedMi_compextra;
					} 
					for (lpi = 0; lpi < generatedW_s.getB_langp().getGa_len(); ++/* For NOBREAK we need to try all NOBREAK languages, at least
							 * to find the ".add" file(s). */lpi) {
						if (generatedSl_nobreak) {
							this.setMi_lp((((langp_T)(generatedW_s.getB_langp()).getGa_data()) + (lpi)));
							if (generatedSl_fidxs == ((Object)0) || !generatedSl_nobreak) {
								continue;
							} 
						} 
						mip.find_word(3/* When NOBREAK any word that matches is OK.  Otherwise we
								     * need to find the longest match, thus try with keep-case
								     * and prefix too. */);
						if (!generatedSl_nobreak || generatedMi_result == 3) {
							this.setMi_compoff(/* Find following word in keep-case tree. */wlen);
							mip.find_word(4/* Disabled, a prefix must not appear halfway a compound word,
								       unless the COMPOUNDPERMITFLAG is used and then it can't be a
								       postponed prefix. *//* Disabled, a prefix must not appear halfway a compound word,
								       unless the COMPOUNDPERMITFLAG is used and then it can't be a
								       postponed prefix. */);
						} 
						if (!generatedSl_nobreak) {
							break;
						} 
					}
					--generatedMi_complen;
					if (flags & -1024) {
						--generatedMi_compextra;
					} 
					this.setMi_lp(save_lp);
					if (generatedSl_nobreak) {
						nobreak_result = generatedMi_result;
						this.setMi_result(save_result);
						this.setMi_end(save_end);
					} else {
							if (generatedMi_result == 0) {
								break;
							} 
							continue;
					} 
				} 
				if (flags & -1024) {
					res = -1;
				}  else if (flags & -1024) {
					if ((generatedLp_region & (flags >> 16)) != /* Check region. */0) {
						res = 0;
					} else {
							res = 2;
					} 
				}  else if (flags & -1024) {
					res = 1;
				} else {
						res = 0/* Always use the longest match and the best result.  For NOBREAK
							     * we separately keep the longest match without a following good
							     * word as a fall-back. */;
				} 
				if (nobreak_result == 3) {
					if (generatedMi_result2 > res) {
						this.setMi_result2(res);
						this.setMi_end2(generatedMi_word + wlen);
					}  else if (generatedMi_result2 == res && generatedMi_end2 < generatedMi_word + wlen) {
						this.setMi_end2(generatedMi_word + wlen);
					} 
				}  else if (generatedMi_result > res) {
					this.setMi_result(res);
					this.setMi_end(generatedMi_word + wlen);
				}  else if (generatedMi_result == res && generatedMi_end < generatedMi_word + wlen) {
					this.setMi_end(generatedMi_word + wlen);
				} 
				if (generatedMi_result == 0) {
					break;
				} 
			}
			if (generatedMi_result == 0) {
				break;
			} 
		}
	}
	public void find_prefix(int mode) {
		idx_T arridx = 0;
		int len;
		int wlen = 0;
		int flen;
		int c;
		char_u ptr = new char_u();
		idx_T lo = new idx_T();
		idx_T hi = new idx_T();
		idx_T m = new idx_T();
		langp_S generatedMi_lp = this.getMi_lp();
		slang_S generatedLp_slang = generatedMi_lp.getLp_slang();
		slang_T slang = generatedLp_slang;
		char_u byts = new char_u();
		idx_T idxs = new idx_T();
		Object generatedSl_pbyts = slang.getSl_pbyts();
		byts = generatedSl_pbyts;
		if (byts == ((Object)0)) {
			return ;
		} 
		Object generatedMi_fword = this.getMi_fword();
		ptr = generatedMi_fword;
		int generatedMi_fwordlen = this.getMi_fwordlen();
		flen = generatedMi_fwordlen;
		int generatedMi_compoff = this.getMi_compoff();
		if (mode == 3) {
			ptr += generatedMi_compoff;
			flen -= generatedMi_compoff;
		} 
		Object generatedSl_pidxs = slang.getSl_pidxs();
		idxs = generatedSl_pidxs;
		Object generatedMi_fend = this.getMi_fend();
		int generatedMi_prefcnt = this.getMi_prefcnt();
		int generatedMi_prefixlen = this.getMi_prefixlen();
		Object generatedMi_word = this.getMi_word();
		for (; ; ) {
			if (flen == 0 && generatedMi_fend != (byte)'\000') {
				flen = mip.fold_more();
			} 
			len = byts[arridx++];
			if (byts[arridx] == /* If the first possible byte is a zero the prefix could end here.
				 * Check if the following word matches and supports the prefix. */0/* There can be several prefixes with different conditions.  We
				     * try them all, since we don't know which one will give the
				     * longest match.  The word is the same each time, pass the list
				     * of possible prefixes to find_word(). */) {
				this.setMi_prefarridx(arridx);
				this.setMi_prefcnt(len);
				while (len > 0 && byts[arridx] == 0) {
					++arridx;
					--len;
				}
				generatedMi_prefcnt -= len;
				this.setMi_prefixlen(/* Find the word that comes after the prefix. */wlen);
				if (mode == 3) {
					generatedMi_prefixlen += generatedMi_compoff;
				} 
				if (has_mbyte) {
					this.setMi_cprefixlen(ModernizedCProgram.nofold_len(generatedMi_fword, generatedMi_prefixlen, generatedMi_word));
				} else {
						this.setMi_cprefixlen(generatedMi_prefixlen);
				} 
				mip.find_word(2);
				if (len == 0) {
					break;
				} 
			} 
			if (ptr[wlen] == /* Stop looking at end of the line. */(byte)'\000') {
				break;
			} 
			c = ptr[/* Perform a binary search in the list of accepted bytes. */wlen];
			lo = arridx;
			hi = arridx + len - 1;
			while (lo < hi) {
				m = (lo + hi) / 2;
				if (byts[m] > c) {
					hi = m - 1;
				}  else if (byts[m] < c) {
					lo = m + 1;
				} else {
						lo = hi = m;
						break;
				} 
			}
			if (hi < lo || byts[lo] != /* Stop if there is no matching byte. */c) {
				break;
			} 
			arridx = idxs[/* Continue at the child (if there is one). */lo];
			++wlen;
			--flen/*
			 * Need to fold at least one more character.  Do until next non-word character
			 * for efficiency.  Include the non-word character too.
			 * Return the length of the folded chars in bytes.
			 */;
		}
	}
	public int fold_more() {
		int flen;
		char_u p = new char_u();
		Object generatedMi_fend = this.getMi_fend();
		p = generatedMi_fend;
		window_S generatedMi_win = this.getMi_win();
		do {
			generatedMi_fend += .UNRECOGNIZEDFUNCTIONNAME(generatedMi_fend);
		} while (generatedMi_fend != (byte)'\000' && generatedMi_win.spell_iswordp(generatedMi_fend));
		if (generatedMi_fend != /* Include the non-word character so that we can check for the word end. */(byte)'\000') {
			generatedMi_fend += .UNRECOGNIZEDFUNCTIONNAME(generatedMi_fend);
		} 
		Object generatedMi_fword = this.getMi_fword();
		int generatedMi_fwordlen = this.getMi_fwordlen();
		(Object)ModernizedCProgram.spell_casefold(p, (int)(generatedMi_fend - p), generatedMi_fword + generatedMi_fwordlen, 254 - generatedMi_fwordlen);
		flen = (int).strlen((byte)(generatedMi_fword + generatedMi_fwordlen));
		generatedMi_fwordlen += flen;
		return flen/*
		 * Check case flags for a word.  Return TRUE if the word has the requested
		 * case.
		 */;
	}
	public langp_S getMi_lp() {
		return mi_lp;
	}
	public void setMi_lp(langp_S newMi_lp) {
		mi_lp = newMi_lp;
	}
	public Object getMi_word() {
		return mi_word;
	}
	public void setMi_word(Object newMi_word) {
		mi_word = newMi_word;
	}
	public Object getMi_end() {
		return mi_end;
	}
	public void setMi_end(Object newMi_end) {
		mi_end = newMi_end;
	}
	public Object getMi_fend() {
		return mi_fend;
	}
	public void setMi_fend(Object newMi_fend) {
		mi_fend = newMi_fend;
	}
	public Object getMi_cend() {
		return mi_cend;
	}
	public void setMi_cend(Object newMi_cend) {
		mi_cend = newMi_cend;
	}
	public Object getMi_fword() {
		return mi_fword;
	}
	public void setMi_fword(Object newMi_fword) {
		mi_fword = newMi_fword;
	}
	public int getMi_fwordlen() {
		return mi_fwordlen;
	}
	public void setMi_fwordlen(int newMi_fwordlen) {
		mi_fwordlen = newMi_fwordlen;
	}
	public int getMi_prefarridx() {
		return mi_prefarridx;
	}
	public void setMi_prefarridx(int newMi_prefarridx) {
		mi_prefarridx = newMi_prefarridx;
	}
	public int getMi_prefcnt() {
		return mi_prefcnt;
	}
	public void setMi_prefcnt(int newMi_prefcnt) {
		mi_prefcnt = newMi_prefcnt;
	}
	public int getMi_prefixlen() {
		return mi_prefixlen;
	}
	public void setMi_prefixlen(int newMi_prefixlen) {
		mi_prefixlen = newMi_prefixlen;
	}
	public int getMi_cprefixlen() {
		return mi_cprefixlen;
	}
	public void setMi_cprefixlen(int newMi_cprefixlen) {
		mi_cprefixlen = newMi_cprefixlen;
	}
	public int getMi_compoff() {
		return mi_compoff;
	}
	public void setMi_compoff(int newMi_compoff) {
		mi_compoff = newMi_compoff;
	}
	public Object getMi_compflags() {
		return mi_compflags;
	}
	public void setMi_compflags(Object newMi_compflags) {
		mi_compflags = newMi_compflags;
	}
	public int getMi_complen() {
		return mi_complen;
	}
	public void setMi_complen(int newMi_complen) {
		mi_complen = newMi_complen;
	}
	public int getMi_compextra() {
		return mi_compextra;
	}
	public void setMi_compextra(int newMi_compextra) {
		mi_compextra = newMi_compextra;
	}
	public int getMi_result() {
		return mi_result;
	}
	public void setMi_result(int newMi_result) {
		mi_result = newMi_result;
	}
	public int getMi_capflags() {
		return mi_capflags;
	}
	public void setMi_capflags(int newMi_capflags) {
		mi_capflags = newMi_capflags;
	}
	public window_S getMi_win() {
		return mi_win;
	}
	public void setMi_win(window_S newMi_win) {
		mi_win = newMi_win;
	}
	public int getMi_result2() {
		return mi_result2;
	}
	public void setMi_result2(int newMi_result2) {
		mi_result2 = newMi_result2;
	}
	public Object getMi_end2() {
		return mi_end2;
	}
	public void setMi_end2(Object newMi_end2) {
		mi_end2 = newMi_end2;
	}
}
