package application;

public class VTerm {
	private  allocator;
	private Object allocdata;
	private int rows;
	private int cols;
	private  mode;
	private  parser;
	private Byte outbuffer;
	private Object outbuffer_len;
	private Object outbuffer_cur;
	private VTermState state;
	private VTermScreen screen;
	private int in_backspace;
	
	public VTerm( allocator, Object allocdata, int rows, int cols,  mode,  parser, Byte outbuffer, Object outbuffer_len, Object outbuffer_cur, VTermState state, VTermScreen screen, int in_backspace) {
		setAllocator(allocator);
		setAllocdata(allocdata);
		setRows(rows);
		setCols(cols);
		setMode(mode);
		setParser(parser);
		setOutbuffer(outbuffer);
		setOutbuffer_len(outbuffer_len);
		setOutbuffer_cur(outbuffer_cur);
		setState(state);
		setScreen(screen);
		setIn_backspace(in_backspace);
	}
	public VTerm() {
	}
	
	public void do_control(byte control) {
		if (ModernizedCProgram.vt.getParser().getCallbacks() && ModernizedCProgram.vt.getParser().getCallbacks().getControl()) {
			if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(control, ModernizedCProgram.vt.getParser().getCbdata())) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		;
	}
	public void do_csi(byte command) {
		if (ModernizedCProgram.vt.getParser().getCallbacks() && ModernizedCProgram.vt.getParser().getCallbacks().getCsi()) {
			if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.vt.getParser().getCsi_leaderlen() ? ModernizedCProgram.vt.getParser().getCsi_leader() : ((Object)0), ModernizedCProgram.vt.getParser().getCsi_args(), ModernizedCProgram.vt.getParser().getCsi_argi(), ModernizedCProgram.vt.getParser().getIntermedlen() ? ModernizedCProgram.vt.getParser().getIntermed() : ((Object)0), command, ModernizedCProgram.vt.getParser().getCbdata())) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		;
	}
	public void do_escape(byte command) {
		byte[] seq = new byte[16 + 1];
		size_t len = ModernizedCProgram.vt.getParser().getIntermedlen();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(seq, ModernizedCProgram.vt.getParser().getIntermed(), len);
		seq[len++] = command;
		seq[len] = 0;
		if (ModernizedCProgram.vt.getParser().getCallbacks() && ModernizedCProgram.vt.getParser().getCallbacks().getEscape()) {
			if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(seq, len, ModernizedCProgram.vt.getParser().getCbdata())) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		;
	}
	public void append_strbuffer(Object str, Object len) {
		if (len > ModernizedCProgram.vt.getParser().getStrbuffer_len() - ModernizedCProgram.vt.getParser().getStrbuffer_cur()) {
			len = ModernizedCProgram.vt.getParser().getStrbuffer_len() - ModernizedCProgram.vt.getParser().getStrbuffer_cur();
			;
		} 
		if (len > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(ModernizedCProgram.vt.getParser().getStrbuffer() + ModernizedCProgram.vt.getParser().getStrbuffer_cur(), str, len);
			ModernizedCProgram.vt.getParser().getStrbuffer_cur() += len;
		} 
	}
	public void start_string( type) {
		ModernizedCProgram.vt.getParser().setStringtype(type);
		ModernizedCProgram.vt.getParser().setStrbuffer_cur(0);
	}
	public void more_string(Object str, Object len) {
		ModernizedCProgram.vt.append_strbuffer(str, len);
	}
	public void done_string(Object str, Object len) {
		if (ModernizedCProgram.vt.getParser().getStrbuffer_cur()) {
			if (str) {
				ModernizedCProgram.vt.append_strbuffer(str, len);
			} 
			str = ModernizedCProgram.vt.getParser().getStrbuffer();
			len = ModernizedCProgram.vt.getParser().getStrbuffer_cur();
		}  else if (!str) {
			;
			len = 0;
		} 
		switch (ModernizedCProgram.vt.getParser().getStringtype()) {
		case .VTERM_PARSER_OSC:
				if (ModernizedCProgram.vt.getParser().getCallbacks() && ModernizedCProgram.vt.getParser().getCallbacks().getOsc()) {
					if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(str, len, ModernizedCProgram.vt.getParser().getCbdata())) {
						return /*Error: Unsupported expression*/;
					} 
				} 
				;
				return /*Error: Unsupported expression*/;
		case .VTERM_PARSER_DCS:
				if (ModernizedCProgram.vt.getParser().getCallbacks() && ModernizedCProgram.vt.getParser().getCallbacks().getDcs()) {
					if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(str, len, ModernizedCProgram.vt.getParser().getCbdata())) {
						return /*Error: Unsupported expression*/;
					} 
				} 
				;
				return /*Error: Unsupported expression*/;
		case .VTERM_N_PARSER_TYPES:
				return /*Error: Unsupported expression*/;
		}
	}
	public Object vterm_input_write(Object[] bytes, Object len) {
		size_t pos = 0;
		// init to avoid gcc warningbyte string_start = ((Object)0);
		// Count down with BS key and activate when// Count down with BS key and activate whenModernizedCProgram.vt.setIn_backspace(0)// it reaches 1;// it reaches 1
		switch (ModernizedCProgram.vt.getParser().getState()) {
		case VTermParserState.ESC:
				string_start = ((Object)0);
				break;
		case VTermParserState.CSI_INTERMED:
		case VTermParserState.STRING:
		case VTermParserState.ESC_IN_STRING:
				string_start = bytes;
				break;
		case VTermParserState.CSI_ARGS:
		case VTermParserState.CSI_LEADER:
		case VTermParserState.NORMAL:
		}
		for (; pos < len; pos++) {
			byte c = bytes[pos];
			if (c == -1024 || c == -1024) {
				if (ModernizedCProgram.vt.getParser().getState() >= VTermParserState.STRING) {
					ModernizedCProgram.vt.more_string(string_start, bytes + pos - string_start);
					string_start = bytes + pos + 1;
				} 
				continue;
			} 
			if (c == -1024 || c == -1024) {
				do {
					ModernizedCProgram.vt.getParser().setState(VTermParserState.NORMAL);
					string_start = ((Object)0);
				} while (0);
				continue;
			}  else if (c == -1024) {
				ModernizedCProgram.vt.getParser().setIntermedlen(0);
				if (ModernizedCProgram.vt.getParser().getState() == VTermParserState.STRING) {
					ModernizedCProgram.vt.getParser().setState(VTermParserState.ESC_IN_STRING);
				} else {
						do {
							ModernizedCProgram.vt.getParser().setState(VTermParserState.ESC);
							string_start = ((Object)0);
						} while (0);
				} 
				continue;
			}  else if (c == -1024 && ModernizedCProgram.vt.getParser().getState() == VTermParserState.STRING) {
			}  else if (c < -1024) {
				if (ModernizedCProgram.vterm_get_special_pty_type() == 2) {
					if (c == -1024) {
						if (pos + 2 < len && bytes[pos + 1] == -1024 && bytes[pos + 2] == -1024) {
							ModernizedCProgram.vt.setIn_backspace(2);
						} 
					} 
				} 
				if (ModernizedCProgram.vt.getParser().getState() >= VTermParserState.STRING) {
					ModernizedCProgram.vt.more_string(string_start, bytes + pos - string_start);
				} 
				ModernizedCProgram.vt.do_control(c);
				if (ModernizedCProgram.vt.getParser().getState() >= VTermParserState.STRING) {
					string_start = bytes + pos + 1;
				} 
				continue;
			} 
			switch (ModernizedCProgram.vt.getParser().getState()) {
			case VTermParserState.ESC:
					switch (c) {
					case -1024:
							ModernizedCProgram.vt.getParser().setCsi_leaderlen(0);
							do {
								ModernizedCProgram.vt.getParser().setState(VTermParserState.CSI_LEADER);
								string_start = ((Object)0);
							} while (0);
							break;
					case -1024:
							ModernizedCProgram.vt.start_string(.VTERM_PARSER_DCS);
							do {
								ModernizedCProgram.vt.getParser().setState(VTermParserState.STRING);
								string_start = bytes + pos + 1;
							} while (0);
							break;
					case -1024:
							ModernizedCProgram.vt.start_string(.VTERM_PARSER_OSC);
							do {
								ModernizedCProgram.vt.getParser().setState(VTermParserState.STRING);
								string_start = bytes + pos + 1;
							} while (0);
							break;
					default:
							if (ModernizedCProgram.is_intermed(c)) {
								if (ModernizedCProgram.vt.getParser().getIntermedlen() < 16 - 1) {
									ModernizedCProgram.vt.getParser().getIntermed()[ModernizedCProgram.vt.getParser().getIntermedlen()++] = c;
								} 
							}  else if (!ModernizedCProgram.vt.getParser().getIntermedlen() && c >= -1024 && c < -1024) {
								ModernizedCProgram.vt.do_control(c + -1024);
								do {
									ModernizedCProgram.vt.getParser().setState(VTermParserState.NORMAL);
									string_start = ((Object)0);
								} while (0);
							}  else if (c >= -1024 && c < -1024) {
								ModernizedCProgram.vt.do_escape(c);
								do {
									ModernizedCProgram.vt.getParser().setState(VTermParserState.NORMAL);
									string_start = ((Object)0);
								} while (0);
							} else {
									;
							} 
					}
					break;
			case VTermParserState.ESC_IN_STRING:
					if (c == -1024) {
						ModernizedCProgram.vt.getParser().setState(VTermParserState.STRING);
						ModernizedCProgram.vt.done_string(string_start, bytes + pos - string_start - 1);
						do {
							ModernizedCProgram.vt.getParser().setState(VTermParserState.NORMAL);
							string_start = ((Object)0);
						} while (0);
						break;
					} 
					ModernizedCProgram.vt.getParser().setState(VTermParserState.ESC);
			case VTermParserState.NORMAL:
					if (c >= -1024 && c < -1024 && !ModernizedCProgram.vt.getMode().getUtf8()) {
						switch (c) {
						case -1024:
								ModernizedCProgram.vt.start_string(.VTERM_PARSER_DCS);
								do {
									ModernizedCProgram.vt.getParser().setState(VTermParserState.STRING);
									string_start = bytes + pos + 1;
								} while (0);
								break;
						case -1024:
								ModernizedCProgram.vt.start_string(.VTERM_PARSER_OSC);
								do {
									ModernizedCProgram.vt.getParser().setState(VTermParserState.STRING);
									string_start = bytes + pos + 1;
								} while (0);
								break;
						case -1024:
								do {
									ModernizedCProgram.vt.getParser().setState(VTermParserState.CSI_LEADER);
									string_start = ((Object)0);
								} while (0);
								break;
						default:
								ModernizedCProgram.vt.do_control(c);
								break;
						}
					} else {
							size_t eaten = 0;
							if (ModernizedCProgram.vt.getParser().getCallbacks() && ModernizedCProgram.vt.getParser().getCallbacks().getText()) {
								eaten = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(bytes + pos, len - pos, ModernizedCProgram.vt.getParser().getCbdata());
							} 
							if (!eaten) {
								;
								eaten = 1;
							} 
							pos += (eaten - 1);
					} 
					break;
			case VTermParserState.CSI_ARGS:
					if (c >= (byte)'0' && c <= (byte)'9') {
						if (ModernizedCProgram.vt.getParser().getCsi_args()[ModernizedCProgram.vt.getParser().getCsi_argi()] == ((1 << 30) - 1)) {
							ModernizedCProgram.vt.getParser().getCsi_args()[ModernizedCProgram.vt.getParser().getCsi_argi()] = 0;
						} 
						ModernizedCProgram.vt.getParser().getCsi_args()[ModernizedCProgram.vt.getParser().getCsi_argi()] *= 10;
						ModernizedCProgram.vt.getParser().getCsi_args()[ModernizedCProgram.vt.getParser().getCsi_argi()] += c - (byte)'0';
						break;
					} 
					if (c == (byte)':') {
						ModernizedCProgram.vt.getParser().getCsi_args()[ModernizedCProgram.vt.getParser().getCsi_argi()] |=  (-1024 << 31);
						c = (byte)';';
					} 
					if (c == (byte)';') {
						ModernizedCProgram.vt.getParser().getCsi_argi()++;
						ModernizedCProgram.vt.getParser().getCsi_args()[ModernizedCProgram.vt.getParser().getCsi_argi()] = ((1 << 30) - 1);
						break;
					} 
					ModernizedCProgram.vt.getParser().getCsi_argi()++;
					ModernizedCProgram.vt.getParser().setIntermedlen(0);
					ModernizedCProgram.vt.getParser().setState(VTermParserState.CSI_INTERMED);
			case VTermParserState.CSI_INTERMED:
					if (ModernizedCProgram.is_intermed(c)) {
						if (ModernizedCProgram.vt.getParser().getIntermedlen() < 16 - 1) {
							ModernizedCProgram.vt.getParser().getIntermed()[ModernizedCProgram.vt.getParser().getIntermedlen()++] = c;
						} 
						break;
					}  else if (c == -1024) {
					}  else if (c >= -1024 && c <= -1024) {
						ModernizedCProgram.vt.getParser().getIntermed()[ModernizedCProgram.vt.getParser().getIntermedlen()] = 0;
						ModernizedCProgram.vt.do_csi(c);
					} 
					do {
						ModernizedCProgram.vt.getParser().setState(VTermParserState.NORMAL);
						string_start = ((Object)0);
					} while (0);
					break;
			case VTermParserState.CSI_LEADER:
					if (c >= -1024 && c <= -1024) {
						if (ModernizedCProgram.vt.getParser().getCsi_leaderlen() < 16 - 1) {
							ModernizedCProgram.vt.getParser().getCsi_leader()[ModernizedCProgram.vt.getParser().getCsi_leaderlen()++] = c;
						} 
						break;
					} 
					ModernizedCProgram.vt.getParser().getCsi_leader()[ModernizedCProgram.vt.getParser().getCsi_leaderlen()] = 0;
					ModernizedCProgram.vt.getParser().setCsi_argi(0);
					ModernizedCProgram.vt.getParser().getCsi_args()[0] = ((1 << 30) - 1);
					ModernizedCProgram.vt.getParser().setState(VTermParserState.CSI_ARGS);
			case VTermParserState.STRING:
					if (c == -1024 || (c == -1024 && !ModernizedCProgram.vt.getMode().getUtf8())) {
						ModernizedCProgram.vt.done_string(string_start, bytes + pos - string_start);
						do {
							ModernizedCProgram.vt.getParser().setState(VTermParserState.NORMAL);
							string_start = ((Object)0);
						} while (0);
					}  else if (pos + 1 == len) {
						ModernizedCProgram.vt.more_string(string_start, bytes + pos + 1 - string_start);
					} 
					break;
			}
		}
		return len;
	}
	public void vterm_parser_set_callbacks(Object callbacks, Object user) {
		ModernizedCProgram.vt.getParser().setCallbacks(callbacks);
		ModernizedCProgram.vt.getParser().setCbdata(user);
	}
	public Object vterm_parser_get_cbdata() {
		return ModernizedCProgram.vt.getParser().getCbdata();
	}
	public VTerm vterm_new(int rows, int cols) {
		VTerm vTerm = new VTerm();
		return vTerm.vterm_new_with_allocator(rows, cols, ModernizedCProgram.default_allocator, ((Object)0));
	}
	public VTerm vterm_new_with_allocator(int rows, int cols,  funcs, Object allocdata) {
		// Need to bootstrap using the allocator function directlyVTerm vt = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(/*Error: Unsupported expression*/, allocdata);
		if (vt == ((Object)0)) {
			return ((Object)0);
		} 
		vt.setAllocator(funcs);
		vt.setAllocdata(allocdata);
		vt.setRows(rows);
		vt.setCols(cols);
		 generatedParser = vt.getParser();
		generatedParser.setState(VTermParserState.NORMAL);
		generatedParser.setCallbacks(((Object)0));
		generatedParser.setCbdata(((Object)0));
		// should be able to hold an OSC string// should be able to hold an OSC stringgeneratedParser.setStrbuffer_len(500);
		generatedParser.setStrbuffer_cur(0);
		Object generatedStrbuffer_len = generatedParser.getStrbuffer_len();
		generatedParser.setStrbuffer(vt.vterm_allocator_malloc(generatedStrbuffer_len));
		Object generatedStrbuffer = generatedParser.getStrbuffer();
		if (generatedStrbuffer == ((Object)0)) {
			vt.vterm_allocator_free(vt);
			return ((Object)0);
		} 
		vt.setOutbuffer_len(200);
		vt.setOutbuffer_cur(0);
		Object generatedOutbuffer_len = vt.getOutbuffer_len();
		vt.setOutbuffer(vt.vterm_allocator_malloc(generatedOutbuffer_len));
		Byte generatedOutbuffer = vt.getOutbuffer();
		if (generatedOutbuffer == ((Object)0)) {
			vt.vterm_allocator_free(generatedStrbuffer);
			vt.vterm_allocator_free(vt);
			return ((Object)0);
		} 
		return vt;
	}
	public void vterm_free() {
		if (ModernizedCProgram.vt.getScreen()) {
			ModernizedCProgram.vt.getScreen().vterm_screen_free();
		} 
		if (ModernizedCProgram.vt.getState()) {
			ModernizedCProgram.vt.getState().vterm_state_free();
		} 
		ModernizedCProgram.vt.vterm_allocator_free(ModernizedCProgram.vt.getParser().getStrbuffer());
		ModernizedCProgram.vt.vterm_allocator_free(ModernizedCProgram.vt.getOutbuffer());
		ModernizedCProgram.vt.vterm_allocator_free(ModernizedCProgram.vt);
	}
	public Object vterm_allocator_malloc(Object size) {
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(size, ModernizedCProgram.vt.getAllocdata());
	}
	public void vterm_allocator_free(Object ptr) {
		if (ptr) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr, ModernizedCProgram.vt.getAllocdata());
		} 
	}
	public void vterm_set_size(int rows, int cols) {
		ModernizedCProgram.vt.setRows(rows);
		ModernizedCProgram.vt.setCols(cols);
		if (ModernizedCProgram.vt.getParser().getCallbacks() && ModernizedCProgram.vt.getParser().getCallbacks().getResize()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(rows, cols, ModernizedCProgram.vt.getParser().getCbdata());
		} 
	}
	public void vterm_set_utf8(int is_utf8) {
		ModernizedCProgram.vt.getMode().setUtf8(is_utf8);
	}
	public void vterm_push_output_bytes(Object bytes, Object len) {
		if (len > ModernizedCProgram.vt.getOutbuffer_len() - ModernizedCProgram.vt.getOutbuffer_cur()) {
			;
			len = ModernizedCProgram.vt.getOutbuffer_len() - ModernizedCProgram.vt.getOutbuffer_cur();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.vt.getOutbuffer() + ModernizedCProgram.vt.getOutbuffer_cur(), bytes, len);
		ModernizedCProgram.vt.getOutbuffer_cur() += len;
	}
	public int outbuffer_is_full() {
		return ModernizedCProgram.vt.getOutbuffer_cur() >= ModernizedCProgram.vt.getOutbuffer_len() - 1;
	}
	// Use a provided vsnprintf() function.
	public void vterm_push_output_vsprintf(Object format, Object args) {
		int written;
		// When vsnprintf() is not available (C90) fall back to vsprintf().// When vsnprintf() is not available (C90) fall back to vsprintf().// 1Kbyte is enough for everybody, right?byte[] buffer = new byte[1024];
		if (ModernizedCProgram.vt.outbuffer_is_full()) {
			;
			return /*Error: Unsupported expression*/;
		} 
		// output was truncated// output was truncatedwritten = /*Error: Function owner not recognized*/vsprintf(buffer, format, args);
		if (written >= (int)(ModernizedCProgram.vt.getOutbuffer_len() - ModernizedCProgram.vt.getOutbuffer_cur() - 1)) {
			written = ModernizedCProgram.vt.getOutbuffer_len() - ModernizedCProgram.vt.getOutbuffer_cur() - 1;
		} 
		// output was truncated
		if (written > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(ModernizedCProgram.vt.getOutbuffer() + ModernizedCProgram.vt.getOutbuffer_cur(), buffer, written + 1);
			ModernizedCProgram.vt.getOutbuffer_cur() += written;
		} 
	}
	public void vterm_push_output_sprintf(Object format) {
		va_list args = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, format);
		ModernizedCProgram.vt.vterm_push_output_vsprintf(format, args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args);
	}
	public void vterm_push_output_sprintf_ctrl(byte ctrl, Object fmt) {
		size_t orig_cur = ModernizedCProgram.vt.getOutbuffer_cur();
		va_list args = new va_list();
		if (ctrl >= -1024 && !ModernizedCProgram.vt.getMode().getCtrl8bit()) {
			ModernizedCProgram.vt.vterm_push_output_sprintf("\x1b%c", ctrl - -1024);
		} else {
				ModernizedCProgram.vt.vterm_push_output_sprintf("%c", ctrl);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, fmt);
		ModernizedCProgram.vt.vterm_push_output_vsprintf(fmt, args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args);
		if (ModernizedCProgram.vt.outbuffer_is_full()) {
			ModernizedCProgram.vt.setOutbuffer_cur(orig_cur);
		} 
	}
	public void vterm_push_output_sprintf_dcs(Object fmt) {
		size_t orig_cur = ModernizedCProgram.vt.getOutbuffer_cur();
		va_list args = new va_list();
		if (!ModernizedCProgram.vt.getMode().getCtrl8bit()) {
			ModernizedCProgram.vt.vterm_push_output_sprintf("\x1b%c", .C1_DCS - -1024);
		} else {
				ModernizedCProgram.vt.vterm_push_output_sprintf("%c", .C1_DCS);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, fmt);
		ModernizedCProgram.vt.vterm_push_output_vsprintf(fmt, args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args);
		ModernizedCProgram.vt.vterm_push_output_sprintf_ctrl(.C1_ST, "");
		if (ModernizedCProgram.vt.outbuffer_is_full()) {
			ModernizedCProgram.vt.setOutbuffer_cur(orig_cur);
		} 
	}
	public Object vterm_output_read(Byte buffer, Object len) {
		if (len > ModernizedCProgram.vt.getOutbuffer_cur()) {
			len = ModernizedCProgram.vt.getOutbuffer_cur();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buffer, ModernizedCProgram.vt.getOutbuffer(), len);
		if (len < ModernizedCProgram.vt.getOutbuffer_cur()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.vt.getOutbuffer(), ModernizedCProgram.vt.getOutbuffer() + len, ModernizedCProgram.vt.getOutbuffer_cur() - len);
		} 
		ModernizedCProgram.vt.getOutbuffer_cur() -= len;
		return len;
	}
	public int vterm_is_modify_other_keys() {
		return ModernizedCProgram.vt.getState().getMode().getModify_other_keys();
	}
	public void vterm_keyboard_unichar(Object c,  mod) {
		int needs_CSIu;
		if (ModernizedCProgram.vt.getState().getMode().getModify_other_keys() && mod != 0) {
			ModernizedCProgram.vt.vterm_push_output_sprintf_ctrl(.C1_CSI, "27;%d;%d~", mod + 1, c);
			return /*Error: Unsupported expression*/;
		} 
		// The shift modifier is never important for Unicode characters// apart from Spaceif (c != (byte)' ') {
			mod &=  ~.VTERM_MOD_SHIFT;
		} 
		if (mod == 0) {
			byte[] str = new byte[6];
			int seqlen = /*Error: Function owner not recognized*/fill_utf8(c, str);
			ModernizedCProgram.vt.vterm_push_output_bytes(str, seqlen);
			return /*Error: Unsupported expression*/;
		} 
		// Normal text - ignore just shift
		switch (c) {
		case (byte)'[':
				needs_CSIu = 1;
				break;
		case (byte)'m':
		case (byte)'j':
		case (byte)'i':
		case (byte)'\\':
		case (byte)'_':
				needs_CSIu = 0;
				break;
		case (byte)'^':
		case (byte)' ':
				needs_CSIu = !!(mod & .VTERM_MOD_SHIFT);
				break;
		case (byte)']':
		default:
				needs_CSIu = (c < (byte)'a' || c > (byte)'z');
		}// Special Ctrl- letters that can't be represented elsewise
		// ALT we can just prefix with ESC; anything else requires CSI uif (needs_CSIu && (mod & ~.VTERM_MOD_ALT)) {
			ModernizedCProgram.vt.vterm_push_output_sprintf_ctrl(.C1_CSI, "%d;%du", c, mod + 1);
			return /*Error: Unsupported expression*/;
		} 
		if (mod & .VTERM_MOD_CTRL) {
			c &=  -1024;
		} 
		ModernizedCProgram.vt.vterm_push_output_sprintf("%s%c", mod & .VTERM_MOD_ALT ? "\x1b" : "", c);
	}
	// F6
	// F7
	// F8
	// F9
	// F10
	// F11
	// F12
	// KP_0
	// KP_1
	// KP_2
	// KP_3
	// KP_4
	// KP_5
	// KP_6
	// KP_7
	// KP_8
	// KP_9
	// KP_MULT
	// KP_PLUS
	// KP_COMMA
	// KP_MINUS
	// KP_PERIOD
	// KP_DIVIDE
	// KP_ENTER
	// KP_EQUAL
	public void vterm_keyboard_key( key,  mod) {
		keycodes_s k = new keycodes_s();
		if (key == .VTERM_KEY_NONE) {
			return /*Error: Unsupported expression*/;
		} 
		if (key < .VTERM_KEY_FUNCTION_0) {
			if (key >= /*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/) {
				return /*Error: Unsupported expression*/;
			} 
			k = ModernizedCProgram.keycodes[key];
		}  else if (key >= .VTERM_KEY_FUNCTION_0 && key <= .VTERM_KEY_FUNCTION_MAX) {
			if ((key - .VTERM_KEY_FUNCTION_0) >= /*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/) {
				return /*Error: Unsupported expression*/;
			} 
			k = ModernizedCProgram.keycodes_fn[key - .VTERM_KEY_FUNCTION_0];
		}  else if (key >= .VTERM_KEY_KP_0) {
			if ((key - .VTERM_KEY_KP_0) >= /*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/) {
				return /*Error: Unsupported expression*/;
			} 
			k = ModernizedCProgram.keycodes_kp[key - .VTERM_KEY_KP_0];
		} 
	}
	public void vterm_keyboard_start_paste() {
		if (ModernizedCProgram.vt.getState().getMode().getBracketpaste()) {
			ModernizedCProgram.vt.vterm_push_output_sprintf_ctrl(.C1_CSI, "200~");
		} 
	}
	public void vterm_keyboard_end_paste() {
		if (ModernizedCProgram.vt.getState().getMode().getBracketpaste()) {
			ModernizedCProgram.vt.vterm_push_output_sprintf_ctrl(.C1_CSI, "201~");
		} 
	}
	public void vterm_mouse_move(int row, int col,  mod) {
		VTermState state = ModernizedCProgram.vt.getState();
		int generatedMouse_col = state.getMouse_col();
		int generatedMouse_row = state.getMouse_row();
		if (col == generatedMouse_col && row == generatedMouse_row) {
			return /*Error: Unsupported expression*/;
		} 
		state.setMouse_col(col);
		state.setMouse_row(row);
		int generatedMouse_flags = state.getMouse_flags();
		int generatedMouse_buttons = state.getMouse_buttons();
		if ((generatedMouse_flags & -1024 && generatedMouse_buttons) || (generatedMouse_flags & -1024)) {
			int button = generatedMouse_buttons & -1024 ? 1 : generatedMouse_buttons & -1024 ? 2 : generatedMouse_buttons & -1024 ? 3 : 4;
			state.output_mouse(button - 1 + -1024, 1, mod, col, row);
		} 
	}
	public void vterm_mouse_button(int button, int pressed,  mod) {
		VTermState state = ModernizedCProgram.vt.getState();
		int generatedMouse_buttons = state.getMouse_buttons();
		int old_buttons = generatedMouse_buttons;
		if (button > 0 && button <= 3) {
			if (pressed) {
				generatedMouse_buttons |=  (1 << (button - 1));
			} else {
					generatedMouse_buttons &=  ~(1 << (button - 1));
			} 
		} 
		// Most of the time we don't get button releases from 4/5if (generatedMouse_buttons == old_buttons && button < 4) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedMouse_flags = state.getMouse_flags();
		if (!(generatedMouse_flags & -1024)) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedMouse_col = state.getMouse_col();
		int generatedMouse_row = state.getMouse_row();
		if (button < 4) {
			state.output_mouse(button - 1, pressed, mod, generatedMouse_col, generatedMouse_row);
		}  else if (button < 6) {
			state.output_mouse(button - 4 + -1024, pressed, mod, generatedMouse_col, generatedMouse_row);
		} 
	}
	public  getAllocator() {
		return allocator;
	}
	public void setAllocator( newAllocator) {
		allocator = newAllocator;
	}
	public Object getAllocdata() {
		return allocdata;
	}
	public void setAllocdata(Object newAllocdata) {
		allocdata = newAllocdata;
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
	public  getMode() {
		return mode;
	}
	public void setMode( newMode) {
		mode = newMode;
	}
	public  getParser() {
		return parser;
	}
	public void setParser( newParser) {
		parser = newParser;
	}
	public Byte getOutbuffer() {
		return outbuffer;
	}
	public void setOutbuffer(Byte newOutbuffer) {
		outbuffer = newOutbuffer;
	}
	public Object getOutbuffer_len() {
		return outbuffer_len;
	}
	public void setOutbuffer_len(Object newOutbuffer_len) {
		outbuffer_len = newOutbuffer_len;
	}
	public Object getOutbuffer_cur() {
		return outbuffer_cur;
	}
	public void setOutbuffer_cur(Object newOutbuffer_cur) {
		outbuffer_cur = newOutbuffer_cur;
	}
	public VTermState getState() {
		return state;
	}
	public void setState(VTermState newState) {
		state = newState;
	}
	public VTermScreen getScreen() {
		return screen;
	}
	public void setScreen(VTermScreen newScreen) {
		screen = newScreen;
	}
	public int getIn_backspace() {
		return in_backspace;
	}
	public void setIn_backspace(int newIn_backspace) {
		in_backspace = newIn_backspace;
	}
}
