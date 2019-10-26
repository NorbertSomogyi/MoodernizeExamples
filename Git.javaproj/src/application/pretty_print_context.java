package application;

public class pretty_print_context {
	private cmit_fmt fmt;
	private int abbrev;
	private Object after_subject;
	private int preserve_subject;
	private date_mode date_mode;
	private int date_mode_explicit;
	private int print_email_subject;
	private int expand_tabs_in_log;
	private int need_8bit_cte;
	private byte notes_message;
	private reflog_walk_info reflog_info;
	private rev_info rev;
	private Object output_encoding;
	private string_list mailmap;
	private int color;
	private ident_split from_ident;
	private string_list in_body_headers;
	private int graph_width;
	
	public pretty_print_context(cmit_fmt fmt, int abbrev, Object after_subject, int preserve_subject, date_mode date_mode, int date_mode_explicit, int print_email_subject, int expand_tabs_in_log, int need_8bit_cte, byte notes_message, reflog_walk_info reflog_info, rev_info rev, Object output_encoding, string_list mailmap, int color, ident_split from_ident, string_list in_body_headers, int graph_width) {
		setFmt(fmt);
		setAbbrev(abbrev);
		setAfter_subject(after_subject);
		setPreserve_subject(preserve_subject);
		setDate_mode(date_mode);
		setDate_mode_explicit(date_mode_explicit);
		setPrint_email_subject(print_email_subject);
		setExpand_tabs_in_log(expand_tabs_in_log);
		setNeed_8bit_cte(need_8bit_cte);
		setNotes_message(notes_message);
		setReflog_info(reflog_info);
		setRev(rev);
		setOutput_encoding(output_encoding);
		setMailmap(mailmap);
		setColor(color);
		setFrom_ident(from_ident);
		setIn_body_headers(in_body_headers);
		setGraph_width(graph_width);
	}
	public pretty_print_context() {
	}
	
	public cmit_fmt getFmt() {
		return fmt;
	}
	public void setFmt(cmit_fmt newFmt) {
		fmt = newFmt;
	}
	public int getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(int newAbbrev) {
		abbrev = newAbbrev;
	}
	public Object getAfter_subject() {
		return after_subject;
	}
	public void setAfter_subject(Object newAfter_subject) {
		after_subject = newAfter_subject;
	}
	public int getPreserve_subject() {
		return preserve_subject;
	}
	public void setPreserve_subject(int newPreserve_subject) {
		preserve_subject = newPreserve_subject;
	}
	public date_mode getDate_mode() {
		return date_mode;
	}
	public void setDate_mode(date_mode newDate_mode) {
		date_mode = newDate_mode;
	}
	public int getDate_mode_explicit() {
		return date_mode_explicit;
	}
	public void setDate_mode_explicit(int newDate_mode_explicit) {
		date_mode_explicit = newDate_mode_explicit;
	}
	public int getPrint_email_subject() {
		return print_email_subject;
	}
	public void setPrint_email_subject(int newPrint_email_subject) {
		print_email_subject = newPrint_email_subject;
	}
	public int getExpand_tabs_in_log() {
		return expand_tabs_in_log;
	}
	public void setExpand_tabs_in_log(int newExpand_tabs_in_log) {
		expand_tabs_in_log = newExpand_tabs_in_log;
	}
	public int getNeed_8bit_cte() {
		return need_8bit_cte;
	}
	public void setNeed_8bit_cte(int newNeed_8bit_cte) {
		need_8bit_cte = newNeed_8bit_cte;
	}
	public byte getNotes_message() {
		return notes_message;
	}
	public void setNotes_message(byte newNotes_message) {
		notes_message = newNotes_message;
	}
	public reflog_walk_info getReflog_info() {
		return reflog_info;
	}
	public void setReflog_info(reflog_walk_info newReflog_info) {
		reflog_info = newReflog_info;
	}
	public rev_info getRev() {
		return rev;
	}
	public void setRev(rev_info newRev) {
		rev = newRev;
	}
	public Object getOutput_encoding() {
		return output_encoding;
	}
	public void setOutput_encoding(Object newOutput_encoding) {
		output_encoding = newOutput_encoding;
	}
	public string_list getMailmap() {
		return mailmap;
	}
	public void setMailmap(string_list newMailmap) {
		mailmap = newMailmap;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int newColor) {
		color = newColor;
	}
	public ident_split getFrom_ident() {
		return from_ident;
	}
	public void setFrom_ident(ident_split newFrom_ident) {
		from_ident = newFrom_ident;
	}
	public string_list getIn_body_headers() {
		return in_body_headers;
	}
	public void setIn_body_headers(string_list newIn_body_headers) {
		in_body_headers = newIn_body_headers;
	}
	public int getGraph_width() {
		return graph_width;
	}
	public void setGraph_width(int newGraph_width) {
		graph_width = newGraph_width;
	}
}
/*
	 * Callers should tweak these to change the behavior of pp_* functions.
	 */
