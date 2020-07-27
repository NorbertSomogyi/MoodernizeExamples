package application;

/* Shallow copy of the input list */
public class commit_list {
	private commit item;
	private commit_list next;
	
	public commit_list(commit item, commit_list next) {
		setItem(item);
		setNext(next);
	}
	public commit_list() {
	}
	
	/*
	 * This is a truly stupid algorithm, but it's only
	 * used for bisection, and we just don't care enough.
	 *
	 * We care just barely enough to avoid recursing for
	 * non-merge entries.
	 */
	public int count_distance() {
		int nr = 0;
		commit generatedItem = this.getItem();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedParents = commit.getParents();
		commit_list generatedNext = p.getNext();
		while (entry) {
			commit commit = generatedItem;
			commit_list p = new commit_list();
			if (generatedFlags & ((-1024 << 1) | (-1024 << 16))) {
				break;
			} 
			if (!(generatedFlags & (-1024 << 2))) {
				nr++;
			} 
			generatedFlags |=  (-1024 << 16);
			p = generatedParents;
			entry = p;
			if (p) {
				p = generatedNext;
				while (p) {
					nr += p.count_distance();
					p = generatedNext;
				}
			} 
		}
		return nr;
	}
	public void clear_distance() {
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		while (ModernizedCProgram.list) {
			commit commit = ModernizedCProgram.list.getItem();
			generatedFlags &=  ~(-1024 << 16);
			ModernizedCProgram.list = ModernizedCProgram.list.getNext();
		}
	}
	public int weight() {
		commit generatedItem = this.getItem();
		return ModernizedCProgram.commit_weight.commit_weight_at(generatedItem);
	}
	public void weight_set(int weight) {
		commit generatedItem = this.getItem();
		ModernizedCProgram.commit_weight.commit_weight_at(generatedItem) = weight;
	}
	public int halfway(int nr) {
		commit generatedItem = this.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		if (generatedFlags & (-1024 << 2)) {
			return 0;
		} 
		if (0) {
			return 0/*
				 * 2 and 3 are halfway of 5.
				 * 3 is halfway of 6 but 2 and 4 are not.
				 */;
		} 
		switch (2 * p.weight() - nr) {
		case 0:
		case -1:
		case 1:
				return 1;
		default:
				return 0;
		}
	}
	/*
		 * Don't short-cut something we are not going to return!
		 */
	public void show_list(Object debug, int counted, int nr) {
		commit_list p = new commit_list();
		if (!false) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s (%d/%d)\n", debug, counted, nr);
		commit generatedItem = p.getItem();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedNext = pp.getNext();
		commit_list generatedParents = commit.getParents();
		for (p = ModernizedCProgram.list; p; p = generatedNext) {
			commit_list pp = new commit_list();
			commit commit = generatedItem;
			int flags = generatedFlags;
			object_type type;
			long size;
			byte buf = ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, size);
			byte subject_start;
			int subject_len;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%c%c%c ", (flags & (-1024 << 2)) ? (byte)' ' : (byte)'T', (flags & (-1024 << 1)) ? (byte)'U' : (byte)' ', (flags & (-1024 << 16)) ? (byte)'C' : (byte)' ');
			if (ModernizedCProgram.commit_weight.commit_weight_at(generatedItem)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%3d", p.weight());
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "---");
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), " %.*s", 8, ModernizedCProgram.oid_to_hex(generatedOid));
			for (pp = generatedParents; pp; pp = generatedNext) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), " %.*s", 8, ModernizedCProgram.oid_to_hex(generatedOid));
			}
			subject_len = /*Error: Function owner not recognized*/find_commit_subject(ModernizedCProgram.buf, subject_start);
			if (subject_len) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), " %.*s", subject_len, subject_start);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "\n");
		}
	}
	public commit_list best_bisection(int nr) {
		commit_list p = new commit_list();
		commit_list best = new commit_list();
		int best_distance = -1;
		best = ModernizedCProgram.list;
		commit generatedItem = p.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = p.getNext();
		for (p = ModernizedCProgram.list; p; p = generatedNext) {
			int distance;
			int flags = generatedFlags;
			if (flags & (-1024 << 2)) {
				continue;
			} 
			distance = p.weight();
			if (nr - distance < distance) {
				distance = nr - distance;
			} 
			if (distance > best_distance) {
				best = p;
				best_distance = distance;
			} 
		}
		return best;
	}
	public commit_list best_bisection_sorted(int nr) {
		commit_list p = new commit_list();
		commit_dist array = ModernizedCProgram.xcalloc(nr, /*Error: sizeof expression not supported yet*/);
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int cnt;
		int i;
		commit generatedItem = p.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = p.getNext();
		for (; p; p = generatedNext) {
			int distance;
			int flags = generatedFlags;
			if (flags & (-1024 << 2)) {
				continue;
			} 
			distance = p.weight();
			if (nr - distance < distance) {
				distance = nr - distance;
			} 
			array[cnt].setCommit(generatedItem);
			array[cnt].setDistance(distance);
			cnt++;
		}
		ModernizedCProgram.sane_qsort((array), (cnt), /*Error: sizeof expression not supported yet*/, compare_commit_dist);
		byte[] generatedBuf = buf.getBuf();
		for (; i < cnt; i++) {
			object obj = (generatedObject);
			buf.strbuf_setlen(0);
			buf.strbuf_addf("dist=%d", array[i].getDistance());
			obj.add_name_decoration(decoration_type.DECORATION_NONE, generatedBuf);
			p.setItem(array[i].getCommit());
			if (i < cnt - 1) {
				p = generatedNext;
			} 
		}
		if (p) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(generatedNext);
			p.setNext(((Object)0));
		} 
		buf.strbuf_release();
		ModernizedCProgram.free(array);
		return ModernizedCProgram.list/*
		 * zero or positive weight is the number of interesting commits it can
		 * reach, including itself.  Especially, weight = 0 means it does not
		 * reach any tree-changing commits (e.g. just above uninteresting one
		 * but traversal is with pathspec).
		 *
		 * weight = -1 means it has one parent and its distance is yet to
		 * be computed.
		 *
		 * weight = -2 means it has more than one parent and its distance is
		 * unknown.  After running count_distance() first, they will get zero
		 * or positive distance.
		 */;
	}
	public commit_list do_find_bisection(int nr, int[] weights, int find_all) {
		int n;
		int counted;
		commit_list p = new commit_list();
		counted = 0;
		commit generatedItem = p.getItem();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = p.getNext();
		for (; p; p = generatedNext) {
			commit commit = generatedItem;
			int flags = generatedFlags;
			ModernizedCProgram.commit_weight.commit_weight_at(generatedItem) = weights[n++];
			switch (commit.count_interesting_parents()) {
			case 1:
					p.weight_set(-1);
					break;
			case 0:
					if (!(flags & (-1024 << 2))) {
						p.weight_set(1);
						counted++;
						ModernizedCProgram.list/*
									 * otherwise, it is known not to reach any
									 * tree-changing commit and gets weight 0.
									 */.show_list("bisection 2 count one", counted, nr);
					} 
					break;
			default:
					p.weight_set(-2);
					break;
			}
		}
		ModernizedCProgram.list/*
			 * If you have only one parent in the resulting set
			 * then you can reach one commit more than that parent
			 * can reach.  So we do not have to run the expensive
			 * count_distance() for single strand of pearls.
			 *
			 * However, if you have more than one parents, you cannot
			 * just add their distance and one for yourself, since
			 * they usually reach the same ancestor and you would
			 * end up counting them twice that way.
			 *
			 * So we will first count distance of merges the usual
			 * way, and then fill the blanks using cheaper algorithm.
			 */.show_list("bisection 2 initialize", counted, nr);
		for (p = ModernizedCProgram.list; p; p = generatedNext) {
			if (generatedFlags & (-1024 << 1)) {
				continue;
			} 
			if (p.weight() != -2) {
				continue;
			} 
			p.weight_set(p.count_distance());
			ModernizedCProgram.list.clear_distance();
			if (!find_all && p.halfway(/* Does it happen to be at exactly half-way? */nr)) {
				return p;
			} 
			counted++;
		}
		ModernizedCProgram.list.show_list("bisection 2 count_distance", counted, nr);
		commit_list generatedParents = generatedItem.getParents();
		while (counted < nr) {
			for (p = ModernizedCProgram.list; p; p = generatedNext) {
				commit_list q = new commit_list();
				int flags = generatedFlags;
				if (0 <= p.weight()) {
					continue;
				} 
				for (q = generatedParents; q; q = generatedNext) {
					if (generatedFlags & (-1024 << 1)) {
						continue;
					} 
					if (0 <= q.weight()) {
						break;
					} 
				}
				if (!q) {
					continue;
				} 
				if (!(flags & (-1024 << 2))) {
					p.weight_set(q.weight() + 1);
					counted++;
					ModernizedCProgram.list.show_list("bisection 2 count one", counted, nr);
				} else {
						p.weight_set(q.weight());
				} 
				if (!find_all && p.halfway(/* Does it happen to be at exactly half-way? */nr)) {
					return p;
				} 
			}
		}
		ModernizedCProgram.list.show_list("bisection 2 counted all", counted, nr);
		if (!find_all) {
			return ModernizedCProgram.list.best_bisection(nr);
		} else {
				return ModernizedCProgram.list.best_bisection_sorted(nr);
		} 
	}
	public void find_bisection(Integer reaches, Integer all, int find_all) {
		int nr;
		int on_list;
		commit_list list = new commit_list();
		commit_list p = new commit_list();
		commit_list best = new commit_list();
		commit_list next = new commit_list();
		commit_list last = new commit_list();
		int weights;
		commit_list.show_list("bisection 2 entry", 0, 0);
		ModernizedCProgram.commit_weight/*
			 * Count the number of total and tree-changing items on the
			 * list, while reversing the list.
			 */.init_commit_weight();
		commit generatedItem = p.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = p.getNext();
		for (; p; p = next) {
			int flags = generatedFlags;
			next = generatedNext;
			if (flags & (-1024 << 1)) {
				ModernizedCProgram.free(p);
				continue;
			} 
			p.setNext(last);
			last = p;
			if (!(flags & (-1024 << 2))) {
				nr++;
			} 
			on_list++;
		}
		list = last;
		list.show_list("bisection 2 sorted", 0, nr);
		all = nr;
		weights = ModernizedCProgram.xcalloc(on_list, /*Error: sizeof expression not supported yet*/);
		best = list.do_find_bisection(nr, weights, /* Do the real work of finding bisection commit. */find_all);
		if (best) {
			if (!find_all) {
				list.setItem(generatedItem);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(generatedNext);
				best = list;
				best.setNext(((Object)0));
			} 
			reaches = best.weight();
		} 
		ModernizedCProgram.free(weights);
		commit_list = best;
		ModernizedCProgram.commit_weight.clear_commit_weight();
	}
	public commit_list filter_skipped(commit_list tried, int show_all, Integer count, Integer skipped_first) {
		commit_list filtered = ((Object)0);
		commit_list f = filtered;
		tried = ((Object)0);
		if (skipped_first) {
			skipped_first = 0;
		} 
		if (count) {
			count = 0;
		} 
		if (!ModernizedCProgram.skipped_revs.getNr()) {
			return ModernizedCProgram.list;
		} 
		while (ModernizedCProgram.list) {
			commit_list next = ModernizedCProgram.list.getNext();
			ModernizedCProgram.list.setNext(((Object)0));
			if (0 <= ModernizedCProgram.skipped_revs.oid_array_lookup(ModernizedCProgram.list.getItem().getObject().getOid())) {
				if (skipped_first && !skipped_first) {
					skipped_first = 1;
				} 
				tried = /* Move current to tried list */ModernizedCProgram.list;
				tried = ModernizedCProgram.list.getNext();
			} else {
					if (!show_all) {
						if (!skipped_first || !skipped_first) {
							return ModernizedCProgram.list;
						} 
					}  else if (skipped_first && !skipped_first) {
						skipped_first = -/* This means we know it's not skipped */1;
					} 
					f = /* Move current to filtered list */ModernizedCProgram.list;
					f = ModernizedCProgram.list.getNext();
					if (count) {
						(count)++;
					} 
			} 
			ModernizedCProgram.list = next;
		}
		if (skipped_first && skipped_first == -1) {
			skipped_first = 0;
		} 
		return filtered/*
		 * This is a pseudo random number generator based on "man 3 rand".
		 * It is not used properly because the seed is the argument and it
		 * is increased by one between each call, but that should not matter
		 * for this application.
		 */;
	}
	public commit_list skip_away(int count) {
		commit_list cur = new commit_list();
		commit_list previous = new commit_list();
		int prn;
		int index;
		int i;
		prn = ModernizedCProgram.get_prn(count);
		index = (count * prn / 32768) * ModernizedCProgram.sqrti(prn) / ModernizedCProgram.sqrti(32768);
		cur = ModernizedCProgram.list;
		previous = ((Object)0);
		commit generatedItem = cur.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		for (i = 0; cur; ) {
			if (i == index) {
				if (!ModernizedCProgram.oideq(generatedOid, ModernizedCProgram.current_bad_oid)) {
					return cur;
				} 
				if (previous) {
					return previous;
				} 
				return ModernizedCProgram.list;
			} 
			previous = cur;
		}
		return ModernizedCProgram.list;
	}
	public commit_list managed_skipped(commit_list tried) {
		int count;
		int skipped_first;
		tried = ((Object)0);
		if (!ModernizedCProgram.skipped_revs.getNr()) {
			return ModernizedCProgram.list;
		} 
		ModernizedCProgram.list = ModernizedCProgram.list.filter_skipped(tried, 0, count, skipped_first);
		if (!skipped_first) {
			return ModernizedCProgram.list;
		} 
		return ModernizedCProgram.list.skip_away(count);
	}
	public void exit_if_skipped_commits(Object bad) {
		if (!tried) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("There are only 'skip'ped commits left to test.\nThe first %s commit could be any of:\n", ModernizedCProgram.term_bad);
		commit generatedItem = this.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedNext = this.getNext();
		for (; tried; tried = generatedNext) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		}
		if (bad) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", ModernizedCProgram.oid_to_hex(bad));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("We cannot bisect more!\n"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\bisect.c", 679, (true)));
	}
	public int estimate_commit_count() {
		int n = 0;
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		while (ModernizedCProgram.list) {
			commit commit = ModernizedCProgram.list.getItem();
			int flags = generatedFlags;
			ModernizedCProgram.list = ModernizedCProgram.list.getNext();
			if (!(flags & ((-1024 << 2) | (-1024 << 1)))) {
				n++;
			} 
		}
		return n;
	}
	public void join_revs(commit_list seen_p, int num_rev, int extra) {
		int all_mask = ((-1024 << (2 + num_rev)) - 1);
		int all_revs = all_mask & ~((-1024 << 2) - 1);
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedParents = commit.getParents();
		commit generatedItem = parents.getItem();
		commit_list generatedNext = parents.getNext();
		while (list_p) {
			commit_list parents = new commit_list();
			int still_interesting = !!list_p.interesting();
			commit commit = /*Error: Function owner not recognized*/pop_commit(list_p);
			int flags = generatedFlags & all_mask;
			if (!still_interesting && extra <= 0) {
				break;
			} 
			ModernizedCProgram.mark_seen(commit, seen_p);
			if ((flags & all_revs) == all_revs) {
				flags |=  1;
			} 
			parents = generatedParents;
			while (parents) {
				commit p = generatedItem;
				int this_flag = generatedFlags;
				parents = generatedNext;
				if ((this_flag & flags) == flags) {
					continue;
				} 
				ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, p);
				if (ModernizedCProgram.mark_seen(p, seen_p) && !still_interesting) {
					extra--;
				} 
				generatedFlags |=  flags;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert_by_date(p, list_p/*
					 * Postprocess to complete well-poisoning.
					 *
					 * At this point we have all the commits we have seen in
					 * seen_p list.  Mark anything that can be reached from
					 * uninteresting commits not interesting.
					 */);
			}
		}
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			int changed = 0;
			commit_list s = new commit_list();
			for (s = seen_p; s; s = generatedNext) {
				commit c = generatedItem;
				commit_list parents = new commit_list();
				if (((generatedFlags & all_revs) != all_revs) && !(generatedFlags & 1)) {
					continue;
				} 
				parents = generatedParents;
				while (parents) {
					commit p = generatedItem;
					parents = generatedNext;
					if (!(generatedFlags & 1)) {
						generatedFlags |=  1;
						changed = 1;
					} 
				}
			}
			if (!changed) {
				break;
			} 
		}
	}
	public int show_merge_base(int num_rev) {
		int all_mask = ((-1024 << (2 + num_rev)) - 1);
		int all_revs = all_mask & ~((-1024 << 2) - 1);
		int exit_status = 1;
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		object_id generatedOid = generatedObject.getOid();
		while (seen) {
			commit commit = /*Error: Function owner not recognized*/pop_commit(seen);
			int flags = generatedFlags & all_mask;
			if (!(flags & 1) && ((flags & all_revs) == all_revs)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.oid_to_hex(generatedOid));
				exit_status = 0;
				generatedFlags |=  1;
			} 
		}
		return exit_status;
		commit_list result = new commit_list();
		commit_list r = new commit_list();
		commit_list commit_list = new commit_list();
		result = commit_list.repo_get_merge_bases_many_dirty(ModernizedCProgram.the_repository, rev[0], rev_nr - 1, rev + 1);
		if (!result) {
			return 1;
		} 
		commit generatedItem = r.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedNext = r.getNext();
		for (r = result; r; r = generatedNext) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", ModernizedCProgram.oid_to_hex(generatedOid));
			if (!ModernizedCProgram.show_all) {
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(result);
		return 0;
	}
	public commit_list append_parent(repository r, Object oid) {
		commit parent = new commit();
		parent = /*Error: Function owner not recognized*/lookup_commit_reference(r, oid);
		if (!parent) {
			ModernizedCProgram.die("no such commit %s", ModernizedCProgram.oid_to_hex(oid));
		} 
		return /*Error: Function owner not recognized*/commit_list_insert(parent, tail).getNext();
	}
	public commit_list first_scapegoat(rev_info revs, commit commit, int reverse) {
		int generatedFirst_parent_only = revs.getFirst_parent_only();
		commit_list generatedParents = commit.getParents();
		commit_list generatedNext = generatedParents.getNext();
		if (!reverse) {
			if (generatedFirst_parent_only && generatedParents && generatedNext) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(generatedNext);
				generatedParents.setNext(((Object)0));
			} 
			return generatedParents;
		} 
		decoration generatedChildren = revs.getChildren();
		object generatedObject = commit.getObject();
		return generatedChildren.lookup_decoration(generatedObject);
	}
	public void print_sorted_commit_ids() {
		int i;
		string_list s = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		string_list_item string_list_item = new string_list_item();
		while (ModernizedCProgram.list) {
			string_list_item.string_list_append(s, ModernizedCProgram.oid_to_hex(ModernizedCProgram.list.getItem().getObject().getOid()));
			ModernizedCProgram.list = ModernizedCProgram.list.getNext();
		}
		s.string_list_sort();
		int generatedNr = s.getNr();
		string_list_item[] generatedItems = s.getItems();
		for (i = 0; i < generatedNr; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", generatedItems[i].getString());
		}
		s.string_list_clear(0);
	}
	public commit_list next_interesting_parent(git_graph graph) {
		commit_list list = new commit_list();
		/*
			 * If revs->first_parent_only is set, only the first
			 * parent is interesting.  None of the others are.
			 */
		rev_info generatedRevs = graph.getRevs();
		int generatedFirst_parent_only = generatedRevs.getFirst_parent_only();
		if (generatedFirst_parent_only) {
			return ((Object)0/*
				 * Return the next interesting commit after orig
				 */);
		} 
		commit generatedItem = list.getItem();
		commit_list generatedNext = list.getNext();
		for (list = generatedNext; list; list = generatedNext) {
			if (ModernizedCProgram.graph_is_interesting(graph, generatedItem)) {
				return list;
			} 
		}
		return ((Object)0);
	}
	public commit_list first_interesting_parent(git_graph graph) {
		commit generatedCommit = graph.getCommit();
		commit_list generatedParents = generatedCommit.getParents();
		commit_list parents = generatedParents;
		if (!parents) {
			return ((Object)0/*
				 * If the first parent is interesting, return it
				 */);
		} 
		commit generatedItem = parents.getItem();
		if (ModernizedCProgram.graph_is_interesting(graph, generatedItem)) {
			return parents/*
				 * Otherwise, call next_interesting_parent() to get
				 * the next interesting parent
				 */;
		} 
		return parents.next_interesting_parent(graph);
	}
	public commit_list get_shallow_commits(object_array heads, int depth, int shallow_flag, int not_shallow_flag) {
		int i = 0;
		int cur_depth = 0;
		commit_list result = ((Object)0);
		object_array stack = new object_array(0, 0, ((Object)0));
		commit commit = ((Object)0);
		commit_graft graft = new commit_graft();
		commit_depth depths = new commit_depth();
		depths.init_commit_depth();
		int generatedNr = heads.getNr();
		object_array_entry[] generatedObjects = heads.getObjects();
		object generatedObject = commit.getObject();
		int generatedType = generatedObject.getType();
		object object = new object();
		commit_list generatedParents = commit.getParents();
		object_id generatedOid = generatedObject.getOid();
		int generatedNr_parent = graft.getNr_parent();
		int generatedFlags = generatedObject.getFlags();
		commit generatedItem = p.getItem();
		commit_list generatedNext = p.getNext();
		while (commit || i < generatedNr || generatedNr) {
			commit_list p = new commit_list();
			if (!commit) {
				if (i < generatedNr) {
					int depth_slot;
					commit = (commit)/*Error: Function owner not recognized*/deref_tag(ModernizedCProgram.the_repository, generatedObjects[i++].getItem(), ((Object)0), 0);
					if (!commit || generatedType != object_type.OBJ_COMMIT) {
						commit = ((Object)0);
						continue;
					} 
					depth_slot = depths.commit_depth_at(commit);
					if (!depth_slot) {
						depth_slot = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
					} 
					depth_slot = 0;
					cur_depth = 0;
				} else {
						commit = (commit)object.object_array_pop(stack);
						cur_depth = depths.commit_depth_at(commit);
				} 
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/parse_commit_or_die(commit);
			cur_depth++;
			if ((depth != -1024 && cur_depth >= depth) || (ModernizedCProgram.the_repository.is_repository_shallow() && !generatedParents && (graft = /*Error: Function owner not recognized*/lookup_commit_graft(ModernizedCProgram.the_repository, generatedOid)) != ((Object)0) && generatedNr_parent < 0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(commit, result);
				generatedFlags |=  shallow_flag;
				commit = ((Object)0);
				continue;
			} 
			generatedFlags |=  not_shallow_flag;
			for (; p; p = generatedNext) {
				int depth_slot = depths.commit_depth_at(generatedItem);
				if (!depth_slot) {
					depth_slot = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
					depth_slot = cur_depth;
				} else {
						if (cur_depth >= depth_slot) {
							continue;
						} 
						depth_slot = cur_depth;
				} 
				if (generatedNext) {
					ModernizedCProgram.add_object_array(generatedObject, ((Object)0), stack);
				} else {
						commit = generatedItem;
						cur_depth = depths.commit_depth_at(commit);
				} 
			}
		}
		int generatedSlab_count = depths.getSlab_count();
		int[][][] generatedSlab = depths.getSlab();
		int generatedSlab_size = depths.getSlab_size();
		for (i = 0; i < generatedSlab_count; i++) {
			int j;
			if (!generatedSlab[i]) {
				continue;
			} 
			for (j = 0; j < generatedSlab_size; j++) {
				ModernizedCProgram.free(generatedSlab[i][j]);
			}
		}
		depths.clear_commit_depth();
		return result;
	}
	public commit_list get_shallow_commits_by_rev_list(int ac, Object av, int shallow_flag, int not_shallow_flag) {
		commit_list result = ((Object)0);
		commit_list p = new commit_list();
		commit_list not_shallow_list = ((Object)0);
		rev_info revs = new rev_info();
		int both_flags = shallow_flag | not_shallow_flag/*
			 * SHALLOW (excluded) and NOT_SHALLOW (included) should not be
			 * set at this point. But better be safe than sorry.
			 */;
		ModernizedCProgram.clear_object_flags(both_flags);
		/* make sure shallows are read */ModernizedCProgram.the_repository.is_repository_shallow();
		ModernizedCProgram.repo_init_revisions(ModernizedCProgram.the_repository, revs, ((Object)0));
		ModernizedCProgram.save_commit_buffer = 0;
		ModernizedCProgram.setup_revisions(ac, av, revs, ((Object)0));
		if (revs.prepare_revision_walk()) {
			ModernizedCProgram.die("revision walk setup failed");
		} 
		revs.traverse_commit_list(show_commit, ((Object)0), not_shallow_list);
		if (!not_shallow_list) {
			ModernizedCProgram.die("no commits selected for shallow requests");
		} 
		commit generatedItem = p.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = p.getNext();
		for (p = not_shallow_list; p; p = generatedNext) {
			generatedFlags |=  not_shallow_flag/*
				 * mark border commits SHALLOW + NOT_SHALLOW.
				 * We cannot clear NOT_SHALLOW right now. Imagine border
				 * commit A is processed first, then commit B, whose parent is
				 * A, later. If NOT_SHALLOW on A is cleared at step 1, B
				 * itself is considered border at step 2, which is incorrect.
				 */;
		}
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedParents = c.getParents();
		for (p = not_shallow_list; p; p = generatedNext) {
			commit c = generatedItem;
			commit_list parent = new commit_list();
			if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, c)) {
				ModernizedCProgram.die("unable to parse commit %s", ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			for (parent = generatedParents; parent; parent = generatedNext) {
				if (!(generatedFlags & not_shallow_flag)) {
					generatedFlags |=  shallow_flag;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(c, result);
					break;
				} 
			}
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(not_shallow_list/*
			 * Now we can clean up NOT_SHALLOW on border commits. Having
			 * both flags set can confuse the caller.
			 */);
		for (p = result; p; p = generatedNext) {
			object o = generatedObject;
			if ((generatedFlags & both_flags) == both_flags) {
				generatedFlags &=  ~not_shallow_flag;
			} 
		}
		return result;
	}
	public commit_list paint_down_to_common(repository r, commit one, int n, commit[][] twos, int min_generation) {
		prio_queue queue = new prio_queue(ModernizedCProgram.compare_commits_by_gen_then_commit_date);
		commit_list result = ((Object)0);
		int i;
		uint32_t last_gen = -1024;
		if (!min_generation) {
			queue.setCompare(ModernizedCProgram.compare_commits_by_commit_date);
		} 
		object generatedObject = one.getObject();
		int generatedFlags = generatedObject.getFlags();
		generatedFlags |=  (-1024 << 16);
		if (!n) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_append(one, result);
			return result;
		} 
		queue.prio_queue_put(one);
		for (i = 0; i < n; i++) {
			generatedFlags |=  (-1024 << 17);
			queue.prio_queue_put(twos[i]);
		}
		Object generatedGeneration = commit.getGeneration();
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedParents = commit.getParents();
		commit generatedItem = parents.getItem();
		commit_list generatedNext = parents.getNext();
		while (queue.queue_has_nonstale()) {
			commit commit = queue.prio_queue_get();
			commit_list parents = new commit_list();
			int flags;
			if (min_generation && generatedGeneration > last_gen) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\commit-reach.c", 66, "bad generation skip %8x > %8x at %s", generatedGeneration, last_gen, ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			last_gen = generatedGeneration;
			if (generatedGeneration < min_generation) {
				break;
			} 
			flags = generatedFlags & ((-1024 << 16) | (-1024 << 17) | (-1024 << 18));
			if (flags == ((-1024 << 16) | (-1024 << 17))) {
				if (!(generatedFlags & (-1024 << 19))) {
					generatedFlags |=  (-1024 << 19);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert_by_date(commit, result);
				} 
				flags |=  (-1024 << /* Mark parents of a found merge stale */18);
			} 
			parents = generatedParents;
			while (parents) {
				commit p = generatedItem;
				parents = generatedNext;
				if ((generatedFlags & flags) == flags) {
					continue;
				} 
				if (ModernizedCProgram.repo_parse_commit(r, p)) {
					return ((Object)0);
				} 
				generatedFlags |=  flags;
				queue.prio_queue_put(p);
			}
		}
		queue.clear_prio_queue();
		return result;
	}
	public commit_list merge_bases_many(repository r, commit one, int n, commit[][] twos) {
		commit_list list = ((Object)0);
		commit_list result = ((Object)0);
		int i;
		for (i = 0; i < n; i++) {
			if (one == twos[i/*
						 * We do not mark this even with RESULT so we do not
						 * have to clean it up.
						 */]) {
				return /*Error: Function owner not recognized*/commit_list_insert(one, result);
			} 
		}
		if (ModernizedCProgram.repo_parse_commit(r, one)) {
			return ((Object)0);
		} 
		for (i = 0; i < n; i++) {
			if (ModernizedCProgram.repo_parse_commit(r, twos[i])) {
				return ((Object)0);
			} 
		}
		commit_list commit_list = new commit_list();
		list = commit_list.paint_down_to_common(r, one, n, twos, 0);
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		while (list) {
			commit commit = /*Error: Function owner not recognized*/pop_commit(list);
			if (!(generatedFlags & (-1024 << 18))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert_by_date(commit, result);
			} 
		}
		return result;
	}
	public commit_list get_octopus_merge_bases() {
		commit_list i = new commit_list();
		commit_list j = new commit_list();
		commit_list k = new commit_list();
		commit_list ret = ((Object)0);
		if (!in) {
			return ret;
		} 
		commit generatedItem = this.getItem();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(generatedItem, ret);
		commit_list commit_list = new commit_list();
		commit_list generatedNext = k.getNext();
		for (i = generatedNext; i; i = generatedNext) {
			commit_list new_commits = ((Object)0);
			commit_list end = ((Object)0);
			for (j = ret; j; j = generatedNext) {
				commit_list bases = new commit_list();
				bases = commit_list.repo_get_merge_bases(ModernizedCProgram.the_repository, generatedItem, generatedItem);
				if (!new_commits) {
					new_commits = bases;
				} else {
						end.setNext(bases);
				} 
				for (k = bases; k; k = generatedNext) {
					end = k;
				}
			}
			ret = new_commits;
		}
		return ret;
	}
	public commit_list get_merge_bases_many_0(repository r, commit one, int n, commit[][] twos, int cleanup) {
		commit_list list = new commit_list();
		commit rslt = new commit();
		commit_list result = new commit_list();
		int cnt;
		int i;
		commit_list commit_list = new commit_list();
		result = commit_list.merge_bases_many(r, one, n, twos);
		for (i = 0; i < n; i++) {
			if (one == twos[i]) {
				return result;
			} 
		}
		commit_list generatedNext = result.getNext();
		if (!result || !generatedNext) {
			if (cleanup) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks(one, ModernizedCProgram.all_flags);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks_many(n, twos, ModernizedCProgram.all_flags);
			} 
			return result;
		} 
		cnt = /*Error: Function owner not recognized*/commit_list_count(/* There are more than one */result);
		rslt = ModernizedCProgram.xcalloc(cnt, /*Error: sizeof expression not supported yet*/);
		commit generatedItem = list.getItem();
		for (; list; list = generatedNext) {
			rslt[i++] = generatedItem;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(result);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks(one, ModernizedCProgram.all_flags);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks_many(n, twos, ModernizedCProgram.all_flags);
		cnt = ModernizedCProgram.remove_redundant(r, rslt, cnt);
		result = ((Object)0);
		for (i = 0; i < cnt; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert_by_date(rslt[i], result);
		}
		ModernizedCProgram.free(rslt);
		return result;
	}
	public commit_list repo_get_merge_bases_many(repository r, commit one, int n, commit twos) {
		commit_list commit_list = new commit_list();
		return commit_list.get_merge_bases_many_0(r, one, n, twos, 1);
	}
	public commit_list repo_get_merge_bases_many_dirty(repository r, commit one, int n, commit twos) {
		commit_list commit_list = new commit_list();
		return commit_list.get_merge_bases_many_0(r, one, n, twos, 0);
	}
	public commit_list repo_get_merge_bases(repository r, commit one, commit two) {
		commit_list commit_list = new commit_list();
		return commit_list.get_merge_bases_many_0(r, one, 1, two, 1/*
		 * Is "commit" a descendant of one of the elements on the "with_commit" list?
		 */);
	}
	public commit_list reduce_heads() {
		commit_list p = new commit_list();
		commit_list result = ((Object)0);
		commit_list tail = result;
		commit array = new commit();
		int num_head;
		int i;
		if (!heads) {
			return ((Object)0);
		} 
		commit generatedItem = p.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = p.getNext();
		for (p = heads; p; p = generatedNext) {
			generatedFlags &=  ~(-1024 << 18);
		}
		for (; p; p = generatedNext) {
			if (generatedFlags & (-1024 << 18)) {
				continue;
			} 
			generatedFlags |=  (-1024 << 18);
			num_head++;
		}
		array = ModernizedCProgram.xcalloc(num_head, /*Error: sizeof expression not supported yet*/);
		for (; p; p = generatedNext) {
			if (generatedFlags & (-1024 << 18)) {
				array[i++] = generatedItem;
				generatedFlags &=  ~(-1024 << 18);
			} 
		}
		num_head = ModernizedCProgram.remove_redundant(ModernizedCProgram.the_repository, array, num_head);
		for (i = 0; i < num_head; i++) {
			tail = generatedNext;
		}
		ModernizedCProgram.free(array);
		return result;
	}
	public void reduce_heads_replace() {
		commit_list result = heads.reduce_heads();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(heads);
		heads = result;
	}
	public int can_all_from_reach(commit_list to, int cutoff_by_min_date) {
		object_array from_objs = new object_array(0, 0, ((Object)0));
		time_t min_commit_date = cutoff_by_min_date ? ModernizedCProgram.from.getItem().getDate() : 0;
		commit_list from_iter = ModernizedCProgram.from;
		commit_list to_iter = to;
		int result;
		uint32_t min_generation = -1024;
		commit generatedItem = from_iter.getItem();
		object generatedObject = generatedItem.getObject();
		Object generatedDate = generatedItem.getDate();
		Object generatedGeneration = generatedItem.getGeneration();
		commit_list generatedNext = from_iter.getNext();
		while (from_iter) {
			ModernizedCProgram.add_object_array(generatedObject, ((Object)0), from_objs);
			if (!ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, generatedItem)) {
				if (generatedDate < min_commit_date) {
					min_commit_date = generatedDate;
				} 
				if (generatedGeneration < min_generation) {
					min_generation = generatedGeneration;
				} 
			} 
			from_iter = generatedNext;
		}
		int generatedFlags = generatedObject.getFlags();
		while (to_iter) {
			if (!ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, generatedItem)) {
				if (generatedDate < min_commit_date) {
					min_commit_date = generatedDate;
				} 
				if (generatedGeneration < min_generation) {
					min_generation = generatedGeneration;
				} 
			} 
			generatedFlags |=  (-1024 << 17);
			to_iter = generatedNext;
		}
		result = from_objs.can_all_from_reach_with_flag((-1024 << 17), (-1024 << 16), min_commit_date, min_generation);
		while (ModernizedCProgram.from) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks(generatedItem, (-1024 << 16));
			ModernizedCProgram.from = generatedNext;
		}
		while (to) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks(generatedItem, (-1024 << 17));
			to = generatedNext;
		}
		from_objs.object_array_clear();
		return result;
	}
	public commit_list get_reachable_subset(commit from, int nr_from, commit to, int nr_to, int reachable_flag) {
		commit item = new commit();
		commit current = new commit();
		commit_list found_commits = ((Object)0);
		commit to_last = to + nr_to;
		commit from_last = from + nr_from;
		uint32_t min_generation = -1024;
		int num_to_find = 0;
		prio_queue queue = new prio_queue(ModernizedCProgram.compare_commits_by_gen_then_commit_date);
		Object generatedGeneration = c.getGeneration();
		object generatedObject = c.getObject();
		int generatedFlags = generatedObject.getFlags();
		for (item = to; item < to_last; item++) {
			commit c = item;
			ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, c);
			if (generatedGeneration < min_generation) {
				min_generation = generatedGeneration;
			} 
			if (!(generatedFlags & (-1024 << 16))) {
				generatedFlags |=  (-1024 << 16);
				num_to_find++;
			} 
		}
		for (item = from; item < from_last; item++) {
			commit c = item;
			if (!(generatedFlags & (-1024 << 17))) {
				generatedFlags |=  (-1024 << 17);
				ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, c);
				queue.prio_queue_put(item);
			} 
		}
		commit generatedItem = parents.getItem();
		commit_list generatedNext = parents.getNext();
		commit_list generatedParents = current.getParents();
		while (num_to_find && (current = queue.prio_queue_get()) != ((Object)0)) {
			commit_list parents = new commit_list();
			if (generatedFlags & (-1024 << 16)) {
				generatedFlags &=  ~(-1024 << 16);
				generatedFlags |=  reachable_flag;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(current, found_commits);
				num_to_find--;
			} 
			for (parents = generatedParents; parents; parents = generatedNext) {
				commit p = generatedItem;
				ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, p);
				if (generatedGeneration < min_generation) {
					continue;
				} 
				if (generatedFlags & (-1024 << 17)) {
					continue;
				} 
				generatedFlags |=  (-1024 << 17);
				queue.prio_queue_put(p);
			}
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks_many(nr_to, to, (-1024 << 16));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks_many(nr_from, from, (-1024 << 17));
		return found_commits;
	}
	public void limit_to_ancestry(commit_list list) {
		commit_list p = new commit_list();
		commit_list rlist = ((Object)0);
		int made_progress;
		/*
			 * Reverse the list so that it will be likely that we would
			 * process parents before children.
			 */
		commit generatedItem = p.getItem();
		commit_list generatedNext = p.getNext();
		for (p = list; p; p = generatedNext) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(generatedItem, rlist);
		}
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		for (p = bottom; p; p = generatedNext) {
			generatedFlags |=  (-1024 << 4/*
				 * Mark the ones that can reach bottom commits in "list",
				 * in a bottom-up fashion.
				 */);
		}
		commit_list generatedParents = c.getParents();
		do {
			made_progress = 0;
			for (p = rlist; p; p = generatedNext) {
				commit c = generatedItem;
				commit_list parents = new commit_list();
				if (generatedFlags & ((-1024 << 4) | (-1024 << 1))) {
					continue;
				} 
				for (parents = generatedParents; parents; parents = generatedNext) {
					if (!(generatedFlags & (-1024 << 4))) {
						continue;
					} 
					generatedFlags |=  (-1024 << 4);
					made_progress = 1;
					break;
				}
			}
		} while (made_progress/*
			 * NEEDSWORK: decide if we want to remove parents that are
			 * not marked with TMP_MARK from commit->parents for commits
			 * in the resulting list.  We may not want to do that, though.
			 */);
		for (p = list; p; p = generatedNext) {
			commit c = generatedItem;
			if (generatedFlags & (-1024 << 4)) {
				continue;
			} 
			generatedFlags |=  (-1024 << 1);
		}
		for (p = list; p; p = generatedNext) {
			generatedFlags &=  ~(-1024 << 4);
		}
		for (p = bottom; p; p = generatedNext) {
			generatedFlags &=  ~(-1024 << 4);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(rlist/*
		 * Before walking the history, keep the set of "negative" refs the
		 * caller has asked to exclude.
		 *
		 * This is used to compute "rev-list --ancestry-path A..B", as we need
		 * to filter the result of "A..B" further to the ones that can actually
		 * reach A.
		 */);
	}
	public commit_list collect_bottom_commits() {
		commit_list elem = new commit_list();
		commit_list bottom = ((Object)0);
		commit generatedItem = elem.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = elem.getNext();
		for (elem = ModernizedCProgram.list; elem; elem = generatedNext) {
			if (generatedFlags & (-1024 << 10)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(generatedItem, bottom);
			} 
		}
		return bottom;
	}
	public commit_list simplify_one(rev_info revs, commit commit) {
		commit_list p = new commit_list();
		commit parent = new commit();
		merge_simplify_state st = new merge_simplify_state();
		merge_simplify_state pst = new merge_simplify_state();
		int cnt;
		merge_simplify_state merge_simplify_state = new merge_simplify_state();
		st = merge_simplify_state.locate_simplify_state(revs, commit/*
			 * Have we handled this one?
			 */);
		commit generatedSimplified = st.getSimplified();
		if (generatedSimplified) {
			return tail/*
				 * An UNINTERESTING commit simplifies to itself, so does a
				 * root commit.  We do not rewrite parents of such commit
				 * anyway.
				 */;
		} 
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedParents = commit.getParents();
		if ((generatedFlags & (-1024 << 1)) || !generatedParents) {
			st.setSimplified(commit);
			return tail/*
				 * Do we know what commit all of our parents that matter
				 * should be rewritten to?  Otherwise we are not ready to
				 * rewrite this one yet.
				 */;
		} 
		commit generatedItem = p.getItem();
		int generatedFirst_parent_only = revs.getFirst_parent_only();
		commit_list generatedNext = p.getNext();
		for (; p; p = generatedNext) {
			pst = merge_simplify_state.locate_simplify_state(revs, generatedItem);
			if (!generatedSimplified) {
				tail = /*Error: Function owner not recognized*/commit_list_insert(generatedItem, tail).getNext();
				cnt++;
			} 
			if (generatedFirst_parent_only) {
				break;
			} 
		}
		if (cnt) {
			tail = generatedNext;
			return tail/*
				 * Rewrite our list of parents. Note that this cannot
				 * affect our TREESAME flags in any way - a commit is
				 * always TREESAME to its simplification.
				 */;
		} 
		for (p = generatedParents; p; p = generatedNext) {
			pst = merge_simplify_state.locate_simplify_state(revs, generatedItem);
			p.setItem(generatedSimplified);
			if (generatedFirst_parent_only) {
				break;
			} 
		}
		if (generatedFirst_parent_only) {
			cnt = 1;
		} else {
				cnt = ModernizedCProgram.remove_duplicate_parents(revs, commit/*
					 * It is possible that we are a merge and one side branch
					 * does not have any commit that touches the given paths;
					 * in such a case, the immediate parent from that branch
					 * will be rewritten to be the merge base.
					 *
					 *      o----X		X: the commit we are looking at;
					 *     /    /		o: a commit that touches the paths;
					 * ---o----'
					 *
					 * Further, a merge of an independent branch that doesn't
					 * touch the path will reduce to a treesame root parent:
					 *
					 *  ----o----X		X: the commit we are looking at;
					 *          /		o: a commit that touches the paths;
					 *         r		r: a root commit not touching the paths
					 *
					 * Detect and simplify both cases.
					 */);
		} 
		if (1 < cnt) {
			int marked = commit.mark_redundant_parents();
			ModernizedCProgram.marked += commit.mark_treesame_root_parents();
			if (ModernizedCProgram.marked) {
				ModernizedCProgram.marked -= ModernizedCProgram.leave_one_treesame_to_parent(revs, commit);
			} 
			if (ModernizedCProgram.marked) {
				cnt = ModernizedCProgram.remove_marked_parents(revs, commit/*
					 * A commit simplifies to itself if it is a root, if it is
					 * UNINTERESTING, if it touches the given paths, or if it is a
					 * merge and its parents don't simplify to one relevant commit
					 * (the first two cases are already handled at the beginning of
					 * this function).
					 *
					 * Otherwise, it simplifies to what its sole relevant parent
					 * simplifies to.
					 */);
			} 
		} 
		commit commit = new commit();
		if (!cnt || (generatedFlags & (-1024 << 1)) || !(generatedFlags & (-1024 << 2)) || (parent = commit.one_relevant_parent(revs, generatedParents)) == ((Object)0)) {
			st.setSimplified(commit);
		} else {
				pst = merge_simplify_state.locate_simplify_state(revs, parent);
				st.setSimplified(generatedSimplified);
		} 
		return tail;
	}
	public commit_list saved_parents_at_peek(saved_parents s, Object c, int add_if_missing) {
		int nth_slab;
		int nth_slot;
		int generatedSlab_size = s.getSlab_size();
		nth_slab = c.getIndex() / generatedSlab_size;
		nth_slot = c.getIndex() % generatedSlab_size;
		int generatedSlab_count = s.getSlab_count();
		commit_list[][][] generatedSlab = s.getSlab();
		if (generatedSlab_count <= nth_slab) {
			int i;
			if (!add_if_missing) {
				return ((Object)0);
			} 
			(generatedSlab) = ModernizedCProgram.xrealloc((generatedSlab), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nth_slab + 1)));
			for (i = generatedSlab_count; i <= nth_slab; i++) {
				generatedSlab[i] = ((Object)0);
			}
			s.setSlab_count(nth_slab + 1);
		} 
		int generatedStride = s.getStride();
		if (!generatedSlab[nth_slab]) {
			if (!add_if_missing) {
				return ((Object)0);
			} 
			generatedSlab[nth_slab] = ModernizedCProgram.xcalloc(generatedSlab_size, /*Error: sizeof expression not supported yet*/ * generatedStride);
		} 
		return generatedSlab[nth_slab][nth_slot * generatedStride];
	}
	public commit_list saved_parents_at(saved_parents s, Object c) {
		commit_list commit_list = new commit_list();
		return commit_list.saved_parents_at_peek(s, c, 1);
	}
	public commit_list saved_parents_peek(saved_parents s, Object c) {
		commit_list commit_list = new commit_list();
		return commit_list.saved_parents_at_peek(s, c, 0/*
		 * You may only call save_parents() once per commit (this is checked
		 * for non-root commits).
		 */);
	}
	public commit_list get_saved_parents(rev_info revs, Object commit) {
		commit_list parents = new commit_list();
		saved_parents generatedSaved_parents_slab = revs.getSaved_parents_slab();
		if (!generatedSaved_parents_slab) {
			return commit.getParents();
		} 
		commit_list commit_list = new commit_list();
		parents = commit_list.saved_parents_at(generatedSaved_parents_slab, commit);
		if (parents == ((commit_list)-1)) {
			return ((Object)0);
		} 
		return parents;
	}
	public void abort_commit(Object err_msg) {
		if (err_msg) {
			();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("Not committing merge; use 'git commit' to complete the merge.\n"));
		remoteheads.write_merge_state();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\merge.c", 797, (true)));
	}
	public void write_merge_heads() {
		commit_list j = new commit_list();
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		commit generatedItem = j.getItem();
		object generatedObj = desc.getObj();
		object_id generatedOid = generatedObj.getOid();
		commit_list generatedNext = j.getNext();
		for (j = remoteheads; j; j = generatedNext) {
			object_id oid = new object_id();
			commit c = generatedItem;
			merge_remote_desc desc = new merge_remote_desc();
			desc = /*Error: Function owner not recognized*/merge_remote_util(c);
			if (desc && generatedObj) {
				oid = generatedOid;
			} else {
					oid = generatedOid;
			} 
			buf.strbuf_addf("%s\n", ModernizedCProgram.oid_to_hex(oid));
		}
		byte[] generatedBuf = buf.getBuf();
		Object generatedLen = buf.getLen();
		ModernizedCProgram.write_file_buf(ModernizedCProgram.the_repository.git_path_merge_head(), generatedBuf, generatedLen);
		buf.strbuf_setlen(0);
		if (ff_type.fast_forward == ff_type.FF_NO) {
			buf.strbuf_addstr("no-ff");
		} 
		ModernizedCProgram.write_file_buf(ModernizedCProgram.the_repository.git_path_merge_mode(), generatedBuf, generatedLen);
		buf.strbuf_release();
	}
	public void write_merge_state() {
		remoteheads.write_merge_heads();
		ModernizedCProgram.merge_msg.strbuf_addch((byte)'\n');
		ModernizedCProgram.write_file_buf(ModernizedCProgram.the_repository.git_path_merge_msg(), ModernizedCProgram.merge_msg.getBuf(), ModernizedCProgram.merge_msg.getLen());
	}
	public commit_list reduce_parents(commit head_commit, Integer head_subsumed) {
		commit_list parents = new commit_list();
		commit_list remotes = new commit_list();
		/*
			 * Is the current HEAD reachable from another commit being
			 * merged?  If so we do not want to record it as a parent of
			 * the resulting merge, unless --no-ff is given.  We will flip
			 * this variable to 0 when we find HEAD among the independent
			 * tips being merged.
			 */
		head_subsumed = 1;
		parents = /* Find what parents to record by checking independent ones. */remoteheads.reduce_heads();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_list(remoteheads);
		remoteheads = ((Object)0);
		remotes = remoteheads;
		while (parents) {
			commit commit = /*Error: Function owner not recognized*/pop_commit(parents);
			if (commit == head_commit) {
				head_subsumed = 0;
			} else {
					remotes = /*Error: Function owner not recognized*/commit_list_insert(commit, remotes).getNext();
			} 
		}
		return remoteheads;
	}
	public commit_list collect_parents(commit head_commit, Integer head_subsumed, int argc, Object[][] argv, strbuf merge_msg) {
		int i;
		commit_list remoteheads = ((Object)0);
		commit_list remotes = remoteheads;
		strbuf merge_names = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf autogen = ((Object)0);
		if (merge_msg && (!ModernizedCProgram.have_message || ModernizedCProgram.shortlog_len)) {
			autogen = merge_names;
		} 
		if (head_commit) {
			remotes = /*Error: Function owner not recognized*/commit_list_insert(head_commit, remotes).getNext();
		} 
		commit generatedItem = p.getItem();
		commit_list generatedNext = p.getNext();
		if (argc == 1 && !/*Error: Function owner not recognized*/strcmp(argv[0], "FETCH_HEAD")) {
			ModernizedCProgram.handle_fetch_head(remotes, autogen);
			remoteheads = remoteheads.reduce_parents(head_commit, head_subsumed);
		} else {
				for (i = 0; i < argc; i++) {
					commit commit = /*Error: Function owner not recognized*/get_merge_parent(argv[i]);
					if (!commit) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/help_unknown_ref(argv[i], "merge", ModernizedCProgram._("not something we can merge"));
					} 
					remotes = /*Error: Function owner not recognized*/commit_list_insert(commit, remotes).getNext();
				}
				remoteheads = remoteheads.reduce_parents(head_commit, head_subsumed);
				if (autogen) {
					commit_list p = new commit_list();
					for (p = remoteheads; p; p = generatedNext) {
						autogen.merge_name(/*Error: Function owner not recognized*/merge_remote_util(generatedItem).getName());
					}
				} 
		} 
		if (autogen) {
			autogen.prepare_merge_message(merge_msg);
			autogen.strbuf_release();
		} 
		return remoteheads;
	}
	public commit getItem() {
		return item;
	}
	public void setItem(commit newItem) {
		item = newItem;
	}
	public commit_list getNext() {
		return next;
	}
	public void setNext(commit_list newNext) {
		next = newNext;
	}
}
/*
 * The size of this struct matters in full repo walk operations like
 * 'git clone' or 'git gc'. Consider using commit-slab to attach data
 * to a commit instead of adding new fields here.
 */
/*
	 * If the commit is loaded from the commit-graph file, then this
	 * member may be NULL. Only access it through repo_get_commit_tree()
	 * or get_commit_tree_oid().
	 */
