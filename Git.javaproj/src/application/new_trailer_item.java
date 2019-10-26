package application;

public class new_trailer_item {
	private list_head list;
	private Object text;
	private trailer_where where;
	private trailer_if_exists if_exists;
	private trailer_if_missing if_missing;
	
	public new_trailer_item(list_head list, Object text, trailer_where where, trailer_if_exists if_exists, trailer_if_missing if_missing) {
		setList(list);
		setText(text);
		setWhere(where);
		setIf_exists(if_exists);
		setIf_missing(if_missing);
	}
	public new_trailer_item() {
	}
	
	public list_head getList() {
		return list;
	}
	public void setList(list_head newList) {
		list = newList;
	}
	public Object getText() {
		return text;
	}
	public void setText(Object newText) {
		text = newText;
	}
	public trailer_where getWhere() {
		return where;
	}
	public void setWhere(trailer_where newWhere) {
		where = newWhere;
	}
	public trailer_if_exists getIf_exists() {
		return if_exists;
	}
	public void setIf_exists(trailer_if_exists newIf_exists) {
		if_exists = newIf_exists;
	}
	public trailer_if_missing getIf_missing() {
		return if_missing;
	}
	public void setIf_missing(trailer_if_missing newIf_missing) {
		if_missing = newIf_missing;
	}
}
