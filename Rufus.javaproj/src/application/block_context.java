package application;

/*
 * block.c --- iterate over all blocks in an inode
 *
 * Copyright (C) 1993, 1994, 1995, 1996 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class block_context {
	private Object fs;
	private Object func;
	private Object bcount;
	private int bsize;
	private int flags;
	private Object errcode;
	private Byte ind_buf;
	private Byte dind_buf;
	private Byte tind_buf;
	private Object priv_data;
	
	public block_context(Object fs, Object func, Object bcount, int bsize, int flags, Object errcode, Byte ind_buf, Byte dind_buf, Byte tind_buf, Object priv_data) {
		setFs(fs);
		setFunc(func);
		setBcount(bcount);
		setBsize(bsize);
		setFlags(flags);
		setErrcode(errcode);
		setInd_buf(ind_buf);
		setDind_buf(dind_buf);
		setTind_buf(tind_buf);
		setPriv_data(priv_data);
	}
	public block_context() {
	}
	
	public int block_iterate_ind(Object ind_block, Object ref_block, int ref_offset) {
		int ret = 0;
		int changed = 0;
		int i;
		int flags;
		int limit;
		int offset;
		 block_nr = new ();
		 blk64 = new ();
		Object generatedFs = this.getFs();
		limit = generatedFs.getBlocksize() >> 2;
		int generatedFlags = this.getFlags();
		Object generatedPriv_data = this.getPriv_data();
		if (!(generatedFlags & 2) && !(generatedFlags & 4)) {
			blk64 = ind_block;
			ret = .UNRECOGNIZEDFUNCTIONNAME(generatedFs, blk64, (true), ref_block, ref_offset, generatedPriv_data);
			ind_block = blk64;
		} 
		do {
			if ((generatedFlags & 8) && ((ret) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				ret |=  2 | 4;
				return ret;
			} 
		} while (0);
		Object generatedBcount = this.getBcount();
		if (!ind_block || (ret & 2)) {
			generatedBcount += limit;
			return ret;
		} 
		if (ind_block >= generatedFs.getSuper().ext2fs_blocks_count() || ind_block < generatedFs.getSuper().getS_first_data_block()) {
			this.setErrcode(EXT2_ET_BAD_IND_BLOCK);
			ret |=  4;
			return ret;
		} 
		Byte generatedInd_buf = this.getInd_buf();
		this.setErrcode(ModernizedCProgram.ext2fs_read_ind_block(generatedFs, ind_block, generatedInd_buf));
		Object generatedErrcode = this.getErrcode();
		if (generatedErrcode) {
			ret |=  4;
			return ret;
		} 
		block_nr = ()generatedInd_buf;
		offset = 0;
		do {
			if ((generatedFlags & 8) && ((changed) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				changed |=  2 | 4;
				return changed;
			} 
		} while (0);
		if (changed & 1) {
			this.setErrcode(ModernizedCProgram.ext2fs_write_ind_block(generatedFs, ind_block, generatedInd_buf));
			if (generatedErrcode) {
				ret |=  4 | 2;
			} 
		} 
		if ((generatedFlags & 2) && !(generatedFlags & 4) && !(ret & 2)) {
			blk64 = ind_block;
			ret |=  .UNRECOGNIZEDFUNCTIONNAME(generatedFs, blk64, (true), ref_block, ref_offset, generatedPriv_data);
			ind_block = blk64;
		} 
		do {
			if ((generatedFlags & 8) && ((ret) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				ret |=  2 | 4;
				return ret;
			} 
		} while (0);
		return ret;
	}
	public int block_iterate_dind(Object dind_block, Object ref_block, int ref_offset) {
		int ret = 0;
		int changed = 0;
		int i;
		int flags;
		int limit;
		int offset;
		 block_nr = new ();
		 blk64 = new ();
		Object generatedFs = this.getFs();
		limit = generatedFs.getBlocksize() >> 2;
		int generatedFlags = this.getFlags();
		Object generatedPriv_data = this.getPriv_data();
		if (!(generatedFlags & (2 | 4))) {
			blk64 = dind_block;
			ret = .UNRECOGNIZEDFUNCTIONNAME(generatedFs, blk64, (true), ref_block, ref_offset, generatedPriv_data);
			dind_block = blk64;
		} 
		do {
			if ((generatedFlags & 8) && ((ret) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				ret |=  2 | 4;
				return ret;
			} 
		} while (0);
		Object generatedBcount = this.getBcount();
		if (!dind_block || (ret & 2)) {
			generatedBcount += limit * limit;
			return ret;
		} 
		if (dind_block >= generatedFs.getSuper().ext2fs_blocks_count() || dind_block < generatedFs.getSuper().getS_first_data_block()) {
			this.setErrcode(EXT2_ET_BAD_DIND_BLOCK);
			ret |=  4;
			return ret;
		} 
		Byte generatedDind_buf = this.getDind_buf();
		this.setErrcode(ModernizedCProgram.ext2fs_read_ind_block(generatedFs, dind_block, generatedDind_buf));
		Object generatedErrcode = this.getErrcode();
		if (generatedErrcode) {
			ret |=  4;
			return ret;
		} 
		block_nr = ()generatedDind_buf;
		offset = 0;
		if (generatedFlags & 1) {
			for (i = 0; i < limit; ) {
				flags = ctx.block_iterate_ind(block_nr, dind_block, offset);
				changed |=  flags;
				if (flags & (2 | 4)) {
					ret |=  flags & (2 | 4);
					break;
				} 
				offset += ;
			}
		} else {
				for (i = 0; i < limit; ) {
					if (block_nr == 0) {
						generatedBcount += limit;
						continue;
					} 
					flags = ctx.block_iterate_ind(block_nr, dind_block, offset);
					changed |=  flags;
					if (flags & (2 | 4)) {
						ret |=  flags & (2 | 4);
						break;
					} 
					offset += ;
				}
		} 
		do {
			if ((generatedFlags & 8) && ((changed) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				changed |=  2 | 4;
				return changed;
			} 
		} while (0);
		if (changed & 1) {
			this.setErrcode(ModernizedCProgram.ext2fs_write_ind_block(generatedFs, dind_block, generatedDind_buf));
			if (generatedErrcode) {
				ret |=  4 | 2;
			} 
		} 
		if ((generatedFlags & 2) && !(generatedFlags & 4) && !(ret & 2)) {
			blk64 = dind_block;
			ret |=  .UNRECOGNIZEDFUNCTIONNAME(generatedFs, blk64, (true), ref_block, ref_offset, generatedPriv_data);
			dind_block = blk64;
		} 
		do {
			if ((generatedFlags & 8) && ((ret) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				ret |=  2 | 4;
				return ret;
			} 
		} while (0);
		return ret;
	}
	public int block_iterate_tind(Object tind_block, Object ref_block, int ref_offset) {
		int ret = 0;
		int changed = 0;
		int i;
		int flags;
		int limit;
		int offset;
		 block_nr = new ();
		 blk64 = new ();
		Object generatedFs = this.getFs();
		limit = generatedFs.getBlocksize() >> 2;
		int generatedFlags = this.getFlags();
		Object generatedPriv_data = this.getPriv_data();
		if (!(generatedFlags & (2 | 4))) {
			blk64 = tind_block;
			ret = .UNRECOGNIZEDFUNCTIONNAME(generatedFs, blk64, (true), ref_block, ref_offset, generatedPriv_data);
			tind_block = blk64;
		} 
		do {
			if ((generatedFlags & 8) && ((ret) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				ret |=  2 | 4;
				return ret;
			} 
		} while (0);
		Object generatedBcount = this.getBcount();
		if (!tind_block || (ret & 2)) {
			generatedBcount += ((long)limit) * limit * limit;
			return ret;
		} 
		if (tind_block >= generatedFs.getSuper().ext2fs_blocks_count() || tind_block < generatedFs.getSuper().getS_first_data_block()) {
			this.setErrcode(EXT2_ET_BAD_TIND_BLOCK);
			ret |=  4;
			return ret;
		} 
		Byte generatedTind_buf = this.getTind_buf();
		this.setErrcode(ModernizedCProgram.ext2fs_read_ind_block(generatedFs, tind_block, generatedTind_buf));
		Object generatedErrcode = this.getErrcode();
		if (generatedErrcode) {
			ret |=  4;
			return ret;
		} 
		block_nr = ()generatedTind_buf;
		offset = 0;
		if (generatedFlags & 1) {
			for (i = 0; i < limit; ) {
				flags = ctx.block_iterate_dind(block_nr, tind_block, offset);
				changed |=  flags;
				if (flags & (2 | 4)) {
					ret |=  flags & (2 | 4);
					break;
				} 
				offset += ;
			}
		} else {
				for (i = 0; i < limit; ) {
					if (block_nr == 0) {
						generatedBcount += limit * limit;
						continue;
					} 
					flags = ctx.block_iterate_dind(block_nr, tind_block, offset);
					changed |=  flags;
					if (flags & (2 | 4)) {
						ret |=  flags & (2 | 4);
						break;
					} 
					offset += ;
				}
		} 
		do {
			if ((generatedFlags & 8) && ((changed) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				changed |=  2 | 4;
				return changed;
			} 
		} while (0);
		if (changed & 1) {
			this.setErrcode(ModernizedCProgram.ext2fs_write_ind_block(generatedFs, tind_block, generatedTind_buf));
			if (generatedErrcode) {
				ret |=  4 | 2;
			} 
		} 
		if ((generatedFlags & 2) && !(generatedFlags & 4) && !(ret & 2)) {
			blk64 = tind_block;
			ret |=  .UNRECOGNIZEDFUNCTIONNAME(generatedFs, blk64, (true), ref_block, ref_offset, generatedPriv_data);
			tind_block = blk64;
		} 
		do {
			if ((generatedFlags & 8) && ((ret) & 1)) {
				(ctx).setErrcode(EXT2_ET_RO_BLOCK_ITERATE);
				ret |=  2 | 4;
				return ret;
			} 
		} while (0);
		return ret;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
	public Object getBcount() {
		return bcount;
	}
	public void setBcount(Object newBcount) {
		bcount = newBcount;
	}
	public int getBsize() {
		return bsize;
	}
	public void setBsize(int newBsize) {
		bsize = newBsize;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getErrcode() {
		return errcode;
	}
	public void setErrcode(Object newErrcode) {
		errcode = newErrcode;
	}
	public Byte getInd_buf() {
		return ind_buf;
	}
	public void setInd_buf(Byte newInd_buf) {
		ind_buf = newInd_buf;
	}
	public Byte getDind_buf() {
		return dind_buf;
	}
	public void setDind_buf(Byte newDind_buf) {
		dind_buf = newDind_buf;
	}
	public Byte getTind_buf() {
		return tind_buf;
	}
	public void setTind_buf(Byte newTind_buf) {
		tind_buf = newTind_buf;
	}
	public Object getPriv_data() {
		return priv_data;
	}
	public void setPriv_data(Object newPriv_data) {
		priv_data = newPriv_data;
	}
}
