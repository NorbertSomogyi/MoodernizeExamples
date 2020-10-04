package application;

public class Iso9660_set_pvdToIso9660_set_ltime {
	
	
	private static void iso9660_set_pvd(Object pd, Object volume_id, Object publisher_id, Object preparer_id, Object application_id, Object iso_size, Object root_dir, Object path_table_l_extent, Object path_table_m_extent, Object path_table_size, Object pvd_time) {
		 ipd = new ();
		tm temp_tm = new tm();
		((/*Error: Unsupported expression*/ == ISO_BLOCKSIZE) ? null : /*Error: Function owner not recognized*/_assert("sizeof(iso9660_pvd_t) == ISO_BLOCKSIZE", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 626));
		((pd != (null)) ? null : /*Error: Function owner not recognized*/_assert("pd != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 628));
		((volume_id != (null)) ? null : /*Error: Function owner not recognized*/_assert("volume_id != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 629));
		((application_id != (null)) ? null : /*Error: Function owner not recognized*/_assert("application_id != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 630));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ipd, 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(((byte)ipd) + ISO_XA_MARKER_OFFSET, ModernizedCProgram.ISO_XA_MARKER_STRING, /* magic stuff ... thatis CD XA marker... */8);
		ipd.setType(/*Error: Function owner not recognized*/to_711(ISO_VD_PRIMARY));
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getId(), ModernizedCProgram.ISO_STANDARD_ID, 5, ISO9660_DCHARS);
		ipd.setVersion(/*Error: Function owner not recognized*/to_711(1));
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getSystem_id(), "CD-RTOS CD-BRIDGE", 32, ISO9660_ACHARS);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getVolume_id(), volume_id, 32, ISO9660_DCHARS);
		ipd.setVolume_space_size(ModernizedCProgram.to_733(iso_size));
		ipd.setVolume_set_size(ModernizedCProgram.to_723(1));
		ipd.setVolume_sequence_number(ModernizedCProgram.to_723(1));
		ipd.setLogical_block_size(ModernizedCProgram.to_723(ISO_BLOCKSIZE));
		ipd.setPath_table_size(ModernizedCProgram.to_733(path_table_size));
		ipd.setType_l_path_table(/*Error: Function owner not recognized*/to_731(path_table_l_extent));
		ipd.setType_m_path_table(/*Error: Function owner not recognized*/to_732(path_table_m_extent));
		((/*Error: sizeof expression not supported yet*/ == 33) ? null : /*Error: Function owner not recognized*/_assert("sizeof(ipd.root_directory_record) == 33", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", /* root_directory_record doesn't contain the 1-byte filename,
		     so we add one for that. */656));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((ipd.getRoot_directory_record()), root_dir, /*Error: sizeof expression not supported yet*/);
		ipd.setRoot_directory_filename((byte)'\0');
		ipd.getRoot_directory_record().setLength(/*Error: sizeof expression not supported yet*/ + 1);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getVolume_set_id(), "", ISO_MAX_VOLUMESET_ID, ISO9660_DCHARS);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getPublisher_id(), publisher_id, ISO_MAX_PUBLISHER_ID, ISO9660_ACHARS);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getPreparer_id(), preparer_id, ISO_MAX_PREPARER_ID, ISO9660_ACHARS);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getApplication_id(), application_id, ISO_MAX_APPLICATION_ID, ISO9660_ACHARS);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getCopyright_file_id(), "", 37, ISO9660_DCHARS);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getAbstract_file_id(), "", 37, ISO9660_DCHARS);
		ModernizedCProgram.iso9660_strncpy_pad(ipd.getBibliographic_file_id(), "", 37, ISO9660_DCHARS);
		temp_tm.gmtime_r(pvd_time);
		ModernizedCProgram.iso9660_set_ltime(temp_tm, (ipd.getCreation_date()));
		temp_tm.gmtime_r(pvd_time);
		ModernizedCProgram.iso9660_set_ltime(temp_tm, (ipd.getModification_date()));
		ModernizedCProgram.iso9660_set_ltime((null), (ipd.getExpiration_date()));
		ModernizedCProgram.iso9660_set_ltime((null), (ipd.getEffective_date()));
		ipd.setFile_structure_version(/*Error: Function owner not recognized*/to_711(1));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pd, ipd, /*Error: sizeof expression not supported yet*/);
	}
	public static Byte iso9660_strncpy_pad(Byte dst, Object[] src, Object len, Object _check) {
		size_t rlen = new size_t();
		((dst != (null)) ? null : /*Error: Function owner not recognized*/_assert("dst != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 499));
		((src != (null)) ? null : /*Error: Function owner not recognized*/_assert("src != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 500));
		((len > 0) ? null : /*Error: Function owner not recognized*/_assert("len > 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 501));
		switch (_check) {
		case ISO9660_DCHARS:
				for (idx = 0; src[idx]; idx++) {
					if (!ModernizedCProgram.iso9660_is_dchar(src[idx])) {
						ModernizedCProgram.cdio_warn("string '%s' fails d-character constraint (pos = %d)", src, idx);
						break;
					} 
				}
				break;
		case ISO9660_NOCHECK:
				break;
		case ISO9660_ACHARS:
				for (idx = 0; src[idx]; idx++) {
					if (!ModernizedCProgram.iso9660_is_achar(src[idx])) {
						ModernizedCProgram.cdio_warn("string '%s' fails a-character constraint (pos = %d)", src, idx);
						break;
					} 
				}
				break;
		case ISO9660_7BIT:
				for (idx = 0; src[idx]; idx++) {
					if (()src[idx] < 0) {
						ModernizedCProgram.cdio_warn("string '%s' fails 7bit constraint (pos = %d)", src, idx);
						break;
					} 
				}
				break;
		default:
				((false) ? null : /*Error: Function owner not recognized*/_assert("0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 540));
				break;
		}
		rlen = /*Error: Function owner not recognized*/strlen(src);
		if (rlen > len) {
			ModernizedCProgram.cdio_warn("string '%s' is getting truncated to %d characters", src, (int)len);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(dst, src, len);
		if (rlen < len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dst + rlen, (byte)' ', len - rlen);
		} 
		return dst/*!
		   Return true if c is a DCHAR - a valid ISO-9660 level 1 character.
		   These are the ASCSII capital letters A-Z, the digits 0-9 and an
		   underscore.
		*/;
	}
	public static tm gmtime_r(Object timer) {
		tm tmp = /*Error: Function owner not recognized*/gmtime(timer);
		if (tmp) {
			result = tmp;
			return result;
		} 
		return tmp;
	}
	/*out*/
	private static void iso9660_set_ltime(Object p_tm, Object pvd_date) {
		int time_zone = 0;
		if (p_tm/* Set time zone in 15-minute interval encoding. */) {
			time_zone = (p_tm.getTm_isdst() > 0) ? -60 : 0;
		} 
		ModernizedCProgram.iso9660_set_ltime_with_timezone(p_tm, time_zone, pvd_date/*!
		   Convert an ISO-9660 file name which is in the format usually stored
		   in a ISO 9660 directory entry into what's usually listed as the
		   file name in a listing.  Lowercase name, and remove trailing ;1's
		   or .;1's and turn the other ;'s into version numbers.
		
		   @param psz_oldname the ISO-9660 filename to be translated.
		   @param psz_newname returned string. The caller allocates this and
		   it should be at least the size of psz_oldname.
		   @return length of the translated string is returned. It will be no greater
		   than the length of psz_oldname.
		*/);
	}
}
