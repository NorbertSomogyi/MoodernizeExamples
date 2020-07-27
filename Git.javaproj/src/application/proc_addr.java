package application;

/*
 * A pair of macros to simplify loading of DLL functions. Example:
 *
 *   DECLARE_PROC_ADDR(kernel32.dll, BOOL, CreateHardLinkW,
 *                     LPCWSTR, LPCWSTR, LPSECURITY_ATTRIBUTES);
 *
 *   if (!INIT_PROC_ADDR(CreateHardLinkW))
 *           return error("Could not find CreateHardLinkW() function";
 *
 *   if (!CreateHardLinkW(source, target, NULL))
 *           return error("could not create hardlink from %S to %S",
 *                        source, target);
 */
public class proc_addr {
	private Object dll;
	private Object function;
	private Object pfunction;
	private int initialized;
	
	public proc_addr(Object dll, Object function, Object pfunction, int initialized) {
		setDll(dll);
		setFunction(function);
		setPfunction(pfunction);
		setInitialized(initialized);
	}
	public proc_addr() {
	}
	
	public Object get_proc_addr() {
		int generatedInitialized = this.getInitialized();
		Object generatedDll = this.getDll();
		Object generatedFunction = this.getFunction();
		if (!generatedInitialized) {
			 hnd = new ();
			this.setInitialized(1);
			hnd = /*Error: Function owner not recognized*/LoadLibraryExA(generatedDll, NULL, LOAD_LIBRARY_SEARCH_SYSTEM32);
			if (hnd) {
				this.setPfunction(/*Error: Function owner not recognized*/GetProcAddress(hnd, generatedFunction));
			} 
		} 
		Object generatedPfunction = this.getPfunction();
		if (!generatedPfunction) {
			errno = ENOSYS;
		} 
		return generatedPfunction;
	}
	public Object getDll() {
		return dll;
	}
	public void setDll(Object newDll) {
		dll = newDll;
	}
	public Object getFunction() {
		return function;
	}
	public void setFunction(Object newFunction) {
		function = newFunction;
	}
	public Object getPfunction() {
		return pfunction;
	}
	public void setPfunction(Object newPfunction) {
		pfunction = newPfunction;
	}
	public int getInitialized() {
		return initialized;
	}
	public void setInitialized(int newInitialized) {
		initialized = newInitialized;
	}
}
