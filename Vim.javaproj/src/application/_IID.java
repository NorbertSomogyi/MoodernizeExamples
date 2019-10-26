package application;

/* this file contains the actual definitions of */
/* the IIDs and CLSIDs */
/* link this file in with the server and any clients */
/* File created by MIDL compiler version 3.00.44 */
/* at Sat Jan 03 16:34:55 1998
 */
/* Compiler settings for if_ole.idl:
    Os (OptLev=s), W1, Zp8, env=Win32, ms_ext, c_ext
    error checks: none
*/
//@@MIDL_FILE_HEADING(  )
/* This define is missing from older MingW versions of w32api, even though
    * IID is defined. */
public class _IID {
	private long x;
	private int s1;
	private int s2;
	private Object c;
	
	public _IID(long x, int s1, int s2, Object c) {
		setX(x);
		setS1(s1);
		setS2(s2);
		setC(c);
	}
	public _IID() {
	}
	
	public long getX() {
		return x;
	}
	public void setX(long newX) {
		x = newX;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int newS1) {
		s1 = newS1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int newS2) {
		s2 = newS2;
	}
	public Object getC() {
		return c;
	}
	public void setC(Object newC) {
		c = newC;
	}
}
