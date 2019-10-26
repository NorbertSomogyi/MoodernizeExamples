package application;

public class tree_desc_x {
	private tree_desc d;
	private tree_desc_skip skip;
	
	public tree_desc_x(tree_desc d, tree_desc_skip skip) {
		setD(d);
		setSkip(skip);
	}
	public tree_desc_x() {
	}
	
	public void free_extended_entry() {
		tree_desc_skip p = new tree_desc_skip();
		tree_desc_skip s = new tree_desc_skip();
		tree_desc_skip generatedPrev = s.getPrev();
		tree_desc_skip generatedSkip = this.getSkip();
		for (s = generatedSkip; s; s = p) {
			p = generatedPrev;
			ModernizedCProgram.free(s);
		}
	}
	public tree_desc getD() {
		return d;
	}
	public void setD(tree_desc newD) {
		d = newD;
	}
	public tree_desc_skip getSkip() {
		return skip;
	}
	public void setSkip(tree_desc_skip newSkip) {
		skip = newSkip;
	}
}
