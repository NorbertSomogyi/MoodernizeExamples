package application;

public class dictitem_S {
	private  di_tv;
	private Object di_flags;
	private Object di_key;
	
	public dictitem_S( di_tv, Object di_flags, Object di_key) {
		setDi_tv(di_tv);
		setDi_flags(di_flags);
		setDi_key(di_key);
	}
	public dictitem_S() {
	}
	
	public dictitem_S dictitem_alloc(Object key) {
		dictitem_T di = new dictitem_T();
		di = ModernizedCProgram.alloc(((size_t)((dictitem_T)0).getDi_key()) + .strlen((byte)(key)) + 1);
		Object generatedDi_key = di.getDi_key();
		 generatedDi_tv = di.getDi_tv();
		if (di != ((Object)0)) {
			.strcpy((byte)(generatedDi_key), (byte)(key));
			di.setDi_flags(16);
			generatedDi_tv.setV_lock(0);
		} 
		return di/*
		 * Make a copy of a Dictionary item.
		 */;
	}
	public dictitem_S dictitem_copy() {
		dictitem_T di = new dictitem_T();
		Object generatedDi_key = this.getDi_key();
		di = ModernizedCProgram.alloc(((size_t)((dictitem_T)0).getDi_key()) + .strlen((byte)(generatedDi_key)) + 1);
		 generatedDi_tv = this.getDi_tv();
		if (di != ((Object)0)) {
			.strcpy((byte)(generatedDi_key), (byte)(generatedDi_key));
			di.setDi_flags(16);
			generatedDi_tv.copy_tv(generatedDi_tv);
		} 
		return di/*
		 * Remove item "item" from Dictionary "dict" and free it.
		 */;
	}
	public void dictitem_free() {
		 generatedDi_tv = this.getDi_tv();
		generatedDi_tv.clear_tv();
		Object generatedDi_flags = this.getDi_flags();
		if (generatedDi_flags & 16) {
			ModernizedCProgram.vim_free(item/*
			 * Make a copy of dict "d".  Shallow if "deep" is FALSE.
			 * The refcount of the new dict is set to 1.
			 * See item_copy() for "copyID".
			 * Returns NULL when out of memory.
			 */);
		} 
	}
	public dictitem_S dict_find(dictvar_S d, Object key, int len) {
		char_u[] buf = new char_u();
		char_u akey = new char_u();
		char_u tofree = ((Object)0);
		hashitem_T hi = new hashitem_T();
		if (d == ((Object)0)) {
			return ((Object)0);
		} 
		if (len < 0) {
			akey = key;
		}  else if (len >= 200) {
			tofree = akey = ModernizedCProgram.vim_strnsave(key, len);
			if (akey == ((Object)0)) {
				return ((Object)0);
			} 
		} else {
				ModernizedCProgram.vim_strncpy(buf, key, /* Avoid a malloc/free by using buf[]. */len);
				akey = buf;
		} 
		hashtable_S generatedDv_hashtab = d.getDv_hashtab();
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_find(generatedDv_hashtab, akey);
		ModernizedCProgram.vim_free(tofree);
		Object generatedHi_key = (hi).getHi_key();
		if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			return ((Object)0);
		} 
		return ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key())));
	}
	/*
	 * Return the dictitem that an entry in a hashtable points to.
	 */
	public dictitem_S dict_lookup(hashitem_S hi) {
		Object generatedHi_key = (hi).getHi_key();
		return ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key())));
	}
	public dictitem_S get_funccal_local_var() {
		if (ModernizedCProgram.current_funccal == ((Object)0)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.get_funccal().getL_vars_var();
	}
	public dictitem_S get_funccal_args_var() {
		if (ModernizedCProgram.current_funccal == ((Object)0)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.get_funccal().getL_avars_var();
	}
	public dictitem_S find_var_in_scoped_ht(Object name, int no_autoload) {
		dictitem_T v = ((Object)0);
		funccall_T old_current_funccal = ModernizedCProgram.current_funccal;
		hashtab_T ht = new hashtab_T();
		char_u varname = new char_u();
		if (ModernizedCProgram.current_funccal == ((Object)0) || ModernizedCProgram.current_funccal.getFunc().getUf_scoped() == ((Object)0)) {
			return ((Object)0);
		} 
		ModernizedCProgram.current_funccal = ModernizedCProgram.current_funccal.getFunc().getUf_scoped();
		hashtable_S hashtable_S = new hashtable_S();
		dictitem_S dictitem_S = new dictitem_S();
		while (ModernizedCProgram.current_funccal) {
			ht = hashtable_S.find_var_ht(name, varname);
			if (ht != ((Object)0) && varname != (byte)'\000') {
				v = dictitem_S.find_var_in_ht(ht, name, varname, no_autoload);
				if (v != ((Object)0)) {
					break;
				} 
			} 
			if (ModernizedCProgram.current_funccal == ModernizedCProgram.current_funccal.getFunc().getUf_scoped()) {
				break;
			} 
			ModernizedCProgram.current_funccal = ModernizedCProgram.current_funccal.getFunc().getUf_scoped();
		}
		ModernizedCProgram.current_funccal = old_current_funccal;
		return v/*
		 * Set "copyID + 1" in previous_funccal and callers.
		 */;
	}
	public dictitem_S find_var(Object name, hashtable_S htp, int no_autoload) {
		char_u varname = new char_u();
		hashtab_T ht = new hashtab_T();
		dictitem_T ret = ((Object)0);
		hashtable_S hashtable_S = new hashtable_S();
		ht = hashtable_S.find_var_ht(name, varname);
		if (htp != ((Object)0)) {
			htp = ht;
		} 
		if (ht == ((Object)0)) {
			return ((Object)0);
		} 
		dictitem_S dictitem_S = new dictitem_S();
		ret = dictitem_S.find_var_in_ht(ht, name, varname, no_autoload || htp != ((Object)0));
		if (ret != ((Object)0)) {
			return ret;
		} 
		dictitem_S dictitem_S = new dictitem_S();
		// Search in parent scope for lambdareturn dictitem_S.find_var_in_scoped_ht(name, no_autoload || htp != ((Object)0/*
		 * Find variable "varname" in hashtab "ht" with name "htname".
		 * Returns NULL if not found.
		 */));
	}
	public dictitem_S find_var_in_ht(hashtable_S ht, int htname, Object varname, int no_autoload) {
		hashitem_T hi = new hashitem_T();
		Object generatedSc_sid = current_sctx.getSc_sid();
		Object generatedB_bufvar = curbuf.getB_bufvar();
		dictitem_S dictitem_S = new dictitem_S();
		dictitem_S dictitem_S = new dictitem_S();
		if (varname == (byte)'\000') {
			switch (htname) {
			case (byte)'g':
					return ModernizedCProgram.globvars_var;
			case (byte)'t':
					return ModernizedCProgram.curtab.getTp_winvar();
			case (byte)'s':
					return (((scriptvar_T)ModernizedCProgram.ga_scripts.getGa_data())[(generatedSc_sid) - 1]).getSv_var();
			case (byte)'l':
					return dictitem_S.get_funccal_local_var();
			case (byte)'a':
					return dictitem_S.get_funccal_args_var();
			case (byte)'b':
					return generatedB_bufvar;
			case (byte)'v':
					return ModernizedCProgram.vimvars_var;
			case (byte)'w':
					return ModernizedCProgram.curwin.getW_winvar();
			}
			return ((Object)0);
		} 
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_find(ht, varname);
		Object generatedHi_key = (hi).getHi_key();
		if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			if (ht == ModernizedCProgram.globvardict.getDv_hashtab() && !no_autoload) {
				if (!ModernizedCProgram.script_autoload(varname, 0) || ModernizedCProgram.aborting()) {
					return ((Object)0);
				} 
				hi = hashitem_S.hash_find(ht, varname);
			} 
			if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				return ((Object)0);
			} 
		} 
		// For global variables we may try auto-loading the script.  If it// worked find the variable again.  Don't auto-load a script if it was
		return ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key())));
	}
	public void list_one_var(Byte prefix, Integer first) {
		char_u tofree = new char_u();
		char_u s = new char_u();
		char_u[] numbuf = new char_u();
		 generatedDi_tv = this.getDi_tv();
		s = generatedDi_tv.echo_string(tofree, numbuf, ModernizedCProgram.get_copyID());
		Object generatedDi_key = this.getDi_key();
		Object generatedV_type = generatedDi_tv.getV_type();
		ModernizedCProgram.list_one_var_a(prefix, generatedDi_key, generatedV_type, s == ((Object)0) ? (char_u)"" : s, first);
		ModernizedCProgram.vim_free(tofree);
	}
	public  getDi_tv() {
		return di_tv;
	}
	public void setDi_tv( newDi_tv) {
		di_tv = newDi_tv;
	}
	public Object getDi_flags() {
		return di_flags;
	}
	public void setDi_flags(Object newDi_flags) {
		di_flags = newDi_flags;
	}
	public Object getDi_key() {
		return di_key;
	}
	public void setDi_key(Object newDi_key) {
		di_key = newDi_key;
	}
}
/*
 * A dictitem with a 16 character key (plus NUL).  This is an efficient way to
 * have a fixed-size dictitem.
 */
