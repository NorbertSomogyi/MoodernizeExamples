package application;

/* Structure returned opaquely to the caller, containing everything. */
public class kwset {
	private obstack obstack;
	private int words;
	private trie trie;
	private int mind;
	private int maxd;
	private Object delta;
	private Object next;
	private byte[] target;
	private int mind2;
	private Object[] trans;
	
	public kwset(obstack obstack, int words, trie trie, int mind, int maxd, Object delta, Object next, byte[] target, int mind2, Object[] trans) {
		setObstack(obstack);
		setWords(words);
		setTrie(trie);
		setMind(mind);
		setMaxd(maxd);
		setDelta(delta);
		setNext(next);
		setTarget(target);
		setMind2(mind2);
		setTrans(trans);
	}
	public kwset() {
	}
	
	public obstack getObstack() {
		return obstack;
	}
	public void setObstack(obstack newObstack) {
		obstack = newObstack;
	}
	public int getWords() {
		return words;
	}
	public void setWords(int newWords) {
		words = newWords;
	}
	public trie getTrie() {
		return trie;
	}
	public void setTrie(trie newTrie) {
		trie = newTrie;
	}
	public int getMind() {
		return mind;
	}
	public void setMind(int newMind) {
		mind = newMind;
	}
	public int getMaxd() {
		return maxd;
	}
	public void setMaxd(int newMaxd) {
		maxd = newMaxd;
	}
	public Object getDelta() {
		return delta;
	}
	public void setDelta(Object newDelta) {
		delta = newDelta;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public byte[] getTarget() {
		return target;
	}
	public void setTarget(byte[] newTarget) {
		target = newTarget;
	}
	public int getMind2() {
		return mind2;
	}
	public void setMind2(int newMind2) {
		mind2 = newMind2;
	}
	public Object[] getTrans() {
		return trans;
	}
	public void setTrans(Object[] newTrans) {
		trans = newTrans;
	}
}
