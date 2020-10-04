package application;

public class Syslinux_patchToSet_64 {
	
	
	private static int syslinux_patch(Object[] sectp, int nsectors, int stupid, int raid_mode, Object subdir, Object subvol) {
		patch_area patcharea = new patch_area();
		ext_patch_area epa = new ext_patch_area();
		syslinux_extent ex = new syslinux_extent();
		uint32_t wp = new uint32_t();
		int nsect = ((ModernizedCProgram.syslinux_ldlinux_len[0] + ModernizedCProgram.SECTOR_SIZE - 1) >> ModernizedCProgram.SECTOR_SHIFT) + 2;
		uint32_t csum = new uint32_t();
		int i;
		int dw;
		int nptrs;
		fat_boot_sector sbs = (fat_boot_sector)ModernizedCProgram.syslinux_ldlinux[1];
		uint64_t[] advptrs = new uint64_t();
		if (nsectors < nsect) {
			return -/* The actual file is too small for content */1;
		} 
		dw = (ModernizedCProgram.syslinux_ldlinux_len[0] - /*Error: Unsupported expression*/) >> /* Search for LDLINUX_MAGIC to find the patch area */2;
		for (; (i <= dw) && ((ModernizedCProgram.get_32_sl(wp) != -1024)); ) {
			;
		}
		if (i > /* Not found */dw) {
			return -1;
		} 
		patcharea = (patch_area)wp;
		Object generatedEpaoffset = patcharea.getEpaoffset();
		epa = ModernizedCProgram.slptr(ModernizedCProgram.syslinux_ldlinux[0], generatedEpaoffset);
		Object generatedSect1ptr0 = epa.getSect1ptr0();
		ModernizedCProgram.set_32(ModernizedCProgram.ptr(sbs, generatedSect1ptr0), sectp[/* First sector need pointer in boot sector */0]);
		Object generatedSect1ptr1 = epa.getSect1ptr1();
		ModernizedCProgram.set_32(ModernizedCProgram.ptr(sbs, generatedSect1ptr1), sectp[0] >> 32);
		sectp++;
		Object generatedRaidpatch = epa.getRaidpatch();
		if (/* Handle RAID mode */raid_mode) {
			ModernizedCProgram.set_16(ModernizedCProgram.ptr(sbs, generatedRaidpatch), /* Patch in INT 18h = CD 18 */-1024);
		} 
		dw = ModernizedCProgram.syslinux_ldlinux_len[0] >> /* Set up the totals *//* COMPLETE dwords, excluding ADV */2;
		Object generatedData_sectors = patcharea.getData_sectors();
		ModernizedCProgram.set_16_sl(generatedData_sectors, nsect - /* Not including ADVs */2);
		Object generatedAdv_sectors = patcharea.getAdv_sectors();
		ModernizedCProgram.set_16_sl(generatedAdv_sectors, /* ADVs need 2 sectors */2);
		Object generatedDwords = patcharea.getDwords();
		ModernizedCProgram.set_32_sl(generatedDwords, dw);
		Object generatedMaxtransfer = patcharea.getMaxtransfer();
		if (/* Handle Stupid mode */stupid) {
			ModernizedCProgram.set_16_sl(generatedMaxtransfer, /* Access only one sector at a time */1);
		} 
		Object generatedSecptroffset = epa.getSecptroffset();
		ex = ModernizedCProgram.slptr(ModernizedCProgram.syslinux_ldlinux[0], generatedSecptroffset);
		Object generatedSecptrcnt = epa.getSecptrcnt();
		nptrs = ModernizedCProgram.get_16_sl(generatedSecptrcnt);
		ex.generate_extents(nptrs, sectp, nsect - 1 - /* -1 for the pointer in the boot sector, -2 for the two ADVs */2);
		Object generatedAdvptroffset = epa.getAdvptroffset();
		advptrs = ModernizedCProgram.slptr(ModernizedCProgram.syslinux_ldlinux[0], generatedAdvptroffset);
		ModernizedCProgram.set_64_sl(advptrs[0], sectp[nsect - 1 - 2]);
		ModernizedCProgram.set_64_sl(advptrs[1], sectp[nsect - 1 - 1]);
		Object generatedDirlen = epa.getDirlen();
		Object generatedDiroffset = epa.getDiroffset();
		if (/* Poke in the base directory path */subdir) {
			int sublen = /*Error: Function owner not recognized*/strlen(subdir) + 1;
			if (ModernizedCProgram.get_16_sl(generatedDirlen) < sublen) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Subdirectory path too long... aborting install!\n");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
			ModernizedCProgram.memcpy_to_sl(ModernizedCProgram.slptr(ModernizedCProgram.syslinux_ldlinux[0], generatedDiroffset), subdir, sublen);
		} 
		Object generatedSubvollen = epa.getSubvollen();
		Object generatedSubvoloffset = epa.getSubvoloffset();
		if (/* Poke in the subvolume information */subvol) {
			int sublen = /*Error: Function owner not recognized*/strlen(subvol) + 1;
			if (ModernizedCProgram.get_16_sl(generatedSubvollen) < sublen) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Subvol name too long... aborting install!\n");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
			ModernizedCProgram.memcpy_to_sl(ModernizedCProgram.slptr(ModernizedCProgram.syslinux_ldlinux[0], generatedSubvoloffset), subvol, sublen);
		} 
		Object generatedChecksum = patcharea.getChecksum();
		ModernizedCProgram.set_32_sl(generatedChecksum, /* Now produce a checksum */0);
		csum = -1024;
		for (; i < dw; ) {
			csum -= ModernizedCProgram.get_32_sl(/* Negative checksum */wp);
		}
		ModernizedCProgram.set_32_sl(generatedChecksum, csum/*
		     * Assume all bytes modified.  This can be optimized at the expense
		     * of keeping track of what the highest modified address ever was.
		     */);
		return dw << 2;
	}
	public static void set_32(Object p, Object v) {
		p = /* Littleendian and unaligned-capable */v;
	}
	private static void set_32_sl(Object p, Object v) {
		ModernizedCProgram.set_32((uint32_t)p, v);
	}
	private static void set_64_sl(Object p, Object v) {
		ModernizedCProgram.set_64((uint64_t)p, v);
	}
	private static void set_64(Object p, Object v) {
		p = /* Littleendian and unaligned-capable */v/*
		 * Special handling for the MS-DOS derivative: syslinux_ldlinux
		 * is a "far" object...
		 */;/*
		 * Special handling for the MS-DOS derivative: syslinux_ldlinux
		 * is a "far" object...
		 */
	}
}
