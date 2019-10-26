package application;

public class _ScrollbarClassRec {
	private Object core_class;
	private Object simple_class;
	private  scrollbar_class;
	
	public _ScrollbarClassRec(Object core_class, Object simple_class,  scrollbar_class) {
		setCore_class(core_class);
		setSimple_class(simple_class);
		setScrollbar_class(scrollbar_class);
	}
	public _ScrollbarClassRec() {
	}
	
	public Object getCore_class() {
		return core_class;
	}
	public void setCore_class(Object newCore_class) {
		core_class = newCore_class;
	}
	public Object getSimple_class() {
		return simple_class;
	}
	public void setSimple_class(Object newSimple_class) {
		simple_class = newSimple_class;
	}
	public  getScrollbar_class() {
		return scrollbar_class;
	}
	public void setScrollbar_class( newScrollbar_class) {
		scrollbar_class = newScrollbar_class;
	}
}
