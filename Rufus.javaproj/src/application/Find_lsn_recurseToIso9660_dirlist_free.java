package application;

public class Find_lsn_recurseToIso9660_dirlist_free {
	
	
	private static Object find_lsn_recurse(Object p_image, Object iso9660_readdir, Object psz_path, Object lsn, Byte ppsz_full_filename) {
		 entlist = /*Error: Function owner not recognized*/iso9660_readdir(p_image, /*out*/psz_path);
		 dirlist = iso9660_filelist_new();
		 entnode = new ();
		((entlist != NULL) ? null : /*Error: Function owner not recognized*/_assert("entlist != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660_fs.c", 1562));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_CDIO_LIST_FOREACH(entnode, /* iterate over each entry in the directory */entlist);
		{ 
			 statbuf = _cdio_list_node_data(entnode);
			Byte psz_filename = (byte)statbuf.getFilename();
			int len = /*Error: Function owner not recognized*/strlen(psz_path) + /*Error: Function owner not recognized*/strlen(psz_filename) + 2;
			 extent = new ();
			if (ppsz_full_filename != NULL) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ppsz_full_filename);
			} 
			ppsz_full_filename = /*Error: Function owner not recognized*/calloc(1, len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(ppsz_full_filename, len, "%s%s/", psz_path, psz_filename);
			if (statbuf.getType() == _STAT_DIR && /*Error: Function owner not recognized*/strcmp((byte)statbuf.getFilename(), ".") && /*Error: Function owner not recognized*/strcmp((byte)statbuf.getFilename(), "..")) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(ppsz_full_filename, len, "%s%s/", psz_path, psz_filename);
				_cdio_list_append(dirlist, /*Error: Function owner not recognized*/strdup(ppsz_full_filename));
			} 
			for (extent = 0; extent < statbuf.getExtents(); extent++) {
				if (statbuf.getLsn()[extent] == lsn) {
					int len2 = /*Error: Unsupported expression*/ + /*Error: Function owner not recognized*/strlen(statbuf.getFilename()) + 1;
					 ret_stat = /*Error: Function owner not recognized*/calloc(1, len2);
					if (!ret_stat) {
						iso9660_dirlist_free(dirlist);
						cdio_warn("Couldn't calloc(1, %d)", len2);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ppsz_full_filename);
						ppsz_full_filename = NULL;
						return NULL;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ret_stat, statbuf, len2);
					iso9660_filelist_free(entlist);
					iso9660_dirlist_free(dirlist);
					return ret_stat;
				} 
			}
		}
		iso9660_filelist_free(entlist);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_CDIO_LIST_FOREACH(entnode, /* now recurse/descend over directories encountered */dirlist);
		{ 
			Byte psz_path_prefix = _cdio_list_node_data(entnode);
			 ret_stat = new ();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ppsz_full_filename);
			ppsz_full_filename = NULL;
			ret_stat = find_lsn_recurse(p_image, iso9660_readdir, psz_path_prefix, lsn, ppsz_full_filename);
			if (NULL != ret_stat) {
				iso9660_dirlist_free(dirlist);
				return ret_stat;
			} 
		}
		if (ppsz_full_filename != NULL) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ppsz_full_filename);
			ppsz_full_filename = NULL;
		} 
		iso9660_dirlist_free(dirlist);
		return NULL/*!
		   Given a directory pointer, find the filesystem entry that contains
		   lsn and return information about it.
		
		   Returns stat_t of entry if we found lsn, or NULL otherwise.
		 */;
	}
	public static void iso9660_filelist_free(Object p_filelist) {
		_cdio_list_free(p_filelist, true, ()iso9660_stat_free/*!
		  Free the passed CdioISOC9660DirList_t structure.
		*/);
	}
	private static void _cdio_list_free(Object p_list, int free_data, Object free_fn) {
		while (_cdio_list_length(p_list)) {
			_cdio_list_node_free(_cdio_list_begin(p_list), free_data, free_fn);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(p_list);
	}
	private static void iso9660_dirlist_free(Object p_filelist) {
		_cdio_list_free(p_filelist, true, free/*!
		  Return true if ISO 9660 image has extended attrributes (XA).
		*/);
	}
}
