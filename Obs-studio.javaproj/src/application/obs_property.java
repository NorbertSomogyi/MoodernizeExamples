package application;

public class obs_property {
	private Byte name;
	private Byte desc;
	private Byte long_desc;
	private Object priv;
	private obs_property_type type;
	private Object visible;
	private Object enabled;
	private obs_properties parent;
	private Object modified;
	private Object modified2;
	private obs_property next;
	
	public obs_property(Byte name, Byte desc, Byte long_desc, Object priv, obs_property_type type, Object visible, Object enabled, obs_properties parent, Object modified, Object modified2, obs_property next) {
		setName(name);
		setDesc(desc);
		setLong_desc(long_desc);
		setPriv(priv);
		setType(type);
		setVisible(visible);
		setEnabled(enabled);
		setParent(parent);
		setModified(modified);
		setModified2(modified2);
		setNext(next);
	}
	public obs_property() {
	}
	
	public void obs_property_destroy() {
		obs_property_type generatedType = this.getType();
		if (generatedType == obs_property_type.OBS_PROPERTY_LIST) {
			property.get_property_data().list_data_free();
		}  else if (generatedType == obs_property_type.OBS_PROPERTY_PATH) {
			property.get_property_data().path_data_free();
		}  else if (generatedType == obs_property_type.OBS_PROPERTY_EDITABLE_LIST) {
			property.get_property_data().editable_list_data_free();
		}  else if (generatedType == obs_property_type.OBS_PROPERTY_FRAME_RATE) {
			property.get_property_data().frame_rate_data_free();
		}  else if (generatedType == obs_property_type.OBS_PROPERTY_GROUP) {
			property.get_property_data().group_data_free();
		}  else if (generatedType == obs_property_type.OBS_PROPERTY_INT) {
			property.get_property_data().int_data_free();
		}  else if (generatedType == obs_property_type.OBS_PROPERTY_FLOAT) {
			property.get_property_data().float_data_free();
		} 
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Byte generatedDesc = this.getDesc();
		ModernizedCProgram.bfree(generatedDesc);
		Byte generatedLong_desc = this.getLong_desc();
		ModernizedCProgram.bfree(generatedLong_desc);
		ModernizedCProgram.bfree(property);
	}
	public obs_property obs_properties_first(obs_properties props) {
		obs_property generatedFirst_property = props.getFirst_property();
		return (props != NULL) ? generatedFirst_property : NULL;
	}
	public obs_property obs_properties_get(obs_properties props, Object name) {
		obs_property property = new obs_property();
		if (!props) {
			return NULL;
		} 
		obs_property generatedFirst_property = props.getFirst_property();
		property = generatedFirst_property;
		Byte generatedName = property.getName();
		obs_property_type generatedType = property.getType();
		obs_properties obs_properties = new obs_properties();
		obs_property obs_property = new obs_property();
		obs_property generatedNext = property.getNext();
		while (property) {
			if (.strcmp(generatedName, name) == 0) {
				return property;
			} 
			if (generatedType == obs_property_type.OBS_PROPERTY_GROUP) {
				obs_properties_t group = obs_properties.obs_property_group_content(property);
				obs_property_t found = obs_property.obs_properties_get(group, name);
				if (found != NULL) {
					return found;
				} 
			} 
			property = generatedNext;
		}
		return NULL;
	}
	public obs_property new_prop(obs_properties props, Object name, Object desc, obs_property_type type) {
		 data_size = ModernizedCProgram.get_property_size(obs_property_type.type);
		obs_property p = new obs_property();
		p = ModernizedCProgram.bzalloc( + data_size);
		p.setParent(props);
		p.setEnabled(true);
		p.setVisible(true);
		p.setType(obs_property_type.type);
		p.setName(ModernizedCProgram.bstrdup(name));
		p.setDesc(ModernizedCProgram.bstrdup(desc));
		ModernizedCProgram.propertes_add(props, p);
		return p;
	}
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
	public Object get_property_data() {
		return ()prop + ;
	}
	/* ------------------------------------------------------------------------- */
	public Object get_type_data(obs_property_type type) {
		obs_property_type generatedType = this.getType();
		if (!prop || generatedType != obs_property_type.type) {
			return NULL;
		} 
		return prop.get_property_data();
	}
	public obs_property obs_properties_add_bool(obs_properties props, Object name, Object desc) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		return obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_BOOL);
	}
	public obs_property add_int(obs_properties props, Object name, Object desc, int min, int max, int step, obs_number_type type) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_INT);
		int_data data = p.get_property_data();
		data.setMin(min);
		data.setMax(max);
		data.setStep(step);
		data.setType(obs_number_type.type);
		return p;
	}
	public obs_property add_flt(obs_properties props, Object name, Object desc, double min, double max, double step, obs_number_type type) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_FLOAT);
		float_data data = p.get_property_data();
		data.setMin(min);
		data.setMax(max);
		data.setStep(step);
		data.setType(obs_number_type.type);
		return p;
	}
	public obs_property obs_properties_add_int(obs_properties props, Object name, Object desc, int min, int max, int step) {
		obs_property obs_property = new obs_property();
		return obs_property.add_int(props, name, desc, min, max, step, obs_number_type.OBS_NUMBER_SCROLLER);
	}
	public obs_property obs_properties_add_float(obs_properties props, Object name, Object desc, double min, double max, double step) {
		obs_property obs_property = new obs_property();
		return obs_property.add_flt(props, name, desc, min, max, step, obs_number_type.OBS_NUMBER_SCROLLER);
	}
	public obs_property obs_properties_add_int_slider(obs_properties props, Object name, Object desc, int min, int max, int step) {
		obs_property obs_property = new obs_property();
		return obs_property.add_int(props, name, desc, min, max, step, obs_number_type.OBS_NUMBER_SLIDER);
	}
	public obs_property obs_properties_add_float_slider(obs_properties props, Object name, Object desc, double min, double max, double step) {
		obs_property obs_property = new obs_property();
		return obs_property.add_flt(props, name, desc, min, max, step, obs_number_type.OBS_NUMBER_SLIDER);
	}
	public obs_property obs_properties_add_text(obs_properties props, Object name, Object desc, obs_text_type type) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_TEXT);
		text_data data = p.get_property_data();
		data.setType(obs_text_type.type);
		return p;
	}
	public obs_property obs_properties_add_path(obs_properties props, Object name, Object desc, obs_path_type type, Object filter, Object default_path) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_PATH);
		path_data data = p.get_property_data();
		data.setType(obs_path_type.type);
		data.setDefault_path(ModernizedCProgram.bstrdup(default_path));
		obs_path_type generatedType = data.getType();
		if (generatedType == obs_path_type.OBS_PATH_FILE) {
			data.setFilter(ModernizedCProgram.bstrdup(filter));
		} 
		return p;
	}
	public obs_property obs_properties_add_list(obs_properties props, Object name, Object desc, obs_combo_type type, obs_combo_format format) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		if (obs_combo_type.type == obs_combo_type.OBS_COMBO_TYPE_EDITABLE && obs_combo_format.format != obs_combo_format.OBS_COMBO_FORMAT_STRING) {
			ModernizedCProgram.blog(LOG_WARNING, "List '%s', error: Editable combo boxes must be of the 'string' type", name);
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_LIST);
		list_data data = p.get_property_data();
		data.setFormat(obs_combo_format.format);
		data.setType(obs_combo_type.type);
		return p;
	}
	public obs_property obs_properties_add_color(obs_properties props, Object name, Object desc) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		return obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_COLOR);
	}
	public obs_property obs_properties_add_button(obs_properties props, Object name, Object text, Object callback) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, text, obs_property_type.OBS_PROPERTY_BUTTON);
		button_data data = p.get_property_data();
		data.setCallback(callback);
		return p;
	}
	public obs_property obs_properties_add_button2(obs_properties props, Object name, Object text, Object callback, Object priv) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, text, obs_property_type.OBS_PROPERTY_BUTTON);
		button_data data = p.get_property_data();
		data.setCallback(callback);
		p.setPriv(priv);
		return p;
	}
	public obs_property obs_properties_add_font(obs_properties props, Object name, Object desc) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		return obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_FONT);
	}
	public obs_property obs_properties_add_editable_list(obs_properties props, Object name, Object desc, obs_editable_list_type type, Object filter, Object default_path) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_EDITABLE_LIST);
		editable_list_data data = p.get_property_data();
		data.setType(obs_editable_list_type.type);
		data.setFilter(ModernizedCProgram.bstrdup(filter));
		data.setDefault_path(ModernizedCProgram.bstrdup(default_path));
		return p;
	}
	public obs_property obs_properties_add_frame_rate(obs_properties props, Object name, Object desc) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_FRAME_RATE);
		frame_rate_data data = p.get_property_data();
		Object generatedExtra_options = data.getExtra_options();
		.da_init(generatedExtra_options);
		Object generatedRanges = data.getRanges();
		.da_init(generatedRanges);
		return p;
	}
	public obs_property obs_properties_add_group(obs_properties props, Object name, Object desc, obs_group_type type, obs_properties group) {
		if (!props || props.has_prop(name)) {
			return NULL;
		} 
		if (!group) {
			return NULL;
		} 
		if (props == /* Prevent recursion. */group) {
			return NULL;
		} 
		if (props.check_property_group_recursion(group)) {
			return NULL;
		} 
		if (props.check_property_group_duplicates(/* Prevent duplicate properties */group)) {
			return NULL;
		} 
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.new_prop(props, name, desc, obs_property_type.OBS_PROPERTY_GROUP);
		group.setParent(p);
		group_data data = p.get_property_data();
		data.setType(obs_group_type.type);
		data.setContent(group);
		return p;
	}
	/* ------------------------------------------------------------------------- */
	public Object is_combo() {
		obs_property_type generatedType = this.getType();
		return generatedType == obs_property_type.OBS_PROPERTY_LIST;
	}
	/* ------------------------------------------------------------------------- */
	public Object obs_property_next() {
		if (!p || !p) {
			return false;
		} 
		obs_property generatedNext = (p).getNext();
		p = generatedNext;
		return p != NULL;
	}
	public void obs_property_set_modified_callback(Object modified) {
		if (p) {
			this.setModified(modified);
		} 
	}
	public void obs_property_set_modified_callback2(Object modified2, Object priv) {
		if (p) {
			this.setModified2(modified2);
			this.setPriv(priv);
		} 
	}
	public Object obs_property_button_clicked(Object obj) {
		obs_context_data context = obj;
		obs_properties generatedParent = this.getParent();
		Object generatedPriv = this.getPriv();
		Object generatedData = context.getData();
		if (p) {
			button_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_BUTTON);
			if (ModernizedCProgram.data && ModernizedCProgram.data.getCallback()) {
				obs_properties_t top = generatedParent.get_topmost_parent();
				if (generatedPriv) {
					return .UNRECOGNIZEDFUNCTIONNAME(top, p, generatedPriv);
				} 
				return .UNRECOGNIZEDFUNCTIONNAME(top, p, (context ? generatedData : NULL));
			} 
		} 
		return false;
	}
	public void obs_property_set_visible(Object visible) {
		if (p) {
			this.setVisible(visible);
		} 
	}
	public void obs_property_set_enabled(Object enabled) {
		if (p) {
			this.setEnabled(enabled);
		} 
	}
	public void obs_property_set_description(Object description) {
		Byte generatedDesc = this.getDesc();
		if (p) {
			ModernizedCProgram.bfree(generatedDesc);
			this.setDesc(description && description ? ModernizedCProgram.bstrdup(description) : NULL);
		} 
	}
	public void obs_property_set_long_description(Object long_desc) {
		Byte generatedLong_desc = this.getLong_desc();
		if (p) {
			ModernizedCProgram.bfree(generatedLong_desc);
			this.setLong_desc(long_desc && long_desc ? ModernizedCProgram.bstrdup(long_desc) : NULL);
		} 
	}
	public Object obs_property_name() {
		Byte generatedName = this.getName();
		return p ? generatedName : NULL;
	}
	public Object obs_property_description() {
		Byte generatedDesc = this.getDesc();
		return p ? generatedDesc : NULL;
	}
	public Object obs_property_long_description() {
		Byte generatedLong_desc = this.getLong_desc();
		return p ? generatedLong_desc : NULL;
	}
	public obs_property_type obs_property_get_type() {
		obs_property_type generatedType = this.getType();
		return p ? generatedType : obs_property_type.OBS_PROPERTY_INVALID;
	}
	public Object obs_property_enabled() {
		Object generatedEnabled = this.getEnabled();
		return p ? generatedEnabled : false;
	}
	public Object obs_property_visible() {
		Object generatedVisible = this.getVisible();
		return p ? generatedVisible : false;
	}
	public int obs_property_int_min() {
		int_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_INT);
		int generatedMin = data.getMin();
		return data ? generatedMin : 0;
	}
	public int obs_property_int_max() {
		int_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_INT);
		int generatedMax = data.getMax();
		return data ? generatedMax : 0;
	}
	public int obs_property_int_step() {
		int_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_INT);
		int generatedStep = data.getStep();
		return data ? generatedStep : 0;
	}
	public obs_number_type obs_property_int_type() {
		int_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_INT);
		obs_number_type generatedType = data.getType();
		return data ? generatedType : obs_number_type.OBS_NUMBER_SCROLLER;
	}
	public Object obs_property_int_suffix() {
		int_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_INT);
		Byte generatedSuffix = data.getSuffix();
		return data ? generatedSuffix : NULL;
	}
	public double obs_property_float_min() {
		float_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FLOAT);
		double generatedMin = data.getMin();
		return data ? generatedMin : 0;
	}
	public double obs_property_float_max() {
		float_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FLOAT);
		double generatedMax = data.getMax();
		return data ? generatedMax : 0;
	}
	public double obs_property_float_step() {
		float_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FLOAT);
		double generatedStep = data.getStep();
		return data ? generatedStep : 0;
	}
	public Object obs_property_float_suffix() {
		float_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FLOAT);
		Byte generatedSuffix = data.getSuffix();
		return data ? generatedSuffix : NULL;
	}
	public obs_number_type obs_property_float_type() {
		float_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FLOAT);
		obs_number_type generatedType = data.getType();
		return data ? generatedType : obs_number_type.OBS_NUMBER_SCROLLER;
	}
	public obs_text_type obs_property_text_type() {
		text_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_TEXT);
		obs_text_type generatedType = data.getType();
		return data ? generatedType : obs_text_type.OBS_TEXT_DEFAULT;
	}
	public obs_path_type obs_property_path_type() {
		path_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_PATH);
		obs_path_type generatedType = data.getType();
		return data ? generatedType : obs_path_type.OBS_PATH_DIRECTORY;
	}
	public Object obs_property_path_filter() {
		path_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_PATH);
		Byte generatedFilter = data.getFilter();
		return data ? generatedFilter : NULL;
	}
	public Object obs_property_path_default_path() {
		path_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_PATH);
		Byte generatedDefault_path = data.getDefault_path();
		return data ? generatedDefault_path : NULL;
	}
	public obs_combo_type obs_property_list_type() {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_type generatedType = data.getType();
		return data ? generatedType : obs_combo_type.OBS_COMBO_TYPE_INVALID;
	}
	public obs_combo_format obs_property_list_format() {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		return data ? generatedFormat : obs_combo_format.OBS_COMBO_FORMAT_INVALID;
	}
	public void obs_property_int_set_limits(int min, int max, int step) {
		int_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_INT);
		if (!data) {
			return ;
		} 
		data.setMin(min);
		data.setMax(max);
		data.setStep(step);
	}
	public void obs_property_float_set_limits(double min, double max, double step) {
		float_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FLOAT);
		if (!data) {
			return ;
		} 
		data.setMin(min);
		data.setMax(max);
		data.setStep(step);
	}
	public void obs_property_int_set_suffix(Object suffix) {
		int_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_INT);
		if (!data) {
			return ;
		} 
		Byte generatedSuffix = data.getSuffix();
		ModernizedCProgram.bfree(generatedSuffix);
		data.setSuffix(ModernizedCProgram.bstrdup(suffix));
	}
	public void obs_property_float_set_suffix(Object suffix) {
		float_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FLOAT);
		if (!data) {
			return ;
		} 
		Byte generatedSuffix = data.getSuffix();
		ModernizedCProgram.bfree(generatedSuffix);
		data.setSuffix(ModernizedCProgram.bstrdup(suffix));
	}
	public void obs_property_list_clear() {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		if (data) {
			data.list_data_free();
		} 
	}
	public Object obs_property_list_add_string(Object name, Object val) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		if (data && generatedFormat == obs_combo_format.OBS_COMBO_FORMAT_STRING) {
			return data.add_item(name, val);
		} 
		return 0;
	}
	public Object obs_property_list_add_int(Object name, int val) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		if (data && generatedFormat == obs_combo_format.OBS_COMBO_FORMAT_INT) {
			return data.add_item(name, val);
		} 
		return 0;
	}
	public Object obs_property_list_add_float(Object name, double val) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		if (data && generatedFormat == obs_combo_format.OBS_COMBO_FORMAT_FLOAT) {
			return data.add_item(name, val);
		} 
		return 0;
	}
	public void obs_property_list_insert_string(Object idx, Object name, Object val) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		if (data && generatedFormat == obs_combo_format.OBS_COMBO_FORMAT_STRING) {
			data.insert_item(idx, name, val);
		} 
	}
	public void obs_property_list_insert_int(Object idx, Object name, int val) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		if (data && generatedFormat == obs_combo_format.OBS_COMBO_FORMAT_INT) {
			data.insert_item(idx, name, val);
		} 
	}
	public void obs_property_list_insert_float(Object idx, Object name, double val) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		obs_combo_format generatedFormat = data.getFormat();
		if (data && generatedFormat == obs_combo_format.OBS_COMBO_FORMAT_FLOAT) {
			data.insert_item(idx, name, val);
		} 
	}
	public void obs_property_list_item_remove(Object idx) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		Object generatedItems = data.getItems();
		if (data && idx < generatedItems.getNum()) {
			ModernizedCProgram.list_item_free(data, generatedItems.getArray() + idx);
			.da_erase(generatedItems, idx);
		} 
	}
	public Object obs_property_list_item_count() {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		Object generatedItems = data.getItems();
		return data ? generatedItems.getNum() : 0;
	}
	public Object obs_property_list_item_disabled(Object idx) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		Object generatedItems = data.getItems();
		return (data && idx < generatedItems.getNum()) ? generatedItems.getArray()[idx].getDisabled() : false;
	}
	public void obs_property_list_item_disable(Object idx, Object disabled) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		Object generatedItems = data.getItems();
		if (!data || idx >= generatedItems.getNum()) {
			return ;
		} 
		generatedItems.getArray()[idx].setDisabled(disabled);
	}
	public Object obs_property_list_item_name(Object idx) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_data(p);
		Object generatedItems = data.getItems();
		return (data && idx < generatedItems.getNum()) ? generatedItems.getArray()[idx].getName() : NULL;
	}
	public Object obs_property_list_item_string(Object idx) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_fmt_data(p, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		Object generatedItems = data.getItems();
		return (data && idx < generatedItems.getNum()) ? generatedItems.getArray()[idx].getStr() : NULL;
	}
	public int obs_property_list_item_int(Object idx) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_fmt_data(p, obs_combo_format.OBS_COMBO_FORMAT_INT);
		Object generatedItems = data.getItems();
		return (data && idx < generatedItems.getNum()) ? generatedItems.getArray()[idx].getLl() : 0;
	}
	public double obs_property_list_item_float(Object idx) {
		list_data list_data = new list_data();
		list_data data = list_data.get_list_fmt_data(p, obs_combo_format.OBS_COMBO_FORMAT_FLOAT);
		Object generatedItems = data.getItems();
		return (data && idx < generatedItems.getNum()) ? generatedItems.getArray()[idx].getD() : 0.0;
	}
	public obs_editable_list_type obs_property_editable_list_type() {
		editable_list_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_EDITABLE_LIST);
		obs_editable_list_type generatedType = data.getType();
		return data ? generatedType : obs_editable_list_type.OBS_EDITABLE_LIST_TYPE_STRINGS;
	}
	public Object obs_property_editable_list_filter() {
		editable_list_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_EDITABLE_LIST);
		Byte generatedFilter = data.getFilter();
		return data ? generatedFilter : NULL;
	}
	public Object obs_property_editable_list_default_path() {
		editable_list_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_EDITABLE_LIST);
		Byte generatedDefault_path = data.getDefault_path();
		return data ? generatedDefault_path : NULL/* ------------------------------------------------------------------------- */;
	}
	/* OBS_PROPERTY_FRAME_RATE */
	public void obs_property_frame_rate_clear() {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		if (!data) {
			return ;
		} 
		data.frame_rate_data_options_free();
		data.frame_rate_data_ranges_free();
	}
	public void obs_property_frame_rate_options_clear() {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		if (!data) {
			return ;
		} 
		data.frame_rate_data_options_free();
	}
	public void obs_property_frame_rate_fps_ranges_clear() {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		if (!data) {
			return ;
		} 
		data.frame_rate_data_ranges_free();
	}
	public Object obs_property_frame_rate_option_add(Object name, Object description) {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		if (!data) {
			return DARRAY_INVALID;
		} 
		Object generatedExtra_options = data.getExtra_options();
		frame_rate_option opt = .da_push_back_new(generatedExtra_options);
		opt.setName(ModernizedCProgram.bstrdup(name));
		opt.setDescription(ModernizedCProgram.bstrdup(description));
		return generatedExtra_options.getNum() - 1;
	}
	public void obs_property_frame_rate_option_insert(Object idx, Object name, Object description) {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		if (!data) {
			return ;
		} 
		Object generatedExtra_options = data.getExtra_options();
		frame_rate_option opt = .da_insert_new(generatedExtra_options, idx);
		opt.setName(ModernizedCProgram.bstrdup(name));
		opt.setDescription(ModernizedCProgram.bstrdup(description));
	}
	public Object obs_property_frame_rate_options_count() {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		Object generatedExtra_options = data.getExtra_options();
		return data ? generatedExtra_options.getNum() : 0;
	}
	public Object obs_property_frame_rate_option_name(Object idx) {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		Object generatedExtra_options = data.getExtra_options();
		return data && generatedExtra_options.getNum() > idx ? generatedExtra_options.getArray()[idx].getName() : NULL;
	}
	public Object obs_property_frame_rate_option_description(Object idx) {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		Object generatedExtra_options = data.getExtra_options();
		return data && generatedExtra_options.getNum() > idx ? generatedExtra_options.getArray()[idx].getDescription() : NULL;
	}
	public Object obs_property_frame_rate_fps_ranges_count() {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		Object generatedRanges = data.getRanges();
		return data ? generatedRanges.getNum() : 0;
	}
	public obs_text_type obs_proprety_text_type() {
		return p.obs_property_text_type();
	}
	public obs_group_type obs_property_group_type() {
		group_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_GROUP);
		obs_group_type generatedType = data.getType();
		return data ? generatedType : obs_group_type.OBS_COMBO_INVALID;
	}
	public void add_window(Object hwnd, Object callback) {
		dstr class = new dstr(0);
		dstr title = new dstr(0);
		dstr exe = new dstr(0);
		dstr encoded = new dstr(0);
		dstr desc = new dstr(0);
		if (!exe.get_window_exe(hwnd)) {
			return ;
		} 
		Object generatedDstr = exe.getDstr();
		if (ModernizedCProgram.is_microsoft_internal_window_exe(generatedDstr)) {
			exe.dstr_free();
			return ;
		} 
		title.get_window_title(hwnd);
		if (ModernizedCProgram.dstr_cmp(exe, "explorer.exe") == 0 && ModernizedCProgram.dstr_is_empty(title)) {
			exe.dstr_free();
			title.dstr_free();
			return ;
		} 
		class.get_window_class(hwnd);
		if (callback && !.callback(generatedDstr, generatedDstr, generatedDstr)) {
			title.dstr_free();
			class.dstr_free();
			exe.dstr_free();
			return ;
		} 
		desc.dstr_printf("[%s]: %s", generatedDstr, generatedDstr);
		title.encode_dstr();
		class.encode_dstr();
		exe.encode_dstr();
		encoded.dstr_cat_dstr(title);
		encoded.dstr_cat(":");
		encoded.dstr_cat_dstr(class);
		encoded.dstr_cat(":");
		encoded.dstr_cat_dstr(exe);
		p.obs_property_list_add_string(generatedDstr, generatedDstr);
		encoded.dstr_free();
		desc.dstr_free();
		class.dstr_free();
		title.dstr_free();
		exe.dstr_free();
	}
	public void fill_window_list(window_search_mode mode, Object callback) {
		HWND parent = new HWND();
		 use_findwindowex = false;
		HWND window = ModernizedCProgram.first_window(window_search_mode.mode, parent, use_findwindowex);
		while (window) {
			p.add_window(window, callback);
			window = ModernizedCProgram.next_window(window, window_search_mode.mode, parent, use_findwindowex);
		}
	}
	public Object get_monitor_props(int monitor_idx) {
		dstr monitor_desc = new dstr(0);
		gs_monitor_info info = new gs_monitor_info();
		if (!info.gs_get_duplicator_monitor_info(monitor_idx)) {
			return false;
		} 
		Object generatedGs_monitor_info = info.getGs_monitor_info();
		monitor_desc.dstr_catf("%s %d: %ldx%ld @ %ld,%ld", ModernizedCProgram.obs_module_text("Monitor"), monitor_idx + 1, generatedGs_monitor_info, generatedGs_monitor_info, generatedGs_monitor_info, generatedGs_monitor_info);
		Object generatedDstr = monitor_desc.getDstr();
		monitor_list.obs_property_list_add_int(generatedDstr, monitor_idx);
		monitor_desc.dstr_free();
		return true;
	}
	public void add_strings(Object strings) {
		while (strings) {
			list.obs_property_list_add_string(strings, strings);
			strings++;
		}
		while (strings) {
			list.obs_property_list_add_string(strings, strings);
			strings++;
		}
	}
	public Object fill_twitch_servers_locked() {
		size_t count = ModernizedCProgram.twitch_ingest_count();
		servers_prop.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Server.Auto"), "auto");
		if (count <= 1) {
			return false;
		} 
		twitch_ingest twitch_ingest = new twitch_ingest();
		Object generatedName = ing.getName();
		Object generatedUrl = ing.getUrl();
		for (size_t i = 0;
		 i < count; i++) {
			twitch_ingest ing = twitch_ingest.twitch_ingest(i);
			servers_prop.obs_property_list_add_string(generatedName, generatedUrl);
		}
		return true;
	}
	public Object fill_twitch_servers() {
		 success = new ();
		ModernizedCProgram.twitch_ingests_lock();
		success = servers_prop.fill_twitch_servers_locked();
		ModernizedCProgram.twitch_ingests_unlock();
		return success;
	}
	public void v4l2_input_list(Object dev) {
		v4l2_input in = new v4l2_input();
		.memset(in, 0, );
		prop.obs_property_list_clear();
		Object generatedV4l2_input = in.getV4l2_input();
		while (.v4l2_ioctl(dev, VIDIOC_ENUMINPUT, in) == 0) {
			prop.obs_property_list_add_int((byte)generatedV4l2_input, generatedV4l2_input);
			ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Found input '%s' (Index %d)", generatedV4l2_input, generatedV4l2_input);
			generatedV4l2_input++;
		}
	}
	/*
	 * List formats for device
	 */
	public void v4l2_format_list(int dev) {
		v4l2_fmtdesc fmt = new v4l2_fmtdesc();
		fmt.setV4l2_fmtdesc(V4L2_BUF_TYPE_VIDEO_CAPTURE);
		fmt.setV4l2_fmtdesc(0);
		dstr buffer = new dstr();
		buffer.dstr_init();
		prop.obs_property_list_clear();
		Object generatedV4l2_fmtdesc = fmt.getV4l2_fmtdesc();
		Object generatedDstr = buffer.getDstr();
		while (.v4l2_ioctl(dev, VIDIOC_ENUM_FMT, fmt) == 0) {
			buffer.dstr_copy((byte)generatedV4l2_fmtdesc);
			if (generatedV4l2_fmtdesc & V4L2_FMT_FLAG_EMULATED) {
				buffer.dstr_cat(" (Emulated)");
			} 
			if (ModernizedCProgram.v4l2_to_obs_video_format(generatedV4l2_fmtdesc) != VIDEO_FORMAT_NONE) {
				prop.obs_property_list_add_int(generatedDstr, generatedV4l2_fmtdesc);
				ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Pixelformat: %s (available)", generatedDstr);
			} else {
					ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Pixelformat: %s (unavailable)", generatedDstr);
			} 
			generatedV4l2_fmtdesc++;
		}
		buffer/*
		 * List video standards for the device
		 */.dstr_free();
	}
	public void v4l2_standard_list(int dev) {
		v4l2_standard std = new v4l2_standard();
		std.setV4l2_standard(0);
		prop.obs_property_list_clear();
		prop.obs_property_list_add_int(ModernizedCProgram.obs_module_text("LeaveUnchanged"), -1);
		Object generatedV4l2_standard = std.getV4l2_standard();
		while (.v4l2_ioctl(dev, VIDIOC_ENUMSTD, std) == 0) {
			prop.obs_property_list_add_int((byte)generatedV4l2_standard, generatedV4l2_standard);
			generatedV4l2_standard++;
		}
	}
	/*
	 * List dv timings for the device
	 */
	public void v4l2_dv_timing_list(int dev) {
		v4l2_dv_timings dvt = new v4l2_dv_timings();
		dstr buf = new dstr();
		int index = 0;
		buf.dstr_init();
		prop.obs_property_list_clear();
		prop.obs_property_list_add_int(ModernizedCProgram.obs_module_text("LeaveUnchanged"), -1);
		Object generatedV4l2_dv_timings = dvt.getV4l2_dv_timings();
		Object generatedDstr = buf.getDstr();
		while (ModernizedCProgram.v4l2_enum_dv_timing(dev, dvt, index) == 0) {
			double h = (double)generatedV4l2_dv_timings.getHeight() + generatedV4l2_dv_timings.getVfrontporch() + generatedV4l2_dv_timings.getVsync() + generatedV4l2_dv_timings.getVbackporch() + generatedV4l2_dv_timings.getIl_vfrontporch() + generatedV4l2_dv_timings.getIl_vsync() + generatedV4l2_dv_timings.getIl_vbackporch();
			double w = (double)generatedV4l2_dv_timings.getWidth() + generatedV4l2_dv_timings.getHfrontporch() + generatedV4l2_dv_timings.getHsync() + generatedV4l2_dv_timings.getHbackporch();
			double i = (generatedV4l2_dv_timings.getInterlaced()) ? 2.0 : 1.0;
			double rate = (double)generatedV4l2_dv_timings.getPixelclock() / (w * (h / i));
			buf.dstr_printf("%ux%u%c %.2f", generatedV4l2_dv_timings.getWidth(), generatedV4l2_dv_timings.getHeight(), (generatedV4l2_dv_timings.getInterlaced()) ? (byte)'i' : (byte)'p', ModernizedCProgram.rate);
			prop.obs_property_list_add_int(generatedDstr, index);
			index++;
		}
		buf/*
		 * List resolutions for device and format
		 */.dstr_free();
	}
	public void v4l2_resolution_list(int dev, Object pixelformat) {
		v4l2_frmsizeenum frmsize = new v4l2_frmsizeenum();
		frmsize.setV4l2_frmsizeenum(pixelformat);
		frmsize.setV4l2_frmsizeenum(0);
		dstr buffer = new dstr();
		buffer.dstr_init();
		prop.obs_property_list_clear();
		prop.obs_property_list_add_int(ModernizedCProgram.obs_module_text("LeaveUnchanged"), -1);
		.v4l2_ioctl(dev, VIDIOC_ENUM_FRAMESIZES, frmsize);
		Object generatedV4l2_frmsizeenum = frmsize.getV4l2_frmsizeenum();
		Object generatedDstr = buffer.getDstr();
		switch (generatedV4l2_frmsizeenum) {
		case V4L2_FRMSIZE_TYPE_DISCRETE:
				while (.v4l2_ioctl(dev, VIDIOC_ENUM_FRAMESIZES, frmsize) == 0) {
					buffer.dstr_printf("%dx%d", generatedV4l2_frmsizeenum.getWidth(), generatedV4l2_frmsizeenum.getHeight());
					prop.obs_property_list_add_int(generatedDstr, ModernizedCProgram.v4l2_pack_tuple(generatedV4l2_frmsizeenum.getWidth(), generatedV4l2_frmsizeenum.getHeight()));
					generatedV4l2_frmsizeenum++;
				}
				break;
		default:
				ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Stepwise and Continuous framesizes are currently hardcoded");
				for (int packed = ModernizedCProgram.v4l2_framesizes;
				 packed; ++packed) {
					int width;
					int height;
					ModernizedCProgram.v4l2_unpack_tuple(width, height, packed);
					buffer.dstr_printf("%dx%d", width, height);
					prop.obs_property_list_add_int(generatedDstr, packed);
				}
				break;
		}
		buffer/*
		 * List framerates for device and resolution
		 */.dstr_free();
	}
	public void v4l2_framerate_list(int dev, Object pixelformat, Object width, Object height) {
		v4l2_frmivalenum frmival = new v4l2_frmivalenum();
		frmival.setV4l2_frmivalenum(pixelformat);
		frmival.setV4l2_frmivalenum(width);
		frmival.setV4l2_frmivalenum(height);
		frmival.setV4l2_frmivalenum(0);
		dstr buffer = new dstr();
		buffer.dstr_init();
		prop.obs_property_list_clear();
		prop.obs_property_list_add_int(ModernizedCProgram.obs_module_text("LeaveUnchanged"), -1);
		.v4l2_ioctl(dev, VIDIOC_ENUM_FRAMEINTERVALS, frmival);
		Object generatedV4l2_frmivalenum = frmival.getV4l2_frmivalenum();
		Object generatedDstr = buffer.getDstr();
		switch (generatedV4l2_frmivalenum) {
		case V4L2_FRMIVAL_TYPE_DISCRETE:
				while (.v4l2_ioctl(dev, VIDIOC_ENUM_FRAMEINTERVALS, frmival) == 0) {
					double fps = (double)generatedV4l2_frmivalenum.getDenominator() / generatedV4l2_frmivalenum.getNumerator();
					int pack = ModernizedCProgram.v4l2_pack_tuple(generatedV4l2_frmivalenum.getNumerator(), generatedV4l2_frmivalenum.getDenominator());
					buffer.dstr_printf("%.2f", fps);
					prop.obs_property_list_add_int(generatedDstr, ModernizedCProgram.pack);
					generatedV4l2_frmivalenum++;
				}
				break;
		default:
				ModernizedCProgram.blog(LOG_INFO, "v4l2-input: Stepwise and Continuous framerates are currently hardcoded");
				for (int packed = ModernizedCProgram.v4l2_framerates;
				 packed; ++packed) {
					int num;
					int denom;
					ModernizedCProgram.v4l2_unpack_tuple(num, denom, packed);
					double fps = (double)denom / num;
					buffer.dstr_printf("%.2f", fps);
					prop.obs_property_list_add_int(generatedDstr, packed);
				}
				break;
		}
		buffer/*
		 * Device selected callback
		 */.dstr_free();
	}
	public void insert_preserved_val(Object val) {
		byte class = ((Object)0);
		byte title = ((Object)0);
		byte executable = ((Object)0);
		dstr desc = new dstr(0);
		ModernizedCProgram.build_window_strings(val, class, title, executable);
		desc.dstr_printf("[%s]: %s", executable, title);
		Object generatedDstr = desc.getDstr();
		p.obs_property_list_insert_string(1, generatedDstr, val);
		p.obs_property_list_item_disable(1, 1);
		desc.dstr_free();
		ModernizedCProgram.bfree(class);
		ModernizedCProgram.bfree(title);
		ModernizedCProgram.bfree(executable);
	}
	public void add_rate_controls(Object rc) {
		qsv_cpu_platform plat = .qsv_get_cpu_platform();
		while (rc.getName()) {
			if (!rc.getHaswell_or_greater() || qsv_cpu_platform.plat >= qsv_cpu_platform.QSV_CPU_PLATFORM_HSW) {
				list.obs_property_list_add_string(rc.getName(), rc.getName());
			} 
			rc++;
		}
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getDesc() {
		return desc;
	}
	public void setDesc(Byte newDesc) {
		desc = newDesc;
	}
	public Byte getLong_desc() {
		return long_desc;
	}
	public void setLong_desc(Byte newLong_desc) {
		long_desc = newLong_desc;
	}
	public Object getPriv() {
		return priv;
	}
	public void setPriv(Object newPriv) {
		priv = newPriv;
	}
	public obs_property_type getType() {
		return type;
	}
	public void setType(obs_property_type newType) {
		type = newType;
	}
	public Object getVisible() {
		return visible;
	}
	public void setVisible(Object newVisible) {
		visible = newVisible;
	}
	public Object getEnabled() {
		return enabled;
	}
	public void setEnabled(Object newEnabled) {
		enabled = newEnabled;
	}
	public obs_properties getParent() {
		return parent;
	}
	public void setParent(obs_properties newParent) {
		parent = newParent;
	}
	public Object getModified() {
		return modified;
	}
	public void setModified(Object newModified) {
		modified = newModified;
	}
	public Object getModified2() {
		return modified2;
	}
	public void setModified2(Object newModified2) {
		modified2 = newModified2;
	}
	public obs_property getNext() {
		return next;
	}
	public void setNext(obs_property newNext) {
		next = newNext;
	}
}
