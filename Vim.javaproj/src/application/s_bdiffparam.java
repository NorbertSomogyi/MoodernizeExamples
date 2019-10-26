package application;

public class s_bdiffparam {
	private long bsize;
	
	public s_bdiffparam(long bsize) {
		setBsize(bsize);
	}
	public s_bdiffparam() {
	}
	
	public long getBsize() {
		return bsize;
	}
	public void setBsize(long newBsize) {
		bsize = newBsize;
	}
}
