package application;

public class gs_init_data {
	private gs_window window;
	private Object cx;
	private Object cy;
	private Object num_backbuffers;
	private gs_color_format format;
	private gs_zstencil_format zsformat;
	private Object adapter;
	
	public gs_init_data(gs_window window, Object cx, Object cy, Object num_backbuffers, gs_color_format format, gs_zstencil_format zsformat, Object adapter) {
		setWindow(window);
		setCx(cx);
		setCy(cy);
		setNum_backbuffers(num_backbuffers);
		setFormat(format);
		setZsformat(zsformat);
		setAdapter(adapter);
	}
	public gs_init_data() {
	}
	
	public gs_window getWindow() {
		return window;
	}
	public void setWindow(gs_window newWindow) {
		window = newWindow;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public Object getNum_backbuffers() {
		return num_backbuffers;
	}
	public void setNum_backbuffers(Object newNum_backbuffers) {
		num_backbuffers = newNum_backbuffers;
	}
	public gs_color_format getFormat() {
		return format;
	}
	public void setFormat(gs_color_format newFormat) {
		format = newFormat;
	}
	public gs_zstencil_format getZsformat() {
		return zsformat;
	}
	public void setZsformat(gs_zstencil_format newZsformat) {
		zsformat = newZsformat;
	}
	public Object getAdapter() {
		return adapter;
	}
	public void setAdapter(Object newAdapter) {
		adapter = newAdapter;
	}
}
