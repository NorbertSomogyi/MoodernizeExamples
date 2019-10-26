package application;

public class outd {
	private int outfile;
	private int check;
	private long crc;
	private long total;
	
	public outd(int outfile, int check, long crc, long total) {
		setOutfile(outfile);
		setCheck(check);
		setCrc(crc);
		setTotal(total);
	}
	public outd() {
	}
	
	public int getOutfile() {
		return outfile;
	}
	public void setOutfile(int newOutfile) {
		outfile = newOutfile;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int newCheck) {
		check = newCheck;
	}
	public long getCrc() {
		return crc;
	}
	public void setCrc(long newCrc) {
		crc = newCrc;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long newTotal) {
		total = newTotal;
	}
}
