package application;

public class ffm_packet_info {
	private Object pts;
	private Object dts;
	private Object size;
	private Object index;
	private ffm_packet_type type;
	private Object keyframe;
	
	public ffm_packet_info(Object pts, Object dts, Object size, Object index, ffm_packet_type type, Object keyframe) {
		setPts(pts);
		setDts(dts);
		setSize(size);
		setIndex(index);
		setType(type);
		setKeyframe(keyframe);
	}
	public ffm_packet_info() {
	}
	
	public Object getPts() {
		return pts;
	}
	public void setPts(Object newPts) {
		pts = newPts;
	}
	public Object getDts() {
		return dts;
	}
	public void setDts(Object newDts) {
		dts = newDts;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getIndex() {
		return index;
	}
	public void setIndex(Object newIndex) {
		index = newIndex;
	}
	public ffm_packet_type getType() {
		return type;
	}
	public void setType(ffm_packet_type newType) {
		type = newType;
	}
	public Object getKeyframe() {
		return keyframe;
	}
	public void setKeyframe(Object newKeyframe) {
		keyframe = newKeyframe;
	}
}
