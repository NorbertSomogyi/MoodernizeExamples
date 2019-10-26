package application;

/* deprecated names: */
/* next entry in the list */
/* if one field name has more than one
                                       file, this link should link to following
                                       files */
public class curl_httppost {
	private curl_httppost next;
	private Byte name;
	private long namelength;
	private Byte contents;
	private long contentslength;
	private Byte buffer;
	private long bufferlength;
	private Byte contenttype;
	private curl_slist contentheader;
	private curl_httppost more;
	private long flags;
	private Byte showfilename;
	private Object userp;
	private Object contentlen;
	
	public curl_httppost(curl_httppost next, Byte name, long namelength, Byte contents, long contentslength, Byte buffer, long bufferlength, Byte contenttype, curl_slist contentheader, curl_httppost more, long flags, Byte showfilename, Object userp, Object contentlen) {
		setNext(next);
		setName(name);
		setNamelength(namelength);
		setContents(contents);
		setContentslength(contentslength);
		setBuffer(buffer);
		setBufferlength(bufferlength);
		setContenttype(contenttype);
		setContentheader(contentheader);
		setMore(more);
		setFlags(flags);
		setShowfilename(showfilename);
		setUserp(userp);
		setContentlen(contentlen);
	}
	public curl_httppost() {
	}
	
