package application;

/*
 * Copyright (c) 2009-2016 Petri Lehtinen <petri@digip.org>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the MIT license. See LICENSE for details.
 */
public class hashtable_list {
	private hashtable_list prev;
	private hashtable_list next;
	
	public hashtable_list(hashtable_list prev, hashtable_list next) {
		setPrev(prev);
		setNext(next);
	}
	public hashtable_list() {
	}
	
	public void list_init() {
		this.setNext(list);
		this.setPrev(list);
	}
	public void list_insert(hashtable_list node) {
		node.setNext(list);
		hashtable_list generatedPrev = this.getPrev();
		node.setPrev(generatedPrev);
		generatedPrev.setNext(node);
		this.setPrev(node);
	}
	public void list_remove() {
		hashtable_list generatedNext = this.getNext();
		hashtable_list generatedPrev = this.getPrev();
		generatedPrev.setNext(generatedNext);
		generatedNext.setPrev(generatedPrev);
	}
	public hashtable_list getPrev() {
		return prev;
	}
	public void setPrev(hashtable_list newPrev) {
		prev = newPrev;
	}
	public hashtable_list getNext() {
		return next;
	}
	public void setNext(hashtable_list newNext) {
		next = newNext;
	}
}
/* "pair" may be a bit confusing a name, but think of it as a
   key-value pair. In this case, it just encodes some extra data,
   too */
/**
 * hashtable_init - Initialize a hashtable object
 *
 * @hashtable: The (statically allocated) hashtable object
 *
 * Initializes a statically allocated hashtable object. The object
 * should be cleared with hashtable_close when it's no longer used.
 *
 * Returns 0 on success, -1 on error (out of memory).
 */
