package application;

/******************************************************************************
    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>

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
public class video_frame {
	private Object data;
	private Object linesize;
	
	public video_frame(Object data, Object linesize) {
		setData(data);
		setLinesize(linesize);
	}
	public video_frame() {
	}
	
	/******************************************************************************
	    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>
	
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
	/* messy code alarm */
	public void video_frame_init(video_format format, Object width, Object height) {
		 size = new ();
		[] offsets = new ();
		int alignment = ModernizedCProgram.base_get_alignment();
		if (!frame) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(frame, 0, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(offsets, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedData = this.getData();
		Object generatedLinesize = this.getLinesize();
		switch (video_format.format) {
		case video_format.VIDEO_FORMAT_BGRA:
		case video_format.VIDEO_FORMAT_NONE:
				return /*Error: Unsupported expression*/;
		case video_format.VIDEO_FORMAT_I42A:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[0] = size;
				size += (width / 2) * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[1] = size;
				size += (width / 2) * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[2] = size;
				size += width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedData[1] = ()generatedData[0] + offsets[0];
				generatedData[2] = ()generatedData[0] + offsets[1];
				generatedData[3] = ()generatedData[0] + offsets[2];
				generatedLinesize[0] = width;
				generatedLinesize[1] = width / 2;
				generatedLinesize[2] = width / 2;
				generatedLinesize[3] = width;
				break;
		case video_format.VIDEO_FORMAT_I40A:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[0] = size;
				size += (width / 2) * (height / 2);
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[1] = size;
				size += (width / 2) * (height / 2);
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[2] = size;
				size += width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedData[1] = ()generatedData[0] + offsets[0];
				generatedData[2] = ()generatedData[0] + offsets[1];
				generatedData[3] = ()generatedData[0] + offsets[2];
				generatedLinesize[0] = width;
				generatedLinesize[1] = width / 2;
				generatedLinesize[2] = width / 2;
				generatedLinesize[3] = width;
				break;
		case video_format.VIDEO_FORMAT_NV12:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[0] = size;
				size += (width / 2) * (height / 2) * 2;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedData[1] = ()generatedData[0] + offsets[0];
				generatedLinesize[0] = width;
				generatedLinesize[1] = width;
				break;
		case video_format.VIDEO_FORMAT_Y800:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedLinesize[0] = width;
				break;
		case video_format.VIDEO_FORMAT_BGRX:
		case video_format.VIDEO_FORMAT_YUVA:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[0] = size;
				size += width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[1] = size;
				size += width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[2] = size;
				size += width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedData[1] = ()generatedData[0] + offsets[0];
				generatedData[2] = ()generatedData[0] + offsets[1];
				generatedData[3] = ()generatedData[0] + offsets[2];
				generatedLinesize[0] = width;
				generatedLinesize[1] = width;
				generatedLinesize[2] = width;
				generatedLinesize[3] = width;
				break;
		case video_format.VIDEO_FORMAT_YUY2:
		case video_format.VIDEO_FORMAT_AYUV:
				size = width * height * 4;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedLinesize[0] = width * 4;
				break;
		case video_format.VIDEO_FORMAT_YVYU:
		case video_format.VIDEO_FORMAT_I444:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size * 3);
				generatedData[1] = ()generatedData[0] + size;
				generatedData[2] = ()generatedData[1] + size;
				generatedLinesize[0] = width;
				generatedLinesize[1] = width;
				generatedLinesize[2] = width;
				break;
		case video_format.VIDEO_FORMAT_RGBA:
		case video_format.VIDEO_FORMAT_BGR3:
				size = width * height * 3;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedLinesize[0] = width * 3;
				break;
		case video_format.VIDEO_FORMAT_I422:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[0] = size;
				size += (width / 2) * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[1] = size;
				size += (width / 2) * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedData[1] = ()generatedData[0] + offsets[0];
				generatedData[2] = ()generatedData[0] + offsets[1];
				generatedLinesize[0] = width;
				generatedLinesize[1] = width / 2;
				generatedLinesize[2] = width / 2;
				break;
		case video_format.VIDEO_FORMAT_I420:
				size = width * height;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[0] = size;
				size += (width / 2) * (height / 2);
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				offsets[1] = size;
				size += (width / 2) * (height / 2);
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedData[1] = ()generatedData[0] + offsets[0];
				generatedData[2] = ()generatedData[0] + offsets[1];
				generatedLinesize[0] = width;
				generatedLinesize[1] = width / 2;
				generatedLinesize[2] = width / 2;
				break;
		case video_format.VIDEO_FORMAT_UYVY:
				size = width * height * 2;
				size = (((size) + (alignment - 1)) & (~(alignment - 1)));
				generatedData[0] = ModernizedCProgram.bmalloc(size);
				generatedLinesize[0] = width * 2;
				break;
		}
	}
	public void video_frame_copy(Object src, video_format format, Object cy) {
		Object generatedData = this.getData();
		switch (video_format.format) {
		case video_format.VIDEO_FORMAT_UYVY:
		case video_format.VIDEO_FORMAT_BGRA:
		case video_format.VIDEO_FORMAT_I420:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[0], generatedData[0], src.getLinesize()[0] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[1], generatedData[1], src.getLinesize()[1] * cy / 2);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[2], generatedData[2], src.getLinesize()[2] * cy / 2);
				break;
		case video_format.VIDEO_FORMAT_Y800:
		case video_format.VIDEO_FORMAT_YVYU:
		case video_format.VIDEO_FORMAT_I42A:
		case video_format.VIDEO_FORMAT_NV12:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[0], generatedData[0], src.getLinesize()[0] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[1], generatedData[1], src.getLinesize()[1] * cy / 2);
				break;
		case video_format.VIDEO_FORMAT_I444:
		case video_format.VIDEO_FORMAT_I40A:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[0], generatedData[0], src.getLinesize()[0] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[1], generatedData[1], src.getLinesize()[1] * cy / 2);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[2], generatedData[2], src.getLinesize()[2] * cy / 2);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[3], generatedData[3], src.getLinesize()[3] * cy);
				break;
		case video_format.VIDEO_FORMAT_YUVA:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[0], generatedData[0], src.getLinesize()[0] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[1], generatedData[1], src.getLinesize()[1] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[2], generatedData[2], src.getLinesize()[2] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[3], generatedData[3], src.getLinesize()[3] * cy);
				break;
		case video_format.VIDEO_FORMAT_BGR3:
		case video_format.VIDEO_FORMAT_NONE:
				return /*Error: Unsupported expression*/;
		case video_format.VIDEO_FORMAT_RGBA:
		case video_format.VIDEO_FORMAT_AYUV:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[0], generatedData[0], src.getLinesize()[0] * cy);
				break;
		case video_format.VIDEO_FORMAT_I422:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[0], generatedData[0], src.getLinesize()[0] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[1], generatedData[1], src.getLinesize()[1] * cy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[2], generatedData[2], src.getLinesize()[2] * cy);
				break;
		case video_format.VIDEO_FORMAT_BGRX:
		case video_format.VIDEO_FORMAT_YUY2:
		}
	}
	public void video_frame_free() {
		Object generatedData = this.getData();
		if (frame) {
			ModernizedCProgram.bfree(generatedData[0]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(frame, 0, /*Error: Unsupported expression*/);
		} 
	}
	public video_frame video_frame_create(video_format format, Object width, Object height) {
		video_frame frame = new video_frame();
		frame = (video_frame)ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		frame.video_frame_init(video_format.format, width, height);
		return frame;
	}
	public void video_frame_destroy() {
		Object generatedData = this.getData();
		if (frame) {
			ModernizedCProgram.bfree(generatedData[0]);
			ModernizedCProgram.bfree(frame);
		} 
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
}
