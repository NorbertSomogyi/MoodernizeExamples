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
 * @ingroup     sys_pipe
 * @{
 * @file
 * @brief       Implementation for dynamically allocated pipes.
 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
 * @}
 */
public class mallocd_pipe {
	private riot_pipe pipe;
	private Object rb;
	private Object[] buffer;
	
	public mallocd_pipe(riot_pipe pipe, Object rb, Object[] buffer) {
		setPipe(pipe);
		setRb(rb);
		setBuffer(buffer);
	}
	public mallocd_pipe() {
	}
	
	public riot_pipe getPipe() {
		return pipe;
	}
	public void setPipe(riot_pipe newPipe) {
		pipe = newPipe;
	}
	public Object getRb() {
		return rb;
	}
	public void setRb(Object newRb) {
		rb = newRb;
	}
	public Object[] getBuffer() {
		return buffer;
	}
	public void setBuffer(Object[] newBuffer) {
		buffer = newBuffer;
	}
}
