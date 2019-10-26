package application;

// The offset for a search command is store in a soff struct
// Note: only spats[0].off is really used
public class soffset {
	private int dir;
	private int line;
	private int end;
	private long off;
	
	public soffset(int dir, int line, int end, long off) {
		setDir(dir);
		setLine(line);
		setEnd(end);
		setOff(off);
	}
	public soffset() {
	}
	
	public int getDir() {
		return dir;
	}
	public void setDir(int newDir) {
		dir = newDir;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int newLine) {
		line = newLine;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int newEnd) {
		end = newEnd;
	}
	public long getOff() {
		return off;
	}
	public void setOff(long newOff) {
		off = newOff;
	}
}
