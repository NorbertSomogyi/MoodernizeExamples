package application;

/** Descriptor Tag (ECMA 167r3 3/7.2) */
public class udf_tag_s {
	private Object id;
	private Object desc_version;
	private Object cksum;
	private Object reserved;
	private Object i_serial;
	private Object desc_CRC;
	private Object desc_CRC_len;
	private Object loc;
	
	public udf_tag_s(Object id, Object desc_version, Object cksum, Object reserved, Object i_serial, Object desc_CRC, Object desc_CRC_len, Object loc) {
		setId(id);
		setDesc_version(desc_version);
		setCksum(cksum);
		setReserved(reserved);
		setI_serial(i_serial);
		setDesc_CRC(desc_CRC);
		setDesc_CRC_len(desc_CRC_len);
		setLoc(loc);
	}
	public udf_tag_s() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getDesc_version() {
		return desc_version;
	}
	public void setDesc_version(Object newDesc_version) {
		desc_version = newDesc_version;
	}
	public Object getCksum() {
		return cksum;
	}
	public void setCksum(Object newCksum) {
		cksum = newCksum;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getI_serial() {
		return i_serial;
	}
	public void setI_serial(Object newI_serial) {
		i_serial = newI_serial;
	}
	public Object getDesc_CRC() {
		return desc_CRC;
	}
	public void setDesc_CRC(Object newDesc_CRC) {
		desc_CRC = newDesc_CRC;
	}
	public Object getDesc_CRC_len() {
		return desc_CRC_len;
	}
	public void setDesc_CRC_len(Object newDesc_CRC_len) {
		desc_CRC_len = newDesc_CRC_len;
	}
	public Object getLoc() {
		return loc;
	}
	public void setLoc(Object newLoc) {
		loc = newLoc;
	}
}
