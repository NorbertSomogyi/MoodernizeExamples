package application;

public class decoration_filter {
	private string_list include_ref_pattern;
	private string_list exclude_ref_pattern;
	
	public decoration_filter(string_list include_ref_pattern, string_list exclude_ref_pattern) {
		setInclude_ref_pattern(include_ref_pattern);
		setExclude_ref_pattern(exclude_ref_pattern);
	}
	public decoration_filter() {
	}
	
	public void load_ref_decorations(int flags) {
		byte generatedString = item.getString();
		if (!ModernizedCProgram.decoration_loaded) {
			if (ModernizedCProgram.filter) {
				string_list_item item = new string_list_item();
				for (item = (ModernizedCProgram.filter.getExclude_ref_pattern()).getItems(); item && item < (ModernizedCProgram.filter.getExclude_ref_pattern()).getItems() + (ModernizedCProgram.filter.getExclude_ref_pattern()).getNr(); ++item) {
					item.normalize_glob_ref(((Object)0), generatedString);
				}
				for (item = (ModernizedCProgram.filter.getInclude_ref_pattern()).getItems(); item && item < (ModernizedCProgram.filter.getInclude_ref_pattern()).getItems() + (ModernizedCProgram.filter.getInclude_ref_pattern()).getNr(); ++item) {
					item.normalize_glob_ref(((Object)0), generatedString);
				}
			} 
			ModernizedCProgram.decoration_loaded = 1;
			ModernizedCProgram.decoration_flags = flags;
			ModernizedCProgram.for_each_ref(add_ref_decoration, ModernizedCProgram.filter);
			ModernizedCProgram.head_ref(add_ref_decoration, ModernizedCProgram.filter);
			.for_each_commit_graft(add_graft_decoration, ModernizedCProgram.filter);
		} 
	}
	public string_list getInclude_ref_pattern() {
		return include_ref_pattern;
	}
	public void setInclude_ref_pattern(string_list newInclude_ref_pattern) {
		include_ref_pattern = newInclude_ref_pattern;
	}
	public string_list getExclude_ref_pattern() {
		return exclude_ref_pattern;
	}
	public void setExclude_ref_pattern(string_list newExclude_ref_pattern) {
		exclude_ref_pattern = newExclude_ref_pattern;
	}
}
