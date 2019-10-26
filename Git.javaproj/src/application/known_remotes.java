package application;

public class known_remotes {
	private remote to_delete;
	private known_remote list;
	
	public known_remotes(remote to_delete, known_remote list) {
		setTo_delete(to_delete);
		setList(list);
	}
	public known_remotes() {
	}
	
	public remote getTo_delete() {
		return to_delete;
	}
	public void setTo_delete(remote newTo_delete) {
		to_delete = newTo_delete;
	}
	public known_remote getList() {
		return list;
	}
	public void setList(known_remote newList) {
		list = newList;
	}
}
