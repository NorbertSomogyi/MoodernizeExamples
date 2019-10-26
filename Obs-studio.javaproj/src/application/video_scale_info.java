package application;

public class video_scale_info {
	private video_format format;
	private Object width;
	private Object height;
	private video_range_type range;
	private video_colorspace colorspace;
	
	public video_scale_info(video_format format, Object width, Object height, video_range_type range, video_colorspace colorspace) {
		setFormat(format);
		setWidth(width);
		setHeight(height);
		setRange(range);
		setColorspace(colorspace);
	}
	public video_scale_info() {
	}
	
	public video_scale_info get_video_conversion(obs_output output) {
		Object generatedVideo_conversion_set = output.getVideo_conversion_set();
		video_scale_info generatedVideo_conversion = output.getVideo_conversion();
		Object generatedVideo_scale_info = generatedVideo_conversion.getVideo_scale_info();
		Object generatedVideo = output.getVideo();
		Object generatedScaled_width = output.getScaled_width();
		Object generatedScaled_height = output.getScaled_height();
		if (generatedVideo_conversion_set) {
			if (!generatedVideo_scale_info) {
				generatedVideo_conversion.setVideo_scale_info(ModernizedCProgram.obs_output_get_width(output));
			} 
			if (!generatedVideo_scale_info) {
				generatedVideo_conversion.setVideo_scale_info(ModernizedCProgram.obs_output_get_height(output));
			} 
			return generatedVideo_conversion;
		}  else if (ModernizedCProgram.has_scaling(output)) {
			video_output_info info = ModernizedCProgram.video_output_get_info(generatedVideo);
			generatedVideo_conversion.setVideo_scale_info(info.getVideo_output_info());
			generatedVideo_conversion.setVideo_scale_info(VIDEO_CS_DEFAULT);
			generatedVideo_conversion.setVideo_scale_info(VIDEO_RANGE_DEFAULT);
			generatedVideo_conversion.setVideo_scale_info(generatedScaled_width);
			generatedVideo_conversion.setVideo_scale_info(generatedScaled_height);
			return generatedVideo_conversion;
		} 
		return NULL;
	}
	public video_format getFormat() {
		return format;
	}
	public void setFormat(video_format newFormat) {
		format = newFormat;
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
	public video_range_type getRange() {
		return range;
	}
	public void setRange(video_range_type newRange) {
		range = newRange;
	}
	public video_colorspace getColorspace() {
		return colorspace;
	}
	public void setColorspace(video_colorspace newColorspace) {
		colorspace = newColorspace;
	}
}
