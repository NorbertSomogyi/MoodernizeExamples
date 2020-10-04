package application;

/*
 * Rufus: The Reliable USB Formatting Utility
 * Localization functions, a.k.a. "Everybody is doing it wrong but me!"
 * Copyright © 2013-2016 Pete Batard <pete@akeo.ie>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
// Number of concurrent localization messages (i.e. messages we can concurrently
// reference at the same time). Must be a power of 2.
// Using a prime speeds up the hash table init
// Attributes that can be set by a translation
/*
 * List handling functions (stolen from libusb)
 * NB: offsetof() requires '#include <stddef.h>'
 */
public class list_head {
	private list_head prev;
	private list_head next;
	
	public list_head(list_head prev, list_head next) {
		setPrev(prev);
		setNext(next);
	}
	public list_head() {
	}
	
	public void list_init() {
		this.setPrev(this.setNext(entry));
	}
	public void list_add(list_head head) {
		list_head generatedNext = head.getNext();
		this.setNext(generatedNext);
		this.setPrev(head);
		generatedNext.setPrev(entry);
		head.setNext(entry);
		list_head generatedNext = head.getNext();
		new.__list_add(head, generatedNext);
	}
	public void list_add_tail(list_head head) {
		this.setNext(head);
		list_head generatedPrev = head.getPrev();
		this.setPrev(generatedPrev);
		generatedPrev.setNext(entry);
		head.setPrev(entry);
		list_head generatedPrev = head.getPrev();
		new.__list_add(generatedPrev, head/*
		 * Delete a list entry by making the prev/next entries
		 * point to each other.
		 *
		 * This is only for internal list manipulation where we know
		 * the prev/next entries already!
		 */);
	}
	public void list_del() {
		list_head generatedPrev = this.getPrev();
		list_head generatedNext = this.getNext();
		generatedNext.setPrev(generatedPrev);
		generatedPrev.setNext(generatedNext);
		this.setNext(this.setPrev((null)));
		list_head generatedPrev = this.getPrev();
		list_head generatedNext = this.getNext();
		generatedPrev.__list_del(generatedNext);
	}
	/*
	 * Insert a new entry between two known consecutive entries.
	 *
	 * This is only for internal list manipulation where we know
	 * the prev/next entries already!
	 */
	public void __list_add(list_head prev, list_head next) {
		next.setPrev(new);
		this.setNext(next);
		this.setPrev(prev);
		prev.setNext(new/*
		 * Insert a new entry after the specified head..
		 */);
	}
	public void __list_del(list_head next) {
		next.setPrev(prev);
		this.setNext(next);
	}
	public int list_empty() {
		list_head generatedNext = this.getNext();
		return generatedNext == head/*
		 * Splice in "list" into "head"
		 */;
	}
	public void list_splice(list_head head) {
		list_head generatedNext = this.getNext();
		list_head first = generatedNext;
		list_head generatedPrev = this.getPrev();
		if (first != list) {
			list_head last = generatedPrev;
			list_head at = generatedNext;
			first.setPrev(head);
			head.setNext(first);
			last.setNext(at);
			at.setPrev(last);
		} 
	}
	public list_head getPrev() {
		return prev;
	}
	public void setPrev(list_head newPrev) {
		prev = newPrev;
	}
	public list_head getNext() {
		return next;
	}
	public void setNext(list_head newNext) {
		next = newNext;
	}
}
/* Get an entry from the list
 *  ptr - the address of this list_head element in "type"
 *  type - the data type that contains "member"
 *  member - the list_head element in "type"
 */
/* Get each entry from a list
 *  pos - A structure pointer has a "member" element
 *  head - list head
 *  member - the list_head element in "pos"
 *  type - the type of the first parameter
 */
