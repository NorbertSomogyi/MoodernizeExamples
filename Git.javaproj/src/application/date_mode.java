package application;

public class date_mode {
	private date_mode_type type;
	private Object strftime_fmt;
	private int local;
	
	public date_mode(date_mode_type type, Object strftime_fmt, int local) {
		setType(type);
		setStrftime_fmt(strftime_fmt);
		setLocal(local);
	}
	public date_mode() {
	}
	
	public date_mode date_mode_from_type(date_mode_type type) {
		date_mode mode = new date_mode();
		if (date_mode_type.type == date_mode_type.DATE_STRFTIME) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\date.c", 210, "cannot create anonymous strftime date_mode struct");
		} 
		mode.setType(date_mode_type.type);
		mode.setLocal(0);
		return mode;
	}
	public void parse_date_format(Object format) {
		byte p;
		if (ModernizedCProgram.skip_prefix(format, "auto:", /* "auto:foo" is "if tty/pager, then foo, otherwise normal" */p)) {
			if (/*Error: Function owner not recognized*/isatty(1) || ModernizedCProgram.pager_in_use()) {
				format = p;
			} else {
					format = "default";
			} 
		} 
		if (!/*Error: Function owner not recognized*/strcmp(format, /* historical alias */"local")) {
			format = "default-local";
		} 
		this.setType(ModernizedCProgram.parse_date_type(format, p));
		this.setLocal(0);
		if (ModernizedCProgram.skip_prefix(p, "-local", p)) {
			this.setLocal(1);
		} 
		date_mode_type generatedType = this.getType();
		if (generatedType == date_mode_type.DATE_STRFTIME) {
			if (!ModernizedCProgram.skip_prefix(p, ":", p)) {
				ModernizedCProgram.die("date format missing colon separator: %s", format);
			} 
			this.setStrftime_fmt(ModernizedCProgram.xstrdup(p));
		}  else if (p) {
			ModernizedCProgram.die("unknown date format %s", format);
		} 
	}
	public date_mode_type getType() {
		return type;
	}
	public void setType(date_mode_type newType) {
		type = newType;
	}
	public Object getStrftime_fmt() {
		return strftime_fmt;
	}
	public void setStrftime_fmt(Object newStrftime_fmt) {
		strftime_fmt = newStrftime_fmt;
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int newLocal) {
		local = newLocal;
	}
}
/*
 * Compare split idents for equality or strict ordering. Note that we
 * compare only the ident part of the line, ignoring any timestamp.
 *
 * Because there are two fields, we must choose one as the primary key; we
 * currently arbitrarily pick the email.
 */
