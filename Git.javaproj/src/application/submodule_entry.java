package application;

public class submodule_entry {
	private hashmap_entry ent;
	private submodule config;
	
	public submodule_entry(hashmap_entry ent, submodule config) {
		setEnt(ent);
		setConfig(config);
	}
	public submodule_entry() {
	}
	
	public void free_one_config() {
		submodule generatedConfig = this.getConfig();
		Object generatedPath = generatedConfig.getPath();
		ModernizedCProgram.free((Object)generatedPath);
		Object generatedName = generatedConfig.getName();
		ModernizedCProgram.free((Object)generatedName);
		Object generatedBranch = generatedConfig.getBranch();
		ModernizedCProgram.free((Object)generatedBranch);
		submodule_update_strategy generatedUpdate_strategy = generatedConfig.getUpdate_strategy();
		Object generatedCommand = generatedUpdate_strategy.getCommand();
		ModernizedCProgram.free((Object)generatedCommand);
		ModernizedCProgram.free(generatedConfig);
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public submodule getConfig() {
		return config;
	}
	public void setConfig(submodule newConfig) {
		config = newConfig;
	}
}
