package application;

/* would do **prev_next, but not really great for reordering */
public class obs_scene_item {
	private Object ref;
	private Object removed;
	private Object is_group;
	private Object update_transform;
	private Object update_group_resize;
	private Object id;
	private obs_scene parent;
	private obs_source source;
	private Object active_refs;
	private Object defer_update;
	private Object defer_group_resize;
	private Object user_visible;
	private Object visible;
	private Object selected;
	private Object locked;
	private Object item_render;
	private obs_sceneitem_crop crop;
	private vec2 pos;
	private vec2 scale;
	private double rot;
	private Object align;
	private Object last_width;
	private Object last_height;
	private vec2 output_scale;
	private obs_scale_type scale_filter;
	private matrix4 box_transform;
	private vec2 box_scale;
	private matrix4 draw_transform;
	private obs_bounds_type bounds_type;
	private Object bounds_align;
	private vec2 bounds;
	private Object toggle_visibility;
	private obs_data private_settings;
	private Object actions_mutex;
	private Object ;
	private obs_scene_item prev;
	private obs_scene_item next;
	
	public obs_scene_item(Object ref, Object removed, Object is_group, Object update_transform, Object update_group_resize, Object id, obs_scene parent, obs_source source, Object active_refs, Object defer_update, Object defer_group_resize, Object user_visible, Object visible, Object selected, Object locked, Object item_render, obs_sceneitem_crop crop, vec2 pos, vec2 scale, double rot, Object align, Object last_width, Object last_height, vec2 output_scale, obs_scale_type scale_filter, matrix4 box_transform, vec2 box_scale, matrix4 draw_transform, obs_bounds_type bounds_type, Object bounds_align, vec2 bounds, Object toggle_visibility, obs_data private_settings, Object actions_mutex, Object,  obs_scene_item prev, obs_scene_item next) {
		setRef(ref);
		setRemoved(removed);
		setIs_group(is_group);
		setUpdate_transform(update_transform);
		setUpdate_group_resize(update_group_resize);
		setId(id);
		setParent(parent);
		setSource(source);
		setActive_refs(active_refs);
		setDefer_update(defer_update);
		setDefer_group_resize(defer_group_resize);
		setUser_visible(user_visible);
		setVisible(visible);
		setSelected(selected);
		setLocked(locked);
		setItem_render(item_render);
		setCrop(crop);
		setPos(pos);
		setScale(scale);
		setRot(rot);
		setAlign(align);
		setLast_width(last_width);
		setLast_height(last_height);
		setOutput_scale(output_scale);
		setScale_filter(scale_filter);
		setBox_transform(box_transform);
		setBox_scale(box_scale);
		setDraw_transform(draw_transform);
		setBounds_type(bounds_type);
		setBounds_align(bounds_align);
		setBounds(bounds);
		setToggle_visibility(toggle_visibility);
		setPrivate_settings(private_settings);
		setActions_mutex(actions_mutex);
		set();
		setPrev(prev);
		setNext(next);
	}
	public obs_scene_item() {
	}
	
