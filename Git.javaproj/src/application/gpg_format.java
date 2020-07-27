package application;

public class gpg_format {
	private Object name;
	private Object program;
	private Object verify_args;
	private Object sigs;
	
	public gpg_format(Object name, Object program, Object verify_args, Object sigs) {
		setName(name);
		setProgram(program);
		setVerify_args(verify_args);
		setSigs(sigs);
	}
	public gpg_format() {
	}
	
	public gpg_format get_format_by_name(Object str) {
		int i;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.gpg_format[i].getName(), str)) {
				return ModernizedCProgram.gpg_format + i;
			} 
		}
		return ((Object)0);
	}
	public gpg_format get_format_by_sig(Object sig) {
		int i;
		int j;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			for (j = 0; ModernizedCProgram.gpg_format[i].getSigs()[j]; j++) {
				if (ModernizedCProgram.starts_with(sig, ModernizedCProgram.gpg_format[i].getSigs()[j])) {
					return ModernizedCProgram.gpg_format + i;
				} 
			}
		}
		return ((Object)0);
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getProgram() {
		return program;
	}
	public void setProgram(Object newProgram) {
		program = newProgram;
	}
	public Object getVerify_args() {
		return verify_args;
	}
	public void setVerify_args(Object newVerify_args) {
		verify_args = newVerify_args;
	}
	public Object getSigs() {
		return sigs;
	}
	public void setSigs(Object newSigs) {
		sigs = newSigs;
	}
}
