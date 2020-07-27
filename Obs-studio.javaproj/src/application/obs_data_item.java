package application;

/******************************************************************************
    Copyright (C) 2014 by Hugh Bailey <obs.jim@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
public class obs_data_item {
	private Object ref;
	private obs_data parent;
	private obs_data_item next;
	private obs_data_type type;
	private Object name_len;
	private Object data_len;
	private Object data_size;
	private Object default_len;
	private Object default_size;
	private Object autoselect_size;
	private Object capacity;
	
	public obs_data_item(Object ref, obs_data parent, obs_data_item next, obs_data_type type, Object name_len, Object data_len, Object data_size, Object default_len, Object default_size, Object autoselect_size, Object capacity) {
		setRef(ref);
		setParent(parent);
		setNext(next);
		setType(type);
		setName_len(name_len);
		setData_len(data_len);
		setData_size(data_size);
		setDefault_len(default_len);
		setDefault_size(default_size);
		setAutoselect_size(autoselect_size);
		setCapacity(capacity);
	}
	public obs_data_item() {
	}
	
	public Byte get_item_name() {
		return (byte)item + /*Error: Unsupported expression*/;
	}
	public Object get_data_ptr() {
		Object generatedName_len = this.getName_len();
		return ()item.get_item_name() + generatedName_len;
	}
	public Object get_item_data() {
		Object generatedData_size = this.getData_size();
		Object generatedDefault_size = this.getDefault_size();
		Object generatedAutoselect_size = this.getAutoselect_size();
		if (!generatedData_size && !generatedDefault_size && !generatedAutoselect_size) {
			return ((Object)0);
		} 
		return item.get_data_ptr();
	}
	public Object get_default_data_ptr() {
		Object generatedData_len = this.getData_len();
		return ()item.get_data_ptr() + generatedData_len;
	}
	public Object get_item_default_data() {
		Object generatedDefault_size = this.getDefault_size();
		return generatedDefault_size ? item.get_default_data_ptr() : ((Object)0);
	}
	public Object get_autoselect_data_ptr() {
		Object generatedDefault_len = this.getDefault_len();
		return ()item.get_default_data_ptr() + generatedDefault_len;
	}
	public Object get_item_autoselect_data() {
		Object generatedAutoselect_size = this.getAutoselect_size();
		return generatedAutoselect_size ? item.get_autoselect_data_ptr() : ((Object)0);
	}
	public Object obs_data_item_total_size() {
		Object generatedName_len = this.getName_len();
		Object generatedData_len = this.getData_len();
		Object generatedDefault_len = this.getDefault_len();
		Object generatedAutoselect_size = this.getAutoselect_size();
		return /*Error: Unsupported expression*/ + generatedName_len + generatedData_len + generatedDefault_len + generatedAutoselect_size;
	}
	public void item_data_release() {
		if (!item.obs_data_item_has_user_value()) {
			return /*Error: Unsupported expression*/;
		} 
		obs_data_type generatedType = this.getType();
		obs_data obs_data = new obs_data();
		obs_data_array obs_data_array = new obs_data_array();
		if (generatedType == obs_data_type.OBS_DATA_OBJECT) {
			obs_data_t obj = obs_data.get_item_obj(item);
			obj.obs_data_release();
		}  else if (generatedType == obs_data_type.OBS_DATA_ARRAY) {
			obs_data_array_t array = obs_data_array.get_item_array(item);
			array.obs_data_array_release();
		} 
	}
	public void item_default_data_release() {
		obs_data_type generatedType = this.getType();
		obs_data obs_data = new obs_data();
		obs_data_array obs_data_array = new obs_data_array();
		if (generatedType == obs_data_type.OBS_DATA_OBJECT) {
			obs_data_t obj = obs_data.get_item_default_obj(item);
			obj.obs_data_release();
		}  else if (generatedType == obs_data_type.OBS_DATA_ARRAY) {
			obs_data_array_t array = obs_data_array.get_item_default_array(item);
			array.obs_data_array_release();
		} 
	}
	public void item_autoselect_data_release() {
		obs_data_type generatedType = this.getType();
		obs_data obs_data = new obs_data();
		obs_data_array obs_data_array = new obs_data_array();
		if (generatedType == obs_data_type.OBS_DATA_OBJECT) {
			obs_data_t obj = obs_data.get_item_autoselect_obj(item);
			obj.obs_data_release();
		}  else if (generatedType == obs_data_type.OBS_DATA_ARRAY) {
			obs_data_array_t array = obs_data_array.get_item_autoselect_array(item);
			array.obs_data_array_release();
		} 
	}
	public void item_data_addref() {
		obs_data_type generatedType = this.getType();
		obs_data obs_data = new obs_data();
		obs_data_array obs_data_array = new obs_data_array();
		if (generatedType == obs_data_type.OBS_DATA_OBJECT) {
			obs_data_t obj = obs_data.get_item_obj(item);
			obj.obs_data_addref();
		}  else if (generatedType == obs_data_type.OBS_DATA_ARRAY) {
			obs_data_array_t array = obs_data_array.get_item_array(item);
			array.obs_data_array_addref();
		} 
	}
	public void item_default_data_addref() {
		Object generatedData_size = this.getData_size();
		if (!generatedData_size) {
			return /*Error: Unsupported expression*/;
		} 
		obs_data_type generatedType = this.getType();
		obs_data obs_data = new obs_data();
		obs_data_array obs_data_array = new obs_data_array();
		if (generatedType == obs_data_type.OBS_DATA_OBJECT) {
			obs_data_t obj = obs_data.get_item_default_obj(item);
			obj.obs_data_addref();
		}  else if (generatedType == obs_data_type.OBS_DATA_ARRAY) {
			obs_data_array_t array = obs_data_array.get_item_default_array(item);
			array.obs_data_array_addref();
		} 
	}
	public void item_autoselect_data_addref() {
		obs_data_type generatedType = this.getType();
		obs_data obs_data = new obs_data();
		obs_data_array obs_data_array = new obs_data_array();
		if (generatedType == obs_data_type.OBS_DATA_OBJECT) {
			obs_data_t obj = obs_data.get_item_autoselect_obj(item);
			obj.obs_data_addref();
		}  else if (generatedType == obs_data_type.OBS_DATA_ARRAY) {
			obs_data_array_t array = obs_data_array.get_item_autoselect_array(item);
			array.obs_data_array_addref();
		} 
	}
	public obs_data_item obs_data_item_create(Object name, Object data, Object size, obs_data_type type, Object default_data, Object autoselect_data) {
		obs_data_item item = new obs_data_item();
		size_t name_size = new size_t();
		size_t total_size = new size_t();
		if (!name || !data) {
			return ((Object)0);
		} 
		name_size = ModernizedCProgram.get_name_align_size(name);
		total_size = name_size + /*Error: Unsupported expression*/ + size;
		item = ModernizedCProgram.bzalloc(total_size);
		item.setCapacity(total_size);
		item.setType(obs_data_type.type);
		item.setName_len(name_size);
		item.setRef(1);
		if (default_data) {
			item.setDefault_len(size);
			item.setDefault_size(size);
		}  else if (autoselect_data) {
			item.setAutoselect_size(size);
		} else {
				item.setData_len(size);
				item.setData_size(size);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(item.get_item_name(), name);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(item.get_item_data(), data, size);
		item.item_data_addref();
		return item;
	}
	public obs_data_item get_item_prev_next(obs_data data) {
		if (!current || !data) {
			return ((Object)0);
		} 
		obs_data_item generatedFirst_item = data.getFirst_item();
		obs_data_item prev_next = generatedFirst_item;
		obs_data_item item = generatedFirst_item;
		obs_data_item generatedNext = item.getNext();
		while (item) {
			if (item == current) {
				return prev_next;
			} 
			prev_next = generatedNext;
			item = generatedNext;
		}
		return ((Object)0);
	}
	public void obs_data_item_detach() {
		obs_data generatedParent = this.getParent();
		obs_data_item prev_next = item.get_item_prev_next(generatedParent);
		obs_data_item generatedNext = this.getNext();
		if (prev_next) {
			prev_next = generatedNext;
			this.setNext(((Object)0));
		} 
	}
	public void obs_data_item_reattach(obs_data_item new_ptr) {
		obs_data generatedParent = new_ptr.getParent();
		obs_data_item prev_next = old_ptr.get_item_prev_next(generatedParent);
		if (prev_next) {
			prev_next = new_ptr;
		} 
	}
	public obs_data_item obs_data_item_ensure_capacity() {
		size_t new_size = item.obs_data_item_total_size();
		obs_data_item new_item = new obs_data_item();
		Object generatedCapacity = this.getCapacity();
		if (generatedCapacity >= new_size) {
			return item;
		} 
		new_item = ModernizedCProgram.brealloc(item, new_size);
		new_item.setCapacity(new_size);
		item.obs_data_item_reattach(new_item);
		return new_item;
	}
	public void obs_data_item_destroy() {
		item.item_data_release();
		item.item_default_data_release();
		item.item_autoselect_data_release();
		item.obs_data_item_detach();
		ModernizedCProgram.bfree(item);
	}
	public void move_data(Object old_data, obs_data_item item, Object data, Object len) {
		ptrdiff_t old_offset = ()old_data - ()old_item;
		ptrdiff_t new_offset = ()data - ()item;
		if (!old_data) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(()item + new_offset, ()item + old_offset, len);
	}
	public void obs_data_item_setdata(Object data, Object size, obs_data_type type) {
		if (!p_item || !p_item) {
			return /*Error: Unsupported expression*/;
		} 
		obs_data_item item = p_item;
		ptrdiff_t old_default_data_pos = ()item.get_default_data_ptr() - ()item;
		item.item_data_release();
		item.setData_size(size);
		item.setType(obs_data_type.type);
		Object generatedDefault_size = item.getDefault_size();
		Object generatedAutoselect_size = item.getAutoselect_size();
		item.setData_len((generatedDefault_size || generatedAutoselect_size) ? ModernizedCProgram.get_align_size(size) : size);
		item = item.obs_data_item_ensure_capacity();
		Object generatedDefault_len = item.getDefault_len();
		if (generatedDefault_size || generatedAutoselect_size) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(item.get_default_data_ptr(), ()item + old_default_data_pos, generatedDefault_len + generatedAutoselect_size);
		} 
		if (size) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(item.get_item_data(), data, size);
			item.item_data_addref();
		} 
		p_item = item;
	}
	public void obs_data_item_set_default_data(Object data, Object size, obs_data_type type) {
		if (!p_item || !p_item) {
			return /*Error: Unsupported expression*/;
		} 
		obs_data_item item = p_item;
		Object old_autoselect_data = item.get_autoselect_data_ptr();
		item.item_default_data_release();
		item.setType(obs_data_type.type);
		item.setDefault_size(size);
		Object generatedAutoselect_size = item.getAutoselect_size();
		item.setDefault_len(generatedAutoselect_size ? ModernizedCProgram.get_align_size(size) : size);
		Object generatedData_size = item.getData_size();
		item.setData_len(generatedData_size ? ModernizedCProgram.get_align_size(generatedData_size) : 0);
		item = item.obs_data_item_ensure_capacity();
		if (generatedAutoselect_size) {
			p_item.move_data(old_autoselect_data, item, item.get_autoselect_data_ptr(), generatedAutoselect_size);
		} 
		if (size) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(item.get_item_default_data(), data, size);
			item.item_default_data_addref();
		} 
		p_item = item;
	}
	public void obs_data_item_set_autoselect_data(Object data, Object size, obs_data_type type) {
		if (!p_item || !p_item) {
			return /*Error: Unsupported expression*/;
		} 
		obs_data_item item = p_item;
		item.item_autoselect_data_release();
		item.setAutoselect_size(size);
		item.setType(obs_data_type.type);
		Object generatedData_size = item.getData_size();
		item.setData_len(generatedData_size ? ModernizedCProgram.get_align_size(generatedData_size) : 0);
		Object generatedDefault_size = item.getDefault_size();
		item.setDefault_len(generatedDefault_size ? ModernizedCProgram.get_align_size(generatedDefault_size) : 0);
		item = item.obs_data_item_ensure_capacity();
		if (size) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(item.get_item_autoselect_data(), data, size);
			item.item_autoselect_data_addref();
		} 
		p_item = item;
	}
	public obs_data_item get_item(obs_data data, Object name) {
		if (!data) {
			return ((Object)0);
		} 
		obs_data_item generatedFirst_item = data.getFirst_item();
		obs_data_item item = generatedFirst_item;
		obs_data_item generatedNext = item.getNext();
		while (item) {
			if (/*Error: Function owner not recognized*/strcmp(item.get_item_name(), name) == 0) {
				return item;
			} 
			item = generatedNext;
		}
		return ((Object)0);
	}
	public void clear_item() {
		Object ptr = item.get_item_data();
		size_t size = new size_t();
		Object generatedData_len = this.getData_len();
		obs_data_type generatedType = this.getType();
		Object generatedData_size = this.getData_size();
		Object generatedDefault_len = this.getDefault_len();
		Object generatedAutoselect_size = this.getAutoselect_size();
		if (generatedData_len) {
			if (generatedType == obs_data_type.OBS_DATA_OBJECT) {
				obs_data_t obj = generatedData_size ? ptr : ((Object)0);
				if (obj && obj) {
					obj.obs_data_release();
				} 
			}  else if (generatedType == obs_data_type.OBS_DATA_ARRAY) {
				obs_data_array_t array = generatedData_size ? ptr : ((Object)0);
				if (array && array) {
					array.obs_data_array_release();
				} 
			} 
			size = generatedDefault_len + generatedAutoselect_size;
			if (size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ptr, ()ptr + generatedData_len, size);
			} 
			this.setData_size(0);
			this.setData_len(0);
		} 
	}
	public Object obs_data_item_has_user_value() {
		Object generatedData_size = this.getData_size();
		return item && generatedData_size;
	}
	public Object obs_data_item_has_default_value() {
		Object generatedDefault_size = this.getDefault_size();
		return item && generatedDefault_size;
	}
	public Object obs_data_item_has_autoselect_value() {
		Object generatedAutoselect_size = this.getAutoselect_size();
		return item && generatedAutoselect_size;
	}
	public void obs_data_item_unset_user_value() {
		Object generatedData_size = this.getData_size();
		if (!item || !generatedData_size) {
			return /*Error: Unsupported expression*/;
		} 
		Object old_non_user_data = item.get_default_data_ptr();
		item.item_data_release();
		this.setData_size(0);
		this.setData_len(0);
		Object generatedDefault_size = this.getDefault_size();
		Object generatedAutoselect_size = this.getAutoselect_size();
		Object generatedDefault_len = this.getDefault_len();
		if (generatedDefault_size || generatedAutoselect_size) {
			item.move_data(old_non_user_data, item, item.get_default_data_ptr(), generatedDefault_len + generatedAutoselect_size);
		} 
	}
	public void obs_data_item_unset_default_value() {
		Object generatedDefault_size = this.getDefault_size();
		if (!item || !generatedDefault_size) {
			return /*Error: Unsupported expression*/;
		} 
		Object old_autoselect_data = item.get_autoselect_data_ptr();
		item.item_default_data_release();
		this.setDefault_size(0);
		this.setDefault_len(0);
		Object generatedAutoselect_size = this.getAutoselect_size();
		if (generatedAutoselect_size) {
			item.move_data(old_autoselect_data, item, item.get_autoselect_data_ptr(), generatedAutoselect_size);
		} 
	}
	public void obs_data_item_unset_autoselect_value() {
		Object generatedAutoselect_size = this.getAutoselect_size();
		if (!item || !generatedAutoselect_size) {
			return /*Error: Unsupported expression*/;
		} 
		item.item_autoselect_data_release();
		this.setAutoselect_size(0/* ------------------------------------------------------------------------- */);
	}
	/* Item iteration */
	public obs_data_item obs_data_first(obs_data data) {
		if (!data) {
			return ((Object)0);
		} 
		obs_data_item generatedFirst_item = data.getFirst_item();
		Object generatedRef = generatedFirst_item.getRef();
		if (generatedFirst_item) {
			ModernizedCProgram.os_atomic_inc_long(generatedRef);
		} 
		return generatedFirst_item;
	}
	public obs_data_item obs_data_item_byname(obs_data data, Object name) {
		if (!data) {
			return ((Object)0);
		} 
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item item = obs_data_item.get_item(data, name);
		Object generatedRef = item.getRef();
		if (item) {
			ModernizedCProgram.os_atomic_inc_long(generatedRef);
		} 
		return item;
	}
	public Object obs_data_item_next() {
		obs_data_item generatedNext = (item).getNext();
		Object generatedRef = next.getRef();
		if (item && item) {
			obs_data_item_t next = generatedNext;
			item.obs_data_item_release();
			item = next;
			if (next) {
				ModernizedCProgram.os_atomic_inc_long(generatedRef);
				return true;
			} 
		} 
		return false;
	}
	public void obs_data_item_release() {
		Object generatedRef = (item).getRef();
		if (item && item) {
			long ref = ModernizedCProgram.os_atomic_dec_long(generatedRef);
			if (!ref) {
				item.obs_data_item_destroy();
				item = ((Object)0);
			} 
		} 
	}
	public void obs_data_item_remove() {
		if (item && item) {
			item.obs_data_item_detach();
			item.obs_data_item_release();
		} 
	}
	public obs_data_type obs_data_item_gettype() {
		obs_data_type generatedType = this.getType();
		return item ? generatedType : obs_data_type.OBS_DATA_NULL;
	}
	public obs_data_number_type obs_data_item_numtype() {
		obs_data_number num = new obs_data_number();
		obs_data_type generatedType = this.getType();
		if (!item || generatedType != obs_data_type.OBS_DATA_NUMBER) {
			return obs_data_number_type.OBS_DATA_NUM_INVALID;
		} 
		num = item.get_item_data();
		return generatedType;
	}
	public Object obs_data_item_get_name() {
		if (!item) {
			return ((Object)0);
		} 
		return item.get_item_name();
	}
	public void obs_data_item_set_string(Object val) {
		ModernizedCProgram.obs_set_string(((Object)0), item, ((Object)0), val, set_item);
	}
	public void obs_data_item_set_int(int val) {
		ModernizedCProgram.obs_set_int(((Object)0), item, ((Object)0), val, set_item);
	}
	public void obs_data_item_set_double(double val) {
		ModernizedCProgram.obs_set_double(((Object)0), item, ((Object)0), val, set_item);
	}
	public void obs_data_item_set_bool(Object val) {
		ModernizedCProgram.obs_set_bool(((Object)0), item, ((Object)0), val, set_item);
	}
	public void obs_data_item_set_default_string(Object val) {
		ModernizedCProgram.obs_set_string(((Object)0), item, ((Object)0), val, set_item_def);
	}
	public void obs_data_item_set_default_int(int val) {
		ModernizedCProgram.obs_set_int(((Object)0), item, ((Object)0), val, set_item_def);
	}
	public void obs_data_item_set_default_double(double val) {
		ModernizedCProgram.obs_set_double(((Object)0), item, ((Object)0), val, set_item_def);
	}
	public void obs_data_item_set_default_bool(Object val) {
		ModernizedCProgram.obs_set_bool(((Object)0), item, ((Object)0), val, set_item_def);
	}
	public void obs_data_item_set_autoselect_string(Object val) {
		ModernizedCProgram.obs_set_string(((Object)0), item, ((Object)0), val, set_item_auto);
	}
	public void obs_data_item_set_autoselect_int(int val) {
		ModernizedCProgram.obs_set_int(((Object)0), item, ((Object)0), val, set_item_auto);
	}
	public void obs_data_item_set_autoselect_double(double val) {
		ModernizedCProgram.obs_set_double(((Object)0), item, ((Object)0), val, set_item_auto);
	}
	public void obs_data_item_set_autoselect_bool(Object val) {
		ModernizedCProgram.obs_set_bool(((Object)0), item, ((Object)0), val, set_item_auto);
	}
	public Object item_valid(obs_data_type type) {
		obs_data_type generatedType = this.getType();
		return item && generatedType == obs_data_type.type;
		Object generatedFiles = ss.getFiles();
		Object generatedCur_item = ss.getCur_item();
		return generatedFiles.getNum() && generatedCur_item < generatedFiles.getNum();
	}
	public Object data_item_get_string(Object get_data) {
		return item.item_valid(obs_data_type.OBS_DATA_STRING) && /*Error: Function owner not recognized*/get_data(item) ? /*Error: Function owner not recognized*/get_data(item) : "";
	}
	public int item_int(Object get_data) {
		obs_data_number_type generatedType = num.getType();
		int generatedInt_val = num.getInt_val();
		double generatedDouble_val = num.getDouble_val();
		if (item && /*Error: Function owner not recognized*/get_data(item)) {
			obs_data_number num = /*Error: Function owner not recognized*/get_data(item);
			return (generatedType == obs_data_number_type.OBS_DATA_NUM_INT) ? generatedInt_val : (long)generatedDouble_val;
		} 
		return 0;
	}
	public int data_item_get_int(Object get_data) {
		return item.item_valid(obs_data_type.OBS_DATA_NUMBER) ? item : ((Object)0).item_int(get_data);
	}
	public double item_double(Object get_data) {
		obs_data_number_type generatedType = num.getType();
		int generatedInt_val = num.getInt_val();
		double generatedDouble_val = num.getDouble_val();
		if (item && /*Error: Function owner not recognized*/get_data(item)) {
			obs_data_number num = /*Error: Function owner not recognized*/get_data(item);
			return (generatedType == obs_data_number_type.OBS_DATA_NUM_INT) ? (double)generatedInt_val : generatedDouble_val;
		} 
		return 0.0;
	}
	public double data_item_get_double(Object get_data) {
		return item.item_valid(obs_data_type.OBS_DATA_NUMBER) ? item : ((Object)0).item_double(get_data);
	}
	public Object data_item_get_bool(Object get_data) {
		return item.item_valid(obs_data_type.OBS_DATA_BOOLEAN) && /*Error: Function owner not recognized*/get_data(item) ? ()/*Error: Function owner not recognized*/get_data(item) : false;
	}
	public Object obs_data_item_get_string() {
		return item.data_item_get_string(get_item_data);
	}
	public int obs_data_item_get_int() {
		return item.data_item_get_int(get_item_data);
	}
	public double obs_data_item_get_double() {
		return item.data_item_get_double(get_item_data);
	}
	public Object obs_data_item_get_bool() {
		return item.data_item_get_bool(get_item_data);
	}
	public Object obs_data_item_get_default_string() {
		return item.data_item_get_string(get_item_default_data);
	}
	public int obs_data_item_get_default_int() {
		return item.data_item_get_int(get_item_default_data);
	}
	public double obs_data_item_get_default_double() {
		return item.data_item_get_double(get_item_default_data);
	}
	public Object obs_data_item_get_default_bool() {
		return item.data_item_get_bool(get_item_default_data);
	}
	public Object obs_data_item_get_autoselect_string() {
		return item.data_item_get_string(get_item_autoselect_data);
	}
	public int obs_data_item_get_autoselect_int() {
		return item.data_item_get_int(get_item_autoselect_data);
	}
	public double obs_data_item_get_autoselect_double() {
		return item.data_item_get_double(get_item_autoselect_data);
	}
	public Object obs_data_item_get_autoselect_bool() {
		return item.data_item_get_bool(get_item_autoselect_data);
	}
	public void obs_data_item_set_frames_per_second(Object fps, Object option) {
		obs_data obs_data = new obs_data();
		ModernizedCProgram.obs_take_obj(((Object)0), item, ((Object)0), obs_data.make_frames_per_second(fps, option), set_item);
	}
	public void obs_data_item_set_default_frames_per_second(Object fps, Object option) {
		obs_data obs_data = new obs_data();
		ModernizedCProgram.obs_take_obj(((Object)0), item, ((Object)0), obs_data.make_frames_per_second(fps, option), set_item_def);
	}
	public void obs_data_item_set_autoselect_frames_per_second(Object fps, Object option) {
		obs_data obs_data = new obs_data();
		ModernizedCProgram.obs_take_obj(((Object)0), item, ((Object)0), obs_data.make_frames_per_second(fps, option), set_item_auto);
	}
	public Object obs_data_item_get_frames_per_second(Object fps, Object option) {
		obs_data obs_data = new obs_data();
		return obs_data.obs_data_item_get_obj(item).get_frames_per_second(fps, option);
	}
	public Object obs_data_item_get_default_frames_per_second(Object fps, Object option) {
		obs_data obs_data = new obs_data();
		return obs_data.obs_data_item_get_default_obj(item).get_frames_per_second(fps, option);
	}
	public Object obs_data_item_get_autoselect_frames_per_second(Object fps, Object option) {
		obs_data obs_data = new obs_data();
		return obs_data.obs_data_item_get_autoselect_obj(item).get_frames_per_second(fps, option);
	}
	public Object getRef() {
		return ref;
	}
	public void setRef(Object newRef) {
		ref = newRef;
	}
	public obs_data getParent() {
		return parent;
	}
	public void setParent(obs_data newParent) {
		parent = newParent;
	}
	public obs_data_item getNext() {
		return next;
	}
	public void setNext(obs_data_item newNext) {
		next = newNext;
	}
	public obs_data_type getType() {
		return type;
	}
	public void setType(obs_data_type newType) {
		type = newType;
	}
	public Object getName_len() {
		return name_len;
	}
	public void setName_len(Object newName_len) {
		name_len = newName_len;
	}
	public Object getData_len() {
		return data_len;
	}
	public void setData_len(Object newData_len) {
		data_len = newData_len;
	}
	public Object getData_size() {
		return data_size;
	}
	public void setData_size(Object newData_size) {
		data_size = newData_size;
	}
	public Object getDefault_len() {
		return default_len;
	}
	public void setDefault_len(Object newDefault_len) {
		default_len = newDefault_len;
	}
	public Object getDefault_size() {
		return default_size;
	}
	public void setDefault_size(Object newDefault_size) {
		default_size = newDefault_size;
	}
	public Object getAutoselect_size() {
		return autoselect_size;
	}
	public void setAutoselect_size(Object newAutoselect_size) {
		autoselect_size = newAutoselect_size;
	}
	public Object getCapacity() {
		return capacity;
	}
	public void setCapacity(Object newCapacity) {
		capacity = newCapacity;
	}
}
