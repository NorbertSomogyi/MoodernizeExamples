package application;

public class s_xpparam {
	private long flags;
	private Byte anchors;
	private Object anchors_nr;
	
	public s_xpparam(long flags, Byte anchors, Object anchors_nr) {
		setFlags(flags);
		setAnchors(anchors);
		setAnchors_nr(anchors_nr);
	}
	public s_xpparam() {
	}
	
	public long getFlags() {
		return flags;
	}
	public void setFlags(long newFlags) {
		flags = newFlags;
	}
	public Byte getAnchors() {
		return anchors;
	}
	public void setAnchors(Byte newAnchors) {
		anchors = newAnchors;
	}
	public Object getAnchors_nr() {
		return anchors_nr;
	}
	public void setAnchors_nr(Object newAnchors_nr) {
		anchors_nr = newAnchors_nr;
	}
}
