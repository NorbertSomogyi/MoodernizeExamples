package application;

/* packs */
public class pack_info {
	private packed_git p;
	private int old_num;
	private int new_num;
	
	public pack_info(packed_git p, int old_num, int new_num) {
		setP(p);
		setOld_num(old_num);
		setNew_num(new_num);
	}
	public pack_info() {
	}
	
	public pack_info find_pack_by_name(Object name) {
		int i;
		for (i = 0; i < ModernizedCProgram.num_pack; i++) {
			packed_git p = info[i].getP();
			if (!.strcmp(p.pack_basename(), name)) {
				return info[i];
			} 
		}
		return ((Object)0/* Returns non-zero when we detect that the info in the
		 * old file is useless.
		 */);
	}
	public packed_git getP() {
		return p;
	}
	public void setP(packed_git newP) {
		p = newP;
	}
	public int getOld_num() {
		return old_num;
	}
	public void setOld_num(int newOld_num) {
		old_num = newOld_num;
	}
	public int getNew_num() {
		return new_num;
	}
	public void setNew_num(int newNew_num) {
		new_num = newNew_num;
	}
}
