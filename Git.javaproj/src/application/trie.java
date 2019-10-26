package application;

/* Trie node pointed to by this edge. */
/* Node of a trie representing a set of reversed keywords. */
/* Parent of this node. */
/* List of all trie nodes in level order. */
/* Aho-Corasick failure function. */
/* The trie itself. */
public class trie {
	private int accepting;
	private tree links;
	private trie parent;
	private trie next;
	private trie fail;
	private int depth;
	private int shift;
	private int maxshift;
	
	public trie(int accepting, tree links, trie parent, trie next, trie fail, int depth, int shift, int maxshift) {
		setAccepting(accepting);
		setLinks(links);
		setParent(parent);
		setNext(next);
		setFail(fail);
		setDepth(depth);
		setShift(shift);
		setMaxshift(maxshift);
	}
	public trie() {
	}
	
	public void treefails(Object tree, Object fail) {
		tree link = new tree();
		if (!tree) {
			return ;
		} 
		recourse.treefails(tree.getLlink(), fail);
		recourse.treefails(tree.getRlink(), fail);
		byte generatedLabel = link.getLabel();
		tree generatedLlink = link.getLlink();
		tree generatedRlink = link.getRlink();
		trie generatedTrie = link.getTrie();
		while (/* Find, in the chain of fails going back to the root, the first
		     node that has a descendant on the current label. */fail) {
			link = fail.getLinks();
			while (link && tree.getLabel() != generatedLabel) {
				if (generatedLabel < generatedLabel) {
					link = generatedLlink;
				} else {
						link = generatedRlink;
				} 
			}
			if (link) {
				generatedTrie.setFail(generatedTrie);
				return ;
			} 
			fail = fail.getFail();
		}
		generatedTrie.setFail(recourse/* Set delta entries for the links of the given tree such that
		   the preexisting delta value is larger than the current depth. */);
	}
	public void treenext(Object tree) {
		if (!tree) {
			return ;
		} 
		next.treenext(tree.getLlink());
		next.treenext(tree.getRlink());
		next[tree.getLabel()] = tree.getTrie();
	}
	public trie make_trie_node(Object key, Object value) {
		trie new_node = ModernizedCProgram.xcalloc(1, );
		new_node.setLen(.strlen(key));
		Object generatedLen = new_node.getLen();
		Object generatedContents = new_node.getContents();
		if (generatedLen) {
			new_node.setContents(ModernizedCProgram.xmalloc(generatedLen));
			.memcpy(generatedContents, key, generatedLen);
		} 
		new_node.setValue(value);
		return new_node/*
		 * Add a key/value pair to a trie.  The key is assumed to be \0-terminated.
		 * If there was an existing value for this key, return it.
		 */;
	}
	public Object add_to_trie(Object key, Object value) {
		trie child = new trie();
		Object old;
		int i;
		Object generatedValue = this.getValue();
		if (!key) {
			old = generatedValue;
			this.setValue(value);
			return old;
		} 
		Object generatedLen = this.getLen();
		Object generatedContents = this.getContents();
		Object generatedChildren = child.getChildren();
		trie trie = new trie();
		for (i = 0; i < generatedLen; i++) {
			if (generatedContents[i] == key[i]) {
				continue;
			} 
			child = ModernizedCProgram.xmalloc();
			.memcpy(generatedChildren, generatedChildren, );
			child.setLen(generatedLen - i - 1);
			if (generatedLen) {
				child.setContents(ModernizedCProgram.xstrndup(generatedContents + i + 1, generatedLen));
			} 
			child.setValue(generatedValue);
			this.setValue(((Object)0));
			this.setLen(i);
			.memset(generatedChildren, 0, );
			generatedChildren[(byte)generatedContents[i]] = child;
			generatedChildren[(byte)key[/* This is the newly-added child. */i]] = trie.make_trie_node(key + i + 1, value);
			return ((Object)0);
		}
		if (key[/* We have matched the entire compressed section */i]) {
			child = generatedChildren[(byte)key[generatedLen]];
			if (child) {
				return child.add_to_trie(key + generatedLen + 1, value);
			} else {
					child = trie.make_trie_node(key + generatedLen + 1, value);
					generatedChildren[(byte)key[generatedLen]] = child;
					return ((Object)0);
			} 
		} 
		old = generatedValue;
		this.setValue(value);
		return old/*
		 * Search a trie for some key.  Find the longest /-or-\0-terminated
		 * prefix of the key for which the trie contains a value.  Call fn
		 * with the unmatched portion of the key and the found value, and
		 * return its return value.  If there is no such prefix, return -1.
		 *
		 * The key is partially normalized: consecutive slashes are skipped.
		 *
		 * For example, consider the trie containing only [refs,
		 * refs/worktree] (both with values).
		 *
		 * | key             | unmatched  | val from node | return value |
		 * |-----------------|------------|---------------|--------------|
		 * | a               | not called | n/a           | -1           |
		 * | refs            | \0         | refs          | as per fn    |
		 * | refs/           | /          | refs          | as per fn    |
		 * | refs/w          | /w         | refs          | as per fn    |
		 * | refs/worktree   | \0         | refs/worktree | as per fn    |
		 * | refs/worktree/  | /          | refs/worktree | as per fn    |
		 * | refs/worktree/a | /a         | refs/worktree | as per fn    |
		 * |-----------------|------------|---------------|--------------|
		 *
		 */;
	}
	public int trie_find(Object key, Object fn, Object baton) {
		int i;
		int result;
		trie child = new trie();
		Object generatedValue = this.getValue();
		Object generatedLen = this.getLen();
		if (!key) {
			if (generatedValue && !generatedLen) {
				return .fn(key, generatedValue, baton);
			} else {
					return -1;
			} 
		} 
		Object generatedContents = this.getContents();
		for (i = 0; i < generatedLen; i++) {
			if (key[i] == (byte)'/' && key[i + 1] == /* Partial path normalization: skip consecutive slashes. */(byte)'/') {
				key++;
				continue;
			} 
			if (generatedContents[i] != key[i]) {
				return -1;
			} 
		}
		key += /* Matched the entire compressed section */i;
		if (!key) {
			return .fn(key, generatedValue, /* End of key */baton);
		} 
		while (key[0] == (byte)'/' && key[1] == /* Partial path normalization: skip consecutive slashes */(byte)'/') {
			key++;
		}
		Object generatedChildren = this.getChildren();
		child = generatedChildren[(byte)key];
		if (child) {
			result = child.trie_find(key + 1, fn, baton);
		} else {
				result = -1;
		} 
		if (result >= 0 || (key != (byte)'/' && key != 0)) {
			return result;
		} 
		if (generatedValue) {
			return .fn(key, generatedValue, baton);
		} else {
				return -1;
		} 
	}
	public int getAccepting() {
		return accepting;
	}
	public void setAccepting(int newAccepting) {
		accepting = newAccepting;
	}
	public tree getLinks() {
		return links;
	}
	public void setLinks(tree newLinks) {
		links = newLinks;
	}
	public trie getParent() {
		return parent;
	}
	public void setParent(trie newParent) {
		parent = newParent;
	}
	public trie getNext() {
		return next;
	}
	public void setNext(trie newNext) {
		next = newNext;
	}
	public trie getFail() {
		return fail;
	}
	public void setFail(trie newFail) {
		fail = newFail;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
	public int getShift() {
		return shift;
	}
	public void setShift(int newShift) {
		shift = newShift;
	}
	public int getMaxshift() {
		return maxshift;
	}
	public void setMaxshift(int newMaxshift) {
		maxshift = newMaxshift;
	}
}
