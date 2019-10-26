package application;

/** Modeless UI definition structure */
public class obs_modeless_ui {
	private Object id;
	private Object task;
	private Object target;
	private Object create;
	private Object type_data;
	private Object free_type_data;
	
	public obs_modeless_ui(Object id, Object task, Object target, Object create, Object type_data, Object free_type_data) {
		setId(id);
		setTask(task);
		setTarget(target);
		setCreate(create);
		setType_data(type_data);
		setFree_type_data(free_type_data);
	}
	public obs_modeless_ui() {
	}
	
	public obs_modeless_ui get_modeless_ui_callback(Object id, Object task, Object target) {
		for ( i = 0;
		 i < ModernizedCProgram.obs.getModeless_ui_callbacks().getNum(); i++) {
			obs_modeless_ui callback = new obs_modeless_ui();
			ModernizedCProgram.callback = ModernizedCProgram.obs.getModeless_ui_callbacks().getArray() + i;
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
	public Object getCreate() {
		return create;
	}
	public void setCreate(Object newCreate) {
		create = newCreate;
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
