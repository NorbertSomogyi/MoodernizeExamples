package application;

// error exception
// interrupt exception triggered by Ctrl-C
/*
 * Structure describing an exception.
 * (don't use "struct exception", it's used by the math library).
 */
public class vim_exception {
	private  type;
	private Byte value;
	private msglist messages;
	private Object throw_name;
	private Object throw_lnum;
	private vim_exception caught;
	
	public vim_exception( type, Byte value, msglist messages, Object throw_name, Object throw_lnum, vim_exception caught) {
		setType(type);
		setValue(value);
		setMessages(messages);
		setThrow_name(throw_name);
		setThrow_lnum(throw_lnum);
		setCaught(caught);
	}
	public vim_exception() {
	}
	
	public void discard_exception(int was_finished) {
		char_u saved_IObuff = new char_u();
		if (excp == ((Object)0)) {
			ModernizedCProgram.internal_error("discard_exception()");
			return /*Error: Unsupported expression*/;
		} 
		Byte generatedValue = this.getValue();
		if (ModernizedCProgram.p_verbose >= 13 || debug_break_level > 0) {
			int save_msg_silent = msg_silent;
			saved_IObuff = ModernizedCProgram.vim_strsave(ModernizedCProgram.IObuff);
			if (debug_break_level > 0) {
				msg_silent = /* display messages */0;
			} else {
					ModernizedCProgram.verbose_enter();
			} 
			++no_wait_return;
			if (debug_break_level > 0 || ModernizedCProgram.p_vfile == (byte)'\000') {
				msg_scroll = /* always scroll up, don't overwrite */1;
			} 
			ModernizedCProgram.smsg(was_finished ? ((byte)("Exception finished: %s")) : ((byte)("Exception discarded: %s")), generatedValue);
			ModernizedCProgram.msg_puts(/* don't overwrite this either */"\n");
			if (debug_break_level > 0 || ModernizedCProgram.p_vfile == (byte)'\000') {
				ModernizedCProgram.cmdline_row = ModernizedCProgram.msg_row;
			} 
			--no_wait_return;
			if (debug_break_level > 0) {
				msg_silent = save_msg_silent;
			} else {
					ModernizedCProgram.verbose_leave();
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ModernizedCProgram.IObuff), (byte)(saved_IObuff));
			ModernizedCProgram.vim_free(saved_IObuff);
		} 
		 generatedType = this.getType();
		if (generatedType != .ET_INTERRUPT) {
			ModernizedCProgram.vim_free(generatedValue);
		} 
		msglist generatedMessages = this.getMessages();
		if (generatedType == .ET_ERROR) {
			generatedMessages.free_msglist();
		} 
		Object generatedThrow_name = this.getThrow_name();
		ModernizedCProgram.vim_free(generatedThrow_name);
		ModernizedCProgram.vim_free(excp/*
		 * Discard the exception currently being thrown.
		 */);
	}
	public void catch_exception() {
		this.setCaught(caught_stack);
		caught_stack = excp;
		Byte generatedValue = this.getValue();
		ModernizedCProgram.set_vim_var_string(29, (char_u)generatedValue, -1);
		Object generatedThrow_name = this.getThrow_name();
		Object generatedThrow_lnum = this.getThrow_lnum();
		if (generatedThrow_name != (byte)'\000') {
			if (generatedThrow_lnum != 0) {
				ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("%s, line %ld")), generatedThrow_name, (long)generatedThrow_lnum);
			} else {
					ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%s", generatedThrow_name);
			} 
			ModernizedCProgram.set_vim_var_string(30, ModernizedCProgram.IObuff, -1);
		} else {
				ModernizedCProgram.set_vim_var_string(30, ((Object)0), -/* throw_name not set on an exception from a command that was typed. */1);
		} 
		if (ModernizedCProgram.p_verbose >= 13 || debug_break_level > 0) {
			int save_msg_silent = msg_silent;
			if (debug_break_level > 0) {
				msg_silent = /* display messages */0;
			} else {
					ModernizedCProgram.verbose_enter();
			} 
			++no_wait_return;
			if (debug_break_level > 0 || ModernizedCProgram.p_vfile == (byte)'\000') {
				msg_scroll = /* always scroll up, don't overwrite */1;
			} 
			ModernizedCProgram.smsg(((byte)("Exception caught: %s")), generatedValue);
			ModernizedCProgram.msg_puts(/* don't overwrite this either */"\n");
			if (debug_break_level > 0 || ModernizedCProgram.p_vfile == (byte)'\000') {
				ModernizedCProgram.cmdline_row = ModernizedCProgram.msg_row;
			} 
			--no_wait_return;
			if (debug_break_level > 0) {
				msg_silent = save_msg_silent;
			} else {
					ModernizedCProgram.verbose_leave();
			} 
		} 
	}
	public void finish_exception() {
		if (excp != caught_stack) {
			ModernizedCProgram.internal_error("finish_exception()");
		} 
		vim_exception generatedCaught = caught_stack.getCaught();
		caught_stack = generatedCaught;
		Byte generatedValue = caught_stack.getValue();
		Object generatedThrow_name = caught_stack.getThrow_name();
		Object generatedThrow_lnum = caught_stack.getThrow_lnum();
		if (caught_stack != ((Object)0)) {
			ModernizedCProgram.set_vim_var_string(29, (char_u)generatedValue, -1);
			if (generatedThrow_name != (byte)'\000') {
				if (generatedThrow_lnum != 0) {
					ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("%s, line %ld")), generatedThrow_name, (long)generatedThrow_lnum);
				} else {
						ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%s", generatedThrow_name);
				} 
				ModernizedCProgram.set_vim_var_string(30, ModernizedCProgram.IObuff, -1);
			} else {
					ModernizedCProgram.set_vim_var_string(30, ((Object)0), -/* throw_name not set on an exception from a command that was
						     * typed. */1);
			} 
		} else {
				ModernizedCProgram.set_vim_var_string(29, ((Object)0), -1);
				ModernizedCProgram.set_vim_var_string(30, ((Object)0), -1);
		} 
		excp.discard_exception(/* Discard the exception, but use the finish message for 'verbose'. */1/*
		 * Flags specifying the message displayed by report_pending.
		 */);
	}
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
		value = newValue;
	}
	public msglist getMessages() {
		return messages;
	}
	public void setMessages(msglist newMessages) {
		messages = newMessages;
	}
	public Object getThrow_name() {
		return throw_name;
	}
	public void setThrow_name(Object newThrow_name) {
		throw_name = newThrow_name;
	}
	public Object getThrow_lnum() {
		return throw_lnum;
	}
	public void setThrow_lnum(Object newThrow_lnum) {
		throw_lnum = newThrow_lnum;
	}
	public vim_exception getCaught() {
		return caught;
	}
	public void setCaught(vim_exception newCaught) {
		caught = newCaught;
	}
}
