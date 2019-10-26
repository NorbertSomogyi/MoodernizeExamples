package application;

public class ext2_dx_tail {
	private Object dt_reserved;
	private Object dt_checksum;
	
	public ext2_dx_tail(Object dt_reserved, Object dt_checksum) {
		setDt_reserved(dt_reserved);
		setDt_checksum(dt_checksum);
	}
	public ext2_dx_tail() {
	}
	
	public Object getDt_reserved() {
		return dt_reserved;
	}
	public void setDt_reserved(Object newDt_reserved) {
		dt_reserved = newDt_reserved;
	}
	public Object getDt_checksum() {
		return dt_checksum;
	}
	public void setDt_checksum(Object newDt_checksum) {
		dt_checksum = newDt_checksum;
	}
}
