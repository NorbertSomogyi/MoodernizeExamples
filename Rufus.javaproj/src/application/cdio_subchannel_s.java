package application;

/* -*- c -*-
    Copyright (C) 2005, 2007, 2008 Rocky Bernstein <rocky@gnu.org>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/** \file audio.h 
 *
 *  \brief The top-level header for CD audio-related libcdio
 *         calls.  These control playing of the CD-ROM through its 
 *         line-out jack.
 */
/* __cplusplus */
/*! This struct is used by the cdio_audio_read_subchannel */
public class cdio_subchannel_s {
	private Object format;
	private Object audio_status;
	private Object address;
	private Object control;
	private Object track;
	private Object index;
	private Object abs_addr;
	private Object rel_addr;
	
	public cdio_subchannel_s(Object format, Object audio_status, Object address, Object control, Object track, Object index, Object abs_addr, Object rel_addr) {
		setFormat(format);
		setAudio_status(audio_status);
		setAddress(address);
		setControl(control);
		setTrack(track);
		setIndex(index);
		setAbs_addr(abs_addr);
		setRel_addr(rel_addr);
	}
	public cdio_subchannel_s() {
	}
	
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public Object getAudio_status() {
		return audio_status;
	}
	public void setAudio_status(Object newAudio_status) {
		audio_status = newAudio_status;
	}
	public Object getAddress() {
		return address;
	}
	public void setAddress(Object newAddress) {
		address = newAddress;
	}
	public Object getControl() {
		return control;
	}
	public void setControl(Object newControl) {
		control = newControl;
	}
	public Object getTrack() {
		return track;
	}
	public void setTrack(Object newTrack) {
		track = newTrack;
	}
	public Object getIndex() {
		return index;
	}
	public void setIndex(Object newIndex) {
		index = newIndex;
	}
	public Object getAbs_addr() {
		return abs_addr;
	}
	public void setAbs_addr(Object newAbs_addr) {
		abs_addr = newAbs_addr;
	}
	public Object getRel_addr() {
		return rel_addr;
	}
	public void setRel_addr(Object newRel_addr) {
		rel_addr = newRel_addr;
	}
}
