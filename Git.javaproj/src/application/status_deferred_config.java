package application;

public class status_deferred_config {
	private wt_status_format status_format;
	private int show_branch;
	private ahead_behind_flags ahead_behind;
	
	public status_deferred_config(wt_status_format status_format, int show_branch, ahead_behind_flags ahead_behind) {
		setStatus_format(status_format);
		setShow_branch(show_branch);
		setAhead_behind(ahead_behind);
	}
	public status_deferred_config() {
	}
	
	public wt_status_format getStatus_format() {
		return status_format;
	}
	public void setStatus_format(wt_status_format newStatus_format) {
		status_format = newStatus_format;
	}
	public int getShow_branch() {
		return show_branch;
	}
	public void setShow_branch(int newShow_branch) {
		show_branch = newShow_branch;
	}
	public ahead_behind_flags getAhead_behind() {
		return ahead_behind;
	}
	public void setAhead_behind(ahead_behind_flags newAhead_behind) {
		ahead_behind = newAhead_behind;
	}
}
