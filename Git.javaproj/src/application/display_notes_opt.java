package application;

public class display_notes_opt {
	private int use_default_notes;
	private string_list extra_notes_refs;
	
	public display_notes_opt(int use_default_notes, string_list extra_notes_refs) {
		setUse_default_notes(use_default_notes);
		setExtra_notes_refs(extra_notes_refs);
	}
	public display_notes_opt() {
	}
	
	public int getUse_default_notes() {
		return use_default_notes;
	}
	public void setUse_default_notes(int newUse_default_notes) {
		use_default_notes = newUse_default_notes;
	}
	public string_list getExtra_notes_refs() {
		return extra_notes_refs;
	}
	public void setExtra_notes_refs(string_list newExtra_notes_refs) {
		extra_notes_refs = newExtra_notes_refs;
	}
}
