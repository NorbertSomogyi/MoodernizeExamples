package application;

/** Path Component (ECMA 167r3 4/14.16.1) */
public class pathComponent {
	private Object component_type;
	private Object lengthComponent_id;
	private Object componentFileVersionNum;
	private Object[] component_id;
	
	public pathComponent(Object component_type, Object lengthComponent_id, Object componentFileVersionNum, Object[] component_id) {
		setComponent_type(component_type);
		setLengthComponent_id(lengthComponent_id);
		setComponentFileVersionNum(componentFileVersionNum);
		setComponent_id(component_id);
	}
	public pathComponent() {
	}
	
	public Object getComponent_type() {
		return component_type;
	}
	public void setComponent_type(Object newComponent_type) {
		component_type = newComponent_type;
	}
	public Object getLengthComponent_id() {
		return lengthComponent_id;
	}
	public void setLengthComponent_id(Object newLengthComponent_id) {
		lengthComponent_id = newLengthComponent_id;
	}
	public Object getComponentFileVersionNum() {
		return componentFileVersionNum;
	}
	public void setComponentFileVersionNum(Object newComponentFileVersionNum) {
		componentFileVersionNum = newComponentFileVersionNum;
	}
	public Object[] getComponent_id() {
		return component_id;
	}
	public void setComponent_id(Object[] newComponent_id) {
		component_id = newComponent_id;
	}
}
