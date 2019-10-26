package application;

// "di_flags" value: separately allocated
/*
 * Structure to hold info about a Dictionary.
 */
public class dictvar_S {
	private byte dv_lock;
	private byte dv_scope;
	private int dv_refcount;
	private int dv_copyID;
	private hashtable_S dv_hashtab;
	private dictvar_S dv_copydict;
	private dictvar_S dv_used_next;
	private dictvar_S dv_used_prev;
	
	public dictvar_S(byte dv_lock, byte dv_scope, int dv_refcount, int dv_copyID, hashtable_S dv_hashtab, dictvar_S dv_copydict, dictvar_S dv_used_next, dictvar_S dv_used_prev) {
		setDv_lock(dv_lock);
		setDv_scope(dv_scope);
		setDv_refcount(dv_refcount);
		setDv_copyID(dv_copyID);
		setDv_hashtab(dv_hashtab);
		setDv_copydict(dv_copydict);
		setDv_used_next(dv_used_next);
		setDv_used_prev(dv_used_prev);
	}
	public dictvar_S() {
	}
	
	public dictvar_S ins_compl_dict_alloc(compl_S match) {
		dictvar_S dictvar_S = new dictvar_S();
		dict_T dict = dictvar_S.dict_alloc_lock(2);
		Object generatedCp_str = match.getCp_str();
		Object generatedCp_text = match.getCp_text();
		if (dict != ((Object)0)) {
			dict.dict_add_string("word", generatedCp_str);
			dict.dict_add_string("abbr", generatedCp_text[0]);
			dict.dict_add_string("menu", generatedCp_text[1]);
			dict.dict_add_string("kind", generatedCp_text[2]);
			dict.dict_add_string("info", generatedCp_text[3]);
			dict.dict_add_string("user_data", generatedCp_text[4]);
		} 
		return dict;
	}
	public void ins_compl_add_dict() {
		dictitem_T di_refresh = new dictitem_T();
		dictitem_T di_words = new dictitem_T();
		// Check for optional "refresh" item.// Check for optional "refresh" item.ModernizedCProgram.compl_opt_refresh_always = 0;
		dictitem_S dictitem_S = new dictitem_S();
		di_refresh = dictitem_S.dict_find(dict, (char_u)"refresh", 7);
		 generatedDi_tv = di_refresh.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		Object generatedVval = generatedDi_tv.getVval();
		if (di_refresh != ((Object)0) && generatedV_type == .VAR_STRING) {
			char_u v = generatedVval.getV_string();
			if (v != ((Object)0) && .strcmp((byte)(v), (byte)((char_u)"always")) == 0) {
				ModernizedCProgram.compl_opt_refresh_always = 1;
			} 
		} 
		// Add completions from a "words" list.// Add completions from a "words" list.di_words = dictitem_S.dict_find(dict, (char_u)"words", 5);
		if (di_words != ((Object)0) && generatedV_type == .VAR_LIST) {
			generatedVval.getV_list().ins_compl_add_list();
		} 
	}
	public dictvar_S dict_alloc() {
		dict_T d = new dict_T();
		d = (dict_T)ModernizedCProgram.alloc_clear();
		hashtable_S generatedDv_hashtab = d.getDv_hashtab();
		if (d != ((Object)0)) {
			if (ModernizedCProgram.first_dict != ((Object)/* Add the dict to the list of dicts for garbage collection. */0)) {
				ModernizedCProgram.first_dict.setDv_used_prev(d);
			} 
			d.setDv_used_next(ModernizedCProgram.first_dict);
			d.setDv_used_prev(((Object)0));
			ModernizedCProgram.first_dict = d;
			generatedDv_hashtab.hash_init();
			d.setDv_lock(0);
			d.setDv_scope(0);
			d.setDv_refcount(0);
			d.setDv_copyID(0);
		} 
		return d/*
		 * dict_alloc() with an ID for alloc_fail().
		 */;
	}
	public dictvar_S dict_alloc_id( id) {
		if (alloc_fail_id == id && ModernizedCProgram.alloc_does_fail()) {
			return ((Object)0);
		} 
		dictvar_S dictvar_S = new dictvar_S();
		return (dictvar_S.dict_alloc());
	}
	public dictvar_S dict_alloc_lock(int lock) {
		dictvar_S dictvar_S = new dictvar_S();
		dict_T d = dictvar_S.dict_alloc();
		if (d != ((Object)0)) {
			d.setDv_lock(lock);
		} 
		return d/*
		 * Allocate an empty dict for a return value.
		 * Returns OK or FAIL.
		 */;
	}
	public void dict_free_contents() {
		int todo;
		hashitem_T hi = new hashitem_T();
		dictitem_T di = new dictitem_T();
		hashtable_S generatedDv_hashtab = this.getDv_hashtab();
		generatedDv_hashtab.hash_lock();
		Object generatedHt_used = generatedDv_hashtab.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		hashitem_S generatedHt_array = generatedDv_hashtab.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				di = ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key())));
				ModernizedCProgram.hash_remove(generatedDv_hashtab, hi);
				di.dictitem_free();
				--todo;
			} 
		}
		generatedDv_hashtab.hash_clear();
	}
	public void dict_free_dict() {
		dictvar_S generatedDv_used_prev = this.getDv_used_prev();
		dictvar_S generatedDv_used_next = this.getDv_used_next();
		if (generatedDv_used_prev == ((Object)/* Remove the dict from the list of dicts for garbage collection. */0)) {
			ModernizedCProgram.first_dict = generatedDv_used_next;
		} else {
				generatedDv_used_prev.setDv_used_next(generatedDv_used_next);
		} 
		if (generatedDv_used_next != ((Object)0)) {
			generatedDv_used_next.setDv_used_prev(generatedDv_used_prev);
		} 
		ModernizedCProgram.vim_free(d);
	}
	public void dict_free() {
		if (!in_free_unref_items) {
			d.dict_free_contents();
			d/*
			 * Unreference a Dictionary: decrement the reference count and free it when it
			 * becomes zero.
			 */.dict_free_dict();
		} 
	}
	public void dict_unref() {
		int generatedDv_refcount = this.getDv_refcount();
		if (d != ((Object)0) && --generatedDv_refcount <= 0) {
			d/*
			 * Go through the list of dicts and free items without the copyID.
			 * Returns TRUE if something was freed.
			 */.dict_free();
		} 
	}
	public dictvar_S dict_copy(int deep, int copyID) {
		dict_T copy = new dict_T();
		dictitem_T di = new dictitem_T();
		int todo;
		hashitem_T hi = new hashitem_T();
		if (orig == ((Object)0)) {
			return ((Object)0);
		} 
		dictvar_S dictvar_S = new dictvar_S();
		copy = dictvar_S.dict_alloc();
		hashtable_S generatedDv_hashtab = this.getDv_hashtab();
		Object generatedHt_used = generatedDv_hashtab.getHt_used();
		Object generatedHi_key = (hi).getHi_key();
		dictitem_S dictitem_S = new dictitem_S();
		 generatedDi_tv = di.getDi_tv();
		hashitem_S generatedHt_array = generatedDv_hashtab.getHt_array();
		int generatedDv_refcount = copy.getDv_refcount();
		if (copy != ((Object)0)) {
			if (copyID != 0) {
				this.setDv_copyID(copyID);
				this.setDv_copydict(copy);
			} 
			todo = (int)generatedHt_used;
			for (hi = generatedHt_array; todo > 0 && !got_int; ++hi) {
				if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
					--todo;
					di = dictitem_S.dictitem_alloc(generatedHi_key);
					if (di == ((Object)0)) {
						break;
					} 
					if (deep) {
						if (((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key()))).getDi_tv().item_copy(generatedDi_tv, deep, copyID) == 0) {
							ModernizedCProgram.vim_free(di);
							break;
						} 
					} else {
							generatedDi_tv.copy_tv(generatedDi_tv);
					} 
					if (ModernizedCProgram.dict_add(copy, di) == 0) {
						di.dictitem_free();
						break;
					} 
				} 
			}
			++generatedDv_refcount;
			if (todo > 0) {
				copy.dict_unref();
				copy = ((Object)0);
			} 
		} 
		return copy/*
		 * Add item "item" to Dictionary "d".
		 * Returns FAIL when out of memory and when key already exists.
		 */;
	}
	public int dict_add_number_special(Byte key, Object nr, int special) {
		dictitem_T item = new dictitem_T();
		dictitem_S dictitem_S = new dictitem_S();
		item = dictitem_S.dictitem_alloc((char_u)key);
		if (item == ((Object)0)) {
			return 0;
		} 
		 generatedDi_tv = item.getDi_tv();
		generatedDi_tv.setV_type(special ? .VAR_SPECIAL : .VAR_NUMBER);
		Object generatedVval = generatedDi_tv.getVval();
		generatedVval.setV_number(nr);
		if (ModernizedCProgram.dict_add(d, item) == 0) {
			item.dictitem_free();
			return 0;
		} 
		return 1/*
		 * Add a number entry to dictionary "d".
		 * Returns FAIL when out of memory and when key already exists.
		 */;
	}
	public int dict_add_number(Byte key, Object nr) {
		return d.dict_add_number_special(key, nr, 0/*
		 * Add a special entry to dictionary "d".
		 * Returns FAIL when out of memory and when key already exists.
		 */);
	}
	public int dict_add_special(Byte key, Object nr) {
		return d.dict_add_number_special(key, nr, 1/*
		 * Add a string entry to dictionary "d".
		 * Returns FAIL when out of memory and when key already exists.
		 */);
	}
	public int dict_add_string(Byte key, Object str) {
		return d.dict_add_string_len(key, str, -1/*
		 * Add a string entry to dictionary "d".
		 * "str" will be copied to allocated memory.
		 * When "len" is -1 use the whole string, otherwise only this many bytes.
		 * Returns FAIL when out of memory and when key already exists.
		 */);
	}
	public int dict_add_string_len(Byte key, Object str, int len) {
		dictitem_T item = new dictitem_T();
		char_u val = ((Object)0);
		dictitem_S dictitem_S = new dictitem_S();
		item = dictitem_S.dictitem_alloc((char_u)key);
		if (item == ((Object)0)) {
			return 0;
		} 
		 generatedDi_tv = item.getDi_tv();
		generatedDi_tv.setV_type(.VAR_STRING);
		if (str != ((Object)0)) {
			if (len == -1) {
				val = ModernizedCProgram.vim_strsave(str);
			} else {
					val = ModernizedCProgram.vim_strnsave(str, len);
			} 
		} 
		Object generatedVval = generatedDi_tv.getVval();
		generatedVval.setV_string(val);
		if (ModernizedCProgram.dict_add(d, item) == 0) {
			item.dictitem_free();
			return 0;
		} 
		return 1/*
		 * Add a list entry to dictionary "d".
		 * Returns FAIL when out of memory and when key already exists.
		 */;
	}
	public int dict_add_dict(Byte key, dictvar_S dict) {
		dictitem_T item = new dictitem_T();
		dictitem_S dictitem_S = new dictitem_S();
		item = dictitem_S.dictitem_alloc((char_u)key);
		if (item == ((Object)0)) {
			return 0;
		} 
		 generatedDi_tv = item.getDi_tv();
		generatedDi_tv.setV_type(.VAR_DICT);
		Object generatedVval = generatedDi_tv.getVval();
		generatedVval.setV_dict(dict);
		int generatedDv_refcount = dict.getDv_refcount();
		++generatedDv_refcount;
		if (ModernizedCProgram.dict_add(d, item) == 0) {
			item.dictitem_free();
			return 0;
		} 
		return 1/*
		 * Get the number of items in a Dictionary.
		 */;
	}
	public long dict_len() {
		if (d == ((Object)0)) {
			return -1024;
		} 
		hashtable_S generatedDv_hashtab = this.getDv_hashtab();
		Object generatedHt_used = generatedDv_hashtab.getHt_used();
		return (long)generatedHt_used;
	}
	public Object dict_get_string(Object key, int save) {
		dictitem_T di = new dictitem_T();
		char_u s = new char_u();
		dictitem_S dictitem_S = new dictitem_S();
		di = dictitem_S.dict_find(d, key, -1);
		if (di == ((Object)0)) {
			return ((Object)0);
		} 
		 generatedDi_tv = di.getDi_tv();
		s = generatedDi_tv.tv_get_string();
		if (save && s != ((Object)0)) {
			s = ModernizedCProgram.vim_strsave(s);
		} 
		return s/*
		 * Get a number item from a dictionary.
		 * Returns 0 if the entry doesn't exist.
		 */;
	}
	public Object dict_get_number(Object key) {
		return d.dict_get_number_def(key, 0/*
		 * Get a number item from a dictionary.
		 * Returns "def" if the entry doesn't exist.
		 */);
	}
	public Object dict_get_number_def(Object key, int def) {
		dictitem_T di = new dictitem_T();
		dictitem_S dictitem_S = new dictitem_S();
		di = dictitem_S.dict_find(d, key, -1);
		if (di == ((Object)0)) {
			return def;
		} 
		 generatedDi_tv = di.getDi_tv();
		return generatedDi_tv.tv_get_number();
	}
	public Object dict_get_number_check(Object key) {
		dictitem_T di = new dictitem_T();
		dictitem_S dictitem_S = new dictitem_S();
		di = dictitem_S.dict_find(d, key, -1);
		if (di == ((Object)0)) {
			return 0;
		} 
		 generatedDi_tv = di.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		if (generatedV_type != .VAR_NUMBER) {
			ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedDi_tv.tv_get_string());
			return 0;
		} 
		return generatedDi_tv.tv_get_number();
	}
	public void dict_extend(dictvar_S d2, Object action) {
		dictitem_T di1 = new dictitem_T();
		hashitem_T hi2 = new hashitem_T();
		int todo;
		char_u arg_errmsg = (char_u)"extend() argument";
		hashtable_S generatedDv_hashtab = d2.getDv_hashtab();
		Object generatedHt_used = generatedDv_hashtab.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi2).getHi_key();
		dictitem_S dictitem_S = new dictitem_S();
		byte generatedDv_scope = this.getDv_scope();
		 generatedDi_tv = di1.getDi_tv();
		Object generatedV_lock = generatedDi_tv.getV_lock();
		Object generatedDi_flags = di1.getDi_flags();
		hashitem_S generatedHt_array = generatedDv_hashtab.getHt_array();
		for (hi2 = generatedHt_array; todo > 0; ++hi2) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				--todo;
				di1 = dictitem_S.dict_find(d1, generatedHi_key, -1);
				if (generatedDv_scope != 0) {
					if (generatedDv_scope == /* Disallow replacing a builtin function in l: and g:.
							 * Check the key to be valid when adding to any scope. */2 && ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key()))).getDi_tv().getV_type() == .VAR_FUNC && ModernizedCProgram.var_check_func_name(generatedHi_key, di1 == ((Object)0))) {
						break;
					} 
					if (!ModernizedCProgram.valid_varname(generatedHi_key)) {
						break;
					} 
				} 
				if (di1 == ((Object)0)) {
					di1 = ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key()))).dictitem_copy();
					if (di1 != ((Object)0) && ModernizedCProgram.dict_add(d1, di1) == 0) {
						di1.dictitem_free();
					} 
				}  else if (action == (byte)'e') {
					ModernizedCProgram.semsg(((byte)("E737: Key already exists: %s")), generatedHi_key);
					break;
				}  else if (action == (byte)'f' && ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key()))) != di1) {
					if (ModernizedCProgram.var_check_lock(generatedV_lock, arg_errmsg, 1) || ModernizedCProgram.var_check_ro(generatedDi_flags, arg_errmsg, 1)) {
						break;
					} 
					generatedDi_tv.clear_tv();
					generatedDi_tv.copy_tv(generatedDi_tv);
				} 
			} 
		}
	}
	public int dict_equal(dictvar_S d2, int ic, int recursive) {
		/* ignore case for strings *//* TRUE when used recursively */hashitem_T hi = new hashitem_T();
		dictitem_T item2 = new dictitem_T();
		int todo;
		if (d1 == ((Object)0) && d2 == ((Object)0)) {
			return 1;
		} 
		if (d1 == ((Object)0) || d2 == ((Object)0)) {
			return 0;
		} 
		if (d1 == d2) {
			return 1;
		} 
		if (d1.dict_len() != d2.dict_len()) {
			return 0;
		} 
		hashtable_S generatedDv_hashtab = this.getDv_hashtab();
		Object generatedHt_used = generatedDv_hashtab.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		dictitem_S dictitem_S = new dictitem_S();
		 generatedDi_tv = item2.getDi_tv();
		hashitem_S generatedHt_array = generatedDv_hashtab.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				item2 = dictitem_S.dict_find(d2, generatedHi_key, -1);
				if (item2 == ((Object)0)) {
					return 0;
				} 
				if (!((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key()))).getDi_tv().tv_equal(generatedDi_tv, ic, recursive)) {
					return 0;
				} 
				--todo;
			} 
		}
		return 1/*
		 * Turn a dict into a list:
		 * "what" == 0: list of keys
		 * "what" == 1: list of values
		 * "what" == 2: list of items
		 */;
	}
	public void dict_set_items_ro() {
		hashtable_S generatedDv_hashtab = this.getDv_hashtab();
		Object generatedHt_used = generatedDv_hashtab.getHt_used();
		int todo = (int)generatedHt_used;
		hashitem_T hi = new hashitem_T();
		Object generatedHi_key = (hi).getHi_key();
		hashitem_S generatedHt_array = generatedDv_hashtab.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++/* Set readonly */hi) {
			if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				continue;
			} 
			--todo;
			((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key()))).getDi_flags() |=  1 | 4/*
			 * "has_key()" function
			 */;
		}
	}
	public void pum_set_event_info() {
		if (!ModernizedCProgram.pum_visible()) {
			return ;
		} 
		dict.dict_add_number("height", ModernizedCProgram.pum_height);
		dict.dict_add_number("width", ModernizedCProgram.pum_width);
		dict.dict_add_number("row", ModernizedCProgram.pum_row);
		dict.dict_add_number("col", ModernizedCProgram.pum_col);
		dict.dict_add_number("size", ModernizedCProgram.pum_size);
		dict.dict_add_special("scrollbar", ModernizedCProgram.pum_scrollbar ? -1024 : -1024);
	}
	public int popup_options_one(Object key) {
		dictitem_T di = new dictitem_T();
		char_u val = new char_u();
		char_u s = new char_u();
		char_u endp = new char_u();
		int n = 0;
		dictitem_S dictitem_S = new dictitem_S();
		di = dictitem_S.dict_find(dict, key, -1);
		if (di == ((Object)0)) {
			return INT_MAX;
		} 
		 generatedDi_tv = di.getDi_tv();
		val = generatedDi_tv.tv_get_string();
		if (.strncmp((byte)(val), (byte)("cursor"), (size_t)(true)) != 0) {
			return dict.dict_get_number_check(key);
		} 
		.setcursor_mayforce(1);
		s = val + 6;
		if (s != (byte)'\000') {
			endp = s;
			if (ModernizedCProgram.skipwhite(s) == (byte)'+' || ModernizedCProgram.skipwhite(s) == (byte)'-') {
				n = .strtol((byte)s, (byte)endp, 10);
			} 
			if (endp != ((Object)0) && ModernizedCProgram.skipwhite(endp) != (byte)'\000') {
				ModernizedCProgram.semsg(((byte)(e_invexpr2)), val);
				return 0;
			} 
		} 
		if (.strcmp((byte)(key), (byte)("line")) == 0) {
			n = .screen_screenrow() + 1 + n;
		} else {
				n = .screen_screencol() + 1 + n;
		} 
		if (n < 1) {
			n = 1;
		} 
		return n;
	}
	public void set_padding_border(Integer array, Byte name, int max_val) {
		dictitem_T di = new dictitem_T();
		dictitem_S dictitem_S = new dictitem_S();
		di = dictitem_S.dict_find(dict, (char_u)name, -1);
		 generatedDi_tv = di.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		Object generatedVval = generatedDi_tv.getVval();
		int generatedLv_len = list.getLv_len();
		 generatedLi_tv = li.getLi_tv();
		if (di != ((Object)0)) {
			if (generatedV_type != .VAR_LIST) {
				ModernizedCProgram.emsg(((byte)(e_listreq)));
			} else {
					list_T list = generatedVval.getV_list();
					listitem_T li = new listitem_T();
					int i;
					int nr;
					for (i = 0; i < 4; ++i) {
						array[i] = 1;
					}
					if (list != ((Object)0)) {
						for (; i < 4 && i < generatedLv_len; ) {
							nr = (int)generatedLi_tv.tv_get_number();
							if (nr >= 0) {
								array[i] = nr > max_val ? max_val : nr;
							} 
						}
					} 
			} 
		} 
	}
	public void check_highlight(Byte name, Object pval) {
		dictitem_T di = new dictitem_T();
		char_u str = new char_u();
		dictitem_S dictitem_S = new dictitem_S();
		di = dictitem_S.dict_find(dict, (char_u)name, -1);
		 generatedDi_tv = di.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		if (di != ((Object)0)) {
			if (generatedV_type != .VAR_STRING) {
				ModernizedCProgram.semsg(((byte)(e_invargval)), name);
			} else {
					str = generatedDi_tv.tv_get_string();
					if (str != (byte)'\000') {
						pval = ModernizedCProgram.vim_strsave(str);
					} 
			} 
		} 
	}
	public void get_padding_border(Integer array, Byte name) {
		list_T list = new list_T();
		int i;
		if (array[0] == 0 && array[1] == 0 && array[2] == 0 && array[3] == 0) {
			return ;
		} 
		listvar_S listvar_S = new listvar_S();
		list = listvar_S.list_alloc();
		if (list != ((Object)0)) {
			ModernizedCProgram.dict_add_list(dict, name, list);
			if (array[0] != 1 || array[1] != 1 || array[2] != 1 || array[3] != 1) {
				for (i = 0; i < 4; ++i) {
					list.list_append_number(array[i/*
					 * For popup_getoptions(): add a "borderhighlight" entry to "dict".
					 */]);
				}
			} 
		} 
	}
	public int add_tag_field(Byte field_name, Object start, Object end) {
		/* start of the value *//* after the value; can be NULL */char_u buf = new char_u();
		int len = 0;
		int retval;
		dictitem_S dictitem_S = new dictitem_S();
		if (dictitem_S.dict_find(dict, (char_u)field_name, -1) != ((Object)/* check that the field name doesn't exist yet */0)) {
			if (ModernizedCProgram.p_verbose > 0) {
				ModernizedCProgram.verbose_enter();
				ModernizedCProgram.smsg(((byte)("Duplicate field name: %s")), field_name);
				ModernizedCProgram.verbose_leave();
			} 
			return 0;
		} 
		buf = ModernizedCProgram.alloc(1024);
		if (buf == ((Object)0)) {
			return 0;
		} 
		if (start != ((Object)0)) {
			if (end == ((Object)0)) {
				end = start + .strlen((byte)(start));
				while (end > start && (end[-1] == (byte)'\r' || end[-1] == (byte)'\n')) {
					--end;
				}
			} 
			len = (int)(end - start);
			if (len > 1024 - 1) {
				len = 1024 - 1;
			} 
			ModernizedCProgram.vim_strncpy(buf, start, len);
		} 
		buf[len] = (byte)'\000';
		retval = dict.dict_add_string(field_name, buf);
		ModernizedCProgram.vim_free(buf);
		return retval/*
		 * Add the tags matching the specified pattern "pat" to the list "list"
		 * as a dictionary. Use "buf_fname" for priority, unless NULL.
		 */;
	}
	public dictvar_S get_buffer_info(file_buffer buf) {
		dict_T dict = new dict_T();
		tabpage_T tp = new tabpage_T();
		win_T wp = new win_T();
		list_T windows = new list_T();
		dictvar_S dictvar_S = new dictvar_S();
		dict = dictvar_S.dict_alloc();
		if (dict == ((Object)0)) {
			return ((Object)0);
		} 
		int generatedB_fnum = buf.getB_fnum();
		dict.dict_add_number("bufnr", generatedB_fnum);
		Object generatedB_ffname = buf.getB_ffname();
		dict.dict_add_string("name", generatedB_ffname);
		dict.dict_add_number("lnum", buf == curbuf ? ModernizedCProgram.curwin.getW_cursor().getLnum() : buf.buflist_findlnum());
		memline generatedB_ml = buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		dict.dict_add_number("loaded", generatedMl_mfp != ((Object)0));
		int generatedB_p_bl = buf.getB_p_bl();
		dict.dict_add_number("listed", generatedB_p_bl);
		dict.dict_add_number("changed", buf.bufIsChanged());
		dictitem16_S generatedB_ct_di = (buf).getB_ct_di();
		 generatedDi_tv = generatedB_ct_di.getDi_tv();
		Object generatedVval = generatedDi_tv.getVval();
		dict.dict_add_number("changedtick", (generatedVval.getV_number()));
		int generatedB_nwindows = buf.getB_nwindows();
		dict.dict_add_number("hidden", generatedMl_mfp != ((Object)0) && generatedB_nwindows == 0);
		Object generatedB_vars = buf.getB_vars();
		// Get a reference to buffer variables// Get a reference to buffer variablesdict.dict_add_dict("variables", generatedB_vars);
		listvar_S listvar_S = new listvar_S();
		// List of windows displaying this buffer// List of windows displaying this bufferwindows = listvar_S.list_alloc();
		file_buffer generatedW_buffer = wp.getW_buffer();
		int generatedW_id = wp.getW_id();
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = (tp).getTp_next();
		if (windows != ((Object)0)) {
			for ((tp) = ModernizedCProgram.first_tabpage; (tp) != ((Object)0); (tp) = generatedTp_next) {
				for ((wp) = ((tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
					if (generatedW_buffer == buf) {
						windows.list_append_number((varnumber_T)generatedW_id);
					} 
				}
			}
			ModernizedCProgram.dict_add_list(dict, "windows", windows);
		} 
		// List of popup windows displaying this buffer// List of popup windows displaying this bufferwindows = listvar_S.list_alloc();
		Object generatedTp_first_popupwin = tp.getTp_first_popupwin();
		if (windows != ((Object)0)) {
			for (wp = first_popupwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedW_buffer == buf) {
					windows.list_append_number((varnumber_T)generatedW_id);
				} 
			}
			for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
				for (wp = generatedTp_first_popupwin; wp != ((Object)0); wp = generatedW_next) {
					if (generatedW_buffer == buf) {
						windows.list_append_number((varnumber_T)generatedW_id);
					} 
				}
			}
			ModernizedCProgram.dict_add_list(dict, "popups", windows);
		} 
		Object generatedB_signlist = buf.getB_signlist();
		if (generatedB_signlist != ((Object)0)) {
			list_T signs = listvar_S.list_alloc();
			if (signs != ((Object)0)) {
				ModernizedCProgram.get_buffer_signs(buf, signs);
				ModernizedCProgram.dict_add_list(dict, "signs", signs);
			} 
		} 
		return dict/*
		 * "getbufinfo()" function
		 */;
	}
	public int set_ref_in_dict(int copyID) {
		int generatedDv_copyID = this.getDv_copyID();
		hashtable_S generatedDv_hashtab = this.getDv_hashtab();
		if (d != ((Object)0) && generatedDv_copyID != copyID) {
			this.setDv_copyID(copyID);
			return ModernizedCProgram.set_ref_in_ht(generatedDv_hashtab, copyID, ((Object)0));
		} 
		return 0/*
		 * Mark a list and its items with "copyID".
		 * Returns TRUE if setting references failed somehow.
		 */;
	}
	/*
	 * Return information found in swapfile "fname" in dictionary "d".
	 * This is used by the swapinfo() function.
	 */
	public void get_b0_dict(Object fname) {
		int fd;
		block0 b0 = new block0();
		Object generatedB0_version = b0.getB0_version();
		Object generatedB0_uname = b0.getB0_uname();
		Object generatedB0_hname = b0.getB0_hname();
		Object generatedB0_fname = b0.getB0_fname();
		Object generatedB0_pid = b0.getB0_pid();
		Object generatedB0_mtime = b0.getB0_mtime();
		if ((fd = ModernizedCProgram.mch_open((byte)fname, 0 | 0, 0)) >= 0) {
			if (ModernizedCProgram.read_eintr(fd, b0, ) == ) {
				if (b0.ml_check_b0_id() == 0) {
					d.dict_add_string("error", (char_u)"Not a swap file");
				}  else if (b0.b0_magic_wrong()) {
					d.dict_add_string("error", (char_u)"Magic number mismatch");
				} else {
						d.dict_add_string_len("version", generatedB0_version, /* we have swap information */10);
						d.dict_add_string_len("user", generatedB0_uname, 40);
						d.dict_add_string_len("host", generatedB0_hname, 40);
						d.dict_add_string_len("fname", generatedB0_fname, 900);
						d.dict_add_number("pid", ModernizedCProgram.char_to_long(generatedB0_pid));
						d.dict_add_number("mtime", ModernizedCProgram.char_to_long(generatedB0_mtime));
						d.dict_add_number("dirty", generatedB0_fname[900 - 1] ? 1 : 0);
				} 
			} else {
					d.dict_add_string("error", (char_u)"Cannot read file");
			} 
			.close(fd);
		} else {
				d.dict_add_string("error", (char_u)"Cannot open file"/*
				 * Cache of the current timezone name as retrieved from TZ, or an empty string
				 * where unset, up to 64 octets long including trailing null byte.
				 */);
		} 
	}
	public dictvar_S get_win_info(window_S wp, int tpnr, int winnr) {
		dict_T dict = new dict_T();
		dictvar_S dictvar_S = new dictvar_S();
		dict = dictvar_S.dict_alloc();
		if (dict == ((Object)0)) {
			return ((Object)0);
		} 
		dict.dict_add_number("tabnr", tpnr);
		dict.dict_add_number("winnr", winnr);
		int generatedW_id = wp.getW_id();
		dict.dict_add_number("winid", generatedW_id);
		int generatedW_height = wp.getW_height();
		dict.dict_add_number("height", generatedW_height);
		int generatedW_winrow = wp.getW_winrow();
		dict.dict_add_number("winrow", generatedW_winrow + 1);
		Object generatedW_topline = wp.getW_topline();
		dict.dict_add_number("topline", generatedW_topline);
		Object generatedW_botline = wp.getW_botline();
		dict.dict_add_number("botline", generatedW_botline - 1);
		Object generatedW_winbar_height = wp.getW_winbar_height();
		dict.dict_add_number("winbar", generatedW_winbar_height);
		int generatedW_width = wp.getW_width();
		dict.dict_add_number("width", generatedW_width);
		int generatedW_wincol = wp.getW_wincol();
		dict.dict_add_number("wincol", generatedW_wincol + 1);
		file_buffer generatedW_buffer = wp.getW_buffer();
		int generatedB_fnum = generatedW_buffer.getB_fnum();
		dict.dict_add_number("bufnr", generatedB_fnum);
		dict.dict_add_number("quickfix", generatedW_buffer.bt_quickfix());
		Object generatedW_llist_ref = wp.getW_llist_ref();
		dict.dict_add_number("loclist", (generatedW_buffer.bt_quickfix() && generatedW_llist_ref != ((Object)0)));
		Object generatedW_vars = wp.getW_vars();
		// Add a reference to window variables// Add a reference to window variablesdict.dict_add_dict("variables", generatedW_vars);
		return dict/*
		 * Returns information (variables, options, etc.) about a tab page
		 * as a dictionary.
		 */;
	}
	public dictvar_S get_tabpage_info(tabpage_S tp, int tp_idx) {
		win_T wp = new win_T();
		dict_T dict = new dict_T();
		list_T l = new list_T();
		dictvar_S dictvar_S = new dictvar_S();
		dict = dictvar_S.dict_alloc();
		if (dict == ((Object)0)) {
			return ((Object)0);
		} 
		dict.dict_add_number("tabnr", tp_idx);
		listvar_S listvar_S = new listvar_S();
		l = listvar_S.list_alloc();
		int generatedW_id = wp.getW_id();
		window_S generatedW_next = wp.getW_next();
		window_S generatedTp_firstwin = tp.getTp_firstwin();
		if (l != ((Object)0)) {
			for (wp = (tp == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; wp != ((Object)0); wp = generatedW_next) {
				l.list_append_number((varnumber_T)generatedW_id);
			}
			ModernizedCProgram.dict_add_list(dict, "windows", l);
		} 
		Object generatedTp_vars = tp.getTp_vars();
		// Make a reference to tabpage variables// Make a reference to tabpage variablesdict.dict_add_dict("variables", generatedTp_vars);
		return dict/*
		 * "gettabinfo()" function
		 */;
	}
	public int qf_getprop_keys2flags(int loclist) {
		int flags = .QF_GETLIST_NONE;
		dictitem_S dictitem_S = new dictitem_S();
		if (dictitem_S.dict_find(what, (char_u)"all", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_ALL;
			if (!loclist) {
				flags &=  ~.QF_GETLIST_FILEWINID;
			} 
		} 
		if (dictitem_S.dict_find(what, (char_u)"title", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_TITLE;
		} 
		if (dictitem_S.dict_find(what, (char_u)"nr", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_NR;
		} 
		if (dictitem_S.dict_find(what, (char_u)"winid", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_WINID;
		} 
		if (dictitem_S.dict_find(what, (char_u)"context", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_CONTEXT;
		} 
		if (dictitem_S.dict_find(what, (char_u)"id", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_ID;
		} 
		if (dictitem_S.dict_find(what, (char_u)"items", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_ITEMS;
		} 
		if (dictitem_S.dict_find(what, (char_u)"idx", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_IDX;
		} 
		if (dictitem_S.dict_find(what, (char_u)"size", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_SIZE;
		} 
		if (dictitem_S.dict_find(what, (char_u)"changedtick", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_TICK;
		} 
		if (loclist && dictitem_S.dict_find(what, (char_u)"filewinid", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_FILEWINID;
		} 
		if (dictitem_S.dict_find(what, (char_u)"qfbufnr", -1) != ((Object)0)) {
			flags |=  .QF_GETLIST_QFBUFNR;
		} 
		return flags/*
		 * Return the quickfix list index based on 'nr' or 'id' in 'what'.
		 * If 'nr' and 'id' are not present in 'what' then return the current
		 * quickfix list index.
		 * If 'nr' is zero then return the current quickfix list index.
		 * If 'nr' is '$' then return the last quickfix list index.
		 * If 'id' is present then return the index of the quickfix list with that id.
		 * If 'id' is zero then return the quickfix list index specified by 'nr'.
		 * Return -1, if quickfix list is not present or if the stack is empty.
		 */;
	}
	/*
	 * Get window or buffer local options.
	 */
	public dictvar_S get_winbuf_options(int bufopt) {
		dict_T d = new dict_T();
		int opt_idx;
		dictvar_S dictvar_S = new dictvar_S();
		d = dictvar_S.dict_alloc();
		if (d == ((Object)0)) {
			return ((Object)0);
		} 
		 generatedIndir = opt.getIndir();
		Object generatedFlags = opt.getFlags();
		Byte generatedFullname = opt.getFullname();
		for (opt_idx = 0; !ModernizedCProgram.istermoption_idx(opt_idx); opt_idx++) {
			vimoption opt = ModernizedCProgram.options[opt_idx];
			if ((bufopt && (generatedIndir & -1024)) || (!bufopt && (generatedIndir & -1024))) {
				char_u varp = opt.get_varp();
				if (varp != ((Object)0)) {
					if (generatedFlags & -1024) {
						d.dict_add_string(generatedFullname, (char_u)varp);
					}  else if (generatedFlags & -1024) {
						d.dict_add_number(generatedFullname, (long)varp);
					} else {
							d.dict_add_number(generatedFullname, (int)varp);
					} 
				} 
			} 
		}
		return d;
	}
	public dictvar_S make_partial( rettv) {
		char_u fname = new char_u();
		char_u tofree = ((Object)0);
		ufunc_T fp = new ufunc_T();
		char_u[] fname_buf = new char_u();
		int error;
		dict_T selfdict = selfdict_in;
		Object generatedV_type = rettv.getV_type();
		Object generatedVval = rettv.getVval();
		if (generatedV_type == .VAR_PARTIAL && generatedVval.getV_partial().getPt_func() != ((Object)0)) {
			fp = generatedVval.getV_partial().getPt_func();
		} else {
				fname = generatedV_type == .VAR_FUNC ? generatedVval.getV_string() : generatedVval.getV_partial().getPt_name();
				fname = ModernizedCProgram.fname_trans_sid(fname, fname_buf, tofree, /* Translate "s:func" to the stored function name. */error);
				fp = ModernizedCProgram.find_func(fname);
				ModernizedCProgram.vim_free(tofree);
		} 
		Object generatedUf_flags = fp.getUf_flags();
		Object generatedPt_name = ret_pt.getPt_name();
		 generatedPt_func = ret_pt.getPt_func();
		int generatedPt_argc = ret_pt.getPt_argc();
		 generatedPt_argv = pt.getPt_argv();
		if (fp != ((Object)0) && (generatedUf_flags & -1024)) {
			partial_T pt = (partial_T)ModernizedCProgram.alloc_clear();
			if (pt != ((Object)0)) {
				pt.setPt_refcount(1);
				pt.setPt_dict(selfdict);
				pt.setPt_auto(1);
				selfdict = ((Object)0);
				if (generatedV_type == .VAR_FUNC) {
					pt.setPt_name(generatedVval.getV_string());
				} else {
						partial_T ret_pt = generatedVval.getV_partial();
						int i;
						if (generatedPt_name != ((Object)0)) {
							pt.setPt_name(ModernizedCProgram.vim_strsave(generatedPt_name));
							ModernizedCProgram.func_ref(generatedPt_name);
						} else {
								pt.setPt_func(generatedPt_func);
								generatedPt_func.func_ptr_ref();
						} 
						if (generatedPt_argc > 0) {
							pt.setPt_argv((typval_T)ModernizedCProgram.alloc( * (generatedPt_argc)));
							if (generatedPt_argv == ((Object)0)) {
								pt.setPt_argc(/* out of memory: drop the arguments */0);
							} else {
									pt.setPt_argc(generatedPt_argc);
									for (i = 0; i < generatedPt_argc; i++) {
										generatedPt_argv[i].copy_tv(generatedPt_argv[i]);
									}
							} 
						} 
						ret_pt.partial_unref();
				} 
				rettv.setV_type(.VAR_PARTIAL);
				generatedVval.setV_partial(pt);
			} 
		} 
		return selfdict/*
		 * Return the name of the executed function.
		 */;
	}
	public dictvar_S get_current_funccal_dict(hashtable_S ht) {
		if (ModernizedCProgram.current_funccal != ((Object)0) && ht == ModernizedCProgram.current_funccal.getL_vars().getDv_hashtab()) {
			return ModernizedCProgram.current_funccal.getL_vars();
		} 
		return ((Object)0/*
		 * Search hashitem in parent scope.
		 */);
	}
	public dictvar_S get_globvar_dict() {
		return ModernizedCProgram.globvardict/*
		 * Returns the global variable hash table
		 */;
	}
	public dictvar_S get_vimvar_dict() {
		return ModernizedCProgram.vimvardict/*
		 * Set type of v: variable to "type".
		 */;
	}
	public dictvar_S get_vim_var_dict(int idx) {
		return vimvars[idx].getVv_di().getDi_tv().getVval().getV_dict();
	}
	public void set_vim_var_dict(int idx) {
		vimvars[idx].getVv_di().getDi_tv().clear_tv();
		vimvars[idx].getVv_di().getDi_tv().setV_type(.VAR_DICT);
		vimvars[idx].getVv_di().getDi_tv().getVval().setV_dict(val);
		int generatedDv_refcount = this.getDv_refcount();
		if (val != ((Object)0)) {
			++generatedDv_refcount;
			val/*
			 * Set v:register if needed.
			 */.dict_set_items_ro();
		} 
	}
	public void unref_var_dict() {
		int generatedDv_refcount = this.getDv_refcount();
		// Now the dict needs to be freed if no one else is using it, go back to// normal reference counting.// Now the dict needs to be freed if no one else is using it, go back to// normal reference counting.generatedDv_refcount -= 99999 - 1;
		dict/*
		 * Clean up a list of internal variables.
		 * Frees all allocated variables and the value they contain.
		 * Clears hashtab "ht", does not free it.
		 */.dict_unref();
	}
	public void cursor_pos_info() {
		char_u p = new char_u();
		char_u[] buf1 = new char_u();
		char_u[] buf2 = new char_u();
		linenr_T lnum = new linenr_T();
		varnumber_T byte_count = 0;
		varnumber_T bom_count = 0;
		varnumber_T byte_count_cursor = 0;
		varnumber_T char_count = 0;
		varnumber_T char_count_cursor = 0;
		varnumber_T word_count = 0;
		varnumber_T word_count_cursor = 0;
		int eol_size;
		varnumber_T last_check = -1024;
		long line_count_selected = 0;
		pos_T min_pos = new pos_T();
		pos_T max_pos = new pos_T();
		oparg_T oparg = new oparg_T();
		block_def bd = new block_def();
		/*
		     * Compute the length of the file in characters.
		     */
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		Object generatedCol = max_pos.getCol();
		Object generatedStart_vcol = oparg.getStart_vcol();
		Object generatedEnd_vcol = oparg.getEnd_vcol();
		Object generatedLnum = max_pos.getLnum();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedTextstart = bd.getTextstart();
		int generatedTextlen = bd.getTextlen();
		int generatedB_p_eol = curbuf.getB_p_eol();
		int generatedB_p_bin = curbuf.getB_p_bin();
		int generatedB_p_fixeol = curbuf.getB_p_fixeol();
		if (generatedMl_flags & 1) {
			if (dict == ((Object)0)) {
				ModernizedCProgram.msg(((byte)(no_lines_msg)));
				return ;
			} 
		} else {
				if (curbuf.get_fileformat() == 1) {
					eol_size = 2;
				} else {
						eol_size = 1;
				} 
				if (VIsual_active) {
					if ((((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd())) {
						min_pos = ModernizedCProgram.VIsual;
						max_pos = ModernizedCProgram.curwin.getW_cursor();
					} else {
							min_pos = ModernizedCProgram.curwin.getW_cursor();
							max_pos = ModernizedCProgram.VIsual;
					} 
					if (ModernizedCProgram.p_sel == (byte)'e' && generatedCol > 0) {
						--generatedCol;
					} 
					if (VIsual_mode == 22) {
						char_u saved_sbr = p_sbr;
						p_sbr = /* Make 'sbr' empty for a moment to get the correct size. */empty_option;
						oparg.setIs_VIsual(1);
						oparg.setBlock_mode(1);
						oparg.setOp_type(0);
						ModernizedCProgram.getvcols(ModernizedCProgram.curwin, min_pos, max_pos, generatedStart_vcol, generatedEnd_vcol);
						p_sbr = saved_sbr;
						if (ModernizedCProgram.curwin.getW_curswant() == INT_MAX) {
							oparg.setEnd_vcol(INT_MAX);
						} 
						if (generatedEnd_vcol < generatedStart_vcol) {
							generatedEnd_vcol += generatedStart_vcol;
							oparg.setStart_vcol(generatedEnd_vcol - generatedStart_vcol);
							generatedEnd_vcol -= generatedStart_vcol;
						} 
					} 
					line_count_selected = generatedLnum - generatedLnum + 1;
				} 
				for (lnum = 1; lnum <= generatedMl_line_count; ++lnum) {
					if (byte_count > /* Check for a CTRL-C every 100000 characters. */last_check) {
						ModernizedCProgram.ui_breakcheck();
						if (got_int) {
							return ;
						} 
						last_check = byte_count + -1024;
					} 
					if (/* Do extra processing for VIsual mode. */VIsual_active && lnum >= generatedLnum && lnum <= generatedLnum) {
						char_u s = ((Object)0);
						long len = -1024;
						switch (VIsual_mode) {
						case (byte)'v':
								{ 
									colnr_T start_col = (lnum == generatedLnum) ? generatedCol : 0;
									colnr_T end_col = (lnum == generatedLnum) ? generatedCol - start_col + 1 : INT_MAX;
									s = ModernizedCProgram.ml_get(lnum) + start_col;
									len = end_col;
								}
								break;
						case (byte)'V':
								s = ModernizedCProgram.ml_get(lnum);
								len = INT_MAX;
								break;
						case 22:
								virtual_op = ModernizedCProgram.virtual_active();
								ModernizedCProgram.block_prep(oparg, bd, lnum, 0);
								virtual_op = 2;
								s = generatedTextstart;
								len = (long)generatedTextlen;
								break;
						}
						if (s != ((Object)0)) {
							byte_count_cursor += ModernizedCProgram.line_count_info(s, word_count_cursor, char_count_cursor, len, eol_size);
							if (lnum == generatedMl_line_count && !generatedB_p_eol && (generatedB_p_bin || !generatedB_p_fixeol) && (long).strlen((byte)(s)) < len) {
								byte_count_cursor -= eol_size;
							} 
						} 
					} else {
							if (lnum == generatedLnum) {
								word_count_cursor += word_count;
								char_count_cursor += char_count;
								byte_count_cursor = byte_count + ModernizedCProgram.line_count_info(ModernizedCProgram.ml_get(lnum), word_count_cursor, char_count_cursor, (varnumber_T)(generatedCol + 1), eol_size);
							} 
					} 
					byte_count += ModernizedCProgram.line_count_info(ModernizedCProgram.ml_get(lnum), /* Add to the running totals */word_count, char_count, (varnumber_T)INT_MAX, eol_size);
				}
				if (!generatedB_p_eol && (generatedB_p_bin || !generatedB_p_fixeol)) {
					byte_count -= eol_size;
				} 
				if (dict == ((Object)0)) {
					if (VIsual_active) {
						if (VIsual_mode == 22 && ModernizedCProgram.curwin.getW_curswant() < INT_MAX) {
							ModernizedCProgram.getvcols(ModernizedCProgram.curwin, min_pos, max_pos, generatedCol, generatedCol);
							ModernizedCProgram.vim_snprintf((byte)buf1, , ((byte)("%ld Cols; ")), (long)(generatedEnd_vcol - generatedStart_vcol + 1));
						} else {
								buf1[0] = (byte)'\000';
						} 
						if (char_count_cursor == byte_count_cursor && char_count == byte_count) {
							ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Selected %s%ld of %ld Lines; %lld of %lld Words; %lld of %lld Bytes")), buf1, line_count_selected, (long)generatedMl_line_count, (long_long_T)word_count_cursor, (long_long_T)word_count, (long_long_T)byte_count_cursor, (long_long_T)byte_count);
						} else {
								ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Selected %s%ld of %ld Lines; %lld of %lld Words; %lld of %lld Chars; %lld of %lld Bytes")), buf1, line_count_selected, (long)generatedMl_line_count, (long_long_T)word_count_cursor, (long_long_T)word_count, (long_long_T)char_count_cursor, (long_long_T)char_count, (long_long_T)byte_count_cursor, (long_long_T)byte_count);
						} 
					} else {
							p = ModernizedCProgram.ml_get_curline();
							ModernizedCProgram.validate_virtcol();
							ModernizedCProgram.col_print(buf1, , (int)generatedCol + 1, (int)ModernizedCProgram.curwin.getW_virtcol() + 1);
							ModernizedCProgram.col_print(buf2, , (int).strlen((byte)(p)), ModernizedCProgram.linetabsize(p));
							if (char_count_cursor == byte_count_cursor && char_count == byte_count) {
								ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Col %s of %s; Line %ld of %ld; Word %lld of %lld; Byte %lld of %lld")), (byte)buf1, (byte)buf2, (long)generatedLnum, (long)generatedMl_line_count, (long_long_T)word_count_cursor, (long_long_T)word_count, (long_long_T)byte_count_cursor, (long_long_T)byte_count);
							} else {
									ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Col %s of %s; Line %ld of %ld; Word %lld of %lld; Char %lld of %lld; Byte %lld of %lld")), (byte)buf1, (byte)buf2, (long)generatedLnum, (long)generatedMl_line_count, (long_long_T)word_count_cursor, (long_long_T)word_count, (long_long_T)char_count_cursor, (long_long_T)char_count, (long_long_T)byte_count_cursor, (long_long_T)byte_count);
							} 
					} 
				} 
				bom_count = ModernizedCProgram.bomb_size();
				if (dict == ((Object)0) && bom_count > 0) {
					ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff + .strlen((byte)(ModernizedCProgram.IObuff)), (1024 + 1), ((byte)("(+%lld for BOM)")), (long_long_T)bom_count);
				} 
				if (dict == ((Object)0)) {
					p = ModernizedCProgram.p_shm;
					ModernizedCProgram.p_shm = (char_u)"";
					ModernizedCProgram.msg((byte)ModernizedCProgram.IObuff);
					ModernizedCProgram.p_shm = p;
				} 
		} 
		if (dict != ((Object)0)) {
			dict.dict_add_number("words", word_count);
			dict.dict_add_number("chars", char_count);
			dict.dict_add_number("bytes", byte_count + bom_count);
			dict.dict_add_number(VIsual_active ? "visual_bytes" : "cursor_bytes", byte_count_cursor);
			dict.dict_add_number(VIsual_active ? "visual_chars" : "cursor_chars", char_count_cursor);
			dict.dict_add_number(VIsual_active ? "visual_words" : "cursor_words", word_count_cursor);
		} 
	}
	public dictvar_S sign_get_info(signlist sign) {
		dict_T d = new dict_T();
		dictvar_S dictvar_S = new dictvar_S();
		if ((d = dictvar_S.dict_alloc_id(.aid_sign_getinfo)) == ((Object)0)) {
			return ((Object)0);
		} 
		int generatedId = sign.getId();
		d.dict_add_number("id", generatedId);
		signgroup_S generatedGroup = sign.getGroup();
		Object generatedSg_name = generatedGroup.getSg_name();
		d.dict_add_string("group", (generatedGroup == ((Object)0)) ? (char_u)"" : generatedSg_name);
		Object generatedLnum = sign.getLnum();
		d.dict_add_number("lnum", generatedLnum);
		int generatedTypenr = sign.getTypenr();
		d.dict_add_string("name", ModernizedCProgram.sign_typenr2name(generatedTypenr));
		int generatedPriority = sign.getPriority();
		d.dict_add_number("priority", generatedPriority);
		return d/*
		 * Sort the signs placed on the same line as "sign" by priority.  Invoked after
		 * changing the priority of an already placed sign.  Assumes the signs in the
		 * buffer are sorted by line number and priority.
		 */;
	}
	public int sign_define_from_dict(Object name_arg) {
		char_u name = ((Object)0);
		char_u icon = ((Object)0);
		char_u linehl = ((Object)0);
		char_u text = ((Object)0);
		char_u texthl = ((Object)0);
		int retval = -1;
		if (name_arg == ((Object)0)) {
			if (dict == ((Object)0)) {
				return -1;
			} 
			name = dict.dict_get_string((char_u)"name", 1);
		} else {
				name = ModernizedCProgram.vim_strsave(name_arg);
		} 
		if (name == ((Object)0) || name[0] == (byte)'\000') {
			;
		} 
		if (dict != ((Object)0)) {
			icon = dict.dict_get_string((char_u)"icon", 1);
			linehl = dict.dict_get_string((char_u)"linehl", 1);
			text = dict.dict_get_string((char_u)"text", 1);
			texthl = dict.dict_get_string((char_u)"texthl", 1);
		} 
		if (ModernizedCProgram.sign_define_by_name(name, icon, linehl, text, texthl) == 1) {
			retval = 0;
		} 
		ModernizedCProgram.vim_free(icon);
		ModernizedCProgram.vim_free(linehl);
		ModernizedCProgram.vim_free(text);
		ModernizedCProgram.vim_free(texthl);
		return retval/*
		 * Define multiple signs using attributes from list 'l' and store the return
		 * values in 'retlist'.
		 */;
	}
	public byte getDv_lock() {
		return dv_lock;
	}
	public void setDv_lock(byte newDv_lock) {
		dv_lock = newDv_lock;
	}
	public byte getDv_scope() {
		return dv_scope;
	}
	public void setDv_scope(byte newDv_scope) {
		dv_scope = newDv_scope;
	}
	public int getDv_refcount() {
		return dv_refcount;
	}
	public void setDv_refcount(int newDv_refcount) {
		dv_refcount = newDv_refcount;
	}
	public int getDv_copyID() {
		return dv_copyID;
	}
	public void setDv_copyID(int newDv_copyID) {
		dv_copyID = newDv_copyID;
	}
	public hashtable_S getDv_hashtab() {
		return dv_hashtab;
	}
	public void setDv_hashtab(hashtable_S newDv_hashtab) {
		dv_hashtab = newDv_hashtab;
	}
	public dictvar_S getDv_copydict() {
		return dv_copydict;
	}
	public void setDv_copydict(dictvar_S newDv_copydict) {
		dv_copydict = newDv_copydict;
	}
	public dictvar_S getDv_used_next() {
		return dv_used_next;
	}
	public void setDv_used_next(dictvar_S newDv_used_next) {
		dv_used_next = newDv_used_next;
	}
	public dictvar_S getDv_used_prev() {
		return dv_used_prev;
	}
	public void setDv_used_prev(dictvar_S newDv_used_prev) {
		dv_used_prev = newDv_used_prev;
	}
}
