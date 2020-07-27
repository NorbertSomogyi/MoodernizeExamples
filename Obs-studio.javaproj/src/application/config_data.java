package application;

public class config_data {
	private Byte file;
	private darray sections;
	private darray defaults;
	private Object mutex;
	
	public config_data(Byte file, darray sections, darray defaults, Object mutex) {
		setFile(file);
		setSections(sections);
		setDefaults(defaults);
		setMutex(mutex);
	}
	public config_data() {
	}
	
	public boolean init_mutex() {
		pthread_mutexattr_t attr = new pthread_mutexattr_t();
		if (ModernizedCProgram.pthread_mutexattr_init(attr) != 0) {
			return 0;
		} 
		if (ModernizedCProgram.pthread_mutexattr_settype(attr, 2) != 0) {
			return 0;
		} 
		Object generatedMutex = this.getMutex();
		return ModernizedCProgram.pthread_mutex_init(generatedMutex, attr) == 0;
		HANDLE handle = ModernizedCProgram.create_mutex_plus_id(name, pid);
		if (!handle) {
			ModernizedCProgram.hlog("Failed to open mutex '%s': %lu", name, /*Error: Function owner not recognized*/GetLastError());
		} 
		return handle;
	}
	public config_data config_create(Object file) {
		config_data config = new config_data();
		FILE f = new FILE();
		f = ModernizedCProgram.os_fopen(file, "wb");
		if (!f) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(f);
		config = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		if (!config.init_mutex()) {
			ModernizedCProgram.bfree(config);
			return ((Object)0);
		} 
		config.setFile(ModernizedCProgram.bstrdup(file));
		return config;
	}
	public int config_open(Object file, config_open_type open_type) {
		int errorcode;
		boolean always_open = config_open_type.open_type == config_open_type.CONFIG_OPEN_ALWAYS;
		if (!config) {
			return -2;
		} 
		config = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		if (!config) {
			return -2;
		} 
		if (!config.init_mutex()) {
			ModernizedCProgram.bfree(config);
			return -2;
		} 
		(config).setFile(ModernizedCProgram.bstrdup(file));
		darray generatedSections = (config).getSections();
		errorcode = generatedSections.config_parse_file(file, always_open);
		if (errorcode != 0) {
			config.config_close();
			config = ((Object)0);
		} 
		return errorcode;
	}
	public int config_open_string(Object str) {
		lexer lex = new lexer();
		if (!config) {
			return -2;
		} 
		config = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		if (!config) {
			return -2;
		} 
		if (!config.init_mutex()) {
			ModernizedCProgram.bfree(config);
			return -2;
		} 
		(config).setFile(((Object)0));
		lex.lexer_init();
		lex.lexer_start(str);
		darray generatedSections = (config).getSections();
		ModernizedCProgram.parse_config_data(generatedSections, lex);
		lex.lexer_free();
		return 0;
	}
	public int config_open_defaults(Object file) {
		if (!config) {
			return -2;
		} 
		darray generatedDefaults = this.getDefaults();
		return generatedDefaults.config_parse_file(file, 0);
	}
	public int config_save() {
		FILE f = new FILE();
		dstr str = new dstr();
		dstr tmp = new dstr();
		size_t i = new size_t();
		size_t j = new size_t();
		int ret = -2;
		if (!config) {
			return -2;
		} 
		Byte generatedFile = this.getFile();
		if (!generatedFile) {
			return -2;
		} 
		str.dstr_init();
		tmp.dstr_init();
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		f = ModernizedCProgram.os_fopen(generatedFile, "wb");
		if (!f) {
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
			return -1;
		} 
		darray generatedSections = this.getSections();
		Object generatedNum = generatedSections.getNum();
		Byte generatedName = section.getName();
		darray generatedItems = section.getItems();
		Byte generatedValue = item.getValue();
		byte[] generatedArray = tmp.getArray();
		for (i = 0; i < generatedNum; i++) {
			config_section section = ModernizedCProgram.darray_item(/*Error: Unsupported expression*/, generatedSections, i);
			if (i) {
				str.dstr_cat("\n");
			} 
			str.dstr_cat("[");
			str.dstr_cat(generatedName);
			str.dstr_cat("]\n");
			for (j = 0; j < generatedNum; j++) {
				config_item item = ModernizedCProgram.darray_item(/*Error: Unsupported expression*/, generatedItems, j);
				tmp.dstr_copy(generatedValue ? generatedValue : "");
				tmp.dstr_replace("\\", "\\\\");
				tmp.dstr_replace("\r", "\\r");
				tmp.dstr_replace("\n", "\\n");
				str.dstr_cat(generatedName);
				str.dstr_cat("=");
				str.dstr_cat(generatedArray);
				str.dstr_cat("\n");
			}
		}
		if (/*Error: Function owner not recognized*/fwrite("\xEF\xBB\xBF", 3, 1, f) != 1) {
			;
		} 
		Object generatedLen = str.getLen();
		if (/*Error: Function owner not recognized*/fwrite(generatedArray, generatedLen, 1, f) != 1) {
			;
		} 
		ret = 0;
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		tmp.dstr_free();
		str.dstr_free();
		return ret;
	}
	public int config_save_safe(Object temp_ext, Object backup_ext) {
		dstr temp_file = new dstr(0);
		dstr backup_file = new dstr(0);
		Byte generatedFile = this.getFile();
		byte file = generatedFile;
		int ret;
		if (!temp_ext || !temp_ext) {
			ModernizedCProgram.blog(LOG_ERROR, "config_save_safe: invalid temporary extension specified");
			return -2;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		temp_file.dstr_copy(generatedFile);
		if (temp_ext != (byte)'.') {
			temp_file.dstr_cat(".");
		} 
		temp_file.dstr_cat(temp_ext);
		byte[] generatedArray = temp_file.getArray();
		this.setFile(generatedArray);
		ret = config.config_save();
		this.setFile(file);
		if (ret != 0) {
			ModernizedCProgram.blog(LOG_ERROR, "config_save_safe: failed to write to %s", generatedArray);
			;
		} 
		if (backup_ext && backup_ext) {
			backup_file.dstr_copy(generatedFile);
			if (backup_ext != (byte)'.') {
				backup_file.dstr_cat(".");
			} 
			backup_file.dstr_cat(backup_ext);
		} 
		if (ModernizedCProgram.os_safe_replace(file, generatedArray, generatedArray) != 0) {
			ret = -2;
		} 
		temp_file.dstr_free();
		backup_file.dstr_free();
		return ret;
	}
	public void config_close() {
		config_section defaults = new config_section();
		config_section sections = new config_section();
		size_t i = new size_t();
		if (!config) {
			return /*Error: Unsupported expression*/;
		} 
		darray generatedDefaults = this.getDefaults();
		Object generatedArray = generatedDefaults.getArray();
		defaults = generatedArray;
		sections = generatedArray;
		Object generatedNum = generatedDefaults.getNum();
		for (i = 0; i < generatedNum; i++) {
			defaults + i.config_section_free();
		}
		for (i = 0; i < generatedNum; i++) {
			sections + i.config_section_free();
		}
		generatedDefaults.darray_free();
		darray generatedSections = this.getSections();
		generatedSections.darray_free();
		Byte generatedFile = this.getFile();
		ModernizedCProgram.bfree(generatedFile);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		ModernizedCProgram.bfree(config);
	}
	public Object config_num_sections() {
		darray generatedSections = this.getSections();
		Object generatedNum = generatedSections.getNum();
		return generatedNum;
	}
	public Object config_get_section(Object idx) {
		config_section section = new config_section();
		byte name = ((Object)0);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		darray generatedSections = this.getSections();
		Object generatedNum = generatedSections.getNum();
		if (idx >= generatedNum) {
			;
		} 
		section = ModernizedCProgram.darray_item(/*Error: Unsupported expression*/, generatedSections, idx);
		Byte generatedName = section.getName();
		name = generatedName;
		return name;
	}
	public void config_set_string(Object section, Object name, Object value) {
		if (!value) {
			value = "";
		} 
		darray generatedSections = this.getSections();
		ModernizedCProgram.config_set_item(config, generatedSections, section, name, ModernizedCProgram.bstrdup(value));
	}
	public void config_set_int(Object section, Object name, Object value) {
		dstr str = new dstr();
		str.dstr_init();
		str.dstr_printf("%I64d", value);
		darray generatedSections = this.getSections();
		byte[] generatedArray = str.getArray();
		ModernizedCProgram.config_set_item(config, generatedSections, section, name, generatedArray);
	}
	public void config_set_uint(Object section, Object name, Object value) {
		dstr str = new dstr();
		str.dstr_init();
		str.dstr_printf("%I64u", value);
		darray generatedSections = this.getSections();
		byte[] generatedArray = str.getArray();
		ModernizedCProgram.config_set_item(config, generatedSections, section, name, generatedArray);
	}
	public void config_set_bool(Object section, Object name, boolean value) {
		byte str = ModernizedCProgram.bstrdup(value ? "true" : "false");
		darray generatedSections = this.getSections();
		ModernizedCProgram.config_set_item(config, generatedSections, section, name, str);
	}
	public void config_set_double(Object section, Object name, double value) {
		byte str = ModernizedCProgram.bzalloc(64);
		ModernizedCProgram.os_dtostr(value, str, 64);
		darray generatedSections = this.getSections();
		ModernizedCProgram.config_set_item(config, generatedSections, section, name, str);
	}
	public void config_set_default_string(Object section, Object name, Object value) {
		if (!value) {
			value = "";
		} 
		darray generatedDefaults = this.getDefaults();
		ModernizedCProgram.config_set_item(config, generatedDefaults, section, name, ModernizedCProgram.bstrdup(value));
	}
	public void config_set_default_int(Object section, Object name, Object value) {
		dstr str = new dstr();
		str.dstr_init();
		str.dstr_printf("%I64d", value);
		darray generatedDefaults = this.getDefaults();
		byte[] generatedArray = str.getArray();
		ModernizedCProgram.config_set_item(config, generatedDefaults, section, name, generatedArray);
	}
	public void config_set_default_uint(Object section, Object name, Object value) {
		dstr str = new dstr();
		str.dstr_init();
		str.dstr_printf("%I64u", value);
		darray generatedDefaults = this.getDefaults();
		byte[] generatedArray = str.getArray();
		ModernizedCProgram.config_set_item(config, generatedDefaults, section, name, generatedArray);
	}
	public void config_set_default_bool(Object section, Object name, boolean value) {
		byte str = ModernizedCProgram.bstrdup(value ? "true" : "false");
		darray generatedDefaults = this.getDefaults();
		ModernizedCProgram.config_set_item(config, generatedDefaults, section, name, str);
	}
	public void config_set_default_double(Object section, Object name, double value) {
		dstr str = new dstr();
		str.dstr_init();
		str.dstr_printf("%g", value);
		darray generatedDefaults = this.getDefaults();
		byte[] generatedArray = str.getArray();
		ModernizedCProgram.config_set_item(config, generatedDefaults, section, name, generatedArray);
	}
	public Object config_get_string(Object section, Object name) {
		config_item item = new config_item();
		byte value = ((Object)0);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		darray generatedSections = this.getSections();
		item = ModernizedCProgram.config_find_item(generatedSections, section, name);
		darray generatedDefaults = this.getDefaults();
		if (!item) {
			item = ModernizedCProgram.config_find_item(generatedDefaults, section, name);
		} 
		if (item) {
			value = item.getValue();
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return value;
	}
	public Object config_get_int(Object section, Object name) {
		byte value = config.config_get_string(section, name);
		if (value) {
			return ModernizedCProgram.str_to_int64(value);
		} 
		return 0;
	}
	public Object config_get_uint(Object section, Object name) {
		byte value = config.config_get_string(section, name);
		if (value) {
			return ModernizedCProgram.str_to_uint64(value);
		} 
		return 0;
	}
	public boolean config_get_bool(Object section, Object name) {
		byte value = config.config_get_string(section, name);
		if (value) {
			return ModernizedCProgram.astrcmpi(value, "true") == 0 || !!ModernizedCProgram.str_to_uint64(value);
		} 
		return 0;
	}
	public double config_get_double(Object section, Object name) {
		byte value = config.config_get_string(section, name);
		if (value) {
			return ModernizedCProgram.os_strtod(value);
		} 
		return 0.0;
	}
	public boolean config_remove_value(Object section, Object name) {
		darray generatedSections = this.getSections();
		darray sections = generatedSections;
		boolean success = false;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedNum = sections.getNum();
		Byte generatedName = sec.getName();
		darray generatedItems = sec.getItems();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			config_section sec = ModernizedCProgram.darray_item(/*Error: Unsupported expression*/, sections, i);
			if (ModernizedCProgram.astrcmpi(generatedName, section) != 0) {
				continue;
			} 
			for (size_t j = 0;
			 j < generatedNum; j++) {
				config_item item = ModernizedCProgram.darray_item(/*Error: Unsupported expression*/, generatedItems, j);
				if (ModernizedCProgram.astrcmpi(generatedName, name) == 0) {
					item.config_item_free();
					generatedItems.darray_erase(/*Error: Unsupported expression*/, j);
					success = true;
					;
				} 
			}
		}
		return success;
	}
	public Object config_get_default_string(Object section, Object name) {
		config_item item = new config_item();
		byte value = ((Object)0);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		darray generatedDefaults = this.getDefaults();
		item = ModernizedCProgram.config_find_item(generatedDefaults, section, name);
		if (item) {
			value = item.getValue();
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return value;
	}
	public Object config_get_default_int(Object section, Object name) {
		byte value = config.config_get_default_string(section, name);
		if (value) {
			return ModernizedCProgram.str_to_int64(value);
		} 
		return 0;
	}
	public Object config_get_default_uint(Object section, Object name) {
		byte value = config.config_get_default_string(section, name);
		if (value) {
			return ModernizedCProgram.str_to_uint64(value);
		} 
		return 0;
	}
	public boolean config_get_default_bool(Object section, Object name) {
		byte value = config.config_get_default_string(section, name);
		if (value) {
			return ModernizedCProgram.astrcmpi(value, "true") == 0 || !!ModernizedCProgram.str_to_uint64(value);
		} 
		return 0;
	}
	public double config_get_default_double(Object section, Object name) {
		byte value = config.config_get_default_string(section, name);
		if (value) {
			return ModernizedCProgram.os_strtod(value);
		} 
		return 0.0;
	}
	public boolean config_has_user_value(Object section, Object name) {
		boolean success;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		darray generatedSections = this.getSections();
		success = ModernizedCProgram.config_find_item(generatedSections, section, name) != ((Object)0);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return success;
	}
	public boolean config_has_default_value(Object section, Object name) {
		boolean success;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		darray generatedDefaults = this.getDefaults();
		success = ModernizedCProgram.config_find_item(generatedDefaults, section, name) != ((Object)0);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return success;
	}
	public Byte getFile() {
		return file;
	}
	public void setFile(Byte newFile) {
		file = newFile;
	}
	public darray getSections() {
		return sections;
	}
	public void setSections(darray newSections) {
		sections = newSections;
	}
	public darray getDefaults() {
		return defaults;
	}
	public void setDefaults(darray newDefaults) {
		defaults = newDefaults;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
}
