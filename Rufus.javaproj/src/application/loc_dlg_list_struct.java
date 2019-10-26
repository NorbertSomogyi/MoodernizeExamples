package application;

public class loc_dlg_list_struct {
	private Object dlg_id;
	private Object hDlg;
	private list_head list;
	
	public loc_dlg_list_struct(Object dlg_id, Object hDlg, list_head list) {
		setDlg_id(dlg_id);
		setHDlg(hDlg);
		setList(list);
	}
	public loc_dlg_list_struct() {
	}
	
	public Object getDlg_id() {
		return dlg_id;
	}
	public void setDlg_id(Object newDlg_id) {
		dlg_id = newDlg_id;
	}
	public Object getHDlg() {
		return hDlg;
	}
	public void setHDlg(Object newHDlg) {
		hDlg = newHDlg;
	}
	public list_head getList() {
		return list;
	}
	public void setList(list_head newList) {
		list = newList;
	}
}
