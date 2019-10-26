package application;

/*
 * Licensed under a two-clause BSD-style license.
 * See LICENSE for details.
 */
/*
 * svndiff0 applier
 *
 * See http://svn.apache.org/repos/asf/subversion/trunk/notes/svndiff.
 *
 * svndiff0 ::= 'SVN\0' window*
 * window ::= int int int int int instructions inline_data;
 * instructions ::= instruction*;
 * instruction ::= view_selector int int
 *   | copyfrom_data int
 *   | packed_view_selector int
 *   | packed_copyfrom_data
 *   ;
 * view_selector ::= copyfrom_source
 *   | copyfrom_target
 *   ;
 * copyfrom_source ::= # binary 00 000000;
 * copyfrom_target ::= # binary 01 000000;
 * copyfrom_data ::= # binary 10 000000;
 * packed_view_selector ::= # view_selector OR-ed with 6 bit value;
 * packed_copyfrom_data ::= # copyfrom_data OR-ed with 6 bit value;
 * int ::= highdigit* lowdigit;
 * highdigit ::= # binary 1000 0000 OR-ed with 7 bit value;
 * lowdigit ::= # 7 bit value;
 */
public class window {
	private sliding_view in;
	private strbuf out;
	private strbuf instructions;
	private strbuf data;
	
	public window(sliding_view in, strbuf out, strbuf instructions, strbuf data) {
		setIn(in);
		setOut(out);
		setInstructions(instructions);
		setData(data);
	}
	public window() {
	}
	
	public void window_release() {
		ModernizedCProgram.ctx.getOut().strbuf_release();
		ModernizedCProgram.ctx.getInstructions().strbuf_release();
		ModernizedCProgram.ctx.getData().strbuf_release();
	}
	public int copyfrom_source(Object instructions, Object nbytes, Object insns_end) {
		size_t offset = new size_t();
		if (ModernizedCProgram.parse_int(instructions, offset, insns_end)) {
			return -1;
		} 
		if (((nbytes) > (-1024 >> ((8 * ) - (8 * ))) - (offset)) || offset + nbytes > ModernizedCProgram.ctx.getIn().getWidth()) {
			return ();
		} 
		ModernizedCProgram.ctx.getOut().strbuf_add(ModernizedCProgram.ctx.getIn().getBuf().getBuf() + offset, nbytes);
		return 0;
	}
	public int copyfrom_target(Object instructions, Object nbytes, Object instructions_end) {
		size_t offset = new size_t();
		if (ModernizedCProgram.parse_int(instructions, offset, instructions_end)) {
			return -1;
		} 
		if (offset >= ModernizedCProgram.ctx.getOut().getLen()) {
			return ();
		} 
		for (; nbytes > 0; nbytes--) {
			ModernizedCProgram.ctx.getOut().strbuf_addch(ModernizedCProgram.ctx.getOut().getBuf()[offset++]);
		}
		return 0;
	}
	public int copyfrom_data(Object data_pos, Object nbytes) {
		size_t pos = data_pos;
		if (((nbytes) > (-1024 >> ((8 * ) - (8 * ))) - (pos)) || pos + nbytes > ModernizedCProgram.ctx.getData().getLen()) {
			return ();
		} 
		ModernizedCProgram.ctx.getOut().strbuf_add(ModernizedCProgram.ctx.getData().getBuf() + pos, nbytes);
		data_pos += nbytes;
		return 0;
	}
	public int execute_one_instruction(Object instructions, Object data_pos) {
		int instruction;
		byte insns_end = ModernizedCProgram.ctx.getInstructions().getBuf() + ModernizedCProgram.ctx.getInstructions().getLen();
		size_t nbytes = new size_t();
		((ModernizedCProgram.ctx) ? (Object)0 : ._assert("ctx", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\svndiff.c", 221));
		((instructions && instructions) ? (Object)0 : ._assert("instructions && *instructions", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\svndiff.c", 222));
		((data_pos) ? (Object)0 : ._assert("data_pos", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\svndiff.c", 223));
		instruction = (byte)instructions;
		if (ModernizedCProgram.parse_first_operand(instructions, nbytes, insns_end)) {
			return -1;
		} 
		switch (instruction & -1024) {
		case -1024:
				return ModernizedCProgram.ctx.copyfrom_target(instructions, nbytes, insns_end);
		case -1024:
				return ModernizedCProgram.ctx.copyfrom_source(instructions, nbytes, insns_end);
		case -1024:
				return ModernizedCProgram.ctx.copyfrom_data(data_pos, nbytes);
		default:
				return ();
		}
	}
	public int apply_window_in_core() {
		byte instructions;
		size_t data_pos = 0/*
			 * Fill ctx->out.buf using data from the source, target,
			 * and inline data views.
			 */;
		for (instructions = ModernizedCProgram.ctx.getInstructions().getBuf(); instructions != ModernizedCProgram.ctx.getInstructions().getBuf() + ModernizedCProgram.ctx.getInstructions().getLen(); ) {
			if (ModernizedCProgram.ctx.execute_one_instruction(instructions, data_pos)) {
				return -1;
			} 
		}
		if (data_pos != ModernizedCProgram.ctx.getData().getLen()) {
			return ();
		} 
		return 0;
	}
	public sliding_view getIn() {
		return in;
	}
	public void setIn(sliding_view newIn) {
		in = newIn;
	}
	public strbuf getOut() {
		return out;
	}
	public void setOut(strbuf newOut) {
		out = newOut;
	}
	public strbuf getInstructions() {
		return instructions;
	}
	public void setInstructions(strbuf newInstructions) {
		instructions = newInstructions;
	}
	public strbuf getData() {
		return data;
	}
	public void setData(strbuf newData) {
		data = newData;
	}
}
