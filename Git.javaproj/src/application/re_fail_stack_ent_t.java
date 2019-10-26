package application;

public class re_fail_stack_ent_t {
	private int idx;
	private int node;
	private Object regs;
	private  eps_via_nodes;
	
	public re_fail_stack_ent_t(int idx, int node, Object regs,  eps_via_nodes) {
		setIdx(idx);
		setNode(node);
		setRegs(regs);
		setEps_via_nodes(eps_via_nodes);
	}
	public re_fail_stack_ent_t() {
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int newIdx) {
		idx = newIdx;
	}
	public int getNode() {
		return node;
	}
	public void setNode(int newNode) {
		node = newNode;
	}
	public Object getRegs() {
		return regs;
	}
	public void setRegs(Object newRegs) {
		regs = newRegs;
	}
	public  getEps_via_nodes() {
		return eps_via_nodes;
	}
	public void setEps_via_nodes( newEps_via_nodes) {
		eps_via_nodes = newEps_via_nodes;
	}
}
