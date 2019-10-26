package application;

/* A set of ranges.  The ranges must always be disjoint and sorted. */
public class range_set {
	private int alloc;
	private int nr;
	private range ranges;
	
	public range_set(int alloc, int nr, range ranges) {
		setAlloc(alloc);
		setNr(nr);
		setRanges(ranges);
	}
	public range_set() {
	}
	
	public void range_set_grow(Object extra) {
		do {
			if ((ModernizedCProgram.rs.getNr() + extra) > ModernizedCProgram.rs.getAlloc()) {
				if ((((ModernizedCProgram.rs.getAlloc()) + 16) * 3 / 2) < (ModernizedCProgram.rs.getNr() + extra)) {
					ModernizedCProgram.rs.setAlloc((ModernizedCProgram.rs.getNr() + extra));
				} else {
						ModernizedCProgram.rs.setAlloc((((ModernizedCProgram.rs.getAlloc()) + 16) * 3 / 2));
				} 
				(ModernizedCProgram.rs.getRanges()) = ModernizedCProgram.xrealloc((ModernizedCProgram.rs.getRanges()), ModernizedCProgram.st_mult(, (ModernizedCProgram.rs.getAlloc())));
			} 
		} while (0/* Either initialization would be fine */);
	}
	public void range_set_init(Object prealloc) {
		ModernizedCProgram.rs.setAlloc(ModernizedCProgram.rs.setNr(0));
		ModernizedCProgram.rs.setRanges(((Object)0));
		if (prealloc) {
			ModernizedCProgram.rs.range_set_grow(prealloc);
		} 
	}
	public void range_set_release() {
		do {
			ModernizedCProgram.free(ModernizedCProgram.rs.getRanges());
			(ModernizedCProgram.rs.getRanges()) = ((Object)0);
		} while (0);
		ModernizedCProgram.rs.setAlloc(ModernizedCProgram.rs.setNr(0));
	}
	/* dst must be uninitialized! */
	public void range_set_copy(range_set src) {
		int generatedNr = src.getNr();
		dst.range_set_init(generatedNr);
		range generatedRanges = this.getRanges();
		ModernizedCProgram.copy_array((generatedRanges), (generatedRanges), (generatedNr),  + ( - 1));
		this.setNr(generatedNr);
	}
	public void range_set_move(range_set src) {
		dst.range_set_release();
		range generatedRanges = src.getRanges();
		this.setRanges(generatedRanges);
		int generatedNr = src.getNr();
		this.setNr(generatedNr);
		int generatedAlloc = src.getAlloc();
		this.setAlloc(generatedAlloc);
		src.setRanges(((Object)0));
		src.setAlloc(src.setNr(0));
	}
	/* tack on a _new_ range _at the end_ */
	public void range_set_append_unsafe(long a, long b) {
		((a <= b) ? (Object)0 : ._assert("a <= b", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 62));
		ModernizedCProgram.rs.range_set_grow(1);
		ModernizedCProgram.rs.getRanges()[ModernizedCProgram.rs.getNr()].setStart(a);
		ModernizedCProgram.rs.getRanges()[ModernizedCProgram.rs.getNr()].setEnd(b);
		ModernizedCProgram.rs.getNr()++;
	}
	public void range_set_append(long a, long b) {
		((ModernizedCProgram.rs.getNr() == 0 || ModernizedCProgram.rs.getRanges()[ModernizedCProgram.rs.getNr() - 1].getEnd() <= a) ? (Object)0 : ._assert("rs->nr == 0 || rs->ranges[rs->nr-1].end <= a", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 71));
		ModernizedCProgram.rs.range_set_append_unsafe(a, b);
	}
	public void range_set_check_invariants() {
		int i;
		if (!ModernizedCProgram.rs) {
			return ;
		} 
		if (ModernizedCProgram.rs.getNr()) {
			((ModernizedCProgram.rs.getRanges()[0].getStart() < ModernizedCProgram.rs.getRanges()[0].getEnd()) ? (Object)0 : ._assert("rs->ranges[0].start < rs->ranges[0].end", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 99));
		} 
		for (i = 1; i < ModernizedCProgram.rs.getNr(); i++) {
			((ModernizedCProgram.rs.getRanges()[i - 1].getEnd() < ModernizedCProgram.rs.getRanges()[i].getStart()) ? (Object)0 : ._assert("rs->ranges[i-1].end < rs->ranges[i].start", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 102));
			((ModernizedCProgram.rs.getRanges()[i].getStart() < ModernizedCProgram.rs.getRanges()[i].getEnd()) ? (Object)0 : ._assert("rs->ranges[i].start < rs->ranges[i].end", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 103/*
			 * In-place pass of sorting and merging the ranges in the range set,
			 * to establish the invariants when we get the ranges from the user
			 */));
		}
	}
	public void sort_and_merge_range_set() {
		int i;
		int o = /* output cursor */0;
		ModernizedCProgram.sane_qsort((ModernizedCProgram.rs.getRanges()), (ModernizedCProgram.rs.getNr()), , range_cmp);
		for (i = 0; i < ModernizedCProgram.rs.getNr(); i++) {
			if (ModernizedCProgram.rs.getRanges()[i].getStart() == ModernizedCProgram.rs.getRanges()[i].getEnd()) {
				continue;
			} 
			if (o > 0 && ModernizedCProgram.rs.getRanges()[i].getStart() <= ModernizedCProgram.rs.getRanges()[o - 1].getEnd()) {
				if (ModernizedCProgram.rs.getRanges()[o - 1].getEnd() < ModernizedCProgram.rs.getRanges()[i].getEnd()) {
					ModernizedCProgram.rs.getRanges()[o - 1].setEnd(ModernizedCProgram.rs.getRanges()[i].getEnd());
				} 
			} else {
					ModernizedCProgram.rs.getRanges()[o].setStart(ModernizedCProgram.rs.getRanges()[i].getStart());
					ModernizedCProgram.rs.getRanges()[o].setEnd(ModernizedCProgram.rs.getRanges()[i].getEnd());
					o++;
			} 
		}
		((o <= ModernizedCProgram.rs.getNr()) ? (Object)0 : ._assert("o <= rs->nr", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 130));
		ModernizedCProgram.rs.setNr(o);
		ModernizedCProgram.rs/*
		 * Union of range sets (i.e., sets of line numbers).  Used to merge
		 * them when searches meet at a common ancestor.
		 *
		 * This is also where the ranges are consolidated into canonical form:
		 * overlapping and adjacent ranges are merged, and empty ranges are
		 * removed.
		 */.range_set_check_invariants();
	}
	public void range_set_union(range_set a, range_set b) {
		int i = 0;
		int j = 0;
		range generatedRanges = a.getRanges();
		range ra = generatedRanges;
		range rb = generatedRanges;
		int generatedNr = this.getNr();
		((generatedNr == 0) ? (Object)0 : ._assert("out->nr == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 152));
		long generatedStart = new_range.getStart();
		long generatedEnd = new_range.getEnd();
		while (i < generatedNr || j < generatedNr) {
			range new_range = new range();
			if (i < generatedNr && j < generatedNr) {
				if (ra[i].getStart() < rb[j].getStart()) {
					new_range = ra[i++];
				}  else if (ra[i].getStart() > rb[j].getStart()) {
					new_range = rb[j++];
				}  else if (ra[i].getEnd() < rb[j].getEnd()) {
					new_range = ra[i++];
				} else {
						new_range = rb[j++];
				} 
			}  else if (i < generatedNr) {
				new_range = ra[i++];
			} else {
					new_range = rb[/* a exhausted */j++];
			} 
			if (generatedStart == generatedEnd) {
				;
			}  else if (!generatedNr || generatedEnd < generatedStart) {
				out.range_set_grow(1);
				generatedRanges[generatedNr].setStart(generatedStart);
				generatedRanges[generatedNr].setEnd(generatedEnd);
				generatedNr++;
			}  else if (generatedEnd < generatedEnd) {
				generatedRanges[generatedNr - 1].setEnd(generatedEnd);
			} 
		}
	}
	public void range_set_difference(range_set a, range_set b) {
		int i;
		int j = 0;
		int generatedNr = a.getNr();
		range generatedRanges = a.getRanges();
		for (i = 0; i < generatedNr; i++) {
			long start = generatedRanges[i].getStart();
			long end = generatedRanges[i].getEnd();
			while (start < end) {
				while (j < generatedNr && start >= generatedRanges[j].getEnd()) {
					j++;
				}
				if (j >= generatedNr || end < generatedRanges[j].getStart()) {
					out.range_set_append(start, end);
					break;
				} 
				if (start >= generatedRanges[j].getStart()) {
					start = generatedRanges[j].getEnd();
				}  else if (end > generatedRanges[j].getStart()) {
					if (start < generatedRanges[j].getStart()) {
						out.range_set_append(start, generatedRanges[j].getStart());
					} 
					start = generatedRanges[j].getEnd();
				} 
			}
		}
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public range getRanges() {
		return ranges;
	}
	public void setRanges(range newRanges) {
		ranges = newRanges;
	}
}
