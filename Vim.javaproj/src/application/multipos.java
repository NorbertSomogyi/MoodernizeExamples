package application;

public class multipos {
	private Object start_lnum;
	private Object end_lnum;
	private Object start_col;
	private Object end_col;
	
	public multipos(Object start_lnum, Object end_lnum, Object start_col, Object end_col) {
		setStart_lnum(start_lnum);
		setEnd_lnum(end_lnum);
		setStart_col(start_col);
		setEnd_col(end_col);
	}
	public multipos() {
	}
	
	public Object getStart_lnum() {
		return start_lnum;
	}
	public void setStart_lnum(Object newStart_lnum) {
		start_lnum = newStart_lnum;
	}
	public Object getEnd_lnum() {
		return end_lnum;
	}
	public void setEnd_lnum(Object newEnd_lnum) {
		end_lnum = newEnd_lnum;
	}
	public Object getStart_col() {
		return start_col;
	}
	public void setStart_col(Object newStart_col) {
		start_col = newStart_col;
	}
	public Object getEnd_col() {
		return end_col;
	}
	public void setEnd_col(Object newEnd_col) {
		end_col = newEnd_col;
	}
}
