package application;

public class handle_split_cb_data {
	private blame_scoreboard sb;
	private blame_entry ent;
	private blame_origin parent;
	private blame_entry split;
	private long plno;
	private long tlno;
	
	public handle_split_cb_data(blame_scoreboard sb, blame_entry ent, blame_origin parent, blame_entry split, long plno, long tlno) {
		setSb(sb);
		setEnt(ent);
		setParent(parent);
		setSplit(split);
		setPlno(plno);
		setTlno(tlno);
	}
	public handle_split_cb_data() {
	}
	
	public blame_scoreboard getSb() {
		return sb;
	}
	public void setSb(blame_scoreboard newSb) {
		sb = newSb;
	}
	public blame_entry getEnt() {
		return ent;
	}
	public void setEnt(blame_entry newEnt) {
		ent = newEnt;
	}
	public blame_origin getParent() {
		return parent;
	}
	public void setParent(blame_origin newParent) {
		parent = newParent;
	}
	public blame_entry getSplit() {
		return split;
	}
	public void setSplit(blame_entry newSplit) {
		split = newSplit;
	}
	public long getPlno() {
		return plno;
	}
	public void setPlno(long newPlno) {
		plno = newPlno;
	}
	public long getTlno() {
		return tlno;
	}
	public void setTlno(long newTlno) {
		tlno = newTlno;
	}
}
