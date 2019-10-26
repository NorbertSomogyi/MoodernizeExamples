package application;

/* Table of rename/copy src files */
public class diff_rename_src {
	private diff_filepair p;
	private int score;
	
	public diff_rename_src(diff_filepair p, int score) {
		setP(p);
		setScore(score);
	}
	public diff_rename_src() {
	}
	
	public diff_rename_src register_rename_src(diff_filepair p) {
		int first;
		int last;
		diff_filespec generatedOne = p.getOne();
		diff_filespec one = generatedOne;
		int generatedScore = p.getScore();
		int score = generatedScore;
		first = 0;
		last = ModernizedCProgram.rename_src_nr;
		Byte generatedPath = one.getPath();
		while (last > first) {
			int next = first + ((last - first) >> 1);
			diff_rename_src src = (rename_src[next]);
			int cmp = .strcmp(generatedPath, generatedPath);
			if (!cmp) {
				return src;
			} 
			if (cmp < 0) {
				last = next;
				continue;
			} 
			first = next + 1;
		}
		do {
			if ((ModernizedCProgram.rename_src_nr + 1) > ModernizedCProgram.rename_src_alloc) {
				if ((((ModernizedCProgram.rename_src_alloc) + 16) * 3 / 2) < (ModernizedCProgram.rename_src_nr + 1)) {
					ModernizedCProgram.rename_src_alloc = (ModernizedCProgram.rename_src_nr + 1);
				} else {
						ModernizedCProgram.rename_src_alloc = (((ModernizedCProgram.rename_src_alloc) + 16) * 3 / 2);
				} 
				(rename_src) = ModernizedCProgram.xrealloc((rename_src), ModernizedCProgram.st_mult(, (ModernizedCProgram.rename_src_alloc)));
			} 
		} while (/* insert to make it at "first" */0);
		ModernizedCProgram.rename_src_nr++;
		if (first < ModernizedCProgram.rename_src_nr) {
			ModernizedCProgram.move_array((rename_src + first + 1), (rename_src + first), (ModernizedCProgram.rename_src_nr - first - 1),  + ( - 1));
		} 
		rename_src[first].setP(p);
		rename_src[first].setScore(score);
		return (rename_src[first]);
	}
	public diff_filepair getP() {
		return p;
	}
	public void setP(diff_filepair newP) {
		p = newP;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int newScore) {
		score = newScore;
	}
}
