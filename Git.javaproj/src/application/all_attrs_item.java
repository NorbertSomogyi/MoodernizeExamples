package application;

public class all_attrs_item {
	private Object attr;
	private Object value;
	private Object macro;
	
	public all_attrs_item(Object attr, Object value, Object macro) {
		setAttr(attr);
		setValue(value);
		setMacro(macro);
	}
	public all_attrs_item() {
	}
	
	public int fill_one(Object what, Object a, int rem) {
		int i;
		for (i = a.getNum_attr() - 1; rem > 0 && i >= 0; i--) {
			git_attr attr = a.getState()[i].getAttr();
			byte n = (ModernizedCProgram.all_attrs[ModernizedCProgram.attr.getAttr_nr()].getValue());
			byte v = a.getState()[i].getSetto();
			if (n == ModernizedCProgram.git_attr__unknown) {
				do {
					;
				} while (0);
				n = v;
				rem--;
				rem = ModernizedCProgram.all_attrs.macroexpand_one(ModernizedCProgram.attr.getAttr_nr(), rem);
			} 
		}
		return rem;
	}
	public int fill(Object path, int pathlen, int basename_offset, Object stack, int rem) {
		for (; rem > 0 && stack; stack = stack.getPrev()) {
			int i;
			byte base = stack.getOrigin() ? stack.getOrigin() : "";
			for (i = stack.getNum_matches() - 1; 0 < rem && 0 <= i; i--) {
				match_attr a = stack.getAttrs()[i];
				if (a.getIs_macro()) {
					continue;
				} 
				if (ModernizedCProgram.path_matches(path, pathlen, basename_offset, a.getU().getPat(), base, stack.getOriginlen())) {
					rem = ModernizedCProgram.all_attrs.fill_one("fill", a, rem);
				} 
			}
		}
		return rem;
		if (min <= ModernizedCProgram.len) {
			return ModernizedCProgram.buffer + ModernizedCProgram.offset;
		} 
		if (min > ) {
			ModernizedCProgram.die("cannot fill %d bytes", min);
		} 
		if (ModernizedCProgram.offset) {
			.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.ctx, ModernizedCProgram.buffer, ModernizedCProgram.offset);
			.memmove(ModernizedCProgram.buffer, ModernizedCProgram.buffer + ModernizedCProgram.offset, ModernizedCProgram.len);
			ModernizedCProgram.offset = 0;
		} 
		do {
			ssize_t ret = ModernizedCProgram.xread(0, ModernizedCProgram.buffer + ModernizedCProgram.len,  - ModernizedCProgram.len);
			if (ret <= 0) {
				if (!ret) {
					ModernizedCProgram.die("early EOF");
				} 
				ModernizedCProgram.die_errno("read error on input");
			} 
			ModernizedCProgram.len += ret;
		} while (ModernizedCProgram.len < min);
		return ModernizedCProgram.buffer;
		if (min <= ModernizedCProgram.input_len) {
			return ModernizedCProgram.input_buffer + ModernizedCProgram.input_offset;
		} 
		if (min > ) {
			ModernizedCProgram.die(ModernizedCProgram.Q_("cannot fill %d byte", "cannot fill %d bytes", min), min);
		} 
		ModernizedCProgram.flush();
		do {
			ssize_t ret = ModernizedCProgram.xread(ModernizedCProgram.input_fd, ModernizedCProgram.input_buffer + ModernizedCProgram.input_len,  - ModernizedCProgram.input_len);
			if (ret <= 0) {
				if (!ret) {
					ModernizedCProgram.die(ModernizedCProgram._("early EOF"));
				} 
				ModernizedCProgram.die_errno(ModernizedCProgram._("read error on input"));
			} 
			ModernizedCProgram.input_len += ret;
			if (ModernizedCProgram.from_stdin) {
				ModernizedCProgram.progress.display_throughput(ModernizedCProgram.consumed_bytes + ModernizedCProgram.input_len);
			} 
		} while (ModernizedCProgram.input_len < min);
		return ModernizedCProgram.input_buffer;
	}
	public int macroexpand_one(int nr, int rem) {
		all_attrs_item item = ModernizedCProgram.all_attrs[nr];
		if (item.getMacro() && item.getValue() == ModernizedCProgram.git_attr__true) {
			return ModernizedCProgram.all_attrs.fill_one("expand", item.getMacro(), rem);
		} else {
				return rem/*
				 * Marks the attributes which are macros based on the attribute stack.
				 * This prevents having to search through the attribute stack each time
				 * a macro needs to be expanded during the fill stage.
				 */;
		} 
	}
	public void determine_macros(Object stack) {
		for (; stack; stack = stack.getPrev()) {
			int i;
			for (i = stack.getNum_matches() - 1; i >= 0; i--) {
				match_attr ma = stack.getAttrs()[i];
				if (ma.getIs_macro()) {
					int n = ma.getU().getAttr().getAttr_nr();
					if (!ModernizedCProgram.all_attrs[n].getMacro()) {
						ModernizedCProgram.all_attrs[n].setMacro(ma);
					} 
				} 
			}
		}
	}
	public Object getAttr() {
		return attr;
	}
	public void setAttr(Object newAttr) {
		attr = newAttr;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
	public Object getMacro() {
		return macro;
	}
	public void setMacro(Object newMacro) {
		macro = newMacro;
	}
}
