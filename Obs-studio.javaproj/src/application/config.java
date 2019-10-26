package application;

public class config {
	private int indent;
	private int compact;
	private int preserve_order;
	private int ensure_ascii;
	private int sort_keys;
	private int strip;
	private int use_env;
	private int have_hashseed;
	private int hashseed;
	private int precision;
	
	public config(int indent, int compact, int preserve_order, int ensure_ascii, int sort_keys, int strip, int use_env, int have_hashseed, int hashseed, int precision) {
		setIndent(indent);
		setCompact(compact);
		setPreserve_order(preserve_order);
		setEnsure_ascii(ensure_ascii);
		setSort_keys(sort_keys);
		setStrip(strip);
		setUse_env(use_env);
		setHave_hashseed(have_hashseed);
		setHashseed(hashseed);
		setPrecision(precision);
	}
	public config() {
	}
	
	public int getIndent() {
		return indent;
	}
	public void setIndent(int newIndent) {
		indent = newIndent;
	}
	public int getCompact() {
		return compact;
	}
	public void setCompact(int newCompact) {
		compact = newCompact;
	}
	public int getPreserve_order() {
		return preserve_order;
	}
	public void setPreserve_order(int newPreserve_order) {
		preserve_order = newPreserve_order;
	}
	public int getEnsure_ascii() {
		return ensure_ascii;
	}
	public void setEnsure_ascii(int newEnsure_ascii) {
		ensure_ascii = newEnsure_ascii;
	}
	public int getSort_keys() {
		return sort_keys;
	}
	public void setSort_keys(int newSort_keys) {
		sort_keys = newSort_keys;
	}
	public int getStrip() {
		return strip;
	}
	public void setStrip(int newStrip) {
		strip = newStrip;
	}
	public int getUse_env() {
		return use_env;
	}
	public void setUse_env(int newUse_env) {
		use_env = newUse_env;
	}
	public int getHave_hashseed() {
		return have_hashseed;
	}
	public void setHave_hashseed(int newHave_hashseed) {
		have_hashseed = newHave_hashseed;
	}
	public int getHashseed() {
		return hashseed;
	}
	public void setHashseed(int newHashseed) {
		hashseed = newHashseed;
	}
	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int newPrecision) {
		precision = newPrecision;
	}
}
