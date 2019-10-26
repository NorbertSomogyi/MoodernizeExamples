package application;

public class binding_find_data {
	private Object id;
	private Object idx;
	private Object found;
	
	public binding_find_data(Object id, Object idx, Object found) {
		setId(id);
		setIdx(idx);
		setFound(found);
	}
	public binding_find_data() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getIdx() {
		return idx;
	}
	public void setIdx(Object newIdx) {
		idx = newIdx;
	}
	public Object getFound() {
		return found;
	}
	public void setFound(Object newFound) {
		found = newFound;
	}
}
