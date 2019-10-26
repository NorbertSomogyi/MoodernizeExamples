package application;

public class nr_trans {
	private mf_hashitem_S nt_hashitem;
	private Object nt_new_bnum;
	
	public nr_trans(mf_hashitem_S nt_hashitem, Object nt_new_bnum) {
		setNt_hashitem(nt_hashitem);
		setNt_new_bnum(nt_new_bnum);
	}
	public nr_trans() {
	}
	
	public mf_hashitem_S getNt_hashitem() {
		return nt_hashitem;
	}
	public void setNt_hashitem(mf_hashitem_S newNt_hashitem) {
		nt_hashitem = newNt_hashitem;
	}
	public Object getNt_new_bnum() {
		return nt_new_bnum;
	}
	public void setNt_new_bnum(Object newNt_new_bnum) {
		nt_new_bnum = newNt_new_bnum;
	}
}
