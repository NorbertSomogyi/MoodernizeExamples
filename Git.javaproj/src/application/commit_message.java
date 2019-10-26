package application;

public class commit_message {
	private Byte parent_label;
	private Byte label;
	private Byte subject;
	private Object message;
	
	public commit_message(Byte parent_label, Byte label, Byte subject, Object message) {
		setParent_label(parent_label);
		setLabel(label);
		setSubject(subject);
		setMessage(message);
	}
	public commit_message() {
	}
	
	public Byte getParent_label() {
		return parent_label;
	}
	public void setParent_label(Byte newParent_label) {
		parent_label = newParent_label;
	}
	public Byte getLabel() {
		return label;
	}
	public void setLabel(Byte newLabel) {
		label = newLabel;
	}
	public Byte getSubject() {
		return subject;
	}
	public void setSubject(Byte newSubject) {
		subject = newSubject;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object newMessage) {
		message = newMessage;
	}
}
