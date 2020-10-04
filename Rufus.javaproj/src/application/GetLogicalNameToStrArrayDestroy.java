package application;

public class GetLogicalNameToStrArrayDestroy {
	
	
	private static Byte GetLogicalName(Object DriveIndex, Object PartitionOffset, Object bKeepTrailingBackslash, Object bSilent) {
		byte[][] ignore_device = new byte[][]{"\\Device\\CdRom", "\\Device\\Floppy"};
		Byte volume_start = "\\\\?\\";
		Byte ret = (null);
		byte[] volume_name = new byte[260];
		byte[] path = new byte[260];
		BOOL bPrintHeader = 1;
		HANDLE hDrive = (HANDLE)(true);
		HANDLE hVolume = (HANDLE)(true);
		VOLUME_DISK_EXTENTS_REDEF DiskExtents = new VOLUME_DISK_EXTENTS_REDEF();
		DWORD size = new DWORD();
		UINT drive_type = new UINT();
		StrArray found_name = new StrArray();
		uint64_t[] found_offset = new uint64_t[]{0};
		uint32_t i = new uint32_t();
		uint32_t j = new uint32_t();
		size_t len = new size_t();
		found_name.StrArrayCreate(16);
		do {
			if ((int)DriveIndex < 0) {
				;
			} 
			(((DriveIndex >= -1024) && (DriveIndex <= -1024)) ? null : /*Error: Function owner not recognized*/_assert("(DriveIndex >= DRIVE_INDEX_MIN) && (DriveIndex <= DRIVE_INDEX_MAX)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 279));
			if ((DriveIndex < -1024) || (DriveIndex > -1024)) {
				;
			} 
			DriveIndex -= -1024;
		} while (0);
		Object generatedNumberOfDiskExtents = DiskExtents.getNumberOfDiskExtents();
		Object generatedExtents = DiskExtents.getExtents();
		Object generatedIndex = found_name.getIndex();
		for (i = 0; hDrive == (HANDLE)(true); i++) {
			if (i == 0) {
				hVolume = /*Error: Function owner not recognized*/FindFirstVolumeA(volume_name, /*Error: sizeof expression not supported yet*/);
				if (hVolume == (HANDLE)(true)) {
					do {
						if (!bSilent) {
							ModernizedCProgram._uprintf("Could not access first GUID volume: %s", ModernizedCProgram.WindowsErrorString());
						} 
					} while (0);
					;
				} 
			} else {
					if (!/*Error: Function owner not recognized*/FindNextVolumeA(hVolume, volume_name, /*Error: sizeof expression not supported yet*/)) {
						if (/*Error: Function owner not recognized*/GetLastError() != -1024) {
							do {
								if (!bSilent) {
									ModernizedCProgram._uprintf("Could not access next GUID volume: %s", ModernizedCProgram.WindowsErrorString());
								} 
							} while (0);
						} 
						break;
					} 
			} 
			len = ((((byte)volume_name) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(volume_name));
			((len > 4) ? null : /*Error: Function owner not recognized*/_assert("len > 4", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 299));
			((/*Error: Function owner not recognized*/_strnicmp(((volume_name == (null)) ? "<NULL>" : volume_name), ((volume_start == (null)) ? "<NULL>" : volume_start), 4) == 0) ? null : /*Error: Function owner not recognized*/_assert("safe_strnicmp(volume_name, volume_start, 4) == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 300));
			((volume_name[len - 1] == (byte)'\\') ? null : /*Error: Function owner not recognized*/_assert("volume_name[len - 1] == '\\\\'", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 301));
			drive_type = /*Error: Function owner not recognized*/GetDriveTypeA(volume_name);
			if ((drive_type != 2) && (drive_type != 3)) {
				continue;
			} 
			volume_name[len - 1] = 0;
			if (/*Error: Function owner not recognized*/QueryDosDeviceA(volume_name[4], path, /*Error: sizeof expression not supported yet*/) == 0) {
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Failed to get device path for GUID volume '%s': %s", volume_name, ModernizedCProgram.WindowsErrorString());
					} 
				} while (0);
				continue;
			} 
			for (j = 0; (j < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/)) && (/*Error: Function owner not recognized*/_strnicmp(path, ignore_device[j], ((((byte)ignore_device[j]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ignore_device[j]))) != 0); j++) {
				;
			}
			if (j < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/)) {
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Skipping GUID volume for '%s'", path);
					} 
				} while (0);
				continue;
			} 
			hDrive = /*Error: Function owner not recognized*/CreateFileA(volume_name, -1024, -1024 | -1024, (null), 3, -1024, (null));
			if (hDrive == (HANDLE)(true)) {
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Could not open GUID volume '%s': %s", volume_name, ModernizedCProgram.WindowsErrorString());
					} 
				} while (0);
				continue;
			} 
			if ((!/*Error: Function owner not recognized*/DeviceIoControl(hDrive, (((((ULONG)(byte)'V')) << 16) | ((true) << 14) | ((false) << 2) | (false)), (null), 0, DiskExtents, /*Error: sizeof expression not supported yet*/, size, (null))) || (size <= 0)) {
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Could not get Disk Extents: %s", ModernizedCProgram.WindowsErrorString());
					} 
				} while (0);
				do {
					if ((hDrive != (HANDLE)(true)) && (hDrive != (null))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hDrive);
						hDrive = (HANDLE)(true);
					} 
				} while (0);
				continue;
			} 
			do {
				if ((hDrive != (HANDLE)(true)) && (hDrive != (null))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hDrive);
					hDrive = (HANDLE)(true);
				} 
			} while (0);
			if (generatedNumberOfDiskExtents == 0) {
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Ignoring volume '%s' because it has no extents...", volume_name);
					} 
				} while (0);
				continue;
			} 
			if (generatedNumberOfDiskExtents != 1) {
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Ignoring volume '%s' because it has more than one extent (RAID?)...", volume_name);
					} 
				} while (0);
				continue;
			} 
			if (generatedExtents[0].getDiskNumber() != DriveIndex) {
				continue;
			} 
			if (generatedIndex == 16) {
				ModernizedCProgram._uprintf("Error: Trying to process a disk with more than %d partitions!", 16);
				;
			} 
			if (bKeepTrailingBackslash) {
				volume_name[len - 1] = (byte)'\\';
			} 
			found_offset[generatedIndex] = generatedExtents[0].getStartingOffset().getQuadPart();
			found_name.StrArrayAdd(volume_name, 1);
			if (!bSilent) {
				if (bPrintHeader) {
					bPrintHeader = 0;
					do {
						if (ModernizedCProgram.usb_debug) {
							ModernizedCProgram._uprintf("Windows volumes from this device:");
						} 
					} while (0);
				} 
				do {
					if (ModernizedCProgram.usb_debug) {
						ModernizedCProgram._uprintf("â—? %s @%lld", volume_name, generatedExtents[0].getStartingOffset().getQuadPart());
					} 
				} while (0);
			} 
		}
		if (generatedIndex == 0) {
			;
		} 
		// Now process all the volumes we found, and try to match one with our partition offsetfor (i = 0; (i < generatedIndex) && (PartitionOffset != 0) && (PartitionOffset != found_offset[i]); i++) {
			;
		}
		Object generatedString = found_name.getString();
		if (i < generatedIndex) {
			ret = /*Error: Function owner not recognized*/_strdup(generatedString[i]);
		} else {
				ret = ModernizedCProgram.AltGetLogicalName(DriveIndex + -1024, PartitionOffset, bKeepTrailingBackslash, bSilent);
				if ((ret != (null)) && (/*Error: Function owner not recognized*/strchr(ret, (byte)' ') != (null))) {
					ModernizedCProgram._uprintf("Warning: Using physical device to access partition data");
				} 
		} 
		found_name.StrArrayDestroy();
		return ret/*
		 * Alternative version of the above, needed because some volumes, such as ESPs, are not listed
		 * by Windows, be it with VDS or other APIs.
		 * For these, we return the "\\?\GLOBALROOT\Device\HarddiskVolume#" identifier that matches
		 * our "Harddisk#Partition#", as reported by QueryDosDevice().
		 * The returned string is allocated and must be freed.
		*/;
	}
	/*
	 * String array manipulation
	 */
	public static void StrArrayCreate(Object initial_size) {
		if (arr == (null)) {
			return /*Error: Unsupported expression*/;
		} 
		this.setMax(initial_size);
		this.setIndex(0);
		Object generatedMax = this.getMax();
		this.setString((byte)/*Error: Function owner not recognized*/calloc(generatedMax, /*Error: Unsupported expression*/));
		Object generatedString = this.getString();
		if (generatedString == (null)) {
			ModernizedCProgram._uprintf("Could not allocate string array\n");
		} 
	}
	public static void StrArrayDestroy() {
		arr.StrArrayClear();
		Object generatedString = this.getString();
		if (arr != (null)) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)generatedString);
				this.setString((null));
			} while (0/*
			 * Retrieve the SID of the current user. The returned PSID must be freed by the caller using LocalFree()
			 */);
		} 
	}
}
