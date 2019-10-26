package application;

/*
 * Copyright (c) 2014 Hugh Bailey <obs.jim@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
public class decl_param {
	private Byte name;
	private call_param_type type;
	private Object flags;
	
	public decl_param(Byte name, call_param_type type, Object flags) {
		setName(name);
		setType(type);
		setFlags(flags);
	}
	public decl_param() {
	}
	
	public void decl_param_free() {
		if (ModernizedCProgram.param.getName()) {
			ModernizedCProgram.bfree(ModernizedCProgram.param.getName());
		} 
		.memset(ModernizedCProgram.param, 0, );
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public call_param_type getType() {
		return type;
	}
	public void setType(call_param_type newType) {
		type = newType;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
}
