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
	private byte[] prefix;
	private byte[] uri;
	private Object prefix_len;
	private Object uri_len;
	private int seen;
	private flickrdf_nspace_s[] next;
	
	public flickrdf_nspace_s(byte[] prefix, byte[] uri, Object prefix_len, Object uri_len, int seen, flickrdf_nspace_s[] next) {
		setPrefix(prefix);
		setUri(uri);
		setPrefix_len(prefix_len);
		setUri_len(uri_len);
		setSeen(seen);
		setNext(next);
	}
	public flickrdf_nspace_s() {
	}
	
	public flickrdf_nspace_s[] nspace_add_new(flickrdf_nspace_s[] list, byte[] prefix, byte[] uri) {
		flickrdf_nspace[] ns = new flickrdf_nspace();
		ns = (flickrdf_nspace).malloc();
		ns.setPrefix_len(.strlen(prefix));
		ns.setUri_len(.strlen(uri));
		Object generatedPrefix_len = ns.getPrefix_len();
		ns.setPrefix((byte).malloc(generatedPrefix_len + 1));
		byte[] generatedPrefix = ns.getPrefix();
		.memcpy(generatedPrefix, prefix, generatedPrefix_len + 1);
		Object generatedUri_len = ns.getUri_len();
		ns.setUri((byte).malloc(generatedUri_len + 1));
		byte[] generatedUri = ns.getUri();
		.memcpy(generatedUri, uri, generatedUri_len + 1);
		ns.setNext(list);
		return ns;
	}
	public flickrdf_nspace_s[] nspace_add_if_not_declared(flickrdf_nspace_s[] list, Object[] prefix, Object[] nspace_uri) {
		int n;
		flickrdf_nspace[] ns = new flickrdf_nspace();
		size_t prefix_len = prefix ? .strlen(prefix) : 0;
		size_t uri_len = nspace_uri ? .strlen(nspace_uri) : 0;
		Object generatedUri_len = ns.getUri_len();
		byte[] generatedUri = ns.getUri();
		Object generatedPrefix_len = ns.getPrefix_len();
		byte[] generatedPrefix = ns.getPrefix();
		flickrdf_nspace_s[] generatedNext = ns.getNext();
		for (ns = list; ns; ns = generatedNext) {
			if (nspace_uri && generatedUri_len == uri_len && !.strcmp(generatedUri, nspace_uri)) {
				break;
			} 
			if (prefix && generatedPrefix_len == prefix_len && !.strcmp(generatedPrefix, prefix)) {
				break;
			} 
		}
		if (ns) {
			return list;
		} 
		ns = ((Object)0);
		for (n = 0; generatedUri; n++) {
			if (prefix && generatedPrefix_len == prefix_len && !.strcmp(generatedPrefix, prefix)) {
				ns = ModernizedCProgram.namespace_table[n];
				break;
			} 
			if (nspace_uri && generatedUri_len == uri_len && !.strcmp(generatedUri, nspace_uri)) {
				ns = ModernizedCProgram.namespace_table[n];
				break;
			} 
		}
		if (!ns) {
			return list;
		} 
		flickrdf_nspace_s flickrdf_nspace_s = new flickrdf_nspace_s();
		return flickrdf_nspace_s.nspace_add_new(list, generatedPrefix, generatedUri);
	}
	public flickrdf_nspace_s[] nspace_get_by_prefix(flickrdf_nspace_s[] list, Object[] prefix) {
		flickrdf_nspace[] ns = new flickrdf_nspace();
		size_t prefix_len = .strlen(prefix);
		Object generatedPrefix_len = ns.getPrefix_len();
		byte[] generatedPrefix = ns.getPrefix();
		flickrdf_nspace_s[] generatedNext = ns.getNext();
		for (ns = list; ns; ns = generatedNext) {
			if (generatedPrefix_len == prefix_len && !.strcmp(generatedPrefix, prefix)) {
				break;
			} 
		}
		return ns;
	}
	public void free_nspaces(flickrdf_nspace_s[] list) {
		flickrdf_nspace[] next = new flickrdf_nspace();
		flickrdf_nspace_s[] generatedNext = list.getNext();
		byte[] generatedPrefix = list.getPrefix();
		byte[] generatedUri = list.getUri();
		for (; list; list = next) {
			next = generatedNext;
			if (generatedPrefix) {
				.free(generatedPrefix);
			} 
			.free(generatedUri);
			.free(list/**
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
	public byte[] getPrefix() {
		return prefix;
	}
	public void setPrefix(byte[] newPrefix) {
		prefix = newPrefix;
	}
	public byte[] getUri() {
		return uri;
	}
	public void setUri(byte[] newUri) {
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
	public flickrdf_nspace_s[] getNext() {
		return next;
	}
	public void setNext(flickrdf_nspace_s[] newNext) {
		next = newNext;
	}
}
