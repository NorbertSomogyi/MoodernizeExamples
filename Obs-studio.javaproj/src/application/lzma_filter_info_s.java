package application;

/// Type of a function to free the memory allocated for the coder
/// Raw coder validates and converts an array of lzma_filter structures to
/// an array of lzma_filter_info structures. This array is used with
/// lzma_next_filter_init to initialize the filter chain.
public class lzma_filter_info_s {
	private Object id;
	private Object init;
	private Object options;
	
	public lzma_filter_info_s(Object id, Object init, Object options) {
		setId(id);
		setInit(init);
		setOptions(options);
	}
	public lzma_filter_info_s() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getOptions() {
		return options;
	}
	public void setOptions(Object newOptions) {
		options = newOptions;
	}
}
/// Type of a function used to initialize a filter encoder or decoder
/// Type of a function to do some kind of coding work (filters, Stream,
/// Block encoders/decoders etc.). Some special coders use don't use both
/// input and output buffers, but for simplicity they still use this same
/// function prototype.
/// Filter ID. This is used only by the encoder
