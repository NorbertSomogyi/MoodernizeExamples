package application;

public class split_score {
	private int effective_indent;
	private int penalty;
	
	public split_score(int effective_indent, int penalty) {
		setEffective_indent(effective_indent);
		setPenalty(penalty);
	}
	public split_score() {
	}
	
	/* Penalty if there are no non-blank lines after the split */
	/* Multiplier for the number of blank lines around the split */
	/* Multiplier for the number of blank lines after the split */
	/*
	 * Penalties applied if the line is indented more than its predecessor
	 */
	/*
	 * Penalties applied if the line is indented less than both its predecessor and
	 * its successor
	 */
	/*
	 * Penalties applied if the line is indented less than its predecessor but not
	 * less than its successor
	 */
	/*
	 * We only consider whether the sum of the effective indents for splits are
	 * less than (-1), equal to (0), or greater than (+1) each other. The resulting
	 * value is multiplied by the following weight and combined with the penalty to
	 * determine the better of two scores.
	 */
	/*
	 * How far do we slide a hunk at most?
	 */
	/*
	 * Compute a badness score for the hypothetical split whose measurements are
	 * stored in m. The weight factors were determined empirically using the tools and
	 * corpus described in
	 *
	 *     https://github.com/mhagger/diff-slider-tools
	 *
	 * Also see that project if you want to improve the weights based on, for example,
	 * a larger or more diverse corpus.
	 */
	public void score_add_split(Object m) {
		int post_blank;
		int total_blank;
		int indent;
		int any_blanks;
		int generatedPenalty = this.getPenalty();
		if (m.getPre_indent() == -1 && m.getPre_blank() == 0) {
			generatedPenalty += 1;
		} 
		if (m.getEnd_of_file()) {
			generatedPenalty += 21/*
				 * Set post_blank to the number of blank lines following the split,
				 * including the line immediately after the split:
				 */;
		} 
		post_blank = (m.getIndent() == -1) ? 1 + m.getPost_blank() : 0;
		total_blank = m.getPre_blank() + post_blank;
		generatedPenalty += (true) * /* Penalties based on nearby blank lines: */total_blank;
		generatedPenalty += 6 * post_blank;
		if (m.getIndent() != -1) {
			indent = m.getIndent();
		} else {
				indent = m.getPost_indent();
		} 
		any_blanks = (total_blank != 0);
		int generatedEffective_indent = this.getEffective_indent();
		generatedEffective_indent += /* Note that the effective indent is -1 at the end of the file: */indent;
		if (indent == -1) {
		}  else if (m.getPre_indent() == -/* No additional adjustments needed. */1) {
		}  else if (indent > m.getPre_indent()) {
			generatedPenalty += any_blanks ? 10 : (true);
		}  else if (indent == m.getPre_indent()/*
				 * The line is indented less than its predecessor. It could be
				 * the block terminator of the previous block, but it could
				 * also be the start of a new block (e.g., an "else" block, or
				 * maybe the previous block didn't have a block terminator).
				 * Try to distinguish those cases based on what comes next:
				 */) {
		} else {
				if (m.getPost_indent() != -1 && m.getPost_indent() > indent/*
							 * The following line is indented more. So it is likely
							 * that this line is the start of a block.
							 */) {
					generatedPenalty += any_blanks ? 17 : 24/*
								 * That was probably the end of a block.
								 */;
				} else {
						generatedPenalty += any_blanks ? 17 : 23;
				} 
		} 
	}
	/*
		 * A place to accumulate penalty factors (positive makes this index more
		 * favored):
		 */
	public int score_cmp(split_score s2) {
		int generatedEffective_indent = this.getEffective_indent();
		int cmp_indents = ((generatedEffective_indent > generatedEffective_indent) - (generatedEffective_indent < generatedEffective_indent));
		int generatedPenalty = this.getPenalty();
		return 60 * cmp_indents + (generatedPenalty - generatedPenalty);
	}
	public int getEffective_indent() {
		return effective_indent;
	}
	public void setEffective_indent(int newEffective_indent) {
		effective_indent = newEffective_indent;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int newPenalty) {
		penalty = newPenalty;
	}
}
/* The effective indent of this split (smaller is preferred). */
