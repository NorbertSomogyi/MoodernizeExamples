package application;

public class helper_data {
	private Object name;
	private child_process helper;
	private _iobuf out;
	private int fetch;
	private int import;
	private int bidi_import;
	private int export;
	private int option;
	private int push;
	private int connect;
	private int stateless_connect;
	private int signed_tags;
	private int check_connectivity;
	private int no_disconnect_req;
	private int no_private_update;
	private int get_refs_list_called;
	private Byte export_marks;
	private Byte import_marks;
	private refspec rs;
	private git_transport_options transport_options;
	
	public helper_data(Object name, child_process helper, _iobuf out, int fetch, int import, int bidi_import, int export, int option, int push, int connect, int stateless_connect, int signed_tags, int check_connectivity, int no_disconnect_req, int no_private_update, int get_refs_list_called, Byte export_marks, Byte import_marks, refspec rs, git_transport_options transport_options) {
		setName(name);
		setHelper(helper);
		setOut(out);
		setFetch(fetch);
		setImport(import);
		setBidi_import(bidi_import);
		setExport(export);
		setOption(option);
		setPush(push);
		setConnect(connect);
		setStateless_connect(stateless_connect);
		setSigned_tags(signed_tags);
		setCheck_connectivity(check_connectivity);
		setNo_disconnect_req(no_disconnect_req);
		setNo_private_update(no_private_update);
		setGet_refs_list_called(get_refs_list_called);
		setExport_marks(export_marks);
		setImport_marks(import_marks);
		setRs(rs);
		setTransport_options(transport_options);
	}
	public helper_data() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public child_process getHelper() {
		return helper;
	}
	public void setHelper(child_process newHelper) {
		helper = newHelper;
	}
	public _iobuf getOut() {
		return out;
	}
	public void setOut(_iobuf newOut) {
		out = newOut;
	}
	public int getFetch() {
		return fetch;
	}
	public void setFetch(int newFetch) {
		fetch = newFetch;
	}
	public int getImport() {
		return import;
	}
	public void setImport(int newImport) {
		import = newImport;
	}
	public int getBidi_import() {
		return bidi_import;
	}
	public void setBidi_import(int newBidi_import) {
		bidi_import = newBidi_import;
	}
	public int getExport() {
		return export;
	}
	public void setExport(int newExport) {
		export = newExport;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int newOption) {
		option = newOption;
	}
	public int getPush() {
		return push;
	}
	public void setPush(int newPush) {
		push = newPush;
	}
	public int getConnect() {
		return connect;
	}
	public void setConnect(int newConnect) {
		connect = newConnect;
	}
	public int getStateless_connect() {
		return stateless_connect;
	}
	public void setStateless_connect(int newStateless_connect) {
		stateless_connect = newStateless_connect;
	}
	public int getSigned_tags() {
		return signed_tags;
	}
	public void setSigned_tags(int newSigned_tags) {
		signed_tags = newSigned_tags;
	}
	public int getCheck_connectivity() {
		return check_connectivity;
	}
	public void setCheck_connectivity(int newCheck_connectivity) {
		check_connectivity = newCheck_connectivity;
	}
	public int getNo_disconnect_req() {
		return no_disconnect_req;
	}
	public void setNo_disconnect_req(int newNo_disconnect_req) {
		no_disconnect_req = newNo_disconnect_req;
	}
	public int getNo_private_update() {
		return no_private_update;
	}
	public void setNo_private_update(int newNo_private_update) {
		no_private_update = newNo_private_update;
	}
	public int getGet_refs_list_called() {
		return get_refs_list_called;
	}
	public void setGet_refs_list_called(int newGet_refs_list_called) {
		get_refs_list_called = newGet_refs_list_called;
	}
	public Byte getExport_marks() {
		return export_marks;
	}
	public void setExport_marks(Byte newExport_marks) {
		export_marks = newExport_marks;
	}
	public Byte getImport_marks() {
		return import_marks;
	}
	public void setImport_marks(Byte newImport_marks) {
		import_marks = newImport_marks;
	}
	public refspec getRs() {
		return rs;
	}
	public void setRs(refspec newRs) {
		rs = newRs;
	}
	public git_transport_options getTransport_options() {
		return transport_options;
	}
	public void setTransport_options(git_transport_options newTransport_options) {
		transport_options = newTransport_options;
	}
}
