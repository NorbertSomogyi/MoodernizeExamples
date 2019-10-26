package application;

public class blame_line_tracker {
	private int is_parent;
	private int s_lno;
	
	public blame_line_tracker(int is_parent, int s_lno) {
		setIs_parent(is_parent);
		setS_lno(s_lno);
	}
	public blame_line_tracker() {
	}
	
	public int are_lines_adjacent(blame_line_tracker second) {
		int generatedIs_parent = this.getIs_parent();
		int generatedS_lno = this.getS_lno();
		return generatedIs_parent == generatedIs_parent && generatedS_lno + 1 == generatedS_lno;
	}
	public int getIs_parent() {
		return is_parent;
	}
	public void setIs_parent(int newIs_parent) {
		is_parent = newIs_parent;
	}
	public int getS_lno() {
		return s_lno;
	}
	public void setS_lno(int newS_lno) {
		s_lno = newS_lno;
	}
}
