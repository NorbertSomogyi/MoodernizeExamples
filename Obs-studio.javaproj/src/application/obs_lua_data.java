package application;

/* ========================================================================= */
public class obs_lua_data {
	private obs_source source;
	private obs_lua_source ls;
	private int lua_data_ref;
	private obs_lua_data next;
	private obs_lua_data p_prev_next;
	
	public obs_lua_data(obs_source source, obs_lua_source ls, int lua_data_ref, obs_lua_data next, obs_lua_data p_prev_next) {
		setSource(source);
		setLs(ls);
		setLua_data_ref(lua_data_ref);
		setNext(next);
		setP_prev_next(p_prev_next);
	}
	public obs_lua_data() {
	}
	
	public void call_destroy() {
		obs_lua_source generatedLs = this.getLs();
		obs_lua_source ls = generatedLs;
		Object generatedScript = ls.getScript();
		int generatedLua_data_ref = this.getLua_data_ref();
		.lua_rawgeti(generatedScript, LUA_REGISTRYINDEX, generatedLua_data_ref);
		int generatedFunc_destroy = ls.getFunc_destroy();
		Object generatedDisplay_name = ls.getDisplay_name();
		ModernizedCProgram.call_func_(generatedScript, generatedFunc_destroy, 1, 0, "destroy", generatedDisplay_name);
		.luaL_unref(generatedScript, LUA_REGISTRYINDEX, generatedLua_data_ref);
		this.setLua_data_ref(LUA_REFNIL);
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public obs_lua_source getLs() {
		return ls;
	}
	public void setLs(obs_lua_source newLs) {
		ls = newLs;
	}
	public int getLua_data_ref() {
		return lua_data_ref;
	}
	public void setLua_data_ref(int newLua_data_ref) {
		lua_data_ref = newLua_data_ref;
	}
	public obs_lua_data getNext() {
		return next;
	}
	public void setNext(obs_lua_data newNext) {
		next = newNext;
	}
	public obs_lua_data getP_prev_next() {
		return p_prev_next;
	}
	public void setP_prev_next(obs_lua_data newP_prev_next) {
		p_prev_next = newP_prev_next;
	}
}
