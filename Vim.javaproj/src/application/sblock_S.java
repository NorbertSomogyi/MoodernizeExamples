package application;

/* size of sb_data */
public class sblock_S {
	private int sb_used;
	private sblock_S sb_next;
	private Object sb_data;
	
	public sblock_S(int sb_used, sblock_S sb_next, Object sb_data) {
		setSb_used(sb_used);
		setSb_next(sb_next);
		setSb_data(sb_data);
	}
	public sblock_S() {
	}
	
	public void free_blocks() {
		sblock_T next = new sblock_T();
		sblock_S generatedSb_next = this.getSb_next();
		while (bl != ((Object)0)) {
			next = generatedSb_next;
			ModernizedCProgram.vim_free(bl);
			bl = next/*
			 * Allocate the root of a word tree.
			 * Returns NULL when out of memory.
			 */;
		}
	}
	public int getSb_used() {
		return sb_used;
	}
	public void setSb_used(int newSb_used) {
		sb_used = newSb_used;
	}
	public sblock_S getSb_next() {
		return sb_next;
	}
	public void setSb_next(sblock_S newSb_next) {
		sb_next = newSb_next;
	}
	public Object getSb_data() {
		return sb_data;
	}
	public void setSb_data(Object newSb_data) {
		sb_data = newSb_data;
	}
}
