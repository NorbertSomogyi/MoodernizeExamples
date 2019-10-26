package application;

/*
 * JSON data structures are defined at:
 * [1] http://www.ietf.org/rfc/rfc7159.txt
 * [2] http://json.org/
 *
 * The JSON-writer API allows one to build JSON data structures using a
 * simple wrapper around a "struct strbuf" buffer.  It is intended as a
 * simple API to build output strings; it is not intended to be a general
 * object model for JSON data.  In particular, it does not re-order keys
 * in an object (dictionary), it does not de-dup keys in an object, and
 * it does not allow lookup or parsing of JSON data.
 *
 * All string values (both keys and string r-values) are properly quoted
 * and escaped if they contain special characters.
 *
 * These routines create compact JSON data (with no unnecessary whitespace,
 * newlines, or indenting).  If you get an unexpected response, verify
 * that you're not expecting a pretty JSON string.
 *
 * Both "JSON objects" (aka sets of k/v pairs) and "JSON array" can be
 * constructed using a 'begin append* end' model.
 *
 * Nested objects and arrays can either be constructed bottom up (by
 * creating sub object/arrays first and appending them to the super
 * object/array) -or- by building them inline in one pass.  This is a
 * personal style and/or data shape choice.
 *
 * See t/helper/test-json-writer.c for various usage examples.
 *
 * LIMITATIONS:
 * ============
 *
 * The JSON specification [1,2] defines string values as Unicode data
 * and probably UTF-8 encoded.  The current json-writer API does not
 * enforce this and will write any string as received.  However, it will
 * properly quote and backslash-escape them as necessary.  It is up to
 * the caller to UTF-8 encode their strings *before* passing them to this
 * API.  This layer should not have to try to guess the encoding or locale
 * of the given strings.
 */
public class json_writer {
	private strbuf json;
	private strbuf open_stack;
	private int need_comma;
	private int pretty;
	
	public json_writer(strbuf json, strbuf open_stack, int need_comma, int pretty) {
		setJson(json);
		setOpen_stack(open_stack);
		setNeed_comma(need_comma);
		setPretty(pretty);
	}
	public json_writer() {
	}
	
