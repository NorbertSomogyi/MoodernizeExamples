package application;

public class flickcurl_comment_s {
	private Object id;
	private Object author;
	private Object authorname;
	private int datecreate;
	private Object permalink;
	private Object text;
	
	public flickcurl_comment_s(Object id, Object author, Object authorname, int datecreate, Object permalink, Object text) {
		setId(id);
		setAuthor(author);
		setAuthorname(authorname);
		setDatecreate(datecreate);
		setPermalink(permalink);
		setText(text);
	}
	public flickcurl_comment_s() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getAuthor() {
		return author;
	}
	public void setAuthor(Object newAuthor) {
		author = newAuthor;
	}
	public Object getAuthorname() {
		return authorname;
	}
	public void setAuthorname(Object newAuthorname) {
		authorname = newAuthorname;
	}
	public int getDatecreate() {
		return datecreate;
	}
	public void setDatecreate(int newDatecreate) {
		datecreate = newDatecreate;
	}
	public Object getPermalink() {
		return permalink;
	}
	public void setPermalink(Object newPermalink) {
		permalink = newPermalink;
	}
	public Object getText() {
		return text;
	}
	public void setText(Object newText) {
		text = newText;
	}
}
