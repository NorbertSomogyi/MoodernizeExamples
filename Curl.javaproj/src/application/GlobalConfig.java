package application;

public class GlobalConfig {
	private int showerror;
	private  mute;
	private  noprogress;
	private  isatty;
	private _iobuf errors;
	private  errors_fopened;
	private Byte trace_dump;
	private _iobuf trace_stream;
	private  trace_fopened;
	private  tracetype;
	private  tracetime;
	private int progressmode;
	private Byte libcurl;
	private  fail_early;
	private  styled_output;
	private  parallel;
	private long parallel_max;
	private OperationConfig first;
	private OperationConfig current;
	private OperationConfig last;
	
	public GlobalConfig(int showerror,  mute,  noprogress,  isatty, _iobuf errors,  errors_fopened, Byte trace_dump, _iobuf trace_stream,  trace_fopened,  tracetype,  tracetime, int progressmode, Byte libcurl,  fail_early,  styled_output,  parallel, long parallel_max, OperationConfig first, OperationConfig current, OperationConfig last) {
		setShowerror(showerror);
		setMute(mute);
		setNoprogress(noprogress);
		setIsatty(isatty);
		setErrors(errors);
		setErrors_fopened(errors_fopened);
		setTrace_dump(trace_dump);
		setTrace_stream(trace_stream);
		setTrace_fopened(trace_fopened);
		setTracetype(tracetype);
		setTracetime(tracetime);
		setProgressmode(progressmode);
		setLibcurl(libcurl);
		setFail_early(fail_early);
		setStyled_output(styled_output);
		setParallel(parallel);
		setParallel_max(parallel_max);
		setFirst(first);
		setCurrent(current);
		setLast(last);
	}
	public GlobalConfig() {
	}
	
