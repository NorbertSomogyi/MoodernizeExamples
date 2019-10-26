package application;

public class libfat_filesystem {
	private Object read;
	private Object readptr;
	private fat_type fat_type;
	private int clustsize;
	private int clustshift;
	private Object endcluster;
	private Object rootcluster;
	private Object fat;
	private Object rootdir;
	private Object data;
	private Object end;
	private libfat_sector sectors;
	
	public libfat_filesystem(Object read, Object readptr, fat_type fat_type, int clustsize, int clustshift, Object endcluster, Object rootcluster, Object fat, Object rootdir, Object data, Object end, libfat_sector sectors) {
		setRead(read);
		setReadptr(readptr);
		setFat_type(fat_type);
		setClustsize(clustsize);
		setClustshift(clustshift);
		setEndcluster(endcluster);
		setRootcluster(rootcluster);
		setFat(fat);
		setRootdir(rootdir);
		setData(data);
		setEnd(end);
		setSectors(sectors);
	}
	public libfat_filesystem() {
	}
	
	public libfat_filesystem libfat_open(Object readfunc, Object readptr) {
		libfat_filesystem fs = ((Object)0);
		fat_bootsect bs = new fat_bootsect();
		int i;
		uint32_t sectors = new uint32_t();
		uint32_t fatsize = new uint32_t();
		uint32_t minfatsize = new uint32_t();
		uint32_t rootdirsize = new uint32_t();
		uint32_t nclusters = new uint32_t();
		fs = .malloc();
		if (!fs) {
			;
		} 
		fs.setSectors(((Object)0));
		fs.setRead(readfunc);
		fs.setReadptr(readptr);
		bs = fs.libfat_get_sector(0);
		if (!bs) {
			;
		} 
		Object generatedBsBytesPerSec = bs.getBsBytesPerSec();
		if (ModernizedCProgram.read16(generatedBsBytesPerSec) != ModernizedCProgram.LIBFAT_SECTOR_SIZE) {
			;
		} 
		Object generatedBsSecPerClust = bs.getBsSecPerClust();
		for (i = 0; i <= 8; i++) {
			if ((uint8_t)(1 << i) == ModernizedCProgram.read8(generatedBsSecPerClust)) {
				break;
			} 
		}
		if (i > 8) {
			;
		} 
		fs.setClustsize(1 << /* Treat 0 as 2^8 = 64K */i);
		fs.setClustshift(i);
		Object generatedBsSectors = bs.getBsSectors();
		sectors = ModernizedCProgram.read16(generatedBsSectors);
		Object generatedBsHugeSectors = bs.getBsHugeSectors();
		if (!sectors) {
			sectors = ModernizedCProgram.read32(generatedBsHugeSectors);
		} 
		fs.setEnd(sectors);
		Object generatedBsResSectors = bs.getBsResSectors();
		fs.setFat(ModernizedCProgram.read16(generatedBsResSectors));
		Object generatedBsFATsecs = bs.getBsFATsecs();
		fatsize = ModernizedCProgram.read16(generatedBsFATsecs);
		 generatedU = bs.getU();
		Object generatedFat32 = generatedU.getFat32();
		if (!fatsize) {
			fatsize = ModernizedCProgram.read32(generatedFat32.getBpb_fatsz32());
		} 
		Object generatedFat = fs.getFat();
		Object generatedBsFATs = bs.getBsFATs();
		fs.setRootdir(generatedFat + fatsize * ModernizedCProgram.read8(generatedBsFATs));
		Object generatedBsRootDirEnts = bs.getBsRootDirEnts();
		rootdirsize = ((ModernizedCProgram.read16(generatedBsRootDirEnts) << 5) + ModernizedCProgram.LIBFAT_SECTOR_MASK) >> ModernizedCProgram.LIBFAT_SECTOR_SHIFT;
		Object generatedRootdir = fs.getRootdir();
		fs.setData(generatedRootdir + rootdirsize);
		Object generatedData = fs.getData();
		Object generatedEnd = fs.getEnd();
		if (generatedData >= generatedEnd) {
			;
		} 
		int generatedClustshift = fs.getClustshift();
		nclusters = (generatedEnd - generatedData) >> generatedClustshift;
		fs.setEndcluster(nclusters + 2);
		Object generatedEndcluster = fs.getEndcluster();
		if (nclusters <= -1024) {
			fs.setFat_type(fat_type.FAT12);
			minfatsize = generatedEndcluster + (generatedEndcluster >> 1);
		}  else if (nclusters <= -1024) {
			fs.setFat_type(fat_type.FAT16);
			minfatsize = generatedEndcluster << 1;
		}  else if (nclusters <= -1024) {
			fs.setFat_type(fat_type.FAT28);
			minfatsize = generatedEndcluster << 2;
		} else {
				;
		} 
		minfatsize = (minfatsize + ModernizedCProgram.LIBFAT_SECTOR_SIZE - 1) >> ModernizedCProgram.LIBFAT_SECTOR_SHIFT;
		if (minfatsize > fatsize) {
			;
		} 
		fat_type generatedFat_type = fs.getFat_type();
		if (generatedFat_type == fat_type.FAT28) {
			fs.setRootcluster(ModernizedCProgram.read32(generatedFat32.getBpb_rootclus()));
		} else {
				fs.setRootcluster(0);
		} 
		return /* All good */fs;
		return ((Object)0);
	}
	public void libfat_close() {
		fs.libfat_flush();
		.free(fs);
	}
	/* ----------------------------------------------------------------------- *
	 *
	 *   Copyright 2004-2008 H. Peter Anvin - All Rights Reserved
	 *
	 *   This program is free software; you can redistribute it and/or modify
	 *   it under the terms of the GNU General Public License as published by
	 *   the Free Software Foundation, Inc., 53 Temple Place Ste 330,
	 *   Boston MA 02111-1307, USA; either version 2 of the License, or
	 *   (at your option) any later version; incorporated herein by reference.
	 *
	 * ----------------------------------------------------------------------- */
	/*
	 * cache.c
	 *
	 * Simple sector cache
	 */
	/*
	 * NB: We need to align our sector buffers to at least the 8-byte mark, as some Windows
	 * disk devices, notably O2Micro PCI-E SD card readers, return ERROR_INVALID_PARAMETER
	 * when attempting to use ReadFile() against a non 8-byte aligned buffer.
	 * For good measure, we'll go further and align our buffers on a 16-byte boundary.
	 * Also, since struct libfat_sector's data[0] is our buffer, this means we must BOTH
	 * align that member in the struct declaration, and use aligned malloc/free.
	 */
	public Object libfat_get_sector(Object n) {
		libfat_sector ls = new libfat_sector();
		Object generatedN = ls.getN();
		Object generatedData = ls.getData();
		libfat_sector generatedNext = ls.getNext();
		libfat_sector generatedSectors = this.getSectors();
		for (ls = generatedSectors; ls; ls = generatedNext) {
			if (generatedN == n) {
				return generatedData;
			} 
		}
		ls = ._mm_malloc( + ModernizedCProgram.LIBFAT_SECTOR_SIZE, /* Not found in cache */16);
		if (!ls) {
			fs.libfat_flush();
			ls = ._mm_malloc( + ModernizedCProgram.LIBFAT_SECTOR_SIZE, 16);
			if (!ls) {
				return ((Object)/* Can't allocate memory */0);
			} 
		} 
		Object generatedReadptr = this.getReadptr();
		if (.UNRECOGNIZEDFUNCTIONNAME(generatedReadptr, generatedData, ModernizedCProgram.LIBFAT_SECTOR_SIZE, n) != ModernizedCProgram.LIBFAT_SECTOR_SIZE) {
			._mm_free(ls);
			return ((Object)/* I/O error */0);
		} 
		ls.setN(n);
		ls.setNext(generatedSectors);
		this.setSectors(ls);
		return generatedData;
	}
	public void libfat_flush() {
		libfat_sector ls = new libfat_sector();
		libfat_sector lsnext = new libfat_sector();
		libfat_sector generatedSectors = this.getSectors();
		lsnext = generatedSectors;
		this.setSectors(((Object)0));
		libfat_sector generatedNext = ls.getNext();
		for (ls = lsnext; ls; ls = lsnext) {
			lsnext = generatedNext;
			._mm_free(ls);
		}
	}
	public Object libfat_nextsector(Object s) {
		int32_t cluster = new int32_t();
		int32_t nextcluster = new int32_t();
		uint32_t fatoffset = new uint32_t();
		libfat_sector_t fatsect = new libfat_sector_t();
		uint8_t fsdata = new uint8_t();
		int generatedClustsize = this.getClustsize();
		uint32_t clustmask = generatedClustsize - 1;
		libfat_sector_t rs = new libfat_sector_t();
		Object generatedData = this.getData();
		Object generatedRootdir = this.getRootdir();
		if (s < generatedData) {
			if (s < generatedRootdir) {
				return -1;
			} 
			/* Root directory */s++;
			return (s < generatedData) ? s : 0;
		} 
		rs = s - generatedData;
		if (~rs & clustmask) {
			return s + /* Next sector in cluster */1;
		} 
		int generatedClustshift = this.getClustshift();
		cluster = 2 + (rs >> generatedClustshift);
		Object generatedEndcluster = this.getEndcluster();
		if (cluster >= generatedEndcluster) {
			return -1;
		} 
		Object generatedFat = this.getFat();
		fat_type generatedFat_type = this.getFat_type();
		switch (generatedFat_type) {
		case fat_type.FAT12:
				fatoffset = cluster + (cluster >> /* Get first byte */1);
				fatsect = generatedFat + (fatoffset >> ModernizedCProgram.LIBFAT_SECTOR_SHIFT);
				fsdata = fs.libfat_get_sector(fatsect);
				if (!fsdata) {
					return -1;
				} 
				nextcluster = fsdata[fatoffset & ModernizedCProgram.LIBFAT_SECTOR_MASK];
				/* Get second byte */fatoffset++;
				fatsect = generatedFat + (fatoffset >> ModernizedCProgram.LIBFAT_SECTOR_SHIFT);
				fsdata = fs.libfat_get_sector(fatsect);
				if (!fsdata) {
					return -1;
				} 
				nextcluster |=  fsdata[fatoffset & ModernizedCProgram.LIBFAT_SECTOR_MASK] << 8;
				if (cluster & /* Extract the FAT entry */1) {
					nextcluster >>=  4;
				} else {
						nextcluster &=  -1024;
				} 
				if (nextcluster >= -1024) {
					return 0;
				} 
				break;
		case fat_type.FAT16:
				fatoffset = cluster << 1;
				fatsect = generatedFat + (fatoffset >> ModernizedCProgram.LIBFAT_SECTOR_SHIFT);
				fsdata = fs.libfat_get_sector(fatsect);
				if (!fsdata) {
					return -1;
				} 
				nextcluster = ModernizedCProgram.read16((le16_t)fsdata[fatoffset & ModernizedCProgram.LIBFAT_SECTOR_MASK]);
				if (nextcluster >= -1024) {
					return 0;
				} 
				break;
		case fat_type.FAT28:
				fatoffset = cluster << 2;
				fatsect = generatedFat + (fatoffset >> ModernizedCProgram.LIBFAT_SECTOR_SHIFT);
				fsdata = fs.libfat_get_sector(fatsect);
				if (!fsdata) {
					return -1;
				} 
				nextcluster = ModernizedCProgram.read32((le32_t)fsdata[fatoffset & ModernizedCProgram.LIBFAT_SECTOR_MASK]);
				nextcluster &=  -1024;
				if (nextcluster >= -1024) {
					return 0;
				} 
				break;
		default:
				return -/* WTF? */1;
		}
		return ModernizedCProgram.libfat_clustertosector(fs, nextcluster);
	}
	public Object getRead() {
		return read;
	}
	public void setRead(Object newRead) {
		read = newRead;
	}
	public Object getReadptr() {
		return readptr;
	}
	public void setReadptr(Object newReadptr) {
		readptr = newReadptr;
	}
	public fat_type getFat_type() {
		return fat_type;
	}
	public void setFat_type(fat_type newFat_type) {
		fat_type = newFat_type;
	}
	public int getClustsize() {
		return clustsize;
	}
	public void setClustsize(int newClustsize) {
		clustsize = newClustsize;
	}
	public int getClustshift() {
		return clustshift;
	}
	public void setClustshift(int newClustshift) {
		clustshift = newClustshift;
	}
	public Object getEndcluster() {
		return endcluster;
	}
	public void setEndcluster(Object newEndcluster) {
		endcluster = newEndcluster;
	}
	public Object getRootcluster() {
		return rootcluster;
	}
	public void setRootcluster(Object newRootcluster) {
		rootcluster = newRootcluster;
	}
	public Object getFat() {
		return fat;
	}
	public void setFat(Object newFat) {
		fat = newFat;
	}
	public Object getRootdir() {
		return rootdir;
	}
	public void setRootdir(Object newRootdir) {
		rootdir = newRootdir;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
	public libfat_sector getSectors() {
		return sectors;
	}
	public void setSectors(libfat_sector newSectors) {
		sectors = newSectors;
	}
}
