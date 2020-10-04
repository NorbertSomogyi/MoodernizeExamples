package application;

public class Test_gzioToGzgets {
	
	
	/* ===========================================================================
	 * Test read/write of .gz files
	 */
	public static void test_gzio(Object fname, Object uncompr, Object uncomprLen) {
		int err;
		int len = (int)/*Error: Function owner not recognized*/strlen(ModernizedCProgram.hello) + 1;
		gzFile file = new gzFile();
		long pos;
		file = ModernizedCProgram.gzopen(fname, "wb");
		if (file == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzopen error\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		ModernizedCProgram.gzputc(file, (byte)'h');
		if (ModernizedCProgram.gzputs(file, "ello") != 4) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzputs err: %s\n", ModernizedCProgram.gzerror(file, err));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		if (ModernizedCProgram.gzprintf(file, ", %s!", "hello") != 8) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzprintf err: %s\n", ModernizedCProgram.gzerror(file, err));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		ModernizedCProgram.gzseek(file, -1024, /* add one zero byte */1);
		ModernizedCProgram.gzclose(file);
		file = ModernizedCProgram.gzopen(fname, "rb");
		if (file == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzopen error\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)uncompr, "garbage");
		if (ModernizedCProgram.gzread(file, uncompr, (int)uncomprLen) != len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzread err: %s\n", ModernizedCProgram.gzerror(file, err));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		if (/*Error: Function owner not recognized*/strcmp((byte)uncompr, ModernizedCProgram.hello)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "bad gzread: %s\n", (byte)uncompr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("gzread(): %s\n", (byte)uncompr);
		} 
		pos = ModernizedCProgram.gzseek(file, --1024, 1);
		if (pos != 6 || ModernizedCProgram.gztell(file) != pos) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzseek error, pos=%ld, gztell=%ld\n", (long)pos, (long)ModernizedCProgram.gztell(file));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		if (((file).getHave() ? () : /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(file)) != (byte)' ') {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzgetc error\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		if (ModernizedCProgram.gzungetc((byte)' ', file) != (byte)' ') {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzungetc error\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		ModernizedCProgram.gzgets(file, (byte)uncompr, (int)uncomprLen);
		if (/*Error: Function owner not recognized*/strlen((byte)uncompr) != /* " hello!" */7) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzgets err after gzseek: %s\n", ModernizedCProgram.gzerror(file, err));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		if (/*Error: Function owner not recognized*/strcmp((byte)uncompr, ModernizedCProgram.hello + 6)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "bad gzgets after gzseek\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("gzgets() after gzseek: %s\n", (byte)uncompr);
		} 
		ModernizedCProgram.gzclose(file/* Z_SOLO */);
	}
	/* ===========================================================================
	 * Test compress() and uncompress()
	 */
	/* compressed file name */
	/* -- see zlib.h -- */
	private static int gzputc(Object file, int c) {
		int have;
		byte[] buf = new byte[1];
		gz_statep state = new gz_statep();
		z_streamp strm = new z_streamp();
		if (file == (null)) {
			return -1;
		} 
		state = (gz_statep)file;
		strm = (state.getStrm());
		if (state.getMode() != 31153 || state.getErr() != /* check that we're writing and that there's no error */0) {
			return -1;
		} 
		if (state.getSeek()) {
			state.setSeek(0);
			if (ModernizedCProgram.gz_zero(state, state.getSkip()) == -1) {
				return -1;
			} 
		} 
		if (state.getSize()) {
			if (strm.getAvail_in() == 0) {
				strm.setNext_in(state.getIn());
			} 
			have = (int)((strm.getNext_in() + strm.getAvail_in()) - state.getIn());
			if (have < state.getSize()) {
				state.getIn()[have] = (byte)c;
				strm.getAvail_in()++;
				state.getX().getPos()++;
				return c & -1024;
			} 
		} 
		buf[0] = (byte)/* no room in buffer or not initialized, use gz_write() */c;
		if (ModernizedCProgram.gz_write(state, buf, 1) != 1) {
			return -1;
		} 
		return c & -1024;
	}
	/* -- see zlib.h -- */
	private static long gzseek(Object file, long offset, int whence) {
		long ret;
		ret = ModernizedCProgram.gzseek64(file, (long)offset, whence);
		return ret == (long)ret ? (long)ret : -1;
	}
	/* gzclose.c -- zlib gzclose() function
	 * Copyright (C) 2004, 2010 Mark Adler
	 * For conditions of distribution and use, see copyright notice in zlib.h
	 */
	/* gzclose() is in a separate file so that it is linked in only if it is used.
	   That way the other gzclose functions can be used instead to avoid linking in
	   unneeded compression or decompression routines. */
	private static int gzclose(Object file) {
		gz_statep state = new gz_statep();
		if (file == (null)) {
			return (true);
		} 
		state = (gz_statep)file;
		return state.getMode() == 7247 ? ModernizedCProgram.gzclose_r(file) : ModernizedCProgram.gzclose_w(file);
	}
	/* -- see zlib.h -- */
	private static Byte gzgets(Object file, byte[] buf, int len) {
		int left;
		int n;
		Byte str;
		Byte eol;
		gz_statep state = new gz_statep();
		if (file == (null) || buf == (null) || len < /* check parameters and get internal structure */1) {
			return (null);
		} 
		state = (gz_statep)file;
		if (state.getMode() != /* check that we're reading and that there's no (serious) error */7247 || (state.getErr() != 0 && state.getErr() != (true))) {
			return (null);
		} 
		if (state.getSeek()) {
			state.setSeek(0);
			if (ModernizedCProgram.gz_skip(state, state.getSkip()) == -1) {
				return (null);
			} 
		} 
		str = /* copy output bytes up to new line or len - 1, whichever comes first --
		       append a terminating zero to the string (we don't check for a zero in
		       the contents, let the user worry about that) */buf;
		left = (int)len - 1;
		if (left) {
			do {
				if (state.getX().getHave() == 0 && ModernizedCProgram.gz_fetch(state) == -/* assure that something is in the output buffer */1) {
					return (null);
				} 
				if (state.getX().getHave() == /* end of file */0) {
					state.setPast(/* read past end */1);
					break;
				} 
				n = state.getX().getHave() > left ? left : state.getX().getHave();
				eol = (byte)/*Error: Function owner not recognized*/memchr(state.getX().getNext(), (byte)'\n', n);
				if (eol != (null)) {
					n = (int)(eol - state.getX().getNext()) + 1;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf, state.getX().getNext(), /* copy through end-of-line, or remainder if not found */n);
				state.getX().getHave() -= n;
				state.getX().getNext() += n;
				state.getX().getPos() += n;
				left -= n;
				buf += n;
			} while (left && eol == (null));
		} 
		if (buf == /* return terminated string, or if nothing, end of file */str) {
			return (null);
		} 
		buf[0] = 0;
		return str;
	}
}
