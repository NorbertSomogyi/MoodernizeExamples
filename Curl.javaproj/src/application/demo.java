package application;

public class demo {
	private Object dohbuffer;
	private byte canary1;
	private byte canary2;
	private byte canary3;
	
	public demo(Object dohbuffer, byte canary1, byte canary2, byte canary3) {
		setDohbuffer(dohbuffer);
		setCanary1(canary1);
		setCanary2(canary2);
		setCanary3(canary3);
	}
	public demo() {
	}
	
	public Object getDohbuffer() {
		return dohbuffer;
	}
	public void setDohbuffer(Object newDohbuffer) {
		dohbuffer = newDohbuffer;
	}
	public byte getCanary1() {
		return canary1;
	}
	public void setCanary1(byte newCanary1) {
		canary1 = newCanary1;
	}
	public byte getCanary2() {
		return canary2;
	}
	public void setCanary2(byte newCanary2) {
		canary2 = newCanary2;
	}
	public byte getCanary3() {
		return canary3;
	}
	public void setCanary3(byte newCanary3) {
		canary3 = newCanary3;
	}
}
