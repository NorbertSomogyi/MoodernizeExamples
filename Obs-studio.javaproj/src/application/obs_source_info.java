package application;

public class obs_source_info {
	private Object id;
	private obs_source_type type;
	private Object output_flags;
	private Object get_name;
	private Object create;
	private Object destroy;
	private Object get_width;
	private Object get_height;
	private Object get_defaults;
	private Object get_properties;
	private Object update;
	private Object activate;
	private Object deactivate;
	private Object show;
	private Object hide;
	private Object video_tick;
	private Object video_render;
	private Object filter_video;
	private Object filter_audio;
	private Object enum_active_sources;
	private Object save;
	private Object load;
	private Object mouse_click;
	private Object mouse_move;
	private Object mouse_wheel;
	private Object focus;
	private Object key_click;
	private Object filter_remove;
	private Object type_data;
	private Object free_type_data;
	private Object audio_render;
	private Object enum_all_sources;
	private Object transition_start;
	private Object transition_stop;
	private Object get_defaults2;
	private Object get_properties2;
	private Object audio_mix;
	
	public obs_source_info(Object id, obs_source_type type, Object output_flags, Object get_name, Object create, Object destroy, Object get_width, Object get_height, Object get_defaults, Object get_properties, Object update, Object activate, Object deactivate, Object show, Object hide, Object video_tick, Object video_render, Object filter_video, Object filter_audio, Object enum_active_sources, Object save, Object load, Object mouse_click, Object mouse_move, Object mouse_wheel, Object focus, Object key_click, Object filter_remove, Object type_data, Object free_type_data, Object audio_render, Object enum_all_sources, Object transition_start, Object transition_stop, Object get_defaults2, Object get_properties2, Object audio_mix) {
		setId(id);
		setType(type);
		setOutput_flags(output_flags);
		setGet_name(get_name);
		setCreate(create);
		setDestroy(destroy);
		setGet_width(get_width);
		setGet_height(get_height);
		setGet_defaults(get_defaults);
		setGet_properties(get_properties);
		setUpdate(update);
		setActivate(activate);
		setDeactivate(deactivate);
		setShow(show);
		setHide(hide);
		setVideo_tick(video_tick);
		setVideo_render(video_render);
		setFilter_video(filter_video);
		setFilter_audio(filter_audio);
		setEnum_active_sources(enum_active_sources);
		setSave(save);
		setLoad(load);
		setMouse_click(mouse_click);
		setMouse_move(mouse_move);
		setMouse_wheel(mouse_wheel);
		setFocus(focus);
		setKey_click(key_click);
		setFilter_remove(filter_remove);
		setType_data(type_data);
		setFree_type_data(free_type_data);
		setAudio_render(audio_render);
		setEnum_all_sources(enum_all_sources);
		setTransition_start(transition_start);
		setTransition_stop(transition_stop);
		setGet_defaults2(get_defaults2);
		setGet_properties2(get_properties2);
		setAudio_mix(audio_mix);
	}
	public obs_source_info() {
	}
	
