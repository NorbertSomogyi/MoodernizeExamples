package application;

/** Long Allocation Descriptor (ECMA 167r3 4/14.14.2) */
/** Extended Allocation Descriptor (ECMA 167r3 4/14.14.3) */
/** Logical Volume Header Descriptor (ECMA 167r3 4/14.15) */
public class logical_vol_header_desc_s {
	private Object uniqueID;
	private Object reserved;
	
	public logical_vol_header_desc_s(Object uniqueID, Object reserved) {
		setUniqueID(uniqueID);
		setReserved(reserved);
	}
	public logical_vol_header_desc_s() {
	}
	
	public Object getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(Object newUniqueID) {
		uniqueID = newUniqueID;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
