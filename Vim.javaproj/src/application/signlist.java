package application;

public class signlist {
	private int id;
	private Object lnum;
	private int typenr;
	private signgroup_S group;
	private int priority;
	private signlist next;
	private signlist prev;
	
	public signlist(int id, Object lnum, int typenr, signgroup_S group, int priority, signlist next, signlist prev) {
		setId(id);
		setLnum(lnum);
		setTypenr(typenr);
		setGroup(group);
		setPriority(priority);
		setNext(next);
		setPrev(prev);
	}
	public signlist() {
	}
	
	public int sign_in_group(Object group) {
		signgroup_S generatedGroup = this.getGroup();
		Object generatedSg_name = generatedGroup.getSg_name();
		return ((group != ((Object)0) && .strcmp((byte)(group), (byte)("*")) == 0) || (group == ((Object)0) && generatedGroup == ((Object)0)) || (group != ((Object)0) && generatedGroup != ((Object)0) && .strcmp((byte)(group), (byte)(generatedSg_name)) == 0/*
		 * Get the next free sign identifier in the specified group
		 */));
	}
	public signlist buf_getsign_at_line(file_buffer buf, Object lnum, Object groupname) {
		// sign group name// a sign in the signlistsignlist_T sign = new signlist_T();
		Object generatedLnum = sign.getLnum();
		signlist generatedNext = sign.getNext();
		Object generatedB_signlist = buf.getB_signlist();
		for (sign = generatedB_signlist; sign != ((Object)0); sign = generatedNext) {
			if (generatedLnum > lnum) {
				break;
			} 
			if (generatedLnum == lnum && sign.sign_in_group(groupname)) {
				return sign;
			} 
		}
		return ((Object)0/*
		 * Return the identifier of the sign at line number 'lnum' in buffer 'buf'.
		 */);
	}
	// buffer whose sign we are searching for
	// line number of sign
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public Object getLnum() {
		return lnum;
	}
	public void setLnum(Object newLnum) {
		lnum = newLnum;
	}
	public int getTypenr() {
		return typenr;
	}
	public void setTypenr(int newTypenr) {
		typenr = newTypenr;
	}
	public signgroup_S getGroup() {
		return group;
	}
	public void setGroup(signgroup_S newGroup) {
		group = newGroup;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int newPriority) {
		priority = newPriority;
	}
	public signlist getNext() {
		return next;
	}
	public void setNext(signlist newNext) {
		next = newNext;
	}
	public signlist getPrev() {
		return prev;
	}
	public void setPrev(signlist newPrev) {
		prev = newPrev;
	}
}
