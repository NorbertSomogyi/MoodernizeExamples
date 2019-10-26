package application;

public class _llist_t {
	private _llist_t link;
	private Byte data;
	
	public _llist_t(_llist_t link, Byte data) {
		setLink(link);
		setData(data);
	}
	public _llist_t() {
	}
	
	public _llist_t getLink() {
		return link;
	}
	public void setLink(_llist_t newLink) {
		link = newLink;
	}
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
}
