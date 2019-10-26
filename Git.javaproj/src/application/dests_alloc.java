package application;

public class dests_alloc {
	private Object dests_node;
	private Object dests_ch;
	
	public dests_alloc(Object dests_node, Object dests_ch) {
		setDests_node(dests_node);
		setDests_ch(dests_ch);
	}
	public dests_alloc() {
	}
	
	public Object getDests_node() {
		return dests_node;
	}
	public void setDests_node(Object newDests_node) {
		dests_node = newDests_node;
	}
	public Object getDests_ch() {
		return dests_ch;
	}
	public void setDests_ch(Object newDests_ch) {
		dests_ch = newDests_ch;
	}
}
