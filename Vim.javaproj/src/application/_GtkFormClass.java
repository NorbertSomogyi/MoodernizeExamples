package application;

public class _GtkFormClass {
	private Object parent_class;
	
	public _GtkFormClass(Object parent_class) {
		setParent_class(parent_class);
	}
	public _GtkFormClass() {
	}
	
	public void gtk_form_class_init() {
		 widget_class = new ();
		 container_class = new ();
		widget_class = ()klass;
		container_class = ()klass;
		ModernizedCProgram.parent_class = .gtk_type_class(.gtk_container_get_type());
		widget_class.setRealize(ModernizedCProgram.gtk_form_realize);
		widget_class.setUnrealize(ModernizedCProgram.gtk_form_unrealize);
		widget_class.setMap(ModernizedCProgram.gtk_form_map);
		widget_class.setSize_request(ModernizedCProgram.gtk_form_size_request);
		widget_class.setSize_allocate(ModernizedCProgram.gtk_form_size_allocate);
		widget_class.setExpose_event(ModernizedCProgram.gtk_form_expose);
		container_class.setRemove(ModernizedCProgram.gtk_form_remove);
		container_class.setForall(ModernizedCProgram.gtk_form_forall);
	}
	public Object getParent_class() {
		return parent_class;
	}
	public void setParent_class(Object newParent_class) {
		parent_class = newParent_class;
	}
}
