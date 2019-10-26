package application;

public class ewah_iterator {
	private Object buffer;
	private Object buffer_size;
	private Object pointer;
	private Object compressed;
	private Object literals;
	private Object rl;
	private Object lw;
	private int b;
	
	public ewah_iterator(Object buffer, Object buffer_size, Object pointer, Object compressed, Object literals, Object rl, Object lw, int b) {
		setBuffer(buffer);
		setBuffer_size(buffer_size);
		setPointer(pointer);
		setCompressed(compressed);
		setLiterals(literals);
		setRl(rl);
		setLw(lw);
		setB(b);
	}
	public ewah_iterator() {
	}
	
	public void read_new_rlw() {
		eword_t word = ((Object)0);
		this.setLiterals(0);
		this.setCompressed(0);
		Object generatedBuffer = this.getBuffer();
		Object generatedPointer = this.getPointer();
		Object generatedRl = this.getRl();
		Object generatedLw = this.getLw();
		Object generatedBuffer_size = this.getBuffer_size();
		while (1) {
			word = generatedBuffer[generatedPointer];
			this.setRl(ModernizedCProgram.rlw_get_running_len(word));
			this.setLw(ModernizedCProgram.rlw_get_literal_words(word));
			this.setB(ModernizedCProgram.rlw_get_run_bit(word));
			if (generatedRl || generatedLw) {
				return ;
			} 
			if (generatedPointer < generatedBuffer_size - 1) {
				generatedPointer++;
			} else {
					this.setPointer(generatedBuffer_size);
					return ;
			} 
		}
	}
	public int ewah_iterator_next(Object next) {
		Object generatedPointer = this.getPointer();
		Object generatedBuffer_size = this.getBuffer_size();
		if (generatedPointer >= generatedBuffer_size) {
			return 0;
		} 
		Object generatedCompressed = this.getCompressed();
		Object generatedRl = this.getRl();
		int generatedB = this.getB();
		Object generatedLiterals = this.getLiterals();
		Object generatedLw = this.getLw();
		Object generatedBuffer = this.getBuffer();
		if (generatedCompressed < generatedRl) {
			generatedCompressed++;
			next = generatedB ? (eword_t)(~0) : 0;
		} else {
				((generatedLiterals < generatedLw) ? (Object)0 : ._assert("it->literals < it->lw", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 349));
				generatedLiterals++;
				generatedPointer++;
				((generatedPointer < generatedBuffer_size) ? (Object)0 : ._assert("it->pointer < it->buffer_size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 354));
				next = generatedBuffer[generatedPointer];
		} 
		if (generatedCompressed == generatedRl && generatedLiterals == generatedLw) {
			if (++generatedPointer < generatedBuffer_size) {
				it.read_new_rlw();
			} 
		} 
		return 1;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public Object getBuffer_size() {
		return buffer_size;
	}
	public void setBuffer_size(Object newBuffer_size) {
		buffer_size = newBuffer_size;
	}
	public Object getPointer() {
		return pointer;
	}
	public void setPointer(Object newPointer) {
		pointer = newPointer;
	}
	public Object getCompressed() {
		return compressed;
	}
	public void setCompressed(Object newCompressed) {
		compressed = newCompressed;
	}
	public Object getLiterals() {
		return literals;
	}
	public void setLiterals(Object newLiterals) {
		literals = newLiterals;
	}
	public Object getRl() {
		return rl;
	}
	public void setRl(Object newRl) {
		rl = newRl;
	}
	public Object getLw() {
		return lw;
	}
	public void setLw(Object newLw) {
		lw = newLw;
	}
	public int getB() {
		return b;
	}
	public void setB(int newB) {
		b = newB;
	}
}
