package application;

public class v4l2_buffer_data {
	private Object count;
	private v4l2_mmap_info info;
	
	public v4l2_buffer_data(Object count, v4l2_mmap_info info) {
		setCount(count);
		setInfo(info);
	}
	public v4l2_buffer_data() {
	}
	
	/*
	Copyright (C) 2014 by Leonhard Oelke <leonhard@in-verted.de>
	
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
	*/
	public Object v4l2_start_capture(Object dev) {
		v4l2_buf_type type;
		v4l2_buffer enq = new v4l2_buffer();
		.memset(enq, 0, );
		enq.setV4l2_buffer(V4L2_BUF_TYPE_VIDEO_CAPTURE);
		enq.setV4l2_buffer(V4L2_MEMORY_MMAP);
		Object generatedV4l2_buffer = enq.getV4l2_buffer();
		Object generatedCount = this.getCount();
		for (enq.setV4l2_buffer(0); generatedV4l2_buffer < generatedCount; ++generatedV4l2_buffer) {
			if (.v4l2_ioctl(dev, VIDIOC_QBUF, enq) < 0) {
				ModernizedCProgram.blog(LOG_ERROR, "v4l2-helpers: unable to queue buffer");
				return -1;
			} 
		}
		v4l2_buf_type.type = V4L2_BUF_TYPE_VIDEO_CAPTURE;
		if (.v4l2_ioctl(dev, VIDIOC_STREAMON, v4l2_buf_type.type) < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-helpers: unable to start stream");
			return -1;
		} 
		return 0;
	}
	public Object v4l2_create_mmap(Object dev) {
		v4l2_requestbuffers req = new v4l2_requestbuffers();
		v4l2_buffer map = new v4l2_buffer();
		.memset(req, 0, );
		req.setV4l2_requestbuffers(4);
		req.setV4l2_requestbuffers(V4L2_BUF_TYPE_VIDEO_CAPTURE);
		req.setV4l2_requestbuffers(V4L2_MEMORY_MMAP);
		if (.v4l2_ioctl(dev, VIDIOC_REQBUFS, req) < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-helpers: Request for buffers failed !");
			return -1;
		} 
		Object generatedV4l2_requestbuffers = req.getV4l2_requestbuffers();
		if (generatedV4l2_requestbuffers < 2) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-helpers: Device returned less than 2 buffers");
			return -1;
		} 
		this.setCount(generatedV4l2_requestbuffers);
		this.setInfo(ModernizedCProgram.bzalloc(generatedV4l2_requestbuffers * ));
		.memset(map, 0, );
		map.setV4l2_buffer(generatedV4l2_requestbuffers);
		map.setV4l2_buffer(generatedV4l2_requestbuffers);
		Object generatedV4l2_buffer = map.getV4l2_buffer();
		v4l2_mmap_info generatedInfo = this.getInfo();
		for (map.setV4l2_buffer(0); generatedV4l2_buffer < generatedV4l2_requestbuffers; ++generatedV4l2_buffer) {
			if (.v4l2_ioctl(dev, VIDIOC_QUERYBUF, map) < 0) {
				ModernizedCProgram.blog(LOG_ERROR, "v4l2-helpers: Failed to query buffer details");
				return -1;
			} 
			generatedInfo[generatedV4l2_buffer].setLength(generatedV4l2_buffer);
			generatedInfo[generatedV4l2_buffer].setStart(.v4l2_mmap(NULL, generatedV4l2_buffer, PROT_READ | PROT_WRITE, MAP_SHARED, dev, generatedV4l2_buffer.getOffset()));
			if (generatedInfo[generatedV4l2_buffer].getStart() == MAP_FAILED) {
				ModernizedCProgram.blog(LOG_ERROR, "v4l2-helpers: mmap for buffer failed");
				return -1;
			} 
		}
		return 0;
	}
	public Object v4l2_destroy_mmap() {
		Object generatedCount = this.getCount();
		v4l2_mmap_info generatedInfo = this.getInfo();
		for ( i = 0;
		 i < generatedCount; ++i) {
			if (generatedInfo[i].getStart() != MAP_FAILED && generatedInfo[i].getStart() != 0) {
				.v4l2_munmap(generatedInfo[i].getStart(), generatedInfo[i].getLength());
			} 
		}
		if (generatedCount) {
			ModernizedCProgram.bfree(generatedInfo);
			this.setCount(0);
		} 
		return 0;
	}
	public Object getCount() {
		return count;
	}
	public void setCount(Object newCount) {
		count = newCount;
	}
	public v4l2_mmap_info getInfo() {
		return info;
	}
	public void setInfo(v4l2_mmap_info newInfo) {
		info = newInfo;
	}
}
/** number of mapped buffers */
