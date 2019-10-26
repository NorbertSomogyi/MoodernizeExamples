package application;

public class prepare_pack_data {
	private repository r;
	private string_list garbage;
	private int local;
	private multi_pack_index m;
	
	public prepare_pack_data(repository r, string_list garbage, int local, multi_pack_index m) {
		setR(r);
		setGarbage(garbage);
		setLocal(local);
		setM(m);
	}
	public prepare_pack_data() {
	}
	
	public repository getR() {
		return r;
	}
	public void setR(repository newR) {
		r = newR;
	}
	public string_list getGarbage() {
		return garbage;
	}
	public void setGarbage(string_list newGarbage) {
		garbage = newGarbage;
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int newLocal) {
		local = newLocal;
	}
	public multi_pack_index getM() {
		return m;
	}
	public void setM(multi_pack_index newM) {
		m = newM;
	}
}
