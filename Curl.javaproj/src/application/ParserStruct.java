package application;

public class ParserStruct {
	private int ok;
	private Object tags;
	private Object depth;
	private MemoryStruct characters;
	
	public ParserStruct(int ok, Object tags, Object depth, MemoryStruct characters) {
		setOk(ok);
		setTags(tags);
		setDepth(depth);
		setCharacters(characters);
	}
	public ParserStruct() {
	}
	
	public int getOk() {
		return ok;
	}
	public void setOk(int newOk) {
		ok = newOk;
	}
	public Object getTags() {
		return tags;
	}
	public void setTags(Object newTags) {
		tags = newTags;
	}
	public Object getDepth() {
		return depth;
	}
	public void setDepth(Object newDepth) {
		depth = newDepth;
	}
	public MemoryStruct getCharacters() {
		return characters;
	}
	public void setCharacters(MemoryStruct newCharacters) {
		characters = newCharacters;
	}
}
