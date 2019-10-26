package application;

// Use 32-bit Number.
public class listvar_S {
	private listitem_S lv_first;
	private listitem_S lv_last;
	private listwatch_S lv_watch;
	private listitem_S lv_idx_item;
	private listvar_S lv_copylist;
	private listvar_S lv_used_next;
	private listvar_S lv_used_prev;
	private int lv_refcount;
	private int lv_len;
	private int lv_idx;
	private int lv_copyID;
	private byte lv_lock;
	
	public listvar_S(listitem_S lv_first, listitem_S lv_last, listwatch_S lv_watch, listitem_S lv_idx_item, listvar_S lv_copylist, listvar_S lv_used_next, listvar_S lv_used_prev, int lv_refcount, int lv_len, int lv_idx, int lv_copyID, byte lv_lock) {
		setLv_first(lv_first);
		setLv_last(lv_last);
		setLv_watch(lv_watch);
		setLv_idx_item(lv_idx_item);
		setLv_copylist(lv_copylist);
		setLv_used_next(lv_used_next);
		setLv_used_prev(lv_used_prev);
		setLv_refcount(lv_refcount);
		setLv_len(lv_len);
		setLv_idx(lv_idx);
		setLv_copyID(lv_copyID);
		setLv_lock(lv_lock);
	}
	public listvar_S() {
	}
	
