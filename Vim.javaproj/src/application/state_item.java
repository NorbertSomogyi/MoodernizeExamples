package application;

public class state_item {
	private int si_idx;
	private int si_id;
	private int si_trans_id;
	private int si_m_lnum;
	private int si_m_startcol;
	private  si_m_endpos;
	private  si_h_startpos;
	private  si_h_endpos;
	private  si_eoe_pos;
	private int si_end_idx;
	private int si_ends;
	private int si_attr;
	private long si_flags;
	private int si_seqnr;
	private int si_cchar;
	private Integer si_cont_list;
	private Integer si_next_list;
	private  si_extmatch;
	
	public state_item(int si_idx, int si_id, int si_trans_id, int si_m_lnum, int si_m_startcol,  si_m_endpos,  si_h_startpos,  si_h_endpos,  si_eoe_pos, int si_end_idx, int si_ends, int si_attr, long si_flags, int si_seqnr, int si_cchar, Integer si_cont_list, Integer si_next_list,  si_extmatch) {
		setSi_idx(si_idx);
		setSi_id(si_id);
		setSi_trans_id(si_trans_id);
		setSi_m_lnum(si_m_lnum);
		setSi_m_startcol(si_m_startcol);
		setSi_m_endpos(si_m_endpos);
		setSi_h_startpos(si_h_startpos);
		setSi_h_endpos(si_h_endpos);
		setSi_eoe_pos(si_eoe_pos);
		setSi_end_idx(si_end_idx);
		setSi_ends(si_ends);
		setSi_attr(si_attr);
		setSi_flags(si_flags);
		setSi_seqnr(si_seqnr);
		setSi_cchar(si_cchar);
		setSi_cont_list(si_cont_list);
		setSi_next_list(si_next_list);
		setSi_extmatch(si_extmatch);
	}
	public state_item() {
	}
	
