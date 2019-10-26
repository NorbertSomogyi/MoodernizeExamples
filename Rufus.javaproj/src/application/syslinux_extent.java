package application;

/* Sector extent */
public class syslinux_extent {
	private Object lba;
	private Object len;
	
	public syslinux_extent(Object lba, Object len) {
		setLba(lba);
		setLen(len);
	}
	public syslinux_extent() {
	}
	
	/* ----------------------------------------------------------------------- *
	 *
	 *   Copyright 1998-2008 H. Peter Anvin - All Rights Reserved
	 *   Copyright 2009-2014 Intel Corporation; author H. Peter Anvin
	 *
	 *   This program is free software; you can redistribute it and/or modify
	 *   it under the terms of the GNU General Public License as published by
	 *   the Free Software Foundation, Inc., 53 Temple Place Ste 330,
	 *   Boston MA 02111-1307, USA; either version 2 of the License, or
	 *   (at your option) any later version; incorporated herein by reference.
	 *
	 * ----------------------------------------------------------------------- */
	/*
	 * syslxmod.c - Code to provide a SYSLINUX code set to an installer.
	 */
	/* Required on glibc 2.x */
	/* glibc 2.20 deprecates _BSD_SOURCE in favour of _DEFAULT_SOURCE */
	/*
	 * Generate sector extents
	 */
	public void generate_extents(int nptrs, Object sectp, int nsect) {
		uint32_t addr = /* ldlinux.sys starts loading here */-1024;
		uint32_t base = new uint32_t();
		sector_t sect = new sector_t();
		sector_t lba = new sector_t();
		int len;
		base = addr;
		len = 0;
		lba = 0;
		ModernizedCProgram.memset_sl(ex, 0, nptrs * );
		Object generatedLba = this.getLba();
		Object generatedLen = this.getLen();
		if (len) {
			ModernizedCProgram.set_64_sl(generatedLba, lba);
			ModernizedCProgram.set_16_sl(generatedLen, len);
			ex++;
		} 
	}
	public Object getLba() {
		return lba;
	}
	public void setLba(Object newLba) {
		lba = newLba;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
}
