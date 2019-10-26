package application;

// since WINBLUE
public class _OBJECT_TYPES_INFORMATION {
	private Object NumberOfTypes;
	
	public _OBJECT_TYPES_INFORMATION(Object NumberOfTypes) {
		setNumberOfTypes(NumberOfTypes);
	}
	public _OBJECT_TYPES_INFORMATION() {
	}
	
	public Object getNumberOfTypes() {
		return NumberOfTypes;
	}
	public void setNumberOfTypes(Object newNumberOfTypes) {
		NumberOfTypes = newNumberOfTypes;
	}
}
