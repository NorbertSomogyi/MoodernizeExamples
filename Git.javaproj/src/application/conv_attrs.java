package application;

public class conv_attrs {
	private convert_driver drv;
	private crlf_action attr_action;
	private crlf_action crlf_action;
	private int ident;
	private Object working_tree_encoding;
	
	public conv_attrs(convert_driver drv, crlf_action attr_action, crlf_action crlf_action, int ident, Object working_tree_encoding) {
		setDrv(drv);
		setAttr_action(attr_action);
		setCrlf_action(crlf_action);
		setIdent(ident);
		setWorking_tree_encoding(working_tree_encoding);
	}
	public conv_attrs() {
	}
	
	public void convert_attrs(Object istate, Object path) {
		attr_check_item ccheck = ((Object)0);
		attr_check attr_check = new attr_check();
		if (!ModernizedCProgram.check) {
			ModernizedCProgram.check = attr_check.attr_check_initl("crlf", "ident", "filter", "eol", "text", "working-tree-encoding", ((Object)0));
			user_convert_tail = user_convert;
			.git_config(read_convert_config, ((Object)0));
		} 
		ModernizedCProgram.check.git_check_attr(istate, path);
		ccheck = ModernizedCProgram.check.getItems();
		this.setCrlf_action(ccheck + 4.git_path_check_crlf());
		crlf_action generatedCrlf_action = this.getCrlf_action();
		if (generatedCrlf_action == crlf_action.CRLF_UNDEFINED) {
			this.setCrlf_action(ccheck + 0.git_path_check_crlf());
		} 
		this.setIdent(ccheck + 1.git_path_check_ident());
		convert_driver convert_driver = new convert_driver();
		this.setDrv(convert_driver.git_path_check_convert(ccheck + 2));
		if (generatedCrlf_action != crlf_action.CRLF_BINARY) {
			eol eol_attr = ccheck + 3.git_path_check_eol();
			if (generatedCrlf_action == crlf_action.CRLF_AUTO && eol.eol_attr == eol.EOL_LF) {
				this.setCrlf_action(crlf_action.CRLF_AUTO_INPUT);
			}  else if (generatedCrlf_action == crlf_action.CRLF_AUTO && eol.eol_attr == eol.EOL_CRLF) {
				this.setCrlf_action(crlf_action.CRLF_AUTO_CRLF);
			}  else if (eol.eol_attr == eol.EOL_LF) {
				this.setCrlf_action(crlf_action.CRLF_TEXT_INPUT);
			}  else if (eol.eol_attr == eol.EOL_CRLF) {
				this.setCrlf_action(crlf_action.CRLF_TEXT_CRLF);
			} 
		} 
		this.setWorking_tree_encoding(ccheck + 5.git_path_check_encoding());
		this.setAttr_action(generatedCrlf_action);
		if (generatedCrlf_action == crlf_action.CRLF_TEXT) {
			this.setCrlf_action(ModernizedCProgram.text_eol_is_crlf() ? crlf_action.CRLF_TEXT_CRLF : crlf_action.CRLF_TEXT_INPUT);
		} 
		if (generatedCrlf_action == crlf_action.CRLF_UNDEFINED && auto_crlf.auto_crlf == auto_crlf.AUTO_CRLF_FALSE) {
			this.setCrlf_action(crlf_action.CRLF_BINARY);
		} 
		if (generatedCrlf_action == crlf_action.CRLF_UNDEFINED && auto_crlf.auto_crlf == auto_crlf.AUTO_CRLF_TRUE) {
			this.setCrlf_action(crlf_action.CRLF_AUTO_CRLF);
		} 
		if (generatedCrlf_action == crlf_action.CRLF_UNDEFINED && auto_crlf.auto_crlf == auto_crlf.AUTO_CRLF_INPUT) {
			this.setCrlf_action(crlf_action.CRLF_AUTO_INPUT);
		} 
	}
	public convert_driver getDrv() {
		return drv;
	}
	public void setDrv(convert_driver newDrv) {
		drv = newDrv;
	}
	public crlf_action getAttr_action() {
		return attr_action;
	}
	public void setAttr_action(crlf_action newAttr_action) {
		attr_action = newAttr_action;
	}
	public crlf_action getCrlf_action() {
		return crlf_action;
	}
	public void setCrlf_action(crlf_action newCrlf_action) {
		crlf_action = newCrlf_action;
	}
	public int getIdent() {
		return ident;
	}
	public void setIdent(int newIdent) {
		ident = newIdent;
	}
	public Object getWorking_tree_encoding() {
		return working_tree_encoding;
	}
	public void setWorking_tree_encoding(Object newWorking_tree_encoding) {
		working_tree_encoding = newWorking_tree_encoding;
	}
}
