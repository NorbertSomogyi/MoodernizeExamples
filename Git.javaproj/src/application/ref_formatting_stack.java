package application;

public class ref_formatting_stack {
	private ref_formatting_stack prev;
	private strbuf output;
	private Object at_end;
	private Object at_end_data;
	
	public ref_formatting_stack(ref_formatting_stack prev, strbuf output, Object at_end, Object at_end_data) {
		setPrev(prev);
		setOutput(output);
		setAt_end(at_end);
		setAt_end_data(at_end_data);
	}
	public ref_formatting_stack() {
	}
	
	public void push_stack_element() {
		ref_formatting_stack s = ModernizedCProgram.xcalloc(1, );
		strbuf generatedOutput = s.getOutput();
		generatedOutput.strbuf_init(0);
		s.setPrev(stack);
		stack = s;
	}
	public void pop_stack_element() {
		ref_formatting_stack current = stack;
		ref_formatting_stack generatedPrev = current.getPrev();
		ref_formatting_stack prev = generatedPrev;
		strbuf generatedOutput = prev.getOutput();
		if (prev) {
			generatedOutput.strbuf_addbuf(generatedOutput);
		} 
		generatedOutput.strbuf_release();
		ModernizedCProgram.free(current);
		stack = prev;
	}
	public void end_align_handler() {
		ref_formatting_stack cur = stack;
		Object generatedAt_end_data = cur.getAt_end_data();
		align align = (align)generatedAt_end_data;
		strbuf s = new strbuf(, , );
		 generatedPosition = align.getPosition();
		int generatedWidth = align.getWidth();
		strbuf generatedOutput = cur.getOutput();
		byte generatedBuf = generatedOutput.getBuf();
		s.strbuf_utf8_align(generatedPosition, generatedWidth, generatedBuf);
		generatedOutput.strbuf_swap(s);
		s.strbuf_release();
	}
	public void if_then_else_handler() {
		ref_formatting_stack cur = stack;
		ref_formatting_stack generatedPrev = cur.getPrev();
		ref_formatting_stack prev = generatedPrev;
		Object generatedAt_end_data = cur.getAt_end_data();
		if_then_else if_then_else = (if_then_else)generatedAt_end_data;
		int generatedThen_atom_seen = if_then_else.getThen_atom_seen();
		if (!generatedThen_atom_seen) {
			ModernizedCProgram.die(ModernizedCProgram._("format: %%(if) atom used without a %%(then) atom"));
		} 
		int generatedElse_atom_seen = if_then_else.getElse_atom_seen();
		int generatedCondition_satisfied = if_then_else.getCondition_satisfied();
		strbuf generatedOutput = cur.getOutput();
		if (generatedElse_atom_seen) {
			if (generatedCondition_satisfied) {
				generatedOutput.strbuf_setlen(0);
				cur.pop_stack_element();
			} else {
					generatedOutput.strbuf_swap(generatedOutput);
					generatedOutput.strbuf_setlen(0);
					cur.pop_stack_element();
			} 
		}  else if (!generatedCondition_satisfied) {
			generatedOutput.strbuf_setlen(0);
		} 
		stack = cur;
		ModernizedCProgram.free(if_then_else);
	}
	public ref_formatting_stack getPrev() {
		return prev;
	}
	public void setPrev(ref_formatting_stack newPrev) {
		prev = newPrev;
	}
	public strbuf getOutput() {
		return output;
	}
	public void setOutput(strbuf newOutput) {
		output = newOutput;
	}
	public Object getAt_end() {
		return at_end;
	}
	public void setAt_end(Object newAt_end) {
		at_end = newAt_end;
	}
	public Object getAt_end_data() {
		return at_end_data;
	}
	public void setAt_end_data(Object newAt_end_data) {
		at_end_data = newAt_end_data;
	}
}
