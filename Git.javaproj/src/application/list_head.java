package application;

/*
 * Copyright (C) 2002 Free Software Foundation, Inc.
 * (originally part of the GNU C Library and Userspace RCU)
 * Contributed by Ulrich Drepper <drepper@redhat.com>, 2002.
 *
 * Copyright (C) 2009 Pierre-Marc Fournier
 * Conversion to RCU list.
 * Copyright (C) 2010 Mathieu Desnoyers <mathieu.desnoyers@efficios.com>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 */
/*
 * The definitions of this file are adopted from those which can be
 * found in the Linux kernel headers to enable people familiar with the
 * latter find their way in these sources as well.
 */
/* Basic type for the double-link list. */
public class list_head {
	private list_head next;
	private list_head prev;
	
	public list_head(list_head next, list_head prev) {
		setNext(next);
		setPrev(prev);
	}
	public list_head() {
	}
	
	/* Initialize a new list head. */
	/* Add new element at the head of the list. */
	public void list_add(list_head head) {
		list_head generatedNext = head.getNext();
		generatedNext.setPrev(newp);
		this.setNext(generatedNext);
		this.setPrev(head);
		head.setNext(newp);
	}
	/* Add new element at the tail of the list. */
	public void list_add_tail(list_head head) {
		list_head generatedPrev = head.getPrev();
		generatedPrev.setNext(newp);
		this.setNext(head);
		this.setPrev(generatedPrev);
		head.setPrev(newp);
	}
	/* Remove element from list. */
	public void __list_del(list_head next) {
		next.setPrev(prev);
		this.setNext(next);
	}
	/* Remove element from list. */
	public void list_del() {
		list_head generatedPrev = this.getPrev();
		list_head generatedNext = this.getNext();
		generatedPrev.__list_del(generatedNext);
	}
	/* Remove element from list, initializing the element's list pointers. */
	public void list_del_init() {
		elem.list_del();
		(elem).setNext((elem).setPrev((elem)));
	}
	/* Delete from list, add to another list as head. */
	public void list_move(list_head head) {
		list_head generatedPrev = this.getPrev();
		list_head generatedNext = this.getNext();
		generatedPrev.__list_del(generatedNext);
		elem.list_add(head);
	}
	/* Replace an old entry. */
	public void list_replace(list_head newp) {
		list_head generatedNext = this.getNext();
		newp.setNext(generatedNext);
		list_head generatedPrev = this.getPrev();
		newp.setPrev(generatedPrev);
		generatedPrev.setNext(newp);
		generatedNext.setPrev(newp);
	}
	/* Join two lists. */
	public void list_splice(list_head head) {
		list_head generatedNext = this.getNext();
		list_head generatedPrev = this.getPrev();
		if (add != generatedNext) {
			generatedNext.setPrev(head);
			generatedPrev.setNext(generatedNext);
			generatedNext.setPrev(generatedPrev);
			head.setNext(generatedNext);
		} 
	}
	/* Get first entry from a list. */
	/* Iterate forward over the elements of the list. */
	/*
	 * Iterate forward over the elements list. The list elements can be
	 * removed from the list while doing this.
	 */
	/* Iterate backward over the elements of the list. */
	/*
	 * Iterate backwards over the elements list. The list elements can be
	 * removed from the list while doing this.
	 */
	public int list_empty() {
		list_head generatedNext = this.getNext();
		return head == generatedNext;
	}
	public void list_replace_init(list_head newp) {
		list_head generatedNext = this.getNext();
		list_head head = generatedNext;
		old.list_del();
		newp.list_add_tail(head);
		(old).setNext((old).setPrev((old/*
		 * This is exactly the same as a normal list_head, except that it can be
		 * declared volatile (e.g., if you have a list that may be accessed from signal
		 * handlers).
		 */)));
	}
	public void process_trailers_lists(list_head arg_head) {
		list_head pos = new list_head();
		list_head p = new list_head();
		arg_item arg_tok = new arg_item();
		for (; pos != (arg_head); ) {
			int applied = 0;
			arg_tok = ((arg_item)((byte)(pos) - ((size_t)((arg_item)0).getList())));
			pos.list_del();
			applied = ModernizedCProgram.find_same_and_apply_arg(head, arg_tok);
			if (!applied) {
				ModernizedCProgram.apply_arg_if_missing(head, arg_tok);
			} 
		}
	}
	public void add_arg_item(Byte tok, Byte val, Object conf, Object new_trailer_item) {
		arg_item new_item = ModernizedCProgram.xcalloc(/*Error: sizeof expression not supported yet*/, 1);
		new_item.setToken(tok);
		new_item.setValue(val);
		conf_info generatedConf = new_item.getConf();
		generatedConf.duplicate_conf(conf);
		if (new_trailer_item) {
			if (new_trailer_item.getWhere() != trailer_where.WHERE_DEFAULT) {
				generatedConf.setWhere(new_trailer_item.getWhere());
			} 
			if (new_trailer_item.getIf_exists() != trailer_if_exists.EXISTS_DEFAULT) {
				generatedConf.setIf_exists(new_trailer_item.getIf_exists());
			} 
			if (new_trailer_item.getIf_missing() != trailer_if_missing.MISSING_DEFAULT) {
				generatedConf.setIf_missing(new_trailer_item.getIf_missing());
			} 
		} 
		list_head generatedList = new_item.getList();
		generatedList.list_add_tail(arg_head);
	}
	public void process_command_line_args(list_head new_trailer_head) {
		arg_item item = new arg_item();
		strbuf tok = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf val = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		conf_info conf = new conf_info();
		list_head pos = new list_head();
		/*
			 * In command-line arguments, '=' is accepted (in addition to the
			 * separators that are defined).
			 */
		byte cl_separators = ModernizedCProgram.xstrfmt("=%s", ModernizedCProgram.separators);
		conf_info generatedConf = item.getConf();
		Byte generatedCommand = generatedConf.getCommand();
		list_head generatedNext = pos.getNext();
		for (pos = generatedNext; pos != (ModernizedCProgram.conf_head); pos = generatedNext) {
			item = ((arg_item)((byte)(pos) - ((size_t)((arg_item)0).getList())));
			if (generatedCommand) {
				arg_head.add_arg_item(ModernizedCProgram.xstrdup(item.token_from_item(((Object)0))), ModernizedCProgram.xstrdup(""), generatedConf, ((Object)0));
			} 
		}
		Object generatedText = tr.getText();
		for (pos = generatedNext; pos != (new_trailer_head); pos = generatedNext) {
			new_trailer_item tr = ((new_trailer_item)((byte)(pos) - ((size_t)((new_trailer_item)0).getList())));
			ssize_t separator_pos = ModernizedCProgram.find_separator(generatedText, cl_separators);
			if (separator_pos == 0) {
				strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
				sb.strbuf_addstr(generatedText);
				sb.strbuf_trim();
				();
				sb.strbuf_release();
			} else {
					tok.parse_trailer(val, conf, generatedText, separator_pos);
					arg_head.add_arg_item(tok.strbuf_detach(((Object)0)), val.strbuf_detach(((Object)0)), conf, tr);
			} 
		}
		ModernizedCProgram.free(cl_separators);
	}
	public void free_all() {
		list_head pos = new list_head();
		list_head p = new list_head();
		for (; pos != (head); ) {
			pos.list_del();
			((trailer_item)((byte)(pos) - ((size_t)((trailer_item)0).getList()))).free_trailer_item();
		}
	}
	public void process_trailers(Object file, Object opts) {
		list_head head = new list_head((head), (head));
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		size_t trailer_end = new size_t();
		FILE outfile = (_iob[1]);
		ModernizedCProgram.ensure_configured();
		sb.read_input_file(file);
		if (opts.getIn_place()) {
			outfile = ModernizedCProgram.create_in_place_tempfile(file);
		} 
		byte[] generatedBuf = sb.getBuf();
		trailer_end = ModernizedCProgram.process_input_file(outfile, generatedBuf, head, /* Print the lines before the trailers */opts);
		if (!opts.getOnly_input()) {
			list_head arg_head = new list_head((arg_head), (arg_head));
			arg_head.process_command_line_args(new_trailer_head);
			head.process_trailers_lists(arg_head);
		} 
		ModernizedCProgram.print_all(outfile, head, opts);
		head.free_all();
		Object generatedLen = sb.getLen();
		if (!opts.getOnly_trailers()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(generatedBuf + trailer_end, 1, generatedLen - trailer_end, outfile);
		} 
		if (opts.getIn_place()) {
			if (ModernizedCProgram.trailers_tempfile.rename_tempfile(file)) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("could not rename temporary file to %s"), file);
			} 
		} 
		sb.strbuf_release();
	}
	public void new_trailers_clear() {
		list_head pos = new list_head();
		list_head tmp = new list_head();
		new_trailer_item item = new new_trailer_item();
		for (; pos != (trailers); ) {
			item = ((new_trailer_item)((byte)(pos) - ((size_t)((new_trailer_item)0).getList())));
			pos.list_del();
			ModernizedCProgram.free(item);
		}
	}
	public list_head get_packed_git_mru(repository r) {
		r.prepare_packed_git();
		raw_object_store generatedObjects = r.getObjects();
		list_head generatedPacked_git_mru = generatedObjects.getPacked_git_mru();
		return generatedPacked_git_mru;
	}
	public list_head getNext() {
		return next;
	}
	public void setNext(list_head newNext) {
		next = newNext;
	}
	public list_head getPrev() {
		return prev;
	}
	public void setPrev(list_head newPrev) {
		prev = newPrev;
	}
}
/* avoid conflicts with BSD-only sys/queue.h */
/* Define a variable with the head and tail of the list. */
