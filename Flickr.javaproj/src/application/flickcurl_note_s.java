package application;

public class flickcurl_note_s {
	private int id;
	private Object author;
	private Object authorname;
	private int x;
	private int y;
	private int w;
	private int h;
	private Object text;
	
	public flickcurl_note_s(int id, Object author, Object authorname, int x, int y, int w, int h, Object text) {
		setId(id);
		setAuthor(author);
		setAuthorname(authorname);
		setX(x);
		setY(y);
		setW(w);
		setH(h);
		setText(text);
	}
	public flickcurl_note_s() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int newId) {
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
	public int getX() {
		return x;
	}
	public void setX(int newX) {
		x = newX;
	}
	public int getY() {
		return y;
	}
	public void setY(int newY) {
		y = newY;
	}
	public int getW() {
		return w;
	}
	public void setW(int newW) {
		w = newW;
	}
	public int getH() {
		return h;
	}
	public void setH(int newH) {
		h = newH;
	}
	public Object getText() {
		return text;
	}
	public void setText(Object newText) {
		text = newText;
	}
}
