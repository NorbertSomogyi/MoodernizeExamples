package application;

/* What does a matched pattern decide? */
public class attr_state {
	private Object attr;
	private Object setto;
	
	public attr_state(Object attr, Object setto) {
		setAttr(attr);
		setSetto(setto);
	}
	public attr_state() {
	}
	
	public Object getAttr() {
		return attr;
	}
	public void setAttr(Object newAttr) {
		attr = newAttr;
	}
	public Object getSetto() {
		return setto;
	}
	public void setSetto(Object newSetto) {
		setto = newSetto;
	}
}
