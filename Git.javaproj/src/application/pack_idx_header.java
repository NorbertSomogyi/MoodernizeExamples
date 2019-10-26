package application;

public class pack_idx_header {
	private Object idx_signature;
	private Object idx_version;
	
	public pack_idx_header(Object idx_signature, Object idx_version) {
		setIdx_signature(idx_signature);
		setIdx_version(idx_version);
	}
	public pack_idx_header() {
	}
	
	public Object getIdx_signature() {
		return idx_signature;
	}
	public void setIdx_signature(Object newIdx_signature) {
		idx_signature = newIdx_signature;
	}
	public Object getIdx_version() {
		return idx_version;
	}
	public void setIdx_version(Object newIdx_version) {
		idx_version = newIdx_version;
	}
}
