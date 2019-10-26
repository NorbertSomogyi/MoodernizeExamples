package application;

public class frame {
	private pattern_match_result default_match;
	private int child_prov_omit;
	
	public frame(pattern_match_result default_match, int child_prov_omit) {
		setDefault_match(default_match);
		setChild_prov_omit(child_prov_omit);
	}
	public frame() {
	}
	
	public pattern_match_result getDefault_match() {
		return default_match;
	}
	public void setDefault_match(pattern_match_result newDefault_match) {
		default_match = newDefault_match;
	}
	public int getChild_prov_omit() {
		return child_prov_omit;
	}
	public void setChild_prov_omit(int newChild_prov_omit) {
		child_prov_omit = newChild_prov_omit;
	}
}
/*
	 * default_match is the usual default include/exclude value that
	 * should be inherited as we recurse into directories based
	 * upon pattern matching of the directory itself or of a
	 * containing directory.
	 */
