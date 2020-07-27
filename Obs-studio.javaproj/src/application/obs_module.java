package application;

/* ------------------------------------------------------------------------- */
/* modules */
public class obs_module {
	private Byte mod_name;
	private Object file;
	private Byte bin_path;
	private Byte data_path;
	private Object module;
	private Object loaded;
	private Object load;
	private Object unload;
	private Object post_load;
	private Object set_locale;
	private Object free_locale;
	private Object ver;
	private Object set_pointer;
	private Object name;
	private Object description;
	private Object author;
	private obs_module next;
	
	public obs_module(Byte mod_name, Object file, Byte bin_path, Byte data_path, Object module, Object loaded, Object load, Object unload, Object post_load, Object set_locale, Object free_locale, Object ver, Object set_pointer, Object name, Object description, Object author, obs_module next) {
		setMod_name(mod_name);
		setFile(file);
		setBin_path(bin_path);
		setData_path(data_path);
		setModule(module);
		setLoaded(loaded);
		setLoad(load);
		setUnload(unload);
		setPost_load(post_load);
		setSet_locale(set_locale);
		setFree_locale(free_locale);
		setVer(ver);
		setSet_pointer(set_pointer);
		setName(name);
		setDescription(description);
		setAuthor(author);
		setNext(next);
	}
	public obs_module() {
	}
	
