package application;

public class WinMainToRemoveDirWithSubItems {
	
	
	private static int WinMain(Object hInstance, Object hPrevInstance, Object lpCmdLine, int nCmdShow) {
		CFileInStream archiveStream = new CFileInStream();
		CLookToRead2 lookStream = new CLookToRead2();
		CSzArEx db = new CSzArEx();
		SRes res = 0;
		ISzAlloc allocImp = new ISzAlloc();
		ISzAlloc allocTempImp = new ISzAlloc();
		WCHAR[] sfxPath = new WCHAR();
		WCHAR[] path = new WCHAR();
		WCHAR[] workCurDir = new WCHAR();
		size_t pathLen = new size_t();
		DWORD winRes = new DWORD();
		wchar_t cmdLineParams = new wchar_t();
		Byte errorMessage = (null);
		BoolInt useShellExecute = 1;
		DWORD exitCode = 0;
		ModernizedCProgram.LoadSecurityDlls();
		(Object)hInstance;
		;
		(Object)hPrevInstance;
		;
		(Object)lpCmdLine;
		;
		(Object)nCmdShow;
		;
		ModernizedCProgram.CrcGenerateTable();
		allocImp.setAlloc(ModernizedCProgram.SzAlloc);
		allocImp.setFree(ModernizedCProgram.SzFree);
		allocTempImp.setAlloc(ModernizedCProgram.SzAllocTemp);
		allocTempImp.setFree(ModernizedCProgram.SzFreeTemp);
		archiveStream.FileInStream_CreateVTable();
		lookStream.LookToRead2_CreateVTable(0);
		lookStream.setBuf((null));
		winRes = /*Error: Function owner not recognized*/GetModuleFileNameW((null), sfxPath, 260);
		if (winRes == 0 || winRes > 260) {
			return 1;
		} 
		{ 
			cmdLineParams = /*Error: Function owner not recognized*/GetCommandLineW();
			{ 
				BoolInt quoteMode = 0;
				for (; /*Error: Unsupported expression*/; cmdLineParams++) {
					wchar_t c = cmdLineParams;
					if (c == (byte)L'\"') {
						quoteMode = !quoteMode;
					}  else if (c == 0 || (c == (byte)L' ' && !quoteMode)) {
						break;
					} 
				}
			}
		}
		{ 
			int i;
			DWORD d = new DWORD();
			winRes = /*Error: Function owner not recognized*/GetTempPathW(260, path);
			if (winRes == 0 || winRes > 260) {
				return 1;
			} 
			pathLen = /*Error: Function owner not recognized*/wcslen(path);
			d = (/*Error: Function owner not recognized*/GetTickCount() << 12) ^ (/*Error: Function owner not recognized*/GetCurrentThreadId() << 14) ^ /*Error: Function owner not recognized*/GetCurrentProcessId();
			for (i = 0; /*Error: Unsupported expression*/; ) {
				if (i >= 100) {
					res = 11;
					break;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscpy(path + pathLen, L"7z");
				{ 
					wchar_t s = path + /*Error: Function owner not recognized*/wcslen(path);
					UInt32 value = d;
					int k;
					for (k = 0; k < 8; k++) {
						int t = value & -1024;
						value >>=  4;
						s[7 - k] = (wchar_t)((t < 10) ? ((byte)'0' + t) : ((byte)'A' + (t - 10)));
					}
					s[k] = (byte)'\0';
				}
				if (ModernizedCProgram.DoesFileOrDirExist(path)) {
					continue;
				} 
				if (/*Error: Function owner not recognized*/CreateDirectoryW(path, (null))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscat(path, L"\\");
					pathLen = /*Error: Function owner not recognized*/wcslen(path);
					break;
				} 
				if (/*Error: Function owner not recognized*/GetLastError() != -1024) {
					res = 11;
					break;
				} 
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscpy(workCurDir, path);
			if (res != 0) {
				errorMessage = "Can't create temp folder";
			} 
		}
		if (res != 0) {
			if (!errorMessage) {
				errorMessage = "Error";
			} 
			ModernizedCProgram.PrintErrorMessage(errorMessage);
			return 1;
		} 
		Object generatedFile = archiveStream.getFile();
		if (generatedFile.InFile_OpenW(sfxPath) != 0) {
			errorMessage = "can not open input file";
			res = 11;
		} else {
				UInt64 pos = 0;
				if (!generatedFile.FindSignature(pos)) {
					res = 11;
				}  else if (generatedFile.File_Seek((Int64)pos, .SZ_SEEK_SET) != 0) {
					res = 11;
				} 
				if (res != 0) {
					errorMessage = "Can't find 7z archive";
				} 
		} 
		Object generatedBuf = lookStream.getBuf();
		Object generatedVt = archiveStream.getVt();
		if (res == 0) {
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
		db.SzArEx_Init();
		if (res == 0) {
			res = ModernizedCProgram.SzArEx_Open(db, generatedVt, allocImp, allocTempImp);
		} 
		Object generatedNumFiles = db.getNumFiles();
		Object generatedIsDirs = (db).getIsDirs();
		Object generatedMTime = db.getMTime();
		Object generatedHandle = outFile.getHandle();
		Object generatedAttribs = db.getAttribs();
		if (res == 0) {
			UInt32 executeFileIndex = (UInt32)(Int32)-1;
			UInt32 minPrice = 1 << 30;
			UInt32 i = new UInt32();
			UInt32 blockIndex = /* it can have any value before first call (if outBuffer = 0) */-1024;
			Byte outBuffer = /* it must be 0 before first call for each new archive. */0;
			size_t outBufferSize = /* it can have any value before first call (if outBuffer = 0) */0;
			for (i = 0; i < generatedNumFiles; i++) {
				size_t offset = 0;
				size_t outSizeProcessed = 0;
				WCHAR temp = new WCHAR();
				if (ModernizedCProgram.SzArEx_GetFileNameUtf16(db, i, (null)) >= 260) {
					res = 11;
					break;
				} 
				temp = path + pathLen;
				ModernizedCProgram.SzArEx_GetFileNameUtf16(db, i, (UInt16)temp);
				{ 
					res = generatedVt.SzArEx_Extract(db, i, blockIndex, outBuffer, outBufferSize, offset, outSizeProcessed, allocImp, allocTempImp);
					if (res != 0) {
						break;
					} 
				}
				{ 
					CSzFile outFile = new CSzFile();
					size_t processedSize = new size_t();
					size_t j = new size_t();
					size_t nameStartPos = 0;
					for (j = 0; temp[j] != 0; j++) {
						if (temp[j] == (byte)'/') {
							temp[j] = 0;
							ModernizedCProgram.MyCreateDir(path);
							temp[j] = (byte)'\\';
							nameStartPos = j + 1;
						} 
					}
					if (((((generatedIsDirs)[(i) >> 3] & (-1024 >> ((i) & 7))) != 0))) {
						ModernizedCProgram.MyCreateDir(path);
						continue;
					} else {
							int extLen;
							WCHAR name = temp + nameStartPos;
							int len = (int)/*Error: Function owner not recognized*/wcslen(name);
							int nameLen = ModernizedCProgram.FindExt(temp + nameStartPos, extLen);
							int extPrice = ModernizedCProgram.FindItem(ModernizedCProgram.kExts, /*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/, name + len - extLen, extLen);
							int namePrice = ModernizedCProgram.FindItem(ModernizedCProgram.kNames, /*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/, name, nameLen);
							int price = namePrice + extPrice * 64 + (nameStartPos == 0 ? 0 : (1 << 12));
							if (minPrice > price) {
								minPrice = price;
								executeFileIndex = i;
								useShellExecute = (extPrice != 2);
							} 
							if (ModernizedCProgram.DoesFileOrDirExist(path)) {
								errorMessage = "Duplicate file";
								res = 11;
								break;
							} 
							if (outFile.OutFile_OpenW(path)) {
								errorMessage = "Can't open output file";
								res = 11;
								break;
							} 
					} 
					processedSize = outSizeProcessed;
					if (outFile.File_Write(outBuffer + offset, processedSize) != 0 || processedSize != outSizeProcessed) {
						errorMessage = "Can't write output file";
						res = 11;
					} 
					if (((generatedMTime).getDefs() && ((generatedMTime).getDefs()[(i) >> 3] & (-1024 >> ((i) & 7))) != 0)) {
						CNtfsFileTime t = generatedMTime.getVals() + i;
						FILETIME mTime = new FILETIME();
						mTime.setDwLowDateTime(t.getLow());
						mTime.setDwHighDateTime(t.getHigh());
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetFileTime(generatedHandle, (null), (null), mTime);
					} 
					{ 
						SRes res2 = outFile.File_Close();
						if (res != 0) {
							break;
						} 
						if (res2 != 0) {
							res = res2;
							break;
						} 
					}
					if (((generatedAttribs).getDefs() && ((generatedAttribs).getDefs()[(i) >> 3] & (-1024 >> ((i) & 7))) != 0)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetFileAttributesW(path, generatedAttribs.getVals()[i]);
					} 
				}
			}
			if (res == 0) {
				if (executeFileIndex == (UInt32)(Int32)-1) {
					errorMessage = "There is no file to execute";
					res = 11;
				} else {
						WCHAR temp = path + pathLen;
						UInt32 j = new UInt32();
						ModernizedCProgram.SzArEx_GetFileNameUtf16(db, executeFileIndex, (UInt16)temp);
						for (j = 0; temp[j] != 0; j++) {
							if (temp[j] == (byte)'/') {
								temp[j] = (byte)'\\';
							} 
						}
				} 
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(allocImp, outBuffer);
		} 
		db.SzArEx_Free(allocImp);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(allocImp, generatedBuf);
		generatedFile.File_Close();
		Object generatedHThread = pi.getHThread();
		Object generatedHProcess = pi.getHProcess();
		if (res == 0) {
			HANDLE hProcess = 0;
			WCHAR[] oldCurDir = new WCHAR();
			oldCurDir[0] = 0;
			{ 
				DWORD needLen = /*Error: Function owner not recognized*/GetCurrentDirectoryW(260 + 1, oldCurDir);
				if (needLen == 0 || needLen > 260) {
					oldCurDir[0] = 0;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetCurrentDirectoryW(workCurDir);
			}
			if (useShellExecute) {
				SHELLEXECUTEINFO ei = new SHELLEXECUTEINFO();
				UINT32 executeRes = new UINT32();
				BOOL success = new BOOL();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ei, 0, /*Error: sizeof expression not supported yet*/);
				ei.setCbSize(/*Error: sizeof expression not supported yet*/);
				ei.setLpFile(path);
				ei.setFMask(-1024 | -1024);
				if (/*Error: Function owner not recognized*/wcslen(cmdLineParams) != /* | SEE_MASK_NO_CONSOLE */0) {
					ei.setLpParameters(cmdLineParams);
				} 
				ei.setNShow(/* SW_HIDE; */1);
				success = /*Error: Function owner not recognized*/ShellExecuteExW(ei);
				executeRes = (UINT32)(UINT_PTR)ei.getHInstApp();
				if (!success || (executeRes <= 32 && executeRes != /* executeRes = 0 in Windows CE */0)) {
					res = 11;
				} else {
						hProcess = ei.getHProcess();
				} 
			} else {
					STARTUPINFOW si = new STARTUPINFOW();
					PROCESS_INFORMATION pi = new PROCESS_INFORMATION();
					WCHAR[] cmdLine = new WCHAR();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscpy(cmdLine, path);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscat(cmdLine, cmdLineParams);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(si, 0, /*Error: sizeof expression not supported yet*/);
					si.setCb(/*Error: sizeof expression not supported yet*/);
					if (/*Error: Function owner not recognized*/CreateProcessW((null), cmdLine, (null), (null), 0, 0, (null), (null), si, pi) == 0) {
						res = 11;
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(generatedHThread);
							hProcess = generatedHProcess;
					} 
			} 
			if (hProcess != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(hProcess, -1024);
				if (!/*Error: Function owner not recognized*/GetExitCodeProcess(hProcess, exitCode)) {
					exitCode = 1;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hProcess);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetCurrentDirectoryW(oldCurDir);
		} 
		path[pathLen] = (byte)L'\0';
		ModernizedCProgram.RemoveDirWithSubItems(path);
		if (res == 0) {
			return (int)exitCode;
		} 
		{ 
			if (res == 4) {
				errorMessage = "Decoder doesn't support this archive";
			}  else if (res == 2) {
				errorMessage = "Can't allocate required memory";
			}  else if (res == 3) {
				errorMessage = "CRC error";
			} else {
					if (!errorMessage) {
						errorMessage = "ERROR";
					} 
			} 
			if (errorMessage) {
				ModernizedCProgram.PrintErrorMessage(errorMessage);
			} 
		}
		return 1;
	}
	private static void LoadSecurityDlls() {
		wchar_t[] buf = new wchar_t();
		{ 
			OSVERSIONINFO vi = new OSVERSIONINFO();
			vi.setDwOSVersionInfoSize(/*Error: sizeof expression not supported yet*/);
			if (!/*Error: Function owner not recognized*/GetVersionExA(vi) || vi.getDwMajorVersion() != 6 || vi.getDwMinorVersion() != 0) {
				Func_SetDefaultDllDirectories setDllDirs = (Func_SetDefaultDllDirectories)/*Error: Function owner not recognized*/GetProcAddress(/*Error: Function owner not recognized*/GetModuleHandleA("kernel32.dll"), "SetDefaultDllDirectories");
				if (setDllDirs) {
					if (/*Error: Function owner not recognized*/setDllDirs(-1024 | -1024)) {
						return /*Error: Unsupported expression*/;
					} 
				} 
			} 
		}
		{ 
			int len = /*Error: Function owner not recognized*/GetSystemDirectoryW(buf, 260 + 2);
			if (len == 0 || len > 260) {
				return /*Error: Unsupported expression*/;
			} 
		}
		{ 
			Byte dll;
			int pos = (int)/*Error: Function owner not recognized*/lstrlenW(buf);
			if (buf[pos - 1] != (byte)'\\') {
				buf[pos++] = (byte)'\\';
			} 
			for (dll = ModernizedCProgram.g_Dlls; dll[0] != 0; /*Error: Unsupported expression*/) {
				int k = 0;
				for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
					byte c = dll++;
					buf[pos + k] = (Byte)c;
					k++;
					if (c == 0) {
						break;
					} 
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lstrcatW(buf, L".dll");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LoadLibraryExW(buf, (null), 8);
			}
		}
	}
	public static void CrcGenerateTable() {
		UInt32 i = new UInt32();
		for (i = 0; i < 256; i++) {
			UInt32 r = i;
			int j;
			for (j = 0; j < 8; j++) {
				r = (r >> 1) ^ (-1024 & ((UInt32)0 - (r & 1)));
			}
			ModernizedCProgram.g_CrcTable[i] = r;
		}
		for (i = 256; i < 256 * 8; i++) {
			UInt32 r = ModernizedCProgram.g_CrcTable[(size_t)i - 256];
			ModernizedCProgram.g_CrcTable[i] = ModernizedCProgram.g_CrcTable[r & -1024] ^ (r >> 8);
		}
		ModernizedCProgram.g_CrcUpdateT4 = ModernizedCProgram.CrcUpdateT4;
		ModernizedCProgram.g_CrcUpdate = ModernizedCProgram.CrcUpdateT4;
		ModernizedCProgram.g_CrcUpdateT8 = ModernizedCProgram.CrcUpdateT8;
		if (!ModernizedCProgram.CPU_Is_InOrder()) {
			ModernizedCProgram.g_CrcUpdate = ModernizedCProgram.CrcUpdateT8;
		} 
	}
	public static void FileInStream_CreateVTable() {
		Object generatedVt = this.getVt();
		generatedVt.setRead(FileInStream_Read);
		generatedVt.setSeek(FileInStream_Seek);
	}
	public static void LookToRead2_CreateVTable(int lookahead) {
		Object generatedVt = this.getVt();
		generatedVt.setLook(lookahead ? LookToRead2_Look_Lookahead : LookToRead2_Look_Exact);
		generatedVt.setSkip(LookToRead2_Skip);
		generatedVt.setRead(LookToRead2_Read);
		generatedVt.setSeek(LookToRead2_Seek);
	}
	public static void SzArEx_Init() {
		Object generatedDb = this.getDb();
		generatedDb.SzAr_Init();
		this.setNumFiles(0);
		this.setDataPos(0);
		this.setUnpackPositions((null));
		this.setIsDirs((null));
		this.setFolderToFile((null));
		this.setFileToFolder((null));
		this.setFileNameOffsets((null));
		this.setFileNames((null));
		Object generatedCRCs = this.getCRCs();
		{ 
			(generatedCRCs).setDefs((null));
			(generatedCRCs).setVals((null));
		}
		;
		Object generatedAttribs = this.getAttribs();
		{ 
			(generatedAttribs).setDefs((null));
			(generatedAttribs).setVals((null));
		}
		;
		Object generatedMTime = this.getMTime();
		{ 
			(generatedMTime).setDefs((null));
			(generatedMTime).setVals((null));
		}
		;
		Object generatedCTime = this.getCTime();
		{ 
			(generatedCTime).setDefs((null));
			(generatedCTime).setVals((null));
		}
		;
	}
	public static void SzArEx_Free(Object alloc) {
		Object generatedUnpackPositions = this.getUnpackPositions();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedUnpackPositions);
		Object generatedIsDirs = this.getIsDirs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedIsDirs);
		Object generatedFolderToFile = this.getFolderToFile();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFolderToFile);
		Object generatedFileToFolder = this.getFileToFolder();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFileToFolder);
		Object generatedFileNameOffsets = this.getFileNameOffsets();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFileNameOffsets);
		Object generatedFileNames = this.getFileNames();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFileNames);
		Object generatedCRCs = this.getCRCs();
		generatedCRCs.SzBitUi32s_Free(alloc);
		Object generatedAttribs = this.getAttribs();
		generatedAttribs.SzBitUi32s_Free(alloc)// SzBitUi32s_Free(&p->Parents, alloc);;// SzBitUi32s_Free(&p->Parents, alloc);
		Object generatedMTime = this.getMTime();
		generatedMTime.SzBitUi64s_Free(alloc);
		Object generatedCTime = this.getCTime();
		generatedCTime.SzBitUi64s_Free(alloc);
		Object generatedDb = this.getDb();
		generatedDb.SzAr_Free(alloc);
		p.SzArEx_Init();
	}
	private static void SzBitUi64s_Free(Object alloc) {
		Object generatedDefs = this.getDefs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedDefs);
		this.setDefs((null));
		Object generatedVals = this.getVals();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedVals);
		this.setVals((null));
	}
	private static Object RemoveDirWithSubItems(Object[] path) {
		WIN32_FIND_DATAW fd = new WIN32_FIND_DATAW();
		HANDLE handle = new HANDLE();
		WRes res = 0;
		size_t len = /*Error: Function owner not recognized*/wcslen(path);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscpy(path + len, L"*");
		handle = /*Error: Function owner not recognized*/FindFirstFileW(path, fd);
		path[len] = (byte)L'\0';
		if (handle == (HANDLE)(true)) {
			return /*Error: Function owner not recognized*/GetLastError();
		} 
		Object generatedCFileName = fd.getCFileName();
		Object generatedDwFileAttributes = fd.getDwFileAttributes();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (/*Error: Function owner not recognized*/wcscmp(generatedCFileName, L".") != 0 && /*Error: Function owner not recognized*/wcscmp(generatedCFileName, L"..") != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscpy(path + len, generatedCFileName);
				if ((generatedDwFileAttributes & -1024) != 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcscat(path, L"\\");
					res = ModernizedCProgram.RemoveDirWithSubItems(path);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetFileAttributesW(path, 0);
						if (/*Error: Function owner not recognized*/DeleteFileW(path) == 0) {
							res = /*Error: Function owner not recognized*/GetLastError();
						} 
				} 
				if (res != 0) {
					break;
				} 
			} 
			if (!/*Error: Function owner not recognized*/FindNextFileW(handle, fd)) {
				res = /*Error: Function owner not recognized*/GetLastError();
				if (res == -1024) {
					res = 0;
				} 
				break;
			} 
		}
		path[len] = (byte)L'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FindClose(handle);
		if (res == 0) {
			if (!/*Error: Function owner not recognized*/RemoveDirectoryW(path)) {
				res = /*Error: Function owner not recognized*/GetLastError();
			} 
		} 
		return res;
	}
}
