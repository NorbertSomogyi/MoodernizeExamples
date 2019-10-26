package application;

public class dg_header_entry {
	private int dg_start;
	private Byte dg_header;
	
	public dg_header_entry(int dg_start, Byte dg_header) {
		setDg_start(dg_start);
		setDg_header(dg_header);
	}
	public dg_header_entry() {
	}
	
	public int getDg_start() {
		return dg_start;
	}
	public void setDg_start(int newDg_start) {
		dg_start = newDg_start;
	}
	public Byte getDg_header() {
		return dg_header;
	}
	public void setDg_header(Byte newDg_header) {
		dg_header = newDg_header;
	}
}
