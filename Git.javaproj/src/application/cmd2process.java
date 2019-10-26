package application;

public class cmd2process {
	private subprocess_entry subprocess;
	private int supported_capabilities;
	
	public cmd2process(subprocess_entry subprocess, int supported_capabilities) {
		setSubprocess(subprocess);
		setSupported_capabilities(supported_capabilities);
	}
	public cmd2process() {
	}
	
	public void handle_filter_error(Object filter_status, Object wanted_capability) {
		int generatedSupported_capabilities = this.getSupported_capabilities();
		subprocess_entry generatedSubprocess = this.getSubprocess();
		if (!.strcmp(filter_status.getBuf(), "error")) {
			;
		}  else if (!.strcmp(filter_status.getBuf(), "abort") && wanted_capability/*
				 * The filter signaled a permanent problem. Don't try to filter
				 * files with the same command for the lifetime of the current
				 * Git process.
				 */) {
			generatedSupported_capabilities &=  ~wanted_capability/*
					 * Something went wrong with the protocol filter.
					 * Force shutdown and restart if another blob requires filtering.
					 */;
		} else {
				();
				ModernizedCProgram.subprocess_stop(ModernizedCProgram.subprocess_map, generatedSubprocess);
				ModernizedCProgram.free(entry);
		} 
	}
	public subprocess_entry getSubprocess() {
		return subprocess;
	}
	public void setSubprocess(subprocess_entry newSubprocess) {
		subprocess = newSubprocess;
	}
	public int getSupported_capabilities() {
		return supported_capabilities;
	}
	public void setSupported_capabilities(int newSupported_capabilities) {
		supported_capabilities = newSupported_capabilities;
	}
}
