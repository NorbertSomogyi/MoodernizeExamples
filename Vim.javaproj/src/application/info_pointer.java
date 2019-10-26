package application;

/*
 * things used in memline.c
 */
/*
 * When searching for a specific line, we remember what blocks in the tree
 * are the branches leading to that block. This is stored in ml_stack.  Each
 * entry is a pointer to info in a block (may be data block or pointer block)
 */
public class info_pointer {
	private Object ip_bnum;
	private Object ip_low;
	private Object ip_high;
	private int ip_index;
	
	public info_pointer(Object ip_bnum, Object ip_low, Object ip_high, int ip_index) {
		setIp_bnum(ip_bnum);
		setIp_low(ip_low);
		setIp_high(ip_high);
		setIp_index(ip_index);
	}
	public info_pointer() {
	}
	
	public Object getIp_bnum() {
		return ip_bnum;
	}
	public void setIp_bnum(Object newIp_bnum) {
		ip_bnum = newIp_bnum;
	}
	public Object getIp_low() {
		return ip_low;
	}
	public void setIp_low(Object newIp_low) {
		ip_low = newIp_low;
	}
	public Object getIp_high() {
		return ip_high;
	}
	public void setIp_high(Object newIp_high) {
		ip_high = newIp_high;
	}
	public int getIp_index() {
		return ip_index;
	}
	public void setIp_index(int newIp_index) {
		ip_index = newIp_index;
	}
}
