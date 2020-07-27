package application;

public class text_stat {
	private int nul;
	private int lonecr;
	private int lonelf;
	private int crlf;
	private int printable;
	private int nonprintable;
	
	public text_stat(int nul, int lonecr, int lonelf, int crlf, int printable, int nonprintable) {
		setNul(nul);
		setLonecr(lonecr);
		setLonelf(lonelf);
		setCrlf(crlf);
		setPrintable(printable);
		setNonprintable(nonprintable);
	}
	public text_stat() {
	}
	
	public void gather_stats(Object[] buf, long size) {
		long i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(stats, 0, /*Error: sizeof expression not supported yet*/);
		int generatedCrlf = this.getCrlf();
		int generatedLonecr = this.getLonecr();
		int generatedLonelf = this.getLonelf();
		int generatedNonprintable = this.getNonprintable();
		int generatedPrintable = this.getPrintable();
		int generatedNul = this.getNul();
		for (i = 0; i < size; i++) {
			byte c = buf[i];
			if (c == (byte)'\r') {
				if (i + 1 < size && buf[i + 1] == (byte)'\n') {
					generatedCrlf++;
					i++;
				} else {
						generatedLonecr++;
				} 
				continue;
			} 
			if (c == (byte)'\n') {
				generatedLonelf++;
				continue;
			} 
			if (c == 127) {
				generatedNonprintable++;
			}  else if (c < 32) {
				switch (c) {
				case (byte)'\b':
				case /* BS, HT, ESC and FF */(byte)'\014':
						generatedPrintable++;
						break;
				case (byte)'\033':
				case (byte)'\t':
				case 0:
						generatedNul++;
				default:
						generatedNonprintable++;
				}
			} else {
					generatedPrintable++;
			} 
		}
		if (size >= 1 && buf[size - 1] == /* If file ends with EOF then don't count this EOF as non-printable. */(byte)'\032') {
			generatedNonprintable--;
		} 
	}
	public void check_global_conv_flags_eol(Object path, crlf_action crlf_action, text_stat new_stats, int conv_flags) {
		int generatedCrlf = this.getCrlf();
		int generatedLonelf = this.getLonelf();
		if (generatedCrlf && !generatedCrlf) {
			if (conv_flags & (1 << 0)) {
				ModernizedCProgram.die(ModernizedCProgram._("CRLF would be replaced by LF in %s"), path);
			}  else if (conv_flags & (1 << 1)) {
				ModernizedCProgram.warning(ModernizedCProgram._("CRLF will be replaced by LF in %s.\nThe file will have its original line endings in your working directory"), path);
			} 
		}  else if (generatedLonelf && !generatedLonelf) {
			if (conv_flags & (1 << 0)) {
				ModernizedCProgram.die(ModernizedCProgram._("LF would be replaced by CRLF in %s"), path);
			}  else if (conv_flags & (1 << 1)) {
				ModernizedCProgram.warning(ModernizedCProgram._("LF will be replaced by CRLF in %s.\nThe file will have its original line endings in your working directory"), path);
			} 
		} 
	}
	public int will_convert_lf_to_crlf(crlf_action crlf_action) {
		if (ModernizedCProgram.output_eol(crlf_action.crlf_action) != eol.EOL_CRLF) {
			return 0;
		} 
		int generatedLonelf = this.getLonelf();
		if (!generatedLonelf) {
			return 0;
		} 
		int generatedLonecr = this.getLonecr();
		int generatedCrlf = this.getCrlf();
		if (crlf_action.crlf_action == crlf_action.CRLF_AUTO || crlf_action.crlf_action == crlf_action.CRLF_AUTO_INPUT || crlf_action.crlf_action == crlf_action.CRLF_AUTO_CRLF/* If we have any CR or CRLF line endings, we do not touch it */) {
			if (generatedLonecr || generatedCrlf) {
				return 0;
			} 
			if (ModernizedCProgram.convert_is_binary(stats)) {
				return 0;
			} 
		} 
		return 1;
	}
	public int getNul() {
		return nul;
	}
	public void setNul(int newNul) {
		nul = newNul;
	}
	public int getLonecr() {
		return lonecr;
	}
	public void setLonecr(int newLonecr) {
		lonecr = newLonecr;
	}
	public int getLonelf() {
		return lonelf;
	}
	public void setLonelf(int newLonelf) {
		lonelf = newLonelf;
	}
	public int getCrlf() {
		return crlf;
	}
	public void setCrlf(int newCrlf) {
		crlf = newCrlf;
	}
	public int getPrintable() {
		return printable;
	}
	public void setPrintable(int newPrintable) {
		printable = newPrintable;
	}
	public int getNonprintable() {
		return nonprintable;
	}
	public void setNonprintable(int newNonprintable) {
		nonprintable = newNonprintable;
	}
}
/* NUL, CR, LF and CRLF counts */
