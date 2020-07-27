package application;

/******************************************************************************
    Copyright (C) 2014 by Hugh Bailey <obs.jim@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
public class video_scaler {
	private SwsContext swscale;
	private int src_height;
	
	public video_scaler(SwsContext swscale, int src_height) {
		setSwscale(swscale);
		setSrc_height(src_height);
	}
	public video_scaler() {
	}
	
	public int video_scaler_create(Object dst, Object src, video_scale_type type) {
		AVPixelFormat format_src = ModernizedCProgram.get_ffmpeg_video_format(src.getFormat());
		AVPixelFormat format_dst = ModernizedCProgram.get_ffmpeg_video_format(dst.getFormat());
		int scale_type = ModernizedCProgram.get_ffmpeg_scale_type(video_scale_type.type);
		int coeff_src = ModernizedCProgram.get_ffmpeg_coeffs(src.getColorspace());
		int coeff_dst = ModernizedCProgram.get_ffmpeg_coeffs(dst.getColorspace());
		int range_src = ModernizedCProgram.get_ffmpeg_range_type(src.getRange());
		int range_dst = ModernizedCProgram.get_ffmpeg_range_type(dst.getRange());
		video_scaler scaler = new video_scaler();
		int ret;
		if (!scaler_out) {
			return -2;
		} 
		if (AVPixelFormat.format_src == AV_PIX_FMT_NONE || AVPixelFormat.format_dst == AV_PIX_FMT_NONE) {
			return -1;
		} 
		scaler = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		scaler.setSrc_height(src.getHeight());
		scaler.setSwscale(/*Error: Function owner not recognized*/sws_getCachedContext(NULL, src.getWidth(), src.getHeight(), AVPixelFormat.format_src, dst.getWidth(), dst.getHeight(), AVPixelFormat.format_dst, scale_type, NULL, NULL, NULL));
		SwsContext generatedSwscale = scaler.getSwscale();
		if (!generatedSwscale) {
			ModernizedCProgram.blog(LOG_ERROR, "video_scaler_create: Could not create swscale");
			;
		} 
		ret = /*Error: Function owner not recognized*/sws_setColorspaceDetails(generatedSwscale, coeff_src, range_src, coeff_dst, range_dst, 0, (1 << 16), (1 << 16));
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_DEBUG, "video_scaler_create: sws_setColorspaceDetails failed, ignoring");
		} 
		scaler_out = scaler;
		return 0;
		return -2;
	}
	public void video_scaler_destroy() {
		SwsContext generatedSwscale = this.getSwscale();
		if (scaler) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sws_freeContext(generatedSwscale);
			ModernizedCProgram.bfree(scaler);
		} 
	}
	public Object video_scaler_scale(Object output, Object out_linesize, Object input, Object in_linesize) {
		if (!scaler) {
			return false;
		} 
		SwsContext generatedSwscale = this.getSwscale();
		int generatedSrc_height = this.getSrc_height();
		int ret = /*Error: Function owner not recognized*/sws_scale(generatedSwscale, input, (int)in_linesize, 0, generatedSrc_height, output, (int)out_linesize);
		if (ret <= 0) {
			ModernizedCProgram.blog(LOG_ERROR, "video_scaler_scale: sws_scale failed: %d", ret);
			return false;
		} 
		return true;
	}
	public SwsContext getSwscale() {
		return swscale;
	}
	public void setSwscale(SwsContext newSwscale) {
		swscale = newSwscale;
	}
	public int getSrc_height() {
		return src_height;
	}
	public void setSrc_height(int newSrc_height) {
		src_height = newSrc_height;
	}
}
