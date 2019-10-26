package application;

public class sidechain_prop_info {
	private obs_property sources;
	private obs_source parent;
	
	public sidechain_prop_info(obs_property sources, obs_source parent) {
		setSources(sources);
		setParent(parent);
	}
	public sidechain_prop_info() {
	}
	
	public obs_property getSources() {
		return sources;
	}
	public void setSources(obs_property newSources) {
		sources = newSources;
	}
	public obs_source getParent() {
		return parent;
	}
	public void setParent(obs_source newParent) {
		parent = newParent;
	}
}
