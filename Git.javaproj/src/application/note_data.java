package application;

public class note_data {
	private int given;
	private int use_editor;
	private Byte edit_path;
	private strbuf buf;
	
	public note_data(int given, int use_editor, Byte edit_path, strbuf buf) {
		setGiven(given);
		setUse_editor(use_editor);
		setEdit_path(edit_path);
		setBuf(buf);
	}
	public note_data() {
	}
	
	public void free_note_data() {
		Byte generatedEdit_path = this.getEdit_path();
		if (generatedEdit_path) {
			ModernizedCProgram.unlink_or_warn(generatedEdit_path);
			ModernizedCProgram.free(generatedEdit_path);
		} 
		strbuf generatedBuf = this.getBuf();
		generatedBuf.strbuf_release();
	}
	public void prepare_note_data(Object object, Object old_note) {
		int generatedUse_editor = this.getUse_editor();
		int generatedGiven = this.getGiven();
		Byte generatedEdit_path = this.getEdit_path();
		strbuf generatedBuf = this.getBuf();
		byte[] generatedBuf = generatedBuf.getBuf();
		Object generatedLen = generatedBuf.getLen();
		if (generatedUse_editor || !generatedGiven) {
			int fd;
			strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			this.setEdit_path(ModernizedCProgram.git_pathdup(/* write the template message before editing: */"NOTES_EDITMSG"));
			fd = /*Error: Function owner not recognized*/open(generatedEdit_path, -1024 | -1024 | 1, 600);
			if (fd < 0) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("could not create file '%s'"), generatedEdit_path);
			} 
			if (generatedGiven) {
				ModernizedCProgram.write_or_die(fd, generatedBuf, generatedLen);
			}  else if (old_note) {
				ModernizedCProgram.copy_obj_to_fd(fd, old_note);
			} 
			ModernizedCProgram.buf.strbuf_addch((byte)'\n');
			ModernizedCProgram.buf.strbuf_add_commented_lines("\n", /*Error: Function owner not recognized*/strlen("\n"));
			ModernizedCProgram.buf.strbuf_add_commented_lines(ModernizedCProgram._(ModernizedCProgram.note_template), /*Error: Function owner not recognized*/strlen(ModernizedCProgram._(ModernizedCProgram.note_template)));
			ModernizedCProgram.buf.strbuf_addch((byte)'\n');
			ModernizedCProgram.write_or_die(fd, generatedBuf, generatedLen);
			ModernizedCProgram.write_commented_object(fd, object);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
			ModernizedCProgram.buf.strbuf_release();
			generatedBuf.strbuf_setlen(0);
			if (generatedBuf.launch_editor(generatedEdit_path, ((Object)0))) {
				ModernizedCProgram.die(ModernizedCProgram._("please supply the note contents using either -m or -F option"));
			} 
			generatedBuf.strbuf_stripspace(1);
		} 
	}
	public int getGiven() {
		return given;
	}
	public void setGiven(int newGiven) {
		given = newGiven;
	}
	public int getUse_editor() {
		return use_editor;
	}
	public void setUse_editor(int newUse_editor) {
		use_editor = newUse_editor;
	}
	public Byte getEdit_path() {
		return edit_path;
	}
	public void setEdit_path(Byte newEdit_path) {
		edit_path = newEdit_path;
	}
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
}
