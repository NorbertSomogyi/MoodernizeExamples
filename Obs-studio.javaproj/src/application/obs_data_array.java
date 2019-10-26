package application;

public class obs_data_array {
	private Object ref;
	private Object ;
	
	public obs_data_array(Object ref, Object ) {
		setRef(ref);
		set();
	}
	public obs_data_array() {
	}
	
	public void obs_hotkey_load(Object id) {
		 idx = new ();
		if (!ModernizedCProgram.lock()) {
			return ;
		} 
		if (ModernizedCProgram.find_id(id, idx)) {
			ModernizedCProgram.remove_bindings(id);
			ModernizedCProgram.load_bindings(ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx], ModernizedCProgram.data);
		} 
		ModernizedCProgram.unlock();
	}
	public void obs_hotkey_pair_load(Object id, obs_data_array data1) {
		if ((!data0 && !data1) || !ModernizedCProgram.lock()) {
			return ;
		} 
		 idx = new ();
		if (!ModernizedCProgram.find_pair_id(id, idx)) {
			;
		} 
		obs_hotkey_pair_t pair = ModernizedCProgram.obs.getHotkeys().getHotkey_pairs().getArray()[idx];
		Object generatedId = pair.getId();
		if (ModernizedCProgram.find_id(generatedId[0], idx)) {
			ModernizedCProgram.remove_bindings(generatedId[0]);
			ModernizedCProgram.load_bindings(ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx], data0);
		} 
		if (ModernizedCProgram.find_id(generatedId[1], idx)) {
			ModernizedCProgram.remove_bindings(generatedId[1]);
			ModernizedCProgram.load_bindings(ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx], data1);
		} 
	}
	public obs_data_array save_hotkey(obs_hotkey hotkey) {
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t data = obs_data_array.obs_data_array_create();
		save_bindings_helper_t arg = new save_bindings_helper_t(data, hotkey);
		ModernizedCProgram.enum_bindings(save_bindings_helper, arg);
		return data;
	}
	public obs_data_array obs_hotkey_save(Object id) {
		 idx = new ();
		obs_data_array_t result = NULL;
		if (!ModernizedCProgram.lock()) {
			return result;
		} 
		obs_data_array obs_data_array = new obs_data_array();
		if (ModernizedCProgram.find_id(id, idx)) {
			result = obs_data_array.save_hotkey(ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx]);
		} 
		ModernizedCProgram.unlock();
		return result;
	}
	public void obs_hotkey_pair_save(Object id, obs_data_array p_data1) {
		if ((!p_data0 && !p_data1) || !ModernizedCProgram.lock()) {
			return ;
		} 
		 idx = new ();
		if (!ModernizedCProgram.find_pair_id(id, idx)) {
			;
		} 
		obs_hotkey_pair_t pair = ModernizedCProgram.obs.getHotkeys().getHotkey_pairs().getArray()[idx];
		Object generatedId = pair.getId();
		obs_data_array obs_data_array = new obs_data_array();
		if (p_data0 && ModernizedCProgram.find_id(generatedId[0], idx)) {
			p_data0 = obs_data_array.save_hotkey(ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx]);
		} 
		if (p_data1 && ModernizedCProgram.find_id(generatedId[1], idx)) {
			p_data1 = obs_data_array.save_hotkey(ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx]);
		} 
	}
	public obs_data_array get_item_array(obs_data_item item) {
		obs_data_array_t array = new obs_data_array_t();
		if (!item) {
			return ((Object)0);
		} 
		array = (obs_data_array_t)item.get_item_data();
		return array ? array : ((Object)0);
	}
	public obs_data_array get_item_default_array(obs_data_item item) {
		Object generatedDefault_size = item.getDefault_size();
		if (!item || !generatedDefault_size) {
			return ((Object)0);
		} 
		return (obs_data_array_t)item.get_default_data_ptr();
	}
	public obs_data_array get_item_autoselect_array(obs_data_item item) {
		Object generatedAutoselect_size = item.getAutoselect_size();
		if (!item || !generatedAutoselect_size) {
			return ((Object)0);
		} 
		return (obs_data_array_t)item.get_autoselect_data_ptr();
	}
	public obs_data_array obs_data_get_array(obs_data data, Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_array obs_data_array = new obs_data_array();
		return obs_data_array.obs_data_item_get_array(obs_data_item.get_item(data, name));
	}
	public obs_data_array obs_data_get_default_array(obs_data data, Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_array obs_data_array = new obs_data_array();
		return obs_data_array.obs_data_item_get_default_array(obs_data_item.get_item(data, name));
	}
	public obs_data_array obs_data_get_autoselect_array(obs_data data, Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_array obs_data_array = new obs_data_array();
		return obs_data_array.obs_data_item_get_autoselect_array(obs_data_item.get_item(data, name));
	}
	public obs_data_array obs_data_array_create() {
		obs_data_array array = ModernizedCProgram.bzalloc();
		array.setRef(1);
		return array;
	}
	public void obs_data_array_addref() {
		Object generatedRef = this.getRef();
		if (array) {
			ModernizedCProgram.os_atomic_inc_long(generatedRef);
		} 
	}
	public void obs_data_array_destroy() {
		Object generatedObjects = this.getObjects();
		if (array) {
			for (size_t i = 0;
			 i < generatedObjects.getNum(); i++) {
				generatedObjects.getArray()[i].obs_data_release();
			}
			.da_free(generatedObjects);
			ModernizedCProgram.bfree(array);
		} 
	}
	public void obs_data_array_release() {
		if (!array) {
			return ;
		} 
		Object generatedRef = this.getRef();
		if (ModernizedCProgram.os_atomic_dec_long(generatedRef) == 0) {
			array.obs_data_array_destroy();
		} 
	}
	public Object obs_data_array_count() {
		Object generatedObjects = this.getObjects();
		return array ? generatedObjects.getNum() : 0;
	}
	public void obs_data_array_push_back_array(obs_data_array array2) {
		if (!array || !array2) {
			return ;
		} 
		Object generatedObjects = array2.getObjects();
		for (size_t i = 0;
		 i < generatedObjects.getNum(); i++) {
			obs_data_t obj = generatedObjects.getArray()[i];
			obj.obs_data_addref();
		}
		.da_push_back_da(generatedObjects, generatedObjects);
	}
	public void obs_data_array_erase(Object idx) {
		Object generatedObjects = this.getObjects();
		if (array) {
			generatedObjects.getArray()[idx].obs_data_release();
			.da_erase(generatedObjects, idx);
		} 
	}
	public obs_data_array data_item_get_array(obs_data_item item, Object get_array) {
		obs_data_array_t array = item.item_valid(obs_data_type.OBS_DATA_ARRAY) ? .get_array(item) : ((Object)0);
		Object generatedRef = array.getRef();
		if (array) {
			ModernizedCProgram.os_atomic_inc_long(generatedRef);
		} 
		return array;
	}
	public obs_data_array obs_data_item_get_array(obs_data_item item) {
		obs_data_array obs_data_array = new obs_data_array();
		return obs_data_array.data_item_get_array(item, get_item_array);
	}
	public obs_data_array obs_data_item_get_default_array(obs_data_item item) {
		obs_data_array obs_data_array = new obs_data_array();
		return obs_data_array.data_item_get_array(item, get_item_array);
	}
	public obs_data_array obs_data_item_get_autoselect_array(obs_data_item item) {
		obs_data_array obs_data_array = new obs_data_array();
		return obs_data_array.data_item_get_array(item, get_item_autoselect_array/* ------------------------------------------------------------------------- *//* Helper functions for certain structures */);
	}
	public void obs_load_sources(Object cb, Object private_data) {
		if (!ModernizedCProgram.obs) {
			return ;
		} 
		obs_core_data data = ModernizedCProgram.obs.getData();
		 count = new ();
		 i = new ();
		.da_init(sources);
		count = array.obs_data_array_count();
		.da_reserve(sources, count);
		Object generatedSources_mutex = data.getSources_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedSources_mutex);
		obs_data obs_data = new obs_data();
		obs_source obs_source = new obs_source();
		for (i = 0; i < count; i++) {
			obs_data_t source_data = obs_data.obs_data_array_item(array, i);
			obs_source_t source = obs_source.obs_load_source(source_data);
			.da_push_back(sources, source);
			source_data.obs_data_release();
		}
		obs_source_info generatedInfo = source.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		Object generatedFilters = source.getFilters();
		for (i = 0; i < sources.getNum(); /* tell sources that we want to load */i++) {
			obs_source_t source = sources.getArray()[i];
			obs_data_t source_data = obs_data.obs_data_array_item(array, i);
			if (source) {
				if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
					ModernizedCProgram.obs_transition_load(source, source_data);
				} 
				source.obs_source_load();
				for ( i = generatedFilters.getNum();
				 i > 0; i--) {
					obs_source_t filter = generatedFilters.getArray()[i - 1];
					filter.obs_source_load();
				}
				if (cb) {
					.cb(private_data, source);
				} 
			} 
			source_data.obs_data_release();
		}
		for (i = 0; i < sources.getNum(); i++) {
			sources.getArray()[i].obs_source_release();
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedSources_mutex);
		.da_free(sources);
	}
	public obs_data_array obs_save_sources_filtered(Object cb, Object data_) {
		if (!ModernizedCProgram.obs) {
			return NULL;
		} 
		obs_core_data data = ModernizedCProgram.obs.getData();
		obs_data_array_t array = new obs_data_array_t();
		obs_source_t source = new obs_source_t();
		obs_data_array obs_data_array = new obs_data_array();
		array = obs_data_array.obs_data_array_create();
		Object generatedSources_mutex = data.getSources_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedSources_mutex);
		obs_source generatedFirst_source = data.getFirst_source();
		source = generatedFirst_source;
		obs_source_info generatedInfo = source.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		obs_context_data generatedContext = source.getContext();
		Object generatedPrivate = generatedContext.getPrivate();
		obs_data obs_data = new obs_data();
		obs_context_data generatedNext = generatedContext.getNext();
		while (source) {
			if ((generatedType != obs_source_type.OBS_SOURCE_TYPE_FILTER) != 0 && !generatedPrivate && .cb(data_, source)) {
				obs_data_t source_data = obs_data.obs_save_source(source);
				ModernizedCProgram.obs_data_array_push_back(array, source_data);
				source_data.obs_data_release();
			} 
			source = (obs_source_t)generatedNext;
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedSources_mutex);
		return array;
	}
	public obs_data_array obs_save_sources() {
		obs_data_array obs_data_array = new obs_data_array();
		return obs_data_array.obs_save_sources_filtered(save_source_filter, NULL);
	}
	public Object getRef() {
		return ref;
	}
	public void setRef(Object newRef) {
		ref = newRef;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
