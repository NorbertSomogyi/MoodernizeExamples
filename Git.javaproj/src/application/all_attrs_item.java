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
