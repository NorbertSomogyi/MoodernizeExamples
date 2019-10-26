package application;

public class VTermState {
	private VTerm vt;
	private Object callbacks;
	private Object cbdata;
	private Object fallbacks;
	private Object fbdata;
	private int rows;
	private int cols;
	private  pos;
	private int at_phantom;
	private int scrollregion_top;
	private int scrollregion_bottom;
	private int scrollregion_left;
	private int scrollregion_right;
	private Byte tabstops;
	private  lineinfo;
	private int mouse_col;
	private int mouse_row;
	private int mouse_buttons;
	private int mouse_flags;
	private  mouse_protocol;
	private Object combine_chars;
	private Object combine_chars_size;
	private int combine_width;
	private  combine_pos;
	private  mode;
	private Object encoding;
	private  encoding_utf8;
	private int gl_set;
	private int gr_set;
	private int gsingle_set;
	private VTermPen pen;
	private  default_fg;
	private  default_bg;
	private Object colors;
	private int fg_index;
	private int bg_index;
	private int bold_is_highbright;
	private int protected_cell;
	private  saved;
	
	public VTermState(VTerm vt, Object callbacks, Object cbdata, Object fallbacks, Object fbdata, int rows, int cols,  pos, int at_phantom, int scrollregion_top, int scrollregion_bottom, int scrollregion_left, int scrollregion_right, Byte tabstops,  lineinfo, int mouse_col, int mouse_row, int mouse_buttons, int mouse_flags,  mouse_protocol, Object combine_chars, Object combine_chars_size, int combine_width,  combine_pos,  mode, Object encoding,  encoding_utf8, int gl_set, int gr_set, int gsingle_set, VTermPen pen,  default_fg,  default_bg, Object colors, int fg_index, int bg_index, int bold_is_highbright, int protected_cell,  saved) {
		setVt(vt);
		setCallbacks(callbacks);
		setCbdata(cbdata);
		setFallbacks(fallbacks);
		setFbdata(fbdata);
		setRows(rows);
		setCols(cols);
		setPos(pos);
		setAt_phantom(at_phantom);
		setScrollregion_top(scrollregion_top);
		setScrollregion_bottom(scrollregion_bottom);
		setScrollregion_left(scrollregion_left);
		setScrollregion_right(scrollregion_right);
		setTabstops(tabstops);
		setLineinfo(lineinfo);
		setMouse_col(mouse_col);
		setMouse_row(mouse_row);
		setMouse_buttons(mouse_buttons);
		setMouse_flags(mouse_flags);
		setMouse_protocol(mouse_protocol);
		setCombine_chars(combine_chars);
		setCombine_chars_size(combine_chars_size);
		setCombine_width(combine_width);
		setCombine_pos(combine_pos);
		setMode(mode);
		setEncoding(encoding);
		setEncoding_utf8(encoding_utf8);
		setGl_set(gl_set);
		setGr_set(gr_set);
		setGsingle_set(gsingle_set);
		setPen(pen);
		setDefault_fg(default_fg);
		setDefault_bg(default_bg);
		setColors(colors);
		setFg_index(fg_index);
		setBg_index(bg_index);
		setBold_is_highbright(bold_is_highbright);
		setProtected_cell(protected_cell);
		setSaved(saved);
	}
	public VTermState() {
	}
	
