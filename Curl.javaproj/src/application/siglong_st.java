package application;

public class siglong_st {
	private long num;
	private Object expected;
	private Object result;
	
	public siglong_st(long num, Object expected, Object result) {
		setNum(num);
		setExpected(expected);
		setResult(result);
	}
	public siglong_st() {
	}
	
	public long getNum() {
		return num;
	}
	public void setNum(long newNum) {
		num = newNum;
	}
	public Object getExpected() {
		return expected;
	}
	public void setExpected(Object newExpected) {
		expected = newExpected;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object newResult) {
		result = newResult;
	}
}