	public state_item push_next_match() {
		synpat_T spp = new synpat_T();
		int save_flags;
		spp = (((synpat_T)((ModernizedCProgram.syn_block).getB_syn_patterns().getGa_data()))[ModernizedCProgram.next_match_idx/*
		     * Push the item in current_state stack;
		     */]);
		int generatedSp_flags = spp.getSp_flags();
		int generatedSp_cchar = spp.getSp_cchar();
		long generatedSi_flags = this.getSi_flags();
		Integer generatedSp_next_list = spp.getSp_next_list();
		byte generatedSp_type = spp.getSp_type();
		int generatedSp_syn_match_id = spp.getSp_syn_match_id();
		if (ModernizedCProgram.push_current_state(ModernizedCProgram.next_match_idx) == 1/*
			 * If it's a start-skip-end type that crosses lines, figure out how
			 * much it continues in this line.  Otherwise just fill in the length.
			 */) {
			cur_si = ((stateitem_T)(ModernizedCProgram.current_state.getGa_data()))[ModernizedCProgram.current_state.getGa_len() - 1];
			this.setSi_h_startpos(ModernizedCProgram.next_match_h_startpos);
			this.setSi_m_startcol(ModernizedCProgram.current_col);
			this.setSi_m_lnum(ModernizedCProgram.current_lnum);
			this.setSi_flags(generatedSp_flags);
			this.setSi_seqnr(ModernizedCProgram.next_seqnr++);
			this.setSi_cchar(generatedSp_cchar);
			if (ModernizedCProgram.current_state.getGa_len() > 1) {
				generatedSi_flags |=  generatedSi_flags & -1024;
			} 
			this.setSi_next_list(generatedSp_next_list);
			this.setSi_extmatch(ModernizedCProgram.next_match_extmatch.ref_extmatch());
			if (generatedSp_type == 2 && !(generatedSp_flags & -1024)) {
				cur_si.update_si_end((int)(ModernizedCProgram.next_match_m_endpos.getCol()), /* Try to find the end pattern in the current line */1);
				ModernizedCProgram.check_keepend();
			} else {
					this.setSi_m_endpos(ModernizedCProgram.next_match_m_endpos);
					this.setSi_h_endpos(ModernizedCProgram.next_match_h_endpos);
					this.setSi_ends(1);
					generatedSi_flags |=  ModernizedCProgram.next_match_flags;
					this.setSi_eoe_pos(ModernizedCProgram.next_match_eoe_pos);
					this.setSi_end_idx(ModernizedCProgram.next_match_end_idx);
			} 
			if (ModernizedCProgram.keepend_level < 0 && (generatedSi_flags & -1024)) {
				ModernizedCProgram.keepend_level = ModernizedCProgram.current_state.getGa_len() - 1;
			} 
			ModernizedCProgram.check_keepend();
			ModernizedCProgram.update_si_attr(ModernizedCProgram.current_state.getGa_len() - 1);
			save_flags = generatedSi_flags & (-1024 | -1024/*
				 * If the start pattern has another highlight group, push another item
				 * on the stack for the start pattern.
				 */);
			if (generatedSp_type == 2 && generatedSp_syn_match_id != 0 && ModernizedCProgram.push_current_state(ModernizedCProgram.next_match_idx) == 1) {
				cur_si = ((stateitem_T)(ModernizedCProgram.current_state.getGa_data()))[ModernizedCProgram.current_state.getGa_len() - 1];
				this.setSi_h_startpos(ModernizedCProgram.next_match_h_startpos);
				this.setSi_m_startcol(ModernizedCProgram.current_col);
				this.setSi_m_lnum(ModernizedCProgram.current_lnum);
				this.setSi_m_endpos(ModernizedCProgram.next_match_eos_pos);
				this.setSi_h_endpos(ModernizedCProgram.next_match_eos_pos);
				this.setSi_ends(1);
				this.setSi_end_idx(0);
				this.setSi_flags(-1024);
				this.setSi_seqnr(ModernizedCProgram.next_seqnr++);
				generatedSi_flags |=  save_flags;
				if (generatedSi_flags & -1024) {
					generatedSi_flags |=  -1024;
				} 
				this.setSi_next_list(((Object)0));
				ModernizedCProgram.check_keepend();
				ModernizedCProgram.update_si_attr(ModernizedCProgram.current_state.getGa_len() - 1);
			} 
		} 
		ModernizedCProgram.next_match_idx = -/* try other match next time */1;
		return cur_si/*
		 * Check for end of current state (and the states before it).
		 */;
	}
	public void update_si_end(int startcol, int force) {
		/* when TRUE overrule a previous end */lpos_T startpos = new lpos_T();
		lpos_T endpos = new lpos_T();
		lpos_T hl_endpos = new lpos_T();
		lpos_T end_endpos = new lpos_T();
		int end_idx;
		int generatedSi_idx = this.getSi_idx();
		if (generatedSi_idx < /* return quickly for a keyword */0) {
			return /*Error: Unsupported expression*/;
		} 
		 generatedSi_m_endpos = this.getSi_m_endpos();
		Object generatedLnum = generatedSi_m_endpos.getLnum();
		if (!force && generatedLnum >= ModernizedCProgram.current_lnum) {
			return /*Error: Unsupported expression*/;
		} 
		end_idx = 0;
		startpos.setLnum(ModernizedCProgram.current_lnum);
		startpos.setCol(startcol);
		long generatedSi_flags = this.getSi_flags();
		 generatedSi_extmatch = this.getSi_extmatch();
		startpos.find_endpos(generatedSi_idx, endpos, hl_endpos, (generatedSi_flags), end_endpos, end_idx, generatedSi_extmatch);
		if (generatedLnum == 0) {
			if (((synpat_T)((ModernizedCProgram.syn_block).getB_syn_patterns().getGa_data()))[generatedSi_idx].getSp_flags() & /* No end pattern matched. */-1024) {
				this.setSi_ends(/* a "oneline" never continues in the next line */1);
				generatedSi_m_endpos.setLnum(ModernizedCProgram.current_lnum);
				generatedSi_m_endpos.setCol((colnr_T)/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.syn_getcurline())));
			} else {
					this.setSi_ends(/* continues in the next line */0);
					generatedSi_m_endpos.setLnum(0);
			} 
			this.setSi_h_endpos(generatedSi_m_endpos);
		} else {
				this.setSi_m_endpos(/* match within this line */endpos);
				this.setSi_h_endpos(hl_endpos);
				this.setSi_eoe_pos(end_endpos);
				this.setSi_ends(1);
				this.setSi_end_idx(end_idx/*
				 * Add a new state to the current state stack.
				 * It is cleared and the index set to "idx".
				 * Return FAIL if it's not possible (out of memory).
				 */);
		} 
	}
	/* where to start searching for the end */
	public int check_keyword_id(Object line, int startcol, Integer endcolp, Long flagsp, Integer next_listp, Integer ccharp) {
		/* return: next_list of matching keyword *//* item at the top of the stack *//* conceal substitution char */keyentry_T kp = new keyentry_T();
		char_u kwp = new char_u();
		int round;
		int kwlen;
		char_u[] keyword = new char_u();
		hashtab_T ht = new hashtab_T();
		hashitem_T hi = new hashitem_T();
		kwp = line + /* Find first character after the keyword.  First character was already
		     * checked. */startcol;
		kwlen = 0;
		do {
			if (has_mbyte) {
				kwlen += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(kwp + kwlen);
			} else {
					++kwlen;
			} 
		} while (ModernizedCProgram.syn_buf.vim_iswordp_buf(kwp + kwlen));
		if (kwlen > 80) {
			return 0/*
			     * Must make a copy of the keyword, so we can add a NUL and make it
			     * lowercase.
			     */;
		} 
		ModernizedCProgram.vim_strncpy(keyword, kwp, kwlen/*
		     * Try twice:
		     * 1. matching case
		     * 2. ignoring case
		     */);
		Object generatedHt_used = ht.getHt_used();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		Object generatedK_syn = kp.getK_syn();
		Object generatedFlags = kp.getFlags();
		Integer generatedSi_cont_list = this.getSi_cont_list();
		Object generatedNext_list = kp.getNext_list();
		Object generatedK_char = kp.getK_char();
		Object generatedKe_next = kp.getKe_next();
		for (round = 1; round <= 2; ++round) {
			ht = round == 1 ? ModernizedCProgram.syn_block.getB_keywtab() : ModernizedCProgram.syn_block.getB_keywtab_ic();
			if (generatedHt_used == 0) {
				continue;
			} 
			if (round == /* ignore case */2) {
				(Object)ModernizedCProgram.str_foldcase(kwp, kwlen, keyword, 80 + 1/*
					 * Find keywords that match.  There can be several with different
					 * attributes.
					 * When current_next_list is non-zero accept only that group, otherwise:
					 *  Accept a not-contained keyword at toplevel.
					 *  Accept a keyword at other levels only if it is in the contains list.
					 */);
			} 
			hi = hashitem_S.hash_find(ht, keyword);
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				for (kp = ((keyentry_T)((generatedHi_key) - (ModernizedCProgram.dumkey.getKeyword() - (char_u)ModernizedCProgram.dumkey))); kp != ((Object)0); kp = generatedKe_next) {
					if (ModernizedCProgram.current_next_list != 0 ? ModernizedCProgram.in_id_list(((Object)0), ModernizedCProgram.current_next_list, generatedK_syn, 0) : (cur_si == ((Object)0) ? !(generatedFlags & -1024) : ModernizedCProgram.in_id_list(cur_si, generatedSi_cont_list, generatedK_syn, generatedFlags & -1024))) {
						endcolp = startcol + kwlen;
						flagsp = generatedFlags;
						next_listp = generatedNext_list;
						ccharp = generatedK_char;
						return generatedK_syn.getId();
					} 
				}
			} 
		}
		return 0/*
		 * Handle ":syntax conceal" command.
		 */;
	}
	/* position in line to check for keyword */
	/* return: character after found keyword */
	/* return: flags of matching keyword */
	public int getSi_idx() {
		return si_idx;
	}
	public void setSi_idx(int newSi_idx) {
		si_idx = newSi_idx;
	}
	public int getSi_id() {
		return si_id;
	}
	public void setSi_id(int newSi_id) {
		si_id = newSi_id;
	}
	public int getSi_trans_id() {
		return si_trans_id;
	}
	public void setSi_trans_id(int newSi_trans_id) {
		si_trans_id = newSi_trans_id;
	}
	public int getSi_m_lnum() {
		return si_m_lnum;
	}
	public void setSi_m_lnum(int newSi_m_lnum) {
		si_m_lnum = newSi_m_lnum;
	}
	public int getSi_m_startcol() {
		return si_m_startcol;
	}
	public void setSi_m_startcol(int newSi_m_startcol) {
		si_m_startcol = newSi_m_startcol;
	}
	public  getSi_m_endpos() {
		return si_m_endpos;
	}
	public void setSi_m_endpos( newSi_m_endpos) {
		si_m_endpos = newSi_m_endpos;
	}
	public  getSi_h_startpos() {
		return si_h_startpos;
	}
	public void setSi_h_startpos( newSi_h_startpos) {
		si_h_startpos = newSi_h_startpos;
	}
	public  getSi_h_endpos() {
		return si_h_endpos;
	}
	public void setSi_h_endpos( newSi_h_endpos) {
		si_h_endpos = newSi_h_endpos;
	}
	public  getSi_eoe_pos() {
		return si_eoe_pos;
	}
	public void setSi_eoe_pos( newSi_eoe_pos) {
		si_eoe_pos = newSi_eoe_pos;
	}
	public int getSi_end_idx() {
		return si_end_idx;
	}
	public void setSi_end_idx(int newSi_end_idx) {
		si_end_idx = newSi_end_idx;
	}
	public int getSi_ends() {
		return si_ends;
	}
	public void setSi_ends(int newSi_ends) {
		si_ends = newSi_ends;
	}
	public int getSi_attr() {
		return si_attr;
	}
	public void setSi_attr(int newSi_attr) {
		si_attr = newSi_attr;
	}
	public long getSi_flags() {
		return si_flags;
	}
	public void setSi_flags(long newSi_flags) {
		si_flags = newSi_flags;
	}
	public int getSi_seqnr() {
		return si_seqnr;
	}
	public void setSi_seqnr(int newSi_seqnr) {
		si_seqnr = newSi_seqnr;
	}
	public int getSi_cchar() {
		return si_cchar;
	}
	public void setSi_cchar(int newSi_cchar) {
		si_cchar = newSi_cchar;
	}
	public Integer getSi_cont_list() {
		return si_cont_list;
	}
	public void setSi_cont_list(Integer newSi_cont_list) {
		si_cont_list = newSi_cont_list;
	}
	public Integer getSi_next_list() {
		return si_next_list;
	}
	public void setSi_next_list(Integer newSi_next_list) {
		si_next_list = newSi_next_list;
	}
	public  getSi_extmatch() {
		return si_extmatch;
	}
	public void setSi_extmatch( newSi_extmatch) {
		si_extmatch = newSi_extmatch;
	}
}
