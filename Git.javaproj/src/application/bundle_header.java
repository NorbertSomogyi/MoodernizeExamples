package application;

public class bundle_header {
	private ref_list prerequisites;
	private ref_list references;
	
	public bundle_header(ref_list prerequisites, ref_list references) {
		setPrerequisites(prerequisites);
		setReferences(references);
	}
	public bundle_header() {
	}
	
	public ref_list getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(ref_list newPrerequisites) {
		prerequisites = newPrerequisites;
	}
	public ref_list getReferences() {
		return references;
	}
	public void setReferences(ref_list newReferences) {
		references = newReferences;
	}
}
