package application;

/*
 *  LibXDiff by Davide Libenzi ( File Differential Library )
 *  Copyright (C) 2003-2016 Davide Libenzi, Johannes E. Schindelin
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, see
 *  <http://www.gnu.org/licenses/>.
 *
 *  Davide Libenzi <davidel@xmailserver.org>
 *
 */
/*
 * The basic idea of patience diff is to find lines that are unique in
 * both files.  These are intuitively the ones that we want to see as
 * common lines.
 *
 * The maximal ordered sequence of such line pairs (where ordered means
 * that the order in the sequence agrees with the order of the lines in
 * both files) naturally defines an initial set of common lines.
 *
 * Now, the algorithm tries to extend the set of common lines by growing
 * the line ranges where the files have identical lines.
 *
 * Between those common lines, the patience diff algorithm is applied
 * recursively, until no unique line pairs can be found; these line ranges
 * are handled by the well-known Myers algorithm.
 */
/*
 * This is a hash mapping from line hash to line numbers in the first and
 * second file.
 */
public class hashmap {
	private int nr;
	private int alloc;
	private entry entries;
	private entry first;
	private entry last;
	private long has_matches;
	private s_mmfile file1;
	private s_mmfile file2;
	private s_xdfenv env;
	private Object xpp;
	
	public hashmap(int nr, int alloc, entry entries, entry first, entry last, long has_matches, s_mmfile file1, s_mmfile file2, s_xdfenv env, Object xpp) {
		setNr(nr);
		setAlloc(alloc);
		setEntries(entries);
		setFirst(first);
		setLast(last);
		setHas_matches(has_matches);
		setFile1(file1);
		setFile2(file2);
		setEnv(env);
		setXpp(xpp);
	}
	public hashmap() {
	}
	
	/* The argument "pass" is 1 for the first file, 2 for the second. */
	public void insert_record(Object xpp, int line, int pass) {
		s_xdfenv generatedEnv = this.getEnv();
		s_xdfile generatedXdf1 = generatedEnv.getXdf1();
		s_xrecord generatedRecs = generatedXdf1.getRecs();
		xrecord_t records = pass == 1 ? generatedRecs : generatedRecs;
		xrecord_t record = records[line - 1/*
			 * After xdl_prepare_env() (or more precisely, due to
			 * xdl_classify_record()), the "ha" member of the records (AKA lines)
			 * is _not_ the hash anymore, but a linearized version of it.  In
			 * other words, the "ha" member is guaranteed to start with 0 and
			 * the second record's ha can only be 0 or 1, etc.
			 *
			 * So we multiply ha by 2 in the hope that the hashing was
			 * "unique enough".
			 */];
		xrecord_t other = new xrecord_t();
		long generatedHa = record.getHa();
		int generatedAlloc = this.getAlloc();
		int index = (int)((generatedHa << 1) % generatedAlloc);
		entry generatedEntries = this.getEntries();
		Object generatedPtr = record.getPtr();
		long generatedSize = record.getSize();
		Object generatedXpp = this.getXpp();
		while (generatedEntries[index].getLine1()) {
			other = generatedRecs[generatedEntries[index].getLine1() - 1];
			if (generatedEntries[index].getHash() != generatedHa || !ModernizedCProgram.xdl_recmatch(generatedPtr, generatedSize, generatedPtr, generatedSize, generatedXpp.getFlags())) {
				if (++index >= generatedAlloc) {
					index = 0;
				} 
				continue;
			} 
			if (pass == 2) {
				this.setHas_matches(1);
			} 
			if (pass == 1 || generatedEntries[index].getLine2()) {
				generatedEntries[index].setLine2(-1024);
			} else {
					generatedEntries[index].setLine2(line);
			} 
			return ;
		}
		if (pass == 2) {
			return ;
		} 
		generatedEntries[index].setLine1(line);
		generatedEntries[index].setHash(generatedHa);
		generatedEntries[index].setAnchor(ModernizedCProgram.is_anchor(xpp, generatedPtr));
		entry generatedFirst = this.getFirst();
		if (!generatedFirst) {
			this.setFirst(generatedEntries + index);
		} 
		entry generatedLast = this.getLast();
		if (generatedLast) {
			generatedLast.setNext(generatedEntries + index);
			generatedEntries[index].setPrevious(generatedLast);
		} 
		this.setLast(generatedEntries + index);
		int generatedNr = this.getNr();
		generatedNr++;
	}
	public int match(int line1, int line2) {
		s_xdfenv generatedEnv = this.getEnv();
		s_xdfile generatedXdf1 = generatedEnv.getXdf1();
		s_xrecord generatedRecs = generatedXdf1.getRecs();
		xrecord_t record1 = generatedRecs[line1 - 1];
		xrecord_t record2 = generatedRecs[line2 - 1];
		Object generatedPtr = record1.getPtr();
		long generatedSize = record1.getSize();
		Object generatedXpp = this.getXpp();
		return ModernizedCProgram.xdl_recmatch(generatedPtr, generatedSize, generatedPtr, generatedSize, generatedXpp.getFlags());
		byte[] buf = new byte[256];
		Object generatedSel = data.getSel();
		if (!generatedSel[ListSpecifier.l] || !.strcmp(generatedSel[ListSpecifier.l], /* An empty selection or a wild card matches anything.
		     */ModernizedCProgram.wild)) {
			return True;
		} 
		Object generatedIn_pixels = data.getIn_pixels();
		switch (/* chunk out the desired part... */ListSpecifier.l) {
		case ListSpecifier.NAME:
				ModernizedCProgram.name_part(data.fn(i), buf);
				break;
		case :
				ModernizedCProgram.size_part(data.fn(i), buf, generatedIn_pixels);
				break;
		case ListSpecifier.STYLE:
				ModernizedCProgram.style_part(data.fn(i), buf);
				break;
		case ListSpecifier.ENCODING:
				ModernizedCProgram.encoding_part(data.fn(i), buf);
				break;
		default:
				;
		}
		return !.strcmp(buf, generatedSel[/* ...and chew it now */ListSpecifier.l]);
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
	public entry getEntries() {
		return entries;
	}
	public void setEntries(entry newEntries) {
		entries = newEntries;
	}
	public entry getFirst() {
		return first;
	}
	public void setFirst(entry newFirst) {
		first = newFirst;
	}
	public entry getLast() {
		return last;
	}
	public void setLast(entry newLast) {
		last = newLast;
	}
	public long getHas_matches() {
		return has_matches;
	}
	public void setHas_matches(long newHas_matches) {
		has_matches = newHas_matches;
	}
	public s_mmfile getFile1() {
		return file1;
	}
	public void setFile1(s_mmfile newFile1) {
		file1 = newFile1;
	}
	public s_mmfile getFile2() {
		return file2;
	}
	public void setFile2(s_mmfile newFile2) {
		file2 = newFile2;
	}
	public s_xdfenv getEnv() {
		return env;
	}
	public void setEnv(s_xdfenv newEnv) {
		env = newEnv;
	}
	public Object getXpp() {
		return xpp;
	}
	public void setXpp(Object newXpp) {
		xpp = newXpp;
	}
}
