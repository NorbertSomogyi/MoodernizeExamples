package application;

public class ondisk_untracked_cache {
	private stat_data info_exclude_stat;
	private stat_data excludes_file_stat;
	private Object dir_flags;
	
	public ondisk_untracked_cache(stat_data info_exclude_stat, stat_data excludes_file_stat, Object dir_flags) {
		setInfo_exclude_stat(info_exclude_stat);
		setExcludes_file_stat(excludes_file_stat);
		setDir_flags(dir_flags);
	}
	public ondisk_untracked_cache() {
	}
	
	public stat_data getInfo_exclude_stat() {
		return info_exclude_stat;
	}
	public void setInfo_exclude_stat(stat_data newInfo_exclude_stat) {
		info_exclude_stat = newInfo_exclude_stat;
	}
	public stat_data getExcludes_file_stat() {
		return excludes_file_stat;
	}
	public void setExcludes_file_stat(stat_data newExcludes_file_stat) {
		excludes_file_stat = newExcludes_file_stat;
	}
	public Object getDir_flags() {
		return dir_flags;
	}
	public void setDir_flags(Object newDir_flags) {
		dir_flags = newDir_flags;
	}
}
