package application;

public class _D3DTRIPATCH_INFO {
	private Object StartVertexOffset;
	private Object NumVertices;
	private _D3DBASISTYPE Basis;
	private _D3DORDERTYPE Order;
	
	public _D3DTRIPATCH_INFO(Object StartVertexOffset, Object NumVertices, _D3DBASISTYPE Basis, _D3DORDERTYPE Order) {
		setStartVertexOffset(StartVertexOffset);
		setNumVertices(NumVertices);
		setBasis(Basis);
		setOrder(Order);
	}
	public _D3DTRIPATCH_INFO() {
	}
	
	public Object getStartVertexOffset() {
		return StartVertexOffset;
	}
	public void setStartVertexOffset(Object newStartVertexOffset) {
		StartVertexOffset = newStartVertexOffset;
	}
	public Object getNumVertices() {
		return NumVertices;
	}
	public void setNumVertices(Object newNumVertices) {
		NumVertices = newNumVertices;
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
