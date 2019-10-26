package application;

public class obs_module_info {
	private Object bin_path;
	private Object data_path;
	
	public obs_module_info(Object bin_path, Object data_path) {
		setBin_path(bin_path);
		setData_path(data_path);
	}
	public obs_module_info() {
	}
	
	public Object getBin_path() {
		return bin_path;
	}
	public void setBin_path(Object newBin_path) {
		bin_path = newBin_path;
	}
	public Object getData_path() {
		return data_path;
	}
	public void setData_path(Object newData_path) {
		data_path = newData_path;
	}
}
