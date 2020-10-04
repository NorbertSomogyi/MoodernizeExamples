package application;

/* now internal definition, only for zip.c and unzip.h */
public class zlib_filefunc64_32_def_s {
	private zlib_filefunc64_def_s zfile_func64;
	private Object zopen32_file;
	private Object ztell32_file;
	private Object zseek32_file;
	
	public zlib_filefunc64_32_def_s(zlib_filefunc64_def_s zfile_func64, Object zopen32_file, Object ztell32_file, Object zseek32_file) {
		setZfile_func64(zfile_func64);
		setZopen32_file(zopen32_file);
		setZtell32_file(ztell32_file);
		setZseek32_file(zseek32_file);
	}
	public zlib_filefunc64_32_def_s() {
	}
	
	/************************************************************/
	public Object zipOpen3(Object pathname, int append, Object globalcomment) {
		zip64_internal ziinit = new zip64_internal();
		zip64_internal zi = new zip64_internal();
		int err = (false);
		Object generatedZ_filefunc = ziinit.getZ_filefunc();
		generatedZ_filefunc.setZseek32_file((null));
		generatedZ_filefunc.setZtell32_file((null));
		if (pzlib_filefunc64_32_def == (null)) {
			generatedZ_filefunc.getZfile_func64().fill_fopen64_filefunc();
		} else {
				ziinit.setZ_filefunc(pzlib_filefunc64_32_def);
		} 
		ziinit.setFilestream((ModernizedCProgram.call_zopen64(((generatedZ_filefunc)), (pathname), ((append == (false)) ? ((true) | (true) | (true)) : ((true) | (true) | (true))))));
		Object generatedFilestream = ziinit.getFilestream();
		if (generatedFilestream == (null)) {
			return (null);
		} 
		if (append == (true)) {
			(ModernizedCProgram.call_zseek64(((generatedZ_filefunc)), (generatedFilestream), (false), (true)));
		} 
		ziinit.setBegin_pos((ModernizedCProgram.call_ztell64(((generatedZ_filefunc)), (generatedFilestream))));
		ziinit.setIn_opened_file_inzip(0);
		Object generatedCi = ziinit.getCi();
		generatedCi.setStream_initialised(0);
		ziinit.setNumber_entry(0);
		ziinit.setAdd_position_when_writing_offset(0);
		Object generatedCentral_dir = ziinit.getCentral_dir();
		(generatedCentral_dir).init_linkedlist();
		zi = (zip64_internal)(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/));
		if (zi == (null)) {
			(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((generatedZ_filefunc).getZfile_func64().getOpaque(), generatedFilestream));
			return (null);
		} 
		ziinit.setGlobalcomment((null));
		if (append == (true)) {
			err = ziinit.LoadCentralDirectoryRecord();
		} 
		Object generatedGlobalcomment = ziinit.getGlobalcomment();
		if (globalcomment) {
			globalcomment = generatedGlobalcomment;
		} 
		if (err != (/* !NO_ADDFILEINEXISTINGZIP*/false)) {
			{ 
				if (generatedGlobalcomment) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedGlobalcomment);
				} 
			}
			;
			{ 
				if (zi) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(/* !NO_ADDFILEINEXISTINGZIP*/zi);
				} 
			}
			;
			return (null);
		} else {
				zi = ziinit;
				return (zipFile)zi;
		} 
	}
	public Object unzOpenInternal(Object path, int is64bitOpenFunction) {
		unz64_s us = new unz64_s();
		unz64_s s = new unz64_s();
		ZPOS64_T central_pos = new ZPOS64_T();
		uLong uL = new uLong();
		/* number of the current dist, used for
		                                   spaning ZIP, unsupported, always 0*/uLong number_disk = new uLong();
		/* number the the disk with central dir, used
		                                   for spaning ZIP, unsupported, always 0*/uLong number_disk_with_CD = new uLong();
		/* total number of entries in
		                                   the central dir
		                                   (same than number_entry on nospan) */ZPOS64_T number_entry_CD = new ZPOS64_T();
		int err = (false);
		if (ModernizedCProgram.unz_copyright[0] != (byte)' ') {
			return (null);
		} 
		Object generatedZ_filefunc = us.getZ_filefunc();
		generatedZ_filefunc.setZseek32_file((null));
		generatedZ_filefunc.setZtell32_file((null));
		if (pzlib_filefunc64_32_def == (null)) {
			generatedZ_filefunc.getZfile_func64().fill_fopen64_filefunc();
		} else {
				us.setZ_filefunc(pzlib_filefunc64_32_def);
		} 
		us.setIs64bitOpenFunction(is64bitOpenFunction);
		us.setFilestream((ModernizedCProgram.call_zopen64(((generatedZ_filefunc)), (path), ((true) | (true)))));
		Object generatedFilestream = us.getFilestream();
		if (generatedFilestream == (null)) {
			return (null);
		} 
		central_pos = ModernizedCProgram.unz64local_SearchCentralDir64(generatedZ_filefunc, generatedFilestream);
		Object generatedGi = us.getGi();
		Object generatedSize_central_dir = us.getSize_central_dir();
		Object generatedOffset_central_dir = us.getOffset_central_dir();
		if (central_pos) {
			uLong uS = new uLong();
			ZPOS64_T uL64 = new ZPOS64_T();
			us.setIsZip64(1);
			if ((ModernizedCProgram.call_zseek64(((generatedZ_filefunc)), (generatedFilestream), (central_pos), ((false)))) != 0) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getLong(generatedZ_filefunc, generatedFilestream, uL) != (/* the signature, already checked */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getLong64(generatedZ_filefunc, generatedFilestream, uL64) != (/* size of zip64 end of central directory record */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getShort(generatedZ_filefunc, generatedFilestream, uS) != (/* version made by */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getShort(generatedZ_filefunc, generatedFilestream, uS) != (/* version needed to extract */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getLong(generatedZ_filefunc, generatedFilestream, number_disk) != (/* number of this disk */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getLong(generatedZ_filefunc, generatedFilestream, number_disk_with_CD) != (/* number of the disk with the start of the central directory */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getLong64(generatedZ_filefunc, generatedFilestream, generatedGi.getNumber_entry()) != (/* total number of entries in the central directory on this disk */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getLong64(generatedZ_filefunc, generatedFilestream, number_entry_CD) != (/* total number of entries in the central directory */false)) {
				err = ((true));
			} 
			if ((number_entry_CD != generatedGi.getNumber_entry()) || (number_disk_with_CD != 0) || (number_disk != 0)) {
				err = (true);
			} 
			if (ModernizedCProgram.unz64local_getLong64(generatedZ_filefunc, generatedFilestream, generatedSize_central_dir) != (/* size of the central directory */false)) {
				err = ((true));
			} 
			if (ModernizedCProgram.unz64local_getLong64(generatedZ_filefunc, generatedFilestream, generatedOffset_central_dir) != (/* offset of start of central directory with respect to the
			          starting disk number */false)) {
				err = ((true));
			} 
			generatedGi.setSize_comment(0);
		} else {
				central_pos = ModernizedCProgram.unz64local_SearchCentralDir(generatedZ_filefunc, generatedFilestream);
				if (central_pos == 0) {
					err = ((true));
				} 
				us.setIsZip64(0);
				if ((ModernizedCProgram.call_zseek64(((generatedZ_filefunc)), (generatedFilestream), (central_pos), ((false)))) != 0) {
					err = ((true));
				} 
				if (ModernizedCProgram.unz64local_getLong(generatedZ_filefunc, generatedFilestream, uL) != (/* the signature, already checked */false)) {
					err = ((true));
				} 
				if (ModernizedCProgram.unz64local_getShort(generatedZ_filefunc, generatedFilestream, number_disk) != (/* number of this disk */false)) {
					err = ((true));
				} 
				if (ModernizedCProgram.unz64local_getShort(generatedZ_filefunc, generatedFilestream, number_disk_with_CD) != (/* number of the disk with the start of the central directory */false)) {
					err = ((true));
				} 
				if (ModernizedCProgram.unz64local_getShort(generatedZ_filefunc, generatedFilestream, uL) != (/* total number of entries in the central dir on this disk */false)) {
					err = ((true));
				} 
				generatedGi.setNumber_entry(uL);
				if (ModernizedCProgram.unz64local_getShort(generatedZ_filefunc, generatedFilestream, uL) != (/* total number of entries in the central dir */false)) {
					err = ((true));
				} 
				number_entry_CD = uL;
				if ((number_entry_CD != generatedGi.getNumber_entry()) || (number_disk_with_CD != 0) || (number_disk != 0)) {
					err = (true);
				} 
				if (ModernizedCProgram.unz64local_getLong(generatedZ_filefunc, generatedFilestream, uL) != (/* size of the central directory */false)) {
					err = ((true));
				} 
				us.setSize_central_dir(uL);
				if (ModernizedCProgram.unz64local_getLong(generatedZ_filefunc, generatedFilestream, uL) != (/* offset of start of central directory with respect to the
				            starting disk number */false)) {
					err = ((true));
				} 
				us.setOffset_central_dir(uL);
				if (ModernizedCProgram.unz64local_getShort(generatedZ_filefunc, generatedFilestream, generatedGi.getSize_comment()) != (/* zipfile comment length */false)) {
					err = ((true));
				} 
		} 
		if ((central_pos < generatedOffset_central_dir + generatedSize_central_dir) && (err == (false))) {
			err = (true);
		} 
		if (err != (false)) {
			(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((generatedZ_filefunc).getZfile_func64().getOpaque(), generatedFilestream));
			return (null);
		} 
		us.setByte_before_the_zipfile(central_pos - (generatedOffset_central_dir + generatedSize_central_dir));
		us.setCentral_pos(central_pos);
		us.setPfile_in_zip_read((null));
		us.setEncrypted(0);
		s = (unz64_s)(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/));
		if (s != (null)) {
			s = us;
			ModernizedCProgram.unzGoToFirstFile((unzFile)s);
		} 
		return (unzFile)s;
	}
	public void fill_zlib_filefunc64_32_def_from_filefunc32(Object p_filefunc32) {
		zlib_filefunc64_def_s generatedZfile_func64 = this.getZfile_func64();
		generatedZfile_func64.setZopen64_file((null));
		this.setZopen32_file(p_filefunc32.getZopen_file());
		generatedZfile_func64.setZerror_file(p_filefunc32.getZerror_file());
		generatedZfile_func64.setZread_file(p_filefunc32.getZread_file());
		generatedZfile_func64.setZwrite_file(p_filefunc32.getZwrite_file());
		generatedZfile_func64.setZtell64_file((null));
		generatedZfile_func64.setZseek64_file((null));
		generatedZfile_func64.setZclose_file(p_filefunc32.getZclose_file());
		generatedZfile_func64.setZerror_file(p_filefunc32.getZerror_file());
		generatedZfile_func64.setOpaque(p_filefunc32.getOpaque());
		this.setZseek32_file(p_filefunc32.getZseek_file());
		this.setZtell32_file(p_filefunc32.getZtell_file());
	}
	public zlib_filefunc64_def_s getZfile_func64() {
		return zfile_func64;
	}
	public void setZfile_func64(zlib_filefunc64_def_s newZfile_func64) {
		zfile_func64 = newZfile_func64;
	}
	public Object getZopen32_file() {
		return zopen32_file;
	}
	public void setZopen32_file(Object newZopen32_file) {
		zopen32_file = newZopen32_file;
	}
	public Object getZtell32_file() {
		return ztell32_file;
	}
	public void setZtell32_file(Object newZtell32_file) {
		ztell32_file = newZtell32_file;
	}
	public Object getZseek32_file() {
		return zseek32_file;
	}
	public void setZseek32_file(Object newZseek32_file) {
		zseek32_file = newZseek32_file;
	}
}
