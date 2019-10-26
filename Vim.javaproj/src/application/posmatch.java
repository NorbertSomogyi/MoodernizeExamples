package application;

public class posmatch {
	private Object pos;
	private int cur;
	private Object toplnum;
	private Object botlnum;
	
	public posmatch(Object pos, int cur, Object toplnum, Object botlnum) {
		setPos(pos);
		setCur(cur);
		setToplnum(toplnum);
		setBotlnum(botlnum);
	}
	public posmatch() {
	}
	
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public int getCur() {
		return cur;
	}
	public void setCur(int newCur) {
		cur = newCur;
	}
	public Object getToplnum() {
		return toplnum;
	}
	public void setToplnum(Object newToplnum) {
		toplnum = newToplnum;
	}
	public Object getBotlnum() {
		return botlnum;
	}
	public void setBotlnum(Object newBotlnum) {
		botlnum = newBotlnum;
	}
}
