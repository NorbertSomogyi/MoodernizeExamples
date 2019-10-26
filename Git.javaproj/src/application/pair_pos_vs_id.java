package application;

public class pair_pos_vs_id {
	private Object pos;
	private Object pack_int_id;
	
	public pair_pos_vs_id(Object pos, Object pack_int_id) {
		setPos(pos);
		setPack_int_id(pack_int_id);
	}
	public pair_pos_vs_id() {
	}
	
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getPack_int_id() {
		return pack_int_id;
	}
	public void setPack_int_id(Object newPack_int_id) {
		pack_int_id = newPack_int_id;
	}
}
