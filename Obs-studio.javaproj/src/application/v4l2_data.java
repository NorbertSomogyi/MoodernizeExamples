package application;

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
/* The new dv timing api was introduced in Linux 3.4
 * Currently we simply disable dv timings when this is not defined */
/**
 * Data structure for the v4l2 source
 */
public class v4l2_data {
	private Byte device_id;
	private int input;
	private int pixfmt;
	private int standard;
	private int dv_timing;
	private int resolution;
	private int framerate;
	private int color_range;
	private obs_source source;
	private Object thread;
	private Object event;
	private Object dev;
	private int width;
	private int height;
	private int linesize;
	private v4l2_buffer_data buffers;
	
	public v4l2_data(Byte device_id, int input, int pixfmt, int standard, int dv_timing, int resolution, int framerate, int color_range, obs_source source, Object thread, Object event, Object dev, int width, int height, int linesize, v4l2_buffer_data buffers) {
		setDevice_id(device_id);
		setInput(input);
		setPixfmt(pixfmt);
		setStandard(standard);
		setDv_timing(dv_timing);
		setResolution(resolution);
		setFramerate(framerate);
		setColor_range(color_range);
		setSource(source);
		setThread(thread);
		setEvent(event);
		setDev(dev);
		setWidth(width);
		setHeight(height);
		setLinesize(linesize);
		setBuffers(buffers);
	}
	public v4l2_data() {
	}
	
	public void v4l2_terminate() {
		if (ModernizedCProgram.data.getThread()) {
			ModernizedCProgram.data.getEvent().os_event_signal();
			ModernizedCProgram.pthread_join(ModernizedCProgram.data.getThread(), ((Object)0));
			ModernizedCProgram.data.getEvent().os_event_destroy();
			ModernizedCProgram.data.setThread(0);
		} 
		ModernizedCProgram.data.getBuffers().v4l2_destroy_mmap();
		if (ModernizedCProgram.data.getDev() != -1) {
			.v4l2_close(ModernizedCProgram.data.getDev());
			ModernizedCProgram.data.setDev(-1);
		} 
	}
	/**
	 * Prepare the output frame structure for obs and compute plane offsets
	 *
	 * Basically all data apart from memory pointers and the timestamp is known
	 * before the capture starts. This function prepares the obs_source_frame
	 * struct with all the data that is already known.
	 *
	 * v4l2 uses a continuous memory segment for all planes so we simply compute
	 * offsets to add to the start address in order to give obs the correct data
	 * pointers for the individual planes.
	 */
	/* forward declarations */
	public void v4l2_init() {
		uint32_t input_caps = new uint32_t();
		int fps_num;
		int fps_denom;
		ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Start capture from %s", ModernizedCProgram.data.getDevice_id());
		ModernizedCProgram.data.setDev(.v4l2_open(ModernizedCProgram.data.getDevice_id(), 2 | O_NONBLOCK));
		if (ModernizedCProgram.data.getDev() == -1) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Unable to open device");
			;
		} 
		if (ModernizedCProgram.v4l2_set_input(ModernizedCProgram.data.getDev(), ModernizedCProgram.data.getInput()) < /* set input */0) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Unable to set input %d", ModernizedCProgram.data.getInput());
			;
		} 
		ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Input: %d", ModernizedCProgram.data.getInput());
		if (ModernizedCProgram.v4l2_get_input_caps(ModernizedCProgram.data.getDev(), -1, input_caps) < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Unable to get input capabilities");
			;
		} 
		if (input_caps & /* set video standard if supported */V4L2_IN_CAP_STD) {
			if (ModernizedCProgram.v4l2_set_standard(ModernizedCProgram.data.getDev(), ModernizedCProgram.data.getStandard()) < 0) {
				ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Unable to set video standard");
				;
			} 
			ModernizedCProgram.data.setResolution(-1);
			ModernizedCProgram.data.setFramerate(-1);
		} 
		if (input_caps & /* set dv timing if supported */0) {
			if (ModernizedCProgram.v4l2_set_dv_timing(ModernizedCProgram.data.getDev(), ModernizedCProgram.data.getDv_timing()) < 0) {
				ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Unable to set dv timing");
				;
			} 
			ModernizedCProgram.data.setResolution(-1);
			ModernizedCProgram.data.setFramerate(-1);
		} 
		if (ModernizedCProgram.v4l2_set_format(ModernizedCProgram.data.getDev(), ModernizedCProgram.data.getResolution(), ModernizedCProgram.data.getPixfmt(), ModernizedCProgram.data.getLinesize()) < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Unable to set format");
			;
		} 
		if (ModernizedCProgram.v4l2_to_obs_video_format(ModernizedCProgram.data.getPixfmt()) == VIDEO_FORMAT_NONE) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Selected video format not supported");
			;
		} 
		ModernizedCProgram.v4l2_unpack_tuple(ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight(), ModernizedCProgram.data.getResolution());
		ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Resolution: %dx%d", ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight());
		ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Pixelformat: %s", );
		ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Linesize: %d Bytes", ModernizedCProgram.data.getLinesize());
		if (ModernizedCProgram.v4l2_set_framerate(ModernizedCProgram.data.getDev(), ModernizedCProgram.data.getFramerate()) < /* set framerate */0) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Unable to set framerate");
			;
		} 
		ModernizedCProgram.v4l2_unpack_tuple(fps_num, fps_denom, ModernizedCProgram.data.getFramerate());
		ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Framerate: %.2f fps", (double)fps_denom / fps_num);
		if (ModernizedCProgram.data.getBuffers().v4l2_create_mmap(ModernizedCProgram.data.getDev()) < /* map buffers */0) {
			ModernizedCProgram.blog(LOG_ERROR, "v4l2-input: Failed to map buffers");
			;
		} 
		if (ModernizedCProgram.data.getEvent().os_event_init(OS_EVENT_TYPE_MANUAL) != /* start the capture thread */0) {
			;
		} 
		if (ModernizedCProgram.pthread_create(ModernizedCProgram.data.getThread(), ((Object)0), v4l2_thread, ModernizedCProgram.data) != 0) {
			;
		} 
		return ;
		ModernizedCProgram.data.v4l2_terminate();
	}
	public Byte getDevice_id() {
		return device_id;
	}
	public void setDevice_id(Byte newDevice_id) {
		device_id = newDevice_id;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int newInput) {
		input = newInput;
	}
	public int getPixfmt() {
		return pixfmt;
	}
	public void setPixfmt(int newPixfmt) {
		pixfmt = newPixfmt;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int newStandard) {
		standard = newStandard;
	}
	public int getDv_timing() {
		return dv_timing;
	}
	public void setDv_timing(int newDv_timing) {
		dv_timing = newDv_timing;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int newResolution) {
		resolution = newResolution;
	}
	public int getFramerate() {
		return framerate;
	}
	public void setFramerate(int newFramerate) {
		framerate = newFramerate;
	}
	public int getColor_range() {
		return color_range;
	}
	public void setColor_range(int newColor_range) {
		color_range = newColor_range;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getEvent() {
		return event;
	}
	public void setEvent(Object newEvent) {
		event = newEvent;
	}
	public Object getDev() {
		return dev;
	}
	public void setDev(Object newDev) {
		dev = newDev;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public int getLinesize() {
		return linesize;
	}
	public void setLinesize(int newLinesize) {
		linesize = newLinesize;
	}
	public v4l2_buffer_data getBuffers() {
		return buffers;
	}
	public void setBuffers(v4l2_buffer_data newBuffers) {
		buffers = newBuffers;
	}
}
/* settings */
