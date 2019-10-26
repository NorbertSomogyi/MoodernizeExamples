package application;

public class error_item {
	private Byte error;
	private Object file;
	private Object row;
	private Object column;
	private int level;
	
	public error_item(Byte error, Object file, Object row, Object column, int level) {
		setError(error);
		setFile(file);
		setRow(row);
		setColumn(column);
		setLevel(level);
	}
	public error_item() {
	}
	
	public void error_item_init() {
		.memset(ei, 0, );
	}
	public void error_item_free() {
		Byte generatedError = this.getError();
		ModernizedCProgram.bfree(generatedError);
		ei.error_item_init();
	}
	public void error_item_array_free(Object num) {
		size_t i = new size_t();
		for (i = 0; i < num; i++) {
			array + i.error_item_free();
		}
	}
	public Byte getError() {
		return error;
	}
	public void setError(Byte newError) {
		error = newError;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
	public Object getRow() {
		return row;
	}
	public void setRow(Object newRow) {
		row = newRow;
	}
	public Object getColumn() {
		return column;
	}
	public void setColumn(Object newColumn) {
		column = newColumn;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int newLevel) {
		level = newLevel;
	}
}
