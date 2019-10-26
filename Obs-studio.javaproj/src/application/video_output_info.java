package application;

public class video_output_info {
	private Object name;
	private video_format format;
	private Object fps_num;
	private Object fps_den;
	private Object width;
	private Object height;
	private Object cache_size;
	private video_colorspace colorspace;
	private video_range_type range;
	
	public video_output_info(Object name, video_format format, Object fps_num, Object fps_den, Object width, Object height, Object cache_size, video_colorspace colorspace, video_range_type range) {
		setName(name);
		setFormat(format);
		setFps_num(fps_num);
		setFps_den(fps_den);
		setWidth(width);
		setHeight(height);
		setCache_size(cache_size);
		setColorspace(colorspace);
		setRange(range);
	}
	public video_output_info() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public video_format getFormat() {
		return format;
	}
	public void setFormat(video_format newFormat) {
		format = newFormat;
	}
	public Object getFps_num() {
		return fps_num;
	}
	public void setFps_num(Object newFps_num) {
		fps_num = newFps_num;
	}
	public Object getFps_den() {
		return fps_den;
	}
	public void setFps_den(Object newFps_den) {
		fps_den = newFps_den;
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
	public Object getCache_size() {
		return cache_size;
	}
	public void setCache_size(Object newCache_size) {
		cache_size = newCache_size;
	}
	public video_colorspace getColorspace() {
		return colorspace;
	}
	public void setColorspace(video_colorspace newColorspace) {
		colorspace = newColorspace;
	}
	public video_range_type getRange() {
		return range;
	}
	public void setRange(video_range_type newRange) {
		range = newRange;
	}
}
