package application;

public class InitDialogToGetTextExtentPointU {
	
	
	private static void InitDialog(Object hDlg) {
		DWORD len = new DWORD();
		HWND hCtrl = new HWND();
		HDC hDC = new HDC();
		int i;
		int lfHeight;
		byte[] tmp = new byte[128];
		Byte token;
		Byte buf;
		Byte ext;
		Byte msg;
		byte[][] resource = new byte[][]{(LPSTR)((DWORD)((WORD)(true))), (LPSTR)((DWORD)((WORD)(true)))};
		hDC = /*Error: Function owner not recognized*/GetDC(hDlg);
		lfHeight = -/*Error: Function owner not recognized*/MulDiv(9, /*Error: Function owner not recognized*/GetDeviceCaps(hDC, 90), 72);
		do {
			if ((hDC != (HANDLE)(true)) && (hDC != (null))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseDC(hDlg, hDC);
				hDC = (null);
			} 
		} while (0);
		// Quite a burden to carry around as parameters// Quite a burden to carry around as parametersModernizedCProgram.hMainDialog = hDlg;
		ModernizedCProgram.MainThreadId = /*Error: Function owner not recognized*/GetCurrentThreadId();
		ModernizedCProgram.hDeviceList = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1001);
		ModernizedCProgram.hPartitionScheme = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1004);
		ModernizedCProgram.hTargetSystem = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1017);
		ModernizedCProgram.hFileSystem = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1002);
		ModernizedCProgram.hClusterSize = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1005);
		ModernizedCProgram.hLabel = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1007);
		ModernizedCProgram.hProgress = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1010);
		ModernizedCProgram.hBootType = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1011);
		ModernizedCProgram.hSelectImage = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1014);
		ModernizedCProgram.hNBPasses = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1012);
		ModernizedCProgram.hDiskID = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1020);
		ModernizedCProgram.hStart = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1003);
		// Convert the main button labels to uppercase// Convert the main button labels to uppercaseModernizedCProgram.GetWindowTextU(ModernizedCProgram.hStart, ModernizedCProgram.uppercase_start, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.CharUpperBuffU(ModernizedCProgram.uppercase_start, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.SetWindowTextU(ModernizedCProgram.hStart, ModernizedCProgram.uppercase_start);
		ModernizedCProgram.GetWindowTextU(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 2), ModernizedCProgram.uppercase_close, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.CharUpperBuffU(ModernizedCProgram.uppercase_close, /*Error: sizeof expression not supported yet*/)// Hardcoded exception for German;// Hardcoded exception for German
		if (/*Error: Function owner not recognized*/strcmp("SCHLIEßEN", ModernizedCProgram.uppercase_close) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(ModernizedCProgram.uppercase_close, "SCHLIESSEN");
		} 
		ModernizedCProgram.SetWindowTextU(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 2), ModernizedCProgram.uppercase_close);
		ModernizedCProgram.GetWindowTextU(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1014), ModernizedCProgram.uppercase_select[0], /*Error: sizeof expression not supported yet*/);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.uppercase_select[1], ModernizedCProgram.lmprintf(3040), (((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
			((byte)ModernizedCProgram.uppercase_select[1])[(((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
		} while (0);
		ModernizedCProgram.CharUpperBuffU(ModernizedCProgram.uppercase_select[0], /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.CharUpperBuffU(ModernizedCProgram.uppercase_select[1], /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.SetWindowTextU(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1014), ModernizedCProgram.uppercase_select[0]);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.uppercase_cancel, ModernizedCProgram.lmprintf(3007), (((size_t)(((((byte)ModernizedCProgram.lmprintf(3007)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3007))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3007)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3007))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
			((byte)ModernizedCProgram.uppercase_cancel)[(((size_t)(((((byte)ModernizedCProgram.lmprintf(3007)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3007))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3007)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3007))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
		} while (0);
		ModernizedCProgram.CharUpperBuffU(ModernizedCProgram.uppercase_cancel, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.CreateSmallButtons(hDlg);
		ModernizedCProgram.GetBasicControlsWidth(hDlg);
		ModernizedCProgram.GetMainButtonsWidth(hDlg);
		ModernizedCProgram.GetHalfDropwdownWidth(hDlg);
		ModernizedCProgram.GetFullWidth(hDlg);
		// Create the font and brush for the progress messages// Create the font and brush for the progress messagesModernizedCProgram.hInfoFont = /*Error: Function owner not recognized*/CreateFontA(lfHeight, 0, 0, 0, 400, 0, 0, 0, 1, 0, 0, 2, 0, "Segoe UI");
		// Create the title bar icon// Create the title bar iconModernizedCProgram.SetTitleBarIcon(hDlg);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowTextA(hDlg, tmp, /*Error: sizeof expression not supported yet*/)// Count on Microsoft for making it more attractive to read a;// Count on Microsoft for making it more attractive to read a
		// version using strtok() than using GetFileVersionInfo()// version using strtok() than using GetFileVersionInfo()token = /*Error: Function owner not recognized*/strtok(tmp, " ");
		for (i = 0; (i < 3) && ((token = /*Error: Function owner not recognized*/strtok((null), ".")) != (null)); i++) {
			ModernizedCProgram.rufus_version[i] = (uint16_t)/*Error: Function owner not recognized*/atoi(token);
		}
		// Redefine the title to be able to add "Alpha" or "Beta"do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(tmp, /*Error: sizeof expression not supported yet*/, "Rufus %d.%d.%d%s%s", ModernizedCProgram.rufus_version[0], ModernizedCProgram.rufus_version[1], ModernizedCProgram.rufus_version[2], ModernizedCProgram.IsAlphaOrBeta(), (ModernizedCProgram.ini_file != (null)) ? "(Portable)" : "");
			(tmp)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
		} while (0);
		ModernizedCProgram.SetWindowTextU(hDlg, tmp)// Now that we have a title, we can find the handle of our Dialog;// Now that we have a title, we can find the handle of our Dialog
		ModernizedCProgram.dialog_handle = /*Error: Function owner not recognized*/FindWindowA((null), tmp);
		ModernizedCProgram._uprintf("Rufus x86 v%d.%d.%d%s%s", ModernizedCProgram.rufus_version[0], ModernizedCProgram.rufus_version[1], ModernizedCProgram.rufus_version[2], ModernizedCProgram.IsAlphaOrBeta(), (ModernizedCProgram.ini_file != (null)) ? "(Portable)" : "");
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			buf = (byte)ModernizedCProgram.GetResource(ModernizedCProgram.hMainInstance, resource[i], (LPSTR)((DWORD)((WORD)(true))), "ldlinux_sys", len, 1);
			if (buf == (null)) {
				ModernizedCProgram._uprintf("Warning: could not read embedded Syslinux v%d version", i + 4);
			} else {
					ModernizedCProgram.embedded_sl_version[i] = ModernizedCProgram.GetSyslinuxVersion(buf, len, ext);
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(ModernizedCProgram.embedded_sl_version_str[i], /*Error: sizeof expression not supported yet*/, "%d.%02d", ((uint8_t)((ModernizedCProgram.embedded_sl_version[i]) >> 8)), ((uint8_t)(ModernizedCProgram.embedded_sl_version[i])));
						(ModernizedCProgram.embedded_sl_version_str[i])[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
					} while (0);
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.embedded_sl_version_ext[i], ext, (((size_t)(((((byte)ext) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ext)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ext) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ext)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
						((byte)ModernizedCProgram.embedded_sl_version_ext[i])[(((size_t)(((((byte)ext) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ext)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ext) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ext)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
					} while (0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
			} 
		}
		ModernizedCProgram._uprintf("Windows version: %s", ModernizedCProgram.WindowsVersionStr);
		ModernizedCProgram._uprintf("Syslinux versions: %s%s, %s%s", ModernizedCProgram.embedded_sl_version_str[0], ModernizedCProgram.embedded_sl_version_ext[0], ModernizedCProgram.embedded_sl_version_str[1], ModernizedCProgram.embedded_sl_version_ext[1]);
		ModernizedCProgram._uprintf("Grub versions: %s, %s", GRUB4DOS_VERSION, GRUB2_PACKAGE_VERSION);
		ModernizedCProgram._uprintf("System locale ID: 0x%04X (%s)", /*Error: Function owner not recognized*/GetUserDefaultUILanguage(), ModernizedCProgram.GetCurrentMUI());
		do {
			if (ModernizedCProgram.ubuffer_pos) {
				ModernizedCProgram._uprintf("%s", ModernizedCProgram.ubuffer);
			} 
			ModernizedCProgram.ubuffer_pos = 0;
		} while (0);
		if (ModernizedCProgram.selected_locale.getCtrl_id() & -1024) {
			ModernizedCProgram._uprintf("NOTE: The %s translation requires an update, but the current translator hasn't submitted one. Because of this, some messages will only be displayed in English.", ModernizedCProgram.selected_locale.getTxt()[1]);
			ModernizedCProgram._uprintf("If you think you can help update this translation, please e-mail the author of this application");
		} 
		ModernizedCProgram.CreateTaskbarList();
		ModernizedCProgram.SetTaskbarProgressState(TASKBAR_PROGRESS_FLAGS.TASKBAR_NORMAL);
		/*Error: Function owner not recognized*/// Use maximum granularity for the progress bar/*Error: Function owner not recognized*/// Use maximum granularity for the progress barSendMessageA(ModernizedCProgram.hProgress, (1024 + 1), 0, (-1024 << 16) & -1024);
		// Fill up the passesfor (i = 1; i <= 5; i++) {
			msg = (i == 1) ? ModernizedCProgram.lmprintf(3034, 1) : ModernizedCProgram.lmprintf(3035, (i == 2) ? 2 : 4, (i == 2) ? "" : ModernizedCProgram.lmprintf(3087, ModernizedCProgram.flash_type[i - 3]));
			do {
				(Object)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hNBPasses, 323, (WPARAM)0, msg)));
			} while (0);
		}
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hNBPasses), 334, (WPARAM)(int)(false), 0)));
		} while (0);
		ModernizedCProgram.SetPassesTooltip();
		// Fill up the boot options dropdown// Fill up the boot options dropdownModernizedCProgram.SetBootOptions();
		// Fill up the Image Options Windows To Go dropdown// Fill up the Image Options Windows To Go dropdownhCtrl = /*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1026);
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((hCtrl), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(hCtrl, 323, (WPARAM)0, ModernizedCProgram.lmprintf(3117)))), (LPARAM)(false))));
		} while (0);
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((hCtrl), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(hCtrl, 323, (WPARAM)0, ModernizedCProgram.lmprintf(3118)))), (LPARAM)(true))));
		} while (0);
		// Fill up the MBR masqueraded disk IDs ("8 disks should be enough for anybody")do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDiskID), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hDiskID, 323, (WPARAM)0, ModernizedCProgram.lmprintf(3030, "‪0x80‬")))), (LPARAM)(true))));
		} while (0);
		for (i = 1; i <= 7; i++) {
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDiskID), 337, (WPARAM)(int)(((int)(DWORD)ModernizedCProgram.SendMessageLU(ModernizedCProgram.hDiskID, 323, (WPARAM)0, ModernizedCProgram.lmprintf(3109, -1024 + i, i + 1)))), (LPARAM)(-1024 + i))));
			} while (0);
		}
		do {
			(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDiskID), 334, (WPARAM)(int)(false), 0)));
		} while (0);
		// Create the string arrays// Create the string arraysModernizedCProgram.DriveId.StrArrayCreate((-1024 - -1024));
		ModernizedCProgram.DriveName.StrArrayCreate((-1024 - -1024));
		ModernizedCProgram.DriveLabel.StrArrayCreate((-1024 - -1024));
		ModernizedCProgram.DriveHub.StrArrayCreate((-1024 - -1024));
		ModernizedCProgram.BlockingProcess.StrArrayCreate(16);
		ModernizedCProgram.ImageList.StrArrayCreate(16)// Set various checkboxes;// Set various checkboxes
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(hDlg, 1008, 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(hDlg, 1015, 1);
		ModernizedCProgram.CreateAdditionalControls(hDlg);
		ModernizedCProgram.SetSectionHeaders(hDlg);
		ModernizedCProgram.PositionMainControls(hDlg);
		ModernizedCProgram.AdjustForLowDPI(hDlg)// Because we created the log dialog before we computed our sizes, we need to send a custom message;// Because we created the log dialog before we computed our sizes, we need to send a custom message
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hLogDialog, user_message_type.UM_RESIZE_BUTTONS, 0, 0)// Limit the amount of characters for the Persistence size field;// Limit the amount of characters for the Persistence size field
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1018), 197, 7, 0)// Create the status line and initialize the taskbar icon for progress overlay;// Create the status line and initialize the taskbar icon for progress overlay
		ModernizedCProgram.CreateStatusBar();
		// Set the various tooltips// Set the various tooltipsModernizedCProgram.CreateTooltip(ModernizedCProgram.hFileSystem, ModernizedCProgram.lmprintf(3157), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hClusterSize, ModernizedCProgram.lmprintf(3158), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hLabel, ModernizedCProgram.lmprintf(3159), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hAdvancedDeviceToolbar, ModernizedCProgram.lmprintf(3160), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hAdvancedFormatToolbar, ModernizedCProgram.lmprintf(3160), -1);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1009), ModernizedCProgram.lmprintf(3161), -1);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1008), ModernizedCProgram.lmprintf(3162), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hBootType, ModernizedCProgram.lmprintf(3164), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hSelectImage, ModernizedCProgram.lmprintf(3165), -1);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1015), ModernizedCProgram.lmprintf(3166), 10000);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1016), ModernizedCProgram.lmprintf(3167), 10000);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hDiskID, ModernizedCProgram.lmprintf(3168), 10000);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1021), ModernizedCProgram.lmprintf(3169), -1);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1022), ModernizedCProgram.lmprintf(3170), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hStart, ModernizedCProgram.lmprintf(3171), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hPartitionScheme, ModernizedCProgram.lmprintf(3163), -1);
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hTargetSystem, ModernizedCProgram.lmprintf(3150), 30000);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 2005), ModernizedCProgram.lmprintf(3151), 30000);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1026), ModernizedCProgram.lmprintf(3305), 30000);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1027), ModernizedCProgram.lmprintf(3125), 30000);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1018), ModernizedCProgram.lmprintf(3125), 30000);
		ModernizedCProgram.CreateTooltip(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1019), ModernizedCProgram.lmprintf(3126), 30000);
		// Hide as needed, since we display the advanced controls by defaultif (!ModernizedCProgram.advanced_mode_device) {
			ModernizedCProgram.ToggleAdvancedDeviceOptions(0);
		} 
		if (!ModernizedCProgram.advanced_mode_format) {
			ModernizedCProgram.ToggleAdvancedFormatOptions(0);
		} 
		ModernizedCProgram.ToggleImageOptions();
		// Process commandline parametersif (ModernizedCProgram.iso_provided) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/PostMessageA(hDlg, 273, 1014, 0);
		} 
		// Simulate a button click for image selection
		ModernizedCProgram.SetBootTypeDropdownWidth();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1022, ModernizedCProgram.enable_HDDs ? 1 : 0);
		ModernizedCProgram.PrintStatusInfo(1, 0, 0, 3210);
	}
	public static int GetWindowTextU(Object hWnd, byte[] lpString, int nMaxCount) {
		int ret = 0;
		DWORD err = -1024;
		// Handle the empty string as GetWindowTextW() returns 0 then
		if ((lpString != (null)) && (nMaxCount > 0)) {
			lpString[0] = 0;
		} 
		wchar_t wlpString = (lpString == (null)) ? (null) : (wchar_t)/*Error: Function owner not recognized*/calloc(nMaxCount, /*Error: Unsupported expression*/);
		ret = /*Error: Function owner not recognized*/GetWindowTextW(hWnd, wlpString, nMaxCount);
		err = /*Error: Function owner not recognized*/GetLastError()// coverity[var_deref_model];// coverity[var_deref_model]
		if ((ret != 0) && ((ret = /*Error: Function owner not recognized*/WideCharToMultiByte(65001, 0, wlpString, -1, lpString, nMaxCount, (null), (null))) == 0)) {
			err = /*Error: Function owner not recognized*/GetLastError();
		} 
		do {
			if (wlpString != (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)(wlpString));
				wlpString = (null);
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetLastError(err);
		return ret;
	}
	private static Object CharUpperBuffU(Byte lpString, Object len) {
		DWORD ret = new DWORD();
		wchar_t wlpString = /*Error: Function owner not recognized*/calloc(len, /*Error: Unsupported expression*/);
		if (wlpString == (null)) {
			return 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MultiByteToWideChar(65001, 0, lpString, -1, wlpString, len);
		ret = /*Error: Function owner not recognized*/CharUpperBuffW(wlpString, len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WideCharToMultiByte(65001, 0, wlpString, -1, lpString, len, (null), (null));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(wlpString);
		return ret;
	}
	// We need to create the small toolbar buttons first so that we can compute their width
	private static void CreateSmallButtons(Object hDlg) {
		HIMAGELIST hImageList = new HIMAGELIST();
		HICON hIconSave = new HICON();
		HICON hIconHash = new HICON();
		int icon_offset = 0;
		int i16 = /*Error: Function owner not recognized*/GetSystemMetrics(49);
		TBBUTTON[] tbToolbarButtons = new TBBUTTON();
		Byte buffer;
		DWORD bufsize = new DWORD();
		if (i16 >= 28) {
			icon_offset = 20;
		}  else if (i16 >= 20) {
			icon_offset = 10;
		} 
		ModernizedCProgram.hSaveToolbar = /*Error: Function owner not recognized*/CreateWindowExA(0, "ToolbarWindow32", (null), (-1024 | -1024 | -1024 | -1024 | -1024 | 8 | 64 | TBSTYLE_FLAT | 0 | TBSTYLE_AUTOSIZE | TBSTYLE_LIST | 256), 0, 0, 0, 0, ModernizedCProgram.hMainDialog, (HMENU)1045, ModernizedCProgram.hMainInstance, (null));
		hImageList = /*Error: Function owner not recognized*/ImageList_Create(i16, i16, 32 | ILC_HIGHQUALITYSCALE | ILC_MIRROR, 1, 0);
		buffer = ModernizedCProgram.GetResource(ModernizedCProgram.hMainInstance, (LPSTR)((DWORD)((WORD)(125 + icon_offset))), (LPSTR)((DWORD)((WORD)(true))), "save icon", bufsize, 0);
		hIconSave = /*Error: Function owner not recognized*/CreateIconFromResourceEx(buffer, bufsize, 1, -1024, 0, 0, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ImageList_ReplaceIcon(hImageList, -1, hIconSave);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DestroyIcon(hIconSave);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hSaveToolbar, TB_SETIMAGELIST, (WPARAM)0, (LPARAM)hImageList);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hSaveToolbar, (1024 + 30), (WPARAM)/*Error: Unsupported expression*/, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tbToolbarButtons, 0, /*Error: Unsupported expression*/);
		tbToolbarButtons[0].setIdCommand(1024);
		tbToolbarButtons[0].setFsStyle(BTNS_AUTOSIZE);
		tbToolbarButtons[0].setFsState(4);
		tbToolbarButtons[0].setIBitmap(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hSaveToolbar, (1024 + 20), (WPARAM)1, (LPARAM)tbToolbarButtons);
		ModernizedCProgram.hHashToolbar = /*Error: Function owner not recognized*/CreateWindowExA(0, "ToolbarWindow32", (null), (-1024 | -1024 | -1024 | -1024 | -1024 | 8 | 64 | TBSTYLE_FLAT | 0 | TBSTYLE_AUTOSIZE | TBSTYLE_LIST | 256), 0, 0, 0, 0, ModernizedCProgram.hMainDialog, (HMENU)1046, ModernizedCProgram.hMainInstance, (null));
		hImageList = /*Error: Function owner not recognized*/ImageList_Create(i16, i16, 32 | ILC_HIGHQUALITYSCALE | ILC_MIRROR, 1, 0);
		buffer = ModernizedCProgram.GetResource(ModernizedCProgram.hMainInstance, (LPSTR)((DWORD)((WORD)(126 + icon_offset))), (LPSTR)((DWORD)((WORD)(true))), "hash icon", bufsize, 0);
		hIconHash = /*Error: Function owner not recognized*/CreateIconFromResourceEx(buffer, bufsize, 1, -1024, 0, 0, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ImageList_ReplaceIcon(hImageList, -1, hIconHash);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DestroyIcon(hIconHash);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hHashToolbar, TB_SETIMAGELIST, (WPARAM)0, (LPARAM)hImageList);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hHashToolbar, (1024 + 30), (WPARAM)/*Error: Unsupported expression*/, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tbToolbarButtons, 0, /*Error: Unsupported expression*/);
		tbToolbarButtons[0].setIdCommand(1025);
		tbToolbarButtons[0].setFsStyle(BTNS_AUTOSIZE);
		tbToolbarButtons[0].setFsState(4);
		tbToolbarButtons[0].setIBitmap(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hHashToolbar, (1024 + 20), (WPARAM)1, (LPARAM)tbToolbarButtons);
	}
	// https://stackoverflow.com/a/20926332/1069307
	// https://msdn.microsoft.com/en-us/library/windows/desktop/bb226818.aspx
	private static void GetBasicControlsWidth(Object hDlg) {
		int checkbox_internal_spacing = 12;
		int dropdown_internal_spacing = 15;
		RECT rc = new RECT(0, 0, 4, 8);
		SIZE sz = new SIZE();
		// Compute base unit sizes since GetDialogBaseUnits() returns garbage data.
		/*Error: Function owner not recognized*/// See http://support.microsoft.com/kb/125681/*Error: Function owner not recognized*/// See http://support.microsoft.com/kb/125681MapDialogRect(hDlg, rc);
		Object generatedRight = rc.getRight();
		sz.setCx(generatedRight);
		Object generatedBottom = rc.getBottom();
		sz.setCy(generatedBottom);
		// TODO: figure out the specifics of each Windows versionif (ModernizedCProgram.nWindowsVersion == WindowsVersion.WINDOWS_10) {
			checkbox_internal_spacing = 10;
			dropdown_internal_spacing = 13;
		} 
		Object generatedCx = sz.getCx();
		// Checkbox and (blank) dropdown widths// Checkbox and (blank) dropdown widthsModernizedCProgram.cbw = /*Error: Function owner not recognized*/MulDiv(checkbox_internal_spacing, generatedCx, 4);
		ModernizedCProgram.ddw = /*Error: Function owner not recognized*/MulDiv(dropdown_internal_spacing, generatedCx, 4);
		/*Error: Function owner not recognized*/// Spacing width between half-length dropdowns (sep) as well as left margin/*Error: Function owner not recognized*/// Spacing width between half-length dropdowns (sep) as well as left marginGetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1017), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		Object generatedLeft = rc.getLeft();
		ModernizedCProgram.sw = generatedLeft;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1004), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.sw -= generatedRight;
		ModernizedCProgram.mw = generatedLeft;
		/*Error: Function owner not recognized*/// Small button width/*Error: Function owner not recognized*/// Small button widthSendMessageA(ModernizedCProgram.hSaveToolbar, TB_GETIDEALSIZE, (WPARAM)0, (LPARAM)sz);
		ModernizedCProgram.sbw = generatedCx;
		/*Error: Function owner not recognized*/// Small separator widths and button height/*Error: Function owner not recognized*/// Small separator widths and button heightGetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1024), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		Object generatedTop = rc.getTop();
		ModernizedCProgram.bh = generatedBottom - generatedTop;
		ModernizedCProgram.ssw = generatedLeft;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(ModernizedCProgram.hDeviceList, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.ssw -= generatedRight;
		/*Error: Function owner not recognized*/// CSM tooltip separator width/*Error: Function owner not recognized*/// CSM tooltip separator widthGetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 2005), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.tw = generatedLeft;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(ModernizedCProgram.hTargetSystem, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.tw -= generatedRight;
	}
	// Compute the minimum size of the main buttons
	private static void GetMainButtonsWidth(Object hDlg) {
		int i;
		RECT rc = new RECT();
		LONG style = new LONG();
		byte[] download = new byte[64];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.main_button_ids[0]), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		Object generatedRight = rc.getRight();
		Object generatedLeft = rc.getLeft();
		ModernizedCProgram.bw = generatedRight - generatedLeft;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			ModernizedCProgram.bw = ((ModernizedCProgram.bw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.main_button_ids[i]), (null)).getCx() + ((ModernizedCProgram.enable_fido && i == 0) ? (3 * ModernizedCProgram.cbw) / 2 : ModernizedCProgram.cbw)) ? (ModernizedCProgram.bw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.main_button_ids[i]), (null)).getCx() + ((ModernizedCProgram.enable_fido && i == 0) ? (3 * ModernizedCProgram.cbw) / 2 : ModernizedCProgram.cbw)));
		}// Make sure we add extra space for the SELECT split button (i == 0) if Fido is enabled
		// want to add "DOWNLOAD" into the Select split button => measure that too.// want to add "DOWNLOAD" into the Select split button => measure that too.ModernizedCProgram.bw = ((ModernizedCProgram.bw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 2), ModernizedCProgram.lmprintf(3007)).getCx() + ModernizedCProgram.cbw) ? (ModernizedCProgram.bw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 2), ModernizedCProgram.lmprintf(3007)).getCx() + ModernizedCProgram.cbw));
		if (ModernizedCProgram.enable_fido) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(download, ModernizedCProgram.lmprintf(3040), (((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
				((byte)download)[(((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3040)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3040))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
			} while (0);
			ModernizedCProgram.CharUpperBuffU(download, /*Error: sizeof expression not supported yet*/);
			ModernizedCProgram.bw = ((ModernizedCProgram.bw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1014), download).getCx() + (3 * ModernizedCProgram.cbw) / 2) ? (ModernizedCProgram.bw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1014), download).getCx() + (3 * ModernizedCProgram.cbw) / 2));
			style = /*Error: Function owner not recognized*/GetWindowLongA(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1014), (true));
			style |=  BS_SPLITBUTTON;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowLongA(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1014), (true), style);
		} 
	}
	// The following goes over the data that gets populated into the half-width dropdowns
	// (Partition scheme, Target System, Disk ID, File system, Cluster size, Nb passes)
	// to figure out the minimum width we should allocate.
	private static void GetHalfDropwdownWidth(Object hDlg) {
		RECT rc = new RECT();
		int i;
		int j;
		int msg_id;
		byte[] tmp = new byte[256];
		/*Error: Function owner not recognized*/// Initialize half width to the UI's default size/*Error: Function owner not recognized*/// Initialize half width to the UI's default sizeGetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1004), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		Object generatedRight = rc.getRight();
		Object generatedLeft = rc.getLeft();
		ModernizedCProgram.hw = generatedRight - generatedLeft - ModernizedCProgram.ddw;
		// "Super Floppy Disk" is the longuest entry in the Partition Scheme dropdown// "Super Floppy Disk" is the longuest entry in the Partition Scheme dropdownModernizedCProgram.hw = ((ModernizedCProgram.hw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1004), (byte)ModernizedCProgram.sfd_name).getCx()) ? (ModernizedCProgram.hw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1004), (byte)ModernizedCProgram.sfd_name).getCx()));
		// This is basically the same as SetClusterSizeLabels() except we're adding (Default) to each entryfor (; j < 18; ) {
			if (i > 8192) {
				i /= 1024;
				msg_id++;
			} 
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(tmp, 64, "%d %s", i, ModernizedCProgram.lmprintf(msg_id));
				(tmp)[(true) - 1] = 0;
			} while (0);
			ModernizedCProgram.hw = ((ModernizedCProgram.hw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1005), ModernizedCProgram.lmprintf(3030, tmp)).getCx()) ? (ModernizedCProgram.hw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1005), ModernizedCProgram.lmprintf(3030, tmp)).getCx()));
		}
		// We do however go over the BIOS vs UEFI entries, as some of these are translatedfor (msg_id = 3031; msg_id <= 3033; msg_id++) {
			ModernizedCProgram.hw = ((ModernizedCProgram.hw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1017), ModernizedCProgram.lmprintf(msg_id)).getCx()) ? (ModernizedCProgram.hw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1017), ModernizedCProgram.lmprintf(msg_id)).getCx()));
		}
		// Just in case, we also do the number of passesfor (i = 1; i <= 5; i++) {
			Byte msg = (i == 1) ? ModernizedCProgram.lmprintf(3034, 1) : ModernizedCProgram.lmprintf(3035, (i == 2) ? 2 : 4, (i == 2) ? "" : ModernizedCProgram.lmprintf(3087, ModernizedCProgram.flash_type[i - 3]));
			ModernizedCProgram.hw = ((ModernizedCProgram.hw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1017), msg).getCx()) ? (ModernizedCProgram.hw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1017), msg).getCx()));
		}
		// Finally, we must ensure that we'll have enough space for the 2 checkbox controls// that end up with a half dropdown// Finally, we must ensure that we'll have enough space for the 2 checkbox controls// that end up with a half dropdownModernizedCProgram.hw = ((ModernizedCProgram.hw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1016), (null)).getCx() - ModernizedCProgram.sw) ? (ModernizedCProgram.hw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1016), (null)).getCx() - ModernizedCProgram.sw));
		ModernizedCProgram.hw = ((ModernizedCProgram.hw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1009), (null)).getCx() - ModernizedCProgram.sw) ? (ModernizedCProgram.hw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1009), (null)).getCx() - ModernizedCProgram.sw));
		// Add the width of a blank dropdown// Add the width of a blank dropdownModernizedCProgram.hw += ModernizedCProgram.ddw/*
		* dbw = dialog border width
		* mw  = margin width
		* fw  = full dropdown width
		* hd  = half dropdown width
		* bsw = boot selection dropdown width
		* sw  = separator width
		* ssw = small separator width
		* bw  = button width
		* sbw = small button width
		*
		*      |                        fw                            |
		*      |          bsw          | ssw | sbw | ssw |     bw     |
		*  8 ->|<-      96       ->|<-    24    ->|<-      96       ->|<- 8
		*  mw  |        hw         |      sw      |        hw         |  mw
		*                             |     bw     | ssw |     bw     |
		*/;
	}
	private static void GetFullWidth(Object hDlg) {
		RECT rc = new RECT();
		int i;
		/*Error: Function owner not recognized*/// Get the dialog border width/*Error: Function owner not recognized*/// Get the dialog border widthGetWindowRect(hDlg, rc);
		Object generatedRight = rc.getRight();
		Object generatedLeft = rc.getLeft();
		ModernizedCProgram.dbw = generatedRight - generatedLeft;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetClientRect(hDlg, rc);
		ModernizedCProgram.dbw -= generatedRight - generatedLeft;
		/*Error: Function owner not recognized*/// Compute the minimum size needed for the Boot Selection dropdown/*Error: Function owner not recognized*/// Compute the minimum size needed for the Boot Selection dropdownGetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1011), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.bsw = ((generatedRight - generatedLeft) > (ModernizedCProgram.GetTextSize(ModernizedCProgram.hBootType, ModernizedCProgram.lmprintf(3279)).getCx() + ModernizedCProgram.ddw) ? (generatedRight - generatedLeft) : (ModernizedCProgram.GetTextSize(ModernizedCProgram.hBootType, ModernizedCProgram.lmprintf(3279)).getCx() + ModernizedCProgram.ddw));
		ModernizedCProgram.bsw = ((ModernizedCProgram.bsw) > (ModernizedCProgram.GetTextSize(ModernizedCProgram.hBootType, ModernizedCProgram.lmprintf(3281, ModernizedCProgram.lmprintf(3280))).getCx() + ModernizedCProgram.ddw) ? (ModernizedCProgram.bsw) : (ModernizedCProgram.GetTextSize(ModernizedCProgram.hBootType, ModernizedCProgram.lmprintf(3281, ModernizedCProgram.lmprintf(3280))).getCx() + ModernizedCProgram.ddw));
		/*Error: Function owner not recognized*/// Initialize full width to the UI's default size/*Error: Function owner not recognized*/// Initialize full width to the UI's default sizeGetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 2000), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.fw = generatedRight - generatedLeft - ModernizedCProgram.ddw;
		// Go through the Image Options for Windows To Go// Go through the Image Options for Windows To GoModernizedCProgram.fw = ((ModernizedCProgram.fw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1026), ModernizedCProgram.lmprintf(3117)).getCx()) ? (ModernizedCProgram.fw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1026), ModernizedCProgram.lmprintf(3117)).getCx()));
		ModernizedCProgram.fw = ((ModernizedCProgram.fw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1026), ModernizedCProgram.lmprintf(3118)).getCx()) ? (ModernizedCProgram.fw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1026), ModernizedCProgram.lmprintf(3118)).getCx()));
		// Now deal with full length checkbox linesfor (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			ModernizedCProgram.fw = ((ModernizedCProgram.fw) > (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.full_width_checkboxes[i]), (null)).getCx()) ? (ModernizedCProgram.fw) : (ModernizedCProgram.GetTextSize(/*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.full_width_checkboxes[i]), (null)).getCx()));
		}
		// All of the above is for text only, so we need to add dd space// All of the above is for text only, so we need to add dd spaceModernizedCProgram.fw += ModernizedCProgram.ddw;
		// Our min also needs to be longer than 2 half length dropdowns + spacer// Our min also needs to be longer than 2 half length dropdowns + spacerModernizedCProgram.fw = ((ModernizedCProgram.fw) > (2 * ModernizedCProgram.hw + ModernizedCProgram.sw) ? (ModernizedCProgram.fw) : (2 * ModernizedCProgram.hw + ModernizedCProgram.sw))// Now that we have our minimum full width, adjust the button width if needed;// Now that we have our minimum full width, adjust the button width if needed
		// Adjust according to min full width// Adjust according to min full widthModernizedCProgram.bw = ((ModernizedCProgram.bw) > ((ModernizedCProgram.fw - 2 * ModernizedCProgram.ssw - ModernizedCProgram.sw) / 4) ? (ModernizedCProgram.bw) : ((ModernizedCProgram.fw - 2 * ModernizedCProgram.ssw - ModernizedCProgram.sw) / 4))// Adjust according to min boot selection width;// Adjust according to min boot selection width
		ModernizedCProgram.bw = ((ModernizedCProgram.bw) > ((ModernizedCProgram.bsw + ModernizedCProgram.sbw - ModernizedCProgram.sw) / 3) ? (ModernizedCProgram.bw) : ((ModernizedCProgram.bsw + ModernizedCProgram.sbw - ModernizedCProgram.sw) / 3));
		// Adjust according to min half width// Adjust according to min half widthModernizedCProgram.bw = ((ModernizedCProgram.bw) > ((ModernizedCProgram.hw / 2) - ModernizedCProgram.ssw) ? (ModernizedCProgram.bw) : ((ModernizedCProgram.hw / 2) - ModernizedCProgram.ssw));
		// Now that our button width is set, we can adjust the rest// Now that our button width is set, we can adjust the restModernizedCProgram.hw = ((ModernizedCProgram.hw) > (2 * ModernizedCProgram.bw + ModernizedCProgram.ssw) ? (ModernizedCProgram.hw) : (2 * ModernizedCProgram.bw + ModernizedCProgram.ssw));
		ModernizedCProgram.fw = ((ModernizedCProgram.fw) > (2 * ModernizedCProgram.hw + ModernizedCProgram.sw) ? (ModernizedCProgram.fw) : (2 * ModernizedCProgram.hw + ModernizedCProgram.sw));
		ModernizedCProgram.bsw = ((ModernizedCProgram.bsw) > (ModernizedCProgram.fw - ModernizedCProgram.bw - 2 * ModernizedCProgram.ssw - ModernizedCProgram.sbw) ? (ModernizedCProgram.bsw) : (ModernizedCProgram.fw - ModernizedCProgram.bw - 2 * ModernizedCProgram.ssw - ModernizedCProgram.sbw))// TODO: Also pick a few choice messages from info/status;// TODO: Also pick a few choice messages from info/status
	}
	private static void SetTitleBarIcon(Object hDlg) {
		int i16;
		int s16;
		int s32;
		HICON hSmallIcon = new HICON();
		HICON hBigIcon = new HICON();
		// High DPI scaling// High DPI scalingi16 = /*Error: Function owner not recognized*/GetSystemMetrics(49)// Adjust icon size lookup;// Adjust icon size lookup
		s16 = i16;
		s32 = (int)(32.0 * ModernizedCProgram.fScale);
		if (s16 >= 54) {
			s16 = 64;
		}  else if (s16 >= 40) {
			s16 = 48;
		}  else if (s16 >= 28) {
			s16 = 32;
		}  else if (s16 >= 20) {
			s16 = 24;
		} 
		if (s32 >= 54) {
			s32 = 64;
		}  else if (s32 >= 40) {
			s32 = 48;
		}  else if (s32 >= 28) {
			s32 = 32;
		}  else if (s32 >= 20) {
			s32 = 24;
		} 
		// Create the title bar icon// Create the title bar iconhSmallIcon = (HICON)/*Error: Function owner not recognized*/LoadImageA(ModernizedCProgram.hMainInstance, (LPSTR)((DWORD)((WORD)(true))), 1, s16, s16, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(hDlg, 128, 0, (LPARAM)hSmallIcon);
		hBigIcon = (HICON)/*Error: Function owner not recognized*/LoadImageA(ModernizedCProgram.hMainInstance, (LPSTR)((DWORD)((WORD)(true))), 1, s32, s32, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(hDlg, 128, 1, (LPARAM)hBigIcon);
	}
	// Create a taskbar icon progressbar
	private static Object CreateTaskbarList() {
		HRESULT hr = new HRESULT();
		hr = /*Error: Function owner not recognized*/CoCreateInstance(CLSID_TaskbarList, (null), (tagCLSCTX.CLSCTX_INPROC_SERVER | tagCLSCTX.CLSCTX_INPROC_HANDLER | tagCLSCTX.CLSCTX_LOCAL_SERVER), IID_ITaskbarList3, (LPVOID)ModernizedCProgram.ptbl);
		if (((HRESULT)(hr) < 0)) {
			ModernizedCProgram._uprintf("CoCreateInstance for TaskbarList failed: error %X\n", hr);
			ModernizedCProgram.ptbl = (null);
			return 0;
		} 
		return 1;
	}
	private static Object SetTaskbarProgressState(TASKBAR_PROGRESS_FLAGS tbpFlags) {
		if (ModernizedCProgram.ptbl == (null)) {
			return 0;
		} 
		return !((HRESULT)(/*Error: Function owner not recognized*/ITaskbarList3_SetProgressState(ModernizedCProgram.ptbl, ModernizedCProgram.hMainDialog, tbpFlags)) < 0);
	}
	private static void SetPassesTooltip() {
		int[][] pattern = new int[][]{{-1024, -1024, -1024, -1024}, {-1024, -1024, -1024, -1024}, {-1024, -1024, -1024, -1024}};
		int sel = ((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hNBPasses), 327, 0, 0));
		int type = (sel < 2) ? 0 : sel - 2;
		ModernizedCProgram.CreateTooltip(ModernizedCProgram.hNBPasses, ModernizedCProgram.lmprintf(3153 + ((sel >= 2) ? 3 : sel), pattern[type][0], pattern[type][1], pattern[type][2], pattern[type][3]), -1);
	}
	private static void CreateAdditionalControls(Object hDlg) {
		HINSTANCE hDll = new HINSTANCE();
		HIMAGELIST hToolbarImageList = new HIMAGELIST();
		HICON hIcon = new HICON();
		HICON hIconUp = new HICON();
		HICON hIconDown = new HICON();
		RECT rc = new RECT();
		SIZE sz = new SIZE();
		int icon_offset = 0;
		int i;
		int i16;
		int s16;
		int toolbar_dx = -4 - ((ModernizedCProgram.fScale > 1.49) ? 1 : 0) - ((ModernizedCProgram.fScale > 1.99) ? 1 : 0);
		TBBUTTON[] tbToolbarButtons = new TBBUTTON();
		Byte buffer;
		DWORD bufsize = new DWORD();
		s16 = i16 = /*Error: Function owner not recognized*/GetSystemMetrics(49);
		if (s16 >= 54) {
			s16 = 64;
		}  else if (s16 >= 40) {
			s16 = 48;
		}  else if (s16 >= 28) {
			s16 = 32;
		}  else if (s16 >= 20) {
			s16 = 24;
		} 
		if (i16 >= 28) {
			icon_offset = 20;
		}  else if (i16 >= 20) {
			icon_offset = 10;
		} 
		// Fetch the up and down expand icons for the advanced options toolbar// Fetch the up and down expand icons for the advanced options toolbarhDll = ModernizedCProgram.GetLibraryHandle("ComDlg32");
		hIconDown = (HICON)/*Error: Function owner not recognized*/LoadImageA(hDll, (LPSTR)((DWORD)((WORD)(true))), 1, s16, s16, 0 | 32768);
		hIconUp = (HICON)/*Error: Function owner not recognized*/LoadImageA(hDll, (LPSTR)((DWORD)((WORD)(true))), 1, s16, s16, 0 | 32768)// Fallback to using Shell32 if we can't locate the icons we want in ComDlg32;// Fallback to using Shell32 if we can't locate the icons we want in ComDlg32
		hDll = ModernizedCProgram.GetLibraryHandle("Shell32");
		if (hIconUp == (null)) {
			hIconUp = (HICON)/*Error: Function owner not recognized*/LoadImageA(hDll, (LPSTR)((DWORD)((WORD)(true))), 1, s16, s16, 0 | 32768);
		} 
		if (hIconDown == (null)) {
			hIconDown = (HICON)/*Error: Function owner not recognized*/LoadImageA(hDll, (LPSTR)((DWORD)((WORD)(true))), 1, s16, s16, 0 | 32768);
		} 
		ModernizedCProgram.hUpImageList = /*Error: Function owner not recognized*/ImageList_Create(i16, i16, 32 | ILC_HIGHQUALITYSCALE, 1, 0);
		ModernizedCProgram.hDownImageList = /*Error: Function owner not recognized*/ImageList_Create(i16, i16, 32 | ILC_HIGHQUALITYSCALE, 1, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ImageList_ReplaceIcon(ModernizedCProgram.hUpImageList, -1, hIconUp);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ImageList_ReplaceIcon(ModernizedCProgram.hDownImageList, -1, hIconDown);
		/*Error: Function owner not recognized*/// Create the advanced options toolbars/*Error: Function owner not recognized*/// Create the advanced options toolbarsmemset(ModernizedCProgram.wtbtext, 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MultiByteToWideChar(65001, 0, ModernizedCProgram.lmprintf((ModernizedCProgram.advanced_mode_device) ? 3122 : 3121, ModernizedCProgram.lmprintf(3119)), -1, ModernizedCProgram.wtbtext[0], (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
		ModernizedCProgram.hAdvancedDeviceToolbar = /*Error: Function owner not recognized*/CreateWindowExA(0, "ToolbarWindow32", (null), (-1024 | -1024 | -1024 | -1024 | -1024 | 8 | 64 | TBSTYLE_FLAT | 0 | TBSTYLE_AUTOSIZE | TBSTYLE_LIST | 256), 0, 0, 0, 0, ModernizedCProgram.hMainDialog, (HMENU)1043, ModernizedCProgram.hMainInstance, (null));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedDeviceToolbar, -1024, (WPARAM)6, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tbToolbarButtons, 0, /*Error: Unsupported expression*/);
		tbToolbarButtons[0].setIdCommand(1028);
		tbToolbarButtons[0].setFsStyle(BTNS_SHOWTEXT | BTNS_AUTOSIZE);
		tbToolbarButtons[0].setFsState(4);
		tbToolbarButtons[0].setIString((INT_PTR)ModernizedCProgram.wtbtext[0]);
		tbToolbarButtons[0].setIBitmap(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedDeviceToolbar, TB_SETIMAGELIST, 0, (LPARAM)ModernizedCProgram.hUpImageList);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedDeviceToolbar, (1024 + 30), (WPARAM)/*Error: Unsupported expression*/, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedDeviceToolbar, (1024 + 20), 1, (LPARAM)tbToolbarButtons);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1028), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedDeviceToolbar, TB_GETIDEALSIZE, (WPARAM)0, (LPARAM)sz)// Yeah, so, like, TB_GETIDEALSIZE totally super doesn't work on Windows 7, for low zoom factor and when compiled with MSVC...;// Yeah, so, like, TB_GETIDEALSIZE totally super doesn't work on Windows 7, for low zoom factor and when compiled with MSVC...
		Object generatedCx = sz.getCx();
		if (generatedCx < 16) {
			sz.setCx(ModernizedCProgram.fw);
		} 
		Object generatedLeft = rc.getLeft();
		Object generatedTop = rc.getTop();
		Object generatedBottom = rc.getBottom();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(ModernizedCProgram.hAdvancedDeviceToolbar, ModernizedCProgram.hTargetSystem, generatedLeft + toolbar_dx, generatedTop, generatedCx, generatedBottom - generatedTop, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MultiByteToWideChar(65001, 0, ModernizedCProgram.lmprintf((ModernizedCProgram.advanced_mode_format) ? 3122 : 3121, ModernizedCProgram.lmprintf(3120)), -1, ModernizedCProgram.wtbtext[1], (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
		ModernizedCProgram.hAdvancedFormatToolbar = /*Error: Function owner not recognized*/CreateWindowExA(0, "ToolbarWindow32", (null), (-1024 | -1024 | -1024 | -1024 | -1024 | 8 | 64 | TBSTYLE_FLAT | 0 | TBSTYLE_AUTOSIZE | TBSTYLE_LIST | 256), 0, 0, 0, 0, ModernizedCProgram.hMainDialog, (HMENU)1044, ModernizedCProgram.hMainInstance, (null));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedFormatToolbar, -1024, (WPARAM)6, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tbToolbarButtons, 0, /*Error: Unsupported expression*/);
		tbToolbarButtons[0].setIdCommand(1029);
		tbToolbarButtons[0].setFsStyle(BTNS_SHOWTEXT | BTNS_AUTOSIZE);
		tbToolbarButtons[0].setFsState(4);
		tbToolbarButtons[0].setIString((INT_PTR)ModernizedCProgram.wtbtext[1]);
		tbToolbarButtons[0].setIBitmap(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedFormatToolbar, TB_SETIMAGELIST, (WPARAM)0, (LPARAM)ModernizedCProgram.hUpImageList);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedFormatToolbar, (1024 + 30), (WPARAM)/*Error: Unsupported expression*/, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedFormatToolbar, (1024 + 20), (WPARAM)1, (LPARAM)tbToolbarButtons);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1029), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hAdvancedFormatToolbar, TB_GETIDEALSIZE, (WPARAM)0, (LPARAM)sz);
		if (generatedCx < 16) {
			sz.setCx(ModernizedCProgram.fw);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(ModernizedCProgram.hAdvancedFormatToolbar, ModernizedCProgram.hClusterSize, generatedLeft + toolbar_dx, generatedTop, generatedCx, generatedBottom - generatedTop, 0);
		// Create the multi toolbar// Create the multi toolbarModernizedCProgram.hMultiToolbar = /*Error: Function owner not recognized*/CreateWindowExA(0, "ToolbarWindow32", (null), (-1024 | -1024 | -1024 | -1024 | -1024 | 8 | 64 | TBSTYLE_FLAT | 0 | TBSTYLE_AUTOSIZE | TBSTYLE_LIST | 256), 0, 0, 0, 0, ModernizedCProgram.hMainDialog, (HMENU)1047, ModernizedCProgram.hMainInstance, (null));
		hToolbarImageList = /*Error: Function owner not recognized*/ImageList_Create(i16, i16, 32 | ILC_HIGHQUALITYSCALE, 8, 0);
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			buffer = ModernizedCProgram.GetResource(ModernizedCProgram.hMainInstance, (LPSTR)((DWORD)((WORD)(ModernizedCProgram.multitoolbar_icons[i] + icon_offset))), (LPSTR)((DWORD)((WORD)(true))), "toolbar icon", bufsize, 0);
			hIcon = /*Error: Function owner not recognized*/CreateIconFromResourceEx(buffer, bufsize, 1, -1024, 0, 0, 0);
			if (ModernizedCProgram.right_to_left_mode && (i == 0)) {
				hIcon = ModernizedCProgram.CreateMirroredIcon(hIcon);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ImageList_ReplaceIcon(hToolbarImageList, -1, hIcon);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DestroyIcon(hIcon);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMultiToolbar, TB_SETIMAGELIST, (WPARAM)0, (LPARAM)hToolbarImageList);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMultiToolbar, (1024 + 30), (WPARAM)/*Error: Unsupported expression*/, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tbToolbarButtons, 0, /*Error: Unsupported expression*/ * (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
		tbToolbarButtons[0].setIdCommand(1051);
		tbToolbarButtons[0].setFsStyle(BTNS_BUTTON);
		tbToolbarButtons[0].setFsState(4);
		tbToolbarButtons[0].setIBitmap(0);
		tbToolbarButtons[1].setFsStyle(BTNS_AUTOSIZE);
		tbToolbarButtons[1].setFsState(16);
		tbToolbarButtons[1].setIBitmap(I_IMAGENONE);
		tbToolbarButtons[1].setIString((ModernizedCProgram.fScale < 1.5) ? (INT_PTR)L"" : (INT_PTR)L" ");
		tbToolbarButtons[2].setIdCommand(1052);
		tbToolbarButtons[2].setFsStyle(BTNS_BUTTON);
		tbToolbarButtons[2].setFsState(4);
		tbToolbarButtons[2].setIBitmap(1);
		tbToolbarButtons[3].setFsStyle(BTNS_AUTOSIZE);
		tbToolbarButtons[3].setFsState(16);
		tbToolbarButtons[3].setIBitmap(I_IMAGENONE);
		tbToolbarButtons[3].setIString((ModernizedCProgram.fScale < 1.5) ? (INT_PTR)L"" : (INT_PTR)L" ");
		tbToolbarButtons[4].setIdCommand(1053);
		tbToolbarButtons[4].setFsStyle(BTNS_BUTTON);
		tbToolbarButtons[4].setFsState(4);
		tbToolbarButtons[4].setIBitmap(2);
		tbToolbarButtons[5].setFsStyle(BTNS_AUTOSIZE);
		tbToolbarButtons[5].setFsState(16);
		tbToolbarButtons[5].setIBitmap(I_IMAGENONE);
		tbToolbarButtons[5].setIString((ModernizedCProgram.fScale < 1.5) ? (INT_PTR)L"" : (INT_PTR)L" ");
		tbToolbarButtons[6].setIdCommand(1054);
		tbToolbarButtons[6].setFsStyle(BTNS_BUTTON);
		tbToolbarButtons[6].setFsState(4);
		tbToolbarButtons[6].setIBitmap(3);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMultiToolbar, (1024 + 20), (WPARAM)7, (LPARAM)tbToolbarButtons);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMultiToolbar, (1024 + 31), 0, ((LPARAM)((LONG)(((WORD)(i16)) | (((DWORD)((WORD)(ModernizedCProgram.ddbh))) << 16)))));
		// Subclass the progress bar so that we can write on it// Subclass the progress bar so that we can write on itModernizedCProgram.progress_original_proc = (WNDPROC)/*Error: Function owner not recognized*/SetWindowLongA(ModernizedCProgram.hProgress, (true), (LONG_PTR)ProgressCallback);
	}
	private static void SetSectionHeaders(Object hDlg) {
		RECT rc = new RECT();
		HWND hCtrl = new HWND();
		SIZE sz = new SIZE();
		HFONT hf = new HFONT();
		wchar_t[] wtmp = new wchar_t();
		size_t wlen = new size_t();
		int i;
		// Set the section header fonts and resize the static controls accordingly// Set the section header fonts and resize the static controls accordinglyhf = /*Error: Function owner not recognized*/CreateFontA(-/*Error: Function owner not recognized*/MulDiv(14, /*Error: Function owner not recognized*/GetDeviceCaps(/*Error: Function owner not recognized*/GetDC(ModernizedCProgram.hMainDialog), 90), 72), 0, 0, 0, 600, 0, 0, 0, 1, 0, 0, 2, 0, "Segoe UI");
		Object generatedLeft = rc.getLeft();
		Object generatedTop = rc.getTop();
		Object generatedCx = sz.getCx();
		Object generatedCy = sz.getCy();
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendDlgItemMessageA(hDlg, ModernizedCProgram.section_control_ids[i], 48, (WPARAM)hf, 1);
			hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.section_control_ids[i]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(wtmp, 0, /*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowTextW(hCtrl, wtmp, (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
			wlen = /*Error: Function owner not recognized*/wcslen(wtmp);
			wtmp[wlen++] = (byte)L' ';
			wtmp[wlen++] = (byte)L' ';
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowTextW(hCtrl, wtmp);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
			sz = ModernizedCProgram.GetTextSize(hCtrl, (null));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, (null), generatedLeft, generatedTop, generatedCx, generatedCy, -1024);
		}
	}
	private static void PositionMainControls(Object hDlg) {
		RECT rc = new RECT();
		HWND hCtrl = new HWND();
		HWND hPrevCtrl = new HWND();
		SIZE sz = new SIZE();
		DWORD padding = new DWORD();
		int i;
		int x;
		int button_fudge = 2;
		/*Error: Function owner not recognized*/// Start by resizing the whole dialog/*Error: Function owner not recognized*/// Start by resizing the whole dialogGetWindowRect(hDlg, rc)// Don't forget to add the dialog border width, since we resize the whole dialog;// Don't forget to add the dialog border width, since we resize the whole dialog
		Object generatedBottom = rc.getBottom();
		Object generatedTop = rc.getTop();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hDlg, (null), -1, -1, ModernizedCProgram.fw + 2 * ModernizedCProgram.mw + ModernizedCProgram.dbw, generatedBottom - generatedTop, -1024 | -1024);
		// Resize the height of the label, persistence size and progress bar to the height of standard dropdowns// Resize the height of the label, persistence size and progress bar to the height of standard dropdownshCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1001);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.ddh = generatedBottom - generatedTop;
		ModernizedCProgram.ddbh = ModernizedCProgram.ddh + button_fudge;
		ModernizedCProgram.bh = ((ModernizedCProgram.bh) > (ModernizedCProgram.ddbh) ? (ModernizedCProgram.bh) : (ModernizedCProgram.ddbh));
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1007);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		Object generatedLeft = rc.getLeft();
		Object generatedRight = rc.getRight();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, ModernizedCProgram.hAdvancedFormatToolbar, generatedLeft, generatedTop, generatedRight - generatedLeft, ModernizedCProgram.ddh, -1024);
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1018);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1027), generatedLeft, generatedTop, generatedRight - generatedLeft, ModernizedCProgram.ddh, -1024);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(ModernizedCProgram.hProgress, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(ModernizedCProgram.hProgress, ModernizedCProgram.hNBPasses, generatedLeft, generatedTop, generatedRight - generatedLeft, ModernizedCProgram.ddh, -1024);
		// Get the height of a typical row// Get the height of a typical rowhCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 2015);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.rh = generatedTop;
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 2000);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.rh -= generatedTop;
		// Get the height of the advanced options// Get the height of the advanced optionshCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1022);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.advanced_device_section_height = generatedTop;
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1016);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.advanced_device_section_height = generatedBottom - ModernizedCProgram.advanced_device_section_height;
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1008);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.advanced_format_section_height = generatedTop;
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1009);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		ModernizedCProgram.advanced_format_section_height = generatedBottom - ModernizedCProgram.advanced_format_section_height;
		// Get the vertical position of the sections text// Get the vertical position of the sections texthCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 2016);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		sz = ModernizedCProgram.GetTextSize(hCtrl, (null));
		Object generatedCy = sz.getCy();
		ModernizedCProgram.section_vpos[0] = generatedTop + 2 * generatedCy / 3;
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 2017);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		sz = ModernizedCProgram.GetTextSize(hCtrl, (null));
		ModernizedCProgram.section_vpos[1] = generatedTop + 2 * generatedCy / 3;
		hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 2018);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		sz = ModernizedCProgram.GetTextSize(hCtrl, (null));
		ModernizedCProgram.section_vpos[2] = generatedTop + 2 * generatedCy / 3// Seriously, who designed this bullshit API call where you pass a SIZE;// Seriously, who designed this bullshit API call where you pass a SIZE
		/*Error: Function owner not recognized*/// struct but can only retrieve one of cx or cy at a time?!?/*Error: Function owner not recognized*/// struct but can only retrieve one of cx or cy at a time?!?SendMessageA(ModernizedCProgram.hMultiToolbar, TB_GETIDEALSIZE, (WPARAM)0, (LPARAM)sz);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(/*Error: Function owner not recognized*/GetDlgItem(hDlg, 1052), rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		Object generatedCx = sz.getCx();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(ModernizedCProgram.hMultiToolbar, ModernizedCProgram.hProgress, generatedLeft, generatedTop, generatedCx, ModernizedCProgram.ddbh, 0);
		// Reposition the main buttonsfor (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.main_button_ids[i]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
			x = ModernizedCProgram.mw + ModernizedCProgram.fw - ModernizedCProgram.bw;
			if (i % 2 == 1) {
				x -= ModernizedCProgram.bw + ModernizedCProgram.ssw;
			} 
			hPrevCtrl = /*Error: Function owner not recognized*/GetWindow(hCtrl, 3);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, hPrevCtrl, x, generatedTop, ModernizedCProgram.bw, ModernizedCProgram.ddbh, 0);
		}
		// Reposition the Save button// Reposition the Save buttonhCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1024);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hSaveToolbar, TB_GETIDEALSIZE, (WPARAM)0, (LPARAM)sz);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hSaveToolbar, (1024 + 31), 0, ((LPARAM)((LONG)(((WORD)(generatedCx)) | (((DWORD)((WORD)(ModernizedCProgram.ddbh))) << 16)))))// Microsoft, how I loathe thee!!!;// Microsoft, how I loathe thee!!!
		padding = (DWORD)/*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hSaveToolbar, TB_GETPADDING, 0, 0);
		sz.setCx(padding & -1024);
		sz.setCy(padding >> 16);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hSaveToolbar, TB_SETPADDING, 0, ((LPARAM)((LONG)(((WORD)(generatedCx + 3)) | (((DWORD)((WORD)(generatedCy + 2))) << 16)))));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(ModernizedCProgram.hSaveToolbar, ModernizedCProgram.hDeviceList, ModernizedCProgram.mw + ModernizedCProgram.fw - ModernizedCProgram.sbw, generatedTop, ModernizedCProgram.sbw, ModernizedCProgram.ddbh, 0);
		// Reposition the Hash button// Reposition the Hash buttonhCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1025);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hHashToolbar, TB_GETIDEALSIZE, (WPARAM)0, (LPARAM)sz);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hHashToolbar, (1024 + 31), 0, ((LPARAM)((LONG)(((WORD)(generatedCx)) | (((DWORD)((WORD)(ModernizedCProgram.ddbh))) << 16)))));
		padding = (DWORD)/*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hHashToolbar, TB_GETPADDING, 0, 0);
		sz.setCx(padding & -1024);
		sz.setCy(padding >> 16);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hHashToolbar, TB_SETPADDING, 0, ((LPARAM)((LONG)(((WORD)(generatedCx + 3)) | (((DWORD)((WORD)(generatedCy + 2))) << 16)))));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(ModernizedCProgram.hHashToolbar, ModernizedCProgram.hBootType, ModernizedCProgram.mw + ModernizedCProgram.bsw + ModernizedCProgram.ssw, generatedTop, ModernizedCProgram.sbw, ModernizedCProgram.ddbh, 0);
		// Reposition the Persistence slider and resize it to the boot selection width// Reposition the Persistence slider and resize it to the boot selection widthhCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1027);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1026), ModernizedCProgram.mw, generatedTop, ModernizedCProgram.bsw, generatedBottom - generatedTop, 0);
		// Reposition the Persistence Units dropdown (no need to resize)// Reposition the Persistence Units dropdown (no need to resize)hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1019);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		sz.setCx(ModernizedCProgram.fw - (generatedRight - generatedLeft));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1018), ModernizedCProgram.mw + generatedCx, generatedTop, generatedRight - generatedLeft, generatedBottom - generatedTop, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ShowWindow(hCtrl, 0);
		// Reposition and resize the Persistence Size edit// Reposition and resize the Persistence Size edithCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1018);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1027), ModernizedCProgram.mw + ModernizedCProgram.bsw + ModernizedCProgram.ssw, generatedTop, ModernizedCProgram.fw - ModernizedCProgram.bsw - ModernizedCProgram.ssw, generatedBottom - generatedTop, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnableWindow(hCtrl, 0);
		// Reposition the CSM help tip// Reposition the CSM help tiphCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 2005);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, ModernizedCProgram.hTargetSystem, ModernizedCProgram.mw + ModernizedCProgram.fw + ModernizedCProgram.tw, generatedTop, ModernizedCProgram.sbw, generatedBottom - generatedTop, 0);
		if (ModernizedCProgram.advanced_mode_device) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(ModernizedCProgram.hDeviceList, rc);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), ModernizedCProgram.hMainDialog, (POINT)rc, 2);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(ModernizedCProgram.hDeviceList, ((HWND)0), generatedLeft, generatedTop, ModernizedCProgram.fw - ModernizedCProgram.ssw - ModernizedCProgram.sbw, generatedBottom - generatedTop, 0);
		} 
		// Still need to adjust the width of the device selection dropdown
		// Resize the full width controlsfor (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.full_width_controls[i]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
			hPrevCtrl = /*Error: Function owner not recognized*/GetWindow(hCtrl, 3);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, hPrevCtrl, generatedLeft, generatedTop, ModernizedCProgram.fw, generatedBottom - generatedTop, 0);
		}
		// Resize the half drowpdownsfor (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			hCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, ModernizedCProgram.half_width_ids[i]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
			hPrevCtrl = /*Error: Function owner not recognized*/GetWindow(hCtrl, 3);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, hPrevCtrl, (i < 5) ? generatedLeft : ModernizedCProgram.mw + ModernizedCProgram.hw + ModernizedCProgram.sw, generatedTop, (i < 2) ? ModernizedCProgram.hw + ModernizedCProgram.sw : ModernizedCProgram.hw, generatedBottom - generatedTop, 0);
		}
		// Resize the boot selection dropdown// Resize the boot selection dropdownhCtrl = /*Error: Function owner not recognized*/GetDlgItem(hDlg, 1011);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(hCtrl, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), hDlg, (POINT)rc, 2);
		hPrevCtrl = /*Error: Function owner not recognized*/GetWindow(hCtrl, 3);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hCtrl, hPrevCtrl, generatedLeft, generatedTop, ModernizedCProgram.bsw, generatedBottom - generatedTop, 0);
	}
	private static void CreateStatusBar() {
		RECT rect = new RECT();
		int[] edge = new int[2];
		HFONT hFont = new HFONT();
		// Create the status bar// Create the status barModernizedCProgram.hStatus = /*Error: Function owner not recognized*/CreateWindowExA(0, "msctls_statusbar32", (null), -1024 | -1024 | SBARS_TOOLTIPS, -1024, -1024, -1024, -1024, ModernizedCProgram.hMainDialog, (HMENU)1006, ModernizedCProgram.hMainInstance, (null));
		/*Error: Function owner not recognized*/// Create 2 status areas/*Error: Function owner not recognized*/// Create 2 status areasGetClientRect(ModernizedCProgram.hMainDialog, rect);
		Object generatedRight = rect.getRight();
		edge[0] = generatedRight - (int)(58.0 * ModernizedCProgram.fScale);
		edge[1] = generatedRight;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hStatus, (1024 + 4), (WPARAM)(/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/), (LPARAM)edge);
		// Set the font// Set the fonthFont = /*Error: Function owner not recognized*/CreateFontA(-/*Error: Function owner not recognized*/MulDiv(9, /*Error: Function owner not recognized*/GetDeviceCaps(/*Error: Function owner not recognized*/GetDC(ModernizedCProgram.hMainDialog), 90), 72), 0, 0, 0, 500, 0, 0, 0, 1, 0, 0, 2, 0, "Segoe UI");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hStatus, 48, (WPARAM)hFont, 1/*
		 * Center a dialog with regards to the main application Window or the desktop
		 * See https://docs.microsoft.com/en-gb/windows/desktop/dlgbox/using-dialog-boxes#initializing-a-dialog-box
		 */);
	}
	// Toggle the Image Option dropdown (Windows To Go or persistence settings)
	private static void ToggleImageOptions() {
		BOOL has_wintogo = new BOOL();
		BOOL has_persistence = new BOOL();
		uint8_t entry_image_options = ModernizedCProgram.image_options;
		int i;
		int shift = ModernizedCProgram.rh;
		has_wintogo = ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path != (null)) && (ModernizedCProgram.img_report.getIs_iso()) && (ModernizedCProgram.nWindowsVersion >= WindowsVersion.WINDOWS_8) && ((((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) && (ModernizedCProgram.img_report.getHas_efi() != 0) && (ModernizedCProgram.img_report.getWininst_index() != 0))));
		has_persistence = ((ModernizedCProgram.boot_type == boot_type.BT_IMAGE) && (ModernizedCProgram.image_path != (null)) && (ModernizedCProgram.img_report.getIs_iso()) && ((((ModernizedCProgram.img_report.getSl_version() != 0) || ((ModernizedCProgram.img_report.getHas_grub2()) || (ModernizedCProgram.img_report.getHas_grub4dos()))) && !((((ModernizedCProgram.img_report.getHas_bootmgr()) || (ModernizedCProgram.img_report.getHas_bootmgr_efi())) || (ModernizedCProgram.img_report.getUses_minint()) || (((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024) || ((ModernizedCProgram.img_report.getWinpe() & -1024) == -1024))) || (ModernizedCProgram.img_report.getReactos_path()[0] != 0) || (ModernizedCProgram.img_report.getHas_kolibrios())))));
		((ModernizedCProgram.popcnt8(ModernizedCProgram.image_options) <= 1) ? null : /*Error: Function owner not recognized*/_assert("popcnt8(image_options) <= 1", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\ui.c", 767));
		// Keep a copy of the "Image Option" text (so that we don't have to duplicate its transation in the .loc)if (ModernizedCProgram.image_option_txt[0] == 0) {
			ModernizedCProgram.GetWindowTextU(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 2014), ModernizedCProgram.image_option_txt, /*Error: sizeof expression not supported yet*/);
		} 
		if (((has_wintogo) && !(ModernizedCProgram.image_options & -1024)) || ((!has_wintogo) && (ModernizedCProgram.image_options & -1024))) {
			ModernizedCProgram.image_options ^=  -1024;
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1026)), 334, (WPARAM)(int)(ModernizedCProgram.windows_to_go_selection), 0)));
			} while (0);
		} 
		if (((has_persistence) && !(ModernizedCProgram.image_options & -1024)) || ((!has_persistence) && (ModernizedCProgram.image_options & -1024))) {
			ModernizedCProgram.image_options ^=  -1024;
		} 
		if (((entry_image_options != 0) && (has_wintogo || has_persistence)) || ((entry_image_options == 0) && !(has_wintogo || has_persistence))) {
			shift = 0;
		} 
		if (shift != 0) {
			if (entry_image_options != 0) {
				shift = -shift;
			} 
			ModernizedCProgram.section_vpos[1] += shift;
			ModernizedCProgram.section_vpos[2] += shift;
			for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
				ModernizedCProgram.MoveCtrlY(ModernizedCProgram.hMainDialog, ModernizedCProgram.image_option_move_ids[i], shift);
			}
			ModernizedCProgram.ResizeDialogs(shift);
		} 
		// Hide or show the boot optionsfor (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ShowWindow(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, ModernizedCProgram.image_option_toggle_ids[i][0]), (ModernizedCProgram.image_options & ModernizedCProgram.image_option_toggle_ids[i][1]) ? 5 : 0);
		}
		// Set the dropdown default selectionif (ModernizedCProgram.image_options & -1024) {
			ModernizedCProgram.SetWindowTextU(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 2014), ModernizedCProgram.image_option_txt);
			do {
				(Object)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 1026)), 334, (WPARAM)(int)(ModernizedCProgram.windows_to_go_selection), 0)));
			} while (0);
		}  else if (ModernizedCProgram.image_options & -1024) {
			ModernizedCProgram.SetWindowTextU(/*Error: Function owner not recognized*/GetDlgItem(ModernizedCProgram.hMainDialog, 2014), ModernizedCProgram.lmprintf(3123));
			ModernizedCProgram.TogglePersistenceControls(ModernizedCProgram.persistence_size != 0);
			ModernizedCProgram.SetPersistenceSize();
		} 
		/*Error: Function owner not recognized*/// If you don't force a redraw here, all kind of bad UI artifacts happen.../*Error: Function owner not recognized*/// If you don't force a redraw here, all kind of bad UI artifacts happen...InvalidateRect(ModernizedCProgram.hMainDialog, (null), 1);
	}
	public static void SetBootTypeDropdownWidth() {
		HDC hDC = new HDC();
		HFONT hFont = new HFONT();
		SIZE sz = new SIZE();
		RECT rc = new RECT();
		if (ModernizedCProgram.image_path == (null)) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowRect(ModernizedCProgram.hBootType, rc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MapWindowPoints((null), ModernizedCProgram.hMainDialog, (POINT)rc, 2);
		hDC = /*Error: Function owner not recognized*/GetDC(ModernizedCProgram.hBootType);
		hFont = (HFONT)/*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hBootType, 49, 0, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SelectObject(hDC, hFont);
		ModernizedCProgram.GetTextExtentPointU(hDC, ModernizedCProgram.short_image_path, sz);
		do {
			if ((hDC != (HANDLE)(true)) && (hDC != (null))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseDC(ModernizedCProgram.hBootType, hDC);
				hDC = (null);
			} 
		} while (0);
		Object generatedCx = sz.getCx();
		Object generatedRight = rc.getRight();
		Object generatedLeft = rc.getLeft();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hBootType, 352, (WPARAM)((generatedCx + 10) > (generatedRight - generatedLeft) ? (generatedCx + 10) : (generatedRight - generatedLeft)), (LPARAM)0);
	}
	// This function differs from regular GetTextExtentPoint in that it uses a zero terminated string
	private static Object GetTextExtentPointU(Object hdc, Object lpString, Object lpSize) {
		BOOL ret = 0;
		DWORD err = -1024;
		wchar_t wlpString = ModernizedCProgram.utf8_to_wchar(lpString);
		if (wlpString == (null)) {
			return 0;
		} 
		ret = /*Error: Function owner not recognized*/GetTextExtentPoint32W(hdc, wlpString, (int)/*Error: Function owner not recognized*/wcslen(wlpString), lpSize);
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
}
