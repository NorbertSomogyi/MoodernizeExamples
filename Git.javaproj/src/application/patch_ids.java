package application;

public class patch_ids {
	private hashmap patches;
	private diff_options diffopts;
	
	public patch_ids(hashmap patches, diff_options diffopts) {
		setPatches(patches);
		setDiffopts(diffopts);
	}
	public patch_ids() {
	}
	
	public int free_patch_ids() {
		hashmap generatedPatches = this.getPatches();
		generatedPatches.hashmap_free_(((size_t)((patch_id)0).getEnt()));
		;
		return 0;
	}
	public hashmap getPatches() {
		return patches;
	}
	public void setPatches(hashmap newPatches) {
		patches = newPatches;
	}
	public diff_options getDiffopts() {
		return diffopts;
	}
	public void setDiffopts(diff_options newDiffopts) {
		diffopts = newDiffopts;
	}
}
