package application;

public class flickcurl_note_s {
	private int id;
	private byte[] author;
	private byte[] authorname;
	private int x;
	private int y;
	private int w;
	private int h;
	private byte[] text;
	
	public flickcurl_note_s(int id, byte[] author, byte[] authorname, int x, int y, int w, int h, byte[] text) {
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
	public void flickcurl_free_note(flickcurl_note_s[] note) {
		do {
			if (!note) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_note is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\note.c", 46, __func__);
				return ;
			} 
		} while (0);
		byte[] generatedAuthor = note.getAuthor();
		if (generatedAuthor) {
			.free(generatedAuthor);
		} 
		byte[] generatedAuthorname = note.getAuthorname();
		if (generatedAuthorname) {
			.free(generatedAuthorname);
		} 
		byte[] generatedText = note.getText();
		if (generatedText) {
			.free(generatedText);
		} 
		.free(note);
	}
	public flickcurl_note_s[][] flickcurl_build_notes(flickcurl_s[] fc, flickcurl_photo_s[] photo, Object xpathCtx, Object[] xpathExpr, Integer note_count_p) {
		flickcurl_note[][] notes = ((Object)0);
		int nodes_count;
		int note_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do notes */xpathCtx);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathObj) {
			flickcurl_s.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		notes = (flickcurl_note).calloc(, nodes_count + 1);
		byte[] generatedText = n.getText();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			[] attr = new ();
			flickcurl_note[] n = new flickcurl_note();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				flickcurl_s.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			n = (flickcurl_note).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte[] attr_name = (byte)attr.getName();
				byte[] attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					n.setId(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "author")) {
					n.setAuthor(attr_value);
				}  else if (!.strcmp(attr_name, "authorname")) {
					n.setAuthorname(attr_value);
				}  else if (!.strcmp(attr_name, "x")) {
					n.setX(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "y")) {
					n.setY(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "w")) {
					n.setW(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "h")) {
					n.setH(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					n.setText((byte).malloc(len + 1));
					.memcpy(generatedText, chnode.getContent(), len + 1);
				} 
			}
			notes[note_count++] = n/* for nodes */;
		}
		if (note_count_p) {
			note_count_p = note_count;
		} 
		return notes;
	}
	public void command_print_notes(flickcurl_note_s[][] notes, Object[] label, Object[] value) {
		int i;
		if (!notes) {
			return ;
		} 
		if (label) {
			.fprintf((_iob[1]), "%s: %s %s notes\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} else {
				.fprintf((_iob[1]), "notes:\n");
		} 
		int generatedId = note.getId();
		byte[] generatedAuthor = note.getAuthor();
		byte[] generatedAuthorname = note.getAuthorname();
		int generatedX = note.getX();
		int generatedY = note.getY();
		int generatedW = note.getW();
		int generatedH = note.getH();
		byte[] generatedText = note.getText();
		for (i = 0; notes[i]; i++) {
			flickcurl_note[] note = notes[i];
			.fprintf((_iob[1]), "%d) id %d note: author ID %s name %s  x %d y %d w %d h %d text '%s'\n", i, generatedId, generatedAuthor, (generatedAuthorname ? generatedAuthorname : "(Unknown)"), generatedX, generatedY, generatedW, generatedH, generatedText);
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
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
	public byte[] getText() {
		return text;
	}
	public void setText(byte[] newText) {
		text = newText;
	}
}
