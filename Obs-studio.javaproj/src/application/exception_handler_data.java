package application;

public class exception_handler_data {
	private Object sym_initialize;
	private Object sym_cleanup;
	private Object sym_set_options;
	private Object sym_function_table_access64;
	private Object sym_get_module_base64;
	private Object sym_from_addr;
	private Object sym_get_module_info64;
	private Object sym_refresh_module_list;
	private Object stack_walk64;
	private Object enumerate_loaded_modules64;
	private Object minidump_write_dump;
	private Object dbghelp;
	private Object sym_info;
	private Object exception;
	private win_version_info win_version;
	private _SYSTEMTIME time_info;
	private Object process;
	private stack_trace main_trace;
	private dstr str;
	private dstr cpu_info;
	private dstr module_name;
	private dstr module_list;
	
	public exception_handler_data(Object sym_initialize, Object sym_cleanup, Object sym_set_options, Object sym_function_table_access64, Object sym_get_module_base64, Object sym_from_addr, Object sym_get_module_info64, Object sym_refresh_module_list, Object stack_walk64, Object enumerate_loaded_modules64, Object minidump_write_dump, Object dbghelp, Object sym_info, Object exception, win_version_info win_version, _SYSTEMTIME time_info, Object process, stack_trace main_trace, dstr str, dstr cpu_info, dstr module_name, dstr module_list) {
		setSym_initialize(sym_initialize);
		setSym_cleanup(sym_cleanup);
		setSym_set_options(sym_set_options);
		setSym_function_table_access64(sym_function_table_access64);
		setSym_get_module_base64(sym_get_module_base64);
		setSym_from_addr(sym_from_addr);
		setSym_get_module_info64(sym_get_module_info64);
		setSym_refresh_module_list(sym_refresh_module_list);
		setStack_walk64(stack_walk64);
		setEnumerate_loaded_modules64(enumerate_loaded_modules64);
		setMinidump_write_dump(minidump_write_dump);
		setDbghelp(dbghelp);
		setSym_info(sym_info);
		setException(exception);
		setWin_version(win_version);
		setTime_info(time_info);
		setProcess(process);
		setMain_trace(main_trace);
		setStr(str);
		setCpu_info(cpu_info);
		setModule_name(module_name);
		setModule_list(module_list);
	}
	public exception_handler_data() {
	}
	