	public VTermState vterm_state_new(VTerm vt) {
		VTermState state = vt.vterm_allocator_malloc();
		if (state == ((Object)0)) {
			return ((Object)0);
		} 
		state.setVt(vt);
		int generatedRows = vt.getRows();
		state.setRows(generatedRows);
		int generatedCols = vt.getCols();
		state.setCols(generatedCols);
		state.setMouse_col(0);
		state.setMouse_row(0);
		state.setMouse_buttons(0);
		state.setMouse_protocol(.MOUSE_X10);
		state.setCallbacks(((Object)0));
		state.setCbdata(((Object)0));
		state.vterm_state_newpen();
		state.setBold_is_highbright(0);
		return state;
	}
	public void vterm_state_free() {
		ModernizedCProgram.state.getVt().vterm_allocator_free(ModernizedCProgram.state.getTabstops());
		ModernizedCProgram.state.getVt().vterm_allocator_free(ModernizedCProgram.state.getLineinfo());
		ModernizedCProgram.state.getVt().vterm_allocator_free(ModernizedCProgram.state.getCombine_chars());
		ModernizedCProgram.state.getVt().vterm_allocator_free(ModernizedCProgram.state);
	}
	public void linefeed() {
		if (ModernizedCProgram.state.getPos().getRow() == ((ModernizedCProgram.state).getScrollregion_bottom() > -1 ? (ModernizedCProgram.state).getScrollregion_bottom() : (ModernizedCProgram.state).getRows()) - 1) {
			VTermRect rect = new VTermRect();
			rect.setStart_row(ModernizedCProgram.state.getScrollregion_top());
			rect.setEnd_row(((ModernizedCProgram.state).getScrollregion_bottom() > -1 ? (ModernizedCProgram.state).getScrollregion_bottom() : (ModernizedCProgram.state).getRows()));
			rect.setStart_col(((ModernizedCProgram.state).getMode().getLeftrightmargin() ? (ModernizedCProgram.state).getScrollregion_left() : 0));
			rect.setEnd_col(((ModernizedCProgram.state).getMode().getLeftrightmargin() && (ModernizedCProgram.state).getScrollregion_right() > -1 ? (ModernizedCProgram.state).getScrollregion_right() : (ModernizedCProgram.state).getCols()));
			ModernizedCProgram.scroll(ModernizedCProgram.state, rect, 1, 0);
		}  else if (ModernizedCProgram.state.getPos().getRow() < ModernizedCProgram.state.getRows() - 1) {
			ModernizedCProgram.state.getPos().getRow()++;
		} 
	}
	public void grow_combine_buffer() {
		size_t new_size = ModernizedCProgram.state.getCombine_chars_size() * 2;
		uint32_t new_chars = ModernizedCProgram.state.getVt().vterm_allocator_malloc(new_size * );
		.memcpy(new_chars, ModernizedCProgram.state.getCombine_chars(), ModernizedCProgram.state.getCombine_chars_size() * );
		ModernizedCProgram.state.getVt().vterm_allocator_free(ModernizedCProgram.state.getCombine_chars());
		ModernizedCProgram.state.setCombine_chars(new_chars);
		ModernizedCProgram.state.setCombine_chars_size(new_size);
	}
	public void set_col_tabstop(int col) {
		byte mask = 1 << (col & 7);
		ModernizedCProgram.state.getTabstops()[col >> 3] |=  mask;
	}
	public void clear_col_tabstop(int col) {
		byte mask = 1 << (col & 7);
		ModernizedCProgram.state.getTabstops()[col >> 3] &=  ~mask;
	}
	public int is_col_tabstop(int col) {
		byte mask = 1 << (col & 7);
		return ModernizedCProgram.state.getTabstops()[col >> 3] & mask;
	}
	public void tab(int count, int direction) {
		while (count > 0) {
			if (direction > 0) {
				if (ModernizedCProgram.state.getPos().getCol() >= ((ModernizedCProgram.state).getLineinfo()[((ModernizedCProgram.state).getPos().getRow())].getDoublewidth() ? ((ModernizedCProgram.state).getCols() / 2) : (ModernizedCProgram.state).getCols()) - 1) {
					return ;
				} 
				ModernizedCProgram.state.getPos().getCol()++;
			}  else if (direction < 0) {
				if (ModernizedCProgram.state.getPos().getCol() < 1) {
					return ;
				} 
				ModernizedCProgram.state.getPos().getCol()--;
			} 
			if (ModernizedCProgram.state.is_col_tabstop(ModernizedCProgram.state.getPos().getCol())) {
				count--;
			} 
		}
	}
	public void set_lineinfo(int row, int force, int dwl, int dhl) {
		VTermLineInfo info = ModernizedCProgram.state.getLineinfo()[row];
		if (dwl == 0) {
			info.setDoublewidth(0);
		}  else if (dwl == 1) {
			info.setDoublewidth(1);
		} 
		if (dhl == 0) {
			info.setDoubleheight(0);
		}  else if (dhl == 1) {
			info.setDoubleheight(1);
		}  else if (dhl == 2) {
			info.setDoubleheight(2);
		} 
		if ((ModernizedCProgram.state.getCallbacks() && ModernizedCProgram.state.getCallbacks().getSetlineinfo() && .UNRECOGNIZEDFUNCTIONNAME(row, info, ModernizedCProgram.state.getLineinfo() + row, ModernizedCProgram.state.getCbdata())) || force) {
			ModernizedCProgram.state.getLineinfo()[row] = info;
		} 
	}
	public int settermprop_bool( prop, int v) {
		VTermValue val = new VTermValue();
		val.setBoolean(v);
		return ModernizedCProgram.vterm_state_set_termprop(ModernizedCProgram.state, prop, val);
	}
	public int settermprop_int( prop, int v) {
		VTermValue val = new VTermValue();
		val.setNumber(v);
		return ModernizedCProgram.vterm_state_set_termprop(ModernizedCProgram.state, prop, val);
	}
	public int settermprop_string( prop, Object str, Object len) {
		byte strvalue;
		int r;
		VTermValue val = new VTermValue();
		strvalue = ModernizedCProgram.state.getVt().vterm_allocator_malloc((len + 1) * );
		.strncpy(strvalue, str, len);
		strvalue[len] = 0;
		val.setString(strvalue);
		r = ModernizedCProgram.vterm_state_set_termprop(ModernizedCProgram.state, prop, val);
		ModernizedCProgram.state.getVt().vterm_allocator_free(strvalue);
		return r;
	}
	public void savecursor(int save) {
		if (save) {
			ModernizedCProgram.state.getSaved().setPos(ModernizedCProgram.state.getPos());
			ModernizedCProgram.state.getSaved().getMode().setCursor_visible(ModernizedCProgram.state.getMode().getCursor_visible());
			ModernizedCProgram.state.getSaved().getMode().setCursor_blink(ModernizedCProgram.state.getMode().getCursor_blink());
			ModernizedCProgram.state.getSaved().getMode().setCursor_shape(ModernizedCProgram.state.getMode().getCursor_shape());
			ModernizedCProgram.state.vterm_state_savepen(1);
		} else {
				VTermPos oldpos = ModernizedCProgram.state.getPos();
				ModernizedCProgram.state.setPos(ModernizedCProgram.state.getSaved().getPos());
				ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_CURSORVISIBLE, ModernizedCProgram.state.getSaved().getMode().getCursor_visible());
				ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_CURSORBLINK, ModernizedCProgram.state.getSaved().getMode().getCursor_blink());
				ModernizedCProgram.state.settermprop_int(.VTERM_PROP_CURSORSHAPE, ModernizedCProgram.state.getSaved().getMode().getCursor_shape());
				ModernizedCProgram.state.vterm_state_savepen(0);
				ModernizedCProgram.updatecursor(ModernizedCProgram.state, oldpos, 1);
		} 
	}
	public void set_mode(int num, int val) {
		switch (num) {
		case 4:
				ModernizedCProgram.state.getMode().setInsert(val);
				break;
		case 20:
				ModernizedCProgram.state.getMode().setNewline(val);
				break;
		default:
				;
				return ;
		}
	}
	public void set_dec_mode(int num, int val) {
		switch (num) {
		case 1:
				ModernizedCProgram.state.getMode().setCursor(val);
				break;
		case 1005:
				ModernizedCProgram.state.setMouse_protocol(val ? .MOUSE_UTF8 : .MOUSE_X10);
				break;
		case 25:
				ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_CURSORVISIBLE, val);
				break;
		case 1003:
				ModernizedCProgram.state.settermprop_int(.VTERM_PROP_MOUSE, !val ? .VTERM_PROP_MOUSE_NONE : (num == 1000) ? .VTERM_PROP_MOUSE_CLICK : (num == 1002) ? .VTERM_PROP_MOUSE_DRAG : .VTERM_PROP_MOUSE_MOVE);
				break;
		case 1000:
		case 1048:
				ModernizedCProgram.state.savecursor(val);
				break;
		case 69:
				ModernizedCProgram.state.getMode().setLeftrightmargin(val);
				if (val) {
					int row;
					for (row = 0; row < ModernizedCProgram.state.getRows(); row++) {
						ModernizedCProgram.state.set_lineinfo(row, 1, 0, 0);
					}
				} 
				break;
		case 6:
				{ 
					VTermPos oldpos = ModernizedCProgram.state.getPos();
					ModernizedCProgram.state.getMode().setOrigin(val);
					ModernizedCProgram.state.getPos().setRow(ModernizedCProgram.state.getMode().getOrigin() ? ModernizedCProgram.state.getScrollregion_top() : 0);
					ModernizedCProgram.state.getPos().setCol(ModernizedCProgram.state.getMode().getOrigin() ? ((ModernizedCProgram.state).getMode().getLeftrightmargin() ? (ModernizedCProgram.state).getScrollregion_left() : 0) : 0);
					ModernizedCProgram.updatecursor(ModernizedCProgram.state, oldpos, 1);
				}
				break;
		case 5:
				ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_REVERSE, val);
				break;
		case 7:
				ModernizedCProgram.state.getMode().setAutowrap(val);
				break;
		case 1004:
				ModernizedCProgram.state.getMode().setReport_focus(val);
				break;
		case 2004:
				ModernizedCProgram.state.getMode().setBracketpaste(val);
				break;
		case 1049:
				ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_ALTSCREEN, val);
				ModernizedCProgram.state.savecursor(val);
				break;
		case 1002:
		case 12:
				ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_CURSORBLINK, val);
				break;
		case 1006:
				ModernizedCProgram.state.setMouse_protocol(val ? .MOUSE_SGR : .MOUSE_X10);
				break;
		case 1015:
				ModernizedCProgram.state.setMouse_protocol(val ? .MOUSE_RXVT : .MOUSE_X10);
				break;
		case 1047:
				ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_ALTSCREEN, val);
				break;
		default:
				;
				return ;
		}
	}
	public void request_dec_mode(int num) {
		int reply;
		switch (num) {
		case 1005:
				reply = ModernizedCProgram.state.getMouse_protocol() == .MOUSE_UTF8;
				break;
		case 6:
				reply = ModernizedCProgram.state.getMode().getOrigin();
				break;
		case 5:
				reply = ModernizedCProgram.state.getMode().getScreen();
				break;
		case 1002:
				reply = ModernizedCProgram.state.getMouse_flags() == (-1024 | -1024);
				break;
		case 1:
				reply = ModernizedCProgram.state.getMode().getCursor();
				break;
		case 25:
				reply = ModernizedCProgram.state.getMode().getCursor_visible();
				break;
		case 1015:
				reply = ModernizedCProgram.state.getMouse_protocol() == .MOUSE_RXVT;
				break;
		case 12:
				reply = ModernizedCProgram.state.getMode().getCursor_blink();
				break;
		case 1006:
				reply = ModernizedCProgram.state.getMouse_protocol() == .MOUSE_SGR;
				break;
		case 1047:
				reply = ModernizedCProgram.state.getMode().getAlt_screen();
				break;
		case 1004:
				reply = ModernizedCProgram.state.getMode().getReport_focus();
				break;
		case 1000:
				reply = ModernizedCProgram.state.getMouse_flags() == -1024;
				break;
		case 1003:
				reply = ModernizedCProgram.state.getMouse_flags() == (-1024 | -1024);
				break;
		case 7:
				reply = ModernizedCProgram.state.getMode().getAutowrap();
				break;
		case 69:
				reply = ModernizedCProgram.state.getMode().getLeftrightmargin();
				break;
		case 2004:
				reply = ModernizedCProgram.state.getMode().getBracketpaste();
				break;
		default:
				ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "?%d;%d$y", num, 0);
				return ;
		}
		ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "?%d;%d$y", num, reply ? 1 : 2);
	}
	public void request_status_string(Object command, Object cmdlen) {
		if (cmdlen == 1) {
			switch (command[0]) {
			case (byte)'m':
					{ 
						long[] args = new long[20];
						int argc = ModernizedCProgram.state.vterm_state_getpen(args,  / );
						int argi;
						ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_DCS, "1$r");
						for (argi = 0; argi < argc; argi++) {
							ModernizedCProgram.state.getVt().vterm_push_output_sprintf(argi == argc - 1 ? "%d" : ((args[argi]) & (-1024 << 31)) ? "%d:" : "%d;", ((args[argi]) & (~(-1024 << 31))));
						}
						ModernizedCProgram.state.getVt().vterm_push_output_sprintf("m");
						ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_ST, "");
					}
					return ;
			case (byte)'r':
					ModernizedCProgram.state.getVt().vterm_push_output_sprintf_dcs("1$r%d;%dr", ModernizedCProgram.state.getScrollregion_top() + 1, ((ModernizedCProgram.state).getScrollregion_bottom() > -1 ? (ModernizedCProgram.state).getScrollregion_bottom() : (ModernizedCProgram.state).getRows()));
					return ;
			case (byte)'s':
					ModernizedCProgram.state.getVt().vterm_push_output_sprintf_dcs("1$r%d;%ds", ((ModernizedCProgram.state).getMode().getLeftrightmargin() ? (ModernizedCProgram.state).getScrollregion_left() : 0) + 1, ((ModernizedCProgram.state).getMode().getLeftrightmargin() && (ModernizedCProgram.state).getScrollregion_right() > -1 ? (ModernizedCProgram.state).getScrollregion_right() : (ModernizedCProgram.state).getCols()));
					return ;
			}
		} 
		if (cmdlen == 2) {
			if ((.strncmp(command, " q", 2) == 0)) {
				int reply;
				switch (ModernizedCProgram.state.getMode().getCursor_shape()) {
				case .VTERM_PROP_CURSORSHAPE_BLOCK:
						reply = 2;
						break;
				case .VTERM_PROP_CURSORSHAPE_UNDERLINE:
						reply = 4;
						break;
				default:
						reply = /* VTERM_PROP_CURSORSHAPE_BAR_LEFT */6;
						break;
				}
				if (ModernizedCProgram.state.getMode().getCursor_blink()) {
					reply--;
				} 
				ModernizedCProgram.state.getVt().vterm_push_output_sprintf_dcs("1$r%d q", reply);
				return ;
			}  else if ((.strncmp(command, "\"q", 2) == 0)) {
				ModernizedCProgram.state.getVt().vterm_push_output_sprintf_dcs("1$r%d\"q", ModernizedCProgram.state.getProtected_cell() ? 1 : 2);
				return ;
			} 
		} 
		ModernizedCProgram.state.getVt().vterm_push_output_sprintf_dcs("0$r%.s", (int)cmdlen, command);
	}
	public VTermState vterm_obtain_state(VTerm vt) {
		VTermState state = new VTermState();
		VTermState generatedState = vt.getState();
		if (generatedState) {
			return generatedState;
		} 
		VTermState vTermState = new VTermState();
		state = vTermState.vterm_state_new(vt);
		if (state == ((Object)0)) {
			return ((Object)0);
		} 
		vt.setState(state);
		state.setCombine_chars_size(16);
		VTerm generatedVt = state.getVt();
		Object generatedCombine_chars_size = state.getCombine_chars_size();
		Object generatedCombine_chars = state.getCombine_chars();
		state.setCombine_chars(generatedVt.vterm_allocator_malloc(generatedCombine_chars_size * ));
		int generatedCols = state.getCols();
		state.setTabstops(generatedVt.vterm_allocator_malloc((generatedCols + 7) / 8));
		int generatedRows = state.getRows();
		state.setLineinfo(generatedVt.vterm_allocator_malloc(generatedRows * ));
		VTermEncoding vTermEncoding = new VTermEncoding();
		 generatedEncoding_utf8 = state.getEncoding_utf8();
		generatedEncoding_utf8.setEnc(vTermEncoding.vterm_lookup_encoding(.ENC_UTF8, (byte)'u'));
		Object generatedEnc = generatedEncoding_utf8.getEnc();
		Object generatedData = generatedEncoding_utf8.getData();
		if (generatedEnc.getInit() != ((Object)0)) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedEnc, generatedData);
		} 
		vt.vterm_parser_set_callbacks(ModernizedCProgram.parser_callbacks, state);
		return state;
	}
	public void vterm_state_reset(int hard) {
		VTermEncoding default_enc = new VTermEncoding();
		ModernizedCProgram.state.setScrollregion_top(0);
		ModernizedCProgram.state.setScrollregion_bottom(-1);
		ModernizedCProgram.state.setScrollregion_left(0);
		ModernizedCProgram.state.setScrollregion_right(-1);
		ModernizedCProgram.state.getMode().setKeypad(0);
		ModernizedCProgram.state.getMode().setCursor(0);
		ModernizedCProgram.state.getMode().setAutowrap(1);
		ModernizedCProgram.state.getMode().setInsert(0);
		ModernizedCProgram.state.getMode().setNewline(0);
		ModernizedCProgram.state.getMode().setAlt_screen(0);
		ModernizedCProgram.state.getMode().setOrigin(0);
		ModernizedCProgram.state.getMode().setLeftrightmargin(0);
		ModernizedCProgram.state.getMode().setBracketpaste(0);
		ModernizedCProgram.state.getMode().setReport_focus(0);
		ModernizedCProgram.state.getVt().getMode().setCtrl8bit(0);
		{ 
			int col;
			for (col = 0; col < ModernizedCProgram.state.getCols(); col++) {
				if (col % 8 == 0) {
					ModernizedCProgram.state.set_col_tabstop(col);
				} else {
						ModernizedCProgram.state.clear_col_tabstop(col);
				} 
			}
		}
		{ 
			int row;
			for (row = 0; row < ModernizedCProgram.state.getRows(); row++) {
				ModernizedCProgram.state.set_lineinfo(row, 1, 0, 0);
			}
		}
		if (ModernizedCProgram.state.getCallbacks() && ModernizedCProgram.state.getCallbacks().getInitpen()) {
			.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.state.getCbdata());
		} 
		ModernizedCProgram.state.vterm_state_resetpen();
		VTermEncoding vTermEncoding = new VTermEncoding();
		default_enc = ModernizedCProgram.state.getVt().getMode().getUtf8() ? vTermEncoding.vterm_lookup_encoding(.ENC_UTF8, (byte)'u') : vTermEncoding.vterm_lookup_encoding(.ENC_SINGLE_94, (byte)'B');
		Object generatedInit = default_enc.getInit();
		{ 
			int i;
			for (i = 0; i < 4; i++) {
				ModernizedCProgram.state.getEncoding()[i].setEnc(default_enc);
				if (generatedInit) {
					.UNRECOGNIZEDFUNCTIONNAME(default_enc, ModernizedCProgram.state.getEncoding()[i].getData());
				} 
			}
		}
		ModernizedCProgram.state.setGl_set(0);
		ModernizedCProgram.state.setGr_set(1);
		ModernizedCProgram.state.setGsingle_set(0);
		ModernizedCProgram.state.setProtected_cell(0);
		// Initialise the props// Initialise the propsModernizedCProgram.state.settermprop_bool(.VTERM_PROP_CURSORVISIBLE, 1);
		ModernizedCProgram.state.settermprop_bool(.VTERM_PROP_CURSORBLINK, 1);
		ModernizedCProgram.state.settermprop_int(.VTERM_PROP_CURSORSHAPE, .VTERM_PROP_CURSORSHAPE_BLOCK);
		if (hard) {
			VTermRect rect = new VTermRect(0, 0, 0, 0);
			ModernizedCProgram.state.getPos().setRow(0);
			ModernizedCProgram.state.getPos().setCol(0);
			ModernizedCProgram.state.setAt_phantom(0);
			rect.setEnd_row(ModernizedCProgram.state.getRows());
			rect.setEnd_col(ModernizedCProgram.state.getCols());
			ModernizedCProgram.state.erase(rect, 0);
		} 
	}
	public void vterm_state_set_callbacks(Object callbacks, Object user) {
		if (callbacks) {
			ModernizedCProgram.state.setCallbacks(callbacks);
			ModernizedCProgram.state.setCbdata(user);
			if (ModernizedCProgram.state.getCallbacks() && ModernizedCProgram.state.getCallbacks().getInitpen()) {
				.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.state.getCbdata());
			} 
		} else {
				ModernizedCProgram.state.setCallbacks(((Object)0));
				ModernizedCProgram.state.setCbdata(((Object)0));
		} 
	}
	public Object vterm_state_get_cbdata() {
		return ModernizedCProgram.state.getCbdata();
	}
	public void vterm_state_set_unrecognised_fallbacks(Object fallbacks, Object user) {
		if (fallbacks) {
			ModernizedCProgram.state.setFallbacks(fallbacks);
			ModernizedCProgram.state.setFbdata(user);
		} else {
				ModernizedCProgram.state.setFallbacks(((Object)0));
				ModernizedCProgram.state.setFbdata(((Object)0));
		} 
	}
	public Object vterm_state_get_unrecognised_fbdata() {
		return ModernizedCProgram.state.getFbdata();
	}
	public void vterm_state_focus_in() {
		if (ModernizedCProgram.state.getMode().getReport_focus()) {
			ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "I");
		} 
	}
	public void vterm_state_focus_out() {
		if (ModernizedCProgram.state.getMode().getReport_focus()) {
			ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "O");
		} 
	}
	public void setpenattr_bool( attr, int boolean) {
		VTermValue val = new VTermValue();
		val.setBoolean(boolean);
		attr.setpenattr(ModernizedCProgram.state, .VTERM_VALUETYPE_BOOL, val);
	}
	public void setpenattr_int( attr, int number) {
		VTermValue val = new VTermValue();
		val.setNumber(number);
		attr.setpenattr(ModernizedCProgram.state, .VTERM_VALUETYPE_INT, val);
	}
	public void set_pen_col_ansi( attr, long col) {
		VTermColor colp = (attr == .VTERM_ATTR_BACKGROUND) ? ModernizedCProgram.state.getPen().getBg() : ModernizedCProgram.state.getPen().getFg();
		colp.lookup_colour_ansi(ModernizedCProgram.state, col);
		ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, attr, colp);
	}
	public void vterm_state_newpen() {
		int col;
		// 90% grey so that pure white is brighter// 90% grey so that pure white is brighterModernizedCProgram.state.getDefault_fg().setRed(ModernizedCProgram.state.getDefault_fg().setGreen(ModernizedCProgram.state.getDefault_fg().setBlue(240)));
		ModernizedCProgram.state.getDefault_fg().setAnsi_index(0);
		ModernizedCProgram.state.getDefault_bg().setRed(ModernizedCProgram.state.getDefault_bg().setGreen(ModernizedCProgram.state.getDefault_bg().setBlue(0)));
		ModernizedCProgram.state.getDefault_bg().setAnsi_index(0);
		for (col = 0; col < 16; col++) {
			ModernizedCProgram.state.getColors()[col] = ModernizedCProgram.ansi_colors[col];
		}
	}
	public void vterm_state_resetpen() {
		ModernizedCProgram.state.getPen().setBold(0);
		ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BOLD, 0);
		ModernizedCProgram.state.getPen().setUnderline(0);
		ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_UNDERLINE, 0);
		ModernizedCProgram.state.getPen().setItalic(0);
		ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_ITALIC, 0);
		ModernizedCProgram.state.getPen().setBlink(0);
		ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BLINK, 0);
		ModernizedCProgram.state.getPen().setReverse(0);
		ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_REVERSE, 0);
		ModernizedCProgram.state.getPen().setStrike(0);
		ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_STRIKE, 0);
		ModernizedCProgram.state.getPen().setFont(0);
		ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_FONT, 0);
		ModernizedCProgram.state.setFg_index(-1);
		ModernizedCProgram.state.setBg_index(-1);
		ModernizedCProgram.state.getPen().setFg(ModernizedCProgram.state.getDefault_fg());
		ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_FOREGROUND, ModernizedCProgram.state.getDefault_fg());
		ModernizedCProgram.state.getPen().setBg(ModernizedCProgram.state.getDefault_bg());
		ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_BACKGROUND, ModernizedCProgram.state.getDefault_bg());
	}
	public void vterm_state_savepen(int save) {
		if (save) {
			ModernizedCProgram.state.getSaved().setPen(ModernizedCProgram.state.getPen());
		} else {
				ModernizedCProgram.state.setPen(ModernizedCProgram.state.getSaved().getPen());
				ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BOLD, ModernizedCProgram.state.getPen().getBold());
				ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_UNDERLINE, ModernizedCProgram.state.getPen().getUnderline());
				ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_ITALIC, ModernizedCProgram.state.getPen().getItalic());
				ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BLINK, ModernizedCProgram.state.getPen().getBlink());
				ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_REVERSE, ModernizedCProgram.state.getPen().getReverse());
				ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_STRIKE, ModernizedCProgram.state.getPen().getStrike());
				ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_FONT, ModernizedCProgram.state.getPen().getFont());
				ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_FOREGROUND, ModernizedCProgram.state.getPen().getFg());
				ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_BACKGROUND, ModernizedCProgram.state.getPen().getBg());
		} 
	}
	public void vterm_state_set_default_colors(Object default_fg, Object default_bg) {
		ModernizedCProgram.state.setDefault_fg(default_fg);
		ModernizedCProgram.state.setDefault_bg(default_bg);
	}
	public void vterm_state_set_palette_color(int index, Object col) {
		if (index >= 0 && index < 16) {
			ModernizedCProgram.state.getColors()[index] = col;
			ModernizedCProgram.state.getColors()[index].setAnsi_index(index + 1);
		} 
	}
	public void vterm_state_set_bold_highbright(int bold_is_highbright) {
		ModernizedCProgram.state.setBold_is_highbright(bold_is_highbright);
	}
	public void vterm_state_setpen(Object args, int argcount) {
		// SGR - ECMA-48 8.3.117int argi = 0;
		int value;
		while (argi < argcount) {
			int done = 1;
			long arg;
			switch (arg = ((args[argi]) & (~(-1024 << 31)))) {
			case 107:
					value = ((args[argi]) & (~(-1024 << 31))) - 100 + 8;
					ModernizedCProgram.state.setBg_index(value);
					ModernizedCProgram.state.set_pen_col_ansi(.VTERM_ATTR_BACKGROUND, value);
					break;
			case 7:
					ModernizedCProgram.state.getPen().setReverse(1);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_REVERSE, 1);
					break;
			case 23:
					ModernizedCProgram.state.getPen().setItalic(0);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_ITALIC, 0);
					break;
			case 15:
			case 47:
					value = ((args[argi]) & (~(-1024 << 31))) - 40;
					ModernizedCProgram.state.setBg_index(value);
					ModernizedCProgram.state.set_pen_col_ansi(.VTERM_ATTR_BACKGROUND, value);
					break;
			case 32:
			case 43:
			case 4:
					ModernizedCProgram.state.getPen().setUnderline(1);
					ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_UNDERLINE, 1);
					break;
			case 0:
					ModernizedCProgram.state.vterm_state_resetpen();
					break;
			case 11:
			case 1:
					ModernizedCProgram.state.getPen().setBold(1);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BOLD, 1);
					if (ModernizedCProgram.state.getFg_index() > -1 && ModernizedCProgram.state.getFg_index() < 8 && ModernizedCProgram.state.getBold_is_highbright()) {
						ModernizedCProgram.state.set_pen_col_ansi(.VTERM_ATTR_FOREGROUND, ModernizedCProgram.state.getFg_index() + (ModernizedCProgram.state.getPen().getBold() ? 8 : 0));
					} 
					break;
			case 18:
			case 33:
			case 27:
					ModernizedCProgram.state.getPen().setReverse(0);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_REVERSE, 0);
					break;
			case 30:
			case 106:
			case 17:
			case 34:
			case 39:
					ModernizedCProgram.state.setFg_index(-1);
					ModernizedCProgram.state.getPen().setFg(ModernizedCProgram.state.getDefault_fg());
					ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_FOREGROUND, ModernizedCProgram.state.getPen().getFg());
					break;
			case 14:
			case 10:
			case 3:
					ModernizedCProgram.state.getPen().setItalic(1);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_ITALIC, 1);
					break;
			case 97:
					value = ((args[argi]) & (~(-1024 << 31))) - 90 + 8;
					ModernizedCProgram.state.setFg_index(value);
					ModernizedCProgram.state.set_pen_col_ansi(.VTERM_ATTR_FOREGROUND, value);
					break;
			case 46:
			case 48:
					ModernizedCProgram.state.setBg_index(-1);
					if (argcount - argi < 1) {
						return ;
					} 
					argi += 1 + ModernizedCProgram.state.getPen().getBg().lookup_colour(ModernizedCProgram.state, ((args[argi + 1]) & (~(-1024 << 31))), args + argi + 2, argcount - argi - 2, ModernizedCProgram.state.getBg_index());
					ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_BACKGROUND, ModernizedCProgram.state.getPen().getBg());
					break;
			case 40:
			case 95:
			case 104:
			case 91:
			case ((1 << 30) - 1):
			case 22:
					ModernizedCProgram.state.getPen().setBold(0);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BOLD, 0);
					break;
			case 29:
					ModernizedCProgram.state.getPen().setStrike(0);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_STRIKE, 0);
					break;
			case 31:
			case 12:
			case 102:
			case 42:
			case 44:
			case 45:
			case 5:
					ModernizedCProgram.state.getPen().setBlink(1);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BLINK, 1);
					break;
			case 37:
					value = ((args[argi]) & (~(-1024 << 31))) - 30;
					ModernizedCProgram.state.setFg_index(value);
					if (ModernizedCProgram.state.getPen().getBold() && ModernizedCProgram.state.getBold_is_highbright()) {
						value += 8;
					} 
					ModernizedCProgram.state.set_pen_col_ansi(.VTERM_ATTR_FOREGROUND, value);
					break;
			case 105:
			case 100:
			case 103:
			case 41:
			case 94:
			case 25:
					ModernizedCProgram.state.getPen().setBlink(0);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_BLINK, 0);
					break;
			case 93:
			case 35:
			case 92:
			case 90:
			case 19:
					ModernizedCProgram.state.getPen().setFont(((args[argi]) & (~(-1024 << 31))) - 10);
					ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_FONT, ModernizedCProgram.state.getPen().getFont());
					break;
			case 36:
			case 38:
					ModernizedCProgram.state.setFg_index(-1);
					if (argcount - argi < 1) {
						return ;
					} 
					argi += 1 + ModernizedCProgram.state.getPen().getFg().lookup_colour(ModernizedCProgram.state, ((args[argi + 1]) & (~(-1024 << 31))), args + argi + 2, argcount - argi - 2, ModernizedCProgram.state.getFg_index());
					ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_FOREGROUND, ModernizedCProgram.state.getPen().getFg());
					break;
			case 49:
					ModernizedCProgram.state.setBg_index(-1);
					ModernizedCProgram.state.getPen().setBg(ModernizedCProgram.state.getDefault_bg());
					ModernizedCProgram.setpenattr_col(ModernizedCProgram.state, .VTERM_ATTR_BACKGROUND, ModernizedCProgram.state.getPen().getBg());
					break;
			case 24:
					ModernizedCProgram.state.getPen().setUnderline(0);
					ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_UNDERLINE, 0);
					break;
			case 9:
					ModernizedCProgram.state.getPen().setStrike(1);
					ModernizedCProgram.state.setpenattr_bool(.VTERM_ATTR_STRIKE, 1);
					break;
			case 13:
			case 21:
					ModernizedCProgram.state.getPen().setUnderline(2);
					ModernizedCProgram.state.setpenattr_int(.VTERM_ATTR_UNDERLINE, 2);
					break;
			case 96:
			case 16:
			case 101:
			default:
					done = 0;
					break;
			}
			if (!done) {
				;
			} 
			while (((args[argi++]) & (-1024 << 31))) {
				;
			}
		}// This logic is easier to do 'done' backwards; set it true, and make it
	}
	public int vterm_state_getpen(Long args, int argcount) {
		int argi = 0;
		if (ModernizedCProgram.state.getPen().getBold()) {
			args[argi++] = 1;
		} 
		if (ModernizedCProgram.state.getPen().getItalic()) {
			args[argi++] = 3;
		} 
		if (ModernizedCProgram.state.getPen().getUnderline() == 1) {
			args[argi++] = 4;
		} 
		if (ModernizedCProgram.state.getPen().getBlink()) {
			args[argi++] = 5;
		} 
		if (ModernizedCProgram.state.getPen().getReverse()) {
			args[argi++] = 7;
		} 
		if (ModernizedCProgram.state.getPen().getStrike()) {
			args[argi++] = 9;
		} 
		if (ModernizedCProgram.state.getPen().getFont()) {
			args[argi++] = 10 + ModernizedCProgram.state.getPen().getFont();
		} 
		if (ModernizedCProgram.state.getPen().getUnderline() == 2) {
			args[argi++] = 21;
		} 
		if (ModernizedCProgram.state.getFg_index() >= 0 && ModernizedCProgram.state.getFg_index() < 8) {
			args[argi++] = 30 + ModernizedCProgram.state.getFg_index();
		}  else if (ModernizedCProgram.state.getFg_index() >= 8 && ModernizedCProgram.state.getFg_index() < 16) {
			args[argi++] = 90 + ModernizedCProgram.state.getFg_index() - 8;
		}  else if (ModernizedCProgram.state.getFg_index() >= 16 && ModernizedCProgram.state.getFg_index() < 256) {
			args[argi++] = (-1024 << 31) | 38;
			args[argi++] = (-1024 << 31) | 5;
			args[argi++] = ModernizedCProgram.state.getFg_index();
		}  else if (ModernizedCProgram.state.getFg_index() == -1) {
			if (ModernizedCProgram.state.getPen().getFg().getRed() != ModernizedCProgram.state.getDefault_fg().getRed() || ModernizedCProgram.state.getPen().getFg().getGreen() != ModernizedCProgram.state.getDefault_fg().getGreen() || ModernizedCProgram.state.getPen().getFg().getBlue() != ModernizedCProgram.state.getDefault_fg().getBlue()) {
				args[argi++] = (-1024 << 31) | 38;
				args[argi++] = (-1024 << 31) | 2;
				args[argi++] = (-1024 << 31) | ModernizedCProgram.state.getPen().getFg().getRed();
				args[argi++] = (-1024 << 31) | ModernizedCProgram.state.getPen().getFg().getGreen();
				args[argi++] = ModernizedCProgram.state.getPen().getFg().getBlue();
			} 
		} 
		if (ModernizedCProgram.state.getBg_index() >= 0 && ModernizedCProgram.state.getBg_index() < 8) {
			args[argi++] = 40 + ModernizedCProgram.state.getBg_index();
		}  else if (ModernizedCProgram.state.getBg_index() >= 8 && ModernizedCProgram.state.getBg_index() < 16) {
			args[argi++] = 100 + ModernizedCProgram.state.getBg_index() - 8;
		}  else if (ModernizedCProgram.state.getBg_index() >= 16 && ModernizedCProgram.state.getBg_index() < 256) {
			args[argi++] = (-1024 << 31) | 48;
			args[argi++] = (-1024 << 31) | 5;
			args[argi++] = ModernizedCProgram.state.getBg_index();
		}  else if (ModernizedCProgram.state.getBg_index() == -1) {
			if (ModernizedCProgram.state.getPen().getBg().getRed() != ModernizedCProgram.state.getDefault_bg().getRed() || ModernizedCProgram.state.getPen().getBg().getGreen() != ModernizedCProgram.state.getDefault_bg().getGreen() || ModernizedCProgram.state.getPen().getBg().getBlue() != ModernizedCProgram.state.getDefault_bg().getBlue()) {
				args[argi++] = (-1024 << 31) | 48;
				args[argi++] = (-1024 << 31) | 2;
				args[argi++] = (-1024 << 31) | ModernizedCProgram.state.getPen().getBg().getRed();
				args[argi++] = (-1024 << 31) | ModernizedCProgram.state.getPen().getBg().getGreen();
				args[argi++] = ModernizedCProgram.state.getPen().getBg().getBlue();
			} 
		} 
		return argi;
	}
	public void output_mouse(int code, int pressed, int modifiers, int col, int row) {
		modifiers <<=  2;
		switch (ModernizedCProgram.state.getMouse_protocol()) {
		case .MOUSE_RXVT:
				if (!pressed) {
					code = 3;
				} 
				ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "%d;%d;%dM", code | modifiers, col + 1, row + 1);
				break;
		case .MOUSE_UTF8:
				{ 
					byte[] utf8 = new byte[18];
					size_t len = 0;
					if (!pressed) {
						code = 3;
					} 
					len += .fill_utf8((code | modifiers) + -1024, utf8 + len);
					len += .fill_utf8(col + -1024, utf8 + len);
					len += .fill_utf8(row + -1024, utf8 + len);
					utf8[len] = 0;
					ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "M%s", utf8);
				}
				break;
		case .MOUSE_SGR:
				ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "<%d;%d;%d%c", code | modifiers, col + 1, row + 1, pressed ? (byte)'M' : (byte)'m');
				break;
		case .MOUSE_X10:
				if (col + -1024 > -1024) {
					col = -1024 - -1024;
				} 
				if (row + -1024 > -1024) {
					row = -1024 - -1024;
				} 
				if (!pressed) {
					code = 3;
				} 
				ModernizedCProgram.state.getVt().vterm_push_output_sprintf_ctrl(.C1_CSI, "M%c%c%c", (code | modifiers) + -1024, col + -1024, row + -1024);
				break;
		}
	}
	public VTerm getVt() {
		return vt;
	}
	public void setVt(VTerm newVt) {
		vt = newVt;
	}
	public Object getCallbacks() {
		return callbacks;
	}
	public void setCallbacks(Object newCallbacks) {
		callbacks = newCallbacks;
	}
	public Object getCbdata() {
		return cbdata;
	}
	public void setCbdata(Object newCbdata) {
		cbdata = newCbdata;
	}
	public Object getFallbacks() {
		return fallbacks;
	}
	public void setFallbacks(Object newFallbacks) {
		fallbacks = newFallbacks;
	}
	public Object getFbdata() {
		return fbdata;
	}
	public void setFbdata(Object newFbdata) {
		fbdata = newFbdata;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int newRows) {
		rows = newRows;
	}
	public int getCols() {
		return cols;
	}
	public void setCols(int newCols) {
		cols = newCols;
	}
	public  getPos() {
		return pos;
	}
	public void setPos( newPos) {
		pos = newPos;
	}
	public int getAt_phantom() {
		return at_phantom;
	}
	public void setAt_phantom(int newAt_phantom) {
		at_phantom = newAt_phantom;
	}
	public int getScrollregion_top() {
		return scrollregion_top;
	}
	public void setScrollregion_top(int newScrollregion_top) {
		scrollregion_top = newScrollregion_top;
	}
	public int getScrollregion_bottom() {
		return scrollregion_bottom;
	}
	public void setScrollregion_bottom(int newScrollregion_bottom) {
		scrollregion_bottom = newScrollregion_bottom;
	}
	public int getScrollregion_left() {
		return scrollregion_left;
	}
	public void setScrollregion_left(int newScrollregion_left) {
		scrollregion_left = newScrollregion_left;
	}
	public int getScrollregion_right() {
		return scrollregion_right;
	}
	public void setScrollregion_right(int newScrollregion_right) {
		scrollregion_right = newScrollregion_right;
	}
	public Byte getTabstops() {
		return tabstops;
	}
	public void setTabstops(Byte newTabstops) {
		tabstops = newTabstops;
	}
	public  getLineinfo() {
		return lineinfo;
	}
	public void setLineinfo( newLineinfo) {
		lineinfo = newLineinfo;
	}
	public int getMouse_col() {
		return mouse_col;
	}
	public void setMouse_col(int newMouse_col) {
		mouse_col = newMouse_col;
	}
	public int getMouse_row() {
		return mouse_row;
	}
	public void setMouse_row(int newMouse_row) {
		mouse_row = newMouse_row;
	}
	public int getMouse_buttons() {
		return mouse_buttons;
	}
	public void setMouse_buttons(int newMouse_buttons) {
		mouse_buttons = newMouse_buttons;
	}
	public int getMouse_flags() {
		return mouse_flags;
	}
	public void setMouse_flags(int newMouse_flags) {
		mouse_flags = newMouse_flags;
	}
	public  getMouse_protocol() {
		return mouse_protocol;
	}
	public void setMouse_protocol( newMouse_protocol) {
		mouse_protocol = newMouse_protocol;
	}
	public Object getCombine_chars() {
		return combine_chars;
	}
	public void setCombine_chars(Object newCombine_chars) {
		combine_chars = newCombine_chars;
	}
	public Object getCombine_chars_size() {
		return combine_chars_size;
	}
	public void setCombine_chars_size(Object newCombine_chars_size) {
		combine_chars_size = newCombine_chars_size;
	}
	public int getCombine_width() {
		return combine_width;
	}
	public void setCombine_width(int newCombine_width) {
		combine_width = newCombine_width;
	}
	public  getCombine_pos() {
		return combine_pos;
	}
	public void setCombine_pos( newCombine_pos) {
		combine_pos = newCombine_pos;
	}
	public  getMode() {
		return mode;
	}
	public void setMode( newMode) {
		mode = newMode;
	}
	public Object getEncoding() {
		return encoding;
	}
	public void setEncoding(Object newEncoding) {
		encoding = newEncoding;
	}
	public  getEncoding_utf8() {
		return encoding_utf8;
	}
	public void setEncoding_utf8( newEncoding_utf8) {
		encoding_utf8 = newEncoding_utf8;
	}
	public int getGl_set() {
		return gl_set;
	}
	public void setGl_set(int newGl_set) {
		gl_set = newGl_set;
	}
	public int getGr_set() {
		return gr_set;
	}
	public void setGr_set(int newGr_set) {
		gr_set = newGr_set;
	}
	public int getGsingle_set() {
		return gsingle_set;
	}
	public void setGsingle_set(int newGsingle_set) {
		gsingle_set = newGsingle_set;
	}
	public VTermPen getPen() {
		return pen;
	}
	public void setPen(VTermPen newPen) {
		pen = newPen;
	}
	public  getDefault_fg() {
		return default_fg;
	}
	public void setDefault_fg( newDefault_fg) {
		default_fg = newDefault_fg;
	}
	public  getDefault_bg() {
		return default_bg;
	}
	public void setDefault_bg( newDefault_bg) {
		default_bg = newDefault_bg;
	}
	public Object getColors() {
		return colors;
	}
	public void setColors(Object newColors) {
		colors = newColors;
	}
	public int getFg_index() {
		return fg_index;
	}
	public void setFg_index(int newFg_index) {
		fg_index = newFg_index;
	}
	public int getBg_index() {
		return bg_index;
	}
	public void setBg_index(int newBg_index) {
		bg_index = newBg_index;
	}
	public int getBold_is_highbright() {
		return bold_is_highbright;
	}
	public void setBold_is_highbright(int newBold_is_highbright) {
		bold_is_highbright = newBold_is_highbright;
	}
	public int getProtected_cell() {
		return protected_cell;
	}
	public void setProtected_cell(int newProtected_cell) {
		protected_cell = newProtected_cell;
	}
	public  getSaved() {
		return saved;
	}
	public void setSaved( newSaved) {
		saved = newSaved;
	}
}
