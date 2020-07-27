package application;

/* low-level interface to diffcore_order */
public class obj_order {
	private Object obj;
	private int orig_order;
	private int order;
	
	public obj_order(Object obj, int orig_order, int order) {
		setObj(obj);
		setOrig_order(orig_order);
		setOrder(order);
	}
	public obj_order() {
	}
	
	public void order_objects(Object orderfile, Object obj_path, int nr) {
		int i;
		if (!nr) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.prepare_order(orderfile);
		for (i = 0; i < nr; i++) {
			objs[i].setOrig_order(i);
			objs[i].setOrder(ModernizedCProgram.match_order(/*Error: Function owner not recognized*/obj_path(objs[i].getObj())));
		}
		ModernizedCProgram.sane_qsort((objs), (nr), /*Error: sizeof expression not supported yet*/, compare_objs_order);
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object newObj) {
		obj = newObj;
	}
	public int getOrig_order() {
		return orig_order;
	}
	public void setOrig_order(int newOrig_order) {
		orig_order = newOrig_order;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int newOrder) {
		order = newOrder;
	}
}
