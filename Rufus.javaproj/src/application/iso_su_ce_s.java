package application;

/*! The next two structs are used by the system-use-sharing protocol
   (SUSP), in which the Rock Ridge extensions are embedded.  It is
   quite possible that other extensions are present on the disk, and
   this is fine as long as they all use SUSP. */
/*! system-use-sharing protocol */
/*! system-use extension record */
/**< Identifier length. Value 10?. */
/**< Extension version. Value 1? */
public class iso_su_ce_s {
	private Object extent;
	private Object offset;
	private Object size;
	
	public iso_su_ce_s(Object extent, Object offset, Object size) {
		setExtent(extent);
		setOffset(offset);
		setSize(size);
	}
	public iso_su_ce_s() {
	}
	
	public Object getExtent() {
		return extent;
	}
	public void setExtent(Object newExtent) {
		extent = newExtent;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
