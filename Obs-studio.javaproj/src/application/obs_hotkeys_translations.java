package application;

public class obs_hotkeys_translations {
	private Object insert;
	private Object del;
	private Object home;
	private Object end;
	private Object page_up;
	private Object page_down;
	private Object num_lock;
	private Object scroll_lock;
	private Object caps_lock;
	private Object backspace;
	private Object tab;
	private Object print;
	private Object pause;
	private Object left;
	private Object right;
	private Object up;
	private Object down;
	private Object shift;
	private Object alt;
	private Object control;
	private Object meta;
	private Object menu;
	private Object space;
	private Object numpad_num;
	private Object numpad_divide;
	private Object numpad_multiply;
	private Object numpad_minus;
	private Object numpad_plus;
	private Object numpad_decimal;
	private Object apple_keypad_num;
	private Object apple_keypad_divide;
	private Object apple_keypad_multiply;
	private Object apple_keypad_minus;
	private Object apple_keypad_plus;
	private Object apple_keypad_decimal;
	private Object apple_keypad_equal;
	private Object mouse_num;
	private Object escape;
	
	public obs_hotkeys_translations(Object insert, Object del, Object home, Object end, Object page_up, Object page_down, Object num_lock, Object scroll_lock, Object caps_lock, Object backspace, Object tab, Object print, Object pause, Object left, Object right, Object up, Object down, Object shift, Object alt, Object control, Object meta, Object menu, Object space, Object numpad_num, Object numpad_divide, Object numpad_multiply, Object numpad_minus, Object numpad_plus, Object numpad_decimal, Object apple_keypad_num, Object apple_keypad_divide, Object apple_keypad_multiply, Object apple_keypad_minus, Object apple_keypad_plus, Object apple_keypad_decimal, Object apple_keypad_equal, Object mouse_num, Object escape) {
		setInsert(insert);
		setDel(del);
		setHome(home);
		setEnd(end);
		setPage_up(page_up);
		setPage_down(page_down);
		setNum_lock(num_lock);
		setScroll_lock(scroll_lock);
		setCaps_lock(caps_lock);
		setBackspace(backspace);
		setTab(tab);
		setPrint(print);
		setPause(pause);
		setLeft(left);
		setRight(right);
		setUp(up);
		setDown(down);
		setShift(shift);
		setAlt(alt);
		setControl(control);
		setMeta(meta);
		setMenu(menu);
		setSpace(space);
		setNumpad_num(numpad_num);
		setNumpad_divide(numpad_divide);
		setNumpad_multiply(numpad_multiply);
		setNumpad_minus(numpad_minus);
		setNumpad_plus(numpad_plus);
		setNumpad_decimal(numpad_decimal);
		setApple_keypad_num(apple_keypad_num);
		setApple_keypad_divide(apple_keypad_divide);
		setApple_keypad_multiply(apple_keypad_multiply);
		setApple_keypad_minus(apple_keypad_minus);
		setApple_keypad_plus(apple_keypad_plus);
		setApple_keypad_decimal(apple_keypad_decimal);
		setApple_keypad_equal(apple_keypad_equal);
		setMouse_num(mouse_num);
		setEscape(escape);
	}
	public obs_hotkeys_translations() {
	}
	
