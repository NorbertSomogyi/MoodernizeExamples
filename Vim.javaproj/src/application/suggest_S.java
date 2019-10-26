package application;

// One word suggestion.  Used in "si_ga".
public class suggest_S {
	private Object st_word;
	private int st_wordlen;
	private int st_orglen;
	private int st_score;
	private int st_altscore;
	private int st_salscore;
	private int st_had_bonus;
	private slang_S st_slang;
	
	public suggest_S(Object st_word, int st_wordlen, int st_orglen, int st_score, int st_altscore, int st_salscore, int st_had_bonus, slang_S st_slang) {
		setSt_word(st_word);
		setSt_wordlen(st_wordlen);
		setSt_orglen(st_orglen);
		setSt_score(st_score);
		setSt_altscore(st_altscore);
		setSt_salscore(st_salscore);
		setSt_had_bonus(st_had_bonus);
		setSt_slang(st_slang);
	}
	public suggest_S() {
	}
	
	public Object getSt_word() {
		return st_word;
	}
	public void setSt_word(Object newSt_word) {
		st_word = newSt_word;
	}
	public int getSt_wordlen() {
		return st_wordlen;
	}
	public void setSt_wordlen(int newSt_wordlen) {
		st_wordlen = newSt_wordlen;
	}
	public int getSt_orglen() {
		return st_orglen;
	}
	public void setSt_orglen(int newSt_orglen) {
		st_orglen = newSt_orglen;
	}
	public int getSt_score() {
		return st_score;
	}
	public void setSt_score(int newSt_score) {
		st_score = newSt_score;
	}
	public int getSt_altscore() {
		return st_altscore;
	}
	public void setSt_altscore(int newSt_altscore) {
		st_altscore = newSt_altscore;
	}
	public int getSt_salscore() {
		return st_salscore;
	}
	public void setSt_salscore(int newSt_salscore) {
		st_salscore = newSt_salscore;
	}
	public int getSt_had_bonus() {
		return st_had_bonus;
	}
	public void setSt_had_bonus(int newSt_had_bonus) {
		st_had_bonus = newSt_had_bonus;
	}
	public slang_S getSt_slang() {
		return st_slang;
	}
	public void setSt_slang(slang_S newSt_slang) {
		st_slang = newSt_slang;
	}
}