	public void signal_item_remove() {
		calldata params = new calldata();
		[] stack = new ();
		params.calldata_init_fixed(stack, );
		params.calldata_set_ptr("item", item);
		obs_scene generatedParent = this.getParent();
		generatedParent.signal_parent("item_remove", params);
	}
	public void remove_without_release() {
		this.setRemoved(true);
		item.set_visibility(false);
		item.signal_item_remove();
		item.detach_sceneitem();
	}
	public void detach_sceneitem() {
		obs_scene_item generatedPrev = this.getPrev();
		obs_scene_item generatedNext = this.getNext();
		obs_scene generatedParent = this.getParent();
		if (generatedPrev) {
			generatedPrev.setNext(generatedNext);
		} else {
				generatedParent.setFirst_item(generatedNext);
		} 
		if (generatedNext) {
			generatedNext.setPrev(generatedPrev);
		} 
		this.setParent(NULL);
	}
	public void update_item_transform(Object update_tex) {
		 width = new ();
		 height = new ();
		 cx = new ();
		 cy = new ();
		vec2 base_origin = new vec2();
		vec2 origin = new vec2();
		vec2 scale = new vec2();
		calldata params = new calldata();
		[] stack = new ();
		Object generatedDefer_update = this.getDefer_update();
		if (ModernizedCProgram.os_atomic_load_long(generatedDefer_update) > 0) {
			return ;
		} 
		obs_source generatedSource = this.getSource();
		width = generatedSource.obs_source_get_width();
		height = generatedSource.obs_source_get_height();
		cx = ModernizedCProgram.calc_cx(item, width);
		cy = ModernizedCProgram.calc_cy(item, height);
		vec2 generatedScale = this.getScale();
		scale = generatedScale;
		this.setLast_width(width);
		this.setLast_height(height);
		width = cx;
		height = cy;
		base_origin.vec2_zero();
		origin.vec2_zero();
		obs_bounds_type generatedBounds_type = this.getBounds_type();
		Object generatedVec2 = scale.getVec2();
		if (generatedBounds_type != /* ----------------------- */obs_bounds_type.OBS_BOUNDS_NONE) {
			ModernizedCProgram.calculate_bounds_data(item, origin, scale, cx, cy);
		} else {
				cx = .UNRECOGNIZEDFUNCTIONNAME((double)cx * generatedVec2);
				cy = .UNRECOGNIZEDFUNCTIONNAME((double)cy * generatedVec2);
		} 
		Object generatedAlign = this.getAlign();
		origin.add_alignment(generatedAlign, (int)cx, (int)cy);
		matrix4 generatedDraw_transform = this.getDraw_transform();
		generatedDraw_transform.matrix4_identity();
		generatedDraw_transform.matrix4_scale3f(generatedDraw_transform, generatedVec2, generatedVec2, 1.0);
		generatedDraw_transform.matrix4_translate3f(generatedDraw_transform, -generatedVec2, -generatedVec2, 0.0);
		double generatedRot = this.getRot();
		generatedDraw_transform.matrix4_rotate_aa4f(generatedDraw_transform, 0.0, 0.0, 1.0, .RAD(generatedRot));
		generatedDraw_transform.matrix4_translate3f(generatedDraw_transform, generatedVec2, generatedVec2, 0.0);
		this.setOutput_scale(scale);
		vec2 generatedBounds = this.getBounds();
		if (generatedBounds_type != /* ----------------------- */obs_bounds_type.OBS_BOUNDS_NONE) {
			scale.vec2_copy(generatedBounds);
		} else {
				scale.setVec2((double)width * generatedVec2);
				scale.setVec2((double)height * generatedVec2);
		} 
		this.setBox_scale(scale);
		base_origin.add_alignment(generatedAlign, (int)generatedVec2, (int)generatedVec2);
		matrix4 generatedBox_transform = this.getBox_transform();
		generatedBox_transform.matrix4_identity();
		generatedBox_transform.matrix4_scale3f(generatedBox_transform, generatedVec2, generatedVec2, 1.0);
		generatedBox_transform.matrix4_translate3f(generatedBox_transform, -generatedVec2, -generatedVec2, 0.0);
		generatedBox_transform.matrix4_rotate_aa4f(generatedBox_transform, 0.0, 0.0, 1.0, .RAD(generatedRot));
		generatedBox_transform.matrix4_translate3f(generatedBox_transform, generatedVec2, generatedVec2, 0.0);
		params.calldata_init_fixed(stack, );
		params.calldata_set_ptr("item", item);
		obs_scene generatedParent = this.getParent();
		generatedParent.signal_parent("item_transform", params);
		if (!update_tex) {
			return ;
		} 
		Object generatedItem_render = this.getItem_render();
		gs_texture_render gs_texture_render = new gs_texture_render();
		if (generatedItem_render && !ModernizedCProgram.item_texture_enabled(item)) {
			ModernizedCProgram.obs_enter_graphics();
			generatedItem_render.gs_texrender_destroy();
			this.setItem_render(NULL);
			ModernizedCProgram.obs_leave_graphics();
		}  else if (!generatedItem_render && ModernizedCProgram.item_texture_enabled(item)) {
			ModernizedCProgram.obs_enter_graphics();
			this.setItem_render(gs_texture_render.gs_texrender_create(GS_RGBA, GS_ZS_NONE));
			ModernizedCProgram.obs_leave_graphics();
		} 
		Object generatedUpdate_transform = this.getUpdate_transform();
		ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, false);
	}
	public Object source_size_changed() {
		obs_source generatedSource = this.getSource();
		 width = generatedSource.obs_source_get_width();
		 height = generatedSource.obs_source_get_height();
		Object generatedLast_width = this.getLast_width();
		Object generatedLast_height = this.getLast_height();
		return generatedLast_width != width || generatedLast_height != height;
	}
	public void render_item_texture() {
		Object generatedItem_render = this.getItem_render();
		gs_texture gs_texture = new gs_texture();
		 tex = gs_texture.gs_texrender_get_texture(generatedItem_render);
		if (!tex) {
			return ;
		} 
		.GS_DEBUG_MARKER_BEGIN(GS_DEBUG_COLOR_ITEM_TEXTURE, "render_item_texture");
		 effect = ModernizedCProgram.obs.getVideo().getDefault_effect();
		obs_scale_type generatedScale_filter = this.getScale_filter();
		obs_scale_type type = generatedScale_filter;
		 cx = ModernizedCProgram.gs_texture_get_width(tex);
		 cy = ModernizedCProgram.gs_texture_get_height(tex);
		byte tech = "Draw";
		gs_effect_param gs_effect_param = new gs_effect_param();
		vec2 generatedOutput_scale = this.getOutput_scale();
		Object generatedVec2 = generatedOutput_scale.getVec2();
		if (obs_scale_type.type != obs_scale_type.OBS_SCALE_DISABLE) {
			if (obs_scale_type.type == obs_scale_type.OBS_SCALE_POINT) {
				 image = gs_effect_param.gs_effect_get_param_by_name(effect, "image");
				ModernizedCProgram.gs_effect_set_next_sampler(image, ModernizedCProgram.obs.getVideo().getPoint_sampler());
			}  else if (!ModernizedCProgram.close_float(generatedVec2, 1.0, EPSILON) || !ModernizedCProgram.close_float(generatedVec2, 1.0, EPSILON)) {
				 scale_param = new ();
				 scale_i_param = new ();
				if (generatedVec2 < 0.5 || generatedVec2 < 0.5) {
					effect = ModernizedCProgram.obs.getVideo().getBilinear_lowres_effect();
				}  else if (obs_scale_type.type == obs_scale_type.OBS_SCALE_BICUBIC) {
					effect = ModernizedCProgram.obs.getVideo().getBicubic_effect();
				}  else if (obs_scale_type.type == obs_scale_type.OBS_SCALE_LANCZOS) {
					effect = ModernizedCProgram.obs.getVideo().getLanczos_effect();
				}  else if (obs_scale_type.type == obs_scale_type.OBS_SCALE_AREA) {
					effect = ModernizedCProgram.obs.getVideo().getArea_effect();
					if ((generatedVec2 >= 1.0) && (generatedVec2 >= 1.0)) {
						tech = "DrawUpscale";
					} 
				} 
				scale_param = gs_effect_param.gs_effect_get_param_by_name(effect, "base_dimension");
				if (scale_param) {
					vec2 base_res = new vec2((double)cx, (double)cy);
					scale_param.gs_effect_set_vec2(base_res);
				} 
				scale_i_param = gs_effect_param.gs_effect_get_param_by_name(effect, "base_dimension_i");
				if (scale_i_param) {
					vec2 base_res_i = new vec2(1.0 / (double)cx, 1.0 / (double)cy);
					scale_i_param.gs_effect_set_vec2(base_res_i);
				} 
			} 
		} 
		ModernizedCProgram.gs_blend_state_push();
		ModernizedCProgram.gs_blend_function(GS_BLEND_ONE, GS_BLEND_INVSRCALPHA);
		while (effect.gs_effect_loop(tech)) {
			ModernizedCProgram.obs_source_draw(tex, 0, 0, 0, 0, 0);
		}
		ModernizedCProgram.gs_blend_state_pop();
		.GS_DEBUG_MARKER_END();
	}
	public void render_item() {
		obs_source generatedSource = this.getSource();
		.GS_DEBUG_MARKER_BEGIN_FORMAT(GS_DEBUG_COLOR_ITEM, "Item: %s", ModernizedCProgram.obs_source_get_name(generatedSource));
		Object generatedItem_render = this.getItem_render();
		obs_sceneitem_crop generatedCrop = this.getCrop();
		int generatedLeft = generatedCrop.getLeft();
		int generatedTop = generatedCrop.getTop();
		if (generatedItem_render) {
			 width = generatedSource.obs_source_get_width();
			 height = generatedSource.obs_source_get_height();
			if (!width || !height) {
				;
			} 
			 cx = ModernizedCProgram.calc_cx(item, width);
			 cy = ModernizedCProgram.calc_cy(item, height);
			if (cx && cy && generatedItem_render.gs_texrender_begin(cx, cy)) {
				double cx_scale = (double)width / (double)cx;
				double cy_scale = (double)height / (double)cy;
				vec4 clear_color = new vec4();
				clear_color.vec4_zero();
				ModernizedCProgram.gs_clear(GS_CLEAR_COLOR, clear_color, 0.0, 0);
				ModernizedCProgram.gs_ortho(0.0, (double)width, 0.0, (double)height, -100.0, 100.0);
				ModernizedCProgram.gs_matrix_scale3f(cx_scale, cy_scale, 1.0);
				ModernizedCProgram.gs_matrix_translate3f(-(double)generatedLeft, -(double)generatedTop, 0.0);
				generatedSource.obs_source_video_render();
				generatedItem_render.gs_texrender_end();
			} 
		} 
		ModernizedCProgram.gs_matrix_push();
		matrix4 generatedDraw_transform = this.getDraw_transform();
		ModernizedCProgram.gs_matrix_mul(generatedDraw_transform);
		if (generatedItem_render) {
			item.render_item_texture();
		} else {
				generatedSource.obs_source_video_render();
		} 
		ModernizedCProgram.gs_matrix_pop();
	}
	public void set_visibility(Object vis) {
		Object generatedActions_mutex = this.getActions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedActions_mutex);
		Object generatedAudio_actions = this.getAudio_actions();
		.da_resize(generatedAudio_actions, 0);
		Object generatedActive_refs = this.getActive_refs();
		obs_scene generatedParent = this.getParent();
		obs_source generatedSource = generatedParent.getSource();
		if (ModernizedCProgram.os_atomic_load_long(generatedActive_refs) > 0) {
			if (!vis) {
				generatedSource.obs_source_remove_active_child(generatedSource);
			} 
		}  else if (vis) {
			generatedSource.obs_source_add_active_child(generatedSource);
		} 
		ModernizedCProgram.os_atomic_set_long(generatedActive_refs, vis ? 1 : 0);
		this.setVisible(vis);
		this.setUser_visible(vis);
		ModernizedCProgram.pthread_mutex_unlock(generatedActions_mutex);
	}
	public void apply_scene_item_audio_actions(double p_buf, Object ts, Object sample_rate) {
		Object generatedVisible = this.getVisible();
		 cur_visible = generatedVisible;
		 frame_num = 0;
		 deref_count = 0;
		double buf = NULL;
		if (p_buf) {
			if (!p_buf) {
				p_buf = .malloc(AUDIO_OUTPUT_FRAMES * );
			} 
			buf = p_buf;
		} 
		Object generatedActions_mutex = this.getActions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedActions_mutex);
		Object generatedAudio_actions = this.getAudio_actions();
		Object generatedTimestamp = action.getTimestamp();
		for ( i = 0;
		 i < generatedAudio_actions.getNum(); i++) {
			item_action action = generatedAudio_actions.getArray()[i];
			 timestamp = generatedTimestamp;
			 new_frame_num = new ();
			if (timestamp < ts) {
				timestamp = ts;
			} 
			new_frame_num = (timestamp - ts) * ()sample_rate / -1024;
			if (ts && new_frame_num >= AUDIO_OUTPUT_FRAMES) {
				break;
			} 
			.da_erase(generatedAudio_actions, i--);
			this.setVisible(generatedVisible);
			if (!generatedVisible) {
				deref_count++;
			} 
			if (buf && new_frame_num > frame_num) {
				for (; frame_num < new_frame_num; frame_num++) {
					buf[frame_num] = cur_visible ? 1.0 : 0.0;
				}
			} 
			cur_visible = generatedVisible;
		}
		if (buf) {
			for (; frame_num < AUDIO_OUTPUT_FRAMES; frame_num++) {
				buf[frame_num] = cur_visible ? 1.0 : 0.0;
			}
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedActions_mutex);
		Object generatedActive_refs = this.getActive_refs();
		obs_scene generatedParent = this.getParent();
		obs_source generatedSource = generatedParent.getSource();
		while (deref_count--) {
			if (ModernizedCProgram.os_atomic_dec_long(generatedActive_refs) == 0) {
				generatedSource.obs_source_remove_active_child(generatedSource);
			} 
		}
	}
	public Object apply_scene_item_volume(Double buf, Object ts, Object sample_rate) {
		 actions_pending = new ();
		item_action action = new item_action();
		Object generatedActions_mutex = this.getActions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedActions_mutex);
		Object generatedAudio_actions = this.getAudio_actions();
		actions_pending = generatedAudio_actions.getNum() > 0;
		if (actions_pending) {
			action = generatedAudio_actions.getArray()[0];
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedActions_mutex);
		Object generatedTimestamp = action.getTimestamp();
		if (actions_pending) {
			 duration = ()AUDIO_OUTPUT_FRAMES * -1024 / ()sample_rate;
			if (!ts || generatedTimestamp < (ts + duration)) {
				item.apply_scene_item_audio_actions(buf, ts, sample_rate);
				return true;
			} 
		} 
		return false;
	}
	public void process_all_audio_actions(Object sample_rate) {
		while (item.apply_scene_item_volume(NULL, 0, sample_rate)) {
			;
		}
	}
	public void duplicate_item_data(obs_scene_item src, Object defer_texture_update, Object duplicate_hotkeys, Object duplicate_private_data) {
		obs_scene generatedParent = this.getParent();
		obs_scene dst_scene = generatedParent;
		Object generatedUser_visible = src.getUser_visible();
		if (!generatedUser_visible) {
			dst.set_visibility(false);
		} 
		Object generatedSelected = src.getSelected();
		this.setSelected(generatedSelected);
		vec2 generatedPos = src.getPos();
		this.setPos(generatedPos);
		double generatedRot = src.getRot();
		this.setRot(generatedRot);
		vec2 generatedScale = src.getScale();
		this.setScale(generatedScale);
		Object generatedAlign = src.getAlign();
		this.setAlign(generatedAlign);
		Object generatedLast_width = src.getLast_width();
		this.setLast_width(generatedLast_width);
		Object generatedLast_height = src.getLast_height();
		this.setLast_height(generatedLast_height);
		vec2 generatedOutput_scale = src.getOutput_scale();
		this.setOutput_scale(generatedOutput_scale);
		obs_scale_type generatedScale_filter = src.getScale_filter();
		this.setScale_filter(generatedScale_filter);
		matrix4 generatedBox_transform = src.getBox_transform();
		this.setBox_transform(generatedBox_transform);
		vec2 generatedBox_scale = src.getBox_scale();
		this.setBox_scale(generatedBox_scale);
		matrix4 generatedDraw_transform = src.getDraw_transform();
		this.setDraw_transform(generatedDraw_transform);
		obs_bounds_type generatedBounds_type = src.getBounds_type();
		this.setBounds_type(generatedBounds_type);
		Object generatedBounds_align = src.getBounds_align();
		this.setBounds_align(generatedBounds_align);
		vec2 generatedBounds = src.getBounds();
		this.setBounds(generatedBounds);
		obs_source generatedSource = dst_scene.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedPrivate = generatedContext.getPrivate();
		Object generatedToggle_visibility = src.getToggle_visibility();
		if (duplicate_hotkeys && !generatedPrivate) {
			obs_data_array_t data0 = NULL;
			obs_data_array_t data1 = NULL;
			data0.obs_hotkey_pair_save(generatedToggle_visibility, data1);
			data0.obs_hotkey_pair_load(generatedToggle_visibility, data1);
			data0.obs_data_array_release();
			data1.obs_data_array_release();
		} 
		obs_sceneitem_crop generatedCrop = src.getCrop();
		dst.obs_sceneitem_set_crop(generatedCrop);
		Object generatedUpdate_transform = this.getUpdate_transform();
		Object generatedItem_render = this.getItem_render();
		gs_texture_render gs_texture_render = new gs_texture_render();
		if (defer_texture_update) {
			ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
		} else {
				if (!generatedItem_render && ModernizedCProgram.item_texture_enabled(dst)) {
					ModernizedCProgram.obs_enter_graphics();
					this.setItem_render(gs_texture_render.gs_texrender_create(GS_RGBA, GS_ZS_NONE));
					ModernizedCProgram.obs_leave_graphics();
				} 
		} 
		obs_data generatedPrivate_settings = this.getPrivate_settings();
		if (duplicate_private_data) {
			generatedPrivate_settings.obs_data_apply(generatedPrivate_settings);
		} 
	}
	public obs_scene_item obs_scene_find_source(obs_scene scene, Object name) {
		obs_scene_item item = new obs_scene_item();
		if (!scene) {
			return NULL;
		} 
		scene.full_lock();
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		item = generatedFirst_item;
		obs_source generatedSource = item.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Byte generatedName = generatedContext.getName();
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			if (.strcmp(generatedName, name) == 0) {
				break;
			} 
			item = generatedNext;
		}
		scene.full_unlock();
		return item;
	}
	public obs_scene_item obs_scene_find_sceneitem_by_id(obs_scene scene, Object id) {
		obs_scene_item item = new obs_scene_item();
		if (!scene) {
			return NULL;
		} 
		scene.full_lock();
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		item = generatedFirst_item;
		Object generatedId = item.getId();
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			if (generatedId == id) {
				break;
			} 
			item = generatedNext;
		}
		scene.full_unlock();
		return item;
	}
	public obs_scene_item sceneitem_get_ref() {
		Object generatedRef = this.getRef();
		long owners = generatedRef;
		while (owners > 0) {
			if (ModernizedCProgram.os_atomic_compare_swap_long(generatedRef, owners, owners + 1)) {
				return si;
			} 
			owners = generatedRef;
		}
		return NULL;
	}
	public obs_scene_item obs_scene_add_internal(obs_scene scene, obs_source source) {
		obs_scene_item last = new obs_scene_item();
		obs_scene_item item = new obs_scene_item();
		 mutex = new ();
		item_action action = new item_action(, );
		if (!scene) {
			return NULL;
		} 
		if (!source) {
			ModernizedCProgram.blog(LOG_ERROR, "Tried to add a NULL source to a scene");
			return NULL;
		} 
		if (ModernizedCProgram.pthread_mutex_init(mutex, NULL) != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to create scene item mutex");
			return NULL;
		} 
		obs_source generatedSource = scene.getSource();
		if (!generatedSource.obs_source_add_active_child(source)) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to add source to scene due to infinite source recursion");
			ModernizedCProgram.pthread_mutex_destroy(mutex);
			return NULL;
		} 
		item = ModernizedCProgram.bzalloc();
		item.setSource(source);
		Object generatedId_counter = scene.getId_counter();
		item.setId(++generatedId_counter);
		item.setParent(scene);
		item.setRef(1);
		item.setAlign((1 << 2) | (1 << 0));
		item.setActions_mutex(mutex);
		item.setUser_visible(true);
		item.setLocked(false);
		obs_source_info generatedInfo = source.getInfo();
		Object generatedId = generatedInfo.getId();
		item.setIs_group(generatedId == generatedId);
		obs_data obs_data = new obs_data();
		item.setPrivate_settings(obs_data.obs_data_create());
		item.setToggle_visibility((~(obs_hotkey_pair_id)0));
		Object generatedActive_refs = item.getActive_refs();
		ModernizedCProgram.os_atomic_set_long(generatedActive_refs, 1);
		vec2 generatedScale = item.getScale();
		generatedScale.vec2_set(1.0, 1.0);
		matrix4 generatedDraw_transform = item.getDraw_transform();
		generatedDraw_transform.matrix4_identity();
		matrix4 generatedBox_transform = item.getBox_transform();
		generatedBox_transform.matrix4_identity();
		source.obs_source_addref();
		Object generatedAudio_actions = item.getAudio_actions();
		if (source.source_has_audio()) {
			item.setVisible(false);
			.da_push_back(generatedAudio_actions, action);
		} else {
				item.setVisible(true);
		} 
		gs_texture_render gs_texture_render = new gs_texture_render();
		if (ModernizedCProgram.item_texture_enabled(item)) {
			ModernizedCProgram.obs_enter_graphics();
			item.setItem_render(gs_texture_render.gs_texrender_create(GS_RGBA, GS_ZS_NONE));
			ModernizedCProgram.obs_leave_graphics();
		} 
		scene.full_lock();
		obs_scene_item generatedNext = this.getNext();
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		if (insert_after) {
			obs_sceneitem_t next = generatedNext;
			if (next) {
				next.setPrev(item);
			} 
			item.setNext(generatedNext);
			item.setPrev(insert_after);
			this.setNext(item);
		} else {
				last = generatedFirst_item;
				if (!last) {
					scene.setFirst_item(item);
				} else {
						while (generatedNext) {
							last = generatedNext;
						}
						last.setNext(item);
						item.setPrev(last);
				} 
		} 
		scene.full_unlock();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedPrivate = generatedContext.getPrivate();
		if (!generatedPrivate) {
			ModernizedCProgram.init_hotkeys(scene, item, ModernizedCProgram.obs_source_get_name(source));
		} 
		.signal_handler_connect(ModernizedCProgram.obs_source_get_signal_handler(source), "rename", sceneitem_renamed, item);
		return item;
	}
	public obs_scene_item obs_scene_add(obs_scene scene, obs_source source) {
		obs_sceneitem_t item = NULL.obs_scene_add_internal(scene, source);
		calldata params = new calldata();
		[] stack = new ();
		params.calldata_init_fixed(stack, );
		params.calldata_set_ptr("scene", scene);
		params.calldata_set_ptr("item", item);
		obs_source generatedSource = scene.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "item_add", params);
		return item;
	}
	public void obs_sceneitem_destroy() {
		Object generatedItem_render = this.getItem_render();
		obs_data generatedPrivate_settings = this.getPrivate_settings();
		Object generatedToggle_visibility = this.getToggle_visibility();
		Object generatedActions_mutex = this.getActions_mutex();
		obs_source generatedSource = this.getSource();
		Object generatedAudio_actions = this.getAudio_actions();
		if (item) {
			if (generatedItem_render) {
				ModernizedCProgram.obs_enter_graphics();
				generatedItem_render.gs_texrender_destroy();
				ModernizedCProgram.obs_leave_graphics();
			} 
			generatedPrivate_settings.obs_data_release();
			ModernizedCProgram.obs_hotkey_pair_unregister(generatedToggle_visibility);
			ModernizedCProgram.pthread_mutex_destroy(generatedActions_mutex);
			.signal_handler_disconnect(ModernizedCProgram.obs_source_get_signal_handler(generatedSource), "rename", sceneitem_renamed, item);
			if (generatedSource) {
				generatedSource.obs_source_release();
			} 
			.da_free(generatedAudio_actions);
			ModernizedCProgram.bfree(item);
		} 
	}
	public void obs_sceneitem_addref() {
		Object generatedRef = this.getRef();
		if (item) {
			ModernizedCProgram.os_atomic_inc_long(generatedRef);
		} 
	}
	public void obs_sceneitem_release() {
		if (!item) {
			return ;
		} 
		Object generatedRef = this.getRef();
		if (ModernizedCProgram.os_atomic_dec_long(generatedRef) == 0) {
			item.obs_sceneitem_destroy();
		} 
	}
	public void obs_sceneitem_remove() {
		obs_scene_t scene = new obs_scene_t();
		if (!item) {
			return ;
		} 
		obs_scene generatedParent = this.getParent();
		scene = generatedParent;
		scene.full_lock();
		Object generatedRemoved = this.getRemoved();
		if (generatedRemoved) {
			if (scene) {
				scene.full_unlock();
			} 
			return ;
		} 
		this.setRemoved(true);
		.assert(scene != NULL);
		obs_source generatedSource = scene.getSource();
		.assert(generatedSource != NULL);
		item.set_visibility(false);
		item.signal_item_remove();
		item.detach_sceneitem();
		scene.full_unlock();
		item.obs_sceneitem_release();
	}
	public void obs_sceneitem_select(Object select) {
		calldata params = new calldata();
		[] stack = new ();
		byte command = select ? "item_select" : "item_deselect";
		Object generatedSelected = this.getSelected();
		obs_scene generatedParent = this.getParent();
		if (!item || generatedSelected == select || !generatedParent) {
			return ;
		} 
		this.setSelected(select);
		params.calldata_init_fixed(stack, );
		params.calldata_set_ptr("item", item);
		generatedParent.signal_parent(command, params);
	}
	public void obs_sceneitem_set_pos(Object pos) {
		vec2 generatedPos = this.getPos();
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item) {
			generatedPos.vec2_copy(pos);
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void obs_sceneitem_set_rot(double rot) {
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item) {
			this.setRot(rot);
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void obs_sceneitem_set_scale(Object scale) {
		vec2 generatedScale = this.getScale();
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item) {
			generatedScale.vec2_copy(scale);
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void obs_sceneitem_set_alignment(Object alignment) {
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item) {
			this.setAlign(alignment);
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void signal_reorder() {
		byte command = NULL;
		calldata params = new calldata();
		[] stack = new ();
		command = "reorder";
		params.calldata_init_fixed(stack, );
		obs_scene generatedParent = this.getParent();
		generatedParent.signal_parent(command, params);
	}
	public void obs_sceneitem_set_order(obs_order_movement movement) {
		if (!item) {
			return ;
		} 
		obs_scene_item next = new obs_scene_item();
		obs_scene_item prev = new obs_scene_item();
		obs_scene generatedParent = this.getParent();
		obs_scene scene = generatedParent;
		scene.obs_scene_addref();
		scene.full_lock();
		obs_scene_item generatedNext = this.getNext();
		next = generatedNext;
		obs_scene_item generatedPrev = this.getPrev();
		prev = generatedPrev;
		item.detach_sceneitem();
		if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_DOWN) {
			ModernizedCProgram.attach_sceneitem(scene, item, prev ? generatedPrev : NULL);
		}  else if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_UP) {
			ModernizedCProgram.attach_sceneitem(scene, item, next ? next : prev);
		}  else if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_TOP) {
			obs_scene_item last = next;
			if (!last) {
				last = prev;
			} else {
					while (generatedNext) {
						last = generatedNext;
					}
			} 
			ModernizedCProgram.attach_sceneitem(scene, item, last);
		}  else if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_BOTTOM) {
			ModernizedCProgram.attach_sceneitem(scene, item, NULL);
		} 
		scene.full_unlock();
		item.signal_reorder();
		scene.obs_scene_release();
	}
	public void obs_sceneitem_set_order_position(int position) {
		if (!item) {
			return ;
		} 
		obs_scene generatedParent = this.getParent();
		obs_scene scene = generatedParent;
		obs_scene_item next = new obs_scene_item();
		scene.obs_scene_addref();
		scene.full_lock();
		item.detach_sceneitem();
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		next = generatedFirst_item;
		obs_scene_item generatedNext = next.getNext();
		if (position == 0) {
			ModernizedCProgram.attach_sceneitem(scene, item, NULL);
		} else {
				for (int i = position;
				 i > 1; --i) {
					if (generatedNext == NULL) {
						break;
					} 
					next = generatedNext;
				}
				ModernizedCProgram.attach_sceneitem(scene, item, next);
		} 
		scene.full_unlock();
		item.signal_reorder();
		scene.obs_scene_release();
	}
	public void obs_sceneitem_set_bounds_type(obs_bounds_type type) {
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item) {
			this.setBounds_type(obs_bounds_type.type);
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void obs_sceneitem_set_bounds_alignment(Object alignment) {
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item) {
			this.setBounds_align(alignment);
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void obs_sceneitem_set_bounds(Object bounds) {
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item) {
			this.setBounds(bounds);
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void obs_sceneitem_set_info(Object info) {
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (item && info) {
			this.setPos(info.getPos());
			this.setRot(info.getRot());
			this.setScale(info.getScale());
			this.setAlign(info.getAlignment());
			this.setBounds_type(info.getBounds_type());
			this.setBounds_align(info.getBounds_alignment());
			this.setBounds(info.getBounds());
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public Object obs_sceneitem_set_visible(Object visible) {
		calldata cd = new calldata();
		[] stack = new ();
		item_action action = new item_action(, );
		if (!item) {
			return false;
		} 
		Object generatedUser_visible = this.getUser_visible();
		if (generatedUser_visible == visible) {
			return false;
		} 
		obs_scene generatedParent = this.getParent();
		if (!generatedParent) {
			return false;
		} 
		Object generatedActive_refs = this.getActive_refs();
		obs_source generatedSource = generatedParent.getSource();
		if (visible) {
			if (ModernizedCProgram.os_atomic_inc_long(generatedActive_refs) == 1) {
				if (!generatedSource.obs_source_add_active_child(generatedSource)) {
					ModernizedCProgram.os_atomic_dec_long(generatedActive_refs);
					return false;
				} 
			} 
		} 
		this.setUser_visible(visible);
		cd.calldata_init_fixed(stack, );
		cd.calldata_set_ptr("item", item);
		cd.calldata_set_bool("visible", visible);
		generatedParent.signal_parent("item_visible", cd);
		Object generatedActions_mutex = this.getActions_mutex();
		Object generatedAudio_actions = this.getAudio_actions();
		if (generatedSource.source_has_audio()) {
			ModernizedCProgram.pthread_mutex_lock(generatedActions_mutex);
			.da_push_back(generatedAudio_actions, action);
			ModernizedCProgram.pthread_mutex_unlock(generatedActions_mutex);
		} else {
				item.set_visibility(visible);
		} 
		return true;
	}
	public Object obs_sceneitem_set_locked(Object lock) {
		calldata cd = new calldata();
		[] stack = new ();
		if (!item) {
			return false;
		} 
		Object generatedLocked = this.getLocked();
		if (generatedLocked == lock) {
			return false;
		} 
		obs_scene generatedParent = this.getParent();
		if (!generatedParent) {
			return false;
		} 
		this.setLocked(lock);
		cd.calldata_init_fixed(stack, );
		cd.calldata_set_ptr("item", item);
		cd.calldata_set_bool("locked", lock);
		generatedParent.signal_parent("item_locked", cd);
		return true;
	}
	public void obs_sceneitem_set_crop(Object crop) {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_set_crop", "item")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(crop, "obs_sceneitem_set_crop", "crop")) {
			return ;
		} 
		obs_sceneitem_crop generatedCrop = this.getCrop();
		if (ModernizedCProgram.crop_equal(crop, generatedCrop)) {
			return ;
		} 
		.memcpy(generatedCrop, crop, );
		int generatedLeft = generatedCrop.getLeft();
		if (generatedLeft < 0) {
			generatedCrop.setLeft(0);
		} 
		int generatedRight = generatedCrop.getRight();
		if (generatedRight < 0) {
			generatedCrop.setRight(0);
		} 
		int generatedTop = generatedCrop.getTop();
		if (generatedTop < 0) {
			generatedCrop.setTop(0);
		} 
		int generatedBottom = generatedCrop.getBottom();
		if (generatedBottom < 0) {
			generatedCrop.setBottom(0);
		} 
		Object generatedUpdate_transform = this.getUpdate_transform();
		ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
	}
	public void obs_sceneitem_set_scale_filter(obs_scale_type filter) {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_set_scale_filter", "item")) {
			return ;
		} 
		this.setScale_filter(obs_scale_type.filter);
		Object generatedUpdate_transform = this.getUpdate_transform();
		ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
	}
	public obs_scale_type obs_sceneitem_get_scale_filter() {
		obs_scale_type generatedScale_filter = this.getScale_filter();
		return ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_get_scale_filter", "item") ? generatedScale_filter : obs_scale_type.OBS_SCALE_DISABLE;
	}
	public void obs_sceneitem_defer_update_begin() {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_defer_update_begin", "item")) {
			return ;
		} 
		Object generatedDefer_update = this.getDefer_update();
		ModernizedCProgram.os_atomic_inc_long(generatedDefer_update);
	}
	public void obs_sceneitem_defer_update_end() {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_defer_update_end", "item")) {
			return ;
		} 
		Object generatedDefer_update = this.getDefer_update();
		obs_scene generatedParent = this.getParent();
		Object generatedIs_group = generatedParent.getIs_group();
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (ModernizedCProgram.os_atomic_dec_long(generatedDefer_update) == 0) {
			do {
				if (!generatedParent || generatedIs_group) {
					ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, true);
				} else {
						item.update_item_transform(false);
				} 
			} while (false);
		} 
	}
	public void obs_sceneitem_defer_group_resize_begin() {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_defer_group_resize_begin", "item")) {
			return ;
		} 
		Object generatedDefer_group_resize = this.getDefer_group_resize();
		ModernizedCProgram.os_atomic_inc_long(generatedDefer_group_resize);
	}
	public void obs_sceneitem_defer_group_resize_end() {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_defer_group_resize_end", "item")) {
			return ;
		} 
		Object generatedDefer_group_resize = this.getDefer_group_resize();
		Object generatedUpdate_group_resize = this.getUpdate_group_resize();
		if (ModernizedCProgram.os_atomic_dec_long(generatedDefer_group_resize) == 0) {
			ModernizedCProgram.os_atomic_set_bool(generatedUpdate_group_resize, true);
		} 
	}
	public void remove_group_transform(obs_scene_item item) {
		obs_scene generatedParent = item.getParent();
		obs_scene_t parent = generatedParent;
		if (!parent || !group) {
			return ;
		} 
		vec2 generatedPos = item.getPos();
		vec2 generatedScale = item.getScale();
		double generatedRot = item.getRot();
		ModernizedCProgram.get_ungrouped_transform(group, generatedPos, generatedScale, generatedRot);
		item.update_item_transform(false);
	}
	public void apply_group_transform(obs_scene_item group) {
		matrix4 transform = new matrix4();
		matrix4 mat = new matrix4();
		vec4 x_base = new vec4();
		x_base.vec4_set(1.0, 0.0, 0.0, 0.0);
		matrix4 generatedDraw_transform = group.getDraw_transform();
		transform.matrix4_inv(generatedDraw_transform);
		vec2 generatedPos = this.getPos();
		ModernizedCProgram.transform_val(generatedPos, transform);
		Object generatedMatrix4 = transform.getMatrix4();
		generatedMatrix4.vec4_set(0.0, 0.0, 0.0, 1.0);
		vec2 generatedScale = this.getScale();
		Object generatedVec2 = generatedScale.getVec2();
		generatedMatrix4.vec4_set(generatedVec2, 0.0, 0.0, 0.0);
		generatedMatrix4.vec4_set(0.0, generatedVec2, 0.0, 0.0);
		generatedMatrix4.vec4_set(0.0, 0.0, 1.0, 0.0);
		generatedMatrix4.vec4_set(0.0, 0.0, 0.0, 1.0);
		mat.matrix4_mul(mat, transform);
		generatedScale.setVec2(ModernizedCProgram.vec4_len(generatedMatrix4) * (generatedVec2 > 0.0 ? 1.0 : -1.0));
		generatedScale.setVec2(ModernizedCProgram.vec4_len(generatedMatrix4) * (generatedVec2 > 0.0 ? 1.0 : -1.0));
		double generatedRot = this.getRot();
		generatedRot -= generatedRot;
		item.update_item_transform(false);
	}
	/* assumes group scene and parent scene is locked */
	public void resize_group() {
		obs_source generatedSource = this.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedData = generatedContext.getData();
		obs_scene_t scene = generatedData;
		vec2 minv = new vec2();
		vec2 maxv = new vec2();
		vec2 scale = new vec2();
		Object generatedDefer_group_resize = this.getDefer_group_resize();
		if (ModernizedCProgram.os_atomic_load_long(generatedDefer_group_resize) > 0) {
			return ;
		} 
		if (!ModernizedCProgram.resize_scene_base(scene, minv, maxv, scale)) {
			return ;
		} 
		obs_bounds_type generatedBounds_type = this.getBounds_type();
		Object generatedAlign = this.getAlign();
		Object generatedVec2 = minv.getVec2();
		matrix4 generatedDraw_transform = this.getDraw_transform();
		vec2 generatedPos = this.getPos();
		if (generatedBounds_type == obs_bounds_type.OBS_BOUNDS_NONE) {
			vec2 new_pos = new vec2();
			if ((generatedAlign & (1 << 0)) != 0) {
				new_pos.setVec2(generatedVec2);
			}  else if ((generatedAlign & (1 << 1)) != 0) {
				new_pos.setVec2(generatedVec2);
			} else {
					new_pos.setVec2((generatedVec2 - generatedVec2) * 0.5 + generatedVec2);
			} 
			if ((generatedAlign & (1 << 2)) != 0) {
				new_pos.setVec2(generatedVec2);
			}  else if ((generatedAlign & (1 << 3)) != 0) {
				new_pos.setVec2(generatedVec2);
			} else {
					new_pos.setVec2((generatedVec2 - generatedVec2) * 0.5 + generatedVec2);
			} 
			ModernizedCProgram.transform_val(new_pos, generatedDraw_transform);
			generatedPos.vec2_copy(new_pos);
		} 
		Object generatedUpdate_group_resize = this.getUpdate_group_resize();
		ModernizedCProgram.os_atomic_set_bool(generatedUpdate_group_resize, false);
		group.update_item_transform(false);
	}
	public obs_scene_item obs_scene_add_group(obs_scene scene, Object name) {
		return NULL.obs_scene_insert_group(scene, name, 0);
	}
	public obs_scene_item obs_scene_insert_group(obs_scene scene, Object name, Object count) {
		if (!scene) {
			return NULL;
		} 
		obs_scene generatedParent = item.getParent();
		Object generatedIs_group = item.getIs_group();
		for ( i = count;
		 i > 0; /* don't allow groups or sub-items of other groups */i--) {
			obs_sceneitem_t item = items[i - 1];
			if (generatedParent != scene || generatedIs_group) {
				return NULL;
			} 
		}
		obs_scene obs_scene = new obs_scene();
		obs_scene_t sub_scene = obs_scene.create_id("group", name);
		obs_sceneitem_t last_item = items ? items[count - 1] : NULL;
		obs_source generatedSource = sub_scene.getSource();
		obs_sceneitem_t item = last_item.obs_scene_add_internal(scene, generatedSource);
		sub_scene.obs_scene_release();
		if (!items || !count) {
			return item;
		} 
		/* ------------------------- */scene.full_lock();
		sub_scene.full_lock();
		sub_scene.setFirst_item(items[0]);
		for ( i = count;
		 i > 0; i--) {
			 idx = i - 1;
			item.remove_group_transform(items[idx]);
			items[idx].detach_sceneitem();
		}
		for ( i = 0;
		 i < count; i++) {
			 idx = i;
			if (idx != (count - 1)) {
				 next_idx = idx + 1;
				items[idx].setNext(items[next_idx]);
				items[next_idx].setPrev(items[idx]);
			} else {
					items[idx].setNext(NULL);
			} 
			items[idx].setParent(sub_scene);
			items[idx].apply_group_transform(item);
		}
		items[0].setPrev(NULL);
		item.resize_group();
		sub_scene.full_unlock();
		scene.full_unlock();
		return /* ------------------------- */item;
	}
	public obs_scene_item obs_scene_get_group(obs_scene scene, Object name) {
		if (!scene || !name || !name) {
			return NULL;
		} 
		obs_sceneitem_t group = NULL;
		obs_sceneitem_t item = new obs_sceneitem_t();
		scene.full_lock();
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		item = generatedFirst_item;
		Object generatedIs_group = item.getIs_group();
		obs_source generatedSource = item.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Byte generatedName = generatedContext.getName();
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			if (generatedIs_group && generatedName) {
				if (.strcmp(generatedName, name) == 0) {
					group = item;
					break;
				} 
			} 
			item = generatedNext;
		}
		scene.full_unlock();
		return group;
	}
	public Object obs_sceneitem_is_group() {
		Object generatedIs_group = this.getIs_group();
		return item && generatedIs_group;
	}
	public void obs_sceneitem_group_ungroup() {
		Object generatedIs_group = this.getIs_group();
		if (!item || !generatedIs_group) {
			return ;
		} 
		obs_scene generatedParent = this.getParent();
		obs_scene_t scene = generatedParent;
		obs_source generatedSource = this.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedData = generatedContext.getData();
		obs_scene_t subscene = generatedData;
		obs_sceneitem_t insert_after = item;
		obs_sceneitem_t first = new obs_sceneitem_t();
		obs_sceneitem_t last = new obs_sceneitem_t();
		scene.full_lock();
		/* ------------------------- */subscene.full_lock();
		obs_scene_item generatedFirst_item = subscene.getFirst_item();
		first = generatedFirst_item;
		last = first;
		obs_scene_item generatedNext = last.getNext();
		while (last) {
			obs_sceneitem_t dst = new obs_sceneitem_t();
			item.remove_group_transform(last);
			dst = insert_after.obs_scene_add_internal(scene, generatedSource);
			dst.duplicate_item_data(last, true, true, true);
			last.apply_group_transform(item);
			if (!generatedNext) {
				break;
			} 
			insert_after = dst;
			last = generatedNext;
		}
		subscene.full_unlock();
		/* ------------------------- */item.detach_sceneitem();
		scene.full_unlock();
		item.obs_sceneitem_release();
	}
	public void obs_sceneitem_group_add_item(obs_scene_item item) {
		Object generatedIs_group = this.getIs_group();
		if (!group || !generatedIs_group || !item) {
			return ;
		} 
		obs_scene generatedParent = this.getParent();
		obs_scene_t scene = generatedParent;
		obs_source generatedSource = this.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedData = generatedContext.getData();
		obs_scene_t groupscene = generatedData;
		obs_sceneitem_t last = new obs_sceneitem_t();
		if (generatedParent != scene) {
			return ;
		} 
		/* ------------------------- */scene.full_lock();
		group.remove_group_transform(item);
		item.detach_sceneitem();
		/* ------------------------- */groupscene.full_lock();
		obs_scene_item generatedFirst_item = groupscene.getFirst_item();
		last = generatedFirst_item;
		obs_scene_item generatedNext = last.getNext();
		if (last) {
			for (; ; ) {
				if (!generatedNext) {
					break;
				} 
				last = generatedNext;
			}
			last.setNext(item);
			item.setPrev(last);
		} else {
				groupscene.setFirst_item(item);
		} 
		item.setParent(groupscene);
		item.setNext(NULL);
		item.apply_group_transform(group);
		group.resize_group();
		groupscene.full_unlock();
		/* ------------------------- */scene.full_unlock();
	}
	public void obs_sceneitem_group_remove_item(obs_scene_item item) {
		Object generatedIs_group = this.getIs_group();
		if (!item || !group || !generatedIs_group) {
			return ;
		} 
		obs_scene generatedParent = item.getParent();
		obs_scene_t groupscene = generatedParent;
		obs_scene_t scene = generatedParent;
		/* ------------------------- */scene.full_lock();
		groupscene.full_lock();
		group.remove_group_transform(item);
		item.detach_sceneitem();
		obs_scene_item generatedPrev = this.getPrev();
		if (generatedPrev) {
			generatedPrev.setNext(item);
			item.setPrev(generatedPrev);
		} else {
				scene.setFirst_item(item);
				item.setPrev(NULL);
		} 
		this.setPrev(item);
		item.setNext(group);
		item.setParent(scene);
		/* ------------------------- */group.resize_group();
		groupscene.full_unlock();
		scene.full_unlock();
	}
	public obs_scene_item get_sceneitem_parent_group(obs_scene scene) {
		Object generatedIs_group = this.getIs_group();
		if (generatedIs_group) {
			return NULL;
		} 
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		obs_sceneitem_t item = generatedFirst_item;
		obs_source generatedSource = item.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedData = generatedContext.getData();
		obs_scene generatedParent = this.getParent();
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			if (generatedIs_group && generatedData == generatedParent) {
				return item;
			} 
			item = generatedNext;
		}
		return NULL;
	}
	public obs_scene_item obs_sceneitem_get_group(obs_scene scene) {
		Object generatedIs_group = this.getIs_group();
		if (!scene || !group_subitem || generatedIs_group) {
			return NULL;
		} 
		scene.full_lock();
		obs_sceneitem_t group = group_subitem.get_sceneitem_parent_group(scene);
		scene.full_unlock();
		return group;
	}
	public void obs_sceneitem_group_enum_items(Object callback, Object param) {
		Object generatedIs_group = this.getIs_group();
		if (!group || !generatedIs_group) {
			return ;
		} 
		obs_source generatedSource = this.getSource();
		obs_context_data generatedContext = generatedSource.getContext();
		Object generatedData = generatedContext.getData();
		obs_scene_t scene = generatedData;
		if (scene) {
			scene.obs_scene_enum_items(callback, param);
		} 
	}
	public void obs_sceneitem_force_update_transform() {
		if (!item) {
			return ;
		} 
		Object generatedUpdate_transform = this.getUpdate_transform();
		if (ModernizedCProgram.os_atomic_set_bool(generatedUpdate_transform, false)) {
			item.update_item_transform(false);
		} 
	}
	public Object getRef() {
		return ref;
	}
	public void setRef(Object newRef) {
		ref = newRef;
	}
	public Object getRemoved() {
		return removed;
	}
	public void setRemoved(Object newRemoved) {
		removed = newRemoved;
	}
	public Object getIs_group() {
		return is_group;
	}
	public void setIs_group(Object newIs_group) {
		is_group = newIs_group;
	}
	public Object getUpdate_transform() {
		return update_transform;
	}
	public void setUpdate_transform(Object newUpdate_transform) {
		update_transform = newUpdate_transform;
	}
	public Object getUpdate_group_resize() {
		return update_group_resize;
	}
	public void setUpdate_group_resize(Object newUpdate_group_resize) {
		update_group_resize = newUpdate_group_resize;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public obs_scene getParent() {
		return parent;
	}
	public void setParent(obs_scene newParent) {
		parent = newParent;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getActive_refs() {
		return active_refs;
	}
	public void setActive_refs(Object newActive_refs) {
		active_refs = newActive_refs;
	}
	public Object getDefer_update() {
		return defer_update;
	}
	public void setDefer_update(Object newDefer_update) {
		defer_update = newDefer_update;
	}
	public Object getDefer_group_resize() {
		return defer_group_resize;
	}
	public void setDefer_group_resize(Object newDefer_group_resize) {
		defer_group_resize = newDefer_group_resize;
	}
	public Object getUser_visible() {
		return user_visible;
	}
	public void setUser_visible(Object newUser_visible) {
		user_visible = newUser_visible;
	}
	public Object getVisible() {
		return visible;
	}
	public void setVisible(Object newVisible) {
		visible = newVisible;
	}
	public Object getSelected() {
		return selected;
	}
	public void setSelected(Object newSelected) {
		selected = newSelected;
	}
	public Object getLocked() {
		return locked;
	}
	public void setLocked(Object newLocked) {
		locked = newLocked;
	}
	public Object getItem_render() {
		return item_render;
	}
	public void setItem_render(Object newItem_render) {
		item_render = newItem_render;
	}
	public obs_sceneitem_crop getCrop() {
		return crop;
	}
	public void setCrop(obs_sceneitem_crop newCrop) {
		crop = newCrop;
	}
	public vec2 getPos() {
		return pos;
	}
	public void setPos(vec2 newPos) {
		pos = newPos;
	}
	public vec2 getScale() {
		return scale;
	}
	public void setScale(vec2 newScale) {
		scale = newScale;
	}
	public double getRot() {
		return rot;
	}
	public void setRot(double newRot) {
		rot = newRot;
	}
	public Object getAlign() {
		return align;
	}
	public void setAlign(Object newAlign) {
		align = newAlign;
	}
	public Object getLast_width() {
		return last_width;
	}
	public void setLast_width(Object newLast_width) {
		last_width = newLast_width;
	}
	public Object getLast_height() {
		return last_height;
	}
	public void setLast_height(Object newLast_height) {
		last_height = newLast_height;
	}
	public vec2 getOutput_scale() {
		return output_scale;
	}
	public void setOutput_scale(vec2 newOutput_scale) {
		output_scale = newOutput_scale;
	}
	public obs_scale_type getScale_filter() {
		return scale_filter;
	}
	public void setScale_filter(obs_scale_type newScale_filter) {
		scale_filter = newScale_filter;
	}
	public matrix4 getBox_transform() {
		return box_transform;
	}
	public void setBox_transform(matrix4 newBox_transform) {
		box_transform = newBox_transform;
	}
	public vec2 getBox_scale() {
		return box_scale;
	}
	public void setBox_scale(vec2 newBox_scale) {
		box_scale = newBox_scale;
	}
	public matrix4 getDraw_transform() {
		return draw_transform;
	}
	public void setDraw_transform(matrix4 newDraw_transform) {
		draw_transform = newDraw_transform;
	}
	public obs_bounds_type getBounds_type() {
		return bounds_type;
	}
	public void setBounds_type(obs_bounds_type newBounds_type) {
		bounds_type = newBounds_type;
	}
	public Object getBounds_align() {
		return bounds_align;
	}
	public void setBounds_align(Object newBounds_align) {
		bounds_align = newBounds_align;
	}
	public vec2 getBounds() {
		return bounds;
	}
	public void setBounds(vec2 newBounds) {
		bounds = newBounds;
	}
	public Object getToggle_visibility() {
		return toggle_visibility;
	}
	public void setToggle_visibility(Object newToggle_visibility) {
		toggle_visibility = newToggle_visibility;
	}
	public obs_data getPrivate_settings() {
		return private_settings;
	}
	public void setPrivate_settings(obs_data newPrivate_settings) {
		private_settings = newPrivate_settings;
	}
	public Object getActions_mutex() {
		return actions_mutex;
	}
	public void setActions_mutex(Object newActions_mutex) {
		actions_mutex = newActions_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public obs_scene_item getPrev() {
		return prev;
	}
	public void setPrev(obs_scene_item newPrev) {
		prev = newPrev;
	}
	public obs_scene_item getNext() {
		return next;
	}
	public void setNext(obs_scene_item newNext) {
		next = newNext;
	}
}
