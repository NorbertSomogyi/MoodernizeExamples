package application;

public class iso9660_dir_s {
	private Object length;
	private Object xa_length;
	private Object extent;
	private Object size;
	private iso9660_dtime_s recording_time;
	private Object file_flags;
	private Object file_unit_size;
	private Object interleave_gap;
	private Object volume_sequence_number;
	private  filename;
	
	public iso9660_dir_s(Object length, Object xa_length, Object extent, Object size, iso9660_dtime_s recording_time, Object file_flags, Object file_unit_size, Object interleave_gap, Object volume_sequence_number,  filename) {
		setLength(length);
		setXa_length(xa_length);
		setExtent(extent);
		setSize(size);
		setRecording_time(recording_time);
		setFile_flags(file_flags);
		setFile_unit_size(file_unit_size);
		setInterleave_gap(interleave_gap);
		setVolume_sequence_number(volume_sequence_number);
		setFilename(filename);
	}
	public iso9660_dir_s() {
	}
	
	public Object getLength() {
		return length;
	}
	public void setLength(Object newLength) {
		length = newLength;
	}
	public Object getXa_length() {
		return xa_length;
	}
	public void setXa_length(Object newXa_length) {
		xa_length = newXa_length;
	}
	public Object getExtent() {
		return extent;
	}
	public void setExtent(Object newExtent) {
		extent = newExtent;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public iso9660_dtime_s getRecording_time() {
		return recording_time;
	}
	public void setRecording_time(iso9660_dtime_s newRecording_time) {
		recording_time = newRecording_time;
	}
	public Object getFile_flags() {
		return file_flags;
	}
	public void setFile_flags(Object newFile_flags) {
		file_flags = newFile_flags;
	}
	public Object getFile_unit_size() {
		return file_unit_size;
	}
	public void setFile_unit_size(Object newFile_unit_size) {
		file_unit_size = newFile_unit_size;
	}
	public Object getInterleave_gap() {
		return interleave_gap;
	}
	public void setInterleave_gap(Object newInterleave_gap) {
		interleave_gap = newInterleave_gap;
	}
	public Object getVolume_sequence_number() {
		return volume_sequence_number;
	}
	public void setVolume_sequence_number(Object newVolume_sequence_number) {
		volume_sequence_number = newVolume_sequence_number;
	}
	public  getFilename() {
		return filename;
	}
	public void setFilename( newFilename) {
		filename = newFilename;
	}
}
