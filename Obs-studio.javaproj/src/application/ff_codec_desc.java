package application;

public class ff_codec_desc {
	private Object name;
	private Object long_name;
	private int id;
	private boolean alias;
	private Object base_name;
	private ff_codec_type type;
	private Object next;
	
	public ff_codec_desc(Object name, Object long_name, int id, boolean alias, Object base_name, ff_codec_type type, Object next) {
		setName(name);
		setLong_name(long_name);
		setId(id);
		setAlias(alias);
		setBase_name(base_name);
		setType(type);
		setNext(next);
	}
	public ff_codec_desc() {
	}
	
	public void add_codec_to_list(Object format_desc, ff_codec_desc current, AVCodecID id, Object codec, boolean ignore_compatability) {
		if (codec == NULL) {
			codec = /*Error: Function owner not recognized*/avcodec_find_encoder(AVCodecID.id);
		} 
		// No codec, or invalid idif (codec == NULL) {
			return /*Error: Unsupported expression*/;
		} 
		// Not an encoding codecif (!/*Error: Function owner not recognized*/av_codec_is_encoder(codec)) {
			return /*Error: Unsupported expression*/;
		} 
		if (!ignore_compatability) {
			int tag = /*Error: Function owner not recognized*/av_codec_get_tag(format_desc.getCodec_tags(), codec.getId());
			if (tag == 0) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		// Format doesn't support this codec
		ff_codec_desc d = /*Error: Function owner not recognized*/av_mallocz(/*Error: Unsupported expression*/);
		d.setName(codec.getName());
		d.setLong_name(codec.getLong_name());
		d.setId(codec.getId());
		 base_codec = /*Error: Function owner not recognized*/avcodec_find_encoder(codec.getId());
		if (/*Error: Function owner not recognized*/strcmp(base_codec.getName(), codec.getName()) != 0) {
			d.setAlias(1);
			d.setBase_name(base_codec.getName());
		} 
		switch (codec.getType()) {
		case AVMEDIA_TYPE_AUDIO:
				d.setType(ff_codec_type.FF_CODEC_AUDIO);
				break;
		case AVMEDIA_TYPE_VIDEO:
				d.setType(ff_codec_type.FF_CODEC_VIDEO);
				break;
		default:
				d.setType(ff_codec_type.FF_CODEC_UNKNOWN);
		}
		if (current != NULL) {
			(current).setNext(d);
		} else {
				first = d;
		} 
		current = d;
	}
	public void get_codecs_for_id(Object format_desc, ff_codec_desc current, AVCodecID id, boolean ignore_compatability) {
		 codec = NULL;
		while ((codec = ModernizedCProgram.next_codec_for_id(AVCodecID.id, codec)) != NULL) {
			first.add_codec_to_list(format_desc, current, codec.getId(), codec, ignore_compatability);
		}
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getLong_name() {
		return long_name;
	}
	public void setLong_name(Object newLong_name) {
		long_name = newLong_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public boolean getAlias() {
		return alias;
	}
	public void setAlias(boolean newAlias) {
		alias = newAlias;
	}
	public Object getBase_name() {
		return base_name;
	}
	public void setBase_name(Object newBase_name) {
		base_name = newBase_name;
	}
	public ff_codec_type getType() {
		return type;
	}
	public void setType(ff_codec_type newType) {
		type = newType;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
}
