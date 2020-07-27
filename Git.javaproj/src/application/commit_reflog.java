package application;

public class commit_reflog {
	private int recno;
	private selector_type selector;
	private complete_reflogs reflogs;
	
	public commit_reflog(int recno, selector_type selector, complete_reflogs reflogs) {
		setRecno(recno);
		setSelector(selector);
		setReflogs(reflogs);
	}
	public commit_reflog() {
	}
	
	public Object log_timestamp() {
		complete_reflogs generatedReflogs = this.getReflogs();
		reflog_info[] generatedItems = generatedReflogs.getItems();
		int generatedRecno = this.getRecno();
		return generatedItems[generatedRecno].getTimestamp();
	}
	public int getRecno() {
		return recno;
	}
	public void setRecno(int newRecno) {
		recno = newRecno;
	}
	public selector_type getSelector() {
		return selector;
	}
	public void setSelector(selector_type newSelector) {
		selector = newSelector;
	}
	public complete_reflogs getReflogs() {
		return reflogs;
	}
	public void setReflogs(complete_reflogs newReflogs) {
		reflogs = newReflogs;
	}
}
