package application;

/* Structures for high order primitives */
public class _D3DRECTPATCH_INFO {
	private Object StartVertexOffsetWidth;
	private Object StartVertexOffsetHeight;
	private Object Width;
	private Object Height;
	private Object Stride;
	private _D3DBASISTYPE Basis;
	private _D3DORDERTYPE Order;
	
	public _D3DRECTPATCH_INFO(Object StartVertexOffsetWidth, Object StartVertexOffsetHeight, Object Width, Object Height, Object Stride, _D3DBASISTYPE Basis, _D3DORDERTYPE Order) {
		setStartVertexOffsetWidth(StartVertexOffsetWidth);
		setStartVertexOffsetHeight(StartVertexOffsetHeight);
		setWidth(Width);
		setHeight(Height);
		setStride(Stride);
		setBasis(Basis);
		setOrder(Order);
	}
	public _D3DRECTPATCH_INFO() {
	}
	
	public Object getStartVertexOffsetWidth() {
		return StartVertexOffsetWidth;
	}
	public void setStartVertexOffsetWidth(Object newStartVertexOffsetWidth) {
		StartVertexOffsetWidth = newStartVertexOffsetWidth;
	}
	public Object getStartVertexOffsetHeight() {
		return StartVertexOffsetHeight;
	}
	public void setStartVertexOffsetHeight(Object newStartVertexOffsetHeight) {
		StartVertexOffsetHeight = newStartVertexOffsetHeight;
	}
	public Object getWidth() {
		return Width;
	}
	public void setWidth(Object newWidth) {
		Width = newWidth;
	}
	public Object getHeight() {
		return Height;
	}
	public void setHeight(Object newHeight) {
		Height = newHeight;
	}
	public Object getStride() {
		return Stride;
	}
	public void setStride(Object newStride) {
		Stride = newStride;
	}
	public _D3DBASISTYPE getBasis() {
		return Basis;
	}
	public void setBasis(_D3DBASISTYPE newBasis) {
		Basis = newBasis;
	}
	public _D3DORDERTYPE getOrder() {
		return Order;
	}
	public void setOrder(_D3DORDERTYPE newOrder) {
		Order = newOrder;
	}
}
