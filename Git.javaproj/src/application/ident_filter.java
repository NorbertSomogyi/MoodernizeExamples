package application;

public class ident_filter {
	private stream_filter filter;
	private strbuf left;
	private int state;
	private Object ident;
	
	public ident_filter(stream_filter filter, strbuf left, int state, Object ident) {
		setFilter(filter);
		setLeft(left);
		setState(state);
		setIdent(ident);
	}
	public ident_filter() {
	}
	
	public void ident_drain(Byte output_p, Object osize_p) {
		strbuf generatedLeft = this.getLeft();
		Object generatedLen = generatedLeft.getLen();
		size_t to_drain = generatedLen;
		if (osize_p < to_drain) {
			to_drain = osize_p;
		} 
		byte[] generatedBuf = generatedLeft.getBuf();
		if (to_drain) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(output_p, generatedBuf, to_drain);
			generatedLeft.strbuf_remove(0, to_drain);
			output_p += to_drain;
			osize_p -= to_drain;
		} 
		if (!generatedLen) {
			this.setState(0);
		} 
	}
	public stream_filter getFilter() {
		return filter;
	}
	public void setFilter(stream_filter newFilter) {
		filter = newFilter;
	}
	public strbuf getLeft() {
		return left;
	}
	public void setLeft(strbuf newLeft) {
		left = newLeft;
	}
	public int getState() {
		return state;
	}
	public void setState(int newState) {
		state = newState;
	}
	public Object getIdent() {
		return ident;
	}
	public void setIdent(Object newIdent) {
		ident = newIdent;
	}
}
