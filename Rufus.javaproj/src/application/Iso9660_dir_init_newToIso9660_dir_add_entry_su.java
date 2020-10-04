package application;

public class Iso9660_dir_init_newToIso9660_dir_add_entry_su {
	
	
	private static void iso9660_dir_init_new(Object dir, Object self, Object ssize, Object parent, Object psize, Object dir_time) {
		ModernizedCProgram.iso9660_dir_init_new_su(dir, self, ssize, (null), 0, parent, psize, (null), 0, dir_time);
	}
	private static void iso9660_dir_init_new_su(Object dir, Object self, Object ssize, Object ssu_data, int ssu_size, Object parent, Object psize, Object psu_data, int psu_size, Object dir_time) {
		((ssize > 0 && !(ssize % ISO_BLOCKSIZE)) ? null : /*Error: Function owner not recognized*/_assert("ssize > 0 && !(ssize % ISO_BLOCKSIZE)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 816));
		((psize > 0 && !(psize % ISO_BLOCKSIZE)) ? null : /*Error: Function owner not recognized*/_assert("psize > 0 && !(psize % ISO_BLOCKSIZE)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 817));
		((dir != (null)) ? null : /*Error: Function owner not recognized*/_assert("dir != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 818));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dir, 0, ssize);
		ModernizedCProgram.iso9660_dir_add_entry_su(dir, "\0", self, ssize, ISO_DIRECTORY, /* "\0" -- working hack due to padding  */ssu_data, ssu_size, dir_time);
		ModernizedCProgram.iso9660_dir_add_entry_su(dir, "\1", parent, psize, ISO_DIRECTORY, psu_data, psu_size, dir_time);
	}
	private static void iso9660_dir_add_entry_su(Object dir, Object filename, Object extent, Object size, Object file_flags, Object su_data, int su_size, Object entry_time) {
		 idr = dir;
		[] dir8 = dir;
		int offset = 0;
		 dsize = ModernizedCProgram.from_733(idr.getSize());
		int length;
		int su_offset;
		tm temp_tm = new tm();
		((/*Error: Unsupported expression*/ == 33) ? null : /*Error: Function owner not recognized*/_assert("sizeof(iso9660_dir_t) == 33", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 721));
		if (!dsize && !idr.getLength()) {
			dsize = /* for when dir lacks '.' entry */ISO_BLOCKSIZE;
		} 
		((dsize > 0 && !(dsize % ISO_BLOCKSIZE)) ? null : /*Error: Function owner not recognized*/_assert("dsize > 0 && !(dsize % ISO_BLOCKSIZE)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 726));
		((dir != (null)) ? null : /*Error: Function owner not recognized*/_assert("dir != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 727));
		((extent > 17) ? null : /*Error: Function owner not recognized*/_assert("extent > 17", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 728));
		((filename != (null)) ? null : /*Error: Function owner not recognized*/_assert("filename != ((void *)0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 729));
		((/*Error: Function owner not recognized*/strlen(filename) <= MAX_ISOPATHNAME) ? null : /*Error: Function owner not recognized*/_assert("strlen(filename) <= MAX_ISOPATHNAME", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 730));
		length = /*Error: Unsupported expression*/;
		length += /*Error: Function owner not recognized*/strlen(filename);
		length = ModernizedCProgram._cdio_ceil2block(length, /* pad to word boundary */2);
		su_offset = length;
		length += su_size;
		length = ModernizedCProgram._cdio_ceil2block(length, /* pad to word boundary again */2);
		{ 
			int ofs_last_rec = /* find the last entry's end */0;
			offset = 0;
			while (offset < dsize) {
				if (!dir8[offset]) {
					offset++;
					continue;
				} 
				offset += dir8[offset];
				ofs_last_rec = offset;
			}
			((offset == dsize) ? null : /*Error: Function owner not recognized*/_assert("offset == dsize", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 756));
			offset = ofs_last_rec;
		}
		offset = ModernizedCProgram._cdio_ofs_add(offset, length, /* be sure we don't cross sectors boundaries */ISO_BLOCKSIZE);
		offset -= length;
		((offset + length <= dsize) ? null : /*Error: Function owner not recognized*/_assert("offset + length <= dsize", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 765));
		idr = ()dir8[offset];
		((offset + length < dsize) ? null : /*Error: Function owner not recognized*/_assert("offset+length < dsize", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\iso9660.c", 769));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(idr, 0, length);
		idr.setLength(/*Error: Function owner not recognized*/to_711(length));
		idr.setExtent(ModernizedCProgram.to_733(extent));
		idr.setSize(ModernizedCProgram.to_733(size));
		temp_tm.gmtime_r(entry_time);
		ModernizedCProgram.iso9660_set_dtime(temp_tm, (idr.getRecording_time()));
		idr.setFile_flags(/*Error: Function owner not recognized*/to_711(file_flags));
		idr.setVolume_sequence_number(ModernizedCProgram.to_723(1));
		idr.getFilename().setLen(/*Error: Function owner not recognized*/to_711(/*Error: Function owner not recognized*/strlen(filename) ? /*Error: Function owner not recognized*/strlen(filename) : /* working hack! */1));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(idr.getFilename().getStr()[1], filename, /*Error: Function owner not recognized*/from_711(idr.getFilename().getLen()));
		if (su_size > 0 && su_data) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dir8[offset] + su_offset, su_data, su_size);
		} 
	}
}
