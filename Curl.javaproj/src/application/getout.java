package application;

/* next one */
public class getout {
	private getout next;
	private Byte url;
	private Byte outfile;
	private Byte infile;
	private int flags;
	
	public getout(getout next, Byte url, Byte outfile, Byte infile, int flags) {
		setNext(next);
		setUrl(url);
		setOutfile(outfile);
		setInfile(infile);
		setFlags(flags);
	}
	public getout() {
	}
	
	public getout new_getout(OperationConfig config) {
		getout node = /*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/);
		getout generatedUrl_last = config.getUrl_last();
		getout last = generatedUrl_last;
		int generatedDefault_node_flags = config.getDefault_node_flags();
		if (node) {
			if (/* append this new node last in the list */last) {
				last.setNext(node);
			} else {
					config.setUrl_list(/* first node */node);
			} 
			config.setUrl_last(/* move the last pointer */node);
			node.setFlags(generatedDefault_node_flags);
		} 
		return node;
	}
	public getout getNext() {
		return next;
	}
	public void setNext(getout newNext) {
		next = newNext;
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public Byte getOutfile() {
		return outfile;
	}
	public void setOutfile(Byte newOutfile) {
		outfile = newOutfile;
	}
	public Byte getInfile() {
		return infile;
	}
	public void setInfile(Byte newInfile) {
		infile = newInfile;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
