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
 * spell.h: common code for spell checking, used by spell.c and spellfile.c.
 */
/* Use SPELL_PRINTTREE for debugging: dump the word tree after adding a word.
 * Only use it for small word lists! */
/* Use SPELL_COMPRESS_ALLWAYS for debugging: compress the word tree after
 * adding a word.  Only use it for small word lists! */
/* Use DEBUG_TRIEWALK to print the changes made in suggest_trie_walk() for a
 * specific word. */
/* Assume max. word len is this many bytes.
				   Some places assume a word length fits in a
				   byte, thus it can't be above 255.
				   Must be >= PFD_NOTSPECIAL. */
/* Number of regions supported. */
/* Type used for indexes in the word tree need to be at least 4 bytes.  If int
 * is 8 bytes we could use something smaller, but what? */
/*
 * Structure used to store words and other info for one language, loaded from
 * a .spl file.
 * The main access is through the tree in "sl_fbyts/sl_fidxs", storing the
 * case-folded words.  "sl_kbyts/sl_kidxs" is for keep-case words.
 *
 * The "byts" array stores the possible bytes in each tree node, preceded by
 * the number of possible bytes, sorted on byte value:
 *	<len> <byte1> <byte2> ...
 * The "idxs" array stores the index of the child node corresponding to the
 * byte in "byts".
 * Exception: when the byte is zero, the word may end here and "idxs" holds
 * the flags, region mask and affixID for the word.  There may be several
 * zeros in sequence for alternative flag/region/affixID combinations.
 */
public class slang_S {
	private slang_S sl_next;
	private Object sl_name;
	private Object sl_fname;
	private int sl_add;
	private Object sl_fbyts;
	private Object sl_fidxs;
	private Object sl_kbyts;
	private Object sl_kidxs;
	private Object sl_pbyts;
	private Object sl_pidxs;
	private Object sl_info;
	private Object sl_regions;
	private Object sl_midword;
	private Object sl_wordcount;
	private int sl_compmax;
	private int sl_compminlen;
	private int sl_compsylmax;
	private int sl_compoptions;
	private Object sl_comppat;
	private Object sl_compprog;
	private Object sl_comprules;
	private Object sl_compstartflags;
	private Object sl_compallflags;
	private Object sl_nobreak;
	private Object sl_syllable;
	private Object sl_syl_items;
	private int sl_prefixcnt;
	private Object sl_prefprog;
	private Object sl_rep;
	private Object sl_rep_first;
	private Object sl_sal;
	private Object sl_sal_first;
	private int sl_followup;
	private int sl_collapse;
	private int sl_rem_accents;
	private int sl_sofo;
	private Object sl_repsal;
	private Object sl_repsal_first;
	private int sl_nosplitsugs;
	private int sl_nocompoundsugs;
	private Object sl_sugtime;
	private Object sl_sbyts;
	private Object sl_sidxs;
	private Object sl_sugbuf;
	private int sl_sugloaded;
	private int sl_has_map;
	private Object sl_map_hash;
	private Object sl_map_array;
	private Object sl_sounddone;
	
	public slang_S(slang_S sl_next, Object sl_name, Object sl_fname, int sl_add, Object sl_fbyts, Object sl_fidxs, Object sl_kbyts, Object sl_kidxs, Object sl_pbyts, Object sl_pidxs, Object sl_info, Object sl_regions, Object sl_midword, Object sl_wordcount, int sl_compmax, int sl_compminlen, int sl_compsylmax, int sl_compoptions, Object sl_comppat, Object sl_compprog, Object sl_comprules, Object sl_compstartflags, Object sl_compallflags, Object sl_nobreak, Object sl_syllable, Object sl_syl_items, int sl_prefixcnt, Object sl_prefprog, Object sl_rep, Object sl_rep_first, Object sl_sal, Object sl_sal_first, int sl_followup, int sl_collapse, int sl_rem_accents, int sl_sofo, Object sl_repsal, Object sl_repsal_first, int sl_nosplitsugs, int sl_nocompoundsugs, Object sl_sugtime, Object sl_sbyts, Object sl_sidxs, Object sl_sugbuf, int sl_sugloaded, int sl_has_map, Object sl_map_hash, Object sl_map_array, Object sl_sounddone) {
		setSl_next(sl_next);
		setSl_name(sl_name);
		setSl_fname(sl_fname);
		setSl_add(sl_add);
		setSl_fbyts(sl_fbyts);
		setSl_fidxs(sl_fidxs);
		setSl_kbyts(sl_kbyts);
		setSl_kidxs(sl_kidxs);
		setSl_pbyts(sl_pbyts);
		setSl_pidxs(sl_pidxs);
		setSl_info(sl_info);
		setSl_regions(sl_regions);
		setSl_midword(sl_midword);
		setSl_wordcount(sl_wordcount);
		setSl_compmax(sl_compmax);
		setSl_compminlen(sl_compminlen);
		setSl_compsylmax(sl_compsylmax);
		setSl_compoptions(sl_compoptions);
		setSl_comppat(sl_comppat);
		setSl_compprog(sl_compprog);
		setSl_comprules(sl_comprules);
		setSl_compstartflags(sl_compstartflags);
		setSl_compallflags(sl_compallflags);
		setSl_nobreak(sl_nobreak);
		setSl_syllable(sl_syllable);
		setSl_syl_items(sl_syl_items);
		setSl_prefixcnt(sl_prefixcnt);
		setSl_prefprog(sl_prefprog);
		setSl_rep(sl_rep);
		setSl_rep_first(sl_rep_first);
		setSl_sal(sl_sal);
		setSl_sal_first(sl_sal_first);
		setSl_followup(sl_followup);
		setSl_collapse(sl_collapse);
		setSl_rem_accents(sl_rem_accents);
		setSl_sofo(sl_sofo);
		setSl_repsal(sl_repsal);
		setSl_repsal_first(sl_repsal_first);
		setSl_nosplitsugs(sl_nosplitsugs);
		setSl_nocompoundsugs(sl_nocompoundsugs);
		setSl_sugtime(sl_sugtime);
		setSl_sbyts(sl_sbyts);
		setSl_sidxs(sl_sidxs);
		setSl_sugbuf(sl_sugbuf);
		setSl_sugloaded(sl_sugloaded);
		setSl_has_map(sl_has_map);
		setSl_map_hash(sl_map_hash);
		setSl_map_array(sl_map_array);
		setSl_sounddone(sl_sounddone);
	}
	public slang_S() {
	}
	
