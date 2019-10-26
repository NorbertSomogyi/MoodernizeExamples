package application;

public class fetch_negotiator {
	private Object known_common;
	private Object add_tip;
	private Object next;
	private Object ack;
	private Object release;
	private Object data;
	
	public fetch_negotiator(Object known_common, Object add_tip, Object next, Object ack, Object release, Object data) {
		setKnown_common(known_common);
		setAdd_tip(add_tip);
		setNext(next);
		setAck(ack);
		setRelease(release);
		setData(data);
	}
	public fetch_negotiator() {
	}
	
	public Object next() {
		this.setKnown_common(((Object)0));
		this.setAdd_tip(((Object)0));
		Object generatedData = this.getData();
		return generatedData.get_rev();
		this.setKnown_common(((Object)0));
		this.setAdd_tip(((Object)0));
		Object generatedData = this.getData();
		return generatedData.get_rev();
	}
	public void release() {
		Object generatedData = this.getData();
		((negotiation_state)generatedData).getRev_list().clear_prio_queue();
		do {
			ModernizedCProgram.free(generatedData);
			(generatedData) = ((Object)0);
		} while (0);
		Object generatedData = this.getData();
		((data)generatedData).getRev_list().clear_prio_queue();
		do {
			ModernizedCProgram.free(generatedData);
			(generatedData) = ((Object)0);
		} while (0);
	}
	public void default_negotiator_init() {
		negotiation_state ns = new negotiation_state();
		this.setKnown_common(known_common);
		this.setAdd_tip(add_tip);
		this.setNext(next);
		this.setAck(ack);
		this.setRelease(release);
		this.setData(ns = ModernizedCProgram.xcalloc(1, ));
		prio_queue generatedRev_list = ns.getRev_list();
		generatedRev_list.setCompare(ModernizedCProgram.compare_commits_by_commit_date);
		if (ModernizedCProgram.marked) {
			ModernizedCProgram.for_each_ref(clear_marks, ((Object)0));
		} 
		ModernizedCProgram.marked = 1;
	}
	public void skipping_negotiator_init() {
		data data = new data();
		this.setKnown_common(known_common);
		this.setAdd_tip(add_tip);
		this.setNext(next);
		this.setAck(ack);
		this.setRelease(release);
		this.setData(data = ModernizedCProgram.xcalloc(1, ));
		prio_queue generatedRev_list = data.getRev_list();
		generatedRev_list.setCompare(compare);
		if (ModernizedCProgram.marked) {
			ModernizedCProgram.for_each_ref(clear_marks, ((Object)0));
		} 
		ModernizedCProgram.marked = 1;
	}
	public Object getKnown_common() {
		return known_common;
	}
	public void setKnown_common(Object newKnown_common) {
		known_common = newKnown_common;
	}
	public Object getAdd_tip() {
		return add_tip;
	}
	public void setAdd_tip(Object newAdd_tip) {
		add_tip = newAdd_tip;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getAck() {
		return ack;
	}
	public void setAck(Object newAck) {
		ack = newAck;
	}
	public Object getRelease() {
		return release;
	}
	public void setRelease(Object newRelease) {
		release = newRelease;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
/*
	 * Before negotiation starts, indicate that the server is known to have
	 * this commit.
	 */