	public  GetSizeParameter(Object arg, Object which, Object value_out) {
		byte unit;
		 value = new ();
		if (ModernizedCProgram.curlx_strtoofft(arg, unit, 0, value)) {
			global.warnf("invalid number specified for %s\n", which);
			return .PARAM_BAD_USE;
		} 
		if (!unit) {
			unit = (byte)"b";
		}  else if (/*Error: Function owner not recognized*/strlen(unit) > 1) {
			unit = (byte)/* unsupported */"w";
		} 
		switch (unit) {
		case (byte)'G':
		case (byte)'b':
		case (byte)'k':
				if (value > (/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) / 1024)) {
					return .PARAM_NUMBER_TOO_LARGE;
				} 
				value *= 1024;
				break;
		case (byte)'B'/* for plain bytes, leave as-is */:
				break;
		case (byte)'K':
		case (byte)'m':
				if (value > (/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) / (1024 * 1024))) {
					return .PARAM_NUMBER_TOO_LARGE;
				} 
				value *= 1024 * 1024;
				break;
		case (byte)'g':
				if (value > (/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) / (1024 * 1024 * 1024))) {
					return .PARAM_NUMBER_TOO_LARGE;
				} 
				value *= 1024 * 1024 * 1024;
				break;
		case (byte)'M':
		default:
				global.warnf("unsupported %s unit. Use G, M, K or B!\n", which);
				return .PARAM_BAD_USE;
		}
		value_out = value;
		return .PARAM_OK;
	}
	public  parse_args(int argc, byte[][] argv) {
		int i;
		bool stillflags = new bool();
		byte orig_opt = ((Object)0);
		ParameterError result = .PARAM_OK;
		OperationConfig generatedFirst = this.getFirst();
		OperationConfig config = generatedFirst;
		getout generatedUrl_list = config.getUrl_list();
		Byte generatedUrl = generatedUrl_list.getUrl();
		OperationConfig generatedNext = config.getNext();
		for (; i < argc && !result; i++) {
			orig_opt = argv[i];
			if (stillflags && ((byte)'-' == argv[i][0])) {
				bool passarg = new bool();
				byte flag = argv[i];
				if (!/*Error: Function owner not recognized*/strcmp("--", argv[i/* This indicates the end of the flags and thus enables the
				           following (URL) argument to start with -. */])) {
					stillflags = 0;
				} else {
						byte nextarg = (i < (argc - 1)) ? argv[i + 1] : ((Object)0);
						result = ModernizedCProgram.getparameter(flag, nextarg, passarg, global, config);
						if (result == .PARAM_NEXT_OPERATION/* Reset result as PARAM_NEXT_OPERATION is only used here and not
						             returned from this function */) {
							result = .PARAM_OK;
							if (generatedUrl_list && generatedUrl) {
								config.setNext(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*//* Allocate the next config */));
								if (generatedNext) {
									generatedNext.config_init();
									generatedNext.setGlobal(/* Set the global config pointer */global);
									this.setLast(generatedNext);
									generatedNext.setPrev(/* Move onto the new config */config);
									config = generatedNext;
								} else {
										result = .PARAM_NO_MEM;
								} 
							} 
						}  else if (!result && passarg) {
							/* we're supposed to skip this */i++;
						} 
				} 
			} else {
					bool used = new bool();
					result = ModernizedCProgram.getparameter((byte)"--url", argv[i], used, /* Just add the URL please */global, config);
			} 
		}
		_iobuf generatedErrors = this.getErrors();
		if (result && result != .PARAM_HELP_REQUESTED && result != .PARAM_MANUAL_REQUESTED && result != .PARAM_VERSION_INFO_REQUESTED && result != .PARAM_ENGINES_REQUESTED) {
			byte reason = ModernizedCProgram.param2text(result);
			if (orig_opt && /*Error: Function owner not recognized*/strcmp(":", orig_opt)) {
				generatedErrors.helpf("option %s: %s\n", orig_opt, reason);
			} else {
					generatedErrors.helpf("%s\n", reason);
			} 
		} 
		return result;
	}
	/* setopt wrapper for enum types */
	public Object tool_setopt_enum(Object curl, Object name, Object tag, Object nvlist, long lval) {
		 ret = CURLE_OK;
		bool skip = 0;
		ret = curl.curl_easy_setopt(tag, lval);
		if (!lval) {
			skip = 1;
		} 
		if (ModernizedCProgram.config.getLibcurl() && !skip && !ret) {
			NameValue nv = ((Object)/* we only use this for real if --libcurl was used */0);
			for (nv = nvlist; nv.getName(); nv++) {
				if (nv.getValue() == /* found it */lval) {
					break;
				} 
			}
			if (!nv.getName()) {
				do {
					ret = ModernizedCProgram.easysrc_code.easysrc_addf("curl_easy_setopt(hnd, %s, %ldL);", name, lval);
					if (ret) {
						;
					} 
				} while (0);
			} else {
					do {
						ret = ModernizedCProgram.easysrc_code.easysrc_addf("curl_easy_setopt(hnd, %s, (long)%s);", name, nv.getName());
						if (ret) {
							;
						} 
					} while (0);
			} 
		} 
	}
	/* setopt wrapper for flags */
	public Object tool_setopt_flags(Object curl, Object name, Object tag, Object nvlist, long lval) {
		 ret = CURLE_OK;
		bool skip = 0;
		ret = curl.curl_easy_setopt(tag, lval);
		if (!lval) {
			skip = 1;
		} 
		if (ModernizedCProgram.config.getLibcurl() && !skip && !ret) {
			byte[] preamble = new byte[/* we only use this for real if --libcurl was used *//* should accommodate any symbol name */80];
			long rest = /* bits not handled yet */lval;
			NameValue nv = ((Object)0);
			ModernizedCProgram.curl_msnprintf(preamble, /*Error: sizeof expression not supported yet*/, "curl_easy_setopt(hnd, %s, ", name);
			for (nv = nvlist; nv.getName(); nv++) {
				if ((nv.getValue() & ~rest) == 0) {
					rest &=  ~nv.getValue();
					do {
						ret = ModernizedCProgram.easysrc_code.easysrc_addf("%s(long)%s%s", preamble, nv.getName(), rest ? " |" : ");");
						if (ret) {
							;
						} 
					} while (0);
					if (!rest) {
						break;
					} 
					ModernizedCProgram.curl_msnprintf(preamble, /*Error: sizeof expression not supported yet*/, "%*s", /*Error: Function owner not recognized*/strlen(preamble), /* replace with all spaces for continuation line */"");
				} 
			}
			if (/* If any bits have no definition, output an explicit value.
			     * This could happen if new bits are defined and used
			     * but the NameValue list is not updated. */rest) {
				do {
					ret = ModernizedCProgram.easysrc_code.easysrc_addf("%s%ldL);", preamble, rest);
					if (ret) {
						;
					} 
				} while (0);
			} 
		} 
	}
	/* setopt wrapper for bitmasks */
	public Object tool_setopt_bitmask(Object curl, Object name, Object tag, Object nvlist, long lval) {
		 ret = CURLE_OK;
		bool skip = 0;
		ret = curl.curl_easy_setopt(tag, lval);
		if (!lval) {
			skip = 1;
		} 
		if (ModernizedCProgram.config.getLibcurl() && !skip && !ret) {
			byte[] preamble = new byte[/* we only use this for real if --libcurl was used */80];
			long rest = (long)lval;
			NameValueUnsigned nv = ((Object)0);
			ModernizedCProgram.curl_msnprintf(preamble, /*Error: sizeof expression not supported yet*/, "curl_easy_setopt(hnd, %s, ", name);
			for (nv = nvlist; nv.getName(); nv++) {
				if ((nv.getValue() & ~rest) == 0) {
					rest &=  ~nv.getValue();
					do {
						ret = ModernizedCProgram.easysrc_code.easysrc_addf("%s(long)%s%s", preamble, nv.getName(), rest ? " |" : ");");
						if (ret) {
							;
						} 
					} while (0);
					if (!rest) {
						break;
					} 
					ModernizedCProgram.curl_msnprintf(preamble, /*Error: sizeof expression not supported yet*/, "%*s", /*Error: Function owner not recognized*/strlen(preamble), /* replace with all spaces for continuation line */"");
				} 
			}
			if (/* If any bits have no definition, output an explicit value.
			     * This could happen if new bits are defined and used
			     * but the NameValue list is not updated. */rest) {
				do {
					ret = ModernizedCProgram.easysrc_code.easysrc_addf("%s%luUL);", preamble, rest);
					if (ret) {
						;
					} 
				} while (0);
			} 
		} 
	}
	/* setopt wrapper for CURLOPT_MIMEPOST */
	public Object tool_setopt_mimepost(Object curl, Object name, Object tag, Object mimepost) {
		 ret = curl.curl_easy_setopt(tag, mimepost);
		int mimeno = 0;
		if (!ret && ModernizedCProgram.config.getLibcurl()) {
			ret = ModernizedCProgram.libcurl_generate_mime(curl, ModernizedCProgram.config, ModernizedCProgram.config.getCurrent().getMimeroot(), mimeno);
			if (!ret) {
				do {
					ret = ModernizedCProgram.easysrc_code.easysrc_addf("curl_easy_setopt(hnd, %s, mime%d);", name, mimeno);
					if (ret) {
						;
					} 
				} while (0);
			} 
		} 
	}
	/* generic setopt wrapper for all other options.
	 * Some type information is encoded in the tag value. */
	public Object tool_setopt(Object curl,  str, Object name, Object tag) {
		va_list arg = new va_list();
		byte[] buf = new byte[256];
		byte value = ((Object)0);
		bool remark = 0;
		bool skip = 0;
		bool escape = 0;
		byte escaped = ((Object)0);
		 ret = CURLE_OK;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(arg, tag);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(arg);
		if (ModernizedCProgram.config.getLibcurl() && !skip && !ret/* we only use this for real if --libcurl was used */) {
			if (remark) {
				do {
					ret = ModernizedCProgram.easysrc_toohard.easysrc_addf("%s set to a %s", name, value);
					if (ret) {
						;
					} 
				} while (0);
			} else {
					if (escape) {
						escaped = ModernizedCProgram.c_escape(value, CURL_ZERO_TERMINATED);
						do {
							if (!escaped) {
								ret = CURLE_OUT_OF_MEMORY;
								;
							} 
						} while (0);
						do {
							ret = ModernizedCProgram.easysrc_code.easysrc_addf("curl_easy_setopt(hnd, %s, \"%s\");", name, escaped);
							if (ret) {
								;
							} 
						} while (0);
					} else {
							do {
								ret = ModernizedCProgram.easysrc_code.easysrc_addf("curl_easy_setopt(hnd, %s, %s);", name, value);
								if (ret) {
									;
								} 
							} while (0);
					} 
			} 
		} 
		return ret/* CURL_DISABLE_LIBCURL_OPTION */;
	}
	/* this weird stuff here is to make curl_free() get called before
	       curl_gdb_memdebug() as otherwise memory tracking will log a free()
	       without an alloc! */
	/* if CURL_MEMLIMIT is set, this enables fail-on-alloc-number-N feature */
	/*
	 * This is the main global constructor for the app. Call this before
	 * _any_ libcurl usage. If this fails, *NO* libcurl functions may be
	 * used, or havoc may be the result.
	 */
	public Object main_init() {
		 result = CURLE_OK/* stop stat() wasting time */;
		ModernizedCProgram.config.setShowerror(-/* Initialise the global config *//* Will show errors */1);
		ModernizedCProgram.config.setErrors((_iob[/* Default errors to stderr */2]));
		ModernizedCProgram.config.setStyled_output(/* enable detection */1);
		ModernizedCProgram.config.setParallel_max(50);
		ModernizedCProgram.config.setFirst(ModernizedCProgram.config.setLast(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*//* Allocate the initial operate config */)));
		if (ModernizedCProgram.config.getFirst()) {
			result = ModernizedCProgram.curl_global_init(/* Perform the libcurl initialization */CURL_GLOBAL_DEFAULT);
			if (!result) {
				result = ModernizedCProgram.get_libcurl_info();
				if (!result) {
					ModernizedCProgram.config.getFirst().config_init();
					ModernizedCProgram.config.getFirst().setGlobal(ModernizedCProgram.config);
				} else {
						(_iob[2]).helpf("error retrieving curl library information\n");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.config.getFirst());
				} 
			} else {
					(_iob[2]).helpf("error initializing curl library\n");
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.config.getFirst());
			} 
		} else {
				(_iob[2]).helpf("error initializing curl\n");
				result = CURLE_FAILED_INIT;
		} 
		return result;
	}
	public void free_globalconfig() {
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getTrace_dump()));
			(ModernizedCProgram.config.getTrace_dump()) = ((Object)0);
		} while (0);
		if (ModernizedCProgram.config.getErrors_fopened() && ModernizedCProgram.config.getErrors()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(ModernizedCProgram.config.getErrors());
		} 
		ModernizedCProgram.config.setErrors(((Object)0));
		if (ModernizedCProgram.config.getTrace_fopened() && ModernizedCProgram.config.getTrace_stream()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(ModernizedCProgram.config.getTrace_stream());
		} 
		ModernizedCProgram.config.setTrace_stream(((Object)0));
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getLibcurl()));
			(ModernizedCProgram.config.getLibcurl()) = ((Object)0);
		} while (0/*
		 * This is the main global destructor for the app. Call this after
		 * _all_ libcurl usage is done.
		 */);
	}
	public void main_free() {
		ModernizedCProgram.curl_global_cleanup();
		do {
		} while (0);
		do {
		} while (0/* prevent valgrind from reporting still reachable mem from NSRP arenas */);
		/* prevent valgrind from reporting possibly lost memory (fd cache, ...) */ModernizedCProgram.config.free_globalconfig();
		ModernizedCProgram.config.getLast().config_free();
		ModernizedCProgram.config.setFirst(((Object)0));
		ModernizedCProgram.config.setLast(((Object)0));
	}
	public void dumpeasysrc() {
		curl_slist ptr = new curl_slist();
		byte o = ModernizedCProgram.config.getLibcurl();
		FILE out = new FILE();
		bool fopened = 0;
		if (/*Error: Function owner not recognized*/strcmp(o, "-")) {
			out = /*Error: Function owner not recognized*/fopen(o, "wt");
			fopened = 1;
		} else {
				out = (_iob[1]);
		} 
		Object generatedCurl_slist = ptr.getCurl_slist();
		if (!out) {
			ModernizedCProgram.config.warnf("Failed to open %s to write libcurl code!\n", o);
		} else {
				int i;
				byte c;
				for (i = 0; ((c = ModernizedCProgram.srchead[i]) != ((Object)0)); i++) {
					out.curl_mfprintf("%s\n", c);
				}
				if (/* Declare variables used for complex setopt values */ModernizedCProgram.easysrc_decl) {
					for (ptr = ModernizedCProgram.easysrc_decl.getFirst(); ptr; ptr = generatedCurl_slist) {
						out.curl_mfprintf("  %s\n", generatedCurl_slist);
					}
				} 
				if (/* Set up complex values for setopt calls */ModernizedCProgram.easysrc_data) {
					out.curl_mfprintf("\n");
					for (ptr = ModernizedCProgram.easysrc_data.getFirst(); ptr; ptr = generatedCurl_slist) {
						out.curl_mfprintf("  %s\n", generatedCurl_slist);
					}
				} 
				out.curl_mfprintf("\n");
				if (ModernizedCProgram.easysrc_code) {
					for (ptr = ModernizedCProgram.easysrc_code.getFirst(); ptr; ptr = generatedCurl_slist) {
						if (generatedCurl_slist[0]) {
							out.curl_mfprintf("  %s\n", generatedCurl_slist);
						} else {
								out.curl_mfprintf("\n");
						} 
					}
				} 
				if (ModernizedCProgram.easysrc_clean) {
					for (ptr = ModernizedCProgram.easysrc_clean.getFirst(); ptr; ptr = generatedCurl_slist) {
						out.curl_mfprintf("  %s\n", generatedCurl_slist);
					}
				} 
				for (i = 0; ((c = ModernizedCProgram.srcend[i]) != ((Object)0)); i++) {
					out.curl_mfprintf("%s\n", c);
				}
				if (fopened) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(out);
				} 
		} 
		ModernizedCProgram.easysrc_free();
	}
	public Object add_parallel_transfers(Object multi, Object share,  morep,  addedp) {
		per_transfer per = new per_transfer();
		 result = CURLE_OK;
		 mcode = new ();
		addedp = 0;
		morep = 0;
		result = global.create_transfer(share, addedp);
		if (result || !addedp) {
			return result;
		} 
		long generatedParallel_max = this.getParallel_max();
		 generatedAdded = per.getAdded();
		Object generatedCurl = per.getCurl();
		per_transfer generatedNext = per.getNext();
		for (per = ModernizedCProgram.transfers; per && (ModernizedCProgram.all_added < generatedParallel_max); per = generatedNext) {
			bool getadded = 0;
			if (generatedAdded) {
				continue;
			} 
			result = ModernizedCProgram.pre_transfer(global, per);
			if (result) {
				break;
			} 
			(Object)generatedCurl.curl_easy_setopt(CURLOPT_PRIVATE, per);
			(Object)generatedCurl.curl_easy_setopt(CURLOPT_XFERINFOFUNCTION, ModernizedCProgram.xferinfo_cb);
			(Object)generatedCurl.curl_easy_setopt(CURLOPT_XFERINFODATA, per);
			mcode = ModernizedCProgram.curl_multi_add_handle(multi, generatedCurl);
			if (mcode) {
				return CURLE_OUT_OF_MEMORY;
			} 
			result = global.create_transfer(share, getadded);
			if (result) {
				return result;
			} 
			per.setAdded(1);
			ModernizedCProgram.all_added++;
			addedp = 1;
		}
		morep = per ? 1 : 0;
		return CURLE_OK;
	}
	public Object parallel_transfers(Object share) {
		 multi = new ();
		 mcode = CURLM_OK;
		 result = CURLE_OK;
		int still_running = 1;
		timeval timeval = new timeval();
		timeval start = timeval.tvnow();
		bool more_transfers = new bool();
		bool added_transfers = new bool();
		Curl_multi curl_multi = new Curl_multi();
		multi = curl_multi.curl_multi_init();
		if (!multi) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = global.add_parallel_transfers(multi, share, more_transfers, added_transfers);
		if (result) {
			return result;
		} 
		while (!mcode && (still_running || more_transfers)) {
			mcode = multi.curl_multi_poll(((Object)0), 0, 1000, ((Object)0));
			if (!mcode) {
				mcode = multi.curl_multi_perform(still_running);
			} 
			ModernizedCProgram.progress_meter(global, start, 0);
			if (!mcode) {
				int rc;
				 msg = new ();
				bool removed = 0;
				do {
					msg = multi.curl_multi_info_read(rc);
					if (msg) {
						bool retry = new bool();
						per_transfer ended = new per_transfer();
						 easy = msg.getEasy_handle();
						result = msg.getData().getResult();
						ModernizedCProgram.easy.curl_easy_getinfo(CURLINFO_PRIVATE, (Object)ended);
						ModernizedCProgram.curl_multi_remove_handle(multi, ModernizedCProgram.easy);
						result = ModernizedCProgram.post_per_transfer(global, ended, result, retry);
						if (retry) {
							continue;
						} 
						/* before it goes away */ended.progress_finalize();
						/* one fewer added */ModernizedCProgram.all_added--;
						removed = 1;
						(Object)ended.del_per_transfer();
					} 
				} while (msg);
				if (removed) {
					(Object)global.add_parallel_transfers(multi, /* one or more transfers completed, add more! */share, more_transfers, added_transfers);
					if (added_transfers) {
						still_running = /* we added new ones, make sure the loop doesn't exit yet */1;
					} 
				} 
			} 
		}
		(Object)ModernizedCProgram.progress_meter(global, start, 1);
		if (/* Make sure to return some kind of error if there was a multi problem */mcode) {
			result = (mcode == CURLM_OUT_OF_MEMORY) ? CURLE_OUT_OF_MEMORY/* The other multi errors should never happen, so return
			         something suitably generic */ : CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		multi.curl_multi_cleanup();
		return result;
	}
	public Object serial_transfers(Object share) {
		 returncode = CURLE_OK;
		 result = CURLE_OK;
		per_transfer per = new per_transfer();
		bool added = 0;
		result = global.create_transfer(share, added);
		if (result || !added) {
			return result;
		} 
		Byte generatedLibcurl = this.getLibcurl();
		Object generatedCurl = per.getCurl();
		 generatedFail_early = this.getFail_early();
		metalinkfile generatedMlfile = per.getMlfile();
		for (per = ModernizedCProgram.transfers; per; /*Error: Unsupported expression*/) {
			bool retry = new bool();
			bool bailout = 0;
			result = ModernizedCProgram.pre_transfer(global, per);
			if (result) {
				break;
			} 
			if (generatedLibcurl) {
				result = ModernizedCProgram.easysrc_perform();
				if (result) {
					break;
				} 
			} 
			result = generatedCurl.curl_easy_perform();
			returncode = /* store the result of the actual transfer */result;
			result = ModernizedCProgram.post_per_transfer(global, per, result, retry);
			if (retry) {
				continue;
			} 
			if (result || ModernizedCProgram.is_fatal_error(/* Bail out upon critical errors or --fail-early */returncode) || (returncode && generatedFail_early)) {
				bailout = 1;
			} else {
					result = global.create_transfer(share, /* setup the next one just before we delete this */added);
					if (result) {
						bailout = 1;
					} 
			} 
			(Object)generatedMlfile;
			per = per.del_per_transfer();
			if (bailout) {
				break;
			} 
		}
		if (returncode) {
			result = /* returncode errors have priority */returncode;
		} 
		OperationConfig generatedCurrent = this.getCurrent();
		if (result) {
			generatedCurrent.single_transfer_cleanup();
		} 
		return result;
	}
	public Object create_transfer(Object share,  added) {
		 result = CURLE_OK;
		added = 0;
		OperationConfig generatedCurrent = this.getCurrent();
		OperationConfig generatedNext = generatedCurrent.getNext();
		while (generatedCurrent) {
			result = ModernizedCProgram.transfer_per_config(global, generatedCurrent, share, added);
			if (!result && !added) {
				this.setCurrent(generatedNext);
				continue;
			} 
			break;
		}
		return result;
	}
	public Object run_all_transfers(Object share, Object result) {
		 generatedNoprogress = this.getNoprogress();
		bool orig_noprogress = generatedNoprogress;
		 generatedIsatty = this.getIsatty();
		bool orig_isatty = generatedIsatty;
		per_transfer per = new per_transfer();
		 generatedParallel = this.getParallel();
		if (!/* Time to actually do the transfers */result) {
			if (generatedParallel) {
				result = global.parallel_transfers(share);
			} else {
					result = global.serial_transfers(share);
			} 
		} 
		OperationConfig generatedConfig = per.getConfig();
		for (per = ModernizedCProgram.transfers; /* cleanup if there are any left */per; /*Error: Unsupported expression*/) {
			bool retry = new bool();
			 result2 = ModernizedCProgram.post_per_transfer(global, per, result, retry);
			if (!result) {
				result = /* don't overwrite the original error */result2;
			} 
			generatedConfig.clean_getout();
			(Object)generatedConfig;
			per = per.del_per_transfer();
		}
		this.setNoprogress(/* Reset the global config variables */orig_noprogress);
		this.setIsatty(orig_isatty);
		return result;
	}
	public Object operate(int argc, byte[][] argv) {
		 result = CURLE_OK;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setlocale(0, /* Setup proper locale from environment */"");
		OperationConfig generatedFirst = this.getFirst();
		getout generatedUrl_list = generatedFirst.getUrl_list();
		_iobuf generatedErrors = this.getErrors();
		if ((argc == /* Parse .curlrc if necessary */1) || (!ModernizedCProgram.curl_strequal(argv[1], "-q") && !ModernizedCProgram.curl_strequal(argv[1], "--disable"))) {
			/* ignore possible failure */global.parseconfig(((Object)0));
			if ((argc < 2) && (!generatedUrl_list)) {
				generatedErrors.helpf(((Object)0));
				result = CURLE_FAILED_INIT;
			} 
		} 
		Byte generatedLibcurl = this.getLibcurl();
		Curl_share curl_share = new Curl_share();
		OperationConfig generatedNext = operation.getNext();
		if (!result) {
			ParameterError res = global.parse_args(argc, /* Parse the command line arguments */argv);
			if (ModernizedCProgram.res) {
				result = CURLE_OK;
				if (ModernizedCProgram.res == /* Check if we were asked for the help */.PARAM_HELP_REQUESTED) {
					ModernizedCProgram.tool_help();
				}  else if (ModernizedCProgram.res == /* Check if we were asked for the manual */.PARAM_MANUAL_REQUESTED) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/hugehelp();
				}  else if (ModernizedCProgram.res == /* Check if we were asked for the version information */.PARAM_VERSION_INFO_REQUESTED) {
					ModernizedCProgram.tool_version_info();
				}  else if (ModernizedCProgram.res == /* Check if we were asked to list the SSL engines */.PARAM_ENGINES_REQUESTED) {
					ModernizedCProgram.tool_list_engines();
				}  else if (ModernizedCProgram.res == .PARAM_LIBCURL_UNSUPPORTED_PROTOCOL) {
					result = CURLE_UNSUPPORTED_PROTOCOL;
				} else {
						result = CURLE_FAILED_INIT;
				} 
			} else {
					if (generatedLibcurl) {
						result = ModernizedCProgram.easysrc_init();
					} 
					if (!/* Perform the main operations */result) {
						size_t count = 0;
						OperationConfig operation = generatedFirst;
						 share = curl_share.curl_share_init();
						if (!share) {
							if (generatedLibcurl) {
								ModernizedCProgram.easysrc_cleanup();
							} 
							return CURLE_OUT_OF_MEMORY;
						} 
						share.curl_share_setopt(CURLSHOPT_SHARE, CURL_LOCK_DATA_COOKIE);
						share.curl_share_setopt(CURLSHOPT_SHARE, CURL_LOCK_DATA_DNS);
						share.curl_share_setopt(CURLSHOPT_SHARE, CURL_LOCK_DATA_SSL_SESSION);
						share.curl_share_setopt(CURLSHOPT_SHARE, CURL_LOCK_DATA_CONNECT);
						share.curl_share_setopt(CURLSHOPT_SHARE, CURL_LOCK_DATA_PSL);
						do {
							result = operation.get_args(count++);
							operation = generatedNext;
						} while (!result && operation);
						this.setCurrent(generatedFirst);
						result = global.run_all_transfers(share, /* now run! */result);
						share.curl_share_cleanup();
						if (generatedLibcurl) {
							ModernizedCProgram.easysrc_cleanup();
							/* Dump the libcurl code if previously enabled */global.dumpeasysrc();
						} 
					} else {
							generatedErrors.helpf("out of memory\n");
					} 
			} 
		} 
		return result;
	}
	/***************************************************************************
	 *                                  _   _ ____  _
	 *  Project                     ___| | | |  _ \| |
	 *                             / __| | | | |_) | |
	 *                            | (__| |_| |  _ <| |___
	 *                             \___|\___/|_| \_\_____|
	 *
	 * Copyright (C) 1998 - 2015, 2017, Daniel Stenberg, <daniel@haxx.se>, et al.
	 *
	 * This software is licensed as described in the file COPYING, which
	 * you should have received as part of this distribution. The terms
	 * are also available at https://curl.haxx.se/docs/copyright.html.
	 *
	 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
	 * copies of the Software, and permit persons to whom the Software is
	 * furnished to do so, under the terms of the COPYING file.
	 *
	 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
	 * KIND, either express or implied.
	 *
	 ***************************************************************************/
	/* use our own printf() functions */
	/* keep this as LAST include */
	public void voutf(Object prefix, Object fmt, Object ap) {
		size_t width = (79 - /*Error: Function owner not recognized*/strlen(prefix));
		if (!ModernizedCProgram.config.getMute()) {
			size_t len = new size_t();
			byte ptr;
			byte print_buffer;
			print_buffer = ModernizedCProgram.curl_mvaprintf(fmt, ap);
			if (!print_buffer) {
				return /*Error: Unsupported expression*/;
			} 
			len = /*Error: Function owner not recognized*/strlen(print_buffer);
			ptr = print_buffer;
			while (len > 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(prefix, ModernizedCProgram.config.getErrors());
				if (len > width) {
					size_t cut = width - 1;
					while (!(ModernizedCProgram.Curl_isspace((int)((byte)ptr[cut]))) && cut) {
						cut--;
					}
					if (0 == cut/* not a single cutting position was found, just cut it at the
					             max text width then! */) {
						cut = width - 1;
					} 
					(Object)/*Error: Function owner not recognized*/fwrite(ptr, cut + 1, 1, ModernizedCProgram.config.getErrors());
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", ModernizedCProgram.config.getErrors());
					ptr += cut + /* skip the space too */1;
					len -= cut + 1;
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ptr, ModernizedCProgram.config.getErrors());
						len = 0;
				} 
			}
			ModernizedCProgram.curl_free(print_buffer/*
			 * Emit 'note' formatted message on configured 'errors' stream, if verbose was
			 * selected.
			 */);
		} 
	}
	public void notef(Object fmt) {
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		if (ModernizedCProgram.config.getTracetype()) {
			ModernizedCProgram.config.voutf("Note: ", fmt, ap);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap/*
		 * Emit warning formatted message on configured 'errors' stream unless
		 * mute (--silent) was selected.
		 */);
	}
	public void warnf(Object fmt) {
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		ModernizedCProgram.config.voutf("Warning: ", fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap/*
		 * Emit help formatted message on given stream.
		 */);
	}
	/* return 0 on everything-is-fine, and non-zero otherwise */
	public int parseconfig(Object filename) {
		FILE file = ((Object)0);
		bool usedarg = 0;
		int rc = 0;
		OperationConfig generatedFirst = this.getFirst();
		OperationConfig operation = generatedFirst;
		byte pathalloc = ((Object)0);
		if (!filename || !filename/* NULL or no file name attempts to load .curlrc from the homedir! */) {
			byte home = ModernizedCProgram.homedir();
			if (/* out of memory *//* Windows */home) {
				int i = 0;
				byte prefix = (byte)'.';
				do {
					pathalloc = ModernizedCProgram.curl_maprintf("%s%s%ccurlrc", home, "\\", /* check for .curlrc then _curlrc in the home dir */prefix);
					if (!pathalloc) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(home);
						return /* out of memory */1;
					} 
					file = /*Error: Function owner not recognized*/fopen(pathalloc, /* Check if the file exists - if not, try _curlrc */"rt");
					if (file) {
						filename = pathalloc;
						break;
					} 
					prefix = (byte)'_';
				} while (++i < 2);
			} 
			if (!filename) {
				file = ModernizedCProgram.execpath(/* check for .curlrc then _curlrc in the dir of the executable */".curlrc");
				if (!file) {
					file = ModernizedCProgram.execpath("_curlrc");
				} 
			} 
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((home));
				(home) = ((Object)0);
			} while (/* we've used it, now free it */0);
		} 
		if (!file && /* no need to fopen() again */filename) {
			if (/*Error: Function owner not recognized*/strcmp(filename, "-")) {
				file = /*Error: Function owner not recognized*/fopen(filename, "rt");
			} else {
					file = (_iob[0]);
			} 
		} 
		GlobalConfig generatedGlobal = operation.getGlobal();
		getout generatedUrl_list = operation.getUrl_list();
		Byte generatedUrl = generatedUrl_list.getUrl();
		OperationConfig generatedNext = operation.getNext();
		if (file) {
			byte line;
			byte aline;
			byte option;
			byte param;
			int lineno = 0;
			bool dashed_option = new bool();
			while (((Object)0) != (aline = file.my_get_line())) {
				int res;
				bool alloced_param = 0;
				lineno++;
				line = aline;
				while (line && (ModernizedCProgram.Curl_isspace((int)((byte)/* line with # in the first non-blank column is a comment! */line)))) {
					line++;
				}
				switch (line) {
				case (byte)'#':
				case (byte)'/':
				case (byte)'\n':
				case (byte)'*':
				case (byte)'\r':
				case (byte)'\0':
						do {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((aline));
							(aline) = ((Object)0);
						} while (0);
						continue;
				}
				option = /* the option keywords starts here */line;
				dashed_option = option[0] == (byte)'-' ? 1 : /* the option starts with a dash? */0;
				while (line && !(ModernizedCProgram.Curl_isspace((int)((byte)line))) && !(!dashed_option && (((line) == (byte)'=') || ((line) == (byte)':')))) {
					line/* ... and has ended here */++;
				}
				if (line) {
					line++ = /* zero terminate, we have a local copy of the data */(byte)'\0';
				} 
				while (line && ((ModernizedCProgram.Curl_isspace((int)((byte)line))) || (!dashed_option && (((line) == (byte)'=') || ((line) == /* pass spaces and separator(s) */(byte)':'))))) {
					line++;
				}
				if (line == /* the parameter starts here (unless quoted) */(byte)'\"') {
					/* quoted parameter, do the quote dance */line++;
					param = /*Error: Function owner not recognized*/malloc(/*Error: Function owner not recognized*/strlen(line) + /* parameter */1);
					if (!param) {
						do {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((aline));
							(aline) = ((Object)0);
						} while (/* out of memory */0);
						rc = 1;
						break;
					} 
					alloced_param = 1;
					(Object)ModernizedCProgram.unslashquote(line, param);
				} else {
						param = /* parameter starts here */line;
						while (line && !(ModernizedCProgram.Curl_isspace((int)((byte)line)))) {
							line++;
						}
						if (line) {
							line = /* zero terminate */(byte)'\0';
							/* to detect mistakes better, see if there's data following */line++;
							while (line && (ModernizedCProgram.Curl_isspace((int)((byte)/* pass all spaces */line)))) {
								line++;
							}
							switch (line) {
							case (byte)'\n':
							case (byte)'\0':
							case (byte)'\r':
							case /* comment */(byte)'#':
									break;
							default:
									generatedGlobal.warnf("%s:%d: warning: '%s' uses unquoted white space in the line that may cause side-effects!\n", filename, lineno, option);
							}
						} 
						if (!param/* do this so getparameter can check for required parameters.
						             Otherwise it always thinks there's a parameter. */) {
							param = ((Object)0);
						} 
				} 
				ModernizedCProgram.res = ModernizedCProgram.getparameter(option, param, usedarg, global, operation);
				if (!ModernizedCProgram.res && param && param && !usedarg) {
					ModernizedCProgram.res = /* we passed in a parameter that wasn't used! */.PARAM_GOT_EXTRA_PARAMETER;
				} 
				if (ModernizedCProgram.res == .PARAM_NEXT_OPERATION) {
					if (generatedUrl_list && generatedUrl) {
						operation.setNext(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*//* Allocate the next config */));
						if (generatedNext) {
							generatedNext.config_init();
							generatedNext.setGlobal(/* Set the global config pointer */global);
							this.setLast(generatedNext);
							generatedNext.setPrev(/* Move onto the new config */operation);
							operation = generatedNext;
						} else {
								ModernizedCProgram.res = .PARAM_NO_MEM;
						} 
					} 
				} 
				if (ModernizedCProgram.res != .PARAM_OK && ModernizedCProgram.res != .PARAM_NEXT_OPERATION) {
					if (!/*Error: Function owner not recognized*/strcmp(filename, /* the help request isn't really an error */"-")) {
						filename = "<stdin>";
					} 
					if (ModernizedCProgram.res != .PARAM_HELP_REQUESTED && ModernizedCProgram.res != .PARAM_MANUAL_REQUESTED && ModernizedCProgram.res != .PARAM_VERSION_INFO_REQUESTED && ModernizedCProgram.res != .PARAM_ENGINES_REQUESTED) {
						byte reason = ModernizedCProgram.param2text(ModernizedCProgram.res);
						generatedGlobal.warnf("%s:%d: warning: '%s' %s\n", filename, lineno, option, reason);
					} 
				} 
				if (alloced_param) {
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((param));
						(param) = ((Object)0);
					} while (0);
				} 
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((aline));
					(aline) = ((Object)0);
				} while (0);
			}
			if (file != (_iob[0])) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(file);
			} 
		} else {
				rc = /* couldn't open the file */1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(pathalloc);
		return rc/*
		 * Copies the string from line to the buffer at param, unquoting
		 * backslash-quoted characters and NUL-terminating the output string.
		 * Stops at the first non-backslash-quoted double quote character or the
		 * end of the input string. param must be at least as long as the input
		 * string.  Returns the pointer after the last handled input character.
		 */;
	}
	public int getShowerror() {
		return showerror;
	}
	public void setShowerror(int newShowerror) {
		showerror = newShowerror;
	}
	public  getMute() {
		return mute;
	}
	public void setMute( newMute) {
		mute = newMute;
	}
	public  getNoprogress() {
		return noprogress;
	}
	public void setNoprogress( newNoprogress) {
		noprogress = newNoprogress;
	}
	public  getIsatty() {
		return isatty;
	}
	public void setIsatty( newIsatty) {
		isatty = newIsatty;
	}
	public _iobuf getErrors() {
		return errors;
	}
	public void setErrors(_iobuf newErrors) {
		errors = newErrors;
	}
	public  getErrors_fopened() {
		return errors_fopened;
	}
	public void setErrors_fopened( newErrors_fopened) {
		errors_fopened = newErrors_fopened;
	}
	public Byte getTrace_dump() {
		return trace_dump;
	}
	public void setTrace_dump(Byte newTrace_dump) {
		trace_dump = newTrace_dump;
	}
	public _iobuf getTrace_stream() {
		return trace_stream;
	}
	public void setTrace_stream(_iobuf newTrace_stream) {
		trace_stream = newTrace_stream;
	}
	public  getTrace_fopened() {
		return trace_fopened;
	}
	public void setTrace_fopened( newTrace_fopened) {
		trace_fopened = newTrace_fopened;
	}
	public  getTracetype() {
		return tracetype;
	}
	public void setTracetype( newTracetype) {
		tracetype = newTracetype;
	}
	public  getTracetime() {
		return tracetime;
	}
	public void setTracetime( newTracetime) {
		tracetime = newTracetime;
	}
	public int getProgressmode() {
		return progressmode;
	}
	public void setProgressmode(int newProgressmode) {
		progressmode = newProgressmode;
	}
	public Byte getLibcurl() {
		return libcurl;
	}
	public void setLibcurl(Byte newLibcurl) {
		libcurl = newLibcurl;
	}
	public  getFail_early() {
		return fail_early;
	}
	public void setFail_early( newFail_early) {
		fail_early = newFail_early;
	}
	public  getStyled_output() {
		return styled_output;
	}
	public void setStyled_output( newStyled_output) {
		styled_output = newStyled_output;
	}
	public  getParallel() {
		return parallel;
	}
	public void setParallel( newParallel) {
		parallel = newParallel;
	}
	public long getParallel_max() {
		return parallel_max;
	}
	public void setParallel_max(long newParallel_max) {
		parallel_max = newParallel_max;
	}
	public OperationConfig getFirst() {
		return first;
	}
	public void setFirst(OperationConfig newFirst) {
		first = newFirst;
	}
	public OperationConfig getCurrent() {
		return current;
	}
	public void setCurrent(OperationConfig newCurrent) {
		current = newCurrent;
	}
	public OperationConfig getLast() {
		return last;
	}
	public void setLast(OperationConfig newLast) {
		last = newLast;
	}
}
