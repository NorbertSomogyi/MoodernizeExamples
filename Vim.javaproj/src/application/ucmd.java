package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * usercmd.c: User defined command support
 */
public class ucmd {
	private Object uc_name;
	private Object uc_argt;
	private Object uc_rep;
	private long uc_def;
	private int uc_compl;
	private  uc_addr_type;
	private  uc_script_ctx;
	private Object uc_compl_arg;
	
	public ucmd(Object uc_name, Object uc_argt, Object uc_rep, long uc_def, int uc_compl,  uc_addr_type,  uc_script_ctx, Object uc_compl_arg) {
		setUc_name(uc_name);
		setUc_argt(uc_argt);
		setUc_rep(uc_rep);
		setUc_def(uc_def);
		setUc_compl(uc_compl);
		setUc_addr_type(uc_addr_type);
		setUc_script_ctx(uc_script_ctx);
		setUc_compl_arg(uc_compl_arg);
	}
	public ucmd() {
	}
	
	public Object getUc_name() {
		return uc_name;
	}
	public void setUc_name(Object newUc_name) {
		uc_name = newUc_name;
	}
	public Object getUc_argt() {
		return uc_argt;
	}
	public void setUc_argt(Object newUc_argt) {
		uc_argt = newUc_argt;
	}
	public Object getUc_rep() {
		return uc_rep;
	}
	public void setUc_rep(Object newUc_rep) {
		uc_rep = newUc_rep;
	}
	public long getUc_def() {
		return uc_def;
	}
	public void setUc_def(long newUc_def) {
		uc_def = newUc_def;
	}
	public int getUc_compl() {
		return uc_compl;
	}
	public void setUc_compl(int newUc_compl) {
		uc_compl = newUc_compl;
	}
	public  getUc_addr_type() {
		return uc_addr_type;
	}
	public void setUc_addr_type( newUc_addr_type) {
		uc_addr_type = newUc_addr_type;
	}
	public  getUc_script_ctx() {
		return uc_script_ctx;
	}
	public void setUc_script_ctx( newUc_script_ctx) {
		uc_script_ctx = newUc_script_ctx;
	}
	public Object getUc_compl_arg() {
		return uc_compl_arg;
	}
	public void setUc_compl_arg(Object newUc_compl_arg) {
		uc_compl_arg = newUc_compl_arg;
	}
}