	public void event_fmt_prepare(Object event_name, Object file, int line, Object repo) {
		tr2tls_thread_ctx tr2tls_thread_ctx = new tr2tls_thread_ctx();
		tr2tls_thread_ctx ctx = tr2tls_thread_ctx.tr2tls_get_self();
		tr2_tbuf tb_now = new tr2_tbuf();
		jw.jw_object_string("event", event_name);
		jw.jw_object_string("sid", ModernizedCProgram.tr2_sid_get());
		Object generatedTr2tls_thread_ctx = ctx.getTr2tls_thread_ctx();
		jw.jw_object_string("thread", generatedTr2tls_thread_ctx.getBuf());
		Object generatedTr2_tbuf = tb_now.getTr2_tbuf();
		if (!ModernizedCProgram.tr2env_event_be_brief || !.strcmp(event_name, "version") || !.strcmp(event_name, "atexit")) {
			tb_now.tr2_tbuf_utc_datetime_extended();
			jw.jw_object_string("time", generatedTr2_tbuf);
		} 
		if (!ModernizedCProgram.tr2env_event_be_brief && file && file) {
			jw.jw_object_string("file", file);
			jw.jw_object_intmax("line", line);
		} 
		if (repo) {
			jw.jw_object_intmax("repo", repo.getTrace2_repo_id());
		} 
	}
	public void maybe_add_string_va(Object field_name, Object fmt, Object ap) {
		if (fmt && fmt) {
			va_list copy_ap = new va_list();
			strbuf buf = new strbuf(, , );
			.__builtin_va_copy(copy_ap, ap);
			ModernizedCProgram.buf.strbuf_vaddf(fmt, copy_ap);
			.__builtin_va_end(copy_ap);
			jw.jw_object_string(field_name, ModernizedCProgram.buf.getBuf());
			ModernizedCProgram.buf.strbuf_release();
			return ;
		} 
	}
	public void get_processes(Object hSnapshot) {
		PROCESSENTRY32 pe32 = new PROCESSENTRY32();
		DWORD pid = new DWORD();
		DWORD[] pid_list = new DWORD();
		int k;
		int nr_pids = 0;
		pid = .GetCurrentProcessId();
		Object generatedSzExeFile = pe32.getSzExeFile();
		Object generatedTh32ParentProcessID = pe32.getTh32ParentProcessID();
		while (pe32.find_pid(pid, hSnapshot)) {
			if (/* Only report parents. Omit self from the JSON output. */nr_pids) {
				jw.jw_array_string(generatedSzExeFile);
			} 
			for (k = 0; k < nr_pids; /* Check for cycle in snapshot. (Yes, it happened.) */k++) {
				if (pid == pid_list[k]) {
					jw.jw_array_string("(cycle)");
					return ;
				} 
			}
			if (nr_pids == 10) {
				jw.jw_array_string("(truncated)");
				return ;
			} 
			pid_list[nr_pids++] = pid;
			pid = generatedTh32ParentProcessID;
		}
	}
	public void jw_init() {
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_init(0);
		strbuf generatedOpen_stack = this.getOpen_stack();
		generatedOpen_stack.strbuf_init(0);
		this.setNeed_comma(0);
		this.setPretty(0);
	}
	public void jw_release() {
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_release();
		strbuf generatedOpen_stack = this.getOpen_stack();
		generatedOpen_stack.strbuf_release();
	}
	public void indent_pretty() {
		int k;
		strbuf generatedOpen_stack = this.getOpen_stack();
		Object generatedLen = generatedOpen_stack.getLen();
		strbuf generatedJson = this.getJson();
		for (k = 0; k < generatedLen; k++) {
			generatedJson.strbuf_addstr("  "/*
			 * Begin an object or array (either top-level or nested within the currently
			 * open object or array).
			 */);
		}
	}
	public void begin(byte ch_open, int pretty) {
		this.setPretty(pretty);
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_addch(ch_open);
		strbuf generatedOpen_stack = this.getOpen_stack();
		generatedOpen_stack.strbuf_addch(ch_open);
		this.setNeed_comma(0/*
		 * Assert that the top of the open-stack is an object.
		 */);
	}
	public void maybe_add_comma() {
		int generatedNeed_comma = this.getNeed_comma();
		strbuf generatedJson = this.getJson();
		if (generatedNeed_comma) {
			generatedJson.strbuf_addch((byte)',');
		} else {
				this.setNeed_comma(1);
		} 
	}
	public void fmt_double(int precision, double value) {
		strbuf generatedJson = this.getJson();
		byte generatedBuf = fmt.getBuf();
		if (precision < 0) {
			generatedJson.strbuf_addf("%f", value);
		} else {
				strbuf fmt = new strbuf(, , );
				fmt.strbuf_addf("%%.%df", precision);
				generatedJson.strbuf_addf(generatedBuf, value);
				fmt.strbuf_release();
		} 
	}
	public void object_common(Object key) {
		ModernizedCProgram.assert_in_object(jw, key);
		jw.maybe_add_comma();
		int generatedPretty = this.getPretty();
		strbuf generatedJson = this.getJson();
		if (generatedPretty) {
			generatedJson.strbuf_addch((byte)'\n');
			jw.indent_pretty();
		} 
		generatedJson.append_quoted_string(key);
		generatedJson.strbuf_addch((byte)':');
		if (generatedPretty) {
			generatedJson.strbuf_addch((byte)' ');
		} 
	}
	public void array_common() {
		ModernizedCProgram.assert_in_array(jw);
		jw.maybe_add_comma();
		int generatedPretty = this.getPretty();
		strbuf generatedJson = this.getJson();
		if (generatedPretty) {
			generatedJson.strbuf_addch((byte)'\n');
			jw/*
			 * Assert that the given JSON object or JSON array has been properly
			 * terminated.  (Has closing bracket.)
			 */.indent_pretty();
		} 
	}
	public void jw_object_begin(int pretty) {
		jw.begin((byte)'{', pretty);
	}
	public void jw_object_string(Object key, Object value) {
		jw.object_common(key);
		strbuf generatedJson = this.getJson();
		generatedJson.append_quoted_string(value);
	}
	public void jw_object_intmax(Object key, Object value) {
		jw.object_common(key);
	}
	public void jw_object_double(Object key, int precision, double value) {
		jw.object_common(key);
		jw.fmt_double(precision, value);
	}
	public void jw_object_true(Object key) {
		jw.object_common(key);
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_addstr("true");
	}
	public void jw_object_false(Object key) {
		jw.object_common(key);
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_addstr("false");
	}
	public void jw_object_bool(Object key, int value) {
		if (value) {
			jw.jw_object_true(key);
		} else {
				jw.jw_object_false(key);
		} 
	}
	public void jw_object_null(Object key) {
		jw.object_common(key);
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_addstr("null");
	}
	public void append_sub_jw(Object value) {
		int generatedPretty = this.getPretty();
		strbuf generatedOpen_stack = this.getOpen_stack();
		Object generatedLen = generatedOpen_stack.getLen();
		strbuf generatedJson = this.getJson();
		if (generatedPretty && generatedLen && generatedPretty) {
			strbuf sb = new strbuf(, , );
			sb.increase_indent(value, generatedLen * 2);
			generatedJson.strbuf_addbuf(sb);
			sb.strbuf_release();
			return ;
		} 
		if (!generatedPretty && generatedPretty) {
			strbuf sb = new strbuf(, , );
			sb.kill_indent(value);
			generatedJson.strbuf_addbuf(sb);
			sb.strbuf_release();
			return ;
		} 
		generatedJson.strbuf_addbuf(generatedJson);
	}
	public void jw_object_sub_jw(Object key, Object value) {
		ModernizedCProgram.assert_is_terminated(value);
		jw.object_common(key);
		jw.append_sub_jw(value);
	}
	public void jw_object_inline_begin_object(Object key) {
		jw.object_common(key);
		int generatedPretty = this.getPretty();
		jw.jw_object_begin(generatedPretty);
	}
	public void jw_object_inline_begin_array(Object key) {
		jw.object_common(key);
		int generatedPretty = this.getPretty();
		jw.jw_array_begin(generatedPretty);
	}
	public void jw_array_begin(int pretty) {
		jw.begin((byte)'[', pretty);
	}
	public void jw_array_string(Object value) {
		jw.array_common();
		strbuf generatedJson = this.getJson();
		generatedJson.append_quoted_string(value);
	}
	public void jw_array_intmax(Object value) {
		jw.array_common();
	}
	public void jw_array_double(int precision, double value) {
		jw.array_common();
		jw.fmt_double(precision, value);
	}
	public void jw_array_true() {
		jw.array_common();
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_addstr("true");
	}
	public void jw_array_false() {
		jw.array_common();
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_addstr("false");
	}
	public void jw_array_bool(int value) {
		if (value) {
			jw.jw_array_true();
		} else {
				jw.jw_array_false();
		} 
	}
	public void jw_array_null() {
		jw.array_common();
		strbuf generatedJson = this.getJson();
		generatedJson.strbuf_addstr("null");
	}
	public void jw_array_sub_jw(Object value) {
		ModernizedCProgram.assert_is_terminated(value);
		jw.array_common();
		jw.append_sub_jw(value);
	}
	public void jw_array_argc_argv(int argc, Object argv) {
		int k;
		for (k = 0; k < argc; k++) {
			jw.jw_array_string(argv[k]);
		}
	}
	public void jw_array_argv(Object argv) {
		while (argv) {
			jw.jw_array_string(argv++);
		}
	}
	public void jw_array_inline_begin_object() {
		jw.array_common();
		int generatedPretty = this.getPretty();
		jw.jw_object_begin(generatedPretty);
	}
	public void jw_array_inline_begin_array() {
		jw.array_common();
		int generatedPretty = this.getPretty();
		jw.jw_array_begin(generatedPretty);
	}
	public void jw_end() {
		byte ch_open;
		int len;
		strbuf generatedOpen_stack = this.getOpen_stack();
		Object generatedLen = generatedOpen_stack.getLen();
		strbuf generatedJson = this.getJson();
		byte generatedBuf = generatedJson.getBuf();
		if (!generatedLen) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\json-writer.c", 397, "json-writer: too many jw_end(): '%s'", generatedBuf);
		} 
		len = generatedLen - 1;
		ch_open = generatedBuf[len];
		generatedOpen_stack.strbuf_setlen(len);
		this.setNeed_comma(1);
		int generatedPretty = this.getPretty();
		if (generatedPretty) {
			generatedJson.strbuf_addch((byte)'\n');
			jw.indent_pretty();
		} 
		if (ch_open == (byte)'{') {
			generatedJson.strbuf_addch((byte)'}');
		} else {
				generatedJson.strbuf_addch((byte)']');
		} 
	}
	public strbuf getJson() {
		return json;
	}
	public void setJson(strbuf newJson) {
		json = newJson;
	}
	public strbuf getOpen_stack() {
		return open_stack;
	}
	public void setOpen_stack(strbuf newOpen_stack) {
		open_stack = newOpen_stack;
	}
	public int getNeed_comma() {
		return need_comma;
	}
	public void setNeed_comma(int newNeed_comma) {
		need_comma = newNeed_comma;
	}
	public int getPretty() {
		return pretty;
	}
	public void setPretty(int newPretty) {
		pretty = newPretty;
	}
}
/*
	 * Buffer of the in-progress JSON currently being composed.
	 */
