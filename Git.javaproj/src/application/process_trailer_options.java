package application;

public class process_trailer_options {
	private int in_place;
	private int trim_empty;
	private int only_trailers;
	private int only_input;
	private int unfold;
	private int no_divider;
	private int value_only;
	private Object separator;
	private Object filter;
	private Object filter_data;
	
	public process_trailer_options(int in_place, int trim_empty, int only_trailers, int only_input, int unfold, int no_divider, int value_only, Object separator, Object filter, Object filter_data) {
		setIn_place(in_place);
		setTrim_empty(trim_empty);
		setOnly_trailers(only_trailers);
		setOnly_input(only_input);
		setUnfold(unfold);
		setNo_divider(no_divider);
		setValue_only(value_only);
		setSeparator(separator);
		setFilter(filter);
		setFilter_data(filter_data);
	}
	public process_trailer_options() {
	}
	
	public int getIn_place() {
		return in_place;
	}
	public void setIn_place(int newIn_place) {
		in_place = newIn_place;
	}
	public int getTrim_empty() {
		return trim_empty;
	}
	public void setTrim_empty(int newTrim_empty) {
		trim_empty = newTrim_empty;
	}
	public int getOnly_trailers() {
		return only_trailers;
	}
	public void setOnly_trailers(int newOnly_trailers) {
		only_trailers = newOnly_trailers;
	}
	public int getOnly_input() {
		return only_input;
	}
	public void setOnly_input(int newOnly_input) {
		only_input = newOnly_input;
	}
	public int getUnfold() {
		return unfold;
	}
	public void setUnfold(int newUnfold) {
		unfold = newUnfold;
	}
	public int getNo_divider() {
		return no_divider;
	}
	public void setNo_divider(int newNo_divider) {
		no_divider = newNo_divider;
	}
	public int getValue_only() {
		return value_only;
	}
	public void setValue_only(int newValue_only) {
		value_only = newValue_only;
	}
	public Object getSeparator() {
		return separator;
	}
	public void setSeparator(Object newSeparator) {
		separator = newSeparator;
	}
	public Object getFilter() {
		return filter;
	}
	public void setFilter(Object newFilter) {
		filter = newFilter;
	}
	public Object getFilter_data() {
		return filter_data;
	}
	public void setFilter_data(Object newFilter_data) {
		filter_data = newFilter_data;
	}
}
/* TRAILER_H */
