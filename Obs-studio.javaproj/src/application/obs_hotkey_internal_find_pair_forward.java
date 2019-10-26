package application;

public class obs_hotkey_internal_find_pair_forward {
	private Object id;
	private Object found;
	private Object idx;
	
	public obs_hotkey_internal_find_pair_forward(Object id, Object found, Object idx) {
		setId(id);
		setFound(found);
		setIdx(idx);
	}
	public obs_hotkey_internal_find_pair_forward() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getFound() {
		return found;
	}
	public void setFound(Object newFound) {
		found = newFound;
	}
	public Object getIdx() {
		return idx;
	}
	public void setIdx(Object newIdx) {
		idx = newIdx;
	}
}
