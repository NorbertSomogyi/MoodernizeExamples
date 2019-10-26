package application;

public class udf_dirent_s {
	private Byte psz_name;
	private Object b_dir;
	private Object b_parent;
	private udf_s p_udf;
	private Object i_part_start;
	private Object i_loc;
	private Object i_loc_end;
	private Object dir_left;
	private Object sector;
	private Object fid;
	private Object fe;
	
	public udf_dirent_s(Byte psz_name, Object b_dir, Object b_parent, udf_s p_udf, Object i_part_start, Object i_loc, Object i_loc_end, Object dir_left, Object sector, Object fid, Object fe) {
		setPsz_name(psz_name);
		setB_dir(b_dir);
		setB_parent(b_parent);
		setP_udf(p_udf);
		setI_part_start(i_part_start);
		setI_loc(i_loc);
		setI_loc_end(i_loc_end);
		setDir_left(dir_left);
		setSector(sector);
		setFid(fid);
		setFe(fe);
	}
	public udf_dirent_s() {
	}
	
	public Byte getPsz_name() {
		return psz_name;
	}
	public void setPsz_name(Byte newPsz_name) {
		psz_name = newPsz_name;
	}
	public Object getB_dir() {
		return b_dir;
	}
	public void setB_dir(Object newB_dir) {
		b_dir = newB_dir;
	}
	public Object getB_parent() {
		return b_parent;
	}
	public void setB_parent(Object newB_parent) {
		b_parent = newB_parent;
	}
	public udf_s getP_udf() {
		return p_udf;
	}
	public void setP_udf(udf_s newP_udf) {
		p_udf = newP_udf;
	}
	public Object getI_part_start() {
		return i_part_start;
	}
	public void setI_part_start(Object newI_part_start) {
		i_part_start = newI_part_start;
	}
	public Object getI_loc() {
		return i_loc;
	}
	public void setI_loc(Object newI_loc) {
		i_loc = newI_loc;
	}
	public Object getI_loc_end() {
		return i_loc_end;
	}
	public void setI_loc_end(Object newI_loc_end) {
		i_loc_end = newI_loc_end;
	}
	public Object getDir_left() {
		return dir_left;
	}
	public void setDir_left(Object newDir_left) {
		dir_left = newDir_left;
	}
	public Object getSector() {
		return sector;
	}
	public void setSector(Object newSector) {
		sector = newSector;
	}
	public Object getFid() {
		return fid;
	}
	public void setFid(Object newFid) {
		fid = newFid;
	}
	public Object getFe() {
		return fe;
	}
	public void setFe(Object newFe) {
		fe = newFe;
	}
}
