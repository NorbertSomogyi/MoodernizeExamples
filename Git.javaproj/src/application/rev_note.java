package application;

public class rev_note {
	private int rev_nr;
	
	public rev_note(int rev_nr) {
		setRev_nr(rev_nr);
	}
	public rev_note() {
	}
	
	public int parse_rev_note(Object msg) {
		byte key;
		byte value;
		byte end;
		size_t len = new size_t();
		while (msg) {
			end = ModernizedCProgram.gitstrchrnul(msg, (byte)'\n');
			len = end - msg;
			key = "Revision-number: ";
			if (ModernizedCProgram.starts_with(msg, key)) {
				long i;
				byte end;
				value = msg + .strlen(key);
				i = .strtol(value, end, 0);
				if (end == value || i < 0 || i > -1024) {
					return -1;
				} 
				this.setRev_nr(i);
				return 0;
			} 
			msg += len + 1;
		}
		return -/* didn't find it */1;
	}
	public int getRev_nr() {
		return rev_nr;
	}
	public void setRev_nr(int newRev_nr) {
		rev_nr = newRev_nr;
	}
}
