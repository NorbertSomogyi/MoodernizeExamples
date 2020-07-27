package application;

/* -*- Mode: c; c-basic-offset: 2 -*-
 *
 * serializer.c - Triples from photo metadata
 *
 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
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
/* Public namespaces */
/* predicates dc:creator dc:dateSubmitted dc:rights dc:modified dc:issued
 * dc:created dc:description dc:title */
/* predicates foaf:maker foaf:name foaf:nick
 * classes foaf:Person foaf:Image */
/* predicates geo:lat geo:long */
/* predicates rdfs:label */
/* predicates rdf:type */
/* XSD datatypes xsd:boolean xsd:dateTime xsd:double xsd:integer */
/* Flickr terminology namespaces */
/* predicates flickr:image flickr:video flickr:width flickr:height
 * classes flickr:Video */
/* predicates places:place places:type places:name places:id places:placeid
 * places:url
 * class places:Place
 */
/* Machine tag namespaces */
public class flickrdf_nspace_s {
	private Byte prefix;
	private Byte uri;
	private Object prefix_len;
	private Object uri_len;
	private int seen;
	private flickrdf_nspace_s next;
	
	public flickrdf_nspace_s(Byte prefix, Byte uri, Object prefix_len, Object uri_len, int seen, flickrdf_nspace_s next) {
		setPrefix(prefix);
		setUri(uri);
		setPrefix_len(prefix_len);
		setUri_len(uri_len);
		setSeen(seen);
		setNext(next);
	}
	public flickrdf_nspace_s() {
	}
	
	public flickrdf_nspace_s nspace_add_new(Byte prefix, Byte uri) {
		flickrdf_nspace ns = new flickrdf_nspace();
		ns = (flickrdf_nspace)/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/);
		ns.setPrefix_len(/*Error: Function owner not recognized*/strlen(prefix));
		ns.setUri_len(/*Error: Function owner not recognized*/strlen(uri));
		Object generatedPrefix_len = ns.getPrefix_len();
		ns.setPrefix((byte)/*Error: Function owner not recognized*/malloc(generatedPrefix_len + 1));
		Byte generatedPrefix = ns.getPrefix();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPrefix, prefix, generatedPrefix_len + 1);
		Object generatedUri_len = ns.getUri_len();
		ns.setUri((byte)/*Error: Function owner not recognized*/malloc(generatedUri_len + 1));
		Byte generatedUri = ns.getUri();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedUri, uri, generatedUri_len + 1);
		ns.setNext(list);
		return ns;
	}
	public flickrdf_nspace_s nspace_add_if_not_declared(Object prefix, Object nspace_uri) {
		int n;
		flickrdf_nspace ns = new flickrdf_nspace();
		size_t prefix_len = prefix ? /*Error: Function owner not recognized*/strlen(prefix) : 0;
		size_t uri_len = nspace_uri ? /*Error: Function owner not recognized*/strlen(nspace_uri) : 0;
		Object generatedUri_len = ns.getUri_len();
		Byte generatedUri = ns.getUri();
		Object generatedPrefix_len = ns.getPrefix_len();
		Byte generatedPrefix = ns.getPrefix();
		flickrdf_nspace_s generatedNext = ns.getNext();
		for (ns = list; ns; ns = generatedNext) {
			if (nspace_uri && generatedUri_len == uri_len && !/*Error: Function owner not recognized*/strcmp(generatedUri, nspace_uri)) {
				break;
			} 
			if (prefix && generatedPrefix_len == prefix_len && !/*Error: Function owner not recognized*/strcmp(generatedPrefix, prefix)) {
				break;
			} 
		}
		if (ns) {
			return list;
		} 
		ns = ((Object)0);
		for (n = 0; generatedUri; n++) {
			if (prefix && generatedPrefix_len == prefix_len && !/*Error: Function owner not recognized*/strcmp(generatedPrefix, prefix)) {
				ns = ModernizedCProgram.namespace_table[n];
				break;
			} 
			if (nspace_uri && generatedUri_len == uri_len && !/*Error: Function owner not recognized*/strcmp(generatedUri, nspace_uri)) {
				ns = ModernizedCProgram.namespace_table[n];
				break;
			} 
		}
		if (!ns) {
			return list;
		} 
		return list.nspace_add_new(generatedPrefix, generatedUri);
	}
	public flickrdf_nspace_s nspace_get_by_prefix(Object prefix) {
		flickrdf_nspace ns = new flickrdf_nspace();
		size_t prefix_len = /*Error: Function owner not recognized*/strlen(prefix);
		Object generatedPrefix_len = ns.getPrefix_len();
		Byte generatedPrefix = ns.getPrefix();
		flickrdf_nspace_s generatedNext = ns.getNext();
		for (ns = list; ns; ns = generatedNext) {
			if (generatedPrefix_len == prefix_len && !/*Error: Function owner not recognized*/strcmp(generatedPrefix, prefix)) {
				break;
			} 
		}
		return ns;
	}
	public void free_nspaces() {
		flickrdf_nspace next = new flickrdf_nspace();
		flickrdf_nspace_s generatedNext = this.getNext();
		Byte generatedPrefix = this.getPrefix();
		Byte generatedUri = this.getUri();
		for (; list; list = next) {
			next = generatedNext;
			if (generatedPrefix) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedPrefix);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUri);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(list/**
			 * flickcurl_serialize_photo:
			 * @fcs: flickcurl serializer object
			 * @photo: photo object
			 *
			 * Serialize photo description to RDF triples
			 *
			 * Return value: non-0 on failure
			 */);
		}
	}
	public Byte getPrefix() {
		return prefix;
	}
	public void setPrefix(Byte newPrefix) {
		prefix = newPrefix;
	}
	public Byte getUri() {
		return uri;
	}
	public void setUri(Byte newUri) {
		uri = newUri;
	}
	public Object getPrefix_len() {
		return prefix_len;
	}
	public void setPrefix_len(Object newPrefix_len) {
		prefix_len = newPrefix_len;
	}
	public Object getUri_len() {
		return uri_len;
	}
	public void setUri_len(Object newUri_len) {
		uri_len = newUri_len;
	}
	public int getSeen() {
		return seen;
	}
	public void setSeen(int newSeen) {
		seen = newSeen;
	}
	public flickrdf_nspace_s getNext() {
		return next;
	}
	public void setNext(flickrdf_nspace_s newNext) {
		next = newNext;
	}
}
