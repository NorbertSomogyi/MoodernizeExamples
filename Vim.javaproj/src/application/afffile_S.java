package application;

/* Maximum length in bytes of a line in a .aff
				   and .dic file. */
/*
 * Main structure to store the contents of a ".aff" file.
 */
public class afffile_S {
	private Object af_enc;
	private int af_flagtype;
	private int af_rare;
	private int af_keepcase;
	private int af_bad;
	private int af_needaffix;
	private int af_circumfix;
	private int af_needcomp;
	private int af_comproot;
	private int af_compforbid;
	private int af_comppermit;
	private int af_nosuggest;
	private int af_pfxpostpone;
	private int af_ignoreextra;
	private hashtable_S af_pref;
	private hashtable_S af_suff;
	private hashtable_S af_comp;
	
	public afffile_S(Object af_enc, int af_flagtype, int af_rare, int af_keepcase, int af_bad, int af_needaffix, int af_circumfix, int af_needcomp, int af_comproot, int af_compforbid, int af_comppermit, int af_nosuggest, int af_pfxpostpone, int af_ignoreextra, hashtable_S af_pref, hashtable_S af_suff, hashtable_S af_comp) {
		setAf_enc(af_enc);
		setAf_flagtype(af_flagtype);
		setAf_rare(af_rare);
		setAf_keepcase(af_keepcase);
		setAf_bad(af_bad);
		setAf_needaffix(af_needaffix);
		setAf_circumfix(af_circumfix);
		setAf_needcomp(af_needcomp);
		setAf_comproot(af_comproot);
		setAf_compforbid(af_compforbid);
		setAf_comppermit(af_comppermit);
		setAf_nosuggest(af_nosuggest);
		setAf_pfxpostpone(af_pfxpostpone);
		setAf_ignoreextra(af_ignoreextra);
		setAf_pref(af_pref);
		setAf_suff(af_suff);
		setAf_comp(af_comp);
	}
	public afffile_S() {
	}
	
