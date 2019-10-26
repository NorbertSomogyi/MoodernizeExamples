package application;

public class block_entry {
	private Object physblock;
	private Object sha;
	
	public block_entry(Object physblock, Object sha) {
		setPhysblock(physblock);
		setSha(sha);
	}
	public block_entry() {
	}
	
	public Object getPhysblock() {
		return physblock;
	}
	public void setPhysblock(Object newPhysblock) {
		physblock = newPhysblock;
	}
	public Object getSha() {
		return sha;
	}
	public void setSha(Object newSha) {
		sha = newSha;
	}
}
