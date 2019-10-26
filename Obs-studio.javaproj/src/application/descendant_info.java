package application;

public class descendant_info {
	private Object exists;
	private obs_source target;
	
	public descendant_info(Object exists, obs_source target) {
		setExists(exists);
		setTarget(target);
	}
	public descendant_info() {
	}
	
	public Object getExists() {
		return exists;
	}
	public void setExists(Object newExists) {
		exists = newExists;
	}
	public obs_source getTarget() {
		return target;
	}
	public void setTarget(obs_source newTarget) {
		target = newTarget;
	}
}
