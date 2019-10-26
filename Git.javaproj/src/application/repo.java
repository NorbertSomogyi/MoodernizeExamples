package application;

public class repo {
	private Byte url;
	private Byte path;
	private int path_len;
	private int has_info_refs;
	private int can_update_info_refs;
	private int has_info_packs;
	private packed_git packs;
	private remote_lock locks;
	
	public repo(Byte url, Byte path, int path_len, int has_info_refs, int can_update_info_refs, int has_info_packs, packed_git packs, remote_lock locks) {
		setUrl(url);
		setPath(path);
		setPath_len(path_len);
		setHas_info_refs(has_info_refs);
		setCan_update_info_refs(can_update_info_refs);
		setHas_info_packs(has_info_packs);
		setPacks(packs);
		setLocks(locks);
	}
	public repo() {
	}
	
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public int getPath_len() {
		return path_len;
	}
	public void setPath_len(int newPath_len) {
		path_len = newPath_len;
	}
	public int getHas_info_refs() {
		return has_info_refs;
	}
	public void setHas_info_refs(int newHas_info_refs) {
		has_info_refs = newHas_info_refs;
	}
	public int getCan_update_info_refs() {
		return can_update_info_refs;
	}
	public void setCan_update_info_refs(int newCan_update_info_refs) {
		can_update_info_refs = newCan_update_info_refs;
	}
	public int getHas_info_packs() {
		return has_info_packs;
	}
	public void setHas_info_packs(int newHas_info_packs) {
		has_info_packs = newHas_info_packs;
	}
	public packed_git getPacks() {
		return packs;
	}
	public void setPacks(packed_git newPacks) {
		packs = newPacks;
	}
	public remote_lock getLocks() {
		return locks;
	}
	public void setLocks(remote_lock newLocks) {
		locks = newLocks;
	}
}
