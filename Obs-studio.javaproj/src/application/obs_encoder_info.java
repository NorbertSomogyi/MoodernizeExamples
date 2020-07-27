package application;

public class obs_encoder_info {
	private Object id;
	private obs_encoder_type type;
	private Object codec;
	private Object get_name;
	private Object create;
	private Object destroy;
	private Object encode;
	private Object get_frame_size;
	private Object get_defaults;
	private Object get_properties;
	private Object update;
	private Object get_extra_data;
	private Object get_sei_data;
	private Object get_audio_info;
	private Object get_video_info;
	private Object type_data;
	private Object free_type_data;
	private Object caps;
	private Object get_defaults2;
	private Object get_properties2;
	private Object encode_texture;
	
	public obs_encoder_info(Object id, obs_encoder_type type, Object codec, Object get_name, Object create, Object destroy, Object encode, Object get_frame_size, Object get_defaults, Object get_properties, Object update, Object get_extra_data, Object get_sei_data, Object get_audio_info, Object get_video_info, Object type_data, Object free_type_data, Object caps, Object get_defaults2, Object get_properties2, Object encode_texture) {
		setId(id);
		setType(type);
		setCodec(codec);
		setGet_name(get_name);
		setCreate(create);
		setDestroy(destroy);
		setEncode(encode);
		setGet_frame_size(get_frame_size);
		setGet_defaults(get_defaults);
		setGet_properties(get_properties);
		setUpdate(update);
		setGet_extra_data(get_extra_data);
		setGet_sei_data(get_sei_data);
		setGet_audio_info(get_audio_info);
		setGet_video_info(get_video_info);
		setType_data(type_data);
		setFree_type_data(free_type_data);
		setCaps(caps);
		setGet_defaults2(get_defaults2);
		setGet_properties2(get_properties2);
		setEncode_texture(encode_texture);
	}
	public obs_encoder_info() {
	}
	
	public obs_encoder_info find_encoder(Object id) {
		Object generatedId = info.getId();
		for ( i = 0;
		 i < ModernizedCProgram.obs.getEncoder_types().getNum(); i++) {
			obs_encoder_info info = ModernizedCProgram.obs.getEncoder_types().getArray() + i;
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
	public obs_encoder_type getType() {
		return type;
	}
	public void setType(obs_encoder_type newType) {
		type = newType;
	}
	public Object getCodec() {
		return codec;
	}
	public void setCodec(Object newCodec) {
		codec = newCodec;
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
	public Object getEncode() {
		return encode;
	}
	public void setEncode(Object newEncode) {
		encode = newEncode;
	}
	public Object getGet_frame_size() {
		return get_frame_size;
	}
	public void setGet_frame_size(Object newGet_frame_size) {
		get_frame_size = newGet_frame_size;
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
	public Object getGet_extra_data() {
		return get_extra_data;
	}
	public void setGet_extra_data(Object newGet_extra_data) {
		get_extra_data = newGet_extra_data;
	}
	public Object getGet_sei_data() {
		return get_sei_data;
	}
	public void setGet_sei_data(Object newGet_sei_data) {
		get_sei_data = newGet_sei_data;
	}
	public Object getGet_audio_info() {
		return get_audio_info;
	}
	public void setGet_audio_info(Object newGet_audio_info) {
		get_audio_info = newGet_audio_info;
	}
	public Object getGet_video_info() {
		return get_video_info;
	}
	public void setGet_video_info(Object newGet_video_info) {
		get_video_info = newGet_video_info;
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
	public Object getCaps() {
		return caps;
	}
	public void setCaps(Object newCaps) {
		caps = newCaps;
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
	public Object getEncode_texture() {
		return encode_texture;
	}
	public void setEncode_texture(Object newEncode_texture) {
		encode_texture = newEncode_texture;
	}
}
/* ----------------------------------------------------------------- */
/* Required implementation*/
