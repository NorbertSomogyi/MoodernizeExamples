package application;

/*
 * Copyright (C) 2014  René Kijewski  <rene.kijewski@fu-berlin.de>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
/**
 * @defgroup    sys_pipe Pipe IPC
 * @ingroup     sys
 *
 * @brief       Generic pipe implementation.
 * @details     This pipe implementation is a tight wrapper around a ringbuffer.
 *              It sends the calling thread to sleep if the ringbuffer is full
 *              or empty, respectively. It can be used in ISRs, too.
 *
 *
 * @{
 * @file
 *
 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
 */
/**< Size of a dynamically malloc'd pipe. */
/**
 * A generic pipe.
 */
public class riot_pipe {
	private Object rb;
	private Object read_blocked;
	private Object write_blocked;
	private Object free;
	
	public riot_pipe(Object rb, Object read_blocked, Object write_blocked, Object free) {
		setRb(rb);
		setRead_blocked(read_blocked);
		setWrite_blocked(write_blocked);
		setFree(free);
	}
	public riot_pipe() {
	}
	
	public Object pipe_read(Object buf, Object n) {
		Object generatedRb = this.getRb();
		Object generatedWrite_blocked = this.getWrite_blocked();
		Object generatedRead_blocked = this.getRead_blocked();
		return ModernizedCProgram.pipe_rw(generatedRb, (byte)buf, n, generatedWrite_blocked, generatedRead_blocked, ringbuffer_get);
	}
	public Object pipe_write(Object buf, Object n) {
		Object generatedRb = this.getRb();
		Object generatedRead_blocked = this.getRead_blocked();
		Object generatedWrite_blocked = this.getWrite_blocked();
		return ModernizedCProgram.pipe_rw(generatedRb, (byte)buf, n, generatedRead_blocked, generatedWrite_blocked, (ringbuffer_op_t)ringbuffer_add);
	}
	public void pipe_init(Object rb, Object free) {
		pipe = /*Error: Unsupported expression*/;
	}
	public riot_pipe pipe_malloc(int size) {
		mallocd_pipe m_pipe = ModernizedCProgram.malloc(/*Error: sizeof expression not supported yet*/ + size);
		Object generatedRb = m_pipe.getRb();
		Object[] generatedBuffer = m_pipe.getBuffer();
		riot_pipe generatedPipe = m_pipe.getPipe();
		if (m_pipe) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ringbuffer_init(generatedRb, generatedBuffer, size);
			generatedPipe.pipe_init(generatedRb, ModernizedCProgram.free);
		} 
		return generatedPipe;
	}
	public void pipe_free() {
		Object generatedFree = this.getFree();
		if (rp && generatedFree) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(rp);
		} 
	}
	public Object getRb() {
		return rb;
	}
	public void setRb(Object newRb) {
		rb = newRb;
	}
	public Object getRead_blocked() {
		return read_blocked;
	}
	public void setRead_blocked(Object newRead_blocked) {
		read_blocked = newRead_blocked;
	}
	public Object getWrite_blocked() {
		return write_blocked;
	}
	public void setWrite_blocked(Object newWrite_blocked) {
		write_blocked = newWrite_blocked;
	}
	public Object getFree() {
		return free;
	}
	public void setFree(Object newFree) {
		free = newFree;
	}
}
