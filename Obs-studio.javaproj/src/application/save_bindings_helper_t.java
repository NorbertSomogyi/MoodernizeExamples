package application;

public class save_bindings_helper_t {
	private obs_data_array array;
	private obs_hotkey hotkey;
	
	public save_bindings_helper_t(obs_data_array array, obs_hotkey hotkey) {
		setArray(array);
		setHotkey(hotkey);
	}
	public save_bindings_helper_t() {
	}
	
	public obs_data_array getArray() {
		return array;
	}
	public void setArray(obs_data_array newArray) {
		array = newArray;
	}
	public obs_hotkey getHotkey() {
		return hotkey;
	}
	public void setHotkey(obs_hotkey newHotkey) {
		hotkey = newHotkey;
	}
}
