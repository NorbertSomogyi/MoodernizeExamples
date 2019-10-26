package application;

public class packet_writer {
	private int dest_fd;
	private int use_sideband;
	
	public packet_writer(int dest_fd, int use_sideband) {
		setDest_fd(dest_fd);
		setUse_sideband(use_sideband);
	}
	public packet_writer() {
	}
	
	public void packet_writer_init(int dest_fd) {
		ModernizedCProgram.writer.setDest_fd(dest_fd);
		ModernizedCProgram.writer.setUse_sideband(0);
	}
	public void packet_writer_write(Object fmt) {
		va_list args = new va_list();
		.__builtin_va_start(args, fmt);
		ModernizedCProgram.packet_write_fmt_1(ModernizedCProgram.writer.getDest_fd(), 0, ModernizedCProgram.writer.getUse_sideband() ? "\001" : "", fmt, args);
		.__builtin_va_end(args);
	}
	public void packet_writer_error(Object fmt) {
		va_list args = new va_list();
		.__builtin_va_start(args, fmt);
		ModernizedCProgram.packet_write_fmt_1(ModernizedCProgram.writer.getDest_fd(), 0, ModernizedCProgram.writer.getUse_sideband() ? "\003" : "ERR ", fmt, args);
		.__builtin_va_end(args);
	}
	public void packet_writer_delim() {
		ModernizedCProgram.packet_delim(ModernizedCProgram.writer.getDest_fd());
	}
	public void packet_writer_flush() {
		ModernizedCProgram.packet_flush(ModernizedCProgram.writer.getDest_fd());
	}
	public int getDest_fd() {
		return dest_fd;
	}
	public void setDest_fd(int newDest_fd) {
		dest_fd = newDest_fd;
	}
	public int getUse_sideband() {
		return use_sideband;
	}
	public void setUse_sideband(int newUse_sideband) {
		use_sideband = newUse_sideband;
	}
}
