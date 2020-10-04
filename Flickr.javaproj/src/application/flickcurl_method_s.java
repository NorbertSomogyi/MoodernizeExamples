package application;

public class flickcurl_method_s {
	private Byte name;
	private int needslogin;
	private Byte description;
	private Byte response;
	private Byte explanation;
	private flickcurl_arg_s[][] args;
	private int args_count;
	
	public flickcurl_method_s(Byte name, int needslogin, Byte description, Byte response, Byte explanation, flickcurl_arg_s[][] args, int args_count) {
		setName(name);
		setNeedslogin(needslogin);
		setDescription(description);
		setResponse(response);
		setExplanation(explanation);
		setArgs(args);
		setArgs_count(args_count);
	}
	public flickcurl_method_s() {
	}
	
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * method.c - Flickcurl method functions
	 *
	 * Copyright (C) 2007-2008, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_free_method:
	 * @method: method object
	 *
	 * Destructor for method object
	 */
	public void flickcurl_free_method() {
		int i;
		do {
			if (!method) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_method is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\method.c", 48, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Byte generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedName);
		} 
		Byte generatedDescription = this.getDescription();
		if (generatedDescription) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedDescription);
		} 
		Byte generatedResponse = this.getResponse();
		if (generatedResponse) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedResponse);
		} 
		Byte generatedExplanation = this.getExplanation();
		if (generatedExplanation) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedExplanation);
		} 
		int generatedArgs_count = this.getArgs_count();
		flickcurl_arg_s[][] generatedArgs = this.getArgs();
		for (i = 0; i < generatedArgs_count; i++) {
			generatedArgs[i].flickcurl_free_arg();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(method);
	}
	public flickcurl_method_s flickcurl_build_method(flickcurl_s fc, Object xpathCtx) {
		int expri;
		flickcurl_method method = (null);
		method = (flickcurl_method)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
		int generatedFailed = fc.getFailed();
		for (expri = 0; method_fields_table[expri].getXpath(); expri++) {
			flickcurl_method_field_type mft = method_fields_table[expri].getField();
			Byte string_value = fc.flickcurl_xpath_eval(xpathCtx, method_fields_table[expri].getXpath());
			switch (mft) {
			case .METHOD_FIELD_description:
					method.setDescription(string_value);
					string_value = (null);
					break;
			case .METHOD_FIELD_response:
					method.setResponse(string_value);
					string_value = (null);
					break;
			case .METHOD_FIELD_needslogin:
					method.setNeedslogin(/*Error: Function owner not recognized*/atoi(string_value));
					break;
			case .METHOD_FIELD_name:
					method.setName(string_value);
					string_value = (null);
					break;
			case .METHOD_FIELD_explanation:
					method.setExplanation(string_value);
					string_value = (null);
					break;
			default:
					fc.flickcurl_error("Unknown method field %d", (int)mft);
					fc.setFailed(1);
			}
			if (string_value) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(string_value);
			} 
			if (generatedFailed) {
				;
			} 
		}
		int generatedArgs_count = method.getArgs_count();
		flickcurl_arg_s flickcurl_arg_s = new flickcurl_arg_s();
		method.setArgs(flickcurl_arg_s.flickcurl_build_args(fc, /* As of 2007-04-15 - the response is different from the docs
		   * There is no /method/arguments element
		   */xpathCtx, ()"/rsp/arguments/argument", generatedArgs_count));
		return method;
	}
	public flickcurl_method_s flickcurl_reflection_getMethodInfo(flickcurl_s fc, Object name) {
		 doc = (null);
		 xpathCtx = (null);
		flickcurl_method method = (null);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("method_name", name);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.reflection.getMethodInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = /*Error: Function owner not recognized*/xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		flickcurl_method_s flickcurl_method_s = new flickcurl_method_s();
		method = flickcurl_method_s.flickcurl_build_method(fc, xpathCtx);
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			if (method) {
				method.flickcurl_free_method();
			} 
			method = (null);
		} 
		return method;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getNeedslogin() {
		return needslogin;
	}
	public void setNeedslogin(int newNeedslogin) {
		needslogin = newNeedslogin;
	}
	public Byte getDescription() {
		return description;
	}
	public void setDescription(Byte newDescription) {
		description = newDescription;
	}
	public Byte getResponse() {
		return response;
	}
	public void setResponse(Byte newResponse) {
		response = newResponse;
	}
	public Byte getExplanation() {
		return explanation;
	}
	public void setExplanation(Byte newExplanation) {
		explanation = newExplanation;
	}
	public flickcurl_arg_s[][] getArgs() {
		return args;
	}
	public void setArgs(flickcurl_arg_s[][] newArgs) {
		args = newArgs;
	}
	public int getArgs_count() {
		return args_count;
	}
	public void setArgs_count(int newArgs_count) {
		args_count = newArgs_count;
	}
}
