package application;

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
public class ff_circular_queue {
	private Object mutex;
	private Object cond;
	private Object[][] slots;
	private int item_size;
	private int capacity;
	private int size;
	private int write_index;
	private int read_index;
	private boolean abort;
	
	public ff_circular_queue(Object mutex, Object cond, Object[][] slots, int item_size, int capacity, int size, int write_index, int read_index, boolean abort) {
		setMutex(mutex);
		setCond(cond);
		setSlots(slots);
		setItem_size(item_size);
		setCapacity(capacity);
		setSize(size);
		setWrite_index(write_index);
		setRead_index(read_index);
		setAbort(abort);
	}
	public ff_circular_queue() {
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
	public Object queue_fetch_or_alloc(int index) {
		Object[][] generatedSlots = this.getSlots();
		int generatedItem_size = this.getItem_size();
		if (generatedSlots[index] == ((Object)0)) {
			generatedSlots[index] = /*Error: Function owner not recognized*/av_mallocz(generatedItem_size);
		} 
		return generatedSlots[index];
	}
	public void queue_lock() {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
	}
	public void queue_unlock() {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public void queue_signal() {
		Object generatedCond = this.getCond();
		ModernizedCProgram.pthread_cond_signal(generatedCond);
	}
	public void queue_wait() {
		Object generatedCond = this.getCond();
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_cond_wait(generatedCond, generatedMutex);
	}
	public boolean ff_circular_queue_init(int item_size, int capacity) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(cq, 0, /*Error: Unsupported expression*/);
		this.setItem_size(item_size);
		this.setCapacity(capacity);
		this.setAbort(0);
		this.setSlots(/*Error: Function owner not recognized*/av_mallocz(capacity * /*Error: Unsupported expression*/));
		Object[][] generatedSlots = this.getSlots();
		if (generatedSlots == ((Object)0)) {
			;
		} 
		this.setSize(0);
		this.setWrite_index(0);
		this.setRead_index(0);
		Object generatedMutex = this.getMutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0)) != 0) {
			;
		} 
		Object generatedCond = this.getCond();
		if (ModernizedCProgram.pthread_cond_init(generatedCond, ((Object)0)) != 0) {
			;
		} 
		return 1;
	}
	public void ff_circular_queue_abort() {
		cq.queue_lock();
		this.setAbort(1);
		cq.queue_signal();
		cq.queue_unlock();
	}
	public void ff_circular_queue_free() {
		cq.ff_circular_queue_abort();
		Object[][] generatedSlots = this.getSlots();
		if (generatedSlots != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(generatedSlots);
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		Object generatedCond = this.getCond();
		ModernizedCProgram.pthread_cond_destroy(generatedCond);
	}
	public void ff_circular_queue_wait_write() {
		cq.queue_lock();
		int generatedSize = this.getSize();
		int generatedCapacity = this.getCapacity();
		boolean generatedAbort = this.getAbort();
		while (generatedSize >= generatedCapacity && !generatedAbort) {
			cq.queue_wait();
		}
		cq.queue_unlock();
	}
	public Object ff_circular_queue_peek_write() {
		int generatedWrite_index = this.getWrite_index();
		return cq.queue_fetch_or_alloc(generatedWrite_index);
	}
	public void ff_circular_queue_advance_write(Object item) {
		Object[][] generatedSlots = this.getSlots();
		int generatedWrite_index = this.getWrite_index();
		generatedSlots[generatedWrite_index] = item;
		int generatedCapacity = this.getCapacity();
		this.setWrite_index((generatedWrite_index + 1) % generatedCapacity);
		cq.queue_lock();
		int generatedSize = this.getSize();
		++generatedSize;
		cq.queue_unlock();
	}
	public Object ff_circular_queue_peek_read() {
		int generatedRead_index = this.getRead_index();
		return cq.queue_fetch_or_alloc(generatedRead_index);
	}
	public void ff_circular_queue_advance_read() {
		int generatedRead_index = this.getRead_index();
		int generatedCapacity = this.getCapacity();
		this.setRead_index((generatedRead_index + 1) % generatedCapacity);
		cq.queue_lock();
		int generatedSize = this.getSize();
		--generatedSize;
		cq.queue_signal();
		cq.queue_unlock();
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
	public Object[][] getSlots() {
		return slots;
	}
	public void setSlots(Object[][] newSlots) {
		slots = newSlots;
	}
	public int getItem_size() {
		return item_size;
	}
	public void setItem_size(int newItem_size) {
		item_size = newItem_size;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int newCapacity) {
		capacity = newCapacity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public int getWrite_index() {
		return write_index;
	}
	public void setWrite_index(int newWrite_index) {
		write_index = newWrite_index;
	}
	public int getRead_index() {
		return read_index;
	}
	public void setRead_index(int newRead_index) {
		read_index = newRead_index;
	}
	public boolean getAbort() {
		return abort;
	}
	public void setAbort(boolean newAbort) {
		abort = newAbort;
	}
}
