package application;

public class remote_island {
	private Object hash;
	private oid_array oids;
	
	public remote_island(Object hash, oid_array oids) {
		setHash(hash);
		setOids(oids);
	}
	public remote_island() {
	}
	
	public remote_island get_core_island() {
		if (ModernizedCProgram.core_island_name) {
			khiter_t pos = ModernizedCProgram.kh_get_str(ModernizedCProgram.remote_islands, ModernizedCProgram.core_island_name);
			if (pos < ((ModernizedCProgram.remote_islands).getN_buckets())) {
				return ((ModernizedCProgram.remote_islands).getVals()[pos]);
			} 
		} 
		return ((Object)0);
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public oid_array getOids() {
		return oids;
	}
	public void setOids(oid_array newOids) {
		oids = newOids;
	}
}
