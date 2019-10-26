package application;

public class a {
	private curltime first;
	private curltime second;
	private Object result;
	
	public a(curltime first, curltime second, Object result) {
		setFirst(first);
		setSecond(second);
		setResult(result);
	}
	public a() {
	}
	
	public curltime getFirst() {
		return first;
	}
	public void setFirst(curltime newFirst) {
		first = newFirst;
	}
	public curltime getSecond() {
		return second;
	}
	public void setSecond(curltime newSecond) {
		second = newSecond;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object newResult) {
		result = newResult;
	}
}
