package application;

/* ------------------------------------------------------------------------- */
public class text_node {
	private dstr str;
	private text_node first_subnode;
	private text_leaf leaf;
	private text_node next;
	
	public text_node(dstr str, text_node first_subnode, text_leaf leaf, text_node next) {
		setStr(str);
		setFirst_subnode(first_subnode);
		setLeaf(leaf);
		setNext(next);
	}
	public text_node() {
	}
	
	public void text_node_destroy() {
		text_node subnode = new text_node();
		if (!node) {
			return /*Error: Unsupported expression*/;
		} 
		text_node generatedFirst_subnode = this.getFirst_subnode();
		subnode = generatedFirst_subnode;
		text_node generatedNext = subnode.getNext();
		while (subnode) {
			text_node destroy_node = subnode;
			subnode = generatedNext;
			destroy_node.text_node_destroy();
		}
		dstr generatedStr = this.getStr();
		generatedStr.dstr_free();
		text_leaf generatedLeaf = this.getLeaf();
		if (generatedLeaf) {
			generatedLeaf.text_leaf_destroy();
		} 
		ModernizedCProgram.bfree(node);
	}
	public text_node text_node_bychar(byte ch) {
		text_node generatedFirst_subnode = this.getFirst_subnode();
		text_node subnode = generatedFirst_subnode;
		dstr generatedStr = subnode.getStr();
		byte[] generatedArray = generatedStr.getArray();
		text_node generatedNext = subnode.getNext();
		while (subnode) {
			if (!ModernizedCProgram.dstr_is_empty(generatedStr) && generatedArray[0] == ch) {
				return subnode;
			} 
			subnode = generatedNext;
		}
		return ((Object)0);
	}
	public text_node text_node_byname(Object name) {
		text_node generatedFirst_subnode = this.getFirst_subnode();
		text_node subnode = generatedFirst_subnode;
		dstr generatedStr = subnode.getStr();
		byte[] generatedArray = generatedStr.getArray();
		Object generatedLen = generatedStr.getLen();
		text_node generatedNext = subnode.getNext();
		while (subnode) {
			if (ModernizedCProgram.astrcmpi_n(generatedArray, name, generatedLen) == 0) {
				return subnode;
			} 
			subnode = generatedNext;
		}
		return ((Object)0);
	}
	public boolean lookup_getstring(Object lookup_val, Object out) {
		text_node child = new text_node();
		byte ch;
		if (!node) {
			return 0;
		} 
		child = node.text_node_byname(lookup_val);
		if (!child) {
			return 0;
		} 
		dstr generatedStr = child.getStr();
		Object generatedLen = generatedStr.getLen();
		lookup_val += generatedLen;
		ch = lookup_val;
		if (ch) {
			return child.lookup_getstring(lookup_val, out);
		} 
		text_leaf generatedLeaf = child.getLeaf();
		if (!generatedLeaf) {
			return 0;
		} 
		Byte generatedValue = generatedLeaf.getValue();
		out = generatedValue;
		return 1;
	}
	public dstr getStr() {
		return str;
	}
	public void setStr(dstr newStr) {
		str = newStr;
	}
	public text_node getFirst_subnode() {
		return first_subnode;
	}
	public void setFirst_subnode(text_node newFirst_subnode) {
		first_subnode = newFirst_subnode;
	}
	public text_leaf getLeaf() {
		return leaf;
	}
	public void setLeaf(text_leaf newLeaf) {
		leaf = newLeaf;
	}
	public text_node getNext() {
		return next;
	}
	public void setNext(text_node newNext) {
		next = newNext;
	}
}
