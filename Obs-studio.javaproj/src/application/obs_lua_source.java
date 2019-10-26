package application;

public class obs_lua_source {
	private obs_lua_script data;
	private Object script;
	private Object id;
	private Object display_name;
	private int func_create;
	private int func_destroy;
	private int func_get_width;
	private int func_get_height;
	private int func_get_defaults;
	private int func_get_properties;
	private int func_update;
	private int func_activate;
	private int func_deactivate;
	private int func_show;
	private int func_hide;
	private int func_video_tick;
	private int func_video_render;
	private int func_save;
	private int func_load;
	private Object definition_mutex;
	private obs_lua_data first_source;
	private obs_lua_source next;
	private obs_lua_source p_prev_next;
	
	public obs_lua_source(obs_lua_script data, Object script, Object id, Object display_name, int func_create, int func_destroy, int func_get_width, int func_get_height, int func_get_defaults, int func_get_properties, int func_update, int func_activate, int func_deactivate, int func_show, int func_hide, int func_video_tick, int func_video_render, int func_save, int func_load, Object definition_mutex, obs_lua_data first_source, obs_lua_source next, obs_lua_source p_prev_next) {
		setData(data);
		setScript(script);
		setId(id);
		setDisplay_name(display_name);
		setFunc_create(func_create);
		setFunc_destroy(func_destroy);
		setFunc_get_width(func_get_width);
		setFunc_get_height(func_get_height);
		setFunc_get_defaults(func_get_defaults);
		setFunc_get_properties(func_get_properties);
		setFunc_update(func_update);
		setFunc_activate(func_activate);
		setFunc_deactivate(func_deactivate);
		setFunc_show(func_show);
		setFunc_hide(func_hide);
		setFunc_video_tick(func_video_tick);
		setFunc_video_render(func_video_render);
		setFunc_save(func_save);
		setFunc_load(func_load);
		setDefinition_mutex(definition_mutex);
		setFirst_source(first_source);
		setNext(next);
		setP_prev_next(p_prev_next);
	}
	public obs_lua_source() {
	}
	
