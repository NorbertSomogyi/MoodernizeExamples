package application;

public class list_data {
	private Object ;
	private obs_combo_type type;
	private obs_combo_format format;
	
	public list_data(Object,  obs_combo_type type, obs_combo_format format) {
		set();
		setType(type);
		setFormat(format);
	}
	public list_data() {
	}
	
	public void list_data_free() {
		for ( i = 0;
		 i < ModernizedCProgram.data.getItems().getNum(); i++) {
			ModernizedCProgram.list_item_free(ModernizedCProgram.data, ModernizedCProgram.data.getItems().getArray() + i);
		}
		.da_free(ModernizedCProgram.data.getItems());
	}
	public list_data get_list_data(obs_property p) {
		if (!p || !p.is_combo()) {
			return NULL;
		} 
		return p.get_property_data();
	}
	public list_data get_list_fmt_data(obs_property p, obs_combo_format format) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		return (data && generatedFormat == obs_combo_format.format) ? data : NULL;
	}
	public Object add_item(Object name, Object val) {
		list_item item = new list_item(NULL);
		item.setName(ModernizedCProgram.bstrdup(name));
		if (ModernizedCProgram.data.getFormat() == obs_combo_format.OBS_COMBO_FORMAT_INT) {
			item.setLl((long)val);
		}  else if (ModernizedCProgram.data.getFormat() == obs_combo_format.OBS_COMBO_FORMAT_FLOAT) {
			item.setD((double)val);
		} else {
				item.setStr(ModernizedCProgram.bstrdup(val));
		} 
		return .da_push_back(ModernizedCProgram.data.getItems(), item);
	}
	public void insert_item(Object idx, Object name, Object val) {
		list_item item = new list_item(NULL);
		item.setName(ModernizedCProgram.bstrdup(name));
		if (ModernizedCProgram.data.getFormat() == obs_combo_format.OBS_COMBO_FORMAT_INT) {
			item.setLl((long)val);
		}  else if (ModernizedCProgram.data.getFormat() == obs_combo_format.OBS_COMBO_FORMAT_FLOAT) {
			item.setD((double)val);
		} else {
				item.setStr(ModernizedCProgram.bstrdup(val));
		} 
		.da_insert(ModernizedCProgram.data.getItems(), idx, item);
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public obs_combo_type getType() {
		return type;
	}
	public void setType(obs_combo_type newType) {
		type = newType;
	}
	public obs_combo_format getFormat() {
		return format;
	}
	public void setFormat(obs_combo_format newFormat) {
		format = newFormat;
	}
}
