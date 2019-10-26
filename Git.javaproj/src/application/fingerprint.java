package application;

public class fingerprint {
	private hashmap map;
	private fingerprint_entry entries;
	
	public fingerprint(hashmap map, fingerprint_entry entries) {
		setMap(map);
		setEntries(entries);
	}
	public fingerprint() {
	}
	
	public void get_fingerprint(Object line_begin, Object line_end) {
		int hash;
		int c0 = 0;
		int c1;
		byte p;
		int max_map_entry_count = 1 + line_end - line_begin;
		fingerprint_entry entry = ModernizedCProgram.xcalloc(max_map_entry_count, );
		fingerprint_entry found_entry = new fingerprint_entry();
		hashmap generatedMap = this.getMap();
		generatedMap.hashmap_init(((Object)0), ((Object)0), max_map_entry_count);
		this.setEntries(entry);
		hashmap_entry generatedEntry = entry.getEntry();
		hashmap_entry hashmap_entry = new hashmap_entry();
		int generatedCount = found_entry.getCount();
		for (p = line_begin; p <= line_end; ) {
			if ((p == line_end) || ((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0)) {
				c1 = 0;
			} else {
					c1 = ModernizedCProgram.sane_case((byte)(p), -1024);
			} 
			hash = c0 | (c1 << 8);
			if (hash == /* Ignore whitespace pairs */0) {
				continue;
			} 
			generatedEntry.hashmap_entry_init(hash);
			found_entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedMap, generatedEntry, ((Object)0)), ((size_t)generatedEntry));
			if (/* member name */found_entry) {
				generatedCount += 1;
			} else {
					entry.setCount(1);
					ModernizedCProgram.hashmap_add(generatedMap, generatedEntry);
					++entry;
			} 
		}
	}
	public void free_fingerprint() {
		hashmap generatedMap = this.getMap();
		generatedMap.hashmap_free_(-1);
		fingerprint_entry generatedEntries = this.getEntries();
		ModernizedCProgram.free(generatedEntries);
	}
	public int fingerprint_similarity(fingerprint b) {
		int intersection = 0;
		hashmap_iter iter = new hashmap_iter();
		fingerprint_entry entry_a = new fingerprint_entry();
		fingerprint_entry entry_b = new fingerprint_entry();
		hashmap generatedMap = this.getMap();
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry hashmap_entry = new hashmap_entry();
		for (entry_b = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_first(generatedMap, iter), ((size_t)((int)0).getEntry())); entry_b; entry_b = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_next(iter), ((size_t)((int)0).getEntry()))) {
			entry_a = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedMap, (entry_b).getEntry(), ((Object)0)), ((size_t)((int)0).getEntry()));
			if (entry_a) {
				intersection += entry_a.getCount() < entry_b.getCount() ? entry_a.getCount() : entry_b.getCount();
			} 
		}
		return intersection;
	}
	/* Subtracts byte-pair elements in B from A, modifying A in place.
	 */
	public void fingerprint_subtract(fingerprint b) {
		hashmap_iter iter = new hashmap_iter();
		fingerprint_entry entry_a = new fingerprint_entry();
		fingerprint_entry entry_b = new fingerprint_entry();
		hashmap generatedMap = b.getMap();
		ModernizedCProgram.hashmap_iter_init(generatedMap, iter);
		hashmap_entry hashmap_entry = new hashmap_entry();
		int generatedCount = entry_a.getCount();
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry hashmap_entry = new hashmap_entry();
		for (entry_b = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_first(generatedMap, iter), ((size_t)((int)0).getEntry())); entry_b; entry_b = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_next(iter), ((size_t)((int)0).getEntry()))) {
			entry_a = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedMap, (entry_b).getEntry(), ((Object)0)), ((size_t)((int)0).getEntry()));
			if (entry_a) {
				if (generatedCount <= generatedCount) {
					hashmap_entry.hashmap_remove(generatedMap, entry_b.getEntry(), ((Object)0));
				} else {
						generatedCount -= generatedCount;
				} 
			} 
		}
	}
	/* Calculate fingerprints for a series of lines.
	 * Puts the fingerprints in the fingerprints array, which must have been
	 * preallocated to allow storing line_count elements.
	 */
	public void get_line_fingerprints(Object content, Object line_starts, long first_line, long line_count) {
		int i;
		byte linestart;
		byte lineend;
		line_starts += first_line;
		for (i = 0; i < line_count; ++i) {
			linestart = content + line_starts[i];
			lineend = content + line_starts[i + 1];
			fingerprints + i.get_fingerprint(linestart, lineend);
		}
	}
	public void free_line_fingerprints(int nr_fingerprints) {
		int i;
		for (i = 0; i < nr_fingerprints; i++) {
			fingerprints[i/* This contains the data necessary to linearly map a line number in one half
			 * of a diff chunk to the line in the other half of the diff chunk that is
			 * closest in terms of its position as a fraction of the length of the chunk.
			 */].free_fingerprint();
		}
	}
	public void find_best_line_matches(int start_a, int length_a, int start_b, int local_line_b, fingerprint fingerprints_b, Integer similarities, Integer certainties, Integer second_best_result, Integer result, Object max_search_distance_a, Object map_line_number_in_b_to_a) {
		int i;
		int search_start;
		int search_end;
		int closest_local_line_a;
		int similarity;
		int best_similarity = 0;
		int second_best_similarity = 0;
		int best_similarity_index = 0;
		int second_best_similarity_index = 0;
		if (certainties[local_line_b] != -/* certainty has already been calculated so no need to redo the work */1) {
			return ;
		} 
		closest_local_line_a = ModernizedCProgram.map_line_number(local_line_b + start_b, map_line_number_in_b_to_a) - start_a;
		search_start = closest_local_line_a - max_search_distance_a;
		if (search_start < 0) {
			search_start = 0;
		} 
		search_end = closest_local_line_a + max_search_distance_a + 1;
		if (search_end > length_a) {
			search_end = length_a;
		} 
		for (i = search_start; i < search_end; ++i) {
			similarity = ModernizedCProgram.get_similarity(similarities, i, local_line_b, closest_local_line_a, max_search_distance_a);
			if (similarity == -1/* This value will never exceed 10 but assert just in
						 * case
						 */) {
				((.abs(i - closest_local_line_a) < 1000) ? (Object)0 : ._assert("abs(i - closest_local_line_a) < 1000", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\blame.c", 663/* scale the similarity by (1000 - distance from
							 * closest line) to act as a tie break between lines
							 * that otherwise are equally similar.
							 */));
				similarity = fingerprints_b + local_line_b.fingerprint_similarity(fingerprints_a + i) * (1000 - .abs(i - closest_local_line_a));
			} 
			if (similarity > best_similarity) {
				second_best_similarity = best_similarity;
				second_best_similarity_index = best_similarity_index;
				best_similarity = similarity;
				best_similarity_index = i;
			}  else if (similarity > second_best_similarity) {
				second_best_similarity = similarity;
				second_best_similarity_index = i;
			} 
		}
		if (best_similarity == 0/* this line definitely doesn't match with anything. Mark it
				 * with this special value so it doesn't get invalidated and
				 * won't be recalculated.
				 */) {
			certainties[local_line_b] = -2;
			result[local_line_b] = -1/* Calculate the certainty with which this line matches.
					 * If the line matches well with two lines then that reduces
					 * the certainty. However we still want to prioritise matching
					 * a line that matches very well with two lines over matching a
					 * line that matches poorly with one line, hence doubling
					 * best_similarity.
					 * This means that if we have
					 * line X that matches only one line with a score of 3,
					 * line Y that matches two lines equally with a score of 5,
					 * and line Z that matches only one line with a score or 2,
					 * then the lines in order of certainty are X, Y, Z.
					 */;
		} else {
				certainties[local_line_b] = best_similarity * 2 - second_best_similarity/* We keep both the best and second best results to allow us to
						 * check at a later stage of the matching process whether the
						 * result needs to be invalidated.
						 */;
				result[local_line_b] = start_a + best_similarity_index;
				second_best_result[local_line_b] = start_a + second_best_similarity_index/*
				 * This finds the line that we can match with the most confidence, and
				 * uses it as a partition. It then calls itself on the lines on either side of
				 * that partition. In this way we avoid lines appearing out of order, and
				 * retain a sensible line ordering.
				 * \param start_a index of the first line in A with which lines in B may be
				 * 		  compared.
				 * \param start_b index of the first line in B for which matching should be
				 * 		  done.
				 * \param length_a number of lines in A with which lines in B may be compared.
				 * \param length_b number of lines in B for which matching should be done.
				 * \param fingerprints_a mutable array of fingerprints in A. The first element
				 * 			 corresponds to the line at start_a.
				 * \param fingerprints_b array of fingerprints in B. The first element
				 * 			 corresponds to the line at start_b.
				 * \param similarities 2-dimensional array of similarities between lines in A
				 * 		       and B. See get_similarity() for more details.
				 * \param certainties array of values indicating how strongly a line in B is
				 * 		      matched with some line in A.
				 * \param second_best_result array of absolute indices in A for the second
				 * 			     closest match of a line in B.
				 * \param result array of absolute indices in A for the closest match of a line
				 * 		 in B.
				 * \param max_search_distance_a maximum distance in lines from the closest line
				 * 			      in A for other lines in A for which
				 * 			      similarities may be calculated.
				 * \param max_search_distance_b an upper bound on the greatest possible
				 * 			      distance between lines in B such that they will
				 *                              both be compared with the same line in A
				 * 			      according to max_search_distance_a.
				 * \param map_line_number_in_b_to_a parameter to map_line_number().
				 */;
		} 
	}
	public void fuzzy_find_matching_lines_recurse(int start_a, int start_b, int length_a, int length_b, fingerprint fingerprints_b, Integer similarities, Integer certainties, Integer second_best_result, Integer result, int max_search_distance_a, int max_search_distance_b, Object map_line_number_in_b_to_a) {
		int i;
		int invalidate_min;
		int invalidate_max;
		int offset_b;
		int second_half_start_a;
		int second_half_start_b;
		int second_half_length_a;
		int second_half_length_b;
		int most_certain_line_a;
		int most_certain_local_line_b = -1;
		int most_certain_line_certainty = -1;
		int closest_local_line_a;
		for (i = 0; i < length_b; ++i) {
			fingerprints_a.find_best_line_matches(start_a, length_a, start_b, i, fingerprints_b, similarities, certainties, second_best_result, result, max_search_distance_a, map_line_number_in_b_to_a);
			if (certainties[i] > most_certain_line_certainty) {
				most_certain_line_certainty = certainties[i];
				most_certain_local_line_b = i;
			} 
		}
		if (most_certain_local_line_b == -/* No matches. */1) {
			return ;
		} 
		most_certain_line_a = result[most_certain_local_line_b/*
			 * Subtract the most certain line's fingerprint in B from the matched
			 * fingerprint in A. This means that other lines in B can't also match
			 * the same parts of the line in A.
			 */];
		fingerprints_a + most_certain_line_a - start_a.fingerprint_subtract(fingerprints_b + most_certain_local_line_b/* Invalidate results that may be affected by the choice of most
			 * certain line.
			 */);
		invalidate_min = most_certain_local_line_b - max_search_distance_b;
		invalidate_max = most_certain_local_line_b + max_search_distance_b + 1;
		if (invalidate_min < 0) {
			invalidate_min = 0;
		} 
		if (invalidate_max > length_b) {
			invalidate_max = length_b/* As the fingerprint in A has changed, discard previously calculated
				 * similarity values with that fingerprint.
				 */;
		} 
		for (i = invalidate_min; i < invalidate_max; ++i) {
			closest_local_line_a = ModernizedCProgram.map_line_number(i + start_b, map_line_number_in_b_to_a) - start_a/* Check that the lines in A and B are close enough that there
					 * is a similarity value for them.
					 */;
			if (.abs(most_certain_line_a - start_a - closest_local_line_a) > max_search_distance_a) {
				continue;
			} 
			ModernizedCProgram.get_similarity(similarities, most_certain_line_a - start_a, i, closest_local_line_a, max_search_distance_a) = -1/* More invalidating of results that may be affected by the choice of
				 * most certain line.
				 * Discard the matches for lines in B that are currently matched with a
				 * line in A such that their ordering contradicts the ordering imposed
				 * by the choice of most certain line.
				 */;
		}
		for (i = most_certain_local_line_b - 1; i >= invalidate_min; --i/* In this loop we discard results for lines in B that are
				 * before most-certain-line-B but are matched with a line in A
				 * that is after most-certain-line-A.
				 */) {
			if (certainties[i] >= 0 && (result[i] >= most_certain_line_a || second_best_result[i] >= most_certain_line_a)) {
				certainties[i] = -1;
			} 
		}
		for (i = most_certain_local_line_b + 1; i < invalidate_max; ++i/* In this loop we discard results for lines in B that are
				 * after most-certain-line-B but are matched with a line in A
				 * that is before most-certain-line-A.
				 */) {
			if (certainties[i] >= 0 && (result[i] <= most_certain_line_a || second_best_result[i] <= most_certain_line_a)) {
				certainties[i] = -1;
			} 
		}
		if (most_certain_local_line_b > /* Repeat the matching process for lines before the most certain line.
			 */0) {
			fingerprints_a.fuzzy_find_matching_lines_recurse(start_a, start_b, most_certain_line_a + 1 - start_a, most_certain_local_line_b, fingerprints_b, similarities, certainties, second_best_result, result, max_search_distance_a, max_search_distance_b, map_line_number_in_b_to_a);
		} 
		if (most_certain_local_line_b + 1 < /* Repeat the matching process for lines after the most certain line.
			 */length_b) {
			second_half_start_a = most_certain_line_a;
			offset_b = most_certain_local_line_b + 1;
			second_half_start_b = start_b + offset_b;
			second_half_length_a = length_a + start_a - second_half_start_a;
			second_half_length_b = length_b + start_b - second_half_start_b;
			fingerprints_a + second_half_start_a - start_a.fuzzy_find_matching_lines_recurse(second_half_start_a, second_half_start_b, second_half_length_a, second_half_length_b, fingerprints_b + offset_b, similarities + offset_b * (max_search_distance_a * 2 + 1), certainties + offset_b, second_best_result + offset_b, result + offset_b, max_search_distance_a, max_search_distance_b, map_line_number_in_b_to_a/* Find the lines in the parent line range that most closely match the lines in
			 * the target line range. This is accomplished by matching fingerprints in each
			 * blame_origin, and choosing the best matches that preserve the line ordering.
			 * See struct fingerprint for details of fingerprint matching, and
			 * fuzzy_find_matching_lines_recurse for details of preserving line ordering.
			 *
			 * The performance is believed to be O(n log n) in the typical case and O(n^2)
			 * in a pathological case, where n is the number of lines in the target range.
			 */);
		} 
	}
	public int scan_parent_range(fingerprint t_fps, int t_idx, int from, int nr_lines) {
		int sim;
		int p_idx;
		int best_sim_val = 10;
		int best_sim_idx = -1;
		for (p_idx = from; p_idx < from + nr_lines; p_idx++) {
			sim = t_fps[t_idx].fingerprint_similarity(p_fps[p_idx]);
			if (sim < best_sim_val) {
				continue;
			} 
			if (sim == best_sim_val && best_sim_idx != -/* Break ties with the closest-to-target line number */1 && .abs(best_sim_idx - t_idx) < .abs(p_idx - t_idx)) {
				continue;
			} 
			best_sim_val = sim;
			best_sim_idx = p_idx;
		}
		return best_sim_idx/*
		 * The first pass checks the blame entry (from the target) against the parent's
		 * diff chunk.  If that fails for a line, the second pass tries to match that
		 * line to any part of parent file.  That catches cases where a change was
		 * broken into two chunks by 'context.'
		 */;
	}
	public hashmap getMap() {
		return map;
	}
	public void setMap(hashmap newMap) {
		map = newMap;
	}
	public fingerprint_entry getEntries() {
		return entries;
	}
	public void setEntries(fingerprint_entry newEntries) {
		entries = newEntries;
	}
}
