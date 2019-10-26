package application;

/*
 * A priority queue implementation, primarily for keeping track of
 * commits in the 'date-order' so that we process them from new to old
 * as they are discovered, but can be used to hold any pointer to
 * struct.  The caller is responsible for supplying a function to
 * compare two "things".
 *
 * Alternatively, this data structure can also be used as a LIFO stack
 * by specifying NULL as the comparison function.
 */
/*
 * Compare two "things", one and two; the third parameter is cb_data
 * in the prio_queue structure.  The result is returned as a sign of
 * the return value, being the same as the sign of the result of
 * subtracting "two" from "one" (i.e. negative if "one" sorts earlier
 * than "two").
 */
public class prio_queue_entry {
	private int ctr;
	private Object data;
	
	public prio_queue_entry(int ctr, Object data) {
		setCtr(ctr);
		setData(data);
	}
	public prio_queue_entry() {
	}
	
	public int getCtr() {
		return ctr;
	}
	public void setCtr(int newCtr) {
		ctr = newCtr;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
/*
 * Add the "thing" to the queue.
 */