	public void obs_module_set_pointer() {
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
		ModernizedCProgram.obs_module_pointer = module;
	}
	public obs_module obs_current_module() {
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
		return ModernizedCProgram.obs_module_pointer;
	}
	public int load_module_exports(Object path) {
		Object generatedModule = this.getModule();
		this.setLoad(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_load"));
		Object generatedLoad = this.getLoad();
		if (!generatedLoad) {
			return ModernizedCProgram.req_func_not_found("obs_module_load", path);
		} 
		this.setSet_pointer(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_set_pointer"));
		Object generatedSet_pointer = this.getSet_pointer();
		if (!generatedSet_pointer) {
			return ModernizedCProgram.req_func_not_found("obs_module_set_pointer", path);
		} 
		this.setVer(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_ver"));
		Object generatedVer = this.getVer();
		if (!generatedVer) {
			return ModernizedCProgram.req_func_not_found("obs_module_ver", path);
		} 
		this.setUnload(ModernizedCProgram.os_dlsym(generatedModule, /* optional exports */"obs_module_unload"));
		this.setPost_load(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_post_load"));
		this.setSet_locale(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_set_locale"));
		this.setFree_locale(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_free_locale"));
		this.setName(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_name"));
		this.setDescription(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_description"));
		this.setAuthor(ModernizedCProgram.os_dlsym(generatedModule, "obs_module_author"));
		return 0;
	}
	public int obs_open_module(Object path, Object data_path) {
		obs_module mod = new obs_module(0);
		int errorcode;
		if (!module || !path || !ModernizedCProgram.obs) {
			return -1/* HACK: Do not load obsolete obs-browser build on macOS; the
				 * obs-browser plugin used to live in the Application Support
				 * directory. */;
		} 
		ModernizedCProgram.blog(LOG_DEBUG, "---------------------------------");
		mod.setModule(ModernizedCProgram.os_dlopen(path));
		Object generatedModule = mod.getModule();
		if (!generatedModule) {
			ModernizedCProgram.blog(LOG_WARNING, "Module '%s' not loaded", path);
			return -2;
		} 
		errorcode = mod.load_module_exports(path);
		if (errorcode != 0) {
			return errorcode;
		} 
		mod.setBin_path(ModernizedCProgram.bstrdup(path));
		Byte generatedBin_path = mod.getBin_path();
		mod.setFile(/*Error: Function owner not recognized*/strrchr(generatedBin_path, (byte)'/'));
		Object generatedFile = mod.getFile();
		mod.setFile((!generatedFile) ? generatedBin_path : (generatedFile + 1));
		mod.setMod_name(ModernizedCProgram.get_module_name(generatedFile));
		mod.setData_path(ModernizedCProgram.bstrdup(data_path));
		mod.setNext(ModernizedCProgram.obs.getFirst_module());
		if (generatedFile) {
			ModernizedCProgram.blog(LOG_DEBUG, "Loading module: %s", generatedFile);
		} 
		module = ModernizedCProgram.bmemdup(mod, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.obs.setFirst_module((module));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(module);
		Object generatedSet_locale = mod.getSet_locale();
		if (generatedSet_locale) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.obs.getLocale());
		} 
		return 0;
	}
	public Object obs_init_module() {
		if (!module || !ModernizedCProgram.obs) {
			return false;
		} 
		Object generatedLoaded = this.getLoaded();
		if (generatedLoaded) {
			return true;
		} 
		Object generatedFile = this.getFile();
		byte profile_name = ModernizedCProgram.obs_get_profiler_name_store().profile_store_name("obs_init_module(%s)", generatedFile);
		ModernizedCProgram.profile_start(profile_name);
		this.setLoaded(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME());
		if (!generatedLoaded) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to initialize module '%s'", generatedFile);
		} 
		ModernizedCProgram.profile_end(profile_name);
		return generatedLoaded;
	}
	public Object obs_get_module_file_name() {
		Object generatedFile = this.getFile();
		return module ? generatedFile : NULL;
	}
	public Object obs_get_module_name() {
		Object generatedName = this.getName();
		return (module && generatedName) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME() : NULL;
	}
	public Object obs_get_module_author() {
		Object generatedAuthor = this.getAuthor();
		return (module && generatedAuthor) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME() : NULL;
	}
	public Object obs_get_module_description() {
		Object generatedDescription = this.getDescription();
		return (module && generatedDescription) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME() : NULL;
	}
	public Object obs_get_module_binary_path() {
		Byte generatedBin_path = this.getBin_path();
		return module ? generatedBin_path : NULL;
	}
	public Object obs_get_module_data_path() {
		Byte generatedData_path = this.getData_path();
		return module ? generatedData_path : NULL;
	}
	public Byte obs_find_module_file(Object file) {
		dstr output = new dstr(0);
		if (!file) {
			file = "";
		} 
		if (!module) {
			return NULL;
		} 
		Byte generatedData_path = this.getData_path();
		output.dstr_copy(generatedData_path);
		if (!ModernizedCProgram.dstr_is_empty(output) && ModernizedCProgram.dstr_end(output) != (byte)'/' && file) {
			output.dstr_cat_ch((byte)'/');
		} 
		output.dstr_cat(file);
		Object generatedDstr = output.getDstr();
		if (!ModernizedCProgram.os_file_exists(generatedDstr)) {
			output.dstr_free();
		} 
		return generatedDstr;
	}
	public Byte obs_module_get_config_path(Object file) {
		dstr output = new dstr(0);
		output.dstr_copy(ModernizedCProgram.obs.getModule_config_path());
		if (!ModernizedCProgram.dstr_is_empty(output) && ModernizedCProgram.dstr_end(output) != (byte)'/') {
			output.dstr_cat_ch((byte)'/');
		} 
		Byte generatedMod_name = this.getMod_name();
		output.dstr_cat(generatedMod_name);
		output.dstr_cat_ch((byte)'/');
		output.dstr_cat(file);
		Object generatedDstr = output.getDstr();
		return generatedDstr;
	}
	public void free_module() {
		if (!mod) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedModule = this.getModule();
		Object generatedFree_locale = this.getFree_locale();
		Object generatedLoaded = this.getLoaded();
		Object generatedUnload = this.getUnload();
		if (generatedModule) {
			if (generatedFree_locale) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME();
			} 
			if (generatedLoaded && generatedUnload) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME();
			} 
		} 
		Byte generatedMod_name = this.getMod_name();
		ModernizedCProgram.bfree(generatedMod_name);
		Byte generatedBin_path = this.getBin_path();
		ModernizedCProgram.bfree(generatedBin_path);
		Byte generatedData_path = this.getData_path();
		ModernizedCProgram.bfree(generatedData_path);
		ModernizedCProgram.bfree(mod);
	}
	public Object obs_module_load_locale(Object default_locale, Object locale) {
		dstr str = new dstr(0);
		 lookup = NULL;
		if (!module || !default_locale || !locale) {
			ModernizedCProgram.blog(LOG_WARNING, "obs_module_load_locale: Invalid parameters");
			return NULL;
		} 
		str.dstr_copy("locale/");
		str.dstr_cat(default_locale);
		str.dstr_cat(".ini");
		Object generatedDstr = str.getDstr();
		byte file = module.obs_find_module_file(generatedDstr);
		text_lookup text_lookup = new text_lookup();
		if (file) {
			lookup = text_lookup.text_lookup_create(file);
		} 
		ModernizedCProgram.bfree(file);
		Object generatedFile = this.getFile();
		if (!lookup) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to load '%s' text for module: '%s'", default_locale, generatedFile);
			;
		} 
		if (ModernizedCProgram.astrcmpi(locale, default_locale) == 0) {
			;
		} 
		str.dstr_copy("/locale/");
		str.dstr_cat(locale);
		str.dstr_cat(".ini");
		file = module.obs_find_module_file(generatedDstr);
		if (!lookup.text_lookup_add(file)) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to load '%s' text for module: '%s'", locale, generatedFile);
		} 
		ModernizedCProgram.bfree(file);
		return lookup;
	}
	public Byte getMod_name() {
		return mod_name;
	}
	public void setMod_name(Byte newMod_name) {
		mod_name = newMod_name;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
	public Byte getBin_path() {
		return bin_path;
	}
	public void setBin_path(Byte newBin_path) {
		bin_path = newBin_path;
	}
	public Byte getData_path() {
		return data_path;
	}
	public void setData_path(Byte newData_path) {
		data_path = newData_path;
	}
	public Object getModule() {
		return module;
	}
	public void setModule(Object newModule) {
		module = newModule;
	}
	public Object getLoaded() {
		return loaded;
	}
	public void setLoaded(Object newLoaded) {
		loaded = newLoaded;
	}
	public Object getLoad() {
		return load;
	}
	public void setLoad(Object newLoad) {
		load = newLoad;
	}
	public Object getUnload() {
		return unload;
	}
	public void setUnload(Object newUnload) {
		unload = newUnload;
	}
	public Object getPost_load() {
		return post_load;
	}
	public void setPost_load(Object newPost_load) {
		post_load = newPost_load;
	}
	public Object getSet_locale() {
		return set_locale;
	}
	public void setSet_locale(Object newSet_locale) {
		set_locale = newSet_locale;
	}
	public Object getFree_locale() {
		return free_locale;
	}
	public void setFree_locale(Object newFree_locale) {
		free_locale = newFree_locale;
	}
	public Object getVer() {
		return ver;
	}
	public void setVer(Object newVer) {
		ver = newVer;
	}
	public Object getSet_pointer() {
		return set_pointer;
	}
	public void setSet_pointer(Object newSet_pointer) {
		set_pointer = newSet_pointer;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object newDescription) {
		description = newDescription;
	}
	public Object getAuthor() {
		return author;
	}
	public void setAuthor(Object newAuthor) {
		author = newAuthor;
	}
	public obs_module getNext() {
		return next;
	}
	public void setNext(obs_module newNext) {
		next = newNext;
	}
}
