package application;

/*    The GIF frame data
*/
public class gif_frame {
	private boolean display;
	private int frame_delay;
	private int frame_pointer;
	private boolean virgin;
	private boolean opaque;
	private boolean redraw_required;
	private byte disposal_method;
	private boolean transparency;
	private byte transparency_index;
	private int redraw_x;
	private int redraw_y;
	private int redraw_width;
	private int redraw_height;
	
	public gif_frame(boolean display, int frame_delay, int frame_pointer, boolean virgin, boolean opaque, boolean redraw_required, byte disposal_method, boolean transparency, byte transparency_index, int redraw_x, int redraw_y, int redraw_width, int redraw_height) {
		setDisplay(display);
		setFrame_delay(frame_delay);
		setFrame_pointer(frame_pointer);
		setVirgin(virgin);
		setOpaque(opaque);
		setRedraw_required(redraw_required);
		setDisposal_method(disposal_method);
		setTransparency(transparency);
		setTransparency_index(transparency_index);
		setRedraw_x(redraw_x);
		setRedraw_y(redraw_y);
		setRedraw_width(redraw_width);
		setRedraw_height(redraw_height);
	}
	public gif_frame() {
	}
	
	public boolean getDisplay() {
		return display;
	}
	public void setDisplay(boolean newDisplay) {
		display = newDisplay;
	}
	public int getFrame_delay() {
		return frame_delay;
	}
	public void setFrame_delay(int newFrame_delay) {
		frame_delay = newFrame_delay;
	}
	public int getFrame_pointer() {
		return frame_pointer;
	}
	public void setFrame_pointer(int newFrame_pointer) {
		frame_pointer = newFrame_pointer;
	}
	public boolean getVirgin() {
		return virgin;
	}
	public void setVirgin(boolean newVirgin) {
		virgin = newVirgin;
	}
	public boolean getOpaque() {
		return opaque;
	}
	public void setOpaque(boolean newOpaque) {
		opaque = newOpaque;
	}
	public boolean getRedraw_required() {
		return redraw_required;
	}
	public void setRedraw_required(boolean newRedraw_required) {
		redraw_required = newRedraw_required;
	}
	public byte getDisposal_method() {
		return disposal_method;
	}
	public void setDisposal_method(byte newDisposal_method) {
		disposal_method = newDisposal_method;
	}
	public boolean getTransparency() {
		return transparency;
	}
	public void setTransparency(boolean newTransparency) {
		transparency = newTransparency;
	}
	public byte getTransparency_index() {
		return transparency_index;
	}
	public void setTransparency_index(byte newTransparency_index) {
		transparency_index = newTransparency_index;
	}
	public int getRedraw_x() {
		return redraw_x;
	}
	public void setRedraw_x(int newRedraw_x) {
		redraw_x = newRedraw_x;
	}
	public int getRedraw_y() {
		return redraw_y;
	}
	public void setRedraw_y(int newRedraw_y) {
		redraw_y = newRedraw_y;
	}
	public int getRedraw_width() {
		return redraw_width;
	}
	public void setRedraw_width(int newRedraw_width) {
		redraw_width = newRedraw_width;
	}
	public int getRedraw_height() {
		return redraw_height;
	}
	public void setRedraw_height(int newRedraw_height) {
		redraw_height = newRedraw_height;
	}
}
