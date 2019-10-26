package application;

public class replace_object {
	private oidmap_entry original;
	private object_id replacement;
	
	public replace_object(oidmap_entry original, object_id replacement) {
		setOriginal(original);
		setReplacement(replacement);
	}
	public replace_object() {
	}
	
	public oidmap_entry getOriginal() {
		return original;
	}
	public void setOriginal(oidmap_entry newOriginal) {
		original = newOriginal;
	}
	public object_id getReplacement() {
		return replacement;
	}
	public void setReplacement(object_id newReplacement) {
		replacement = newReplacement;
	}
}
