package application;

public class pack_list {
	private pack_list next;
	private packed_git pack;
	private llist unique_objects;
	private llist remaining_objects;
	private Object all_objects_size;
	
	public pack_list(pack_list next, packed_git pack, llist unique_objects, llist remaining_objects, Object all_objects_size) {
		setNext(next);
		setPack(pack);
		setUnique_objects(unique_objects);
		setRemaining_objects(remaining_objects);
		setAll_objects_size(all_objects_size);
	}
	public pack_list() {
	}
	
	public pack_list pack_list_insert(pack_list entry) {
		pack_list p = ModernizedCProgram.xmalloc();
		.memcpy(p, entry, );
		p.setNext(pl);
		pl = p;
		return p;
	}
	public Object pack_list_size() {
		size_t ret = 0;
		pack_list generatedNext = this.getNext();
		while (pl) {
			ret++;
			pl = generatedNext;
		}
		return ret;
	}
	public pack_list pack_list_difference(Object A, Object B) {
		pack_list ret = new pack_list();
		pack_list pl = new pack_list();
		if (A == ((Object)0)) {
			return ((Object)0);
		} 
		pl = B;
		pack_list pack_list = new pack_list();
		while (pl != ((Object)0)) {
			if (A.getPack() == pl.getPack()) {
				return pack_list.pack_list_difference(A.getNext(), B);
			} 
			pl = pl.getNext();
		}
		ret = ModernizedCProgram.xmalloc();
		.memcpy(ret, A, );
		ret.setNext(pack_list.pack_list_difference(A.getNext(), B));
		return ret;
	}
	public void cmp_two_packs(pack_list p2) {
		long p1_off = 0;
		long p2_off = 0;
		long p1_step;
		long p2_step;
		byte p1_base;
		byte p2_base;
		llist_item p1_hint = ((Object)0);
		llist_item p2_hint = ((Object)0);
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		llist generatedUnique_objects = this.getUnique_objects();
		llist generatedRemaining_objects = this.getRemaining_objects();
		if (!generatedUnique_objects) {
			this.setUnique_objects(generatedRemaining_objects.llist_copy());
		} 
		if (!generatedUnique_objects) {
			p2.setUnique_objects(generatedRemaining_objects.llist_copy());
		} 
		packed_git generatedPack = this.getPack();
		Object generatedIndex_data = generatedPack.getIndex_data();
		p1_base = generatedIndex_data;
		p2_base = generatedIndex_data;
		int generatedIndex_version = generatedPack.getIndex_version();
		p1_base += 256 * 4 + ((generatedIndex_version < 2) ? 4 : 8);
		p2_base += 256 * 4 + ((generatedIndex_version < 2) ? 4 : 8);
		p1_step = hashsz + ((generatedIndex_version < 2) ? 4 : 0);
		p2_step = hashsz + ((generatedIndex_version < 2) ? 4 : 0);
		Object generatedNum_objects = generatedPack.getNum_objects();
		while (p1_off < generatedNum_objects * p1_step && p2_off < generatedNum_objects * p2_step) {
			int cmp = ModernizedCProgram.hashcmp(p1_base + p1_off, p2_base + p2_off);
			if (cmp == /* cmp ~ p1 - p2 */0) {
				p1_hint = p1_hint.llist_sorted_remove(generatedUnique_objects, (object_id)(p1_base + p1_off));
				p2_hint = p2_hint.llist_sorted_remove(generatedUnique_objects, (object_id)(p1_base + p1_off));
				p1_off += p1_step;
				p2_off += p2_step;
				continue;
			} 
			if (cmp < /* p1 has the object, p2 doesn't */0) {
				p1_off += p1_step;
			} else {
					p2_off += /* p2 has the object, p1 doesn't */p2_step;
			} 
		}
	}
	/* another O(n^2) function ... */
	public Object get_pack_redundancy() {
		pack_list subset = new pack_list();
		size_t ret = 0;
		if (pl == ((Object)0)) {
			return 0;
		} 
		pack_list generatedNext = this.getNext();
		packed_git generatedPack = this.getPack();
		while ((subset = generatedNext)) {
			while (subset) {
				ret += generatedPack.sizeof_union(generatedPack);
				subset = generatedNext;
			}
			pl = generatedNext;
		}
		return ret;
	}
	public Object pack_set_bytecount() {
		off_t ret = 0;
		packed_git generatedPack = this.getPack();
		Object generatedPack_size = generatedPack.getPack_size();
		Object generatedIndex_size = generatedPack.getIndex_size();
		pack_list generatedNext = this.getNext();
		while (pl) {
			ret += generatedPack_size;
			ret += generatedIndex_size;
			pl = generatedNext;
		}
		return ret;
	}
	/* Sort pack_list, greater size of remaining_objects first */
	public void sort_pack_list() {
		pack_list ary = new pack_list();
		pack_list p = new pack_list();
		int i;
		size_t n = pl.pack_list_size();
		if (n < 2) {
			return ;
		} 
		ary = ModernizedCProgram.xcalloc(n, /* prepare an array of packed_list for easier sorting */);
		pack_list generatedNext = p.getNext();
		for (; p; p = generatedNext) {
			ary[n++] = p;
		}
		ModernizedCProgram.sane_qsort((ary), (n), , cmp_remaining_objects);
		for (i = 0; i < n - 1; /* link them back again */i++) {
			ary[i].setNext(ary[i + 1]);
		}
		ary[n - 1].setNext(((Object)0));
		pl = ary[0];
		ModernizedCProgram.free(ary);
	}
	public void minimize() {
		pack_list pl = new pack_list();
		pack_list unique = ((Object)0);
		pack_list non_unique = ((Object)0);
		llist missing = new llist();
		llist unique_pack_objects = new llist();
		pl = local_packs;
		llist generatedUnique_objects = pl.getUnique_objects();
		Object generatedSize = generatedUnique_objects.getSize();
		pack_list generatedNext = pl.getNext();
		while (pl) {
			if (generatedSize) {
				unique.pack_list_insert(pl);
			} else {
					non_unique.pack_list_insert(pl);
			} 
			pl = generatedNext;
		}
		missing = /* find out which objects are missing from the set of unique packs */all_objects.llist_copy();
		pl = unique;
		llist generatedRemaining_objects = pl.getRemaining_objects();
		while (pl) {
			missing.llist_sorted_difference_inplace(generatedRemaining_objects);
			pl = generatedNext;
		}
		min = unique;
		if (generatedSize == /* return if there are no objects missing from the unique set */0) {
			ModernizedCProgram.free(missing);
			return ;
		} 
		unique_pack_objects = all_objects.llist_copy();
		unique_pack_objects.llist_sorted_difference_inplace(missing);
		pl = /* remove unique pack objects from the non_unique packs */non_unique;
		while (pl) {
			generatedRemaining_objects.llist_sorted_difference_inplace(unique_pack_objects);
			pl = generatedNext;
		}
		while (non_unique) {
			/* sort the non_unique packs, greater size of remaining_objects first */non_unique.sort_pack_list();
			if (generatedSize == 0) {
				break;
			} 
			min.pack_list_insert(non_unique);
			for (pl = generatedNext; pl && generatedSize > 0; pl = generatedNext) {
				generatedRemaining_objects.llist_sorted_difference_inplace(generatedRemaining_objects);
			}
			non_unique = generatedNext;
		}
	}
	public pack_list add_pack(packed_git p) {
		pack_list l = new pack_list();
		long off = 0;
		long step;
		byte base;
		int generatedPack_local = p.getPack_local();
		if (!generatedPack_local && !(ModernizedCProgram.alt_odb || ModernizedCProgram.verbose)) {
			return ((Object)0);
		} 
		l.setPack(p);
		llist generatedRemaining_objects = l.getRemaining_objects();
		generatedRemaining_objects.llist_init();
		if (p.open_pack_index()) {
			return ((Object)0);
		} 
		Object generatedIndex_data = p.getIndex_data();
		base = generatedIndex_data;
		int generatedIndex_version = p.getIndex_version();
		base += 256 * 4 + ((generatedIndex_version < 2) ? 4 : 8);
		step = ModernizedCProgram.the_repository.getHash_algo().getRawsz() + ((generatedIndex_version < 2) ? 4 : 0);
		Object generatedNum_objects = p.getNum_objects();
		llist_item llist_item = new llist_item();
		while (off < generatedNum_objects * step) {
			llist_item.llist_insert_back(generatedRemaining_objects, (object_id)(base + off));
			off += step;
		}
		Object generatedSize = generatedRemaining_objects.getSize();
		l.setAll_objects_size(generatedSize);
		l.setUnique_objects(((Object)0));
		if (generatedPack_local) {
			return local_packs.pack_list_insert(l);
		} else {
				return altodb_packs.pack_list_insert(l);
		} 
	}
	public pack_list add_pack_file(Object filename) {
		packed_git packed_git = new packed_git();
		packed_git p = packed_git.get_all_packs(ModernizedCProgram.the_repository);
		if (.strlen(filename) < 40) {
			ModernizedCProgram.die("Bad pack filename: %s", filename);
		} 
		Object generatedPack_name = p.getPack_name();
		pack_list pack_list = new pack_list();
		packed_git generatedNext = p.getNext();
		while (p) {
			if (.strstr(generatedPack_name, filename)) {
				return pack_list.add_pack(p);
			} 
			p = generatedNext;
		}
		ModernizedCProgram.die("Filename %s not found in packed_git", filename);
	}
	public pack_list getNext() {
		return next;
	}
	public void setNext(pack_list newNext) {
		next = newNext;
	}
	public packed_git getPack() {
		return pack;
	}
	public void setPack(packed_git newPack) {
		pack = newPack;
	}
	public llist getUnique_objects() {
		return unique_objects;
	}
	public void setUnique_objects(llist newUnique_objects) {
		unique_objects = newUnique_objects;
	}
	public llist getRemaining_objects() {
		return remaining_objects;
	}
	public void setRemaining_objects(llist newRemaining_objects) {
		remaining_objects = newRemaining_objects;
	}
	public Object getAll_objects_size() {
		return all_objects_size;
	}
	public void setAll_objects_size(Object newAll_objects_size) {
		all_objects_size = newAll_objects_size;
	}
}