	public void obs_hotkeys_set_translations_s(Object size) {
		obs_hotkeys_translations t = new obs_hotkeys_translations(0);
		dstr numpad = new dstr(0);
		dstr mouse = new dstr(0);
		dstr button = new dstr(0);
		if (!translations) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(t, translations, (size < /*Error: sizeof expression not supported yet*/) ? size : /*Error: sizeof expression not supported yet*/);
		Object generatedInsert = t.getInsert();
		if (generatedInsert) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_INSERT, generatedInsert);
		} 
		;
		Object generatedDel = t.getDel();
		if (generatedDel) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_DELETE, generatedDel);
		} 
		;
		Object generatedHome = t.getHome();
		if (generatedHome) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_HOME, generatedHome);
		} 
		;
		Object generatedEnd = t.getEnd();
		if (generatedEnd) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_END, generatedEnd);
		} 
		;
		Object generatedPage_up = t.getPage_up();
		if (generatedPage_up) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_PAGEUP, generatedPage_up);
		} 
		;
		Object generatedPage_down = t.getPage_down();
		if (generatedPage_down) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_PAGEDOWN, generatedPage_down);
		} 
		;
		Object generatedNum_lock = t.getNum_lock();
		if (generatedNum_lock) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUMLOCK, generatedNum_lock);
		} 
		;
		Object generatedScroll_lock = t.getScroll_lock();
		if (generatedScroll_lock) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_SCROLLLOCK, generatedScroll_lock);
		} 
		;
		Object generatedCaps_lock = t.getCaps_lock();
		if (generatedCaps_lock) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_CAPSLOCK, generatedCaps_lock);
		} 
		;
		Object generatedBackspace = t.getBackspace();
		if (generatedBackspace) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_BACKSPACE, generatedBackspace);
		} 
		;
		Object generatedTab = t.getTab();
		if (generatedTab) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_TAB, generatedTab);
		} 
		;
		Object generatedPrint = t.getPrint();
		if (generatedPrint) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_PRINT, generatedPrint);
		} 
		;
		Object generatedPause = t.getPause();
		if (generatedPause) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_PAUSE, generatedPause);
		} 
		;
		Object generatedShift = t.getShift();
		if (generatedShift) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_SHIFT, generatedShift);
		} 
		;
		Object generatedAlt = t.getAlt();
		if (generatedAlt) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_ALT, generatedAlt);
		} 
		;
		Object generatedControl = t.getControl();
		if (generatedControl) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_CONTROL, generatedControl);
		} 
		;
		Object generatedMeta = t.getMeta();
		if (generatedMeta) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_META, generatedMeta);
		} 
		;
		Object generatedMenu = t.getMenu();
		if (generatedMenu) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MENU, generatedMenu);
		} 
		;
		Object generatedSpace = t.getSpace();
		if (generatedSpace) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_SPACE, generatedSpace);
		} 
		;
		Object generatedEscape = t.getEscape();
		if (generatedEscape) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_ESCAPE, generatedEscape);
		} 
		;
		Object generatedNumpad_num = t.getNumpad_num();
		byte numpad_str = generatedNumpad_num;
		Object generatedNumpad_divide = t.getNumpad_divide();
		if (generatedNumpad_divide) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUMSLASH, generatedNumpad_divide);
		} 
		;
		Object generatedNumpad_multiply = t.getNumpad_multiply();
		if (generatedNumpad_multiply) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUMASTERISK, generatedNumpad_multiply);
		} 
		;
		Object generatedNumpad_minus = t.getNumpad_minus();
		if (generatedNumpad_minus) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUMMINUS, generatedNumpad_minus);
		} 
		;
		Object generatedNumpad_plus = t.getNumpad_plus();
		if (generatedNumpad_plus) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUMPLUS, generatedNumpad_plus);
		} 
		;
		Object generatedNumpad_decimal = t.getNumpad_decimal();
		if (generatedNumpad_decimal) {
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUMPERIOD, generatedNumpad_decimal);
		} 
		;
		Object generatedDstr = button.getDstr();
		if (numpad_str) {
			numpad.dstr_copy(numpad_str);
			numpad.dstr_depad();
			if (ModernizedCProgram.dstr_find(numpad, "%1") == NULL) {
				numpad.dstr_cat(" %1");
			} 
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "0");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM0, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "1");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM1, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "2");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM2, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "3");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM3, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "4");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM4, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "5");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM5, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "6");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM6, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "7");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM7, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "8");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM8, generatedDstr);
			button.dstr_copy_dstr(numpad);
			button.dstr_replace("%1", "9");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_NUM9, generatedDstr);
		} 
		Object generatedMouse_num = t.getMouse_num();
		if (generatedMouse_num) {
			mouse.dstr_copy(generatedMouse_num);
			mouse.dstr_depad();
			if (ModernizedCProgram.dstr_find(mouse, "%1") == NULL) {
				mouse.dstr_cat(" %1");
			} 
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "1");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE1, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "2");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE2, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "3");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE3, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "4");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE4, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "5");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE5, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "6");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE6, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "7");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE7, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "8");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE8, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "9");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE9, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "10");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE10, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "11");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE11, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "12");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE12, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "13");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE13, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "14");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE14, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "15");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE15, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "16");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE16, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "17");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE17, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "18");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE18, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "19");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE19, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "20");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE20, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "21");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE21, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "22");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE22, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "23");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE23, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "24");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE24, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "25");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE25, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "26");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE26, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "27");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE27, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "28");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE28, generatedDstr);
			button.dstr_copy_dstr(mouse);
			button.dstr_replace("%1", "29");
			ModernizedCProgram.obs_set_key_translation(obs_key.OBS_KEY_MOUSE29, generatedDstr);
		} 
		numpad.dstr_free();
		mouse.dstr_free();
		button.dstr_free();
	}
	public Object getInsert() {
		return insert;
	}
	public void setInsert(Object newInsert) {
		insert = newInsert;
	}
	public Object getDel() {
		return del;
	}
	public void setDel(Object newDel) {
		del = newDel;
	}
	public Object getHome() {
		return home;
	}
	public void setHome(Object newHome) {
		home = newHome;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
	public Object getPage_up() {
		return page_up;
	}
	public void setPage_up(Object newPage_up) {
		page_up = newPage_up;
	}
	public Object getPage_down() {
		return page_down;
	}
	public void setPage_down(Object newPage_down) {
		page_down = newPage_down;
	}
	public Object getNum_lock() {
		return num_lock;
	}
	public void setNum_lock(Object newNum_lock) {
		num_lock = newNum_lock;
	}
	public Object getScroll_lock() {
		return scroll_lock;
	}
	public void setScroll_lock(Object newScroll_lock) {
		scroll_lock = newScroll_lock;
	}
	public Object getCaps_lock() {
		return caps_lock;
	}
	public void setCaps_lock(Object newCaps_lock) {
		caps_lock = newCaps_lock;
	}
	public Object getBackspace() {
		return backspace;
	}
	public void setBackspace(Object newBackspace) {
		backspace = newBackspace;
	}
	public Object getTab() {
		return tab;
	}
	public void setTab(Object newTab) {
		tab = newTab;
	}
	public Object getPrint() {
		return print;
	}
	public void setPrint(Object newPrint) {
		print = newPrint;
	}
	public Object getPause() {
		return pause;
	}
	public void setPause(Object newPause) {
		pause = newPause;
	}
	public Object getLeft() {
		return left;
	}
	public void setLeft(Object newLeft) {
		left = newLeft;
	}
	public Object getRight() {
		return right;
	}
	public void setRight(Object newRight) {
		right = newRight;
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
	public Object getShift() {
		return shift;
	}
	public void setShift(Object newShift) {
		shift = newShift;
	}
	public Object getAlt() {
		return alt;
	}
	public void setAlt(Object newAlt) {
		alt = newAlt;
	}
	public Object getControl() {
		return control;
	}
	public void setControl(Object newControl) {
		control = newControl;
	}
	public Object getMeta() {
		return meta;
	}
	public void setMeta(Object newMeta) {
		meta = newMeta;
	}
	public Object getMenu() {
		return menu;
	}
	public void setMenu(Object newMenu) {
		menu = newMenu;
	}
	public Object getSpace() {
		return space;
	}
	public void setSpace(Object newSpace) {
		space = newSpace;
	}
	public Object getNumpad_num() {
		return numpad_num;
	}
	public void setNumpad_num(Object newNumpad_num) {
		numpad_num = newNumpad_num;
	}
	public Object getNumpad_divide() {
		return numpad_divide;
	}
	public void setNumpad_divide(Object newNumpad_divide) {
		numpad_divide = newNumpad_divide;
	}
	public Object getNumpad_multiply() {
		return numpad_multiply;
	}
	public void setNumpad_multiply(Object newNumpad_multiply) {
		numpad_multiply = newNumpad_multiply;
	}
	public Object getNumpad_minus() {
		return numpad_minus;
	}
	public void setNumpad_minus(Object newNumpad_minus) {
		numpad_minus = newNumpad_minus;
	}
	public Object getNumpad_plus() {
		return numpad_plus;
	}
	public void setNumpad_plus(Object newNumpad_plus) {
		numpad_plus = newNumpad_plus;
	}
	public Object getNumpad_decimal() {
		return numpad_decimal;
	}
	public void setNumpad_decimal(Object newNumpad_decimal) {
		numpad_decimal = newNumpad_decimal;
	}
	public Object getApple_keypad_num() {
		return apple_keypad_num;
	}
	public void setApple_keypad_num(Object newApple_keypad_num) {
		apple_keypad_num = newApple_keypad_num;
	}
	public Object getApple_keypad_divide() {
		return apple_keypad_divide;
	}
	public void setApple_keypad_divide(Object newApple_keypad_divide) {
		apple_keypad_divide = newApple_keypad_divide;
	}
	public Object getApple_keypad_multiply() {
		return apple_keypad_multiply;
	}
	public void setApple_keypad_multiply(Object newApple_keypad_multiply) {
		apple_keypad_multiply = newApple_keypad_multiply;
	}
	public Object getApple_keypad_minus() {
		return apple_keypad_minus;
	}
	public void setApple_keypad_minus(Object newApple_keypad_minus) {
		apple_keypad_minus = newApple_keypad_minus;
	}
	public Object getApple_keypad_plus() {
		return apple_keypad_plus;
	}
	public void setApple_keypad_plus(Object newApple_keypad_plus) {
		apple_keypad_plus = newApple_keypad_plus;
	}
	public Object getApple_keypad_decimal() {
		return apple_keypad_decimal;
	}
	public void setApple_keypad_decimal(Object newApple_keypad_decimal) {
		apple_keypad_decimal = newApple_keypad_decimal;
	}
	public Object getApple_keypad_equal() {
		return apple_keypad_equal;
	}
	public void setApple_keypad_equal(Object newApple_keypad_equal) {
		apple_keypad_equal = newApple_keypad_equal;
	}
	public Object getMouse_num() {
		return mouse_num;
	}
	public void setMouse_num(Object newMouse_num) {
		mouse_num = newMouse_num;
	}
	public Object getEscape() {
		return escape;
	}
	public void setEscape(Object newEscape) {
		escape = newEscape;
	}
}
