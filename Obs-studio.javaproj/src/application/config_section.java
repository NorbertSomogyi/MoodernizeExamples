package application;

public class config_section {
	private Byte name;
	private darray items;
	
	public config_section(Byte name, darray items) {
		setName(name);
		setItems(items);
	}
	public config_section() {
	}
	
	public void config_section_free() {
		darray generatedItems = this.getItems();
		Object generatedArray = generatedItems.getArray();
		config_item items = generatedArray;
		size_t i = new size_t();
		Object generatedNum = generatedItems.getNum();
		for (i = 0; i < generatedNum; i++) {
			items + i.config_item_free();
		}
		generatedItems.darray_free();
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public darray getItems() {
		return items;
	}
	public void setItems(darray newItems) {
		items = newItems;
	}
}
