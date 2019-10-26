package application;

public class blame_list {
	private blame_entry ent;
	private Object split;
	
	public blame_list(blame_entry ent, Object split) {
		setEnt(ent);
		setSplit(split);
	}
	public blame_list() {
	}
	
	public blame_list setup_blame_list(blame_entry unblamed, int num_ents_p) {
		blame_entry e = new blame_entry();
		int num_ents;
		int i;
		blame_list blame_list = ((Object)0);
		blame_entry generatedNext = e.getNext();
		for (; e; e = generatedNext) {
			num_ents++;
		}
		if (num_ents) {
			blame_list = ModernizedCProgram.xcalloc(num_ents, );
			for (; e; e = generatedNext) {
				blame_list[i++].setEnt(e);
			}
		} 
		num_ents_p = num_ents;
		return blame_list/*
		 * For lines target is suspected for, see if we can find code movement
		 * across file boundary from the parent commit.  porigin is the path
		 * in the parent we already tried.
		 */;
	}
	public blame_entry getEnt() {
		return ent;
	}
	public void setEnt(blame_entry newEnt) {
		ent = newEnt;
	}
	public Object getSplit() {
		return split;
	}
	public void setSplit(Object newSplit) {
		split = newSplit;
	}
}
