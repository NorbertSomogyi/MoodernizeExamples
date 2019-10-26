package application;

/* Same as output_format = 0 but we know that -s flag was given
 * and we should not give default value to output_format.
 */
public class diff_flags {
	private int recursive;
	private int tree_in_recursive;
	private int binary;
	private int text;
	private int full_index;
	private int silent_on_remove;
	private int find_copies_harder;
	private int follow_renames;
	private int rename_empty;
	private int has_changes;
	private int quick;
	private int no_index;
	private int allow_external;
	private int exit_with_status;
	private int reverse_diff;
	private int check_failed;
	private int relative_name;
	private int ignore_submodules;
	private int dirstat_cumulative;
	private int dirstat_by_file;
	private int allow_textconv;
	private int textconv_set_via_cmdline;
	private int diff_from_contents;
	private int dirty_submodules;
	private int ignore_untracked_in_submodules;
	private int ignore_dirty_submodules;
	private int override_submodule_config;
	private int dirstat_by_line;
	private int funccontext;
	private int default_follow_renames;
	private int stat_with_summary;
	private int suppress_diff_headers;
	private int dual_color_diffed_diffs;
	private int suppress_hunk_header_line_count;
	
	public diff_flags(int recursive, int tree_in_recursive, int binary, int text, int full_index, int silent_on_remove, int find_copies_harder, int follow_renames, int rename_empty, int has_changes, int quick, int no_index, int allow_external, int exit_with_status, int reverse_diff, int check_failed, int relative_name, int ignore_submodules, int dirstat_cumulative, int dirstat_by_file, int allow_textconv, int textconv_set_via_cmdline, int diff_from_contents, int dirty_submodules, int ignore_untracked_in_submodules, int ignore_dirty_submodules, int override_submodule_config, int dirstat_by_line, int funccontext, int default_follow_renames, int stat_with_summary, int suppress_diff_headers, int dual_color_diffed_diffs, int suppress_hunk_header_line_count) {
		setRecursive(recursive);
		setTree_in_recursive(tree_in_recursive);
		setBinary(binary);
		setText(text);
		setFull_index(full_index);
		setSilent_on_remove(silent_on_remove);
		setFind_copies_harder(find_copies_harder);
		setFollow_renames(follow_renames);
		setRename_empty(rename_empty);
		setHas_changes(has_changes);
		setQuick(quick);
		setNo_index(no_index);
		setAllow_external(allow_external);
		setExit_with_status(exit_with_status);
		setReverse_diff(reverse_diff);
		setCheck_failed(check_failed);
		setRelative_name(relative_name);
		setIgnore_submodules(ignore_submodules);
		setDirstat_cumulative(dirstat_cumulative);
		setDirstat_by_file(dirstat_by_file);
		setAllow_textconv(allow_textconv);
		setTextconv_set_via_cmdline(textconv_set_via_cmdline);
		setDiff_from_contents(diff_from_contents);
		setDirty_submodules(dirty_submodules);
		setIgnore_untracked_in_submodules(ignore_untracked_in_submodules);
		setIgnore_dirty_submodules(ignore_dirty_submodules);
		setOverride_submodule_config(override_submodule_config);
		setDirstat_by_line(dirstat_by_line);
		setFunccontext(funccontext);
		setDefault_follow_renames(default_follow_renames);
		setStat_with_summary(stat_with_summary);
		setSuppress_diff_headers(suppress_diff_headers);
		setDual_color_diffed_diffs(dual_color_diffed_diffs);
		setSuppress_hunk_header_line_count(suppress_hunk_header_line_count);
	}
	public diff_flags() {
	}
	
