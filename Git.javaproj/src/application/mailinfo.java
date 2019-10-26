package application;

public class mailinfo {
	private Object input;
	private Object output;
	private Object patchfile;
	private strbuf name;
	private strbuf email;
	private int keep_subject;
	private int keep_non_patch_brackets_in_subject;
	private int add_message_id;
	private int use_scissors;
	private int use_inbody_headers;
	private Object metainfo_charset;
	private Object content;
	private strbuf content_top;
	private strbuf charset;
	private int format_flowed;
	private int delsp;
	private Byte message_id;
	private  transfer_encoding;
	private int patch_lines;
	private int filter_stage;
	private int header_stage;
	private strbuf inbody_header_accum;
	private strbuf p_hdr_data;
	private strbuf s_hdr_data;
	private strbuf log_message;
	private int input_error;
	
	public mailinfo(Object input, Object output, Object patchfile, strbuf name, strbuf email, int keep_subject, int keep_non_patch_brackets_in_subject, int add_message_id, int use_scissors, int use_inbody_headers, Object metainfo_charset, Object content, strbuf content_top, strbuf charset, int format_flowed, int delsp, Byte message_id,  transfer_encoding, int patch_lines, int filter_stage, int header_stage, strbuf inbody_header_accum, strbuf p_hdr_data, strbuf s_hdr_data, strbuf log_message, int input_error) {
		setInput(input);
		setOutput(output);
		setPatchfile(patchfile);
		setName(name);
		setEmail(email);
		setKeep_subject(keep_subject);
		setKeep_non_patch_brackets_in_subject(keep_non_patch_brackets_in_subject);
		setAdd_message_id(add_message_id);
		setUse_scissors(use_scissors);
		setUse_inbody_headers(use_inbody_headers);
		setMetainfo_charset(metainfo_charset);
		setContent(content);
		setContent_top(content_top);
		setCharset(charset);
		setFormat_flowed(format_flowed);
		setDelsp(delsp);
		setMessage_id(message_id);
		setTransfer_encoding(transfer_encoding);
		setPatch_lines(patch_lines);
		setFilter_stage(filter_stage);
		setHeader_stage(header_stage);
		setInbody_header_accum(inbody_header_accum);
		setP_hdr_data(p_hdr_data);
		setS_hdr_data(s_hdr_data);
		setLog_message(log_message);
		setInput_error(input_error);
	}
	public mailinfo() {
	}
	
	public Object getInput() {
		return input;
	}
	public void setInput(Object newInput) {
		input = newInput;
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object newOutput) {
		output = newOutput;
	}
	public Object getPatchfile() {
		return patchfile;
	}
	public void setPatchfile(Object newPatchfile) {
		patchfile = newPatchfile;
	}
	public strbuf getName() {
		return name;
	}
	public void setName(strbuf newName) {
		name = newName;
	}
	public strbuf getEmail() {
		return email;
	}
	public void setEmail(strbuf newEmail) {
		email = newEmail;
	}
	public int getKeep_subject() {
		return keep_subject;
	}
	public void setKeep_subject(int newKeep_subject) {
		keep_subject = newKeep_subject;
	}
	public int getKeep_non_patch_brackets_in_subject() {
		return keep_non_patch_brackets_in_subject;
	}
	public void setKeep_non_patch_brackets_in_subject(int newKeep_non_patch_brackets_in_subject) {
		keep_non_patch_brackets_in_subject = newKeep_non_patch_brackets_in_subject;
	}
	public int getAdd_message_id() {
		return add_message_id;
	}
	public void setAdd_message_id(int newAdd_message_id) {
		add_message_id = newAdd_message_id;
	}
	public int getUse_scissors() {
		return use_scissors;
	}
	public void setUse_scissors(int newUse_scissors) {
		use_scissors = newUse_scissors;
	}
	public int getUse_inbody_headers() {
		return use_inbody_headers;
	}
	public void setUse_inbody_headers(int newUse_inbody_headers) {
		use_inbody_headers = newUse_inbody_headers;
	}
	public Object getMetainfo_charset() {
		return metainfo_charset;
	}
	public void setMetainfo_charset(Object newMetainfo_charset) {
		metainfo_charset = newMetainfo_charset;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object newContent) {
		content = newContent;
	}
	public strbuf getContent_top() {
		return content_top;
	}
	public void setContent_top(strbuf newContent_top) {
		content_top = newContent_top;
	}
	public strbuf getCharset() {
		return charset;
	}
	public void setCharset(strbuf newCharset) {
		charset = newCharset;
	}
	public int getFormat_flowed() {
		return format_flowed;
	}
	public void setFormat_flowed(int newFormat_flowed) {
		format_flowed = newFormat_flowed;
	}
	public int getDelsp() {
		return delsp;
	}
	public void setDelsp(int newDelsp) {
		delsp = newDelsp;
	}
	public Byte getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Byte newMessage_id) {
		message_id = newMessage_id;
	}
	public  getTransfer_encoding() {
		return transfer_encoding;
	}
	public void setTransfer_encoding( newTransfer_encoding) {
		transfer_encoding = newTransfer_encoding;
	}
	public int getPatch_lines() {
		return patch_lines;
	}
	public void setPatch_lines(int newPatch_lines) {
		patch_lines = newPatch_lines;
	}
	public int getFilter_stage() {
		return filter_stage;
	}
	public void setFilter_stage(int newFilter_stage) {
		filter_stage = newFilter_stage;
	}
	public int getHeader_stage() {
		return header_stage;
	}
	public void setHeader_stage(int newHeader_stage) {
		header_stage = newHeader_stage;
	}
	public strbuf getInbody_header_accum() {
		return inbody_header_accum;
	}
	public void setInbody_header_accum(strbuf newInbody_header_accum) {
		inbody_header_accum = newInbody_header_accum;
	}
	public strbuf getP_hdr_data() {
		return p_hdr_data;
	}
	public void setP_hdr_data(strbuf newP_hdr_data) {
		p_hdr_data = newP_hdr_data;
	}
	public strbuf getS_hdr_data() {
		return s_hdr_data;
	}
	public void setS_hdr_data(strbuf newS_hdr_data) {
		s_hdr_data = newS_hdr_data;
	}
	public strbuf getLog_message() {
		return log_message;
	}
	public void setLog_message(strbuf newLog_message) {
		log_message = newLog_message;
	}
	public int getInput_error() {
		return input_error;
	}
	public void setInput_error(int newInput_error) {
		input_error = newInput_error;
	}
}
