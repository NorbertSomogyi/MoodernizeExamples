package application;

public class MtDecThread_DestructToMtDecThread_FreeInBufs {
	
	
	private static void MtDecThread_Destruct() {
		t.MtDecThread_CloseThread();
		t.MtDecThread_FreeInBufs();
	}
	private static void MtDecThread_CloseThread() {
		Object generatedThread = this.getThread();
		Object generatedCanWrite = this.getCanWrite();
		Object generatedCanRead = this.getCanRead();
		if (((generatedThread) != (null))) {
			ModernizedCProgram.Event_Set(generatedCanWrite);
			ModernizedCProgram.Event_Set(generatedCanRead);
			ModernizedCProgram.Handle_WaitObject((generatedThread));
			ModernizedCProgram.HandlePtr_Close(generatedThread);
		} 
		ModernizedCProgram.HandlePtr_Close(generatedCanRead);
		ModernizedCProgram.HandlePtr_Close(generatedCanWrite);
	}
	public static Object HandlePtr_Close(Object p) {
		if (p != (null)) {
			if (!/*Error: Function owner not recognized*/CloseHandle(p)) {
				return ModernizedCProgram.GetError();
			} 
			p = (null);
		} 
		return 0;
	}
	private static void MtDecThread_FreeInBufs() {
		Object generatedInBuf = this.getInBuf();
		Object generatedMtDec = this.getMtDec();
		if (generatedInBuf) {
			Object link = generatedInBuf;
			this.setInBuf((null));
			do {
				Object next = ((CMtDecBufLink)link).getNext();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedMtDec.getAlloc(), link);
				link = next;
			} while (link);
		} 
	}
}
