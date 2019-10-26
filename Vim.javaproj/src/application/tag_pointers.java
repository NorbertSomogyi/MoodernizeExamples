package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * Code to handle tags and the tag stack
 */
/*
 * Structure to hold pointers to various items in a tag line.
 */
public class tag_pointers {
	private Object tagname;
	private Object tagname_end;
	private Object fname;
	private Object fname_end;
	private Object command;
	private Object command_end;
	private Object tag_fname;
	private int is_etag;
	private Object tagkind;
	private Object tagkind_end;
	private Object user_data;
	private Object user_data_end;
	
	public tag_pointers(Object tagname, Object tagname_end, Object fname, Object fname_end, Object command, Object command_end, Object tag_fname, int is_etag, Object tagkind, Object tagkind_end, Object user_data, Object user_data_end) {
		setTagname(tagname);
		setTagname_end(tagname_end);
		setFname(fname);
		setFname_end(fname_end);
		setCommand(command);
		setCommand_end(command_end);
		setTag_fname(tag_fname);
		setIs_etag(is_etag);
		setTagkind(tagkind);
		setTagkind_end(tagkind_end);
		setUser_data(user_data);
		setUser_data_end(user_data_end);
	}
	public tag_pointers() {
	}
	
	public int parse_tag_line(Object lbuf, int is_etag) {
		char_u p = new char_u();
		char_u p_7f = new char_u();
		return 1/*
		 * Check if tagname is a static tag
		 *
		 * Static tags produced by the older ctags program have the format:
		 *	'file:tag  file  /pattern'.
		 * This is only recognized when both occurrence of 'file' are the same, to
		 * avoid recognizing "string::string" or ":exit".
		 *
		 * Static tags produced by the new ctags program have the format:
		 *	'tag  file  /pattern/;"<Tab>file:'	    "
		 *
		 * Return TRUE if it is a static tag and adjust *tagname to the real tag.
		 * Return FALSE if it is not a static tag.
		 */;
	}
	/* line to be parsed */
	public int test_for_static() {
		char_u p = new char_u();
		/*
		     * Check for new style static tag ":...<Tab>file:[<Tab>...]"
		     */
		Object generatedCommand = this.getCommand();
		p = generatedCommand;
		while ((p = ModernizedCProgram.vim_strchr(p, (byte)'\t')) != ((Object)0)) {
			++p;
			if (.strncmp((byte)(p), (byte)("file:"), (size_t)(true)) == 0) {
				return 1;
			} 
		}
		return 0/*
		 * Returns the length of a matching tag line.
		 */;
	}
	public int parse_match(Object lbuf) {
		/* output: pointers into the line */int retval;
		char_u p = new char_u();
		char_u pc = new char_u();
		char_u pt = new char_u();
		this.setTag_fname(lbuf + 1);
		Object generatedTag_fname = this.getTag_fname();
		lbuf += .strlen((byte)(generatedTag_fname)) + 2;
		if (lbuf) {
			this.setIs_etag(1);
			this.setFname(lbuf);
			lbuf += .strlen((byte)(lbuf));
			this.setFname_end(lbuf++);
		} else {
				this.setIs_etag(0);
				++lbuf;
		} 
		int generatedIs_etag = this.getIs_etag();
		retval = tagp.parse_tag_line(/* Find search pattern and the file name for non-etags. */lbuf, generatedIs_etag);
		this.setTagkind(((Object)0));
		this.setUser_data(((Object)0));
		this.setCommand_end(((Object)0));
		Object generatedCommand = this.getCommand();
		Object generatedTagkind = this.getTagkind();
		Object generatedUser_data = this.getUser_data();
		if (retval == 1) {
			p = generatedCommand;
			if (ModernizedCProgram.find_extra(p) == 1) {
				if (p > generatedCommand && p[-1] == (byte)'|') {
					this.setCommand_end(p - 1);
				} else {
						this.setCommand_end(p);
				} 
				p += /* skip ";\"" */2;
				if (p++ == (byte)'\011') {
					while ((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26))) {
						if (.strncmp((byte)(p), (byte)("kind:"), (size_t)(true)) == 0) {
							this.setTagkind(p + 5);
						}  else if (.strncmp((byte)(p), (byte)("user_data:"), (size_t)(true)) == 0) {
							this.setUser_data(p + 10);
						} 
						if (generatedTagkind != ((Object)0) && generatedUser_data != ((Object)0)) {
							break;
						} 
						pc = ModernizedCProgram.vim_strchr(p, (byte)':');
						pt = ModernizedCProgram.vim_strchr(p, (byte)'\t');
						if (pc == ((Object)0) || (pt != ((Object)0) && pc > pt)) {
							this.setTagkind(p);
						} 
						if (pt == ((Object)0)) {
							break;
						} 
						p = pt + 1;
					}
				} 
			} 
			if (generatedTagkind != ((Object)0)) {
				for (p = generatedTagkind; p && p != (byte)'\t' && p != (byte)'\r' && p != (byte)'\n'; ++p) {
					;
				}
				this.setTagkind_end(p);
			} 
			if (generatedUser_data != ((Object)0)) {
				for (p = generatedUser_data; p && p != (byte)'\t' && p != (byte)'\r' && p != (byte)'\n'; ++p) {
					;
				}
				this.setUser_data_end(p);
			} 
		} 
		return retval/*
		 * Find out the actual file name of a tag.  Concatenate the tags file name
		 * with the matching tag file name.
		 * Returns an allocated string or NULL (out of memory).
		 */;
	}
	/* input: matching line */
	public Object tag_full_fname() {
		char_u fullname = new char_u();
		int c;
		int generatedIs_etag = this.getIs_etag();
		Object generatedFname_end = this.getFname_end();
		if (generatedIs_etag) {
			c = /* to shut up GCC */0;
		} else {
				c = generatedFname_end;
				generatedFname_end = (byte)'\000';
		} 
		Object generatedFname = this.getFname();
		Object generatedTag_fname = this.getTag_fname();
		fullname = ModernizedCProgram.expand_tag_fname(generatedFname, generatedTag_fname, 0);
		if (!generatedIs_etag) {
			generatedFname_end = c;
		} 
		return fullname/*
		 * Jump to a tag that has been found in one of the tag files
		 *
		 * returns OK for success, NOTAGFILE when file not found, FAIL otherwise.
		 */;
	}
	public Object getTagname() {
		return tagname;
	}
	public void setTagname(Object newTagname) {
		tagname = newTagname;
	}
	public Object getTagname_end() {
		return tagname_end;
	}
	public void setTagname_end(Object newTagname_end) {
		tagname_end = newTagname_end;
	}
	public Object getFname() {
		return fname;
	}
	public void setFname(Object newFname) {
		fname = newFname;
	}
	public Object getFname_end() {
		return fname_end;
	}
	public void setFname_end(Object newFname_end) {
		fname_end = newFname_end;
	}
	public Object getCommand() {
		return command;
	}
	public void setCommand(Object newCommand) {
		command = newCommand;
	}
	public Object getCommand_end() {
		return command_end;
	}
	public void setCommand_end(Object newCommand_end) {
		command_end = newCommand_end;
	}
	public Object getTag_fname() {
		return tag_fname;
	}
	public void setTag_fname(Object newTag_fname) {
		tag_fname = newTag_fname;
	}
	public int getIs_etag() {
		return is_etag;
	}
	public void setIs_etag(int newIs_etag) {
		is_etag = newIs_etag;
	}
	public Object getTagkind() {
		return tagkind;
	}
	public void setTagkind(Object newTagkind) {
		tagkind = newTagkind;
	}
	public Object getTagkind_end() {
		return tagkind_end;
	}
	public void setTagkind_end(Object newTagkind_end) {
		tagkind_end = newTagkind_end;
	}
	public Object getUser_data() {
		return user_data;
	}
	public void setUser_data(Object newUser_data) {
		user_data = newUser_data;
	}
	public Object getUser_data_end() {
		return user_data_end;
	}
	public void setUser_data_end(Object newUser_data_end) {
		user_data_end = newUser_data_end;
	}
}
