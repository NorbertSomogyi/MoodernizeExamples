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
 * spellsuggest.c: functions for spelling suggestions
 */
/*
 * Use this to adjust the score after finding suggestions, based on the
 * suggested word sounding like the bad word.  This is much faster than doing
 * it for every possible suggestion.
 * Disadvantage: When "the" is typed as "hte" it sounds quite different ("@"
 * vs "ht") and goes down in the list.
 * Used when 'spellsuggest' is set to "best".
 */
/*
 * Do the opposite: based on a maximum end score and a known sound score,
 * compute the maximum word score that can be used.
 */
// only used for su_badflags
// mix of upper and lower case: macaRONI
/*
 * Information used when looking for suggestions.
 */
public class suginfo_S {
	private growarray su_ga;
	private int su_maxcount;
	private int su_maxscore;
	private int su_sfmaxscore;
	private growarray su_sga;
	private Object su_badptr;
	private int su_badlen;
	private int su_badflags;
	private Object su_badword;
	private Object su_fbadword;
	private Object su_sal_badword;
	private hashtable_S su_banned;
	private slang_S su_sallang;
	
	public suginfo_S(growarray su_ga, int su_maxcount, int su_maxscore, int su_sfmaxscore, growarray su_sga, Object su_badptr, int su_badlen, int su_badflags, Object su_badword, Object su_fbadword, Object su_sal_badword, hashtable_S su_banned, slang_S su_sallang) {
		setSu_ga(su_ga);
		setSu_maxcount(su_maxcount);
		setSu_maxscore(su_maxscore);
		setSu_sfmaxscore(su_sfmaxscore);
		setSu_sga(su_sga);
		setSu_badptr(su_badptr);
		setSu_badlen(su_badlen);
		setSu_badflags(su_badflags);
		setSu_badword(su_badword);
		setSu_fbadword(su_fbadword);
		setSu_sal_badword(su_sal_badword);
		setSu_banned(su_banned);
		setSu_sallang(su_sallang);
	}
	public suginfo_S() {
	}
	
