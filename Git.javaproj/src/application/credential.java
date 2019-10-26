package application;

/*
 * This credential struct and API is simplified from git's credential.{h,c}
 */
public class credential {
	private Byte protocol;
	private Byte host;
	private int port;
	private Byte path;
	private Byte username;
	private Byte password;
	
	public credential(Byte protocol, Byte host, int port, Byte path, Byte username, Byte password) {
		setProtocol(protocol);
		setHost(host);
		setPort(port);
		setPath(path);
		setUsername(username);
		setPassword(password);
	}
	public credential() {
	}
	
	/* ----------------- GNOME Keyring functions ----------------- */
	/* create a special keyring option string, if path is given */
	public Byte keyring_object() {
		Byte generatedPath = this.getPath();
		if (!generatedPath) {
			return ((Object)0);
		} 
		int generatedPort = this.getPort();
		Byte generatedHost = this.getHost();
		if (generatedPort) {
			return .g_strdup_printf("%s:%hd/%s", generatedHost, generatedPort, generatedPath);
		} 
		return .g_strdup_printf("%s/%s", generatedHost, generatedPath);
	}
	public int keyring_get() {
		byte object = ((Object)0);
		 entries = new ();
		 password_data = new ();
		 result = new ();
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		if (!generatedProtocol || !(generatedHost || generatedPath)) {
			return 1;
		} 
		object = c.keyring_object();
		Byte generatedUsername = this.getUsername();
		int generatedPort = this.getPort();
		result = .gnome_keyring_find_network_password_sync(generatedUsername, ((Object)/* domain */0), generatedHost, object, generatedProtocol, ((Object)/* authtype */0), generatedPort, entries);
		.g_free(object);
		if (result == GNOME_KEYRING_RESULT_DENIED) {
			return 0;
		} 
		if (result == GNOME_KEYRING_RESULT_CANCELLED) {
			return 0;
		} 
		if (result != GNOME_KEYRING_RESULT_OK) {
			.g_critical("%s", ModernizedCProgram.gnome_keyring_result_to_message(result));
			return 1;
		} 
		password_data = ()entries.getData();
		Byte generatedPassword = this.getPassword();
		.gnome_keyring_free_password(generatedPassword);
		this.setPassword(.g_strdup(generatedPassword));
		if (!generatedUsername) {
			this.setUsername(.g_strdup(password_data.getUser()));
		} 
		.gnome_keyring_network_password_list_free(entries);
		return 0;
		 service = ((Object)0);
		 attributes = ((Object)0);
		 error = ((Object)0);
		 items = ((Object)0);
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		if (!generatedProtocol || !(generatedHost || generatedPath)) {
			return 1;
		} 
		service = .secret_service_get_sync(0, ((Object)0), error);
		if (error != ((Object)0)) {
			.g_critical("could not connect to Secret Service: %s", error.getMessage());
			.g_error_free(error);
			return 1;
		} 
		attributes = c.make_attr_list();
		items = .secret_service_search_sync(service, SECRET_SCHEMA_COMPAT_NETWORK, attributes, SECRET_SEARCH_LOAD_SECRETS | SECRET_SEARCH_UNLOCK, ((Object)0), error);
		.g_hash_table_unref(attributes);
		if (error != ((Object)0)) {
			.g_critical("lookup failed: %s", error.getMessage());
			.g_error_free(error);
			return 1;
		} 
		Byte generatedUsername = this.getUsername();
		Byte generatedPassword = this.getPassword();
		if (items != ((Object)0)) {
			 item = new ();
			 secret = new ();
			byte s;
			item = items.getData();
			secret = .secret_item_get_secret(item);
			attributes = .secret_item_get_attributes(item);
			s = .g_hash_table_lookup(attributes, "user");
			if (s) {
				.g_free(generatedUsername);
				this.setUsername(.g_strdup(s));
			} 
			s = .secret_value_get_text(secret);
			if (s) {
				.g_free(generatedPassword);
				this.setPassword(.g_strdup(s));
			} 
			.g_hash_table_unref(attributes);
			.secret_value_unref(secret);
			.g_list_free_full(items, g_object_unref);
		} 
		return 0;
	}
	public int keyring_store() {
		 item_id = new ();
		byte object = ((Object)0);
		 result = new ();
		/*
			 * Sanity check that what we are storing is actually sensible.
			 * In particular, we can't make a URL without a protocol field.
			 * Without either a host or pathname (depending on the scheme),
			 * we have no primary key. And without a username and password,
			 * we are not actually storing a credential.
			 */
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		Byte generatedUsername = this.getUsername();
		Byte generatedPassword = this.getPassword();
		if (!generatedProtocol || !(generatedHost || generatedPath) || !generatedUsername || !generatedPassword) {
			return 1;
		} 
		object = c.keyring_object();
		int generatedPort = this.getPort();
		result = .gnome_keyring_set_network_password_sync(((Object)0), generatedUsername, ((Object)/* domain */0), generatedHost, object, generatedProtocol, ((Object)/* authtype */0), generatedPort, generatedPassword, item_id);
		.g_free(object);
		if (result != GNOME_KEYRING_RESULT_OK && result != GNOME_KEYRING_RESULT_CANCELLED) {
			.g_critical("%s", ModernizedCProgram.gnome_keyring_result_to_message(result));
			return 1;
		} 
		return 0;
		byte label = ((Object)0);
		 attributes = ((Object)0);
		 error = ((Object)0/*
			 * Sanity check that what we are storing is actually sensible.
			 * In particular, we can't make a URL without a protocol field.
			 * Without either a host or pathname (depending on the scheme),
			 * we have no primary key. And without a username and password,
			 * we are not actually storing a credential.
			 */);
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		Byte generatedUsername = this.getUsername();
		Byte generatedPassword = this.getPassword();
		if (!generatedProtocol || !(generatedHost || generatedPath) || !generatedUsername || !generatedPassword) {
			return 1;
		} 
		label = c.make_label();
		attributes = c.make_attr_list();
		.secret_password_storev_sync(SECRET_SCHEMA_COMPAT_NETWORK, attributes, ((Object)0), label, generatedPassword, ((Object)0), error);
		.g_free(label);
		.g_hash_table_unref(attributes);
		if (error != ((Object)0)) {
			.g_critical("store failed: %s", error.getMessage());
			.g_error_free(error);
			return 1;
		} 
		return 0;
	}
	public int keyring_erase() {
		byte object = ((Object)0);
		 entries = new ();
		 password_data = new ();
		 result = new ();
		/*
			 * Sanity check that we actually have something to match
			 * against. The input we get is a restrictive pattern,
			 * so technically a blank credential means "erase everything".
			 * But it is too easy to accidentally send this, since it is equivalent
			 * to empty input. So explicitly disallow it, and require that the
			 * pattern have some actual content to match.
			 */
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		Byte generatedUsername = this.getUsername();
		if (!generatedProtocol && !generatedHost && !generatedPath && !generatedUsername) {
			return 1;
		} 
		object = c.keyring_object();
		int generatedPort = this.getPort();
		result = .gnome_keyring_find_network_password_sync(generatedUsername, ((Object)/* domain */0), generatedHost, object, generatedProtocol, ((Object)/* authtype */0), generatedPort, entries);
		.g_free(object);
		if (result == GNOME_KEYRING_RESULT_DENIED) {
			return 0;
		} 
		if (result == GNOME_KEYRING_RESULT_CANCELLED) {
			return 0;
		} 
		if (result != GNOME_KEYRING_RESULT_OK) {
			.g_critical("%s", ModernizedCProgram.gnome_keyring_result_to_message(result));
			return 1;
		} 
		password_data = ()entries.getData();
		result = .gnome_keyring_item_delete_sync(password_data.getKeyring(), password_data.getItem_id());
		.gnome_keyring_network_password_list_free(entries);
		if (result != GNOME_KEYRING_RESULT_OK) {
			.g_critical("%s", ModernizedCProgram.gnome_keyring_result_to_message(result));
			return 1;
		} 
		return 0/*
		 * Table with helper operation callbacks, used by generic
		 * credential helper main function.
		 */;
		 attributes = ((Object)0);
		 error = ((Object)0/*
			 * Sanity check that we actually have something to match
			 * against. The input we get is a restrictive pattern,
			 * so technically a blank credential means "erase everything".
			 * But it is too easy to accidentally send this, since it is equivalent
			 * to empty input. So explicitly disallow it, and require that the
			 * pattern have some actual content to match.
			 */);
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		Byte generatedUsername = this.getUsername();
		if (!generatedProtocol && !generatedHost && !generatedPath && !generatedUsername) {
			return 1;
		} 
		attributes = c.make_attr_list();
		.secret_password_clearv_sync(SECRET_SCHEMA_COMPAT_NETWORK, attributes, ((Object)0), error);
		.g_hash_table_unref(attributes);
		if (error != ((Object)0)) {
			.g_critical("erase failed: %s", error.getMessage());
			.g_error_free(error);
			return 1;
		} 
		return 0/*
		 * Table with helper operation callbacks, used by generic
		 * credential helper main function.
		 */;
	}
	/* ------------------ credential functions ------------------ */
	public void credential_init() {
		.memset(c, 0, );
		.memset(c, 0, );
	}
	public void credential_clear() {
		Byte generatedProtocol = this.getProtocol();
		.g_free(generatedProtocol);
		Byte generatedHost = this.getHost();
		.g_free(generatedHost);
		Byte generatedPath = this.getPath();
		.g_free(generatedPath);
		Byte generatedUsername = this.getUsername();
		.g_free(generatedUsername);
		Byte generatedPassword = this.getPassword();
		.gnome_keyring_free_password(generatedPassword);
		c.credential_init();
		Byte generatedProtocol = this.getProtocol();
		.g_free(generatedProtocol);
		Byte generatedHost = this.getHost();
		.g_free(generatedHost);
		Byte generatedPath = this.getPath();
		.g_free(generatedPath);
		Byte generatedUsername = this.getUsername();
		.g_free(generatedUsername);
		Byte generatedPassword = this.getPassword();
		.g_free(generatedPassword);
		c.credential_init();
	}
	public int credential_read() {
		byte buf;
		size_t line_len = new size_t();
		byte key;
		byte value;
		key = buf = .g_malloc(1024);
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		Byte generatedUsername = this.getUsername();
		Byte generatedPassword = this.getPassword();
		while (.fgets(buf, 1024, (_iob[0]))) {
			line_len = .strlen(buf);
			if (line_len && buf[line_len - 1] == (byte)'\n') {
				buf[--line_len] = (byte)'\0';
			} 
			if (!line_len) {
				break;
			} 
			value = .strchr(buf, (byte)'=');
			if (!value) {
				.g_warning("invalid credential line: %s", key);
				.gnome_keyring_free_password(buf);
				return -1;
			} 
			value++ = (byte)'\0';
			if (!.strcmp(key, "protocol")) {
				.g_free(generatedProtocol);
				this.setProtocol(.g_strdup(value));
			}  else if (!.strcmp(key, "host")) {
				.g_free(generatedHost);
				this.setHost(.g_strdup(value));
				value = .strrchr(generatedHost, (byte)':');
				if (value) {
					value++ = (byte)'\0';
					this.setPort(.atoi(value));
				} 
			}  else if (!.strcmp(key, "path")) {
				.g_free(generatedPath);
				this.setPath(.g_strdup(value));
			}  else if (!.strcmp(key, "username")) {
				.g_free(generatedUsername);
				this.setUsername(.g_strdup(value));
			}  else if (!.strcmp(key, "password")) {
				.gnome_keyring_free_password(generatedPassword);
				this.setPassword(.g_strdup(value));
				while (value) {
					value++ = (byte)'\0'/*
							 * Ignore other lines; we don't know what they mean, but
							 * this future-proofs us when later versions of git do
							 * learn new lines, and the helpers are updated to match.
							 */;
				}
			} 
		}
		.gnome_keyring_free_password(buf);
		return 0;
		byte buf;
		size_t line_len = new size_t();
		byte key;
		byte value;
		key = buf = .g_malloc(1024);
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		Byte generatedUsername = this.getUsername();
		Byte generatedPassword = this.getPassword();
		while (.fgets(buf, 1024, (_iob[0]))) {
			line_len = .strlen(buf);
			if (line_len && buf[line_len - 1] == (byte)'\n') {
				buf[--line_len] = (byte)'\0';
			} 
			if (!line_len) {
				break;
			} 
			value = .strchr(buf, (byte)'=');
			if (!value) {
				.g_warning("invalid credential line: %s", key);
				.g_free(buf);
				return -1;
			} 
			value++ = (byte)'\0';
			if (!.strcmp(key, "protocol")) {
				.g_free(generatedProtocol);
				this.setProtocol(.g_strdup(value));
			}  else if (!.strcmp(key, "host")) {
				.g_free(generatedHost);
				this.setHost(.g_strdup(value));
				value = .strrchr(generatedHost, (byte)':');
				if (value) {
					value++ = (byte)'\0';
					this.setPort(.atoi(value));
				} 
			}  else if (!.strcmp(key, "path")) {
				.g_free(generatedPath);
				this.setPath(.g_strdup(value));
			}  else if (!.strcmp(key, "username")) {
				.g_free(generatedUsername);
				this.setUsername(.g_strdup(value));
			}  else if (!.strcmp(key, "password")) {
				.g_free(generatedPassword);
				this.setPassword(.g_strdup(value));
				while (value) {
					value++ = (byte)'\0'/*
							 * Ignore other lines; we don't know what they mean, but
							 * this future-proofs us when later versions of git do
							 * learn new lines, and the helpers are updated to match.
							 */;
				}
			} 
		}
		.g_free(buf);
		return 0;
	}
	public void cache_credential(int timeout) {
		credential_cache_entry e = new credential_cache_entry();
		do {
			if ((ModernizedCProgram.entries_nr + 1) > ModernizedCProgram.entries_alloc) {
				if ((((ModernizedCProgram.entries_alloc) + 16) * 3 / 2) < (ModernizedCProgram.entries_nr + 1)) {
					ModernizedCProgram.entries_alloc = (ModernizedCProgram.entries_nr + 1);
				} else {
						ModernizedCProgram.entries_alloc = (((ModernizedCProgram.entries_alloc) + 16) * 3 / 2);
				} 
				(ModernizedCProgram.entries) = ModernizedCProgram.xrealloc((ModernizedCProgram.entries), ModernizedCProgram.st_mult(, (ModernizedCProgram.entries_alloc)));
			} 
		} while (0);
		e = ModernizedCProgram.entries[ModernizedCProgram.entries_nr++];
		credential generatedItem = e.getItem();
		.memcpy(generatedItem, c, );
		.memset(c, 0, );
		e.setExpiration(.time(((Object)0)) + timeout);
	}
	public int parse_credential_file(Object fn, Object match_cb, Object other_cb) {
		FILE fh = new FILE();
		strbuf line = new strbuf(, , );
		credential entry = new credential(new credential(((Object)0), 0, 0, 1, ((Object)0)));
		int found_credential = 0;
		fh = .fopen(fn, "r");
		if (!fh) {
			if ((._errno()) != 2 && (._errno()) != 13) {
				ModernizedCProgram.die_errno("unable to open %s", fn);
			} 
			return found_credential;
		} 
		byte generatedBuf = line.getBuf();
		Byte generatedUsername = entry.getUsername();
		Byte generatedPassword = entry.getPassword();
		while (ModernizedCProgram.strbuf_getline_lf(line, fh) != (true)) {
			.credential_from_url(entry, generatedBuf);
			if (generatedUsername && generatedPassword && .credential_match(c, entry)) {
				found_credential = 1;
				if (match_cb) {
					.match_cb(entry);
					break;
				} 
			}  else if (other_cb) {
				.other_cb(line);
			} 
		}
		entry.credential_clear();
		line.strbuf_release();
		.fclose(fh);
		return found_credential;
	}
	public void print_entry() {
		Byte generatedUsername = this.getUsername();
		.printf("username=%s\n", generatedUsername);
		Byte generatedPassword = this.getPassword();
		.printf("password=%s\n", generatedPassword);
	}
	public void store_credential_file(Object fn) {
		strbuf buf = new strbuf(, , );
		Byte generatedProtocol = this.getProtocol();
		buf.strbuf_addf("%s://", generatedProtocol);
		Byte generatedUsername = this.getUsername();
		buf.strbuf_addstr_urlencode(generatedUsername, ModernizedCProgram.is_rfc3986_unreserved);
		buf.strbuf_addch((byte)':');
		Byte generatedPassword = this.getPassword();
		buf.strbuf_addstr_urlencode(generatedPassword, ModernizedCProgram.is_rfc3986_unreserved);
		buf.strbuf_addch((byte)'@');
		Byte generatedHost = this.getHost();
		if (generatedHost) {
			buf.strbuf_addstr_urlencode(generatedHost, ModernizedCProgram.is_rfc3986_unreserved);
		} 
		Byte generatedPath = this.getPath();
		if (generatedPath) {
			buf.strbuf_addch((byte)'/');
			buf.strbuf_addstr_urlencode(generatedPath, ModernizedCProgram.is_rfc3986_reserved_or_unreserved);
		} 
		ModernizedCProgram.rewrite_credential_file(fn, c, buf);
		buf.strbuf_release();
	}
	/* ----------------- Secret Service functions ----------------- */
	public Byte make_label() {
		int generatedPort = this.getPort();
		Byte generatedProtocol = this.getProtocol();
		Byte generatedHost = this.getHost();
		Byte generatedPath = this.getPath();
		if (generatedPort) {
			return .g_strdup_printf("Git: %s://%s:%hu/%s", generatedProtocol, generatedHost, generatedPort, generatedPath ? generatedPath : "");
		} else {
				return .g_strdup_printf("Git: %s://%s/%s", generatedProtocol, generatedHost, generatedPath ? generatedPath : "");
		} 
	}
	public Object make_attr_list() {
		 al = .g_hash_table_new_full(g_str_hash, g_str_equal, ((Object)0), g_free);
		Byte generatedUsername = this.getUsername();
		if (generatedUsername) {
			.g_hash_table_insert(al, "user", .g_strdup(generatedUsername));
		} 
		Byte generatedProtocol = this.getProtocol();
		if (generatedProtocol) {
			.g_hash_table_insert(al, "protocol", .g_strdup(generatedProtocol));
		} 
		Byte generatedHost = this.getHost();
		if (generatedHost) {
			.g_hash_table_insert(al, "server", .g_strdup(generatedHost));
		} 
		int generatedPort = this.getPort();
		if (generatedPort) {
			.g_hash_table_insert(al, "port", .g_strdup_printf("%hu", generatedPort));
		} 
		Byte generatedPath = this.getPath();
		if (generatedPath) {
			.g_hash_table_insert(al, "object", .g_strdup(generatedPath));
		} 
		return al;
	}
	public Byte getProtocol() {
		return protocol;
	}
	public void setProtocol(Byte newProtocol) {
		protocol = newProtocol;
	}
	public Byte getHost() {
		return host;
	}
	public void setHost(Byte newHost) {
		host = newHost;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Byte getUsername() {
		return username;
	}
	public void setUsername(Byte newUsername) {
		username = newUsername;
	}
	public Byte getPassword() {
		return password;
	}
	public void setPassword(Byte newPassword) {
		password = newPassword;
	}
}
