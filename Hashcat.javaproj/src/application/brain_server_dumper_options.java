package application;

public class brain_server_dumper_options {
	private brain_server_dbs brain_server_dbs;
	
	public brain_server_dumper_options(brain_server_dbs brain_server_dbs) {
		setBrain_server_dbs(brain_server_dbs);
	}
	public brain_server_dumper_options() {
	}
	
	public brain_server_dbs getBrain_server_dbs() {
		return brain_server_dbs;
	}
	public void setBrain_server_dbs(brain_server_dbs newBrain_server_dbs) {
		brain_server_dbs = newBrain_server_dbs;
	}
}
