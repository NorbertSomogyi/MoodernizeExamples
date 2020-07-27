package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved		by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 */
public class _GtkForm {
	private Object container;
	private Object children;
	private Object bin_window;
	private Object freeze_count;
	
	public _GtkForm(Object container, Object children, Object bin_window, Object freeze_count) {
		setContainer(container);
		setChildren(children);
		setBin_window(bin_window);
		setFreeze_count(freeze_count);
	}
	public _GtkForm() {
	}
	
	public void gtk_form_put(Object child_widget, Object x, Object y) {
		GtkFormChild child = new GtkFormChild();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_return_if_fail((/*Error: Function owner not recognized*/GTK_CHECK_TYPE((form), (ModernizedCProgram.gtk_form_get_type()))));
		child = /*Error: Function owner not recognized*/g_new(, /* LINTED: avoid warning: conversion to 'unsigned long' */1);
		if (child == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		child.setWidget(child_widget);
		child.setWindow(((Object)0));
		child.setX(x);
		child.setY(y);
		Object generatedWidget = child.getWidget();
		generatedWidget.getRequisition().setWidth(0);
		generatedWidget.getRequisition().setHeight(0);
		child.setMapped(0);
		Object generatedChildren = this.getChildren();
		this.setChildren(/*Error: Function owner not recognized*/g_list_append(generatedChildren, child/* child->window must be created and attached to the widget _before_
		     * it has been realized, or else things will break with GTK2.  Note
		     * that gtk_widget_set_parent() realizes the widget if it's visible
		     * and its parent is mapped.
		     */));
		if (/*Error: Function owner not recognized*/gtk_widget_get_realized(/*Error: Function owner not recognized*/GTK_WIDGET(form))) {
			ModernizedCProgram.gtk_form_attach_child_window(form, child);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gtk_widget_set_parent(child_widget, /*Error: Function owner not recognized*/GTK_WIDGET(form));
		if (/*Error: Function owner not recognized*/gtk_widget_get_realized(/*Error: Function owner not recognized*/GTK_WIDGET(form)) && !/*Error: Function owner not recognized*/gtk_widget_get_realized(child_widget)) {
			ModernizedCProgram.gtk_form_realize_child(form, child);
		} 
		ModernizedCProgram.gtk_form_position_child(form, child, 1);
	}
	public void gtk_form_move(Object child_widget, Object x, Object y) {
		 tmp_list = new ();
		GtkFormChild child = new GtkFormChild();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_return_if_fail((/*Error: Function owner not recognized*/GTK_CHECK_TYPE((form), (ModernizedCProgram.gtk_form_get_type()))));
		Object generatedWidget = child.getWidget();
		Object generatedChildren = this.getChildren();
		for (tmp_list = generatedChildren; tmp_list; tmp_list = tmp_list.getNext()) {
			child = tmp_list.getData();
			if (generatedWidget == child_widget) {
				child.setX(x);
				child.setY(y);
				ModernizedCProgram.gtk_form_position_child(form, child, 1);
				return /*Error: Unsupported expression*/;
			} 
		}
	}
	public void gtk_form_freeze() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_return_if_fail((/*Error: Function owner not recognized*/GTK_CHECK_TYPE((form), (ModernizedCProgram.gtk_form_get_type()))));
		Object generatedFreeze_count = this.getFreeze_count();
		++generatedFreeze_count;
	}
	public void gtk_form_thaw() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_return_if_fail((/*Error: Function owner not recognized*/GTK_CHECK_TYPE((form), (ModernizedCProgram.gtk_form_get_type()))));
		Object generatedFreeze_count = this.getFreeze_count();
		if (generatedFreeze_count) {
			if (!(--generatedFreeze_count)) {
				form.gtk_form_position_children();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gtk_widget_queue_draw(/*Error: Function owner not recognized*/GTK_WIDGET(form/* Basic Object handling procedures
				 */));
			} 
		} 
	}
	public void gtk_form_init() {
		this.setChildren(((Object)0));
		this.setBin_window(((Object)0));
		this.setFreeze_count(0/*
		 * Widget methods
		 */);
	}
	public void gtk_form_position_children() {
		 tmp_list = new ();
		Object generatedChildren = this.getChildren();
		for (tmp_list = generatedChildren; tmp_list; tmp_list = tmp_list.getNext()) {
			ModernizedCProgram.gtk_form_position_child(form, tmp_list.getData(), 0);
		}
	}
	public void gtk_form_move_resize(Object widget, Object x, Object y, Object w, Object h) {
		widget.getRequisition().setWidth(w);
		widget.getRequisition().setHeight(h);
		form.gtk_form_move(widget, x, y);
	}
	public void gtk_form_send_configure() {
		 widget = new ();
		 event = new ();
		 allocation = new ();
		widget = /*Error: Function owner not recognized*/GTK_WIDGET(form);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gtk_widget_get_allocation(widget, allocation);
		event.setType(GDK_CONFIGURE);
		event.setWindow(/*Error: Function owner not recognized*/gtk_widget_get_window(widget));
		event.setX(allocation.getX());
		event.setY(allocation.getY());
		event.setWidth(allocation.getWidth());
		event.setHeight(allocation.getHeight());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gtk_main_do_event((int)event);
	}
	public Object getContainer() {
		return container;
	}
	public void setContainer(Object newContainer) {
		container = newContainer;
	}
	public Object getChildren() {
		return children;
	}
	public void setChildren(Object newChildren) {
		children = newChildren;
	}
	public Object getBin_window() {
		return bin_window;
	}
	public void setBin_window(Object newBin_window) {
		bin_window = newBin_window;
	}
	public Object getFreeze_count() {
		return freeze_count;
	}
	public void setFreeze_count(Object newFreeze_count) {
		freeze_count = newFreeze_count;
	}
}
