package application;

public class iterate_data {
	private command cmds;
	private shallow_info si;
	
	public iterate_data(command cmds, shallow_info si) {
		setCmds(cmds);
		setSi(si);
	}
	public iterate_data() {
	}
	
	public command getCmds() {
		return cmds;
	}
	public void setCmds(command newCmds) {
		cmds = newCmds;
	}
	public shallow_info getSi() {
		return si;
	}
	public void setSi(shallow_info newSi) {
		si = newSi;
	}
}
