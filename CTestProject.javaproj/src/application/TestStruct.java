package application;

//Comment before Test definition
public class TestStruct {
	private int x;
	private byte c;
	
	public TestStruct(int x, byte c) {
		setX(x);
		setC(c);
	}
	public TestStruct() {
	}
	
	public TestStruct createTest(int x, byte c) {
		TestStruct t = new TestStruct(x, c);
		return t;
	}
	public void testFieldReference() {
		ModernizedCProgram.f1();
		int[] x = new int[]{1, 2};
		TestStruct e = new TestStruct(0, /*falsey*/(byte)'A');
		int generatedX = this.getX();
		ModernizedCProgram.globalInt = 2 * generatedX;
	}
	public TestStruct copyTest() {
		ModernizedCProgram.testElseIf();
		TestStruct t2 = new TestStruct();
		int generatedX = this.getX();
		t2.setX(generatedX);
		return t2;
	}
	public int getX() {
		return x;
	}
	public void setX(int newX) {
		x = newX;
	}
	public byte getC() {
		return c;
	}
	public void setC(byte newC) {
		c = newC;
	}
}
