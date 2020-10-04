package application;

public class bitcoin_wallet_tmp {
	private Object[] dgst;
	
	public bitcoin_wallet_tmp(Object[] dgst) {
		setDgst(dgst);
	}
	public bitcoin_wallet_tmp() {
	}
	
	public Object[] getDgst() {
		return dgst;
	}
	public void setDgst(Object[] newDgst) {
		dgst = newDgst;
	}
}
