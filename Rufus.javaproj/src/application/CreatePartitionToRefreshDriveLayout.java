package application;

public class CreatePartitionToRefreshDriveLayout {
	
	
	private static Object CreatePartition(Object hDrive, int partition_style, int file_system, Object mbr_uefi_marker, Object extra_partitions) {
		byte[][] PartitionTypeName = new byte[][]{"MBR", "GPT", "SFD"};
		wchar_t extra_part_name = L"";
		wchar_t main_part_name = L"Main Data Partition";
		LONGLONG bytes_per_track = ((LONGLONG)SelectedDrive.getSectorsPerTrack()) * SelectedDrive.getSectorSize();
		DWORD size_to_clear = 128 * SelectedDrive.getSectorSize();
		uint8_t buffer = new uint8_t();
		size_t uefi_ntfs_size = 0;
		CREATE_DISK CreateDisk = new CREATE_DISK(_PARTITION_STYLE.PARTITION_STYLE_RAW, {new CREATE_DISK(0)});
		DRIVE_LAYOUT_INFORMATION_EX4 DriveLayoutEx = new DRIVE_LAYOUT_INFORMATION_EX4(0);
		BOOL r = new BOOL();
		DWORD i = new DWORD();
		DWORD size = new DWORD();
		DWORD bufsize = new DWORD();
		DWORD pn = 0;
		LONGLONG main_part_size_in_sectors = new LONGLONG();
		LONGLONG extra_part_size_in_tracks = 0;
		LONGLONG ms_esp_size = new LONGLONG();
		PrintStatusInfo(1, 1, 0, 3238, PartitionTypeName[partition_style]);
		if (partition_style == _PARTITION_STYLE.PARTITION_STYLE_RAW) {
			return 1;
		} 
		// Nothing to do
		if (extra_partitions & -1024) {
			uefi_ntfs_size = GetResourceSize(hMainInstance, (LPSTR)((DWORD)((WORD)(true))), (LPSTR)((DWORD)((WORD)(true))), "uefi-ntfs.img");
			if (uefi_ntfs_size == 0) {
				return 0;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(partition_offset, 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(SelectedDrive.getPartitionOffset(), 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(SelectedDrive.getPartitionSize(), 0, /*Error: sizeof expression not supported yet*/);
		Object[] generatedPartitionEntry = DriveLayoutEx.getPartitionEntry();
		// Compute the start offset of our first partitionif ((partition_style == _PARTITION_STYLE.PARTITION_STYLE_GPT) || (!(/*Error: Function owner not recognized*/IsDlgButtonChecked(hMainDialog, 1021) == 1))) {
			generatedPartitionEntry[pn].getStartingOffset().setQuadPart(-1024);
		} else {
				generatedPartitionEntry[pn].getStartingOffset().setQuadPart(bytes_per_track);
		} 
		// Go with the MS 1 MB wastage at the beginning...
		// If required, set the MSR partition (GPT only - must be created before the data part)if (extra_partitions & -1024) {
			((partition_style == _PARTITION_STYLE.PARTITION_STYLE_GPT) ? null : /*Error: Function owner not recognized*/_assert("partition_style == PARTITION_STYLE_GPT", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 1552));
			extra_part_name = L"Microsoft Reserved Partition";
			generatedPartitionEntry[pn].getPartitionLength().setQuadPart(128 * -1024);
			generatedPartitionEntry[pn].getGpt().setPartitionType(PARTITION_MSFT_RESERVED_GUID);
			_uprintf("â—? Creating %S (offset: %lld, size: %s)", extra_part_name, generatedPartitionEntry[pn].getStartingOffset().getQuadPart(), SizeToHumanReadable(generatedPartitionEntry[pn].getPartitionLength().getQuadPart(), 1, 0));
			do {
				(Object)(/*Error: Function owner not recognized*/CoCreateGuid(generatedPartitionEntry[pn].getGpt().getPartitionId()));
			} while (0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcsncpy(generatedPartitionEntry[pn].getGpt().getName(), extra_part_name, (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
			if (!generatedPartitionEntry[pn].getStartingOffset().ClearPartition(hDrive, size_to_clear)) {
				_uprintf("Could not zero %S: %s", extra_part_name, WindowsErrorString());
			} 
			SelectedDrive.getPartitionOffset()[pn] = generatedPartitionEntry[pn].getStartingOffset().getQuadPart();
			SelectedDrive.getPartitionSize()[pn] = generatedPartitionEntry[pn].getPartitionLength().getQuadPart();
			pn++;
			generatedPartitionEntry[pn].getStartingOffset().setQuadPart(generatedPartitionEntry[pn - 1].getStartingOffset().getQuadPart() + generatedPartitionEntry[pn - 1].getPartitionLength().getQuadPart());
			extra_partitions &=  ~(true);
		} 
		// Set our main data partition// Set our main data partitionmain_part_size_in_sectors = (SelectedDrive.getDiskSize() - generatedPartitionEntry[pn].getStartingOffset().getQuadPart()) / SelectedDrive.getSectorSize() - ((partition_style == _PARTITION_STYLE.PARTITION_STYLE_GPT) ? 33 : 0)// Need 33 sectors at the end for secondary GPT;// Need 33 sectors at the end for secondary GPT
		if (extra_partitions) {
			if (extra_partitions & -1024) {
				extra_part_name = L"EFI System";
				if (SelectedDrive.getSectorSize() <= 4096) {
					ms_esp_size = 300 * -1024;
				} else {
						ms_esp_size = 1200 * -1024;
				} 
				extra_part_size_in_tracks = (ms_esp_size + bytes_per_track - 1) / bytes_per_track;
			}  else if (extra_partitions & -1024) {
				extra_part_name = L"UEFI:NTFS";
				extra_part_size_in_tracks = ((((1024 * 1024)) > (uefi_ntfs_size) ? ((1024 * 1024)) : (uefi_ntfs_size)) + bytes_per_track - 1) / bytes_per_track;
			}  else if ((extra_partitions & -1024)) {
				((persistence_size != 0) ? null : /*Error: Function owner not recognized*/_assert("persistence_size != 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 1594));
				extra_part_name = L"Linux Persistence";
				extra_part_size_in_tracks = persistence_size / bytes_per_track;
			}  else if (extra_partitions & -1024) {
				extra_part_name = L"BIOS Compatibility";
				extra_part_size_in_tracks = 1;
			} else {
					((false) ? null : /*Error: Function owner not recognized*/_assert("FALSE", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 1601));
			} 
			main_part_size_in_sectors = ((main_part_size_in_sectors / SelectedDrive.getSectorsPerTrack()) - extra_part_size_in_tracks) * SelectedDrive.getSectorsPerTrack();
		} 
		// Adjust the size according to extra partitions (which we always align to a track)
		if (main_part_size_in_sectors <= 0) {
			_uprintf("Error: Invalid %S size", main_part_name);
			return 0;
		} 
		_uprintf("â—? Creating %S (offset: %lld, size: %s)", main_part_name, generatedPartitionEntry[pn].getStartingOffset().getQuadPart(), SizeToHumanReadable(main_part_size_in_sectors * SelectedDrive.getSectorSize(), 1, 0));
		// Zero the beginning of this partition to avoid conflicting leftoversif (!generatedPartitionEntry[pn].getStartingOffset().ClearPartition(hDrive, size_to_clear)) {
			_uprintf("Could not zero %S: %s", main_part_name, WindowsErrorString());
		} 
		generatedPartitionEntry[pn].getPartitionLength().setQuadPart(main_part_size_in_sectors * SelectedDrive.getSectorSize());
		if (partition_style == _PARTITION_STYLE.PARTITION_STYLE_MBR) {
			generatedPartitionEntry[pn].getMbr().setBootIndicator((boot_type != boot_type.BT_NON_BOOTABLE));
			switch (file_system) {
			case fs_type.FS_EXT2:
			case fs_type.FS_NTFS:
			case fs_type.FS_FAT32:
					generatedPartitionEntry[pn].getMbr().setPartitionType(-1024);
					break;
			case fs_type.FS_FAT16:
					generatedPartitionEntry[pn].getMbr().setPartitionType(-1024);
					break;
			case fs_type.FS_EXT3:
			case fs_type.FS_UDF:
			case fs_type.FS_EXFAT:
			case fs_type.FS_EXT4:
					generatedPartitionEntry[pn].getMbr().setPartitionType(-1024);
					break;
			case fs_type.FS_REFS:
					generatedPartitionEntry[pn].getMbr().setPartitionType(-1024);
					break;
			default:
					_uprintf("Unsupported file system");
					return 0;
			}
		} else {
				generatedPartitionEntry[pn].getGpt().setPartitionType(PARTITION_BASIC_DATA_GUID);
				do {
					(Object)(/*Error: Function owner not recognized*/CoCreateGuid(generatedPartitionEntry[pn].getGpt().getPartitionId()));
				} while (0);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcsncpy(generatedPartitionEntry[pn].getGpt().getName(), main_part_name, (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
		} 
		SelectedDrive.getPartitionOffset()[pn] = generatedPartitionEntry[pn].getStartingOffset().getQuadPart();
		SelectedDrive.getPartitionSize()[pn] = generatedPartitionEntry[pn].getPartitionLength().getQuadPart();
		partition_offset[0] = SelectedDrive.getPartitionOffset()[pn];
		pn++;
		// Set the optional extra partitionif (extra_partitions) {
			generatedPartitionEntry[pn].getStartingOffset().setQuadPart(generatedPartitionEntry[pn - 1].getStartingOffset().getQuadPart() + generatedPartitionEntry[pn - 1].getPartitionLength().getQuadPart());
			generatedPartitionEntry[pn].getPartitionLength().setQuadPart((extra_partitions & -1024) ? uefi_ntfs_size : extra_part_size_in_tracks * bytes_per_track);
			_uprintf("â—? Creating %S Partition (offset: %lld, size: %s)", extra_part_name, generatedPartitionEntry[pn].getStartingOffset().getQuadPart(), SizeToHumanReadable(generatedPartitionEntry[pn].getPartitionLength().getQuadPart(), 1, 0));
			SelectedDrive.getPartitionOffset()[pn] = generatedPartitionEntry[pn].getStartingOffset().getQuadPart();
			SelectedDrive.getPartitionSize()[pn] = generatedPartitionEntry[pn].getPartitionLength().getQuadPart();
			if (extra_partitions & -1024) {
				partition_offset[2] = SelectedDrive.getPartitionOffset()[pn];
			}  else if (extra_partitions & -1024) {
				partition_offset[1] = SelectedDrive.getPartitionOffset()[pn];
			} 
			if (partition_style == _PARTITION_STYLE.PARTITION_STYLE_GPT) {
				generatedPartitionEntry[pn].getGpt().setPartitionType((extra_partitions & -1024) ? PARTITION_SYSTEM_GUID : PARTITION_BASIC_DATA_GUID);
				do {
					(Object)(/*Error: Function owner not recognized*/CoCreateGuid(generatedPartitionEntry[pn].getGpt().getPartitionId()));
				} while (0);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcsncpy(generatedPartitionEntry[pn].getGpt().getName(), (extra_partitions & -1024) ? L"EFI System Partition" : extra_part_name, (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
			} else {
					if (extra_partitions & (-1024 | -1024)) {
						generatedPartitionEntry[pn].getMbr().setPartitionType(-1024);
					}  else if (extra_partitions & -1024) {
						generatedPartitionEntry[pn].getMbr().setPartitionType(-1024);
					}  else if (extra_partitions & -1024) {
						generatedPartitionEntry[pn].getMbr().setPartitionType(-1024);
						generatedPartitionEntry[pn].getMbr().setHiddenSectors(SelectedDrive.getSectorsPerTrack());
					} else {
							((false) ? null : /*Error: Function owner not recognized*/_assert("FALSE", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\drive.c", 1682));
					} 
			} 
			if (extra_partitions & -1024) {
				_uprintf("Writing %S data...", extra_part_name);
				if (!/*Error: Function owner not recognized*/SetFilePointerEx(hDrive, generatedPartitionEntry[pn].getStartingOffset(), (null), 0)) {
					_uprintf("Could not set position");
					return 0;
				} 
				buffer = GetResource(hMainInstance, (LPSTR)((DWORD)((WORD)(true))), (LPSTR)((DWORD)((WORD)(true))), "uefi-ntfs.img", bufsize, 0);
				if (buffer == (null)) {
					_uprintf("Could not access source image");
					return 0;
				} 
				if (!WriteFileWithRetry(hDrive, buffer, bufsize, size, 4)) {
					_uprintf("Write error: %s", WindowsErrorString());
					return 0;
				} 
				installed_uefi_ntfs = 1;
			} 
			pn++;
		} 
		// Should end on a track boundary
		// Initialize the remaining partition datafor (i = 0; i < pn; i++) {
			generatedPartitionEntry[i].setPartitionNumber(i + 1);
			generatedPartitionEntry[i].setPartitionStyle(partition_style);
			generatedPartitionEntry[i].setRewritePartition(1);
		}
		Object generatedMbr = CreateDisk.getMbr();
		Object generatedGpt = CreateDisk.getGpt();
		switch (partition_style) {
		case _PARTITION_STYLE.PARTITION_STYLE_GPT:
				CreateDisk.setPartitionStyle(_PARTITION_STYLE.PARTITION_STYLE_GPT);
				do {
					(Object)(/*Error: Function owner not recognized*/CoCreateGuid(generatedGpt.getDiskId()));
				} while (0);
				generatedGpt.setMaxPartitionCount(16);
				DriveLayoutEx.setPartitionStyle(_PARTITION_STYLE.PARTITION_STYLE_GPT);
				DriveLayoutEx.setPartitionCount(pn);
				generatedGpt.getStartingUsableOffset().setQuadPart(34 * SelectedDrive.getSectorSize());
				generatedGpt.getUsableLength().setQuadPart(SelectedDrive.getDiskSize() - (34 + 33) * SelectedDrive.getSectorSize());
				generatedGpt.setMaxPartitionCount(16);
				generatedGpt.setDiskId(generatedGpt.getDiskId());
				break;
		case _PARTITION_STYLE.PARTITION_STYLE_MBR:
				CreateDisk.setPartitionStyle(_PARTITION_STYLE.PARTITION_STYLE_MBR);
				generatedMbr.setSignature(mbr_uefi_marker ? -1024 : (DWORD)/*Error: Function owner not recognized*/GetTickCount64());
				DriveLayoutEx.setPartitionStyle(_PARTITION_STYLE.PARTITION_STYLE_MBR);
				DriveLayoutEx.setPartitionCount(4);
				generatedMbr.setSignature(generatedMbr.getSignature());
				break;
		}
		// If you don't call IOCTL_DISK_CREATE_DISK, the IOCTL_DISK_SET_DRIVE_LAYOUT_EX call will fail// If you don't call IOCTL_DISK_CREATE_DISK, the IOCTL_DISK_SET_DRIVE_LAYOUT_EX call will failsize = /*Error: sizeof expression not supported yet*/;
		r = /*Error: Function owner not recognized*/DeviceIoControl(hDrive, (((true) << 16) | ((-1024 | -1024) << 14) | ((true) << 2) | (false)), (BYTE)CreateDisk, size, (null), 0, size, (null));
		if (!r) {
			_uprintf("Could not reset disk: %s", WindowsErrorString());
			return 0;
		} 
		// "The goggles, they do nothing!"// "The goggles, they do nothing!"RefreshDriveLayout(hDrive);
		size = /*Error: sizeof expression not supported yet*/ - ((partition_style == _PARTITION_STYLE.PARTITION_STYLE_GPT) ? ((4 - pn) * /*Error: Unsupported expression*/) : 0);
		r = /*Error: Function owner not recognized*/DeviceIoControl(hDrive, (((true) << 16) | ((-1024 | -1024) << 14) | ((true) << 2) | (false)), (BYTE)DriveLayoutEx, size, (null), 0, size, (null));
		if (!r) {
			_uprintf("Could not set drive layout: %s", WindowsErrorString());
			return 0;
		} 
		if (!RefreshDriveLayout(hDrive)) {
			return 0;
		} 
		return 1;
	}
	public static void PrintStatusInfo(Object info, Object debug, int duration, int msg_id) {
		Byte format = (null);
		byte[] buf = new byte[256];
		byte[] msg_hi = szMessage[info ? 1 : 0][1];
		Byte msg_lo = szMessage[info ? 1 : 0][0];
		byte[] msg_cur = (duration > 0) ? msg_lo : msg_hi;
		va_list args = new va_list();
		if (msg_id < 0) {
			msg_hi[0] = 0;
			OutputMessage(info, msg_hi);
			return /*Error: Unsupported expression*/;
		} 
		// A negative msg_id clears the message
		if ((msg_id < 3000) || (msg_id >= 3321)) {
			_uprintf("PrintStatusInfo: invalid MSG_ID\n");
			return /*Error: Unsupported expression*/;
		} 
		// We need to keep track of where szStatusMessage should point to so that ellipses workif (!info) {
			szStatusMessage = szMessage[0][(duration > 0) ? 0 : 1];
		} 
		if ((msg_id >= 3000) && (msg_id < 3321)) {
			format = msg_table[msg_id - 3000];
		} 
		if (format == (null)) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(msg_hi, 256, "MSG_%03d UNTRANSLATED", msg_id - 3000);
				(msg_hi)[(true) - 1] = 0;
			} while (0);
			_uprintf(msg_hi);
			OutputMessage(info, msg_hi);
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, msg_id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/vsnprintf(msg_cur, 256, format, args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args);
		msg_cur[256 - 1] = (byte)'\0';
		if ((duration != 0) || (!bStatusTimerArmed)) {
			OutputMessage(info, msg_cur);
		} 
		if (duration != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetTimer(hMainDialog, (info) ? timer_type.TID_MESSAGE_INFO : timer_type.TID_MESSAGE_STATUS, duration, PrintMessageTimeout);
			bStatusTimerArmed = 1;
		} 
		// Because we want the log messages in English, we go through the VA business once more, but this time with default_msg_tableif (debug) {
			if ((msg_id >= 3000) && (msg_id < 3321)) {
				format = default_msg_table[msg_id - 3000];
			} 
			if (format == (null)) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(buf, /*Error: sizeof expression not supported yet*/, "(default) MSG_%03d UNTRANSLATED", msg_id - 3000);
					(buf)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
				} while (0);
				return /*Error: Unsupported expression*/;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, msg_id);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/vsnprintf(buf, 256, format, args);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args);
			buf[256 - 1] = (byte)'\0';
			_uprintf(buf/*
			 * These 2 functions are used to set the current locale
			 * If fallback is true, the call will fall back to use the first
			 * translation listed in the loc file
			 */);
		} 
	}
	// Buffer for ubpushf() messages we don't log right away
	public static void _uprintf(Object format) {
		byte[] buf = new byte[4096];
		byte[] p = buf;
		wchar_t wbuf = new wchar_t();
		va_list args = new va_list();
		int n;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, format);
		// buf-3 is room for CR/LF/NUL// buf-3 is room for CR/LF/NULn = /*Error: Function owner not recognized*/vsnprintf(p, /*Error: sizeof expression not supported yet*/ - 3, format, args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args);
		p += (n < 0) ? /*Error: sizeof expression not supported yet*/ - 3 : n;
		while ((p > buf) && (/*Error: Function owner not recognized*/isspace((byte)(p[-1])))) {
			--p = (byte)'\0';
		}
		p++ = (byte)'\r';
		p++ = (byte)'\n';
		p = (byte)'\0';
		// Yay, Windows 10 *FINALLY* added actual Unicode support for OutputDebugStringW()!// Yay, Windows 10 *FINALLY* added actual Unicode support for OutputDebugStringW()!wbuf = utf8_to_wchar(buf)// Send output to Windows debug facility;// Send output to Windows debug facility
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/OutputDebugStringW(wbuf);
		if ((hLog != (null)) && (hLog != (HANDLE)(true))) {
			((Object)/*Error: Function owner not recognized*/SendMessageA((hLog), 177, (true), (true)));
			((Object)/*Error: Function owner not recognized*/SendMessageA((hLog), 194, 0, (LPARAM)(LPCTSTR)(wbuf)));
			((Object)/*Error: Function owner not recognized*/SendMessageA((hLog), 182, (WPARAM)(false), (LPARAM)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((hLog), 186, 0, 0)))));
		} 
		// Send output to our log Window
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(wbuf);
	}
	public static Object RefreshDriveLayout(Object hDrive) {
		BOOL r = new BOOL();
		DWORD size = new DWORD();
		// Diskpart does call the following IOCTL this after updating the partition table, so we do too// Diskpart does call the following IOCTL this after updating the partition table, so we do toor = /*Error: Function owner not recognized*/DeviceIoControl(hDrive, (((true) << 16) | ((true) << 14) | ((true) << 2) | (false)), (null), 0, (null), 0, size, (null));
		if (!r) {
			_uprintf("Could not refresh drive layout: %s", WindowsErrorString());
		} 
		return r;
	}
}
