package application;

public class nth_line_cb {
	private diff_filespec spec;
	private long lines;
	private Long line_ends;
	
	public nth_line_cb(diff_filespec spec, long lines, Long line_ends) {
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
	public Long getLine_ends() {
		return line_ends;
	}
	public void setLine_ends(Long newLine_ends) {
		line_ends = newLine_ends;
	}
}
