package application;

/* 17 */
/* 18 */
/* 32 */
/* 48 */
/* 64 */
public class blake2b_param__ {
	private Object digest_length;
	private Object key_length;
	private Object fanout;
	private Object depth;
	private Object leaf_length;
	private Object node_offset;
	private Object xof_length;
	private Object node_depth;
	private Object inner_length;
	private Object reserved;
	private Object salt;
	private Object personal;
	
	public blake2b_param__(Object digest_length, Object key_length, Object fanout, Object depth, Object leaf_length, Object node_offset, Object xof_length, Object node_depth, Object inner_length, Object reserved, Object salt, Object personal) {
		setDigest_length(digest_length);
		setKey_length(key_length);
		setFanout(fanout);
		setDepth(depth);
		setLeaf_length(leaf_length);
		setNode_offset(node_offset);
		setXof_length(xof_length);
		setNode_depth(node_depth);
		setInner_length(inner_length);
		setReserved(reserved);
		setSalt(salt);
		setPersonal(personal);
	}
	public blake2b_param__() {
	}
	
	public Object getDigest_length() {
		return digest_length;
	}
	public void setDigest_length(Object newDigest_length) {
		digest_length = newDigest_length;
	}
	public Object getKey_length() {
		return key_length;
	}
	public void setKey_length(Object newKey_length) {
		key_length = newKey_length;
	}
	public Object getFanout() {
		return fanout;
	}
	public void setFanout(Object newFanout) {
		fanout = newFanout;
	}
	public Object getDepth() {
		return depth;
	}
	public void setDepth(Object newDepth) {
		depth = newDepth;
	}
	public Object getLeaf_length() {
		return leaf_length;
	}
	public void setLeaf_length(Object newLeaf_length) {
		leaf_length = newLeaf_length;
	}
	public Object getNode_offset() {
		return node_offset;
	}
	public void setNode_offset(Object newNode_offset) {
		node_offset = newNode_offset;
	}
	public Object getXof_length() {
		return xof_length;
	}
	public void setXof_length(Object newXof_length) {
		xof_length = newXof_length;
	}
	public Object getNode_depth() {
		return node_depth;
	}
	public void setNode_depth(Object newNode_depth) {
		node_depth = newNode_depth;
	}
	public Object getInner_length() {
		return inner_length;
	}
	public void setInner_length(Object newInner_length) {
		inner_length = newInner_length;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getSalt() {
		return salt;
	}
	public void setSalt(Object newSalt) {
		salt = newSalt;
	}
	public Object getPersonal() {
		return personal;
	}
	public void setPersonal(Object newPersonal) {
		personal = newPersonal;
	}
}
