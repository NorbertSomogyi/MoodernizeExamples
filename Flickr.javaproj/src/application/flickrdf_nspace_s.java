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
	private Object prefix;
	private Object uri;
	private Object prefix_len;
	private Object uri_len;
	private int seen;
	private Object next;
	
	public flickrdf_nspace_s(Object prefix, Object uri, Object prefix_len, Object uri_len, int seen, Object next) {
		setPrefix(prefix);
		setUri(uri);
		setPrefix_len(prefix_len);
		setUri_len(uri_len);
		setSeen(seen);
		setNext(next);
	}
	public flickrdf_nspace_s() {
	}
	
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public Object getUri() {
		return uri;
	}
	public void setUri(Object newUri) {
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
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
}
