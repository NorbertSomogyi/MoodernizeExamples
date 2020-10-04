package application;

public class SearchProcessAltToPhDestroyHeap {
	
	
	private static Object SearchProcessAlt(Byte HandleName) {
		NTSTATUS status = ((NTSTATUS)-1024);
		ULONG i = new ULONG();
		HANDLE searchHandle = (null);
		BOOLEAN bFound = 0;
		PFILE_PROCESS_IDS_USING_FILE_INFORMATION info = (null);
		status = ModernizedCProgram.PhCreateHeap();
		if (!/*Error: Function owner not recognized*/NT_SUCCESS(status)) {
			;
		} 
		// Note that the access rights being used with CreateFile() might matter...// Note that the access rights being used with CreateFile() might matter...searchHandle = /*Error: Function owner not recognized*/CreateFileA(HandleName, -1024, -1024 | -1024, (null), 3, -1024, (null));
		status = ModernizedCProgram.PhQueryProcessesUsingVolumeOrFile(searchHandle, info);
		if (/*Error: Function owner not recognized*/NT_SUCCESS(status) && (info.getNumberOfProcessIdsInList() > 0)) {
			bFound = 1;
			ModernizedCProgram._uprintf("WARNING: The following process(es) or service(s) are accessing %s:", HandleName);
			for (i = 0; i < info.getNumberOfProcessIdsInList(); i++) {
				ModernizedCProgram._uprintf("o Process with PID %ld", info.getProcessIdList()[i]);
			}
		} 
		ModernizedCProgram.PhFree(info);
		ModernizedCProgram.PhDestroyHeap();
		if (!/*Error: Function owner not recognized*/NT_SUCCESS(status)) {
			ModernizedCProgram._uprintf("SearchProcessAlt('%s') failed: %s", HandleName, ModernizedCProgram.NtStatusError(status));
		} 
		return bFound/**
		 * Increase the privileges of the current application.
		 *
		 * \return TRUE if the request was successful.
		 */;
	}
	public static void PhFree(Object Memory) {
		if (ModernizedCProgram.pfRtlFreeHeap == (null)) {
			ModernizedCProgram.pfRtlFreeHeap = (RtlFreeHeap_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("Ntdll"), "RtlFreeHeap");
		} 
		if (ModernizedCProgram.pfRtlFreeHeap != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pfRtlFreeHeap(ModernizedCProgram.PhHeapHandle, 0, Memory/**
			 * Enumerates all open handles.
			 *
			 * \param Handles A variable which receives a pointer to a structure containing information about
			 * all opened handles. You must free the structure using PhFree() when you no longer need it.
			 *
			 * \return An NTStatus indicating success or the error code.
			 */);
		} 
	}
	public static Object PhDestroyHeap() {
		NTSTATUS status = ((NTSTATUS)-1024);
		if (ModernizedCProgram.PhHeapHandle == (null)) {
			return ((NTSTATUS)-1024);
		} 
		do {
			if (ModernizedCProgram.pfRtlDestroyHeap == (null)) {
				ModernizedCProgram.pfRtlDestroyHeap = (RtlDestroyHeap_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("Ntdll"), "RtlDestroyHeap");
			} 
			if ((ModernizedCProgram.pfRtlDestroyHeap == (null)) && (/*Error: Function owner not recognized*/NT_SUCCESS(status))) {
				status = ((NTSTATUS)-1024);
			} 
		} while (0);
		if (/*Error: Function owner not recognized*/NT_SUCCESS(status)) {
			if (/*Error: Function owner not recognized*/pfRtlDestroyHeap(ModernizedCProgram.PhHeapHandle) == (null)) {
				ModernizedCProgram.PhHeapHandle = (null);
			} else {
					status = ((NTSTATUS)-1024);
			} 
		} 
		return status/**
		 * Allocates a block of memory.
		 *
		 * \param Size The number of bytes to allocate.
		 *
		 * \return A pointer to the allocated block of memory.
		 *
		 */;
	}
}
