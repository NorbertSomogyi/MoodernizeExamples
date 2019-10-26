package application;

public class submodule_alternate_setup {
	private Object submodule_name;
	private SUBMODULE_ALTERNATE_ERROR_MODE error_mode;
	private string_list reference;
	
	public submodule_alternate_setup(Object submodule_name, SUBMODULE_ALTERNATE_ERROR_MODE error_mode, string_list reference) {
		setSubmodule_name(submodule_name);
		setError_mode(error_mode);
		setReference(reference);
	}
	public submodule_alternate_setup() {
	}
	
	public Object getSubmodule_name() {
		return submodule_name;
	}
	public void setSubmodule_name(Object newSubmodule_name) {
		submodule_name = newSubmodule_name;
	}
	public SUBMODULE_ALTERNATE_ERROR_MODE getError_mode() {
		return error_mode;
	}
	public void setError_mode(SUBMODULE_ALTERNATE_ERROR_MODE newError_mode) {
		error_mode = newError_mode;
	}
	public string_list getReference() {
		return reference;
	}
	public void setReference(string_list newReference) {
		reference = newReference;
	}
}
