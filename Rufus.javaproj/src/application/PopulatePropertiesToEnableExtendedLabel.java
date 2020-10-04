package application;

public class PopulatePropertiesToEnableExtendedLabel {
	
	
	// Populate the UI main dropdown properties.
	// This should be called on device or boot type change.
	private static Object PopulateProperties() {
		Byte device_tooltip;
		int device_index = ((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDeviceList), 327, 0, 0));
		byte[] fs_name = new byte[32];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.SelectedDrive, 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hStart, 0);
		if (device_index < 0) {
			;
		} 
		ModernizedCProgram.persistence_unit_selection = -1// Get data from the currently selected drive;// Get data from the currently selected drive
		ModernizedCProgram.SelectedDrive.setDeviceNumber((DWORD)((LRESULT)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDeviceList), 336, (WPARAM)(int)(device_index), 0)))// This fills the SelectedDrive properties;// This fills the SelectedDrive properties
		ModernizedCProgram.GetDrivePartitionData(ModernizedCProgram.SelectedDrive.getDeviceNumber(), fs_name, /*Error: sizeof expression not supported yet*/, 0);
		ModernizedCProgram.SetPartitionSchemeAndTargetSystem(0)// Attempt to reselect the last file system explicitly set by the user;// Attempt to reselect the last file system explicitly set by the user
		if (!ModernizedCProgram.SetFileSystemAndClusterSize((ModernizedCProgram.selected_fs == fs_type.FS_UNKNOWN) ? fs_name : (null))) {
			ModernizedCProgram.SetProposedLabel(-1);
			ModernizedCProgram._uprintf("No file system is selectable for this drive\n");
			return 0;
		} 
		ModernizedCProgram.EnableControls(1, 0);
		// Set a proposed label according to the size (eg: "256MB", "8GB")do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(ModernizedCProgram.SelectedDrive.getProposed_label(), /*Error: sizeof expression not supported yet*/, ModernizedCProgram.SizeToHumanReadable(ModernizedCProgram.SelectedDrive.getDiskSize(), 0, ModernizedCProgram.use_fake_units));
			(ModernizedCProgram.SelectedDrive.getProposed_label())[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
		} while (0);
		// Add a tooltip (with the size of the device in parenthesis)// Add a tooltip (with the size of the device in parenthesis)device_tooltip = (byte)/*Error: Function owner not recognized*/malloc(((((byte)ModernizedCProgram.DriveName.getString()[device_index]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.DriveName.getString()[device_index])) + 32);
		if (device_tooltip != (null)) {
			if (ModernizedCProgram.right_to_left_mode) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(device_tooltip, ((((byte)ModernizedCProgram.DriveName.getString()[device_index]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.DriveName.getString()[device_index])) + 32, "(%s) %s", ModernizedCProgram.SizeToHumanReadable(ModernizedCProgram.SelectedDrive.getDiskSize(), 0, 0), ModernizedCProgram.DriveName.getString()[device_index]);
					(device_tooltip)[(((((byte)ModernizedCProgram.DriveName.getString()[device_index]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.DriveName.getString()[device_index])) + 32) - 1] = 0;
				} while (0);
			} else {
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(device_tooltip, ((((byte)ModernizedCProgram.DriveName.getString()[device_index]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.DriveName.getString()[device_index])) + 32, "%s (%s)", ModernizedCProgram.DriveName.getString()[device_index], ModernizedCProgram.SizeToHumanReadable(ModernizedCProgram.SelectedDrive.getDiskSize(), 0, 0));
						(device_tooltip)[(((((byte)ModernizedCProgram.DriveName.getString()[device_index]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.DriveName.getString()[device_index])) + 32) - 1] = 0;
					} while (0);
			} 
			ModernizedCProgram.CreateTooltip(ModernizedCProgram.hDeviceList, device_tooltip, -1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(device_tooltip);
		} 
		return 1;
	}
	private static Object GetDrivePartitionData(Object DriveIndex, byte[] FileSystemName, Object FileSystemNameSize, Object bSilent) {
		// MBR partition types that can be mounted in Windowsuint8_t[] mbr_mountable = new uint8_t[]{-1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024};
		BOOL r = new BOOL();
		BOOL ret = 0;
		BOOL isUefiNtfs = new BOOL();
		HANDLE hPhysical = new HANDLE();
		DWORD size = new DWORD();
		DWORD i = new DWORD();
		DWORD j = new DWORD();
		DWORD super_floppy_disk = 0;
		BYTE[] geometry = new BYTE[]{0};
		BYTE[] layout = new BYTE[]{0};
		BYTE part_type = new BYTE();
		PDISK_GEOMETRY_EX DiskGeometry = (PDISK_GEOMETRY_EX)(Object)geometry;
		PDRIVE_LAYOUT_INFORMATION_EX DriveLayout = (PDRIVE_LAYOUT_INFORMATION_EX)(Object)layout;
		Byte volume_name;
		byte[] buf;
		if (FileSystemName == (null)) {
			return 0;
		} 
		ModernizedCProgram.SelectedDrive.setNPartitions(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.SelectedDrive.getPartitionOffset(), 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.SelectedDrive.getPartitionSize(), 0, /*Error: sizeof expression not supported yet*/)// Populate the filesystem data;// Populate the filesystem data
		FileSystemName[0] = 0;
		volume_name = ModernizedCProgram.GetLogicalName(DriveIndex, 0, 1, 0);
		if ((volume_name == (null)) || (!/*Error: Function owner not recognized*/GetVolumeInformationA(volume_name, (null), 0, (null), (null), (null), FileSystemName, FileSystemNameSize))) {
			do {
				if (!bSilent) {
					ModernizedCProgram._uprintf("No volume information for drive 0x%02x", DriveIndex);
				} 
			} while (0);
		} 
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)volume_name);
			volume_name = (null);
		} while (0);
		hPhysical = ModernizedCProgram.GetPhysicalHandle(DriveIndex, 0, 0, 1);
		if (hPhysical == (HANDLE)(true)) {
			return 0;
		} 
		r = /*Error: Function owner not recognized*/DeviceIoControl(hPhysical, (((true) << 16) | ((true) << 14) | ((true) << 2) | (false)), (null), 0, geometry, /*Error: sizeof expression not supported yet*/, size, (null));
		if (!r || size <= 0) {
			do {
				if (!bSilent) {
					ModernizedCProgram._uprintf("Could not get geometry for drive 0x%02x: %s", DriveIndex, ModernizedCProgram.WindowsErrorString());
				} 
			} while (0);
			do {
				if ((hPhysical != (HANDLE)(true)) && (hPhysical != (null))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hPhysical);
					hPhysical = (HANDLE)(true);
				} 
			} while (0);
			return 0;
		} 
		ModernizedCProgram.SelectedDrive.setDiskSize(DiskGeometry.getDiskSize().getQuadPart());
		ModernizedCProgram.SelectedDrive.setSectorSize(DiskGeometry.getGeometry().getBytesPerSector());
		ModernizedCProgram.SelectedDrive.setFirstDataSector(-1024);
		if (ModernizedCProgram.SelectedDrive.getSectorSize() < 512) {
			do {
				if (!bSilent) {
					ModernizedCProgram._uprintf("Warning: Drive 0x%02x reports a sector size of %d - Correcting to 512 bytes.", DriveIndex, ModernizedCProgram.SelectedDrive.getSectorSize());
				} 
			} while (0);
			ModernizedCProgram.SelectedDrive.setSectorSize(512);
		} 
		ModernizedCProgram.SelectedDrive.setSectorsPerTrack(DiskGeometry.getGeometry().getSectorsPerTrack());
		ModernizedCProgram.SelectedDrive.setMediaType(DiskGeometry.getGeometry().getMediaType());
		do {
			if (!bSilent) {
				ModernizedCProgram._uprintf("Disk type: %s, Disk size: %s, Sector size: %d bytes", (ModernizedCProgram.SelectedDrive.getMediaType() == _MEDIA_TYPE.FixedMedia) ? "FIXED" : "Removable", ModernizedCProgram.SizeToHumanReadable(ModernizedCProgram.SelectedDrive.getDiskSize(), 0, 1), ModernizedCProgram.SelectedDrive.getSectorSize());
			} 
		} while (0);
		do {
			if (!bSilent) {
				ModernizedCProgram._uprintf("Cylinders: %I64i, Tracks per cylinder: %d, Sectors per track: %d", DiskGeometry.getGeometry().getCylinders(), DiskGeometry.getGeometry().getTracksPerCylinder(), DiskGeometry.getGeometry().getSectorsPerTrack());
			} 
		} while (0);
		r = /*Error: Function owner not recognized*/DeviceIoControl(hPhysical, (((true) << 16) | ((true) << 14) | ((true) << 2) | (false)), (null), 0, layout, /*Error: sizeof expression not supported yet*/, size, (null));
		if (!r || size <= 0) {
			do {
				if (!bSilent) {
					ModernizedCProgram._uprintf("Could not get layout for drive 0x%02x: %s", DriveIndex, ModernizedCProgram.WindowsErrorString());
				} 
			} while (0);
			do {
				if ((hPhysical != (HANDLE)(true)) && (hPhysical != (null))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hPhysical);
					hPhysical = (HANDLE)(true);
				} 
			} while (0);
			return 0;
		} 
		// GCC 4.9 bugs us about the fact that MS defined an expandable array as array[1]switch (DriveLayout.getPartitionStyle()) {
		case _PARTITION_STYLE.PARTITION_STYLE_MBR:
				ModernizedCProgram.SelectedDrive.setPartitionStyle(_PARTITION_STYLE.PARTITION_STYLE_MBR);
				for (i = 0; i < DriveLayout.getPartitionCount(); i++) {
					if (DriveLayout.getPartitionEntry()[i].getMbr().getPartitionType() != 0) {
						ModernizedCProgram.SelectedDrive.getNPartitions()++;
					} 
				}
				if ((DriveLayout.getPartitionEntry()[0].getMbr().getPartitionType() != 0) && (DriveLayout.getPartitionEntry()[0].getStartingOffset().getQuadPart() == -1024)) {
					do {
						if (!bSilent) {
							ModernizedCProgram._uprintf("Partition type: SFD (%s) or Unpartitioned", ModernizedCProgram.sfd_name);
						} 
					} while (0);
					super_floppy_disk = 1;
				} else {
						do {
							if (!bSilent) {
								ModernizedCProgram._uprintf("Partition type: MBR, NB Partitions: %d", ModernizedCProgram.SelectedDrive.getNPartitions());
							} 
						} while (0);
						ModernizedCProgram.SelectedDrive.setHas_mbr_uefi_marker((DriveLayout.getMbr().getSignature() == -1024));
						do {
							if (!bSilent) {
								ModernizedCProgram._uprintf("Disk ID: 0x%08X %s", DriveLayout.getMbr().getSignature(), ModernizedCProgram.SelectedDrive.getHas_mbr_uefi_marker() ? "(UEFI target)" : "");
							} 
						} while (0);
						ModernizedCProgram.AnalyzeMBR(hPhysical, "Drive", bSilent);
				} 
				for (i = 0; i < DriveLayout.getPartitionCount(); i++) {
					isUefiNtfs = 0;
					if (DriveLayout.getPartitionEntry()[i].getMbr().getPartitionType() != 0) {
						part_type = DriveLayout.getPartitionEntry()[i].getMbr().getPartitionType();
						if (part_type == -1024) {
							buf = /*Error: Function owner not recognized*/calloc(ModernizedCProgram.SelectedDrive.getSectorSize(), 1);
							if (buf != (null)) {
								if (/*Error: Function owner not recognized*/SetFilePointerEx(hPhysical, DriveLayout.getPartitionEntry()[i].getStartingOffset(), (null), 0) && /*Error: Function owner not recognized*/ReadFile(hPhysical, buf, ModernizedCProgram.SelectedDrive.getSectorSize(), size, (null))) {
									isUefiNtfs = (/*Error: Function owner not recognized*/strncmp(buf[-1024], "UEFI_NTFS", 9) == 0);
								} 
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
							} 
						} 
						do {
							if (!bSilent) {
								ModernizedCProgram._uprintf("Partition %d%s:", i + (super_floppy_disk ? 0 : 1), isUefiNtfs ? " (UEFI:NTFS)" : "");
							} 
						} while (0);
						for (j = 0; j < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); j++) {
							if (part_type == mbr_mountable[j]) {
								ret = 1;
								break;
							} 
						}
						if (i < 16) {
							ModernizedCProgram.SelectedDrive.getPartitionOffset()[i] = DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart();
							ModernizedCProgram.SelectedDrive.getPartitionSize()[i] = DriveLayout.getPartitionEntry()[i].getPartitionLength().getQuadPart();
						} 
						do {
							if (!bSilent) {
								ModernizedCProgram._uprintf("  Type: %s (0x%02x)\r\n  Size: %s (%I64i bytes)\r\n  Start Sector: %I64i, Boot: %s", ((part_type == -1024 || super_floppy_disk) && (FileSystemName[0] != 0)) ? FileSystemName : ModernizedCProgram.GetPartitionType(part_type), super_floppy_disk ? 0 : part_type, ModernizedCProgram.SizeToHumanReadable(DriveLayout.getPartitionEntry()[i].getPartitionLength().getQuadPart(), 1, 0), DriveLayout.getPartitionEntry()[i].getPartitionLength().getQuadPart(), DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart() / ModernizedCProgram.SelectedDrive.getSectorSize(), DriveLayout.getPartitionEntry()[i].getMbr().getBootIndicator() ? "Yes" : "No");
							} 
						} while (0);
						ModernizedCProgram.SelectedDrive.setFirstDataSector(((ModernizedCProgram.SelectedDrive.getFirstDataSector()) < ((DWORD)(DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart() / ModernizedCProgram.SelectedDrive.getSectorSize())) ? (ModernizedCProgram.SelectedDrive.getFirstDataSector()) : ((DWORD)(DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart() / ModernizedCProgram.SelectedDrive.getSectorSize()))));
						if ((part_type == -1024) || (isUefiNtfs)) {
							--ModernizedCProgram.SelectedDrive.getNPartitions();
						} 
						if (part_type == -1024) {
							ModernizedCProgram.SelectedDrive.setHas_protective_mbr(1);
						} 
					} 
				}
				break;
		case _PARTITION_STYLE.PARTITION_STYLE_GPT:
				ModernizedCProgram.SelectedDrive.setPartitionStyle(_PARTITION_STYLE.PARTITION_STYLE_GPT);
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Partition type: GPT, NB Partitions: %d", DriveLayout.getPartitionCount());
					} 
				} while (0);
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Disk GUID: %s", ModernizedCProgram.GuidToString(DriveLayout.getGpt().getDiskId()));
					} 
				} while (0);
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Max parts: %d, Start Offset: %I64i, Usable = %I64i bytes", DriveLayout.getGpt().getMaxPartitionCount(), DriveLayout.getGpt().getStartingUsableOffset().getQuadPart(), DriveLayout.getGpt().getUsableLength().getQuadPart());
					} 
				} while (0);
				for (i = 0; i < DriveLayout.getPartitionCount(); i++) {
					if (i < 16) {
						ModernizedCProgram.SelectedDrive.getPartitionOffset()[i] = DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart();
						ModernizedCProgram.SelectedDrive.getPartitionSize()[i] = DriveLayout.getPartitionEntry()[i].getPartitionLength().getQuadPart();
					} 
					ModernizedCProgram.SelectedDrive.getNPartitions()++;
					isUefiNtfs = (/*Error: Function owner not recognized*/wcscmp(DriveLayout.getPartitionEntry()[i].getGpt().getName(), L"UEFI:NTFS") == 0);
					do {
						if (!bSilent) {
							ModernizedCProgram._uprintf("Partition %d%s:\r\n  Type: %s\r\n  Name: '%S'", i + 1, isUefiNtfs ? " (UEFI:NTFS)" : "", ModernizedCProgram.GuidToString(DriveLayout.getPartitionEntry()[i].getGpt().getPartitionType()), DriveLayout.getPartitionEntry()[i].getGpt().getName());
						} 
					} while (0);
					do {
						if (!bSilent) {
							ModernizedCProgram._uprintf("  ID: %s\r\n  Size: %s (%I64i bytes)\r\n  Start Sector: %I64i, Attributes: 0x%016I64X", ModernizedCProgram.GuidToString(DriveLayout.getPartitionEntry()[i].getGpt().getPartitionId()), ModernizedCProgram.SizeToHumanReadable(DriveLayout.getPartitionEntry()[i].getPartitionLength().getQuadPart(), 1, 0), DriveLayout.getPartitionEntry()[i].getPartitionLength(), DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart() / ModernizedCProgram.SelectedDrive.getSectorSize(), DriveLayout.getPartitionEntry()[i].getGpt().getAttributes());
						} 
					} while (0);
					ModernizedCProgram.SelectedDrive.setFirstDataSector(((ModernizedCProgram.SelectedDrive.getFirstDataSector()) < ((DWORD)(DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart() / ModernizedCProgram.SelectedDrive.getSectorSize())) ? (ModernizedCProgram.SelectedDrive.getFirstDataSector()) : ((DWORD)(DriveLayout.getPartitionEntry()[i].getStartingOffset().getQuadPart() / ModernizedCProgram.SelectedDrive.getSectorSize()))));
					if (isUefiNtfs || (ModernizedCProgram.CompareGUID(DriveLayout.getPartitionEntry()[i].getGpt().getPartitionType(), ModernizedCProgram.PARTITION_MSFT_RESERVED_GUID)) || (ModernizedCProgram.CompareGUID(DriveLayout.getPartitionEntry()[i].getGpt().getPartitionType(), ModernizedCProgram.PARTITION_SYSTEM_GUID))) {
						--ModernizedCProgram.SelectedDrive.getNPartitions();
					} 
					if (/*Error: Function owner not recognized*/memcmp(ModernizedCProgram.PARTITION_BASIC_DATA_GUID, DriveLayout.getPartitionEntry()[i].getGpt().getPartitionType(), /*Error: Unsupported expression*/) == 0) {
						ret = 1;
					} 
				}
				break;
		default:
				ModernizedCProgram.SelectedDrive.setPartitionStyle(_PARTITION_STYLE.PARTITION_STYLE_MBR);
				do {
					if (!bSilent) {
						ModernizedCProgram._uprintf("Partition type: RAW");
					} 
				} while (0);
				break;
		}
		do {
			if ((hPhysical != (HANDLE)(true)) && (hPhysical != (null))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hPhysical);
				hPhysical = (HANDLE)(true);
			} 
		} while (0);
		return ret/*
		 * Flush file data
		 */;
	}
	private static void SetPartitionSchemeAndTargetSystem(Object only_target) {
		//                                   MBR,  GPT,  SFDBOOL[] allowed_partition_scheme = new BOOL[]{1, 1, 0};
		//                                   BIOS, UEFI, DUAL
		BOOL[] allowed_target_system = new BOOL[]{1, 1, 0};
		BOOL is_windows_to_go_selected = new BOOL();
		if (!only_target) {
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hPartitionScheme), 331, 0, 0)));
			} while (0);
		} 
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hTargetSystem), 331, 0, 0)));
		} while (0);
		ModernizedCProgram.boot_type = (int)((LRESULT)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hBootType), 336, (WPARAM)(int)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hBootType), 327, 0, 0))), 0));
		is_windows_to_go_selected = (ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path != (null)) && (((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) && (ModernizedCProgram.img_report.getHas_efi() != 0) && (ModernizedCProgram.img_report.getWininst_index() != 0)) && (((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1026)), 327, 0, 0)) == 1);
		// If no device is selected, don't populate anythingif (((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDeviceList), 327, 0, 0)) < 0) {
			return /*Error: Unsupported expression*/;
		} 
		switch (ModernizedCProgram.boot_type) {
		case boot_type.BT_IMAGE:
				if (ModernizedCProgram.image_path == (null)) {
					break;
				} 
				if (!(ModernizedCProgram.img_report.getHas_efi() != 0)) {
					allowed_partition_scheme[_PARTITION_STYLE.PARTITION_STYLE_GPT] = 0;
					allowed_target_system[1] = 0;
					break;
				} 
				if ((((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getSl_version() != 0) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024)) || ((ModernizedCProgram.img_report.getHas_grub2()) || (ModernizedCProgram.img_report.getHas_grub4dos())) || (ModernizedCProgram.img_report.getReactos_path()[0] != 0) || (ModernizedCProgram.img_report.getHas_kolibrios()))) {
					if (!(((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getUses_minint()) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024))) || ModernizedCProgram.allow_dual_uefi_bios || is_windows_to_go_selected) {
						allowed_target_system[0] = 0;
						allowed_target_system[1] = 1;
						allowed_target_system[2] = 1;
					} 
				} else {
						allowed_target_system[0] = 0;
				} 
				break;
		case boot_type.BT_GRUB4DOS:
		case boot_type.BT_UEFI_NTFS:
				allowed_target_system[0] = 0;
				break;
		case boot_type.BT_FREEDOS:
		case boot_type.BT_REACTOS:
		case boot_type.BT_GRUB2:
				allowed_partition_scheme[_PARTITION_STYLE.PARTITION_STYLE_GPT] = 0;
				allowed_target_system[1] = 0;
				break;
		case boot_type.BT_MSDOS:
		case boot_type.BT_SYSLINUX_V4:
		case boot_type.BT_SYSLINUX_V6:
		case boot_type.BT_NON_BOOTABLE:
				allowed_partition_scheme[_PARTITION_STYLE.PARTITION_STYLE_RAW] = 1;
				allowed_target_system[0] = 0;
				allowed_target_system[1] = 0;
				allowed_target_system[2] = 1;
				break;
		}
		if (!only_target) {
			if (ModernizedCProgram.SelectedDrive.getDiskSize() > 2 * -1024) {
				ModernizedCProgram.selected_pt = _PARTITION_STYLE.PARTITION_STYLE_GPT;
			} 
			int preferred_pt = ModernizedCProgram.SelectedDrive.getPartitionStyle();
			if (allowed_partition_scheme[_PARTITION_STYLE.PARTITION_STYLE_MBR]) {
				do {
					(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hPartitionScheme), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hPartitionScheme, 323, (WPARAM)0, "MBR"))), (LPARAM)(_PARTITION_STYLE.PARTITION_STYLE_MBR))));
				} while (0);
			} 
			if (allowed_partition_scheme[_PARTITION_STYLE.PARTITION_STYLE_GPT]) {
				do {
					(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hPartitionScheme), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hPartitionScheme, 323, (WPARAM)0, "GPT"))), (LPARAM)(_PARTITION_STYLE.PARTITION_STYLE_GPT))));
				} while (0);
			} 
			if (allowed_partition_scheme[_PARTITION_STYLE.PARTITION_STYLE_RAW]) {
				do {
					(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hPartitionScheme), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hPartitionScheme, 323, (WPARAM)0, ModernizedCProgram.sfd_name))), (LPARAM)(_PARTITION_STYLE.PARTITION_STYLE_RAW))));
				} while (0);
			} 
			if (ModernizedCProgram.boot_type == boot_type.BT_NON_BOOTABLE) {
				preferred_pt = (ModernizedCProgram.selected_pt >= 0) ? ModernizedCProgram.selected_pt : _PARTITION_STYLE.PARTITION_STYLE_MBR;
			}  else if (ModernizedCProgram.boot_type == boot_type.BT_UEFI_NTFS) {
				preferred_pt = (ModernizedCProgram.selected_pt >= 0) ? ModernizedCProgram.selected_pt : _PARTITION_STYLE.PARTITION_STYLE_GPT;
			}  else if ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path != (null)) && (ModernizedCProgram.img_report.getIs_iso())) {
				if ((((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getUses_minint()) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024))) && ModernizedCProgram.img_report.getHas_efi()) {
					preferred_pt = ModernizedCProgram.allow_dual_uefi_bios ? _PARTITION_STYLE.PARTITION_STYLE_MBR : ((ModernizedCProgram.selected_pt >= 0) ? ModernizedCProgram.selected_pt : _PARTITION_STYLE.PARTITION_STYLE_GPT);
				} 
				if (ModernizedCProgram.img_report.getIs_bootable_img()) {
					preferred_pt = (ModernizedCProgram.selected_pt >= 0) ? ModernizedCProgram.selected_pt : _PARTITION_STYLE.PARTITION_STYLE_MBR;
				} 
			} 
			ModernizedCProgram.SetComboEntry(ModernizedCProgram.hPartitionScheme, preferred_pt);
			ModernizedCProgram.partition_type = (int)((LRESULT)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hPartitionScheme), 336, (WPARAM)(int)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hPartitionScheme), 327, 0, 0))), 0));
		} 
		// Override partition type selection to GPT for drives larger than 2TB
		ModernizedCProgram.has_uefi_csm = 0;
		if (allowed_target_system[0] && (ModernizedCProgram.partition_type != _PARTITION_STYLE.PARTITION_STYLE_GPT)) {
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hTargetSystem), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hTargetSystem, 323, (WPARAM)0, ModernizedCProgram.lmprintf(3031)))), (LPARAM)(target_type.TT_BIOS))));
			} while (0);
			ModernizedCProgram.has_uefi_csm = 1;
		} 
		if (allowed_target_system[1] && !((ModernizedCProgram.partition_type == _PARTITION_STYLE.PARTITION_STYLE_MBR) && (ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getSl_version() != 0) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024)) || ((ModernizedCProgram.img_report.getHas_grub2()) || (ModernizedCProgram.img_report.getHas_grub4dos())) || (ModernizedCProgram.img_report.getReactos_path()[0] != 0) || (ModernizedCProgram.img_report.getHas_kolibrios())) && (ModernizedCProgram.img_report.getHas_efi() != 0))) {
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hTargetSystem), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hTargetSystem, 323, (WPARAM)0, ModernizedCProgram.lmprintf(3032)))), (LPARAM)(target_type.TT_UEFI))));
			} while (0);
		} 
		if (allowed_target_system[2] && ((ModernizedCProgram.partition_type != _PARTITION_STYLE.PARTITION_STYLE_GPT) || (ModernizedCProgram.boot_type == boot_type.BT_NON_BOOTABLE))) {
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hTargetSystem), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hTargetSystem, 323, (WPARAM)0, ModernizedCProgram.lmprintf(3033)))), (LPARAM)(target_type.TT_BIOS))));
			} while (0);
		} 
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hTargetSystem), 334, (WPARAM)(int)(false), 0)));
		} while (0);
		ModernizedCProgram.target_type = (int)((LRESULT)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hTargetSystem), 336, (WPARAM)(int)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hTargetSystem), 327, 0, 0))), 0))// Can't update a tooltip from a thread, so we send a message instead;// Can't update a tooltip from a thread, so we send a message instead
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMainDialog, user_message_type.UM_UPDATE_CSM_TOOLTIP, 0, 0);
	}
	// Toggle controls according to operation
	public static void EnableControls(Object enable, Object remove_checkboxes) {
		ModernizedCProgram.op_in_progress = !enable// The following only get disabled on format/checksum and otherwise remain enabled,;// The following only get disabled on format/checksum and otherwise remain enabled,
		/*Error: Function owner not recognized*/// even if no device or image are selected/*Error: Function owner not recognized*/// even if no device or image are selectedEnableWindow(ModernizedCProgram.hDeviceList, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hBootType, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hSelectImage, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1022), enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hAdvancedDeviceToolbar, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hAdvancedFormatToolbar, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMultiToolbar, (1024 + 1), (WPARAM)1051, (LPARAM)enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMultiToolbar, (1024 + 1), (WPARAM)1052, (LPARAM)enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMultiToolbar, (1024 + 1), (WPARAM)1053, (LPARAM)enable);
		/*Error: Function owner not recognized*/// Checksum button is enabled if an image has been selected/*Error: Function owner not recognized*/// Checksum button is enabled if an image has been selectedEnableWindow(ModernizedCProgram.hHashToolbar, enable && (ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path != (null)));
		// Toggle CLOSE/CANCEL// Toggle CLOSE/CANCELModernizedCProgram.SetDlgItemTextU(ModernizedCProgram.hMainDialog, 2, enable ? ModernizedCProgram.uppercase_close : ModernizedCProgram.uppercase_cancel);
		// Only enable the following controls if a device is active// Only enable the following controls if a device is activeenable = (((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDeviceList), 327, 0, 0)) < 0) ? 0 : enable;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1026), enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hSaveToolbar, enable);
		// Enable or disable the Start button and the other boot options// Enable or disable the Start button and the other boot optionsenable = ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path == (null))) ? 0 : enable;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hStart, enable);
		ModernizedCProgram.EnableBootOptions(enable, remove_checkboxes);
		// Finally, only enable the half-size dropdowns if we aren't dealing with a pure DD image// Finally, only enable the half-size dropdowns if we aren't dealing with a pure DD imageenable = ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path != (null)) && (!ModernizedCProgram.img_report.getIs_iso())) ? 0 : enable;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hPartitionScheme, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hTargetSystem, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 2005), enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hFileSystem, enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hClusterSize, enable);
	}
	private static Object SetDlgItemTextU(Object hDlg, int nIDDlgItem, Object lpString) {
		BOOL ret = 0;
		DWORD err = -1024;
		wchar_t wlpString = ModernizedCProgram.utf8_to_wchar(lpString);
		ret = /*Error: Function owner not recognized*/SetDlgItemTextW(hDlg, nIDDlgItem, wlpString);
		err = /*Error: Function owner not recognized*/GetLastError();
		do {
			if (wlpString != (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)(wlpString));
				wlpString = (null);
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetLastError(err);
		return ret;
	}
	private static void EnableBootOptions(Object enable, Object remove_checkboxes) {
		BOOL actual_enable_bb = new BOOL();
		BOOL actual_enable = enable;
		// If no device is selected, don't enable anythingif (((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDeviceList), 327, 0, 0)) < 0) {
			actual_enable = 0;
		} 
		if ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path == (null))) {
			actual_enable = 0;
		} 
		actual_enable_bb = actual_enable// If we are dealing with a pure DD image, remove all options except Bad Blocks check;// If we are dealing with a pure DD image, remove all options except Bad Blocks check
		if ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.img_report.getIs_bootable_img()) && (!ModernizedCProgram.img_report.getIs_iso())) {
			actual_enable = 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1026), actual_enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1027), actual_enable)// Make sure we set the range if we have persistence;// Make sure we set the range if we have persistence
		if ((ModernizedCProgram.image_path != (null)) && (((ModernizedCProgram.img_report.getSl_version() != 0) || ((ModernizedCProgram.img_report.getHas_grub2()) || (ModernizedCProgram.img_report.getHas_grub4dos()))) && !((((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getUses_minint()) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024))) || (ModernizedCProgram.img_report.getReactos_path()[0] != 0) || (ModernizedCProgram.img_report.getHas_kolibrios())))) {
			ModernizedCProgram.SetPersistenceSize();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1018), (ModernizedCProgram.persistence_size != 0) && actual_enable);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1019), (ModernizedCProgram.persistence_size != 0) && actual_enable);
		ModernizedCProgram.EnableMBRBootOptions(actual_enable, remove_checkboxes);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1007), actual_enable);
		if (ModernizedCProgram.boot_type == boot_type.BT_IMAGE) {
			if ((ModernizedCProgram.img_report.getIs_bootable_img() && (!ModernizedCProgram.img_report.getIs_iso() || ModernizedCProgram.img_report.getDisable_iso()))) {
				remove_checkboxes = 1;
			}  else if (ModernizedCProgram.image_path == (null)) {
				remove_checkboxes = 0;
			} 
		} 
		ModernizedCProgram.EnableQuickFormat(actual_enable, remove_checkboxes);
		ModernizedCProgram.EnableExtendedLabel(actual_enable, remove_checkboxes);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1009), actual_enable_bb);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1012), actual_enable_bb);
	}
	// This handles the enabling/disabling of the "Add fixes for old BIOSes" and "Use Rufus MBR" controls
	private static void EnableMBRBootOptions(Object enable, Object remove_checkboxes) {
		BOOL actual_enable_mbr = (ModernizedCProgram.boot_type > boot_type.BT_IMAGE) ? 0 : enable;
		BOOL actual_enable_fix = enable;
		UINT uXPartChecked = 0;
		if ((ModernizedCProgram.partition_type != _PARTITION_STYLE.PARTITION_STYLE_MBR) || (ModernizedCProgram.target_type != target_type.TT_BIOS) || (ModernizedCProgram.boot_type == boot_type.BT_NON_BOOTABLE) || ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (!(((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getSl_version() != 0) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024)) || ((ModernizedCProgram.img_report.getHas_grub2()) || (ModernizedCProgram.img_report.getHas_grub4dos())) || (ModernizedCProgram.img_report.getReactos_path()[0] != 0) || (ModernizedCProgram.img_report.getHas_kolibrios())) || (ModernizedCProgram.img_report.getIs_bootable_img() && (!ModernizedCProgram.img_report.getIs_iso() || ModernizedCProgram.img_report.getDisable_iso()))))) {
			actual_enable_mbr = 0;
			actual_enable_fix = 0;
		} else {
				if ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && !(((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024)) && !((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi()))) {
					actual_enable_mbr = 0;
					ModernizedCProgram.mbr_selected_by_user = 0;
				} 
				if (ModernizedCProgram.boot_type == boot_type.BT_NON_BOOTABLE) {
					actual_enable_fix = 0;
				} 
		} 
		if (remove_checkboxes) {
			if (/*Error: Function owner not recognized*/IsWindowEnabled(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1016)) && !actual_enable_mbr) {
				ModernizedCProgram.uMBRChecked = (/*Error: Function owner not recognized*/IsDlgButtonChecked(ModernizedCProgram.hMainDialog, 1016) == 1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1016, 0);
			}  else if (!/*Error: Function owner not recognized*/IsWindowEnabled(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1016)) && actual_enable_mbr) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1016, ModernizedCProgram.uMBRChecked);
			} 
			if (/*Error: Function owner not recognized*/IsWindowEnabled(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1021)) && !actual_enable_fix) {
				uXPartChecked = (/*Error: Function owner not recognized*/IsDlgButtonChecked(ModernizedCProgram.hMainDialog, 1021) == 1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1021, 0);
			}  else if (!/*Error: Function owner not recognized*/IsWindowEnabled(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1021)) && actual_enable_fix) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1021, uXPartChecked);
			} 
		} 
		// Store/Restore the checkbox states
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1021), actual_enable_fix);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1016), actual_enable_mbr);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(ModernizedCProgram.hDiskID, actual_enable_mbr);
	}
	private static void EnableQuickFormat(Object enable, Object remove_checkboxes) {
		UINT checked = new UINT();
		UINT state = 0;
		HWND hCtrl = /*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1008);
		if ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.img_report.getIs_bootable_img() && (!ModernizedCProgram.img_report.getIs_iso() || ModernizedCProgram.img_report.getDisable_iso()))) {
			enable = 0;
		} 
		// Disable/restore the quick format control depending on large FAT32 or ReFSif (((ModernizedCProgram.fs_type == fs_type.FS_FAT32) && ((ModernizedCProgram.SelectedDrive.getDiskSize() > (32 * -1024)) || (ModernizedCProgram.force_large_fat32))) || (ModernizedCProgram.fs_type == fs_type.FS_REFS)) {
			enable = 0;
			remove_checkboxes = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1008, 1);
		} 
		if (remove_checkboxes) {
			if (!enable && (state != 1)) {
				checked = (/*Error: Function owner not recognized*/IsDlgButtonChecked(ModernizedCProgram.hMainDialog, 1008) == 1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1008, 0);
				state = 1;
			}  else if (enable && !/*Error: Function owner not recognized*/IsWindowEnabled(hCtrl) && (state != 2)) {
				if (state != 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1008, checked);
				} 
				state = 2;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(hCtrl, enable);
	}
	private static void EnableExtendedLabel(Object enable, Object remove_checkboxes) {
		UINT checked = new UINT();
		UINT state = 0;
		HWND hCtrl = /*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1015);
		if ((ModernizedCProgram.fs_type >= fs_type.FS_EXT2) || ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.img_report.getIs_bootable_img() && (!ModernizedCProgram.img_report.getIs_iso() || ModernizedCProgram.img_report.getDisable_iso())))) {
			enable = 0;
		} 
		if (remove_checkboxes) {
			if (!enable && (state != 1)) {
				checked = (/*Error: Function owner not recognized*/IsDlgButtonChecked(ModernizedCProgram.hMainDialog, 1015) == 1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1015, 0);
				state = 1;
			}  else if (enable && !/*Error: Function owner not recognized*/IsWindowEnabled(hCtrl) && (state != 2)) {
				if (state != 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1015, checked);
				} 
				state = 2;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(hCtrl, enable);
	}
}
