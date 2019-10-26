package application;

public class struct_NvLevel {
	private Object Level;
	private Object Policy;
	
	public struct_NvLevel(Object Level, Object Policy) {
		setLevel(Level);
		setPolicy(Policy);
	}
	public struct_NvLevel() {
	}
	
	public Object getLevel() {
		return Level;
	}
	public void setLevel(Object newLevel) {
		Level = newLevel;
	}
	public Object getPolicy() {
		return Policy;
	}
	public void setPolicy(Object newPolicy) {
		Policy = newPolicy;
	}
}
