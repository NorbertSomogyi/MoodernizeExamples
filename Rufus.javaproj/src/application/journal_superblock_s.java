package application;

/*
 * The journal superblock.  All fields are in big-endian byte order.
 */
public class journal_superblock_s {
	private journal_header_s s_header;
	private Object s_blocksize;
	private Object s_maxlen;
	private Object s_first;
	private Object s_sequence;
	private Object s_start;
	private Object s_errno;
	private Object s_feature_compat;
	private Object s_feature_incompat;
	private Object s_feature_ro_compat;
	private Object[] s_uuid;
	private Object s_nr_users;
	private Object s_dynsuper;
	private Object s_max_transaction;
	private Object s_max_trans_data;
	private Object s_checksum_type;
	private Object[] s_padding2;
	private Object[] s_padding;
	private Object s_checksum;
	private Object[] s_users;
	
	public journal_superblock_s(journal_header_s s_header, Object s_blocksize, Object s_maxlen, Object s_first, Object s_sequence, Object s_start, Object s_errno, Object s_feature_compat, Object s_feature_incompat, Object s_feature_ro_compat, Object[] s_uuid, Object s_nr_users, Object s_dynsuper, Object s_max_transaction, Object s_max_trans_data, Object s_checksum_type, Object[] s_padding2, Object[] s_padding, Object s_checksum, Object[] s_users) {
		setS_header(s_header);
		setS_blocksize(s_blocksize);
		setS_maxlen(s_maxlen);
		setS_first(s_first);
		setS_sequence(s_sequence);
		setS_start(s_start);
		setS_errno(s_errno);
		setS_feature_compat(s_feature_compat);
		setS_feature_incompat(s_feature_incompat);
		setS_feature_ro_compat(s_feature_ro_compat);
		setS_uuid(s_uuid);
		setS_nr_users(s_nr_users);
		setS_dynsuper(s_dynsuper);
		setS_max_transaction(s_max_transaction);
		setS_max_trans_data(s_max_trans_data);
		setS_checksum_type(s_checksum_type);
		setS_padding2(s_padding2);
		setS_padding(s_padding);
		setS_checksum(s_checksum);
		setS_users(s_users);
	}
	public journal_superblock_s() {
	}
	
	public journal_header_s getS_header() {
		return s_header;
	}
	public void setS_header(journal_header_s newS_header) {
		s_header = newS_header;
	}
	public Object getS_blocksize() {
		return s_blocksize;
	}
	public void setS_blocksize(Object newS_blocksize) {
		s_blocksize = newS_blocksize;
	}
	public Object getS_maxlen() {
		return s_maxlen;
	}
	public void setS_maxlen(Object newS_maxlen) {
		s_maxlen = newS_maxlen;
	}
	public Object getS_first() {
		return s_first;
	}
	public void setS_first(Object newS_first) {
		s_first = newS_first;
	}
	public Object getS_sequence() {
		return s_sequence;
	}
	public void setS_sequence(Object newS_sequence) {
		s_sequence = newS_sequence;
	}
	public Object getS_start() {
		return s_start;
	}
	public void setS_start(Object newS_start) {
		s_start = newS_start;
	}
	public Object getS_errno() {
		return s_errno;
	}
	public void setS_errno(Object newS_errno) {
		s_errno = newS_errno;
	}
	public Object getS_feature_compat() {
		return s_feature_compat;
	}
	public void setS_feature_compat(Object newS_feature_compat) {
		s_feature_compat = newS_feature_compat;
	}
	public Object getS_feature_incompat() {
		return s_feature_incompat;
	}
	public void setS_feature_incompat(Object newS_feature_incompat) {
		s_feature_incompat = newS_feature_incompat;
	}
	public Object getS_feature_ro_compat() {
		return s_feature_ro_compat;
	}
	public void setS_feature_ro_compat(Object newS_feature_ro_compat) {
		s_feature_ro_compat = newS_feature_ro_compat;
	}
	public Object[] getS_uuid() {
		return s_uuid;
	}
	public void setS_uuid(Object[] newS_uuid) {
		s_uuid = newS_uuid;
	}
	public Object getS_nr_users() {
		return s_nr_users;
	}
	public void setS_nr_users(Object newS_nr_users) {
		s_nr_users = newS_nr_users;
	}
	public Object getS_dynsuper() {
		return s_dynsuper;
	}
	public void setS_dynsuper(Object newS_dynsuper) {
		s_dynsuper = newS_dynsuper;
	}
	public Object getS_max_transaction() {
		return s_max_transaction;
	}
	public void setS_max_transaction(Object newS_max_transaction) {
		s_max_transaction = newS_max_transaction;
	}
	public Object getS_max_trans_data() {
		return s_max_trans_data;
	}
	public void setS_max_trans_data(Object newS_max_trans_data) {
		s_max_trans_data = newS_max_trans_data;
	}
	public Object getS_checksum_type() {
		return s_checksum_type;
	}
	public void setS_checksum_type(Object newS_checksum_type) {
		s_checksum_type = newS_checksum_type;
	}
	public Object[] getS_padding2() {
		return s_padding2;
	}
	public void setS_padding2(Object[] newS_padding2) {
		s_padding2 = newS_padding2;
	}
	public Object[] getS_padding() {
		return s_padding;
	}
	public void setS_padding(Object[] newS_padding) {
		s_padding = newS_padding;
	}
	public Object getS_checksum() {
		return s_checksum;
	}
	public void setS_checksum(Object newS_checksum) {
		s_checksum = newS_checksum;
	}
	public Object[] getS_users() {
		return s_users;
	}
	public void setS_users(Object[] newS_users) {
		s_users = newS_users;
	}
}
