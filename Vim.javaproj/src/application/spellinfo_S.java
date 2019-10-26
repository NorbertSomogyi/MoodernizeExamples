package application;

/*
 * Info used while reading the spell files.
 */
public class spellinfo_S {
	private wordnode_S si_foldroot;
	private long si_foldwcount;
	private wordnode_S si_keeproot;
	private long si_keepwcount;
	private wordnode_S si_prefroot;
	private long si_sugtree;
	private sblock_S si_blocks;
	private long si_blocks_cnt;
	private int si_did_emsg;
	private long si_compress_cnt;
	private wordnode_S si_first_free;
	private long si_free_count;
	private file_buffer si_spellbuf;
	private int si_ascii;
	private int si_add;
	private int si_clear_chartab;
	private int si_region;
	private  si_conv;
	private int si_memtot;
	private int si_verbose;
	private int si_msg_count;
	private Object si_info;
	private int si_region_count;
	private Object si_region_name;
	private growarray si_rep;
	private growarray si_repsal;
	private growarray si_sal;
	private Object si_sofofr;
	private Object si_sofoto;
	private int si_nosugfile;
	private int si_nosplitsugs;
	private int si_nocompoundsugs;
	private int si_followup;
	private int si_collapse;
	private hashtable_S si_commonwords;
	private Object si_sugtime;
	private int si_rem_accents;
	private growarray si_map;
	private Object si_midword;
	private int si_compmax;
	private int si_compminlen;
	private int si_compsylmax;
	private int si_compoptions;
	private growarray si_comppat;
	private Object si_compflags;
	private Object si_nobreak;
	private Object si_syllable;
	private growarray si_prefcond;
	private int si_newprefID;
	private int si_newcompID;
	
	public spellinfo_S(wordnode_S si_foldroot, long si_foldwcount, wordnode_S si_keeproot, long si_keepwcount, wordnode_S si_prefroot, long si_sugtree, sblock_S si_blocks, long si_blocks_cnt, int si_did_emsg, long si_compress_cnt, wordnode_S si_first_free, long si_free_count, file_buffer si_spellbuf, int si_ascii, int si_add, int si_clear_chartab, int si_region,  si_conv, int si_memtot, int si_verbose, int si_msg_count, Object si_info, int si_region_count, Object si_region_name, growarray si_rep, growarray si_repsal, growarray si_sal, Object si_sofofr, Object si_sofoto, int si_nosugfile, int si_nosplitsugs, int si_nocompoundsugs, int si_followup, int si_collapse, hashtable_S si_commonwords, Object si_sugtime, int si_rem_accents, growarray si_map, Object si_midword, int si_compmax, int si_compminlen, int si_compsylmax, int si_compoptions, growarray si_comppat, Object si_compflags, Object si_nobreak, Object si_syllable, growarray si_prefcond, int si_newprefID, int si_newcompID) {
		setSi_foldroot(si_foldroot);
		setSi_foldwcount(si_foldwcount);
		setSi_keeproot(si_keeproot);
		setSi_keepwcount(si_keepwcount);
		setSi_prefroot(si_prefroot);
		setSi_sugtree(si_sugtree);
		setSi_blocks(si_blocks);
		setSi_blocks_cnt(si_blocks_cnt);
		setSi_did_emsg(si_did_emsg);
		setSi_compress_cnt(si_compress_cnt);
		setSi_first_free(si_first_free);
		setSi_free_count(si_free_count);
		setSi_spellbuf(si_spellbuf);
		setSi_ascii(si_ascii);
		setSi_add(si_add);
		setSi_clear_chartab(si_clear_chartab);
		setSi_region(si_region);
		setSi_conv(si_conv);
		setSi_memtot(si_memtot);
		setSi_verbose(si_verbose);
		setSi_msg_count(si_msg_count);
		setSi_info(si_info);
		setSi_region_count(si_region_count);
		setSi_region_name(si_region_name);
		setSi_rep(si_rep);
		setSi_repsal(si_repsal);
		setSi_sal(si_sal);
		setSi_sofofr(si_sofofr);
		setSi_sofoto(si_sofoto);
		setSi_nosugfile(si_nosugfile);
		setSi_nosplitsugs(si_nosplitsugs);
		setSi_nocompoundsugs(si_nocompoundsugs);
		setSi_followup(si_followup);
		setSi_collapse(si_collapse);
		setSi_commonwords(si_commonwords);
		setSi_sugtime(si_sugtime);
		setSi_rem_accents(si_rem_accents);
		setSi_map(si_map);
		setSi_midword(si_midword);
		setSi_compmax(si_compmax);
		setSi_compminlen(si_compminlen);
		setSi_compsylmax(si_compsylmax);
		setSi_compoptions(si_compoptions);
		setSi_comppat(si_comppat);
		setSi_compflags(si_compflags);
		setSi_nobreak(si_nobreak);
		setSi_syllable(si_syllable);
		setSi_prefcond(si_prefcond);
		setSi_newprefID(si_newprefID);
		setSi_newcompID(si_newcompID);
	}
	public spellinfo_S() {
	}
	
