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
/* ---------------------------- */
/* ---------------------------- */
/* ------------------------------------------------------------ */
public class obs_lua_script {
	private obs_script base;
	private dstr dir;
	private dstr log_chunk;
	private Object mutex;
	private Object script;
	private script_callback first_callback;
	private int update;
	private int get_properties;
	private int save;
	private int tick;
	private obs_lua_script next_tick;
	private obs_lua_script p_prev_next_tick;
	private Object defined_sources;
	
	public obs_lua_script(obs_script base, dstr dir, dstr log_chunk, Object mutex, Object script, script_callback first_callback, int update, int get_properties, int save, int tick, obs_lua_script next_tick, obs_lua_script p_prev_next_tick, Object defined_sources) {
		setBase(base);
		setDir(dir);
		setLog_chunk(log_chunk);
		setMutex(mutex);
		setScript(script);
		setFirst_callback(first_callback);
		setUpdate(update);
		setGet_properties(get_properties);
		setSave(save);
		setTick(tick);
		setNext_tick(next_tick);
		setP_prev_next_tick(p_prev_next_tick);
		setDefined_sources(defined_sources);
	}
	public obs_lua_script() {
	}
	
	public void undef_lua_script_sources() {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.lua_source_def_mutex);
		obs_lua_source def = ModernizedCProgram.first_source_def;
		Object generatedScript = def.getScript();
		obs_lua_source generatedNext = def.getNext();
		while (def) {
			if (generatedScript == generatedScript) {
				ModernizedCProgram.undef_source_type(ModernizedCProgram.data, def);
			} 
			def = generatedNext;
		}
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.lua_source_def_mutex);
	}
	public obs_lua_script lua_obs_callback_script(lua_obs_callback cb) {
		script_callback generatedBase = cb.getBase();
		obs_script generatedScript = generatedBase.getScript();
		return (obs_lua_script)generatedScript;
	}
	public Object load_lua_script() {
		dstr str = new dstr(0);
		 success = false;
		int ret;
		 script = .luaL_newstate();
		if (!script) {
			ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Failed to create new lua state");
			;
		} 
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.data.getMutex());
		.luaL_openlibs(script);
		.luaopen_ffi(script);
		if (.luaL_dostring(script, ModernizedCProgram.startup_script) != 0) {
			ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Error executing startup script 1: %s", .lua_tostring(script, -1));
			;
		} 
		str.dstr_printf(ModernizedCProgram.get_script_path_func, ModernizedCProgram.data.getDir().getDstr());
		Object generatedDstr = str.getDstr();
		ret = .luaL_dostring(script, generatedDstr);
		str.dstr_free();
		if (ret != 0) {
			ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Error executing startup script 2: %s", .lua_tostring(script, -1));
			;
		} 
		ModernizedCProgram.current_lua_script = ModernizedCProgram.data;
		ModernizedCProgram.add_lua_source_functions(script);
		ModernizedCProgram.add_hook_functions(script);
		if (.luaL_loadfile(script, generatedDstr) != 0) {
			ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Error loading file: %s", .lua_tostring(script, -1));
			;
		} 
		if (.lua_pcall(script, 0, LUA_MULTRET, 0) != 0) {
			ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Error running file: %s", .lua_tostring(script, -1));
			;
		} 
		ret = .lua_gettop(script);
		if (ret == 1 && .lua_isboolean(script, -1)) {
			 success = .lua_toboolean(script, -1);
			if (!success) {
				;
			} 
		} 
		.lua_getglobal(script, "script_tick");
		if (.lua_isfunction(script, -1)) {
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.tick_mutex);
			obs_lua_script next = ModernizedCProgram.first_tick_script;
			ModernizedCProgram.data.setNext_tick(next);
			ModernizedCProgram.data.setP_prev_next_tick(ModernizedCProgram.first_tick_script);
			if (next) {
				next.setP_prev_next_tick(ModernizedCProgram.data.getNext_tick());
			} 
			ModernizedCProgram.first_tick_script = ModernizedCProgram.data;
			ModernizedCProgram.data.setTick(.luaL_ref(script, LUA_REGISTRYINDEX));
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.tick_mutex);
		} 
		.lua_getglobal(script, "script_properties");
		if (.lua_isfunction(script, -1)) {
			ModernizedCProgram.data.setGet_properties(.luaL_ref(script, LUA_REGISTRYINDEX));
		} else {
				ModernizedCProgram.data.setGet_properties(LUA_REFNIL);
		} 
		.lua_getglobal(script, "script_update");
		if (.lua_isfunction(script, -1)) {
			ModernizedCProgram.data.setUpdate(.luaL_ref(script, LUA_REGISTRYINDEX));
		} else {
				ModernizedCProgram.data.setUpdate(LUA_REFNIL);
		} 
		.lua_getglobal(script, "script_save");
		if (.lua_isfunction(script, -1)) {
			ModernizedCProgram.data.setSave(.luaL_ref(script, LUA_REGISTRYINDEX));
		} else {
				ModernizedCProgram.data.setSave(LUA_REFNIL);
		} 
		.lua_getglobal(script, "script_defaults");
		if (.lua_isfunction(script, -1)) {
			ModernizedCProgram.ls_push_libobs_obj_(script, "obs_data_t *", ModernizedCProgram.data.getBase().getSettings(), false, NULL, __FUNCTION__, 179);
			if (.lua_pcall(script, 1, 0, 0) != 0) {
				ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Error calling script_defaults: %s", .lua_tostring(script, -1));
			} 
		} 
		.lua_getglobal(script, "script_description");
		if (.lua_isfunction(script, -1)) {
			if (.lua_pcall(script, 0, 1, 0) != 0) {
				ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Error calling script_defaults: %s", .lua_tostring(script, -1));
			} else {
					byte desc = .lua_tostring(script, -1);
					ModernizedCProgram.data.getBase().getDesc().dstr_copy(desc);
			} 
		} 
		.lua_getglobal(script, "script_load");
		if (.lua_isfunction(script, -1)) {
			ModernizedCProgram.ls_push_libobs_obj_(script, "obs_data_t *", ModernizedCProgram.data.getBase().getSettings(), false, NULL, __FUNCTION__, 203);
			if (.lua_pcall(script, 1, 0, 0) != 0) {
				ModernizedCProgram.data.getBase().script_log(LOG_WARNING, "Error calling script_load: %s", .lua_tostring(script, -1));
			} 
		} 
		ModernizedCProgram.data.setScript(script);
		success = true;
		if (!success && script) {
			.lua_close(script);
		} 
		ModernizedCProgram.current_lua_script = NULL;
		return success;
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
	public dstr getLog_chunk() {
		return log_chunk;
	}
	public void setLog_chunk(dstr newLog_chunk) {
		log_chunk = newLog_chunk;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getScript() {
		return script;
	}
	public void setScript(Object newScript) {
		script = newScript;
	}
	public script_callback getFirst_callback() {
		return first_callback;
	}
	public void setFirst_callback(script_callback newFirst_callback) {
		first_callback = newFirst_callback;
	}
	public int getUpdate() {
		return update;
	}
	public void setUpdate(int newUpdate) {
		update = newUpdate;
	}
	public int getGet_properties() {
		return get_properties;
	}
	public void setGet_properties(int newGet_properties) {
		get_properties = newGet_properties;
	}
	public int getSave() {
		return save;
	}
	public void setSave(int newSave) {
		save = newSave;
	}
	public int getTick() {
		return tick;
	}
	public void setTick(int newTick) {
		tick = newTick;
	}
	public obs_lua_script getNext_tick() {
		return next_tick;
	}
	public void setNext_tick(obs_lua_script newNext_tick) {
		next_tick = newNext_tick;
	}
	public obs_lua_script getP_prev_next_tick() {
		return p_prev_next_tick;
	}
	public void setP_prev_next_tick(obs_lua_script newP_prev_next_tick) {
		p_prev_next_tick = newP_prev_next_tick;
	}
	public Object getDefined_sources() {
		return defined_sources;
	}
	public void setDefined_sources(Object newDefined_sources) {
		defined_sources = newDefined_sources;
	}
}
