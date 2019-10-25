package application;

/* not an actual timer, used as a marker only */
/*
 * One instance for each timeout an easy handle can set.
 */
public class time_node {
	private curl_llist_element list;
	private curltime time;
	private  eid;
	
	public time_node(curl_llist_element list, curltime time,  eid) {
		setList(list);
		setTime(time);
		setEid(eid);
	}
	public time_node() {
	}
	
	public curl_llist_element getList() {
		return list;
	}
	public void setList(curl_llist_element newList) {
		list = newList;
	}
	public curltime getTime() {
		return time;
	}
	public void setTime(curltime newTime) {
		time = newTime;
	}
	public  getEid() {
		return eid;
	}
	public void setEid( newEid) {
		eid = newEid;
	}
}
