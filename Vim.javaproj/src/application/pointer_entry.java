package application;

/* block/line-count pair */
/*
 * pointer to a block, used in a pointer block
 */
public class pointer_entry {
	private Object pe_bnum;
	private Object pe_line_count;
	private Object pe_old_lnum;
	private int pe_page_count;
	
	public pointer_entry(Object pe_bnum, Object pe_line_count, Object pe_old_lnum, int pe_page_count) {
		setPe_bnum(pe_bnum);
		setPe_line_count(pe_line_count);
		setPe_old_lnum(pe_old_lnum);
		setPe_page_count(pe_page_count);
	}
	public pointer_entry() {
	}
	
	public Object getPe_bnum() {
		return pe_bnum;
	}
	public void setPe_bnum(Object newPe_bnum) {
		pe_bnum = newPe_bnum;
	}
	public Object getPe_line_count() {
		return pe_line_count;
	}
	public void setPe_line_count(Object newPe_line_count) {
		pe_line_count = newPe_line_count;
	}
	public Object getPe_old_lnum() {
		return pe_old_lnum;
	}
	public void setPe_old_lnum(Object newPe_old_lnum) {
		pe_old_lnum = newPe_old_lnum;
	}
	public int getPe_page_count() {
		return pe_page_count;
	}
	public void setPe_page_count(int newPe_page_count) {
		pe_page_count = newPe_page_count;
	}
}
/* data block id */
/* pointer block id */
/* block 0 id 0 */
/* block 0 id 1 */
