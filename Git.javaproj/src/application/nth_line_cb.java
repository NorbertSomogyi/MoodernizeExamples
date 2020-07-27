package application;

public class nth_line_cb {
	private diff_filespec spec;
	private long lines;
	private long[] line_ends;
	
	public nth_line_cb(diff_filespec spec, long lines, long[] line_ends) {
		setSpec(spec);
		setLines(lines);
		setLine_ends(line_ends);
	}
	public nth_line_cb() {
	}
	
	public diff_filespec getSpec() {
		return spec;
	}
	public void setSpec(diff_filespec newSpec) {
		spec = newSpec;
	}
	public long getLines() {
		return lines;
	}
	public void setLines(long newLines) {
		lines = newLines;
	}
	public long[] getLine_ends() {
		return line_ends;
	}
	public void setLine_ends(long[] newLine_ends) {
		line_ends = newLine_ends;
	}
}
