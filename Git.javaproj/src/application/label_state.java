package application;

public class label_state {
	private oidmap commit2label;
	private hashmap labels;
	private strbuf buf;
	
	public label_state(oidmap commit2label, hashmap labels, strbuf buf) {
		setCommit2label(commit2label);
		setLabels(labels);
		setBuf(buf);
	}
	public label_state() {
	}
	
	public oidmap getCommit2label() {
		return commit2label;
	}
	public void setCommit2label(oidmap newCommit2label) {
		commit2label = newCommit2label;
	}
	public hashmap getLabels() {
		return labels;
	}
	public void setLabels(hashmap newLabels) {
		labels = newLabels;
	}
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
}
