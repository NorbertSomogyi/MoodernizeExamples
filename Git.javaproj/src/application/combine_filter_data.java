package application;

/* A filter which only shows objects shown by all sub-filters. */
public class combine_filter_data {
	private subfilter[] sub;
	private Object nr;
	
	public combine_filter_data(subfilter[] sub, Object nr) {
		setSub(sub);
		setNr(nr);
	}
	public combine_filter_data() {
	}
	
	public subfilter[] getSub() {
		return sub;
	}
	public void setSub(subfilter[] newSub) {
		sub = newSub;
	}
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
}
