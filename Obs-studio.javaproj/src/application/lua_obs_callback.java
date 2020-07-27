package application;

/* ------------------------------------------------------------ */
/* ------------------------------------------------ */
public class lua_obs_callback {
	private script_callback base;
	private Object script;
	private int reg_idx;
	
	public lua_obs_callback(script_callback base, Object script, int reg_idx) {
		setBase(base);
		setScript(script);
		setReg_idx(reg_idx);
	}
	public lua_obs_callback() {
	}
	
	public lua_obs_callback lua_obs_timer_cb(lua_obs_timer timer) {
		return ((lua_obs_callback)timer)[-1];
	}
	public lua_obs_callback add_lua_obs_callback_extra(Object script, int stack_idx, Object extra_size) {
		obs_lua_script data = ModernizedCProgram.current_lua_script;
		script_callback generatedFirst_callback = data.getFirst_callback();
		lua_obs_callback cb = ModernizedCProgram.add_script_callback(generatedFirst_callback, (obs_script_t)data, /*Error: sizeof expression not supported yet*/ + extra_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lua_pushvalue(script, stack_idx);
		cb.setReg_idx(/*Error: Function owner not recognized*/luaL_ref(script, LUA_REGISTRYINDEX));
		cb.setScript(script);
		return cb;
	}
	public lua_obs_callback add_lua_obs_callback(Object script, int stack_idx) {
		lua_obs_callback lua_obs_callback = new lua_obs_callback();
		return lua_obs_callback.add_lua_obs_callback_extra(script, stack_idx, 0);
	}
	public Object lua_obs_callback_extra_data() {
		return (Object)ModernizedCProgram.cb[1];
	}
	public lua_obs_callback find_next_lua_obs_callback(Object script, int stack_idx) {
		obs_lua_script data = ModernizedCProgram.current_lua_script;
		script_callback generatedFirst_callback = data.getFirst_callback();
		ModernizedCProgram.cb = ModernizedCProgram.cb ? (lua_obs_callback)ModernizedCProgram.cb.getBase().getNext() : (lua_obs_callback)generatedFirst_callback;
		while (ModernizedCProgram.cb) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lua_rawgeti(script, LUA_REGISTRYINDEX, ModernizedCProgram.cb.getReg_idx());
			 match = /*Error: Function owner not recognized*/lua_rawequal(script, -1, stack_idx);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lua_pop(script, 1);
			if (match) {
				break;
			} 
			ModernizedCProgram.cb = (lua_obs_callback)ModernizedCProgram.cb.getBase().getNext();
		}
		return ModernizedCProgram.cb;
	}
	public lua_obs_callback find_lua_obs_callback(Object script, int stack_idx) {
		return NULL.find_next_lua_obs_callback(script, stack_idx);
	}
	public void remove_lua_obs_callback() {
		ModernizedCProgram.cb.getBase().remove_script_callback();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/luaL_unref(ModernizedCProgram.cb.getScript(), LUA_REGISTRYINDEX, ModernizedCProgram.cb.getReg_idx());
	}
	public void just_free_lua_obs_callback() {
		ModernizedCProgram.cb.getBase().just_free_script_callback();
	}
	public void free_lua_obs_callback() {
		ModernizedCProgram.cb.getBase().free_script_callback();
	}
	public script_callback getBase() {
		return base;
	}
	public void setBase(script_callback newBase) {
		base = newBase;
	}
	public Object getScript() {
		return script;
	}
	public void setScript(Object newScript) {
		script = newScript;
	}
	public int getReg_idx() {
		return reg_idx;
	}
	public void setReg_idx(int newReg_idx) {
		reg_idx = newReg_idx;
	}
}
