package application;

public class SearchedFile {
	private _iobuf fp;
	private Object name;
	private Object lnum;
	private int matched;
	
	public SearchedFile(_iobuf fp, Object name, Object lnum, int matched) {
		setFp(fp);
		setName(name);
		setLnum(lnum);
		setMatched(matched);
	}
	public SearchedFile() {
	}
	
	public _iobuf getFp() {
		return fp;
	}
	public void setFp(_iobuf newFp) {
		fp = newFp;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getLnum() {
		return lnum;
	}
	public void setLnum(Object newLnum) {
		lnum = newLnum;
	}
	public int getMatched() {
		return matched;
	}
	public void setMatched(int newMatched) {
		matched = newMatched;
	}
}
