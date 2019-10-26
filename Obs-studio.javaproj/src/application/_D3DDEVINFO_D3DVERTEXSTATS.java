package application;

public class _D3DDEVINFO_D3DVERTEXSTATS {
	private Object NumRenderedTriangles;
	private Object NumExtraClippingTriangles;
	
	public _D3DDEVINFO_D3DVERTEXSTATS(Object NumRenderedTriangles, Object NumExtraClippingTriangles) {
		setNumRenderedTriangles(NumRenderedTriangles);
		setNumExtraClippingTriangles(NumExtraClippingTriangles);
	}
	public _D3DDEVINFO_D3DVERTEXSTATS() {
	}
	
	public Object getNumRenderedTriangles() {
		return NumRenderedTriangles;
	}
	public void setNumRenderedTriangles(Object newNumRenderedTriangles) {
		NumRenderedTriangles = newNumRenderedTriangles;
	}
	public Object getNumExtraClippingTriangles() {
		return NumExtraClippingTriangles;
	}
	public void setNumExtraClippingTriangles(Object newNumExtraClippingTriangles) {
		NumExtraClippingTriangles = newNumExtraClippingTriangles;
	}
}
