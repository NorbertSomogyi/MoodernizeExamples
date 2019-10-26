package application;

/** ICB Tag (ECMA 167r3 4/14.6) */
public class udf_icbtag_s {
	private Object prev_num_dirs;
	private Object strat_type;
	private Object strat_param;
	private Object max_num_entries;
	private Object reserved;
	private Object file_type;
	private udf_lb_addr_s parent_ICB;
	private Object flags;
	
	public udf_icbtag_s(Object prev_num_dirs, Object strat_type, Object strat_param, Object max_num_entries, Object reserved, Object file_type, udf_lb_addr_s parent_ICB, Object flags) {
		setPrev_num_dirs(prev_num_dirs);
		setStrat_type(strat_type);
		setStrat_param(strat_param);
		setMax_num_entries(max_num_entries);
		setReserved(reserved);
		setFile_type(file_type);
		setParent_ICB(parent_ICB);
		setFlags(flags);
	}
	public udf_icbtag_s() {
	}
	
	public Object getPrev_num_dirs() {
		return prev_num_dirs;
	}
	public void setPrev_num_dirs(Object newPrev_num_dirs) {
		prev_num_dirs = newPrev_num_dirs;
	}
	public Object getStrat_type() {
		return strat_type;
	}
	public void setStrat_type(Object newStrat_type) {
		strat_type = newStrat_type;
	}
	public Object getStrat_param() {
		return strat_param;
	}
	public void setStrat_param(Object newStrat_param) {
		strat_param = newStrat_param;
	}
	public Object getMax_num_entries() {
		return max_num_entries;
	}
	public void setMax_num_entries(Object newMax_num_entries) {
		max_num_entries = newMax_num_entries;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getFile_type() {
		return file_type;
	}
	public void setFile_type(Object newFile_type) {
		file_type = newFile_type;
	}
	public udf_lb_addr_s getParent_ICB() {
		return parent_ICB;
	}
	public void setParent_ICB(udf_lb_addr_s newParent_ICB) {
		parent_ICB = newParent_ICB;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
}
/** Strategy Type (ECMA 167r3 4/14.6.2) which helpfully points
    largely to 4/A.x */
/**< 4/A.2 Direct entries Uint16 */
/**< 4/A.3 List of ICB direct entries */
/**< 4/A.4 */
