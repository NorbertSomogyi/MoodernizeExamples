package application;

public class WinMainToClrAlertPromptHook {
	
	
	private static int WinMain(Object hInstance, Object hPrevInstance, Object lpCmdLine, int nCmdShow) {
		Byte rufus_loc = "rufus.loc";
		wchar_t[] kernel32_path = new wchar_t();
		int i;
		int opt;
		int option_index = 0;
		int argc = 0;
		int si = 0;
		int lcid = /*Error: Function owner not recognized*/GetUserDefaultUILanguage();
		int wait_for_mutex = 0;
		FILE fd = new FILE();
		BOOL attached_console = 0;
		BOOL external_loc_file = 0;
		BOOL lgp_set = 0;
		BOOL automount = 1;
		BOOL disable_hogger = 0;
		BOOL previous_enable_HDDs = 0;
		BOOL vc = ModernizedCProgram.IsRegistryNode(((HKEY)-1024), ModernizedCProgram.vs_reg);
		BOOL alt_pressed = 0;
		BOOL alt_command = 0;
		BYTE loc_data = new BYTE();
		DWORD loc_size = new DWORD();
		DWORD u = new DWORD();
		DWORD size = /*Error: sizeof expression not supported yet*/;
		byte[] tmp_path = "";
		byte[] loc_file = "";
		byte[] ini_path = "";
		byte[] ini_flags = "rb";
		byte[] tmp;
		Byte locale_name = (null);
		byte[][] argv = (null);
		wchar_t wenv = new wchar_t();
		wchar_t[][] wargv = new wchar_t();
		int __wgetmainargs_t;
		__wgetmainargs_t pf__wgetmainargs = (null);
		BOOL SetDefaultDllDirectories_t = new BOOL();
		SetDefaultDllDirectories_t pfSetDefaultDllDirectories = (null);
		HANDLE mutex = (null);
		HANDLE hogmutex = (null);
		HANDLE hFile = (null);
		HWND hDlg = (null);
		HDC hDC = new HDC();
		MSG msg = new MSG();
		option[] long_options = new option[]{new option("extra-devs", .no_argument, (null), (byte)'x'), new option("gui", .no_argument, (null), (byte)'g'), new option("help", .no_argument, (null), (byte)'h'), new option("iso", .required_argument, (null), (byte)'i'), new option("locale", .required_argument, (null), (byte)'l'), new option("filesystem", .required_argument, (null), (byte)'f'), new option("wait", .required_argument, (null), (byte)'w'), new option(0, 0, (null), 0)};
		/*Error: Function owner not recognized*/// Disable loading system DLLs from the current directory (sideloading mitigation)// PS: You know that official MSDN documentation for SetDllDirectory() that explicitly// indicates that "If the parameter is an empty string (""), the call removes the current// directory from the default DLL search order"? Yeah, that doesn't work. At all.// Still, we invoke it, for platforms where the following call might actually work.../*Error: Function owner not recognized*/// Disable loading system DLLs from the current directory (sideloading mitigation)// PS: You know that official MSDN documentation for SetDllDirectory() that explicitly// indicates that "If the parameter is an empty string (""), the call removes the current// directory from the default DLL search order"? Yeah, that doesn't work. At all.// Still, we invoke it, for platforms where the following call might actually work...SetDllDirectoryA("")// Also, even if you use SetDefaultDllDirectories(LOAD_LIBRARY_SEARCH_SYSTEM32), you're// still going to be brought down if you link to wininet.lib or dwmapi.lib, as these two// perform their DLL invocations before you've had a chance to execute anything.// Of course, this is not something that security "researchers" will bother looking into;// Also, even if you use SetDefaultDllDirectories(LOAD_LIBRARY_SEARCH_SYSTEM32), you're// still going to be brought down if you link to wininet.lib or dwmapi.lib, as these two// perform their DLL invocations before you've had a chance to execute anything.// Of course, this is not something that security "researchers" will bother looking into
		/*Error: Function owner not recognized*/// to try to help fellow developers, when they can get an ego fix by simply throwing// generic URLs around and deliberately refusing to practice *responsible disclosure*...// Finally, we need to perform the whole gymkhana below, where we can't call on// SetDefaultDllDirectories() directly, because Windows 7 doesn't have the API exposed./*Error: Function owner not recognized*/// to try to help fellow developers, when they can get an ego fix by simply throwing// generic URLs around and deliberately refusing to practice *responsible disclosure*...// Finally, we need to perform the whole gymkhana below, where we can't call on// SetDefaultDllDirectories() directly, because Windows 7 doesn't have the API exposed.GetSystemDirectoryW(kernel32_path, (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wcsncat(kernel32_path, L"\\kernel32.dll", (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/) - /*Error: Function owner not recognized*/wcslen(kernel32_path) - 1)// NB: Because kernel32 should already be loaded, what we do above to ensure that we// (re)pick the system one is mostly unnecessary. But since for a hammer everything is a;// NB: Because kernel32 should already be loaded, what we do above to ensure that we// (re)pick the system one is mostly unnecessary. But since for a hammer everything is a
		// nail... Also, no, Coverity, we never need to care about freeing kernel32 as a library.// coverity[leaked_storage]// nail... Also, no, Coverity, we never need to care about freeing kernel32 as a library.// coverity[leaked_storage]pfSetDefaultDllDirectories = (SetDefaultDllDirectories_t)/*Error: Function owner not recognized*/GetProcAddress(/*Error: Function owner not recognized*/LoadLibraryW(kernel32_path), "SetDefaultDllDirectories");
		if (pfSetDefaultDllDirectories != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pfSetDefaultDllDirectories(LOAD_LIBRARY_SEARCH_SYSTEM32);
		} 
		ModernizedCProgram._uprintf("*** Rufus init ***\n");
		ModernizedCProgram.its_a_me_mario = /*Error: Function owner not recognized*/GetUserNameA((byte)(uintptr_t)u, size) && (u == 7104878)// coverity[pointless_string_compare];// coverity[pointless_string_compare]
		ModernizedCProgram.is_x86_32 = (/*Error: Function owner not recognized*/strcmp("x86", "x86") == 0);
		// We have to process the arguments before we acquire the lock and process the localeif (pf__wgetmainargs == (null)) {
			pf__wgetmainargs = (__wgetmainargs_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("Msvcrt"), "__wgetmainargs");
		} 
		if (pf__wgetmainargs != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pf__wgetmainargs(argc, wargv, wenv, 1, si);
			argv = (byte)/*Error: Function owner not recognized*/calloc(argc, /*Error: Unsupported expression*/);
			if (argv != (null)) {
				for (i = 0; i < argc; i++) {
					argv[i] = ModernizedCProgram.wchar_to_utf8(wargv[i]);
					if (/*Error: Function owner not recognized*/strcmp(argv[i], "/W") == 0) {
						wait_for_mutex = 150;
					} 
					if ((/*Error: Function owner not recognized*/strcmp(argv[i], "-g") == 0) || (/*Error: Function owner not recognized*/strcmp(argv[i], "--gui") == 0)) {
						disable_hogger = 1;
					} 
				}
				tmp = argv[0][/*Error: Function owner not recognized*/strlen(argv[0]) - 1];
				while ((((uintptr_t)tmp) > ((uintptr_t)argv[0])) && (tmp != (byte)'\\')) {
					tmp--;
				}
				if ((/*Error: Function owner not recognized*/strchr(tmp, (byte)'p') != (null)) || ((/*Error: Function owner not recognized*/strchr(tmp, (byte)'P') != (null)) && (/*Error: Function owner not recognized*/strchr(tmp, (byte)'P')[1] != (byte)'H'))) {
					ini_flags[0] = (byte)'a';
				} 
				if (!disable_hogger) {
					if (/*Error: Function owner not recognized*/AttachConsole(ATTACH_PARENT_PROCESS) != 0) {
						attached_console = 1;
						do {
							(Object)(/*Error: Function owner not recognized*/freopen("CONIN$", "r", (_iob[0])));
						} while (0);
						do {
							(Object)(/*Error: Function owner not recognized*/freopen("CONOUT$", "w", (_iob[1])));
						} while (0);
						do {
							(Object)(/*Error: Function owner not recognized*/freopen("CONOUT$", "w", (_iob[2])));
						} while (0);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_flushall();
						hogmutex = ModernizedCProgram.SetHogger();
					} 
				} 
				while ((opt = ModernizedCProgram.getopt_long(argc, argv, "?xghf:i:w:l:", long_options, option_index)) != (true)) {
					switch (opt) {
					case (byte)'h':
					case (byte)'?':
					case (byte)'f':
							if (/*Error: Function owner not recognized*/isdigit((byte)(ModernizedCProgram.optarg[0]))) {
								ModernizedCProgram.preselected_fs = (int)/*Error: Function owner not recognized*/strtol(ModernizedCProgram.optarg, (null), 0);
							} else {
									for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
										if (/*Error: Function owner not recognized*/_stricmp(((ModernizedCProgram.optarg == (null)) ? "<NULL>" : ModernizedCProgram.optarg), ((ModernizedCProgram.FileSystemLabel[i] == (null)) ? "<NULL>" : ModernizedCProgram.FileSystemLabel[i])) == 0) {
											ModernizedCProgram.preselected_fs = i;
											break;
										} 
									}
							} 
							if ((ModernizedCProgram.preselected_fs < fs_type.FS_UNKNOWN) || (ModernizedCProgram.preselected_fs >= fs_type.FS_MAX)) {
								ModernizedCProgram.preselected_fs = fs_type.FS_UNKNOWN;
							} 
							ModernizedCProgram.selected_fs = ModernizedCProgram.preselected_fs;
							break;
					case (byte)'g':
							break;
					case (byte)'i':
							if (/*Error: Function owner not recognized*/_access(ModernizedCProgram.optarg, 0) != -1) {
								do {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.image_path);
									ModernizedCProgram.image_path = (null);
								} while (0);
								ModernizedCProgram.image_path = /*Error: Function owner not recognized*/_strdup(ModernizedCProgram.optarg);
								ModernizedCProgram.iso_provided = 1;
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Could not find ISO image '%s'\n", ModernizedCProgram.optarg);
							} 
							break;
					case (byte)'w':
							wait_for_mutex = /*Error: Function owner not recognized*/atoi(ModernizedCProgram.optarg);
							break;
					case (byte)'x':
							ModernizedCProgram.enable_HDDs = 1;
							break;
					case (byte)'l':
							if (/*Error: Function owner not recognized*/isdigit((byte)(ModernizedCProgram.optarg[0]))) {
								lcid = (int)/*Error: Function owner not recognized*/strtol(ModernizedCProgram.optarg, (null), 0);
							} else {
									do {
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)locale_name);
										locale_name = (null);
									} while (0);
									locale_name = /*Error: Function owner not recognized*/_strdup(ModernizedCProgram.optarg);
							} 
							break;
					default:
							ModernizedCProgram.PrintUsage(argv[0]);
							;
					}
				}
			} 
		} else {
				ModernizedCProgram._uprintf("Could not access UTF-16 args");
		} 
		// Retrieve various app & system directoriesif (ModernizedCProgram.GetCurrentDirectoryU(/*Error: sizeof expression not supported yet*/, ModernizedCProgram.app_dir) == 0) {
			ModernizedCProgram._uprintf("Could not get current directory: %s", ModernizedCProgram.WindowsErrorString());
			ModernizedCProgram.app_dir[0] = 0;
		} 
		if (ModernizedCProgram.GetSystemDirectoryU(ModernizedCProgram.system_dir, /*Error: sizeof expression not supported yet*/) == 0) {
			ModernizedCProgram._uprintf("Could not get system directory: %s", ModernizedCProgram.WindowsErrorString());
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.system_dir, "C:\\Windows\\System32", (((size_t)(((((byte)"C:\\Windows\\System32") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows\\System32")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"C:\\Windows\\System32") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows\\System32")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
				((byte)ModernizedCProgram.system_dir)[(((size_t)(((((byte)"C:\\Windows\\System32") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows\\System32")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"C:\\Windows\\System32") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows\\System32")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
			} while (0);
		} 
		if (ModernizedCProgram.GetTempPathU(/*Error: sizeof expression not supported yet*/, ModernizedCProgram.temp_dir) == 0) {
			ModernizedCProgram._uprintf("Could not get temp directory: %s", ModernizedCProgram.WindowsErrorString());
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.temp_dir, ".\\", (((size_t)(((((byte)".\\") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)".\\") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
				((byte)ModernizedCProgram.temp_dir)[(((size_t)(((((byte)".\\") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)".\\") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(".\\")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
			} while (0);
		} 
		// By default (64bit app running on 64 bit OS or 32 bit app running on 32 bit OS)// Sysnative and System32 are the samedo {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.sysnative_dir, ModernizedCProgram.system_dir, (((size_t)(((((byte)ModernizedCProgram.system_dir) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.system_dir)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.system_dir) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.system_dir)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
			((byte)ModernizedCProgram.sysnative_dir)[(((size_t)(((((byte)ModernizedCProgram.system_dir) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.system_dir)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.system_dir) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.system_dir)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
		} while (0);// But if the app is 32 bit and the OS is 64 bit, Sysnative must differ from System32
		if (ModernizedCProgram.is_x64()) {
			if (ModernizedCProgram.GetSystemWindowsDirectoryU(ModernizedCProgram.sysnative_dir, /*Error: sizeof expression not supported yet*/) == 0) {
				ModernizedCProgram._uprintf("Could not get Windows directory: %s", ModernizedCProgram.WindowsErrorString());
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.sysnative_dir, "C:\\Windows", (((size_t)(((((byte)"C:\\Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"C:\\Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
					((byte)ModernizedCProgram.sysnative_dir)[(((size_t)(((((byte)"C:\\Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"C:\\Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("C:\\Windows")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
				} while (0);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncat(ModernizedCProgram.sysnative_dir, "\\Sysnative", (((size_t)(((((byte)"\\Sysnative") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("\\Sysnative")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/ - ((((byte)ModernizedCProgram.sysnative_dir) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.sysnative_dir)) - 1)) ? ((size_t)(((((byte)"\\Sysnative") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("\\Sysnative")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/ - ((((byte)ModernizedCProgram.sysnative_dir) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.sysnative_dir)) - 1))));
		} 
		// Look for a .ini file in the current app directorydo {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(ini_path, /*Error: sizeof expression not supported yet*/, "%s\\rufus.ini", ModernizedCProgram.app_dir);
			(ini_path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
		} while (0);
		// Will create the file if portable mode is requested// Will create the file if portable mode is requestedfd = ModernizedCProgram.fopenU(ini_path, ini_flags);
		vc |=  (/*Error: Function owner not recognized*/strcmp(((ModernizedCProgram.GetSignatureName((null), (null)) == (null)) ? "<NULL>" : ModernizedCProgram.GetSignatureName((null), (null))), ((ModernizedCProgram.cert_name[0] == (null)) ? "<NULL>" : ModernizedCProgram.cert_name[0])) == 0);
		if (fd != (null)) {
			ModernizedCProgram.ini_file = ini_path;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fd);
		} 
		ModernizedCProgram._uprintf("Will use settings from %s", (ModernizedCProgram.ini_file != (null)) ? "INI file" : "registry");
		// Use the locale specified by the settings, if any// Use the locale specified by the settings, if anytmp = ModernizedCProgram.ReadSettingStr("Locale");
		if (tmp[0] != 0) {
			locale_name = /*Error: Function owner not recognized*/_strdup(tmp);
			ModernizedCProgram._uprintf("found locale '%s'", locale_name);
		} 
		// Restore user-saved settings// Restore user-saved settingsModernizedCProgram.advanced_mode_device = ModernizedCProgram.ReadSettingBool("ShowAdvancedDriveProperties");
		ModernizedCProgram.advanced_mode_format = ModernizedCProgram.ReadSettingBool("ShowAdvancedFormatOptions");
		ModernizedCProgram.preserve_timestamps = ModernizedCProgram.ReadSettingBool("PreserveTimestamps");
		ModernizedCProgram.use_fake_units = !ModernizedCProgram.ReadSettingBool("UseProperSizeUnits");
		ModernizedCProgram.use_vds = ModernizedCProgram.ReadSettingBool("UseVds");
		ModernizedCProgram.usb_debug = ModernizedCProgram.ReadSettingBool("EnableUsbDebug");
		ModernizedCProgram.detect_fakes = !ModernizedCProgram.ReadSettingBool("DisableFakeDrivesCheck");
		ModernizedCProgram.allow_dual_uefi_bios = ModernizedCProgram.ReadSettingBool("EnableWindowsDualUefiBiosMode");
		ModernizedCProgram.force_large_fat32 = ModernizedCProgram.ReadSettingBool("ForceLargeFat32Formatting");
		ModernizedCProgram.enable_vmdk = ModernizedCProgram.ReadSettingBool("EnableVmdkDetection");
		ModernizedCProgram.enable_file_indexing = ModernizedCProgram.ReadSettingBool("EnableFileIndexing");
		// Initialize the global scaling, in case we need it before we initialize the dialog// Initialize the global scaling, in case we need it before we initialize the dialoghDC = /*Error: Function owner not recognized*/GetDC((null));
		ModernizedCProgram.fScale = /*Error: Function owner not recognized*/GetDeviceCaps(hDC, 88) / 96.0;
		do {
			if ((hDC != (HANDLE)(true)) && (hDC != (null))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseDC((null), hDC);
				hDC = (null);
			} 
		} while (0);
		// Init localization// Init localizationModernizedCProgram._init_localization(0);
		// Seek for a loc file in the current directoryif (ModernizedCProgram.GetFileAttributesU(rufus_loc) == ((DWORD)-1)) {
			ModernizedCProgram._uprintf("loc file not found in current directory - embedded one will be used");
			loc_data = (BYTE)ModernizedCProgram.GetResource(ModernizedCProgram.hMainInstance, (LPSTR)((DWORD)((WORD)(true))), (LPSTR)((DWORD)((WORD)(true))), "embedded.loc", loc_size, 0);
			if ((ModernizedCProgram.GetTempFileNameU(ModernizedCProgram.temp_dir, "Rufus", 0, loc_file) == 0) || (loc_file[0] == 0)) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(loc_file, rufus_loc, (((size_t)(((((byte)rufus_loc) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(rufus_loc)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)rufus_loc) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(rufus_loc)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
					((byte)loc_file)[(((size_t)(((((byte)rufus_loc) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(rufus_loc)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)rufus_loc) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(rufus_loc)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
				} while (0);
			} 
			hFile = ModernizedCProgram.CreateFileU(loc_file, -1024 | -1024, -1024, (null), 2, -1024, (null));
			if ((hFile == (HANDLE)(true)) || (!ModernizedCProgram.WriteFileWithRetry(hFile, loc_data, loc_size, size, 4))) {
				ModernizedCProgram._uprintf("localization: unable to extract '%s': %s", loc_file, ModernizedCProgram.WindowsErrorString());
				do {
					if ((hFile != (HANDLE)(true)) && (hFile != (null))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hFile);
						hFile = (HANDLE)(true);
					} 
				} while (0);
				;
			} 
			ModernizedCProgram._uprintf("localization: extracted data to '%s'", loc_file);
			do {
				if ((hFile != (HANDLE)(true)) && (hFile != (null))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hFile);
					hFile = (HANDLE)(true);
				} 
			} while (0);
		} else {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(loc_file, /*Error: sizeof expression not supported yet*/, "%s\\%s", ModernizedCProgram.app_dir, rufus_loc);
					(loc_file)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
				} while (0);
				external_loc_file = 1;
				ModernizedCProgram._uprintf("using external loc file '%s'", loc_file);
		} 
		loc_cmd_struct loc_cmd_struct = new loc_cmd_struct();
		loc_cmd_struct loc_cmd_struct = new loc_cmd_struct();
		if ((!ModernizedCProgram.get_supported_locales(loc_file)) || ((ModernizedCProgram.selected_locale = ((locale_name == (null)) ? loc_cmd_struct.get_locale_from_lcid(lcid, 1) : loc_cmd_struct.get_locale_from_name(locale_name, 1))) == (null))) {
			ModernizedCProgram._uprintf("FATAL: Could not access locale!");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/MessageBoxA((null), "The locale data is missing or invalid. This application will now exit.", "Fatal error", 16 | 4096);
			;
		} 
		ModernizedCProgram.selected_langid = ModernizedCProgram.selected_locale.get_language_id();
		// Set the Windows version// Set the Windows versionModernizedCProgram.GetWindowsVersion();
		// ...and nothing of value was lostif (ModernizedCProgram.nWindowsVersion < WindowsVersion.WINDOWS_7) {
			ModernizedCProgram.selected_locale.get_loc_data_file(loc_file);
			ModernizedCProgram.right_to_left_mode = ((ModernizedCProgram.selected_locale.getCtrl_id()) & -1024);
			ModernizedCProgram.MessageBoxExU((null), ModernizedCProgram.lmprintf(3294), ModernizedCProgram.lmprintf(3293), 16 | (ModernizedCProgram.right_to_left_mode ? -1024 | -1024 : 0) | 4096, ModernizedCProgram.selected_langid);
			;
		} 
		// Load the translation before we print the error
		// This is needed as there appears to be a *FLAW* in Windows allowing the app to run unelevated with some// weirdly configured user accounts, even as we explicitly set 'requireAdministrator' in the manifest...if (!ModernizedCProgram.IsCurrentProcessElevated()) {
			ModernizedCProgram._uprintf("FATAL: No administrative privileges!");
			ModernizedCProgram.selected_locale.get_loc_data_file(loc_file);
			ModernizedCProgram.right_to_left_mode = ((ModernizedCProgram.selected_locale.getCtrl_id()) & -1024);
			ModernizedCProgram.MessageBoxExU((null), ModernizedCProgram.lmprintf(3289), ModernizedCProgram.lmprintf(3288), 16 | (ModernizedCProgram.right_to_left_mode ? -1024 | -1024 : 0) | 4096, ModernizedCProgram.selected_langid);
			;
		} 
		// Prevent 2 applications from running at the same time, unless "/W" is passed as an option// in which case we wait for the mutex to be relinquishedif ((((((byte)lpCmdLine) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(lpCmdLine)) == 2) && (lpCmdLine[0] == (byte)'/') && (lpCmdLine[1] == (byte)'W')) {
			wait_for_mutex = 150;
		} 
		mutex = /*Error: Function owner not recognized*/CreateMutexA((null), 1, "Global/Rufus");
		for (; (wait_for_mutex > 0) && (mutex != (null)) && (/*Error: Function owner not recognized*/GetLastError() == -1024); wait_for_mutex--) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(mutex);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Sleep(100);
			mutex = /*Error: Function owner not recognized*/CreateMutexA((null), 1, "Global/Rufus");
		}
		if ((mutex == (null)) || (/*Error: Function owner not recognized*/GetLastError() == -1024)) {
			ModernizedCProgram.selected_locale.get_loc_data_file(loc_file);
			ModernizedCProgram.right_to_left_mode = ((ModernizedCProgram.selected_locale.getCtrl_id()) & -1024);
			ModernizedCProgram.MessageBoxExU((null), ModernizedCProgram.lmprintf(3002), ModernizedCProgram.lmprintf(3001), 16 | (ModernizedCProgram.right_to_left_mode ? -1024 | -1024 : 0) | 4096, ModernizedCProgram.selected_langid);
			;
		} 
		// Load the translation before we print the error
		// Save instance of the application for further reference// Save instance of the application for further referenceModernizedCProgram.hMainInstance = hInstance;
		// Initialize COM for folder selectiondo {
			(Object)(/*Error: Function owner not recognized*/CoInitializeEx((null), tagCOINIT.COINIT_APARTMENTTHREADED | tagCOINIT.COINIT_DISABLE_OLE1DDE));
		} while (0);
		// Some dialogs have Rich Edit controls and won't display without thisif (ModernizedCProgram.GetLibraryHandle("Riched20") == (null)) {
			ModernizedCProgram._uprintf("Could not load RichEdit library - some dialogs may not display: %s\n", ModernizedCProgram.WindowsErrorString());
		} 
		// Increase the application privileges (SE_DEBUG_PRIVILEGE), so that we can report// the Windows Services preventing access to the disk or volume we want to format.// Increase the application privileges (SE_DEBUG_PRIVILEGE), so that we can report// the Windows Services preventing access to the disk or volume we want to format.ModernizedCProgram.EnablePrivileges()// We use local group policies rather than direct registry manipulation;// We use local group policies rather than direct registry manipulation
		// 0x9e disables removable and fixed drive notifications// 0x9e disables removable and fixed drive notificationslgp_set = ModernizedCProgram.SetLGP(0, ModernizedCProgram.existing_key, ModernizedCProgram.ep_reg, "NoDriveTypeAutorun", -1024);
		// Re-enable AutoMount if neededif (!ModernizedCProgram.GetAutoMount(automount)) {
			ModernizedCProgram._uprintf("Could not get AutoMount status");
			automount = 1;
		}  else if (!automount) {
			ModernizedCProgram._uprintf("AutoMount was detected as disabled - temporarily re-enabling it");
			if (!ModernizedCProgram.SetAutoMount(1)) {
				ModernizedCProgram._uprintf("Failed to enable AutoMount");
			} 
		} 
		ModernizedCProgram.right_to_left_mode = ((ModernizedCProgram.selected_locale.getCtrl_id()) & -1024)// We always launch with the image options displaying;// We always launch with the image options displaying
		ModernizedCProgram.image_options = -1024;
		ModernizedCProgram.image_option_txt[0] = 0;
		ModernizedCProgram.select_index = 0;
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.fido_url);
			ModernizedCProgram.fido_url = (null);
		} while (0);
		ModernizedCProgram.enable_fido = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetProcessDefaultLayout(ModernizedCProgram.right_to_left_mode ? 1 : 0);
		if (ModernizedCProgram.selected_locale.get_loc_data_file(loc_file)) {
			ModernizedCProgram.WriteSettingStr("Locale", ModernizedCProgram.selected_locale.getTxt()[0]);
		} 
		if (!vc) {
			if (ModernizedCProgram.MessageBoxExU((null), ModernizedCProgram.lmprintf(3296), ModernizedCProgram.lmprintf(3295), 4 | -1024 | (ModernizedCProgram.right_to_left_mode ? -1024 | -1024 : 0) | 4096, ModernizedCProgram.selected_langid) != 6) {
				;
			} 
			vc = 1;
		} 
		if (hDlg != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DestroyWindow(hDlg);
		} 
		// Make sure any previous dialog is destroyed (e.g. when switching languages)
		hDlg = ModernizedCProgram.MyCreateDialog(hInstance, 101, (null), MainCallback);
		if (hDlg == (null)) {
			ModernizedCProgram.MessageBoxExU((null), "Could not create Window", "DialogBox failure", 16 | (ModernizedCProgram.right_to_left_mode ? -1024 | -1024 : 0) | 4096, ModernizedCProgram.selected_langid);
			;
		} 
		if ((ModernizedCProgram.relaunch_rc.getLeft() > -65536) && (ModernizedCProgram.relaunch_rc.getTop() > -65536)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(hDlg, ((HWND)0), ModernizedCProgram.relaunch_rc.getLeft(), ModernizedCProgram.relaunch_rc.getTop(), 0, 0, -1024);
		} 
		/*Error: Function owner not recognized*/// Enable drag-n-drop through the message filter/*Error: Function owner not recognized*/// Enable drag-n-drop through the message filterChangeWindowMessageFilterEx(hDlg, 563, MSGFLT_ADD, (null));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ChangeWindowMessageFilterEx(hDlg, 74, MSGFLT_ADD, (null))// CopyGlobalData is needed since we are running elevated;// CopyGlobalData is needed since we are running elevated
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ChangeWindowMessageFilterEx(hDlg, -1024, MSGFLT_ADD, (null));
		// Set the hook to automatically close Windows' "You need to format the disk in drive..." prompt// Set the hook to automatically close Windows' "You need to format the disk in drive..." promptModernizedCProgram.SetAlertPromptMessages();
		if (!ModernizedCProgram.SetAlertPromptHook()) {
			ModernizedCProgram._uprintf("Warning: Could not set alert prompt hook");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ShowWindow(hDlg, 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UpdateWindow(hDlg);
		Object generatedMessage = msg.getMessage();
		Object generatedLParam = msg.getLParam();
		Object generatedWParam = msg.getWParam();
		// Do our own event processing and process "magic" commandswhile (/*Error: Function owner not recognized*/GetMessageA(msg, (null), 0, 0)) {
			BOOL ctrl_without_focus = 0;
			BOOL no_focus = (generatedMessage == 260) && !(generatedLParam & -1024);
			if ((generatedMessage == 260) && (generatedWParam != 18)) {
				alt_command = 1;
			}  else if (/*Error: Function owner not recognized*/GetKeyState(18) & -1024) {
				alt_pressed = 1;
			} 
			if ((/*Error: Function owner not recognized*/IsWindowVisible(ModernizedCProgram.hLogDialog)) && (/*Error: Function owner not recognized*/GetKeyState(17) & -1024) && (generatedMessage == 256) && (generatedWParam == (byte)'A')) {
				((Object)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hLog), 177, (false), (true)));
				continue;
			} 
			if (no_focus && (generatedWParam == 17)) {
				ctrl_without_focus = ModernizedCProgram.op_in_progress;
			} 
			if ((ctrl_without_focus || ((/*Error: Function owner not recognized*/GetKeyState(17) & -1024) && (generatedMessage == 256))) && (generatedWParam == (byte)'L')) {
				ctrl_without_focus = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hMainDialog, 273, 1054, 0);
				continue;
			} 
			if (no_focus && (generatedWParam != 17)) {
				ctrl_without_focus = 0;
			} 
			if (no_focus) {
				continue;
			} 
			if (!ModernizedCProgram.op_in_progress) {
				if ((generatedMessage == 260) && (generatedWParam == VK_OEM_PERIOD)) {
					ModernizedCProgram.usb_debug = !ModernizedCProgram.usb_debug;
					ModernizedCProgram.WriteSettingBool("EnableUsbDebug", ModernizedCProgram.usb_debug);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3270), ModernizedCProgram.usb_debug);
					ModernizedCProgram.GetDevices(0);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == VK_OEM_COMMA)) {
					ModernizedCProgram.lock_drive = !ModernizedCProgram.lock_drive;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3282), ModernizedCProgram.lock_drive);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'B')) {
					ModernizedCProgram.detect_fakes = !ModernizedCProgram.detect_fakes;
					ModernizedCProgram.WriteSettingBool("DisableFakeDrivesCheck", !ModernizedCProgram.detect_fakes);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3256), ModernizedCProgram.detect_fakes);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'C')) {
					int index = ((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((ModernizedCProgram.hDeviceList), 327, 0, 0));
					if (index >= 0) {
						ModernizedCProgram.CyclePort(index);
					} 
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'D')) {
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(tmp_path, /*Error: sizeof expression not supported yet*/, "%s\\%s", ModernizedCProgram.app_dir, "rufus_files");
						(tmp_path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
					} while (0);
					ModernizedCProgram.PrintStatusInfo(0, 0, 2000, 3264, tmp_path);
					ModernizedCProgram.SHDeleteDirectoryExU((null), tmp_path, 4 | 1024 | 16);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'E')) {
					ModernizedCProgram.allow_dual_uefi_bios = !ModernizedCProgram.allow_dual_uefi_bios;
					ModernizedCProgram.WriteSettingBool("EnableWindowsDualUefiBiosMode", ModernizedCProgram.allow_dual_uefi_bios);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3266), ModernizedCProgram.allow_dual_uefi_bios);
					ModernizedCProgram.SetPartitionSchemeAndTargetSystem(0);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'F')) {
					ModernizedCProgram.enable_HDDs = !ModernizedCProgram.enable_HDDs;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3253), ModernizedCProgram.enable_HDDs);
					ModernizedCProgram.GetDevices(0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1022, ModernizedCProgram.enable_HDDs ? 1 : 0);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'I')) {
					ModernizedCProgram.enable_iso = !ModernizedCProgram.enable_iso;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3262), ModernizedCProgram.enable_iso);
					if (ModernizedCProgram.image_path != (null)) {
						ModernizedCProgram.iso_provided = 1;
						ModernizedCProgram.dont_display_image_name = 1;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(hDlg, 273, 1014, 0);
					} 
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'J')) {
					ModernizedCProgram.enable_joliet = !ModernizedCProgram.enable_joliet;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3257), ModernizedCProgram.enable_joliet);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'K')) {
					ModernizedCProgram.enable_rockridge = !ModernizedCProgram.enable_rockridge;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3258), ModernizedCProgram.enable_rockridge);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'L')) {
					ModernizedCProgram._uprintf("DAFUQ!?!? LPARAM = 0x%08X", generatedLParam);
					if ((generatedMessage == 260) && !(generatedLParam & -1024)) {
						ModernizedCProgram._uprintf("KIDDING ME?!?!.");
					} 
					ModernizedCProgram.force_large_fat32 = !ModernizedCProgram.force_large_fat32;
					ModernizedCProgram.WriteSettingBool("ForceLargeFat32Formatting", ModernizedCProgram.force_large_fat32);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3254), ModernizedCProgram.force_large_fat32);
					ModernizedCProgram.GetDevices(0);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'N')) {
					ModernizedCProgram.enable_ntfs_compression = !ModernizedCProgram.enable_ntfs_compression;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3260), ModernizedCProgram.enable_ntfs_compression);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'O')) {
					ModernizedCProgram.SaveISO();
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'Q')) {
					ModernizedCProgram.enable_file_indexing = !ModernizedCProgram.enable_file_indexing;
					ModernizedCProgram.WriteSettingBool("EnableFileIndexing", ModernizedCProgram.enable_file_indexing);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3290), !ModernizedCProgram.enable_file_indexing);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'R')) {
					ModernizedCProgram.PrintStatusInfo(0, 0, 2000, ModernizedCProgram.DeleteRegistryKey(((HKEY)-1024), "Akeo Consulting\\Rufus") ? 3248 : 3249);
					ModernizedCProgram.DeleteRegistryKey(((HKEY)-1024), "Akeo Consulting");
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'S')) {
					ModernizedCProgram.size_check = !ModernizedCProgram.size_check;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3252), ModernizedCProgram.size_check);
					ModernizedCProgram.GetDevices(0);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'T')) {
					ModernizedCProgram.preserve_timestamps = !ModernizedCProgram.preserve_timestamps;
					ModernizedCProgram.WriteSettingBool("PreserveTimestamps", ModernizedCProgram.preserve_timestamps);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3269), ModernizedCProgram.preserve_timestamps);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'U')) {
					ModernizedCProgram.use_fake_units = !ModernizedCProgram.use_fake_units;
					ModernizedCProgram.WriteSettingBool("UseProperSizeUnits", !ModernizedCProgram.use_fake_units);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3263), !ModernizedCProgram.use_fake_units);
					ModernizedCProgram.GetDevices(0);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'V')) {
					ModernizedCProgram.use_vds = !ModernizedCProgram.use_vds;
					ModernizedCProgram.WriteSettingBool("UseVds", ModernizedCProgram.use_vds);
					ModernizedCProgram.PrintStatusTimeout("VDS", ModernizedCProgram.use_vds);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'W')) {
					ModernizedCProgram.enable_vmdk = !ModernizedCProgram.enable_vmdk;
					ModernizedCProgram.WriteSettingBool("EnableVmdkDetection", ModernizedCProgram.enable_vmdk);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3265), ModernizedCProgram.enable_vmdk);
					ModernizedCProgram.GetDevices(0);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'X')) {
					ModernizedCProgram.PrintStatusInfo(0, 0, 2000, 3255);
					ModernizedCProgram.existing_key = 0;
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'Y')) {
					ModernizedCProgram.force_update = (ModernizedCProgram.force_update > 0) ? 0 : 1;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3259), ModernizedCProgram.force_update);
					continue;
				} 
				if ((generatedMessage == 260) && (generatedWParam == (byte)'Z')) {
					ModernizedCProgram.zero_drive = 1;
					ModernizedCProgram.fast_zeroing = 0;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/PostMessageA(hDlg, 273, (WPARAM)1003, 0);
					continue;
				} 
				if ((generatedMessage == 256) && (generatedWParam == (byte)'Z') && (/*Error: Function owner not recognized*/GetKeyState(17) & -1024) && (/*Error: Function owner not recognized*/GetKeyState(18) & -1024)) {
					ModernizedCProgram.zero_drive = 1;
					ModernizedCProgram.fast_zeroing = 1;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/PostMessageA(hDlg, 273, (WPARAM)1003, 0);
					continue;
				} 
				if ((generatedMessage == 256) && (generatedWParam == (byte)'F') && (/*Error: Function owner not recognized*/GetKeyState(17) & -1024) && (/*Error: Function owner not recognized*/GetKeyState(18) & -1024)) {
					ModernizedCProgram.list_non_usb_removable_drives = !ModernizedCProgram.list_non_usb_removable_drives;
					if (ModernizedCProgram.list_non_usb_removable_drives) {
						previous_enable_HDDs = ModernizedCProgram.enable_HDDs;
						ModernizedCProgram.enable_HDDs = 1;
					} else {
							ModernizedCProgram.enable_HDDs = previous_enable_HDDs;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CheckDlgButton(ModernizedCProgram.hMainDialog, 1022, ModernizedCProgram.enable_HDDs ? 1 : 0);
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3287), ModernizedCProgram.list_non_usb_removable_drives);
					ModernizedCProgram._uprintf("%sListing of non-USB removable drives %s", (ModernizedCProgram.list_non_usb_removable_drives) ? "CAUTION: " : "", (ModernizedCProgram.list_non_usb_removable_drives) ? "enabled" : "disabled");
					if (ModernizedCProgram.list_non_usb_removable_drives) {
						ModernizedCProgram._uprintf("By using this unofficial cheat mode you forfeit ANY RIGHT to complain if you lose valuable data!");
					} 
					ModernizedCProgram.GetDevices(0);
					continue;
				} 
				if ((generatedMessage == 256) && (generatedWParam == (byte)'Y') && (/*Error: Function owner not recognized*/GetKeyState(17) & -1024) && (/*Error: Function owner not recognized*/GetKeyState(18) & -1024)) {
					ModernizedCProgram.force_update = (ModernizedCProgram.force_update > 0) ? 0 : 2;
					ModernizedCProgram.PrintStatusTimeout(ModernizedCProgram.lmprintf(3259), ModernizedCProgram.force_update);
					continue;
				} 
			} 
			if (alt_pressed && !(/*Error: Function owner not recognized*/GetKeyState(18) & -1024)) {
				alt_pressed = 0;
				if (!alt_command) {
					ModernizedCProgram.update_progress_type = (ModernizedCProgram.update_progress_type + 1) % update_progress_type.UPT_MAX;
				} 
				alt_command = 0;
			} 
			if (!/*Error: Function owner not recognized*/IsDialogMessageA(hDlg, msg) && !/*Error: Function owner not recognized*/IsDialogMessageA(ModernizedCProgram.hLogDialog, msg)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/TranslateMessage(msg);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DispatchMessageA(msg);
			} 
		}
		if (ModernizedCProgram.hFidoDlg != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SendMessageA(ModernizedCProgram.hFidoDlg, 16, 0, 0);
		} 
		if (ModernizedCProgram.relaunch) {
			ModernizedCProgram.relaunch = 0;
			do {
				ModernizedCProgram._exit_localization(1);
				ModernizedCProgram._init_localization(1);
			} while (0);
			;
		} 
		// Kill the update check thread if runningif (ModernizedCProgram.update_check_thread != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/TerminateThread(ModernizedCProgram.update_check_thread, 1);
		} 
		if ((!external_loc_file) && (loc_file[0] != 0)) {
			ModernizedCProgram.DeleteFileU(loc_file);
		} 
		ModernizedCProgram.DestroyAllTooltips();
		ModernizedCProgram.ClrAlertPromptHook();
		ModernizedCProgram._exit_localization(0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.image_path);
			ModernizedCProgram.image_path = (null);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)locale_name);
			locale_name = (null);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.update.getDownload_url());
			ModernizedCProgram.update.setDownload_url((null));
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.update.getRelease_notes());
			ModernizedCProgram.update.setRelease_notes((null));
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.grub2_buf);
			ModernizedCProgram.grub2_buf = (null);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.fido_url);
			ModernizedCProgram.fido_url = (null);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.fido_script);
			ModernizedCProgram.fido_script = (null);
		} while (0);
		if (argv != (null)) {
			for (i = 0; i < argc; i++) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)argv[i]);
					argv[i] = (null);
				} while (0);
			}
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)argv);
				argv = (null);
			} while (0);
		} 
		if (lgp_set) {
			ModernizedCProgram.SetLGP(1, ModernizedCProgram.existing_key, ModernizedCProgram.ep_reg, "NoDriveTypeAutorun", 0);
		} 
		if ((!automount) && (!ModernizedCProgram.SetAutoMount(0))) {
			ModernizedCProgram._uprintf("Failed to restore AutoMount to disabled");
		} 
		do {
			if (ModernizedCProgram.ubuffer_pos) {
				ModernizedCProgram._uprintf("%s", ModernizedCProgram.ubuffer);
			} 
			ModernizedCProgram.ubuffer_pos = 0;
		} while (0);// Unconditional delete with retry, just in case...
		for (i = 0; (!/*Error: Function owner not recognized*/DeleteFileA(ModernizedCProgram.cmdline_hogger)) && (i <= 10); i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Sleep(200);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(mutex);
		while (ModernizedCProgram.OpenedLibrariesHandleSize > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FreeLibrary(ModernizedCProgram.OpenedLibrariesHandle[--ModernizedCProgram.OpenedLibrariesHandleSize]);
		}
		if (attached_console) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetWindowPos(/*Error: Function owner not recognized*/GetConsoleWindow(), ((HWND)0), 0, 0, 0, 0, -1024 | -1024);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FreeConsole();
		} 
		ModernizedCProgram._uprintf("*** Rufus exit ***\n");
		return 0;
	}
	// From smartmontools os_win32.cpp
	private static void GetWindowsVersion() {
		OSVERSIONINFOEXA vi = new OSVERSIONINFOEXA();
		OSVERSIONINFOEXA vi2 = new OSVERSIONINFOEXA();
		Byte w = 0;
		Byte w64 = "32 bit";
		Byte vptr;
		size_t vlen = new size_t();
		int major;
		int minor;
		ULONGLONG major_equal = new ULONGLONG();
		ULONGLONG minor_equal = new ULONGLONG();
		BOOL ws = new BOOL();
		ModernizedCProgram.nWindowsVersion = WindowsVersion.WINDOWS_UNDEFINED;
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.WindowsVersionStr, "Windows Undefined", (((size_t)(((((byte)"Windows Undefined") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Undefined")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Windows Undefined") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Undefined")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
			((byte)ModernizedCProgram.WindowsVersionStr)[(((size_t)(((((byte)"Windows Undefined") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Undefined")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Windows Undefined") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Undefined")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(vi, 0, /*Error: sizeof expression not supported yet*/);
		vi.setDwOSVersionInfoSize(/*Error: sizeof expression not supported yet*/);
		if (!/*Error: Function owner not recognized*/GetVersionExA((OSVERSIONINFOA)vi)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(vi, 0, /*Error: sizeof expression not supported yet*/);
			vi.setDwOSVersionInfoSize(/*Error: Unsupported expression*/);
			if (!/*Error: Function owner not recognized*/GetVersionExA((OSVERSIONINFOA)vi)) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		Object generatedDwPlatformId = vi.getDwPlatformId();
		Object generatedDwMajorVersion = vi.getDwMajorVersion();
		Object generatedDwMinorVersion = vi.getDwMinorVersion();
		Object generatedWProductType = vi.getWProductType();
		if (generatedDwPlatformId == 2) {
			if (generatedDwMajorVersion > 6 || (generatedDwMajorVersion == 6 && generatedDwMinorVersion >= 2)) {
				major_equal = /*Error: Function owner not recognized*/VerSetConditionMask(0, VER_MAJORVERSION, VER_EQUAL);
				for (major = generatedDwMajorVersion; major <= 9; major++) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(vi2, 0, /*Error: sizeof expression not supported yet*/);
					vi2.setDwOSVersionInfoSize(/*Error: sizeof expression not supported yet*/);
					vi2.setDwMajorVersion(major);
					if (!/*Error: Function owner not recognized*/VerifyVersionInfoA(vi2, VER_MAJORVERSION, major_equal)) {
						continue;
					} 
					if (generatedDwMajorVersion < major) {
						vi.setDwMajorVersion(major);
						vi.setDwMinorVersion(0);
					} 
					minor_equal = /*Error: Function owner not recognized*/VerSetConditionMask(0, VER_MINORVERSION, VER_EQUAL);
					for (minor = generatedDwMinorVersion; minor <= 9; minor++) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(vi2, 0, /*Error: sizeof expression not supported yet*/);
						vi2.setDwOSVersionInfoSize(/*Error: sizeof expression not supported yet*/);
						vi2.setDwMinorVersion(minor);
						if (!/*Error: Function owner not recognized*/VerifyVersionInfoA(vi2, VER_MINORVERSION, minor_equal)) {
							continue;
						} 
						vi.setDwMinorVersion(minor);
						break;
					}
					break;
				}
			} 
			if (generatedDwMajorVersion <= -1024 && generatedDwMinorVersion <= -1024) {
				ws = (generatedWProductType <= 1);
				ModernizedCProgram.nWindowsVersion = generatedDwMajorVersion << 4 | generatedDwMinorVersion;
				switch (ModernizedCProgram.nWindowsVersion) {
				case -1024:
						w = (!/*Error: Function owner not recognized*/GetSystemMetrics(89) ? "Server 2003" : "Server 2003_R2");
						break;
				case -1024:
						w = (ws ? "7" : "Server 2008_R2");
						break;
				case -1024:
						w = (ws ? "8.1" : "Server 2012_R2");
						break;
				case -1024:
						w = (ws ? "Vista" : "Server 2008");
						break;
				case -1024:
						w = "XP";
						break;
				case -1024:
						w = (ws ? "8" : "Server 2012");
						break;
				case -1024:
						w = (ws ? "10" : "Server 2016");
						break;
				case -1024:
						w = (ws ? "10 (Preview 1)" : "Server 10 (Preview 1)");
						break;
				default:
						if (ModernizedCProgram.nWindowsVersion < -1024) {
							ModernizedCProgram.nWindowsVersion = WindowsVersion.WINDOWS_UNSUPPORTED;
						} else {
								w = "11 or later";
						} 
						break;
				}
			} 
		} 
		if (ModernizedCProgram.is_x64()) {
			w64 = "64-bit";
		} 
		vptr = ModernizedCProgram.WindowsVersionStr[/*Error: sizeof expression not supported yet*/ - 1];
		vlen = /*Error: sizeof expression not supported yet*/ - /*Error: sizeof expression not supported yet*/ - 1;
		Object generatedWServicePackMinor = vi.getWServicePackMinor();
		Object generatedWServicePackMajor = vi.getWServicePackMajor();
		if (!w) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(vptr, vlen, "%s %u.%u %s", (generatedDwPlatformId == 2 ? "NT" : "??"), (int)generatedDwMajorVersion, (int)generatedDwMinorVersion, w64);
				(vptr)[(vlen) - 1] = 0;
			} while (0);
		}  else if (generatedWServicePackMinor) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(vptr, vlen, "%s SP%u.%u %s", w, generatedWServicePackMajor, generatedWServicePackMinor, w64);
				(vptr)[(vlen) - 1] = 0;
			} while (0);
		}  else if (generatedWServicePackMajor) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(vptr, vlen, "%s SP%u %s", w, generatedWServicePackMajor, w64);
				(vptr)[(vlen) - 1] = 0;
			} while (0);
		} else {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(vptr, vlen, "%s %s", w, w64);
					(vptr)[(vlen) - 1] = 0;
				} while (0);
		} 
		Object generatedDwBuildNumber = vi.getDwBuildNumber();
		// Add the build number for Windows 8.0 and later// Add the build number for Windows 8.0 and laterModernizedCProgram.nWindowsBuildNumber = generatedDwBuildNumber;
		if (ModernizedCProgram.nWindowsVersion >= -1024) {
			vptr = ModernizedCProgram.WindowsVersionStr[((((byte)ModernizedCProgram.WindowsVersionStr) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.WindowsVersionStr))];
			vlen = /*Error: sizeof expression not supported yet*/ - ((((byte)ModernizedCProgram.WindowsVersionStr) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.WindowsVersionStr)) - 1;
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(vptr, vlen, " (Build %d)", ModernizedCProgram.nWindowsBuildNumber);
				(vptr)[(vlen) - 1] = 0;
			} while (0);
		} 
	}
	private static Object EnablePrivileges() {
		// List of the privileges we require. A list of requestable privileges can// be obtained at https://technet.microsoft.com/en-us/library/dn221963.aspxDWORD[] requestedPrivileges = new DWORD[]{(true)};
		NTSTATUS status = ((NTSTATUS)-1024);
		HANDLE tokenHandle = new HANDLE();
		do {
			if (ModernizedCProgram.pfNtClose == (null)) {
				ModernizedCProgram.pfNtClose = (NtClose_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("NtDll"), "NtClose");
			} 
			if (ModernizedCProgram.pfNtClose == (null)) {
				ModernizedCProgram._uprintf("Unable to locate %s() in %s.dll: %s\n", "NtClose", "NtDll", ModernizedCProgram.WindowsErrorString());
				;
			} 
		} while (0);
		do {
			if (ModernizedCProgram.pfNtOpenProcessToken == (null)) {
				ModernizedCProgram.pfNtOpenProcessToken = (NtOpenProcessToken_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("NtDll"), "NtOpenProcessToken");
			} 
			if (ModernizedCProgram.pfNtOpenProcessToken == (null)) {
				ModernizedCProgram._uprintf("Unable to locate %s() in %s.dll: %s\n", "NtOpenProcessToken", "NtDll", ModernizedCProgram.WindowsErrorString());
				;
			} 
		} while (0);
		do {
			if (ModernizedCProgram.pfNtAdjustPrivilegesToken == (null)) {
				ModernizedCProgram.pfNtAdjustPrivilegesToken = (NtAdjustPrivilegesToken_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("NtDll"), "NtAdjustPrivilegesToken");
			} 
			if (ModernizedCProgram.pfNtAdjustPrivilegesToken == (null)) {
				ModernizedCProgram._uprintf("Unable to locate %s() in %s.dll: %s\n", "NtAdjustPrivilegesToken", "NtDll", ModernizedCProgram.WindowsErrorString());
				;
			} 
		} while (0);
		status = /*Error: Function owner not recognized*/pfNtOpenProcessToken(((HANDLE)(LONG_PTR)-1), (true), tokenHandle);
		if (/*Error: Function owner not recognized*/NT_SUCCESS(status)) {
			CHAR[] privilegesBuffer = new CHAR();
			PTOKEN_PRIVILEGES privileges = new PTOKEN_PRIVILEGES();
			ULONG i = new ULONG();
			privileges = (PTOKEN_PRIVILEGES)privilegesBuffer;
			privileges.setPrivilegeCount((/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/));
			for (i = 0; i < privileges.getPrivilegeCount(); i++) {
				privileges.getPrivileges()[i].setAttributes(2);
				privileges.getPrivileges()[i].getLuid().setHighPart(0);
				privileges.getPrivileges()[0].getLuid().setLowPart(requestedPrivileges[i]);
			}
			status = /*Error: Function owner not recognized*/pfNtAdjustPrivilegesToken(tokenHandle, 0, privileges, 0, (null), (null));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pfNtClose(tokenHandle);
		} 
		return /*Error: Function owner not recognized*/NT_SUCCESS(status);
	}
	private static void SetAlertPromptMessages() {
		HMODULE mui_lib = new HMODULE();
		byte[] mui_path = new byte[260];
		// Fetch the localized strings in the relevant MUI
		// Must use sysnative_dir rather than system_dir as we may not find the MUI's otherwisedo {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(mui_path, /*Error: sizeof expression not supported yet*/, "%s\\%s\\shell32.dll.mui", ModernizedCProgram.sysnative_dir, ModernizedCProgram.GetCurrentMUI());
			(mui_path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
		} while (0);
		mui_lib = ModernizedCProgram.LoadLibraryU(mui_path);
		if (mui_lib != (null)) {
			if (ModernizedCProgram.LoadStringU(mui_lib, 4125, ModernizedCProgram.title_str[0], /*Error: sizeof expression not supported yet*/) <= 0) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.title_str[0], "Microsoft Windows", (((size_t)(((((byte)"Microsoft Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Microsoft Windows")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Microsoft Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Microsoft Windows")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
					((byte)ModernizedCProgram.title_str[0])[(((size_t)(((((byte)"Microsoft Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Microsoft Windows")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Microsoft Windows") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Microsoft Windows")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
				} while (0);
				ModernizedCProgram._uprintf("Warning: Could not locate localized format prompt title string in '%s': %s", mui_path, ModernizedCProgram.WindowsErrorString());
			} 
			if (ModernizedCProgram.LoadStringU(mui_lib, 4126, ModernizedCProgram.button_str, /*Error: sizeof expression not supported yet*/) <= 0) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.button_str, "Format disk", (((size_t)(((((byte)"Format disk") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Format disk")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Format disk") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Format disk")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
					((byte)ModernizedCProgram.button_str)[(((size_t)(((((byte)"Format disk") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Format disk")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Format disk") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Format disk")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
				} while (0);
				ModernizedCProgram._uprintf("Warning: Could not locate localized format prompt button string in '%s': %s", mui_path, ModernizedCProgram.WindowsErrorString());
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FreeLibrary(mui_lib);
		} 
		// 4097 = "You need to format the disk in drive %c: before you can use it." (dialog text)// 4125 = "Microsoft Windows" (dialog title)
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(mui_path, /*Error: sizeof expression not supported yet*/, "%s\\%s\\urlmon.dll.mui", ModernizedCProgram.sysnative_dir, ModernizedCProgram.GetCurrentMUI());
			(mui_path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
		} while (0);
		mui_lib = ModernizedCProgram.LoadLibraryU(mui_path);
		if (mui_lib != (null)) {
			if (ModernizedCProgram.LoadStringU(mui_lib, 2070, ModernizedCProgram.title_str[1], /*Error: sizeof expression not supported yet*/) <= 0) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.title_str[1], "Windows Security Warning", (((size_t)(((((byte)"Windows Security Warning") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Security Warning")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Windows Security Warning") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Security Warning")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
					((byte)ModernizedCProgram.title_str[1])[(((size_t)(((((byte)"Windows Security Warning") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Security Warning")) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)"Windows Security Warning") == (null)) ? 0 : /*Error: Function owner not recognized*/strlen("Windows Security Warning")) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
				} while (0);
				ModernizedCProgram._uprintf("Warning: Could not locate localized cookie prompt title string in '%s': %s", mui_path, ModernizedCProgram.WindowsErrorString());
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FreeLibrary(mui_lib);
		} 
		// 2070 = "Windows Security Warning" (yes, that's what MS uses for a stupid cookie!)
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.title_str[2], ModernizedCProgram.lmprintf(3149), (((size_t)(((((byte)ModernizedCProgram.lmprintf(3149)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3149))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3149)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3149))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
			((byte)ModernizedCProgram.title_str[2])[(((size_t)(((((byte)ModernizedCProgram.lmprintf(3149)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3149))) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)ModernizedCProgram.lmprintf(3149)) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(ModernizedCProgram.lmprintf(3149))) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
		} while (0);
	}
	private static void DestroyAllTooltips() {
		int i;
		int j;
		for (; i < 128; i++) {
			if (ttlist[i].getHTip() == (null)) {
				continue;
			} 
			j++;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DestroyWindow(ttlist[i].getHTip());
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ttlist[i].getWstring());
				ttlist[i].setWstring((null));
			} while (0);
			ttlist[i].setOriginal_proc((null));
			ttlist[i].setHTip((null));
			ttlist[i].setHCtrl((null));
		}
	}
	private static void ClrAlertPromptHook() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UnhookWinEvent(ModernizedCProgram.ap_weh);
		ModernizedCProgram.ap_weh = (null);
	}
}
