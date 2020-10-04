package application;

public class InstallSyslinuxToSyslinux_make_bootsect {
	
	
	private static Object InstallSyslinux(Object drive_index, byte drive_letter, int file_system) {
		LARGE_INTEGER liZero = new LARGE_INTEGER(new LARGE_INTEGER(0, 0));
		HANDLE f_handle = (HANDLE)(true);
		HANDLE d_handle = (HANDLE)(true);
		DWORD bytes_read = new DWORD();
		DWORD bytes_written = new DWORD();
		DWORD err = new DWORD();
		S_NTFSSECT_VOLINFO vol_info = new S_NTFSSECT_VOLINFO(0);
		LARGE_INTEGER vcn = new LARGE_INTEGER();
		LARGE_INTEGER lba = new LARGE_INTEGER();
		LARGE_INTEGER len = new LARGE_INTEGER();
		S_NTFSSECT_EXTENT extent = new S_NTFSSECT_EXTENT();
		BOOL r = 0;
		FILE fd = new FILE();
		size_t length = new size_t();
		Byte sectbuf = (null);
		byte[][][] resource = new byte[][][]{{(LPSTR)((DWORD)((WORD)(true))), (LPSTR)((DWORD)((WORD)(true)))}, {(LPSTR)((DWORD)((WORD)(true))), (LPSTR)((DWORD)((WORD)(true)))}};
		Byte ldlinux = "ldlinux";
		Byte syslinux = "syslinux";
		byte[][] ldlinux_ext = new byte[][]{"sys", "bss", "c32"};
		Byte mboot_c32 = "mboot.c32";
		byte[] path = new byte[260];
		byte[] tmp = new byte[64];
		Byte errmsg;
		libfat_filesystem lf_fs = new libfat_filesystem();
		libfat_sector_t s = new libfat_sector_t();
		libfat_sector_t secp = new libfat_sector_t();
		libfat_sector_t sectors = (null);
		int ldlinux_sectors;
		uint32_t ldlinux_cluster = new uint32_t();
		int i;
		int nsectors;
		int sl_fs_stype;
		BOOL use_v5 = (boot_type == boot_type.BT_SYSLINUX_V6) || ((boot_type == boot_type.BT_IMAGE) && (((uint8_t)((img_report.getSl_version()) >> 8)) >= 5));
		PrintStatusInfo(1, 1, 0, 3234, (boot_type == boot_type.BT_IMAGE) ? img_report.getSl_version_str() : embedded_sl_version_str[use_v5 ? 1 : 0]);
		SECTOR_SHIFT = /* 4K sector size workaround */0;
		SECTOR_SIZE = SelectedDrive.getSectorSize();
		while (SECTOR_SIZE >>=  1) {
			SECTOR_SHIFT++;
		}
		SECTOR_SIZE = SelectedDrive.getSectorSize();
		LIBFAT_SECTOR_SHIFT = SECTOR_SHIFT;
		LIBFAT_SECTOR_SIZE = SECTOR_SIZE;
		LIBFAT_SECTOR_MASK = SECTOR_SIZE - 1;
		sectbuf = /*Error: Function owner not recognized*/_mm_malloc(SECTOR_SIZE, /* sectbuf should be aligned to at least 8 bytes - see github #767 */16);
		if (sectbuf == (null)) {
			;
		} 
		d_handle = GetLogicalHandle(drive_index, 0, 0, 1, 1);
		if ((d_handle == (HANDLE)(true)) || (d_handle == (null))) {
			_uprintf("Could open volume for Syslinux installation");
			;
		} 
		if (!/*Error: Function owner not recognized*/ReadFile(d_handle, sectbuf, SECTOR_SIZE, bytes_read, (null))) {
			_uprintf("Could not read VBR");
			;
		} 
		if (bytes_read != SECTOR_SIZE) {
			_uprintf("Could not read the whole VBR");
			;
		} 
		if ((errmsg = syslinux_check_bootsect(sectbuf, sl_fs_stype))) {
			_uprintf("Error: %s", errmsg);
			;
		} 
		syslinux_reset_adv(/* Initialize the ADV -- this should be smarter */syslinux_adv);
		if ((syslinux_ldlinux_len[0] != 0) && (syslinux_ldlinux_len[1] != /* Access a copy of the ldlinux.sys & ldlinux.bss resources (downloaded or embedded) */0)) {
			do {
				(Object)(_chdirU(app_dir));
			} while (0);
			for (i = 0; i < 2; i++) {
				syslinux_ldlinux[i] = (byte)/*Error: Function owner not recognized*/malloc(syslinux_ldlinux_len[i]);
				if (syslinux_ldlinux[i] == (null)) {
					;
				} 
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(path, /*Error: sizeof expression not supported yet*/, "%s/%s-%s%s/%s.%s", "rufus_files", syslinux, img_report.getSl_version_str(), img_report.getSl_version_ext(), ldlinux, i == 0 ? "sys" : "bss");
					(path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
				} while (0);
				fd = /*Error: Function owner not recognized*/fopen(path, "rb");
				if (fd == (null)) {
					_uprintf("Could not open %s", path);
					;
				} 
				length = /*Error: Function owner not recognized*/fread(syslinux_ldlinux[i], 1, (size_t)syslinux_ldlinux_len[i], fd);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fd);
				if (length != (size_t)syslinux_ldlinux_len[i]) {
					_uprintf("Could not read %s", path);
					;
				} 
				_uprintf("Using existing './%s' %s", path, IsBufferInDB(syslinux_ldlinux[i], (size_t)syslinux_ldlinux_len[i]) ? "✓" : "✗");
			}
		} else {
				for (i = 0; i < 2; i++) {
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(tmp, /*Error: sizeof expression not supported yet*/, "%s.%s", ldlinux, ldlinux_ext[i]);
						(tmp)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
					} while (0);
					syslinux_ldlinux[i] = GetResource(hMainInstance, resource[use_v5 ? 1 : 0][i], (LPSTR)((DWORD)((WORD)(true))), tmp, syslinux_ldlinux_len[i], 1);
					if (syslinux_ldlinux[i] == (null)) {
						;
					} 
				}
		} 
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(path, /*Error: sizeof expression not supported yet*/, "%C:\\%s.%s", drive_letter, ldlinux, ldlinux_ext[0]);
			(path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
		} while (/* Create ldlinux.sys file */0);
		f_handle = /*Error: Function owner not recognized*/CreateFileA(path, -1024 | -1024, -1024 | -1024, (null), 2, -1024 | -1024 | -1024, (null));
		if (f_handle == (HANDLE)(true)) {
			_uprintf("Unable to create '%s': %s", path[3], WindowsErrorString());
			;
		} 
		if (!WriteFileWithRetry(f_handle, (byte)syslinux_ldlinux[/* Write ldlinux.sys file */0], syslinux_ldlinux_len[0], bytes_written, 4)) {
			_uprintf("Could not write '%s': %s", path[3], WindowsErrorString());
			;
		} 
		if (!WriteFileWithRetry(f_handle, syslinux_adv, 2 * 512, bytes_written, 4)) {
			_uprintf("Could not write ADV to '%s': %s", path[3], WindowsErrorString());
			;
		} 
		_uprintf("Successfully wrote '%s'", path[3]);
		if (boot_type != boot_type.BT_IMAGE) {
			UpdateProgress(action_type.OP_FILE_COPY, -1.0);
		} 
		if (!/*Error: Function owner not recognized*/FlushFileBuffers(/* Now flush the media */f_handle)) {
			_uprintf("FlushFileBuffers failed");
			;
		} 
		ldlinux_sectors = (syslinux_ldlinux_len[0] + 2 * 512 + SECTOR_SIZE - 1) >> /* Map the file (is there a better way to do this?) */SECTOR_SHIFT;
		sectors = (libfat_sector_t)/*Error: Function owner not recognized*/calloc(ldlinux_sectors, /*Error: sizeof expression not supported yet*/);
		if (sectors == (null)) {
			;
		} 
		Object generatedFirstLcn = extent.getFirstLcn();
		Object generatedQuadPart = lba.getQuadPart();
		Object generatedSectorsPerCluster = vol_info.getSectorsPerCluster();
		Object generatedNextVcn = extent.getNextVcn();
		libfat_filesystem libfat_filesystem = new libfat_filesystem();
		switch (file_system) {
		case fs_type.FS_EXFAT:
				lf_fs = libfat_filesystem.libfat_open(libfat_readfile, (intptr_t)d_handle);
				if (lf_fs == (null)) {
					_uprintf("Syslinux FAT access error");
					;
				} 
				ldlinux_cluster = libfat_searchdir(lf_fs, 0, "LDLINUX SYS", (null));
				secp = sectors;
				nsectors = 0;
				s = libfat_clustertosector(lf_fs, ldlinux_cluster);
				while (s && nsectors < ldlinux_sectors) {
					secp++ = s;
					nsectors++;
					s = lf_fs.libfat_nextsector(s);
				}
				lf_fs.libfat_close();
				break;
		case fs_type.FS_NTFS:
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(tmp, /*Error: sizeof expression not supported yet*/, "%C:\\", drive_letter);
					(tmp)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
				} while (0);
				vol_info.setHandle(d_handle);
				err = vol_info.NtfsSectGetVolumeInfo(tmp);
				if (err != -1024) {
					_uprintf("Could not fetch NTFS volume info");
					;
				} 
				secp = sectors;
				nsectors = 0;
				for (vcn.setQuadPart(0); NtfsSectGetFileVcnExtent(f_handle, vcn, extent) == -1024; vcn = generatedNextVcn) {
					err = lba.NtfsSectLcnToLba(vol_info, generatedFirstLcn);
					if (err != -1024) {
						_uprintf("Could not translate LDLINUX.SYS LCN to disk LBA");
						;
					} 
					generatedQuadPart -= generatedQuadPart;
					len.setQuadPart(((generatedQuadPart - generatedQuadPart) * generatedSectorsPerCluster));
					while (generatedQuadPart-- && nsectors < ldlinux_sectors) {
						secp++ = generatedQuadPart++;
						nsectors++;
					}
				}
				break;
		case fs_type.FS_FAT16:
		case fs_type.FS_FAT32:
		default:
				_uprintf("Unsupported Syslinux filesystem");
				;
		}
		if (syslinux_patch(sectors, nsectors, 0, 0, (null), (null)) < /* Patch ldlinux.sys and the boot sector */0) {
			_uprintf("Could not patch Syslinux files.");
			_uprintf("WARNING: This could be caused by your firewall having modifed downloaded content, such as 'ldlinux.sys'...");
			;
		} 
		if (!/*Error: Function owner not recognized*/SetFilePointerEx(f_handle, liZero, (null), /* Rewrite the file */0) || !WriteFileWithRetry(f_handle, syslinux_ldlinux[0], syslinux_ldlinux_len[0], bytes_written, 4)) {
			_uprintf("Could not rewrite '%s': %s\n", path[3], WindowsErrorString());
			;
		} 
		do {
			if ((f_handle != (HANDLE)(true)) && (f_handle != (null))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(f_handle);
				f_handle = (HANDLE)(true);
			} 
		} while (/* Close file */0);
		if (!/*Error: Function owner not recognized*/SetFilePointerEx(d_handle, liZero, (null), /* Read existing FAT data into boot sector */0) || !/*Error: Function owner not recognized*/ReadFile(d_handle, sectbuf, SECTOR_SIZE, bytes_read, (null))) {
			_uprintf("Could not read Syslinux boot record: %s", WindowsErrorString());
			;
		} 
		if (bytes_read < SECTOR_SIZE) {
			_uprintf("Partial read of Syslinux boot record: read %d bytes but requested %d", bytes_read, SECTOR_SIZE);
			;
		} 
		syslinux_make_bootsect(sectbuf, (file_system == fs_type.FS_NTFS) ? filesystem.NTFS : /* Make the syslinux boot sector */filesystem.VFAT);
		if (!/*Error: Function owner not recognized*/SetFilePointerEx(d_handle, liZero, (null), /* Write boot sector back */0) || !WriteFileWithRetry(d_handle, sectbuf, SECTOR_SIZE, bytes_written, 4)) {
			_uprintf("Could not write Syslinux boot record: %s", WindowsErrorString());
			;
		} 
		_uprintf("Successfully wrote Syslinux boot record");
		if (boot_type == boot_type.BT_SYSLINUX_V6) {
			do {
				(Object)(_chdirU(app_dir));
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(path, /*Error: sizeof expression not supported yet*/, "%s/%s-%s", "rufus_files", syslinux, embedded_sl_version_str[1]);
				(path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
			} while (0);
			do {
				(Object)(/*Error: Function owner not recognized*/_chdir(path));
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(path, /*Error: sizeof expression not supported yet*/, "%C:\\%s.%s", drive_letter, ldlinux, ldlinux_ext[2]);
				(path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
			} while (0);
			fd = /*Error: Function owner not recognized*/fopen(path[3], "rb");
			if (fd == (null)) {
				_uprintf("Caution: No '%s' was provided. The target will be missing a required Syslinux file!", path[3]);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fd);
					if (CopyFileU(path[3], path, 1)) {
						_uprintf("Created '%s' (from '%s/%s-%s/%s') %s", path, "rufus_files", syslinux, embedded_sl_version_str[1], path[3], IsFileInDB(path[3]) ? "✓" : "✗");
					} else {
							_uprintf("Failed to create '%s': %s", path, WindowsErrorString());
					} 
			} 
		}  else if ((img_report.getReactos_path()[0] != 0)) {
			_uprintf("Setting up ReactOS...");
			syslinux_mboot = GetResource(hMainInstance, (LPSTR)((DWORD)((WORD)(true))), (LPSTR)((DWORD)((WORD)(true))), "mboot.c32", syslinux_mboot_len, 0);
			if (syslinux_mboot == (null)) {
				;
			} 
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(path, /*Error: sizeof expression not supported yet*/, "%C:\\%s", drive_letter, mboot_c32);
				(path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
			} while (/* Create mboot.c32 file */0);
			f_handle = /*Error: Function owner not recognized*/CreateFileA(path, -1024 | -1024, -1024 | -1024, (null), 2, -1024, (null));
			if (f_handle == (HANDLE)(true)) {
				_uprintf("Unable to create '%s'\n", path);
				;
			} 
			if (!WriteFileWithRetry(f_handle, syslinux_mboot, syslinux_mboot_len, bytes_written, 4)) {
				_uprintf("Could not write '%s'", path);
				;
			} 
			do {
				if ((f_handle != (HANDLE)(true)) && (f_handle != (null))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(f_handle);
					f_handle = (HANDLE)(true);
				} 
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snprintf(path, /*Error: sizeof expression not supported yet*/, "%C:\\syslinux.cfg", drive_letter);
				(path)[(/*Error: sizeof expression not supported yet*/) - 1] = 0;
			} while (0);
			fd = /*Error: Function owner not recognized*/fopen(path, "w");
			if (fd == (null)) {
				_uprintf("Could not create ReactOS 'syslinux.cfg'");
				;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fd, /* Write the syslinux.cfg for ReactOS */"DEFAULT ReactOS\nLABEL ReactOS\n  KERNEL %s\n  APPEND %s", mboot_c32, img_report.getReactos_path());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fd);
		} 
		if (boot_type != boot_type.BT_IMAGE) {
			UpdateProgress(action_type.OP_FILE_COPY, -1.0);
		} 
		r = 1;
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)syslinux_ldlinux[0]);
			syslinux_ldlinux[0] = (null);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)syslinux_ldlinux[1]);
			syslinux_ldlinux[1] = (null);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)sectors);
			sectors = (null);
		} while (0);
		do {
			if ((d_handle != (HANDLE)(true)) && (d_handle != (null))) {
				UnlockDrive(d_handle);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(d_handle);
				d_handle = (HANDLE)(true);
			} 
		} while (0);
		do {
			if ((f_handle != (HANDLE)(true)) && (f_handle != (null))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(f_handle);
				f_handle = (HANDLE)(true);
			} 
		} while (0);
		return r;
	}
	private static void syslinux_reset_adv(Byte advbuf) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(advbuf + 2 * 4, 0, (512 - 3 * /* Create an all-zero ADV */4));
		cleanup_adv(advbuf);
	}
	/* Tail signature */
	public static void cleanup_adv(Byte advbuf) {
		int i;
		uint32_t csum = new uint32_t();
		set_32((uint32_t)advbuf, /* Make sure both copies agree, and update the checksum */-1024);
		csum = -1024;
		for (i = 8; i < 512 - 4; i += 4) {
			csum -= get_32((uint32_t)(advbuf + i));
		}
		set_32((uint32_t)(advbuf + 4), csum);
		set_32((uint32_t)(advbuf + 512 - 4), -1024);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(advbuf + 512, advbuf, 512);
	}
	/* ----------------------------------------------------------------------- *
	 *
	 *   Copyright 1998-2011 H. Peter Anvin - All Rights Reserved
	 *   Copyright 2009-2011 Intel Corporation; author H. Peter Anvin
	 *   Copyright 2011 Paulo Alcantara <pcacjr@gmail.com>
	 *
	 *   This program is free software; you can redistribute it and/or modify
	 *   it under the terms of the GNU General Public License as published by
	 *   the Free Software Foundation, Inc., 53 Temple Place Ste 330,
	 *   Boston MA 02111-1307, USA; either version 2 of the License, or
	 *   (at your option) any later version; incorporated herein by reference.
	 *
	 * ----------------------------------------------------------------------- */
	/*
	 * fs.c - Generic sanity check for FAT/NTFS-based installers
	 */
	/* Required on glibc 2.x */
	/* glibc 2.20 deprecates _BSD_SOURCE in favour of _DEFAULT_SOURCE */
	private static void syslinux_make_bootsect(Object bs, int fs_type) {
		Object[] generatedBsJump = bootsect.getBsJump();
		 generatedBs32 = bootsect.getBs32();
		Object generatedCode = generatedBs32.getCode();
		if (fs_type == filesystem.VFAT) {
			fat_boot_sector bootsect = bs;
			fat_boot_sector sbs = (fat_boot_sector)syslinux_ldlinux[1];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBsJump, generatedBsJump, ((size_t)((fat_boot_sector)0).getBsBytesPerSec()));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedCode, generatedCode, (((size_t)((fat_boot_sector)0).getBsSignature()) - ((size_t)generatedCode)));
		}  else if (fs_type == filesystem.NTFS) {
			ntfs_boot_sector bootsect = bs;
			ntfs_boot_sector sbs = (ntfs_boot_sector)syslinux_ldlinux[1];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBsJump, generatedBsJump, ((size_t)((ntfs_boot_sector)0).getBsOemName()));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedCode, generatedCode, (((size_t)((ntfs_boot_sector)0).getBsSignature()) - ((size_t)generatedCode)));
		} 
	}
}
