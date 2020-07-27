package application;

public class obs_python_script {
	private obs_script base;
	private dstr dir;
	private dstr name;
	private Object module;
	private Object save;
	private Object update;
	private Object get_properties;
	private script_callback first_callback;
	private Object tick;
	private obs_python_script next_tick;
	private obs_python_script p_prev_next_tick;
	
	public obs_python_script(obs_script base, dstr dir, dstr name, Object module, Object save, Object update, Object get_properties, script_callback first_callback, Object tick, obs_python_script next_tick, obs_python_script p_prev_next_tick) {
		setBase(base);
		setDir(dir);
		setName(name);
		setModule(module);
		setSave(save);
		setUpdate(update);
		setGet_properties(get_properties);
		setFirst_callback(first_callback);
		setTick(tick);
		setNext_tick(next_tick);
		setP_prev_next_tick(p_prev_next_tick);
	}
	public obs_python_script() {
	}
	
	public void get_defaults(Object get_defs) {
		ModernizedCProgram.PyObject * py_settings;
		if (!ModernizedCProgram.libobs_to_py_("obs_data_t *", ModernizedCProgram.data.getBase().getSettings(), false, py_settings, NULL, __FUNCTION__, 157)) {
			return /*Error: Unsupported expression*/;
		} 
		 args = /*Error: Function owner not recognized*/Import_Py_BuildValue("(O)", py_settings);
		 py_ret = /*Error: Function owner not recognized*/Import_PyObject_CallObject(get_defs, args);
		ModernizedCProgram.py_error_(__FUNCTION__, 162);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_ret);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_settings);
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_data_create();
		if (info.getGet_defaults2()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(info.getType_data(), settings);
		}  else if (info.getGet_defaults()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(settings);
		} 
		return settings;
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_data_create();
		if (info.getGet_defaults()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(settings);
		} 
		return settings;
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_data_create();
		if (info.getGet_defaults()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(settings);
		} 
		if (info.getGet_defaults2()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(settings, info.getType_data());
		} 
		return settings;
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_data_create();
		if (info.getGet_defaults()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(settings);
		} 
		return settings;
	}
	public Object load_python_script() {
		 py_file = NULL;
		 py_module = NULL;
		 py_success = NULL;
		 py_tick = NULL;
		 py_load = NULL;
		 py_defaults = NULL;
		 success = false;
		int ret;
		ModernizedCProgram.cur_python_script = ModernizedCProgram.data;
		if (!ModernizedCProgram.data.getModule()) {
			py_file = /*Error: Function owner not recognized*/Import_PyUnicode_FromString(ModernizedCProgram.data.getName().getDstr());
			py_module = /*Error: Function owner not recognized*/Import_PyImport_Import(py_file);
		} else {
				py_module = /*Error: Function owner not recognized*/Import_PyImport_ReloadModule(ModernizedCProgram.data.getModule());
		} 
		if (!py_module) {
			ModernizedCProgram.py_error_(__FUNCTION__, 189);
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XINCREF(ModernizedCProgram.py_obspython);
		ret = /*Error: Function owner not recognized*/Import_PyModule_AddObject(py_module, "obspython", ModernizedCProgram.py_obspython);
		if (ModernizedCProgram.py_error_(__FUNCTION__, 195) || ret != 0) {
			;
		} 
		ret = /*Error: Function owner not recognized*/Import_PyModule_AddStringConstant(py_module, "__script_dir__", ModernizedCProgram.data.getDir().getDstr());
		if (ModernizedCProgram.py_error_(__FUNCTION__, 200) || ret != 0) {
			;
		} 
		 py_data = /*Error: Function owner not recognized*/Import_PyCapsule_New(ModernizedCProgram.data, NULL, NULL);
		ret = /*Error: Function owner not recognized*/Import_PyModule_AddObject(py_module, "__script_data__", py_data);
		if (ModernizedCProgram.py_error_(__FUNCTION__, 205) || ret != 0) {
			;
		} 
		[] global_funcs = new []{new ("script_path", py_get_current_script_path, METH_NOARGS, "Gets the script path"), new (0)};
		ModernizedCProgram.add_functions_to_py_module(py_module, global_funcs);
		ModernizedCProgram.data.setUpdate(/*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_update"));
		if (!ModernizedCProgram.data.getUpdate()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
		} 
		ModernizedCProgram.data.setSave(/*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_save"));
		if (!ModernizedCProgram.data.getSave()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
		} 
		ModernizedCProgram.data.setGet_properties(/*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_properties"));
		if (!ModernizedCProgram.data.getGet_properties()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
		} 
		 func = /*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_defaults");
		if (func) {
			ModernizedCProgram.data.get_defaults(func);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_DECREF(func);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
		} 
		func = /*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_description");
		if (func) {
			 py_ret = /*Error: Function owner not recognized*/Import_PyObject_CallObject(func, NULL);
			ModernizedCProgram.py_error_(__FUNCTION__, 239);
			 py_desc = /*Error: Function owner not recognized*/Import_PyUnicode_AsUTF8String(py_ret);
			if (py_desc) {
				byte desc = /*Error: Function owner not recognized*/PyBytes_AS_STRING(py_desc);
				if (desc) {
					ModernizedCProgram.data.getBase().getDesc().dstr_copy(desc);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_DECREF(py_desc);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_ret);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_DECREF(func);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
		} 
		py_tick = /*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_tick");
		if (py_tick) {
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.tick_mutex);
			obs_python_script next = ModernizedCProgram.first_tick_script;
			ModernizedCProgram.data.setNext_tick(next);
			ModernizedCProgram.data.setP_prev_next_tick(ModernizedCProgram.first_tick_script);
			if (next) {
				next.setP_prev_next_tick(ModernizedCProgram.data.getNext_tick());
			} 
			ModernizedCProgram.first_tick_script = ModernizedCProgram.data;
			ModernizedCProgram.data.setTick(py_tick);
			py_tick = NULL;
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.tick_mutex);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
		} 
		py_load = /*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_load");
		if (py_load) {
			ModernizedCProgram.PyObject * py_s;
			ModernizedCProgram.libobs_to_py_("obs_data_t *", ModernizedCProgram.data.getBase().getSettings(), false, py_s, NULL, __FUNCTION__, 275);
			 args = /*Error: Function owner not recognized*/Import_Py_BuildValue("(O)", py_s);
			 py_ret = /*Error: Function owner not recognized*/Import_PyObject_CallObject(py_load, args);
			ModernizedCProgram.py_error_(__FUNCTION__, 278);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_ret);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(args);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_s);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
		} 
		if (ModernizedCProgram.data.getModule()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(ModernizedCProgram.data.getModule());
		} 
		ModernizedCProgram.data.setModule(py_module);
		py_module = NULL;
		success = true;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_tick);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_defaults);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_success);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_file);
		if (!success) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_module);
		} 
		ModernizedCProgram.cur_python_script = NULL;
		return success;
	}
	public void unload_python_script() {
		 py_module = ModernizedCProgram.data.getModule();
		 py_func = NULL;
		 py_ret = NULL;
		ModernizedCProgram.cur_python_script = ModernizedCProgram.data;
		py_func = /*Error: Function owner not recognized*/Import_PyObject_GetAttrString(py_module, "script_unload");
		if (/*Error: Function owner not recognized*/Import_PyErr_Occurred() || !py_func) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyErr_Clear();
			;
		} 
		py_ret = /*Error: Function owner not recognized*/Import_PyObject_CallObject(py_func, NULL);
		if (ModernizedCProgram.py_error_(__FUNCTION__, 320)) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_func);
		ModernizedCProgram.cur_python_script = NULL;
	}
	public obs_python_script python_obs_callback_script(python_obs_callback cb) {
		script_callback generatedBase = cb.getBase();
		obs_script generatedScript = generatedBase.getScript();
		return (obs_python_script)generatedScript;
	}
	public obs_script getBase() {
		return base;
	}
	public void setBase(obs_script newBase) {
		base = newBase;
	}
	public dstr getDir() {
		return dir;
	}
	public void setDir(dstr newDir) {
		dir = newDir;
	}
	public dstr getName() {
		return name;
	}
	public void setName(dstr newName) {
		name = newName;
	}
	public Object getModule() {
		return module;
	}
	public void setModule(Object newModule) {
		module = newModule;
	}
	public Object getSave() {
		return save;
	}
	public void setSave(Object newSave) {
		save = newSave;
	}
	public Object getUpdate() {
		return update;
	}
	public void setUpdate(Object newUpdate) {
		update = newUpdate;
	}
	public Object getGet_properties() {
		return get_properties;
	}
	public void setGet_properties(Object newGet_properties) {
		get_properties = newGet_properties;
	}
	public script_callback getFirst_callback() {
		return first_callback;
	}
	public void setFirst_callback(script_callback newFirst_callback) {
		first_callback = newFirst_callback;
	}
	public Object getTick() {
		return tick;
	}
	public void setTick(Object newTick) {
		tick = newTick;
	}
	public obs_python_script getNext_tick() {
		return next_tick;
	}
	public void setNext_tick(obs_python_script newNext_tick) {
		next_tick = newNext_tick;
	}
	public obs_python_script getP_prev_next_tick() {
		return p_prev_next_tick;
	}
	public void setP_prev_next_tick(obs_python_script newP_prev_next_tick) {
		p_prev_next_tick = newP_prev_next_tick;
	}
}
