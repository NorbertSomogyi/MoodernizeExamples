package application;

/*
 * Maximum size property that can be read at one time by
 * this module:
 */
public class ServerReply {
	private Object id;
	private growarray strings;
	
	public ServerReply(Object id, growarray strings) {
		setId(id);
		setStrings(strings);
	}
	public ServerReply() {
	}
	
	public ServerReply ServerReplyFind(Object w, ServerReplyOp op) {
		ServerReply p = new ServerReply();
		ServerReply e = new ServerReply();
		int i;
		p = (ServerReply)ModernizedCProgram.serverReply.getGa_data();
		Object generatedId = p.getId();
		for (i = 0; i < ModernizedCProgram.serverReply.getGa_len(); ) {
			if (generatedId == w) {
				break;
			} 
		}
		if (i >= ModernizedCProgram.serverReply.getGa_len()) {
			p = ((Object)0);
		} 
		growarray generatedStrings = e.getStrings();
		if (p == ((Object)0) && ServerReplyOp.op == ServerReplyOp.SROP_Add) {
			if (ModernizedCProgram.serverReply.getGa_growsize() == 0) {
				ModernizedCProgram.serverReply.ga_init2(/*Error: Unsupported expression*/, 1);
			} 
			if (ModernizedCProgram.serverReply.ga_grow(1) == 1) {
				p = ((ServerReply)ModernizedCProgram.serverReply.getGa_data()) + ModernizedCProgram.serverReply.getGa_len();
				e.setId(w);
				generatedStrings.ga_init2(1, 100);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(p), (byte)(e), (size_t)(/*Error: sizeof expression not supported yet*/));
				ModernizedCProgram.serverReply.getGa_len()++;
			} 
		}  else if (p != ((Object)0) && ServerReplyOp.op == ServerReplyOp.SROP_Delete) {
			generatedStrings.ga_clear();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(p), (byte)(p + 1), (size_t)((ModernizedCProgram.serverReply.getGa_len() - i - 1) * /*Error: sizeof expression not supported yet*/));
			ModernizedCProgram.serverReply.getGa_len()--;
		} 
		return p/*
		 * Convert string to windowid.
		 * Issue an error if the id is invalid.
		 */;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public growarray getStrings() {
		return strings;
	}
	public void setStrings(growarray newStrings) {
		strings = newStrings;
	}
}
