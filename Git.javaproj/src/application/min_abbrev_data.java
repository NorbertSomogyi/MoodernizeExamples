package application;

public class min_abbrev_data {
	private int init_len;
	private int cur_len;
	private Byte hex;
	private repository repo;
	private Object oid;
	
	public min_abbrev_data(int init_len, int cur_len, Byte hex, repository repo, Object oid) {
		setInit_len(init_len);
		setCur_len(cur_len);
		setHex(hex);
		setRepo(repo);
		setOid(oid);
	}
	public min_abbrev_data() {
	}
	
	public void find_abbrev_len_packed() {
		multi_pack_index m = new multi_pack_index();
		packed_git p = new packed_git();
		multi_pack_index generatedNext = m.getNext();
		repository generatedRepo = this.getRepo();
		multi_pack_index multi_pack_index = new multi_pack_index();
		for (m = multi_pack_index.get_multi_pack_index(generatedRepo); m; m = generatedNext) {
			ModernizedCProgram.find_abbrev_len_for_midx(m, mad);
		}
		packed_git packed_git = new packed_git();
		for (p = packed_git.get_packed_git(generatedRepo); p; p = generatedNext) {
			ModernizedCProgram.find_abbrev_len_for_pack(p, mad);
		}
	}
	public int getInit_len() {
		return init_len;
	}
	public void setInit_len(int newInit_len) {
		init_len = newInit_len;
	}
	public int getCur_len() {
		return cur_len;
	}
	public void setCur_len(int newCur_len) {
		cur_len = newCur_len;
	}
	public Byte getHex() {
		return hex;
	}
	public void setHex(Byte newHex) {
		hex = newHex;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getOid() {
		return oid;
	}
	public void setOid(Object newOid) {
		oid = newOid;
	}
}
