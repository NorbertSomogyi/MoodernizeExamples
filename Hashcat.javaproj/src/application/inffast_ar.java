package application;

public class inffast_ar {
	private Object esp;
	private Object ebp;
	private Byte in;
	private Byte last;
	private Byte out;
	private Byte beg;
	private Byte end;
	private Byte window;
	private Object lcode;
	private Object dcode;
	private long hold;
	private int bits;
	private int wsize;
	private int write;
	private int lmask;
	private int dmask;
	private int len;
	private int dist;
	private int status;
	
	public inffast_ar(Object esp, Object ebp, Byte in, Byte last, Byte out, Byte beg, Byte end, Byte window, Object lcode, Object dcode, long hold, int bits, int wsize, int write, int lmask, int dmask, int len, int dist, int status) {
		setEsp(esp);
		setEbp(ebp);
		setIn(in);
		setLast(last);
		setOut(out);
		setBeg(beg);
		setEnd(end);
		setWindow(window);
		setLcode(lcode);
		setDcode(dcode);
		setHold(hold);
		setBits(bits);
		setWsize(wsize);
		setWrite(write);
		setLmask(lmask);
		setDmask(dmask);
		setLen(len);
		setDist(dist);
		setStatus(status);
	}
	public inffast_ar() {
	}
	
	public Object getEsp() {
		return esp;
	}
	public void setEsp(Object newEsp) {
		esp = newEsp;
	}
	public Object getEbp() {
		return ebp;
	}
	public void setEbp(Object newEbp) {
		ebp = newEbp;
	}
	public Byte getIn() {
		return in;
	}
	public void setIn(Byte newIn) {
		in = newIn;
	}
	public Byte getLast() {
		return last;
	}
	public void setLast(Byte newLast) {
		last = newLast;
	}
	public Byte getOut() {
		return out;
	}
	public void setOut(Byte newOut) {
		out = newOut;
	}
	public Byte getBeg() {
		return beg;
	}
	public void setBeg(Byte newBeg) {
		beg = newBeg;
	}
	public Byte getEnd() {
		return end;
	}
	public void setEnd(Byte newEnd) {
		end = newEnd;
	}
	public Byte getWindow() {
		return window;
	}
	public void setWindow(Byte newWindow) {
		window = newWindow;
	}
	public Object getLcode() {
		return lcode;
	}
	public void setLcode(Object newLcode) {
		lcode = newLcode;
	}
	public Object getDcode() {
		return dcode;
	}
	public void setDcode(Object newDcode) {
		dcode = newDcode;
	}
	public long getHold() {
		return hold;
	}
	public void setHold(long newHold) {
		hold = newHold;
	}
	public int getBits() {
		return bits;
	}
	public void setBits(int newBits) {
		bits = newBits;
	}
	public int getWsize() {
		return wsize;
	}
	public void setWsize(int newWsize) {
		wsize = newWsize;
	}
	public int getWrite() {
		return write;
	}
	public void setWrite(int newWrite) {
		write = newWrite;
	}
	public int getLmask() {
		return lmask;
	}
	public void setLmask(int newLmask) {
		lmask = newLmask;
	}
	public int getDmask() {
		return dmask;
	}
	public void setDmask(int newDmask) {
		dmask = newDmask;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int newDist) {
		dist = newDist;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int newStatus) {
		status = newStatus;
	}
}
