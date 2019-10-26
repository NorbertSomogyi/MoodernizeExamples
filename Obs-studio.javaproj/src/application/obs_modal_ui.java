package application;

/******************************************************************************
    Copyright (C) 2013-2014 by Hugh Bailey <obs.jim@gmail.com>

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
/**
 *   @file
 *
 *   Modules can specify custom user-interface-specific exports.  UI functions
 * can be within the same library as the actual core logic, or separated in to
 * different modules to split up UI logic and core module logic.
 *
 *   The reasoning for this is to allow for custom user interface of differing
 * toolkits or for automatically generated user interface, or to simply allow
 * separation of UI code from core code (which may often be in differing
 * languages).
 */
/** Modal UI definition structure */
public class obs_modal_ui {
	private Object id;
	private Object task;
	private Object target;
	private Object exec;
	private Object type_data;
	private Object free_type_data;
	
	public obs_modal_ui(Object id, Object task, Object target, Object exec, Object type_data, Object free_type_data) {
		setId(id);
		setTask(task);
		setTarget(target);
		setExec(exec);
		setType_data(type_data);
		setFree_type_data(free_type_data);
	}
	public obs_modal_ui() {
	}
	
	public obs_modal_ui get_modal_ui_callback(Object id, Object task, Object target) {
		for ( i = 0;
		 i < ModernizedCProgram.obs.getModal_ui_callbacks().getNum(); i++) {
			obs_modal_ui callback = ModernizedCProgram.obs.getModal_ui_callbacks().getArray() + i;
			if (.strcmp(ModernizedCProgram.callback.getId(), id) == 0 && .strcmp(ModernizedCProgram.callback.getTask(), task) == 0 && .strcmp(ModernizedCProgram.callback.getTarget(), target) == 0) {
				return ModernizedCProgram.callback;
			} 
		}
		return NULL;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getTask() {
		return task;
	}
	public void setTask(Object newTask) {
		task = newTask;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object newTarget) {
		target = newTarget;
	}
	public Object getExec() {
		return exec;
	}
	public void setExec(Object newExec) {
		exec = newExec;
	}
	public Object getType_data() {
		return type_data;
	}
	public void setType_data(Object newType_data) {
		type_data = newType_data;
	}
	public Object getFree_type_data() {
		return free_type_data;
	}
	public void setFree_type_data(Object newFree_type_data) {
		free_type_data = newFree_type_data;
	}
}