	public slang_S spell_load_file(Object fname, Object lang, int silent) {
		/* no error if file doesn't exist */FILE fd = new FILE();
		char_u[] buf = new char_u();
		char_u p = new char_u();
		int i;
		int n;
		int len;
		char_u save_sourcing_name = sourcing_name;
		linenr_T save_sourcing_lnum = sourcing_lnum;
		slang_T lp = ((Object)0);
		int c = 0;
		int res;
		fd = ModernizedCProgram.mch_fopen((byte)fname, "r");
		if (fd == ((Object)0)) {
			if (!silent) {
				ModernizedCProgram.semsg(((byte)(e_notopen)), fname);
			}  else if (ModernizedCProgram.p_verbose > 2) {
				ModernizedCProgram.verbose_enter();
				ModernizedCProgram.smsg((byte)e_notopen, fname);
				ModernizedCProgram.verbose_leave();
			} 
			;
		} 
		if (ModernizedCProgram.p_verbose > 2) {
			ModernizedCProgram.verbose_enter();
			ModernizedCProgram.smsg(((byte)("Reading spell file \"%s\"")), fname);
			ModernizedCProgram.verbose_leave();
		} 
		slang_S slang_S = new slang_S();
		Object generatedSl_fname = lp.getSl_fname();
		if (old_lp == ((Object)0)) {
			lp = slang_S.slang_alloc(lang);
			if (lp == ((Object)0)) {
				;
			} 
			lp.setSl_fname(ModernizedCProgram.vim_strsave(/* Remember the file name, used to reload the file when it's updated. */fname));
			if (generatedSl_fname == ((Object)0)) {
				;
			} 
			lp.setSl_add(.strstr((byte)ModernizedCProgram.gettail(fname), ".add.") != ((Object)/* Check for .add.spl (_add.spl for VMS). */0));
		} else {
				lp = old_lp;
		} 
		sourcing_name = /* Set sourcing_name, so that error messages mention the file name. */fname;
		sourcing_lnum = 0/*
		     * <HEADER>: <fileID>
		     */;
		for (i = 0; i < 8; ++i) {
			buf[i] = .getc(/* <fileID> */fd);
		}
		if (.strncmp((byte)(buf), (byte)("VIMspell"), (size_t)(true)) != 0) {
			ModernizedCProgram.emsg(((byte)("E757: This does not look like a spell file")));
			;
		} 
		c = .getc(/* <versionnr> */fd);
		if (c < 50) {
			ModernizedCProgram.emsg(((byte)("E771: Old spell file, needs to be updated")));
			;
		}  else if (c > 50) {
			ModernizedCProgram.emsg(((byte)("E772: Spell file is for newer version of Vim")));
			;
		} 
		Object generatedSl_info = lp.getSl_info();
		Object generatedSl_midword = lp.getSl_midword();
		Object generatedSl_rep = lp.getSl_rep();
		Object generatedSl_rep_first = lp.getSl_rep_first();
		Object generatedSl_repsal = lp.getSl_repsal();
		Object generatedSl_repsal_first = lp.getSl_repsal_first();
		Object generatedSl_syllable = lp.getSl_syllable();
		Object generatedSl_fbyts = lp.getSl_fbyts();
		Object generatedSl_fidxs = lp.getSl_fidxs();
		res = fd.spell_read_tree(generatedSl_fbyts, generatedSl_fidxs, 0, /* <LWORDTREE> */0);
		if (res != 0) {
			;
		} 
		Object generatedSl_kbyts = lp.getSl_kbyts();
		Object generatedSl_kidxs = lp.getSl_kidxs();
		res = fd.spell_read_tree(generatedSl_kbyts, generatedSl_kidxs, 0, /* <KWORDTREE> */0);
		if (res != 0) {
			;
		} 
		Object generatedSl_pbyts = lp.getSl_pbyts();
		Object generatedSl_pidxs = lp.getSl_pidxs();
		int generatedSl_prefixcnt = lp.getSl_prefixcnt();
		res = fd.spell_read_tree(generatedSl_pbyts, generatedSl_pidxs, /* <PREFIXTREE> */1, generatedSl_prefixcnt);
		if (res != 0) {
			;
		} 
		if (old_lp == ((Object)0) && lang != ((Object)/* For a new file link it in the list of spell files. */0)) {
			lp.setSl_next(first_lang);
			first_lang = lp;
		} 
		;
		if (lp != ((Object)0) && old_lp == ((Object)0)) {
			lp.slang_free();
		} 
		lp = ((Object)0);
		sourcing_name = save_sourcing_name;
		sourcing_lnum = save_sourcing_lnum;
		return lp/*
		 * Fill in the wordcount fields for a trie.
		 * Returns the total number of words.
		 */;
	}
	public int set_sofo(Object from, Object to) {
		int i;
		garray_T gap = new garray_T();
		char_u s = new char_u();
		char_u p = new char_u();
		int c;
		int inp;
		Object generatedSl_sal = this.getSl_sal();
		Object generatedGa_data = gap.getGa_data();
		Object generatedSl_sal_first = this.getSl_sal_first();
		if (has_mbyte/* Use "sl_sal" as an array with 256 pointers to a list of wide
			 * characters.  The index is the low byte of the character.
			 * The list contains from-to pairs with a terminating NUL.
			 * sl_sal_first[] is used for latin1 "from" characters. */) {
			gap = generatedSl_sal;
			gap.ga_init2(, 1);
			if (gap.ga_grow(256) == 0) {
				return -3;
			} 
			.memset((generatedGa_data), (false), ( * 256));
			gap.setGa_len(256);
			for (; p != (byte)'\000' && s != /* First count the number of items for each list.  Temporarily use
				 * sl_sal_first[] for this. */(byte)'\000'; ) {
				c = ModernizedCProgram.mb_cptr2char_adv(p);
				s += enc_utf8 ? ModernizedCProgram.utf_ptr2len(s) : .UNRECOGNIZEDFUNCTIONNAME(s);
				if (c >= 256) {
					++generatedSl_sal_first[c & -1024];
				} 
			}
			if (p != (byte)'\000' || s != /* lengths differ */(byte)'\000') {
				return -2;
			} 
			for (i = 0; i < 256; ++/* Allocate the lists. */i) {
				if (generatedSl_sal_first[i] > 0) {
					p = ModernizedCProgram.alloc( * (generatedSl_sal_first[i] * 2 + 1));
					if (p == ((Object)0)) {
						return -3;
					} 
					((int)generatedGa_data)[i] = (int)p;
					(int)p = 0;
				} 
			}
			.memset((generatedSl_sal_first), (false), ( * /* Put the characters up to 255 in sl_sal_first[] the rest in a sl_sal
				 * list. */256));
			for (; p != (byte)'\000' && s != (byte)'\000'; ) {
				c = ModernizedCProgram.mb_cptr2char_adv(p);
				i = ModernizedCProgram.mb_cptr2char_adv(s);
				if (c >= 256) {
					inp = ((int)generatedGa_data)[c & /* Append the from-to chars at the end of the list with
							 * the low byte. */-1024];
					while (inp != 0) {
						++inp;
					}
					inp++ = /* from char */c;
					inp++ = /* to char */i;
					inp++ = /* NUL at the end */(byte)'\000';
				} else {
						generatedSl_sal_first[c] = /* mapping byte to char is done in sl_sal_first[] */i;
				} 
			}
		} else {
				if (.strlen((byte)(from)) != .strlen((byte)(/* mapping bytes to bytes is done in sl_sal_first[] */to))) {
					return -2;
				} 
				for (i = 0; to[i] != (byte)'\000'; ++i) {
					generatedSl_sal_first[from[i]] = to[i];
				}
				generatedSl_sal.setGa_len(/* indicates we have soundfolding */1);
		} 
		return 0/*
		 * Fill the first-index table for "lp".
		 */;
	}
	public void set_sal_first() {
		salfirst_T sfirst = new salfirst_T();
		int i;
		salitem_T smp = new salitem_T();
		int c;
		Object generatedSl_sal = this.getSl_sal();
		garray_T gap = generatedSl_sal;
		Object generatedSl_sal_first = this.getSl_sal_first();
		sfirst = generatedSl_sal_first;
		for (i = 0; i < 256; ++i) {
			sfirst[i] = -1;
		}
		Object generatedGa_data = gap.getGa_data();
		smp = (salitem_T)generatedGa_data;
		int generatedGa_len = gap.getGa_len();
		for (i = 0; i < generatedGa_len; ++i) {
			if (has_mbyte/* Use the lowest byte of the first character.  For latin1 it's
				     * the character, for other encodings it should differ for most
				     * characters. */) {
				c = smp[i].getSm_lead_w() & -1024;
			} else {
					c = smp[i].getSm_lead();
			} 
			if (sfirst[c] == -1) {
				sfirst[c] = i;
				if (has_mbyte) {
					int n;
					while (i + 1 < generatedGa_len && (smp[i + 1].getSm_lead_w() & -1024) == c) {
						++/* Skip over entry with same index byte. */i;
					}
					for (n = 1; i + n < generatedGa_len; ++n) {
						if ((smp[i + n].getSm_lead_w() & -1024) == c) {
							salitem_T tsal = new salitem_T();
							++/* Move entry with same index byte after the entries
										 * we already found. */i;
							--n;
							tsal = smp[i + n];
							.memmove((byte)(smp + i + 1), (byte)(smp + i), (size_t)( * n));
							smp[i] = tsal;
						} 
					}
				} 
			} 
		}
	}
	public void set_map_str(Object map) {
		char_u p = new char_u();
		int headc = 0;
		int c;
		int i;
		if (map == (byte)'\000') {
			this.setSl_has_map(0);
			return ;
		} 
		this.setSl_has_map(1);
		Object generatedSl_map_array = this.getSl_map_array();
		for (i = 0; i < 256; ++/* Init the array and hash tables empty. */i) {
			generatedSl_map_array[i] = 0;
		}
		Object generatedSl_map_hash = this.getSl_map_hash();
		generatedSl_map_hash.hash_init();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		for (p = map; p != (byte)'\000'; ) {
			c = ModernizedCProgram.mb_cptr2char_adv(p);
			if (c == (byte)'/') {
				headc = 0;
			} else {
					if (headc == 0) {
						headc = c/* Characters above 255 don't fit in sl_map_array[], put them in
							     * the hash table.  Each entry is the char, a NUL the headchar and
							     * a NUL. */;
					} 
					if (c >= 256) {
						int cl = .mb_char2len(c);
						int headcl = .mb_char2len(headc);
						char_u b = new char_u();
						hash_T hash = new hash_T();
						hashitem_T hi = new hashitem_T();
						b = ModernizedCProgram.alloc(cl + headcl + 2);
						if (b == ((Object)0)) {
							return ;
						} 
						.mb_char2bytes(c, b);
						b[cl] = (byte)'\000';
						.mb_char2bytes(headc, b + cl + 1);
						b[cl + 1 + headcl] = (byte)'\000';
						hash = ModernizedCProgram.hash_hash(b);
						hi = hashitem_S.hash_lookup(generatedSl_map_hash, b, hash);
						if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
							ModernizedCProgram.hash_add_item(generatedSl_map_hash, hi, b, hash);
						} else {
								ModernizedCProgram.emsg(((byte)(/* This should have been checked when generating the .spl
										     * file. */"E783: duplicate char in MAP entry")));
								ModernizedCProgram.vim_free(b);
						} 
					} else {
							generatedSl_map_array[c] = headc;
					} 
			} 
		}
	}
	public int can_compound(Object word, Object flags) {
		char_u[] uflags = new char_u();
		int i;
		char_u p = new char_u();
		Object generatedSl_compprog = this.getSl_compprog();
		if (generatedSl_compprog == ((Object)0)) {
			return 0;
		} 
		if (enc_utf8) {
			p = /* Need to convert the single byte flags to utf8 characters. */uflags;
			for (i = 0; flags[i] != (byte)'\000'; ++i) {
				p += ModernizedCProgram.utf_char2bytes(flags[i], p);
			}
			p = (byte)'\000';
			p = uflags;
		} else {
				p = flags;
		} 
		if (!generatedSl_compprog.vim_regexec_prog(0, p, 0)) {
			return 0/* Count the number of syllables.  This may be slow, do it last.  If there
			     * are too many syllables AND the number of compound words is above
			     * COMPOUNDWORDMAX then compounding is not allowed. */;
		} 
		int generatedSl_compsylmax = this.getSl_compsylmax();
		int generatedSl_compmax = this.getSl_compmax();
		if (generatedSl_compsylmax < 254 && slang.count_syllables(word) > generatedSl_compsylmax) {
			return (int).strlen((byte)(flags)) < generatedSl_compmax;
		} 
		return 1/*
		 * Return TRUE if the compound flags in compflags[] match the start of any
		 * compound rule.  This is used to stop trying a compound if the flags
		 * collected so far can't possibly match any compound rule.
		 * Caller must check that slang->sl_comprules is not NULL.
		 */;
	}
	public int match_compoundrule(Object compflags) {
		char_u p = new char_u();
		int i;
		int c;
		Object generatedSl_comprules = this.getSl_comprules();
		for (p = generatedSl_comprules; p != (byte)'\000'; ++/* loop over all the COMPOUNDRULE entries */p) {
			for (i = 0; ; ++/* loop over the flags in the compound word we have made, match
				 * them against the current rule entry */i) {
				c = compflags[i];
				if (c == (byte)'\000') {
					return /* found a rule that matches for the flags we have so far */1;
				} 
				if (p == (byte)'/' || p == (byte)'\000') {
					break;
				} 
				if (p == (byte)'[') {
					int match = 0;
					++/* compare against all the flags in [] */p;
					while (p != (byte)']' && p != (byte)'\000') {
						if (p++ == c) {
							match = 1;
						} 
					}
					if (!match) {
						break;
					} 
				}  else if (p != c) {
					break;
				} 
				++p;
			}
			p = ModernizedCProgram.vim_strchr(p, /* Skip to the next "/", where the next pattern starts. */(byte)'/');
			if (p == ((Object)0)) {
				break;
			} 
		}
		return /* Checked all the rules and none of them match the flags, so there
		     * can't possibly be a compound starting with these flags. */0/*
		 * Return non-zero if the prefix indicated by "arridx" matches with the prefix
		 * ID in "flags" for the word "word".
		 * The WF_RAREPFX flag is included in the return value for a rare prefix.
		 */;
	}
	public int valid_word_prefix(int totprefcnt, int arridx, int flags, Object word, int cond_req) {
		/* only use prefixes with a condition */int prefcnt;
		int pidx;
		regprog_T rp = new regprog_T();
		int prefid;
		prefid = (int)flags >> 24;
		Object generatedSl_pidxs = this.getSl_pidxs();
		Object generatedSl_prefprog = this.getSl_prefprog();
		for (prefcnt = totprefcnt - 1; prefcnt >= 0; --prefcnt) {
			pidx = generatedSl_pidxs[arridx + prefcnt];
			if (prefid != (pidx & /* Check the prefix ID. */-1024)) {
				continue;
			} 
			if ((flags & -1024) && (pidx & (-1024 << /* Check if the prefix doesn't combine and the word already has a
				 * suffix. */24))) {
				continue;
			} 
			rp = generatedSl_prefprog[((int)pidx >> 8) & /* Check the condition, if there is one.  The condition index is
				 * stored in the two bytes above the prefix ID byte.  */-1024];
			if (rp != ((Object)0)) {
				if (!rp.vim_regexec_prog(0, word, 0)) {
					continue;
				} 
			}  else if (cond_req) {
				continue;
			} 
			return /* It's a match!  Return the WF_ flags. */pidx;
		}
		return 0/*
		 * Check if the word at "mip->mi_word" has a matching prefix.
		 * If it does, then check the following word.
		 *
		 * If "mode" is "FIND_COMPOUND" then do the same after another word, find a
		 * prefix in a compound word.
		 *
		 * For a match mip->mi_result is updated.
		 */;
	}
	/* nr of prefix IDs */
	/* idx in sl_pidxs[] */
	public slang_S slang_alloc(Object lang) {
		slang_T lp = new slang_T();
		lp = (slang_T)ModernizedCProgram.alloc_clear();
		Object generatedSl_rep = lp.getSl_rep();
		Object generatedSl_repsal = lp.getSl_repsal();
		Object generatedSl_wordcount = lp.getSl_wordcount();
		if (lp != ((Object)0)) {
			if (lang != ((Object)0)) {
				lp.setSl_name(ModernizedCProgram.vim_strsave(lang));
			} 
			generatedSl_rep.ga_init2(, 10);
			generatedSl_repsal.ga_init2(, 10);
			lp.setSl_compmax(254);
			lp.setSl_compsylmax(254);
			generatedSl_wordcount.hash_init();
		} 
		return lp/*
		 * Free the contents of an slang_T and the structure itself.
		 */;
	}
	public void slang_free() {
		Object generatedSl_name = this.getSl_name();
		ModernizedCProgram.vim_free(generatedSl_name);
		Object generatedSl_fname = this.getSl_fname();
		ModernizedCProgram.vim_free(generatedSl_fname);
		lp.slang_clear();
		ModernizedCProgram.vim_free(lp/*
		 * Clear an slang_T so that the file can be reloaded.
		 */);
	}
	public void slang_clear() {
		garray_T gap = new garray_T();
		fromto_T ftp = new fromto_T();
		salitem_T smp = new salitem_T();
		int i;
		int round;
		Object generatedSl_fbyts = this.getSl_fbyts();
		do {
			if ((generatedSl_fbyts) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_fbyts);
				(generatedSl_fbyts) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_kbyts = this.getSl_kbyts();
		do {
			if ((generatedSl_kbyts) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_kbyts);
				(generatedSl_kbyts) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_pbyts = this.getSl_pbyts();
		do {
			if ((generatedSl_pbyts) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_pbyts);
				(generatedSl_pbyts) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_fidxs = this.getSl_fidxs();
		do {
			if ((generatedSl_fidxs) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_fidxs);
				(generatedSl_fidxs) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_kidxs = this.getSl_kidxs();
		do {
			if ((generatedSl_kidxs) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_kidxs);
				(generatedSl_kidxs) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_pidxs = this.getSl_pidxs();
		do {
			if ((generatedSl_pidxs) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_pidxs);
				(generatedSl_pidxs) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_rep = this.getSl_rep();
		Object generatedSl_repsal = this.getSl_repsal();
		int generatedGa_len = gap.getGa_len();
		Object generatedGa_data = gap.getGa_data();
		Object generatedFt_from = ftp.getFt_from();
		Object generatedFt_to = ftp.getFt_to();
		for (round = 1; round <= 2; ++round) {
			gap = round == 1 ? generatedSl_rep : generatedSl_repsal;
			while (generatedGa_len > 0) {
				ftp = ((fromto_T)generatedGa_data)[--generatedGa_len];
				ModernizedCProgram.vim_free(generatedFt_from);
				ModernizedCProgram.vim_free(generatedFt_to);
			}
			gap.ga_clear();
		}
		Object generatedSl_sal = this.getSl_sal();
		gap = generatedSl_sal;
		int generatedSl_sofo = this.getSl_sofo();
		Object generatedSm_lead = smp.getSm_lead();
		Object generatedSm_to = smp.getSm_to();
		Integer generatedSm_lead_w = smp.getSm_lead_w();
		Integer generatedSm_oneof_w = smp.getSm_oneof_w();
		Integer generatedSm_to_w = smp.getSm_to_w();
		if (generatedSl_sofo) {
			if (generatedGa_data != ((Object)/* "ga_len" is set to 1 without adding an item for latin1 */0)) {
				for (i = 0; i < generatedGa_len; ++/* SOFOFROM and SOFOTO items: free lists of wide characters. */i) {
					ModernizedCProgram.vim_free(((int)generatedGa_data)[i]);
				}
			} 
		} else {
				while (generatedGa_len > /* SAL items: free salitem_T items */0) {
					smp = ((salitem_T)generatedGa_data)[--generatedGa_len];
					ModernizedCProgram.vim_free(generatedSm_lead);
					ModernizedCProgram.vim_free(generatedSm_to);
					ModernizedCProgram.vim_free(generatedSm_lead_w);
					ModernizedCProgram.vim_free(generatedSm_oneof_w);
					ModernizedCProgram.vim_free(generatedSm_to_w);
				}
		} 
		gap.ga_clear();
		int generatedSl_prefixcnt = this.getSl_prefixcnt();
		Object generatedSl_prefprog = this.getSl_prefprog();
		for (i = 0; i < generatedSl_prefixcnt; ++i) {
			generatedSl_prefprog[i].vim_regfree();
		}
		this.setSl_prefixcnt(0);
		do {
			if ((generatedSl_prefprog) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_prefprog);
				(generatedSl_prefprog) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_info = this.getSl_info();
		do {
			if ((generatedSl_info) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_info);
				(generatedSl_info) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_midword = this.getSl_midword();
		do {
			if ((generatedSl_midword) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_midword);
				(generatedSl_midword) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_compprog = this.getSl_compprog();
		generatedSl_compprog.vim_regfree();
		this.setSl_compprog(((Object)0));
		Object generatedSl_comprules = this.getSl_comprules();
		do {
			if ((generatedSl_comprules) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_comprules);
				(generatedSl_comprules) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_compstartflags = this.getSl_compstartflags();
		do {
			if ((generatedSl_compstartflags) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_compstartflags);
				(generatedSl_compstartflags) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_compallflags = this.getSl_compallflags();
		do {
			if ((generatedSl_compallflags) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_compallflags);
				(generatedSl_compallflags) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_syllable = this.getSl_syllable();
		do {
			if ((generatedSl_syllable) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_syllable);
				(generatedSl_syllable) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_syl_items = this.getSl_syl_items();
		generatedSl_syl_items.ga_clear();
		Object generatedSl_comppat = this.getSl_comppat();
		generatedSl_comppat.ga_clear_strings();
		Object generatedSl_wordcount = this.getSl_wordcount();
		generatedSl_wordcount.hash_clear_all(((size_t)((wordcount_T)0).getWc_word()));
		generatedSl_wordcount.hash_init();
		Object generatedSl_map_hash = this.getSl_map_hash();
		generatedSl_map_hash.hash_clear_all(0);
		/* Clear info from .sug file. */lp.slang_clear_sug();
		this.setSl_compmax(254);
		this.setSl_compminlen(0);
		this.setSl_compsylmax(254);
		Object generatedSl_regions = this.getSl_regions();
		generatedSl_regions[0] = (byte)'\000'/*
		 * Clear the info from the .sug file in "lp".
		 */;
	}
	public void slang_clear_sug() {
		Object generatedSl_sbyts = this.getSl_sbyts();
		do {
			if ((generatedSl_sbyts) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_sbyts);
				(generatedSl_sbyts) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_sidxs = this.getSl_sidxs();
		do {
			if ((generatedSl_sidxs) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedSl_sidxs);
				(generatedSl_sidxs) = ((Object)0);
			} 
		} while (0);
		Object generatedSl_sugbuf = this.getSl_sugbuf();
		generatedSl_sugbuf.close_spellbuf();
		this.setSl_sugbuf(((Object)0));
		this.setSl_sugloaded(0);
		this.setSl_sugtime(0/*
		 * Load one spell file and store the info into a slang_T.
		 * Invoked through do_in_runtimepath().
		 */);
	}
	public void count_common_word(Object word, int len, int count) {
		/* word length, -1 for upto NUL *//* 1 to count once, 10 to init */hash_T hash = new hash_T();
		hashitem_T hi = new hashitem_T();
		wordcount_T wc = new wordcount_T();
		char_u[] buf = new char_u();
		char_u p = new char_u();
		if (len == -1) {
			p = word;
		}  else if (len >= 254) {
			return ;
		} else {
				ModernizedCProgram.vim_strncpy(buf, word, len);
				p = buf;
		} 
		hash = ModernizedCProgram.hash_hash(p);
		Object generatedSl_wordcount = this.getSl_wordcount();
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_lookup(generatedSl_wordcount, p, hash);
		Object generatedHi_key = (hi).getHi_key();
		Object generatedWc_word = wc.getWc_word();
		Object generatedWc_count = wc.getWc_count();
		if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			wc = ModernizedCProgram.alloc( + .strlen((byte)(p)));
			if (wc == ((Object)0)) {
				return ;
			} 
			.strcpy((byte)(generatedWc_word), (byte)(p));
			wc.setWc_count(count);
			ModernizedCProgram.hash_add_item(generatedSl_wordcount, hi, generatedWc_word, hash);
		} else {
				wc = ((wordcount_T)(generatedHi_key - ((size_t)generatedWc_word)));
				if ((generatedWc_count += count) < (int)/* check for overflow */count) {
					wc.setWc_count(-1024/*
					 * Return TRUE if byte "n" appears in "str".
					 * Like strchr() but independent of locale.
					 */);
				} 
		} 
	}
	public int init_syl_tab() {
		char_u p = new char_u();
		char_u s = new char_u();
		int l;
		syl_item_T syl = new syl_item_T();
		Object generatedSl_syl_items = this.getSl_syl_items();
		generatedSl_syl_items.ga_init2(, 4);
		Object generatedSl_syllable = this.getSl_syllable();
		p = ModernizedCProgram.vim_strchr(generatedSl_syllable, (byte)'/');
		Object generatedSy_chars = syl.getSy_chars();
		while (p != ((Object)0)) {
			p++ = (byte)'\000';
			if (p == /* trailing slash */(byte)'\000') {
				break;
			} 
			s = p;
			p = ModernizedCProgram.vim_strchr(p, (byte)'/');
			if (p == ((Object)0)) {
				l = (int).strlen((byte)(s));
			} else {
					l = (int)(p - s);
			} 
			if (l >= 30) {
				return -2;
			} 
			if (generatedSl_syl_items.ga_grow(1) == 0) {
				return -3;
			} 
			syl = ((syl_item_T)generatedSl_syl_items.getGa_data()) + generatedSl_syl_items.getGa_len()++;
			ModernizedCProgram.vim_strncpy(generatedSy_chars, s, l);
			syl.setSy_len(l);
		}
		return 1/*
		 * Count the number of syllables in "word".
		 * When "word" contains spaces the syllables after the last space are counted.
		 * Returns zero if syllables are not defines.
		 */;
	}
	public int count_syllables(Object word) {
		int cnt = 0;
		int skip = 0;
		char_u p = new char_u();
		int len;
		int i;
		syl_item_T syl = new syl_item_T();
		int c;
		Object generatedSl_syllable = this.getSl_syllable();
		if (generatedSl_syllable == ((Object)0)) {
			return 0;
		} 
		Object generatedSl_syl_items = this.getSl_syl_items();
		int generatedSy_len = syl.getSy_len();
		Object generatedSy_chars = syl.getSy_chars();
		for (p = word; p != (byte)'\000'; p += len) {
			if (p == /* When running into a space reset counter. */(byte)' ') {
				len = 1;
				cnt = 0;
				continue;
			} 
			len = /* Find longest match of syllable items. */0;
			for (i = 0; i < generatedSl_syl_items.getGa_len(); ++i) {
				syl = ((syl_item_T)generatedSl_syl_items.getGa_data()) + i;
				if (generatedSy_len > len && .strncmp((byte)(p), (byte)(generatedSy_chars), (size_t)(generatedSy_len)) == 0) {
					len = generatedSy_len;
				} 
			}
			if (len != /* found a match, count syllable  */0) {
				++cnt;
				skip = 0;
			} else {
					c = .mb_ptr2char(/* No recognized syllable item, at least a syllable char then? */p);
					len = .UNRECOGNIZEDFUNCTIONNAME(p);
					if (ModernizedCProgram.vim_strchr(generatedSl_syllable, c) == ((Object)0)) {
						skip = /* No, search for next syllable */0;
					}  else if (!skip) {
						++/* Yes, count it */cnt;
						skip = /* don't count following syllable chars */1;
					} 
			} 
		}
		return cnt/*
		 * Parse 'spelllang' and set w_s->b_langp accordingly.
		 * Returns NULL if it's OK, an error message otherwise.
		 */;
	}
	public void spell_soundfold(Object inword, int folded, Object res) {
		char_u[] fword = new char_u();
		char_u word = new char_u();
		int generatedSl_sofo = this.getSl_sofo();
		if (generatedSl_sofo) {
			slang.spell_soundfold_sofo(inword, /* SOFOFROM and SOFOTO used */res);
		} else {
				if (/* SAL items used.  Requires the word to be case-folded. */folded) {
					word = inword;
				} else {
						(Object)ModernizedCProgram.spell_casefold(inword, (int).strlen((byte)(inword)), fword, 254);
						word = fword;
				} 
				if (has_mbyte) {
					slang.spell_soundfold_wsal(word, res);
				} else {
						slang.spell_soundfold_sal(word, res/*
						 * Perform sound folding of "inword" into "res" according to SOFOFROM and
						 * SOFOTO lines.
						 */);
				} 
		} 
	}
	public void spell_soundfold_sofo(Object inword, Object res) {
		char_u s = new char_u();
		int ri = 0;
		int c;
		Object generatedSl_sal_first = this.getSl_sal_first();
		Object generatedSl_sal = this.getSl_sal();
		if (has_mbyte) {
			int prevc = 0;
			int ip;
			for (s = inword; s != /* The sl_sal_first[] table contains the translation for chars up to
				 * 255, sl_sal the rest. */(byte)'\000'; ) {
				c = ModernizedCProgram.mb_cptr2char_adv(s);
				if (enc_utf8 ? ModernizedCProgram.utf_class(c) == 0 : ((c) == (byte)' ' || (c) == (byte)'\t')) {
					c = (byte)' ';
				}  else if (c < 256) {
					c = generatedSl_sal_first[c];
				} else {
						ip = ((int)generatedSl_sal.getGa_data())[c & -1024];
						if (ip == ((Object)/* empty list, can't match */0)) {
							c = (byte)'\000';
						} else {
								for (; ; ) {
									if (ip == /* not found */0) {
										c = (byte)'\000';
										break;
									} 
									if (ip == /* match! */c) {
										c = ip[1];
										break;
									} 
									ip += 2;
								}
						} 
				} 
				if (c != (byte)'\000' && c != prevc) {
					ri += .mb_char2bytes(c, res + ri);
					if (ri + 21 > 254) {
						break;
					} 
					prevc = c;
				} 
			}
		} else {
				for (s = inword; (c = s) != (byte)'\000'; ++/* The sl_sal_first[] table contains the translation. */s) {
					if (((c) == (byte)' ' || (c) == (byte)'\t')) {
						c = (byte)' ';
					} else {
							c = generatedSl_sal_first[c];
					} 
					if (c != (byte)'\000' && (ri == 0 || res[ri - 1] != c)) {
						res[ri++] = c;
					} 
				}
		} 
		res[ri] = (byte)'\000';
	}
	public void spell_soundfold_sal(Object inword, Object res) {
		salitem_T smp = new salitem_T();
		char_u[] word = new char_u();
		char_u s = inword;
		char_u t = new char_u();
		char_u pf = new char_u();
		int i;
		int j;
		int z;
		int reslen;
		int n;
		int k = 0;
		int z0;
		int k0;
		int n0;
		int c;
		int pri;
		int p0 = -333;
		int c0;
		int generatedSl_rem_accents = this.getSl_rem_accents();
		if (generatedSl_rem_accents) {
			t = word;
			while (s != (byte)'\000') {
				if (((s) == (byte)' ' || (s) == (byte)'\t')) {
					t++ = (byte)' ';
					s = ModernizedCProgram.skipwhite(s);
				} else {
						if (ModernizedCProgram.curwin.spell_iswordp_nmw(s)) {
							t++ = s;
						} 
						++s;
				} 
			}
			t = (byte)'\000';
		} else {
				ModernizedCProgram.vim_strncpy(word, s, 254 - 1);
		} 
		Object generatedSl_sal = this.getSl_sal();
		smp = (salitem_T)generatedSl_sal.getGa_data();
		i = reslen = z = 0;
		Object generatedSl_sal_first = this.getSl_sal_first();
		int generatedSl_followup = this.getSl_followup();
		int generatedSl_collapse = this.getSl_collapse();
		while ((c = word[i]) != (byte)'\000') {
			n = generatedSl_sal_first[/* Start with the first rule that has the character in the word. */c];
			z0 = 0;
			if (n >= 0) {
				for (; (s = smp[n].getSm_lead())[0] == c; ++/* check all rules for the same letter */n) {
					k = smp[n].getSm_leadlen();
					if (k > 1) {
						if (word[i + 1] != s[1]) {
							continue;
						} 
						if (k > 2) {
							for (j = 2; j < k; ++j) {
								if (word[i + j] != s[j]) {
									break;
								} 
							}
							if (j < k) {
								continue;
							} 
						} 
					} 
					if ((pf = smp[n].getSm_oneof()) != ((Object)0)) {
						while (pf != (byte)'\000' && pf != word[i + /* Check for match with one of the chars in "sm_oneof". */k]) {
							++pf;
						}
						if (pf == (byte)'\000') {
							continue;
						} 
						++k;
					} 
					s = smp[n].getSm_rules();
					pri = /* default priority */5;
					p0 = s;
					k0 = k;
					while (s == (byte)'-' && k > 1) {
						k--;
						s++;
					}
					if (s == (byte)'<') {
						s++;
					} 
					if (((int)(s) - (byte)'0' < 10)) {
						pri = s - /* determine priority */(byte)'0';
						s++;
					} 
					if (s == (byte)'^' && (s + 1) == (byte)'^') {
						s++;
					} 
					if (s == (byte)'\000' || (s == (byte)'^' && (i == 0 || !(word[i - 1] == (byte)' ' || ModernizedCProgram.curwin.spell_iswordp(word + i - 1))) && ((s + 1) != (byte)'$' || (!ModernizedCProgram.curwin.spell_iswordp(word + i + k0)))) || (s == (byte)'$' && i > 0 && ModernizedCProgram.curwin.spell_iswordp(word + i - 1) && (!ModernizedCProgram.curwin.spell_iswordp(word + i + k0)))) {
						c0 = word[i + k - /* search for followup rules, if:    *//* followup and k > 1  and  NO '-' in searchstring */1];
						n0 = generatedSl_sal_first[c0];
						if (generatedSl_followup && k > 1 && n0 >= 0 && p0 != (byte)'-' && word[i + k] != (byte)'\000') {
							for (; (s = smp[n0].getSm_lead())[0] == c0; ++/* test follow-up rule for "word[i + k]" */n0) {
								k0 = smp[n0].getSm_leadlen();
								if (k0 > 1) {
									if (word[i + k] != s[1]) {
										continue;
									} 
									if (k0 > 2) {
										pf = word + i + k + 1;
										for (j = 2; j < k0; ++j) {
											if (pf++ != s[j]) {
												break;
											} 
										}
										if (j < k0) {
											continue;
										} 
									} 
								} 
								k0 += k - 1;
								if ((pf = smp[n0].getSm_oneof()) != ((Object)0)) {
									while (pf != (byte)'\000' && pf != word[i + /* Check for match with one of the chars in
													 * "sm_oneof". */k0]) {
										++pf;
									}
									if (pf == (byte)'\000') {
										continue;
									} 
									++k0;
								} 
								p0 = 5;
								s = smp[n0].getSm_rules();
								while (s == (byte)'-') {
									/* "k0" gets NOT reduced because
													 * "if (k0 == k)" */s++;
								}
								if (s == (byte)'<') {
									s++;
								} 
								if (((int)(s) - (byte)'0' < 10)) {
									p0 = s - (byte)'0';
									s++;
								} 
								if (s == (byte)'\000' || (s == /* *s == '^' cuts */(byte)'$' && !ModernizedCProgram.curwin.spell_iswordp(word + i + k0))) {
									if (k0 == k/* this is just a piece of the string */) {
										continue;
									} 
									if (p0 < pri/* priority too low */) {
										continue;
									} 
									break;
								} 
							}
							if (p0 >= pri && smp[n0].getSm_lead()[0] == c0) {
								continue;
							} 
						} 
						s = smp[n].getSm_to();
						if (s == ((Object)0)) {
							s = (char_u)"";
						} 
						pf = smp[n].getSm_rules();
						p0 = (ModernizedCProgram.vim_strchr(pf, (byte)'<') != ((Object)0)) ? 1 : 0;
						if (p0 == 1 && z == 0) {
							if (reslen > 0 && s != (byte)'\000' && (res[reslen - 1] == /* rule with '<' is used */c || res[reslen - 1] == s)) {
								reslen--;
							} 
							z0 = 1;
							z = 1;
							k0 = 0;
							while (s != (byte)'\000' && word[i + k0] != (byte)'\000') {
								word[i + k0] = s;
								k0++;
								s++;
							}
							if (k > k0) {
								.memmove((byte)((word + i + k0)), (byte)((word + i + k)), (size_t)(.strlen((byte)(word + i + k)) + 1));
							} 
							c = word[/* new "actual letter" */i];
						} else {
								i += k - /* no '<' rule used */1;
								z = 0;
								while (s != (byte)'\000' && s[1] != (byte)'\000' && reslen < 254) {
									if (reslen == 0 || res[reslen - 1] != s) {
										res[reslen++] = s;
									} 
									s++;
								}
								c = /* new "actual letter" */s;
								if (.strstr((byte)pf, "^^") != ((Object)0)) {
									if (c != (byte)'\000') {
										res[reslen++] = c;
									} 
									.memmove((byte)((word)), (byte)((word + i + 1)), (size_t)(.strlen((byte)(word + i + 1)) + 1));
									i = 0;
									z0 = 1;
								} 
						} 
						break;
					} 
				}
			}  else if (((c) == (byte)' ' || (c) == (byte)'\t')) {
				c = (byte)' ';
				k = 1;
			} 
			if (z0 == 0) {
				if (k && !p0 && reslen < 254 && c != (byte)'\000' && (!generatedSl_collapse || reslen == 0 || res[reslen - 1] != c)) {
					res[reslen++] = /* condense only double letters */c;
				} 
				i++;
				z = 0;
				k = 0;
			} 
		}
		res[reslen] = (byte)'\000'/*
		 * Turn "inword" into its sound-a-like equivalent in "res[MAXWLEN]".
		 * Multi-byte version of spell_soundfold().
		 */;
	}
	public void spell_soundfold_wsal(Object inword, Object res) {
		Object generatedSl_sal = this.getSl_sal();
		salitem_T smp = (salitem_T)generatedSl_sal.getGa_data();
		int[] word = new int[254];
		int[] wres = new int[254];
		int l;
		char_u s = new char_u();
		int ws;
		char_u t = new char_u();
		int pf;
		int i;
		int j;
		int z;
		int reslen;
		int n;
		int k = 0;
		int z0;
		int k0;
		int n0;
		int c;
		int pri;
		int p0 = -333;
		int c0;
		int did_white = 0;
		int wordlen;
		/*
		     * Convert the multi-byte string to a wide-character string.
		     * Remove accents, if wanted.  We actually remove all non-word characters.
		     * But keep white space.
		     */
		wordlen = 0;
		int generatedSl_rem_accents = this.getSl_rem_accents();
		for (s = inword; s != (byte)'\000'; ) {
			t = s;
			c = ModernizedCProgram.mb_cptr2char_adv(s);
			if (generatedSl_rem_accents) {
				if (enc_utf8 ? ModernizedCProgram.utf_class(c) == 0 : ((c) == (byte)' ' || (c) == (byte)'\t')) {
					if (did_white) {
						continue;
					} 
					c = (byte)' ';
					did_white = 1;
				} else {
						did_white = 0;
						if (!ModernizedCProgram.curwin.spell_iswordp_nmw(t)) {
							continue;
						} 
				} 
			} 
			word[wordlen++] = c;
		}
		word[wordlen] = (byte)'\000'/*
		     * This algorithm comes from Aspell phonet.cpp.
		     * Converted from C++ to C.  Added support for multi-byte chars.
		     * Changed to keep spaces.
		     */;
		i = reslen = z = 0;
		Object generatedSl_sal_first = this.getSl_sal_first();
		int generatedSl_followup = this.getSl_followup();
		int generatedSl_collapse = this.getSl_collapse();
		while ((c = word[i]) != (byte)'\000') {
			n = generatedSl_sal_first[c & /* Start with the first rule that has the character in the word. */-1024];
			z0 = 0;
			if (n >= 0/* Check all rules for the same index byte.
				     * If c is 0x300 need extra check for the end of the array, as
				     * (c & 0xff) is NUL. */) {
				for (; ((ws = smp[n].getSm_lead_w())[0] & -1024) == (c & -1024) && ws[0] != (byte)'\000'; ++n) {
					if (c != ws[/* Quickly skip entries that don't match the word.  Most
							 * entries are less then three chars, optimize for that. */0]) {
						continue;
					} 
					k = smp[n].getSm_leadlen();
					if (k > 1) {
						if (word[i + 1] != ws[1]) {
							continue;
						} 
						if (k > 2) {
							for (j = 2; j < k; ++j) {
								if (word[i + j] != ws[j]) {
									break;
								} 
							}
							if (j < k) {
								continue;
							} 
						} 
					} 
					if ((pf = smp[n].getSm_oneof_w()) != ((Object)0)) {
						while (pf != (byte)'\000' && pf != word[i + /* Check for match with one of the chars in "sm_oneof". */k]) {
							++pf;
						}
						if (pf == (byte)'\000') {
							continue;
						} 
						++k;
					} 
					s = smp[n].getSm_rules();
					pri = /* default priority */5;
					p0 = s;
					k0 = k;
					while (s == (byte)'-' && k > 1) {
						k--;
						s++;
					}
					if (s == (byte)'<') {
						s++;
					} 
					if (((int)(s) - (byte)'0' < 10)) {
						pri = s - /* determine priority */(byte)'0';
						s++;
					} 
					if (s == (byte)'^' && (s + 1) == (byte)'^') {
						s++;
					} 
					if (s == (byte)'\000' || (s == (byte)'^' && (i == 0 || !(word[i - 1] == (byte)' ' || ModernizedCProgram.curwin.spell_iswordp_w(word + i - 1))) && ((s + 1) != (byte)'$' || (!ModernizedCProgram.curwin.spell_iswordp_w(word + i + k0)))) || (s == (byte)'$' && i > 0 && ModernizedCProgram.curwin.spell_iswordp_w(word + i - 1) && (!ModernizedCProgram.curwin.spell_iswordp_w(word + i + k0)))) {
						c0 = word[i + k - /* search for followup rules, if:    *//* followup and k > 1  and  NO '-' in searchstring */1];
						n0 = generatedSl_sal_first[c0 & -1024];
						if (generatedSl_followup && k > 1 && n0 >= 0 && p0 != (byte)'-' && word[i + k] != (byte)'\000') {
							for (; ((ws = smp[n0].getSm_lead_w())[0] & /* Test follow-up rule for "word[i + k]"; loop over
										 * all entries with the same index byte. */-1024) == (c0 & -1024); ++n0) {
								if (c0 != ws[/* Quickly skip entries that don't match the word.
											     */0]) {
									continue;
								} 
								k0 = smp[n0].getSm_leadlen();
								if (k0 > 1) {
									if (word[i + k] != ws[1]) {
										continue;
									} 
									if (k0 > 2) {
										pf = word + i + k + 1;
										for (j = 2; j < k0; ++j) {
											if (pf++ != ws[j]) {
												break;
											} 
										}
										if (j < k0) {
											continue;
										} 
									} 
								} 
								k0 += k - 1;
								if ((pf = smp[n0].getSm_oneof_w()) != ((Object)0)) {
									while (pf != (byte)'\000' && pf != word[i + /* Check for match with one of the chars in
													 * "sm_oneof". */k0]) {
										++pf;
									}
									if (pf == (byte)'\000') {
										continue;
									} 
									++k0;
								} 
								p0 = 5;
								s = smp[n0].getSm_rules();
								while (s == (byte)'-') {
									/* "k0" gets NOT reduced because
													 * "if (k0 == k)" */s++;
								}
								if (s == (byte)'<') {
									s++;
								} 
								if (((int)(s) - (byte)'0' < 10)) {
									p0 = s - (byte)'0';
									s++;
								} 
								if (s == (byte)'\000' || (s == /* *s == '^' cuts */(byte)'$' && !ModernizedCProgram.curwin.spell_iswordp_w(word + i + k0))) {
									if (k0 == k/* this is just a piece of the string */) {
										continue;
									} 
									if (p0 < pri/* priority too low */) {
										continue;
									} 
									break;
								} 
							}
							if (p0 >= pri && (smp[n0].getSm_lead_w()[0] & -1024) == (c0 & -1024)) {
								continue;
							} 
						} 
						ws = smp[n].getSm_to_w();
						s = smp[n].getSm_rules();
						p0 = (ModernizedCProgram.vim_strchr(s, (byte)'<') != ((Object)0)) ? 1 : 0;
						if (p0 == 1 && z == 0) {
							if (reslen > 0 && ws != ((Object)0) && ws != /* rule with '<' is used */(byte)'\000' && (wres[reslen - 1] == c || wres[reslen - 1] == ws)) {
								reslen--;
							} 
							z0 = 1;
							z = 1;
							k0 = 0;
							if (ws != ((Object)0)) {
								while (ws != (byte)'\000' && word[i + k0] != (byte)'\000') {
									word[i + k0] = ws;
									k0++;
									ws++;
								}
							} 
							if (k > k0) {
								.memmove((byte)(word + i + k0), (byte)(word + i + k), (size_t)( * (wordlen - (i + k) + 1)));
							} 
							c = word[/* new "actual letter" */i];
						} else {
								i += k - /* no '<' rule used */1;
								z = 0;
								if (ws != ((Object)0)) {
									while (ws != (byte)'\000' && ws[1] != (byte)'\000' && reslen < 254) {
										if (reslen == 0 || wres[reslen - 1] != ws) {
											wres[reslen++] = ws;
										} 
										ws++;
									}
								} 
								if (ws == ((Object)/* new "actual letter" */0)) {
									c = (byte)'\000';
								} else {
										c = ws;
								} 
								if (.strstr((byte)s, "^^") != ((Object)0)) {
									if (c != (byte)'\000') {
										wres[reslen++] = c;
									} 
									.memmove((byte)(word), (byte)(word + i + 1), (size_t)( * (wordlen - (i + 1) + 1)));
									i = 0;
									z0 = 1;
								} 
						} 
						break;
					} 
				}
			}  else if (((c) == (byte)' ' || (c) == (byte)'\t')) {
				c = (byte)' ';
				k = 1;
			} 
			if (z0 == 0) {
				if (k && !p0 && reslen < 254 && c != (byte)'\000' && (!generatedSl_collapse || reslen == 0 || wres[reslen - 1] != c)) {
					wres[reslen++] = /* condense only double letters */c;
				} 
				i++;
				z = 0;
				k = 0;
			} 
		}
		l = /* Convert wide characters in "wres" to a multi-byte string in "res". */0;
		for (n = 0; n < reslen; ++n) {
			l += .mb_char2bytes(wres[n], res + l);
			if (l + 21 > 254) {
				break;
			} 
		}
		res[l] = (byte)'\000'/*
		 * ":spellinfo"
		 */;
	}
	/*
	 * Dump one word: apply case modifications and append a line to the buffer.
	 * When "lnum" is zero add insert mode completion.
	 */
	public void dump_word(Object word, Object pat, int dir, int dumpflags, int wordflags, Object lnum) {
		int keepcap = 0;
		char_u p = new char_u();
		char_u tw = new char_u();
		char_u[] cword = new char_u();
		char_u[] badword = new char_u();
		int i;
		int flags = wordflags;
		if (dumpflags & 8) {
			flags |=  -1024;
		} 
		if (dumpflags & 16) {
			flags |=  -1024;
		} 
		if ((dumpflags & 1) == 0 && (flags & (-1024 | -1024 | -1024 | -1024)) != 0) {
			ModernizedCProgram.make_case_word(word, cword, /* Need to fix case according to "flags". */flags);
			p = cword;
		} else {
				p = word;
				if ((dumpflags & 1) && ((ModernizedCProgram.captype(word, ((Object)0)) & -1024) == 0 || (flags & -1024) != 0)) {
					keepcap = 1;
				} 
		} 
		tw = p;
		Object generatedSl_wordcount = this.getSl_wordcount();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		if (pat == ((Object)0)) {
			if ((flags & (-1024 | -1024 | -1024)) || /* Add flags and regions after a slash. */keepcap) {
				.strcpy((byte)(badword), (byte)(p));
				.strcat((byte)(badword), (byte)("/"));
				if (keepcap) {
					.strcat((byte)(badword), (byte)("="));
				} 
				if (flags & -1024) {
					.strcat((byte)(badword), (byte)("!"));
				}  else if (flags & -1024) {
					.strcat((byte)(badword), (byte)("?"));
				} 
				if (flags & -1024) {
					for (i = 0; i < 7; ++i) {
						if (flags & (-1024 << i)) {
							.sprintf((byte)badword + .strlen((byte)(badword)), "%d", i + 1);
						} 
					}
				} 
				p = badword;
			} 
			if (dumpflags & 2) {
				hashitem_T hi = new hashitem_T();
				hi = hashitem_S.hash_find(generatedSl_wordcount, /* Include the word count for ":spelldump!". */tw);
				if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
					ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%s\t%d", tw, ((wordcount_T)(generatedHi_key - ((size_t)((wordcount_T)0).getWc_word()))).getWc_count());
					p = ModernizedCProgram.IObuff;
				} 
			} 
			ModernizedCProgram.ml_append(lnum, p, (colnr_T)0, 0);
		}  else if (((dumpflags & 4) ? ModernizedCProgram.mb_strnicmp((char_u)(p), (char_u)(pat), (int)(.strlen((byte)(pat)))) == 0 : .strncmp((byte)(p), (byte)(pat), (size_t)(.strlen((byte)(pat)))) == 0) && ModernizedCProgram.ins_compl_add_infercase(p, (int).strlen((byte)(p)), ModernizedCProgram.p_ic, ((Object)0), dir, 0) == 1) {
			dir = /* if dir was BACKWARD then honor it just once */1/*
			 * For ":spelldump": Find matching prefixes for "word".  Prepend each to
			 * "word" and append a line to the buffer.
			 * When "lnum" is zero add insert mode completion.
			 * Return the updated line number.
			 */;
		} 
	}
	public Object dump_prefixes(Object word, Object pat, Integer dir, int dumpflags, int flags, Object startlnum) {
		idx_T[] arridx = new idx_T();
		int[] curi = new int[254];
		char_u[] prefix = new char_u();
		char_u[] word_up = new char_u();
		int has_word_up = 0;
		int c;
		char_u byts = new char_u();
		idx_T idxs = new idx_T();
		linenr_T lnum = startlnum;
		int depth;
		int n;
		int len;
		int i;
		c = (has_mbyte ? .mb_ptr2char(word) : (int)(/* If the word starts with a lower-case letter make the word with an
		     * upper-case letter in word_up[]. */word));
		Object generatedSt_upper = spelltab.getSt_upper();
		if ((enc_utf8 && (c) >= 128 ? ModernizedCProgram.utf_toupper(c) : (c) < 256 ? (int)generatedSt_upper[c] : (c)) != c) {
			ModernizedCProgram.onecap_copy(word, word_up, 1);
			has_word_up = 1;
		} 
		Object generatedSl_pbyts = this.getSl_pbyts();
		byts = generatedSl_pbyts;
		Object generatedSl_pidxs = this.getSl_pidxs();
		idxs = generatedSl_pidxs;
		if (byts != ((Object)/* array not is empty */0/*
			 * Loop over all prefixes, building them byte-by-byte in prefix[].
			 * When at the end of a prefix check that it supports "flags".
			 */)) {
			depth = 0;
			arridx[0] = 0;
			curi[0] = 1;
			while (depth >= 0 && !got_int) {
				n = arridx[depth];
				len = byts[n];
				if (curi[depth] > len) {
					--/* Done all bytes at this node, go up one level. */depth;
					ModernizedCProgram.line_breakcheck();
				} else {
						n += curi[/* Do one more byte at this node. */depth];
						++curi[depth];
						c = byts[n];
						if (c == 0) {
							for (i = 1; i < len; ++/* End of prefix, find out how many IDs there are. */i) {
								if (byts[n + i] != 0) {
									break;
								} 
							}
							curi[depth] += i - 1;
							c = slang.valid_word_prefix(i, n, flags, word, 0);
							if (c != 0) {
								ModernizedCProgram.vim_strncpy(prefix + depth, word, 254 - depth - 1);
								slang.dump_word(prefix, pat, dir, dumpflags, (c & (-1024 << 24)) ? (flags | -1024) : flags, lnum);
								if (lnum != 0) {
									++lnum;
								} 
							} 
							if (/* Check for prefix that matches the word when the
									     * first letter is upper-case, but only if the prefix has
									     * a condition. */has_word_up) {
								c = slang.valid_word_prefix(i, n, flags, word_up, 1);
								if (c != 0) {
									ModernizedCProgram.vim_strncpy(prefix + depth, word_up, 254 - depth - 1);
									slang.dump_word(prefix, pat, dir, dumpflags, (c & (-1024 << 24)) ? (flags | -1024) : flags, lnum);
									if (lnum != 0) {
										++lnum;
									} 
								} 
							} 
						} else {
								prefix[depth++] = /* Normal char, go one level deeper. */c;
								arridx[depth] = idxs[n];
								curi[depth] = 1;
						} 
				} 
			}
		} 
		return lnum/*
		 * Move "p" to the end of word "start".
		 * Uses the spell-checking word characters.
		 */;
	}
	/*
	 * Main spell-checking function.
	 * "ptr" points to a character that could be the start of a word.
	 * "*attrp" is set to the highlight index for a badly spelled word.  For a
	 * non-word or when it's OK it remains unchanged.
	 * This must only be called when 'spelllang' is not empty.
	 *
	 * "capcol" is used to check for a Capitalised word after the end of a
	 * sentence.  If it's zero then perform the check.  Return the column where to
	 * check next, or -1 when no sentence end was found.  If it's NULL then don't
	 * worry.
	 *
	 * Returns the length of the word in bytes, also when it's OK, so that the
	 * caller can skip over the word.
	 */
	/* case-folded word */
	public int score_wordcount_adj(int score, Object word, int split) {
		// word was split, less bonushashitem_T hi = new hashitem_T();
		wordcount_T wc = new wordcount_T();
		int bonus;
		int newscore;
		Object generatedSl_wordcount = this.getSl_wordcount();
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_find(generatedSl_wordcount, word);
		Object generatedHi_key = (hi).getHi_key();
		Object generatedWc_count = wc.getWc_count();
		if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			wc = ((wordcount_T)(generatedHi_key - ((size_t)((wordcount_T)0).getWc_word())));
			if (generatedWc_count < 10) {
				bonus = 30;
			}  else if (generatedWc_count < 100) {
				bonus = 40;
			} else {
					bonus = 50;
			} 
			if (split) {
				newscore = score - bonus / 2;
			} else {
					newscore = score - bonus;
			} 
			if (newscore < 0) {
				return 0;
			} 
			return newscore;
		} 
		return score/*
		 * Like captype() but for a KEEPCAP word add ONECAP if the word starts with a
		 * capital.  So that make_case_word() can turn WOrd into Word.
		 * Add ALLCAP for "WOrD".
		 */;
	}
	public void find_keepcap_word(Object fword, Object kword) {
		// "fword" in upper-casechar_u[] uword = new char_u();
		int depth;
		idx_T tryidx = new idx_T();
		// The following arrays are used at each depth in the tree.idx_T[] arridx = new idx_T();
		int[] round = new int[254];
		int[] fwordidx = new int[254];
		int[] uwordidx = new int[254];
		int[] kwordlen = new int[254];
		int flen;
		int ulen;
		int l;
		int len;
		int c;
		idx_T lo = new idx_T();
		idx_T hi = new idx_T();
		idx_T m = new idx_T();
		char_u p = new char_u();
		Object generatedSl_kbyts = this.getSl_kbyts();
		// array with bytes of the wordschar_u byts = generatedSl_kbyts;
		Object generatedSl_kidxs = this.getSl_kidxs();
		// array with indexesidx_T idxs = generatedSl_kidxs;
		if (byts == ((Object)0)) {
			kword = (byte)'\000';
			return ;
		} 
		// Make an all-cap version of "fword".// Make an all-cap version of "fword".ModernizedCProgram.allcap_copy(fword, uword)// Each character needs to be tried both case-folded and upper-case.;// Each character needs to be tried both case-folded and upper-case.
		// All this gets very complicated if we keep in mind that changing case// may change the byte length of a multi-byte character...// All this gets very complicated if we keep in mind that changing case// may change the byte length of a multi-byte character...depth = 0;
		arridx[0] = 0;
		round[0] = 0;
		fwordidx[0] = 0;
		uwordidx[0] = 0;
		kwordlen[0] = 0;
		while (depth >= 0) {
			if (fword[fwordidx[depth]] == (byte)'\000') {
				if (byts[arridx[depth] + 1] == 0) {
					kword[kwordlen[depth]] = (byte)'\000';
					return ;
				} 
				--depth;
			}  else if (++round[depth] > 2) {
				--depth;
			} else {
					if (has_mbyte) {
						flen = (enc_utf8 ? ModernizedCProgram.utf_ptr2len(fword + fwordidx[depth]) : .UNRECOGNIZEDFUNCTIONNAME(fword + fwordidx[depth]));
						ulen = (enc_utf8 ? ModernizedCProgram.utf_ptr2len(uword + uwordidx[depth]) : .UNRECOGNIZEDFUNCTIONNAME(uword + uwordidx[depth]));
					} else {
							ulen = flen = 1;
					} 
					if (round[depth] == 1) {
						p = fword + fwordidx[depth];
						l = flen;
					} else {
							p = uword + uwordidx[depth];
							l = ulen;
					} 
					for (tryidx = arridx[depth]; l > 0; --l) {
						len = byts[tryidx++];
						c = p++;
						lo = tryidx;
						hi = tryidx + len - 1;
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
						if (hi < lo || byts[lo] != c) {
							break;
						} 
						tryidx = idxs[lo];
					}
					if (l == 0) {
						if (round[depth] == 1) {
							.strncpy((byte)(kword + kwordlen[depth]), (byte)(fword + fwordidx[depth]), (size_t)(flen));
							kwordlen[depth + 1] = kwordlen[depth] + flen;
						} else {
								.strncpy((byte)(kword + kwordlen[depth]), (byte)(uword + uwordidx[depth]), (size_t)(ulen));
								kwordlen[depth + 1] = kwordlen[depth] + ulen;
						} 
						fwordidx[depth + 1] = fwordidx[depth] + flen;
						uwordidx[depth + 1] = uwordidx[depth] + ulen;
						++depth;
						arridx[depth] = tryidx;
						round[depth] = 0;
					} 
			} 
		}
		// Didn't find it: "cannot happen".// Didn't find it: "cannot happen".kword = (byte)'\000'/*
		 * Compute the sound-a-like score for suggestions in su->su_ga and add them to
		 * su->su_sga.
		 */;
	}
	/*
	 * Find word "word" in fold-case tree for "slang" and return the word number.
	 */
	public int soundfold_find(Object word) {
		idx_T arridx = 0;
		int len;
		int wlen = 0;
		int c;
		char_u ptr = word;
		char_u byts = new char_u();
		idx_T idxs = new idx_T();
		int wordnr = 0;
		Object generatedSl_sbyts = this.getSl_sbyts();
		byts = generatedSl_sbyts;
		Object generatedSl_sidxs = this.getSl_sidxs();
		idxs = generatedSl_sidxs;
		for (; ; ) {
			len = byts[arridx++];
			c = ptr[wlen];
			if (byts[arridx] == (byte)'\000') {
				if (c == (byte)'\000') {
					break;
				} 
				while (len > 0 && byts[arridx] == (byte)'\000') {
					++arridx;
					--len;
				}
				if (len == 0) {
					return -1;
				} 
				++wordnr;
			} 
			if (c == (byte)'\000') {
				return -1;
			} 
			if (c == (byte)'\011') {
				c = (byte)' ';
			} 
			while (byts[arridx] < c) {
				wordnr += idxs[idxs[arridx]];
				++arridx;
				if (--len == 0) {
					return -1;
				} 
			}
			if (byts[arridx] != c) {
				return -1;
			} 
			arridx = idxs[arridx];
			++wlen;
			if (c == (byte)' ') {
				while (ptr[wlen] == (byte)' ' || ptr[wlen] == (byte)'\011') {
					++wlen;
				}
			} 
		}
		return wordnr/*
		 * Return TRUE if "c1" and "c2" are similar characters according to the MAP
		 * lines in the .aff file.
		 */;
	}
	public int similar_chars(int c1, int c2) {
		int m1;
		int m2;
		char_u[] buf = new char_u();
		hashitem_T hi = new hashitem_T();
		Object generatedSl_map_hash = this.getSl_map_hash();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		Object generatedSl_map_array = this.getSl_map_array();
		if (c1 >= 256) {
			buf[.mb_char2bytes(c1, buf)] = 0;
			hi = hashitem_S.hash_find(generatedSl_map_hash, buf);
			if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				m1 = 0;
			} else {
					m1 = .mb_ptr2char(generatedHi_key + .strlen((byte)(generatedHi_key)) + 1);
			} 
		} else {
				m1 = generatedSl_map_array[c1];
		} 
		if (m1 == 0) {
			return 0;
		} 
		if (c2 >= 256) {
			buf[.mb_char2bytes(c2, buf)] = 0;
			hi = hashitem_S.hash_find(generatedSl_map_hash, buf);
			if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				m2 = 0;
			} else {
					m2 = .mb_ptr2char(generatedHi_key + .strlen((byte)(generatedHi_key)) + 1);
			} 
		} else {
				m2 = generatedSl_map_array[c2];
		} 
		return m1 == m2/*
		 * Add a suggestion to the list of suggestions.
		 * For a suggestion that is already in the list the lowest score is remembered.
		 */;
	}
	public int spell_edit_score(Object badword, Object goodword) {
		int cnt;
		// lengths including NULint badlen;
		int goodlen;
		int j;
		int i;
		int t;
		int bc;
		int gc;
		int pbc;
		int pgc;
		char_u p = new char_u();
		int[] wbadword = new int[254];
		int[] wgoodword = new int[254];
		if (has_mbyte) {
			for (; p != (byte)'\000'; ) {
				wbadword[badlen++] = ModernizedCProgram.mb_cptr2char_adv(p);
			}
			wbadword[badlen++] = 0;
			for (; p != (byte)'\000'; ) {
				wgoodword[goodlen++] = ModernizedCProgram.mb_cptr2char_adv(p);
			}
			wgoodword[goodlen++] = 0;
		} else {
				badlen = (int).strlen((byte)(badword)) + 1;
				goodlen = (int).strlen((byte)(goodword)) + 1;
		} 
		// Get the characters from the multi-byte strings and put them in an
		// We use "cnt" as an array: CNT(badword_idx, goodword_idx).// We use "cnt" as an array: CNT(badword_idx, goodword_idx).cnt = (int)ModernizedCProgram.alloc( * ((badlen + 1) * (goodlen + 1)));
		if (cnt == ((Object)0)) {
			return 0;
		} 
		cnt[(false) + (false) * (badlen + 1)] = 0;
		for (j = 1; j <= goodlen; ++j) {
			cnt[(false) + (j) * (badlen + 1)] = cnt[(false) + (j - 1) * (badlen + 1)] + 96;
		}
		Object generatedSt_fold = spelltab.getSt_fold();
		int generatedSl_has_map = this.getSl_has_map();
		for (i = 1; i <= badlen; ++i) {
			cnt[(i) + (false) * (badlen + 1)] = cnt[(i - 1) + (false) * (badlen + 1)] + 94;
			for (j = 1; j <= goodlen; ++j) {
				if (has_mbyte) {
					bc = wbadword[i - 1];
					gc = wgoodword[j - 1];
				} else {
						bc = badword[i - 1];
						gc = goodword[j - 1];
				} 
				if (bc == gc) {
					cnt[(i) + (j) * (badlen + 1)] = cnt[(i - 1) + (j - 1) * (badlen + 1)];
				} else {
						if ((enc_utf8 && (bc) >= 128 ? ModernizedCProgram.utf_fold(bc) : (bc) < 256 ? (int)generatedSt_fold[bc] : (bc)) == (enc_utf8 && (gc) >= 128 ? ModernizedCProgram.utf_fold(gc) : (gc) < 256 ? (int)generatedSt_fold[gc] : (gc))) {
							cnt[(i) + (j) * (badlen + 1)] = 52 + cnt[(i - 1) + (j - 1) * (badlen + 1)];
						} else {
								if (slang != ((Object)0) && generatedSl_has_map && slang.similar_chars(gc, bc)) {
									cnt[(i) + (j) * (badlen + 1)] = 33 + cnt[(i - 1) + (j - 1) * (badlen + 1)];
								} else {
										cnt[(i) + (j) * (badlen + 1)] = 93 + cnt[(i - 1) + (j - 1) * (badlen + 1)];
								} 
						} 
						if (i > 1 && j > 1) {
							if (has_mbyte) {
								pbc = wbadword[i - 2];
								pgc = wgoodword[j - 2];
							} else {
									pbc = badword[i - 2];
									pgc = goodword[j - 2];
							} 
							if (bc == pgc && pbc == gc) {
								t = 75 + cnt[(i - 2) + (j - 2) * (badlen + 1)];
								if (t < cnt[(i) + (j) * (badlen + 1)]) {
									cnt[(i) + (j) * (badlen + 1)] = t;
								} 
							} 
						} 
						t = 94 + cnt[(i - 1) + (j) * (badlen + 1)];
						if (t < cnt[(i) + (j) * (badlen + 1)]) {
							cnt[(i) + (j) * (badlen + 1)] = t;
						} 
						t = 96 + cnt[(i) + (j - 1) * (badlen + 1)];
						if (t < cnt[(i) + (j) * (badlen + 1)]) {
							cnt[(i) + (j) * (badlen + 1)] = t;
						} 
				} 
			}
		}
		i = cnt[(badlen - 1) + (goodlen - 1) * (badlen + 1)];
		ModernizedCProgram.vim_free(cnt);
		return i;
	}
	public int spell_edit_score_limit(Object badword, Object goodword, int limit) {
		// allow for over 3 * 2 editslimitscore_T[] stack = new limitscore_T();
		int stackidx;
		int bi;
		int gi;
		int bi2;
		int gi2;
		int bc;
		int gc;
		int score;
		int score_off;
		int minscore;
		int round;
		// Multi-byte characters require a bit more work, use a different function
		// to avoid testing "has_mbyte" quite often.if (has_mbyte) {
			return slang.spell_edit_score_limit_w(badword, goodword, limit);
		} 
		// increases "score" for the edit distance.  Some of the alternatives are// pushed unto a stack and tried later, some are tried right away.  At the// end of the word the score for one alternative is known.  The lowest// possible score is stored in "minscore".// increases "score" for the edit distance.  Some of the alternatives are// pushed unto a stack and tried later, some are tried right away.  At the// end of the word the score for one alternative is known.  The lowest// possible score is stored in "minscore".stackidx = 0;
		bi = 0;
		gi = 0;
		score = 0;
		minscore = limit + 1;
		Object generatedSt_fold = spelltab.getSt_fold();
		int generatedSl_has_map = this.getSl_has_map();
		// Return a very large number to avoid going below the limit when giving a// bonus.if (minscore > limit) {
			return 999999;
		} 
		return minscore/*
		 * Multi-byte version of spell_edit_score_limit().
		 * Keep it in sync with the above!
		 */;
	}
	public int spell_edit_score_limit_w(Object badword, Object goodword, int limit) {
		// allow for over 3 * 2 editslimitscore_T[] stack = new limitscore_T();
		int stackidx;
		int bi;
		int gi;
		int bi2;
		int gi2;
		int bc;
		int gc;
		int score;
		int score_off;
		int minscore;
		int round;
		char_u p = new char_u();
		int[] wbadword = new int[254];
		int[] wgoodword = new int[254];
		// Get the characters from the multi-byte strings and put them in an
		// int array for easy access.// int array for easy access.bi = 0;
		for (p = badword; p != (byte)'\000'; ) {
			wbadword[bi++] = ModernizedCProgram.mb_cptr2char_adv(p);
		}
		wbadword[bi++] = 0;
		gi = 0;
		for (p = goodword; p != (byte)'\000'; ) {
			wgoodword[gi++] = ModernizedCProgram.mb_cptr2char_adv(p);
		}
		wgoodword[gi++] = 0// The idea is to go from start to end over the words.  So long as// characters are equal just continue, this always gives the lowest score.// When there is a difference try several alternatives.  Each alternative;// The idea is to go from start to end over the words.  So long as// characters are equal just continue, this always gives the lowest score.// When there is a difference try several alternatives.  Each alternative
		// increases "score" for the edit distance.  Some of the alternatives are// pushed unto a stack and tried later, some are tried right away.  At the// end of the word the score for one alternative is known.  The lowest// possible score is stored in "minscore".// increases "score" for the edit distance.  Some of the alternatives are// pushed unto a stack and tried later, some are tried right away.  At the// end of the word the score for one alternative is known.  The lowest// possible score is stored in "minscore".stackidx = 0;
		bi = 0;
		gi = 0;
		score = 0;
		minscore = limit + 1;
		Object generatedSt_fold = spelltab.getSt_fold();
		int generatedSl_has_map = this.getSl_has_map();
		// Return a very large number to avoid going below the limit when giving a// bonus.if (minscore > limit) {
			return 999999;
		} 
		return minscore;// FEAT_SPELL
	}
	/*
	 * Return TRUE when the sequence of flags in "compflags" plus "flag" can
	 * possibly form a valid compounded word.  This also checks the COMPOUNDRULE
	 * lines if they don't contain wildcards.
	 */
	public slang_S getSl_next() {
		return sl_next;
	}
	public void setSl_next(slang_S newSl_next) {
		sl_next = newSl_next;
	}
	public Object getSl_name() {
		return sl_name;
	}
	public void setSl_name(Object newSl_name) {
		sl_name = newSl_name;
	}
	public Object getSl_fname() {
		return sl_fname;
	}
	public void setSl_fname(Object newSl_fname) {
		sl_fname = newSl_fname;
	}
	public int getSl_add() {
		return sl_add;
	}
	public void setSl_add(int newSl_add) {
		sl_add = newSl_add;
	}
	public Object getSl_fbyts() {
		return sl_fbyts;
	}
	public void setSl_fbyts(Object newSl_fbyts) {
		sl_fbyts = newSl_fbyts;
	}
	public Object getSl_fidxs() {
		return sl_fidxs;
	}
	public void setSl_fidxs(Object newSl_fidxs) {
		sl_fidxs = newSl_fidxs;
	}
	public Object getSl_kbyts() {
		return sl_kbyts;
	}
	public void setSl_kbyts(Object newSl_kbyts) {
		sl_kbyts = newSl_kbyts;
	}
	public Object getSl_kidxs() {
		return sl_kidxs;
	}
	public void setSl_kidxs(Object newSl_kidxs) {
		sl_kidxs = newSl_kidxs;
	}
	public Object getSl_pbyts() {
		return sl_pbyts;
	}
	public void setSl_pbyts(Object newSl_pbyts) {
		sl_pbyts = newSl_pbyts;
	}
	public Object getSl_pidxs() {
		return sl_pidxs;
	}
	public void setSl_pidxs(Object newSl_pidxs) {
		sl_pidxs = newSl_pidxs;
	}
	public Object getSl_info() {
		return sl_info;
	}
	public void setSl_info(Object newSl_info) {
		sl_info = newSl_info;
	}
	public Object getSl_regions() {
		return sl_regions;
	}
	public void setSl_regions(Object newSl_regions) {
		sl_regions = newSl_regions;
	}
	public Object getSl_midword() {
		return sl_midword;
	}
	public void setSl_midword(Object newSl_midword) {
		sl_midword = newSl_midword;
	}
	public Object getSl_wordcount() {
		return sl_wordcount;
	}
	public void setSl_wordcount(Object newSl_wordcount) {
		sl_wordcount = newSl_wordcount;
	}
	public int getSl_compmax() {
		return sl_compmax;
	}
	public void setSl_compmax(int newSl_compmax) {
		sl_compmax = newSl_compmax;
	}
	public int getSl_compminlen() {
		return sl_compminlen;
	}
	public void setSl_compminlen(int newSl_compminlen) {
		sl_compminlen = newSl_compminlen;
	}
	public int getSl_compsylmax() {
		return sl_compsylmax;
	}
	public void setSl_compsylmax(int newSl_compsylmax) {
		sl_compsylmax = newSl_compsylmax;
	}
	public int getSl_compoptions() {
		return sl_compoptions;
	}
	public void setSl_compoptions(int newSl_compoptions) {
		sl_compoptions = newSl_compoptions;
	}
	public Object getSl_comppat() {
		return sl_comppat;
	}
	public void setSl_comppat(Object newSl_comppat) {
		sl_comppat = newSl_comppat;
	}
	public Object getSl_compprog() {
		return sl_compprog;
	}
	public void setSl_compprog(Object newSl_compprog) {
		sl_compprog = newSl_compprog;
	}
	public Object getSl_comprules() {
		return sl_comprules;
	}
	public void setSl_comprules(Object newSl_comprules) {
		sl_comprules = newSl_comprules;
	}
	public Object getSl_compstartflags() {
		return sl_compstartflags;
	}
	public void setSl_compstartflags(Object newSl_compstartflags) {
		sl_compstartflags = newSl_compstartflags;
	}
	public Object getSl_compallflags() {
		return sl_compallflags;
	}
	public void setSl_compallflags(Object newSl_compallflags) {
		sl_compallflags = newSl_compallflags;
	}
	public Object getSl_nobreak() {
		return sl_nobreak;
	}
	public void setSl_nobreak(Object newSl_nobreak) {
		sl_nobreak = newSl_nobreak;
	}
	public Object getSl_syllable() {
		return sl_syllable;
	}
	public void setSl_syllable(Object newSl_syllable) {
		sl_syllable = newSl_syllable;
	}
	public Object getSl_syl_items() {
		return sl_syl_items;
	}
	public void setSl_syl_items(Object newSl_syl_items) {
		sl_syl_items = newSl_syl_items;
	}
	public int getSl_prefixcnt() {
		return sl_prefixcnt;
	}
	public void setSl_prefixcnt(int newSl_prefixcnt) {
		sl_prefixcnt = newSl_prefixcnt;
	}
	public Object getSl_prefprog() {
		return sl_prefprog;
	}
	public void setSl_prefprog(Object newSl_prefprog) {
		sl_prefprog = newSl_prefprog;
	}
	public Object getSl_rep() {
		return sl_rep;
	}
	public void setSl_rep(Object newSl_rep) {
		sl_rep = newSl_rep;
	}
	public Object getSl_rep_first() {
		return sl_rep_first;
	}
	public void setSl_rep_first(Object newSl_rep_first) {
		sl_rep_first = newSl_rep_first;
	}
	public Object getSl_sal() {
		return sl_sal;
	}
	public void setSl_sal(Object newSl_sal) {
		sl_sal = newSl_sal;
	}
	public Object getSl_sal_first() {
		return sl_sal_first;
	}
	public void setSl_sal_first(Object newSl_sal_first) {
		sl_sal_first = newSl_sal_first;
	}
	public int getSl_followup() {
		return sl_followup;
	}
	public void setSl_followup(int newSl_followup) {
		sl_followup = newSl_followup;
	}
	public int getSl_collapse() {
		return sl_collapse;
	}
	public void setSl_collapse(int newSl_collapse) {
		sl_collapse = newSl_collapse;
	}
	public int getSl_rem_accents() {
		return sl_rem_accents;
	}
	public void setSl_rem_accents(int newSl_rem_accents) {
		sl_rem_accents = newSl_rem_accents;
	}
	public int getSl_sofo() {
		return sl_sofo;
	}
	public void setSl_sofo(int newSl_sofo) {
		sl_sofo = newSl_sofo;
	}
	public Object getSl_repsal() {
		return sl_repsal;
	}
	public void setSl_repsal(Object newSl_repsal) {
		sl_repsal = newSl_repsal;
	}
	public Object getSl_repsal_first() {
		return sl_repsal_first;
	}
	public void setSl_repsal_first(Object newSl_repsal_first) {
		sl_repsal_first = newSl_repsal_first;
	}
	public int getSl_nosplitsugs() {
		return sl_nosplitsugs;
	}
	public void setSl_nosplitsugs(int newSl_nosplitsugs) {
		sl_nosplitsugs = newSl_nosplitsugs;
	}
	public int getSl_nocompoundsugs() {
		return sl_nocompoundsugs;
	}
	public void setSl_nocompoundsugs(int newSl_nocompoundsugs) {
		sl_nocompoundsugs = newSl_nocompoundsugs;
	}
	public Object getSl_sugtime() {
		return sl_sugtime;
	}
	public void setSl_sugtime(Object newSl_sugtime) {
		sl_sugtime = newSl_sugtime;
	}
	public Object getSl_sbyts() {
		return sl_sbyts;
	}
	public void setSl_sbyts(Object newSl_sbyts) {
		sl_sbyts = newSl_sbyts;
	}
	public Object getSl_sidxs() {
		return sl_sidxs;
	}
	public void setSl_sidxs(Object newSl_sidxs) {
		sl_sidxs = newSl_sidxs;
	}
	public Object getSl_sugbuf() {
		return sl_sugbuf;
	}
	public void setSl_sugbuf(Object newSl_sugbuf) {
		sl_sugbuf = newSl_sugbuf;
	}
	public int getSl_sugloaded() {
		return sl_sugloaded;
	}
	public void setSl_sugloaded(int newSl_sugloaded) {
		sl_sugloaded = newSl_sugloaded;
	}
	public int getSl_has_map() {
		return sl_has_map;
	}
	public void setSl_has_map(int newSl_has_map) {
		sl_has_map = newSl_has_map;
	}
	public Object getSl_map_hash() {
		return sl_map_hash;
	}
	public void setSl_map_hash(Object newSl_map_hash) {
		sl_map_hash = newSl_map_hash;
	}
	public Object getSl_map_array() {
		return sl_map_array;
	}
	public void setSl_map_array(Object newSl_map_array) {
		sl_map_array = newSl_map_array;
	}
	public Object getSl_sounddone() {
		return sl_sounddone;
	}
	public void setSl_sounddone(Object newSl_sounddone) {
		sl_sounddone = newSl_sounddone;
	}
}
