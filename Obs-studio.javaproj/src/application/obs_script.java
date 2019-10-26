package application;

/******************************************************************************
    Copyright (C) 2017 by Hugh Bailey <jim@obsproject.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
public class obs_script {
	private obs_script_lang type;
	private Object loaded;
	private obs_data settings;
	private dstr path;
	private dstr file;
	private dstr desc;
	
	public obs_script(obs_script_lang type, Object loaded, obs_data settings, dstr path, dstr file, dstr desc) {
		setType(type);
		setLoaded(loaded);
		setSettings(settings);
		setPath(path);
		setFile(file);
		setDesc(desc);
	}
	public obs_script() {
	}
	
	public Object obs_python_script_load() {
		obs_python_script data = (obs_python_script)ModernizedCProgram.s;
		obs_script generatedBase = data.getBase();
		Object generatedLoaded = generatedBase.getLoaded();
		Object generatedModule = data.getModule();
		dstr generatedDir = data.getDir();
		Object generatedDstr = generatedDir.getDstr();
		if (ModernizedCProgram.python_loaded && !generatedLoaded) {
			 gstate = .Import_PyGILState_Ensure();
			if (!generatedModule) {
				ModernizedCProgram.add_to_python_path(generatedDstr);
			} 
			generatedBase.setLoaded(data.load_python_script());
			.Import_PyGILState_Release(gstate);
			if (generatedLoaded) {
				ModernizedCProgram.obs_python_script_update(ModernizedCProgram.s, NULL);
			} 
		} 
		return generatedLoaded;
	}
	public obs_script obs_python_script_create(Object path, obs_data settings) {
		obs_python_script data = ModernizedCProgram.bzalloc();
		obs_script generatedBase = data.getBase();
		generatedBase.setType(obs_script_lang.OBS_SCRIPT_LANG_PYTHON);
		dstr generatedPath = generatedBase.getPath();
		generatedPath.dstr_copy(path);
		generatedPath.dstr_replace("\\", "/");
		Object generatedDstr = generatedPath.getDstr();
		path = generatedDstr;
		byte slash = path && path ? .strrchr(path, (byte)'/') : NULL;
		dstr generatedFile = generatedBase.getFile();
		dstr generatedDir = data.getDir();
		if (slash) {
			slash++;
			generatedFile.dstr_copy(slash);
			generatedDir.dstr_left(generatedPath, slash - path);
		} else {
				generatedFile.dstr_copy(path);
		} 
		path = generatedDstr;
		dstr generatedName = data.getName();
		generatedName.dstr_copy_dstr(generatedFile);
		byte ext = .strstr(path, ".py");
		if (ext) {
			generatedName.dstr_resize(ext - path);
		} 
		obs_data obs_data = new obs_data();
		generatedBase.setSettings(obs_data.obs_data_create());
		obs_data generatedSettings = generatedBase.getSettings();
		if (settings) {
			generatedSettings.obs_data_apply(settings);
		} 
		if (!ModernizedCProgram.python_loaded) {
			return (obs_script_t)data;
		} 
		 gstate = .Import_PyGILState_Ensure();
		ModernizedCProgram.add_to_python_path(generatedDstr);
		generatedBase.setLoaded(data.load_python_script());
		Object generatedLoaded = generatedBase.getLoaded();
		if (generatedLoaded) {
			ModernizedCProgram.cur_python_script = data;
			ModernizedCProgram.obs_python_script_update(generatedBase, NULL);
			ModernizedCProgram.cur_python_script = NULL;
		} 
		.Import_PyGILState_Release(gstate);
		return (obs_script_t)data;
	}
	public void obs_python_script_unload() {
		obs_python_script data = (obs_python_script)ModernizedCProgram.s;
		if (!ModernizedCProgram.s.getLoaded() || !ModernizedCProgram.python_loaded) {
			return ;
		} 
		obs_python_script generatedP_prev_next_tick = data.getP_prev_next_tick();
		obs_python_script generatedNext_tick = data.getNext_tick();
		if (generatedP_prev_next_tick) {
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.tick_mutex);
			obs_python_script next = generatedNext_tick;
			if (next) {
				next.setP_prev_next_tick(generatedP_prev_next_tick);
			} 
			generatedP_prev_next_tick = next;
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.tick_mutex);
			data.setP_prev_next_tick(NULL);
			data.setNext_tick(NULL);
		} 
		 gstate = .Import_PyGILState_Ensure();
		Object generatedTick = data.getTick();
		.Py_XDECREF(generatedTick);
		Object generatedSave = data.getSave();
		.Py_XDECREF(generatedSave);
		Object generatedUpdate = data.getUpdate();
		.Py_XDECREF(generatedUpdate);
		Object generatedGet_properties = data.getGet_properties();
		.Py_XDECREF(generatedGet_properties);
		data.setTick(NULL);
		data.setSave(NULL);
		data.setUpdate(NULL);
		data.setGet_properties(NULL/* ---------------------------- */);
		script_callback generatedFirst_callback = data.getFirst_callback();
		script_callback cb = generatedFirst_callback;
		script_callback generatedNext = cb.getNext();
		while (cb) {
			script_callback next = generatedNext;
			cb.remove_script_callback();
			cb = next;
		}
		/* ---------------------------- *//* unload                       */data.unload_python_script();
		.Import_PyGILState_Release(gstate);
		ModernizedCProgram.s.setLoaded(false);
	}
	public void obs_python_script_destroy() {
		obs_python_script data = (obs_python_script)ModernizedCProgram.s;
		Object generatedModule = data.getModule();
		obs_script generatedBase = data.getBase();
		dstr generatedPath = generatedBase.getPath();
		dstr generatedFile = generatedBase.getFile();
		dstr generatedDesc = generatedBase.getDesc();
		obs_data generatedSettings = generatedBase.getSettings();
		dstr generatedDir = data.getDir();
		dstr generatedName = data.getName();
		if (data) {
			if (ModernizedCProgram.python_loaded) {
				 gstate = .Import_PyGILState_Ensure();
				.Py_XDECREF(generatedModule);
				.Import_PyGILState_Release(gstate);
			} 
			generatedPath.dstr_free();
			generatedFile.dstr_free();
			generatedDesc.dstr_free();
			generatedSettings.obs_data_release();
			generatedDir.dstr_free();
			generatedName.dstr_free();
			ModernizedCProgram.bfree(data);
		} 
	}
	public void obs_python_script_save() {
		obs_python_script data = (obs_python_script)ModernizedCProgram.s;
		if (!ModernizedCProgram.s.getLoaded() || !ModernizedCProgram.python_loaded) {
			return ;
		} 
		Object generatedSave = data.getSave();
		if (!generatedSave) {
			return ;
		} 
		 gstate = .Import_PyGILState_Ensure();
		ModernizedCProgram.cur_python_script = data;
		ModernizedCProgram.PyObject * py_settings;
		if (ModernizedCProgram.libobs_to_py_("obs_data_t *", ModernizedCProgram.s.getSettings(), false, py_settings, NULL, __FUNCTION__, 1465)) {
			 args = .Import_Py_BuildValue("(O)", py_settings);
			 ret = .Import_PyObject_CallObject(generatedSave, args);
			ModernizedCProgram.py_error_(__FUNCTION__, 1468);
			.Py_XDECREF(ret);
			.Py_XDECREF(args);
			.Py_XDECREF(py_settings);
		} 
		ModernizedCProgram.cur_python_script = NULL;
		.Import_PyGILState_Release(gstate);
	}
	public obs_script obs_script_create(Object path, obs_data settings) {
		obs_script_t script = NULL;
		byte ext;
		if (!ModernizedCProgram.scripting_loaded) {
			return NULL;
		} 
		if (!ModernizedCProgram.pointer_valid(path, "path", __FUNCTION__)) {
			return NULL;
		} 
		ext = .strrchr(path, (byte)'.');
		if (!ext) {
			return NULL;
		} 
		{ 
			ModernizedCProgram.blog(LOG_WARNING, "Unsupported/unknown script type: %s", path);
		}
		return script;
	}
	public Object obs_script_reload() {
		if (!ModernizedCProgram.scripting_loaded) {
			return false;
		} 
		if (!ModernizedCProgram.pointer_valid(script, "script", __FUNCTION__)) {
			return false;
		} 
	}
	public void obs_script_destroy() {
		if (!script) {
			return ;
		} 
	}
	public Object obs_lua_script_load() {
		obs_lua_script data = (obs_lua_script)ModernizedCProgram.s;
		obs_script generatedBase = data.getBase();
		Object generatedLoaded = generatedBase.getLoaded();
		if (!generatedLoaded) {
			generatedBase.setLoaded(data.load_lua_script());
			if (generatedLoaded) {
				ModernizedCProgram.obs_lua_script_update(ModernizedCProgram.s, NULL);
			} 
		} 
		return generatedLoaded;
	}
	public obs_script obs_lua_script_create(Object path, obs_data settings) {
		obs_lua_script data = ModernizedCProgram.bzalloc();
		obs_script generatedBase = data.getBase();
		generatedBase.setType(obs_script_lang.OBS_SCRIPT_LANG_LUA);
		data.setTick(LUA_REFNIL);
		 attr = new ();
		ModernizedCProgram.pthread_mutexattr_init(attr);
		Object generatedMutex = data.getMutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedMutex);
		ModernizedCProgram.pthread_mutexattr_settype(attr, PTHREAD_MUTEX_RECURSIVE);
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, attr) != 0) {
			ModernizedCProgram.bfree(data);
			return NULL;
		} 
		dstr generatedPath = generatedBase.getPath();
		generatedPath.dstr_copy(path);
		byte slash = path && path ? .strrchr(path, (byte)'/') : NULL;
		dstr generatedFile = generatedBase.getFile();
		dstr generatedDir = data.getDir();
		if (slash) {
			slash++;
			generatedFile.dstr_copy(slash);
			generatedDir.dstr_left(generatedPath, slash - path);
		} else {
				generatedFile.dstr_copy(path);
		} 
		obs_data obs_data = new obs_data();
		generatedBase.setSettings(obs_data.obs_data_create());
		obs_data generatedSettings = generatedBase.getSettings();
		if (settings) {
			generatedSettings.obs_data_apply(settings);
		} 
		(obs_script_t)data.obs_lua_script_load();
		return (obs_script_t)data;
	}
	public void obs_lua_script_unload() {
		obs_lua_script data = (obs_lua_script)ModernizedCProgram.s;
		if (!ModernizedCProgram.s.getLoaded()) {
			return ;
		} 
		Object generatedScript = data.getScript();
		 script = generatedScript;
		/* undefine source types        */data/* ---------------------------- */.undef_lua_script_sources();
		obs_lua_script generatedP_prev_next_tick = data.getP_prev_next_tick();
		obs_lua_script generatedNext_tick = data.getNext_tick();
		if (generatedP_prev_next_tick) {
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.tick_mutex);
			obs_lua_script next = generatedNext_tick;
			if (next) {
				next.setP_prev_next_tick(generatedP_prev_next_tick);
			} 
			generatedP_prev_next_tick = next;
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.tick_mutex);
			data.setP_prev_next_tick(NULL);
			data.setNext_tick(NULL);
		} 
		Object generatedMutex = data.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		.lua_getglobal(script, "script_unload");
		.lua_pcall(script, 0, 0, 0/* ---------------------------- */);
		script_callback generatedFirst_callback = data.getFirst_callback();
		/* remove all callbacks         */lua_obs_callback cb = (lua_obs_callback)generatedFirst_callback;
		script_callback generatedBase = cb.getBase();
		script_callback generatedNext = generatedBase.getNext();
		while (cb) {
			lua_obs_callback next = (lua_obs_callback)generatedNext;
			cb.remove_lua_obs_callback();
			cb = next;
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		.lua_close(/* close script                 */script);
		ModernizedCProgram.s.setLoaded(false);
	}
	public void obs_lua_script_destroy() {
		obs_lua_script data = (obs_lua_script)ModernizedCProgram.s;
		Object generatedMutex = data.getMutex();
		obs_script generatedBase = data.getBase();
		dstr generatedPath = generatedBase.getPath();
		dstr generatedFile = generatedBase.getFile();
		dstr generatedDesc = generatedBase.getDesc();
		obs_data generatedSettings = generatedBase.getSettings();
		dstr generatedLog_chunk = data.getLog_chunk();
		dstr generatedDir = data.getDir();
		if (data) {
			ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
			generatedPath.dstr_free();
			generatedFile.dstr_free();
			generatedDesc.dstr_free();
			generatedSettings.obs_data_release();
			generatedLog_chunk.dstr_free();
			generatedDir.dstr_free();
			ModernizedCProgram.bfree(data);
		} 
	}
	public void obs_lua_script_save() {
		obs_lua_script data = (obs_lua_script)ModernizedCProgram.s;
		Object generatedScript = data.getScript();
		 script = generatedScript;
		if (!ModernizedCProgram.s.getLoaded()) {
			return ;
		} 
		int generatedSave = data.getSave();
		if (generatedSave == LUA_REFNIL) {
			return ;
		} 
		ModernizedCProgram.current_lua_script = data;
		Object generatedMutex = data.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		ModernizedCProgram.ls_push_libobs_obj_(script, "obs_data_t *", ModernizedCProgram.s.getSettings(), false, NULL, __FUNCTION__, 1288);
		ModernizedCProgram.call_func_(script, generatedSave, 1, 0, "script_save", __FUNCTION__);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		ModernizedCProgram.current_lua_script = NULL;
	}
	public void script_log_va(int level, Object format, Object args) {
		byte[] msg = new byte[2048];
		byte lang = "(Unknown)";
		 start_len = new ();
		obs_script_lang generatedType = this.getType();
		dstr generatedFile = this.getFile();
		Object generatedDstr = generatedFile.getDstr();
		if (script) {
			switch (generatedType) {
			case obs_script_lang.OBS_SCRIPT_LANG_UNKNOWN:
					lang = "(Unknown language)";
					break;
			case obs_script_lang.OBS_SCRIPT_LANG_LUA:
					lang = "Lua";
					break;
			case obs_script_lang.OBS_SCRIPT_LANG_PYTHON:
					lang = "Python";
					break;
			}
			start_len = .snprintf(msg, , "[%s: %s] ", lang, generatedDstr);
		} else {
				start_len = .snprintf(msg, , "[Unknown Script] ");
		} 
		.vsnprintf(msg + start_len,  - start_len, format, args);
		if (ModernizedCProgram.callback) {
			.callback(ModernizedCProgram.param, script, level, msg + start_len);
		} 
		ModernizedCProgram.blog(level, "%s", msg);
	}
	public void script_log(int level, Object format) {
		va_list args = new va_list();
		.__builtin_va_start(args, format);
		script.script_log_va(level, format, args);
		.__builtin_va_end(args);
	}
	public obs_script_lang getType() {
		return type;
	}
	public void setType(obs_script_lang newType) {
		type = newType;
	}
	public Object getLoaded() {
		return loaded;
	}
	public void setLoaded(Object newLoaded) {
		loaded = newLoaded;
	}
	public obs_data getSettings() {
		return settings;
	}
	public void setSettings(obs_data newSettings) {
		settings = newSettings;
	}
	public dstr getPath() {
		return path;
	}
	public void setPath(dstr newPath) {
		path = newPath;
	}
	public dstr getFile() {
		return file;
	}
	public void setFile(dstr newFile) {
		file = newFile;
	}
	public dstr getDesc() {
		return desc;
	}
	public void setDesc(dstr newDesc) {
		desc = newDesc;
	}
}
