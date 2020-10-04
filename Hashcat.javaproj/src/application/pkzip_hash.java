package application;

// nevercrack is required because it's quite likely that a collision is found which will not necessarily work as password for the archive
// this is required to force mingw to accept the packed attribute
public class pkzip_hash {
	private Object data_type_enum;
	private Object magic_type_enum;
	private Object compressed_length;
	private Object uncompressed_length;
	private Object crc32;
	private Object offset;
	private Object additional_offset;
	private Object compression_type;
	private Object data_length;
	private Object checksum_from_crc;
	private Object checksum_from_timestamp;
	private Object[] data;
	
	public pkzip_hash(Object data_type_enum, Object magic_type_enum, Object compressed_length, Object uncompressed_length, Object crc32, Object offset, Object additional_offset, Object compression_type, Object data_length, Object checksum_from_crc, Object checksum_from_timestamp, Object[] data) {
		setData_type_enum(data_type_enum);
		setMagic_type_enum(magic_type_enum);
		setCompressed_length(compressed_length);
		setUncompressed_length(uncompressed_length);
		setCrc32(crc32);
		setOffset(offset);
		setAdditional_offset(additional_offset);
		setCompression_type(compression_type);
		setData_length(data_length);
		setChecksum_from_crc(checksum_from_crc);
		setChecksum_from_timestamp(checksum_from_timestamp);
		setData(data);
	}
	public pkzip_hash() {
	}
	
	public Object getData_type_enum() {
		return data_type_enum;
	}
	public void setData_type_enum(Object newData_type_enum) {
		data_type_enum = newData_type_enum;
	}
	public Object getMagic_type_enum() {
		return magic_type_enum;
	}
	public void setMagic_type_enum(Object newMagic_type_enum) {
		magic_type_enum = newMagic_type_enum;
	}
	public Object getCompressed_length() {
		return compressed_length;
	}
	public void setCompressed_length(Object newCompressed_length) {
		compressed_length = newCompressed_length;
	}
	public Object getUncompressed_length() {
		return uncompressed_length;
	}
	public void setUncompressed_length(Object newUncompressed_length) {
		uncompressed_length = newUncompressed_length;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getAdditional_offset() {
		return additional_offset;
	}
	public void setAdditional_offset(Object newAdditional_offset) {
		additional_offset = newAdditional_offset;
	}
	public Object getCompression_type() {
		return compression_type;
	}
	public void setCompression_type(Object newCompression_type) {
		compression_type = newCompression_type;
	}
	public Object getData_length() {
		return data_length;
	}
	public void setData_length(Object newData_length) {
		data_length = newData_length;
	}
	public Object getChecksum_from_crc() {
		return checksum_from_crc;
	}
	public void setChecksum_from_crc(Object newChecksum_from_crc) {
		checksum_from_crc = newChecksum_from_crc;
	}
	public Object getChecksum_from_timestamp() {
		return checksum_from_timestamp;
	}
	public void setChecksum_from_timestamp(Object newChecksum_from_timestamp) {
		checksum_from_timestamp = newChecksum_from_timestamp;
	}
	public Object[] getData() {
		return data;
	}
	public void setData(Object[] newData) {
		data = newData;
	}
}
