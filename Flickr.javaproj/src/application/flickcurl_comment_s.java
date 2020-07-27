package application;

public class flickcurl_comment_s {
	private Byte id;
	private Byte author;
	private Byte authorname;
	private int datecreate;
	private Byte permalink;
	private Byte text;
	
	public flickcurl_comment_s(Byte id, Byte author, Byte authorname, int datecreate, Byte permalink, Byte text) {
		setId(id);
		setAuthor(author);
		setAuthorname(authorname);
		setDatecreate(datecreate);
		setPermalink(permalink);
		setText(text);
	}
	public flickcurl_comment_s() {
	}
	
	public flickcurl_comment_s flickcurl_photosets_comments_getList(flickcurl_s fc, Object photoset_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_comment comments = ((Object)0);
		int comments_count = 0;
		fc.flickcurl_init_params(0);
		if (!photoset_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.comments.getList")) {
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
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		comments = flickcurl_comment_s.flickcurl_build_comments(fc, xpathCtx, ()"/rsp/comments/comment", comments_count);
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			if (comments) {
				comments.flickcurl_free_comments();
			} 
			comments = ((Object)0);
		} 
		return comments;
	}
	public void command_print_comments(Object label, Object value) {
		int i;
		if (label) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: %s %s comments\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} 
		Byte generatedId = comment_object.getId();
		Byte generatedAuthor = comment_object.getAuthor();
		Byte generatedAuthorname = comment_object.getAuthorname();
		int generatedDatecreate = comment_object.getDatecreate();
		Byte generatedPermalink = comment_object.getPermalink();
		Byte generatedText = comment_object.getText();
		for (i = 0; comments[i]; i++) {
			flickcurl_comment comment_object = comments[i];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%d) ID %s author %s authorname %s datecreate %d permalink %s text '%s'\n", i, generatedId, generatedAuthor, generatedAuthorname, generatedDatecreate, generatedPermalink, generatedText);
		}
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
	public void flickcurl_free_comment() {
		do {
			if (!comment_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_comment is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\comments.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Byte generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Byte generatedAuthor = this.getAuthor();
		if (generatedAuthor) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedAuthor);
		} 
		Byte generatedAuthorname = this.getAuthorname();
		if (generatedAuthorname) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedAuthorname);
		} 
		Byte generatedPermalink = this.getPermalink();
		if (generatedPermalink) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedPermalink);
		} 
		Byte generatedText = this.getText();
		if (generatedText) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedText);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(comment_object/**
		 * flickcurl_free_comments:
		 * @comments_object: comment object array
		 *
		 * Destructor for array of comment object
		 */);
	}
	public void flickcurl_free_comments() {
		int i;
		do {
			if (!comments_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_comment_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\comments.c", 74, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; comments_object[i]; i++) {
			comments_object[i].flickcurl_free_comment();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(comments_object);
	}
	public flickcurl_comment_s flickcurl_build_comments(flickcurl_s fc, Object xpathCtx, Object xpathExpr, Integer comment_count_p) {
		flickcurl_comment comments = ((Object)0);
		int nodes_count;
		int comment_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = /*Error: Function owner not recognized*/xmlXPathEvalExpression(xpathExpr, /* Now do comments */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = /*Error: Function owner not recognized*/xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		comments = (flickcurl_comment)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, nodes_count + 1);
		Byte generatedText = comment_object.getText();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_comment comment_object = new flickcurl_comment();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			comment_object = (flickcurl_comment)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = /*Error: Function owner not recognized*/strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte)/*Error: Function owner not recognized*/malloc(attr_len + 1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!/*Error: Function owner not recognized*/strcmp(attr_name, "id")) {
					comment_object.setId(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "author")) {
					comment_object.setAuthor(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "authorname")) {
					comment_object.setAuthorname(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "datecreate")) {
					comment_object.setDatecreate(/*Error: Function owner not recognized*/atoi((byte)attr_value));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "permalink")) {
					comment_object.setPermalink(attr_value);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = /*Error: Function owner not recognized*/strlen((byte)chnode.getContent());
					comment_object.setText((byte)/*Error: Function owner not recognized*/malloc(len + 1));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedText, chnode.getContent(), len + 1);
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
	public flickcurl_comment_s flickcurl_photos_comments_getList(flickcurl_s fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_comment comments = ((Object)0);
		int comments_count = 0;
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.comments.getList")) {
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
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		comments = flickcurl_comment_s.flickcurl_build_comments(fc, xpathCtx, ()"/rsp/comments/comment", comments_count);
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			if (comments) {
				comments.flickcurl_free_comments();
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
	public Byte getId() {
		return id;
	}
	public void setId(Byte newId) {
		id = newId;
	}
	public Byte getAuthor() {
		return author;
	}
	public void setAuthor(Byte newAuthor) {
		author = newAuthor;
	}
	public Byte getAuthorname() {
		return authorname;
	}
	public void setAuthorname(Byte newAuthorname) {
		authorname = newAuthorname;
	}
	public int getDatecreate() {
		return datecreate;
	}
	public void setDatecreate(int newDatecreate) {
		datecreate = newDatecreate;
	}
	public Byte getPermalink() {
		return permalink;
	}
	public void setPermalink(Byte newPermalink) {
		permalink = newPermalink;
	}
	public Byte getText() {
		return text;
	}
	public void setText(Byte newText) {
		text = newText;
	}
}
