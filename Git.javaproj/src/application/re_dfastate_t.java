package application;

public class re_dfastate_t {
	private int hash;
	private  nodes;
	private  non_eps_nodes;
	private  inveclosure;
	private  entrance_nodes;
	private re_dfastate_t trtable;
	private re_dfastate_t word_trtable;
	private int context;
	private int halt;
	private int accept_mb;
	private int has_backref;
	private int has_constraint;
	
	public re_dfastate_t(int hash,  nodes,  non_eps_nodes,  inveclosure,  entrance_nodes, re_dfastate_t trtable, re_dfastate_t word_trtable, int context, int halt, int accept_mb, int has_backref, int has_constraint) {
		setHash(hash);
		setNodes(nodes);
		setNon_eps_nodes(non_eps_nodes);
		setInveclosure(inveclosure);
		setEntrance_nodes(entrance_nodes);
		setTrtable(trtable);
		setWord_trtable(word_trtable);
		setContext(context);
		setHalt(halt);
		setAccept_mb(accept_mb);
		setHas_backref(has_backref);
		setHas_constraint(has_constraint);
	}
	public re_dfastate_t() {
	}
	
	public int getHash() {
		return hash;
	}
	public void setHash(int newHash) {
		hash = newHash;
	}
	public  getNodes() {
		return nodes;
	}
	public void setNodes( newNodes) {
		nodes = newNodes;
	}
	public  getNon_eps_nodes() {
		return non_eps_nodes;
	}
	public void setNon_eps_nodes( newNon_eps_nodes) {
		non_eps_nodes = newNon_eps_nodes;
	}
	public  getInveclosure() {
		return inveclosure;
	}
	public void setInveclosure( newInveclosure) {
		inveclosure = newInveclosure;
	}
	public  getEntrance_nodes() {
		return entrance_nodes;
	}
	public void setEntrance_nodes( newEntrance_nodes) {
		entrance_nodes = newEntrance_nodes;
	}
	public re_dfastate_t getTrtable() {
		return trtable;
	}
	public void setTrtable(re_dfastate_t newTrtable) {
		trtable = newTrtable;
	}
	public re_dfastate_t getWord_trtable() {
		return word_trtable;
	}
	public void setWord_trtable(re_dfastate_t newWord_trtable) {
		word_trtable = newWord_trtable;
	}
	public int getContext() {
		return context;
	}
	public void setContext(int newContext) {
		context = newContext;
	}
	public int getHalt() {
		return halt;
	}
	public void setHalt(int newHalt) {
		halt = newHalt;
	}
	public int getAccept_mb() {
		return accept_mb;
	}
	public void setAccept_mb(int newAccept_mb) {
		accept_mb = newAccept_mb;
	}
	public int getHas_backref() {
		return has_backref;
	}
	public void setHas_backref(int newHas_backref) {
		has_backref = newHas_backref;
	}
	public int getHas_constraint() {
		return has_constraint;
	}
	public void setHas_constraint(int newHas_constraint) {
		has_constraint = newHas_constraint;
	}
}
