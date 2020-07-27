package application;

public class ident_split {
	private Object name_begin;
	private Object name_end;
	private Object mail_begin;
	private Object mail_end;
	private Object date_begin;
	private Object date_end;
	private Object tz_begin;
	private Object tz_end;
	
	public ident_split(Object name_begin, Object name_end, Object mail_begin, Object mail_end, Object date_begin, Object date_end, Object tz_begin, Object tz_end) {
		setName_begin(name_begin);
		setName_end(name_end);
		setMail_begin(mail_begin);
		setMail_end(mail_end);
		setDate_begin(date_begin);
		setDate_end(date_end);
		setTz_begin(tz_begin);
		setTz_end(tz_end);
	}
	public ident_split() {
	}
	
	public void assert_split_ident(Object buf) {
		Object generatedDate_begin = this.getDate_begin();
		if (id.split_ident_line(buf.getBuf(), buf.getLen()) || !generatedDate_begin) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\commit.c", 532, "unable to parse our own ident: %s", buf.getBuf());
		} 
	}
	public int split_ident_line(Object line, int len) {
		byte cp;
		size_t span = new size_t();
		int status = -1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(split, 0, /*Error: sizeof expression not supported yet*/);
		this.setName_begin(line);
		for (cp = line; cp && cp < line + len; cp++) {
			if (cp == (byte)'<') {
				this.setMail_begin(cp + 1);
				break;
			} 
		}
		Object generatedMail_begin = this.getMail_begin();
		if (!generatedMail_begin) {
			return status;
		} 
		for (cp = generatedMail_begin - 2; line <= cp; cp--) {
			if (!((ModernizedCProgram.sane_ctype[(byte)(cp)] & (true)) != 0)) {
				this.setName_end(cp + 1);
				break;
			} 
		}
		Object generatedName_end = this.getName_end();
		Object generatedName_begin = this.getName_begin();
		if (!generatedName_end) {
			this.setName_end(generatedName_begin);
		} 
		for (cp = generatedMail_begin; cp < line + len; cp++) {
			if (cp == (byte)'>') {
				this.setMail_end(cp);
				break;
			} 
		}
		Object generatedMail_end = this.getMail_end();
		if (!generatedMail_end) {
			return status/*
				 * Look from the end-of-line to find the trailing ">" of the mail
				 * address, even though we should already know it as split->mail_end.
				 * This can help in cases of broken idents with an extra ">" somewhere
				 * in the email address.  Note that we are assuming the timestamp will
				 * never have a ">" in it.
				 *
				 * Note that we will always find some ">" before going off the front of
				 * the string, because will always hit the split->mail_end closing
				 * bracket.
				 */;
		} 
		for (cp = line + len - 1; cp != (byte)'>'; cp--) {
			;
		}
		for (cp = cp + 1; cp < line + len && ((ModernizedCProgram.sane_ctype[(byte)(cp)] & (true)) != 0); cp++) {
			;
		}
		if (line + len <= cp) {
			;
		} 
		this.setDate_begin(cp);
		span = /*Error: Function owner not recognized*/strspn(cp, "0123456789");
		if (!span) {
			;
		} 
		Object generatedDate_begin = this.getDate_begin();
		this.setDate_end(generatedDate_begin + span);
		Object generatedDate_end = this.getDate_end();
		for (cp = generatedDate_end; cp < line + len && ((ModernizedCProgram.sane_ctype[(byte)(cp)] & (true)) != 0); cp++) {
			;
		}
		if (line + len <= cp || (cp != (byte)'+' && cp != (byte)'-')) {
			;
		} 
		this.setTz_begin(cp);
		span = /*Error: Function owner not recognized*/strspn(cp + 1, "0123456789");
		if (!span) {
			;
		} 
		Object generatedTz_begin = this.getTz_begin();
		this.setTz_end(generatedTz_begin + 1 + span);
		return 0;
		this.setDate_end(((Object)0));
		this.setTz_begin(((Object)0));
		this.setTz_end(((Object)0));
		return 0;
	}
	public Object getName_begin() {
		return name_begin;
	}
	public void setName_begin(Object newName_begin) {
		name_begin = newName_begin;
	}
	public Object getName_end() {
		return name_end;
	}
	public void setName_end(Object newName_end) {
		name_end = newName_end;
	}
	public Object getMail_begin() {
		return mail_begin;
	}
	public void setMail_begin(Object newMail_begin) {
		mail_begin = newMail_begin;
	}
	public Object getMail_end() {
		return mail_end;
	}
	public void setMail_end(Object newMail_end) {
		mail_end = newMail_end;
	}
	public Object getDate_begin() {
		return date_begin;
	}
	public void setDate_begin(Object newDate_begin) {
		date_begin = newDate_begin;
	}
	public Object getDate_end() {
		return date_end;
	}
	public void setDate_end(Object newDate_end) {
		date_end = newDate_end;
	}
	public Object getTz_begin() {
		return tz_begin;
	}
	public void setTz_begin(Object newTz_begin) {
		tz_begin = newTz_begin;
	}
	public Object getTz_end() {
		return tz_end;
	}
	public void setTz_end(Object newTz_end) {
		tz_end = newTz_end;
	}
}
