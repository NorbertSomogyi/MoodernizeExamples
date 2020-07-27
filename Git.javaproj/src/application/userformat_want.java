package application;

public class userformat_want {
	private int notes;
	private int source;
	
	public userformat_want(int notes, int source) {
		setNotes(notes);
		setSource(source);
	}
	public userformat_want() {
	}
	
	public void userformat_find_requirements(Object fmt) {
		strbuf dummy = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (!fmt) {
			if (!ModernizedCProgram.user_format) {
				return /*Error: Unsupported expression*/;
			} 
			fmt = ModernizedCProgram.user_format;
		} 
		dummy.strbuf_expand(fmt, userformat_want_item, w);
		dummy.strbuf_release();
	}
	public int getNotes() {
		return notes;
	}
	public void setNotes(int newNotes) {
		notes = newNotes;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int newSource) {
		source = newSource;
	}
}
