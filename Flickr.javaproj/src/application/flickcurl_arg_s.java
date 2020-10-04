package application;

public class flickcurl_arg_s {
	private Byte name;
	private int optional;
	private Byte description;
	
	public flickcurl_arg_s(Byte name, int optional, Byte description) {
		setName(name);
		setOptional(optional);
		setDescription(description);
	}
	public flickcurl_arg_s() {
	}
	
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * args.c - Flickcurl method arg functions
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
	public void flickcurl_free_arg() {
		do {
			if (!arg) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_arg is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\args.c", 40, __func__);
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
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(arg);
	}
	public flickcurl_arg_s flickcurl_build_args(flickcurl_s fc, Object xpathCtx, Object xpathExpr, Integer arg_count_p) {
		flickcurl_arg[][] args = (null);
		int nodes_count;
		int arg_count;
		int i;
		 xpathObj = (null);
		 nodes = new ();
		xpathObj = /*Error: Function owner not recognized*/xmlXPathEvalExpression(xpathExpr, /* Now do args */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = /*Error: Function owner not recognized*/xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		args = (flickcurl_arg)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, nodes_count + 1);
		Byte generatedName = arg.getName();
		Byte generatedDescription = arg.getDescription();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_arg arg = new flickcurl_arg();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			arg = (flickcurl_arg)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				Byte attr_name = (byte)attr.getName();
				if (!/*Error: Function owner not recognized*/strcmp(attr_name, "name")) {
					size_t len = /*Error: Function owner not recognized*/strlen((byte)attr.getChildren().getContent());
					arg.setName((byte)/*Error: Function owner not recognized*/malloc(len + 1));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, attr.getChildren().getContent(), len + 1);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "optional")) {
					arg.setOptional(/*Error: Function owner not recognized*/atoi((byte)attr.getChildren().getContent()));
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = /*Error: Function owner not recognized*/strlen((byte)chnode.getContent());
					arg.setDescription((byte)/*Error: Function owner not recognized*/malloc(len + 1));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedDescription, (byte)chnode.getContent(), len + 1);
					break;
				} 
			}
			args[arg_count++] = arg/* for nodes */;
		}
		if (arg_count_p) {
			arg_count_p = arg_count;
		} 
		return args;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getOptional() {
		return optional;
	}
	public void setOptional(int newOptional) {
		optional = newOptional;
	}
	public Byte getDescription() {
		return description;
	}
	public void setDescription(Byte newDescription) {
		description = newDescription;
	}
}
