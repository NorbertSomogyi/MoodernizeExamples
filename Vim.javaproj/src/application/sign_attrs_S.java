package application;

public class sign_attrs_S {
	private int typenr;
	private Object icon;
	private Object text;
	private int texthl;
	private int linehl;
	
	public sign_attrs_S(int typenr, Object icon, Object text, int texthl, int linehl) {
		setTypenr(typenr);
		setIcon(icon);
		setText(text);
		setTexthl(texthl);
		setLinehl(linehl);
	}
	public sign_attrs_S() {
	}
	
	public int getTypenr() {
		return typenr;
	}
	public void setTypenr(int newTypenr) {
		typenr = newTypenr;
	}
	public Object getIcon() {
		return icon;
	}
	public void setIcon(Object newIcon) {
		icon = newIcon;
	}
	public Object getText() {
		return text;
	}
	public void setText(Object newText) {
		text = newText;
	}
	public int getTexthl() {
		return texthl;
	}
	public void setTexthl(int newTexthl) {
		texthl = newTexthl;
	}
	public int getLinehl() {
		return linehl;
	}
	public void setLinehl(int newLinehl) {
		linehl = newLinehl;
	}
}
