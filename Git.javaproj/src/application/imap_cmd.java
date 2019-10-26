package application;

public class imap_cmd {
	private imap_cmd next;
	private imap_cmd_cb cb;
	private Byte cmd;
	private int tag;
	
	public imap_cmd(imap_cmd next, imap_cmd_cb cb, Byte cmd, int tag) {
		setNext(next);
		setCb(cb);
		setCmd(cmd);
		setTag(tag);
	}
	public imap_cmd() {
	}
	
	public imap_cmd issue_imap_cmd(imap_store ctx, imap_cmd_cb cb, Object fmt, Object ap) {
		imap generatedImap = ctx.getImap();
		imap imap = generatedImap;
		imap_cmd cmd = new imap_cmd();
		int n;
		int bufl;
		byte[] buf = new byte[1024];
		cmd = ModernizedCProgram.xmalloc();
		Byte generatedCmd = cmd.getCmd();
		ModernizedCProgram.nfvasprintf(generatedCmd, fmt, ap);
		int generatedNexttag = imap.getNexttag();
		cmd.setTag(++generatedNexttag);
		imap_cmd_cb generatedCb = cmd.getCb();
		if (cb) {
			cmd.setCb(cb);
		} else {
				.memset(generatedCb, 0, );
		} 
		int generatedLiteral_pending = imap.getLiteral_pending();
		while (generatedLiteral_pending) {
			ModernizedCProgram.get_cmd_result(ctx, ((Object)0));
		}
		Byte generatedData = generatedCb.getData();
		int generatedTag = cmd.getTag();
		int generatedDlen = generatedCb.getDlen();
		int generatedCaps = imap.getCaps();
		if (!generatedData) {
			bufl = ModernizedCProgram.nfsnprintf(buf, , "%d %s\r\n", generatedTag, generatedCmd);
		} else {
				bufl = ModernizedCProgram.nfsnprintf(buf, , "%d %s{%d%s}\r\n", generatedTag, generatedCmd, generatedDlen, (generatedCaps & (1 << (CAPABILITY.LITERALPLUS))) ? "+" : "");
		} 
		int generatedNum_in_progress = imap.getNum_in_progress();
		if (0 < ModernizedCProgram.verbosity) {
			if (generatedNum_in_progress) {
				.printf("(%d in progress) ", generatedNum_in_progress);
			} 
			if (!ModernizedCProgram.starts_with(generatedCmd, "LOGIN")) {
				.printf(">>> %s", buf);
			} else {
					.printf(">>> %d LOGIN <user> <pass>\n", generatedTag);
			} 
		} 
		imap_buffer generatedBuf = imap.getBuf();
		imap_socket generatedSock = generatedBuf.getSock();
		if (generatedSock.socket_write(buf, bufl) != bufl) {
			ModernizedCProgram.free(generatedCmd);
			ModernizedCProgram.free(cmd);
			if (cb) {
				ModernizedCProgram.free(generatedData);
			} 
			return ((Object)0);
		} 
		Object generatedCont = generatedCb.getCont();
		if (generatedData) {
			if ((generatedCaps & (1 << (CAPABILITY.LITERALPLUS)))) {
				n = generatedSock.socket_write(generatedData, generatedDlen);
				ModernizedCProgram.free(generatedData);
				if (n != generatedDlen || generatedSock.socket_write("\r\n", 2) != 2) {
					ModernizedCProgram.free(generatedCmd);
					ModernizedCProgram.free(cmd);
					return ((Object)0);
				} 
				generatedCb.setData(((Object)0));
			} else {
					imap.setLiteral_pending(1);
			} 
		}  else if (generatedCont) {
			imap.setLiteral_pending(1);
		} 
		cmd.setNext(((Object)0));
		imap_cmd generatedIn_progress_append = imap.getIn_progress_append();
		generatedIn_progress_append = cmd;
		imap_cmd generatedNext = cmd.getNext();
		imap.setIn_progress_append(generatedNext);
		generatedNum_in_progress++;
		return cmd;
	}
	public imap_cmd getNext() {
		return next;
	}
	public void setNext(imap_cmd newNext) {
		next = newNext;
	}
	public imap_cmd_cb getCb() {
		return cb;
	}
	public void setCb(imap_cmd_cb newCb) {
		cb = newCb;
	}
	public Byte getCmd() {
		return cmd;
	}
	public void setCmd(Byte newCmd) {
		cmd = newCmd;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int newTag) {
		tag = newTag;
	}
}
