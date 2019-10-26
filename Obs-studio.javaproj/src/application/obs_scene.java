package application;

public class obs_scene {
	private obs_source source;
	private Object is_group;
	private Object custom_size;
	private Object cx;
	private Object cy;
	private Object id_counter;
	private Object video_mutex;
	private Object audio_mutex;
	private obs_scene_item first_item;
	
	public obs_scene(obs_source source, Object is_group, Object custom_size, Object cx, Object cy, Object id_counter, Object video_mutex, Object audio_mutex, obs_scene_item first_item) {
		setSource(source);
		setIs_group(is_group);
		setCustom_size(custom_size);
		setCx(cx);
		setCy(cy);
		setId_counter(id_counter);
		setVideo_mutex(video_mutex);
		setAudio_mutex(audio_mutex);
		setFirst_item(first_item);
	}
	public obs_scene() {
	}
	
	public void full_lock() {
		Object generatedVideo_mutex = this.getVideo_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedVideo_mutex);
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
	}
	public void full_unlock() {
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
		Object generatedVideo_mutex = this.getVideo_mutex();
		ModernizedCProgram.pthread_mutex_unlock(generatedVideo_mutex);
	}
	public void remove_all_items() {
		obs_scene_item item = new obs_scene_item();
		.da_init(items);
		scene.full_lock();
		obs_scene_item generatedFirst_item = this.getFirst_item();
		item = generatedFirst_item;
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			obs_scene_item del_item = item;
			item = generatedNext;
			del_item.remove_without_release();
			.da_push_back(items, del_item);
		}
		scene.full_unlock();
		for ( i = 0;
		 i < items.getNum(); i++) {
			items.getArray()[i].obs_sceneitem_release();
		}
		.da_free(items);
	}
	public obs_scene create_id(Object id, Object name) {
		obs_source obs_source = new obs_source();
		obs_source source = obs_source.obs_source_create(id, name, NULL, NULL);
		obs_context_data generatedContext = source.getContext();
		Object generatedData = generatedContext.getData();
		return generatedData;
	}
	public obs_scene create_private_id(Object id, Object name) {
		obs_source obs_source = new obs_source();
		obs_source source = obs_source.obs_source_create_private(id, name, NULL);
		obs_context_data generatedContext = source.getContext();
		Object generatedData = generatedContext.getData();
		return generatedData;
	}
	public obs_scene obs_scene_create(Object name) {
		obs_scene obs_scene = new obs_scene();
		return obs_scene.create_id("scene", name);
	}
	public obs_scene obs_scene_create_private(Object name) {
		obs_scene obs_scene = new obs_scene();
		return obs_scene.create_private_id("scene", name);
	}
	public obs_scene obs_scene_duplicate(Object name, obs_scene_duplicate_type type) {
		 make_unique = ((int)obs_scene_duplicate_type.type & (1 << 0)) != 0;
		 make_private = ((int)obs_scene_duplicate_type.type & (1 << 1)) != 0;
		obs_scene new_scene = new obs_scene();
		obs_scene_item item = new obs_scene_item();
		obs_source source = new obs_source();
		.da_init(items);
		if (!ModernizedCProgram.obs_object_valid(scene, "obs_scene_duplicate", "scene")) {
			return NULL;
		} 
		/* --------------------------------- */scene.full_lock();
		obs_scene_item generatedFirst_item = this.getFirst_item();
		item = generatedFirst_item;
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			.da_push_back(items, item);
			item.obs_sceneitem_addref();
			item = generatedNext;
		}
		scene.full_unlock();
		obs_source generatedSource = this.getSource();
		obs_source_info generatedInfo = generatedSource.getInfo();
		Object generatedId = generatedInfo.getId();
		obs_scene obs_scene = new obs_scene();
		obs_scene obs_scene = new obs_scene();
		new_scene = /* --------------------------------- */make_private ? obs_scene.create_private_id(generatedId, name) : obs_scene.create_id(generatedId, name);
		generatedSource.obs_source_copy_filters(generatedSource);
		obs_data generatedPrivate_settings = generatedSource.getPrivate_settings();
		generatedPrivate_settings.obs_data_apply(generatedPrivate_settings);
		Object generatedIs_group = this.getIs_group();
		if (generatedIs_group) {
			make_unique = false;
		} 
		obs_source obs_source = new obs_source();
		obs_scene_item obs_scene_item = new obs_scene_item();
		for ( i = 0;
		 i < items.getNum(); i++) {
			item = items.getArray()[i];
			source = make_unique ? obs_source.dup_child(items.getDa(), i, new_scene, make_private) : generatedSource.new_ref();
			if (source) {
				obs_scene_item new_item = obs_scene_item.obs_scene_add(new_scene, source);
				if (!new_item) {
					source.obs_source_release();
					continue;
				} 
				new_item.duplicate_item_data(item, false, false, false);
				source.obs_source_release();
			} 
		}
		for ( i = 0;
		 i < items.getNum(); i++) {
			items.getArray()[i].obs_sceneitem_release();
		}
		if (generatedIs_group) {
			new_scene.resize_scene();
		} 
		.da_free(items);
		return new_scene;
	}
	public void obs_scene_addref() {
		obs_source generatedSource = this.getSource();
		if (scene) {
			generatedSource.obs_source_addref();
		} 
	}
	public void obs_scene_release() {
		obs_source generatedSource = this.getSource();
		if (scene) {
			generatedSource.obs_source_release();
		} 
	}
	public obs_scene obs_scene_from_source(Object source) {
		if (!source || source.getInfo().getId() != ModernizedCProgram.scene_info.getId()) {
			return NULL;
		} 
		return source.getContext().getData();
	}
	public obs_scene obs_group_from_source(Object source) {
		if (!source || source.getInfo().getId() != ModernizedCProgram.group_info.getId()) {
			return NULL;
		} 
		return source.getContext().getData();
	}
	public void obs_scene_enum_items(Object callback, Object param) {
		obs_scene_item item = new obs_scene_item();
		if (!scene || !callback) {
			return ;
		} 
		scene.full_lock();
		obs_scene_item generatedFirst_item = this.getFirst_item();
		item = generatedFirst_item;
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			obs_scene_item next = generatedNext;
			item.obs_sceneitem_addref();
			if (!.callback(scene, item, param)) {
				item.obs_sceneitem_release();
				break;
			} 
			item.obs_sceneitem_release();
			item = next;
		}
		scene.full_unlock();
	}
	public obs_scene obs_sceneitem_get_scene(Object item) {
		return item ? item.getParent() : NULL;
	}
	public void signal_parent(Object command, Object params) {
		params.calldata_set_ptr("scene", parent);
		obs_source generatedSource = this.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, command, params);
	}
	public void obs_scene_atomic_update(Object func, Object data) {
		if (!scene) {
			return ;
		} 
		scene.obs_scene_addref();
		scene.full_lock();
		ModernizedCProgram.func(data, scene);
		scene.full_unlock();
		scene.obs_scene_release();
	}
	public void resize_scene() {
		vec2 minv = new vec2();
		vec2 maxv = new vec2();
		vec2 scale = new vec2();
		ModernizedCProgram.resize_scene_base(scene, minv, maxv, scale);
	}
	public obs_scene obs_sceneitem_group_get_scene(Object item) {
		return (item && item.getIs_group()) ? item.getSource().getContext().getData() : NULL;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getIs_group() {
		return is_group;
	}
	public void setIs_group(Object newIs_group) {
		is_group = newIs_group;
	}
	public Object getCustom_size() {
		return custom_size;
	}
	public void setCustom_size(Object newCustom_size) {
		custom_size = newCustom_size;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public Object getId_counter() {
		return id_counter;
	}
	public void setId_counter(Object newId_counter) {
		id_counter = newId_counter;
	}
	public Object getVideo_mutex() {
		return video_mutex;
	}
	public void setVideo_mutex(Object newVideo_mutex) {
		video_mutex = newVideo_mutex;
	}
	public Object getAudio_mutex() {
		return audio_mutex;
	}
	public void setAudio_mutex(Object newAudio_mutex) {
		audio_mutex = newAudio_mutex;
	}
	public obs_scene_item getFirst_item() {
		return first_item;
	}
	public void setFirst_item(obs_scene_item newFirst_item) {
		first_item = newFirst_item;
	}
}
