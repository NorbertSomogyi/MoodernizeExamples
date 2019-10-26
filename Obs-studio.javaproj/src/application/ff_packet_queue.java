package application;

public class ff_packet_queue {
	private ff_packet_list first_packet;
	private ff_packet_list last_packet;
	private Object mutex;
	private Object cond;
	private ff_packet flush_packet;
	private int count;
	private int total_size;
	private boolean abort;
	
	public ff_packet_queue(ff_packet_list first_packet, ff_packet_list last_packet, Object mutex, Object cond, ff_packet flush_packet, int count, int total_size, boolean abort) {
		setFirst_packet(first_packet);
		setLast_packet(last_packet);
		setMutex(mutex);
		setCond(cond);
		setFlush_packet(flush_packet);
		setCount(count);
		setTotal_size(total_size);
		setAbort(abort);
	}
	public ff_packet_queue() {
	}
	
	/*
	 * Copyright (c) 2015 John R. Bradley <jrb@turrettech.com>
	 *
	 * Permission to use, copy, modify, and distribute this software for any
	 * purpose with or without fee is hereby granted, provided that the above
	 * copyright notice and this permission notice appear in all copies.
	 *
	 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
	 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
	 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
	 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
	 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
	 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
	 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
	 */
	public boolean packet_queue_init() {
		.memset(q, 0, );
		Object generatedMutex = this.getMutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0)) != 0) {
			;
		} 
		Object generatedCond = this.getCond();
		if (ModernizedCProgram.pthread_cond_init(generatedCond, ((Object)0)) != 0) {
			;
		} 
		ff_packet generatedFlush_packet = this.getFlush_packet();
		Object generatedBase = generatedFlush_packet.getBase();
		.av_init_packet(generatedBase);
		generatedBase.setData((uint8_t)"FLUSH");
		return 1;
	}
	public void packet_queue_abort() {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		this.setAbort(1);
		Object generatedCond = this.getCond();
		ModernizedCProgram.pthread_cond_signal(generatedCond);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public void packet_queue_free() {
		q.packet_queue_flush();
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		Object generatedCond = this.getCond();
		ModernizedCProgram.pthread_cond_destroy(generatedCond);
		ff_packet generatedFlush_packet = this.getFlush_packet();
		Object generatedBase = generatedFlush_packet.getBase();
		.av_free_packet(generatedBase);
	}
	public int packet_queue_put_flush_packet() {
		ff_packet generatedFlush_packet = this.getFlush_packet();
		return ModernizedCProgram.packet_queue_put(q, generatedFlush_packet);
	}
	public void packet_queue_flush() {
		ff_packet_list packet = new ff_packet_list();
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		ff_packet_list generatedNext = packet.getNext();
		ff_packet generatedPacket = packet.getPacket();
		Object generatedBase = generatedPacket.getBase();
		ff_clock generatedClock = generatedPacket.getClock();
		ff_packet_list generatedFirst_packet = this.getFirst_packet();
		for (packet = generatedFirst_packet; packet != ((Object)0); packet = generatedFirst_packet) {
			this.setFirst_packet(generatedNext);
			.av_free_packet(generatedBase);
			if (generatedClock != ((Object)0)) {
				generatedClock.ff_clock_release();
			} 
			.av_freep(packet);
		}
		this.setLast_packet(this.setFirst_packet(((Object)0)));
		this.setCount(0);
		this.setTotal_size(0);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public ff_packet_list getFirst_packet() {
		return first_packet;
	}
	public void setFirst_packet(ff_packet_list newFirst_packet) {
		first_packet = newFirst_packet;
	}
	public ff_packet_list getLast_packet() {
		return last_packet;
	}
	public void setLast_packet(ff_packet_list newLast_packet) {
		last_packet = newLast_packet;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getCond() {
		return cond;
	}
	public void setCond(Object newCond) {
		cond = newCond;
	}
	public ff_packet getFlush_packet() {
		return flush_packet;
	}
	public void setFlush_packet(ff_packet newFlush_packet) {
		flush_packet = newFlush_packet;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getTotal_size() {
		return total_size;
	}
	public void setTotal_size(int newTotal_size) {
		total_size = newTotal_size;
	}
	public boolean getAbort() {
		return abort;
	}
	public void setAbort(boolean newAbort) {
		abort = newAbort;
	}
}