	public void ins_compl_add_list() {
		listitem_T li = new listitem_T();
		int dir = ModernizedCProgram.compl_direction;
		 generatedLi_tv = li.getLi_tv();
		listitem_S generatedLi_next = li.getLi_next();
		listitem_S generatedLv_first = this.getLv_first();
		// Go through the List with matches and add each of them.for (li = generatedLv_first; li != ((Object)0); li = generatedLi_next) {
			if (generatedLi_tv.ins_compl_add_tv(dir) == 1) {
				dir = 1;
			}  else if (ModernizedCProgram.did_emsg) {
				break;
			} 
		}
	}
	public void set_completion(Object startcol) {
		int save_w_wrow = ModernizedCProgram.curwin.getW_wrow();
		int save_w_leftcol = ModernizedCProgram.curwin.getW_leftcol();
		int flags = 1;
		// If already doing completions stop it.if (ModernizedCProgram.ctrl_x_mode != 0) {
			ModernizedCProgram.ins_compl_prep((byte)' ');
		} 
		ModernizedCProgram.ins_compl_clear();
		ModernizedCProgram.ins_compl_free();
		ModernizedCProgram.compl_direction = 1;
		if (startcol > ModernizedCProgram.curwin.getW_cursor().getCol()) {
			startcol = ModernizedCProgram.curwin.getW_cursor().getCol();
		} 
		ModernizedCProgram.compl_col = startcol;
		compl_length = (int)ModernizedCProgram.curwin.getW_cursor().getCol() - (int)startcol// compl_pattern doesn't need to be set;// compl_pattern doesn't need to be set
		ModernizedCProgram.compl_orig_text = ModernizedCProgram.vim_strnsave(ModernizedCProgram.ml_get_curline() + ModernizedCProgram.compl_col, compl_length);
		if (ModernizedCProgram.p_ic) {
			flags |=  16;
		} 
		if (ModernizedCProgram.compl_orig_text == ((Object)0) || ModernizedCProgram.ins_compl_add(ModernizedCProgram.compl_orig_text, -1, ((Object)0), ((Object)0), 0, flags, 0) != 1) {
			return ;
		} 
		ModernizedCProgram.ctrl_x_mode = 16;
		list.ins_compl_add_list();
		ModernizedCProgram.compl_matches = ModernizedCProgram.ins_compl_make_cyclic();
		ModernizedCProgram.compl_started = 1;
		ModernizedCProgram.compl_used_match = 1;
		compl_cont_status = 0;
		ModernizedCProgram.compl_curr_match = ModernizedCProgram.compl_first_match;
		if (ModernizedCProgram.compl_no_insert || ModernizedCProgram.compl_no_select) {
			ModernizedCProgram.ins_complete((-(((byte)'k') + ((int)((byte)'d') << 8))), 0);
			if (ModernizedCProgram.compl_no_select) {
				ModernizedCProgram.ins_complete((-(((byte)'k') + ((int)((byte)'u') << 8))), 0);
			} 
		} else {
				ModernizedCProgram.ins_complete(14, 0);
		} 
		ModernizedCProgram.compl_enter_selects = ModernizedCProgram.compl_no_insert;
		// Lazily show the popup menu, unless we got interrupted.if (!ModernizedCProgram.compl_interrupted) {
			ModernizedCProgram.show_pum(save_w_wrow, save_w_leftcol);
		} 
		ModernizedCProgram.out_flush();
	}
	public listvar_S list_alloc() {
		list_T l = new list_T();
		l = (list_T)ModernizedCProgram.alloc_clear();
		if (l != ((Object)0)) {
			if (ModernizedCProgram.first_list != ((Object)/* Prepend the list to the list of lists for garbage collection. */0)) {
				ModernizedCProgram.first_list.setLv_used_prev(l);
			} 
			l.setLv_used_prev(((Object)0));
			l.setLv_used_next(ModernizedCProgram.first_list);
			ModernizedCProgram.first_list = l;
		} 
		return l/*
		 * list_alloc() with an ID for alloc_fail().
		 */;
	}
	public listvar_S list_alloc_id( id) {
		if (alloc_fail_id == id && ModernizedCProgram.alloc_does_fail()) {
			return ((Object)0);
		} 
		listvar_S listvar_S = new listvar_S();
		return (listvar_S.list_alloc());
	}
	public void list_unref() {
		if (ModernizedCProgram.l != ((Object)0) && --ModernizedCProgram.l.getLv_refcount() <= 0) {
			ModernizedCProgram.l/*
			 * Free a list, including all non-container items it points to.
			 * Ignores the reference count.
			 */.list_free();
		} 
	}
	public void list_free_contents() {
		listitem_T item = new listitem_T();
		listitem_S generatedLi_next = item.getLi_next();
		 generatedLi_tv = item.getLi_tv();
		for (item = ModernizedCProgram.l.getLv_first(); item != ((Object)0); item = ModernizedCProgram.l.getLv_first()) {
			ModernizedCProgram.l.setLv_first(generatedLi_next);
			generatedLi_tv.clear_tv();
			ModernizedCProgram.vim_free(item/*
			 * Go through the list of lists and free items without the copyID.
			 * But don't free a list that has a watcher (used in a for loop), these
			 * are not referenced anywhere.
			 */);
		}
	}
	public void list_free_list() {
		if (ModernizedCProgram.l.getLv_used_prev() == ((Object)/* Remove the list from the list of lists for garbage collection. */0)) {
			ModernizedCProgram.first_list = ModernizedCProgram.l.getLv_used_next();
		} else {
				ModernizedCProgram.l.getLv_used_prev().setLv_used_next(ModernizedCProgram.l.getLv_used_next());
		} 
		if (ModernizedCProgram.l.getLv_used_next() != ((Object)0)) {
			ModernizedCProgram.l.getLv_used_next().setLv_used_prev(ModernizedCProgram.l.getLv_used_prev());
		} 
		ModernizedCProgram.vim_free(ModernizedCProgram.l);
	}
	public void list_free() {
		if (!in_free_unref_items) {
			ModernizedCProgram.l.list_free_contents();
			ModernizedCProgram.l/*
			 * Allocate a list item.
			 * It is not initialized, don't forget to set v_lock.
			 */.list_free_list();
		} 
	}
	public long list_len() {
		if (ModernizedCProgram.l == ((Object)0)) {
			return -1024;
		} 
		return ModernizedCProgram.l.getLv_len();
	}
	public int list_equal(listvar_S l2, int ic, int recursive) {
		/* ignore case for strings *//* TRUE when used recursively */listitem_T item1 = new listitem_T();
		listitem_T item2 = new listitem_T();
		if (l1 == ((Object)0) || l2 == ((Object)0)) {
			return 0;
		} 
		if (l1 == l2) {
			return 1;
		} 
		if (l1.list_len() != l2.list_len()) {
			return 0;
		} 
		 generatedLi_tv = item1.getLi_tv();
		for (; item1 != ((Object)0) && item2 != ((Object)0); ) {
			if (!generatedLi_tv.tv_equal(generatedLi_tv, ic, recursive)) {
				return 0;
			} 
		}
		return item1 == ((Object)0) && item2 == ((Object)0/*
		 * Locate item with index "n" in list "l" and return it.
		 * A negative index is counted from the end; -1 is the last item.
		 * Returns NULL when "n" is out of range.
		 */);
	}
	public long list_find_nr(long idx, int errorp) {
		/* set to TRUE when something wrong */listitem_T li = new listitem_T();
		listitem_S listitem_S = new listitem_S();
		li = listitem_S.list_find(ModernizedCProgram.l, idx);
		if (li == ((Object)0)) {
			if (errorp != ((Object)0)) {
				errorp = 1;
			} 
			return --1024;
		} 
		 generatedLi_tv = li.getLi_tv();
		return (long)generatedLi_tv.tv_get_number_chk(errorp/*
		 * Get list item "l[idx - 1]" as a string.  Returns NULL for failure.
		 */);
	}
	public Object list_find_str(long idx) {
		listitem_T li = new listitem_T();
		listitem_S listitem_S = new listitem_S();
		li = listitem_S.list_find(ModernizedCProgram.l, idx - 1);
		if (li == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_listidx)), idx);
			return ((Object)0);
		} 
		 generatedLi_tv = li.getLi_tv();
		return generatedLi_tv.tv_get_string();
	}
	public int list_append_list(listvar_S list2) {
		listitem_S listitem_S = new listitem_S();
		listitem_T li = listitem_S.listitem_alloc();
		if (li == ((Object)0)) {
			return 0;
		} 
		 generatedLi_tv = li.getLi_tv();
		generatedLi_tv.setV_type(.VAR_LIST);
		generatedLi_tv.setV_lock(0);
		Object generatedVval = generatedLi_tv.getVval();
		generatedVval.setV_list(list2);
		ModernizedCProgram.list_append(list1, li);
		int generatedLv_refcount = list2.getLv_refcount();
		++generatedLv_refcount;
		return 1/*
		 * Make a copy of "str" and append it as an item to list "l".
		 * When "len" >= 0 use "str[len]".
		 * Returns FAIL when out of memory.
		 */;
	}
	public int list_append_string(Object str, int len) {
		listitem_S listitem_S = new listitem_S();
		listitem_T li = listitem_S.listitem_alloc();
		if (li == ((Object)0)) {
			return 0;
		} 
		ModernizedCProgram.list_append(ModernizedCProgram.l, li);
		 generatedLi_tv = li.getLi_tv();
		generatedLi_tv.setV_type(.VAR_STRING);
		generatedLi_tv.setV_lock(0);
		Object generatedVval = generatedLi_tv.getVval();
		if (str == ((Object)0)) {
			generatedVval.setV_string(((Object)0));
		}  else if ((generatedVval.setV_string((len >= 0 ? ModernizedCProgram.vim_strnsave(str, len) : ModernizedCProgram.vim_strsave(str)))) == ((Object)0)) {
			return 0;
		} 
		return 1/*
		 * Append "n" to list "l".
		 * Returns FAIL when out of memory.
		 */;
	}
	public int list_append_number(Object n) {
		listitem_T li = new listitem_T();
		listitem_S listitem_S = new listitem_S();
		li = listitem_S.listitem_alloc();
		if (li == ((Object)0)) {
			return 0;
		} 
		 generatedLi_tv = li.getLi_tv();
		generatedLi_tv.setV_type(.VAR_NUMBER);
		generatedLi_tv.setV_lock(0);
		Object generatedVval = generatedLi_tv.getVval();
		generatedVval.setV_number(n);
		ModernizedCProgram.list_append(ModernizedCProgram.l, li);
		return 1/*
		 * Insert typval_T "tv" in list "l" before "item".
		 * If "item" is NULL append at the end.
		 * Return FAIL when out of memory.
		 */;
	}
	public listvar_S list_copy(int deep, int copyID) {
		list_T copy = new list_T();
		listitem_T item = new listitem_T();
		listitem_T ni = new listitem_T();
		if (orig == ((Object)0)) {
			return ((Object)0);
		} 
		listvar_S listvar_S = new listvar_S();
		copy = listvar_S.list_alloc();
		listitem_S listitem_S = new listitem_S();
		 generatedLi_tv = item.getLi_tv();
		listitem_S generatedLi_next = item.getLi_next();
		listitem_S generatedLv_first = this.getLv_first();
		int generatedLv_refcount = copy.getLv_refcount();
		if (copy != ((Object)0)) {
			if (copyID != 0) {
				this.setLv_copyID(/* Do this before adding the items, because one of the items may
					     * refer back to this list. */copyID);
				this.setLv_copylist(copy);
			} 
			for (item = generatedLv_first; item != ((Object)0) && !got_int; item = generatedLi_next) {
				ni = listitem_S.listitem_alloc();
				if (ni == ((Object)0)) {
					break;
				} 
				if (deep) {
					if (generatedLi_tv.item_copy(generatedLi_tv, deep, copyID) == 0) {
						ModernizedCProgram.vim_free(ni);
						break;
					} 
				} else {
						generatedLi_tv.copy_tv(generatedLi_tv);
				} 
				ModernizedCProgram.list_append(copy, ni);
			}
			++generatedLv_refcount;
			if (item != ((Object)0)) {
				copy.list_unref();
				copy = ((Object)0);
			} 
		} 
		return copy/*
		 * Remove items "item" to "item2" from list "l".
		 * Does not free the listitem or the value!
		 * This used to be called list_remove, but that conflicts with a Sun header
		 * file.
		 */;
	}
	public listvar_S reg_submatch_list(int no) {
		char_u s = new char_u();
		linenr_T slnum = new linenr_T();
		linenr_T elnum = new linenr_T();
		colnr_T scol = new colnr_T();
		colnr_T ecol = new colnr_T();
		int i;
		list_T list = new list_T();
		int error = 0;
		if (!ModernizedCProgram.can_f_submatch || no < 0) {
			return ((Object)0);
		} 
		listvar_S listvar_S = new listvar_S();
		if (ModernizedCProgram.rsm.getSm_match() == ((Object)0)) {
			slnum = ModernizedCProgram.rsm.getSm_mmatch().getStartpos()[no].getLnum();
			elnum = ModernizedCProgram.rsm.getSm_mmatch().getEndpos()[no].getLnum();
			if (slnum < 0 || elnum < 0) {
				return ((Object)0);
			} 
			scol = ModernizedCProgram.rsm.getSm_mmatch().getStartpos()[no].getCol();
			ecol = ModernizedCProgram.rsm.getSm_mmatch().getEndpos()[no].getCol();
			list = listvar_S.list_alloc();
			if (list == ((Object)0)) {
				return ((Object)0);
			} 
			s = ModernizedCProgram.reg_getline_submatch(slnum) + scol;
			if (slnum == elnum) {
				if (list.list_append_string(s, ecol - scol) == 0) {
					error = 1;
				} 
			} else {
					if (list.list_append_string(s, -1) == 0) {
						error = 1;
					} 
					for (i = 1; i < elnum - slnum; i++) {
						s = ModernizedCProgram.reg_getline_submatch(slnum + i);
						if (list.list_append_string(s, -1) == 0) {
							error = 1;
						} 
					}
					s = ModernizedCProgram.reg_getline_submatch(elnum);
					if (list.list_append_string(s, ecol) == 0) {
						error = 1;
					} 
			} 
		} else {
				s = ModernizedCProgram.rsm.getSm_match().getStartp()[no];
				if (s == ((Object)0) || ModernizedCProgram.rsm.getSm_match().getEndp()[no] == ((Object)0)) {
					return ((Object)0);
				} 
				list = listvar_S.list_alloc();
				if (list == ((Object)0)) {
					return ((Object)0);
				} 
				if (list.list_append_string(s, (int)(ModernizedCProgram.rsm.getSm_match().getEndp()[no] - s)) == 0) {
					error = 1;
				} 
		} 
		if (error) {
			list.list_free();
			return ((Object)0);
		} 
		return list;
	}
	public void ui_post_balloon(Object mesg) {
		ModernizedCProgram.ui_remove_balloon();
		if (mesg == ((Object)0) && list == ((Object)0)) {
			ModernizedCProgram.pum_undisplay();
			return ;
		} 
		int generatedLv_len = this.getLv_len();
		 generatedLi_tv = li.getLi_tv();
		if (list != ((Object)0)) {
			listitem_T li = new listitem_T();
			int idx;
			ModernizedCProgram.balloon_arraysize = generatedLv_len;
			ModernizedCProgram.balloon_array = (pumitem_T)ModernizedCProgram.alloc_clear( * (generatedLv_len));
			if (ModernizedCProgram.balloon_array == ((Object)0)) {
				return ;
			} 
			for (; li != ((Object)0); ) {
				char_u text = generatedLi_tv.tv_get_string_chk();
				ModernizedCProgram.balloon_array[idx].setPum_text(ModernizedCProgram.vim_strsave(text == ((Object)0) ? (char_u)"" : text));
			}
		} else {
				ModernizedCProgram.balloon_arraysize = ModernizedCProgram.balloon_array.split_message(mesg);
		} 
		if (ModernizedCProgram.balloon_arraysize > 0) {
			ModernizedCProgram.pum_array = ModernizedCProgram.balloon_array;
			ModernizedCProgram.pum_size = ModernizedCProgram.balloon_arraysize;
			ModernizedCProgram.pum_compute_size();
			ModernizedCProgram.pum_scrollbar = 0;
			ModernizedCProgram.pum_height = ModernizedCProgram.balloon_arraysize;
			ModernizedCProgram.pum_position_at_mouse(50);
			ModernizedCProgram.pum_selected = -1;
			ModernizedCProgram.pum_first = 0;
			ModernizedCProgram.pum_redraw();
		} 
	}
	public int get_tags(Object pat, Object buf_fname) {
		int num_matches;
		int i;
		int ret;
		char_u matches = new char_u();
		char_u p = new char_u();
		char_u full_fname = new char_u();
		dict_T dict = new dict_T();
		tagptrs_T tp = new tagptrs_T();
		long is_static;
		ret = ModernizedCProgram.find_tags(pat, num_matches, matches, 4 | 8, (int)INT_MAX, buf_fname);
		Object generatedTagname = tp.getTagname();
		dictvar_S dictvar_S = new dictvar_S();
		Object generatedTagname_end = tp.getTagname_end();
		Object generatedCommand = tp.getCommand();
		Object generatedCommand_end = tp.getCommand_end();
		Object generatedTagkind = tp.getTagkind();
		Object generatedTagkind_end = tp.getTagkind_end();
		if (ret == 1 && num_matches > 0) {
			for (i = 0; i < num_matches; ++i) {
				tp.parse_match(matches[i]);
				is_static = tp.test_for_static();
				if (.strncmp((byte)(generatedTagname), (byte)("!_TAG_"), (size_t)(true)) == /* Skip pseudo-tag lines. */0) {
					continue;
				} 
				if ((dict = dictvar_S.dict_alloc()) == ((Object)0)) {
					ret = 0;
				} 
				if (ModernizedCProgram.list_append_dict(list, dict) == 0) {
					ret = 0;
				} 
				full_fname = tp.tag_full_fname();
				if (dict.add_tag_field("name", generatedTagname, generatedTagname_end) == 0 || dict.add_tag_field("filename", full_fname, ((Object)0)) == 0 || dict.add_tag_field("cmd", generatedCommand, generatedCommand_end) == 0 || dict.add_tag_field("kind", generatedTagkind, generatedTagkind_end) == 0 || dict.dict_add_number("static", is_static) == 0) {
					ret = 0;
				} 
				ModernizedCProgram.vim_free(full_fname);
				if (generatedCommand_end != ((Object)0)) {
					for (p = generatedCommand_end + 3; p != (byte)'\000' && p != (byte)'\n' && p != (byte)'\r'; ++p) {
						if (p == generatedTagkind || (p + 5 == generatedTagkind && .strncmp((byte)(p), (byte)("kind:"), (size_t)(true)) == 0)) {
							p = generatedTagkind_end - /* skip "kind:<kind>" and "<kind>" */1;
						}  else if (.strncmp((byte)(p), (byte)("file:"), (size_t)(true)) == 0) {
							p += /* skip "file:" (static tag) */4;
						}  else if (!((p) == (byte)' ' || (p) == (byte)'\t')) {
							char_u s = new char_u();
							char_u n = new char_u();
							int len;
							n = /* Add extra field as a dict entry.  Fields are
										 * separated by Tabs. */p;
							while (p != (byte)'\000' && p >= (byte)' ' && p < 127 && p != (byte)':') {
								++p;
							}
							len = (int)(p - n);
							if (p == (byte)':' && len > 0) {
								s = ++p;
								while (p != (byte)'\000' && p >= (byte)' ') {
									++p;
								}
								n[len] = (byte)'\000';
								if (dict.add_tag_field((byte)n, s, p) == 0) {
									ret = 0;
								} 
								n[len] = (byte)':';
							} else {
									while (p != (byte)'\000' && p >= /* Skip field without colon. */(byte)' ') {
										++p;
									}
							} 
							if (p == (byte)'\000') {
								break;
							} 
						} 
					}
				} 
				ModernizedCProgram.vim_free(matches[i]);
			}
			ModernizedCProgram.vim_free(matches);
		} 
		return ret/*
		 * Return information about 'tag' in dict 'retdict'.
		 */;
	}
	public int set_ref_in_list(int copyID) {
		int generatedLv_copyID = this.getLv_copyID();
		if (ll != ((Object)0) && generatedLv_copyID != copyID) {
			this.setLv_copyID(copyID);
			return ModernizedCProgram.set_ref_in_list_items(ll, copyID, ((Object)0));
		} 
		return 0/*
		 * Mark all lists and dicts referenced through list "l" with "copyID".
		 * "ht_stack" is used to add hashtabs to be marked.  Can be NULL.
		 *
		 * Returns TRUE if setting references failed somehow.
		 */;
	}
	public listvar_S eval_spell_expr(Object badword, Object expr) {
		typval_T save_val = new typval_T();
		typval_T rettv = new typval_T();
		list_T list = ((Object)0);
		char_u p = ModernizedCProgram.skipwhite(expr);
		// Set "v:val" to the bad word.// Set "v:val" to the bad word.save_val.prepare_vimvar(34);
		ModernizedCProgram.set_vim_var_string(34, badword, -1);
		if (ModernizedCProgram.p_verbose == 0) {
			++emsg_off;
		} 
		Object generatedV_type = rettv.getV_type();
		Object generatedVval = rettv.getVval();
		if (rettv.eval1(p, 1) == 1) {
			if (generatedV_type != .VAR_LIST) {
				rettv.clear_tv();
			} else {
					list = generatedVval.getV_list();
			} 
		} 
		if (ModernizedCProgram.p_verbose == 0) {
			--emsg_off;
		} 
		ModernizedCProgram.get_vim_var_tv(34).clear_tv();
		save_val.restore_vimvar(34);
		return list/*
		 * "list" is supposed to contain two items: a word and a number.  Return the
		 * word in "pp" and the number as the return value.
		 * Return -1 if anything isn't right.
		 * Used to get the good word and score from the eval_spell_expr() result.
		 */;
	}
	public int get_spellword(Object pp) {
		listitem_T li = new listitem_T();
		listitem_S generatedLv_first = this.getLv_first();
		li = generatedLv_first;
		if (li == ((Object)0)) {
			return -1;
		} 
		 generatedLi_tv = li.getLi_tv();
		pp = generatedLi_tv.tv_get_string();
		listitem_S generatedLi_next = li.getLi_next();
		li = generatedLi_next;
		if (li == ((Object)0)) {
			return -1;
		} 
		return (int)generatedLi_tv.tv_get_number();
	}
	public listvar_S heredoc_get(exarg eap, Object cmd) {
		char_u theline = new char_u();
		char_u marker = new char_u();
		list_T l = new list_T();
		char_u p = new char_u();
		int marker_indent_len = 0;
		int text_indent_len = 0;
		char_u text_indent = ((Object)0);
		Object generatedGetline = eap.getGetline();
		if (generatedGetline == ((Object)0)) {
			ModernizedCProgram.emsg(((byte)("E991: cannot use =<< here")));
			return ((Object)0);
		} 
		// Check for the optional 'trim' word before the marker// Check for the optional 'trim' word before the markercmd = ModernizedCProgram.skipwhite(cmd);
		Object generatedCmdlinep = eap.getCmdlinep();
		if (.strncmp((byte)(cmd), (byte)("trim"), (size_t)(true)) == 0 && (cmd[4] == (byte)'\000' || ((cmd[4]) == (byte)' ' || (cmd[4]) == (byte)'\t'))) {
			cmd = ModernizedCProgram.skipwhite(cmd + 4);
			p = generatedCmdlinep;
			while (((p) == (byte)' ' || (p) == (byte)'\t')) {
				p++;
				marker_indent_len++;
			}
			text_indent_len = -1;
		} 
		// The marker is the next word.if (cmd != (byte)'\000' && cmd != (byte)'"') {
			marker = ModernizedCProgram.skipwhite(cmd);
			p = ModernizedCProgram.skiptowhite(marker);
			if (ModernizedCProgram.skipwhite(p) != (byte)'\000' && ModernizedCProgram.skipwhite(p) != (byte)'"') {
				ModernizedCProgram.emsg(((byte)(e_trailing)));
				return ((Object)0);
			} 
			p = (byte)'\000';
			if (ModernizedCProgram.vim_islower(marker)) {
				ModernizedCProgram.emsg(((byte)("E221: Marker cannot start with lower case letter")));
				return ((Object)0);
			} 
		} else {
				ModernizedCProgram.emsg(((byte)("E172: Missing marker")));
				return ((Object)0);
		} 
		listvar_S listvar_S = new listvar_S();
		l = listvar_S.list_alloc();
		if (l == ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedCookie = eap.getCookie();
		for (; ; ) {
			int mi = 0;
			int ti = 0;
			theline = .UNRECOGNIZEDFUNCTIONNAME((byte)'\000', generatedCookie, 0, 0);
			if (theline == ((Object)0)) {
				ModernizedCProgram.semsg(((byte)("E990: Missing end marker '%s'")), marker);
				break;
			} 
			if (marker_indent_len > 0 && .strncmp((byte)(theline), (byte)(generatedCmdlinep), (size_t)(marker_indent_len)) == 0) {
				mi = marker_indent_len;
			} 
			if (.strcmp((byte)(marker), (byte)(theline + mi)) == 0) {
				ModernizedCProgram.vim_free(theline);
				break;
			} 
			if (text_indent_len == -1 && theline != (byte)'\000') {
				p = theline;
				text_indent_len = 0;
				while (((p) == (byte)' ' || (p) == (byte)'\t')) {
					p++;
					text_indent_len++;
				}
				text_indent = ModernizedCProgram.vim_strnsave(theline, text_indent_len);
			} 
			if (text_indent != ((Object)0)) {
				for (ti = 0; ti < text_indent_len; ++ti) {
					if (theline[ti] != text_indent[ti]) {
						break;
					} 
				}
			} 
			if (l.list_append_string(theline + ti, -1) == 0) {
				break;
			} 
			ModernizedCProgram.vim_free(theline);
		}
		ModernizedCProgram.vim_free(text_indent);
		return l/*
		 * ":let"			list all variable values
		 * ":let var1 var2"		list variable values
		 * ":let var = expr"		assignment command.
		 * ":let var += expr"		assignment command.
		 * ":let var -= expr"		assignment command.
		 * ":let var *= expr"		assignment command.
		 * ":let var /= expr"		assignment command.
		 * ":let var %= expr"		assignment command.
		 * ":let var .= expr"		assignment command.
		 * ":let var ..= expr"		assignment command.
		 * ":let [var1, var2] = expr"	unpack list.
		 */;
	}
	public listvar_S get_vim_var_list(int idx) {
		return vimvars[idx].getVv_di().getDi_tv().getVval().getV_list();
	}
	public void set_vim_var_list(int idx) {
		vimvars[idx].getVv_di().getDi_tv().clear_tv();
		vimvars[idx].getVv_di().getDi_tv().setV_type(.VAR_LIST);
		vimvars[idx].getVv_di().getDi_tv().getVval().setV_list(val);
		int generatedLv_refcount = this.getLv_refcount();
		if (val != ((Object)0)) {
			++generatedLv_refcount;
		} 
	}
	public void sign_getlist(Object name) {
		sign_T sp = ModernizedCProgram.first_sign;
		dict_T dict = new dict_T();
		if (name != ((Object)0)) {
			sp = ((Object)0).sign_find(name);
			if (sp == ((Object)0)) {
				return ;
			} 
		} 
		dictvar_S dictvar_S = new dictvar_S();
		sign generatedSn_next = sp.getSn_next();
		for (; sp != ((Object)0) && !got_int; sp = generatedSn_next) {
			if ((dict = dictvar_S.dict_alloc_id(.aid_sign_getlist)) == ((Object)0)) {
				return ;
			} 
			if (ModernizedCProgram.list_append_dict(retlist, dict) == 0) {
				return ;
			} 
			ModernizedCProgram.sign_getinfo(sp, dict);
			if (name != ((Object)0)) {
				break;
			} 
		}
	}
	public void sign_define_multiple(listvar_S retlist) {
		listitem_T li = new listitem_T();
		int retval;
		 generatedLi_tv = li.getLi_tv();
		Object generatedV_type = generatedLi_tv.getV_type();
		Object generatedVval = generatedLi_tv.getVval();
		listitem_S generatedLi_next = li.getLi_next();
		for (li = ModernizedCProgram.l.getLv_first(); li != ((Object)0); li = generatedLi_next) {
			retval = -1;
			if (generatedV_type == .VAR_DICT) {
				retval = generatedVval.getV_dict().sign_define_from_dict(((Object)0));
			} else {
					ModernizedCProgram.emsg(((byte)(e_dictreq)));
			} 
			retlist.list_append_number(retval/*
			 * "sign_define()" function
			 */);
		}
	}
	public void sign_undefine_multiple(listvar_S retlist) {
		char_u name = new char_u();
		listitem_T li = new listitem_T();
		int retval;
		 generatedLi_tv = li.getLi_tv();
		listitem_S generatedLi_next = li.getLi_next();
		for (li = ModernizedCProgram.l.getLv_first(); li != ((Object)0); li = generatedLi_next) {
			retval = -1;
			name = generatedLi_tv.tv_get_string_chk();
			if (name != ((Object)0) && (ModernizedCProgram.sign_undefine_by_name(name, 1) == 1)) {
				retval = 0;
			} 
			retlist.list_append_number(retval/*
			 * "sign_undefine()" function
			 */);
		}
	}
	public listitem_S getLv_first() {
		return lv_first;
	}
	public void setLv_first(listitem_S newLv_first) {
		lv_first = newLv_first;
	}
	public listitem_S getLv_last() {
		return lv_last;
	}
	public void setLv_last(listitem_S newLv_last) {
		lv_last = newLv_last;
	}
	public listwatch_S getLv_watch() {
		return lv_watch;
	}
	public void setLv_watch(listwatch_S newLv_watch) {
		lv_watch = newLv_watch;
	}
	public listitem_S getLv_idx_item() {
		return lv_idx_item;
	}
	public void setLv_idx_item(listitem_S newLv_idx_item) {
		lv_idx_item = newLv_idx_item;
	}
	public listvar_S getLv_copylist() {
		return lv_copylist;
	}
	public void setLv_copylist(listvar_S newLv_copylist) {
		lv_copylist = newLv_copylist;
	}
	public listvar_S getLv_used_next() {
		return lv_used_next;
	}
	public void setLv_used_next(listvar_S newLv_used_next) {
		lv_used_next = newLv_used_next;
	}
	public listvar_S getLv_used_prev() {
		return lv_used_prev;
	}
	public void setLv_used_prev(listvar_S newLv_used_prev) {
		lv_used_prev = newLv_used_prev;
	}
	public int getLv_refcount() {
		return lv_refcount;
	}
	public void setLv_refcount(int newLv_refcount) {
		lv_refcount = newLv_refcount;
	}
	public int getLv_len() {
		return lv_len;
	}
	public void setLv_len(int newLv_len) {
		lv_len = newLv_len;
	}
	public int getLv_idx() {
		return lv_idx;
	}
	public void setLv_idx(int newLv_idx) {
		lv_idx = newLv_idx;
	}
	public int getLv_copyID() {
		return lv_copyID;
	}
	public void setLv_copyID(int newLv_copyID) {
		lv_copyID = newLv_copyID;
	}
	public byte getLv_lock() {
		return lv_lock;
	}
	public void setLv_lock(byte newLv_lock) {
		lv_lock = newLv_lock;
	}
}
