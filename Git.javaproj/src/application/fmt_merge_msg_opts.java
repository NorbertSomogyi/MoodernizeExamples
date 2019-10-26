package application;

public class fmt_merge_msg_opts {
	private int add_title;
	private int credit_people;
	private int shortlog_len;
	
	public fmt_merge_msg_opts(int add_title, int credit_people, int shortlog_len) {
		setAdd_title(add_title);
		setCredit_people(credit_people);
		setShortlog_len(shortlog_len);
	}
	public fmt_merge_msg_opts() {
	}
	
	public int getAdd_title() {
		return add_title;
	}
	public void setAdd_title(int newAdd_title) {
		add_title = newAdd_title;
	}
	public int getCredit_people() {
		return credit_people;
	}
	public void setCredit_people(int newCredit_people) {
		credit_people = newCredit_people;
	}
	public int getShortlog_len() {
		return shortlog_len;
	}
	public void setShortlog_len(int newShortlog_len) {
		shortlog_len = newShortlog_len;
	}
}
/**
 * If a built-in has DELAY_PAGER_CONFIG set, the built-in should call this early
 * when it wishes to respect the `pager.foo`-config. The `cmd` is the name of
 * the built-in, e.g., "foo". If a paging-choice has already been setup, this
 * does nothing. The default in `def` should be 0 for "pager off", 1 for "pager
 * on" or -1 for "punt".
 *
 * You should most likely use a default of 0 or 1. "Punt" (-1) could be useful
 * to be able to fall back to some historical compatibility name.
 */
