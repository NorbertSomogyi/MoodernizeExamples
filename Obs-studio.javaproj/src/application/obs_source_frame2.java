package application;

public class obs_source_frame2 {
	private Object data;
	private Object linesize;
	private Object width;
	private Object height;
	private Object timestamp;
	private video_format format;
	private video_range_type range;
	private Object color_matrix;
	private Object color_range_min;
	private Object color_range_max;
	private Object flip;
	
	public obs_source_frame2(Object data, Object linesize, Object width, Object height, Object timestamp, video_format format, video_range_type range, Object color_matrix, Object color_range_min, Object color_range_max, Object flip) {
		setData(data);
		setLinesize(linesize);
		setWidth(width);
		setHeight(height);
		setTimestamp(timestamp);
		setFormat(format);
		setRange(range);
		setColor_matrix(color_matrix);
		setColor_range_min(color_range_min);
		setColor_range_max(color_range_max);
		setFlip(flip);
	}
	public obs_source_frame2() {
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getLinesize() {
		return linesize;
	}
	public void setLinesize(Object newLinesize) {
		linesize = newLinesize;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public video_format getFormat() {
		return format;
	}
	public void setFormat(video_format newFormat) {
		format = newFormat;
	}
	public video_range_type getRange() {
		return range;
	}
	public void setRange(video_range_type newRange) {
		range = newRange;
	}
	public Object getColor_matrix() {
		return color_matrix;
	}
	public void setColor_matrix(Object newColor_matrix) {
		color_matrix = newColor_matrix;
	}
	public Object getColor_range_min() {
		return color_range_min;
	}
	public void setColor_range_min(Object newColor_range_min) {
		color_range_min = newColor_range_min;
	}
	public Object getColor_range_max() {
		return color_range_max;
	}
	public void setColor_range_max(Object newColor_range_max) {
		color_range_max = newColor_range_max;
	}
	public Object getFlip() {
		return flip;
	}
	public void setFlip(Object newFlip) {
		flip = newFlip;
	}
}
/**
 * Preloads asynchronous video data to allow instantaneous playback
 *
 * NOTE: Non-YUV formats will always be treated as full range with this
 * function!  Use obs_source_preload_video2 instead if partial range support is
 * desired for non-YUV video formats.
 */
