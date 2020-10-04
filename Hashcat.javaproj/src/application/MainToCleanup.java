package application;

public class MainToCleanup {
	
	
	// #define NUM_PARENTS_MAX 128
	public static int main(int numargs, byte[][] args) {
		ISzAlloc allocImp = new ISzAlloc();
		ISzAlloc allocTempImp = new ISzAlloc();
		CFileInStream archiveStream = new CFileInStream();
		CLookToRead2 lookStream = new CLookToRead2();
		CSzArEx db = new CSzArEx();
		SRes res = new SRes();
		UInt16[] temp = (null);
		size_t tempSize = 0;
		// UInt32 parents[NUM_PARENTS_MAX];
		ModernizedCProgram.Print("\n7z Decoder 19.00 (x86) : Igor Pavlov : Public domain : 2019-02-21\n\n");
		if (numargs == 1) {
			ModernizedCProgram.Print("Usage: 7zDec <command> <archive_name>\n\n<Commands>\n  e: Extract files from archive (without using directory names)\n  l: List contents of archive\n  t: Test integrity of archive\n  x: eXtract files with full paths\n");
			return 0;
		} 
		if (numargs < 3) {
			ModernizedCProgram.PrintError("incorrect command");
			return 1;
		} 
		allocImp = ModernizedCProgram.g_Alloc;
		allocTempImp = ModernizedCProgram.g_Alloc;
		Object generatedFile = archiveStream.getFile();
		if (generatedFile.InFile_Open(args[2])) {
			ModernizedCProgram.PrintError("can not open input file");
			return 1;
		} 
		archiveStream.FileInStream_CreateVTable();
		lookStream.LookToRead2_CreateVTable(0);
		lookStream.setBuf((null));
		res = 0;
		Object generatedBuf = lookStream.getBuf();
		Object generatedVt = archiveStream.getVt();
		{ 
			lookStream.setBuf((Byte)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(allocImp, ((size_t)1 << 18)));
			if (!generatedBuf) {
				res = 2;
			} else {
					lookStream.setBufSize(((size_t)1 << 18));
					lookStream.setRealStream(generatedVt);
					{ 
						(lookStream).setPos((lookStream).setSize(0));
					}
					;
			} 
		}
		ModernizedCProgram.CrcGenerateTable();
		db.SzArEx_Init();
		if (res == 0) {
			res = ModernizedCProgram.SzArEx_Open(db, generatedVt, allocImp, allocTempImp);
		} 
		Object generatedNumFiles = db.getNumFiles();
		Object generatedIsDirs = (db).getIsDirs();
		Object generatedAttribs = db.getAttribs();
		Object generatedUnpackPositions = (db).getUnpackPositions();
		Object generatedMTime = db.getMTime();
		Object generatedCTime = db.getCTime();
		Object generatedHandle = outFile.getHandle();
		if (res == 0) {
			Byte command = args[1];
			int listCommand = 0;
			int testCommand = 0;
			int fullPaths = 0;
			if (/*Error: Function owner not recognized*/strcmp(command, "l") == 0) {
				listCommand = 1;
			}  else if (/*Error: Function owner not recognized*/strcmp(command, "t") == 0) {
				testCommand = 1;
			}  else if (/*Error: Function owner not recognized*/strcmp(command, "e") == 0) {
			}  else if (/*Error: Function owner not recognized*/strcmp(command, "x") == 0) {
				fullPaths = 1;
			} else {
					ModernizedCProgram.PrintError("incorrect command");
					res = 11;
			} 
			if (res == 0) {
				UInt32 i = new UInt32();
				UInt32 blockIndex = /* it can have any value before first call (if outBuffer = 0) */-1024;
				Byte outBuffer = /* it must be 0 before first call for each new archive. */0;
				size_t outBufferSize = /* it can have any value before first call (if outBuffer = 0) */0;
				for (i = 0; i < generatedNumFiles; i++) {
					size_t offset = 0;
					size_t outSizeProcessed = 0;
					size_t len = new size_t();
					int isDir = ((((generatedIsDirs)[(i) >> 3] & (-1024 >> ((i) & 7))) != 0));
					if (listCommand == 0 && isDir && !fullPaths) {
						continue;
					} 
					len = ModernizedCProgram.SzArEx_GetFileNameUtf16(db, i, (null));
					if (len > tempSize) {
						ModernizedCProgram.SzFree((null), temp);
						tempSize = len;
						temp = (UInt16)ModernizedCProgram.SzAlloc((null), tempSize * /*Error: sizeof expression not supported yet*/);
						if (!temp) {
							res = 2;
							break;
						} 
					} 
					ModernizedCProgram.SzArEx_GetFileNameUtf16(db, i, temp/*
					        if (SzArEx_GetFullNameUtf16_Back(&db, i, temp + len) != temp)
					        {
					          res = SZ_ERROR_FAIL;
					          break;
					        }
					        */);
					if (listCommand) {
						byte[] attr = new byte[8];
						byte[] s = new byte[32];
						byte[] t = new byte[32];
						UInt64 fileSize = new UInt64();
						ModernizedCProgram.GetAttribString(((generatedAttribs).getDefs() && ((generatedAttribs).getDefs()[(i) >> 3] & (-1024 >> ((i) & 7))) != 0) ? generatedAttribs.getVals()[i] : 0, isDir, attr);
						fileSize = (generatedUnpackPositions[(i) + 1] - generatedUnpackPositions[i]);
						ModernizedCProgram.UInt64ToStr(fileSize, s, 10);
						if (((generatedMTime).getDefs() && ((generatedMTime).getDefs()[(i) >> 3] & (-1024 >> ((i) & 7))) != 0)) {
							ModernizedCProgram.ConvertFileTimeToString(generatedMTime.getVals()[i], t);
						} else {
								size_t j = new size_t();
								for (j = 0; j < 19; j++) {
									t[j] = (byte)' ';
								}
								t[j] = (byte)'\0';
						} 
						ModernizedCProgram.Print(t);
						ModernizedCProgram.Print(" ");
						ModernizedCProgram.Print(attr);
						ModernizedCProgram.Print(" ");
						ModernizedCProgram.Print(s);
						ModernizedCProgram.Print("  ");
						res = ModernizedCProgram.PrintString(temp);
						if (res != 0) {
							break;
						} 
						if (isDir) {
							ModernizedCProgram.Print("/");
						} 
						ModernizedCProgram.PrintLF();
						continue;
					} 
					ModernizedCProgram.Print(testCommand ? "Testing    " : "Extracting ");
					res = ModernizedCProgram.PrintString(temp);
					if (res != 0) {
						break;
					} 
					if (isDir) {
						ModernizedCProgram.Print("/");
					} else {
							res = generatedVt.SzArEx_Extract(db, i, blockIndex, outBuffer, outBufferSize, offset, outSizeProcessed, allocImp, allocTempImp);
							if (res != 0) {
								break;
							} 
					} 
					if (!testCommand) {
						CSzFile outFile = new CSzFile();
						size_t processedSize = new size_t();
						size_t j = new size_t();
						UInt16 name = (UInt16)temp;
						UInt16 destPath = (UInt16)name;
						for (j = 0; name[j] != 0; j++) {
							if (name[j] == (byte)'/') {
								if (fullPaths) {
									name[j] = 0;
									ModernizedCProgram.MyCreateDir(name);
									name[j] = (byte)'\\';
								} else {
										destPath = name + j + 1;
								} 
							} 
						}
						if (isDir) {
							ModernizedCProgram.MyCreateDir(destPath);
							ModernizedCProgram.PrintLF();
							continue;
						}  else if (outFile.OutFile_OpenUtf16(destPath)) {
							ModernizedCProgram.PrintError("can not open output file");
							res = 11;
							break;
						} 
						processedSize = outSizeProcessed;
						if (outFile.File_Write(outBuffer + offset, processedSize) != 0 || processedSize != outSizeProcessed) {
							ModernizedCProgram.PrintError("can not write output file");
							res = 11;
							break;
						} 
						{ 
							FILETIME mtime = new FILETIME();
							FILETIME ctime = new FILETIME();
							FILETIME mtimePtr = (null);
							FILETIME ctimePtr = (null);
							if (((generatedMTime).getDefs() && ((generatedMTime).getDefs()[(i) >> 3] & (-1024 >> ((i) & 7))) != 0)) {
								CNtfsFileTime t = generatedMTime.getVals()[i];
								mtime.setDwLowDateTime((DWORD)(t.getLow()));
								mtime.setDwHighDateTime((DWORD)(t.getHigh()));
								mtimePtr = mtime;
							} 
							if (((generatedCTime).getDefs() && ((generatedCTime).getDefs()[(i) >> 3] & (-1024 >> ((i) & 7))) != 0)) {
								CNtfsFileTime t = generatedCTime.getVals()[i];
								ctime.setDwLowDateTime((DWORD)(t.getLow()));
								ctime.setDwHighDateTime((DWORD)(t.getHigh()));
								ctimePtr = ctime;
							} 
							if (mtimePtr || ctimePtr) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetFileTime(generatedHandle, ctimePtr, (null), mtimePtr);
							} 
						}
						if (outFile.File_Close()) {
							ModernizedCProgram.PrintError("can not close output file");
							res = 11;
							break;
						} 
						if (((generatedAttribs).getDefs() && ((generatedAttribs).getDefs()[(i) >> 3] & (-1024 >> ((i) & 7))) != 0)) {
							UInt32 attrib = generatedAttribs.getVals()[i/* p7zip stores posix attributes in high 16 bits and adds 0x8000 as marker.
							               We remove posix bits, if we detect posix mode field */];
							if ((attrib & -1024) != 0) {
								attrib &=  -1024;
							} 
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetFileAttributesW((LPCWSTR)destPath, attrib);
						} 
					} 
					ModernizedCProgram.PrintLF();
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(allocImp, outBuffer);
			} 
		} 
		ModernizedCProgram.SzFree((null), temp);
		db.SzArEx_Free(allocImp);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(allocImp, generatedBuf);
		generatedFile.File_Close();
		if (res == 0) {
			ModernizedCProgram.Print("\nEverything is Ok\n");
			return 0;
		} 
		if (res == 4) {
			ModernizedCProgram.PrintError("decoder doesn't support this archive");
		}  else if (res == 2) {
			ModernizedCProgram.PrintError("can not allocate memory");
		}  else if (res == 3) {
			ModernizedCProgram.PrintError("CRC error");
		} else {
				byte[] s = new byte[32];
				ModernizedCProgram.UInt64ToStr(res, s, 0);
				ModernizedCProgram.PrintError(s);
		} 
		return 1;
		/* return code */int ret;
		/* requested fixed output block size */int size;
		/* bytes written by deflate() call */int have;
		/* intermediate and final stream */Byte blk;
		/* close to desired size stream */Byte tmp;
		/* zlib deflate and inflate states */z_stream def = new z_stream();
		z_stream inf = new z_stream();
		if (argc != /* get requested output size */2) {
			ModernizedCProgram.quit("need one argument: size of output block");
		} 
		ret = /*Error: Function owner not recognized*/strtol(argv[1], argv + 1, 10);
		if (argv[1][0] != 0) {
			ModernizedCProgram.quit("argument must be a number");
		} 
		if (ret < /* 8 is minimum zlib stream size */8) {
			ModernizedCProgram.quit("need positive size of 8 or greater");
		} 
		size = (int)ret;
		blk = /*Error: Function owner not recognized*/malloc(size + /* allocate memory for buffers and compression engine */256);
		def.setZalloc(0);
		def.setZfree(0);
		def.setOpaque(0);
		ret = ModernizedCProgram.deflateInit_((def), ((true)), "1.2.11", (int)/*Error: Unsupported expression*/);
		if (ret != 0 || blk == (null)) {
			ModernizedCProgram.quit("out of memory");
		} 
		def.setAvail_out(size + /* compress from stdin until output full, or no more input */256);
		def.setNext_out(blk);
		ret = (_iob[0]).partcompress(def);
		if (ret == (true)) {
			ModernizedCProgram.quit("error reading input");
		} 
		Object generatedAvail_out = def.getAvail_out();
		if (ret == 1 && generatedAvail_out >= /* if it all fit, then size was undersubscribed -- done! */256) {
			have = size + 256 - generatedAvail_out;
			if (/*Error: Function owner not recognized*/fwrite(blk, 1, have, (_iob[1])) != have || (((_iob[1])).get_flag() & -1024)) {
				ModernizedCProgram.quit("error writing output");
			} 
			ret = ModernizedCProgram.deflateEnd(/* clean up and print results to stderr */def);
			((ret != (true)) ? null : /*Error: Function owner not recognized*/_assert("ret != Z_STREAM_ERROR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\fitblk.c", 171));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(blk);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%u bytes unused out of %u requested (all input)\n", size - have, size);
			return 0;
		} 
		inf.setZalloc(/* it didn't all fit -- set up for recompression */0);
		inf.setZfree(0);
		inf.setOpaque(0);
		inf.setAvail_in(0);
		inf.setNext_in(0);
		ret = ModernizedCProgram.inflateInit_((inf), "1.2.11", (int)/*Error: Unsupported expression*/);
		tmp = /*Error: Function owner not recognized*/malloc(size + 256);
		if (ret != 0 || tmp == (null)) {
			ModernizedCProgram.quit("out of memory");
		} 
		ret = ModernizedCProgram.deflateReset(def);
		((ret != (true)) ? null : /*Error: Function owner not recognized*/_assert("ret != Z_STREAM_ERROR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\fitblk.c", 190));
		inf.setAvail_in(size + /* do first recompression close to the right amount */256);
		inf.setNext_in(blk);
		def.setAvail_out(size + 256);
		def.setNext_out(tmp);
		ret = ModernizedCProgram.recompress(inf, def);
		if (ret == (true)) {
			ModernizedCProgram.quit("out of memory");
		} 
		ret = ModernizedCProgram.inflateReset(/* set up for next reocmpression */inf);
		((ret != (true)) ? null : /*Error: Function owner not recognized*/_assert("ret != Z_STREAM_ERROR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\fitblk.c", 203));
		ret = ModernizedCProgram.deflateReset(def);
		((ret != (true)) ? null : /*Error: Function owner not recognized*/_assert("ret != Z_STREAM_ERROR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\fitblk.c", 205));
		inf.setAvail_in(size - /* do second and final recompression (third compression) *//* assure stream will complete */8);
		inf.setNext_in(tmp);
		def.setAvail_out(size);
		def.setNext_out(blk);
		ret = ModernizedCProgram.recompress(inf, def);
		if (ret == (true)) {
			ModernizedCProgram.quit("out of memory");
		} 
		((ret == 1) ? null : /*Error: Function owner not recognized*/_assert("ret == Z_STREAM_END", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\fitblk.c", /* otherwise MARGIN too small */215));
		have = size - generatedAvail_out;
		if (/*Error: Function owner not recognized*/fwrite(blk, 1, have, (_iob[1])) != have || (((_iob[1])).get_flag() & -1024)) {
			ModernizedCProgram.quit("error writing output");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(/* clean up and print results to stderr */tmp);
		ret = ModernizedCProgram.inflateEnd(inf);
		((ret != (true)) ? null : /*Error: Function owner not recognized*/_assert("ret != Z_STREAM_ERROR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\fitblk.c", 225));
		ret = ModernizedCProgram.deflateEnd(def);
		((ret != (true)) ? null : /*Error: Function owner not recognized*/_assert("ret != Z_STREAM_ERROR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\fitblk.c", 227));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(blk);
		Object generatedTotal_in = def.getTotal_in();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%u bytes unused out of %u requested (%lu input)\n", size - have, size, generatedTotal_in);
		return 0;
		int len;
		off_t offset = new off_t();
		FILE in = new FILE();
		access index = (null);
		byte[] buf = new byte[16384];
		if (argc != /* open input file */2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "usage: zran file.gz\n");
			return 1;
		} 
		in = /*Error: Function owner not recognized*/fopen(argv[1], "rb");
		if (in == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: could not open %s for reading\n", argv[1]);
			return 1;
		} 
		len = ModernizedCProgram.build_index(in, -1024, /* build index */index);
		if (len < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(in);
			switch (len) {
			case (true):
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: out of memory\n");
					break;
			case (true):
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: read error on %s\n", argv[1]);
					break;
			case (true):
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: compressed data error in %s\n", argv[1]);
					break;
			default:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: error %d while building index\n", len);
			}
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: built index with %d access points\n", len);
		point[] generatedList = index.getList();
		int generatedHave = index.getHave();
		offset = (generatedList[generatedHave - 1].getOut() << 1) / /* use index by reading some bytes from an arbitrary offset */3;
		len = ModernizedCProgram.extract(in, index, offset, buf, 16384);
		if (len < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: extraction failed: %s error\n", len == (true) ? "out of memory" : "input corrupted");
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(buf, 1, len, (_iob[1]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "zran: extracted %d bytes at %llu\n", len, offset);
		} 
		/* clean up and exit */index.free_index();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(in);
		return 0;
		int gd;
		int level;
		z_stream strm = new z_stream();
		argc--;
		/* ignore command name */argv++;
		if (argv == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("gzappend 1.2 (11 Oct 2012) Copyright (C) 2003, 2012 Mark Adler\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: gzappend [-level] file.gz [ addthis [ andthis ... ]]\n");
			return 0;
		} 
		level = (/* set compression level */true);
		if (argv[0][0] == (byte)'-') {
			if (argv[0][1] < (byte)'0' || argv[0][1] > (byte)'9' || argv[0][2] != 0) {
				ModernizedCProgram.bye("invalid compression level", "");
			} 
			level = argv[0][1] - (byte)'0';
			if (++argv == (null)) {
				ModernizedCProgram.bye("no gzip file name after options", "");
			} 
		} 
		gd = strm.gzscan(argv++, /* prepare to append to gzip file */level);
		if (argv == (null)) {
			strm.gztack((null), gd, 1);
		} else {
				do {
					strm.gztack(argv, gd, argv[1] == (null));
				} while (++argv != (null));
		} 
		return 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s\n", ModernizedCProgram.zlibVersion());
		ModernizedCProgram.cover_support();
		ModernizedCProgram.cover_wrap();
		ModernizedCProgram.cover_back();
		ModernizedCProgram.cover_inflate();
		ModernizedCProgram.cover_trees();
		ModernizedCProgram.cover_fast();
		return 0;
		int ret;
		int put = 0;
		int fail = 0;
		int skip = 0;
		byte[] arg;
		Byte name = (null);
		Byte source = (null);
		Byte dest;
		size_t len = 0;
		long sourcelen;
		long destlen;
		while () {
			if (arg[0] == (byte)'-') {
				if (arg[1] == (byte)'w' && arg[2] == 0) {
					put = 1;
				}  else if (arg[1] == (byte)'f' && arg[2] == 0) {
					;
				}  else if (arg[1] >= (byte)'0' && arg[1] <= (byte)'9') {
					skip = (int)/*Error: Function owner not recognized*/atoi(arg + 1);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "invalid option %s\n", arg);
						return 3;
				} 
			}  else if (name != (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "only one file name allowed\n");
				return 3;
			} else {
					name = arg;
			} 
		}
		source = ModernizedCProgram.load(name, len);
		if (source == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "memory allocation failure\n");
			return 4;
		} 
		if (len == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "could not read %s, or it was empty\n", name == (null) ? "<stdin>" : name);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(source);
			return 3;
		} 
		if (skip >= len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "skip request of %d leaves no input\n", skip);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(source);
			return 3;
		} 
		len -= /* test inflate data with offset skip */skip;
		sourcelen = (long)len;
		ret = ModernizedCProgram.puff(((byte)0), destlen, source + skip, sourcelen);
		if (ret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "puff() failed with return code %d\n", ret);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "puff() succeeded uncompressing %lu bytes\n", destlen);
				if (sourcelen < len) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%lu compressed bytes unused\n", len - sourcelen);
				} 
		} 
		if (put && ret == /* if requested, inflate again and write decompressd data to stdout */0) {
			if (fail) {
				destlen >>=  1;
			} 
			dest = /*Error: Function owner not recognized*/malloc(destlen);
			if (dest == (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "memory allocation failure\n");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(source);
				return 4;
			} 
			ModernizedCProgram.puff(dest, destlen, source + skip, sourcelen);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmode((((_iob[1])).get_file()), -1024);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(dest, 1, destlen, (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(dest);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(/* clean up */source);
		return ret;
		Byte compr = new Byte();
		Byte uncompr = new Byte();
		uLong comprLen = 10000 * /*Error: Unsupported expression*//* don't overflow on MSDOS */;
		uLong uncomprLen = comprLen;
		byte[] myVersion = "1.2.11";
		if (ModernizedCProgram.zlibVersion()[0] != myVersion[0]) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "incompatible zlib version\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		}  else if (/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.zlibVersion(), "1.2.11") != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "warning: different zlib version\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("zlib version %s = 0x%04x, compile flags = 0x%lx\n", "1.2.11", -1024, ModernizedCProgram.zlibCompileFlags());
		compr = (Byte)/*Error: Function owner not recognized*/calloc((uInt)comprLen, 1);
		uncompr = (Byte)/*Error: Function owner not recognized*/calloc((uInt)uncomprLen, 1/* compr and uncompr are cleared to avoid reading uninitialized
		     * data and to ensure that uncompr compresses well.
		     */);
		if (compr == 0 || uncompr == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("out of memory\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		ModernizedCProgram.test_compress(compr, comprLen, uncompr, uncomprLen);
		ModernizedCProgram.test_gzio((argc > 1 ? argv[1] : "foo.gz"), uncompr, uncomprLen);
		ModernizedCProgram.test_deflate(compr, comprLen);
		ModernizedCProgram.test_inflate(compr, comprLen, uncompr, uncomprLen);
		ModernizedCProgram.test_large_deflate(compr, comprLen, uncompr, uncomprLen);
		ModernizedCProgram.test_large_inflate(compr, comprLen, uncompr, uncomprLen);
		ModernizedCProgram.test_flush(compr, comprLen);
		ModernizedCProgram.test_sync(compr, comprLen, uncompr, uncomprLen);
		comprLen = uncomprLen;
		ModernizedCProgram.test_dict_deflate(compr, comprLen);
		ModernizedCProgram.test_dict_inflate(compr, comprLen, uncompr, uncomprLen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(compr);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(uncompr);
		return 0;
		// this increases the size on windows dos boxes// this increases the size on windows dos boxesModernizedCProgram.setup_console();
		time_t proc_start = /*Error: Function owner not recognized*/time((null));
		// hashcat main context
		hashcat_ctx_t hashcat_ctx = (hashcat_ctx_t)ModernizedCProgram.hcmalloc(/*Error: Unsupported expression*/);
		if (hashcat_ctx.hashcat_init(event) == -1) {
			ModernizedCProgram.hcfree(hashcat_ctx);
			return -1;
		} 
		Byte install_folder = (null);
		Byte shared_folder = (null);
		// initialize the user options with some defaults (you can override them later)if (hashcat_ctx.user_options_init() == -1) {
			ModernizedCProgram.hcfree(hashcat_ctx);
			return -1;
		} 
		// parse commandline parameters and check themif (hashcat_ctx.user_options_getopt(argc, argv) == -1) {
			ModernizedCProgram.hcfree(hashcat_ctx);
			return -1;
		} 
		if (hashcat_ctx.user_options_sanity() == -1) {
			ModernizedCProgram.hcfree(hashcat_ctx);
			return -1;
		} 
		user_options generatedUser_options = hashcat_ctx.getUser_options();
		// some early exitsuser_options_t user_options = generatedUser_options;
		boolean generatedVersion = user_options.getVersion();
		if (generatedVersion == true) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", VERSION_TAG);
			ModernizedCProgram.hcfree(hashcat_ctx);
			return 0;
		} 
		// init a hashcat session; this initializes backend devices, hwmon, etc// init a hashcat session; this initializes backend devices, hwmon, etchashcat_ctx.welcome_screen(VERSION_TAG);
		int rc_final = -1;
		boolean generatedUsage = user_options.getUsage();
		boolean generatedExample_hashes = user_options.getExample_hashes();
		boolean generatedBackend_info = user_options.getBackend_info();
		if (hashcat_ctx.hashcat_session_init(install_folder, shared_folder, argc, argv, COMPTIME) == 0) {
			if (generatedUsage == true) {
				hashcat_ctx.usage_big_print();
				rc_final = 0;
			}  else if (generatedExample_hashes == true) {
				hashcat_ctx.example_hashes();
				rc_final = 0;
			}  else if (generatedBackend_info == true) {
				hashcat_ctx.backend_info();
				rc_final = 0;
			} else {
					hashcat_ctx.backend_info_compact();
					hashcat_ctx.user_options_info();
					rc_final = hashcat_ctx.hashcat_session_execute();
			} 
		} 
		// finish the hashcat session, this shuts down backend devices, hwmon, etc// finish the hashcat session, this shuts down backend devices, hwmon, etchashcat_ctx.hashcat_session_destroy()// finished with hashcat, clean up;// finished with hashcat, clean up
		time_t proc_stop = /*Error: Function owner not recognized*/time((null));
		hashcat_ctx.goodbye_screen(proc_start, proc_stop);
		hashcat_ctx.hashcat_destroy();
		ModernizedCProgram.hcfree(hashcat_ctx);
		return rc_final;
		int copyout = 0;
		int uncompr = 0;
		gzFile file = new gzFile();
		Byte bname;
		byte[] outmode = new byte[20];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(outmode, /*Error: sizeof expression not supported yet*/, "%s", "wb6 ");
		ModernizedCProgram.prog = argv[0];
		bname = /*Error: Function owner not recognized*/strrchr(argv[0], (byte)'/');
		if (bname) {
			bname++;
		} else {
				bname = argv[0];
		} 
		;
		if (!/*Error: Function owner not recognized*/strcmp(bname, "gunzip")) {
			uncompr = 1;
		}  else if (!/*Error: Function owner not recognized*/strcmp(bname, "zcat")) {
			copyout = uncompr = 1;
		} 
		while (argc > 0) {
			if (/*Error: Function owner not recognized*/strcmp(argv, "-c") == 0) {
				copyout = 1;
			}  else if (/*Error: Function owner not recognized*/strcmp(argv, "-d") == 0) {
				uncompr = 1;
			}  else if (/*Error: Function owner not recognized*/strcmp(argv, "-f") == 0) {
				outmode[3] = (byte)'f';
			}  else if (/*Error: Function owner not recognized*/strcmp(argv, "-h") == 0) {
				outmode[3] = (byte)'h';
			}  else if (/*Error: Function owner not recognized*/strcmp(argv, "-r") == 0) {
				outmode[3] = (byte)'R';
			}  else if ((argv)[0] == (byte)'-' && (argv)[1] >= (byte)'1' && (argv)[1] <= (byte)'9' && (argv)[2] == 0) {
				outmode[2] = (argv)[1];
			} else {
					break;
			} 
			;
		}
		if (outmode[3] == (byte)' ') {
			outmode[3] = 0;
		} 
		if (argc == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmode((((_iob[0])).get_file()), -1024);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmode((((_iob[1])).get_file()), -1024);
			if (uncompr) {
				file = ModernizedCProgram.gzdopen((((_iob[0])).get_file()), "rb");
				if (file == (null)) {
					ModernizedCProgram.error("can't gzdopen stdin");
				} 
				(_iob[1]).gz_uncompress(file);
			} else {
					file = ModernizedCProgram.gzdopen((((_iob[1])).get_file()), outmode);
					if (file == (null)) {
						ModernizedCProgram.error("can't gzdopen stdout");
					} 
					(_iob[0]).gz_compress(file);
			} 
		} else {
				if (copyout) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmode((((_iob[1])).get_file()), -1024);
				} 
				do {
					if (uncompr) {
						if (copyout) {
							file = ModernizedCProgram.gzopen(argv, "rb");
							if (file == (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: can't gzopen %s\n", ModernizedCProgram.prog, argv);
							} else {
									(_iob[1]).gz_uncompress(file);
							} 
						} else {
								ModernizedCProgram.file_uncompress(argv);
						} 
					} else {
							if (copyout) {
								FILE in = /*Error: Function owner not recognized*/fopen(argv, "rb");
								if (in == (null)) {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror(argv);
								} else {
										file = ModernizedCProgram.gzdopen((((_iob[1])).get_file()), outmode);
										if (file == (null)) {
											ModernizedCProgram.error("can't gzdopen stdout");
										} 
										in.gz_compress(file);
								} 
							} else {
									ModernizedCProgram.file_compress(argv, outmode);
							} 
					} 
				} while ();
		} 
		return 0;
		int ret;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmode((((_iob[0])).get_file()), /* avoid end-of-line conversions */-1024);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmode((((_iob[1])).get_file()), -1024);
		if (argc == /* do compression if no arguments */1) {
			ret = (_iob[0]).def((_iob[1]), (true));
			if (ret != 0) {
				ModernizedCProgram.zerr(ret);
			} 
			return ret;
		}  else if (argc == 2 && /*Error: Function owner not recognized*/strcmp(argv[1], "-d") == /* do decompression if -d specified */0) {
			ret = ModernizedCProgram.inf((_iob[0]), (_iob[1]));
			if (ret != 0) {
				ModernizedCProgram.zerr(ret);
			} 
			return ret;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("zpipe usage: zpipe [-d] < source > dest\n", (_iob[/* otherwise, report usage */2]));
				return 1;
		} 
		Byte zipfilename = (null);
		Byte filename_to_extract = (null);
		Byte password = (null);
		byte[] filename_try = "";
		int i;
		int ret_value = 0;
		int opt_do_list = 0;
		int opt_do_extract = 1;
		int opt_do_extract_withoutpath = 0;
		int opt_overwrite = 0;
		int opt_extractdir = 0;
		Byte dirname = (null);
		unzFile uf = (null);
		ModernizedCProgram.do_banner();
		if (argc == 1) {
			ModernizedCProgram.do_help();
			return 0;
		} else {
				for (i = 1; i < argc; i++) {
					if ((argv[i]) == (byte)'-') {
						Byte p = argv[i] + 1;
						while ((p) != (byte)'\0') {
							byte c = (p++);
							;
							if ((c == (byte)'l') || (c == (byte)'L')) {
								opt_do_list = 1;
							} 
							if ((c == (byte)'v') || (c == (byte)'V')) {
								opt_do_list = 1;
							} 
							if ((c == (byte)'x') || (c == (byte)'X')) {
								opt_do_extract = 1;
							} 
							if ((c == (byte)'e') || (c == (byte)'E')) {
								opt_do_extract = opt_do_extract_withoutpath = 1;
							} 
							if ((c == (byte)'o') || (c == (byte)'O')) {
								opt_overwrite = 1;
							} 
							if ((c == (byte)'d') || (c == (byte)'D')) {
								opt_extractdir = 1;
								dirname = argv[i + 1];
							} 
							if (((c == (byte)'p') || (c == (byte)'P')) && (i + 1 < argc)) {
								password = argv[i + 1];
								i++;
							} 
						}
					} else {
							if (zipfilename == (null)) {
								zipfilename = argv[i];
							}  else if ((filename_to_extract == (null)) && (!opt_extractdir)) {
								filename_to_extract = argv[i];
							} 
					} 
				}
		} 
		if (zipfilename != (null)) {
			zlib_filefunc64_def ffunc = new zlib_filefunc64_def();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(filename_try, zipfilename, (true) - 1);
			filename_try[(true)] = /* strncpy doesnt append the trailing NULL, of the string is too long. */(byte)'\0';
			ffunc.fill_win32_filefunc64A();
			uf = ffunc.unzOpen2_64(zipfilename);
			if (uf == (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat(filename_try, ".zip");
				uf = ffunc.unzOpen2_64(filename_try);
			} 
		} 
		if (uf == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Cannot open %s or %s.zip\n", zipfilename, zipfilename);
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s opened\n", filename_try);
		if (opt_do_list == 1) {
			ret_value = ModernizedCProgram.do_list(uf);
		}  else if (opt_do_extract == 1) {
			if (opt_extractdir && /*Error: Function owner not recognized*/_chdir(dirname)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error changing into %s, aborting\n", dirname);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(-1);
			} 
			if (filename_to_extract == (null)) {
				ret_value = ModernizedCProgram.do_extract(uf, opt_do_extract_withoutpath, opt_overwrite, password);
			} else {
					ret_value = ModernizedCProgram.do_extract_onefile(uf, filename_to_extract, opt_do_extract_withoutpath, opt_overwrite, password);
			} 
		} 
		ModernizedCProgram.unzClose(uf);
		return ret_value;
		int BlockSizeCompress = -1024;
		int BlockSizeUncompress = -1024;
		int cprLevel = (true);
		long lFileSize;
		Byte FilePtr;
		long lBufferSizeCpr;
		long lBufferSizeUncpr;
		long lCompressedSize = 0;
		Byte CprPtr;
		Byte UncprPtr;
		long lSizeCpr;
		long lSizeUncpr;
		DWORD dwGetTick = new DWORD();
		DWORD dwMsecQP = new DWORD();
		LARGE_INTEGER li_qp = new LARGE_INTEGER();
		LARGE_INTEGER li_rdtsc = new LARGE_INTEGER();
		LARGE_INTEGER dwResRdtsc = new LARGE_INTEGER();
		if (argc <= 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("run TestZlib <File> [BlockSizeCompress] [BlockSizeUncompress] [compres. level]\n");
			return 0;
		} 
		if (ModernizedCProgram.ReadFileMemory(argv[1], lFileSize, FilePtr) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error reading %s\n", argv[1]);
			return 1;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("file %s read, %u bytes\n", argv[1], lFileSize);
		} 
		if (argc >= 3) {
			BlockSizeCompress = /*Error: Function owner not recognized*/atol(argv[2]);
		} 
		if (argc >= 4) {
			BlockSizeUncompress = /*Error: Function owner not recognized*/atol(argv[3]);
		} 
		if (argc >= 5) {
			cprLevel = (int)/*Error: Function owner not recognized*/atol(argv[4]);
		} 
		lBufferSizeCpr = lFileSize + (lFileSize / -1024) + -1024;
		lBufferSizeUncpr = lBufferSizeCpr;
		CprPtr = (byte)/*Error: Function owner not recognized*/malloc(lBufferSizeCpr + BlockSizeCompress);
		li_qp.BeginCountPerfCounter(1);
		dwGetTick = /*Error: Function owner not recognized*/GetTickCount();
		li_rdtsc.BeginCountRdtsc();
		Object generatedTotal_in = zcpr.getTotal_in();
		Object generatedAvail_in = zcpr.getAvail_in();
		Object generatedTotal_out = zcpr.getTotal_out();
		Object generatedQuadPart = dwResRdtsc.getQuadPart();
		{ 
			z_stream zcpr = new z_stream();
			int ret = 0;
			long lOrigToDo = lFileSize;
			long lOrigDone = 0;
			int step = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(zcpr, 0, /*Error: Unsupported expression*/);
			ModernizedCProgram.deflateInit_((zcpr), (cprLevel), "1.2.11", (int)/*Error: Unsupported expression*/);
			zcpr.setNext_in(FilePtr);
			zcpr.setNext_out(CprPtr);
			do {
				long all_read_before = generatedTotal_in;
				zcpr.setAvail_in(((lOrigToDo) < (BlockSizeCompress) ? (lOrigToDo) : (BlockSizeCompress)));
				zcpr.setAvail_out(BlockSizeCompress);
				ret = ModernizedCProgram.deflate(zcpr, (generatedAvail_in == lOrigToDo) ? 4 : 2);
				lOrigDone += (generatedTotal_in - all_read_before);
				lOrigToDo -= (generatedTotal_in - all_read_before);
				step++;
			} while (ret == 0);
			lSizeCpr = generatedTotal_out;
			ModernizedCProgram.deflateEnd(zcpr);
			dwGetTick = /*Error: Function owner not recognized*/GetTickCount() - dwGetTick;
			dwMsecQP = li_qp.GetMsecSincePerfCounter(1);
			dwResRdtsc = li_rdtsc.GetResRdtsc(1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("total compress size = %u, in %u step\n", lSizeCpr, step);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("time = %u msec = %f sec\n", dwGetTick, dwGetTick / (double)1000.0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("defcpr time QP = %u msec = %f sec\n", dwMsecQP, dwMsecQP / (double)1000.0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("defcpr result rdtsc = %I64x\n\n", generatedQuadPart);
		}
		CprPtr = (byte)/*Error: Function owner not recognized*/realloc(CprPtr, lSizeCpr);
		UncprPtr = (byte)/*Error: Function owner not recognized*/malloc(lBufferSizeUncpr + BlockSizeUncompress);
		li_qp.BeginCountPerfCounter(1);
		dwGetTick = /*Error: Function owner not recognized*/GetTickCount();
		li_rdtsc.BeginCountRdtsc();
		{ 
			z_stream zcpr = new z_stream();
			int ret = 0;
			long lOrigToDo = lSizeCpr;
			long lOrigDone = 0;
			int step = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(zcpr, 0, /*Error: Unsupported expression*/);
			ModernizedCProgram.inflateInit_((zcpr), "1.2.11", (int)/*Error: Unsupported expression*/);
			zcpr.setNext_in(CprPtr);
			zcpr.setNext_out(UncprPtr);
			do {
				long all_read_before = generatedTotal_in;
				zcpr.setAvail_in(((lOrigToDo) < (BlockSizeUncompress) ? (lOrigToDo) : (BlockSizeUncompress)));
				zcpr.setAvail_out(BlockSizeUncompress);
				ret = ModernizedCProgram.inflate(zcpr, 2);
				lOrigDone += (generatedTotal_in - all_read_before);
				lOrigToDo -= (generatedTotal_in - all_read_before);
				step++;
			} while (ret == 0);
			lSizeUncpr = generatedTotal_out;
			ModernizedCProgram.inflateEnd(zcpr);
			dwGetTick = /*Error: Function owner not recognized*/GetTickCount() - dwGetTick;
			dwMsecQP = li_qp.GetMsecSincePerfCounter(1);
			dwResRdtsc = li_rdtsc.GetResRdtsc(1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("total uncompress size = %u, in %u step\n", lSizeUncpr, step);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("time = %u msec = %f sec\n", dwGetTick, dwGetTick / (double)1000.0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("uncpr  time QP = %u msec = %f sec\n", dwMsecQP, dwMsecQP / (double)1000.0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("uncpr  result rdtsc = %I64x\n\n", generatedQuadPart);
		}
		if (lSizeUncpr == lFileSize) {
			if (/*Error: Function owner not recognized*/memcmp(FilePtr, UncprPtr, lFileSize) == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("compare ok\n");
			} 
		} 
		return 0;
		int action = .TGZ_EXTRACT;
		int arg = 1;
		Byte TGZfile;
		gzFile f = new gzFile();
		ModernizedCProgram.prog = /*Error: Function owner not recognized*/strrchr(argv[0], (byte)'\\');
		if (ModernizedCProgram.prog == (null)) {
			ModernizedCProgram.prog = /*Error: Function owner not recognized*/strrchr(argv[0], (byte)'/');
			if (ModernizedCProgram.prog == (null)) {
				ModernizedCProgram.prog = /*Error: Function owner not recognized*/strrchr(argv[0], (byte)':');
				if (ModernizedCProgram.prog == (null)) {
					ModernizedCProgram.prog = argv[0];
				} else {
						ModernizedCProgram.prog++;
				} 
			} else {
					ModernizedCProgram.prog++;
			} 
		} else {
				ModernizedCProgram.prog++;
		} 
		if (argc == 1) {
			ModernizedCProgram.help(0);
		} 
		if (/*Error: Function owner not recognized*/strcmp(argv[arg], "-l") == 0) {
			action = .TGZ_LIST;
			if (argc == ++arg) {
				ModernizedCProgram.help(0);
			} 
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[arg], "-h") == 0) {
			ModernizedCProgram.help(0);
		} 
		if ((TGZfile = ModernizedCProgram.TGZfname(argv[arg])) == (null)) {
			ModernizedCProgram.TGZnotfound(argv[arg]);
		} 
		++arg;
		if ((action == .TGZ_LIST) && (arg != argc)) {
			ModernizedCProgram.help(1/*
			 *  Process the TGZ file
			 */);
		} 
		switch (action) {
		case .TGZ_EXTRACT:
				f = ModernizedCProgram.gzopen(TGZfile, "rb");
				if (f == (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Couldn't gzopen %s\n", ModernizedCProgram.prog, TGZfile);
					return 1;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.tar(f, action, arg, argc, argv));
				break;
		case .TGZ_LIST:
		default:
				ModernizedCProgram.error("Unknown option");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		}
		return 0;
		byte[] rs = new byte[]{0};
		int res = ModernizedCProgram.main2(numArgs, args, rs);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(rs, (_iob[1]));
		return res;
		/* running crc and total uncompressed length */long crc;
		long tot;
		/* skip command name */argc--;
		argv++;
		if (argc == /* show usage if no arguments */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("gzjoin usage: gzjoin f1.gz [f2.gz [f3.gz ...]] > fjoin.gz\n", (_iob[2]));
			return 0;
		} 
		(_iob[/* join gzip files on command line and write to stdout */1]).gzinit(crc, tot);
		while (argc--) {
			(_iob[1]).gzcopy(argv++, argc, crc, tot);
		}
		return /* done */0;
		int i;
		int opt_overwrite = 0;
		int opt_compress_level = (true);
		int opt_exclude_path = 0;
		int zipfilenamearg = 0;
		byte[] filename_try = new byte[(true) + 16];
		int zipok;
		int err = 0;
		int size_buf = 0;
		Object buf = (null);
		Byte password = (null);
		ModernizedCProgram.do_banner();
		if (argc == 1) {
			ModernizedCProgram.do_help();
			return 0;
		} else {
				for (i = 1; i < argc; i++) {
					if ((argv[i]) == (byte)'-') {
						Byte p = argv[i] + 1;
						while ((p) != (byte)'\0') {
							byte c = (p++);
							;
							if ((c == (byte)'o') || (c == (byte)'O')) {
								opt_overwrite = 1;
							} 
							if ((c == (byte)'a') || (c == (byte)'A')) {
								opt_overwrite = 2;
							} 
							if ((c >= (byte)'0') && (c <= (byte)'9')) {
								opt_compress_level = c - (byte)'0';
							} 
							if ((c == (byte)'j') || (c == (byte)'J')) {
								opt_exclude_path = 1;
							} 
							if (((c == (byte)'p') || (c == (byte)'P')) && (i + 1 < argc)) {
								password = argv[i + 1];
								i++;
							} 
						}
					} else {
							if (zipfilenamearg == 0) {
								zipfilenamearg = i;
							} 
					} 
				}
		} 
		size_buf = (true);
		buf = (Object)/*Error: Function owner not recognized*/malloc(size_buf);
		if (buf == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error allocating memory\n");
			return (true);
		} 
		if (zipfilenamearg == 0) {
			zipok = 0;
		} else {
				int i;
				int len;
				int dot_found = 0;
				zipok = 1;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(filename_try, argv[zipfilenamearg], (true) - 1);
				filename_try[(true)] = /* strncpy doesnt append the trailing NULL, of the string is too long. */(byte)'\0';
				len = (int)/*Error: Function owner not recognized*/strlen(filename_try);
				for (i = 0; i < len; i++) {
					if (filename_try[i] == (byte)'.') {
						dot_found = 1;
					} 
				}
				if (dot_found == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat(filename_try, ".zip");
				} 
				if (opt_overwrite == 2) {
					if (ModernizedCProgram.check_exist_file(filename_try) == /* if the file don't exist, we not append file */0) {
						opt_overwrite = 1;
					} 
				}  else if (opt_overwrite == 0) {
					if (ModernizedCProgram.check_exist_file(filename_try) != 0) {
						byte rep = 0;
						do {
							byte[] answer = new byte[128];
							int ret;
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("The file %s exists. Overwrite ? [y]es, [n]o, [a]ppend : ", filename_try);
							ret = /*Error: Function owner not recognized*/scanf("%1s", answer);
							if (ret != 1) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
							} 
							rep = answer[0];
							if ((rep >= (byte)'a') && (rep <= (byte)'z')) {
								rep -= -1024;
							} 
						} while ((rep != (byte)'Y') && (rep != (byte)'N') && (rep != (byte)'A'));
						if (rep == (byte)'N') {
							zipok = 0;
						} 
						if (rep == (byte)'A') {
							opt_overwrite = 2;
						} 
					} 
				} 
		} 
		Object generatedTmz_date = zi.getTmz_date();
		Object generatedDosDate = zi.getDosDate();
		Object generated_flag = (fin).get_flag();
		if (zipok == 1) {
			zipFile zf = new zipFile();
			int errclose;
			zlib_filefunc64_def ffunc = new zlib_filefunc64_def();
			ffunc.fill_win32_filefunc64A();
			zf = ffunc.zipOpen2_64(filename_try, (opt_overwrite == 2) ? 2 : 0, (null));
			if (zf == (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error opening %s\n", filename_try);
				err = ((true));
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("creating %s\n", filename_try);
			} 
			for (i = zipfilenamearg + 1; (i < argc) && (err == (false)); i++) {
				if (!(((((argv[i])) == (byte)'-') || (((argv[i])) == (byte)'/')) && ((argv[i][1] == (byte)'o') || (argv[i][1] == (byte)'O') || (argv[i][1] == (byte)'a') || (argv[i][1] == (byte)'A') || (argv[i][1] == (byte)'p') || (argv[i][1] == (byte)'P') || ((argv[i][1] >= (byte)'0') || (argv[i][1] <= (byte)'9'))) && (/*Error: Function owner not recognized*/strlen(argv[i]) == 2))) {
					FILE fin = new FILE();
					int size_read;
					Byte filenameinzip = argv[i];
					Byte savefilenameinzip;
					zip_fileinfo zi = new zip_fileinfo();
					long crcFile = 0;
					int zip64 = 0;
					generatedTmz_date.setTm_sec(generatedTmz_date.setTm_min(generatedTmz_date.setTm_hour(generatedTmz_date.setTm_mday(generatedTmz_date.setTm_mon(generatedTmz_date.setTm_year(0))))));
					zi.setDosDate(0);
					zi.setInternal_fa(0);
					zi.setExternal_fa(0);
					generatedTmz_date.filetime(filenameinzip, generatedDosDate);
					if ((password != (null)) && (err == (false))) {
						err = ModernizedCProgram.getFileCrc(filenameinzip, buf, size_buf, crcFile);
					} 
					zip64 = ModernizedCProgram.isLargeFile(filenameinzip);
					savefilenameinzip = /* The path name saved, should not include a leading slash. *//*if it did, windows/xp and dynazip couldn't read the zip file. */filenameinzip;
					while (savefilenameinzip[0] == (byte)'\\' || savefilenameinzip[0] == (byte)'/') {
						savefilenameinzip++;
					}
					if (/*should the zip file contain any path at all?*/opt_exclude_path) {
						Byte tmpptr;
						Byte lastslash = 0;
						for (tmpptr = savefilenameinzip; tmpptr; tmpptr++) {
							if (tmpptr == (byte)'\\' || tmpptr == (byte)'/') {
								lastslash = tmpptr;
							} 
						}
						if (lastslash != (null)) {
							savefilenameinzip = lastslash + 1;
						} 
					} 
					err = ModernizedCProgram.zipOpenNewFileInZip3_64(zf, savefilenameinzip, /**/zi, (null), 0, (null), 0, (null), (opt_compress_level != 0) ? 8 : 0, opt_compress_level, 0, -15, 8, /* -MAX_WBITS, DEF_MEM_LEVEL, Z_DEFAULT_STRATEGY, */0, password, crcFile, zip64);
					if (err != (false)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error in opening %s in zipfile\n", filenameinzip);
					} else {
							fin = /*Error: Function owner not recognized*/fopen64(filenameinzip, "rb");
							if (fin == (null)) {
								err = ((true));
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error in opening %s for reading\n", filenameinzip);
							} 
					} 
					if (err == (false)) {
						do {
							err = (false);
							size_read = (int)/*Error: Function owner not recognized*/fread(buf, 1, size_buf, fin);
							if (size_read < size_buf) {
								if ((generated_flag & -1024) == 0) {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error in reading %s\n", filenameinzip);
									err = ((true));
								} 
							} 
							if (size_read > 0) {
								err = ModernizedCProgram.zipWriteInFileInZip(zf, buf, size_read);
								if (err < 0) {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error in writing %s in the zipfile\n", filenameinzip);
								} 
							} 
						} while ((err == (false)) && (size_read > 0));
					} 
					if (fin) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fin);
					} 
					if (err < 0) {
						err = ((true));
					} else {
							err = ModernizedCProgram.zipCloseFileInZip(zf);
							if (err != (false)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error in closing %s in the zipfile\n", filenameinzip);
							} 
					} 
				} 
			}
			errclose = ModernizedCProgram.zipClose(zf, (null));
			if (errclose != (false)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error in closing %s\n", filename_try);
			} 
		} else {
				ModernizedCProgram.do_help();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
		return 0;
		/* total number of symbols to code */int syms;
		/* number of symbols to code for this run */int n;
		/* return value of count() */big_t got = new big_t();
		/* accumulated number of codes over n */big_t sum = new big_t();
		/* for counting bits in code_t */code_t word = new code_t();
		ModernizedCProgram.code = (null);
		ModernizedCProgram.num = (null);
		ModernizedCProgram.done = (null);
		syms = /* get arguments -- default to the deflate literal/length code */286;
		ModernizedCProgram.root = 9;
		ModernizedCProgram.max = 15;
		if (argc > 1) {
			syms = /*Error: Function owner not recognized*/atoi(argv[1]);
			if (argc > 2) {
				ModernizedCProgram.root = /*Error: Function owner not recognized*/atoi(argv[2]);
				if (argc > 3) {
					ModernizedCProgram.max = /*Error: Function owner not recognized*/atoi(argv[3]);
				} 
			} 
		} 
		if (argc > 4 || syms < 2 || ModernizedCProgram.root < 1 || ModernizedCProgram.max < 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("invalid arguments, need: [sym >= 2 [root >= 1 [max >= 1]]]\n", (_iob[2]));
			return 1;
		} 
		if (ModernizedCProgram.max > syms - /* if not restricting the code length, the longest is syms - 1 */1) {
			ModernizedCProgram.max = syms - 1;
		} 
		for (; word; ) {
			;
		}
		if (ModernizedCProgram.max > n || (code_t)(syms - 2) >= (((code_t)0 - 1) >> (ModernizedCProgram.max - /* make sure that the calculation of most will not overflow */1))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("abort: code length too long for internal types\n", (_iob[2]));
			return 1;
		} 
		if ((code_t)(syms - 1) > ((code_t)1 << ModernizedCProgram.max) - /* reject impossible code requests */1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%d symbols cannot be coded in %d bits\n", syms, ModernizedCProgram.max);
			return 1;
		} 
		ModernizedCProgram.code = /*Error: Function owner not recognized*/calloc(ModernizedCProgram.max + 1, /*Error: Unsupported expression*//* allocate code vector */);
		if (ModernizedCProgram.code == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("abort: unable to allocate enough memory\n", (_iob[2]));
			return 1;
		} 
		if (syms == /* determine size of saved results array, checking for overflows,
		       allocate and clear the array (set all to zero with calloc()) *//* iff max == 1 */2) {
			ModernizedCProgram.num = (null);
		} else {
				ModernizedCProgram.size = syms >> 1;
				if (ModernizedCProgram.size > ((size_t)0 - 1) / (n = (syms - 1) >> 1) || () || () || (ModernizedCProgram.num = /*Error: Function owner not recognized*/calloc(ModernizedCProgram.size, /*Error: Unsupported expression*/)) == (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("abort: unable to allocate enough memory\n", (_iob[2]));
					ModernizedCProgram.cleanup();
					return 1;
				} 
		} 
		sum = /* count possible codes for all numbers of symbols, add up counts */0;
		for (n = 2; n <= syms; n++) {
			got = ModernizedCProgram.count(n, 1, 2);
			sum += got;
			if (got == (big_t)0 - 1 || sum < /* overflow */got) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("abort: can't count that high!\n", (_iob[2]));
				ModernizedCProgram.cleanup();
				return 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%llu %d-codes\n", got, n);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%llu total codes for 2 to %d symbols", sum, syms);
		if (ModernizedCProgram.max < syms - 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" (%d-bit length limit)\n", ModernizedCProgram.max);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(" (no length limit)");
		} 
		if (syms == /* allocate and clear done array for beenhere() */2) {
			ModernizedCProgram.done = (null);
		}  else if (ModernizedCProgram.size > ((size_t)0 - 1) / /*Error: Unsupported expression*/ || (ModernizedCProgram.done = /*Error: Function owner not recognized*/calloc(ModernizedCProgram.size, /*Error: Unsupported expression*/)) == (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("abort: unable to allocate enough memory\n", (_iob[2]));
			ModernizedCProgram.cleanup();
			return 1;
		} 
		if (ModernizedCProgram.root > /* find and show maximum inflate table usage *//* reduce root to max length */ModernizedCProgram.max) {
			ModernizedCProgram.root = ModernizedCProgram.max;
		} 
		if ((code_t)syms < ((code_t)1 << (ModernizedCProgram.root + 1))) {
			ModernizedCProgram.enough(syms);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("cannot handle minimum code lengths > root");
		} 
		ModernizedCProgram.cleanup();
		return 0;
		int ret;
		int len;
		int test;
		byte[] outname;
		Byte window;
		z_stream strm = new z_stream();
		window = /* initialize inflateBack state for repeated use *//* reuse LZW match buffer */ModernizedCProgram.match;
		strm.setZalloc(0);
		strm.setZfree(0);
		strm.setOpaque(0);
		ret = ModernizedCProgram.inflateBackInit_((strm), (true), (window), "1.2.11", (int)/*Error: Unsupported expression*/);
		if (ret != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun out of memory error--aborting\n");
			return 1;
		} 
		/* decompress each file to the same name with the suffix removed */argc--;
		argv++;
		test = 0;
		if (argc && /*Error: Function owner not recognized*/strcmp(argv, "-h") == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun 1.6 (17 Jan 2010)\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Copyright (C) 2003-2010 Mark Adler\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "usage: gun [-t] [file1.gz [file2.Z ...]]\n");
			return 0;
		} 
		if (argc && /*Error: Function owner not recognized*/strcmp(argv, "-t") == 0) {
			test = 1;
			argc--;
			argv++;
		} 
		if (argc) {
			do {
				if (test) {
					outname = (null);
				} else {
						len = (int)/*Error: Function owner not recognized*/strlen(argv);
						if (/*Error: Function owner not recognized*/strcmp(argv + len - 3, ".gz") == 0 || /*Error: Function owner not recognized*/strcmp(argv + len - 3, "-gz") == 0) {
							len -= 3;
						}  else if (/*Error: Function owner not recognized*/strcmp(argv + len - 2, ".z") == 0 || /*Error: Function owner not recognized*/strcmp(argv + len - 2, "-z") == 0 || /*Error: Function owner not recognized*/strcmp(argv + len - 2, "_z") == 0 || /*Error: Function owner not recognized*/strcmp(argv + len - 2, ".Z") == 0) {
							len -= 2;
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun error: no gz type on %s--skipping\n", argv);
								continue;
						} 
						outname = /*Error: Function owner not recognized*/malloc(len + 1);
						if (outname == (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun out of memory error--aborting\n");
							ret = 1;
							break;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(outname, argv, len);
						outname[len] = 0;
				} 
				ret = strm.gunzip(argv, outname, test);
				if (outname != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(outname);
				} 
				if (ret) {
					break;
				} 
			} while ();
		} else {
				ret = strm.gunzip((null), (null), test);
		} 
		ModernizedCProgram.inflateBackEnd(/* clean up */strm);
		return ret;
		int i;
		int filenamesStart = 0;
		Byte exename = argv[0];
		U32 benchmarkMode = 0;
		U32 fileCheckMode = 0;
		U32 strictMode = 0;
		U32 statusOnly = 0;
		U32 warn = 0;
		U32 quiet = 0;
		U32 specificTest = 0;
		size_t keySize = ModernizedCProgram.XXH_DEFAULT_SAMPLE_SIZE;
		algoType algo = ModernizedCProgram.g_defaultAlgo;
		endianess displayEndianess = .big_endian;
		if (/*Error: Function owner not recognized*/strstr(exename, "xxh32sum") != (null)) {
			algo = /* special case : xxh32sum default to 32 bits checksum */.algo_xxh32;
		} 
		for (i = 1; i < argc; i++) {
			Byte argument = argv[i];
			if (!/* Protection, if argument empty */argument) {
				continue;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--little-endian")) {
				displayEndianess = .little_endian;
				continue;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--check")) {
				fileCheckMode = 1;
				continue;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--strict")) {
				strictMode = 1;
				continue;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--status")) {
				statusOnly = 1;
				continue;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--quiet")) {
				quiet = 1;
				continue;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--warn")) {
				warn = 1;
				continue;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--help")) {
				return ModernizedCProgram.usage_advanced(exename);
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argument, "--version")) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s %s (%i-bits %s), by %s \n", exename, "0.6.5", ModernizedCProgram.g_nbBits, (ModernizedCProgram.BMK_isLittleEndian() ? ModernizedCProgram.g_lename : ModernizedCProgram.g_bename), ModernizedCProgram.author);
				return 0;
			} 
			if (argument != (byte)'-') {
				if (filenamesStart == 0) {
					filenamesStart = /* only supports a continuous list of filenames */i;
				} 
				continue;
			} 
			/* command selection *//* note : *argument=='-' */argument++;
			while (argument != 0) {
				switch (argument) {
				case /* Modify verbosity of benchmark output (hidden option) */(byte)'q':
						argument++;
						ModernizedCProgram.g_displayLevel--;
						break;
				case /* Modify Nb Iterations (benchmark only) */(byte)'i':
						argument++;
						ModernizedCProgram.g_nbIterations = ModernizedCProgram.readU32FromChar(argument);
						break;
				case /* Warning mode (file check mode only, alias of "--warning") */(byte)'w':
						warn = 1;
						argument++;
						break;
				case /* Display help on usage */(byte)'h':
						return ModernizedCProgram.usage_advanced(exename);
				case /* select hash algorithm */(byte)'H':
						algo = (algoType)(argument[1] - (byte)'0');
						argument += 2;
						break;
				case /* Trigger benchmark mode */(byte)'b':
						argument++;
						benchmarkMode = 1;
						specificTest = ModernizedCProgram.readU32FromChar(/* select one specific test (hidden option) */argument);
						break;
				case /* File check mode */(byte)'c':
						fileCheckMode = 1;
						argument++;
						break;
				case /* Display version */(byte)'V':
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s %s (%i-bits %s), by %s \n", exename, "0.6.5", ModernizedCProgram.g_nbBits, (ModernizedCProgram.BMK_isLittleEndian() ? ModernizedCProgram.g_lename : ModernizedCProgram.g_bename), ModernizedCProgram.author);
						return 0;
				case /* Modify Block size (benchmark only) */(byte)'B':
						argument++;
						keySize = ModernizedCProgram.readU32FromChar(argument);
						break;
				default:
						return ModernizedCProgram.badusage(exename);
				}
			}
		}
		if (/* for(i=1; i<argc; i++) *//* Check benchmark mode */benchmarkMode) {
			do {
				if (ModernizedCProgram.g_displayLevel >= 2) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s %s (%i-bits %s), by %s \n", exename, "0.6.5", ModernizedCProgram.g_nbBits, (ModernizedCProgram.BMK_isLittleEndian() ? ModernizedCProgram.g_lename : ModernizedCProgram.g_bename), ModernizedCProgram.author);
				} 
			} while (0);
			ModernizedCProgram.BMK_sanityCheck();
			if (filenamesStart == 0) {
				return ModernizedCProgram.BMK_benchInternal(keySize, specificTest);
			} 
			return ModernizedCProgram.BMK_benchFiles(argv + filenamesStart, argc - filenamesStart, specificTest);
		} 
		if ((filenamesStart == 0) && /*Error: Function owner not recognized*/_isatty((((_iob[0])).get_file()))) {
			return ModernizedCProgram.badusage(/* Check if input is defined as console; trigger an error in this case */exename);
		} 
		if (filenamesStart == 0) {
			filenamesStart = argc;
		} 
		if (fileCheckMode) {
			return ModernizedCProgram.checkFiles(argv + filenamesStart, argc - filenamesStart, displayEndianess, strictMode, statusOnly, warn, quiet);
		} else {
				return ModernizedCProgram.BMK_hashFiles(argv + filenamesStart, argc - filenamesStart, algo, displayEndianess/* XXHASH_C_2097394837 */);
		} 
	}
	/* cover remaining lines in inftrees.c */
	private static void cover_trees() {
		int ret;
		int bits;
		int[] lens = new int[16];
		int[] work = new int[16];
		code next = new code();
		code[] table = new code();
		for (bits = 0; bits < 15; /* we need to call inflate_table() directly in order to manifest not-
		       enough errors, since zlib insures that enough is always enough */bits++) {
			lens[bits] = (int)(bits + 1);
		}
		lens[15] = 15;
		next = table;
		bits = 15;
		ret = next.inflate_table(.DISTS, lens, 16, bits, work);
		((ret == 1) ? null : /*Error: Function owner not recognized*/_assert("ret == 1", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\infcover.c", 632));
		next = table;
		bits = 1;
		ret = next.inflate_table(.DISTS, lens, 16, bits, work);
		((ret == 1) ? null : /*Error: Function owner not recognized*/_assert("ret == 1", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\infcover.c", 636));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("inflate_table not enough errors\n", (_iob[2]));
	}
	private static void test_compress(Object compr, Object comprLen, Object uncompr, Object uncomprLen) {
		int err;
		uLong len = (uLong)/*Error: Function owner not recognized*/strlen(ModernizedCProgram.hello) + 1;
		err = ModernizedCProgram.compress(compr, comprLen, (Bytef)ModernizedCProgram.hello, len);
		{ 
			if (err != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s error: %d\n", "compress", err);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		}
		;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)uncompr, "garbage");
		err = ModernizedCProgram.uncompress(uncompr, uncomprLen, compr, comprLen);
		{ 
			if (err != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s error: %d\n", "uncompress", err);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		}
		;
		if (/*Error: Function owner not recognized*/strcmp((byte)uncompr, ModernizedCProgram.hello)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "bad uncompress\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("uncompress(): %s\n", (byte)uncompr);
		} 
	}
	private static void test_dict_inflate(Object compr, Object comprLen, Object uncompr, Object uncomprLen) {
		int err;
		/* decompression stream */z_stream d_stream = new z_stream();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)uncompr, "garbage");
		d_stream.setZalloc(ModernizedCProgram.zalloc);
		d_stream.setZfree(ModernizedCProgram.zfree);
		d_stream.setOpaque((voidpf)0);
		d_stream.setNext_in(compr);
		d_stream.setAvail_in((uInt)comprLen);
		err = ModernizedCProgram.inflateInit_((d_stream), "1.2.11", (int)/*Error: Unsupported expression*/);
		{ 
			if (err != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s error: %d\n", "inflateInit", err);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		}
		;
		d_stream.setNext_out(uncompr);
		d_stream.setAvail_out((uInt)uncomprLen);
		Object generatedAdler = d_stream.getAdler();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			err = ModernizedCProgram.inflate(d_stream, 0);
			if (err == 1) {
				break;
			} 
			if (err == 2) {
				if (generatedAdler != ModernizedCProgram.dictId) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "unexpected dictionary");
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
				} 
				err = ModernizedCProgram.inflateSetDictionary(d_stream, (Bytef)ModernizedCProgram.dictionary, (int)/*Error: sizeof expression not supported yet*/);
			} 
			{ 
				if (err != 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s error: %d\n", "inflate with dict", err);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
				} 
			}
			;
		}
		err = ModernizedCProgram.inflateEnd(d_stream);
		{ 
			if (err != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s error: %d\n", "inflateEnd", err);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		}
		;
		if (/*Error: Function owner not recognized*/strcmp((byte)uncompr, ModernizedCProgram.hello)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "bad inflate with dict\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("inflate with dictionary: %s\n", (byte)uncompr/* ===========================================================================
				 * Usage:  example [output.gz  [input.gz]]
				 */);
		} 
	}
	private static void do_banner() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("MiniUnz 1.01b, demo of zLib + Unz package written by Gilles Vollant\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("more info at http://www.winimage.com/zLibDll/unzip.html\n\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("MiniZip 1.1, demo of zLib + MiniZip64 package, written by Gilles Vollant\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("more info on MiniZip at http://www.winimage.com/zLibDll/minizip.html\n\n");
	}
	private static int unzClose(Object file) {
		unz64_s s = new unz64_s();
		if (file == (null)) {
			return (true);
		} 
		s = (unz64_s)file;
		Object generatedPfile_in_zip_read = s.getPfile_in_zip_read();
		if (generatedPfile_in_zip_read != (null)) {
			ModernizedCProgram.unzCloseCurrentFile(file);
		} 
		Object generatedZ_filefunc = s.getZ_filefunc();
		Object generatedFilestream = s.getFilestream();
		(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((generatedZ_filefunc).getZfile_func64().getOpaque(), generatedFilestream));
		{ 
			if (s) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s);
			} 
		}
		;
		return (false/*
		  Write info about the ZipFile in the *pglobal_info structure.
		  No preparation of the structure is needed
		  return UNZ_OK if there is no problem. */);
	}
	private static void BeginCountPerfCounter(Object fComputeTimeQueryPerf) {
		if ((!fComputeTimeQueryPerf) || (!/*Error: Function owner not recognized*/QueryPerformanceCounter(pbeginTime64))) {
			this.setLowPart(/*Error: Function owner not recognized*/GetTickCount());
			this.setHighPart(0);
		} 
	}
	private static void BeginCountRdtsc() {
		pbeginTime64.myGetRDTSC32();
	}
	/* Write header for gzip file to out and initialize trailer. */
	private static void gzinit(Long crc, Long tot) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite("\x1f\x8b\x08\0\0\0\0\0\0\xff", 1, 10, out);
		crc = ModernizedCProgram.crc32(-1024, 0, 0);
		tot = 0/* Copy the compressed data from name, zeroing the last block bit of the last
		   block if clr is true, and adding empty blocks as needed to get to a byte
		   boundary.  If clr is false, then the last block becomes the last block of
		   the output, and the gzip trailer is written.  crc and tot maintains the
		   crc and length (modulo 2^32) of the output for the trailer.  The resulting
		   gzip file is written to out.  gzinit() must be called before the first call
		   of gzcopy() to write the gzip header and to initialize crc and tot. */;
	}
	/* Free allocated space.  Uses globals code, num, and done. */
	private static void cleanup() {
		size_t n = new size_t();
		if (ModernizedCProgram.done != (null)) {
			for (n = 0; n < ModernizedCProgram.size; n++) {
				if (ModernizedCProgram.done[n].getLen()) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.done[n].getVec());
				} 
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.done);
		} 
		if (ModernizedCProgram.num != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.num);
		} 
		if (ModernizedCProgram.code != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.code/* Return the number of possible Huffman codes using bit patterns of lengths
			   len through max inclusive, coding syms symbols, with left bit patterns of
			   length len unused -- return -1 if there is an overflow in the counting.
			   Keep a record of previous results in num to prevent repeating the same
			   calculation.  Uses the globals max and num. */);
		} 
	}
}
