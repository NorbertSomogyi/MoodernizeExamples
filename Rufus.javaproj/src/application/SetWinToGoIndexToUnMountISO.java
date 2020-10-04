package application;

public class SetWinToGoIndexToUnMountISO {
	
	
	// to set our extraction index. Asks the user to select one if needed.
	// Returns -2 on user cancel, -1 on other error, >=0 on success.
	private static int SetWinToGoIndex() {
		Byte mounted_iso;
		Byte build;
		byte[] image = new byte[128];
		byte[] tmp_path = "";
		byte[] xml_file = "";
		byte[][] install_names = new byte[4];
		StrArray version_name = new StrArray();
		StrArray version_index = new StrArray();
		int i;
		int build_nr = 0;
		BOOL bNonStandard = 0;
		// Sanity checks// Sanity checksModernizedCProgram.wintogo_index = -1;
		ModernizedCProgram.wininst_index = 0;
		if ((ModernizedCProgram.nWindowsVersion < WindowsVersion.WINDOWS_8) || ((ModernizedCProgram.WimExtractCheck() & 4) == 0) || (((LRESULT)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 336, (WPARAM)(int)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hFileSystem), 327, 0, 0))), 0)) != fs_type.FS_NTFS)) {
			return -1;
		} 
		// If we have multiple windows install images, ask the user the one to useif (ModernizedCProgram.img_report.getWininst_index() > 1) {
			for (i = 0; i < ModernizedCProgram.img_report.getWininst_index(); i++) {
				install_names[i] = ModernizedCProgram.img_report.getWininst_path()[i][2];
			}
			ModernizedCProgram.wininst_index = ModernizedCProgram.SelectionDialog(ModernizedCProgram.lmprintf(3130), ModernizedCProgram.lmprintf(3131), install_names, ModernizedCProgram.img_report.getWininst_index());
			if (ModernizedCProgram.wininst_index < 0) {
				return -2;
			} 
			ModernizedCProgram.wininst_index--;
			if ((ModernizedCProgram.wininst_index < 0) || (ModernizedCProgram.wininst_index >= 4)) {
				ModernizedCProgram.wininst_index = 0;
			} 
		} 
		// Mount the install.wim image, that resides on the ISO// Mount the install.wim image, that resides on the ISOmounted_iso = ModernizedCProgram.MountISO(ModernizedCProgram.image_path);
		if (mounted_iso == (null)) {
			ModernizedCProgram._uprintf("Could not mount ISO for Windows To Go selection");
			return 0;
		} 
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(image, /*Error: sizeof expression not supported yet*/, "%s%s", mounted_iso, ModernizedCProgram.img_report.getWininst_path()[ModernizedCProgram.wininst_index][2]);
			(image)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
		} while (0);
		// Now take a look at the XML file in install.wim to list our versionsif ((ModernizedCProgram.GetTempPathU(/*Error: sizeof expression not supported yet*/, tmp_path) == 0) || (ModernizedCProgram.GetTempFileNameU(tmp_path, "Rufus", 0, xml_file) == 0) || (xml_file[0] == 0)) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(xml_file, ".\\RufVXml.tmp", (((size_t)(((((byte)".\\RufVXml.tmp") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\RufVXml.tmp")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)".\\RufVXml.tmp") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\RufVXml.tmp")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
				((byte)xml_file)[(((size_t)(((((byte)".\\RufVXml.tmp") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\RufVXml.tmp")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)".\\RufVXml.tmp") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\RufVXml.tmp")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
			} while (0);
		} 
		// GetTempFileName() may leave a file behind// GetTempFileName() may leave a file behindModernizedCProgram.DeleteFileU(xml_file);
		// Must use the Windows WIM API as 7z messes up the XMLif (!ModernizedCProgram.WimExtractFile_API(image, 0, "[1].xml", xml_file)) {
			ModernizedCProgram._uprintf("Could not acquire WIM index");
			;
		} 
		version_name.StrArrayCreate(16);
		version_index.StrArrayCreate(16);
		for (i = 0; version_index.StrArrayAdd(ModernizedCProgram.get_token_data_file_indexed("IMAGE INDEX", xml_file, i + 1), 0) >= 0; i++) {
			if (version_name.StrArrayAdd(ModernizedCProgram.get_token_data_file_indexed("DISPLAYNAME", xml_file, i + 1), 0) < 0) {
				bNonStandard = 1;
				if (version_name.StrArrayAdd(ModernizedCProgram.get_token_data_file_indexed("DESCRIPTION", xml_file, i + 1), 0) < 0) {
					ModernizedCProgram._uprintf("Warning: Could not find a description for image index %d", i + 1);
					version_name.StrArrayAdd("Unknown Windows Version", 1);
				} 
			} 
		}// Some people are apparently creating *unofficial* Windows ISOs that don't have DISPLAYNAME elements.// If we are parsing such an ISO, try to fall back to using DESCRIPTION. Of course, since we don't use// a formal XML parser, if an ISO mixes entries with both DISPLAYNAME and DESCRIPTION and others with// only DESCRIPTION, the version names we report will be wrong.
		if (bNonStandard) {
			ModernizedCProgram._uprintf("Warning: Nonstandard Windows image (missing <DISPLAYNAME> entries)");
		} 
		Object generatedString = version_name.getString();
		if (i > 1) {
			i = ModernizedCProgram.SelectionDialog(ModernizedCProgram.lmprintf(3291), ModernizedCProgram.lmprintf(3292), generatedString, i);
		} 
		if (i < 0) {
			ModernizedCProgram.wintogo_index = -2;
		}  else if (i == 0) {
			ModernizedCProgram.wintogo_index = 1;
		} else {
				ModernizedCProgram.wintogo_index = /*Error: Function owner not recognized*/atoi(generatedString[i - 1]);
		} 
		if (i > 0) {
			build = ModernizedCProgram.get_token_data_file_indexed("BUILD", xml_file, i);
			if (build != (null)) {
				build_nr = /*Error: Function owner not recognized*/atoi(build);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(build);
			ModernizedCProgram._uprintf("Will use '%s' (Build: %d, Index %s) for Windows To Go", generatedString[i - 1], build_nr, generatedString[i - 1]);
			if ((build_nr < 15000) && (ModernizedCProgram.SelectedDrive.getMediaType() != _MEDIA_TYPE.FixedMedia)) {
				if (ModernizedCProgram.MessageBoxExU(ModernizedCProgram.hMainDialog, ModernizedCProgram.lmprintf(3098), ModernizedCProgram.lmprintf(3190), 4 | -1024 | (ModernizedCProgram.right_to_left_mode ? -1024 | -1024 : 0), ModernizedCProgram.selected_langid) != 6) {
					ModernizedCProgram.wintogo_index = -2;
				} 
			} 
			if (build_nr == 17763) {
				notification_info more_info = new notification_info();
				more_info.setId(-1024);
				more_info.setUrl("https://github.com/pbatard/rufus/wiki/FAQ#BSODs_with_Windows_To_Go_drives_created_from_Windows_10_1809_ISOs");
				ModernizedCProgram.Notification(notification_type.MSG_INFO, (null), more_info, ModernizedCProgram.lmprintf(3128, "Windows To Go"), ModernizedCProgram.lmprintf(3133));
			} 
		} 
		// Get the build version
		version_name.StrArrayDestroy();
		version_index.StrArrayDestroy();
		ModernizedCProgram.UnMountISO();
		return ModernizedCProgram.wintogo_index;// http://technet.microsoft.com/en-ie/library/jj721578.aspx
	}
	private static Object DeleteFileU(Object lpFileName) {
		BOOL ret = 0;
		DWORD err = -1024;
		wchar_t wlpFileName = ModernizedCProgram.utf8_to_wchar(lpFileName);
		ret = /*Error: Function owner not recognized*/DeleteFileW(wlpFileName);
		err = /*Error: Function owner not recognized*/GetLastError();
		do {
			if (wlpFileName != (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)(wlpFileName));
				wlpFileName = (null);
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetLastError(err);
		return ret;
	}
	public static void UnMountISO() {
		do {
			if (ModernizedCProgram.pfDetachVirtualDisk == (null)) {
				ModernizedCProgram.pfDetachVirtualDisk = (DetachVirtualDisk_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("VirtDisk"), "DetachVirtualDisk");
			} 
			if (ModernizedCProgram.pfDetachVirtualDisk == (null)) {
				ModernizedCProgram._uprintf("Unable to locate %s() in %s.dll: %s\n", "DetachVirtualDisk", "VirtDisk", ModernizedCProgram.WindowsErrorString());
				;
			} 
		} while (0);
		if ((ModernizedCProgram.mounted_handle == (null)) || (ModernizedCProgram.mounted_handle == (HANDLE)(true))) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pfDetachVirtualDisk(ModernizedCProgram.mounted_handle, DETACH_VIRTUAL_DISK_FLAG_NONE, 0);
		do {
			if ((ModernizedCProgram.mounted_handle != (HANDLE)(true)) && (ModernizedCProgram.mounted_handle != (null))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(ModernizedCProgram.mounted_handle);
				ModernizedCProgram.mounted_handle = (HANDLE)(true);
			} 
		} while (0);
	}
}