	public void source_type_unload() {
		Object generatedScript = this.getScript();
		int generatedFunc_create = this.getFunc_create();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_create);
		this.setFunc_create(LUA_REFNIL);
		int generatedFunc_destroy = this.getFunc_destroy();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_destroy);
		this.setFunc_destroy(LUA_REFNIL);
		int generatedFunc_get_width = this.getFunc_get_width();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_get_width);
		this.setFunc_get_width(LUA_REFNIL);
		int generatedFunc_get_height = this.getFunc_get_height();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_get_height);
		this.setFunc_get_height(LUA_REFNIL);
		int generatedFunc_get_defaults = this.getFunc_get_defaults();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_get_defaults);
		this.setFunc_get_defaults(LUA_REFNIL);
		int generatedFunc_get_properties = this.getFunc_get_properties();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_get_properties);
		this.setFunc_get_properties(LUA_REFNIL);
		int generatedFunc_update = this.getFunc_update();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_update);
		this.setFunc_update(LUA_REFNIL);
		int generatedFunc_activate = this.getFunc_activate();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_activate);
		this.setFunc_activate(LUA_REFNIL);
		int generatedFunc_deactivate = this.getFunc_deactivate();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_deactivate);
		this.setFunc_deactivate(LUA_REFNIL);
		int generatedFunc_show = this.getFunc_show();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_show);
		this.setFunc_show(LUA_REFNIL);
		int generatedFunc_hide = this.getFunc_hide();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_hide);
		this.setFunc_hide(LUA_REFNIL);
		int generatedFunc_video_tick = this.getFunc_video_tick();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_video_tick);
		this.setFunc_video_tick(LUA_REFNIL);
		int generatedFunc_video_render = this.getFunc_video_render();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_video_render);
		this.setFunc_video_render(LUA_REFNIL);
		int generatedFunc_save = this.getFunc_save();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_save);
		this.setFunc_save(LUA_REFNIL);
		int generatedFunc_load = this.getFunc_load();
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedFunc_load);
		this.setFunc_load(LUA_REFNIL);
	}
	public obs_lua_source find_existing(Object id) {
		obs_lua_source existing = NULL;
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.lua_source_def_mutex);
		obs_lua_source ls = ModernizedCProgram.first_source_def;
		Object generatedId = ls.getId();
		obs_lua_source generatedNext = ls.getNext();
		while (ls) {
			if (generatedId == /* can compare pointers here due to string table */id) {
				existing = ls;
				break;
			} 
			ls = generatedNext;
		}
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.lua_source_def_mutex);
		return existing;
	}
	public obs_lua_script getData() {
		return data;
	}
	public void setData(obs_lua_script newData) {
		data = newData;
	}
	public Object getScript() {
		return script;
	}
	public void setScript(Object newScript) {
		script = newScript;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(Object newDisplay_name) {
		display_name = newDisplay_name;
	}
	public int getFunc_create() {
		return func_create;
	}
	public void setFunc_create(int newFunc_create) {
		func_create = newFunc_create;
	}
	public int getFunc_destroy() {
		return func_destroy;
	}
	public void setFunc_destroy(int newFunc_destroy) {
		func_destroy = newFunc_destroy;
	}
	public int getFunc_get_width() {
		return func_get_width;
	}
	public void setFunc_get_width(int newFunc_get_width) {
		func_get_width = newFunc_get_width;
	}
	public int getFunc_get_height() {
		return func_get_height;
	}
	public void setFunc_get_height(int newFunc_get_height) {
		func_get_height = newFunc_get_height;
	}
	public int getFunc_get_defaults() {
		return func_get_defaults;
	}
	public void setFunc_get_defaults(int newFunc_get_defaults) {
		func_get_defaults = newFunc_get_defaults;
	}
	public int getFunc_get_properties() {
		return func_get_properties;
	}
	public void setFunc_get_properties(int newFunc_get_properties) {
		func_get_properties = newFunc_get_properties;
	}
	public int getFunc_update() {
		return func_update;
	}
	public void setFunc_update(int newFunc_update) {
		func_update = newFunc_update;
	}
	public int getFunc_activate() {
		return func_activate;
	}
	public void setFunc_activate(int newFunc_activate) {
		func_activate = newFunc_activate;
	}
	public int getFunc_deactivate() {
		return func_deactivate;
	}
	public void setFunc_deactivate(int newFunc_deactivate) {
		func_deactivate = newFunc_deactivate;
	}
	public int getFunc_show() {
		return func_show;
	}
	public void setFunc_show(int newFunc_show) {
		func_show = newFunc_show;
	}
	public int getFunc_hide() {
		return func_hide;
	}
	public void setFunc_hide(int newFunc_hide) {
		func_hide = newFunc_hide;
	}
	public int getFunc_video_tick() {
		return func_video_tick;
	}
	public void setFunc_video_tick(int newFunc_video_tick) {
		func_video_tick = newFunc_video_tick;
	}
	public int getFunc_video_render() {
		return func_video_render;
	}
	public void setFunc_video_render(int newFunc_video_render) {
		func_video_render = newFunc_video_render;
	}
	public int getFunc_save() {
		return func_save;
	}
	public void setFunc_save(int newFunc_save) {
		func_save = newFunc_save;
	}
	public int getFunc_load() {
		return func_load;
	}
	public void setFunc_load(int newFunc_load) {
		func_load = newFunc_load;
	}
	public Object getDefinition_mutex() {
		return definition_mutex;
	}
	public void setDefinition_mutex(Object newDefinition_mutex) {
		definition_mutex = newDefinition_mutex;
	}
	public obs_lua_data getFirst_source() {
		return first_source;
	}
	public void setFirst_source(obs_lua_data newFirst_source) {
		first_source = newFirst_source;
	}
	public obs_lua_source getNext() {
		return next;
	}
	public void setNext(obs_lua_source newNext) {
		next = newNext;
	}
	public obs_lua_source getP_prev_next() {
		return p_prev_next;
	}
	public void setP_prev_next(obs_lua_source newP_prev_next) {
		p_prev_next = newP_prev_next;
	}
}
