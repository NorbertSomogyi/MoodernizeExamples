package application;

public class matchitem {
	private matchitem next;
	private int id;
	private int priority;
	private Object pattern;
	private int hlg_id;
	private  match;
	private posmatch pos;
	private  hl;
	
	public matchitem(matchitem next, int id, int priority, Object pattern, int hlg_id,  match, posmatch pos,  hl) {
		setNext(next);
		setId(id);
		setPriority(priority);
		setPattern(pattern);
		setHlg_id(hlg_id);
		setMatch(match);
		setPos(pos);
		setHl(hl);
	}
	public matchitem() {
	}
	
	public matchitem get_match(window_S wp, int id) {
		Object generatedW_match_head = wp.getW_match_head();
		matchitem_T cur = generatedW_match_head;
		int generatedId = cur.getId();
		matchitem generatedNext = cur.getNext();
		while (cur != ((Object)0) && generatedId != id) {
			cur = generatedNext;
		}
		return cur/*
		 * Init for calling prepare_search_hl().
		 */;
	}
	public matchitem getNext() {
		return next;
	}
	public void setNext(matchitem newNext) {
		next = newNext;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int newPriority) {
		priority = newPriority;
	}
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
	public int getHlg_id() {
		return hlg_id;
	}
	public void setHlg_id(int newHlg_id) {
		hlg_id = newHlg_id;
	}
	public  getMatch() {
		return match;
	}
	public void setMatch( newMatch) {
		match = newMatch;
	}
	public posmatch getPos() {
		return pos;
	}
	public void setPos(posmatch newPos) {
		pos = newPos;
	}
	public  getHl() {
		return hl;
	}
	public void setHl( newHl) {
		hl = newHl;
	}
}
