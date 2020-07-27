package application;

/*
 * apply.c
 *
 * Copyright (C) Linus Torvalds, 2005
 *
 * This applies patches on top of some (arbitrary) version of the SCM.
 *
 */
public class gitdiff_data {
	private strbuf root;
	private int linenr;
	private int p_value;
	
	public gitdiff_data(strbuf root, int linenr, int p_value) {
		setRoot(root);
		setLinenr(linenr);
		setP_value(p_value);
	}
	public gitdiff_data() {
	}
	
	public int gitdiff_verify_name(Object line, int isnull, Byte name, int side) {
		if (!name && !isnull) {
			name = ModernizedCProgram.state.getRoot().find_name(line, ((Object)0), ModernizedCProgram.state.getP_value(), 2);
			return 0;
		} 
		if (name) {
			byte another;
			if (isnull) {
				return ();
			} 
			another = ModernizedCProgram.state.getRoot().find_name(line, ((Object)0), ModernizedCProgram.state.getP_value(), 2);
			if (!another || /*Error: Function owner not recognized*/strcmp(another, name)) {
				ModernizedCProgram.free(another);
				return ();
			} 
			ModernizedCProgram.free(another);
		} else {
				if (!ModernizedCProgram.is_dev_null(line)) {
					return ();
				} 
		} 
		return 0;
	}
	public strbuf getRoot() {
		return root;
	}
	public void setRoot(strbuf newRoot) {
		root = newRoot;
	}
	public int getLinenr() {
		return linenr;
	}
	public void setLinenr(int newLinenr) {
		linenr = newLinenr;
	}
	public int getP_value() {
		return p_value;
	}
	public void setP_value(int newP_value) {
		p_value = newP_value;
	}
}
