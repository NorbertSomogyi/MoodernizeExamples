package application;

public class cache_generate {
	private Object dictfile;
	private double percent;
	private Object comp;
	private Object cnt;
	private Object cnt2;
	private Object runtime;
	
	public cache_generate(Object dictfile, double percent, Object comp, Object cnt, Object cnt2, Object runtime) {
		setDictfile(dictfile);
		setPercent(percent);
		setComp(comp);
		setCnt(cnt);
		setCnt2(cnt2);
		setRuntime(runtime);
	}
	public cache_generate() {
	}
	
	public Object getDictfile() {
		return dictfile;
	}
	public void setDictfile(Object newDictfile) {
		dictfile = newDictfile;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double newPercent) {
		percent = newPercent;
	}
	public Object getComp() {
		return comp;
	}
	public void setComp(Object newComp) {
		comp = newComp;
	}
	public Object getCnt() {
		return cnt;
	}
	public void setCnt(Object newCnt) {
		cnt = newCnt;
	}
	public Object getCnt2() {
		return cnt2;
	}
	public void setCnt2(Object newCnt2) {
		cnt2 = newCnt2;
	}
	public Object getRuntime() {
		return runtime;
	}
	public void setRuntime(Object newRuntime) {
		runtime = newRuntime;
	}
}
