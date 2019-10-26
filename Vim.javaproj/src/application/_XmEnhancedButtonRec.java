package application;

/*
 * Full instance record declaration.
 */
public class _XmEnhancedButtonRec {
	private Object core;
	private Object primitive;
	private Object label;
	private Object pushbutton;
	private _XmEnhancedButtonPart enhancedbutton;
	
	public _XmEnhancedButtonRec(Object core, Object primitive, Object label, Object pushbutton, _XmEnhancedButtonPart enhancedbutton) {
		setCore(core);
		setPrimitive(primitive);
		setLabel(label);
		setPushbutton(pushbutton);
		setEnhancedbutton(enhancedbutton);
	}
	public _XmEnhancedButtonRec() {
	}
	
	public Object getCore() {
		return core;
	}
	public void setCore(Object newCore) {
		core = newCore;
	}
	public Object getPrimitive() {
		return primitive;
	}
	public void setPrimitive(Object newPrimitive) {
		primitive = newPrimitive;
	}
	public Object getLabel() {
		return label;
	}
	public void setLabel(Object newLabel) {
		label = newLabel;
	}
	public Object getPushbutton() {
		return pushbutton;
	}
	public void setPushbutton(Object newPushbutton) {
		pushbutton = newPushbutton;
	}
	public _XmEnhancedButtonPart getEnhancedbutton() {
		return enhancedbutton;
	}
	public void setEnhancedbutton(_XmEnhancedButtonPart newEnhancedbutton) {
		enhancedbutton = newEnhancedbutton;
	}
}
