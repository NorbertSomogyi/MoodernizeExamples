package application;

public class struct_io_stats {
	private int num_fields;
	private int reserved;
	private int bytes_read;
	private int bytes_written;
	
	public struct_io_stats(int num_fields, int reserved, int bytes_read, int bytes_written) {
		setNum_fields(num_fields);
		setReserved(reserved);
		setBytes_read(bytes_read);
		setBytes_written(bytes_written);
	}
	public struct_io_stats() {
	}
	
	public int getNum_fields() {
		return num_fields;
	}
	public void setNum_fields(int newNum_fields) {
		num_fields = newNum_fields;
	}
	public int getReserved() {
		return reserved;
	}
	public void setReserved(int newReserved) {
		reserved = newReserved;
	}
	public int getBytes_read() {
		return bytes_read;
	}
	public void setBytes_read(int newBytes_read) {
		bytes_read = newBytes_read;
	}
	public int getBytes_written() {
		return bytes_written;
	}
	public void setBytes_written(int newBytes_written) {
		bytes_written = newBytes_written;
	}
}
