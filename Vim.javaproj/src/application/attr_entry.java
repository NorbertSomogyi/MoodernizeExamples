package application;

// stores si_cchar
// external matches from start pattern
/*
 * syn_state contains the syntax state stack for the start of one line.
 * Used by b_sst_array[].
 */
// next entry in used or free list
// line number for this state
// short state stack
// growarray for long state stack
// flags for sst_next_list
// number of states on the stack
// "nextgroup" list in this state
// (this is a copy, don't free it!
// tick when last displayed
// when non-zero, change in this line
// may have made the state invalid
// FEAT_SYN_HL
// maximum value for a highlight ID.
/*
 * Structure shared between syntax.c, screen.c and gui_x11.c.
 */
public class attr_entry {
	private int ae_attr;
	private  ae_u;
	
	public attr_entry(int ae_attr,  ae_u) {
		setAe_attr(ae_attr);
		setAe_u(ae_u);
	}
	public attr_entry() {
	}
	
	public attr_entry syn_term_attr2entry(int attr) {
		attr -= (-1024 + 1);
		// did ":syntax clear"if (attr >= ModernizedCProgram.term_attr_table.getGa_len()) {
			return ((Object)0);
		} 
		return (((attrentry_T)ModernizedCProgram.term_attr_table.getGa_data())[attr]);
	}
	public attr_entry syn_cterm_attr2entry(int attr) {
		attr -= (-1024 + 1);
		// did ":syntax clear"if (attr >= ModernizedCProgram.cterm_attr_table.getGa_len()) {
			return ((Object)0);
		} 
		return (((attrentry_T)ModernizedCProgram.cterm_attr_table.getGa_data())[attr]);
	}
	public int getAe_attr() {
		return ae_attr;
	}
	public void setAe_attr(int newAe_attr) {
		ae_attr = newAe_attr;
	}
	public  getAe_u() {
		return ae_u;
	}
	public void setAe_u( newAe_u) {
		ae_u = newAe_u;
	}
}
