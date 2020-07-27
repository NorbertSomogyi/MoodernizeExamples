package application;

public class combine_diff_state {
	private int lno;
	private int ob;
	private int on;
	private int nb;
	private int nn;
	private long nmask;
	private int num_parent;
	private int n;
	private sline[] sline;
	private sline lost_bucket;
	
	public combine_diff_state(int lno, int ob, int on, int nb, int nn, long nmask, int num_parent, int n, sline[] sline, sline lost_bucket) {
		setLno(lno);
		setOb(ob);
		setOn(on);
		setNb(nb);
		setNn(nn);
		setNmask(nmask);
		setNum_parent(num_parent);
		setN(n);
		setSline(sline);
		setLost_bucket(lost_bucket);
	}
	public combine_diff_state() {
	}
	
	public int getLno() {
		return lno;
	}
	public void setLno(int newLno) {
		lno = newLno;
	}
	public int getOb() {
		return ob;
	}
	public void setOb(int newOb) {
		ob = newOb;
	}
	public int getOn() {
		return on;
	}
	public void setOn(int newOn) {
		on = newOn;
	}
	public int getNb() {
		return nb;
	}
	public void setNb(int newNb) {
		nb = newNb;
	}
	public int getNn() {
		return nn;
	}
	public void setNn(int newNn) {
		nn = newNn;
	}
	public long getNmask() {
		return nmask;
	}
	public void setNmask(long newNmask) {
		nmask = newNmask;
	}
	public int getNum_parent() {
		return num_parent;
	}
	public void setNum_parent(int newNum_parent) {
		num_parent = newNum_parent;
	}
	public int getN() {
		return n;
	}
	public void setN(int newN) {
		n = newN;
	}
	public sline[] getSline() {
		return sline;
	}
	public void setSline(sline[] newSline) {
		sline = newSline;
	}
	public sline getLost_bucket() {
		return lost_bucket;
	}
	public void setLost_bucket(sline newLost_bucket) {
		lost_bucket = newLost_bucket;
	}
}
