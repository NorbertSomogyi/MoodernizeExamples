package application;

public class filter {
	private Object filter_object_fn;
	private Object finalize_omits_fn;
	private Object free_fn;
	private Object filter_data;
	private oidset omits;
	
	public filter(Object filter_object_fn, Object finalize_omits_fn, Object free_fn, Object filter_data, oidset omits) {
		setFilter_object_fn(filter_object_fn);
		setFinalize_omits_fn(finalize_omits_fn);
		setFree_fn(free_fn);
		setFilter_data(filter_data);
		setOmits(omits);
	}
	public filter() {
	}
	
	public filter list_objects_filter__init(oidset omitted, list_objects_filter_options filter_options) {
		filter filter = new filter();
		filter_init_fn init_fn = new filter_init_fn();
		(((/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/) == list_objects_filter_choice.LOFC__COUNT) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(sizeof(s_filters) / sizeof(s_filters[0])) == LOFC__COUNT", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\list-objects-filter.c", 664));
		list_objects_filter_choice generatedChoice = filter_options.getChoice();
		if (generatedChoice >= list_objects_filter_choice.LOFC__COUNT) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\list-objects-filter.c", 668, "invalid list-objects filter choice: %d", generatedChoice);
		} 
		init_fn = ModernizedCProgram.s_filters[generatedChoice];
		if (!init_fn) {
			return ((Object)0);
		} 
		filter = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		filter.setOmits(omitted);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/init_fn(filter_options, filter);
		return filter;
	}
	public void list_objects_filter__free() {
		if (!ModernizedCProgram.filter) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.filter.getFinalize_omits_fn() && ModernizedCProgram.filter.getOmits()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.filter.getOmits(), ModernizedCProgram.filter.getFilter_data());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.filter.getFilter_data());
		ModernizedCProgram.free(ModernizedCProgram.filter);
	}
	public Object getFilter_object_fn() {
		return filter_object_fn;
	}
	public void setFilter_object_fn(Object newFilter_object_fn) {
		filter_object_fn = newFilter_object_fn;
	}
	public Object getFinalize_omits_fn() {
		return finalize_omits_fn;
	}
	public void setFinalize_omits_fn(Object newFinalize_omits_fn) {
		finalize_omits_fn = newFinalize_omits_fn;
	}
	public Object getFree_fn() {
		return free_fn;
	}
	public void setFree_fn(Object newFree_fn) {
		free_fn = newFree_fn;
	}
	public Object getFilter_data() {
		return filter_data;
	}
	public void setFilter_data(Object newFilter_data) {
		filter_data = newFilter_data;
	}
	public oidset getOmits() {
		return omits;
	}
	public void setOmits(oidset newOmits) {
		omits = newOmits;
	}
}
/*
 * Must match "enum list_objects_filter_choice".
 */
