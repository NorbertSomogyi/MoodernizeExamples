package application;

/* Characteristics measured about a hypothetical split position. */
public class split_measurement {
	private int end_of_file;
	private int indent;
	private int pre_blank;
	private int pre_indent;
	private int post_blank;
	private int post_indent;
	
	public split_measurement(int end_of_file, int indent, int pre_blank, int pre_indent, int post_blank, int post_indent) {
		setEnd_of_file(end_of_file);
		setIndent(indent);
		setPre_blank(pre_blank);
		setPre_indent(pre_indent);
		setPost_blank(post_blank);
		setPost_indent(post_indent);
	}
	public split_measurement() {
	}
	
	public void measure_split(Object xdf, long split) {
		long i;
		if (split >= xdf.getNrec()) {
			ModernizedCProgram.m.setEnd_of_file(1);
			ModernizedCProgram.m.setIndent(-1);
		} else {
				ModernizedCProgram.m.setEnd_of_file(0);
				ModernizedCProgram.m.setIndent(xdf.getRecs()[split].xget_indent());
		} 
		ModernizedCProgram.m.setPre_blank(0);
		ModernizedCProgram.m.setPre_indent(-1);
		for (i = split - 1; i >= 0; i--) {
			ModernizedCProgram.m.setPre_indent(xdf.getRecs()[i].xget_indent());
			if (ModernizedCProgram.m.getPre_indent() != -1) {
				break;
			} 
			ModernizedCProgram.m.getPre_blank() += 1;
			if (ModernizedCProgram.m.getPre_blank() == 20) {
				ModernizedCProgram.m.setPre_indent(0);
				break;
			} 
		}
		ModernizedCProgram.m.setPost_blank(0);
		ModernizedCProgram.m.setPost_indent(-1);
		for (i = split + 1; i < xdf.getNrec(); i++) {
			ModernizedCProgram.m.setPost_indent(xdf.getRecs()[i].xget_indent());
			if (ModernizedCProgram.m.getPost_indent() != -1) {
				break;
			} 
			ModernizedCProgram.m.getPost_blank() += 1;
			if (ModernizedCProgram.m.getPost_blank() == 20) {
				ModernizedCProgram.m.setPost_indent(0);
				break;
			} 
		}
	}
	public int getEnd_of_file() {
		return end_of_file;
	}
	public void setEnd_of_file(int newEnd_of_file) {
		end_of_file = newEnd_of_file;
	}
	public int getIndent() {
		return indent;
	}
	public void setIndent(int newIndent) {
		indent = newIndent;
	}
	public int getPre_blank() {
		return pre_blank;
	}
	public void setPre_blank(int newPre_blank) {
		pre_blank = newPre_blank;
	}
	public int getPre_indent() {
		return pre_indent;
	}
	public void setPre_indent(int newPre_indent) {
		pre_indent = newPre_indent;
	}
	public int getPost_blank() {
		return post_blank;
	}
	public void setPost_blank(int newPost_blank) {
		post_blank = newPost_blank;
	}
	public int getPost_indent() {
		return post_indent;
	}
	public void setPost_indent(int newPost_indent) {
		post_indent = newPost_indent;
	}
}
/*
	 * Is the split at the end of the file (aside from any blank lines)?
	 */
/* Penalty if there are no non-blank lines before the split */
