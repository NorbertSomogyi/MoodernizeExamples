package application;

public class SetFileSystemAndClusterSizeToSetClusterSizeLabels {
	
	
	// Populate the File System and Cluster Size dropdowns
	private static Object SetFileSystemAndClusterSize(Byte fs_name) {
		int fs_index;
		LONGLONG i = new LONGLONG();
		byte[] tmp = "";
		Byte entry;
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 331, 0, 0)));
		} while (0);
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hClusterSize), 331, 0, 0)));
		} while (0);
		ModernizedCProgram.default_fs = fs_type.FS_UNKNOWN;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.SelectedDrive.getClusterSize(), 0, /*Error: sizeof expression not supported yet*/);
		// FAT 16if (ModernizedCProgram.SelectedDrive.getDiskSize() < 4 * -1024) {
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT16].setAllowed(-1024);
			for (i = 32; i <= 4096; i <<=  1) {
				if (ModernizedCProgram.SelectedDrive.getDiskSize() < i * -1024) {
					ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT16].setDefault(16 * (ULONG)i);
					break;
				} 
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT16].getAllowed() <<=  1;
			}
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT16].getAllowed() &=  -1024;
		} 
		// > 32GB FAT32 is not supported by MS and FormatEx but is achieved using fat32format// See: http://www.ridgecrop.demon.co.uk/index.htm?fat32format.htm// < 32 MB FAT32 is not allowed by FormatEx, so we don't botherif ((ModernizedCProgram.SelectedDrive.getDiskSize() >= 32 * -1024) && (1.0 * ModernizedCProgram.SelectedDrive.getDiskSize() < 1.0 * 2.0 * -1024)) {
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT32].setAllowed(-1024);
			for (i = 32; i <= (32 * 1024); i <<=  1) {
				if (ModernizedCProgram.SelectedDrive.getDiskSize() * 1.0 < i * -1024 * 1.011) {
					ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT32].setDefault(8 * (ULONG)i);
					break;
				} 
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT32].getAllowed() <<=  1;
			}
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT32].getAllowed() &=  -1024;
			if ((ModernizedCProgram.SelectedDrive.getDiskSize() >= 256 * -1024) && (ModernizedCProgram.SelectedDrive.getDiskSize() < 32 * -1024)) {
				for (i = 8; i <= 32; i <<=  1) {
					if (ModernizedCProgram.SelectedDrive.getDiskSize() * 1.0 < i * -1024 * 1.011) {
						ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT32].setDefault(((ULONG)i / 2) * -1024);
						break;
					} 
				}
			} 
			if (ModernizedCProgram.SelectedDrive.getDiskSize() >= 32 * -1024) {
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT32].getAllowed() &=  -1024;
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_FAT32].setDefault(-1024);
			} 
		} 
		if (ModernizedCProgram.SelectedDrive.getDiskSize() < 256 * -1024) {
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_NTFS].setAllowed(-1024);
			for (i = 16; i <= 256; i <<=  1) {
				if (ModernizedCProgram.SelectedDrive.getDiskSize() < i * -1024) {
					ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_NTFS].setDefault(((ULONG)i / 4) * -1024);
					break;
				} 
			}
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXFAT].setAllowed(-1024);
			if (ModernizedCProgram.SelectedDrive.getDiskSize() < 256 * -1024) {
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXFAT].setDefault(4 * -1024);
			}  else if (ModernizedCProgram.SelectedDrive.getDiskSize() < 32 * -1024) {
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXFAT].setDefault(32 * -1024);
			} else {
					ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXFAT].setDefault(128 * -1024);
			} 
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_UDF].setAllowed(-1024);
			ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_UDF].setDefault(1);
			if (ModernizedCProgram.advanced_mode_format) {
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXT2].setAllowed(-1024);
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXT2].setDefault(1);
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXT3].setAllowed(-1024);
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_EXT3].setDefault(1);
			} 
			if (ModernizedCProgram.SelectedDrive.getDiskSize() >= 512 * -1024) {
				if ((ModernizedCProgram.nWindowsVersion >= WindowsVersion.WINDOWS_8_1) && (ModernizedCProgram.SelectedDrive.getMediaType() == _MEDIA_TYPE.FixedMedia)) {
					ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_REFS].setAllowed(-1024);
					ModernizedCProgram.SelectedDrive.getClusterSize()[fs_type.FS_REFS].setDefault(1);
				} 
			} 
		} 
		// NTFS
		// Only add the filesystems we can service// Only add the filesystems we can serviceModernizedCProgram.SetAllowedFileSystems();
		ModernizedCProgram.SetClusterSizeLabels();
		for (fs_index = 0; fs_index < fs_type.FS_MAX; fs_index++) {
			if (ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].getAllowed() != -1024) {
				ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].getAllowed() &=  ~(ModernizedCProgram.SelectedDrive.getSectorSize() - 1);
				if ((ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].getDefault() & ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].getAllowed()) == 0) {
					ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].setDefault(ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].getAllowed() & (-(LONG)ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].getAllowed()));
				} 
			} 
			if (ModernizedCProgram.SelectedDrive.getClusterSize()[fs_index].getAllowed() != 0) {
				tmp[0] = 0;
				if ((fs_index == fs_type.FS_FAT32) && ((ModernizedCProgram.SelectedDrive.getDiskSize() > (32 * -1024)) || (ModernizedCProgram.force_large_fat32))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncat(tmp, "Large ", (((size_t)(((((byte)"Large ") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Large ")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/ - ((((byte)tmp) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(tmp)) - 1)) ? ((size_t)(((((byte)"Large ") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Large ")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/ - ((((byte)tmp) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(tmp)) - 1))));
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncat(tmp, ModernizedCProgram.FileSystemLabel[fs_index], (((size_t)(((((byte)ModernizedCProgram.FileSystemLabel[fs_index]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.FileSystemLabel[fs_index])) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/ - ((((byte)tmp) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(tmp)) - 1)) ? ((size_t)(((((byte)ModernizedCProgram.FileSystemLabel[fs_index]) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.FileSystemLabel[fs_index])) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/ - ((((byte)tmp) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(tmp)) - 1))));
				if (ModernizedCProgram.default_fs == fs_type.FS_UNKNOWN) {
					entry = ModernizedCProgram.lmprintf(3030, tmp);
					ModernizedCProgram.default_fs = fs_index;
				} else {
						entry = tmp;
				} 
				if (ModernizedCProgram.allowed_filesystem[fs_index]) {
					do {
						(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hFileSystem, 323, (WPARAM)0, entry))), (LPARAM)(fs_index))));
					} while (0);
				} 
			} 
		}// Remove all cluster sizes that are below the sector size
		// re-select existing FS if it's one we know// re-select existing FS if it's one we knowModernizedCProgram.SelectedDrive.setFSType(fs_type.FS_UNKNOWN);
		if (((((byte)fs_name) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(fs_name)) != 0) {
			for (ModernizedCProgram.SelectedDrive.setFSType(fs_type.FS_MAX - 1); ModernizedCProgram.SelectedDrive.getFSType() >= 0; ModernizedCProgram.SelectedDrive.getFSType()--) {
				if (/*Error: Function owner not recognized*/strcmp(((fs_name == (null)) ? "<NULL>" : fs_name), ((ModernizedCProgram.FileSystemLabel[ModernizedCProgram.SelectedDrive.getFSType()] == (null)) ? "<NULL>" : ModernizedCProgram.FileSystemLabel[ModernizedCProgram.SelectedDrive.getFSType()])) == 0) {
					break;
				} 
			}
		} else {
				ModernizedCProgram.SelectedDrive.setFSType(ModernizedCProgram.selected_fs);
		} 
		for (i = 0; i < ((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 326, 0, 0)); i++) {
			if (((LRESULT)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 336, (WPARAM)(int)(i), 0)) == ModernizedCProgram.SelectedDrive.getFSType()) {
				do {
					(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 334, (WPARAM)(int)(i), 0)));
				} while (0);
				break;
			} 
		}
		if (i == ((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 326, 0, 0))) {
			ModernizedCProgram.SetComboEntry(ModernizedCProgram.hFileSystem, ModernizedCProgram.default_fs);
		} 
		// failed to reselect => pick default
		return ModernizedCProgram.SetClusterSizes((int)((LRESULT)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 336, (WPARAM)(int)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 327, 0, 0))), 0)));
	}
	private static void SetAllowedFileSystems() {
		int i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.allowed_filesystem, 0, /*Error: sizeof expression not supported yet*/)// Nothing is allowed if we don't have a drive;// Nothing is allowed if we don't have a drive
		if (((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDeviceList), 327, 0, 0)) < 0) {
			return /*Error: Unsupported expression*/;
		} 
		switch (ModernizedCProgram.selection_default) {
		case boot_type.BT_MSDOS:
		case boot_type.BT_SYSLINUX_V4:
		case boot_type.BT_FREEDOS:
				ModernizedCProgram.allowed_filesystem[fs_type.FS_FAT16] = 1;
				ModernizedCProgram.allowed_filesystem[fs_type.FS_FAT32] = 1;
				break;
		case boot_type.BT_IMAGE:
				ModernizedCProgram.allowed_filesystem[fs_type.FS_NTFS] = 1;
				if ((ModernizedCProgram.image_path != (null)) && (ModernizedCProgram.img_report.getHas_4GB_file())) {
					break;
				} 
				if (!(((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getUses_minint()) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024))) || (ModernizedCProgram.target_type != target_type.TT_BIOS) || ModernizedCProgram.allow_dual_uefi_bios) {
					if (!(((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) && (ModernizedCProgram.img_report.getHas_efi() != 0) && (ModernizedCProgram.img_report.getWininst_index() != 0)) || (((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1026)), 327, 0, 0)) != 1)) {
						ModernizedCProgram.allowed_filesystem[fs_type.FS_FAT16] = 1;
						ModernizedCProgram.allowed_filesystem[fs_type.FS_FAT32] = 1;
					} 
				} 
				break;
		case boot_type.BT_GRUB4DOS:
				ModernizedCProgram.allowed_filesystem[fs_type.FS_NTFS] = 1;
		case boot_type.BT_REACTOS:
		case boot_type.BT_NON_BOOTABLE:
				for (i = 0; i < fs_type.FS_MAX; i++) {
					ModernizedCProgram.allowed_filesystem[i] = 1;
				}
				break;
		case boot_type.BT_UEFI_NTFS:
				ModernizedCProgram.allowed_filesystem[fs_type.FS_NTFS] = 1;
				break;
		case boot_type.BT_SYSLINUX_V6:
		case boot_type.BT_GRUB2:
				ModernizedCProgram.allowed_filesystem[fs_type.FS_FAT16] = 1;
				ModernizedCProgram.allowed_filesystem[fs_type.FS_FAT32] = 1;
				break;
		}
		// Reset disk ID to 0x80 if Rufus MBR is usedif (ModernizedCProgram.selection_default != boot_type.BT_IMAGE) {
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDiskID), 334, (WPARAM)(int)(false), 0)));
			} while (0);
		} 
	}
	// For LGP set/restore
	// file system, boot type, partition type, target type
	// Number of steps for each FS for FCC_STRUCTURE_PROGRESS
	// TODO: Remember to update copyright year in stdlg's AboutCallback() WM_INITDIALOG,
	// localization_data.sh and the .rc when the year changes!
	// Fill in the cluster size names
	private static void SetClusterSizeLabels() {
		int i;
		int j;
		int msg_id;
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(ModernizedCProgram.ClusterSizeLabel[0], 64, ModernizedCProgram.lmprintf(3029));
			(ModernizedCProgram.ClusterSizeLabel[0])[(true) - 1] = 0;
		} while (0);
		for (; j < 18; ) {
			if (i > 8192) {
				i /= 1024;
				msg_id++;
			} 
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(ModernizedCProgram.ClusterSizeLabel[j], 64, "%d %s", i, ModernizedCProgram.lmprintf(msg_id));
				(ModernizedCProgram.ClusterSizeLabel[j])[(true) - 1] = 0;
			} while (0);
		}
	}
}
