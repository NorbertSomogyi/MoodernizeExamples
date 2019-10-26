package application;

/*
 * rwlock7.c
 *
 * Hammer on a bunch of rwlocks to test robustness and fairness.
 * Printed stats should be roughly even for each thread.
 */
/*
 * Keep statistics for each thread.
 */
public class thread_tag {
	private int thread_num;
	private Object thread_id;
	private int updates;
	private int reads;
	private int changed;
	private int seed;
	
	public thread_tag(int thread_num, Object thread_id, int updates, int reads, int changed, int seed) {
		setThread_num(thread_num);
		setThread_id(thread_id);
		setUpdates(updates);
		setReads(reads);
		setChanged(changed);
		setSeed(seed);
	}
	public thread_tag() {
	}
	
	public int getThread_num() {
		return thread_num;
	}
	public void setThread_num(int newThread_num) {
		thread_num = newThread_num;
	}
	public Object getThread_id() {
		return thread_id;
	}
	public void setThread_id(Object newThread_id) {
		thread_id = newThread_id;
	}
	public int getUpdates() {
		return updates;
	}
	public void setUpdates(int newUpdates) {
		updates = newUpdates;
	}
	public int getReads() {
		return reads;
	}
	public void setReads(int newReads) {
		reads = newReads;
	}
	public int getChanged() {
		return changed;
	}
	public void setChanged(int newChanged) {
		changed = newChanged;
	}
	public int getSeed() {
		return seed;
	}
	public void setSeed(int newSeed) {
		seed = newSeed;
	}
}