	public void exception_handler_data_free() {
		.LocalFree(ModernizedCProgram.data.getSym_info());
		ModernizedCProgram.data.getStr().dstr_free();
		ModernizedCProgram.data.getCpu_info().dstr_free();
		ModernizedCProgram.data.getModule_name().dstr_free();
		ModernizedCProgram.data.getModule_list().dstr_free();
		.FreeLibrary(ModernizedCProgram.data.getDbghelp());
	}
	public Object get_dbghelp_imports() {
		ModernizedCProgram.data.setDbghelp(.LoadLibraryW(L"DbgHelp"));
		if (!ModernizedCProgram.data.getDbghelp()) {
			return false;
		} 
		do {
			ModernizedCProgram.data.setSym_initialize(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymInitialize"));
			if (!ModernizedCProgram.data.getSym_initialize()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setSym_cleanup(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymCleanup"));
			if (!ModernizedCProgram.data.getSym_cleanup()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setSym_set_options(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymSetOptions"));
			if (!ModernizedCProgram.data.getSym_set_options()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setSym_function_table_access64(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymFunctionTableAccess64"));
			if (!ModernizedCProgram.data.getSym_function_table_access64()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setSym_get_module_base64(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymGetModuleBase64"));
			if (!ModernizedCProgram.data.getSym_get_module_base64()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setSym_from_addr(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymFromAddrW"));
			if (!ModernizedCProgram.data.getSym_from_addr()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setSym_get_module_info64(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymGetModuleInfo64"));
			if (!ModernizedCProgram.data.getSym_get_module_info64()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setSym_refresh_module_list(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "SymRefreshModuleList"));
			if (!ModernizedCProgram.data.getSym_refresh_module_list()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setStack_walk64(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "StackWalk64"));
			if (!ModernizedCProgram.data.getStack_walk64()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setEnumerate_loaded_modules64(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "EnumerateLoadedModulesW64"));
			if (!ModernizedCProgram.data.getEnumerate_loaded_modules64()) {
				return false;
			} 
		} while (false);
		do {
			ModernizedCProgram.data.setMinidump_write_dump(ModernizedCProgram.get_proc(ModernizedCProgram.data.getDbghelp(), "MiniDumpWriteDump"));
			if (!ModernizedCProgram.data.getMinidump_write_dump()) {
				return false;
			} 
		} while (false);
		return true;
	}
	public void init_sym_info() {
		.UNRECOGNIZEDFUNCTIONNAME(SYMOPT_UNDNAME | SYMOPT_FAIL_CRITICAL_ERRORS | SYMOPT_LOAD_ANYTHING);
		if (!ModernizedCProgram.sym_initialize_called) {
			.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.data.getProcess(), ((Object)0), true);
		} else {
				.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.data.getProcess());
		} 
		ModernizedCProgram.data.setSym_info(.LocalAlloc(64,  + 256));
		ModernizedCProgram.data.getSym_info().setSizeOfStruct();
		ModernizedCProgram.data.getSym_info().setMaxNameLen(256);
	}
	public void init_version_info() {
		ModernizedCProgram.data.getWin_version().get_win_ver();
	}
	public void init_cpu_info() {
		HKEY key = new HKEY();
		 status = new ();
		status = .RegOpenKeyW(((HKEY)-1024), L"HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\0", key);
		if (status == -1024) {
			wchar_t[] str = new wchar_t();
			DWORD size = 1024;
			status = .RegQueryValueExW(key, L"ProcessorNameString", ((Object)0), ((Object)0), (LPBYTE)str, size);
			if (status == -1024) {
				ModernizedCProgram.data.getCpu_info().dstr_from_wcs(str);
			} else {
					ModernizedCProgram.data.getCpu_info().dstr_copy("<unable to query>");
			} 
		} else {
				ModernizedCProgram.data.getCpu_info().dstr_copy("<unable to query>");
		} 
	}
	public Object enum_all_modules(Object module_name, Object module_base, Object module_size) {
		byte[] name_utf8 = new byte[260];
		ModernizedCProgram.os_wcs_to_utf8(module_name, 0, name_utf8, 260);
		if (ModernizedCProgram.data.getMain_trace().getInstruction_ptr() >= module_base && ModernizedCProgram.data.getMain_trace().getInstruction_ptr() < module_base + module_size) {
			ModernizedCProgram.data.getModule_name().dstr_copy(name_utf8);
			.strlwr(ModernizedCProgram.data.getModule_name().getDstr());
		} 
		ModernizedCProgram.data.getModule_list().dstr_catf("%08I64X-%08I64X %s\r\n", module_base, module_base + module_size, name_utf8);
		return true;
	}
	public void init_module_info() {
		.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.data.getProcess(), ()enum_all_modules, ModernizedCProgram.data);
	}
	public void write_header() {
		byte[] date_time = new byte[80];
		time_t now = .time(0);
		tm ts = new tm();
		ts = .localtime(now);
		.strftime(date_time, , "%Y-%m-%d, %X", ts);
		byte obs_bitness;
		if ( == 8) {
			obs_bitness = "64";
		} else {
				obs_bitness = "32";
		} 
		ModernizedCProgram.data.getStr().dstr_catf("Unhandled exception: %x\r\nDate/Time: %s\r\nFault address: %I64X (%s)\r\nlibobs version: unknown (%s-bit)\r\nWindows version: %d.%d build %d (revision: %d; %s-bit)\r\nCPU: %s\r\n\r\n", ModernizedCProgram.data.getException().getExceptionRecord().getExceptionCode(), date_time, ModernizedCProgram.data.getMain_trace().getInstruction_ptr(), ModernizedCProgram.data.getModule_name().getDstr(), obs_bitness, ModernizedCProgram.data.getWin_version().getWin_version_info(), ModernizedCProgram.data.getWin_version().getWin_version_info(), ModernizedCProgram.data.getWin_version().getWin_version_info(), ModernizedCProgram.data.getWin_version().getWin_version_info(), ModernizedCProgram.is_64_bit_windows() ? "64" : "32", ModernizedCProgram.data.getCpu_info().getDstr());
	}
	public void write_thread_traces() {
		THREADENTRY32 entry = new THREADENTRY32(0);
		HANDLE snapshot = .CreateToolhelp32Snapshot(-1024, .GetCurrentProcessId());
		 success = new ();
		if (snapshot == (HANDLE)(true)) {
			return ;
		} 
		entry.setDwSize();
		success = !!.Thread32First(snapshot, entry);
		while (success) {
			ModernizedCProgram.write_thread_trace(ModernizedCProgram.data, entry, true);
			success = !!.Thread32Next(snapshot, entry);
		}
		success = !!.Thread32First(snapshot, entry);
		while (success) {
			ModernizedCProgram.write_thread_trace(ModernizedCProgram.data, entry, false);
			success = !!.Thread32Next(snapshot, entry);
		}
		.CloseHandle(snapshot);
	}
	public void write_module_list() {
		ModernizedCProgram.data.getStr().dstr_cat("\r\nLoaded modules:\r\n");
		ModernizedCProgram.data.getStr().dstr_cat("Base Address      Module\r\n");
		ModernizedCProgram.data.getStr().dstr_cat_dstr(ModernizedCProgram.data.getModule_list());
	}
	/* ------------------------------------------------------------------------- */
	public void handle_exception(Object exception) {
		if (!ModernizedCProgram.data.get_dbghelp_imports()) {
			return ;
		} 
		ModernizedCProgram.data.setException(exception);
		ModernizedCProgram.data.setProcess(.GetCurrentProcess());
		ModernizedCProgram.data.getMain_trace().setContext(exception.getContextRecord());
		.GetSystemTime(ModernizedCProgram.data.getTime_info());
		ModernizedCProgram.data.init_sym_info();
		ModernizedCProgram.data.init_version_info();
		ModernizedCProgram.data.init_cpu_info();
		ModernizedCProgram.data.getMain_trace().init_instruction_data();
		ModernizedCProgram.data.init_module_info();
		ModernizedCProgram.data.write_header();
		ModernizedCProgram.data.write_thread_traces();
		ModernizedCProgram.data.write_module_list();
	}
	public Object getSym_initialize() {
		return sym_initialize;
	}
	public void setSym_initialize(Object newSym_initialize) {
		sym_initialize = newSym_initialize;
	}
	public Object getSym_cleanup() {
		return sym_cleanup;
	}
	public void setSym_cleanup(Object newSym_cleanup) {
		sym_cleanup = newSym_cleanup;
	}
	public Object getSym_set_options() {
		return sym_set_options;
	}
	public void setSym_set_options(Object newSym_set_options) {
		sym_set_options = newSym_set_options;
	}
	public Object getSym_function_table_access64() {
		return sym_function_table_access64;
	}
	public void setSym_function_table_access64(Object newSym_function_table_access64) {
		sym_function_table_access64 = newSym_function_table_access64;
	}
	public Object getSym_get_module_base64() {
		return sym_get_module_base64;
	}
	public void setSym_get_module_base64(Object newSym_get_module_base64) {
		sym_get_module_base64 = newSym_get_module_base64;
	}
	public Object getSym_from_addr() {
		return sym_from_addr;
	}
	public void setSym_from_addr(Object newSym_from_addr) {
		sym_from_addr = newSym_from_addr;
	}
	public Object getSym_get_module_info64() {
		return sym_get_module_info64;
	}
	public void setSym_get_module_info64(Object newSym_get_module_info64) {
		sym_get_module_info64 = newSym_get_module_info64;
	}
	public Object getSym_refresh_module_list() {
		return sym_refresh_module_list;
	}
	public void setSym_refresh_module_list(Object newSym_refresh_module_list) {
		sym_refresh_module_list = newSym_refresh_module_list;
	}
	public Object getStack_walk64() {
		return stack_walk64;
	}
	public void setStack_walk64(Object newStack_walk64) {
		stack_walk64 = newStack_walk64;
	}
	public Object getEnumerate_loaded_modules64() {
		return enumerate_loaded_modules64;
	}
	public void setEnumerate_loaded_modules64(Object newEnumerate_loaded_modules64) {
		enumerate_loaded_modules64 = newEnumerate_loaded_modules64;
	}
	public Object getMinidump_write_dump() {
		return minidump_write_dump;
	}
	public void setMinidump_write_dump(Object newMinidump_write_dump) {
		minidump_write_dump = newMinidump_write_dump;
	}
	public Object getDbghelp() {
		return dbghelp;
	}
	public void setDbghelp(Object newDbghelp) {
		dbghelp = newDbghelp;
	}
	public Object getSym_info() {
		return sym_info;
	}
	public void setSym_info(Object newSym_info) {
		sym_info = newSym_info;
	}
	public Object getException() {
		return exception;
	}
	public void setException(Object newException) {
		exception = newException;
	}
	public win_version_info getWin_version() {
		return win_version;
	}
	public void setWin_version(win_version_info newWin_version) {
		win_version = newWin_version;
	}
	public _SYSTEMTIME getTime_info() {
		return time_info;
	}
	public void setTime_info(_SYSTEMTIME newTime_info) {
		time_info = newTime_info;
	}
	public Object getProcess() {
		return process;
	}
	public void setProcess(Object newProcess) {
		process = newProcess;
	}
	public stack_trace getMain_trace() {
		return main_trace;
	}
	public void setMain_trace(stack_trace newMain_trace) {
		main_trace = newMain_trace;
	}
	public dstr getStr() {
		return str;
	}
	public void setStr(dstr newStr) {
		str = newStr;
	}
	public dstr getCpu_info() {
		return cpu_info;
	}
	public void setCpu_info(dstr newCpu_info) {
		cpu_info = newCpu_info;
	}
	public dstr getModule_name() {
		return module_name;
	}
	public void setModule_name(dstr newModule_name) {
		module_name = newModule_name;
	}
	public dstr getModule_list() {
		return module_list;
	}
	public void setModule_list(dstr newModule_list) {
		module_list = newModule_list;
	}
}
