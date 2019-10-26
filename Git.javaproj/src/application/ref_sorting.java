package application;

public class ref_sorting {
	private ref_sorting next;
	private int atom;
	private int reverse;
	private int ignore_case;
	private int version;
	
	public ref_sorting(ref_sorting next, int atom, int reverse, int ignore_case, int version) {
		setNext(next);
		setAtom(atom);
		setReverse(reverse);
		setIgnore_case(ignore_case);
		setVersion(version);
	}
	public ref_sorting() {
	}
	
	public ref_sorting ref_default_sorting() {
		byte[] cstr_name = "refname";
		ref_sorting sorting = ModernizedCProgram.xcalloc(1, );
		sorting.setNext(((Object)0));
		sorting.setAtom(ModernizedCProgram.parse_sorting_atom(cstr_name));
		return sorting;
	}
	public void parse_ref_sorting(Object arg) {
		ref_sorting s = new ref_sorting();
		s = ModernizedCProgram.xcalloc(1, );
		s.setNext(sorting_tail);
		sorting_tail = s;
		if (arg == (byte)'-') {
			s.setReverse(1);
			arg++;
		} 
		if (ModernizedCProgram.skip_prefix(arg, "version:", arg) || ModernizedCProgram.skip_prefix(arg, "v:", arg)) {
			s.setVersion(1);
		} 
		s.setAtom(ModernizedCProgram.parse_sorting_atom(arg));
	}
	public ref_sorting getNext() {
		return next;
	}
	public void setNext(ref_sorting newNext) {
		next = newNext;
	}
	public int getAtom() {
		return atom;
	}
	public void setAtom(int newAtom) {
		atom = newAtom;
	}
	public int getReverse() {
		return reverse;
	}
	public void setReverse(int newReverse) {
		reverse = newReverse;
	}
	public int getIgnore_case() {
		return ignore_case;
	}
	public void setIgnore_case(int newIgnore_case) {
		ignore_case = newIgnore_case;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int newVersion) {
		version = newVersion;
	}
}
/*  Function to parse --merged and --no-merged options */
