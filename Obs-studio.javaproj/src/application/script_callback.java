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
public class script_callback {
	private script_callback next;
	private script_callback p_prev_next;
	private Object on_remove;
	private obs_script script;
	private Object extra;
	private Object removed;
	
	public script_callback(script_callback next, script_callback p_prev_next, Object on_remove, obs_script script, Object extra, Object removed) {
		setNext(next);
		setP_prev_next(p_prev_next);
		setOn_remove(on_remove);
		setScript(script);
		setExtra(extra);
		setRemoved(removed);
	}
	public script_callback() {
	}
	
	public void timer_call() {
		python_obs_callback cb = (python_obs_callback)p_cb;
		Object generatedRemoved = this.getRemoved();
		if (generatedRemoved) {
			return /*Error: Unsupported expression*/;
		} 
		 gstate = /*Error: Function owner not recognized*/Import_PyGILState_Ensure();
		obs_python_script __last_script = ModernizedCProgram.cur_python_script;
		python_obs_callback __last_cb = ModernizedCProgram.cur_python_cb;
		script_callback generatedBase = cb.getBase();
		obs_script generatedScript = generatedBase.getScript();
		ModernizedCProgram.cur_python_script = (obs_python_script)generatedScript;
		ModernizedCProgram.cur_python_cb = cb;
		Object generatedFunc = cb.getFunc();
		 py_ret = /*Error: Function owner not recognized*/Import_PyObject_CallObject(generatedFunc, NULL);
		ModernizedCProgram.py_error_(__FUNCTION__, 433);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_ret);
		ModernizedCProgram.cur_python_cb = __last_cb;
		ModernizedCProgram.cur_python_script = __last_script;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyGILState_Release(gstate);
		lua_obs_callback cb = (lua_obs_callback)p_cb;
		Object generatedRemoved = this.getRemoved();
		if (generatedRemoved) {
			return /*Error: Unsupported expression*/;
		} 
		obs_lua_script __last_script = ModernizedCProgram.current_lua_script;
		lua_obs_callback __last_callback = ModernizedCProgram.current_lua_cb;
		ModernizedCProgram.current_lua_cb = cb;
		script_callback generatedBase = cb.getBase();
		obs_script generatedScript = generatedBase.getScript();
		ModernizedCProgram.current_lua_script = (obs_lua_script)generatedScript;
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.current_lua_script.getMutex());
		;
		int generatedReg_idx = cb.getReg_idx();
		ModernizedCProgram.call_func_(generatedScript, generatedReg_idx, 0, 0, "timer_cb", __FUNCTION__);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.current_lua_script.getMutex());
		ModernizedCProgram.current_lua_script = __last_script;
		ModernizedCProgram.current_lua_cb = __last_callback;
		;
	}
	public void remove_script_callback() {
		ModernizedCProgram.cb.setRemoved(true);
		script_callback next = ModernizedCProgram.cb.getNext();
		if (next) {
			next.setP_prev_next(ModernizedCProgram.cb.getP_prev_next());
		} 
		ModernizedCProgram.cb.getP_prev_next() = ModernizedCProgram.cb.getNext();
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.detach_mutex);
		next = ModernizedCProgram.detached_callbacks;
		ModernizedCProgram.cb.setNext(next);
		if (next) {
			next.setP_prev_next(ModernizedCProgram.cb.getNext());
		} 
		ModernizedCProgram.cb.setP_prev_next(ModernizedCProgram.detached_callbacks);
		ModernizedCProgram.detached_callbacks = ModernizedCProgram.cb;
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.detach_mutex);
		if (ModernizedCProgram.cb.getOn_remove()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.cb);
		} 
	}
	public void just_free_script_callback() {
		ModernizedCProgram.cb.getExtra().calldata_free();
		ModernizedCProgram.bfree(ModernizedCProgram.cb);
	}
	public void free_script_callback() {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.detach_mutex);
		script_callback next = ModernizedCProgram.cb.getNext();
		if (next) {
			next.setP_prev_next(ModernizedCProgram.cb.getP_prev_next());
		} 
		ModernizedCProgram.cb.getP_prev_next() = ModernizedCProgram.cb.getNext();
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.detach_mutex);
		ModernizedCProgram.cb.just_free_script_callback();
	}
	public script_callback getNext() {
		return next;
	}
	public void setNext(script_callback newNext) {
		next = newNext;
	}
	public script_callback getP_prev_next() {
		return p_prev_next;
	}
	public void setP_prev_next(script_callback newP_prev_next) {
		p_prev_next = newP_prev_next;
	}
	public Object getOn_remove() {
		return on_remove;
	}
	public void setOn_remove(Object newOn_remove) {
		on_remove = newOn_remove;
	}
	public obs_script getScript() {
		return script;
	}
	public void setScript(obs_script newScript) {
		script = newScript;
	}
	public Object getExtra() {
		return extra;
	}
	public void setExtra(Object newExtra) {
		extra = newExtra;
	}
	public Object getRemoved() {
		return removed;
	}
	public void setRemoved(Object newRemoved) {
		removed = newRemoved;
	}
}
