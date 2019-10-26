package application;

public class archiver_context {
	private archiver_args args;
	private Object write_entry;
	private directory bottom;
	
	public archiver_context(archiver_args args, Object write_entry, directory bottom) {
		setArgs(args);
		setWrite_entry(write_entry);
		setBottom(bottom);
	}
	public archiver_context() {
	}
	
	public int write_directory() {
		directory generatedBottom = this.getBottom();
		directory d = generatedBottom;
		int ret;
		if (!d) {
			return 0;
		} 
		directory generatedUp = d.getUp();
		this.setBottom(generatedUp);
		Object generatedPath = d.getPath();
		int generatedLen = d.getLen();
		generatedPath[generatedLen - 1] = /* no trailing slash */(byte)'\0';
		object_id generatedOid = d.getOid();
		int generatedBaselen = d.getBaselen();
		int generatedMode = d.getMode();
		int generatedStage = d.getStage();
		ret = c.write_directory() || ModernizedCProgram.write_archive_entry(generatedOid, generatedPath, generatedBaselen, generatedPath + generatedBaselen, generatedMode, generatedStage, c) != 1;
		ModernizedCProgram.free(d);
		return ret ? -1 : 0;
	}
	public archiver_args getArgs() {
		return args;
	}
	public void setArgs(archiver_args newArgs) {
		args = newArgs;
	}
	public Object getWrite_entry() {
		return write_entry;
	}
	public void setWrite_entry(Object newWrite_entry) {
		write_entry = newWrite_entry;
	}
	public directory getBottom() {
		return bottom;
	}
	public void setBottom(directory newBottom) {
		bottom = newBottom;
	}
}
