package application;

public class sigshort_st {
	private int num;
	private Object expected;
	private Object result;
	
	public sigshort_st(int num, Object expected, Object result) {
		setNum(num);
		setExpected(expected);
		setResult(result);
	}
	public sigshort_st() {
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int newNum) {
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
