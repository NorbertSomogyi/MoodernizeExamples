package application;

public class flickcurl_tag_s {
	private flickcurl_photo_s[] photo;
	private byte[] id;
	private byte[] author;
	private byte[] authorname;
	private byte[] raw;
	private byte[] cooked;
	private int machine_tag;
	private int count;
	
	public flickcurl_tag_s(flickcurl_photo_s[] photo, byte[] id, byte[] author, byte[] authorname, byte[] raw, byte[] cooked, int machine_tag, int count) {
		setPhoto(photo);
		setId(id);
		setAuthor(author);
		setAuthorname(authorname);
		setRaw(raw);
		setCooked(cooked);
		setMachine_tag(machine_tag);
		setCount(count);
	}
	public flickcurl_tag_s() {
	}
	
	public flickcurl_tag_s[][] flickcurl_tags_getHotList(flickcurl_s[] fc, Object[] period, int tag_count) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag[][] tags = ((Object)0);
		byte[] tag_count_str = new byte[10];
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (period) {
			if (!.strcmp(period, "day") || !.strcmp(period, "week")) {
				flickcurl_s.flickcurl_add_param(fc, "period", period);
			} else {
					return ((Object)0);
			} 
		} 
		if (tag_count >= 0) {
			.sprintf(tag_count_str, "%d", tag_count);
			flickcurl_s.flickcurl_add_param(fc, "count", tag_count_str);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.tags.getHotList")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/hottags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListPhoto:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 *
		 * Get the tag list for a given photo.
		 *
		 * Implements flickr.tags.getListPhoto (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public flickcurl_tag_s[][] flickcurl_tags_getListPhoto(flickcurl_s[] fc, Object[] photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag[][] tags = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_add_param(fc, "photo_id", photo_id);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.tags.getListPhoto")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/photo/tags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListUser:
		 * @fc: flickcurl context
		 * @user_id: user NSID (or NULL)
		 *
		 * Get the tag list for a given user (or current user)
		 *
		 * Implements flickr.tags.getListUser (0.9)
		 * 
		 * FIXME: API docs says user_id is optional but it is not.
		 *
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public flickcurl_tag_s[][] flickcurl_tags_getListUser(flickcurl_s[] fc, Object[] user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag[][] tags = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (user_id) {
			flickcurl_s.flickcurl_add_param(fc, "user_id", user_id);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.tags.getListUser")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListUserPopular:
		 * @fc: flickcurl context
		 * @user_id: user NSID (or NULL)
		 * @pop_count: number of popular tags to return (or <0 for default)
		 *
		 * Get the popular tag list for a given user (or current user)
		 *
		 * Implements flickr.tags.getListUserPopular (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public flickcurl_tag_s[][] flickcurl_tags_getListUserPopular(flickcurl_s[] fc, Object[] user_id, int pop_count) {
		byte[] pop_count_str = new byte[10];
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag[][] tags = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (user_id) {
			flickcurl_s.flickcurl_add_param(fc, "user_id", user_id);
		} 
		if (pop_count >= 0) {
			.sprintf(pop_count_str, "%d", pop_count);
			flickcurl_s.flickcurl_add_param(fc, "count", pop_count_str);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.tags.getListUserPopular")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListUserRaw:
		 * @fc: flickcurl context
		 * @tag: tag to get raw version of (or NULL for all)
		 *
		 * Get the raw versions of a given tag (or all tags) for the currently logged-in user.
		 *
		 * Implements flickr.tags.getListUserRaw (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public flickcurl_tag_s[][] flickcurl_tags_getListUserRaw(flickcurl_s[] fc, Object[] tag) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag[][] tags = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (tag) {
			flickcurl_s.flickcurl_add_param(fc, "tag", tag);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.tags.getListUserRaw")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getMostFrequentlyUsed:
		 * @fc: flickcurl context
		 *
		 * Returns a list of most frequently used tags for a user.
		 *
		 * Implements flickr.tags.getMostFrequentlyUsed (1.25)
		 *
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public flickcurl_tag_s[][] flickcurl_tags_getMostFrequentlyUsed(flickcurl_s[] fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag[][] tags = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.tags.getMostFrequentlyUsed")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getRelated:
		 * @fc: flickcurl context
		 * @tag: tag to fetch related tags for
		 *
		 * Get a list of tags 'related' to the given tag, based on clustered usage analysis.
		 *
		 * Implements flickr.tags.getRelated (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public flickcurl_tag_s[][] flickcurl_tags_getRelated(flickcurl_s[] fc, Object[] tag) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag[][] tags = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		if (!tag) {
			return ((Object)0);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_add_param(fc, "tag", tag);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.tags.getRelated")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/tags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags;
	}
	public void command_print_tags(flickcurl_tag_s[][] tags, Object[] label, Object[] value) {
		int i;
		if (!tags) {
			return ;
		} 
		if (label) {
			.fprintf((_iob[1]), "%s: %s %s tags\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} else {
				.fprintf((_iob[1]), "tags:\n");
		} 
		int generatedMachine_tag = tag.getMachine_tag();
		byte[] generatedId = tag.getId();
		byte[] generatedAuthor = tag.getAuthor();
		byte[] generatedAuthorname = tag.getAuthorname();
		byte[] generatedRaw = tag.getRaw();
		byte[] generatedCooked = tag.getCooked();
		int generatedCount = tag.getCount();
		for (i = 0; tags[i]; i++) {
			flickcurl_tag[] tag = tags[i];
			.fprintf((_iob[1]), "%d) %s tag: id %s author ID %s name %s raw '%s' cooked '%s' count %d\n", i, (generatedMachine_tag ? "machine" : "regular"), generatedId, generatedAuthor, (generatedAuthorname ? generatedAuthorname : "(Unknown)"), generatedRaw, generatedCooked, generatedCount);
		}
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * tag.c - Flickcurl tag functions
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
	 * flickcurl_free_tag:
	 * @t: tag object
	 *
	 * Destructor for tag object
	 */
	public void flickcurl_free_tag(flickcurl_tag_s[] t) {
		do {
			if (!t) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 46, __func__);
				return ;
			} 
		} while (0);
		byte[] generatedId = t.getId();
		if (generatedId) {
			.free(generatedId);
		} 
		byte[] generatedAuthor = t.getAuthor();
		if (generatedAuthor) {
			.free(generatedAuthor);
		} 
		byte[] generatedAuthorname = t.getAuthorname();
		if (generatedAuthorname) {
			.free(generatedAuthorname);
		} 
		byte[] generatedRaw = t.getRaw();
		if (generatedRaw) {
			.free(generatedRaw);
		} 
		byte[] generatedCooked = t.getCooked();
		if (generatedCooked) {
			.free(generatedCooked);
		} 
		.free(t/**
		 * flickcurl_free_tags:
		 * @tags: tag object array
		 *
		 * Destructor for array of tag objects
		 */);
	}
	public void flickcurl_free_tags(flickcurl_tag_s[][] tags) {
		int i;
		do {
			if (!tags) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 72, __func__);
				return ;
			} 
		} while (0);
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		for (i = 0; tags[i]; i++) {
			flickcurl_tag_s.flickcurl_free_tag(tags[i]);
		}
		.free(tags);
	}
	public flickcurl_tag_s[][] flickcurl_build_tags(flickcurl_s[] fc, flickcurl_photo_s[] photo, Object xpathCtx, Object[] xpathExpr, Integer tag_count_p) {
		flickcurl_tag[][] tags = ((Object)0);
		int nodes_count;
		int tag_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do tags */xpathCtx);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathObj) {
			flickcurl_s.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tags = (flickcurl_tag).calloc(, nodes_count + 1);
		byte[] generatedRaw = t.getRaw();
		byte[] generatedCooked = t.getCooked();
		Object generatedTag_handler = fc.getTag_handler();
		Object[] generatedTag_data = fc.getTag_data();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			[] attr = new ();
			flickcurl_tag[] t = new flickcurl_tag();
			int saw_clean = 0;
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				flickcurl_s.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			t = (flickcurl_tag).calloc(, 1);
			t.setPhoto(photo);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte[] attr_name = (byte)attr.getName();
				byte[] attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					t.setId(attr_value);
				}  else if (!.strcmp(attr_name, "author")) {
					t.setAuthor(attr_value);
				}  else if (!.strcmp(attr_name, "authorname")) {
					t.setAuthorname(attr_value);
				}  else if (!.strcmp(attr_name, "raw")) {
					t.setRaw(attr_value);
				}  else if (!.strcmp(attr_name, "clean")) {
					t.setCooked(attr_value/* If we see @clean we are expecting
					         * <tag clean = "cooked"><raw>raw</raw></tag>
					         */);
					saw_clean = 1;
				}  else if (!.strcmp(attr_name, "machine_tag")) {
					t.setMachine_tag(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "count")) {
					t.setCount(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "score")) {
					t.setCount(.atoi(/* from tags.getHotList <tag score = "NN">TAG</tag> */attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte[] chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (saw_clean && !.strcmp(chnode_name, "raw")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						t.setRaw((byte).malloc(len + 1));
						.memcpy(generatedRaw, chnode.getChildren().getContent(), len + 1);
					} 
				}  else if (chnode.getType() == XML_TEXT_NODE) {
					if (!saw_clean) {
						size_t len = .strlen((byte)chnode.getContent());
						t.setCooked((byte).malloc(len + 1));
						.memcpy(generatedCooked, chnode.getContent(), len + 1);
					} 
				} 
			}
			if (generatedTag_handler) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedTag_data, t);
			} 
			tags[tag_count++] = t/* for nodes */;
		}
		if (tag_count_p) {
			tag_count_p = tag_count;
		} 
		return tags;
	}
	public flickcurl_tag_s[][] flickcurl_build_tags_from_string(flickcurl_s[] fc, flickcurl_photo_s[] photo, Object[] string, Integer tag_count_p) {
		flickcurl_tag[][] tags = ((Object)0);
		int nodes_count;
		int tag_count;
		int i;
		nodes_count = 0;
		for (i = 0; string[i]; i++) {
			if (string[i] == (byte)' ') {
				nodes_count++;
			} 
		}
		tags = (flickcurl_tag).calloc(, nodes_count + 1);
		byte[] generatedCooked = t.getCooked();
		Object generatedTag_handler = fc.getTag_handler();
		Object[] generatedTag_data = fc.getTag_data();
		for (; i < nodes_count; i++) {
			flickcurl_tag[] t = new flickcurl_tag();
			byte[] p = string;
			size_t len = new size_t();
			t = (flickcurl_tag).calloc(, 1);
			t.setPhoto(photo);
			while (p && p != (byte)' ') {
				p++;
			}
			len = p - string;
			t.setCooked((byte).malloc(len + 1));
			.memcpy(generatedCooked, string, len);
			generatedCooked[len] = (byte)'\0';
			if (generatedTag_handler) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedTag_data, t);
			} 
			tags[tag_count++] = t;
			string = p + /* move past space */1;
		}
		if (tag_count_p) {
			tag_count_p = tag_count;
		} 
		return tags/*
		 * flickcurl_free_tag_cluster:
		 * @tc: tag cluster object
		 *
		 * INTERNAL - Destructor for tag cluster object
		 */;
	}
	public flickcurl_tag_s[][] flickcurl_places_tagsForPlace(flickcurl_s[] fc, int woe_id, Object[] place_id, int min_upload_date, int max_upload_date, int min_taken_date, int max_taken_date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] woe_id_str = new byte[20];
		byte[] min_upload_date_str = new byte[20];
		byte[] max_upload_date_str = new byte[20];
		byte[] min_taken_date_str = new byte[20];
		byte[] max_taken_date_str = new byte[20];
		flickcurl_tag[][] tags = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		if (woe_id < 0 && !place_id) {
			return ((Object)0);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			flickcurl_s.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} 
		if (place_id) {
			flickcurl_s.flickcurl_add_param(fc, "place_id", place_id);
		} 
		if (min_upload_date) {
			.sprintf(min_upload_date_str, "%d", min_upload_date);
			flickcurl_s.flickcurl_add_param(fc, "min_upload_date", min_upload_date_str);
		} 
		if (min_upload_date) {
			.sprintf(min_upload_date_str, "%d", min_upload_date);
			flickcurl_s.flickcurl_add_param(fc, "max_upload_date", max_upload_date_str);
		} 
		if (max_upload_date) {
			.sprintf(max_upload_date_str, "%d", max_upload_date);
			flickcurl_s.flickcurl_add_param(fc, "min_taken_date", min_taken_date_str);
		} 
		if (min_taken_date) {
			.sprintf(min_taken_date_str, "%d", min_taken_date);
			flickcurl_s.flickcurl_add_param(fc, "max_taken_date", max_taken_date_str);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.places.tagsForPlace")) {
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
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/tags/tag", ((Object)0));
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		if (generatedFailed) {
			if (tags) {
				flickcurl_tag_s.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags;
	}
	public flickcurl_photo_s[] getPhoto() {
		return photo;
	}
	public void setPhoto(flickcurl_photo_s[] newPhoto) {
		photo = newPhoto;
	}
	public byte[] getId() {
		return id;
	}
	public void setId(byte[] newId) {
		id = newId;
	}
	public byte[] getAuthor() {
		return author;
	}
	public void setAuthor(byte[] newAuthor) {
		author = newAuthor;
	}
	public byte[] getAuthorname() {
		return authorname;
	}
	public void setAuthorname(byte[] newAuthorname) {
		authorname = newAuthorname;
	}
	public byte[] getRaw() {
		return raw;
	}
	public void setRaw(byte[] newRaw) {
		raw = newRaw;
	}
	public byte[] getCooked() {
		return cooked;
	}
	public void setCooked(byte[] newCooked) {
		cooked = newCooked;
	}
	public int getMachine_tag() {
		return machine_tag;
	}
	public void setMachine_tag(int newMachine_tag) {
		machine_tag = newMachine_tag;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
}
