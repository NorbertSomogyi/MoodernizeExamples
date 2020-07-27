package application;

/*
 * Copyright (c) 2013 Hugh Bailey <obs.jim@gmail.com>
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
/*
 * Dynamic array.
 *
 * NOTE: Not type-safe when using directly.
 *       Specifying size per call with inline maximizes compiler optimizations
 *
 *       See DARRAY macro at the bottom of the file for slightly safer usage.
 */
public class darray {
	private Object array;
	private Object num;
	private Object capacity;
	
	public darray(Object array, Object num, Object capacity) {
		setArray(array);
		setNum(num);
		setCapacity(capacity);
	}
	public darray() {
	}
	
	public int config_parse_file(Object file, boolean always_open) {
		byte file_data;
		lexer lex = new lexer();
		FILE f = new FILE();
		f = ModernizedCProgram.os_fopen(file, "rb");
		if (always_open && !f) {
			f = ModernizedCProgram.os_fopen(file, "w+");
		} 
		if (!f) {
			return -1;
		} 
		f.os_fread_utf8(file_data);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(f);
		if (!file_data) {
			return 0;
		} 
		lex.lexer_init();
		lex.lexer_start_move(file_data);
		ModernizedCProgram.parse_config_data(sections, lex);
		lex.lexer_free();
		return 0;
	}
	public void append_end_token() {
		cf_token end = new cf_token();
		end.cf_token_clear();
		tokens.darray_push_back(/*Error: Unsupported expression*/, end);
	}
	public void darray_init() {
		this.setArray(((Object)0));
		this.setNum(0);
		this.setCapacity(0);
	}
	public void darray_free() {
		Object generatedArray = this.getArray();
		ModernizedCProgram.bfree(generatedArray);
		this.setArray(((Object)0));
		this.setNum(0);
		this.setCapacity(0);
	}
	public void darray_reserve(Object element_size, Object capacity) {
		Object ptr;
		Object generatedNum = this.getNum();
		if (capacity == 0 || capacity <= generatedNum) {
			return /*Error: Unsupported expression*/;
		} 
		ptr = ModernizedCProgram.bmalloc(element_size * capacity);
		Object generatedArray = this.getArray();
		if (generatedNum) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ptr, generatedArray, element_size * generatedNum);
		} 
		if (generatedArray) {
			ModernizedCProgram.bfree(generatedArray);
		} 
		this.setArray(ptr);
		this.setCapacity(capacity);
	}
	public void darray_ensure_capacity(Object element_size, Object new_size) {
		size_t new_cap = new size_t();
		Object ptr;
		Object generatedCapacity = this.getCapacity();
		if (new_size <= generatedCapacity) {
			return /*Error: Unsupported expression*/;
		} 
		new_cap = (!generatedCapacity) ? new_size : generatedCapacity * 2;
		if (new_size > new_cap) {
			new_cap = new_size;
		} 
		ptr = ModernizedCProgram.bmalloc(element_size * new_cap);
		Object generatedArray = this.getArray();
		if (generatedCapacity) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ptr, generatedArray, element_size * generatedCapacity);
		} 
		if (generatedArray) {
			ModernizedCProgram.bfree(generatedArray);
		} 
		this.setArray(ptr);
		this.setCapacity(new_cap);
	}
	public void darray_resize(Object element_size, Object size) {
		int b_clear;
		size_t old_num = new size_t();
		Object generatedNum = this.getNum();
		if (size == generatedNum) {
			return /*Error: Unsupported expression*/;
		}  else if (size == 0) {
			this.setNum(0);
			return /*Error: Unsupported expression*/;
		} 
		b_clear = size > generatedNum;
		old_num = generatedNum;
		dst.darray_ensure_capacity(element_size, size);
		this.setNum(size);
		if (b_clear) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.darray_item(element_size, dst, old_num), 0, element_size * (generatedNum - old_num));
		} 
	}
	public void darray_copy(Object element_size, Object da) {
		Object generatedArray = this.getArray();
		if (da.getNum() == 0) {
			dst.darray_free();
		} else {
				dst.darray_resize(element_size, da.getNum());
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedArray, generatedArray, element_size * da.getNum());
		} 
	}
	public void darray_copy_array(Object element_size, Object array, Object num) {
		dst.darray_resize(element_size, num);
		Object generatedArray = this.getArray();
		Object generatedNum = this.getNum();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedArray, array, element_size * generatedNum);
	}
	public void darray_move(darray src) {
		dst.darray_free();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dst, src, /*Error: Unsupported expression*/);
		src.setArray(((Object)0));
		src.setCapacity(0);
		src.setNum(0);
	}
	public Object darray_push_back(Object element_size, Object item) {
		Object generatedNum = this.getNum();
		dst.darray_ensure_capacity(element_size, ++generatedNum);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.darray_end(element_size, dst), item, element_size);
		return generatedNum - 1;
	}
	public Object darray_push_back_new(Object element_size) {
		Object last;
		Object generatedNum = this.getNum();
		dst.darray_ensure_capacity(element_size, ++generatedNum);
		last = ModernizedCProgram.darray_end(element_size, dst);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(last, 0, element_size);
		return last;
	}
	public Object darray_push_back_array(Object element_size, Object array, Object num) {
		size_t old_num = new size_t();
		if (!dst) {
			return 0;
		} 
		Object generatedNum = this.getNum();
		if (!array || !num) {
			return generatedNum;
		} 
		old_num = generatedNum;
		dst.darray_resize(element_size, generatedNum + num);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.darray_item(element_size, dst, old_num), array, element_size * num);
		return old_num;
	}
	public Object darray_push_back_darray(Object element_size, Object da) {
		return dst.darray_push_back_array(element_size, da.getArray(), da.getNum());
	}
	public void darray_insert(Object element_size, Object idx, Object item) {
		Object new_item;
		size_t move_count = new size_t();
		Object generatedNum = this.getNum();
		((idx <= generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("idx <= dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 241));
		if (idx == generatedNum) {
			dst.darray_push_back(element_size, item);
			return /*Error: Unsupported expression*/;
		} 
		move_count = generatedNum - idx;
		dst.darray_ensure_capacity(element_size, ++generatedNum);
		new_item = ModernizedCProgram.darray_item(element_size, dst, idx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.darray_item(element_size, dst, idx + 1), new_item, move_count * element_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(new_item, item, element_size);
	}
	public Object darray_insert_new(Object element_size, Object idx) {
		Object item;
		size_t move_count = new size_t();
		Object generatedNum = this.getNum();
		((idx <= generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("idx <= dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 264));
		if (idx == generatedNum) {
			return dst.darray_push_back_new(element_size);
		} 
		item = ModernizedCProgram.darray_item(element_size, dst, idx);
		move_count = generatedNum - idx;
		dst.darray_ensure_capacity(element_size, ++generatedNum);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.darray_item(element_size, dst, idx + 1), item, move_count * element_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(item, 0, element_size);
		return item;
	}
	public void darray_insert_array(Object element_size, Object idx, Object array, Object num) {
		size_t old_num = new size_t();
		((array != ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("array != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 285));
		((num != 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("num != 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 286));
		Object generatedNum = this.getNum();
		((idx < generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("idx < dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 287));
		old_num = generatedNum;
		dst.darray_resize(element_size, generatedNum + num);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.darray_item(element_size, dst, idx + num), ModernizedCProgram.darray_item(element_size, dst, idx), element_size * (old_num - idx));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.darray_item(element_size, dst, idx), array, element_size * num);
	}
	public void darray_insert_darray(Object element_size, Object idx, Object da) {
		dst.darray_insert_array(element_size, idx, da.getArray(), da.getNum());
	}
	public void darray_erase(Object element_size, Object idx) {
		Object generatedNum = this.getNum();
		((idx < generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("idx < dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 308));
		if (idx >= generatedNum || !--generatedNum) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.darray_item(element_size, dst, idx), ModernizedCProgram.darray_item(element_size, dst, idx + 1), element_size * (generatedNum - idx));
	}
	public void darray_erase_item(Object element_size, Object item) {
		size_t idx = ModernizedCProgram.darray_find(element_size, dst, item, 0);
		if (idx != ((size_t)-1)) {
			dst.darray_erase(element_size, idx);
		} 
	}
	public void darray_erase_range(Object element_size, Object start, Object end) {
		size_t count = new size_t();
		size_t move_count = new size_t();
		Object generatedNum = this.getNum();
		((start <= generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("start <= dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 332));
		((end <= generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("end <= dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 333));
		((end > start) ? (Object)0 : /*Error: Function owner not recognized*/_assert("end > start", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 334));
		count = end - start;
		if (count == 1) {
			dst.darray_erase(element_size, start);
			return /*Error: Unsupported expression*/;
		}  else if (count == generatedNum) {
			this.setNum(0);
			return /*Error: Unsupported expression*/;
		} 
		move_count = generatedNum - end;
		if (move_count) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.darray_item(element_size, dst, start), ModernizedCProgram.darray_item(element_size, dst, end), move_count * element_size);
		} 
		generatedNum -= count;
	}
	public void darray_pop_back(Object element_size) {
		Object generatedNum = this.getNum();
		((generatedNum != 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("dst->num != 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 357));
		if (generatedNum) {
			dst.darray_erase(element_size, generatedNum - 1);
		} 
	}
	public void darray_join(Object element_size, darray da) {
		dst.darray_push_back_darray(element_size, da);
		da.darray_free();
	}
	public void darray_split(Object element_size, darray dst2, Object da, Object idx) {
		darray temp = new darray();
		((da.getNum() >= idx) ? (Object)0 : /*Error: Function owner not recognized*/_assert("da->num >= idx", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 376));
		((dst1 != dst2) ? (Object)0 : /*Error: Function owner not recognized*/_assert("dst1 != dst2", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 377));
		temp.darray_init();
		temp.darray_copy(element_size, da);
		dst1.darray_free();
		dst2.darray_free();
		Object generatedArray = temp.getArray();
		Object generatedNum = temp.getNum();
		if (da.getNum()) {
			if (idx) {
				dst1.darray_copy_array(element_size, generatedArray, generatedNum);
			} 
			if (idx < generatedNum - 1) {
				dst2.darray_copy_array(element_size, ModernizedCProgram.darray_item(element_size, temp, idx), generatedNum - idx);
			} 
		} 
		temp.darray_free();
	}
	public void darray_move_item(Object element_size, Object from, Object to) {
		Object temp;
		Object p_from;
		Object p_to;
		if (from == to) {
			return /*Error: Unsupported expression*/;
		} 
		temp = /*Error: Function owner not recognized*/malloc(element_size);
		p_from = ModernizedCProgram.darray_item(element_size, dst, from);
		p_to = ModernizedCProgram.darray_item(element_size, dst, to);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(temp, p_from, element_size);
		if (to < from) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.darray_item(element_size, dst, to + 1), p_to, element_size * (from - to));
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(p_from, ModernizedCProgram.darray_item(element_size, dst, from + 1), element_size * (to - from));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p_to, temp, element_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(temp);
	}
	public void darray_swap(Object element_size, Object a, Object b) {
		Object temp;
		Object a_ptr;
		Object b_ptr;
		Object generatedNum = this.getNum();
		((a < generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("a < dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 429));
		((b < generatedNum) ? (Object)0 : /*Error: Function owner not recognized*/_assert("b < dst->num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\darray.h", 430));
		if (a == b) {
			return /*Error: Unsupported expression*/;
		} 
		temp = /*Error: Function owner not recognized*/malloc(element_size);
		a_ptr = ModernizedCProgram.darray_item(element_size, dst, a);
		b_ptr = ModernizedCProgram.darray_item(element_size, dst, b);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(temp, a_ptr, element_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(a_ptr, b_ptr, element_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(b_ptr, temp, element_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(temp/*
		 * Defines to make dynamic arrays more type-safe.
		 * Note: Still not 100% type-safe but much better than using darray directly
		 *       Makes it a little easier to use as well.
		 *
		 *       I did -not- want to use a gigantic macro to generate a crapload of
		 *       typesafe inline functions per type.  It just feels like a mess to me.
		 */);
	}
	public void clear_tex_params() {
		Object generatedDarray = this.getDarray();
		pass_shaderparam params = generatedDarray;
		gs_shader_param_type generatedType = info.getType();
		for ( i = 0;
		 i < generatedDarray; i++) {
			pass_shaderparam param = params + i;
			gs_shader_param_info info = new gs_shader_param_info();
			info.gs_shader_get_param_info(ModernizedCProgram.param.getSparam());
			if (generatedType == gs_shader_param_type.GS_SHADER_PARAM_TEXTURE) {
				ModernizedCProgram.gs_shader_set_texture(ModernizedCProgram.param.getSparam(), ((Object)0));
			} 
		}
	}
	public Object getArray() {
		return array;
	}
	public void setArray(Object newArray) {
		array = newArray;
	}
	public Object getNum() {
		return num;
	}
	public void setNum(Object newNum) {
		num = newNum;
	}
	public Object getCapacity() {
		return capacity;
	}
	public void setCapacity(Object newCapacity) {
		capacity = newCapacity;
	}
}
