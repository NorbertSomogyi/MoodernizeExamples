package application;

public class _D3DCOLORVALUE {
	private double r;
	private double g;
	private double b;
	private double a;
	
	public _D3DCOLORVALUE(double r, double g, double b, double a) {
		setR(r);
		setG(g);
		setB(b);
		setA(a);
	}
	public _D3DCOLORVALUE() {
	}
	
	public double getR() {
		return r;
	}
	public void setR(double newR) {
		r = newR;
	}
	public double getG() {
		return g;
	}
	public void setG(double newG) {
		g = newG;
	}
	public double getB() {
		return b;
	}
	public void setB(double newB) {
		b = newB;
	}
	public double getA() {
		return a;
	}
	public void setA(double newA) {
		a = newA;
	}
}