	public void check_renumber() {
		int generatedSi_newprefID = this.getSi_newprefID();
		int generatedSi_newcompID = this.getSi_newcompID();
		if (generatedSi_newprefID == generatedSi_newcompID && generatedSi_newcompID < 128) {
			this.setSi_newprefID(127);
			this.setSi_newcompID(255/*
			 * Return TRUE if flag "flag" appears in affix list "afflist".
			 */);
		} 
	}
	public int spell_read_wordfile(Object fname) {
		FILE fd = new FILE();
		long lnum = 0;
		char_u[] rline = new char_u();
		char_u line = new char_u();
		char_u pc = ((Object)0);
		char_u p = new char_u();
		int l;
		int retval = 1;
		int did_word = 0;
		int non_ascii = 0;
		int flags;
		int regionmask;
		/*
		     * Open the file.
		     */
		fd = ModernizedCProgram.mch_fopen((byte)fname, "r");
		if (fd == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_notopen)), fname);
			return 0;
		} 
		ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Reading word file %s...")), fname);
		spin.spell_message(ModernizedCProgram.IObuff/*
		     * Read all the lines in the file one by one.
		     */);
		 generatedSi_conv = this.getSi_conv();
		Object generatedVc_type = generatedSi_conv.getVc_type();
		int generatedSi_ascii = this.getSi_ascii();
		int generatedSi_region_count = this.getSi_region_count();
		Object generatedSi_region_name = this.getSi_region_name();
		int generatedSi_region = this.getSi_region();
		while (!fd.vim_fgets(rline, 500) && !got_int) {
			ModernizedCProgram.line_breakcheck();
			++lnum;
			if (rline == /* Skip comment lines. */(byte)'#') {
				continue;
			} 
			l = (int).strlen((byte)(/* Remove CR, LF and white space from the end. */rline));
			while (l > 0 && rline[l - 1] <= (byte)' ') {
				--l;
			}
			if (l == 0) {
				continue;
			} 
			rline[l] = (byte)'\000';
			ModernizedCProgram.vim_free(/* Convert from "/encoding={encoding}" to 'encoding' when needed. */pc);
			if (generatedVc_type != 0) {
				pc = generatedSi_conv.string_convert(rline, ((Object)0));
				if (pc == ((Object)0)) {
					ModernizedCProgram.smsg(((byte)("Conversion failure for word in %s line %d: %s")), fname, lnum, rline);
					continue;
				} 
				line = pc;
			} else {
					pc = ((Object)0);
					line = rline;
			} 
			if (line == (byte)'/') {
				++line;
				if (.strncmp((byte)(line), (byte)("encoding="), (size_t)(true)) == 0) {
					if (generatedVc_type != 0) {
						ModernizedCProgram.smsg(((byte)("Duplicate /encoding= line ignored in %s line %d: %s")), fname, lnum, line - 1);
					}  else if (did_word) {
						ModernizedCProgram.smsg(((byte)("/encoding= line after word ignored in %s line %d: %s")), fname, lnum, line - 1);
					} else {
							char_u enc = new char_u();
							line += /* Setup for conversion to 'encoding'. */9;
							enc = ModernizedCProgram.enc_canonize(line);
							if (enc != ((Object)0) && !generatedSi_ascii && generatedSi_conv.convert_setup(enc, ModernizedCProgram.p_enc) == 0) {
								ModernizedCProgram.smsg(((byte)("Conversion in %s not supported: from %s to %s")), fname, line, ModernizedCProgram.p_enc);
							} 
							ModernizedCProgram.vim_free(enc);
							generatedSi_conv.setVc_fail(1);
					} 
					continue;
				} 
				if (.strncmp((byte)(line), (byte)("regions="), (size_t)(true)) == 0) {
					if (generatedSi_region_count > 1) {
						ModernizedCProgram.smsg(((byte)("Duplicate /regions= line ignored in %s line %d: %s")), fname, lnum, line);
					} else {
							line += 8;
							if (.strlen((byte)(line)) > 8 * 2) {
								ModernizedCProgram.smsg(((byte)("Too many regions in %s line %d: %s")), fname, lnum, line);
							} else {
									this.setSi_region_count((int).strlen((byte)(line)) / 2);
									.strcpy((byte)(generatedSi_region_name), (byte)(line));
									this.setSi_region((1 << generatedSi_region_count) - /* Adjust the mask for a word valid in all regions. */1);
							} 
					} 
					continue;
				} 
				ModernizedCProgram.smsg(((byte)("/ line ignored in %s line %d: %s")), fname, lnum, line - 1);
				continue;
			} 
			flags = 0;
			regionmask = generatedSi_region;
			p = ModernizedCProgram.vim_strchr(line, /* Check for flags and region after a slash. */(byte)'/');
			if (p != ((Object)0)) {
				p++ = (byte)'\000';
				while (p != (byte)'\000') {
					if (p == /* keep-case word */(byte)'=') {
						flags |=  -1024 | -1024;
					}  else if (p == /* Bad, bad, wicked word. */(byte)'!') {
						flags |=  -1024;
					}  else if (p == /* Rare word. */(byte)'?') {
						flags |=  -1024;
					}  else if (((int)(p) - (byte)'0' < /* region number(s) */10)) {
						if ((flags & -1024) == /* first one */0) {
							regionmask = 0;
						} 
						flags |=  -1024;
						l = p - (byte)'0';
						if (l == 0 || l > generatedSi_region_count) {
							ModernizedCProgram.smsg(((byte)("Invalid region nr in %s line %d: %s")), fname, lnum, p);
							break;
						} 
						regionmask |=  1 << (l - 1);
					} else {
							ModernizedCProgram.smsg(((byte)("Unrecognized flags in %s line %d: %s")), fname, lnum, p);
							break;
					} 
					++p;
				}
			} 
			if (generatedSi_ascii && ModernizedCProgram.has_non_ascii(/* Skip non-ASCII words when "spin->si_ascii" is TRUE. */line)) {
				++non_ascii;
				continue;
			} 
			if (spin.store_word(line, flags, regionmask, ((Object)0), 0) == /* Normal word: store it. */0) {
				retval = 0;
				break;
			} 
			did_word = 1;
		}
		ModernizedCProgram.vim_free(pc);
		.fclose(fd);
		if (generatedSi_ascii && non_ascii > 0) {
			ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Ignored %d words with non-ASCII characters")), non_ascii);
			spin.spell_message(ModernizedCProgram.IObuff);
		} 
		return retval/*
		 * Get part of an sblock_T, "len" bytes long.
		 * This avoids calling free() for every little struct we use (and keeping
		 * track of them).
		 * The memory is cleared to all zeros.
		 * Returns NULL when out of memory.
		 */;
	}
	public Object getroom(Object len, int align) {
		/* align for pointer */char_u p = new char_u();
		sblock_S generatedSi_blocks = this.getSi_blocks();
		sblock_T bl = generatedSi_blocks;
		int generatedSb_used = bl.getSb_used();
		if (align && bl != ((Object)0/* Round size up for alignment.  On some systems structures need to be
			 * aligned to the size of a pointer (e.g., SPARC). */)) {
			bl.setSb_used((generatedSb_used +  - 1) & ~( - 1));
		} 
		int generatedSi_did_emsg = this.getSi_did_emsg();
		long generatedSi_blocks_cnt = this.getSi_blocks_cnt();
		if (bl == ((Object)0) || generatedSb_used + len > 16000) {
			if (len >= 16000) {
				bl = ((Object)0);
			} else {
					bl = ModernizedCProgram.alloc_clear( + /* Allocate a block of memory. It is not freed until much later. */16000);
			} 
			if (bl == ((Object)0)) {
				if (!generatedSi_did_emsg) {
					ModernizedCProgram.emsg(((byte)("E845: Insufficient memory, word list will be incomplete")));
					this.setSi_did_emsg(1);
				} 
				return ((Object)0);
			} 
			bl.setSb_next(generatedSi_blocks);
			this.setSi_blocks(bl);
			bl.setSb_used(0);
			++generatedSi_blocks_cnt;
		} 
		Object generatedSb_data = bl.getSb_data();
		p = generatedSb_data + generatedSb_used;
		generatedSb_used += (int)len;
		return p/*
		 * Make a copy of a string into memory allocated with getroom().
		 * Returns NULL when out of memory.
		 */;
	}
	/* length needed */
	public Object getroom_save(Object s) {
		char_u sc = new char_u();
		sc = (char_u)spin.getroom(.strlen((byte)(s)) + 1, 0);
		if (sc != ((Object)0)) {
			.strcpy((byte)(sc), (byte)(s));
		} 
		return sc/*
		 * Free the list of allocated sblock_T.
		 */;
	}
	public int store_word(Object word, int flags, int region, Object pfxlist, int need_affix) {
		int len = (int).strlen((byte)(/* supported region(s) *//* list of prefix IDs or NULL *//* only store word with affix ID */word));
		int ct = ModernizedCProgram.captype(word, word + len);
		char_u[] foldword = new char_u();
		int res = 1;
		char_u p = new char_u();
		(Object)ModernizedCProgram.spell_casefold(word, len, foldword, 254);
		wordnode_S generatedSi_foldroot = this.getSi_foldroot();
		for (p = pfxlist; res == 1; ++p) {
			if (!need_affix || (p != ((Object)0) && p != (byte)'\000')) {
				res = ModernizedCProgram.tree_add_word(spin, foldword, generatedSi_foldroot, ct | flags, region, p == ((Object)0) ? 0 : p);
			} 
			if (p == ((Object)0) || p == (byte)'\000') {
				break;
			} 
		}
		long generatedSi_foldwcount = this.getSi_foldwcount();
		++generatedSi_foldwcount;
		wordnode_S generatedSi_keeproot = this.getSi_keeproot();
		long generatedSi_keepwcount = this.getSi_keepwcount();
		if (res == 1 && (ct == -1024 || (flags & -1024))) {
			for (p = pfxlist; res == 1; ++p) {
				if (!need_affix || (p != ((Object)0) && p != (byte)'\000')) {
					res = ModernizedCProgram.tree_add_word(spin, word, generatedSi_keeproot, flags, region, p == ((Object)0) ? 0 : p);
				} 
				if (p == ((Object)0) || p == (byte)'\000') {
					break;
				} 
			}
			++generatedSi_keepwcount;
		} 
		return res/*
		 * Add word "word" to a word tree at "root".
		 * When "flags" < 0 we are adding to the prefix tree where "flags" is used for
		 * "rare" and "region" is the condition nr.
		 * Returns FAIL when out of memory.
		 */;
	}
	/* extra flags, WF_BANNED */
	public int write_vim_spell(Object fname) {
		FILE fd = new FILE();
		int regionmask;
		int round;
		wordnode_T tree = new wordnode_T();
		int nodecount;
		int i;
		int l;
		garray_T gap = new garray_T();
		fromto_T ftp = new fromto_T();
		char_u p = new char_u();
		int rr;
		int retval = 1;
		size_t fwv = /* collect return value of fwrite() to avoid
					     warnings from picky compiler */1;
		fd = ModernizedCProgram.mch_fopen((byte)fname, "w");
		if (fd == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_notopen)), fname);
			return 0;
		} 
		fwv &=  .fwrite("VIMspell", 8, (size_t)1, /* <HEADER>: <fileID> <versionnr> *//* <fileID> */fd);
		if (fwv != (size_t)1/* Catch first write error, don't try writing more. */) {
			;
		} 
		.putc(50, /* <versionnr> */fd/*
		     * <SECTIONS>: <section> ... <sectionend>
		     */);
		Object generatedSi_info = this.getSi_info();
		if (generatedSi_info != ((Object)/* SN_INFO: <infotext> */0)) {
			.putc(15, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			i = (int).strlen((byte)(generatedSi_info));
			fd.put_bytes((long_u)i, /* <sectionlen> */4);
			fwv &=  .fwrite(generatedSi_info, (size_t)i, (size_t)1, /* <infotext> */fd);
		} 
		int generatedSi_region_count = this.getSi_region_count();
		Object generatedSi_region_name = this.getSi_region_name();
		if (generatedSi_region_count > /* SN_REGION: <regionname> ...
		     * Write the region names only if there is more than one. */1) {
			.putc(0, /* <sectionID> */fd);
			.putc(1, /* <sectionflags> */fd);
			l = generatedSi_region_count * 2;
			fd.put_bytes((long_u)l, /* <sectionlen> */4);
			fwv &=  .fwrite(generatedSi_region_name, (size_t)l, (size_t)1, fd);
			regionmask = (1 << generatedSi_region_count) - /* <regionname> ... */1;
		} else {
				regionmask = 0/* SN_CHARFLAGS: <charflagslen> <charflags> <folcharslen> <folchars>
				     *
				     * The table with character flags and the table for case folding.
				     * This makes sure the same characters are recognized as word characters
				     * when generating an when using a spell file.
				     * Skip this for ASCII, the table may conflict with the one used for
				     * 'encoding'.
				     * Also skip this for an .add.spl file, the main spell file must contain
				     * the table (avoids that it conflicts).  File is shorter too.
				     */;
		} 
		int generatedSi_ascii = this.getSi_ascii();
		int generatedSi_add = this.getSi_add();
		Object generatedSt_fold = spelltab.getSt_fold();
		Object generatedSt_isw = spelltab.getSt_isw();
		Object generatedSt_isu = spelltab.getSt_isu();
		if (!generatedSi_ascii && !generatedSi_add) {
			char_u[] folchars = new char_u();
			int flags;
			.putc(1, /* <sectionID> */fd);
			.putc(1, /* <sectionflags> */fd);
			l = /* Form the <folchars> string first, we need to know its length. */0;
			for (i = 128; i < 256; ++i) {
				if (has_mbyte) {
					l += .mb_char2bytes(generatedSt_fold[i], folchars + l);
				} else {
						folchars[l++] = generatedSt_fold[i];
				} 
			}
			fd.put_bytes((long_u)(1 + 128 + 2 + l), /* <sectionlen> */4);
			.fputc(128, /* <charflagslen> */fd);
			for (i = 128; i < 256; ++i) {
				flags = 0;
				if (generatedSt_isw[i]) {
					flags |=  -1024;
				} 
				if (generatedSt_isu[i]) {
					flags |=  -1024;
				} 
				.fputc(flags, /* <charflags> */fd);
			}
			fd.put_bytes((long_u)l, /* <folcharslen> */2);
			fwv &=  .fwrite(folchars, (size_t)l, (size_t)1, /* <folchars> */fd);
		} 
		Object generatedSi_midword = this.getSi_midword();
		if (generatedSi_midword != ((Object)/* SN_MIDWORD: <midword> */0)) {
			.putc(2, /* <sectionID> */fd);
			.putc(1, /* <sectionflags> */fd);
			i = (int).strlen((byte)(generatedSi_midword));
			fd.put_bytes((long_u)i, /* <sectionlen> */4);
			fwv &=  .fwrite(generatedSi_midword, (size_t)i, (size_t)1, fd/* <midword> */);
		} 
		growarray generatedSi_prefcond = this.getSi_prefcond();
		int generatedGa_len = generatedSi_prefcond.getGa_len();
		if (generatedGa_len > /* SN_PREFCOND: <prefcondcnt> <prefcond> ... */0) {
			.putc(3, /* <sectionID> */fd);
			.putc(1, /* <sectionflags> */fd);
			l = ModernizedCProgram.write_spell_prefcond(((Object)0), generatedSi_prefcond);
			fd.put_bytes((long_u)l, /* <sectionlen> */4);
			ModernizedCProgram.write_spell_prefcond(fd, generatedSi_prefcond);
		} 
		growarray generatedSi_rep = this.getSi_rep();
		Object generatedSi_sofofr = this.getSi_sofofr();
		Object generatedSi_sofoto = this.getSi_sofoto();
		growarray generatedSi_sal = this.getSi_sal();
		growarray generatedSi_repsal = this.getSi_repsal();
		Object generatedGa_data = gap.getGa_data();
		Object generatedFt_from = ftp.getFt_from();
		Object generatedFt_to = ftp.getFt_to();
		int generatedSi_followup = this.getSi_followup();
		int generatedSi_collapse = this.getSi_collapse();
		int generatedSi_rem_accents = this.getSi_rem_accents();
		for (round = 1; round <= 3; ++/* round 1: SN_REP section
		     * round 2: SN_SAL section (unless SN_SOFO is used)
		     * round 3: SN_REPSAL section */round) {
			if (round == 1) {
				gap = generatedSi_rep;
			}  else if (round == 2) {
				if (generatedSi_sofofr != ((Object)0) && generatedSi_sofoto != ((Object)/* Don't write SN_SAL when using a SN_SOFO section */0)) {
					continue;
				} 
				gap = generatedSi_sal;
			} else {
					gap = generatedSi_repsal;
			} 
			if (generatedGa_len == /* Don't write the section if there are no items. */0) {
				continue;
			} 
			if (round != /* Sort the REP/REPSAL items. */2) {
				.qsort(generatedGa_data, (size_t)generatedGa_len, , ModernizedCProgram.rep_compare);
			} 
			i = round == 1 ? 4 : (round == 2 ? 5 : 12);
			.putc(i, /* <sectionID> */fd);
			.putc(0, /* This is for making suggestions, section is not required. *//* <sectionflags> */fd);
			l = /* Compute the length of what follows. *//* count <repcount> or <salcount> */2;
			for (i = 0; i < generatedGa_len; ++i) {
				ftp = ((fromto_T)generatedGa_data)[i];
				l += 1 + (int).strlen((byte)(generatedFt_from));
				l += 1 + (int).strlen((byte)(generatedFt_to));
			}
			if (round == 2) {
				++/* count <salflags> */l;
			} 
			fd.put_bytes((long_u)l, /* <sectionlen> */4);
			if (round == 2) {
				i = 0;
				if (generatedSi_followup) {
					i |=  1;
				} 
				if (generatedSi_collapse) {
					i |=  2;
				} 
				if (generatedSi_rem_accents) {
					i |=  4;
				} 
				.putc(i, /* <salflags> */fd);
			} 
			fd.put_bytes((long_u)generatedGa_len, /* <repcount> or <salcount> */2);
			for (i = 0; i < generatedGa_len; ++i) {
				ftp = ((fromto_T)generatedGa_data)[/* <rep> : <repfromlen> <repfrom> <reptolen> <repto> *//* <sal> : <salfromlen> <salfrom> <saltolen> <salto> */i];
				for (rr = 1; rr <= 2; ++rr) {
					p = rr == 1 ? generatedFt_from : generatedFt_to;
					l = (int).strlen((byte)(p));
					.putc(l, fd);
					if (l > 0) {
						fwv &=  .fwrite(p, l, (size_t)1, fd);
					} 
				}
			}
		}
		if (generatedSi_sofofr != ((Object)0) && generatedSi_sofoto != ((Object)/* SN_SOFO: <sofofromlen> <sofofrom> <sofotolen> <sofoto>
		     * This is for making suggestions, section is not required. */0)) {
			.putc(6, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			l = (int).strlen((byte)(generatedSi_sofofr));
			fd.put_bytes((long_u)(l + .strlen((byte)(generatedSi_sofoto)) + 4), 4/* <sectionlen> */);
			fd.put_bytes((long_u)l, /* <sofofromlen> */2);
			fwv &=  .fwrite(generatedSi_sofofr, l, (size_t)1, /* <sofofrom> */fd);
			l = (int).strlen((byte)(generatedSi_sofoto));
			fd.put_bytes((long_u)l, /* <sofotolen> */2);
			fwv &=  .fwrite(generatedSi_sofoto, l, (size_t)1, /* <sofoto> */fd);
		} 
		hashtable_S generatedSi_commonwords = this.getSi_commonwords();
		Object generatedHt_used = generatedSi_commonwords.getHt_used();
		Object generatedHi_key = (hi).getHi_key();
		hashitem_S generatedHt_array = generatedSi_commonwords.getHt_array();
		if (generatedHt_used > /* SN_WORDS: <word> ...
		     * This is for making suggestions, section is not required. */0) {
			.putc(13, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			for (round = 1; round <= 2; ++/* round 1: count the bytes
				 * round 2: write the bytes */round) {
				int todo;
				int len = 0;
				hashitem_T hi = new hashitem_T();
				todo = (int)generatedHt_used;
				for (hi = generatedHt_array; todo > 0; ++hi) {
					if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
						l = (int).strlen((byte)(generatedHi_key)) + 1;
						len += l;
						if (round == /* <word> */2) {
							fwv &=  .fwrite(generatedHi_key, (size_t)l, (size_t)1, fd);
						} 
						--todo;
					} 
				}
				if (round == 1) {
					fd.put_bytes((long_u)len, /* <sectionlen> */4);
				} 
			}
		} 
		if (generatedGa_len > /* SN_MAP: <mapstr>
		     * This is for making suggestions, section is not required. */0) {
			.putc(7, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			l = generatedGa_len;
			fd.put_bytes((long_u)l, /* <sectionlen> */4);
			fwv &=  .fwrite(generatedGa_data, (size_t)l, (size_t)1, fd/* <mapstr> *//* SN_SUGFILE: <timestamp>
			     * This is used to notify that a .sug file may be available and at the
			     * same time allows for checking that a .sug file that is found matches
			     * with this .spl file.  That's because the word numbers must be exactly
			     * right. */);
		} 
		int generatedSi_nosugfile = this.getSi_nosugfile();
		Object generatedSi_sugtime = this.getSi_sugtime();
		if (!generatedSi_nosugfile && (generatedGa_len > 0 || (generatedSi_sofofr != ((Object)0) && generatedSi_sofoto != ((Object)0)))) {
			.putc(11, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			fd.put_bytes((long_u)8, /* <sectionlen> */4);
			this.setSi_sugtime(.time(((Object)/* Set si_sugtime and write it to the file. */0)));
			fd.put_time(generatedSi_sugtime);
		} 
		int generatedSi_nosplitsugs = this.getSi_nosplitsugs();
		if (generatedSi_nosplitsugs) {
			.putc(14, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			fd.put_bytes((long_u)0, /* <sectionlen> */4);
		} 
		int generatedSi_nocompoundsugs = this.getSi_nocompoundsugs();
		if (generatedSi_nocompoundsugs) {
			.putc(16, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			fd.put_bytes((long_u)0, /* <sectionlen> */4);
		} 
		Object generatedSi_compflags = this.getSi_compflags();
		int generatedSi_compmax = this.getSi_compmax();
		int generatedSi_compminlen = this.getSi_compminlen();
		int generatedSi_compsylmax = this.getSi_compsylmax();
		int generatedSi_compoptions = this.getSi_compoptions();
		if (generatedSi_compflags != ((Object)/* SN_COMPOUND: compound info.
		     * We don't mark it required, when not supported all compound words will
		     * be bad words. */0)) {
			.putc(8, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			l = (int).strlen((byte)(generatedSi_compflags));
			for (i = 0; i < generatedGa_len; ++i) {
				l += (int).strlen((byte)(((char_u)(generatedGa_data))[i])) + 1;
			}
			fd.put_bytes((long_u)(l + 7), /* <sectionlen> */4);
			.putc(generatedSi_compmax, /* <compmax> */fd);
			.putc(generatedSi_compminlen, /* <compminlen> */fd);
			.putc(generatedSi_compsylmax, /* <compsylmax> */fd);
			.putc(0, /* for Vim 7.0b compatibility */fd);
			.putc(generatedSi_compoptions, /* <compoptions> */fd);
			fd.put_bytes((long_u)generatedGa_len, 2);
			for (i = 0; i < generatedGa_len; ++/* <comppatcount> */i) {
				p = ((char_u)(generatedGa_data))[i];
				.putc((int).strlen((byte)(p)), /* <comppatlen> */fd);
				fwv &=  .fwrite(p, (size_t).strlen((byte)(p)), (size_t)1, fd/* <comppattext> */);
			}
			fwv &=  .fwrite(generatedSi_compflags, (size_t).strlen((byte)(generatedSi_compflags)), (size_t)1, fd);
		} 
		Object generatedSi_nobreak = this.getSi_nobreak();
		if (generatedSi_nobreak) {
			.putc(10, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			fd.put_bytes((long_u)0, /* It's empty, the presence of the section flags the feature. *//* <sectionlen> */4);
		} 
		Object generatedSi_syllable = this.getSi_syllable();
		if (generatedSi_syllable != ((Object)/* SN_SYLLABLE: syllable info.
		     * We don't mark it required, when not supported syllables will not be
		     * counted. */0)) {
			.putc(9, /* <sectionID> */fd);
			.putc(0, /* <sectionflags> */fd);
			l = (int).strlen((byte)(generatedSi_syllable));
			fd.put_bytes((long_u)l, /* <sectionlen> */4);
			fwv &=  .fwrite(generatedSi_syllable, (size_t)l, (size_t)1, fd/* <syllable> */);
		} 
		.putc(255, /* end of <SECTIONS> *//* <sectionend> */fd);
		this.setSi_memtot(/*
		     * <LWORDTREE>  <KWORDTREE>  <PREFIXTREE>
		     */0);
		wordnode_S generatedSi_foldroot = this.getSi_foldroot();
		wordnode_S generatedWn_sibling = generatedSi_foldroot.getWn_sibling();
		int generatedSi_memtot = this.getSi_memtot();
		for (round = 1; round <= 3; ++round) {
			if (round == 1) {
				tree = generatedWn_sibling;
			}  else if (round == 2) {
				tree = generatedWn_sibling;
			} else {
					tree = generatedWn_sibling;
			} 
			/* Clear the index and wnode fields in the tree. */tree/* Count the number of nodes.  Needed to be able to allocate the
				 * memory when reading the nodes.  Also fills in index for shared
				 * nodes. */.clear_node();
			nodecount = ModernizedCProgram.put_node(((Object)0), tree, 0, regionmask, round == 3);
			fd.put_bytes((long_u)nodecount, /* number of nodes in 4 bytes *//* <nodecount> */4);
			generatedSi_memtot += nodecount + nodecount * ;
			(Object)ModernizedCProgram.put_node(fd, tree, 0, regionmask, round == /* Write the nodes. */3);
		}
		if (.putc(0, fd) == (/* Write another byte to check for errors (file system full). */true)) {
			retval = 0;
		} 
		if (fwv != (size_t)1) {
			retval = 0;
		} 
		if (retval == 0) {
			ModernizedCProgram.emsg(((byte)(e_write)));
		} 
		return retval/*
		 * Clear the index and wnode fields of "node", it siblings and its
		 * children.  This is needed because they are a union with other items to save
		 * space.
		 */;
	}
	public void spell_make_sugfile(Object wfname) {
		char_u fname = ((Object)0);
		int len;
		slang_T slang = new slang_T();
		int free_slang = 0/*
		     * Read back the .spl file that was written.  This fills the required
		     * info for soundfolding.  This also uses less memory than the
		     * pointer-linked version of the trie.  And it avoids having two versions
		     * of the code for the soundfolding stuff.
		     * It might have been done already by spell_reload_one().
		     */;
		Object generatedSl_fname = slang.getSl_fname();
		slang_S generatedSl_next = slang.getSl_next();
		for (slang = first_lang; slang != ((Object)0); slang = generatedSl_next) {
			if (ModernizedCProgram.fullpathcmp(wfname, generatedSl_fname, 0, 1) == 1) {
				break;
			} 
		}
		if (slang == ((Object)0)) {
			spin.spell_message((char_u)((byte)("Reading back spell file...")));
			slang = ((Object)0).spell_load_file(wfname, ((Object)0), 0);
			if (slang == ((Object)0)) {
				return ;
			} 
			free_slang = 1;
		} 
		this.setSi_blocks(((Object)/*
		     * Clear the info in "spin" that is used.
		     */0));
		this.setSi_blocks_cnt(0);
		this.setSi_compress_cnt(/* will stay at 0 all the time*/0);
		this.setSi_free_count(0);
		this.setSi_first_free(((Object)0));
		this.setSi_foldwcount(0/*
		     * Go through the trie of good words, soundfold each word and add it to
		     * the soundfold trie.
		     */);
		spin.spell_message((char_u)((byte)("Performing soundfolding...")));
		if (ModernizedCProgram.sug_filltree(spin, slang) == 0) {
			;
		} 
		if (spin.sug_maketable() == 0) {
			;
		} 
		file_buffer generatedSi_spellbuf = this.getSi_spellbuf();
		memline generatedB_ml = generatedSi_spellbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		ModernizedCProgram.smsg(((byte)("Number of words after soundfolding: %ld")), (long)generatedMl_line_count);
		spin.spell_message((char_u)((byte)(ModernizedCProgram.msg_compressing)));
		wordnode_S generatedSi_foldroot = this.getSi_foldroot();
		ModernizedCProgram.wordtree_compress(spin, generatedSi_foldroot);
		fname = ModernizedCProgram.alloc(1024);
		if (fname == ((Object)0)) {
			;
		} 
		ModernizedCProgram.vim_strncpy(fname, wfname, 1024 - 1);
		len = (int).strlen((byte)(fname));
		fname[len - 2] = (byte)'u';
		fname[len - 1] = (byte)'g';
		spin.sug_write(fname);
		if (free_slang) {
			slang.slang_free();
		} 
		sblock_S generatedSi_blocks = this.getSi_blocks();
		generatedSi_blocks.free_blocks();
		generatedSi_spellbuf.close_spellbuf();
	}
	public int sug_maketable() {
		garray_T ga = new garray_T();
		int res = 1;
		file_buffer file_buffer = new file_buffer();
		this.setSi_spellbuf(file_buffer.open_spellbuf());
		file_buffer generatedSi_spellbuf = this.getSi_spellbuf();
		if (generatedSi_spellbuf == ((Object)0)) {
			return 0;
		} 
		ga.ga_init2(1, /* Use a buffer to store the line info, avoids allocating many small
		     * pieces of memory. */100);
		wordnode_S generatedSi_foldroot = this.getSi_foldroot();
		wordnode_S generatedWn_sibling = generatedSi_foldroot.getWn_sibling();
		if (ModernizedCProgram.sug_filltable(spin, generatedWn_sibling, 0, ga) == -/* recursively go through the tree */1) {
			res = 0;
		} 
		ga.ga_clear();
		return res/*
		 * Fill the table for one node and its children.
		 * Returns the wordnr at the start of the node.
		 * Returns -1 when out of memory.
		 */;
	}
	public void sug_write(Object fname) {
		FILE fd = new FILE();
		wordnode_T tree = new wordnode_T();
		int nodecount;
		int wcount;
		char_u line = new char_u();
		linenr_T lnum = new linenr_T();
		int len;
		fd = ModernizedCProgram.mch_fopen((byte)fname, /* Create the file.  Note that an existing file is silently overwritten! */"w");
		if (fd == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_notopen)), fname);
			return ;
		} 
		ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Writing suggestion file %s...")), fname);
		spin.spell_message(ModernizedCProgram.IObuff/*
		     * <SUGHEADER>: <fileID> <versionnr> <timestamp>
		     */);
		if (.fwrite("VIMsug", 6, (size_t)1, fd) != /* <fileID> */1) {
			ModernizedCProgram.emsg(((byte)(e_write)));
			;
		} 
		.putc(1, /* <versionnr> */fd);
		Object generatedSi_sugtime = this.getSi_sugtime();
		fd.put_time(generatedSi_sugtime);
		this.setSi_memtot(0);
		wordnode_S generatedSi_foldroot = this.getSi_foldroot();
		wordnode_S generatedWn_sibling = generatedSi_foldroot.getWn_sibling();
		tree = generatedWn_sibling;
		/* Clear the index and wnode fields in the tree. */tree/* Count the number of nodes.  Needed to be able to allocate the
		     * memory when reading the nodes.  Also fills in index for shared
		     * nodes. */.clear_node();
		nodecount = ModernizedCProgram.put_node(((Object)0), tree, 0, 0, 0);
		fd.put_bytes((long_u)nodecount, /* number of nodes in 4 bytes *//* <nodecount> */4);
		int generatedSi_memtot = this.getSi_memtot();
		generatedSi_memtot += nodecount + nodecount * ;
		(Object)ModernizedCProgram.put_node(fd, tree, 0, 0, /* Write the nodes. */0/*
		     * <SUGTABLE>: <sugwcount> <sugline> ...
		     */);
		file_buffer generatedSi_spellbuf = this.getSi_spellbuf();
		memline generatedB_ml = generatedSi_spellbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		wcount = generatedMl_line_count;
		fd.put_bytes((long_u)wcount, /* <sugwcount> */4);
		for (lnum = 1; lnum <= (linenr_T)wcount; ++lnum) {
			line = generatedSi_spellbuf.ml_get_buf(lnum, /* <sugline>: <sugnr> ... NUL */0);
			len = (int).strlen((byte)(line)) + 1;
			if (.fwrite(line, (size_t)len, (size_t)1, fd) == 0) {
				ModernizedCProgram.emsg(((byte)(e_write)));
				;
			} 
			generatedSi_memtot += len;
		}
		if (.putc(0, fd) == (/* Write another byte to check for errors. */true)) {
			ModernizedCProgram.emsg(((byte)(e_write)));
		} 
		ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Estimated runtime memory use: %d bytes")), generatedSi_memtot);
		spin.spell_message(ModernizedCProgram.IObuff);
	}
	public void spell_message(Object str) {
		int generatedSi_verbose = this.getSi_verbose();
		if (generatedSi_verbose || ModernizedCProgram.p_verbose > 2) {
			if (!generatedSi_verbose) {
				ModernizedCProgram.verbose_enter();
			} 
			ModernizedCProgram.msg((byte)str);
			ModernizedCProgram.out_flush();
			if (!generatedSi_verbose) {
				ModernizedCProgram.verbose_leave();
			} 
		} 
	}
	public wordnode_S getSi_foldroot() {
		return si_foldroot;
	}
	public void setSi_foldroot(wordnode_S newSi_foldroot) {
		si_foldroot = newSi_foldroot;
	}
	public long getSi_foldwcount() {
		return si_foldwcount;
	}
	public void setSi_foldwcount(long newSi_foldwcount) {
		si_foldwcount = newSi_foldwcount;
	}
	public wordnode_S getSi_keeproot() {
		return si_keeproot;
	}
	public void setSi_keeproot(wordnode_S newSi_keeproot) {
		si_keeproot = newSi_keeproot;
	}
	public long getSi_keepwcount() {
		return si_keepwcount;
	}
	public void setSi_keepwcount(long newSi_keepwcount) {
		si_keepwcount = newSi_keepwcount;
	}
	public wordnode_S getSi_prefroot() {
		return si_prefroot;
	}
	public void setSi_prefroot(wordnode_S newSi_prefroot) {
		si_prefroot = newSi_prefroot;
	}
	public long getSi_sugtree() {
		return si_sugtree;
	}
	public void setSi_sugtree(long newSi_sugtree) {
		si_sugtree = newSi_sugtree;
	}
	public sblock_S getSi_blocks() {
		return si_blocks;
	}
	public void setSi_blocks(sblock_S newSi_blocks) {
		si_blocks = newSi_blocks;
	}
	public long getSi_blocks_cnt() {
		return si_blocks_cnt;
	}
	public void setSi_blocks_cnt(long newSi_blocks_cnt) {
		si_blocks_cnt = newSi_blocks_cnt;
	}
	public int getSi_did_emsg() {
		return si_did_emsg;
	}
	public void setSi_did_emsg(int newSi_did_emsg) {
		si_did_emsg = newSi_did_emsg;
	}
	public long getSi_compress_cnt() {
		return si_compress_cnt;
	}
	public void setSi_compress_cnt(long newSi_compress_cnt) {
		si_compress_cnt = newSi_compress_cnt;
	}
	public wordnode_S getSi_first_free() {
		return si_first_free;
	}
	public void setSi_first_free(wordnode_S newSi_first_free) {
		si_first_free = newSi_first_free;
	}
	public long getSi_free_count() {
		return si_free_count;
	}
	public void setSi_free_count(long newSi_free_count) {
		si_free_count = newSi_free_count;
	}
	public file_buffer getSi_spellbuf() {
		return si_spellbuf;
	}
	public void setSi_spellbuf(file_buffer newSi_spellbuf) {
		si_spellbuf = newSi_spellbuf;
	}
	public int getSi_ascii() {
		return si_ascii;
	}
	public void setSi_ascii(int newSi_ascii) {
		si_ascii = newSi_ascii;
	}
	public int getSi_add() {
		return si_add;
	}
	public void setSi_add(int newSi_add) {
		si_add = newSi_add;
	}
	public int getSi_clear_chartab() {
		return si_clear_chartab;
	}
	public void setSi_clear_chartab(int newSi_clear_chartab) {
		si_clear_chartab = newSi_clear_chartab;
	}
	public int getSi_region() {
		return si_region;
	}
	public void setSi_region(int newSi_region) {
		si_region = newSi_region;
	}
	public  getSi_conv() {
		return si_conv;
	}
	public void setSi_conv( newSi_conv) {
		si_conv = newSi_conv;
	}
	public int getSi_memtot() {
		return si_memtot;
	}
	public void setSi_memtot(int newSi_memtot) {
		si_memtot = newSi_memtot;
	}
	public int getSi_verbose() {
		return si_verbose;
	}
	public void setSi_verbose(int newSi_verbose) {
		si_verbose = newSi_verbose;
	}
	public int getSi_msg_count() {
		return si_msg_count;
	}
	public void setSi_msg_count(int newSi_msg_count) {
		si_msg_count = newSi_msg_count;
	}
	public Object getSi_info() {
		return si_info;
	}
	public void setSi_info(Object newSi_info) {
		si_info = newSi_info;
	}
	public int getSi_region_count() {
		return si_region_count;
	}
	public void setSi_region_count(int newSi_region_count) {
		si_region_count = newSi_region_count;
	}
	public Object getSi_region_name() {
		return si_region_name;
	}
	public void setSi_region_name(Object newSi_region_name) {
		si_region_name = newSi_region_name;
	}
	public growarray getSi_rep() {
		return si_rep;
	}
	public void setSi_rep(growarray newSi_rep) {
		si_rep = newSi_rep;
	}
	public growarray getSi_repsal() {
		return si_repsal;
	}
	public void setSi_repsal(growarray newSi_repsal) {
		si_repsal = newSi_repsal;
	}
	public growarray getSi_sal() {
		return si_sal;
	}
	public void setSi_sal(growarray newSi_sal) {
		si_sal = newSi_sal;
	}
	public Object getSi_sofofr() {
		return si_sofofr;
	}
	public void setSi_sofofr(Object newSi_sofofr) {
		si_sofofr = newSi_sofofr;
	}
	public Object getSi_sofoto() {
		return si_sofoto;
	}
	public void setSi_sofoto(Object newSi_sofoto) {
		si_sofoto = newSi_sofoto;
	}
	public int getSi_nosugfile() {
		return si_nosugfile;
	}
	public void setSi_nosugfile(int newSi_nosugfile) {
		si_nosugfile = newSi_nosugfile;
	}
	public int getSi_nosplitsugs() {
		return si_nosplitsugs;
	}
	public void setSi_nosplitsugs(int newSi_nosplitsugs) {
		si_nosplitsugs = newSi_nosplitsugs;
	}
	public int getSi_nocompoundsugs() {
		return si_nocompoundsugs;
	}
	public void setSi_nocompoundsugs(int newSi_nocompoundsugs) {
		si_nocompoundsugs = newSi_nocompoundsugs;
	}
	public int getSi_followup() {
		return si_followup;
	}
	public void setSi_followup(int newSi_followup) {
		si_followup = newSi_followup;
	}
	public int getSi_collapse() {
		return si_collapse;
	}
	public void setSi_collapse(int newSi_collapse) {
		si_collapse = newSi_collapse;
	}
	public hashtable_S getSi_commonwords() {
		return si_commonwords;
	}
	public void setSi_commonwords(hashtable_S newSi_commonwords) {
		si_commonwords = newSi_commonwords;
	}
	public Object getSi_sugtime() {
		return si_sugtime;
	}
	public void setSi_sugtime(Object newSi_sugtime) {
		si_sugtime = newSi_sugtime;
	}
	public int getSi_rem_accents() {
		return si_rem_accents;
	}
	public void setSi_rem_accents(int newSi_rem_accents) {
		si_rem_accents = newSi_rem_accents;
	}
	public growarray getSi_map() {
		return si_map;
	}
	public void setSi_map(growarray newSi_map) {
		si_map = newSi_map;
	}
	public Object getSi_midword() {
		return si_midword;
	}
	public void setSi_midword(Object newSi_midword) {
		si_midword = newSi_midword;
	}
	public int getSi_compmax() {
		return si_compmax;
	}
	public void setSi_compmax(int newSi_compmax) {
		si_compmax = newSi_compmax;
	}
	public int getSi_compminlen() {
		return si_compminlen;
	}
	public void setSi_compminlen(int newSi_compminlen) {
		si_compminlen = newSi_compminlen;
	}
	public int getSi_compsylmax() {
		return si_compsylmax;
	}
	public void setSi_compsylmax(int newSi_compsylmax) {
		si_compsylmax = newSi_compsylmax;
	}
	public int getSi_compoptions() {
		return si_compoptions;
	}
	public void setSi_compoptions(int newSi_compoptions) {
		si_compoptions = newSi_compoptions;
	}
	public growarray getSi_comppat() {
		return si_comppat;
	}
	public void setSi_comppat(growarray newSi_comppat) {
		si_comppat = newSi_comppat;
	}
	public Object getSi_compflags() {
		return si_compflags;
	}
	public void setSi_compflags(Object newSi_compflags) {
		si_compflags = newSi_compflags;
	}
	public Object getSi_nobreak() {
		return si_nobreak;
	}
	public void setSi_nobreak(Object newSi_nobreak) {
		si_nobreak = newSi_nobreak;
	}
	public Object getSi_syllable() {
		return si_syllable;
	}
	public void setSi_syllable(Object newSi_syllable) {
		si_syllable = newSi_syllable;
	}
	public growarray getSi_prefcond() {
		return si_prefcond;
	}
	public void setSi_prefcond(growarray newSi_prefcond) {
		si_prefcond = newSi_prefcond;
	}
	public int getSi_newprefID() {
		return si_newprefID;
	}
	public void setSi_newprefID(int newSi_newprefID) {
		si_newprefID = newSi_newprefID;
	}
	public int getSi_newcompID() {
		return si_newcompID;
	}
	public void setSi_newcompID(int newSi_newcompID) {
		si_newcompID = newSi_newcompID;
	}
}
