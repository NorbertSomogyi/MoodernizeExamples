package application;

/* unz_file_info contain information about a file in the zipfile */
public class unz_file_info64_s {
	private Object version;
	private Object version_needed;
	private Object flag;
	private Object compression_method;
	private Object dosDate;
	private Object crc;
	private Object compressed_size;
	private Object uncompressed_size;
	private Object size_filename;
	private Object size_file_extra;
	private Object size_file_comment;
	private Object disk_num_start;
	private Object internal_fa;
	private Object external_fa;
	private tm_unz_s tmu_date;
	
	public unz_file_info64_s(Object version, Object version_needed, Object flag, Object compression_method, Object dosDate, Object crc, Object compressed_size, Object uncompressed_size, Object size_filename, Object size_file_extra, Object size_file_comment, Object disk_num_start, Object internal_fa, Object external_fa, tm_unz_s tmu_date) {
		setVersion(version);
		setVersion_needed(version_needed);
		setFlag(flag);
		setCompression_method(compression_method);
		setDosDate(dosDate);
		setCrc(crc);
		setCompressed_size(compressed_size);
		setUncompressed_size(uncompressed_size);
		setSize_filename(size_filename);
		setSize_file_extra(size_file_extra);
		setSize_file_comment(size_file_comment);
		setDisk_num_start(disk_num_start);
		setInternal_fa(internal_fa);
		setExternal_fa(external_fa);
		setTmu_date(tmu_date);
	}
	public unz_file_info64_s() {
	}
	
	public int unzGetCurrentFileInfo64(Object file, Byte szFileName, Object fileNameBufferSize, Object extraField, Object extraFieldBufferSize, Byte szComment, Object commentBufferSize) {
		return ModernizedCProgram.unz64local_GetCurrentFileInfoInternal(file, pfile_info, ((Object)0), szFileName, fileNameBufferSize, extraField, extraFieldBufferSize, szComment, commentBufferSize);
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getVersion_needed() {
		return version_needed;
	}
	public void setVersion_needed(Object newVersion_needed) {
		version_needed = newVersion_needed;
	}
	public Object getFlag() {
		return flag;
	}
	public void setFlag(Object newFlag) {
		flag = newFlag;
	}
	public Object getCompression_method() {
		return compression_method;
	}
	public void setCompression_method(Object newCompression_method) {
		compression_method = newCompression_method;
	}
	public Object getDosDate() {
		return dosDate;
	}
	public void setDosDate(Object newDosDate) {
		dosDate = newDosDate;
	}
	public Object getCrc() {
		return crc;
	}
	public void setCrc(Object newCrc) {
		crc = newCrc;
	}
	public Object getCompressed_size() {
		return compressed_size;
	}
	public void setCompressed_size(Object newCompressed_size) {
		compressed_size = newCompressed_size;
	}
	public Object getUncompressed_size() {
		return uncompressed_size;
	}
	public void setUncompressed_size(Object newUncompressed_size) {
		uncompressed_size = newUncompressed_size;
	}
	public Object getSize_filename() {
		return size_filename;
	}
	public void setSize_filename(Object newSize_filename) {
		size_filename = newSize_filename;
	}
	public Object getSize_file_extra() {
		return size_file_extra;
	}
	public void setSize_file_extra(Object newSize_file_extra) {
		size_file_extra = newSize_file_extra;
	}
	public Object getSize_file_comment() {
		return size_file_comment;
	}
	public void setSize_file_comment(Object newSize_file_comment) {
		size_file_comment = newSize_file_comment;
	}
	public Object getDisk_num_start() {
		return disk_num_start;
	}
	public void setDisk_num_start(Object newDisk_num_start) {
		disk_num_start = newDisk_num_start;
	}
	public Object getInternal_fa() {
		return internal_fa;
	}
	public void setInternal_fa(Object newInternal_fa) {
		internal_fa = newInternal_fa;
	}
	public Object getExternal_fa() {
		return external_fa;
	}
	public void setExternal_fa(Object newExternal_fa) {
		external_fa = newExternal_fa;
	}
	public tm_unz_s getTmu_date() {
		return tmu_date;
	}
	public void setTmu_date(tm_unz_s newTmu_date) {
		tmu_date = newTmu_date;
	}
}
