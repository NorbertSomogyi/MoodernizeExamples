package application;

public class flickcurl_arg_s {
	private byte[] name;
	private int optional;
	private byte[] description;
	
	public flickcurl_arg_s(byte[] name, int optional, byte[] description) {
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
	public void flickcurl_free_arg(flickcurl_arg_s[] arg) {
		do {
			if (!arg) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_arg is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\args.c", 40, __func__);
				return ;
			} 
		} while (0);
		byte[] generatedName = arg.getName();
		if (generatedName) {
			.free(generatedName);
		} 
		byte[] generatedDescription = arg.getDescription();
		if (generatedDescription) {
			.free(generatedDescription);
		} 
		.free(arg);
	}
	public flickcurl_arg_s[][] flickcurl_build_args(flickcurl_s[] fc, Object xpathCtx, Object[] xpathExpr, Integer arg_count_p) {
		flickcurl_arg[][] args = ((Object)0);
		int nodes_count;
		int arg_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do args */xpathCtx);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathObj) {
			flickcurl_s.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		args = (flickcurl_arg).calloc(, nodes_count + 1);
		byte[] generatedName = arg.getName();
		byte[] generatedDescription = arg.getDescription();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			[] attr = new ();
			flickcurl_arg[] arg = new flickcurl_arg();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				flickcurl_s.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			arg = (flickcurl_arg).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte[] attr_name = (byte)attr.getName();
				if (!.strcmp(attr_name, "name")) {
					size_t len = .strlen((byte)attr.getChildren().getContent());
					arg.setName((byte).malloc(len + 1));
					.memcpy(generatedName, attr.getChildren().getContent(), len + 1);
				}  else if (!.strcmp(attr_name, "optional")) {
					arg.setOptional(.atoi((byte)attr.getChildren().getContent()));
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					arg.setDescription((byte).malloc(len + 1));
					.memcpy(generatedDescription, (byte)chnode.getContent(), len + 1);
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
	public byte[] getName() {
		return name;
	}
	public void setName(byte[] newName) {
		name = newName;
	}
	public int getOptional() {
		return optional;
	}
	public void setOptional(int newOptional) {
		optional = newOptional;
	}
	public byte[] getDescription() {
		return description;
	}
	public void setDescription(byte[] newDescription) {
		description = newDescription;
	}
}
