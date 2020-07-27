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
public class ffmpeg_decode {
	private Object decoder;
	private Object codec;
	private Object hw_frame;
	private Object frame;
	private Object hw;
	private Object packet_buffer;
	private Object packet_size;
	
	public ffmpeg_decode(Object decoder, Object codec, Object hw_frame, Object frame, Object hw, Object packet_buffer, Object packet_size) {
		setDecoder(decoder);
		setCodec(codec);
		setHw_frame(hw_frame);
		setFrame(frame);
		setHw(hw);
		setPacket_buffer(packet_buffer);
		setPacket_size(packet_size);
	}
	public ffmpeg_decode() {
	}
	
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
	public int ffmpeg_decode_init(Object id, Object use_hw) {
		int ret;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(decode, 0, /*Error: sizeof expression not supported yet*/);
		this.setCodec(/*Error: Function owner not recognized*/avcodec_find_decoder(id));
		Object generatedCodec = this.getCodec();
		if (!generatedCodec) {
			return -1;
		} 
		this.setDecoder(/*Error: Function owner not recognized*/avcodec_alloc_context3(generatedCodec));
		Object generatedDecoder = this.getDecoder();
		generatedDecoder.setThread_count(0);
		(Object)use_hw;
		ret = /*Error: Function owner not recognized*/avcodec_open2(generatedDecoder, generatedCodec, NULL);
		if (ret < 0) {
			decode.ffmpeg_decode_free();
			return ret;
		} 
		if (generatedCodec.getCapabilities() & CODEC_CAP_TRUNCATED) {
			generatedDecoder.getFlags() |=  CODEC_FLAG_TRUNCATED;
		} 
		return 0;
	}
	public void ffmpeg_decode_free() {
		Object generatedHw_frame = this.getHw_frame();
		if (generatedHw_frame) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(generatedHw_frame);
		} 
		Object generatedDecoder = this.getDecoder();
		if (generatedDecoder) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_close(generatedDecoder);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(generatedDecoder);
		} 
		Object generatedFrame = this.getFrame();
		if (generatedFrame) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(generatedFrame);
		} 
		Object generatedPacket_buffer = this.getPacket_buffer();
		if (generatedPacket_buffer) {
			ModernizedCProgram.bfree(generatedPacket_buffer);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(decode, 0, /*Error: sizeof expression not supported yet*/);
	}
	public Object ffmpeg_decode_valid() {
		Object generatedDecoder = this.getDecoder();
		return generatedDecoder != NULL;
	}
	public Object getDecoder() {
		return decoder;
	}
	public void setDecoder(Object newDecoder) {
		decoder = newDecoder;
	}
	public Object getCodec() {
		return codec;
	}
	public void setCodec(Object newCodec) {
		codec = newCodec;
	}
	public Object getHw_frame() {
		return hw_frame;
	}
	public void setHw_frame(Object newHw_frame) {
		hw_frame = newHw_frame;
	}
	public Object getFrame() {
		return frame;
	}
	public void setFrame(Object newFrame) {
		frame = newFrame;
	}
	public Object getHw() {
		return hw;
	}
	public void setHw(Object newHw) {
		hw = newHw;
	}
	public Object getPacket_buffer() {
		return packet_buffer;
	}
	public void setPacket_buffer(Object newPacket_buffer) {
		packet_buffer = newPacket_buffer;
	}
	public Object getPacket_size() {
		return packet_size;
	}
	public void setPacket_size(Object newPacket_size) {
		packet_size = newPacket_size;
	}
}
