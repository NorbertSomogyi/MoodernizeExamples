package application;

public class flickcurl_comment_s {
	private byte[] id;
	private byte[] author;
	private byte[] authorname;
	private int datecreate;
	private byte[] permalink;
	private byte[] text;
	
	public flickcurl_comment_s(byte[] id, byte[] author, byte[] authorname, int datecreate, byte[] permalink, byte[] text) {
		setId(id);
		setAuthor(author);
		setAuthorname(authorname);
		setDatecreate(datecreate);
		setPermalink(permalink);
		setText(text);
	}
	public flickcurl_comment_s() {
	}
	
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * comments.c - Flickcurl method comment functions
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
	 * flickcurl_free_comment:
	 * @comment_object: comment object
	 *
	 * Destructor for comment object
	 */
	public void flickcurl_free_comment(flickcurl_comment_s[] comment_object) {
		do {
			if (!comment_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_comment is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\comments.c", 46, __func__);
				return ;
			} 
		} while (0);
		byte[] generatedId = comment_object.getId();
		if (generatedId) {
			.free(generatedId);
		} 
		byte[] generatedAuthor = comment_object.getAuthor();
		if (generatedAuthor) {
			.free(generatedAuthor);
		} 
		byte[] generatedAuthorname = comment_object.getAuthorname();
		if (generatedAuthorname) {
			.free(generatedAuthorname);
		} 
		byte[] generatedPermalink = comment_object.getPermalink();
		if (generatedPermalink) {
			.free(generatedPermalink);
		} 
		byte[] generatedText = comment_object.getText();
		if (generatedText) {
			.free(generatedText);
		} 
		.free(comment_object/**
		 * flickcurl_free_comments:
		 * @comments_object: comment object array
		 *
		 * Destructor for array of comment object
		 */);
	}
	public void flickcurl_free_comments(flickcurl_comment_s[][] comments_object) {
		int i;
		do {
			if (!comments_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_comment_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\comments.c", 74, __func__);
				return ;
			} 
		} while (0);
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		for (i = 0; comments_object[i]; i++) {
			flickcurl_comment_s.flickcurl_free_comment(comments_object[i]);
		}
		.free(comments_object);
	}
	public flickcurl_comment_s[][] flickcurl_build_comments(flickcurl_s[] fc, Object xpathCtx, Object[] xpathExpr, Integer comment_count_p) {
		flickcurl_comment[][] comments = ((Object)0);
		int nodes_count;
		int comment_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do comments */xpathCtx);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathObj) {
			flickcurl_s.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		comments = (flickcurl_comment).calloc(, nodes_count + 1);
		byte[] generatedText = comment_object.getText();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			[] attr = new ();
			flickcurl_comment[] comment_object = new flickcurl_comment();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				flickcurl_s.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			comment_object = (flickcurl_comment).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte[] attr_name = (byte)attr.getName();
				byte[] attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					comment_object.setId(attr_value);
				}  else if (!.strcmp(attr_name, "author")) {
					comment_object.setAuthor(attr_value);
				}  else if (!.strcmp(attr_name, "authorname")) {
					comment_object.setAuthorname(attr_value);
				}  else if (!.strcmp(attr_name, "datecreate")) {
					comment_object.setDatecreate(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "permalink")) {
					comment_object.setPermalink(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					comment_object.setText((byte).malloc(len + 1));
					.memcpy(generatedText, chnode.getContent(), len + 1);
					break;
				} 
			}
			comments[comment_count++] = comment_object/* for nodes */;
		}
		if (comment_count_p) {
			comment_count_p = comment_count;
		} 
		return comments;
	}
	public flickcurl_comment_s[][] flickcurl_photosets_comments_getList(flickcurl_s[] fc, Object[] photoset_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_comment[][] comments = ((Object)0);
		int comments_count = 0;
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		if (!photoset_id) {
			return ((Object)0);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_add_param(fc, "photoset_id", photoset_id);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.photosets.comments.getList")) {
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
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		comments = flickcurl_comment_s.flickcurl_build_comments(fc, xpathCtx, ()"/rsp/comments/comment", comments_count);
		int generatedFailed = fc.getFailed();
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		if (generatedFailed) {
			if (comments) {
				flickcurl_comment_s.flickcurl_free_comments(comments);
			} 
			comments = ((Object)0);
		} 
		return comments;
	}
	public flickcurl_comment_s[][] flickcurl_photos_comments_getList(flickcurl_s[] fc, Object[] photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_comment[][] comments = ((Object)0);
		int comments_count = 0;
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_add_param(fc, "photo_id", photo_id);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.photos.comments.getList")) {
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
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		comments = flickcurl_comment_s.flickcurl_build_comments(fc, xpathCtx, ()"/rsp/comments/comment", comments_count);
		int generatedFailed = fc.getFailed();
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		if (generatedFailed) {
			if (comments) {
				flickcurl_comment_s.flickcurl_free_comments(comments);
			} 
			comments = ((Object)0);
		} 
		return comments/**
		 * flickcurl_photos_comments_getRecentForContacts_params:
		 * @fc: flickcurl context
		 * @date_lastcomment: Limits the resultset to photos that have been commented on since this date. The date should be in the form of a Unix timestamp. The default, and maximum, offset is (1) hour (or <0)
		 * @contacts_filter: A comma-separated list of contact NSIDs to limit the scope of the query to (or NULL)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Return the list of photos belonging to your contacts that have
		 * been commented on recently.
		 *
		 * Implements flickr.photos.comments.getRecentForContacts (1.12)
		 * 
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public void command_print_comments(flickcurl_comment_s[][] comments, Object[] label, Object[] value) {
		int i;
		if (label) {
			.fprintf((_iob[1]), "%s: %s %s comments\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} 
		byte[] generatedId = comment_object.getId();
		byte[] generatedAuthor = comment_object.getAuthor();
		byte[] generatedAuthorname = comment_object.getAuthorname();
		int generatedDatecreate = comment_object.getDatecreate();
		byte[] generatedPermalink = comment_object.getPermalink();
		byte[] generatedText = comment_object.getText();
		for (i = 0; comments[i]; i++) {
			flickcurl_comment[] comment_object = comments[i];
			.fprintf((_iob[1]), "%d) ID %s author %s authorname %s datecreate %d permalink %s text '%s'\n", i, generatedId, generatedAuthor, generatedAuthorname, generatedDatecreate, generatedPermalink, generatedText);
		}
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
	public int getDatecreate() {
		return datecreate;
	}
	public void setDatecreate(int newDatecreate) {
		datecreate = newDatecreate;
	}
	public byte[] getPermalink() {
		return permalink;
	}
	public void setPermalink(byte[] newPermalink) {
		permalink = newPermalink;
	}
	public byte[] getText() {
		return text;
	}
	public void setText(byte[] newText) {
		text = newText;
	}
}