	public obs_source_info get_source_info(Object id) {
		Object generatedId = info.getId();
		for ( i = 0;
		 i < ModernizedCProgram.obs.getSource_types().getNum(); i++) {
			obs_source_info info = ModernizedCProgram.obs.getSource_types().getArray()[i];
			if (/*Error: Function owner not recognized*/strcmp(generatedId, id) == 0) {
				return info;
			} 
		}
		return NULL;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public obs_source_type getType() {
		return type;
	}
	public void setType(obs_source_type newType) {
		type = newType;
	}
	public Object getOutput_flags() {
		return output_flags;
	}
	public void setOutput_flags(Object newOutput_flags) {
		output_flags = newOutput_flags;
	}
	public Object getGet_name() {
		return get_name;
	}
	public void setGet_name(Object newGet_name) {
		get_name = newGet_name;
	}
	public Object getCreate() {
		return create;
	}
	public void setCreate(Object newCreate) {
		create = newCreate;
	}
	public Object getDestroy() {
		return destroy;
	}
	public void setDestroy(Object newDestroy) {
		destroy = newDestroy;
	}
	public Object getGet_width() {
		return get_width;
	}
	public void setGet_width(Object newGet_width) {
		get_width = newGet_width;
	}
	public Object getGet_height() {
		return get_height;
	}
	public void setGet_height(Object newGet_height) {
		get_height = newGet_height;
	}
	public Object getGet_defaults() {
		return get_defaults;
	}
	public void setGet_defaults(Object newGet_defaults) {
		get_defaults = newGet_defaults;
	}
	public Object getGet_properties() {
		return get_properties;
	}
	public void setGet_properties(Object newGet_properties) {
		get_properties = newGet_properties;
	}
	public Object getUpdate() {
		return update;
	}
	public void setUpdate(Object newUpdate) {
		update = newUpdate;
	}
	public Object getActivate() {
		return activate;
	}
	public void setActivate(Object newActivate) {
		activate = newActivate;
	}
	public Object getDeactivate() {
		return deactivate;
	}
	public void setDeactivate(Object newDeactivate) {
		deactivate = newDeactivate;
	}
	public Object getShow() {
		return show;
	}
	public void setShow(Object newShow) {
		show = newShow;
	}
	public Object getHide() {
		return hide;
	}
	public void setHide(Object newHide) {
		hide = newHide;
	}
	public Object getVideo_tick() {
		return video_tick;
	}
	public void setVideo_tick(Object newVideo_tick) {
		video_tick = newVideo_tick;
	}
	public Object getVideo_render() {
		return video_render;
	}
	public void setVideo_render(Object newVideo_render) {
		video_render = newVideo_render;
	}
	public Object getFilter_video() {
		return filter_video;
	}
	public void setFilter_video(Object newFilter_video) {
		filter_video = newFilter_video;
	}
	public Object getFilter_audio() {
		return filter_audio;
	}
	public void setFilter_audio(Object newFilter_audio) {
		filter_audio = newFilter_audio;
	}
	public Object getEnum_active_sources() {
		return enum_active_sources;
	}
	public void setEnum_active_sources(Object newEnum_active_sources) {
		enum_active_sources = newEnum_active_sources;
	}
	public Object getSave() {
		return save;
	}
	public void setSave(Object newSave) {
		save = newSave;
	}
	public Object getLoad() {
		return load;
	}
	public void setLoad(Object newLoad) {
		load = newLoad;
	}
	public Object getMouse_click() {
		return mouse_click;
	}
	public void setMouse_click(Object newMouse_click) {
		mouse_click = newMouse_click;
	}
	public Object getMouse_move() {
		return mouse_move;
	}
	public void setMouse_move(Object newMouse_move) {
		mouse_move = newMouse_move;
	}
	public Object getMouse_wheel() {
		return mouse_wheel;
	}
	public void setMouse_wheel(Object newMouse_wheel) {
		mouse_wheel = newMouse_wheel;
	}
	public Object getFocus() {
		return focus;
	}
	public void setFocus(Object newFocus) {
		focus = newFocus;
	}
	public Object getKey_click() {
		return key_click;
	}
	public void setKey_click(Object newKey_click) {
		key_click = newKey_click;
	}
	public Object getFilter_remove() {
		return filter_remove;
	}
	public void setFilter_remove(Object newFilter_remove) {
		filter_remove = newFilter_remove;
	}
	public Object getType_data() {
		return type_data;
	}
	public void setType_data(Object newType_data) {
		type_data = newType_data;
	}
	public Object getFree_type_data() {
		return free_type_data;
	}
	public void setFree_type_data(Object newFree_type_data) {
		free_type_data = newFree_type_data;
	}
	public Object getAudio_render() {
		return audio_render;
	}
	public void setAudio_render(Object newAudio_render) {
		audio_render = newAudio_render;
	}
	public Object getEnum_all_sources() {
		return enum_all_sources;
	}
	public void setEnum_all_sources(Object newEnum_all_sources) {
		enum_all_sources = newEnum_all_sources;
	}
	public Object getTransition_start() {
		return transition_start;
	}
	public void setTransition_start(Object newTransition_start) {
		transition_start = newTransition_start;
	}
	public Object getTransition_stop() {
		return transition_stop;
	}
	public void setTransition_stop(Object newTransition_stop) {
		transition_stop = newTransition_stop;
	}
	public Object getGet_defaults2() {
		return get_defaults2;
	}
	public void setGet_defaults2(Object newGet_defaults2) {
		get_defaults2 = newGet_defaults2;
	}
	public Object getGet_properties2() {
		return get_properties2;
	}
	public void setGet_properties2(Object newGet_properties2) {
		get_properties2 = newGet_properties2;
	}
	public Object getAudio_mix() {
		return audio_mix;
	}
	public void setAudio_mix(Object newAudio_mix) {
		audio_mix = newAudio_mix;
	}
}
/* ----------------------------------------------------------------- */
/* Required implementation*/
