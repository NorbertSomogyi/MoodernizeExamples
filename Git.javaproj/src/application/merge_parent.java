package application;

public class merge_parent {
	private object_id given;
	private object_id commit;
	private byte used;
	
	public merge_parent(object_id given, object_id commit, byte used) {
		setGiven(given);
		setCommit(commit);
		setUsed(used);
	}
	public merge_parent() {
	}
	
	public merge_parent find_merge_parent(merge_parents table, object_id given, object_id commit) {
		int i;
		int generatedNr = table.getNr();
		merge_parent[] generatedItem = table.getItem();
		for (i = 0; i < generatedNr; i++) {
			if (given && !ModernizedCProgram.oideq(generatedItem[i].getGiven(), given)) {
				continue;
			} 
			if (commit && !ModernizedCProgram.oideq(generatedItem[i].getCommit(), commit)) {
				continue;
			} 
			return generatedItem[i];
		}
		return ((Object)0);
	}
	public object_id getGiven() {
		return given;
	}
	public void setGiven(object_id newGiven) {
		given = newGiven;
	}
	public object_id getCommit() {
		return commit;
	}
	public void setCommit(object_id newCommit) {
		commit = newCommit;
	}
	public byte getUsed() {
		return used;
	}
	public void setUsed(byte newUsed) {
		used = newUsed;
	}
}
