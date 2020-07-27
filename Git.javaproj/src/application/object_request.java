package application;

public class object_request {
	private walker walker;
	private object_id oid;
	private alt_base repo;
	private object_request_state state;
	private http_object_request req;
	private list_head node;
	
	public object_request(walker walker, object_id oid, alt_base repo, object_request_state state, http_object_request req, list_head node) {
		setWalker(walker);
		setOid(oid);
		setRepo(repo);
		setState(state);
		setReq(req);
		setNode(node);
	}
	public object_request() {
	}
	
	public void finish_object_request() {
		http_object_request generatedReq = this.getReq();
		if (generatedReq.finish_http_object_request()) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedRename = generatedReq.getRename();
		walker generatedWalker = this.getWalker();
		object_id generatedOid = this.getOid();
		if (generatedRename == 0) {
			generatedWalker.walker_say("got %s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
	}
	public void release_object_request() {
		http_object_request generatedReq = this.getReq();
		int generatedLocalfile = generatedReq.getLocalfile();
		if (generatedReq != ((Object)0) && generatedLocalfile != -1) {
			();
		} 
		list_head generatedNode = this.getNode();
		generatedNode.list_del();
		ModernizedCProgram.free(obj_req);
	}
	public void abort_object_request() {
		obj_req.release_object_request();
	}
	public walker getWalker() {
		return walker;
	}
	public void setWalker(walker newWalker) {
		walker = newWalker;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public alt_base getRepo() {
		return repo;
	}
	public void setRepo(alt_base newRepo) {
		repo = newRepo;
	}
	public object_request_state getState() {
		return state;
	}
	public void setState(object_request_state newState) {
		state = newState;
	}
	public http_object_request getReq() {
		return req;
	}
	public void setReq(http_object_request newReq) {
		req = newReq;
	}
	public list_head getNode() {
		return node;
	}
	public void setNode(list_head newNode) {
		node = newNode;
	}
}
