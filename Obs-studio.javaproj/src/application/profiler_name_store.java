package application;

/* Profiler name storage */
public class profiler_name_store {
	private Object mutex;
	private  names;
	
	public profiler_name_store(Object mutex,  names) {
		setMutex(mutex);
		setNames(names);
	}
	public profiler_name_store() {
	}
	
	public profiler_name_store profiler_name_store_create() {
		profiler_name_store_t store = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		Object generatedMutex = store.getMutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0))) {
			;
		} 
		return store;
		return ((Object)0);
	}
	public void profiler_name_store_free() {
		if (!store) {
			return /*Error: Unsupported expression*/;
		} 
		 generatedNames = this.getNames();
		Object generatedNum = generatedNames.getNum();
		Object generatedArray = generatedNames.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			ModernizedCProgram.bfree(generatedArray[i]);
		}
		Object generatedDa = generatedNames.getDa();
		generatedDa.darray_free();
		ModernizedCProgram.bfree(store);
	}
	public Object profile_store_name(Object format) {
		va_list args = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, format);
		dstr str = new dstr(0);
		str.dstr_vprintf(format, args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args);
		byte result = ((Object)0);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		 generatedNames = this.getNames();
		Object generatedArray = generatedNames.getArray();
		Object generatedDa = generatedNames.getDa();
		size_t idx = generatedDa.darray_push_back(/*Error: sizeof expression not supported yet*/, generatedArray);
		result = generatedArray[idx];
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return result/* ------------------------------------------------------------------------- */;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public  getNames() {
		return names;
	}
	public void setNames( newNames) {
		names = newNames;
	}
}
