package application;

/* contents of a data block */
public class data_block {
	private Object db_id;
	private int db_free;
	private int db_txt_start;
	private int db_txt_end;
	private Object db_line_count;
	private Object db_index;
	
	public data_block(Object db_id, int db_free, int db_txt_start, int db_txt_end, Object db_line_count, Object db_index) {
		setDb_id(db_id);
		setDb_free(db_free);
		setDb_txt_start(db_txt_start);
		setDb_txt_end(db_txt_end);
		setDb_line_count(db_line_count);
		setDb_index(db_index);
	}
	public data_block() {
	}
	
	public Object getDb_id() {
		return db_id;
	}
	public void setDb_id(Object newDb_id) {
		db_id = newDb_id;
	}
	public int getDb_free() {
		return db_free;
	}
	public void setDb_free(int newDb_free) {
		db_free = newDb_free;
	}
	public int getDb_txt_start() {
		return db_txt_start;
	}
	public void setDb_txt_start(int newDb_txt_start) {
		db_txt_start = newDb_txt_start;
	}
	public int getDb_txt_end() {
		return db_txt_end;
	}
	public void setDb_txt_end(int newDb_txt_end) {
		db_txt_end = newDb_txt_end;
	}
	public Object getDb_line_count() {
		return db_line_count;
	}
	public void setDb_line_count(Object newDb_line_count) {
		db_line_count = newDb_line_count;
	}
	public Object getDb_index() {
		return db_index;
	}
	public void setDb_index(Object newDb_index) {
		db_index = newDb_index;
	}
}
