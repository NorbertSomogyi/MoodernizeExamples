package application;

public class loc_cmd_struct {
	private Object command;
	private Object unum_size;
	private Object line_nr;
	private int ctrl_id;
	private Object num;
	private Object unum;
	private Object txt;
	private list_head list;
	
	public loc_cmd_struct(Object command, Object unum_size, Object line_nr, int ctrl_id, Object num, Object unum, Object txt, list_head list) {
		setCommand(command);
		setUnum_size(unum_size);
		setLine_nr(line_nr);
		setCtrl_id(ctrl_id);
		setNum(num);
		setUnum(unum);
		setTxt(txt);
		setList(list);
	}
	public loc_cmd_struct() {
	}
	
	/*
	 * Add a localization command to a dialog/section
	 */
	public void add_dialog_command(int index) {
		byte[] str = new byte[128];
		loc_cmd htab_lcmd = new loc_cmd();
		uint32_t i = new uint32_t();
		Object generatedTxt = this.getTxt();
		if ((lcmd == ((Object)0)) || (generatedTxt[0] == ((Object)0)) || (index < 0) || (index >= ( / ))) {
			ModernizedCProgram._uprintf("localization: invalid parameter for add_dialog_command\n");
			return ;
		} 
		// with the new one.// Two dialogs may have different "m IDC_CONTROL" lines, and also// "m IDC_CONTROL" and "t IDC_CONTROL" are separate, so we compute two more// unique identifiers for dialog and command at the beginning of our string// with the new one.// Two dialogs may have different "m IDC_CONTROL" lines, and also// "m IDC_CONTROL" and "t IDC_CONTROL" are separate, so we compute two more// unique identifiers for dialog and command at the beginning of our stringstr[0] = index + -1024;
		Object generatedCommand = this.getCommand();
		str[1] = generatedCommand + -1024;
		do {
			.memcpy(str[2], generatedTxt[0], (((size_t)(((((byte)generatedTxt[0]) == ((Object)0)) ? 0 : .strlen(generatedTxt[0])) + 1)) < ((size_t)( - 2)) ? ((size_t)(((((byte)generatedTxt[0]) == ((Object)0)) ? 0 : .strlen(generatedTxt[0])) + 1)) : ((size_t)( - 2))));
			((byte)str[2])[(((size_t)(((((byte)generatedTxt[0]) == ((Object)0)) ? 0 : .strlen(generatedTxt[0])) + 1)) < ((size_t)( - 2)) ? ((size_t)(((((byte)generatedTxt[0]) == ((Object)0)) ? 0 : .strlen(generatedTxt[0])) + 1)) : ((size_t)( - 2))) - 1] = 0;
		} while (0);
		i = ModernizedCProgram.htab_loc.htab_hash(str);
		list_head generatedList = htab_lcmd.getList();
		if (i != 0) {
			htab_lcmd = (loc_cmd)(ModernizedCProgram.htab_loc.getTable()[i].getData());
			if (htab_lcmd != ((Object)0)) {
				(generatedList).list_del();
				htab_lcmd.free_loc_cmd();
			} 
			ModernizedCProgram.htab_loc.getTable()[i].setData((Object)lcmd);
		} 
		generatedList.list_add(generatedList);
	}
	public void add_message_command() {
		if (lcmd == ((Object)0)) {
			ModernizedCProgram._uprintf("localization: invalid parameter for add_message_command\n");
			return ;
		} 
		int generatedCtrl_id = this.getCtrl_id();
		if ((generatedCtrl_id <= 3000) || (generatedCtrl_id >= 3321)) {
			ModernizedCProgram._uprintf("localization: invalid MSG_ index\n");
			return ;
		} 
		do {
			.free((Object)ModernizedCProgram.msg_table[generatedCtrl_id - 3000]);
			ModernizedCProgram.msg_table[generatedCtrl_id - 3000] = ((Object)0);
		} while (0);
		Object generatedTxt = this.getTxt();
		ModernizedCProgram.msg_table[generatedCtrl_id - 3000] = generatedTxt[1];
		// String would be freed after this call otherwise// String would be freed after this call otherwisegeneratedTxt[1] = ((Object)0);
	}
	public void free_loc_cmd() {
		if (lcmd == ((Object)0)) {
			return ;
		} 
		Object generatedTxt = this.getTxt();
		do {
			.free((Object)generatedTxt[0]);
			generatedTxt[0] = ((Object)0);
		} while (0);
		do {
			.free((Object)generatedTxt[1]);
			generatedTxt[1] = ((Object)0);
		} while (0);
		Object generatedUnum = this.getUnum();
		do {
			.free((Object)generatedUnum);
			this.setUnum(((Object)0));
		} while (0);
		.free(lcmd);
	}
	public Object dispatch_loc_cmd() {
		size_t i = new size_t();
		int dlg_index = 0;
		loc_cmd base_locale = ((Object)0);
		byte msg_prefix = "MSG_";
		if (lcmd == ((Object)0)) {
			return 0;
		} 
		Object generatedCommand = this.getCommand();
		Object generatedTxt = this.getTxt();
		int generatedCtrl_id = this.getCtrl_id();
		if (generatedCommand <= loc_command_type.LC_TEXT) {
			if (.strncmp(((generatedTxt[0] == ((Object)0)) ? "<NULL>" : generatedTxt[0]), ((msg_prefix == ((Object)0)) ? "<NULL>" : msg_prefix), 4) == 0) {
				if ((generatedTxt[0] == ((Object)0)) || (generatedCommand != loc_command_type.LC_TEXT)) {
					ModernizedCProgram._uprintf("%s(%d): only the [t]ext command can be applied to a message (MSG_###)\n\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
					;
				} 
				this.setCtrl_id(3000 + .atoi((generatedTxt[0][4])));
				if (generatedCtrl_id == 3000) {
					ModernizedCProgram._uprintf("%s(%d): failed to convert the numeric value in '%'\n\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr, generatedTxt[0]);
					;
				} 
				lcmd.add_message_command();
				lcmd.free_loc_cmd();
				return 1;
			} 
			for (i = 0; i < ( / ); i++) {
				if (.strcmp(((generatedTxt[0] == ((Object)0)) ? "<NULL>" : generatedTxt[0]), ((ModernizedCProgram.control_id[i].getName() == ((Object)0)) ? "<NULL>" : ModernizedCProgram.control_id[i].getName())) == 0) {
					this.setCtrl_id(ModernizedCProgram.control_id[i].getId());
					break;
				} 
			}
			if (generatedCtrl_id < 0) {
				ModernizedCProgram._uprintf("%s(%d): unknown control '%s'\n\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr, generatedTxt[0]);
				;
			} 
		} 
		// Any command up to LC_TEXT takes a control ID in text[0]
		// Don't process UI commands when we're dealing with the defaultif (ModernizedCProgram.msg_table == ModernizedCProgram.default_msg_table) {
			lcmd.free_loc_cmd();
			return 1;
		} 
		loc_cmd_struct loc_cmd_struct = new loc_cmd_struct();
		switch (generatedCommand) {
		case loc_command_type.LC_GROUP:
				if ((generatedCtrl_id - 101) > ( / )) {
					ModernizedCProgram._uprintf("%s(%d): '%s' is not a group ID\n\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr, generatedTxt[0]);
					;
				} 
				dlg_index = generatedCtrl_id - 101;
				lcmd.free_loc_cmd();
				break;
		case loc_command_type.LC_TEXT:
				lcmd.add_dialog_command(dlg_index);
				break;
		case loc_command_type.LC_BASE:
				base_locale = loc_cmd_struct.get_locale_from_name(generatedTxt[0], 0);
				if (base_locale != ((Object)0)) {
					ModernizedCProgram._uprintf("localization: using locale base '%s'\n", generatedTxt[0]);
					base_locale.get_loc_data_file(((Object)0));
				} else {
						ModernizedCProgram._uprintf("%s(%d): locale base '%s' not found - ignoring\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr, generatedTxt[0]);
				} 
				lcmd.free_loc_cmd();
				break;
		default:
				lcmd.free_loc_cmd();
				break;
		}// NB: For commands that take an ID, ctrl_id is always a valid index at this stage
		return 1;
		return 0/*
		 * Apply stored localization commands to a specific dialog
		 * If hDlg is NULL, apply the commands against an active Window
		 */;
	}
	public loc_cmd_struct get_locale_from_lcid(int lcid, Object fallback) {
		loc_cmd lcmd = ((Object)0);
		int i;
		if (((ModernizedCProgram.locale_list).getNext() == (ModernizedCProgram.locale_list))) {
			ModernizedCProgram._uprintf("localization: the locale list is empty!\n");
			return ((Object)0);
		} 
		list_head generatedList = lcmd.getList();
		Object generatedUnum_size = lcmd.getUnum_size();
		Object generatedUnum = lcmd.getUnum();
		list_head generatedNext = generatedList.getNext();
		for (lcmd = ((loc_cmd)((uintptr_t)(generatedNext) - (uintptr_t)((size_t)generatedList))); generatedList != (ModernizedCProgram.locale_list); lcmd = ((loc_cmd)((uintptr_t)(generatedNext) - (uintptr_t)((size_t)generatedList)))) {
			for (i = 0; i < generatedUnum_size; i++) {
				if (generatedUnum[i] == lcid) {
					return lcmd;
				} 
			}
		}
		if (!fallback) {
			return ((Object)0);
		} 
		lcmd = ((loc_cmd)((uintptr_t)(generatedNext) - (uintptr_t)((size_t)generatedList)))// If we couldn't find a supported locale, just pick the first one (usually English);// If we couldn't find a supported locale, just pick the first one (usually English)
		Object generatedTxt = lcmd.getTxt();
		ModernizedCProgram._uprintf("localization: could not find locale for LCID: 0x%04X. Will default to '%s'\n", lcid, generatedTxt[0]);
		return lcmd;
	}
	public loc_cmd_struct get_locale_from_name(Byte locale_name, Object fallback) {
		loc_cmd lcmd = ((Object)0);
		if (((ModernizedCProgram.locale_list).getNext() == (ModernizedCProgram.locale_list))) {
			ModernizedCProgram._uprintf("localization: the locale list is empty!\n");
			return ((Object)0);
		} 
		list_head generatedList = lcmd.getList();
		Object generatedTxt = lcmd.getTxt();
		list_head generatedNext = generatedList.getNext();
		for (lcmd = ((loc_cmd)((uintptr_t)(generatedNext) - (uintptr_t)((size_t)generatedList))); generatedList != (ModernizedCProgram.locale_list); lcmd = ((loc_cmd)((uintptr_t)(generatedNext) - (uintptr_t)((size_t)generatedList)))) {
			if (.strcmp(((generatedTxt[0] == ((Object)0)) ? "<NULL>" : generatedTxt[0]), ((locale_name == ((Object)0)) ? "<NULL>" : locale_name)) == 0) {
				return lcmd;
			} 
		}
		if (!fallback) {
			return ((Object)0);
		} 
		lcmd = ((loc_cmd)((uintptr_t)(generatedNext) - (uintptr_t)((size_t)generatedList)));
		ModernizedCProgram._uprintf("localization: could not find locale for name '%s'. Will default to '%s'\n", locale_name, generatedTxt[0]);
		return lcmd/*
		 * This call is used to toggle the issuing of messages with the default locale
		 * (usually en-US) instead of the current (usually non en) one.
		 */;
	}
	public Object get_language_id() {
		int i;
		wchar_t[] wlang = new wchar_t();
		LANGID lang_id = .GetUserDefaultUILanguage();
		if (lcmd == ((Object)0)) {
			return ((((WORD)(true)) << 10) | (WORD)(true));
		} 
		Object generatedUnum_size = this.getUnum_size();
		Object generatedUnum = this.getUnum();
		// Find if the selected language is the user defaultfor (i = 0; i < generatedUnum_size; i++) {
			if (generatedUnum[i] == lang_id) {
				do {
					do {
						._snprintf(ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos], 4096 - ModernizedCProgram.ubuffer_pos - 2, "Will use default UI locale 0x%04X", lang_id);
						(ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos])[(4096 - ModernizedCProgram.ubuffer_pos - 2) - 1] = 0;
					} while (0);
					ModernizedCProgram.ubuffer_pos = .strlen(ModernizedCProgram.ubuffer);
					ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos++] = (byte)'\r';
					ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos++] = (byte)'\n';
					ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos] = 0;
				} while (0);
				return ((((WORD)(true)) << 10) | (WORD)(lang_id));
			} 
		}
		// Selected language is not user default - find if a language pack is installed for it// Selected language is not user default - find if a language pack is installed for itModernizedCProgram.found_lang = 0;
		Object generatedTxt = this.getTxt();
		for (i = 0; (i < generatedUnum_size); i++) {
			._snwprintf(wlang, ( / ), L"%04X", generatedUnum[i]);
			.EnumUILanguages(EnumUILanguagesProc, -1024, (LONG_PTR)wlang);
			if (ModernizedCProgram.found_lang) {
				do {
					do {
						._snprintf(ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos], 4096 - ModernizedCProgram.ubuffer_pos - 2, "Detected installed Windows Language Pack for 0x%04X (%s)", generatedUnum[i], generatedTxt[1]);
						(ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos])[(4096 - ModernizedCProgram.ubuffer_pos - 2) - 1] = 0;
					} while (0);
					ModernizedCProgram.ubuffer_pos = .strlen(ModernizedCProgram.ubuffer);
					ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos++] = (byte)'\r';
					ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos++] = (byte)'\n';
					ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos] = 0;
				} while (0);
				return ((((WORD)(true)) << 10) | (WORD)(generatedUnum[i]));
			} 
		}// Always uppercase
		do {
			do {
				._snprintf(ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos], 4096 - ModernizedCProgram.ubuffer_pos - 2, "NOTE: No Windows Language Pack is installed for %s on this system.\r\nThis means that some controls may still be displayed using the system locale.", generatedTxt[1]);
				(ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos])[(4096 - ModernizedCProgram.ubuffer_pos - 2) - 1] = 0;
			} while (0);
			ModernizedCProgram.ubuffer_pos = .strlen(ModernizedCProgram.ubuffer);
			ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos++] = (byte)'\r';
			ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos++] = (byte)'\n';
			ModernizedCProgram.ubuffer[ModernizedCProgram.ubuffer_pos] = 0;
		} while (0);
		return ((((WORD)(true)) << 10) | (WORD)(true));
	}
	public loc_cmd_struct get_loc_cmd(byte c, Byte line) {
		size_t i = new size_t();
		size_t j = new size_t();
		size_t k = new size_t();
		size_t l = new size_t();
		size_t r = new size_t();
		size_t ti = 0;
		size_t ii = 0;
		byte endptr;
		byte expected_endptr;
		byte token;
		loc_cmd lcmd = ((Object)0);
		for (j = 0; j < ( / ); j++) {
			if (c == ModernizedCProgram.parse_cmd[j].getC()) {
				break;
			} 
		}
		if (j >= ( / )) {
			ModernizedCProgram._uprintf("%s(%d): unknown command\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
			return ((Object)0);
		} 
		lcmd = (loc_cmd).calloc(, 1);
		if (lcmd == ((Object)0)) {
			ModernizedCProgram._uprintf("%s(%d): could not allocate command\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
			return ((Object)0);
		} 
		lcmd.setCommand(ModernizedCProgram.parse_cmd[j].getCmd());
		Object generatedCommand = lcmd.getCommand();
		lcmd.setCtrl_id((generatedCommand <= loc_command_type.LC_TEXT) ? -1 : 0);
		lcmd.setLine_nr((uint16_t)ModernizedCProgram.loc_line_nr);
		i = 0;
		Object generatedTxt = lcmd.getTxt();
		Object generatedNum = lcmd.getNum();
		Object generatedUnum_size = lcmd.getUnum_size();
		Object generatedUnum = lcmd.getUnum();
		for (k = 0; ModernizedCProgram.parse_cmd[j].getArg_type()[k] != 0; k++) {
			i += .strspn(line[i], ModernizedCProgram.space);
			r = i;
			if (line[i] == 0) {
				ModernizedCProgram._uprintf("%s(%d): missing parameter for command '%c'\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr, ModernizedCProgram.parse_cmd[j].getC());
				;
			} 
			switch (ModernizedCProgram.parse_cmd[j].getArg_type()[k]) {
			case (byte)'s':
					if (line[i++] != (byte)'"') {
						ModernizedCProgram._uprintf("%s(%d): no start quote\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
						;
					} 
					r = i;
					while ((line[i] != 0) && ((line[i] != (byte)'"') || ((line[i] == (byte)'"') && (line[i - 1] == (byte)'\\')))) {
						if ((line[i] == (byte)'"') && (line[i - 1] == (byte)'\\')) {
							.strcpy(line[i - 1], line[i]);
						} else {
								i++;
						} 
					}
					if (line[i] == 0) {
						ModernizedCProgram._uprintf("%s(%d): no end quote\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
						;
					} 
					line[i++] = 0;
					generatedTxt[ti++] = ._strdup(line[r]);
					break;
			case (byte)'i':
					if ((line[i] == (byte)',') || (line[i] == (byte)'.')) {
						i += .strspn(line[i + 1], ModernizedCProgram.space);
						r = i;
					} 
					while ((line[i] != 0) && (line[i] != ModernizedCProgram.space[0]) && (line[i] != ModernizedCProgram.space[1]) && (line[i] != (byte)',') && (line[i] != (byte)'.')) {
						i++;
					}
					expected_endptr = line[i];
					if (line[i] != 0) {
						line[i++] = 0;
					} 
					generatedNum[ii++] = (int32_t).strtol(line[r], endptr, 0);
					if (endptr != expected_endptr) {
						ModernizedCProgram._uprintf("%s(%d): invalid integer\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
						;
					} 
					break;
			case (byte)'u':
					lcmd.setUnum_size(1);
					for (l = i; line[l] != 0; l++) {
						if ((line[l] == (byte)'.') || (line[l] == (byte)',')) {
							generatedUnum_size++;
						} 
					}
					lcmd.setUnum((uint32_t).malloc(generatedUnum_size * ));
					if (generatedUnum == ((Object)0)) {
						ModernizedCProgram._uprintf("%s(%d): could not allocate memory\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
						;
					} 
					token = .strtok(line[i], ".,");
					for (l = 0; (l < generatedUnum_size) && (token != ((Object)0)); l++) {
						generatedUnum[l] = (int32_t).strtol(token, endptr, 0);
						token = .strtok(((Object)0), ".,");
					}
					if ((token != ((Object)0)) || (l != generatedUnum_size)) {
						ModernizedCProgram._uprintf("%s(%d): internal error (unexpected number of numeric values)\n", ModernizedCProgram.loc_filename, ModernizedCProgram.loc_line_nr);
						;
					} 
					break;
			case (byte)'c':
					while ((line[i] != 0) && (line[i] != ModernizedCProgram.space[0]) && (line[i] != ModernizedCProgram.space[1])) {
						i++;
					}
					if (line[i] != 0) {
						line[i++] = 0;
					} 
					generatedTxt[ti++] = ._strdup(line[r]);
					break;
			default:
					ModernizedCProgram._uprintf("localization: unhandled arg_type '%c'\n", ModernizedCProgram.parse_cmd[j].getArg_type()[k]);
					;
			}
		}// Skip leading spaces
		return lcmd;
		return ((Object)0/*
		 * Parse an UTF-8 localization command line
		 */);
	}
	public Object get_loc_data_file(Object filename) {
		size_t bufsize = 1024;
		FILE fd = ((Object)0);
		BOOL populate_default = 0;
		byte buf = ((Object)0);
		size_t i = 0;
		int r = 0;
		int line_nr_incr = 1;
		int c = 0;
		int eol_char = 0;
		int start_line;
		int old_loc_line_nr = 0;
		BOOL ret = 0;
		BOOL eol = 0;
		BOOL escape_sequence = 0;
		BOOL reentrant = (fd != ((Object)0));
		long offset;
		long cur_offset = -1;
		long end_offset;
		// The default locale is always the first one
		loc_cmd default_locale = ((loc_cmd)((uintptr_t)(ModernizedCProgram.locale_list.getNext()) - (uintptr_t)((size_t)((loc_cmd)0).getList())));
		if ((lcmd == ((Object)0)) || (default_locale == ((Object)0))) {
			ModernizedCProgram._uprintf("localization: no %slocale", (default_locale == ((Object)0)) ? "default " : " ");
			;
		} 
		if (ModernizedCProgram.msg_table == ((Object)0)) {
			ModernizedCProgram.msg_table = ModernizedCProgram.default_msg_table;
			ModernizedCProgram._uprintf("localization: initializing default message table");
			populate_default = 1;
			default_locale.get_loc_data_file(filename);
			populate_default = 0;
		} 
		// Initialize the default message table (usually en-US)
		if (reentrant) {
			cur_offset = .ftell(fd);
			old_loc_line_nr = ModernizedCProgram.loc_line_nr;
		} else {
				if ((filename == ((Object)0)) || (filename[0] == 0)) {
					return 0;
				} 
				if (!populate_default) {
					if (lcmd == default_locale) {
						ModernizedCProgram.msg_table = ModernizedCProgram.default_msg_table;
						return 1;
					} 
					ModernizedCProgram.msg_table = ModernizedCProgram.current_msg_table;
				} 
				ModernizedCProgram.free_dialog_list();
				fd = ModernizedCProgram.open_loc_file(filename);
				if (fd == ((Object)0)) {
					;
				} 
		} 
		// Called, from a 'b' command - no need to reopen the file,
		Object generatedNum = this.getNum();
		offset = (long)generatedNum[0];
		end_offset = (long)generatedNum[1];
		Object generatedLine_nr = this.getLine_nr();
		start_line = generatedLine_nr;
		ModernizedCProgram.loc_line_nr = start_line;
		buf = (byte).malloc(bufsize);
		if (buf == ((Object)0)) {
			ModernizedCProgram._uprintf("localization: could not allocate line buffer\n");
			;
		} 
		if (.fseek(fd, offset, 0) != 0) {
			ModernizedCProgram._uprintf("localization: could not rewind\n");
			;
		} 
		// custom readline handling for string collation, realloc, line numbers, etc.do {
			c = .getc(fd);
			switch (c) {
			case (byte)'\\':
					if (!escape_sequence) {
						escape_sequence = 1;
						break;
					} 
			case (true):
					buf[i] = 0;
					if (!eol) {
						ModernizedCProgram.loc_line_nr += line_nr_incr;
					} 
					ModernizedCProgram.get_loc_data_line(buf);
					break;
			case (byte)'\r':
			case (byte)' ':
			case (byte)'\t':
					if (escape_sequence) {
						escape_sequence = 0;
						break;
					} 
					if (!eol) {
						buf[i++] = (byte)c;
					} 
					break;
			case (byte)'\n':
					if (escape_sequence) {
						escape_sequence = 0;
						break;
					} 
					if (eol_char == 0) {
						eol_char = c;
					} 
					if (c == eol_char) {
						if (eol) {
							line_nr_incr++;
						} else {
								ModernizedCProgram.loc_line_nr += line_nr_incr;
								line_nr_incr = 1;
						} 
					} 
					buf[i] = 0;
					if (!eol) {
						for (r = ((int)i) - 1; (r > 0) && ((buf[r] == ModernizedCProgram.space[0]) || (buf[r] == ModernizedCProgram.space[1])); r--) {
							;
						}
						if (r < 0) {
							r = 0;
						} 
						eol = 1;
					} 
					break;
			default:
					if (escape_sequence) {
						switch (c) {
						case (byte)'"':
								buf[i++] = (byte)'\\';
								buf[i++] = (byte)'"';
								break;
						case (byte)'\\':
								buf[i++] = (byte)'\\';
								break;
						case (byte)'n':
								buf[i++] = (byte)'\r';
								buf[i++] = (byte)'\n';
								break;
						default:
								break;
						}
						escape_sequence = 0;
					} else {
							if ((eol) && (c == (byte)'"') && (buf[r] == (byte)'"')) {
								i = r;
								eol = 0;
								break;
							} 
							if (eol) {
								ModernizedCProgram.get_loc_data_line(buf);
								eol = 0;
								i = 0;
								r = 0;
							} 
							buf[i++] = (byte)c;
					} 
					break;
			}
			if ((c == (true)) || (.ftell(fd) > end_offset)) {
				break;
			} 
			if (i >= bufsize - 2) {
				bufsize *= 2;
				if (bufsize > 32768) {
					ModernizedCProgram._uprintf("localization: requested line buffer is larger than 32K!\n");
					;
				} 
				buf = (byte)ModernizedCProgram._reallocf(buf, bufsize);
				if (buf == ((Object)0)) {
					ModernizedCProgram._uprintf("localization: could not grow line buffer\n");
					;
				} 
			} 
		} while (1);
		ret = 1;
		do {
			.free((Object)buf);
			buf = ((Object)0);
		} while (0);
		return ret/*
		 * Parse a line of UTF-16 text and return the data if it matches the 'token'
		 * The parsed line is of the form: [ ][<][ ]token[ ][=|>][ ]["]data["][ ][<] and is
		 * modified by the parser
		 */;
	}
	public Object getCommand() {
		return command;
	}
	public void setCommand(Object newCommand) {
		command = newCommand;
	}
	public Object getUnum_size() {
		return unum_size;
	}
	public void setUnum_size(Object newUnum_size) {
		unum_size = newUnum_size;
	}
	public Object getLine_nr() {
		return line_nr;
	}
	public void setLine_nr(Object newLine_nr) {
		line_nr = newLine_nr;
	}
	public int getCtrl_id() {
		return ctrl_id;
	}
	public void setCtrl_id(int newCtrl_id) {
		ctrl_id = newCtrl_id;
	}
	public Object getNum() {
		return num;
	}
	public void setNum(Object newNum) {
		num = newNum;
	}
	public Object getUnum() {
		return unum;
	}
	public void setUnum(Object newUnum) {
		unum = newUnum;
	}
	public Object getTxt() {
		return txt;
	}
	public void setTxt(Object newTxt) {
		txt = newTxt;
	}
	public list_head getList() {
		return list;
	}
	public void setList(list_head newList) {
		list = newList;
	}
}
