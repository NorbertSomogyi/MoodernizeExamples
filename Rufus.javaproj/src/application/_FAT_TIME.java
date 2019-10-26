package application;

/*
 * Rufus: The Reliable USB Formatting Utility
 * MS-DOS boot file extraction, from the FAT12 floppy image in diskcopy.dll
 * Copyright © 2011-2013 Pete Batard <pete@akeo.ie>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/* http://www.c-jump.com/CIS24/Slides/FAT/lecture.html
   Ideally, we'd read the following from the FAT Boot Sector, but we have
   a pretty good idea of what they are for a 1.44 MB floppy image */
// = sector size
// First cluster in data area is #2
/* 
 * Lifted from ReactOS:
 * http://reactos-mirror.googlecode.com/svn/trunk/reactos/drivers/filesystems/fastfat_new/fat.h
 */
// You *DO* want packed structs here
//
//  Directory Structure:
//
public class _FAT_TIME {
	private Object DoubleSeconds;
	private Object Minute;
	private Object Hour;
	private Object Value;
	
	public _FAT_TIME(Object DoubleSeconds, Object Minute, Object Hour, Object Value) {
		setDoubleSeconds(DoubleSeconds);
		setMinute(Minute);
		setHour(Hour);
		setValue(Value);
	}
	public _FAT_TIME() {
	}
	
	public Object getDoubleSeconds() {
		return DoubleSeconds;
	}
	public void setDoubleSeconds(Object newDoubleSeconds) {
		DoubleSeconds = newDoubleSeconds;
	}
	public Object getMinute() {
		return Minute;
	}
	public void setMinute(Object newMinute) {
		Minute = newMinute;
	}
	public Object getHour() {
		return Hour;
	}
	public void setHour(Object newHour) {
		Hour = newHour;
	}
	public Object getValue() {
		return Value;
	}
	public void setValue(Object newValue) {
		Value = newValue;
	}
}
