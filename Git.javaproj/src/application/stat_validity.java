package application;

public class stat_validity {
	private stat_data sd;
	
	public stat_validity(stat_data sd) {
		setSd(sd);
	}
	public stat_validity() {
	}
	
	public void stat_validity_clear() {
		stat_data generatedSd = this.getSd();
		do {
			ModernizedCProgram.free(generatedSd);
			(generatedSd) = ((Object)0);
		} while (0);
	}
	public int stat_validity_check(Object path) {
		stat st = new stat();
		stat_data generatedSd = this.getSd();
		if (.stat(path, st) < 0) {
			return generatedSd == ((Object)0);
		} 
		if (!generatedSd) {
			return 0;
		} 
		Object generatedSt_mode = st.getSt_mode();
		return (((generatedSt_mode) & -1024) == -1024) && !st.match_stat_data(generatedSd);
	}
	public void stat_validity_update(int fd) {
		stat st = new stat();
		Object generatedSt_mode = st.getSt_mode();
		stat_data generatedSd = this.getSd();
		if (.fstat(fd, st) < 0 || !(((generatedSt_mode) & -1024) == -1024)) {
			sv.stat_validity_clear();
		} else {
				if (!generatedSd) {
					this.setSd(ModernizedCProgram.xcalloc(1, ));
				} 
				ModernizedCProgram.fill_stat_data(generatedSd, st);
		} 
	}
	public stat_data getSd() {
		return sd;
	}
	public void setSd(stat_data newSd) {
		sd = newSd;
	}
}