	public void diff_flags_or(Object b) {
		byte tmp_a = (byte)a;
		byte tmp_b = (byte)b;
		int i;
		for (i = 0; i < ; i++) {
			tmp_a[i] |=  tmp_b[i];
		}
	}
	public int getRecursive() {
		return recursive;
	}
	public void setRecursive(int newRecursive) {
		recursive = newRecursive;
	}
	public int getTree_in_recursive() {
		return tree_in_recursive;
	}
	public void setTree_in_recursive(int newTree_in_recursive) {
		tree_in_recursive = newTree_in_recursive;
	}
	public int getBinary() {
		return binary;
	}
	public void setBinary(int newBinary) {
		binary = newBinary;
	}
	public int getText() {
		return text;
	}
	public void setText(int newText) {
		text = newText;
	}
	public int getFull_index() {
		return full_index;
	}
	public void setFull_index(int newFull_index) {
		full_index = newFull_index;
	}
	public int getSilent_on_remove() {
		return silent_on_remove;
	}
	public void setSilent_on_remove(int newSilent_on_remove) {
		silent_on_remove = newSilent_on_remove;
	}
	public int getFind_copies_harder() {
		return find_copies_harder;
	}
	public void setFind_copies_harder(int newFind_copies_harder) {
		find_copies_harder = newFind_copies_harder;
	}
	public int getFollow_renames() {
		return follow_renames;
	}
	public void setFollow_renames(int newFollow_renames) {
		follow_renames = newFollow_renames;
	}
	public int getRename_empty() {
		return rename_empty;
	}
	public void setRename_empty(int newRename_empty) {
		rename_empty = newRename_empty;
	}
	public int getHas_changes() {
		return has_changes;
	}
	public void setHas_changes(int newHas_changes) {
		has_changes = newHas_changes;
	}
	public int getQuick() {
		return quick;
	}
	public void setQuick(int newQuick) {
		quick = newQuick;
	}
	public int getNo_index() {
		return no_index;
	}
	public void setNo_index(int newNo_index) {
		no_index = newNo_index;
	}
	public int getAllow_external() {
		return allow_external;
	}
	public void setAllow_external(int newAllow_external) {
		allow_external = newAllow_external;
	}
	public int getExit_with_status() {
		return exit_with_status;
	}
	public void setExit_with_status(int newExit_with_status) {
		exit_with_status = newExit_with_status;
	}
	public int getReverse_diff() {
		return reverse_diff;
	}
	public void setReverse_diff(int newReverse_diff) {
		reverse_diff = newReverse_diff;
	}
	public int getCheck_failed() {
		return check_failed;
	}
	public void setCheck_failed(int newCheck_failed) {
		check_failed = newCheck_failed;
	}
	public int getRelative_name() {
		return relative_name;
	}
	public void setRelative_name(int newRelative_name) {
		relative_name = newRelative_name;
	}
	public int getIgnore_submodules() {
		return ignore_submodules;
	}
	public void setIgnore_submodules(int newIgnore_submodules) {
		ignore_submodules = newIgnore_submodules;
	}
	public int getDirstat_cumulative() {
		return dirstat_cumulative;
	}
	public void setDirstat_cumulative(int newDirstat_cumulative) {
		dirstat_cumulative = newDirstat_cumulative;
	}
	public int getDirstat_by_file() {
		return dirstat_by_file;
	}
	public void setDirstat_by_file(int newDirstat_by_file) {
		dirstat_by_file = newDirstat_by_file;
	}
	public int getAllow_textconv() {
		return allow_textconv;
	}
	public void setAllow_textconv(int newAllow_textconv) {
		allow_textconv = newAllow_textconv;
	}
	public int getTextconv_set_via_cmdline() {
		return textconv_set_via_cmdline;
	}
	public void setTextconv_set_via_cmdline(int newTextconv_set_via_cmdline) {
		textconv_set_via_cmdline = newTextconv_set_via_cmdline;
	}
	public int getDiff_from_contents() {
		return diff_from_contents;
	}
	public void setDiff_from_contents(int newDiff_from_contents) {
		diff_from_contents = newDiff_from_contents;
	}
	public int getDirty_submodules() {
		return dirty_submodules;
	}
	public void setDirty_submodules(int newDirty_submodules) {
		dirty_submodules = newDirty_submodules;
	}
	public int getIgnore_untracked_in_submodules() {
		return ignore_untracked_in_submodules;
	}
	public void setIgnore_untracked_in_submodules(int newIgnore_untracked_in_submodules) {
		ignore_untracked_in_submodules = newIgnore_untracked_in_submodules;
	}
	public int getIgnore_dirty_submodules() {
		return ignore_dirty_submodules;
	}
	public void setIgnore_dirty_submodules(int newIgnore_dirty_submodules) {
		ignore_dirty_submodules = newIgnore_dirty_submodules;
	}
	public int getOverride_submodule_config() {
		return override_submodule_config;
	}
	public void setOverride_submodule_config(int newOverride_submodule_config) {
		override_submodule_config = newOverride_submodule_config;
	}
	public int getDirstat_by_line() {
		return dirstat_by_line;
	}
	public void setDirstat_by_line(int newDirstat_by_line) {
		dirstat_by_line = newDirstat_by_line;
	}
	public int getFunccontext() {
		return funccontext;
	}
	public void setFunccontext(int newFunccontext) {
		funccontext = newFunccontext;
	}
	public int getDefault_follow_renames() {
		return default_follow_renames;
	}
	public void setDefault_follow_renames(int newDefault_follow_renames) {
		default_follow_renames = newDefault_follow_renames;
	}
	public int getStat_with_summary() {
		return stat_with_summary;
	}
	public void setStat_with_summary(int newStat_with_summary) {
		stat_with_summary = newStat_with_summary;
	}
	public int getSuppress_diff_headers() {
		return suppress_diff_headers;
	}
	public void setSuppress_diff_headers(int newSuppress_diff_headers) {
		suppress_diff_headers = newSuppress_diff_headers;
	}
	public int getDual_color_diffed_diffs() {
		return dual_color_diffed_diffs;
	}
	public void setDual_color_diffed_diffs(int newDual_color_diffed_diffs) {
		dual_color_diffed_diffs = newDual_color_diffed_diffs;
	}
	public int getSuppress_hunk_header_line_count() {
		return suppress_hunk_header_line_count;
	}
	public void setSuppress_hunk_header_line_count(int newSuppress_hunk_header_line_count) {
		suppress_hunk_header_line_count = newSuppress_hunk_header_line_count;
	}
}
/*
 * Fill the contents of the filespec "df", respecting any textconv defined by
 * its userdiff driver.  The "driver" parameter must come from a
 * previous call to get_textconv(), and therefore should either be NULL or have
 * textconv enabled.
 *
 * Note that the memory ownership of the resulting buffer depends on whether
 * the driver field is NULL. If it is, then the memory belongs to the filespec
 * struct. If it is non-NULL, then "outbuf" points to a newly allocated buffer
 * that should be freed by the caller.
 */
