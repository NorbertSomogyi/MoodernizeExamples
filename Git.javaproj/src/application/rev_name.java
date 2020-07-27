package application;

/*
 * One day.  See the 'name a rev shortly after epoch' test in t6120 when
 * changing this value
 */
public class rev_name {
	private Object tip_name;
	private Object taggerdate;
	private int generation;
	private int distance;
	private int from_tag;
	
	public rev_name(Object tip_name, Object taggerdate, int generation, int distance, int from_tag) {
		setTip_name(tip_name);
		setTaggerdate(taggerdate);
		setGeneration(generation);
		setDistance(distance);
		setFrom_tag(from_tag);
	}
	public rev_name() {
	}
	
	public rev_name commit_rev_name_at_peek(commit_rev_name s, Object c, int add_if_missing) {
		int nth_slab;
		int nth_slot;
		int generatedSlab_size = s.getSlab_size();
		nth_slab = c.getIndex() / generatedSlab_size;
		nth_slot = c.getIndex() % generatedSlab_size;
		int generatedSlab_count = s.getSlab_count();
		rev_name[][][] generatedSlab = s.getSlab();
		if (generatedSlab_count <= nth_slab) {
			int i;
			if (!add_if_missing) {
				return ((Object)0);
			} 
			(generatedSlab) = ModernizedCProgram.xrealloc((generatedSlab), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nth_slab + 1)));
			for (i = generatedSlab_count; i <= nth_slab; i++) {
				generatedSlab[i] = ((Object)0);
			}
			s.setSlab_count(nth_slab + 1);
		} 
		int generatedStride = s.getStride();
		if (!generatedSlab[nth_slab]) {
			if (!add_if_missing) {
				return ((Object)0);
			} 
			generatedSlab[nth_slab] = ModernizedCProgram.xcalloc(generatedSlab_size, /*Error: sizeof expression not supported yet*/ * generatedStride);
		} 
		return generatedSlab[nth_slab][nth_slot * generatedStride];
	}
	public rev_name commit_rev_name_at(commit_rev_name s, Object c) {
		rev_name rev_name = new rev_name();
		return rev_name.commit_rev_name_at_peek(s, c, 1);
	}
	public rev_name commit_rev_name_peek(commit_rev_name s, Object c) {
		rev_name rev_name = new rev_name();
		return rev_name.commit_rev_name_at_peek(s, c, 0);
	}
	public rev_name get_commit_rev_name(commit commit) {
		rev_name rev_name = new rev_name();
		rev_name slot = rev_name.commit_rev_name_peek(ModernizedCProgram.rev_names, commit);
		return slot ? slot : ((Object)0);
	}
	public int is_better_name(Object taggerdate, int distance, int from_tag) {
		int generatedFrom_tag = this.getFrom_tag();
		Object generatedTaggerdate = this.getTaggerdate();
		int generatedDistance = this.getDistance();
		if (from_tag && generatedFrom_tag) {
			return (generatedTaggerdate > taggerdate || (generatedTaggerdate == taggerdate && generatedDistance > distance/*
				 * We know that at least one of them is a non-tag at this point.
				 * favor a tag over a non-tag.
				 */));
		} 
		if (generatedFrom_tag != from_tag) {
			return from_tag/*
				 * We are now looking at two non-tags.  Tiebreak to favor
				 * shorter hops.
				 */;
		} 
		if (generatedDistance != distance) {
			return generatedDistance > distance;
		} 
		if (generatedTaggerdate != /* ... or tiebreak to favor older date */taggerdate) {
			return generatedTaggerdate > taggerdate;
		} 
		return /* keep the current one if we cannot decide */0;
	}
	public Object getTip_name() {
		return tip_name;
	}
	public void setTip_name(Object newTip_name) {
		tip_name = newTip_name;
	}
	public Object getTaggerdate() {
		return taggerdate;
	}
	public void setTaggerdate(Object newTaggerdate) {
		taggerdate = newTaggerdate;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int newGeneration) {
		generation = newGeneration;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int newDistance) {
		distance = newDistance;
	}
	public int getFrom_tag() {
		return from_tag;
	}
	public void setFrom_tag(int newFrom_tag) {
		from_tag = newFrom_tag;
	}
}
