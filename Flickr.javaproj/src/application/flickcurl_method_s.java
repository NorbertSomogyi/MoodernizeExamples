package application;

public class flickcurl_method_s {
	private byte[] name;
	private int needslogin;
	private byte[] description;
	private byte[] response;
	private byte[] explanation;
	private flickcurl_arg_s[][] args;
	private int args_count;
	
	public flickcurl_method_s(byte[] name, int needslogin, byte[] description, byte[] response, byte[] explanation, flickcurl_arg_s[][] args, int args_count) {
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
	
	public flickcurl_method_s[] flickcurl_reflection_getMethodInfo(flickcurl_s[] fc, Object[] name) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_method[] method = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_add_param(fc, "method_name", name);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.reflection.getMethodInfo")) {
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		doc = flickcurl_s.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathCtx) {
			flickcurl_s.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		flickcurl_method_s flickcurl_method_s = new flickcurl_method_s();
		method = flickcurl_method_s.flickcurl_build_method(fc, xpathCtx);
		int generatedFailed = fc.getFailed();
		flickcurl_method_s flickcurl_method_s = new flickcurl_method_s();
		if (generatedFailed) {
			if (method) {
				flickcurl_method_s.flickcurl_free_method(method);
			} 
			method = ((Object)0);
		} 
		return method;
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
	public void flickcurl_free_method(flickcurl_method_s[] method) {
		int i;
		do {
			if (!method) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_method is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\method.c", 48, __func__);
				return ;
			} 
		} while (0);
		byte[] generatedName = method.getName();
		if (generatedName) {
			.free(generatedName);
		} 
		byte[] generatedDescription = method.getDescription();
		if (generatedDescription) {
			.free(generatedDescription);
		} 
		byte[] generatedResponse = method.getResponse();
		if (generatedResponse) {
			.free(generatedResponse);
		} 
		byte[] generatedExplanation = method.getExplanation();
		if (generatedExplanation) {
			.free(generatedExplanation);
		} 
		int generatedArgs_count = method.getArgs_count();
		flickcurl_arg_s[][] generatedArgs = method.getArgs();
		flickcurl_arg_s flickcurl_arg_s = new flickcurl_arg_s();
		for (i = 0; i < generatedArgs_count; i++) {
			flickcurl_arg_s.flickcurl_free_arg(generatedArgs[i]);
		}
		.free(method);
	}
	public flickcurl_method_s[] flickcurl_build_method(flickcurl_s[] fc, Object xpathCtx) {
		int expri;
		flickcurl_method[] method = ((Object)0);
		method = (flickcurl_method).calloc(, 1);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s flickcurl_s = new flickcurl_s();
		int generatedFailed = fc.getFailed();
		for (expri = 0; method_fields_table[expri].getXpath(); expri++) {
			flickcurl_method_field_type mft = method_fields_table[expri].getField();
			byte[] string_value = flickcurl_s.flickcurl_xpath_eval(fc, xpathCtx, method_fields_table[expri].getXpath());
			switch (mft) {
			case .METHOD_FIELD_description:
					method.setDescription(string_value);
					string_value = ((Object)0);
					break;
			case .METHOD_FIELD_explanation:
					method.setExplanation(string_value);
					string_value = ((Object)0);
					break;
			case .METHOD_FIELD_needslogin:
					method.setNeedslogin(.atoi(string_value));
					break;
			case .METHOD_FIELD_response:
					method.setResponse(string_value);
					string_value = ((Object)0);
					break;
			case .METHOD_FIELD_name:
					method.setName(string_value);
					string_value = ((Object)0);
					break;
			default:
					flickcurl_s.flickcurl_error(fc, "Unknown method field %d", (int)mft);
					fc.setFailed(1);
			}
			if (string_value) {
				.free(string_value);
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
	public byte[] getName() {
		return name;
	}
	public void setName(byte[] newName) {
		name = newName;
	}
	public int getNeedslogin() {
		return needslogin;
	}
	public void setNeedslogin(int newNeedslogin) {
		needslogin = newNeedslogin;
	}
	public byte[] getDescription() {
		return description;
	}
	public void setDescription(byte[] newDescription) {
		description = newDescription;
	}
	public byte[] getResponse() {
		return response;
	}
	public void setResponse(byte[] newResponse) {
		response = newResponse;
	}
	public byte[] getExplanation() {
		return explanation;
	}
	public void setExplanation(byte[] newExplanation) {
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
