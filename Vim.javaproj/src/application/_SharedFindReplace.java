package application;

/*
 * We don't create it twice.
 */
public class _SharedFindReplace {
	private Object dialog;
	private Object wword;
	private Object mcase;
	private Object up;
	private Object down;
	private Object what;
	private Object with;
	private Object find;
	private Object replace;
	private Object all;
	
	public _SharedFindReplace(Object dialog, Object wword, Object mcase, Object up, Object down, Object what, Object with, Object find, Object replace, Object all) {
		setDialog(dialog);
		setWword(wword);
		setMcase(mcase);
		setUp(up);
		setDown(down);
		setWhat(what);
		setWith(with);
		setFind(find);
		setReplace(replace);
		setAll(all);
	}
	public _SharedFindReplace() {
	}
	
	public int find_key_press_event(Object widget, Integer event) {
		if (event.getState() & (GDK_CONTROL_MASK | /* If the user is holding one of the key modifiers we will just bail out,
		     * thus preserving the possibility of normal focus traversal.
		     */GDK_SHIFT_MASK)) {
			return 0;
		} 
		Object generatedDialog = this.getDialog();
		if (event.getKeyval() == /* the Escape key synthesizes a cancellation action */GDK_Escape) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gtk_widget_hide(generatedDialog);
			return 1/* It would be delightful if it where possible to do search history
			     * operations on the K_UP and K_DOWN keys here.
			     */;
		} 
		return 0;
	}
	public void find_replace_keypress(int w, Object event) {
		 keysym = new ();
		if (frdp == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		keysym = /*Error: Function owner not recognized*/XLookupKeysym(event, 0);
		Object generatedDialog = this.getDialog();
		if (keysym == /* the scape key pops the whole dialog down */XK_Escape) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/XtUnmanageChild(generatedDialog);
		} 
	}
	public Object getDialog() {
		return dialog;
	}
	public void setDialog(Object newDialog) {
		dialog = newDialog;
	}
	public Object getWword() {
		return wword;
	}
	public void setWword(Object newWword) {
		wword = newWword;
	}
	public Object getMcase() {
		return mcase;
	}
	public void setMcase(Object newMcase) {
		mcase = newMcase;
	}
	public Object getUp() {
		return up;
	}
	public void setUp(Object newUp) {
		up = newUp;
	}
	public Object getDown() {
		return down;
	}
	public void setDown(Object newDown) {
		down = newDown;
	}
	public Object getWhat() {
		return what;
	}
	public void setWhat(Object newWhat) {
		what = newWhat;
	}
	public Object getWith() {
		return with;
	}
	public void setWith(Object newWith) {
		with = newWith;
	}
	public Object getFind() {
		return find;
	}
	public void setFind(Object newFind) {
		find = newFind;
	}
	public Object getReplace() {
		return replace;
	}
	public void setReplace(Object newReplace) {
		replace = newReplace;
	}
	public Object getAll() {
		return all;
	}
	public void setAll(Object newAll) {
		all = newAll;
	}
}
