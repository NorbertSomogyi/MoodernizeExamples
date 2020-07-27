package application;

/******************************************************************************
    Copyright (C) 2015 by Andrew Skinner <obs@theandyroid.com>
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
/* ------------------------------------------------------------ */
public class python_obs_callback {
	private script_callback base;
	private Object func;
	
	public python_obs_callback(script_callback base, Object func) {
		setBase(base);
		setFunc(func);
	}
	public python_obs_callback() {
	}
	
	public python_obs_callback python_obs_timer_cb(python_obs_timer timer) {
		return ((python_obs_callback)timer)[-1];
	}
	public python_obs_callback add_python_obs_callback_extra(obs_python_script script, Object func, Object extra_size) {
		script_callback generatedFirst_callback = script.getFirst_callback();
		python_obs_callback cb = ModernizedCProgram.add_script_callback(generatedFirst_callback, (obs_script_t)script, /*Error: sizeof expression not supported yet*/ + extra_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XINCREF(func);
		cb.setFunc(func);
		return cb;
	}
	public python_obs_callback add_python_obs_callback(obs_python_script script, Object func) {
		python_obs_callback python_obs_callback = new python_obs_callback();
		return python_obs_callback.add_python_obs_callback_extra(script, func, 0);
	}
	public Object python_obs_callback_extra_data() {
		return (Object)ModernizedCProgram.cb[1];
	}
	public python_obs_callback find_next_python_obs_callback(obs_python_script script, Object func) {
		script_callback generatedFirst_callback = script.getFirst_callback();
		ModernizedCProgram.cb = ModernizedCProgram.cb ? (python_obs_callback)ModernizedCProgram.cb.getBase().getNext() : (python_obs_callback)generatedFirst_callback;
		while (ModernizedCProgram.cb) {
			if (ModernizedCProgram.cb.getFunc() == func) {
				break;
			} 
			ModernizedCProgram.cb = (python_obs_callback)ModernizedCProgram.cb.getBase().getNext();
		}
		return ModernizedCProgram.cb;
	}
	public python_obs_callback find_python_obs_callback(obs_python_script script, Object func) {
		return NULL.find_next_python_obs_callback(script, func);
	}
	public void remove_python_obs_callback() {
		ModernizedCProgram.cb.getBase().remove_script_callback();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(ModernizedCProgram.cb.getFunc());
		ModernizedCProgram.cb.setFunc(NULL);
	}
	public void just_free_python_obs_callback() {
		ModernizedCProgram.cb.getBase().just_free_script_callback();
	}
	public void free_python_obs_callback() {
		ModernizedCProgram.cb.getBase().free_script_callback();
	}
	public script_callback getBase() {
		return base;
	}
	public void setBase(script_callback newBase) {
		base = newBase;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
}
