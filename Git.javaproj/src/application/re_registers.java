package application;

/* This is the structure we store register match data in.  See
   regex.texinfo for a full description of what registers match.  */
public class re_registers {
	private int num_regs;
	private Object start;
	private Object end;
	
	public re_registers(int num_regs, Object start, Object end) {
		setNum_regs(num_regs);
		setStart(start);
		setEnd(end);
	}
	public re_registers() {
	}
	
	public int getNum_regs() {
		return num_regs;
	}
	public void setNum_regs(int newNum_regs) {
		num_regs = newNum_regs;
	}
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
}
/* Set REGS to hold NUM_REGS registers, storing them in STARTS and
   ENDS.  Subsequent matches using BUFFER and REGS will use this memory
   for recording register information.  STARTS and ENDS must be
   allocated with malloc, and must each be at least `NUM_REGS * sizeof
   (regoff_t)' bytes long.

   If NUM_REGS == 0, then subsequent matches should allocate their own
   register data.

   Unless this function is called, the first search or match using
   PATTERN_BUFFER will allocate its own register data, without
   freeing the old data.  */
/* Use GNU */
/* 4.2 bsd compatibility.  */
/* GCC 2.95 and later have "__restrict"; C99 compilers have
   "restrict", and "configure" may have defined "restrict".  */
