package application;

public class ref_formatting_state {
	private int quote_style;
	private ref_formatting_stack stack;
	
	public ref_formatting_state(int quote_style, ref_formatting_stack stack) {
		setQuote_style(quote_style);
		setStack(stack);
	}
	public ref_formatting_state() {
	}
	
	public void append_literal(Object[] cp, Object ep) {
		strbuf s = ModernizedCProgram.state.getStack().getOutput();
		while (cp && (!ep || cp < ep)) {
			if (cp == (byte)'%') {
				if (cp[1] == (byte)'%') {
					cp++;
				} else {
						int ch = ModernizedCProgram.hex2chr(cp + 1);
						if (0 <= ch) {
							s.strbuf_addch(ch);
							cp += 3;
							continue;
						} 
				} 
			} 
			s.strbuf_addch(cp);
			cp++;
		}
	}
	public int getQuote_style() {
		return quote_style;
	}
	public void setQuote_style(int newQuote_style) {
		quote_style = newQuote_style;
	}
	public ref_formatting_stack getStack() {
		return stack;
	}
	public void setStack(ref_formatting_stack newStack) {
		stack = newStack;
	}
}
