package application;

public class rerere_id {
	private rerere_dir collection;
	private int variant;
	
	public rerere_id(rerere_dir collection, int variant) {
		setCollection(collection);
		setVariant(variant);
	}
	public rerere_id() {
	}
	
	public rerere_dir getCollection() {
		return collection;
	}
	public void setCollection(rerere_dir newCollection) {
		collection = newCollection;
	}
	public int getVariant() {
		return variant;
	}
	public void setVariant(int newVariant) {
		variant = newVariant;
	}
}
