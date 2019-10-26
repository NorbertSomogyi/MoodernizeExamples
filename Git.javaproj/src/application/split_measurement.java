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
			this.setEnd_of_file(1);
			this.setIndent(-1);
		} else {
				this.setEnd_of_file(0);
				this.setIndent(xdf.getRecs()[split].get_indent());
		} 
		this.setPre_blank(0);
		this.setPre_indent(-1);
		int generatedPre_indent = this.getPre_indent();
		int generatedPre_blank = this.getPre_blank();
		for (i = split - 1; i >= 0; i--) {
			this.setPre_indent(xdf.getRecs()[i].get_indent());
			if (generatedPre_indent != -1) {
				break;
			} 
			generatedPre_blank += 1;
			if (generatedPre_blank == 20) {
				this.setPre_indent(0);
				break;
			} 
		}
		this.setPost_blank(0);
		this.setPost_indent(-1);
		int generatedPost_indent = this.getPost_indent();
		int generatedPost_blank = this.getPost_blank();
		for (i = split + 1; i < xdf.getNrec(); i++) {
			this.setPost_indent(xdf.getRecs()[i].get_indent());
			if (generatedPost_indent != -1) {
				break;
			} 
			generatedPost_blank += 1;
			if (generatedPost_blank == 20) {
				this.setPost_indent(0);
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
