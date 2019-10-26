package application;

public class ff_callbacks {
	private Object frame;
	private Object format;
	private Object initialize;
	private Object frame_initialize;
	private Object frame_free;
	private Object opaque;
	
	public ff_callbacks(Object frame, Object format, Object initialize, Object frame_initialize, Object frame_free, Object opaque) {
		setFrame(frame);
		setFormat(format);
		setInitialize(initialize);
		setFrame_initialize(frame_initialize);
		setFrame_free(frame_free);
		setOpaque(opaque);
	}
	public ff_callbacks() {
	}
	
	public boolean ff_callbacks_format(Object codec_context) {
		Object generatedFormat = this.getFormat();
		if (generatedFormat == ((Object)0)) {
			return 1;
		} 
		Object generatedOpaque = this.getOpaque();
		return .UNRECOGNIZEDFUNCTIONNAME(codec_context, generatedOpaque);
	}
	public boolean ff_callbacks_initialize() {
		Object generatedInitialize = this.getInitialize();
		if (generatedInitialize == ((Object)0)) {
			return 1;
		} 
		Object generatedOpaque = this.getOpaque();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedOpaque);
	}
	public void ff_demuxer_set_callbacks(Object frame, Object format, Object initialize, Object frame_initialize, Object frame_free, Object opaque) {
		this.setOpaque(opaque);
		this.setFrame(frame);
		this.setFormat(format);
		this.setInitialize(initialize);
		this.setFrame_initialize(frame_initialize);
		this.setFrame_free(frame_free);
	}
	public Object getFrame() {
		return frame;
	}
	public void setFrame(Object newFrame) {
		frame = newFrame;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public Object getInitialize() {
		return initialize;
	}
	public void setInitialize(Object newInitialize) {
		initialize = newInitialize;
	}
	public Object getFrame_initialize() {
		return frame_initialize;
	}
	public void setFrame_initialize(Object newFrame_initialize) {
		frame_initialize = newFrame_initialize;
	}
	public Object getFrame_free() {
		return frame_free;
	}
	public void setFrame_free(Object newFrame_free) {
		frame_free = newFrame_free;
	}
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
}
