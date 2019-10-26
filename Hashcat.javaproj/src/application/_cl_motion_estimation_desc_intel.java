package application;

public class _cl_motion_estimation_desc_intel {
	private Object mb_block_type;
	private Object subpixel_mode;
	private Object sad_adjust_mode;
	private Object search_path_type;
	
	public _cl_motion_estimation_desc_intel(Object mb_block_type, Object subpixel_mode, Object sad_adjust_mode, Object search_path_type) {
		setMb_block_type(mb_block_type);
		setSubpixel_mode(subpixel_mode);
		setSad_adjust_mode(sad_adjust_mode);
		setSearch_path_type(search_path_type);
	}
	public _cl_motion_estimation_desc_intel() {
	}
	
	public Object getMb_block_type() {
		return mb_block_type;
	}
	public void setMb_block_type(Object newMb_block_type) {
		mb_block_type = newMb_block_type;
	}
	public Object getSubpixel_mode() {
		return subpixel_mode;
	}
	public void setSubpixel_mode(Object newSubpixel_mode) {
		subpixel_mode = newSubpixel_mode;
	}
	public Object getSad_adjust_mode() {
		return sad_adjust_mode;
	}
	public void setSad_adjust_mode(Object newSad_adjust_mode) {
		sad_adjust_mode = newSad_adjust_mode;
	}
	public Object getSearch_path_type() {
		return search_path_type;
	}
	public void setSearch_path_type(Object newSearch_path_type) {
		search_path_type = newSearch_path_type;
	}
}
