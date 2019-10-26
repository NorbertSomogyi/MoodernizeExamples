package application;

public class _CdioListNode {
	private Object list;
	private Object next;
	private Object data;
	
	public _CdioListNode(Object list, Object next, Object data) {
		setList(list);
		setNext(next);
		setData(data);
	}
	public _CdioListNode() {
	}
	
	public Object getList() {
		return list;
	}
	public void setList(Object newList) {
		list = newList;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