	/* Cannot happen? */
	/* do the children */
	/* do the siblings */
	/* get rid of all parent details except | */
	/* Clear the "wn_u1.index" fields, used to remember what has been
		 * done. */
	/* Recursively print the tree. */
	/* SPELL_PRINTTREE */
	/*
	 * Read the affix file "fname".
	 * Returns an afffile_T, NULL for complete failure.
	 */
	public afffile_S spell_read_aff(spellinfo_S spin, Object fname) {
		FILE fd = new FILE();
		afffile_T aff = new afffile_T();
		char_u[] rline = new char_u();
		char_u line = new char_u();
		char_u pc = ((Object)0);
		char_u items = new char_u();
		int itemcnt;
		char_u p = new char_u();
		int lnum = 0;
		affheader_T cur_aff = ((Object)0);
		int did_postpone_prefix = 0;
		int aff_todo = 0;
		hashtab_T tp = new hashtab_T();
		char_u low = ((Object)0);
		char_u fol = ((Object)0);
		char_u upp = ((Object)0);
		int do_rep;
		int do_repsal;
		int do_sal;
		int do_mapline;
		int found_map = 0;
		hashitem_T hi = new hashitem_T();
		int l;
		int compminlen = /* COMPOUNDMIN value */0;
		int compsylmax = /* COMPOUNDSYLMAX value */0;
		int compoptions = /* COMP_ flags */0;
		int compmax = /* COMPOUNDWORDMAX value */0;
		char_u compflags = ((Object)/* COMPOUNDFLAG and COMPOUNDRULE
							   concatenated */0);
		char_u midword = ((Object)/* MIDWORD value */0);
		char_u syllable = ((Object)/* SYLLABLE value */0);
		char_u sofofrom = ((Object)/* SOFOFROM value */0);
		char_u sofoto = ((Object)/* SOFOTO value */0/*
		     * Open the file.
		     */);
		fd = ModernizedCProgram.mch_fopen((byte)fname, "r");
		if (fd == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_notopen)), fname);
			return ((Object)0);
		} 
		ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Reading affix file %s...")), fname);
		spin.spell_message(ModernizedCProgram.IObuff);
		growarray generatedSi_rep = spin.getSi_rep();
		int generatedGa_len = generatedSi_rep.getGa_len();
		do_rep = generatedGa_len == /* Only do REP lines when not done in another .aff file already. */0;
		do_repsal = generatedGa_len == /* Only do REPSAL lines when not done in another .aff file already. */0;
		do_sal = generatedGa_len == /* Only do SAL lines when not done in another .aff file already. */0;
		do_mapline = generatedGa_len == /* Only do MAP lines when not done in another .aff file already. */0/*
		     * Allocate and init the afffile_T structure.
		     */;
		aff = (afffile_T)spin.getroom(, 1);
		if (aff == ((Object)0)) {
			.fclose(fd);
			return ((Object)0);
		} 
		hashtable_S generatedAf_pref = aff.getAf_pref();
		generatedAf_pref.hash_init();
		hashtable_S generatedAf_suff = aff.getAf_suff();
		generatedAf_suff.hash_init();
		hashtable_S generatedAf_comp = aff.getAf_comp();
		generatedAf_comp.hash_init();
		 generatedSi_conv = spin.getSi_conv();
		Object generatedVc_type = generatedSi_conv.getVc_type();
		Object generatedAf_enc = aff.getAf_enc();
		int generatedSi_ascii = spin.getSi_ascii();
		int generatedAf_flagtype = aff.getAf_flagtype();
		int generatedAf_rare = aff.getAf_rare();
		int generatedAf_keepcase = aff.getAf_keepcase();
		int generatedAf_bad = aff.getAf_bad();
		int generatedAf_needaffix = aff.getAf_needaffix();
		int generatedAf_circumfix = aff.getAf_circumfix();
		int generatedAf_needcomp = aff.getAf_needcomp();
		int generatedAf_comproot = aff.getAf_comproot();
		int generatedAf_nosuggest = aff.getAf_nosuggest();
		Object generatedHt_used = generatedAf_suff.getHt_used();
		Object generatedSi_info = spin.getSi_info();
		int generatedAf_compforbid = aff.getAf_compforbid();
		int generatedAf_comppermit = aff.getAf_comppermit();
		growarray generatedSi_comppat = spin.getSi_comppat();
		Object generatedGa_data = gap.getGa_data();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		int generatedAh_combine = cur_aff.getAh_combine();
		int generatedAh_follows = cur_aff.getAh_follows();
		int generatedAh_flag = cur_aff.getAh_flag();
		Object generatedAh_key = cur_aff.getAh_key();
		int generatedAf_pfxpostpone = aff.getAf_pfxpostpone();
		int generatedAh_newID = cur_aff.getAh_newID();
		int generatedSi_newprefID = spin.getSi_newprefID();
		int generatedAf_ignoreextra = aff.getAf_ignoreextra();
		Object generatedAe_add = aff_entry.getAe_add();
		Object generatedAe_flags = aff_entry.getAe_flags();
		Object generatedAe_chop = aff_entry.getAe_chop();
		affentry_S generatedAh_first = cur_aff.getAh_first();
		regprog regprog = new regprog();
		regprog generatedAe_prog = aff_entry.getAe_prog();
		Object generatedSt_upper = spelltab.getSt_upper();
		Object generatedAe_cond = aff_entry.getAe_cond();
		growarray generatedSi_prefcond = spin.getSi_prefcond();
		byte generatedAe_comppermit = aff_entry.getAe_comppermit();
		byte generatedAe_compforbid = aff_entry.getAe_compforbid();
		wordnode_S generatedSi_prefroot = spin.getSi_prefroot();
		growarray generatedSi_repsal = spin.getSi_repsal();
		growarray generatedSi_map = spin.getSi_map();
		growarray generatedSi_sal = spin.getSi_sal();
		hashtable_S generatedSi_commonwords = spin.getSi_commonwords();
		while (!fd.vim_fgets(rline, 500) && !got_int) {
			ModernizedCProgram.line_breakcheck();
			++lnum;
			if (rline == /* Skip comment lines. */(byte)'#') {
				continue;
			} 
			ModernizedCProgram.vim_free(/* Convert from "SET" to 'encoding' when needed. */pc);
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
			itemcnt = /* Split the line up in white separated items.  Put a NUL after each
				 * item. */0;
			for (p = line; ; ) {
				while (p != (byte)'\000' && p <= /* skip white space and CR/NL */(byte)' ') {
					++p;
				}
				if (p == (byte)'\000') {
					break;
				} 
				if (itemcnt == /* too many items */30) {
					break;
				} 
				items[itemcnt++] = p;
				if (itemcnt == 2 && ModernizedCProgram.spell_info_item(items[/* A few items have arbitrary text argument, don't split them. */0])) {
					while (p >= (byte)' ' || p == /* skip until CR/NL */(byte)'\011') {
						++p;
					}
				} else {
						while (p > /* skip until white space or CR/NL */(byte)' ') {
							++p;
						}
				} 
				if (p == (byte)'\000') {
					break;
				} 
				p++ = (byte)'\000';
			}
			if (itemcnt > /* Handle non-empty lines. */0) {
				if (ModernizedCProgram.is_aff_rule(items, itemcnt, "SET", 2) && generatedAf_enc == ((Object)0)) {
					aff.setAf_enc(ModernizedCProgram.enc_canonize(items[/* Setup for conversion from "ENC" to 'encoding'. */1]));
					if (generatedAf_enc != ((Object)0) && !generatedSi_ascii && generatedSi_conv.convert_setup(generatedAf_enc, ModernizedCProgram.p_enc) == 0) {
						ModernizedCProgram.smsg(((byte)("Conversion in %s not supported: from %s to %s")), fname, generatedAf_enc, ModernizedCProgram.p_enc);
					} 
					generatedSi_conv.setVc_fail(1);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "FLAG", 2) && generatedAf_flagtype == 0) {
					if (.strcmp((byte)(items[1]), (byte)("long")) == 0) {
						aff.setAf_flagtype(1);
					}  else if (.strcmp((byte)(items[1]), (byte)("num")) == 0) {
						aff.setAf_flagtype(3);
					}  else if (.strcmp((byte)(items[1]), (byte)("caplong")) == 0) {
						aff.setAf_flagtype(2);
					} else {
							ModernizedCProgram.smsg(((byte)("Invalid value for FLAG in %s line %d: %s")), fname, lnum, items[1]);
					} 
					if (generatedAf_rare != 0 || generatedAf_keepcase != 0 || generatedAf_bad != 0 || generatedAf_needaffix != 0 || generatedAf_circumfix != 0 || generatedAf_needcomp != 0 || generatedAf_comproot != 0 || generatedAf_nosuggest != 0 || compflags != ((Object)0) || generatedHt_used > 0 || generatedHt_used > 0) {
						ModernizedCProgram.smsg(((byte)("FLAG after using flags in %s line %d: %s")), fname, lnum, items[1]);
					} 
				}  else if (ModernizedCProgram.spell_info_item(items[0])) {
					p = (char_u)spin.getroom((generatedSi_info == ((Object)0) ? 0 : .strlen((byte)(generatedSi_info))) + .strlen((byte)(items[0])) + .strlen((byte)(items[1])) + 3, 0);
					if (p != ((Object)0)) {
						if (generatedSi_info != ((Object)0)) {
							.strcpy((byte)(p), (byte)(generatedSi_info));
							.strcat((byte)(p), (byte)("\n"));
						} 
						.strcat((byte)(p), (byte)(items[0]));
						.strcat((byte)(p), (byte)(" "));
						.strcat((byte)(p), (byte)(items[1]));
						spin.setSi_info(p);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "MIDWORD", 2) && midword == ((Object)0)) {
					midword = spin.getroom_save(items[1]);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "TRY", 2/* ignored, we look in the tree for what chars may appear */)) {
				}  else if ((ModernizedCProgram.is_aff_rule(items, itemcnt, "RAR", /* TODO: remove "RAR" later */2) || ModernizedCProgram.is_aff_rule(items, itemcnt, "RARE", 2)) && generatedAf_rare == 0) {
					aff.setAf_rare(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if ((ModernizedCProgram.is_aff_rule(items, itemcnt, "KEP", /* TODO: remove "KEP" later */2) || ModernizedCProgram.is_aff_rule(items, itemcnt, "KEEPCASE", 2)) && generatedAf_keepcase == 0) {
					aff.setAf_keepcase(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if ((ModernizedCProgram.is_aff_rule(items, itemcnt, "BAD", 2) || ModernizedCProgram.is_aff_rule(items, itemcnt, "FORBIDDENWORD", 2)) && generatedAf_bad == 0) {
					aff.setAf_bad(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "NEEDAFFIX", 2) && generatedAf_needaffix == 0) {
					aff.setAf_needaffix(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "CIRCUMFIX", 2) && generatedAf_circumfix == 0) {
					aff.setAf_circumfix(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "NOSUGGEST", 2) && generatedAf_nosuggest == 0) {
					aff.setAf_nosuggest(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if ((ModernizedCProgram.is_aff_rule(items, itemcnt, "NEEDCOMPOUND", 2) || ModernizedCProgram.is_aff_rule(items, itemcnt, "ONLYINCOMPOUND", 2)) && generatedAf_needcomp == 0) {
					aff.setAf_needcomp(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDROOT", 2) && generatedAf_comproot == 0) {
					aff.setAf_comproot(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDFORBIDFLAG", 2) && generatedAf_compforbid == 0) {
					aff.setAf_compforbid(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
					if (generatedHt_used > 0) {
						ModernizedCProgram.smsg(((byte)("Defining COMPOUNDFORBIDFLAG after PFX item may give wrong results in %s line %d")), fname, lnum);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDPERMITFLAG", 2) && generatedAf_comppermit == 0) {
					aff.setAf_comppermit(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
					if (generatedHt_used > 0) {
						ModernizedCProgram.smsg(((byte)("Defining COMPOUNDPERMITFLAG after PFX item may give wrong results in %s line %d")), fname, lnum);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDFLAG", 2) && compflags == ((Object)0)) {
					p = spin.getroom(.strlen((byte)(items[1])) + 2, /* Turn flag "c" into COMPOUNDRULE compatible string "c+",
							 * "Na" into "Na+", "1234" into "1234+". */0);
					if (p != ((Object)0)) {
						.strcpy((byte)(p), (byte)(items[1]));
						.strcat((byte)(p), (byte)("+"));
						compflags = p;
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDRULES", 2)) {
					if (.atoi((byte)items[1]) == /* We don't use the count, but do check that it's a number and
							 * not COMPOUNDRULE mistyped. */0) {
						ModernizedCProgram.smsg(((byte)("Wrong COMPOUNDRULES value in %s line %d: %s")), fname, lnum, items[1]);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDRULE", 2)) {
					if (compflags != ((Object)0) || ModernizedCProgram.skipdigits(items[1]) != /* Don't use the first rule if it is a number. */(byte)'\000') {
						l = (int).strlen((byte)(items[1])) + /* Concatenate this string to previously defined ones,
								     * using a slash to separate them. */1;
						if (compflags != ((Object)0)) {
							l += (int).strlen((byte)(compflags)) + 1;
						} 
						p = spin.getroom(l, 0);
						if (p != ((Object)0)) {
							if (compflags != ((Object)0)) {
								.strcpy((byte)(p), (byte)(compflags));
								.strcat((byte)(p), (byte)("/"));
							} 
							.strcat((byte)(p), (byte)(items[1]));
							compflags = p;
						} 
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDWORDMAX", 2) && compmax == 0) {
					compmax = .atoi((byte)items[1]);
					if (compmax == 0) {
						ModernizedCProgram.smsg(((byte)("Wrong COMPOUNDWORDMAX value in %s line %d: %s")), fname, lnum, items[1]);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDMIN", 2) && compminlen == 0) {
					compminlen = .atoi((byte)items[1]);
					if (compminlen == 0) {
						ModernizedCProgram.smsg(((byte)("Wrong COMPOUNDMIN value in %s line %d: %s")), fname, lnum, items[1]);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "COMPOUNDSYLMAX", 2) && compsylmax == 0) {
					compsylmax = .atoi((byte)items[1]);
					if (compsylmax == 0) {
						ModernizedCProgram.smsg(((byte)("Wrong COMPOUNDSYLMAX value in %s line %d: %s")), fname, lnum, items[1]);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "CHECKCOMPOUNDDUP", 1)) {
					compoptions |=  1;
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "CHECKCOMPOUNDREP", 1)) {
					compoptions |=  2;
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "CHECKCOMPOUNDCASE", 1)) {
					compoptions |=  4;
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "CHECKCOMPOUNDTRIPLE", 1)) {
					compoptions |=  8;
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "CHECKCOMPOUNDPATTERN", 2)) {
					if (.atoi((byte)items[1]) == 0) {
						ModernizedCProgram.smsg(((byte)("Wrong CHECKCOMPOUNDPATTERN value in %s line %d: %s")), fname, lnum, items[1]);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "CHECKCOMPOUNDPATTERN", 3)) {
					garray_T gap = generatedSi_comppat;
					int i;
					for (i = 0; i < generatedGa_len - 1; i += /* Only add the couple if it isn't already there. */2) {
						if (.strcmp((byte)(((char_u)(generatedGa_data))[i]), (byte)(items[1])) == 0 && .strcmp((byte)(((char_u)(generatedGa_data))[i + 1]), (byte)(items[2])) == 0) {
							break;
						} 
					}
					if (i >= generatedGa_len && gap.ga_grow(2) == 1) {
						((char_u)(generatedGa_data))[generatedGa_len++] = spin.getroom_save(items[1]);
						((char_u)(generatedGa_data))[generatedGa_len++] = spin.getroom_save(items[2]);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "SYLLABLE", 2) && syllable == ((Object)0)) {
					syllable = spin.getroom_save(items[1]);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "NOBREAK", 1)) {
					spin.setSi_nobreak(1);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "NOSPLITSUGS", 1)) {
					spin.setSi_nosplitsugs(1);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "NOCOMPOUNDSUGS", 1)) {
					spin.setSi_nocompoundsugs(1);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "NOSUGFILE", 1)) {
					spin.setSi_nosugfile(1);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "PFXPOSTPONE", 1)) {
					aff.setAf_pfxpostpone(1);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "IGNOREEXTRA", 1)) {
					aff.setAf_ignoreextra(1);
				}  else if ((.strcmp((byte)(items[0]), (byte)("PFX")) == 0 || .strcmp((byte)(items[0]), (byte)("SFX")) == 0) && aff_todo == 0 && itemcnt >= 4) {
					int lasti = 4;
					char_u[] key = new char_u();
					if (items[0] == (byte)'P') {
						tp = generatedAf_pref;
					} else {
							tp = generatedAf_suff;
					} 
					ModernizedCProgram.vim_strncpy(key, items[1], 17 - 1);
					hi = hashitem_S.hash_find(tp, key);
					if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
						cur_aff = ((affheader_T)generatedHi_key);
						if (generatedAh_combine != (items[2] == (byte)'Y')) {
							ModernizedCProgram.smsg(((byte)("Different combining flag in continued affix block in %s line %d: %s")), fname, lnum, items[1]);
						} 
						if (!generatedAh_follows) {
							ModernizedCProgram.smsg(((byte)("Duplicate affix in %s line %d: %s")), fname, lnum, items[1]);
						} 
					} else {
							cur_aff = (affheader_T)/* New affix letter. */spin.getroom(, 1);
							if (cur_aff == ((Object)0)) {
								break;
							} 
							cur_aff.setAh_flag(ModernizedCProgram.affitem2flag(generatedAf_flagtype, items[1], fname, lnum));
							if (generatedAh_flag == 0 || .strlen((byte)(items[1])) >= 17) {
								break;
							} 
							if (generatedAh_flag == generatedAf_bad || generatedAh_flag == generatedAf_rare || generatedAh_flag == generatedAf_keepcase || generatedAh_flag == generatedAf_needaffix || generatedAh_flag == generatedAf_circumfix || generatedAh_flag == generatedAf_nosuggest || generatedAh_flag == generatedAf_needcomp || generatedAh_flag == generatedAf_comproot) {
								ModernizedCProgram.smsg(((byte)("Affix also used for BAD/RARE/KEEPCASE/NEEDAFFIX/NEEDCOMPOUND/NOSUGGEST in %s line %d: %s")), fname, lnum, items[1]);
							} 
							.strcpy((byte)(generatedAh_key), (byte)(items[1]));
							tp.hash_add(generatedAh_key);
							cur_aff.setAh_combine((items[2] == (byte)'Y'));
					} 
					if (itemcnt > lasti && .strcmp((byte)(items[lasti]), (byte)("S")) == /* Check for the "S" flag, which apparently means that another
							 * block with the same affix name is following. */0) {
						++lasti;
						cur_aff.setAh_follows(1);
					} else {
							cur_aff.setAh_follows(0);
					} 
					if (itemcnt > lasti && items[lasti] != /* Myspell allows extra text after the item, but that might
							 * mean mistakes go unnoticed.  Require a comment-starter. */(byte)'#') {
						ModernizedCProgram.smsg(((byte)(ModernizedCProgram.e_afftrailing)), fname, lnum, items[lasti]);
					} 
					if (.strcmp((byte)(items[2]), (byte)("Y")) != 0 && .strcmp((byte)(items[2]), (byte)("N")) != 0) {
						ModernizedCProgram.smsg(((byte)("Expected Y or N in %s line %d: %s")), fname, lnum, items[2]);
					} 
					if (items[0] == (byte)'P' && generatedAf_pfxpostpone) {
						if (generatedAh_newID == 0) {
							/* Use a new number in the .spl file later, to be able
										 * to handle multiple .aff files. */spin.check_renumber();
							cur_aff.setAh_newID(++generatedSi_newprefID);
							did_postpone_prefix = 0;
						} else {
								did_postpone_prefix = /* Did use the ID in a previous block. */1;
						} 
					} 
					aff_todo = .atoi((byte)items[3]);
				}  else if ((.strcmp((byte)(items[0]), (byte)("PFX")) == 0 || .strcmp((byte)(items[0]), (byte)("SFX")) == 0) && aff_todo > 0 && .strcmp((byte)(generatedAh_key), (byte)(items[1])) == 0 && itemcnt >= 5) {
					affentry_T aff_entry = new affentry_T();
					int upper = 0;
					int lasti = 5/* Myspell allows extra text after the item, but that might
							 * mean mistakes go unnoticed.  Require a comment-starter,
							 * unless IGNOREEXTRA is used.  Hunspell uses a "-" item. */;
					if (itemcnt > lasti && !generatedAf_ignoreextra && items[lasti] != (byte)'#' && (.strcmp((byte)(items[lasti]), (byte)("-")) != 0 || itemcnt != lasti + 1)) {
						ModernizedCProgram.smsg(((byte)(ModernizedCProgram.e_afftrailing)), fname, lnum, items[lasti]);
					} 
					--/* New item for an affix letter. */aff_todo;
					aff_entry = (affentry_T)spin.getroom(, 1);
					if (aff_entry == ((Object)0)) {
						break;
					} 
					if (.strcmp((byte)(items[2]), (byte)("0")) != 0) {
						aff_entry.setAe_chop(spin.getroom_save(items[2]));
					} 
					if (.strcmp((byte)(items[3]), (byte)("0")) != 0) {
						aff_entry.setAe_add(spin.getroom_save(items[3]));
						aff_entry.setAe_flags(ModernizedCProgram.vim_strchr(generatedAe_add, /* Recognize flags on the affix: abcd/XYZ */(byte)'/'));
						if (generatedAe_flags != ((Object)0)) {
							generatedAe_flags++ = (byte)'\000';
							ModernizedCProgram.aff_process_flags(aff, aff_entry);
						} 
					} 
					if (!generatedSi_ascii || !(ModernizedCProgram.has_non_ascii(generatedAe_chop) || ModernizedCProgram.has_non_ascii(generatedAe_add))) {
						aff_entry.setAe_next(generatedAh_first);
						cur_aff.setAh_first(aff_entry);
						if (.strcmp((byte)(items[4]), (byte)(".")) != 0) {
							char_u[] buf = new char_u();
							aff_entry.setAe_cond(spin.getroom_save(items[4]));
							if (items[0] == (byte)'P') {
								.sprintf((byte)buf, "^%s", items[4]);
							} else {
									.sprintf((byte)buf, "%s$", items[4]);
							} 
							aff_entry.setAe_prog(regprog.vim_regcomp(buf, 1 + 2 + 4));
							if (generatedAe_prog == ((Object)0)) {
								ModernizedCProgram.smsg(((byte)("Broken condition in %s line %d: %s")), fname, lnum, items[4/* For postponed prefixes we need an entry in si_prefcond
										     * for the condition.  Use an existing one if possible.
										     * Can't be done for an affix with flags, ignoring
										     * COMPOUNDFORBIDFLAG and COMPOUNDPERMITFLAG. */]);
							} 
						} 
						if (items[0] == (byte)'P' && generatedAf_pfxpostpone && generatedAe_flags == ((Object)0/* When the chop string is one lower-case letter and
									 * the add string ends in the upper-case letter we set
									 * the "upper" flag, clear "ae_chop" and remove the
									 * letters from "ae_add".  The condition must either
									 * be empty or start with the same letter. */)) {
							if (generatedAe_chop != ((Object)0) && generatedAe_add != ((Object)0) && generatedAe_chop[.UNRECOGNIZEDFUNCTIONNAME(generatedAe_chop)] == (byte)'\000') {
								int c;
								int c_up;
								c = (has_mbyte ? .mb_ptr2char(generatedAe_chop) : (int)(generatedAe_chop));
								c_up = (enc_utf8 && (c) >= 128 ? ModernizedCProgram.utf_toupper(c) : (c) < 256 ? (int)generatedSt_upper[c] : (c));
								if (c_up != c && (generatedAe_cond == ((Object)0) || (has_mbyte ? .mb_ptr2char(generatedAe_cond) : (int)(generatedAe_cond)) == c)) {
									p = generatedAe_add + .strlen((byte)(generatedAe_add));
									p -= has_mbyte ? (.UNRECOGNIZEDFUNCTIONNAME(generatedAe_add, p - 1) + 1) : 1;
									if ((has_mbyte ? .mb_ptr2char(p) : (int)(p)) == c_up) {
										upper = 1;
										aff_entry.setAe_chop(((Object)0));
										p = (byte)'\000'/* The condition is matched with the
														     * actual word, thus must check for the
														     * upper-case letter. */;
										if (generatedAe_cond != ((Object)0)) {
											char_u[] buf = new char_u();
											if (has_mbyte) {
												ModernizedCProgram.onecap_copy(items[4], buf, 1);
												aff_entry.setAe_cond(spin.getroom_save(buf));
											} else {
													generatedAe_cond = c_up;
											} 
											if (generatedAe_cond != ((Object)0)) {
												.sprintf((byte)buf, "^%s", generatedAe_cond);
												generatedAe_prog.vim_regfree();
												aff_entry.setAe_prog(regprog.vim_regcomp(buf, 1 + 2));
											} 
										} 
									} 
								} 
							} 
							if (generatedAe_chop == ((Object)0) && generatedAe_flags == ((Object)0)) {
								int idx;
								char_u pp = new char_u();
								int n;
								for (idx = generatedGa_len - 1; idx >= /* Find a previously used condition. */0; --idx) {
									p = ((char_u)generatedGa_data)[idx];
									if (ModernizedCProgram.str_equal(p, generatedAe_cond)) {
										break;
									} 
								}
								if (idx < 0 && generatedSi_prefcond.ga_grow(1) == 1) {
									idx = generatedGa_len++;
									pp = ((char_u)generatedGa_data) + idx;
									if (generatedAe_cond == ((Object)0)) {
										pp = ((Object)0);
									} else {
											pp = spin.getroom_save(generatedAe_cond);
									} 
								} 
								if (generatedAe_add == ((Object)/* Add the prefix to the prefix tree. */0)) {
									p = (char_u)"";
								} else {
										p = generatedAe_add;
								} 
								n = -/* PFX_FLAGS is a negative number, so that
											     * tree_add_word() knows this is the prefix tree. */256;
								if (!generatedAh_combine) {
									n |=  -1024;
								} 
								if (upper) {
									n |=  -1024;
								} 
								if (generatedAe_comppermit) {
									n |=  -1024;
								} 
								if (generatedAe_compforbid) {
									n |=  -1024;
								} 
								ModernizedCProgram.tree_add_word(spin, p, generatedSi_prefroot, n, idx, generatedAh_newID);
								did_postpone_prefix = 1;
							} 
							if (aff_todo == 0 && !/* Didn't actually use ah_newID, backup si_newprefID. */did_postpone_prefix) {
								--generatedSi_newprefID;
								cur_aff.setAh_newID(0);
							} 
						} 
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "FOL", 2) && fol == ((Object)0)) {
					fol = ModernizedCProgram.vim_strsave(items[1]);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "LOW", 2) && low == ((Object)0)) {
					low = ModernizedCProgram.vim_strsave(items[1]);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "UPP", 2) && upp == ((Object)0)) {
					upp = ModernizedCProgram.vim_strsave(items[1]);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "REP", 2) || ModernizedCProgram.is_aff_rule(items, itemcnt, "REPSAL", 2)) {
					;
					if (!.isdigit(items[1])) {
						ModernizedCProgram.smsg(((byte)("Expected REP(SAL) count in %s line %d")), fname, lnum);
					} 
				}  else if ((.strcmp((byte)(items[0]), (byte)("REP")) == 0 || .strcmp((byte)(items[0]), (byte)("REPSAL")) == 0) && itemcnt >= 3/* REP/REPSAL item */) {
					if (itemcnt > 3 && items[3][0] != /* Myspell ignores extra arguments, we require it starts with
							 * # to detect mistakes. */(byte)'#') {
						ModernizedCProgram.smsg(((byte)(ModernizedCProgram.e_afftrailing)), fname, lnum, items[3]);
					} 
					if (items[0][3] == (byte)'S' ? do_repsal : do_rep) {
						for (p = items[1]; p != (byte)'\000'; p += .UNRECOGNIZEDFUNCTIONNAME(/* Replace underscore with space (can't include a space
								     * directly). */p)) {
							if (p == (byte)'_') {
								p = (byte)' ';
							} 
						}
						for (p = items[2]; p != (byte)'\000'; p += .UNRECOGNIZEDFUNCTIONNAME(p)) {
							if (p == (byte)'_') {
								p = (byte)' ';
							} 
						}
						ModernizedCProgram.add_fromto(spin, items[0][3] == (byte)'S' ? generatedSi_repsal : generatedSi_rep, items[1], items[2]);
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "MAP", 2)) {
					if (!/* MAP item or count */found_map) {
						found_map = /* First line contains the count. */1;
						if (!.isdigit(items[1])) {
							ModernizedCProgram.smsg(((byte)("Expected MAP count in %s line %d")), fname, lnum);
						} 
					}  else if (do_mapline) {
						int c;
						for (p = items[1]; p != /* Check that every character appears only once. */(byte)'\000'; ) {
							c = ModernizedCProgram.mb_ptr2char_adv(p);
							if ((generatedGa_len > 0 && ModernizedCProgram.vim_strchr(generatedGa_data, c) != ((Object)0)) || ModernizedCProgram.vim_strchr(p, c) != ((Object)0)) {
								ModernizedCProgram.smsg(((byte)("Duplicate character in MAP in %s line %d")), fname, lnum);
							} 
						}
						generatedSi_map.ga_concat(items[/* We simply concatenate all the MAP strings, separated by
								     * slashes. */1]);
						generatedSi_map.ga_append((byte)'/');
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "SAL", /* Accept "SAL from to" and "SAL from to  #comment". */3)) {
					if (do_sal) {
						if (.strcmp((byte)(items[1]), (byte)("followup")) == /* SAL item (sounds-a-like)
								     * Either one of the known keys or a from-to pair. */0) {
							spin.setSi_followup(ModernizedCProgram.sal_to_bool(items[2]));
						}  else if (.strcmp((byte)(items[1]), (byte)("collapse_result")) == 0) {
							spin.setSi_collapse(ModernizedCProgram.sal_to_bool(items[2]));
						}  else if (.strcmp((byte)(items[1]), (byte)("remove_accents")) == 0) {
							spin.setSi_rem_accents(ModernizedCProgram.sal_to_bool(items[2]));
						} else {
								ModernizedCProgram.add_fromto(spin, generatedSi_sal, items[/* when "to" is "_" it means empty */1], .strcmp((byte)(items[2]), (byte)("_")) == 0 ? (char_u)"" : items[2]);
						} 
					} 
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "SOFOFROM", 2) && sofofrom == ((Object)0)) {
					sofofrom = spin.getroom_save(items[1]);
				}  else if (ModernizedCProgram.is_aff_rule(items, itemcnt, "SOFOTO", 2) && sofoto == ((Object)0)) {
					sofoto = spin.getroom_save(items[1]);
				}  else if (.strcmp((byte)(items[0]), (byte)("COMMON")) == 0) {
					int i;
					for (i = 1; i < itemcnt; ++i) {
						if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
							p = ModernizedCProgram.vim_strsave(items[i]);
							if (p == ((Object)0)) {
								break;
							} 
							generatedSi_commonwords.hash_add(p);
						} 
					}
				} else {
						ModernizedCProgram.smsg(((byte)("Unrecognized or duplicate item in %s line %d: %s")), fname, lnum, items[0]);
				} 
			} 
		}
		int generatedSi_clear_chartab = spin.getSi_clear_chartab();
		if (fol != ((Object)0) || low != ((Object)0) || upp != ((Object)0)) {
			if (generatedSi_clear_chartab) {
				ModernizedCProgram.init_spell_chartab();
				spin.setSi_clear_chartab(0/*
					 * Don't write a word table for an ASCII file, so that we don't check
					 * for conflicts with a word table that matches 'encoding'.
					 * Don't write one for utf-8 either, we use utf_*() and
					 * mb_get_class(), the list of chars in the file will be incomplete.
					 */);
			} 
			if (!generatedSi_ascii && !enc_utf8) {
				if (fol == ((Object)0) || low == ((Object)0) || upp == ((Object)0)) {
					ModernizedCProgram.smsg(((byte)("Missing FOL/LOW/UPP line in %s")), fname);
				} else {
						(Object)ModernizedCProgram.set_spell_chartab(fol, low, upp);
				} 
			} 
			ModernizedCProgram.vim_free(fol);
			ModernizedCProgram.vim_free(low);
			ModernizedCProgram.vim_free(upp);
		} 
		int generatedSi_compmax = spin.getSi_compmax();
		if (compmax != /* Use compound specifications of the .aff file for the spell info. */0) {
			ModernizedCProgram.aff_check_number(generatedSi_compmax, compmax, "COMPOUNDWORDMAX");
			spin.setSi_compmax(compmax);
		} 
		int generatedSi_compminlen = spin.getSi_compminlen();
		if (compminlen != 0) {
			ModernizedCProgram.aff_check_number(generatedSi_compminlen, compminlen, "COMPOUNDMIN");
			spin.setSi_compminlen(compminlen);
		} 
		int generatedSi_compsylmax = spin.getSi_compsylmax();
		if (compsylmax != 0) {
			if (syllable == ((Object)0)) {
				ModernizedCProgram.smsg(((byte)("COMPOUNDSYLMAX used without SYLLABLE")));
			} 
			ModernizedCProgram.aff_check_number(generatedSi_compsylmax, compsylmax, "COMPOUNDSYLMAX");
			spin.setSi_compsylmax(compsylmax);
		} 
		int generatedSi_compoptions = spin.getSi_compoptions();
		if (compoptions != 0) {
			ModernizedCProgram.aff_check_number(generatedSi_compoptions, compoptions, "COMPOUND options");
			generatedSi_compoptions |=  compoptions;
		} 
		if (compflags != ((Object)0)) {
			ModernizedCProgram.process_compflags(spin, aff, compflags);
		} 
		int generatedSi_newcompID = spin.getSi_newcompID();
		if (generatedSi_newcompID < generatedSi_newprefID) {
			if (generatedSi_newcompID == 127 || generatedSi_newcompID == 255) {
				ModernizedCProgram.msg(((byte)("Too many postponed prefixes")));
			}  else if (generatedSi_newprefID == 0 || generatedSi_newprefID == 127) {
				ModernizedCProgram.msg(((byte)("Too many compound flags")));
			} else {
					ModernizedCProgram.msg(((byte)("Too many postponed prefixes and/or compound flags")));
			} 
		} 
		Object generatedSi_syllable = spin.getSi_syllable();
		if (syllable != ((Object)0)) {
			ModernizedCProgram.aff_check_string(generatedSi_syllable, syllable, "SYLLABLE");
			spin.setSi_syllable(syllable);
		} 
		Object generatedSi_sofofr = spin.getSi_sofofr();
		Object generatedSi_sofoto = spin.getSi_sofoto();
		if (sofofrom != ((Object)0) || sofoto != ((Object)0)) {
			if (sofofrom == ((Object)0) || sofoto == ((Object)0)) {
				ModernizedCProgram.smsg(((byte)("Missing SOFO%s line in %s")), sofofrom == ((Object)0) ? "FROM" : "TO", fname);
			}  else if (generatedGa_len > 0) {
				ModernizedCProgram.smsg(((byte)("Both SAL and SOFO lines in %s")), fname);
			} else {
					ModernizedCProgram.aff_check_string(generatedSi_sofofr, sofofrom, "SOFOFROM");
					ModernizedCProgram.aff_check_string(generatedSi_sofoto, sofoto, "SOFOTO");
					spin.setSi_sofofr(sofofrom);
					spin.setSi_sofoto(sofoto);
			} 
		} 
		Object generatedSi_midword = spin.getSi_midword();
		if (midword != ((Object)0)) {
			ModernizedCProgram.aff_check_string(generatedSi_midword, midword, "MIDWORD");
			spin.setSi_midword(midword);
		} 
		ModernizedCProgram.vim_free(pc);
		.fclose(fd);
		return aff/*
		 * Return TRUE when items[0] equals "rulename", there are "mincount" items or
		 * a comment is following after item "mincount".
		 */;
	}
	public void spell_free_aff() {
		hashtab_T ht = new hashtab_T();
		hashitem_T hi = new hashitem_T();
		int todo;
		affheader_T ah = new affheader_T();
		affentry_T ae = new affentry_T();
		Object generatedAf_enc = this.getAf_enc();
		ModernizedCProgram.vim_free(generatedAf_enc);
		Object generatedHt_used = ht.getHt_used();
		Object generatedHi_key = (hi).getHi_key();
		regprog generatedAe_prog = ae.getAe_prog();
		affentry_S generatedAe_next = ae.getAe_next();
		affentry_S generatedAh_first = ah.getAh_first();
		hashitem_S generatedHt_array = ht.getHt_array();
		hashtable_S generatedAf_suff = this.getAf_suff();
		hashtable_S generatedAf_pref = this.getAf_pref();
		for (ht = generatedAf_pref; ; ht = generatedAf_suff) {
			todo = (int)generatedHt_used;
			for (hi = generatedHt_array; todo > 0; ++hi) {
				if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
					--todo;
					ah = ((affheader_T)generatedHi_key);
					for (ae = generatedAh_first; ae != ((Object)0); ae = generatedAe_next) {
						generatedAe_prog.vim_regfree();
					}
				} 
			}
			if (ht == generatedAf_suff) {
				break;
			} 
		}
		generatedAf_pref.hash_clear();
		generatedAf_suff.hash_clear();
		hashtable_S generatedAf_comp = this.getAf_comp();
		generatedAf_comp.hash_clear();
	}
	public int get_affix_flags(Object afflist) {
		int flags = 0;
		int generatedAf_keepcase = this.getAf_keepcase();
		int generatedAf_flagtype = this.getAf_flagtype();
		if (generatedAf_keepcase != 0 && ModernizedCProgram.flag_in_afflist(generatedAf_flagtype, afflist, generatedAf_keepcase)) {
			flags |=  -1024 | -1024;
		} 
		int generatedAf_rare = this.getAf_rare();
		if (generatedAf_rare != 0 && ModernizedCProgram.flag_in_afflist(generatedAf_flagtype, afflist, generatedAf_rare)) {
			flags |=  -1024;
		} 
		int generatedAf_bad = this.getAf_bad();
		if (generatedAf_bad != 0 && ModernizedCProgram.flag_in_afflist(generatedAf_flagtype, afflist, generatedAf_bad)) {
			flags |=  -1024;
		} 
		int generatedAf_needcomp = this.getAf_needcomp();
		if (generatedAf_needcomp != 0 && ModernizedCProgram.flag_in_afflist(generatedAf_flagtype, afflist, generatedAf_needcomp)) {
			flags |=  -1024;
		} 
		int generatedAf_comproot = this.getAf_comproot();
		if (generatedAf_comproot != 0 && ModernizedCProgram.flag_in_afflist(generatedAf_flagtype, afflist, generatedAf_comproot)) {
			flags |=  -1024;
		} 
		int generatedAf_nosuggest = this.getAf_nosuggest();
		if (generatedAf_nosuggest != 0 && ModernizedCProgram.flag_in_afflist(generatedAf_flagtype, afflist, generatedAf_nosuggest)) {
			flags |=  -1024;
		} 
		return flags/*
		 * Get the list of prefix IDs from the affix list "afflist".
		 * Used for PFXPOSTPONE.
		 * Put the resulting flags in "store_afflist[MAXWLEN]" with a terminating NUL
		 * and return the number of affixes.
		 */;
	}
	public int get_pfxlist(Object afflist, Object store_afflist) {
		char_u p = new char_u();
		char_u prevp = new char_u();
		int cnt = 0;
		int id;
		char_u[] key = new char_u();
		hashitem_T hi = new hashitem_T();
		int generatedAf_flagtype = this.getAf_flagtype();
		hashtable_S generatedAf_pref = this.getAf_pref();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		for (p = afflist; p != (byte)'\000'; ) {
			prevp = p;
			if (ModernizedCProgram.get_affitem(generatedAf_flagtype, p) != 0) {
				ModernizedCProgram.vim_strncpy(key, prevp, p - /* A flag is a postponed prefix flag if it appears in "af_pref"
					     * and its ID is not zero. */prevp);
				hi = hashitem_S.hash_find(generatedAf_pref, key);
				if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
					id = ((affheader_T)generatedHi_key).getAh_newID();
					if (id != 0) {
						store_afflist[cnt++] = id;
					} 
				} 
			} 
			if (generatedAf_flagtype == 3 && p == (byte)',') {
				++p;
			} 
		}
		store_afflist[cnt] = (byte)'\000';
		return cnt/*
		 * Get the list of compound IDs from the affix list "afflist" that are used
		 * for compound words.
		 * Puts the flags in "store_afflist[]".
		 */;
	}
	public void get_compflags(Object afflist, Object store_afflist) {
		char_u p = new char_u();
		char_u prevp = new char_u();
		int cnt = 0;
		char_u[] key = new char_u();
		hashitem_T hi = new hashitem_T();
		int generatedAf_flagtype = this.getAf_flagtype();
		hashtable_S generatedAf_comp = this.getAf_comp();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		for (p = afflist; p != (byte)'\000'; ) {
			prevp = p;
			if (ModernizedCProgram.get_affitem(generatedAf_flagtype, p) != 0) {
				ModernizedCProgram.vim_strncpy(key, prevp, p - /* A flag is a compound flag if it appears in "af_comp". */prevp);
				hi = hashitem_S.hash_find(generatedAf_comp, key);
				if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
					store_afflist[cnt++] = ((compitem_T)generatedHi_key).getCi_newID();
				} 
			} 
			if (generatedAf_flagtype == 3 && p == (byte)',') {
				++p;
			} 
		}
		store_afflist[cnt] = (byte)'\000'/*
		 * Apply affixes to a word and store the resulting words.
		 * "ht" is the hashtable with affentry_T that need to be applied, either
		 * prefixes or suffixes.
		 * "xht", when not NULL, is the prefix hashtable, to be used additionally on
		 * the resulting words for combining affixes.
		 *
		 * Returns FAIL when out of memory.
		 */;
	}
	public Object getAf_enc() {
		return af_enc;
	}
	public void setAf_enc(Object newAf_enc) {
		af_enc = newAf_enc;
	}
	public int getAf_flagtype() {
		return af_flagtype;
	}
	public void setAf_flagtype(int newAf_flagtype) {
		af_flagtype = newAf_flagtype;
	}
	public int getAf_rare() {
		return af_rare;
	}
	public void setAf_rare(int newAf_rare) {
		af_rare = newAf_rare;
	}
	public int getAf_keepcase() {
		return af_keepcase;
	}
	public void setAf_keepcase(int newAf_keepcase) {
		af_keepcase = newAf_keepcase;
	}
	public int getAf_bad() {
		return af_bad;
	}
	public void setAf_bad(int newAf_bad) {
		af_bad = newAf_bad;
	}
	public int getAf_needaffix() {
		return af_needaffix;
	}
	public void setAf_needaffix(int newAf_needaffix) {
		af_needaffix = newAf_needaffix;
	}
	public int getAf_circumfix() {
		return af_circumfix;
	}
	public void setAf_circumfix(int newAf_circumfix) {
		af_circumfix = newAf_circumfix;
	}
	public int getAf_needcomp() {
		return af_needcomp;
	}
	public void setAf_needcomp(int newAf_needcomp) {
		af_needcomp = newAf_needcomp;
	}
	public int getAf_comproot() {
		return af_comproot;
	}
	public void setAf_comproot(int newAf_comproot) {
		af_comproot = newAf_comproot;
	}
	public int getAf_compforbid() {
		return af_compforbid;
	}
	public void setAf_compforbid(int newAf_compforbid) {
		af_compforbid = newAf_compforbid;
	}
	public int getAf_comppermit() {
		return af_comppermit;
	}
	public void setAf_comppermit(int newAf_comppermit) {
		af_comppermit = newAf_comppermit;
	}
	public int getAf_nosuggest() {
		return af_nosuggest;
	}
	public void setAf_nosuggest(int newAf_nosuggest) {
		af_nosuggest = newAf_nosuggest;
	}
	public int getAf_pfxpostpone() {
		return af_pfxpostpone;
	}
	public void setAf_pfxpostpone(int newAf_pfxpostpone) {
		af_pfxpostpone = newAf_pfxpostpone;
	}
	public int getAf_ignoreextra() {
		return af_ignoreextra;
	}
	public void setAf_ignoreextra(int newAf_ignoreextra) {
		af_ignoreextra = newAf_ignoreextra;
	}
	public hashtable_S getAf_pref() {
		return af_pref;
	}
	public void setAf_pref(hashtable_S newAf_pref) {
		af_pref = newAf_pref;
	}
	public hashtable_S getAf_suff() {
		return af_suff;
	}
	public void setAf_suff(hashtable_S newAf_suff) {
		af_suff = newAf_suff;
	}
	public hashtable_S getAf_comp() {
		return af_comp;
	}
	public void setAf_comp(hashtable_S newAf_comp) {
		af_comp = newAf_comp;
	}
}
