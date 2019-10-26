package application;

public class cmt_fmt_map {
	private Object name;
	private cmit_fmt format;
	private int is_tformat;
	private int expand_tabs_in_log;
	private int is_alias;
	private Object user_format;
	
	public cmt_fmt_map(Object name, cmit_fmt format, int is_tformat, int expand_tabs_in_log, int is_alias, Object user_format) {
		setName(name);
		setFormat(format);
		setIs_tformat(is_tformat);
		setExpand_tabs_in_log(expand_tabs_in_log);
		setIs_alias(is_alias);
		setUser_format(user_format);
	}
	public cmt_fmt_map() {
	}
	
	public cmt_fmt_map find_commit_format_recursive(Object sought, Object original, int num_redirections) {
		cmt_fmt_map found = ((Object)0);
		size_t found_match_len = 0;
		int i;
		if (num_redirections >= ModernizedCProgram.commit_formats_len) {
			ModernizedCProgram.die("invalid --pretty format: '%s' references an alias which points to itself", original);
		} 
		for (i = 0; i < ModernizedCProgram.commit_formats_len; i++) {
			size_t match_len = new size_t();
			if (!ModernizedCProgram.starts_with(commit_formats[i].getName(), sought)) {
				continue;
			} 
			match_len = .strlen(commit_formats[i].getName());
			if (found == ((Object)0) || found_match_len > match_len) {
				found = commit_formats[i];
				found_match_len = match_len;
			} 
		}
		int generatedIs_alias = found.getIs_alias();
		Object generatedUser_format = found.getUser_format();
		cmt_fmt_map cmt_fmt_map = new cmt_fmt_map();
		if (found && generatedIs_alias) {
			found = cmt_fmt_map.find_commit_format_recursive(generatedUser_format, original, num_redirections + 1);
		} 
		return found;
	}
	public cmt_fmt_map find_commit_format(Object sought) {
		if (!commit_formats) {
			ModernizedCProgram.setup_commit_formats();
		} 
		cmt_fmt_map cmt_fmt_map = new cmt_fmt_map();
		return cmt_fmt_map.find_commit_format_recursive(sought, sought, 0);
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public cmit_fmt getFormat() {
		return format;
	}
	public void setFormat(cmit_fmt newFormat) {
		format = newFormat;
	}
	public int getIs_tformat() {
		return is_tformat;
	}
	public void setIs_tformat(int newIs_tformat) {
		is_tformat = newIs_tformat;
	}
	public int getExpand_tabs_in_log() {
		return expand_tabs_in_log;
	}
	public void setExpand_tabs_in_log(int newExpand_tabs_in_log) {
		expand_tabs_in_log = newExpand_tabs_in_log;
	}
	public int getIs_alias() {
		return is_alias;
	}
	public void setIs_alias(int newIs_alias) {
		is_alias = newIs_alias;
	}
	public Object getUser_format() {
		return user_format;
	}
	public void setUser_format(Object newUser_format) {
		user_format = newUser_format;
	}
}