	public curl_httppost AddHttpPost(Byte name, Object namelength, Byte value, Object contentslength, Byte buffer, Object bufferlength, Byte contenttype, long flags, curl_slist contentHeader, Byte showfilename, Byte userp, curl_httppost httppost, curl_httppost last_post) {
		curl_httppost post = new curl_httppost();
		post = .Curl_ccalloc(1, );
		if (post) {
			post.setCurl_httppost(name);
			post.setCurl_httppost((long)(name ? (namelength ? namelength : .strlen(name)) : 0));
			post.setCurl_httppost(value);
			post.setCurl_httppost(contentslength);
			post.setCurl_httppost(buffer);
			post.setCurl_httppost((long)bufferlength);
			post.setCurl_httppost(contenttype);
			post.setCurl_httppost(contentHeader);
			post.setCurl_httppost(showfilename);
			post.setCurl_httppost(userp);
			post.setCurl_httppost(flags | CURL_HTTPPOST_LARGE);
		} else {
				return ((Object)0);
		} 
		Object generatedCurl_httppost = this.getCurl_httppost();
		if (parent_post) {
			post.setCurl_httppost(generatedCurl_httppost);
			this.setCurl_httppost(/* then move the original 'more' to point to ourselves */post);
		} else {
				if (/* make the previous point to this */last_post) {
					(last_post).setCurl_httppost(post);
				} else {
						(httppost) = post;
				} 
				(last_post) = post;
		} 
		return post/***************************************************************************
		 *
		 * AddFormInfo()
		 *
		 * Adds a FormInfo structure to the list presented by parent_form_info.
		 *
		 * Returns newly allocated FormInfo on success and NULL if malloc failed/
		 * parent_form_info is NULL.
		 *
		 ***************************************************************************/;
	}
	public Object FormAdd(curl_httppost last_post, Object params) {
		FormInfo first_form = new FormInfo();
		FormInfo current_form = new FormInfo();
		FormInfo form = ((Object)0);
		 return_value = CURL_FORMADD_OK;
		byte prevtype = ((Object)0);
		curl_httppost post = ((Object)0);
		 option = new ();
		curl_forms forms = ((Object)0);
		byte array_value = ((Object)/* value read from an array */0/* This is a state variable, that if TRUE means that we're parsing an
		     array that we got passed to us. If FALSE we're parsing the input
		     va_list arguments. */);
		bool array_state = 0/*
		   * We need to allocate the first struct to fill in.
		   */;
		first_form = .Curl_ccalloc(1, );
		if (!first_form) {
			return CURL_FORMADD_MEMORY;
		} 
		current_form = first_form/*
		   * Loop through all the options set. Break if we have an error to report.
		   */;
		Object generatedCurl_forms = forms.getCurl_forms();
		long generatedFlags = current_form.getFlags();
		Byte generatedName = current_form.getName();
		Object generatedNamelength = current_form.getNamelength();
		Byte generatedValue = current_form.getValue();
		Byte generatedBuffer = current_form.getBuffer();
		Object generatedBufferlength = current_form.getBufferlength();
		Byte generatedUserp = current_form.getUserp();
		Byte generatedContenttype = current_form.getContenttype();
		curl_slist generatedContentheader = current_form.getContentheader();
		Byte generatedShowfilename = current_form.getShowfilename();
		while (return_value == CURL_FORMADD_OK) {
			if (array_state && /* first see if we have more parts of the array param */forms) {
				option = generatedCurl_forms;
				array_value = (byte)generatedCurl_forms;
				/* advance this to next entry */forms++;
				if (CURLFORM_END == option) {
					array_state = /* end of array state */0;
					continue;
				} 
			} else {
					option = (int)/* This is not array-state, get next option */params;
					if (CURLFORM_END == option) {
						break;
					} 
			} 
			switch (option) {
			case CURLFORM_CONTENTHEADER:
					{ 
						curl_slist list = /* this "cast increases required alignment of target type" but
						           we consider it OK anyway */array_state ? (curl_slist)(Object)array_value : (int)params;
						if (generatedContentheader) {
							return_value = CURL_FORMADD_OPTION_TWICE;
						} else {
								current_form.setContentheader(list);
						} 
						break;
					}
			case /* FALLTHROUGH */CURLFORM_COPYCONTENTS:
					if (generatedValue) {
						return_value = CURL_FORMADD_OPTION_TWICE;
					} else {
							byte value = array_state ? array_value : (int)params;
							if (value) {
								current_form.setValue(/* store for the moment */value);
							} else {
									return_value = CURL_FORMADD_NULL;
							} 
					} 
					break;
			case CURLFORM_CONTENTSLENGTH:
					current_form.setContentslength(array_state ? (size_t)array_value : (size_t)(int)params);
					break;
			case /* FALLTHROUGH */CURLFORM_COPYNAME:
					if (generatedName) {
						return_value = CURL_FORMADD_OPTION_TWICE;
					} else {
							byte name = array_state ? array_value : (int)params;
							if (ModernizedCProgram.name) {
								current_form.setName(/* store for the moment */ModernizedCProgram.name);
							} else {
									return_value = CURL_FORMADD_NULL;
							} 
					} 
					break;
			case CURLFORM_PTRCONTENTS:
					generatedFlags |=  CURL_HTTPPOST_PTRCONTENTS;
			case CURLFORM_CONTENTTYPE:
					{ 
						byte contenttype = array_state ? array_value : (int)params;
						if (generatedContenttype) {
							if (generatedFlags & CURL_HTTPPOST_FILENAME) {
								if (contenttype) {
									byte type = .Curl_cstrdup(contenttype);
									if (!type) {
										return_value = CURL_FORMADD_MEMORY;
									} else {
											form = current_form.AddFormInfo(((Object)0), type);
											if (!form) {
												.Curl_cfree(type);
												return_value = CURL_FORMADD_MEMORY;
											} else {
													form.setContenttype_alloc(1);
													current_form = form;
													form = ((Object)0);
											} 
									} 
								} else {
										return_value = CURL_FORMADD_NULL;
								} 
							} else {
									return_value = CURL_FORMADD_OPTION_TWICE;
							} 
						} else {
								if (contenttype) {
									current_form.setContenttype(.Curl_cstrdup(contenttype));
									if (!generatedContenttype) {
										return_value = CURL_FORMADD_MEMORY;
									} else {
											current_form.setContenttype_alloc(1);
									} 
								} else {
										return_value = CURL_FORMADD_NULL;
								} 
						} 
						break;
					}
			case CURLFORM_NAMELENGTH:
					if (generatedNamelength) {
						return_value = CURL_FORMADD_OPTION_TWICE;
					} else {
							current_form.setNamelength(array_state ? (size_t)array_value : (size_t)(int)params);
					} 
					break;
			case CURLFORM_STREAM:
					generatedFlags |=  CURL_HTTPPOST_CALLBACK;
					if (generatedUserp) {
						return_value = CURL_FORMADD_OPTION_TWICE;
					} else {
							byte userp = array_state ? array_value : (int)params;
							if (userp) {
								current_form.setUserp(userp);
								current_form.setValue(/* this isn't strictly true but we
								                                          derive a value from this later on
								                                          and we need this non-NULL to be
								                                          accepted as a fine form part */userp);
							} else {
									return_value = CURL_FORMADD_NULL;
							} 
					} 
					break;
			case CURLFORM_ARRAY:
					if (array_state) {
						return_value = /* we don't support an array from within an array */CURL_FORMADD_ILLEGAL_ARRAY;
					} else {
							forms = (int)params;
							if (forms) {
								array_state = 1;
							} else {
									return_value = CURL_FORMADD_NULL;
							} 
					} 
					break;
			case CURLFORM_BUFFERPTR:
					generatedFlags |=  CURL_HTTPPOST_PTRBUFFER | CURL_HTTPPOST_BUFFER;
					if (generatedBuffer) {
						return_value = CURL_FORMADD_OPTION_TWICE;
					} else {
							byte buffer = array_state ? array_value : (int)params;
							if (ModernizedCProgram.buffer) {
								current_form.setBuffer(/* store for the moment */ModernizedCProgram.buffer);
								current_form.setValue(/* make it non-NULL to be accepted
								                                           as fine */ModernizedCProgram.buffer);
							} else {
									return_value = CURL_FORMADD_NULL;
							} 
					} 
					break;
			case CURLFORM_PTRNAME/* Treat CURLFORM_PTR like CURLFORM_COPYNAME so that libcurl will copy
			       * the data in all cases so that we'll have safe memory for the eventual
			       * conversion.
			       */:
					generatedFlags |=  /* fall through */CURL_HTTPPOST_PTRNAME;
			case /* Get contents from a given file name */CURLFORM_FILECONTENT:
					if (generatedFlags & (CURL_HTTPPOST_PTRCONTENTS | CURL_HTTPPOST_READFILE)) {
						return_value = CURL_FORMADD_OPTION_TWICE;
					} else {
							byte filename = array_state ? array_value : (int)params;
							if (ModernizedCProgram.filename) {
								current_form.setValue(.Curl_cstrdup(ModernizedCProgram.filename));
								if (!generatedValue) {
									return_value = CURL_FORMADD_MEMORY;
								} else {
										generatedFlags |=  CURL_HTTPPOST_READFILE;
										current_form.setValue_alloc(1);
								} 
							} else {
									return_value = CURL_FORMADD_NULL;
							} 
					} 
					break;
			case CURLFORM_BUFFERLENGTH:
					if (generatedBufferlength) {
						return_value = CURL_FORMADD_OPTION_TWICE;
					} else {
							current_form.setBufferlength(array_state ? (size_t)array_value : (size_t)(int)params);
					} 
					break;
			case /* We upload a file */CURLFORM_FILE:
					{ 
						byte filename = array_state ? array_value : (int)params;
						if (generatedValue) {
							if (generatedFlags & CURL_HTTPPOST_FILENAME) {
								if (ModernizedCProgram.filename) {
									byte fname = .Curl_cstrdup(ModernizedCProgram.filename);
									if (!fname) {
										return_value = CURL_FORMADD_MEMORY;
									} else {
											form = current_form.AddFormInfo(fname, ((Object)0));
											if (!form) {
												.Curl_cfree(fname);
												return_value = CURL_FORMADD_MEMORY;
											} else {
													form.setValue_alloc(1);
													current_form = form;
													form = ((Object)0);
											} 
									} 
								} else {
										return_value = CURL_FORMADD_NULL;
								} 
							} else {
									return_value = CURL_FORMADD_OPTION_TWICE;
							} 
						} else {
								if (ModernizedCProgram.filename) {
									current_form.setValue(.Curl_cstrdup(ModernizedCProgram.filename));
									if (!generatedValue) {
										return_value = CURL_FORMADD_MEMORY;
									} else {
											generatedFlags |=  CURL_HTTPPOST_FILENAME;
											current_form.setValue_alloc(1);
									} 
								} else {
										return_value = CURL_FORMADD_NULL;
								} 
						} 
						break;
					}
			case CURLFORM_BUFFER:
					{ 
						byte filename = array_state ? array_value : (int)params;
						if (generatedShowfilename) {
							return_value = CURL_FORMADD_OPTION_TWICE;
						} else {
								current_form.setShowfilename(.Curl_cstrdup(ModernizedCProgram.filename));
								if (!generatedShowfilename) {
									return_value = CURL_FORMADD_MEMORY;
								} else {
										current_form.setShowfilename_alloc(1);
								} 
						} 
						break;
					}
			case CURLFORM_CONTENTLEN:
					generatedFlags |=  CURL_HTTPPOST_LARGE;
					current_form.setContentslength(array_state ? ()(size_t)array_value : (int)params);
					break;
			case CURLFORM_FILENAME:
			default:
					return_value = CURL_FORMADD_UNKNOWN_OPTION;
					break;
			}
		}
		 generatedName_alloc = ptr.getName_alloc();
		 generatedValue_alloc = ptr.getValue_alloc();
		 generatedContenttype_alloc = ptr.getContenttype_alloc();
		 generatedShowfilename_alloc = ptr.getShowfilename_alloc();
		FormInfo generatedMore = ptr.getMore();
		if (CURL_FORMADD_OK != return_value/* On error, free allocated fields for all nodes of the FormInfo linked
		       list without deallocating nodes. List nodes are deallocated later on */) {
			FormInfo ptr = new FormInfo();
			for (ptr = first_form; ptr != ((Object)0); ptr = generatedMore) {
				if (generatedName_alloc) {
					do {
						.Curl_cfree((generatedName));
						(generatedName) = ((Object)0);
					} while (0);
					ptr.setName_alloc(0);
				} 
				if (generatedValue_alloc) {
					do {
						.Curl_cfree((generatedValue));
						(generatedValue) = ((Object)0);
					} while (0);
					ptr.setValue_alloc(0);
				} 
				if (generatedContenttype_alloc) {
					do {
						.Curl_cfree((generatedContenttype));
						(generatedContenttype) = ((Object)0);
					} while (0);
					ptr.setContenttype_alloc(0);
				} 
				if (generatedShowfilename_alloc) {
					do {
						.Curl_cfree((generatedShowfilename));
						(generatedShowfilename) = ((Object)0);
					} while (0);
					ptr.setShowfilename_alloc(0);
				} 
			}
		} 
		Object generatedContentslength = form.getContentslength();
		if (CURL_FORMADD_OK == return_value/* go through the list, check for completeness and if everything is
		     * alright add the HttpPost item otherwise set return_value accordingly */) {
			post = ((Object)0);
			for (form = first_form; form != ((Object)0); form = generatedMore) {
				if (((!generatedName || !generatedValue) && !post) || ((generatedContentslength) && (generatedFlags & CURL_HTTPPOST_FILENAME)) || ((generatedFlags & CURL_HTTPPOST_FILENAME) && (generatedFlags & CURL_HTTPPOST_PTRCONTENTS)) || ((!generatedBuffer) && (generatedFlags & CURL_HTTPPOST_BUFFER) && (generatedFlags & CURL_HTTPPOST_PTRBUFFER)) || ((generatedFlags & CURL_HTTPPOST_READFILE) && (generatedFlags & CURL_HTTPPOST_PTRCONTENTS))) {
					return_value = CURL_FORMADD_INCOMPLETE;
					break;
				} 
				if (((generatedFlags & CURL_HTTPPOST_FILENAME) || (generatedFlags & CURL_HTTPPOST_BUFFER)) && !generatedContenttype) {
					byte f = (generatedFlags & CURL_HTTPPOST_BUFFER) ? generatedShowfilename : generatedValue;
					byte type;
					type = ModernizedCProgram.Curl_mime_contenttype(f);
					if (!type) {
						type = prevtype;
					} 
					if (!type) {
						type = "application/octet-stream";
					} 
					form.setContenttype(.Curl_cstrdup(/* our contenttype is missing */type));
					if (!generatedContenttype) {
						return_value = CURL_FORMADD_MEMORY;
						break;
					} 
					form.setContenttype_alloc(1);
				} 
				if (generatedName && generatedNamelength) {
					size_t i = new size_t();
					for (i = 0; i < generatedNamelength; i++) {
						if (!generatedName[i]) {
							return_value = CURL_FORMADD_NULL;
							break;
						} 
					}
					if (return_value != CURL_FORMADD_OK) {
						break;
					} 
				} 
				if (!(generatedFlags & CURL_HTTPPOST_PTRNAME) && (form == first_form/* Note that there's small risk that form->name is NULL here if the
				           app passed in a bad combo, so we better check for that first. */)) {
					if (generatedName) {
						form.setName(ModernizedCProgram.Curl_memdup(generatedName, generatedNamelength ? generatedNamelength : .strlen(generatedName) + 1));
					} 
					if (!generatedName) {
						return_value = CURL_FORMADD_MEMORY;
						break;
					} 
					form.setName_alloc(1);
				} 
				if (!(generatedFlags & (CURL_HTTPPOST_FILENAME | CURL_HTTPPOST_READFILE | CURL_HTTPPOST_PTRCONTENTS | CURL_HTTPPOST_PTRBUFFER | CURL_HTTPPOST_CALLBACK)) && generatedValue) {
					size_t clen = (size_t)generatedContentslength;
					if (!clen) {
						clen = .strlen(generatedValue) + 1;
					} 
					form.setValue(ModernizedCProgram.Curl_memdup(generatedValue, clen));
					if (!generatedValue) {
						return_value = CURL_FORMADD_MEMORY;
						break;
					} 
					form.setValue_alloc(1);
				} 
				post = post.AddHttpPost(generatedName, generatedNamelength, generatedValue, generatedContentslength, generatedBuffer, generatedBufferlength, generatedContenttype, generatedFlags, generatedContentheader, generatedShowfilename, generatedUserp, httppost, last_post);
				if (!post) {
					return_value = CURL_FORMADD_MEMORY;
					break;
				} 
				if (generatedContenttype) {
					prevtype = generatedContenttype;
				} 
			}
			if (CURL_FORMADD_OK != return_value/* On error, free allocated fields for nodes of the FormInfo linked
			         list which are not already owned by the httppost linked list
			         without deallocating nodes. List nodes are deallocated later on */) {
				FormInfo ptr = new FormInfo();
				for (ptr = form; ptr != ((Object)0); ptr = generatedMore) {
					if (generatedName_alloc) {
						do {
							.Curl_cfree((generatedName));
							(generatedName) = ((Object)0);
						} while (0);
						ptr.setName_alloc(0);
					} 
					if (generatedValue_alloc) {
						do {
							.Curl_cfree((generatedValue));
							(generatedValue) = ((Object)0);
						} while (0);
						ptr.setValue_alloc(0);
					} 
					if (generatedContenttype_alloc) {
						do {
							.Curl_cfree((generatedContenttype));
							(generatedContenttype) = ((Object)0);
						} while (0);
						ptr.setContenttype_alloc(0);
					} 
					if (generatedShowfilename_alloc) {
						do {
							.Curl_cfree((generatedShowfilename));
							(generatedShowfilename) = ((Object)0);
						} while (0);
						ptr.setShowfilename_alloc(0);
					} 
				}
			} 
		} 
		while (/* Always deallocate FormInfo linked list nodes without touching node
		     fields given that these have either been deallocated or are owned
		     now by the httppost linked list */first_form) {
			FormInfo ptr = generatedMore;
			.Curl_cfree(first_form);
			first_form = ptr;
		}
		return return_value/*
		 * curl_formadd() is a public API to add a section to the multipart formpost.
		 *
		 * @unittest: 1308
		 */;
	}
	public Object curl_formadd(curl_httppost last_post) {
		va_list arg = new va_list();
		 result = new ();
		.__builtin_va_start(arg, last_post);
		result = httppost.FormAdd(last_post, arg);
		.__builtin_va_end(arg);
		return result/*
		 * curl_formget()
		 * Serialize a curl_httppost struct.
		 * Returns 0 on success.
		 *
		 * @unittest: 1308
		 */;
	}
	public int curl_formget(Object arg, Object append) {
		 result = new ();
		 toppart = new ();
		((Object)/* default form is empty */0).Curl_mime_initpart(toppart);
		result = ModernizedCProgram.Curl_getformdata(((Object)0), toppart, form, ((Object)0));
		if (!result) {
			result = ModernizedCProgram.Curl_mime_prepare_headers(toppart, "multipart/form-data", ((Object)0), mimestrategy.MIMESTRATEGY_FORM);
		} 
		while (!result) {
			byte[] buffer = new byte[8192];
			size_t nread = ModernizedCProgram.Curl_mime_read(ModernizedCProgram.buffer, 1, , toppart);
			if (!nread) {
				break;
			} 
			switch (nread) {
			case CURL_READFUNC_PAUSE:
					break;
			case CURL_READFUNC_ABORT:
			default:
					if (ModernizedCProgram.append(arg, ModernizedCProgram.buffer, nread) != nread) {
						result = CURLE_READ_ERROR;
					} 
					break;
			}
		}
		ModernizedCProgram.Curl_mime_cleanpart(toppart);
		return (int)result/*
		 * curl_formfree() is an external function to free up a whole form post
		 * chain
		 */;
	}
	public void curl_formfree() {
		curl_httppost next = new curl_httppost();
		if (!form/* no form to free, just get out of this */) {
			return ;
		} 
		Object generatedCurl_httppost = this.getCurl_httppost();
		do {
			next = generatedCurl_httppost;
			generatedCurl_httppost.curl_formfree();
			if (!(generatedCurl_httppost & CURL_HTTPPOST_PTRNAME)) {
				.Curl_cfree(generatedCurl_httppost);
			} 
			if (!(generatedCurl_httppost & (CURL_HTTPPOST_PTRCONTENTS | CURL_HTTPPOST_BUFFER | CURL_HTTPPOST_CALLBACK))) {
				.Curl_cfree(generatedCurl_httppost);
			} 
			.Curl_cfree(generatedCurl_httppost);
			.Curl_cfree(generatedCurl_httppost);
			.Curl_cfree(/* free the struct */form);
			form = next;
		} while (/* continue */form);
	}
	public  curl_formadd_ccsid(curl_httppost last_post) {
		va_list arg = new va_list();
		CURLformoption option = new CURLformoption();
		CURLFORMcode result = new CURLFORMcode();
		curl_forms forms = new curl_forms();
		curl_forms lforms = new curl_forms();
		curl_forms tforms = new curl_forms();
		int lformlen;
		byte value;
		int ccsid;
		int nargs;
		int namex;
		int namelengthx;
		int contentx;
		int lengthx;
		int contentccsid;
		int nameccsid;
		/* A single curl_formadd() call cannot be split in several calls to deal
		     with all parameters: the original parameters are thus copied to a local
		     curl_forms array and converted to ASCII when needed.
		     CURLFORM_PTRNAME is processed as if it were CURLFORM_COPYNAME.
		     CURLFORM_COPYNAME and CURLFORM_NAMELENGTH occurrence order in
		     parameters is not defined; for this reason, the actual conversion is
		     delayed to the end of parameter processing. The same applies to
		     CURLFORM_COPYCONTENTS/CURLFORM_CONTENTSLENGTH, but these may appear
		     several times in the parameter list; the problem resides here in knowing
		     which CURLFORM_CONTENTSLENGTH applies to which CURLFORM_COPYCONTENTS and
		     when we can be sure to have both info for conversion: end of parameter
		     list is such a point, but CURLFORM_CONTENTTYPE is also used here as a
		     natural separator between content data definitions; this seems to be
		     in accordance with FormAdd() behavior. */
		lformlen = /* Allocate the local curl_forms array. */8;
		lforms = .malloc(lformlen * );
		if (!lforms) {
			return .CURL_FORMADD_MEMORY/* Process the arguments, copying them into local array, latching conversion
			     indexes and converting when needed. */;
		} 
		result = .CURL_FORMADD_OK;
		nargs = 0;
		contentx = -1;
		lengthx = -1;
		namex = -1;
		namelengthx = -1;
		forms = (curl_forms)((Object)0);
		.__builtin_va_start(arg, last_post);
		 generatedOption = forms.getOption();
		Object generatedValue = forms.getValue();
		for (; ; ) {
			if (nargs >= lformlen) {
				lformlen += 8;
				tforms = .realloc(lforms, lformlen * );
				if (!tforms) {
					result = .CURL_FORMADD_MEMORY;
					break;
				} 
				lforms = tforms;
			} 
			if (/* Get next option. */forms/* Get option from array. */) {
				option = generatedOption;
				value = generatedValue;
				forms++;
			} else {
					option = (int)/* Get option from arguments. */arg;
					if (option == .CURLFORM_END) {
						break;
					} 
			} 
			switch (/* Dispatch by option. */option) {
			case .CURLFORM_CONTENTSLENGTH:
					lengthx = nargs;
					if (!forms) {
						value = (byte)(int)arg;
					} 
					break;
			case .CURLFORM_END:
					forms = (curl_forms)((Object)/* Leave array mode. */0);
					continue;
			case .CURLFORM_STREAM:
					if (!forms) {
						value = (byte)(int)arg;
					} 
					break;
			case .CURLFORM_ARRAY:
					if (!forms) {
						forms = (int)arg;
						continue;
					} 
					result = .CURL_FORMADD_ILLEGAL_ARRAY;
					break;
			case .CURLFORM_PTRCONTENTS:
			case .CURLFORM_BUFFERLENGTH:
					if (!forms) {
						value = (byte)(int)arg;
					} 
					break;
			case .CURLFORM_BUFFERPTR:
					if (!forms) {
						value = (int)/* No conversion. */arg;
					} 
					break;
			case .CURLFORM_CONTENTLEN:
					lengthx = nargs;
					if (!forms) {
						value = (byte)(int)arg;
					} 
					break;
			case .CURLFORM_CONTENTHEADER:
					if (!forms) {
						value = (byte)(int)arg;
					} 
					break;
			case .CURLFORM_COPYNAME:
					option = /* Static for now. */.CURLFORM_PTRNAME;
			case .CURLFORM_COPYCONTENTS:
					if (contentx >= 0) {
						result = .CURL_FORMADD_OPTION_TWICE;
					} 
					contentx = nargs;
					if (!forms) {
						value = (int)arg;
						contentccsid = (int)(int)arg;
					} else {
							contentccsid = (int)generatedValue;
							forms++;
					} 
					break;
			case .CURLFORM_PTRNAME:
					if (namex >= 0) {
						result = .CURL_FORMADD_OPTION_TWICE;
					} 
					namex = nargs;
					if (!forms) {
						value = (int)arg;
						nameccsid = (int)(int)arg;
					} else {
							nameccsid = (int)generatedValue;
							forms++;
					} 
					break;
			case .CURLFORM_CONTENTTYPE/* If a previous content has been encountered, convert it now. */:
					if (lforms.Curl_formadd_convert(contentx, lengthx, contentccsid) < 0) {
						result = .CURL_FORMADD_MEMORY;
						break;
					} 
					contentx = -1;
					lengthx = -1/* Fall into default. */;
			case .CURLFORM_NAMELENGTH:
					namelengthx = nargs;
					if (!forms) {
						value = (byte)(int)arg;
					} 
					break;
			default:
					if (!ModernizedCProgram.Curl_is_formadd_string(option)) {
						result = .CURL_FORMADD_UNKNOWN_OPTION;
						break;
					} 
					if (!forms) {
						value = (int)arg;
						ccsid = (int)(int)arg;
					} else {
							ccsid = (int)generatedValue;
							forms++;
					} 
					lforms[nargs].setValue(/* Do the conversion. */value);
					if (lforms.Curl_formadd_convert(nargs, -1, ccsid) < 0) {
						result = .CURL_FORMADD_MEMORY;
						break;
					} 
					value = generatedValue;
			}
			if (result != .CURL_FORMADD_OK) {
				break;
			} 
			lforms[nargs].setValue(value);
			lforms[nargs++].setOption(option);
		}/* Make sure there is still room for an item in local array. */
		.__builtin_va_end(arg);
		if (result == .CURL_FORMADD_OK && namex >= /* Convert the name and the last content, now that we know their lengths. */0) {
			if (lforms.Curl_formadd_convert(namex, namelengthx, nameccsid) < 0) {
				result = .CURL_FORMADD_MEMORY;
			} else {
					lforms[namex].setOption(/* Force copy. */.CURLFORM_COPYNAME);
			} 
		} 
		if (result == .CURL_FORMADD_OK) {
			if (lforms.Curl_formadd_convert(contentx, lengthx, contentccsid) < 0) {
				result = .CURL_FORMADD_MEMORY;
			} else {
					contentx = -1;
			} 
		} 
		if (result == /* Do the formadd with our converted parameters. */.CURL_FORMADD_OK) {
			lforms[nargs].setOption(.CURLFORM_END);
			result = httppost.curl_formadd(last_post, .CURLFORM_ARRAY, lforms, .CURLFORM_END);
		} 
		lforms.Curl_formadd_release_local(nargs, /* Terminate. */contentx);
		return result;
	}
	public int curl_formget_ccsid(Object arg, Object append, int ccsid) {
		cfcdata lcfc = new cfcdata();
		lcfc.setAppend(append);
		lcfc.setArg(arg);
		lcfc.setCcsid(ccsid);
		return form.curl_formget((Object)lcfc, Curl_formget_callback_ccsid);
	}
	public curl_httppost getNext() {
		return next;
	}
	public void setNext(curl_httppost newNext) {
		next = newNext;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public long getNamelength() {
		return namelength;
	}
	public void setNamelength(long newNamelength) {
		namelength = newNamelength;
	}
	public Byte getContents() {
		return contents;
	}
	public void setContents(Byte newContents) {
		contents = newContents;
	}
	public long getContentslength() {
		return contentslength;
	}
	public void setContentslength(long newContentslength) {
		contentslength = newContentslength;
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public long getBufferlength() {
		return bufferlength;
	}
	public void setBufferlength(long newBufferlength) {
		bufferlength = newBufferlength;
	}
	public Byte getContenttype() {
		return contenttype;
	}
	public void setContenttype(Byte newContenttype) {
		contenttype = newContenttype;
	}
	public curl_slist getContentheader() {
		return contentheader;
	}
	public void setContentheader(curl_slist newContentheader) {
		contentheader = newContentheader;
	}
	public curl_httppost getMore() {
		return more;
	}
	public void setMore(curl_httppost newMore) {
		more = newMore;
	}
	public long getFlags() {
		return flags;
	}
	public void setFlags(long newFlags) {
		flags = newFlags;
	}
	public Byte getShowfilename() {
		return showfilename;
	}
	public void setShowfilename(Byte newShowfilename) {
		showfilename = newShowfilename;
	}
	public Object getUserp() {
		return userp;
	}
	public void setUserp(Object newUserp) {
		userp = newUserp;
	}
	public Object getContentlen() {
		return contentlen;
	}
	public void setContentlen(Object newContentlen) {
		contentlen = newContentlen;
	}
}
/*
 * callback function for curl_formget()
 * The void *arg pointer will be the one passed as second argument to
 *   curl_formget().
 * The character buffer passed to it must not be freed.
 * Should return the buffer length passed to it as the argument "len" on
 *   success.
 */
