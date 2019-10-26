package application;

public class s_xdalgoenv {
	private long mxcost;
	private long snake_cnt;
	private long heur_min;
	
	public s_xdalgoenv(long mxcost, long snake_cnt, long heur_min) {
		setMxcost(mxcost);
		setSnake_cnt(snake_cnt);
		setHeur_min(heur_min);
	}
	public s_xdalgoenv() {
	}
	
	public long getMxcost() {
		return mxcost;
	}
	public void setMxcost(long newMxcost) {
		mxcost = newMxcost;
	}
	public long getSnake_cnt() {
		return snake_cnt;
	}
	public void setSnake_cnt(long newSnake_cnt) {
		snake_cnt = newSnake_cnt;
	}
	public long getHeur_min() {
		return heur_min;
	}
	public void setHeur_min(long newHeur_min) {
		heur_min = newHeur_min;
	}
}
