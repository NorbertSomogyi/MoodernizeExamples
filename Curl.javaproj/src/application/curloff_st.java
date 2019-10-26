package application;

public class curloff_st {
	private Object num;
	private Object expected;
	private Object result;
	
	public curloff_st(Object num, Object expected, Object result) {
		setNum(num);
		setExpected(expected);
		setResult(result);
	}
	public curloff_st() {
	}
	
	public Object getNum() {
		return num;
	}
	public void setNum(Object newNum) {
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
