package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1997 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/* smaller node */
/* larger node */
/* points to the next node with identical key */
/* points to the prev node with identical key */
public class Curl_tree {
	private Curl_tree smaller;
	private Curl_tree larger;
	private Curl_tree samen;
	private Curl_tree samep;
	private curltime key;
	private Object payload;
	
	public Curl_tree(Curl_tree smaller, Curl_tree larger, Curl_tree samen, Curl_tree samep, curltime key, Object payload) {
		setSmaller(smaller);
		setLarger(larger);
		setSamen(samen);
		setSamep(samep);
		setKey(key);
		setPayload(payload);
	}
	public Curl_tree() {
	}
	
	public Curl_tree Curl_splay(curltime i) {
		Curl_tree N = new Curl_tree();
		Curl_tree l = new Curl_tree();
		Curl_tree r = new Curl_tree();
		Curl_tree y = new Curl_tree();
		if (t == ((Object)0)) {
			return t;
		} 
		N.setSmaller(N.setLarger(((Object)0)));
		l = r = N;
		Object generatedTv_sec = (i).getTv_sec();
		int generatedTv_usec = (i).getTv_usec();
		Curl_tree generatedSmaller = this.getSmaller();
		Curl_tree generatedLarger = y.getLarger();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			long comp = (((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0))));
			if (comp < 0) {
				if (generatedSmaller == ((Object)0)) {
					break;
				} 
				if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) < 0) {
					y = generatedSmaller;
					this.setSmaller(generatedLarger);
					y.setLarger(t);
					t = y;
					if (generatedSmaller == ((Object)0)) {
						break;
					} 
				} 
				r.setSmaller(/* link smaller */t);
				r = t;
				t = generatedSmaller;
			}  else if (comp > 0) {
				if (generatedLarger == ((Object)0)) {
					break;
				} 
				if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) > 0) {
					y = generatedLarger;
					this.setLarger(generatedSmaller);
					y.setSmaller(t);
					t = y;
					if (generatedLarger == ((Object)0)) {
						break;
					} 
				} 
				l.setLarger(/* link larger */t);
				l = t;
				t = generatedLarger;
			} else {
					break;
			} 
		}
		l.setLarger(generatedSmaller);
		r.setSmaller(generatedLarger);
		this.setSmaller(generatedLarger);
		this.setLarger(generatedSmaller);
		return t/* Insert key i into the tree t.  Return a pointer to the resulting tree or
		 * NULL if something went wrong.
		 *
		 * @unittest: 1309
		 */;
	}
	public Curl_tree Curl_splayinsert(curltime i, Curl_tree node) {
		curltime KEY_NOTUSED = new curltime((time_t)-1, (int)-1/* will *NEVER* appear */);
		if (node == ((Object)0)) {
			return t;
		} 
		Object generatedTv_sec = (i).getTv_sec();
		int generatedTv_usec = (i).getTv_usec();
		Curl_tree generatedSamep = this.getSamep();
		if (t != ((Object)0)) {
			t = t.Curl_splay(i);
			if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) == 0/* There already exists a node in the tree with the very same key. Build
			         a doubly-linked circular list of nodes. We add the new 'node' struct
			         to the end of this list. */) {
				node.setKey(/* we set the key in the sub node to NOTUSED
				                                  to quickly identify this node as a subnode */KEY_NOTUSED);
				node.setSamen(t);
				node.setSamep(generatedSamep);
				generatedSamep.setSamen(node);
				this.setSamep(node);
				return /* the root node always stays the same */t;
			} 
		} 
		Curl_tree generatedSmaller = this.getSmaller();
		Curl_tree generatedLarger = this.getLarger();
		if (t == ((Object)0)) {
			node.setSmaller(node.setLarger(((Object)0)));
		}  else if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) < 0) {
			node.setSmaller(generatedSmaller);
			node.setLarger(t);
			this.setSmaller(((Object)0));
		} else {
				node.setLarger(generatedLarger);
				node.setSmaller(t);
				this.setLarger(((Object)0));
		} 
		node.setKey(i);
		node.setSamen(/* no identical nodes (yet), we are the only one in the list of nodes */node);
		node.setSamep(node);
		return node/* Finds and deletes the best-fit node from the tree. Return a pointer to the
		   resulting tree.  best-fit means the smallest node if it is not larger than
		   the key */;
	}
	public Curl_tree Curl_splaygetbest(curltime i, Curl_tree removed) {
		curltime tv_zero = new curltime(0, 0);
		Curl_tree x = new Curl_tree();
		if (!t) {
			removed = ((Object)/* none removed since there was no root */0);
			return ((Object)0);
		} 
		t = /* find smallest */t.Curl_splay(tv_zero);
		Object generatedTv_sec = (i).getTv_sec();
		int generatedTv_usec = (i).getTv_usec();
		if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) < 0) {
			removed = ((Object)/* even the smallest is too big */0);
			return t;
		} 
		Curl_tree generatedSamen = this.getSamen();
		x = generatedSamen;
		curltime generatedKey = this.getKey();
		Curl_tree generatedLarger = this.getLarger();
		Curl_tree generatedSmaller = this.getSmaller();
		Curl_tree generatedSamep = this.getSamep();
		if (x != t/* there is, pick one from the list */) {
			x.setKey(generatedKey);
			x.setLarger(generatedLarger);
			x.setSmaller(generatedSmaller);
			x.setSamep(generatedSamep);
			generatedSamep.setSamen(x);
			removed = t;
			return /* new root */x;
		} 
		x = generatedLarger;
		removed = t;
		return x/* Deletes the very node we point out from the tree if it's there. Stores a
		 * pointer to the new resulting tree in 'newroot'.
		 *
		 * Returns zero on success and non-zero on errors!
		 * When returning error, it does not touch the 'newroot' pointer.
		 *
		 * NOTE: when the last node of the tree is removed, there's no tree left so
		 * 'newroot' will be made to point to NULL.
		 *
		 * @unittest: 1309
		 */;
	}
	public int Curl_splayremovebyaddr(Curl_tree removenode, Curl_tree newroot) {
		curltime KEY_NOTUSED = new curltime((time_t)-1, (int)-1/* will *NEVER* appear */);
		Curl_tree x = new Curl_tree();
		if (!t || !removenode) {
			return 1;
		} 
		curltime generatedKey = removenode.getKey();
		Object generatedTv_sec = (generatedKey).getTv_sec();
		int generatedTv_usec = (generatedKey).getTv_usec();
		Curl_tree generatedSamen = removenode.getSamen();
		Curl_tree generatedSamep = removenode.getSamep();
		if (((((KEY_NOTUSED).getTv_sec()) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : ((((KEY_NOTUSED).getTv_usec()) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) == 0/* Key set to NOTUSED means it is a subnode within a 'same' linked list
		       and thus we can unlink it easily. */) {
			if (generatedSamen == removenode) {
				return /* A non-subnode should never be set to KEY_NOTUSED */3;
			} 
			generatedSamep.setSamen(generatedSamen);
			generatedSamen.setSamep(generatedSamep);
			removenode.setSamen(/* Ensures that double-remove gets caught. */removenode);
			newroot = /* return the same root */t;
			return 0;
		} 
		t = t/* First make sure that we got the same root node as the one we want
		     to remove, as otherwise we might be trying to remove a node that
		     isn't actually in the tree.
		
		     We cannot just compare the keys here as a double remove in quick
		     succession of a node with key != KEY_NOTUSED && same != NULL
		     could return the same key but a different node. */.Curl_splay(generatedKey);
		if (t != removenode) {
			return 2;
		} 
		x = generatedSamen;
		Curl_tree generatedLarger = this.getLarger();
		Curl_tree generatedSmaller = this.getSmaller();
		if (x != t/* 'x' is the new root node, we just make it use the root node's
		       smaller/larger links */) {
			x.setKey(generatedKey);
			x.setLarger(generatedLarger);
			x.setSmaller(generatedSmaller);
			x.setSamep(generatedSamep);
			generatedSamep.setSamen(x);
		} else {
				if (generatedSmaller == ((Object)/* Remove the root node */0)) {
					x = generatedLarger;
				} else {
						x = generatedSmaller.Curl_splay(generatedKey);
						x.setLarger(generatedLarger);
				} 
		} 
		newroot = /* store new root pointer */x;
		return 0;
	}
	public void splayprint(int d, byte output) {
		Curl_tree node = new Curl_tree();
		int i;
		int count;
		if (t == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		Curl_tree generatedLarger = this.getLarger();
		generatedLarger.splayprint(d + 1, output);
		for (i = 0; i < d; i++) {
			if (output) {
				ModernizedCProgram.curl_mprintf("  ");
			} 
		}
		curltime generatedKey = this.getKey();
		Object generatedTv_sec = generatedKey.getTv_sec();
		int generatedTv_usec = generatedKey.getTv_usec();
		if (output) {
			ModernizedCProgram.curl_mprintf("%ld.%ld[%d]", (long)generatedTv_sec, (long)generatedTv_usec, i);
		} 
		for (; node != t; ) {
			;
		}
		if (output) {
			if (count) {
				ModernizedCProgram.curl_mprintf(" [%d more]\n", count);
			} else {
					ModernizedCProgram.curl_mprintf("\n");
			} 
		} 
		Curl_tree generatedSmaller = this.getSmaller();
		generatedSmaller.splayprint(d + 1, output);
	}
	public Curl_tree getSmaller() {
		return smaller;
	}
	public void setSmaller(Curl_tree newSmaller) {
		smaller = newSmaller;
	}
	public Curl_tree getLarger() {
		return larger;
	}
	public void setLarger(Curl_tree newLarger) {
		larger = newLarger;
	}
	public Curl_tree getSamen() {
		return samen;
	}
	public void setSamen(Curl_tree newSamen) {
		samen = newSamen;
	}
	public Curl_tree getSamep() {
		return samep;
	}
	public void setSamep(Curl_tree newSamep) {
		samep = newSamep;
	}
	public curltime getKey() {
		return key;
	}
	public void setKey(curltime newKey) {
		key = newKey;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object newPayload) {
		payload = newPayload;
	}
}
/* HEADER_CURL_SPLAY_H */
