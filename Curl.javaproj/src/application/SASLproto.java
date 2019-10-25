package application;

/* Progress indicator */
/* Protocol dependent SASL parameters */
/* Protocol dependent parameters */
public class SASLproto {
	private Object service;
	private int contcode;
	private int finalcode;
	private Object maxirlen;
	private Object sendauth;
	private Object sendcont;
	private Object getmessage;
	
	public SASLproto(Object service, int contcode, int finalcode, Object maxirlen, Object sendauth, Object sendcont, Object getmessage) {
		setService(service);
		setContcode(contcode);
		setFinalcode(finalcode);
		setMaxirlen(maxirlen);
		setSendauth(sendauth);
		setSendcont(sendcont);
		setGetmessage(getmessage);
	}
	public SASLproto() {
	}
	
	public Object getService() {
		return service;
	}
	public void setService(Object newService) {
		service = newService;
	}
	public int getContcode() {
		return contcode;
	}
	public void setContcode(int newContcode) {
		contcode = newContcode;
	}
	public int getFinalcode() {
		return finalcode;
	}
	public void setFinalcode(int newFinalcode) {
		finalcode = newFinalcode;
	}
	public Object getMaxirlen() {
		return maxirlen;
	}
	public void setMaxirlen(Object newMaxirlen) {
		maxirlen = newMaxirlen;
	}
	public Object getSendauth() {
		return sendauth;
	}
	public void setSendauth(Object newSendauth) {
		sendauth = newSendauth;
	}
	public Object getSendcont() {
		return sendcont;
	}
	public void setSendcont(Object newSendcont) {
		sendcont = newSendcont;
	}
	public Object getGetmessage() {
		return getmessage;
	}
	public void setGetmessage(Object newGetmessage) {
		getmessage = newGetmessage;
	}
}
