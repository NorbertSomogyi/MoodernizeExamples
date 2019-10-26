package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved		by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * (C) 1998,1999 by Marcin Dalecki <martin@dalecki.de>
 *
 * Support for GTK+ 2 was added by:
 *
 * (C) 2002,2003  Jason Hildebrand  <jason@peaceworks.ca>
 *		  Daniel Elstner  <daniel.elstner@gmx.net>
 *
 * This is a special purpose container widget, which manages arbitrary
 * children at arbitrary positions width arbitrary sizes.  This finally puts
 * an end on our resize problems with which we where struggling for such a
 * long time.
 *
 * Support for GTK+ 3 was added by:
 *
 * 2016  Kazunobu Kuriyama  <kazunobu.kuriyama@gmail.com>
 */
/* without this it compiles, but gives errors at
			   runtime! */
public class _GtkFormChild {
	private Object widget;
	private Object window;
	private Object x;
	private Object y;
	private Object mapped;
	
	public _GtkFormChild(Object widget, Object window, Object x, Object y, Object mapped) {
		setWidget(widget);
		setWindow(window);
		setX(x);
		setY(y);
		setMapped(mapped);
	}
	public _GtkFormChild() {
	}
	
	public Object getWidget() {
		return widget;
	}
	public void setWidget(Object newWidget) {
		widget = newWidget;
	}
	public Object getWindow() {
		return window;
	}
	public void setWindow(Object newWindow) {
		window = newWindow;
	}
	public Object getX() {
		return x;
	}
	public void setX(Object newX) {
		x = newX;
	}
	public Object getY() {
		return y;
	}
	public void setY(Object newY) {
		y = newY;
	}
	public Object getMapped() {
		return mapped;
	}
	public void setMapped(Object newMapped) {
		mapped = newMapped;
	}
}
