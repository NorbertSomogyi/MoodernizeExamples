package application;

public class partial_S {
	private int pt_refcount;
	private Object pt_name;
	private  pt_func;
	private int pt_auto;
	private int pt_argc;
	private [] pt_argv;
	private dictvar_S pt_dict;
	
	public partial_S(int pt_refcount, Object pt_name,  pt_func, int pt_auto, int pt_argc, [] pt_argv, dictvar_S pt_dict) {
		setPt_refcount(pt_refcount);
		setPt_name(pt_name);
		setPt_func(pt_func);
		setPt_auto(pt_auto);
		setPt_argc(pt_argc);
		setPt_argv(pt_argv);
		setPt_dict(pt_dict);
	}
	public partial_S() {
	}
	
	public Object partial_name() {
		Object generatedPt_name = this.getPt_name();
		if (generatedPt_name != ((Object)0)) {
			return generatedPt_name;
		} 
		 generatedPt_func = this.getPt_func();
		Object generatedUf_name = generatedPt_func.getUf_name();
		return generatedUf_name;
	}
	public void partial_free() {
		int i;
		int generatedPt_argc = this.getPt_argc();
		[] generatedPt_argv = this.getPt_argv();
		for (i = 0; i < generatedPt_argc; ++i) {
			generatedPt_argv[i].clear_tv();
		}
		ModernizedCProgram.vim_free(generatedPt_argv);
		dictvar_S generatedPt_dict = this.getPt_dict();
		generatedPt_dict.dict_unref();
		Object generatedPt_name = this.getPt_name();
		 generatedPt_func = this.getPt_func();
		if (generatedPt_name != ((Object)0)) {
			ModernizedCProgram.func_unref(generatedPt_name);
			ModernizedCProgram.vim_free(generatedPt_name);
		} else {
				generatedPt_func.func_ptr_unref();
		} 
		ModernizedCProgram.vim_free(pt/*
		 * Unreference a closure: decrement the reference count and free it when it
		 * becomes zero.
		 */);
	}
	public void partial_unref() {
		int generatedPt_refcount = this.getPt_refcount();
		if (pt != ((Object)0) && --generatedPt_refcount <= 0) {
			pt.partial_free();
		} 
	}
	public Object deref_func_name(Object[] name, Integer lenp, int no_autoload) {
		dictitem_T v = new dictitem_T();
		int cc;
		char_u s = new char_u();
		if (partialp != ((Object)0)) {
			partialp = ((Object)0);
		} 
		cc = name[lenp];
		name[lenp] = (byte)'\000';
		dictitem_S dictitem_S = new dictitem_S();
		v = dictitem_S.find_var(name, ((Object)0), no_autoload);
		name[lenp] = cc;
		 generatedDi_tv = v.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		Object generatedVval = generatedDi_tv.getVval();
		if (v != ((Object)0) && generatedV_type == .VAR_FUNC) {
			if (generatedVval.getV_string() == ((Object)0)) {
				lenp = 0;
				return (char_u)/* just in case */"";
			} 
			s = generatedVval.getV_string();
			lenp = (int)/*Error: Function owner not recognized*/strlen((byte)(s));
			return s;
		} 
		if (v != ((Object)0) && generatedV_type == .VAR_PARTIAL) {
			partial_T pt = generatedVval.getV_partial();
			if (pt == ((Object)0)) {
				lenp = 0;
				return (char_u)/* just in case */"";
			} 
			if (partialp != ((Object)0)) {
				partialp = pt;
			} 
			s = pt.partial_name();
			lenp = (int)/*Error: Function owner not recognized*/strlen((byte)(s));
			return s;
		} 
		return name/*
		 * Give an error message with a function name.  Handle <SNR> things.
		 * "ermsg" is to be passed without translation, use N_() instead of _().
		 */;
	}
	public int getPt_refcount() {
		return pt_refcount;
	}
	public void setPt_refcount(int newPt_refcount) {
		pt_refcount = newPt_refcount;
	}
	public Object getPt_name() {
		return pt_name;
	}
	public void setPt_name(Object newPt_name) {
		pt_name = newPt_name;
	}
	public  getPt_func() {
		return pt_func;
	}
	public void setPt_func( newPt_func) {
		pt_func = newPt_func;
	}
	public int getPt_auto() {
		return pt_auto;
	}
	public void setPt_auto(int newPt_auto) {
		pt_auto = newPt_auto;
	}
	public int getPt_argc() {
		return pt_argc;
	}
	public void setPt_argc(int newPt_argc) {
		pt_argc = newPt_argc;
	}
	public [] getPt_argv() {
		return pt_argv;
	}
	public void setPt_argv([] newPt_argv) {
		pt_argv = newPt_argv;
	}
	public dictvar_S getPt_dict() {
		return pt_dict;
	}
	public void setPt_dict(dictvar_S newPt_dict) {
		pt_dict = newPt_dict;
	}
}
