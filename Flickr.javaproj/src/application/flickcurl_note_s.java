package application;

public class flickcurl_note_s {
	private int id;
	private Byte author;
	private Byte authorname;
	private int x;
	private int y;
	private int w;
	private int h;
	private Byte text;
	
	public flickcurl_note_s(int id, Byte author, Byte authorname, int x, int y, int w, int h, Byte text) {
		setId(id);
		setAuthor(author);
		setAuthorname(authorname);
		setX(x);
		setY(y);
		setW(w);
		setH(h);
		setText(text);
	}
	public flickcurl_note_s() {
	}
	
	public void command_print_notes(Object label, Object value) {
		int i;
		if (!notes) {
			return /*Error: Unsupported expression*/;
		} 
		if (label) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: %s %s notes\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "notes:\n");
		} 
		int generatedId = note.getId();
		Byte generatedAuthor = note.getAuthor();
		Byte generatedAuthorname = note.getAuthorname();
		int generatedX = note.getX();
		int generatedY = note.getY();
		int generatedW = note.getW();
		int generatedH = note.getH();
		Byte generatedText = note.getText();
		for (i = 0; notes[i]; i++) {
			flickcurl_note note = notes[i];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%d) id %d note: author ID %s name %s  x %d y %d w %d h %d text '%s'\n", i, generatedId, generatedAuthor, (generatedAuthorname ? generatedAuthorname : "(Unknown)"), generatedX, generatedY, generatedW, generatedH, generatedText);
		}
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * note.c - Flickcurl note functions
	 *
	 * Copyright (C) 2010, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_note:
	 * @note: note object
	 *
	 * Destructor for note object
	 */
	public void flickcurl_free_note() {
		do {
			if (!note) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_note is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\note.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Byte generatedAuthor = this.getAuthor();
		if (generatedAuthor) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedAuthor);
		} 
		Byte generatedAuthorname = this.getAuthorname();
		if (generatedAuthorname) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedAuthorname);
		} 
		Byte generatedText = this.getText();
		if (generatedText) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedText);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(note);
	}
	public flickcurl_note_s flickcurl_build_notes(flickcurl_s fc, flickcurl_photo_s photo, Object xpathCtx, Object xpathExpr, Integer note_count_p) {
		flickcurl_note notes = ((Object)0);
		int nodes_count;
		int note_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = /*Error: Function owner not recognized*/xmlXPathEvalExpression(xpathExpr, /* Now do notes */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = /*Error: Function owner not recognized*/xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		notes = (flickcurl_note)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, nodes_count + 1);
		Byte generatedText = n.getText();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_note n = new flickcurl_note();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			n = (flickcurl_note)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = /*Error: Function owner not recognized*/strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte)/*Error: Function owner not recognized*/malloc(attr_len + 1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!/*Error: Function owner not recognized*/strcmp(attr_name, "id")) {
					n.setId(/*Error: Function owner not recognized*/atoi(attr_value));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "author")) {
					n.setAuthor(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "authorname")) {
					n.setAuthorname(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "x")) {
					n.setX(/*Error: Function owner not recognized*/atoi(attr_value));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "y")) {
					n.setY(/*Error: Function owner not recognized*/atoi(attr_value));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "w")) {
					n.setW(/*Error: Function owner not recognized*/atoi(attr_value));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				}  else if (!/*Error: Function owner not recognized*/strcmp(attr_name, "h")) {
					n.setH(/*Error: Function owner not recognized*/atoi(attr_value));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = /*Error: Function owner not recognized*/strlen((byte)chnode.getContent());
					n.setText((byte)/*Error: Function owner not recognized*/malloc(len + 1));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedText, chnode.getContent(), len + 1);
				} 
			}
			notes[note_count++] = n/* for nodes */;
		}
		if (note_count_p) {
			note_count_p = note_count;
		} 
		return notes;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
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
	public int getX() {
		return x;
	}
	public void setX(int newX) {
		x = newX;
	}
	public int getY() {
		return y;
	}
	public void setY(int newY) {
		y = newY;
	}
	public int getW() {
		return w;
	}
	public void setW(int newW) {
		w = newW;
	}
	public int getH() {
		return h;
	}
	public void setH(int newH) {
		h = newH;
	}
	public Byte getText() {
		return text;
	}
	public void setText(Byte newText) {
		text = newText;
	}
}
