package application;

public class msg_arg {
	private int given;
	private strbuf buf;
	
	public msg_arg(int given, strbuf buf) {
		setGiven(given);
		setBuf(buf);
	}
	public msg_arg() {
	}
	
	public int getGiven() {
		return given;
	}
	public void setGiven(int newGiven) {
		given = newGiven;
	}
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
}