	// already checked that prefix is OK
	// tried split at this point
	// did a delete, "ts_delidx" has index
	// special values ts_prefixdepth
	// not using prefixes
	// walking through the prefix tree
	// highest value that's not special
	public void spell_find_suggest(Object badptr, int badlen, int maxcount, int banbadword, int need_cap, int interactive) {
		// don't include badword in suggestions// word should start with capitalhlf_T attr = .HLF_COUNT;
		char_u[] buf = new char_u();
		char_u p = new char_u();
		int do_combine = 0;
		char_u sps_copy = new char_u();
		int expr_busy = 0;
		int c;
		int i;
		langp_T lp = new langp_T();
		// Set the info in "*su".// Set the info in "*su"..memset((su), (false), ());
		growarray generatedSu_ga = this.getSu_ga();
		generatedSu_ga.ga_init2((int), 10);
		growarray generatedSu_sga = this.getSu_sga();
		generatedSu_sga.ga_init2((int), 10);
		if (badptr == (byte)'\000') {
			return ;
		} 
		hashtable_S generatedSu_banned = this.getSu_banned();
		generatedSu_banned.hash_init();
		this.setSu_badptr(badptr);
		Object generatedSu_badptr = this.getSu_badptr();
		if (badlen != 0) {
			this.setSu_badlen(badlen);
		} else {
				this.setSu_badlen(ModernizedCProgram.curwin.spell_check(generatedSu_badptr, attr, ((Object)0), 0));
		} 
		this.setSu_maxcount(maxcount);
		this.setSu_maxscore(350);
		int generatedSu_badlen = this.getSu_badlen();
		if (generatedSu_badlen >= 254) {
			this.setSu_badlen(254 - 1);
		} 
		Object generatedSu_badword = this.getSu_badword();
		ModernizedCProgram.vim_strncpy(generatedSu_badword, generatedSu_badptr, generatedSu_badlen);
		Object generatedSu_fbadword = this.getSu_fbadword();
		(Object)ModernizedCProgram.spell_casefold(generatedSu_badptr, generatedSu_badlen, generatedSu_fbadword, 254);
		// text. Currently an illegal byte causes wrong pointer computations.// text. Currently an illegal byte causes wrong pointer computations.generatedSu_fbadword[generatedSu_badlen] = (byte)'\000';
		// get caps flags for bad word// get caps flags for bad wordthis.setSu_badflags(ModernizedCProgram.badword_captype(generatedSu_badptr, generatedSu_badptr + generatedSu_badlen));
		int generatedSu_badflags = this.getSu_badflags();
		if (need_cap) {
			generatedSu_badflags |=  -1024;
		} 
		Object generatedB_s = curbuf.getB_s();
		slang_S generatedLp_sallang = lp.getLp_sallang();
		// using multiple files for one language, it's not that bad when mixing// languages (e.g., "pl,en").for (i = 0; i < generatedB_s.getB_langp().getGa_len(); ++i) {
			lp = (((langp_T)(generatedB_s.getB_langp()).getGa_data()) + (i));
			if (generatedLp_sallang != ((Object)0)) {
				this.setSu_sallang(generatedLp_sallang);
				break;
			} 
		}
		slang_S generatedSu_sallang = this.getSu_sallang();
		Object generatedSu_sal_badword = this.getSu_sal_badword();
		// Soundfold the bad word with the default sound folding, so that we don't// have to do this many times.if (generatedSu_sallang != ((Object)0)) {
			generatedSu_sallang.spell_soundfold(generatedSu_fbadword, 1, generatedSu_sal_badword);
		} 
		// word to be bad then it might need to be capitalised.  Add a suggestion// for that.// word to be bad then it might need to be capitalised.  Add a suggestion// for that.c = (has_mbyte ? .mb_ptr2char(generatedSu_badptr) : (int)(generatedSu_badptr));
		Object generatedSt_isu = spelltab.getSt_isu();
		if (!(enc_utf8 && (c) >= 128 ? ModernizedCProgram.utf_isupper(c) : (c) < 256 ? generatedSt_isu[c] : (false)) && attr == .HLF_COUNT) {
			ModernizedCProgram.make_case_word(generatedSu_badword, buf, -1024);
			ModernizedCProgram.add_suggestion(su, generatedSu_ga, buf, generatedSu_badlen, 52, 0, 1, generatedSu_sallang, 0);
		} 
		// Ban the bad word itself.  It may appear in another region.if (banbadword) {
			su.add_banned(generatedSu_badword);
		} 
		// Make a copy of 'spellsuggest', because the expression may change it.// Make a copy of 'spellsuggest', because the expression may change it.sps_copy = ModernizedCProgram.vim_strsave(p_sps);
		if (sps_copy == ((Object)0)) {
			return ;
		} 
		// Loop over the items in 'spellsuggest'.for (p = sps_copy; p != (byte)'\000'; ) {
			ModernizedCProgram.copy_option_part(p, buf, 1024, ",");
			if (.strncmp((byte)(buf), (byte)("expr:"), (size_t)(true)) == 0) {
				if (!expr_busy) {
					expr_busy = 1;
					su.spell_suggest_expr(buf + 5);
					expr_busy = 0;
				} 
			}  else if (.strncmp((byte)(buf), (byte)("file:"), (size_t)(true)) == 0) {
				su.spell_suggest_file(buf + 5);
			} else {
					su.spell_suggest_intern(interactive);
					if (ModernizedCProgram.sps_flags & 4) {
						do_combine = 1;
					} 
			} 
		}
		ModernizedCProgram.vim_free(sps_copy);
		if (do_combine) {
			su/*
			 * Find suggestions by evaluating expression "expr".
			 */.score_combine();
		} 
		// Combine the two list of suggestions.  This must be done last,
	}
	// length of bad word or 0 if unknown
	public void spell_suggest_expr(Object expr) {
		list_T list = new list_T();
		listitem_T li = new listitem_T();
		int score;
		char_u p = new char_u();
		// The work is split up in a few parts to avoid having to export
		Object generatedSu_badword = this.getSu_badword();
		listvar_S listvar_S = new listvar_S();
		// suginfo_T.// First evaluate the expression and get the resulting list.// suginfo_T.// First evaluate the expression and get the resulting list.list = listvar_S.eval_spell_expr(generatedSu_badword, expr);
		 generatedLi_tv = li.getLi_tv();
		Object generatedV_type = generatedLi_tv.getV_type();
		Object generatedVval = generatedLi_tv.getVval();
		int generatedSu_maxscore = this.getSu_maxscore();
		growarray generatedSu_ga = this.getSu_ga();
		int generatedSu_badlen = this.getSu_badlen();
		slang_S generatedSu_sallang = this.getSu_sallang();
		listitem_S generatedLi_next = li.getLi_next();
		listitem_S generatedLv_first = list.getLv_first();
		if (list != ((Object)0)) {
			for (li = generatedLv_first; li != ((Object)0); li = generatedLi_next) {
				if (generatedV_type == .VAR_LIST) {
					score = generatedVval.getV_list().get_spellword(p);
					if (score >= 0 && score <= generatedSu_maxscore) {
						ModernizedCProgram.add_suggestion(su, generatedSu_ga, p, generatedSu_badlen, score, 0, 1, generatedSu_sallang, 0);
					} 
				} 
			}
			list.list_unref();
		} 
		// Remove bogus suggestions, sort and truncate at "maxcount".// Remove bogus suggestions, sort and truncate at "maxcount".ModernizedCProgram.check_suggestions(su, generatedSu_ga);
		int generatedSu_maxcount = this.getSu_maxcount();
		(Object)generatedSu_ga.cleanup_suggestions(generatedSu_maxscore, generatedSu_maxcount);
	}
	public void spell_suggest_file(Object fname) {
		FILE fd = new FILE();
		char_u[] line = new char_u();
		char_u p = new char_u();
		int len;
		char_u[] cword = new char_u();
		// Open the file.// Open the file.fd = ModernizedCProgram.mch_fopen((byte)fname, "r");
		if (fd == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_notopen)), fname);
			return ;
		} 
		Object generatedSu_badword = this.getSu_badword();
		int generatedSu_badflags = this.getSu_badflags();
		growarray generatedSu_ga = this.getSu_ga();
		int generatedSu_badlen = this.getSu_badlen();
		slang_S generatedSu_sallang = this.getSu_sallang();
		// Read it line by line.while (!fd.vim_fgets(line, 254 * 2) && !got_int) {
			ModernizedCProgram.line_breakcheck();
			p = ModernizedCProgram.vim_strchr(line, (byte)'/');
			if (p == ((Object)0)) {
				continue;
			} 
			p++ = (byte)'\000';
			if (ModernizedCProgram.vim_stricmp((byte)(generatedSu_badword), (byte)(line)) == 0) {
				for (len = 0; p[len] >= (byte)' '; ++len) {
					;
				}
				p[len] = (byte)'\000';
				if (ModernizedCProgram.captype(p, ((Object)0)) == 0) {
					ModernizedCProgram.make_case_word(p, cword, generatedSu_badflags);
					p = cword;
				} 
				ModernizedCProgram.add_suggestion(su, generatedSu_ga, p, generatedSu_badlen, 30, 0, 1, generatedSu_sallang, 0);
			} 
		}
		.fclose(fd);
		// Remove bogus suggestions, sort and truncate at "maxcount".// Remove bogus suggestions, sort and truncate at "maxcount".ModernizedCProgram.check_suggestions(su, generatedSu_ga);
		int generatedSu_maxscore = this.getSu_maxscore();
		int generatedSu_maxcount = this.getSu_maxcount();
		(Object)generatedSu_ga.cleanup_suggestions(generatedSu_maxscore, generatedSu_maxcount);
	}
	public void spell_suggest_intern(int interactive) {
		// Load the .sug file(s) that are available and not done yet.// Load the .sug file(s) that are available and not done yet.ModernizedCProgram.suggest_load_files()// 1. Try special cases, such as repeating a word: "the the" -> "the".//;// 1. Try special cases, such as repeating a word: "the the" -> "the".//
		// Set a maximum score to limit the combination of operations that is// tried.// Set a maximum score to limit the combination of operations that is// tried.su.suggest_try_special()// 2. Try inserting/deleting/swapping/changing a letter, use REP entries;// 2. Try inserting/deleting/swapping/changing a letter, use REP entries
		//    from the .aff file and inserting a space (split the word).//    from the .aff file and inserting a space (split the word).su.suggest_try_change();
		// For the resulting top-scorers compute the sound-a-like score.if (ModernizedCProgram.sps_flags & 4) {
			su.score_comp_sal();
		} 
		growarray generatedSu_ga = this.getSu_ga();
		int generatedGa_len = generatedSu_ga.getGa_len();
		int generatedSu_maxcount = (su).getSu_maxcount();
		int generatedSu_sfmaxscore = this.getSu_sfmaxscore();
		// 3. Try finding sound-a-like words.if ((ModernizedCProgram.sps_flags & 2) == 0) {
			if (ModernizedCProgram.sps_flags & 1) {
				su.rescore_suggestions();
			} 
			ModernizedCProgram.suggest_try_soundalike_prep();
			this.setSu_maxscore(200);
			this.setSu_sfmaxscore(350 * 3);
			su.suggest_try_soundalike();
			if (generatedGa_len < (generatedSu_maxcount < 130 ? 150 : generatedSu_maxcount + 20)) {
				this.setSu_maxscore(300);
				su.suggest_try_soundalike();
				if (generatedGa_len < (generatedSu_maxcount < 130 ? 150 : generatedSu_maxcount + 20)) {
					this.setSu_maxscore(400);
					su.suggest_try_soundalike();
				} 
			} 
			this.setSu_maxscore(generatedSu_sfmaxscore);
			ModernizedCProgram.suggest_try_soundalike_finish();
		} 
		// When CTRL-C was hit while searching do show the results.  Only clear// got_int when using a command, not for spellsuggest().// When CTRL-C was hit while searching do show the results.  Only clear// got_int when using a command, not for spellsuggest().ModernizedCProgram.ui_breakcheck();
		if (interactive && got_int) {
			(Object)ModernizedCProgram.vgetc();
			got_int = 0;
		} 
		int generatedSu_maxscore = this.getSu_maxscore();
		if ((ModernizedCProgram.sps_flags & 4) == 0 && generatedGa_len != 0) {
			if (ModernizedCProgram.sps_flags & 1) {
				su.rescore_suggestions();
			} 
			ModernizedCProgram.check_suggestions(su, generatedSu_ga);
			(Object)generatedSu_ga.cleanup_suggestions(generatedSu_maxscore, generatedSu_maxcount);
		} 
	}
	public void spell_find_cleanup() {
		int i;
		growarray generatedSu_ga = this.getSu_ga();
		int generatedGa_len = generatedSu_ga.getGa_len();
		Object generatedGa_data = (generatedSu_ga).getGa_data();
		// Free the suggestions.for (i = 0; i < generatedGa_len; ++i) {
			ModernizedCProgram.vim_free((((suggest_T)generatedGa_data)[i]).getSt_word());
		}
		generatedSu_ga.ga_clear();
		for (i = 0; i < generatedGa_len; ++i) {
			ModernizedCProgram.vim_free((((suggest_T)generatedGa_data)[i]).getSt_word());
		}
		growarray generatedSu_sga = this.getSu_sga();
		generatedSu_sga.ga_clear();
		hashtable_S generatedSu_banned = this.getSu_banned();
		// Free the banned words.// Free the banned words.generatedSu_banned.hash_clear_all(0/*
		 * Try finding suggestions by recognizing specific situations.
		 */);
	}
	public void suggest_try_special() {
		char_u p = new char_u();
		size_t len = new size_t();
		int c;
		char_u[] word = new char_u();
		Object generatedSu_fbadword = this.getSu_fbadword();
		// Recognize a word that is repeated: "the the".// Recognize a word that is repeated: "the the".p = ModernizedCProgram.skiptowhite(generatedSu_fbadword);
		len = p - generatedSu_fbadword;
		p = ModernizedCProgram.skipwhite(p);
		int generatedSu_badflags = this.getSu_badflags();
		growarray generatedSu_ga = this.getSu_ga();
		int generatedSu_badlen = this.getSu_badlen();
		slang_S generatedSu_sallang = this.getSu_sallang();
		if (.strlen((byte)(p)) == len && .strncmp((byte)(generatedSu_fbadword), (byte)(p), (size_t)(len)) == 0) {
			c = generatedSu_fbadword[len];
			generatedSu_fbadword[len] = (byte)'\000';
			ModernizedCProgram.make_case_word(generatedSu_fbadword, word, generatedSu_badflags);
			generatedSu_fbadword[len] = c;
			ModernizedCProgram.add_suggestion(su, generatedSu_ga, word, generatedSu_badlen, ((3 * 65 + 0) / 4), 0, 1, generatedSu_sallang, 0/*
			 * Change the 0 to 1 to measure how much time is spent in each state.
			 * Output is dumped in "suggestprof".
			 */);
		} 
		// Include badflags: if the badword is onecap or allcap
	}
	// call before changing state
	/*
	 * Try finding suggestions by adding/removing/swapping letters.
	 */
	public void suggest_try_change() {
		// copy of the bad word, case-foldedchar_u[] fword = new char_u();
		int n;
		char_u p = new char_u();
		int lpi;
		langp_T lp = new langp_T();
		// We make a copy of the case-folded bad word, so that we can modify it
		Object generatedSu_fbadword = this.getSu_fbadword();
		// to find matches (esp. REP items).  Append some more text, changing// chars after the bad word may help.// to find matches (esp. REP items).  Append some more text, changing// chars after the bad word may help..strcpy((byte)(fword), (byte)(generatedSu_fbadword));
		n = (int).strlen((byte)(fword));
		Object generatedSu_badptr = this.getSu_badptr();
		int generatedSu_badlen = this.getSu_badlen();
		p = generatedSu_badptr + generatedSu_badlen;
		(Object)ModernizedCProgram.spell_casefold(p, (int).strlen((byte)(p)), fword + n, 254 - n);
		slang_S generatedLp_slang = lp.getLp_slang();
		Object generatedSl_fbyts = generatedLp_slang.getSl_fbyts();
		for (lpi = 0; lpi < ModernizedCProgram.curwin.getW_s().getB_langp().getGa_len(); ++lpi) {
			lp = (((langp_T)(ModernizedCProgram.curwin.getW_s().getB_langp()).getGa_data()) + (lpi));
			if (generatedSl_fbyts == ((Object)0)) {
				continue;
			} 
			ModernizedCProgram.suggest_trie_walk(su, lp, fword, 0);
		}
	}
	public void score_comp_sal() {
		langp_T lp = new langp_T();
		char_u[] badsound = new char_u();
		int i;
		suggest_T stp = new suggest_T();
		suggest_T sstp = new suggest_T();
		int score;
		int lpi;
		growarray generatedSu_sga = this.getSu_sga();
		growarray generatedSu_ga = this.getSu_ga();
		int generatedGa_len = generatedSu_ga.getGa_len();
		if (generatedSu_sga.ga_grow(generatedGa_len) == 0) {
			return ;
		} 
		slang_S generatedLp_slang = lp.getLp_slang();
		Object generatedSu_fbadword = this.getSu_fbadword();
		Object generatedGa_data = (generatedSu_ga).getGa_data();
		Object generatedSt_word = stp.getSt_word();
		int generatedSt_wordlen = stp.getSt_wordlen();
		int generatedSt_orglen = stp.getSt_orglen();
		// Use the sound-folding of the first language that supports it.for (lpi = 0; lpi < generatedGa_len; ++lpi) {
			lp = (((langp_T)(ModernizedCProgram.curwin.getW_s().getB_langp()).getGa_data()) + (lpi));
			if (generatedGa_len > 0) {
				generatedLp_slang.spell_soundfold(generatedSu_fbadword, 1, badsound);
				for (i = 0; i < generatedGa_len; ++i) {
					stp = (((suggest_T)generatedGa_data)[i]);
					score = ModernizedCProgram.stp_sal_score(stp, su, generatedLp_slang, badsound);
					if (score < 999999) {
						sstp = (((suggest_T)generatedGa_data)[generatedGa_len]);
						sstp.setSt_word(ModernizedCProgram.vim_strsave(generatedSt_word));
						if (generatedSt_word != ((Object)0)) {
							sstp.setSt_wordlen(generatedSt_wordlen);
							sstp.setSt_score(score);
							sstp.setSt_altscore(0);
							sstp.setSt_orglen(generatedSt_orglen);
							++generatedGa_len;
						} 
					} 
				}
				break;
			} 
		}
	}
	public void score_combine() {
		int i;
		int j;
		garray_T ga = new garray_T();
		garray_T gap = new garray_T();
		langp_T lp = new langp_T();
		suggest_T stp = new suggest_T();
		char_u p = new char_u();
		char_u[] badsound = new char_u();
		int round;
		int lpi;
		slang_T slang = ((Object)0);
		slang_S generatedLp_slang = lp.getLp_slang();
		Object generatedSl_sal = generatedLp_slang.getSl_sal();
		Object generatedSu_fbadword = this.getSu_fbadword();
		growarray generatedSu_ga = this.getSu_ga();
		int generatedGa_len = generatedSu_ga.getGa_len();
		Object generatedGa_data = (generatedSu_ga).getGa_data();
		int generatedSt_altscore = stp.getSt_altscore();
		int generatedSt_score = stp.getSt_score();
		// Add the alternate score to su_ga.for (lpi = 0; lpi < ModernizedCProgram.curwin.getW_s().getB_langp().getGa_len(); ++lpi) {
			lp = (((langp_T)(ModernizedCProgram.curwin.getW_s().getB_langp()).getGa_data()) + (lpi));
			if (generatedSl_sal.getGa_len() > 0) {
				slang = generatedLp_slang;
				slang.spell_soundfold(generatedSu_fbadword, 1, badsound);
				for (i = 0; i < generatedGa_len; ++i) {
					stp = (((suggest_T)generatedGa_data)[i]);
					stp.setSt_altscore(ModernizedCProgram.stp_sal_score(stp, su, slang, badsound));
					if (generatedSt_altscore == 999999) {
						stp.setSt_score((generatedSt_score * 3 + 96 * 3) / 4);
					} else {
							stp.setSt_score((generatedSt_score * 3 + generatedSt_altscore) / 4);
					} 
					stp.setSt_salscore(0);
				}
				break;
			} 
		}
		int generatedSu_maxscore = this.getSu_maxscore();
		int generatedSu_maxcount = this.getSu_maxcount();
		// Using "double" without sound folding.if (slang == ((Object)0)) {
			(Object)generatedSu_ga.cleanup_suggestions(generatedSu_maxscore, generatedSu_maxcount);
			return ;
		} 
		Object generatedSu_badword = this.getSu_badword();
		Object generatedSt_word = stp.getSt_word();
		// Add the alternate score to su_sga.for (i = 0; i < generatedGa_len; ++i) {
			stp = (((suggest_T)generatedGa_data)[i]);
			stp.setSt_altscore(slang.spell_edit_score(generatedSu_badword, generatedSt_word));
			if (generatedSt_score == 999999) {
				stp.setSt_score((96 * 3 * 7 + generatedSt_altscore) / 8);
			} else {
					stp.setSt_score((generatedSt_score * 7 + generatedSt_altscore) / 8);
			} 
			stp.setSt_salscore(1);
		}
		// Remove bad suggestions, sort the suggestions and truncate at "maxcount"// for both lists.// Remove bad suggestions, sort the suggestions and truncate at "maxcount"// for both lists.ModernizedCProgram.check_suggestions(su, generatedSu_ga);
		(Object)generatedSu_ga.cleanup_suggestions(generatedSu_maxscore, generatedSu_maxcount);
		growarray generatedSu_sga = this.getSu_sga();
		ModernizedCProgram.check_suggestions(su, generatedSu_sga);
		(Object)generatedSu_sga.cleanup_suggestions(generatedSu_maxscore, generatedSu_maxcount);
		ga.ga_init2((int), 1);
		if (ga.ga_grow(generatedGa_len + generatedGa_len) == 0) {
			return ;
		} 
		stp = (((suggest_T)generatedGa_data)[0]);
		for (i = 0; i < generatedGa_len || i < generatedGa_len; ++i) {
			for (round = 1; round <= 2; ++round) {
				gap = round == 1 ? generatedSu_ga : generatedSu_sga;
				if (i < generatedGa_len) {
					p = generatedSt_word;
					for (j = 0; j < generatedGa_len; ++j) {
						if (.strcmp((byte)(generatedSt_word), (byte)(p)) == 0) {
							break;
						} 
					}
					if (j == generatedGa_len) {
						stp[generatedGa_len++] = (((suggest_T)generatedGa_data)[i]);
					} else {
							ModernizedCProgram.vim_free(p);
					} 
				} 
			}
		}// round 1: get a suggestion from su_ga
		generatedSu_ga.ga_clear();
		generatedSu_sga.ga_clear();
		// Truncate the list to the number of suggestions that will be displayed.if (generatedGa_len > generatedSu_maxcount) {
			for (i = generatedSu_maxcount; i < generatedGa_len; ++i) {
				ModernizedCProgram.vim_free(generatedSt_word);
			}
			ga.setGa_len(generatedSu_maxcount);
		} 
		this.setSu_ga(ga/*
		 * For the goodword in "stp" compute the soundalike score compared to the
		 * badword.
		 */);
	}
	public void suggest_try_soundalike() {
		char_u[] salword = new char_u();
		langp_T lp = new langp_T();
		int lpi;
		slang_T slang = new slang_T();
		// Do this for all languages that support sound folding and for which a
		slang_S generatedLp_slang = lp.getLp_slang();
		Object generatedSl_sal = slang.getSl_sal();
		Object generatedSl_sbyts = slang.getSl_sbyts();
		Object generatedSu_fbadword = this.getSu_fbadword();
		// .sug file has been loaded.for (lpi = 0; lpi < ModernizedCProgram.curwin.getW_s().getB_langp().getGa_len(); ++lpi) {
			lp = (((langp_T)(ModernizedCProgram.curwin.getW_s().getB_langp()).getGa_data()) + (lpi));
			slang = generatedLp_slang;
			if (generatedSl_sal.getGa_len() > 0 && generatedSl_sbyts != ((Object)0)) {
				slang.spell_soundfold(generatedSu_fbadword, 1, salword);
				ModernizedCProgram.suggest_trie_walk(su, lp, salword, 1);
			} 
		}
	}
	/*
	 * Add a word to be banned.
	 */
	public void add_banned(Object word) {
		char_u s = new char_u();
		hash_T hash = new hash_T();
		hashitem_T hi = new hashitem_T();
		hash = ModernizedCProgram.hash_hash(word);
		hashtable_S generatedSu_banned = this.getSu_banned();
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_lookup(generatedSu_banned, word, hash);
		Object generatedHi_key = (hi).getHi_key();
		if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			s = ModernizedCProgram.vim_strsave(word);
			if (s != ((Object)0)) {
				ModernizedCProgram.hash_add_item(generatedSu_banned, hi, s, hash/*
				 * Recompute the score for all suggestions if sound-folding is possible.  This
				 * is slow, thus only done for the final results.
				 */);
			} 
		} 
	}
	public void rescore_suggestions() {
		int i;
		slang_S generatedSu_sallang = this.getSu_sallang();
		growarray generatedSu_ga = this.getSu_ga();
		int generatedGa_len = generatedSu_ga.getGa_len();
		Object generatedGa_data = (generatedSu_ga).getGa_data();
		if (generatedSu_sallang != ((Object)0)) {
			for (i = 0; i < generatedGa_len; ++i) {
				ModernizedCProgram.rescore_one(su, (((suggest_T)generatedGa_data)[i/*
				 * Recompute the score for one suggestion if sound-folding is possible.
				 */]));
			}
		} 
	}
	public growarray getSu_ga() {
		return su_ga;
	}
	public void setSu_ga(growarray newSu_ga) {
		su_ga = newSu_ga;
	}
	public int getSu_maxcount() {
		return su_maxcount;
	}
	public void setSu_maxcount(int newSu_maxcount) {
		su_maxcount = newSu_maxcount;
	}
	public int getSu_maxscore() {
		return su_maxscore;
	}
	public void setSu_maxscore(int newSu_maxscore) {
		su_maxscore = newSu_maxscore;
	}
	public int getSu_sfmaxscore() {
		return su_sfmaxscore;
	}
	public void setSu_sfmaxscore(int newSu_sfmaxscore) {
		su_sfmaxscore = newSu_sfmaxscore;
	}
	public growarray getSu_sga() {
		return su_sga;
	}
	public void setSu_sga(growarray newSu_sga) {
		su_sga = newSu_sga;
	}
	public Object getSu_badptr() {
		return su_badptr;
	}
	public void setSu_badptr(Object newSu_badptr) {
		su_badptr = newSu_badptr;
	}
	public int getSu_badlen() {
		return su_badlen;
	}
	public void setSu_badlen(int newSu_badlen) {
		su_badlen = newSu_badlen;
	}
	public int getSu_badflags() {
		return su_badflags;
	}
	public void setSu_badflags(int newSu_badflags) {
		su_badflags = newSu_badflags;
	}
	public Object getSu_badword() {
		return su_badword;
	}
	public void setSu_badword(Object newSu_badword) {
		su_badword = newSu_badword;
	}
	public Object getSu_fbadword() {
		return su_fbadword;
	}
	public void setSu_fbadword(Object newSu_fbadword) {
		su_fbadword = newSu_fbadword;
	}
	public Object getSu_sal_badword() {
		return su_sal_badword;
	}
	public void setSu_sal_badword(Object newSu_sal_badword) {
		su_sal_badword = newSu_sal_badword;
	}
	public hashtable_S getSu_banned() {
		return su_banned;
	}
	public void setSu_banned(hashtable_S newSu_banned) {
		su_banned = newSu_banned;
	}
	public slang_S getSu_sallang() {
		return su_sallang;
	}
	public void setSu_sallang(slang_S newSu_sallang) {
		su_sallang = newSu_sallang;
	}
}
