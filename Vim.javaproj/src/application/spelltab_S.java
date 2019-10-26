package application;

/*
 * The tables used for recognizing word characters according to spelling.
 * These are only used for the first 256 characters of 'encoding'.
 */
public class spelltab_S {
	private Object st_isw;
	private Object st_isu;
	private Object st_fold;
	private Object st_upper;
	
	public spelltab_S(Object st_isw, Object st_isu, Object st_fold, Object st_upper) {
		setSt_isw(st_isw);
		setSt_isu(st_isu);
		setSt_fold(st_fold);
		setSt_upper(st_upper);
	}
	public spelltab_S() {
	}
	
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/*
	 * spellfile.c: code for reading and writing spell files.
	 *
	 * See spell.c for information about spell checking.
	 */
	/*
	 * Vim spell file format: <HEADER>
	 *			  <SECTIONS>
	 *			  <LWORDTREE>
	 *			  <KWORDTREE>
	 *			  <PREFIXTREE>
	 *
	 * <HEADER>: <fileID> <versionnr>
	 *
	 * <fileID>     8 bytes    "VIMspell"
	 * <versionnr>  1 byte	    VIMSPELLVERSION
	 *
	 *
	 * Sections make it possible to add information to the .spl file without
	 * making it incompatible with previous versions.  There are two kinds of
	 * sections:
	 * 1. Not essential for correct spell checking.  E.g. for making suggestions.
	 *    These are skipped when not supported.
	 * 2. Optional information, but essential for spell checking when present.
	 *    E.g. conditions for affixes.  When this section is present but not
	 *    supported an error message is given.
	 *
	 * <SECTIONS>: <section> ... <sectionend>
	 *
	 * <section>: <sectionID> <sectionflags> <sectionlen> (section contents)
	 *
	 * <sectionID>	  1 byte    number from 0 to 254 identifying the section
	 *
	 * <sectionflags> 1 byte    SNF_REQUIRED: this section is required for correct
	 *					    spell checking
	 *
	 * <sectionlen>   4 bytes   length of section contents, MSB first
	 *
	 * <sectionend>	  1 byte    SN_END
	 *
	 *
	 * sectionID == SN_INFO: <infotext>
	 * <infotext>	 N bytes    free format text with spell file info (version,
	 *			    website, etc)
	 *
	 * sectionID == SN_REGION: <regionname> ...
	 * <regionname>	 2 bytes    Up to MAXREGIONS region names: ca, au, etc.  Lower
	 *			    case.  First <regionname> is region 1.
	 *
	 * sectionID == SN_CHARFLAGS: <charflagslen> <charflags>
	 *				<folcharslen> <folchars>
	 * <charflagslen> 1 byte    Number of bytes in <charflags> (should be 128).
	 * <charflags>  N bytes     List of flags (first one is for character 128):
	 *			    0x01  word character	CF_WORD
	 *			    0x02  upper-case character	CF_UPPER
	 * <folcharslen>  2 bytes   Number of bytes in <folchars>.
	 * <folchars>     N bytes   Folded characters, first one is for character 128.
	 *
	 * sectionID == SN_MIDWORD: <midword>
	 * <midword>     N bytes    Characters that are word characters only when used
	 *			    in the middle of a word.
	 *
	 * sectionID == SN_PREFCOND: <prefcondcnt> <prefcond> ...
	 * <prefcondcnt> 2 bytes    Number of <prefcond> items following.
	 * <prefcond> : <condlen> <condstr>
	 * <condlen>	1 byte	    Length of <condstr>.
	 * <condstr>	N bytes	    Condition for the prefix.
	 *
	 * sectionID == SN_REP: <repcount> <rep> ...
	 * <repcount>	 2 bytes    number of <rep> items, MSB first.
	 * <rep> : <repfromlen> <repfrom> <reptolen> <repto>
	 * <repfromlen>	 1 byte	    length of <repfrom>
	 * <repfrom>	 N bytes    "from" part of replacement
	 * <reptolen>	 1 byte	    length of <repto>
	 * <repto>	 N bytes    "to" part of replacement
	 *
	 * sectionID == SN_REPSAL: <repcount> <rep> ...
	 *   just like SN_REP but for soundfolded words
	 *
	 * sectionID == SN_SAL: <salflags> <salcount> <sal> ...
	 * <salflags>	 1 byte	    flags for soundsalike conversion:
	 *			    SAL_F0LLOWUP
	 *			    SAL_COLLAPSE
	 *			    SAL_REM_ACCENTS
	 * <salcount>    2 bytes    number of <sal> items following
	 * <sal> : <salfromlen> <salfrom> <saltolen> <salto>
	 * <salfromlen>	 1 byte	    length of <salfrom>
	 * <salfrom>	 N bytes    "from" part of soundsalike
	 * <saltolen>	 1 byte	    length of <salto>
	 * <salto>	 N bytes    "to" part of soundsalike
	 *
	 * sectionID == SN_SOFO: <sofofromlen> <sofofrom> <sofotolen> <sofoto>
	 * <sofofromlen> 2 bytes    length of <sofofrom>
	 * <sofofrom>	 N bytes    "from" part of soundfold
	 * <sofotolen>	 2 bytes    length of <sofoto>
	 * <sofoto>	 N bytes    "to" part of soundfold
	 *
	 * sectionID == SN_SUGFILE: <timestamp>
	 * <timestamp>   8 bytes    time in seconds that must match with .sug file
	 *
	 * sectionID == SN_NOSPLITSUGS: nothing
		 *
	 * sectionID == SN_NOCOMPOUNDSUGS: nothing
	 *
	 * sectionID == SN_WORDS: <word> ...
	 * <word>	 N bytes    NUL terminated common word
	 *
	 * sectionID == SN_MAP: <mapstr>
	 * <mapstr>	 N bytes    String with sequences of similar characters,
	 *			    separated by slashes.
	 *
	 * sectionID == SN_COMPOUND: <compmax> <compminlen> <compsylmax> <compoptions>
	 *				<comppatcount> <comppattern> ... <compflags>
	 * <compmax>     1 byte	    Maximum nr of words in compound word.
	 * <compminlen>  1 byte	    Minimal word length for compounding.
	 * <compsylmax>  1 byte	    Maximum nr of syllables in compound word.
	 * <compoptions> 2 bytes    COMP_ flags.
	 * <comppatcount> 2 bytes   number of <comppattern> following
	 * <compflags>   N bytes    Flags from COMPOUNDRULE items, separated by
	 *			    slashes.
	 *
	 * <comppattern>: <comppatlen> <comppattext>
	 * <comppatlen>	 1 byte	    length of <comppattext>
	 * <comppattext> N bytes    end or begin chars from CHECKCOMPOUNDPATTERN
	 *
	 * sectionID == SN_NOBREAK: (empty, its presence is what matters)
	 *
	 * sectionID == SN_SYLLABLE: <syllable>
	 * <syllable>    N bytes    String from SYLLABLE item.
	 *
	 * <LWORDTREE>: <wordtree>
	 *
	 * <KWORDTREE>: <wordtree>
	 *
	 * <PREFIXTREE>: <wordtree>
	 *
	 *
	 * <wordtree>: <nodecount> <nodedata> ...
	 *
	 * <nodecount>	4 bytes	    Number of nodes following.  MSB first.
	 *
	 * <nodedata>: <siblingcount> <sibling> ...
	 *
	 * <siblingcount> 1 byte    Number of siblings in this node.  The siblings
	 *			    follow in sorted order.
	 *
	 * <sibling>: <byte> [ <nodeidx> <xbyte>
	 *		      | <flags> [<flags2>] [<region>] [<affixID>]
	 *		      | [<pflags>] <affixID> <prefcondnr> ]
	 *
	 * <byte>	1 byte	    Byte value of the sibling.  Special cases:
	 *			    BY_NOFLAGS: End of word without flags and for all
	 *					regions.
	 *					For PREFIXTREE <affixID> and
	 *					<prefcondnr> follow.
	 *			    BY_FLAGS:   End of word, <flags> follow.
	 *					For PREFIXTREE <pflags>, <affixID>
	 *					and <prefcondnr> follow.
	 *			    BY_FLAGS2:  End of word, <flags> and <flags2>
	 *					follow.  Not used in PREFIXTREE.
	 *			    BY_INDEX:   Child of sibling is shared, <nodeidx>
	 *					and <xbyte> follow.
	 *
	 * <nodeidx>	3 bytes	    Index of child for this sibling, MSB first.
	 *
	 * <xbyte>	1 byte	    byte value of the sibling.
	 *
	 * <flags>	1 byte	    bitmask of:
	 *			    WF_ALLCAP	word must have only capitals
	 *			    WF_ONECAP   first char of word must be capital
	 *			    WF_KEEPCAP	keep-case word
	 *			    WF_FIXCAP   keep-case word, all caps not allowed
	 *			    WF_RARE	rare word
	 *			    WF_BANNED	bad word
	 *			    WF_REGION	<region> follows
	 *			    WF_AFX	<affixID> follows
	 *
	 * <flags2>	1 byte	    Bitmask of:
	 *			    WF_HAS_AFF >> 8   word includes affix
	 *			    WF_NEEDCOMP >> 8  word only valid in compound
	 *			    WF_NOSUGGEST >> 8  word not used for suggestions
	 *			    WF_COMPROOT >> 8  word already a compound
	 *			    WF_NOCOMPBEF >> 8 no compounding before this word
	 *			    WF_NOCOMPAFT >> 8 no compounding after this word
	 *
	 * <pflags>	1 byte	    bitmask of:
	 *			    WFP_RARE	rare prefix
	 *			    WFP_NC	non-combining prefix
	 *			    WFP_UP	letter after prefix made upper case
	 *
	 * <region>	1 byte	    Bitmask for regions in which word is valid.  When
	 *			    omitted it's valid in all regions.
	 *			    Lowest bit is for region 1.
	 *
	 * <affixID>	1 byte	    ID of affix that can be used with this word.  In
	 *			    PREFIXTREE used for the required prefix ID.
	 *
	 * <prefcondnr>	2 bytes	    Prefix condition number, index in <prefcond> list
	 *			    from HEADER.
	 *
	 * All text characters are in 'encoding', but stored as single bytes.
	 */
	/*
	 * Vim .sug file format:  <SUGHEADER>
	 *			  <SUGWORDTREE>
	 *			  <SUGTABLE>
	 *
	 * <SUGHEADER>: <fileID> <versionnr> <timestamp>
	 *
	 * <fileID>     6 bytes     "VIMsug"
	 * <versionnr>  1 byte      VIMSUGVERSION
	 * <timestamp>  8 bytes     timestamp that must match with .spl file
	 *
	 *
	 * <SUGWORDTREE>: <wordtree>  (see above, no flags or region used)
	 *
	 *
	 * <SUGTABLE>: <sugwcount> <sugline> ...
	 *
	 * <sugwcount>	4 bytes	    number of <sugline> following
	 *
	 * <sugline>: <sugnr> ... NUL
	 *
	 * <sugnr>:     X bytes     word number that results in this soundfolded word,
	 *			    stored as an offset to the previous number in as
	 *			    few bytes as possible, see offset2bytes())
	 */
	/* it's in os_unix.h for Unix */
	/* for time_t */
	/* for time_t */
	/* it's in os_unix.h for Unix */
	/* for time_t */
	/* for time_t */
	/* Special byte values for <byte>.  Some are only used in the tree for
	 * postponed prefixes, some only in the other trees.  This is a bit messy... */
	/* end of word without flags or region; for
					 * postponed prefix: no <pflags> */
	/* child is shared, index follows */
	/* end of word, <flags> byte follows; for
					 * postponed prefix: <pflags> follows */
	/* end of word, <flags> and <flags2> bytes
					 * follow; never used in prefix tree */
	/* highest special byte value */
	/* Flags used in .spl file for soundsalike flags. */
	/* string at start of Vim spell file */
	/* Section IDs.  Only renumber them when VIMSPELLVERSION changes! */
	/* <regionname> section */
	/* charflags section */
	/* <midword> section */
	/* <prefcond> section */
	/* REP items section */
	/* SAL items section */
	/* soundfolding section */
	/* MAP items section */
	/* compound words section */
	/* syllable section */
	/* NOBREAK section */
	/* timestamp for .sug file */
	/* REPSAL items section */
	/* common words */
	/* don't split word for suggestions */
	/* info section */
	/* don't compound for suggestions */
	/* end of sections */
	/* <sectionflags>: required section */
	public int set_spell_finish() {
		int i;
		Object generatedSt_isw = spelltab.getSt_isw();
		Object generatedSt_isu = spelltab.getSt_isu();
		Object generatedSt_fold = spelltab.getSt_fold();
		Object generatedSt_upper = spelltab.getSt_upper();
		if (did_set_spelltab) {
			for (i = 0; i < 256; ++/* check that it's the same table */i) {
				if (generatedSt_isw[i] != generatedSt_isw[i] || generatedSt_isu[i] != generatedSt_isu[i] || generatedSt_fold[i] != generatedSt_fold[i] || generatedSt_upper[i] != generatedSt_upper[i]) {
					ModernizedCProgram.emsg(((byte)("E763: Word characters differ between spell files")));
					return 0;
				} 
			}
		} else {
				spelltab = /* copy the new spelltab into the one being used */new_st;
				did_set_spelltab = 1;
		} 
		return 1/*
		 * Write the table with prefix conditions to the .spl file.
		 * When "fd" is NULL only count the length of what is written.
		 */;
	}
	public void clear_spell_chartab() {
		int i;
		.memset((ModernizedCProgram.sp.getSt_isw()), (false), ());
		.memset((ModernizedCProgram.sp.getSt_isu()), (false), ());
		for (i = 0; i < 256; ++i) {
			ModernizedCProgram.sp.getSt_fold()[i] = i;
			ModernizedCProgram.sp.getSt_upper()[i] = i;
		}
		for (i = (byte)'0'; i <= (byte)'9'; ++/* We include digits.  A word shouldn't start with a digit, but handling
		     * that is done separately. */i) {
			ModernizedCProgram.sp.getSt_isw()[i] = 1;
		}
		for (i = (byte)'A'; i <= (byte)'Z'; ++i) {
			ModernizedCProgram.sp.getSt_isw()[i] = 1;
			ModernizedCProgram.sp.getSt_isu()[i] = 1;
			ModernizedCProgram.sp.getSt_fold()[i] = i + -1024;
		}
		for (i = (byte)'a'; i <= (byte)'z'; ++i) {
			ModernizedCProgram.sp.getSt_isw()[i] = 1;
			ModernizedCProgram.sp.getSt_upper()[i] = i - -1024/*
			 * Init the chartab used for spelling.  Only depends on 'encoding'.
			 * Called once while starting up and when 'encoding' changes.
			 * The default is to use isalpha(), but the spell file should define the word
			 * characters to make it possible that 'encoding' differs from the current
			 * locale.  For utf-8 we don't use isalpha() but our own functions.
			 */;
		}
	}
	public Object getSt_isw() {
		return st_isw;
	}
	public void setSt_isw(Object newSt_isw) {
		st_isw = newSt_isw;
	}
	public Object getSt_isu() {
		return st_isu;
	}
	public void setSt_isu(Object newSt_isu) {
		st_isu = newSt_isu;
	}
	public Object getSt_fold() {
		return st_fold;
	}
	public void setSt_fold(Object newSt_fold) {
		st_fold = newSt_fold;
	}
	public Object getSt_upper() {
		return st_upper;
	}
	public void setSt_upper(Object newSt_upper) {
		st_upper = newSt_upper;
	}
}
