package application;

public class lval_S {
	private Object ll_name;
	private Object ll_exp_name;
	private  ll_tv;
	private listitem_S ll_li;
	private listvar_S ll_list;
	private int ll_range;
	private long ll_n1;
	private long ll_n2;
	private int ll_empty2;
	private dictvar_S ll_dict;
	private dictitem_S ll_di;
	private Object ll_newkey;
	private blobvar_S ll_blob;
	
	public lval_S(Object ll_name, Object ll_exp_name,  ll_tv, listitem_S ll_li, listvar_S ll_list, int ll_range, long ll_n1, long ll_n2, int ll_empty2, dictvar_S ll_dict, dictitem_S ll_di, Object ll_newkey, blobvar_S ll_blob) {
		setLl_name(ll_name);
		setLl_exp_name(ll_exp_name);
		setLl_tv(ll_tv);
		setLl_li(ll_li);
		setLl_list(ll_list);
		setLl_range(ll_range);
		setLl_n1(ll_n1);
		setLl_n2(ll_n2);
		setLl_empty2(ll_empty2);
		setLl_dict(ll_dict);
		setLl_di(ll_di);
		setLl_newkey(ll_newkey);
		setLl_blob(ll_blob);
	}
	public lval_S() {
	}
	
	public void clear_lval() {
		Object generatedLl_exp_name = this.getLl_exp_name();
		ModernizedCProgram.vim_free(generatedLl_exp_name);
		Object generatedLl_newkey = this.getLl_newkey();
		ModernizedCProgram.vim_free(generatedLl_newkey);
	}
	public int do_unlet_var(Object name_end, int forceit) {
		int ret = 1;
		int cc;
		 generatedLl_tv = this.getLl_tv();
		Object generatedLl_name = this.getLl_name();
		listvar_S generatedLl_list = this.getLl_list();
		byte generatedLv_lock = generatedLl_list.getLv_lock();
		dictvar_S generatedLl_dict = this.getLl_dict();
		byte generatedDv_lock = generatedLl_dict.getDv_lock();
		int generatedLl_range = this.getLl_range();
		listitem_S generatedLl_li = this.getLl_li();
		long generatedLl_n1 = this.getLl_n1();
		int generatedLl_empty2 = this.getLl_empty2();
		long generatedLl_n2 = this.getLl_n2();
		listitem_S generatedLi_next = ll_li.getLi_next();
		 generatedLi_tv = ll_li.getLi_tv();
		Object generatedV_lock = generatedLi_tv.getV_lock();
		dictitem_S generatedLl_di = this.getLl_di();
		if (generatedLl_tv == ((Object)0)) {
			cc = name_end;
			name_end = (byte)'\000';
			if (ModernizedCProgram.do_unlet(generatedLl_name, forceit) == 0) {
				ret = 0;
			} 
			name_end = cc;
		}  else if ((generatedLl_list != ((Object)0) && ModernizedCProgram.var_check_lock(generatedLv_lock, generatedLl_name, 0)) || (generatedLl_dict != ((Object)0) && ModernizedCProgram.var_check_lock(generatedDv_lock, generatedLl_name, 0))) {
			return 0;
		}  else if (generatedLl_range) {
			listitem_T li = new listitem_T();
			listitem_T ll_li = generatedLl_li;
			int ll_n1 = generatedLl_n1;
			while (ll_li != ((Object)0) && (generatedLl_empty2 || generatedLl_n2 >= ll_n1)) {
				li = generatedLi_next;
				if (ModernizedCProgram.var_check_lock(generatedV_lock, generatedLl_name, 0)) {
					return 0;
				} 
				ll_li = li;
				++ll_n1;
			}
			while (generatedLl_li != ((Object)0) && (generatedLl_empty2 || generatedLl_n2 >= generatedLl_n1)) {
				li = generatedLi_next;
				ModernizedCProgram.listitem_remove(generatedLl_list, generatedLl_li);
				this.setLl_li(li);
				++generatedLl_n1;
			}
		} else {
				if (generatedLl_list != ((Object)0)) {
					ModernizedCProgram.listitem_remove(generatedLl_list, generatedLl_li);
				} else {
						ModernizedCProgram.dictitem_remove(generatedLl_dict, generatedLl_di);
				} 
		} 
		return ret/*
		 * "unlet" a variable.  Return OK if it existed, FAIL if not.
		 * When "forceit" is TRUE don't complain if the variable doesn't exist.
		 */;
	}
	public int do_lock_var(Object name_end, int deep, int lock) {
		int ret = 1;
		int cc;
		dictitem_T di = new dictitem_T();
		// nothing to doif (deep == 0) {
			return 1;
		} 
		 generatedLl_tv = this.getLl_tv();
		Object generatedLl_name = this.getLl_name();
		dictitem_S dictitem_S = new dictitem_S();
		Object generatedDi_flags = di.getDi_flags();
		 generatedDi_tv = di.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		int generatedLl_range = this.getLl_range();
		listitem_S generatedLl_li = this.getLl_li();
		int generatedLl_empty2 = this.getLl_empty2();
		long generatedLl_n2 = this.getLl_n2();
		long generatedLl_n1 = this.getLl_n1();
		 generatedLi_tv = li.getLi_tv();
		listitem_S generatedLi_next = li.getLi_next();
		listvar_S generatedLl_list = this.getLl_list();
		if (generatedLl_tv == ((Object)0)) {
			cc = name_end;
			name_end = (byte)'\000';
			di = dictitem_S.find_var(generatedLl_name, ((Object)0), 1);
			if (di == ((Object)0)) {
				ret = 0;
			}  else if ((generatedDi_flags & 4) && generatedV_type != .VAR_DICT && generatedV_type != .VAR_LIST) {
				ModernizedCProgram.semsg(((byte)("E940: Cannot lock or unlock variable %s")), generatedLl_name);
			} else {
					if (lock) {
						generatedDi_flags |=  8;
					} else {
							generatedDi_flags &=  ~8;
					} 
					generatedDi_tv.item_lock(deep, lock);
			} 
			name_end = cc;
		}  else if (generatedLl_range) {
			listitem_T li = generatedLl_li;
			while (li != ((Object)0) && (generatedLl_empty2 || generatedLl_n2 >= generatedLl_n1)) {
				generatedLi_tv.item_lock(deep, lock);
				li = generatedLi_next;
				++generatedLl_n1;
			}
		}  else if (generatedLl_list != ((Object)0)) {
			generatedLi_tv.item_lock(deep, lock);
		} else {
				generatedDi_tv.item_lock(deep, lock);
		} 
		return ret/*
		 * Lock or unlock an item.  "deep" is nr of levels to go.
		 */;
	}
	public Object getLl_name() {
		return ll_name;
	}
	public void setLl_name(Object newLl_name) {
		ll_name = newLl_name;
	}
	public Object getLl_exp_name() {
		return ll_exp_name;
	}
	public void setLl_exp_name(Object newLl_exp_name) {
		ll_exp_name = newLl_exp_name;
	}
	public  getLl_tv() {
		return ll_tv;
	}
	public void setLl_tv( newLl_tv) {
		ll_tv = newLl_tv;
	}
	public listitem_S getLl_li() {
		return ll_li;
	}
	public void setLl_li(listitem_S newLl_li) {
		ll_li = newLl_li;
	}
	public listvar_S getLl_list() {
		return ll_list;
	}
	public void setLl_list(listvar_S newLl_list) {
		ll_list = newLl_list;
	}
	public int getLl_range() {
		return ll_range;
	}
	public void setLl_range(int newLl_range) {
		ll_range = newLl_range;
	}
	public long getLl_n1() {
		return ll_n1;
	}
	public void setLl_n1(long newLl_n1) {
		ll_n1 = newLl_n1;
	}
	public long getLl_n2() {
		return ll_n2;
	}
	public void setLl_n2(long newLl_n2) {
		ll_n2 = newLl_n2;
	}
	public int getLl_empty2() {
		return ll_empty2;
	}
	public void setLl_empty2(int newLl_empty2) {
		ll_empty2 = newLl_empty2;
	}
	public dictvar_S getLl_dict() {
		return ll_dict;
	}
	public void setLl_dict(dictvar_S newLl_dict) {
		ll_dict = newLl_dict;
	}
	public dictitem_S getLl_di() {
		return ll_di;
	}
	public void setLl_di(dictitem_S newLl_di) {
		ll_di = newLl_di;
	}
	public Object getLl_newkey() {
		return ll_newkey;
	}
	public void setLl_newkey(Object newLl_newkey) {
		ll_newkey = newLl_newkey;
	}
	public blobvar_S getLl_blob() {
		return ll_blob;
	}
	public void setLl_blob(blobvar_S newLl_blob) {
		ll_blob = newLl_blob;
	}
}
