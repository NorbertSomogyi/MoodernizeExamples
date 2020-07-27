package application;

/*
 * Copyright (c) 2009-2016 Petri Lehtinen <petri@digip.org>
 *
 * Jansson is free software; you can redistribute it and/or modify
 * it under the terms of the MIT license. See LICENSE for details.
 */
/* for size_t */
/* version */
/* Micro version is omitted if it's 0 */
/* Version as a 3-byte hex number, e.g. 0x010201 == 1.2.1. Use this
   for numeric comparisons, e.g. #if JANSSON_VERSION_HEX >= ... */
/* types */
public class json_t {
	private  type;
	private Object refcount;
	
	public json_t( type, Object refcount) {
		setType(type);
		setRefcount(refcount);
	}
	public json_t() {
	}
	
	public json_t obs_data_to_json(obs_data data) {
		json_t json_t = new json_t();
		json_t json = json_t.json_object();
		obs_data_item_t item = ((Object)0);
		obs_data_item obs_data_item = new obs_data_item();
		for (item = obs_data_item.obs_data_first(data); item; item.obs_data_item_next()) {
			obs_data_type type = item.obs_data_item_gettype();
			byte name = item.get_item_name();
			if (!item.obs_data_item_has_user_value()) {
				continue;
			} 
			if (obs_data_type.type == obs_data_type.OBS_DATA_STRING) {
				ModernizedCProgram.set_json_string(json, name, item);
			}  else if (obs_data_type.type == obs_data_type.OBS_DATA_NUMBER) {
				ModernizedCProgram.set_json_number(json, name, item);
			}  else if (obs_data_type.type == obs_data_type.OBS_DATA_BOOLEAN) {
				ModernizedCProgram.set_json_bool(json, name, item);
			}  else if (obs_data_type.type == obs_data_type.OBS_DATA_OBJECT) {
				ModernizedCProgram.set_json_obj(json, name, item);
			}  else if (obs_data_type.type == obs_data_type.OBS_DATA_ARRAY) {
				ModernizedCProgram.set_json_array(json, name, item);
			} 
		}
		return json;
	}
	public Object get_string_val(Object key) {
		json_t json_t = new json_t();
		json_t str_val = json_t.json_object_get(service, key);
		 generatedType = (str_val).getType();
		if (!str_val || !((str_val) && (generatedType) == .JSON_STRING)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.json_string_value(str_val);
	}
	public int get_int_val(Object key) {
		json_t json_t = new json_t();
		json_t integer_val = json_t.json_object_get(service, key);
		 generatedType = (integer_val).getType();
		if (!integer_val || !((integer_val) && (generatedType) == .JSON_INTEGER)) {
			return 0;
		} 
		return (int)ModernizedCProgram.json_integer_value(integer_val);
	}
	public Object get_bool_val(Object key) {
		json_t json_t = new json_t();
		json_t bool_val = json_t.json_object_get(service, key);
		 generatedType = (bool_val).getType();
		if (!bool_val || !(((bool_val) && (generatedType) == .JSON_TRUE) || ((bool_val) && (generatedType) == .JSON_FALSE))) {
			return false;
		} 
		return ((bool_val) && (generatedType) == .JSON_TRUE);
	}
	public json_t open_json_file(Object file) {
		byte file_data = ModernizedCProgram.os_quick_read_utf8_file(file);
		json_error_t error = new json_error_t();
		json_t root = new json_t();
		json_t list = new json_t();
		int format_ver;
		if (!file_data) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		root = json_t.json_loads(file_data, -1024, error);
		ModernizedCProgram.bfree(file_data);
		Object generatedLine = error.getLine();
		Object generatedText = error.getText();
		if (!root) {
			ModernizedCProgram.blog(LOG_WARNING, "rtmp-common.c: [open_json_file] Error reading JSON file (%d): %s", generatedLine, generatedText);
			return ((Object)0);
		} 
		format_ver = root.get_int_val("format_version");
		if (format_ver != 2) {
			ModernizedCProgram.blog(LOG_DEBUG, "rtmp-common.c: [open_json_file] Wrong format version (%d), expected %d", format_ver, 2);
			root.json_decref();
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		list = json_t.json_object_get(root, "services");
		if (list) {
			list.json_incref();
		} 
		root.json_decref();
		if (!list) {
			ModernizedCProgram.blog(LOG_WARNING, "rtmp-common.c: [open_json_file] No services list");
			return ((Object)0);
		} 
		return list;
	}
	public json_t open_services_file() {
		byte file;
		json_t root = ((Object)0);
		obs_module obs_module = new obs_module();
		file = obs_module.obs_current_module().obs_module_get_config_path("services.json");
		json_t json_t = new json_t();
		if (file) {
			root = json_t.open_json_file(file);
			ModernizedCProgram.bfree(file);
		} 
		if (!root) {
			file = obs_module.obs_current_module().obs_find_module_file("services.json");
			if (file) {
				root = json_t.open_json_file(file);
				ModernizedCProgram.bfree(file);
			} 
		} 
		return root;
	}
	public json_t find_service(Object name, Object p_new_name) {
		size_t index = new size_t();
		json_t service = new json_t();
		if (p_new_name) {
			p_new_name = ((Object)0);
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		for (index = 0; index < ModernizedCProgram.json_array_size(root) && (service = json_t.json_array_get(root, index)); index++) {
			byte cur_name = service.get_string_val("name");
			if (/*Error: Function owner not recognized*/strcmp(name, cur_name) == 0) {
				return service;
			} 
			json_t alt_names = json_t.json_object_get(service, /* check for alternate names */"alt_names");
			size_t alt_name_idx = new size_t();
			json_t alt_name_obj = new json_t();
			for (alt_name_idx = 0; alt_name_idx < ModernizedCProgram.json_array_size(alt_names) && (alt_name_obj = json_t.json_array_get(alt_names, alt_name_idx)); alt_name_idx++) {
				byte alt_name = ModernizedCProgram.json_string_value(alt_name_obj);
				if (alt_name && /*Error: Function owner not recognized*/strcmp(name, alt_name) == 0) {
					if (p_new_name) {
						p_new_name = cur_name;
					} 
					return service;
				} 
			}
		}
		return ((Object)0);
		 i = new ();
		for (i = 0; i < ModernizedCProgram.obs.getService_types().getNum(); i++) {
			if (/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.obs.getService_types().getArray()[i].getId(), id) == 0) {
				return ModernizedCProgram.obs.getService_types().getArray() + i;
			} 
		}
		return NULL;
	}
	public json_t pack_object( s, Object ap) {
		json_t json_t = new json_t();
		json_t object = json_t.json_object();
		s.next_token();
		Object generatedToken = (s).getToken();
		json_t json_t = new json_t();
		while ((generatedToken.getToken()) != (byte)'}') {
			byte key;
			size_t len = new size_t();
			int ours;
			json_t value = new json_t();
			if (!(generatedToken)) {
				s.set_error("<format>", "Unexpected end of format string");
				;
			} 
			if ((generatedToken) != (byte)'s') {
				s.set_error("<format>", "Expected format 's', got '%c'", (generatedToken));
				;
			} 
			ModernizedCProgram.key = s.read_string(ap, "object key", len, ours);
			if (!ModernizedCProgram.key) {
				;
			} 
			s.next_token();
			value = json_t.pack(s, ap);
			if (!value) {
				if (ours) {
					ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
				} 
				;
			} 
			if (object.json_object_set_new_nocheck(ModernizedCProgram.key, value)) {
				s.set_error("<internal>", "Unable to add key \"%s\"", ModernizedCProgram.key);
				if (ours) {
					ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
				} 
				;
			} 
			if (ours) {
				ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
			} 
			s.next_token();
		}
		return object;
		return ((Object)0);
	}
	public json_t pack_array( s, Object ap) {
		json_t json_t = new json_t();
		json_t array = json_t.json_array();
		s.next_token();
		Object generatedToken = (s).getToken();
		json_t json_t = new json_t();
		while ((generatedToken.getToken()) != (byte)']') {
			json_t value = new json_t();
			if (!(generatedToken)) {
				s.set_error("<format>", "Unexpected end of format string");
				;
			} 
			value = json_t.pack(s, ap);
			if (!value) {
				;
			} 
			if (array.json_array_append_new(value)) {
				s.set_error("<internal>", "Unable to append to array");
				;
			} 
			s.next_token();
		}
		return array;
		return ((Object)0);
	}
	public json_t pack_string( s, Object ap) {
		byte str;
		size_t len = new size_t();
		int ours;
		int nullable;
		s.next_token();
		Object generatedToken = (s).getToken();
		nullable = (generatedToken.getToken()) == (byte)'?';
		if (!nullable) {
			s.prev_token();
		} 
		str = s.read_string(ap, "string", len, ours);
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		if (!str) {
			return nullable ? json_t.json_null() : ((Object)0);
		}  else if (ours) {
			return json_t.jsonp_stringn_nocheck_own(str, len);
		} else {
				return json_t.json_stringn_nocheck(str, len);
		} 
	}
	public json_t pack( s, Object ap) {
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		Object generatedToken = (s).getToken();
		switch ((generatedToken)) {
		case /* integer from json_int_t */(byte)'I':
				return json_t.json_integer((int)ap);
		case /* real */(byte)'f':
				return json_t.json_real((int)ap);
		case /* integer from int */(byte)'i':
				return json_t.json_integer((int)ap);
		case /* a json_t object; increments refcount */(byte)'O':
				{ 
					int nullable;
					json_t json = new json_t();
					s.next_token();
					nullable = (generatedToken.getToken()) == (byte)'?';
					if (!nullable) {
						s.prev_token();
					} 
					json = (int)ap;
					if (!json && nullable) {
						return json_t.json_null();
					} else {
							return json.json_incref();
					} 
				}
		case (byte)'{':
				return json_t.pack_object(s, ap);
		case (byte)'[':
				return json_t.pack_array(s, ap);
		case /* string */(byte)'s':
				return json_t.pack_string(s, ap);
		case /* null */(byte)'n':
				return json_t.json_null();
		case /* boolean */(byte)'b':
				return (int)ap ? json_t.json_true() : json_t.json_false();
		case /* a json_t object; doesn't increment refcount */(byte)'o':
				{ 
					int nullable;
					json_t json = new json_t();
					s.next_token();
					nullable = (generatedToken) == (byte)'?';
					if (!nullable) {
						s.prev_token();
					} 
					json = (int)ap;
					if (!json && nullable) {
						return json_t.json_null();
					} else {
							return json;
					} 
				}
		default:
				s.set_error("<format>", "Unexpected format character '%c'", (generatedToken));
				return ((Object)0);
		}
	}
	public json_t json_vpack_ex( error, Object flags, Object fmt, Object ap) {
		scanner_t s = new scanner_t();
		va_list ap_copy = new va_list();
		json_t value = new json_t();
		if (!fmt || !fmt) {
			error.jsonp_error_init("<format>");
			error.jsonp_error_set(-1, -1, 0, "NULL or empty format string");
			return ((Object)0);
		} 
		error.jsonp_error_init(((Object)0));
		s.scanner_init(error, flags, fmt);
		s.next_token();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_copy(ap_copy, ap);
		json_t json_t = new json_t();
		value = json_t.pack(s, ap_copy);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap_copy);
		if (!value) {
			return ((Object)0);
		} 
		s.next_token();
		Object generatedToken = (s).getToken();
		if ((generatedToken.getToken())) {
			value.json_decref();
			s.set_error("<format>", "Garbage after format string");
			return ((Object)0);
		} 
		return value;
	}
	public json_t json_pack_ex( error, Object flags, Object fmt) {
		json_t value = new json_t();
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		json_t json_t = new json_t();
		value = json_t.json_vpack_ex(error, flags, fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		return value;
	}
	public json_t json_pack(Object fmt) {
		json_t value = new json_t();
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		json_t json_t = new json_t();
		value = json_t.json_vpack_ex(((Object)0), 0, fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		return value;
	}
	public int json_unpack(Object fmt) {
		int ret;
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		ret = ModernizedCProgram.json_vunpack_ex(root, ((Object)0), 0, fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		return ret;
	}
	public json_t parse_object( lex, Object flags,  error) {
		json_t json_t = new json_t();
		json_t object = json_t.json_object();
		if (!object) {
			return ((Object)0);
		} 
		lex.lex_scan(error);
		Object generatedToken = lex.getToken();
		if (generatedToken == (byte)'}') {
			return object;
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		while (1) {
			byte key;
			size_t len = new size_t();
			json_t value = new json_t();
			if (generatedToken != 256) {
				error.error_set(lex, "string or '}' expected");
				;
			} 
			ModernizedCProgram.key = lex.lex_steal_string(len);
			if (!ModernizedCProgram.key) {
				return ((Object)0);
			} 
			if (/*Error: Function owner not recognized*/memchr(ModernizedCProgram.key, (byte)'\0', len)) {
				ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
				error.error_set(lex, "NUL byte in object key not supported");
				;
			} 
			if (flags & -1024) {
				if (json_t.json_object_get(object, ModernizedCProgram.key)) {
					ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
					error.error_set(lex, "duplicate object key");
					;
				} 
			} 
			lex.lex_scan(error);
			if (generatedToken != (byte)':') {
				ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
				error.error_set(lex, "':' expected");
				;
			} 
			lex.lex_scan(error);
			value = json_t.parse_value(lex, flags, error);
			if (!value) {
				ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
				;
			} 
			if (object.json_object_set_nocheck(ModernizedCProgram.key, value)) {
				ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
				value.json_decref();
				;
			} 
			value.json_decref();
			ModernizedCProgram.jsonp_free(ModernizedCProgram.key);
			lex.lex_scan(error);
			if (generatedToken != (byte)',') {
				break;
			} 
			lex.lex_scan(error);
		}
		if (generatedToken != (byte)'}') {
			error.error_set(lex, "'}' expected");
			;
		} 
		return object;
		return ((Object)0);
	}
	public json_t parse_array( lex, Object flags,  error) {
		json_t json_t = new json_t();
		json_t array = json_t.json_array();
		if (!array) {
			return ((Object)0);
		} 
		lex.lex_scan(error);
		Object generatedToken = lex.getToken();
		if (generatedToken == (byte)']') {
			return array;
		} 
		json_t json_t = new json_t();
		while (generatedToken) {
			json_t elem = json_t.parse_value(lex, flags, error);
			if (!elem) {
				;
			} 
			if (array.json_array_append(elem)) {
				elem.json_decref();
				;
			} 
			elem.json_decref();
			lex.lex_scan(error);
			if (generatedToken != (byte)',') {
				break;
			} 
			lex.lex_scan(error);
		}
		if (generatedToken != (byte)']') {
			error.error_set(lex, "']' expected");
			;
		} 
		return array;
		return ((Object)0);
	}
	/*** parser ***/
	public json_t parse_value( lex, Object flags,  error) {
		json_t json = new json_t();
		Object generatedDepth = lex.getDepth();
		generatedDepth++;
		if (generatedDepth > 2048) {
			error.error_set(lex, "maximum parsing depth reached");
			return ((Object)0);
		} 
		Object generatedValue = lex.getValue();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		Object generatedToken = lex.getToken();
		switch (generatedToken) {
		case 259:
				json = json_t.json_true();
				break;
		case (byte)'[':
				json = json_t.parse_array(lex, flags, error);
				break;
		case 260:
				json = json_t.json_false();
				break;
		case 256:
				{ 
					byte value = generatedValue.getString().getVal();
					size_t len = generatedValue.getString().getLen();
					if (!(flags & -1024)) {
						if (/*Error: Function owner not recognized*/memchr(value, (byte)'\0', len)) {
							error.error_set(lex, "\\u0000 is not allowed without JSON_ALLOW_NUL");
							return ((Object)0);
						} 
					} 
					json = json_t.jsonp_stringn_nocheck_own(value, len);
					if (json) {
						generatedValue.getString().setVal(((Object)0));
						generatedValue.getString().setLen(0);
					} 
					break;
				}
		case 257:
				{ 
					json = json_t.json_integer(generatedValue.getInteger());
					break;
				}
		case 261:
				json = json_t.json_null();
				break;
		case -1:
				error.error_set(lex, "invalid token");
				return ((Object)0);
		case (byte)'{':
				json = json_t.parse_object(lex, flags, error);
				break;
		case 258:
				{ 
					json = json_t.json_real(generatedValue.getReal());
					break;
				}
		default:
				error.error_set(lex, "unexpected token");
				return ((Object)0);
		}
		if (!json) {
			return ((Object)0);
		} 
		generatedDepth--;
		return json;
	}
	public json_t parse_json( lex, Object flags,  error) {
		json_t result = new json_t();
		lex.setDepth(0);
		lex.lex_scan(error);
		Object generatedToken = lex.getToken();
		if (!(flags & -1024)) {
			if (generatedToken != (byte)'[' && generatedToken != (byte)'{') {
				error.error_set(lex, "'[' or '{' expected");
				return ((Object)0);
			} 
		} 
		json_t json_t = new json_t();
		result = json_t.parse_value(lex, flags, error);
		if (!result) {
			return ((Object)0);
		} 
		if (!(flags & -1024)) {
			lex.lex_scan(error);
			if (generatedToken != 0) {
				error.error_set(lex, "end of file expected");
				result.json_decref();
				return ((Object)0);
			} 
		} 
		Object generatedStream = lex.getStream();
		if (error) {
			error.setPosition((int)generatedStream.getPosition());
		} 
		return result;
	}
	public json_t json_loads(Object string, Object flags,  error) {
		lex_t lex = new lex_t();
		json_t result = new json_t();
		string_data_t stream_data = new string_data_t();
		error.jsonp_error_init("<string>");
		if (string == ((Object)0)) {
			error.error_set(((Object)0), "wrong arguments");
			return ((Object)0);
		} 
		stream_data.setData(string);
		stream_data.setPos(0);
		if (lex.lex_init(string_get, flags, (Object)stream_data)) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		result = json_t.parse_json(lex, flags, error);
		lex.lex_close();
		return result;
	}
	public json_t json_loadb(Object buffer, Object buflen, Object flags,  error) {
		lex_t lex = new lex_t();
		json_t result = new json_t();
		buffer_data_t stream_data = new buffer_data_t();
		error.jsonp_error_init("<buffer>");
		if (buffer == ((Object)0)) {
			error.error_set(((Object)0), "wrong arguments");
			return ((Object)0);
		} 
		stream_data.setData(buffer);
		stream_data.setPos(0);
		stream_data.setLen(buflen);
		if (lex.lex_init(buffer_get, flags, (Object)stream_data)) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		result = json_t.parse_json(lex, flags, error);
		lex.lex_close();
		return result;
	}
	public json_t json_loadf(_iobuf input, Object flags,  error) {
		lex_t lex = new lex_t();
		byte source;
		json_t result = new json_t();
		if (input == (_iob[0])) {
			source = "<stdin>";
		} else {
				source = "<stream>";
		} 
		error.jsonp_error_init(source);
		if (input == ((Object)0)) {
			error.error_set(((Object)0), "wrong arguments");
			return ((Object)0);
		} 
		if (lex.lex_init((get_func)fgetc, flags, input)) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		result = json_t.parse_json(lex, flags, error);
		lex.lex_close();
		return result;
	}
	public json_t json_load_file(Object path, Object flags,  error) {
		json_t result = new json_t();
		FILE fp = new FILE();
		error.jsonp_error_init(path);
		if (path == ((Object)0)) {
			error.error_set(((Object)0), "wrong arguments");
			return ((Object)0);
		} 
		fp = /*Error: Function owner not recognized*/fopen(path, "rb");
		if (!fp) {
			error.error_set(((Object)0), "unable to open %s: %s", path, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		result = json_t.json_loadf(fp, flags, error);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fp);
		return result;
	}
	public json_t json_load_callback(Object callback, Object arg, Object flags,  error) {
		lex_t lex = new lex_t();
		json_t result = new json_t();
		callback_data_t stream_data = new callback_data_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(stream_data, 0, /*Error: sizeof expression not supported yet*/);
		stream_data.setCallback(callback);
		stream_data.setArg(arg);
		error.jsonp_error_init("<callback>");
		if (callback == ((Object)0)) {
			error.error_set(((Object)0), "wrong arguments");
			return ((Object)0);
		} 
		if (lex.lex_init((get_func)callback_get, flags, stream_data)) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		result = json_t.parse_json(lex, flags, error);
		lex.lex_close();
		return result;
	}
	public json_t json_incref() {
		Object generatedRefcount = this.getRefcount();
		if (json && generatedRefcount != (size_t)-1) {
			++generatedRefcount;
		} 
		return json;
	}
	public void json_decref() {
		Object generatedRefcount = this.getRefcount();
		if (json && generatedRefcount != (size_t)-1 && --generatedRefcount == 0) {
			json.json_delete();
		} 
	}
	public void json_decrefp() {
		if (json) {
			json.json_decref();
			json = ((Object)0);
		} 
	}
	public int json_object_set(Object key, json_t value) {
		return object.json_object_set_new(key, value.json_incref());
	}
	public int json_object_set_nocheck(Object key, json_t value) {
		return object.json_object_set_new_nocheck(key, value.json_incref());
	}
	public int json_object_iter_set(Object iter, json_t value) {
		return object.json_object_iter_set_new(iter, value.json_incref());
	}
	public int json_array_set(Object ind, json_t value) {
		return array.json_array_set_new(ind, value.json_incref());
	}
	public int json_array_append(json_t value) {
		return array.json_array_append_new(value.json_incref());
	}
	public int json_array_insert(Object ind, json_t value) {
		return array.json_array_insert_new(ind, value.json_incref());
	}
	/*
	 * Simple example of parsing and printing JSON using jansson.
	 *
	 * SYNOPSIS:
	 * $ examples/simple_parse
	 * Type some JSON > [true, false, null, 1, 0.0, -0.0, "", {"name": "barney"}]
	 * JSON Array of 8 elements:
	 *   JSON True
	 *   JSON False
	 *   JSON Null
	 *   JSON Integer: "1"
	 *   JSON Real: 0.000000
	 *   JSON Real: -0.000000
	 *   JSON String: ""
	 *   JSON Object of 1 pair:
	 *     JSON Key: "name"
	 *     JSON String: "barney"
	 *
	 * Copyright (c) 2014 Robert Poor <rdpoor@gmail.com>
	 *
	 * Jansson is free software; you can redistribute it and/or modify
	 * it under the terms of the MIT license. See LICENSE for details.
	 */
	/* forward refs */
	public void print_json() {
		root.print_json_aux(0);
	}
	public void print_json_aux(int indent) {
		 generatedType = (element).getType();
		switch ((generatedType)) {
		case .JSON_ARRAY:
				element.print_json_array(indent);
				break;
		case .JSON_NULL:
				element.print_json_null(indent);
				break;
		case .JSON_REAL:
				element.print_json_real(indent);
				break;
		case .JSON_STRING:
				element.print_json_string(indent);
				break;
		case .JSON_OBJECT:
				element.print_json_object(indent);
				break;
		case .JSON_INTEGER:
				element.print_json_integer(indent);
				break;
		case .JSON_TRUE:
				element.print_json_true(indent);
				break;
		case .JSON_FALSE:
				element.print_json_false(indent);
				break;
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "unrecognized JSON type %d\n", (generatedType));
		}
	}
	public void print_json_object(int indent) {
		size_t size = new size_t();
		byte key;
		json_t value = new json_t();
		ModernizedCProgram.print_json_indent(indent);
		size = ModernizedCProgram.json_object_size(element);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON Object of %ld pair%s:\n", size, ModernizedCProgram.json_plural(size));
		json_t json_t = new json_t();
		for (key = ModernizedCProgram.json_object_iter_key(element.json_object_iter()); key && (value = json_t.json_object_iter_value(ModernizedCProgram.json_object_key_to_iter(key))); key = ModernizedCProgram.json_object_iter_key(element.json_object_iter_next(ModernizedCProgram.json_object_key_to_iter(key)))) {
			ModernizedCProgram.print_json_indent(indent + 2);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON Key: \"%s\"\n", key);
			value.print_json_aux(indent + 2);
		}
	}
	public void print_json_array(int indent) {
		size_t i = new size_t();
		size_t size = ModernizedCProgram.json_array_size(element);
		ModernizedCProgram.print_json_indent(indent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON Array of %ld element%s:\n", size, ModernizedCProgram.json_plural(size));
		json_t json_t = new json_t();
		for (i = 0; i < size; i++) {
			json_t.json_array_get(element, i).print_json_aux(indent + 2);
		}
	}
	public void print_json_string(int indent) {
		ModernizedCProgram.print_json_indent(indent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON String: \"%s\"\n", ModernizedCProgram.json_string_value(element));
	}
	public void print_json_integer(int indent) {
		ModernizedCProgram.print_json_indent(indent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON Integer: \"%I64d\"\n", ModernizedCProgram.json_integer_value(element));
	}
	public void print_json_real(int indent) {
		ModernizedCProgram.print_json_indent(indent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON Real: %f\n", ModernizedCProgram.json_real_value(element));
	}
	public void print_json_true(int indent) {
		(Object)element;
		ModernizedCProgram.print_json_indent(indent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON True\n");
	}
	public void print_json_false(int indent) {
		(Object)element;
		ModernizedCProgram.print_json_indent(indent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON False\n");
	}
	public void print_json_null(int indent) {
		(Object)element;
		ModernizedCProgram.print_json_indent(indent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("JSON Null\n"/*
		 * Parse text into a JSON object. If text is valid JSON, returns a
		 * json_t structure, otherwise prints and error and returns null.
		 */);
	}
	public json_t load_json(Object text) {
		json_t root = new json_t();
		json_error_t error = new json_error_t();
		json_t json_t = new json_t();
		root = json_t.json_loads(text, 0, error);
		Object generatedLine = error.getLine();
		Object generatedText = error.getText();
		if (root) {
			return root;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "json error on line %d: %s\n", generatedLine, generatedText);
				return (json_t)0/*
				 * Print a prompt and return (by reference) a null-terminated line of
				 * text.  Returns NULL on eof or some error.
				 */;
		} 
	}
	/*
	 * Copyright (c) 2009-2016 Petri Lehtinen <petri@digip.org>
	 *
	 * Jansson is free software; you can redistribute it and/or modify
	 * it under the terms of the MIT license. See LICENSE for details.
	 */
	/* Work around nonstandard isnan() and isinf() implementations */
	public void json_init( type) {
		this.setType(type);
		this.setRefcount(1/*** object ***/);
	}
	public json_t json_object() {
		json_object_t object = ModernizedCProgram.jsonp_malloc(/*Error: Unsupported expression*/);
		if (!object) {
			return ((Object)0);
		} 
		if (!ModernizedCProgram.hashtable_seed) {
			ModernizedCProgram.json_object_seed(/* Autoseed */0);
		} 
		Object generatedJson = object.getJson();
		generatedJson.json_init(.JSON_OBJECT);
		Object generatedHashtable = object.getHashtable();
		if (generatedHashtable.hashtable_init()) {
			ModernizedCProgram.jsonp_free(object);
			return ((Object)0);
		} 
		object.setVisited(0);
		return generatedJson;
	}
	public json_t json_object_get(Object json, Object key) {
		json_object_t object = new json_object_t();
		if (!key || !((json) && ((json).getType()) == .JSON_OBJECT)) {
			return ((Object)0);
		} 
		object = ((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson())));
		Object generatedHashtable = object.getHashtable();
		return generatedHashtable.hashtable_get(key);
	}
	public int json_object_set_new_nocheck(Object key, json_t value) {
		json_object_t object = new json_object_t();
		if (!value) {
			return -1;
		} 
		 generatedType = (json).getType();
		if (!key || !((json) && (generatedType) == .JSON_OBJECT) || json == value) {
			value.json_decref();
			return -1;
		} 
		object = ((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson())));
		Object generatedHashtable = object.getHashtable();
		if (ModernizedCProgram.hashtable_set(generatedHashtable, key, value)) {
			value.json_decref();
			return -1;
		} 
		return 0;
	}
	public int json_object_set_new(Object key, json_t value) {
		if (!key || !ModernizedCProgram.utf8_check_string(key, /*Error: Function owner not recognized*/strlen(key))) {
			value.json_decref();
			return -1;
		} 
		return json.json_object_set_new_nocheck(key, value);
	}
	public int json_object_del(Object key) {
		json_object_t object = new json_object_t();
		 generatedType = (json).getType();
		if (!key || !((json) && (generatedType) == .JSON_OBJECT)) {
			return -1;
		} 
		object = ((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson())));
		Object generatedHashtable = object.getHashtable();
		return generatedHashtable.hashtable_del(key);
	}
	public int json_object_clear() {
		json_object_t object = new json_object_t();
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_OBJECT)) {
			return -1;
		} 
		object = ((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson())));
		Object generatedHashtable = object.getHashtable();
		generatedHashtable.hashtable_clear();
		return 0;
	}
	public int json_object_update(json_t other) {
		byte key;
		json_t value = new json_t();
		 generatedType = (object).getType();
		if (!((object) && (generatedType) == .JSON_OBJECT) || !((other) && (generatedType) == .JSON_OBJECT)) {
			return -1;
		} 
		json_t json_t = new json_t();
		for (key = ModernizedCProgram.json_object_iter_key(other.json_object_iter()); key && (value = json_t.json_object_iter_value(ModernizedCProgram.json_object_key_to_iter(key))); key = ModernizedCProgram.json_object_iter_key(other.json_object_iter_next(ModernizedCProgram.json_object_key_to_iter(key)))) {
			if (object.json_object_set_nocheck(key, value)) {
				return -1;
			} 
		}
		return 0;
	}
	public int json_object_update_existing(json_t other) {
		byte key;
		json_t value = new json_t();
		 generatedType = (object).getType();
		if (!((object) && (generatedType) == .JSON_OBJECT) || !((other) && (generatedType) == .JSON_OBJECT)) {
			return -1;
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		for (key = ModernizedCProgram.json_object_iter_key(other.json_object_iter()); key && (value = json_t.json_object_iter_value(ModernizedCProgram.json_object_key_to_iter(key))); key = ModernizedCProgram.json_object_iter_key(other.json_object_iter_next(ModernizedCProgram.json_object_key_to_iter(key)))) {
			if (json_t.json_object_get(object, key)) {
				object.json_object_set_nocheck(key, value);
			} 
		}
		return 0;
	}
	public int json_object_update_missing(json_t other) {
		byte key;
		json_t value = new json_t();
		 generatedType = (object).getType();
		if (!((object) && (generatedType) == .JSON_OBJECT) || !((other) && (generatedType) == .JSON_OBJECT)) {
			return -1;
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		for (key = ModernizedCProgram.json_object_iter_key(other.json_object_iter()); key && (value = json_t.json_object_iter_value(ModernizedCProgram.json_object_key_to_iter(key))); key = ModernizedCProgram.json_object_iter_key(other.json_object_iter_next(ModernizedCProgram.json_object_key_to_iter(key)))) {
			if (!json_t.json_object_get(object, key)) {
				object.json_object_set_nocheck(key, value);
			} 
		}
		return 0;
	}
	public Object json_object_iter() {
		json_object_t object = new json_object_t();
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_OBJECT)) {
			return ((Object)0);
		} 
		object = ((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson())));
		Object generatedHashtable = object.getHashtable();
		return generatedHashtable.hashtable_iter();
	}
	public Object json_object_iter_at(Object key) {
		json_object_t object = new json_object_t();
		 generatedType = (json).getType();
		if (!key || !((json) && (generatedType) == .JSON_OBJECT)) {
			return ((Object)0);
		} 
		object = ((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson())));
		Object generatedHashtable = object.getHashtable();
		return generatedHashtable.hashtable_iter_at(key);
	}
	public Object json_object_iter_next(Object iter) {
		json_object_t object = new json_object_t();
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_OBJECT) || iter == ((Object)0)) {
			return ((Object)0);
		} 
		object = ((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson())));
		Object generatedHashtable = object.getHashtable();
		return generatedHashtable.hashtable_iter_next(iter);
	}
	public json_t json_object_iter_value(Object iter) {
		if (!iter) {
			return ((Object)0);
		} 
		return (json_t)ModernizedCProgram.hashtable_iter_value(iter);
	}
	public int json_object_iter_set_new(Object iter, json_t value) {
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_OBJECT) || !iter || !value) {
			return -1;
		} 
		value.hashtable_iter_set(iter);
		return 0;
	}
	public int json_object_equal(json_t object2) {
		byte key;
		json_t value1 = new json_t();
		json_t value2 = new json_t();
		if (ModernizedCProgram.json_object_size(object1) != ModernizedCProgram.json_object_size(object2)) {
			return 0;
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		for (key = ModernizedCProgram.json_object_iter_key(object1.json_object_iter()); key && (value1 = json_t.json_object_iter_value(ModernizedCProgram.json_object_key_to_iter(key))); key = ModernizedCProgram.json_object_iter_key(object1.json_object_iter_next(ModernizedCProgram.json_object_key_to_iter(key)))) {
			value2 = json_t.json_object_get(object2, key);
			if (!value1.json_equal(value2)) {
				return 0;
			} 
		}
		return 1;
	}
	public json_t json_object_copy() {
		json_t result = new json_t();
		byte key;
		json_t value = new json_t();
		json_t json_t = new json_t();
		result = json_t.json_object();
		if (!result) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		for (key = ModernizedCProgram.json_object_iter_key(object.json_object_iter()); key && (value = json_t.json_object_iter_value(ModernizedCProgram.json_object_key_to_iter(key))); key = ModernizedCProgram.json_object_iter_key(object.json_object_iter_next(ModernizedCProgram.json_object_key_to_iter(key)))) {
			result.json_object_set_nocheck(key, value);
		}
		return result;
	}
	public json_t json_object_deep_copy(Object object) {
		json_t result = new json_t();
		Object iter;
		json_t json_t = new json_t();
		result = json_t.json_object();
		if (!result) {
			return ((Object)0);
		} 
		iter = (json_t)/* Cannot use json_object_foreach because object has to be cast
		       non-const */object.json_object_iter();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		while (iter) {
			byte key;
			json_t value = new json_t();
			ModernizedCProgram.key = ModernizedCProgram.json_object_iter_key(iter);
			value = json_t.json_object_iter_value(iter);
			result.json_object_set_new_nocheck(ModernizedCProgram.key, json_t.json_deep_copy(value));
			iter = (json_t)object.json_object_iter_next(iter);
		}
		return result;
	}
	/*** array ***/
	public json_t json_array() {
		json_array_t array = ModernizedCProgram.jsonp_malloc(/*Error: Unsupported expression*/);
		if (!array) {
			return ((Object)0);
		} 
		Object generatedJson = array.getJson();
		generatedJson.json_init(.JSON_ARRAY);
		array.setEntries(0);
		array.setSize(8);
		Object generatedSize = array.getSize();
		array.setTable(ModernizedCProgram.jsonp_malloc(generatedSize * /*Error: Unsupported expression*/));
		Object generatedTable = array.getTable();
		if (!generatedTable) {
			ModernizedCProgram.jsonp_free(array);
			return ((Object)0);
		} 
		array.setVisited(0);
		return generatedJson;
	}
	public json_t json_array_get(Object json, Object index) {
		json_array_t array = new json_array_t();
		if (!((json) && ((json).getType()) == .JSON_ARRAY)) {
			return ((Object)0);
		} 
		array = ((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson())));
		Object generatedEntries = array.getEntries();
		if (index >= generatedEntries) {
			return ((Object)0);
		} 
		Object generatedTable = array.getTable();
		return generatedTable[index];
	}
	public int json_array_set_new(Object index, json_t value) {
		json_array_t array = new json_array_t();
		if (!value) {
			return -1;
		} 
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_ARRAY) || json == value) {
			value.json_decref();
			return -1;
		} 
		array = ((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson())));
		Object generatedEntries = array.getEntries();
		if (index >= generatedEntries) {
			value.json_decref();
			return -1;
		} 
		Object generatedTable = array.getTable();
		generatedTable[index].json_decref();
		generatedTable[index] = value;
		return 0;
	}
	public void array_copy(Object dpos, json_t[][] src, Object spos, Object count) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dest[dpos], src[spos], count * /*Error: Unsupported expression*/);
	}
	public json_t json_array_grow( array, Object amount, int copy) {
		size_t new_size = new size_t();
		json_t old_table = new json_t();
		json_t new_table = new json_t();
		Object generatedEntries = array.getEntries();
		Object generatedSize = array.getSize();
		Object generatedTable = array.getTable();
		if (generatedEntries + amount <= generatedSize) {
			return generatedTable;
		} 
		old_table = generatedTable;
		new_size = ((generatedSize + amount) > (generatedSize * 2) ? (generatedSize + amount) : (generatedSize * 2));
		new_table = ModernizedCProgram.jsonp_malloc(new_size * /*Error: Unsupported expression*/);
		if (!new_table) {
			return ((Object)0);
		} 
		array.setSize(new_size);
		array.setTable(new_table);
		if (copy) {
			generatedTable.array_copy(0, old_table, 0, generatedEntries);
			ModernizedCProgram.jsonp_free(old_table);
			return generatedTable;
		} 
		return old_table;
	}
	public int json_array_append_new(json_t value) {
		json_array_t array = new json_array_t();
		if (!value) {
			return -1;
		} 
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_ARRAY) || json == value) {
			value.json_decref();
			return -1;
		} 
		array = ((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson())));
		json_t json_t = new json_t();
		if (!json_t.json_array_grow(array, 1, 1)) {
			value.json_decref();
			return -1;
		} 
		Object generatedTable = array.getTable();
		Object generatedEntries = array.getEntries();
		generatedTable[generatedEntries] = value;
		generatedEntries++;
		return 0;
	}
	public int json_array_insert_new(Object index, json_t value) {
		json_array_t array = new json_array_t();
		json_t old_table = new json_t();
		if (!value) {
			return -1;
		} 
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_ARRAY) || json == value) {
			value.json_decref();
			return -1;
		} 
		array = ((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson())));
		Object generatedEntries = array.getEntries();
		if (index > generatedEntries) {
			value.json_decref();
			return -1;
		} 
		json_t json_t = new json_t();
		old_table = json_t.json_array_grow(array, 1, 0);
		if (!old_table) {
			value.json_decref();
			return -1;
		} 
		Object generatedTable = array.getTable();
		if (old_table != generatedTable) {
			generatedTable.array_copy(0, old_table, 0, index);
			generatedTable.array_copy(index + 1, old_table, index, generatedEntries - index);
			ModernizedCProgram.jsonp_free(old_table);
		} else {
				array.array_move(index + 1, index, generatedEntries - index);
		} 
		generatedTable[index] = value;
		generatedEntries++;
		return 0;
	}
	public int json_array_remove(Object index) {
		json_array_t array = new json_array_t();
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_ARRAY)) {
			return -1;
		} 
		array = ((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson())));
		Object generatedEntries = array.getEntries();
		if (index >= generatedEntries) {
			return -1;
		} 
		Object generatedTable = array.getTable();
		generatedTable[index].json_decref();
		if (index < generatedEntries - /* If we're removing the last element, nothing has to be moved */1) {
			array.array_move(index, index + 1, generatedEntries - index - 1);
		} 
		generatedEntries--;
		return 0;
	}
	public int json_array_clear() {
		json_array_t array = new json_array_t();
		size_t i = new size_t();
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_ARRAY)) {
			return -1;
		} 
		array = ((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson())));
		Object generatedEntries = array.getEntries();
		Object generatedTable = array.getTable();
		for (i = 0; i < generatedEntries; i++) {
			generatedTable[i].json_decref();
		}
		array.setEntries(0);
		return 0;
	}
	public int json_array_extend(json_t other_json) {
		json_array_t array = new json_array_t();
		json_array_t other = new json_array_t();
		size_t i = new size_t();
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_ARRAY) || !((other_json) && (generatedType) == .JSON_ARRAY)) {
			return -1;
		} 
		array = ((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson())));
		other = ((json_array_t)((byte)other_json - ((size_t)((json_array_t)0).getJson())));
		Object generatedEntries = other.getEntries();
		json_t json_t = new json_t();
		if (!json_t.json_array_grow(array, generatedEntries, 1)) {
			return -1;
		} 
		Object generatedTable = other.getTable();
		for (i = 0; i < generatedEntries; i++) {
			generatedTable[i].json_incref();
		}
		generatedTable.array_copy(generatedEntries, generatedTable, 0, generatedEntries);
		generatedEntries += generatedEntries;
		return 0;
	}
	public int json_array_equal(json_t array2) {
		size_t i = new size_t();
		size_t size = new size_t();
		size = ModernizedCProgram.json_array_size(array1);
		if (size != ModernizedCProgram.json_array_size(array2)) {
			return 0;
		} 
		json_t json_t = new json_t();
		for (i = 0; i < size; i++) {
			json_t value1 = new json_t();
			json_t value2 = new json_t();
			value1 = json_t.json_array_get(array1, i);
			value2 = json_t.json_array_get(array2, i);
			if (!value1.json_equal(value2)) {
				return 0;
			} 
		}
		return 1;
	}
	public json_t json_array_copy() {
		json_t result = new json_t();
		size_t i = new size_t();
		json_t json_t = new json_t();
		result = json_t.json_array();
		if (!result) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		for (i = 0; i < ModernizedCProgram.json_array_size(array); i++) {
			result.json_array_append(json_t.json_array_get(array, i));
		}
		return result;
	}
	public json_t json_array_deep_copy(Object array) {
		json_t result = new json_t();
		size_t i = new size_t();
		json_t json_t = new json_t();
		result = json_t.json_array();
		if (!result) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		for (i = 0; i < ModernizedCProgram.json_array_size(array); i++) {
			result.json_array_append_new(json_t.json_deep_copy(json_t.json_array_get(array, i)));
		}
		return result;
	}
	/*** string ***/
	public json_t string_create(Object value, Object len, int own) {
		byte v;
		json_string_t string = new json_string_t();
		if (!value) {
			return ((Object)0);
		} 
		if (own) {
			v = (byte)value;
		} else {
				v = ModernizedCProgram.jsonp_strndup(value, len);
				if (!v) {
					return ((Object)0);
				} 
		} 
		string = ModernizedCProgram.jsonp_malloc(/*Error: Unsupported expression*/);
		if (!string) {
			if (!own) {
				ModernizedCProgram.jsonp_free(v);
			} 
			return ((Object)0);
		} 
		Object generatedJson = string.getJson();
		generatedJson.json_init(.JSON_STRING);
		string.setValue(v);
		string.setLength(len);
		return generatedJson;
	}
	public json_t json_string_nocheck(Object value) {
		if (!value) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		return json_t.string_create(value, /*Error: Function owner not recognized*/strlen(value), 0);
	}
	public json_t json_stringn_nocheck(Object value, Object len) {
		json_t json_t = new json_t();
		return json_t.string_create(value, len, 0);
	}
	/* this is private; "steal" is not a public API concept */
	public json_t jsonp_stringn_nocheck_own(Object value, Object len) {
		json_t json_t = new json_t();
		return json_t.string_create(value, len, 1);
	}
	public json_t json_string(Object value) {
		if (!value) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		return json_t.json_stringn(value, /*Error: Function owner not recognized*/strlen(value));
	}
	public json_t json_stringn(Object value, Object len) {
		if (!value || !ModernizedCProgram.utf8_check_string(value, len)) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		return json_t.json_stringn_nocheck(value, len);
	}
	public int json_string_set_nocheck(Object value) {
		if (!value) {
			return -1;
		} 
		return json.json_string_setn_nocheck(value, /*Error: Function owner not recognized*/strlen(value));
	}
	public int json_string_setn_nocheck(Object value, Object len) {
		byte dup;
		json_string_t string = new json_string_t();
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_STRING) || !value) {
			return -1;
		} 
		dup = ModernizedCProgram.jsonp_strndup(value, len);
		if (!dup) {
			return -1;
		} 
		string = ((json_string_t)((byte)json - ((size_t)((json_string_t)0).getJson())));
		Object generatedValue = string.getValue();
		ModernizedCProgram.jsonp_free(generatedValue);
		string.setValue(dup);
		string.setLength(len);
		return 0;
	}
	public int json_string_set(Object value) {
		if (!value) {
			return -1;
		} 
		return json.json_string_setn(value, /*Error: Function owner not recognized*/strlen(value));
	}
	public int json_string_setn(Object value, Object len) {
		if (!value || !ModernizedCProgram.utf8_check_string(value, len)) {
			return -1;
		} 
		return json.json_string_setn_nocheck(value, len);
	}
	public int json_string_equal(json_t string2) {
		json_string_t s1 = new json_string_t();
		json_string_t s2 = new json_string_t();
		 generatedType = (string1).getType();
		if (!((string1) && (generatedType) == .JSON_STRING) || !((string2) && (generatedType) == .JSON_STRING)) {
			return 0;
		} 
		s1 = ((json_string_t)((byte)string1 - ((size_t)((json_string_t)0).getJson())));
		s2 = ((json_string_t)((byte)string2 - ((size_t)((json_string_t)0).getJson())));
		Object generatedLength = s1.getLength();
		Object generatedValue = s1.getValue();
		return generatedLength == generatedLength && !/*Error: Function owner not recognized*/memcmp(generatedValue, generatedValue, generatedLength);
	}
	public json_t json_string_copy(Object string) {
		json_string_t s = new json_string_t();
		if (!((string) && ((string).getType()) == .JSON_STRING)) {
			return ((Object)0);
		} 
		s = ((json_string_t)((byte)string - ((size_t)((json_string_t)0).getJson())));
		Object generatedValue = s.getValue();
		Object generatedLength = s.getLength();
		json_t json_t = new json_t();
		return json_t.json_stringn_nocheck(generatedValue, generatedLength);
	}
	/*** integer ***/
	public json_t json_integer(Object value) {
		json_integer_t integer = ModernizedCProgram.jsonp_malloc(/*Error: Unsupported expression*/);
		if (!integer) {
			return ((Object)0);
		} 
		Object generatedJson = integer.getJson();
		generatedJson.json_init(.JSON_INTEGER);
		integer.setValue(value);
		return generatedJson;
	}
	public int json_integer_set(Object value) {
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_INTEGER)) {
			return -1;
		} 
		((json_integer_t)((byte)json - ((size_t)((json_integer_t)0).getJson()))).setValue(value);
		return 0;
	}
	public int json_integer_equal(json_t integer2) {
		return ModernizedCProgram.json_integer_value(integer1) == ModernizedCProgram.json_integer_value(integer2);
	}
	public json_t json_integer_copy(Object integer) {
		json_t json_t = new json_t();
		return json_t.json_integer(ModernizedCProgram.json_integer_value(integer));
	}
	/*** real ***/
	public json_t json_real(double value) {
		json_real_t real = new json_real_t();
		if ((/*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__isnanf(value) : /*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__isnan(value) : /*Error: Function owner not recognized*/__isnanl(value)) || ((/*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__fpclassifyf(value) : /*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__fpclassify(value) : /*Error: Function owner not recognized*/__fpclassifyl(value)) == (-1024 | -1024))) {
			return ((Object)0);
		} 
		real = ModernizedCProgram.jsonp_malloc(/*Error: Unsupported expression*/);
		if (!real) {
			return ((Object)0);
		} 
		Object generatedJson = real.getJson();
		generatedJson.json_init(.JSON_REAL);
		real.setValue(value);
		return generatedJson;
	}
	public int json_real_set(double value) {
		 generatedType = (json).getType();
		if (!((json) && (generatedType) == .JSON_REAL) || (/*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__isnanf(value) : /*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__isnan(value) : /*Error: Function owner not recognized*/__isnanl(value)) || ((/*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__fpclassifyf(value) : /*Error: sizeof expression not supported yet*/ == /*Error: Unsupported expression*/ ? /*Error: Function owner not recognized*/__fpclassify(value) : /*Error: Function owner not recognized*/__fpclassifyl(value)) == (-1024 | -1024))) {
			return -1;
		} 
		((json_real_t)((byte)json - ((size_t)((json_real_t)0).getJson()))).setValue(value);
		return 0;
	}
	public int json_real_equal(json_t real2) {
		return ModernizedCProgram.json_real_value(real1) == ModernizedCProgram.json_real_value(real2);
	}
	public json_t json_real_copy(Object real) {
		json_t json_t = new json_t();
		return json_t.json_real(ModernizedCProgram.json_real_value(real));
	}
	/*** simple values ***/
	public json_t json_true() {
		json_t the_true = new json_t(.JSON_TRUE, (size_t)-1);
		return the_true;
	}
	public json_t json_false() {
		json_t the_false = new json_t(.JSON_FALSE, (size_t)-1);
		return the_false;
	}
	public json_t json_null() {
		json_t the_null = new json_t(.JSON_NULL, (size_t)-1);
		return the_null;
	}
	/*** deletion ***/
	public void json_delete() {
		if (!json) {
			return /*Error: Unsupported expression*/;
		} 
		 generatedType = (json).getType();
		switch ((generatedType)) {
		case .JSON_OBJECT:
				((json_object_t)((byte)json - ((size_t)((json_object_t)0).getJson()))).json_delete_object();
				break;
		case .JSON_REAL:
				((json_real_t)((byte)json - ((size_t)((json_real_t)0).getJson()))).json_delete_real();
				break;
		case .JSON_INTEGER:
				((json_integer_t)((byte)json - ((size_t)((json_integer_t)0).getJson()))).json_delete_integer();
				break;
		case .JSON_STRING:
				((json_string_t)((byte)json - ((size_t)((json_string_t)0).getJson()))).json_delete_string();
				break;
		case .JSON_ARRAY:
				((json_array_t)((byte)json - ((size_t)((json_array_t)0).getJson()))).json_delete_array();
				break;
		default:
				return /*Error: Unsupported expression*/;
		}
	}
	/*** equality ***/
	public int json_equal(json_t json2) {
		if (!json1 || !json2) {
			return 0;
		} 
		 generatedType = (json1).getType();
		if ((generatedType) != (generatedType)) {
			return 0;
		} 
		if (json1 == /* this covers true, false and null as they are singletons */json2) {
			return 1;
		} 
		switch ((generatedType)) {
		case .JSON_REAL:
				return json1.json_real_equal(json2);
		case .JSON_STRING:
				return json1.json_string_equal(json2);
		case .JSON_OBJECT:
				return json1.json_object_equal(json2);
		case .JSON_ARRAY:
				return json1.json_array_equal(json2);
		case .JSON_INTEGER:
				return json1.json_integer_equal(json2);
		default:
				return 0;
		}
	}
	/*** copying ***/
	public json_t json_copy() {
		if (!json) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		 generatedType = (json).getType();
		switch ((generatedType)) {
		case .JSON_STRING:
				return json_t.json_string_copy(json);
		case .JSON_FALSE:
		case .JSON_NULL:
				return json;
		case .JSON_OBJECT:
				return json.json_object_copy();
		case .JSON_ARRAY:
				return json.json_array_copy();
		case .JSON_INTEGER:
				return json_t.json_integer_copy(json);
		case .JSON_TRUE:
		case .JSON_REAL:
				return json_t.json_real_copy(json);
		default:
				return ((Object)0);
		}
		return ((Object)0);
	}
	public json_t json_deep_copy(Object json) {
		if (!json) {
			return ((Object)0);
		} 
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		json_t json_t = new json_t();
		switch (((json).getType())) {
		case .JSON_TRUE:
		case .JSON_OBJECT:
				return json_t.json_object_deep_copy(json);
		case .JSON_ARRAY:
				return json_t.json_array_deep_copy(json/* for the rest of the types, deep copying doesn't differ from
				               shallow copying */);
		case .JSON_REAL:
				return json_t.json_real_copy(json);
		case .JSON_FALSE:
		case .JSON_STRING:
				return json_t.json_string_copy(json);
		case .JSON_NULL:
				return (json_t)json;
		case .JSON_INTEGER:
				return json_t.json_integer_copy(json);
		default:
				return ((Object)0);
		}
		return ((Object)0);
	}
	public void hashtable_iter_set(Object iter) {
		pair_t pair = ((pair_t)((byte)(list_t)iter - ((size_t)((pair_t)0).getOrdered_list())));
		json_t generatedValue = pair.getValue();
		generatedValue.json_decref();
		pair.setValue(value);
	}
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
	public Object getRefcount() {
		return refcount;
	}
	public void setRefcount(Object newRefcount) {
		refcount = newRefcount;
	}
}
