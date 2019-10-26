package application;

public class diff_score {
	private int src;
	private int dst;
	private int score;
	private int name_score;
	
	public diff_score(int src, int dst, int score, int name_score) {
		setSrc(src);
		setDst(dst);
		setScore(score);
		setName_score(name_score);
	}
	public diff_score() {
	}
	
	public void record_if_better(diff_score o) {
		int i;
		int worst;
		worst = /* find the worst one */0;
		for (i = 1; i < 4; i++) {
			if (ModernizedCProgram.score_compare(m[i], m[worst]) > 0) {
				worst = i;
			} 
		}
		if (ModernizedCProgram.score_compare(m[worst], o) > /* is it better than the worst one? */0) {
			m[worst] = o/*
			 * Returns:
			 * 0 if we are under the limit;
			 * 1 if we need to disable inexact rename detection;
			 * 2 if we would be under the limit if we were given -C instead of -C -C.
			 */;
		} 
	}
	public int find_renames(int dst_cnt, int minimum_score, int copies) {
		int count = 0;
		int i;
		diff_filepair generatedPair = dst.getPair();
		for (i = 0; i < dst_cnt * 4; i++) {
			diff_rename_dst dst = new diff_rename_dst();
			if ((mx[i].getDst() < 0) || (mx[i].getScore() < minimum_score)) {
				break;
			} 
			dst = rename_dst[mx[i].getDst()];
			if (generatedPair) {
				continue;
			} 
			if (!copies && rename_src[mx[i].getSrc()].getP().getOne().getRename_used()) {
				continue;
			} 
			ModernizedCProgram.record_rename_pair(mx[i].getDst(), mx[i].getSrc(), mx[i].getScore());
			count++;
		}
		return count;
	}
	public int getSrc() {
		return src;
	}
	public void setSrc(int newSrc) {
		src = newSrc;
	}
	public int getDst() {
		return dst;
	}
	public void setDst(int newDst) {
		dst = newDst;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int newScore) {
		score = newScore;
	}
	public int getName_score() {
		return name_score;
	}
	public void setName_score(int newName_score) {
		name_score = newName_score;
	}
}
