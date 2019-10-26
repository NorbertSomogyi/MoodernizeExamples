package application;

public class tracking {
	private refspec_item spec;
	private Byte src;
	private Object remote;
	private int matches;
	
	public tracking(refspec_item spec, Byte src, Object remote, int matches) {
		setSpec(spec);
		setSrc(src);
		setRemote(remote);
		setMatches(matches);
	}
	public tracking() {
	}
	
	public refspec_item getSpec() {
		return spec;
	}
	public void setSpec(refspec_item newSpec) {
		spec = newSpec;
	}
	public Byte getSrc() {
		return src;
	}
	public void setSrc(Byte newSrc) {
		src = newSrc;
	}
	public Object getRemote() {
		return remote;
	}
	public void setRemote(Object newRemote) {
		remote = newRemote;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int newMatches) {
		matches = newMatches;
	}
}
