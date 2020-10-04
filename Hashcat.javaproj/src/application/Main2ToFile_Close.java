package application;

public class Main2ToFile_Close {
	
	
	private static int main2(int numArgs, Object[][] args, Byte rs) {
		CFileSeqInStream inStream = new CFileSeqInStream();
		CFileOutStream outStream = new CFileOutStream();
		byte c;
		int res;
		int encodeMode;
		BoolInt useOutFile = 0;
		inStream.FileSeqInStream_CreateVTable();
		Object generatedFile = inStream.getFile();
		generatedFile.File_Construct();
		outStream.FileOutStream_CreateVTable();
		generatedFile.File_Construct();
		if (numArgs == 1) {
			ModernizedCProgram.PrintHelp(rs);
			return 0;
		} 
		if (numArgs < 3 || numArgs > 4 || /*Error: Function owner not recognized*/strlen(args[1]) != 1) {
			return ModernizedCProgram.PrintUserError(rs);
		} 
		c = args[1][0];
		encodeMode = (c == (byte)'e' || c == (byte)'E');
		if (!encodeMode && c != (byte)'d' && c != (byte)'D') {
			return ModernizedCProgram.PrintUserError(rs);
		} 
		{ 
			size_t t4 = /*Error: Unsupported expression*/;
			size_t t8 = /*Error: Unsupported expression*/;
			if (t4 != 4 || t8 != 8) {
				return ModernizedCProgram.PrintError(rs, "Incorrect UInt32 or UInt64");
			} 
		}
		if (generatedFile.InFile_Open(args[2]) != 0) {
			return ModernizedCProgram.PrintError(rs, "Can not open input file");
		} 
		if (numArgs > 3) {
			useOutFile = 1;
			if (generatedFile.OutFile_Open(args[3]) != 0) {
				return ModernizedCProgram.PrintError(rs, "Can not open output file");
			} 
		}  else if (encodeMode) {
			ModernizedCProgram.PrintUserError(rs);
		} 
		Object generatedVt = outStream.getVt();
		if (encodeMode) {
			UInt64 fileSize = new UInt64();
			generatedFile.File_GetLength(fileSize);
			res = ModernizedCProgram.Encode(generatedVt, generatedVt, fileSize, rs);
		} else {
				res = /*Error: Function owner not recognized*/Decode(generatedVt, useOutFile ? generatedVt : (null));
		} 
		if (useOutFile) {
			generatedFile.File_Close();
		} 
		generatedFile.File_Close();
		if (res != 0) {
			if (res == 2) {
				return ModernizedCProgram.PrintError(rs, ModernizedCProgram.kCantAllocateMessage);
			}  else if (res == 1) {
				return ModernizedCProgram.PrintError(rs, ModernizedCProgram.kDataErrorMessage);
			}  else if (res == 9) {
				return ModernizedCProgram.PrintError(rs, ModernizedCProgram.kCantWriteMessage);
			}  else if (res == 8) {
				return ModernizedCProgram.PrintError(rs, ModernizedCProgram.kCantReadMessage);
			} 
			return ModernizedCProgram.PrintErrorNumber(rs, res);
		} 
		return 0;
	}
	private static void FileSeqInStream_CreateVTable() {
		Object generatedVt = this.getVt();
		generatedVt.setRead(FileSeqInStream_Read);
	}
	/* 7zFile.c -- File IO
	2017-04-03 : Igor Pavlov : Public domain */
	/*
	   ReadFile and WriteFile functions in Windows have BUG:
	   If you Read or Write 64MB or more (probably min_failure_size = 64MB - 32KB + 1)
	   from/to Network file, it returns ERROR_NO_SYSTEM_RESOURCES
	   (Insufficient system resources exist to complete the requested service).
	   Probably in some version of Windows there are problems with other sizes:
	   for 32 MB (maybe also for 16 MB).
	   And message can be "Network connection was lost"
	*/
	private static void File_Construct() {
		this.setHandle((HANDLE)(true));
	}
	private static void FileOutStream_CreateVTable() {
		Object generatedVt = this.getVt();
		generatedVt.setWrite(FileOutStream_Write);
	}
	public static Object File_Close() {
		Object generatedHandle = this.getHandle();
		if (generatedHandle != (HANDLE)(true)) {
			if (!/*Error: Function owner not recognized*/CloseHandle(generatedHandle)) {
				return /*Error: Function owner not recognized*/GetLastError();
			} 
			this.setHandle((HANDLE)(true));
		} 
		return 0;
	}
}
