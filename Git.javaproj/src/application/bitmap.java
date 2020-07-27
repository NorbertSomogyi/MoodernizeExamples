package application;

public class bitmap {
	private Object[] words;
	private Object word_alloc;
	
	public bitmap(Object[] words, Object word_alloc) {
		setWords(words);
		setWord_alloc(word_alloc);
	}
	public bitmap() {
	}
	
	public bitmap bitmap_new() {
		bitmap bitmap = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		bitmap.setWords(ModernizedCProgram.xcalloc(32, /*Error: Unsupported expression*/));
		bitmap.setWord_alloc(32);
		return bitmap;
	}
	public void bitmap_set(Object pos) {
		size_t block = (pos / (/*Error: Unsupported expression*/ * 8));
		Object generatedWord_alloc = this.getWord_alloc();
		Object[] generatedWords = this.getWords();
		if (block >= generatedWord_alloc) {
			size_t old_size = generatedWord_alloc;
			this.setWord_alloc(block * 2);
			(generatedWords) = ModernizedCProgram.xrealloc((generatedWords), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedWord_alloc)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedWords + old_size, -1024, (generatedWord_alloc - old_size) * /*Error: Unsupported expression*/);
		} 
		generatedWords[block] |=  ((eword_t)1 << (pos % (/*Error: Unsupported expression*/ * 8)));
	}
	public int bitmap_get(Object pos) {
		size_t block = (pos / (/*Error: Unsupported expression*/ * 8));
		Object generatedWord_alloc = this.getWord_alloc();
		Object[] generatedWords = this.getWords();
		return block < generatedWord_alloc && (generatedWords[block] & ((eword_t)1 << (pos % (/*Error: Unsupported expression*/ * 8)))) != 0;
	}
	public bitmap ewah_to_bitmap(ewah_bitmap ewah) {
		bitmap bitmap = new bitmap();
		bitmap bitmap = bitmap.bitmap_new();
		ewah_iterator it = new ewah_iterator();
		eword_t blowup = new eword_t();
		size_t i = 0;
		ModernizedCProgram.ewah_iterator_init(it, ewah);
		Object generatedWord_alloc = bitmap.getWord_alloc();
		Object[] generatedWords = bitmap.getWords();
		while (it.ewah_iterator_next(blowup)) {
			do {
				if ((i + 1) > generatedWord_alloc) {
					if ((((generatedWord_alloc) + 16) * 3 / 2) < (i + 1)) {
						bitmap.setWord_alloc((i + 1));
					} else {
							bitmap.setWord_alloc((((generatedWord_alloc) + 16) * 3 / 2));
					} 
					(generatedWords) = ModernizedCProgram.xrealloc((generatedWords), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedWord_alloc)));
				} 
			} while (0);
			generatedWords[i++] = blowup;
		}
		bitmap.setWord_alloc(i);
		return bitmap;
	}
	public void bitmap_and_not(bitmap other) {
		Object generatedWord_alloc = this.getWord_alloc();
		size_t count = (generatedWord_alloc < generatedWord_alloc) ? generatedWord_alloc : generatedWord_alloc;
		size_t i = new size_t();
		Object[] generatedWords = this.getWords();
		for (i = 0; i < count; ++i) {
			generatedWords[i] &=  ~generatedWords[i];
		}
	}
	public Object bitmap_popcount() {
		size_t i = new size_t();
		size_t count = 0;
		Object generatedWord_alloc = this.getWord_alloc();
		Object[] generatedWords = this.getWords();
		for (i = 0; i < generatedWord_alloc; ++i) {
			count += ModernizedCProgram.ewah_bit_popcount64(generatedWords[i]);
		}
		return count;
	}
	public int bitmap_equals(bitmap other) {
		bitmap big = new bitmap();
		bitmap small = new bitmap();
		size_t i = new size_t();
		Object generatedWord_alloc = this.getWord_alloc();
		if (generatedWord_alloc < generatedWord_alloc) {
			small = self;
			big = other;
		} else {
				small = other;
				big = self;
		} 
		Object[] generatedWords = small.getWords();
		for (i = 0; i < generatedWord_alloc; ++i) {
			if (generatedWords[i] != generatedWords[i]) {
				return 0;
			} 
		}
		for (; i < generatedWord_alloc; ++i) {
			if (generatedWords[i] != 0) {
				return 0;
			} 
		}
		return 1;
	}
	public void bitmap_reset() {
		Object[] generatedWords = this.getWords();
		Object generatedWord_alloc = this.getWord_alloc();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedWords, -1024, generatedWord_alloc * /*Error: Unsupported expression*/);
	}
	public void bitmap_free() {
		if (bitmap == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedWords = this.getWords();
		ModernizedCProgram.free(generatedWords);
		ModernizedCProgram.free(bitmap);
	}
	public bitmap find_objects(bitmap_index bitmap_git, rev_info revs, object_list roots) {
		bitmap base = ((Object)0);
		int needs_walk = 0;
		object_list not_mapped = ((Object)0/*
			 * Go through all the roots for the walk. The ones that have bitmaps
			 * on the bitmap index will be `or`ed together to form an initial
			 * global reachability analysis.
			 *
			 * The ones without bitmaps in the index will be stored in the
			 * `not_mapped_list` for further processing.
			 */);
		object generatedItem = roots.getItem();
		object_list generatedNext = roots.getNext();
		int generatedType = object.getType();
		 generatedBitmaps = bitmap_git.getBitmaps();
		object_id generatedOid = object.getOid();
		Object generatedN_buckets = (generatedBitmaps).getN_buckets();
		Object generatedVals = (generatedBitmaps).getVals();
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		bitmap bitmap = new bitmap();
		int generatedFlags = object.getFlags();
		while (roots) {
			object object = generatedItem;
			roots = generatedNext;
			if (generatedType == object_type.OBJ_COMMIT) {
				khiter_t pos = generatedOid.kh_get_oid_map(generatedBitmaps);
				if (pos < (generatedN_buckets)) {
					stored_bitmap st = (generatedVals[pos]);
					ewah_bitmap or_with = ewah_bitmap.lookup_stored_bitmap(st);
					if (base == ((Object)0)) {
						base = bitmap.ewah_to_bitmap(or_with);
					} else {
							ModernizedCProgram.bitmap_or_ewah(base, or_with);
					} 
					generatedFlags |=  (-1024 << 0);
					continue;
				} 
			} 
			not_mapped/*
				 * Best case scenario: We found bitmaps for all the roots,
				 * so the resulting `or` bitmap has the full reachability analysis
				 */.object_list_insert(object);
		}
		if (not_mapped == ((Object)0)) {
			return base;
		} 
		roots = not_mapped/*
			 * Let's iterate through all the roots that don't have bitmaps to
			 * check if we can determine them to be reachable from the existing
			 * global bitmap.
			 *
			 * If we cannot find them in the existing global bitmap, we'll need
			 * to push them to an actual walk and run it until we can confirm
			 * they are reachable
			 */;
		while (roots) {
			object object = generatedItem;
			int pos;
			roots = generatedNext;
			pos = bitmap_git.bitmap_position(generatedOid);
			if (pos < 0 || base == ((Object)0) || !base.bitmap_get(pos)) {
				generatedFlags &=  ~(-1024 << 1);
				ModernizedCProgram.add_pending_object(revs, object, "");
				needs_walk = 1;
			} else {
					generatedFlags |=  (-1024 << 0);
			} 
		}
		bitmap bitmap = new bitmap();
		if (needs_walk) {
			include_data incdata = new include_data();
			bitmap_show_data show_data = new bitmap_show_data();
			if (base == ((Object)0)) {
				base = bitmap.bitmap_new();
			} 
			incdata.setBitmap_git(bitmap_git);
			incdata.setBase(base);
			incdata.setSeen(seen);
			revs.setInclude_check(should_include);
			revs.setInclude_check_data(incdata);
			if (revs.prepare_revision_walk()) {
				ModernizedCProgram.die("revision walk setup failed");
			} 
			show_data.setBitmap_git(bitmap_git);
			show_data.setBase(base);
			revs.traverse_commit_list(show_commit, show_object, show_data);
		} 
		return base;
	}
	public Object[] getWords() {
		return words;
	}
	public void setWords(Object[] newWords) {
		words = newWords;
	}
	public Object getWord_alloc() {
		return word_alloc;
	}
	public void setWord_alloc(Object newWord_alloc) {
		word_alloc = newWord_alloc;
	}
}
