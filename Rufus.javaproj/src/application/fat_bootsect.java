package application;

/* ----------------------------------------------------------------------- *
 *
 *   Copyright 2001-2008 H. Peter Anvin - All Rights Reserved
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, Inc., 53 Temple Place Ste 330,
 *   Boston MA 02111-1307, USA; either version 2 of the License, or
 *   (at your option) any later version; incorporated herein by reference.
 *
 * ----------------------------------------------------------------------- */
/*
 * fat.h
 *
 * Basic data structures for a FAT filesystem
 */
/* The poor excuse FAT has for a superblock -- in the boot sector */
public class fat_bootsect {
	private Object bsJump;
	private Object bsOemName;
	private Object bsBytesPerSec;
	private Object bsSecPerClust;
	private Object bsResSectors;
	private Object bsFATs;
	private Object bsRootDirEnts;
	private Object bsSectors;
	private Object bsMedia;
	private Object bsFATsecs;
	private Object bsSecPerTrack;
	private Object bsHeads;
	private Object bsHiddenSecs;
	private Object bsHugeSectors;
	private  u;
	private Object bsSignature;
	
	public fat_bootsect(Object bsJump, Object bsOemName, Object bsBytesPerSec, Object bsSecPerClust, Object bsResSectors, Object bsFATs, Object bsRootDirEnts, Object bsSectors, Object bsMedia, Object bsFATsecs, Object bsSecPerTrack, Object bsHeads, Object bsHiddenSecs, Object bsHugeSectors,  u, Object bsSignature) {
		setBsJump(bsJump);
		setBsOemName(bsOemName);
		setBsBytesPerSec(bsBytesPerSec);
		setBsSecPerClust(bsSecPerClust);
		setBsResSectors(bsResSectors);
		setBsFATs(bsFATs);
		setBsRootDirEnts(bsRootDirEnts);
		setBsSectors(bsSectors);
		setBsMedia(bsMedia);
		setBsFATsecs(bsFATsecs);
		setBsSecPerTrack(bsSecPerTrack);
		setBsHeads(bsHeads);
		setBsHiddenSecs(bsHiddenSecs);
		setBsHugeSectors(bsHugeSectors);
		setU(u);
		setBsSignature(bsSignature);
	}
	public fat_bootsect() {
	}
	
	public Object getBsJump() {
		return bsJump;
	}
	public void setBsJump(Object newBsJump) {
		bsJump = newBsJump;
	}
	public Object getBsOemName() {
		return bsOemName;
	}
	public void setBsOemName(Object newBsOemName) {
		bsOemName = newBsOemName;
	}
	public Object getBsBytesPerSec() {
		return bsBytesPerSec;
	}
	public void setBsBytesPerSec(Object newBsBytesPerSec) {
		bsBytesPerSec = newBsBytesPerSec;
	}
	public Object getBsSecPerClust() {
		return bsSecPerClust;
	}
	public void setBsSecPerClust(Object newBsSecPerClust) {
		bsSecPerClust = newBsSecPerClust;
	}
	public Object getBsResSectors() {
		return bsResSectors;
	}
	public void setBsResSectors(Object newBsResSectors) {
		bsResSectors = newBsResSectors;
	}
	public Object getBsFATs() {
		return bsFATs;
	}
	public void setBsFATs(Object newBsFATs) {
		bsFATs = newBsFATs;
	}
	public Object getBsRootDirEnts() {
		return bsRootDirEnts;
	}
	public void setBsRootDirEnts(Object newBsRootDirEnts) {
		bsRootDirEnts = newBsRootDirEnts;
	}
	public Object getBsSectors() {
		return bsSectors;
	}
	public void setBsSectors(Object newBsSectors) {
		bsSectors = newBsSectors;
	}
	public Object getBsMedia() {
		return bsMedia;
	}
	public void setBsMedia(Object newBsMedia) {
		bsMedia = newBsMedia;
	}
	public Object getBsFATsecs() {
		return bsFATsecs;
	}
	public void setBsFATsecs(Object newBsFATsecs) {
		bsFATsecs = newBsFATsecs;
	}
	public Object getBsSecPerTrack() {
		return bsSecPerTrack;
	}
	public void setBsSecPerTrack(Object newBsSecPerTrack) {
		bsSecPerTrack = newBsSecPerTrack;
	}
	public Object getBsHeads() {
		return bsHeads;
	}
	public void setBsHeads(Object newBsHeads) {
		bsHeads = newBsHeads;
	}
	public Object getBsHiddenSecs() {
		return bsHiddenSecs;
	}
	public void setBsHiddenSecs(Object newBsHiddenSecs) {
		bsHiddenSecs = newBsHiddenSecs;
	}
	public Object getBsHugeSectors() {
		return bsHugeSectors;
	}
	public void setBsHugeSectors(Object newBsHugeSectors) {
		bsHugeSectors = newBsHugeSectors;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
	public Object getBsSignature() {
		return bsSignature;
	}
	public void setBsSignature(Object newBsSignature) {
		bsSignature = newBsSignature;
	}
}
