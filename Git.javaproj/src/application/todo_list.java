package application;

public class todo_list {
	private strbuf buf;
	private todo_item items;
	private int nr;
	private int alloc;
	private int current;
	private int done_nr;
	private int total_nr;
	private stat_data stat;
	
	public todo_list(strbuf buf, todo_item items, int nr, int alloc, int current, int done_nr, int total_nr, stat_data stat) {
		setBuf(buf);
		setItems(items);
		setNr(nr);
		setAlloc(alloc);
		setCurrent(current);
		setDone_nr(done_nr);
		setTotal_nr(total_nr);
		setStat(stat);
	}
	public todo_list() {
	}
	
	public void todo_list_release() {
		strbuf generatedBuf = this.getBuf();
		generatedBuf.strbuf_release();
		todo_item generatedItems = this.getItems();
		do {
			ModernizedCProgram.free(generatedItems);
			(generatedItems) = ((Object)0);
		} while (0);
		this.setNr(this.setAlloc(0));
	}
	public int count_commands() {
		int count = 0;
		int i;
		int generatedNr = this.getNr();
		todo_item generatedItems = this.getItems();
		for (i = 0; i < generatedNr; i++) {
			if (generatedItems[i].getCommand() != todo_command.TODO_COMMENT) {
				count++;
			} 
		}
		return count;
	}
	public int get_item_line_offset(int index) {
		int generatedNr = this.getNr();
		todo_item generatedItems = this.getItems();
		strbuf generatedBuf = this.getBuf();
		Object generatedLen = generatedBuf.getLen();
		return index < generatedNr ? generatedItems[index].getOffset_in_buf() : generatedLen;
	}
	public Object get_item_line(int index) {
		strbuf generatedBuf = this.getBuf();
		byte generatedBuf = generatedBuf.getBuf();
		return generatedBuf + todo_list.get_item_line_offset(index);
	}
	public int get_item_line_length(int index) {
		return todo_list.get_item_line_offset(index + 1) - todo_list.get_item_line_offset(index);
	}
	public int is_final_fixup() {
		int generatedCurrent = this.getCurrent();
		int i = generatedCurrent;
		todo_item generatedItems = this.getItems();
		if (!ModernizedCProgram.is_fixup(generatedItems[i].getCommand())) {
			return 0;
		} 
		int generatedNr = this.getNr();
		while (++i < generatedNr) {
			if (ModernizedCProgram.is_fixup(generatedItems[i].getCommand())) {
				return 0;
			}  else if (!ModernizedCProgram.is_noop(generatedItems[i].getCommand())) {
				break;
			} 
		}
		return 1;
	}
	public todo_command peek_command(int offset) {
		int i;
		int generatedNr = this.getNr();
		todo_item generatedItems = this.getItems();
		int generatedCurrent = this.getCurrent();
		for (i = generatedCurrent + offset; i < generatedNr; i++) {
			if (!ModernizedCProgram.is_noop(generatedItems[i].getCommand())) {
				return generatedItems[i].getCommand();
			} 
		}
		return -1;
	}
	public int todo_list_rearrange_squash() {
		hashmap subject2item = new hashmap();
		int rearranged = 0;
		int next;
		int tail;
		int i;
		int nr = 0;
		int alloc = 0;
		byte subjects;
		commit_todo_item commit_todo = new commit_todo_item();
		todo_item items = ((Object)0);
		commit_todo/*
			 * The hashmap maps onelines to the respective todo list index.
			 *
			 * If any items need to be rearranged, the next[i] value will indicate
			 * which item was moved directly after the i'th.
			 *
			 * In that case, last[i] will indicate the index of the latest item to
			 * be moved to appear after the i'th.
			 */.init_commit_todo_item();
		int generatedNr = this.getNr();
		subject2item.hashmap_init(subject2item_cmp, ((Object)0), generatedNr);
		(next) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (generatedNr)));
		(tail) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (generatedNr)));
		(subjects) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (generatedNr)));
		todo_item generatedItems = this.getItems();
		commit generatedCommit = item.getCommit();
		todo_command generatedCommand = item.getCommand();
		todo_item todo_item = new todo_item();
		hashmap_entry hashmap_entry = new hashmap_entry();
		int generatedI = entry.getI();
		Object generatedSubject = (entry).getSubject();
		hashmap_entry generatedEntry = entry.getEntry();
		for (i = 0; i < generatedNr; i++) {
			strbuf buf = new strbuf(, , );
			todo_item item = generatedItems + i;
			byte commit_buffer;
			byte subject;
			byte p;
			size_t subject_len = new size_t();
			int i2 = -1;
			subject2item_entry entry = new subject2item_entry();
			next[i] = tail[i] = -1;
			if (!generatedCommit || generatedCommand == todo_command.TODO_DROP) {
				subjects[i] = ((Object)0);
				continue;
			} 
			if (ModernizedCProgram.is_fixup(generatedCommand)) {
				commit_todo.clear_commit_todo_item();
				return ();
			} 
			todo_item.commit_todo_item_at(commit_todo, generatedCommit) = item;
			ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, generatedCommit);
			commit_buffer = .repo_get_commit_buffer(ModernizedCProgram.the_repository, generatedCommit, ((Object)0));
			.find_commit_subject(commit_buffer, subject);
			ModernizedCProgram.buf.format_subject(subject, " ");
			subject = subjects[i] = ModernizedCProgram.buf.strbuf_detach(subject_len);
			.repo_unuse_commit_buffer(ModernizedCProgram.the_repository, generatedCommit, commit_buffer);
			if ((ModernizedCProgram.skip_prefix(subject, "fixup! ", p) || ModernizedCProgram.skip_prefix(subject, "squash! ", p))) {
				commit commit2 = new commit();
				for (; ; ) {
					while (((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0)) {
						p++;
					}
					if (!ModernizedCProgram.skip_prefix(p, "fixup! ", p) && !ModernizedCProgram.skip_prefix(p, "squash! ", p)) {
						break;
					} 
				}
				entry = (subject2item_entry)ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get_from_hash(subject2item, ModernizedCProgram.strhash(p), p), ((size_t)((subject2item_entry)0).getEntry()));
				if (entry) {
					i2 = generatedI;
				}  else if (!.strchr(p, (byte)' ') && (commit2 = .lookup_commit_reference_by_name(p)) && todo_item.commit_todo_item_at(commit_todo, commit2)) {
					i2 = todo_item.commit_todo_item_at(commit_todo, /* found by commit name */commit2) - generatedItems;
				} else {
						for (i2 = 0; i2 < i; /* copy can be a prefix of the commit subject */i2++) {
							if (subjects[i2] && ModernizedCProgram.starts_with(subjects[i2], p)) {
								break;
							} 
						}
						if (i2 == i) {
							i2 = -1;
						} 
				} 
			} 
			if (i2 >= 0) {
				rearranged = 1;
				generatedItems[i].setCommand(ModernizedCProgram.starts_with(subject, "fixup!") ? todo_command.TODO_FIXUP : todo_command.TODO_SQUASH);
				if (next[i2] < 0) {
					next[i2] = i;
				} else {
						next[tail[i2]] = i;
				} 
				tail[i2] = i;
			}  else if (!hashmap_entry.hashmap_get_from_hash(subject2item, ModernizedCProgram.strhash(subject), subject)) {
				do {
					size_t flex_array_len_ = (subject_len);
					(entry) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
					.memcpy((Object)generatedSubject, (subject), flex_array_len_);
				} while (0);
				entry.setI(i);
				generatedEntry.hashmap_entry_init(ModernizedCProgram.strhash(generatedSubject));
				generatedEntry.hashmap_put(subject2item);
			} 
		}
		if (rearranged) {
			for (i = 0; i < generatedNr; i++) {
				todo_command command = generatedCommand;
				int cur = i/*
							 * Initially, all commands are 'pick's. If it is a
							 * fixup or a squash now, we have rearranged it.
							 */;
				if (ModernizedCProgram.is_fixup(todo_command.command)) {
					continue;
				} 
				while (cur >= 0) {
					do {
						if ((nr + 1) > alloc) {
							if ((((alloc) + 16) * 3 / 2) < (nr + 1)) {
								alloc = (nr + 1);
							} else {
									alloc = (((alloc) + 16) * 3 / 2);
							} 
							(items) = ModernizedCProgram.xrealloc((items), ModernizedCProgram.st_mult(, (alloc)));
						} 
					} while (0);
					items[nr++] = generatedItems[cur];
					cur = next[cur];
				}
			}
			do {
				ModernizedCProgram.free(generatedItems);
				(generatedItems) = ((Object)0);
			} while (0);
			this.setItems(items);
			this.setNr(nr);
			this.setAlloc(alloc);
		} 
		ModernizedCProgram.free(next);
		ModernizedCProgram.free(tail);
		for (i = 0; i < generatedNr; i++) {
			ModernizedCProgram.free(subjects[i]);
		}
		ModernizedCProgram.free(subjects);
		subject2item.hashmap_free_(((size_t)generatedEntry));
		;
		commit_todo.clear_commit_todo_item();
		return 0;
	}
	public int todo_list_check(todo_list new_todo) {
		missing_commit_check_level check_level = ModernizedCProgram.get_missing_commit_check_level();
		strbuf missing = new strbuf(, , );
		int res = 0;
		int i;
		commit_seen commit_seen = new commit_seen();
		commit_seen.init_commit_seen();
		if (missing_commit_check_level.check_level == missing_commit_check_level.MISSING_COMMIT_CHECK_IGNORE) {
			;
		} 
		int generatedNr = new_todo.getNr();
		todo_item generatedItems = new_todo.getItems();
		for (i = 0; i < generatedNr; /* Mark the commits in git-rebase-todo as seen */i++) {
			commit commit = generatedItems[i].getCommit();
			if (commit) {
				commit_seen.commit_seen_at(commit) = 1;
			} 
		}
		commit generatedCommit = item.getCommit();
		object generatedObject = commit.getObject();
		object_id generatedOid = generatedObject.getOid();
		int generatedArg_len = item.getArg_len();
		for (i = generatedNr - 1; i >= 0; /* Find commits in git-rebase-todo.backup yet unseen */i--) {
			todo_item item = generatedItems + i;
			commit commit = generatedCommit;
			if (commit && !commit_seen.commit_seen_at(commit)) {
				missing.strbuf_addf(" - %s %.*s\n", ModernizedCProgram.the_repository.repo_find_unique_abbrev(generatedOid, ModernizedCProgram.default_abbrev), generatedArg_len, ModernizedCProgram.todo_item_get_arg(old_todo, item));
				commit_seen.commit_seen_at(commit) = 1;
			} 
		}
		Object generatedLen = missing.getLen();
		if (!generatedLen) {
			;
		} 
		if (missing_commit_check_level.check_level == missing_commit_check_level.MISSING_COMMIT_CHECK_ERROR) {
			res = 1;
		} 
		.fprintf((_iob[2]), ModernizedCProgram._("Warning: some commits may have been dropped accidentally.\nDropped commits (newer to older):\n"));
		byte generatedBuf = missing.getBuf();
		.fputs(generatedBuf, (_iob[/* Make the list user-friendly and display */2]));
		missing.strbuf_release();
		.fprintf((_iob[2]), ModernizedCProgram._("To avoid this message, use \"drop\" to explicitly remove a commit.\n\nUse 'git config rebase.missingCommitsCheck' to change the level of warnings.\nThe possible behaviours are: ignore, warn, error.\n\n"));
		return res;
	}
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
	public todo_item getItems() {
		return items;
	}
	public void setItems(todo_item newItems) {
		items = newItems;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int newCurrent) {
		current = newCurrent;
	}
	public int getDone_nr() {
		return done_nr;
	}
	public void setDone_nr(int newDone_nr) {
		done_nr = newDone_nr;
	}
	public int getTotal_nr() {
		return total_nr;
	}
	public void setTotal_nr(int newTotal_nr) {
		total_nr = newTotal_nr;
	}
	public stat_data getStat() {
		return stat;
	}
	public void setStat(stat_data newStat) {
		stat = newStat;
	}
}
