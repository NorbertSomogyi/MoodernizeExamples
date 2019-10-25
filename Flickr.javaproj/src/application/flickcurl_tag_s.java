package application;

public class flickcurl_tag_s {
	private Object photo;
	private Object id;
	private Object author;
	private Object authorname;
	private Object raw;
	private Object cooked;
	private int machine_tag;
	private int count;
	
	public flickcurl_tag_s(Object photo, Object id, Object author, Object authorname, Object raw, Object cooked, int machine_tag, int count) {
		setPhoto(photo);
		setId(id);
		setAuthor(author);
		setAuthorname(authorname);
		setRaw(raw);
		setCooked(cooked);
		setMachine_tag(machine_tag);
		setCount(count);
	}
	public flickcurl_tag_s() {
	}
	
	public Object getPhoto() {
		return photo;
	}
	public void setPhoto(Object newPhoto) {
		photo = newPhoto;
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
	public Object getRaw() {
		return raw;
	}
	public void setRaw(Object newRaw) {
		raw = newRaw;
	}
	public Object getCooked() {
		return cooked;
	}
	public void setCooked(Object newCooked) {
		cooked = newCooked;
	}
	public int getMachine_tag() {
		return machine_tag;
	}
	public void setMachine_tag(int newMachine_tag) {
		machine_tag = newMachine_tag;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
}
