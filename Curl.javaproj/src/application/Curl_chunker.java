package application;

public class Curl_chunker {
	private Object hexbuffer;
	private int hexindex;
	private  state;
	private Object datasize;
	private Object dataleft;
	
	public Curl_chunker(Object hexbuffer, int hexindex,  state, Object datasize, Object dataleft) {
		setHexbuffer(hexbuffer);
		setHexindex(hexindex);
		setState(state);
		setDatasize(datasize);
		setDataleft(dataleft);
	}
	public Curl_chunker() {
	}
	
	public Object getHexbuffer() {
		return hexbuffer;
	}
	public void setHexbuffer(Object newHexbuffer) {
		hexbuffer = newHexbuffer;
	}
	public int getHexindex() {
		return hexindex;
	}
	public void setHexindex(int newHexindex) {
		hexindex = newHexindex;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public Object getDatasize() {
		return datasize;
	}
	public void setDatasize(Object newDatasize) {
		datasize = newDatasize;
	}
	public Object getDataleft() {
		return dataleft;
	}
	public void setDataleft(Object newDataleft) {
		dataleft = newDataleft;
	}
}
