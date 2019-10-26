package application;

public class merge_simplify_state {
	private commit simplified;
	
	public merge_simplify_state(commit simplified) {
		setSimplified(simplified);
	}
	public merge_simplify_state() {
	}
	
	public merge_simplify_state locate_simplify_state(rev_info revs, commit commit) {
		merge_simplify_state st = new merge_simplify_state();
		decoration generatedMerge_simplification = revs.getMerge_simplification();
		object generatedObject = commit.getObject();
		st = generatedMerge_simplification.lookup_decoration(generatedObject);
		if (!st) {
			st = ModernizedCProgram.xcalloc(1, );
			generatedMerge_simplification.add_decoration(generatedObject, st);
		} 
		return st;
	}
	public commit getSimplified() {
		return simplified;
	}
	public void setSimplified(commit newSimplified) {
		simplified = newSimplified;
	}
}
