package application;

// The options that are local to a window or buffer have "indir" set to one of
// these values.  Special values:
// PV_NONE: global option.
// PV_WIN is added: window-local option
// PV_BUF is added: buffer-local option
// PV_BOTH is added: global option which also has a local value.
// Definition of the PV_ values for buffer-local options.
// The BV_ values are defined in option.h.
// Definition of the PV_ values for window-local options.
// The WV_ values are defined in option.h.
// WV_ and BV_ values get typecasted to this for the "indir" field
// to avoid warnings for value out of range
// Options local to a window have a value local to a buffer and global to all
// buffers.  Indicate this by setting "var" to VAR_WIN.
// Saved values for when 'bin' is set.
// Saved values for when 'paste' is set
// Default python version for pyx* commands
// used for 'cinkeys' and 'indentkeys'
// options[] is initialized here.
// The order of the options MUST be alphabetic for ":set all" and findoption().
// All option names MUST start with a lowercase letter (for findoption()).
// Exception: "t_" options are at the end.
// The options with a NULL variable are 'hidden': a set command for them is
// ignored and they are not printed.
public class vimoption {
	private byte[] fullname;
	private Byte shortname;
	private Object flags;
	private Object var;
	private  indir;
	private Object def_val;
	
	public vimoption(byte[] fullname, Byte shortname, Object flags, Object var,  indir, Object def_val) {
		setFullname(fullname);
		setShortname(shortname);
		setFlags(flags);
		setVar(var);
		setIndir(indir);
		setDef_val(def_val);
	}
	public vimoption() {
	}
	
	public int optval_default(Object varp, int compatible) {
		int dvi;
		if (varp == ((Object)0)) {
			return /* hidden option is always at default */1;
		} 
		Object generatedFlags = this.getFlags();
		dvi = ((generatedFlags & -1024) || compatible) ? 0 : 1;
		Object generatedDef_val = this.getDef_val();
		if (generatedFlags & -1024) {
			return ((long)varp == (long)(long_i)generatedDef_val[dvi]);
		} 
		if (generatedFlags & -1024/* the cast to long is required for Manx C, long_i is
					 * needed for MSVC */) {
			return ((int)varp == (int)(long)(long_i)generatedDef_val[dvi]);
		} 
		return (/*Error: Function owner not recognized*/strcmp((byte)((char_u)varp), (byte)(generatedDef_val[dvi])) == /* P_STRING */0/*
		 * showoneopt: show the value of one option
		 * must not be called with a hidden option!
		 */);
	}
	public void showoneopt(int opt_flags) {
		char_u varp = new char_u();
		int save_silent = silent_mode;
		silent_mode = 0;
		info_message = /* use mch_msg(), not mch_errmsg() */1;
		varp = p.get_varp_scope(opt_flags);
		Object generatedFlags = this.getFlags();
		int generatedB_changed = curbuf.getB_changed();
		if ((generatedFlags & -1024) && ((int)varp == generatedB_changed ? !ModernizedCProgram.curbufIsChanged() : !(int)varp)) {
			ModernizedCProgram.msg_puts("no");
		}  else if ((generatedFlags & -1024) && (int)varp < 0) {
			ModernizedCProgram.msg_puts("--");
		} else {
				ModernizedCProgram.msg_puts("  ");
		} 
		byte[] generatedFullname = this.getFullname();
		ModernizedCProgram.msg_puts(generatedFullname);
		if (!(generatedFlags & -1024)) {
			ModernizedCProgram.msg_putchar((byte)'=');
			p.option_value2string(/* put value string in NameBuff */opt_flags);
			ModernizedCProgram.msg_outtrans(ModernizedCProgram.NameBuff);
		} 
		silent_mode = save_silent;
		info_message = 0/*
		 * Write modified options as ":set" commands to a file.
		 *
		 * There are three values for "opt_flags":
		 * OPT_GLOBAL:		   Write global option values and fresh values of
		 *			   buffer-local options (used for start of a session
		 *			   file).
		 * OPT_GLOBAL + OPT_LOCAL: Idem, add fresh values of window-local options for
		 *			   curwin (used for a vimrc file).
		 * OPT_LOCAL:		   Write buffer-local option values for curbuf, fresh
		 *			   and local values for window-local options of
		 *			   curwin.  Local values are also written when at the
		 *			   default value, because a modeline or autocommand
		 *			   may have set them when doing ":edit file" and the
		 *			   user has set them back at the default or fresh
		 *			   value.
		 *			   When "local_only" is TRUE, don't write fresh
		 *			   values, only local values (for ":mkview").
		 * (fresh value = value used for a new buffer or window for a local option).
		 *
		 * Return FAIL on error, OK otherwise.
		 */;
	}
	/*
	 * return TRUE if 'p' starts with 't_'
	 */
	public int istermoption() {
		byte[] generatedFullname = this.getFullname();
		return (generatedFullname[0] == (byte)'t' && generatedFullname[1] == (byte)'_'/*
		 * Returns TRUE if the option at 'opt_idx' starts with 't_'
		 */);
	}
	/*
	 * Get pointer to option variable, depending on local or global scope.
	 */
	public Object get_varp_scope(int opt_flags) {
		 generatedIndir = this.getIndir();
		Object generatedVar = this.getVar();
		if ((opt_flags & 2) && generatedIndir != .PV_NONE) {
			if (generatedVar == ((char_u)-1)) {
				return (char_u)((byte)p.get_varp() + /*Error: Unsupported expression*/);
			} 
			return generatedVar;
		} 
		Object generatedB_p_fp = curbuf.getB_p_fp();
		Object generatedB_p_efm = curbuf.getB_p_efm();
		Object generatedB_p_gp = curbuf.getB_p_gp();
		Object generatedB_p_mp = curbuf.getB_p_mp();
		Object generatedB_p_ep = curbuf.getB_p_ep();
		Object generatedB_p_kp = curbuf.getB_p_kp();
		Object generatedB_p_path = curbuf.getB_p_path();
		int generatedB_p_ar = curbuf.getB_p_ar();
		Object generatedB_p_tags = curbuf.getB_p_tags();
		Object generatedB_p_tc = curbuf.getB_p_tc();
		Object generatedB_p_def = curbuf.getB_p_def();
		Object generatedB_p_inc = curbuf.getB_p_inc();
		Object generatedB_p_dict = curbuf.getB_p_dict();
		Object generatedB_p_tsr = curbuf.getB_p_tsr();
		Object generatedB_p_bexpr = curbuf.getB_p_bexpr();
		Object generatedB_p_cm = curbuf.getB_p_cm();
		long generatedB_p_ul = curbuf.getB_p_ul();
		Object generatedB_p_lw = curbuf.getB_p_lw();
		Object generatedB_p_bkc = curbuf.getB_p_bkc();
		Object generatedB_p_menc = curbuf.getB_p_menc();
		if ((opt_flags & 4) && ((int)generatedIndir & -1024)) {
			switch ((int)generatedIndir) {
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_EFM)))):
					return (char_u)(generatedB_p_efm);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_CM)))):
					return (char_u)(generatedB_p_cm);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_PATH)))):
					return (char_u)(generatedB_p_path);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_EP)))):
					return (char_u)(generatedB_p_ep);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_DEF)))):
					return (char_u)(generatedB_p_def);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.WV_SO)))):
					return (char_u)(ModernizedCProgram.curwin.getW_p_so());
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.WV_SISO)))):
					return (char_u)(ModernizedCProgram.curwin.getW_p_siso());
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_BEXPR)))):
					return (char_u)(generatedB_p_bexpr);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_FP)))):
					return (char_u)(generatedB_p_fp);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_MP)))):
					return (char_u)(generatedB_p_mp);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_TAGS)))):
					return (char_u)(generatedB_p_tags);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_MENC)))):
					return (char_u)(generatedB_p_menc);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_INC)))):
					return (char_u)(generatedB_p_inc);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_KP)))):
					return (char_u)(generatedB_p_kp);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.WV_STL)))):
					return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_stl());
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_UL)))):
					return (char_u)(generatedB_p_ul);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_TC)))):
					return (char_u)(generatedB_p_tc);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_DICT)))):
					return (char_u)(generatedB_p_dict);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_GP)))):
					return (char_u)(generatedB_p_gp);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_BKC)))):
					return (char_u)(generatedB_p_bkc);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_AR)))):
					return (char_u)(generatedB_p_ar);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_LW)))):
					return (char_u)(generatedB_p_lw);
			case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_TSR)))):
					return (char_u)(generatedB_p_tsr);
			}
			return ((Object)/* "cannot happen" */0);
		} 
		return p/*
		 * Get pointer to option variable at 'opt_idx', depending on local or global
		 * scope.
		 */.get_varp();
	}
	public Object get_varp() {
		Object generatedVar = this.getVar();
		if (generatedVar == ((Object)/* hidden option, always return NULL */0)) {
			return ((Object)0);
		} 
		Object generatedB_p_ep = curbuf.getB_p_ep();
		Object generatedB_p_kp = curbuf.getB_p_kp();
		Object generatedB_p_path = curbuf.getB_p_path();
		int generatedB_p_ar = curbuf.getB_p_ar();
		Object generatedB_p_tags = curbuf.getB_p_tags();
		Object generatedB_p_tc = curbuf.getB_p_tc();
		Object generatedB_p_bkc = curbuf.getB_p_bkc();
		Object generatedB_p_def = curbuf.getB_p_def();
		Object generatedB_p_inc = curbuf.getB_p_inc();
		Object generatedB_p_dict = curbuf.getB_p_dict();
		Object generatedB_p_tsr = curbuf.getB_p_tsr();
		Object generatedB_p_fp = curbuf.getB_p_fp();
		Object generatedB_p_efm = curbuf.getB_p_efm();
		Object generatedB_p_gp = curbuf.getB_p_gp();
		Object generatedB_p_mp = curbuf.getB_p_mp();
		Object generatedB_p_bexpr = curbuf.getB_p_bexpr();
		Object generatedB_p_cm = curbuf.getB_p_cm();
		long generatedB_p_ul = curbuf.getB_p_ul();
		Object generatedB_p_lw = curbuf.getB_p_lw();
		Object generatedB_p_menc = curbuf.getB_p_menc();
		int generatedB_p_ai = curbuf.getB_p_ai();
		int generatedB_p_bin = curbuf.getB_p_bin();
		int generatedB_p_bomb = curbuf.getB_p_bomb();
		Object[] generatedB_p_bh = curbuf.getB_p_bh();
		Object[] generatedB_p_bt = curbuf.getB_p_bt();
		int generatedB_p_bl = curbuf.getB_p_bl();
		int generatedB_p_ci = curbuf.getB_p_ci();
		Object generatedB_p_cin = curbuf.getB_p_cin();
		Object generatedB_p_cink = curbuf.getB_p_cink();
		Object generatedB_p_cino = curbuf.getB_p_cino();
		Object generatedB_p_cinw = curbuf.getB_p_cinw();
		Object generatedB_p_com = curbuf.getB_p_com();
		Object generatedB_p_cms = curbuf.getB_p_cms();
		Object generatedB_p_cpt = curbuf.getB_p_cpt();
		Object generatedB_p_csl = curbuf.getB_p_csl();
		Object generatedB_p_cfu = curbuf.getB_p_cfu();
		Object generatedB_p_ofu = curbuf.getB_p_ofu();
		Object generatedB_p_tfu = curbuf.getB_p_tfu();
		int generatedB_p_eol = curbuf.getB_p_eol();
		int generatedB_p_fixeol = curbuf.getB_p_fixeol();
		int generatedB_p_et = curbuf.getB_p_et();
		Object generatedB_p_fenc = curbuf.getB_p_fenc();
		Object generatedB_p_ff = curbuf.getB_p_ff();
		Object generatedB_p_ft = curbuf.getB_p_ft();
		Object generatedB_p_fo = curbuf.getB_p_fo();
		Object generatedB_p_flp = curbuf.getB_p_flp();
		long generatedB_p_iminsert = curbuf.getB_p_iminsert();
		long generatedB_p_imsearch = curbuf.getB_p_imsearch();
		int generatedB_p_inf = curbuf.getB_p_inf();
		Object generatedB_p_isk = curbuf.getB_p_isk();
		Object generatedB_p_inex = curbuf.getB_p_inex();
		Object generatedB_p_inde = curbuf.getB_p_inde();
		Object generatedB_p_indk = curbuf.getB_p_indk();
		Object generatedB_p_fex = curbuf.getB_p_fex();
		Object generatedB_p_key = curbuf.getB_p_key();
		Object generatedB_p_lisp = curbuf.getB_p_lisp();
		int generatedB_p_ml = curbuf.getB_p_ml();
		Object generatedB_p_mps = curbuf.getB_p_mps();
		int generatedB_p_ma = curbuf.getB_p_ma();
		int generatedB_changed = curbuf.getB_changed();
		Object generatedB_p_nf = curbuf.getB_p_nf();
		int generatedB_p_pi = curbuf.getB_p_pi();
		Object generatedB_p_qe = curbuf.getB_p_qe();
		int generatedB_p_ro = curbuf.getB_p_ro();
		Object generatedB_p_si = curbuf.getB_p_si();
		int generatedB_p_sn = curbuf.getB_p_sn();
		long generatedB_p_sts = curbuf.getB_p_sts();
		Object generatedB_p_sua = curbuf.getB_p_sua();
		int generatedB_p_swf = curbuf.getB_p_swf();
		Object generatedB_p_smc = curbuf.getB_p_smc();
		Object generatedB_p_syn = curbuf.getB_p_syn();
		long generatedB_p_sw = curbuf.getB_p_sw();
		long generatedB_p_ts = curbuf.getB_p_ts();
		long generatedB_p_tw = curbuf.getB_p_tw();
		int generatedB_p_tx = curbuf.getB_p_tx();
		Object generatedB_p_udf = curbuf.getB_p_udf();
		long generatedB_p_wm = curbuf.getB_p_wm();
		Object generatedB_p_keymap = curbuf.getB_p_keymap();
		Object generatedB_p_vsts = curbuf.getB_p_vsts();
		Object generatedB_p_vts = curbuf.getB_p_vts();
		 generatedIndir = this.getIndir();
		switch ((int)generatedIndir) {
		case (idopt_T)(-1024 + (int)(.WV_COCU)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_cocu());
		case (idopt_T)(-1024 + (int)(.WV_WFW)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wfw());
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_BEXPR)))):
				return generatedB_p_bexpr != (byte)'\000' ? (char_u)(generatedB_p_bexpr) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_NU)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_nu());
		case (idopt_T)(-1024 + (int)(.BV_SI)):
				return (char_u)(generatedB_p_si);
		case .PV_NONE:
				return generatedVar;
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_EFM)))):
				return generatedB_p_efm != (byte)'\000' ? (char_u)(generatedB_p_efm) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_CMS)):
				return (char_u)(generatedB_p_cms);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_TSR)))):
				return generatedB_p_tsr != (byte)'\000' ? (char_u)(generatedB_p_tsr) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_FDT)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdt());
		case (idopt_T)(-1024 + (int)(.BV_STS)):
				return (char_u)(generatedB_p_sts);
		case (idopt_T)(-1024 + (int)(.BV_TW)):
				return (char_u)(generatedB_p_tw);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_MENC)))):
				return generatedB_p_menc != (byte)'\000' ? (char_u)(generatedB_p_menc) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_SN)):
				return (char_u)(generatedB_p_sn);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_AR)))):
				return generatedB_p_ar >= 0 ? (char_u)(generatedB_p_ar) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_LISP)):
				return (char_u)(generatedB_p_lisp);
		case (idopt_T)(-1024 + (int)(.BV_KEY)):
				return (char_u)(generatedB_p_key);
		case (idopt_T)(-1024 + (int)(.BV_FLP)):
				return (char_u)(generatedB_p_flp);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_KP)))):
				return generatedB_p_kp != (byte)'\000' ? (char_u)generatedB_p_kp : generatedVar;
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_BKC)))):
				return generatedB_p_bkc != (byte)'\000' ? (char_u)(generatedB_p_bkc) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_SCROLL)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scr());
		case (idopt_T)(-1024 + (int)(.BV_EOL)):
				return (char_u)(generatedB_p_eol);
		case (idopt_T)(-1024 + (int)(.BV_UDF)):
				return (char_u)(generatedB_p_udf);
		case (idopt_T)(-1024 + (int)(.BV_AI)):
				return (char_u)(generatedB_p_ai);
		case (idopt_T)(-1024 + (int)(.BV_INEX)):
				return (char_u)(generatedB_p_inex);
		case (idopt_T)(-1024 + (int)(.BV_CINK)):
				return (char_u)(generatedB_p_cink);
		case (idopt_T)(-1024 + (int)(.BV_MOD)):
				return (char_u)(generatedB_changed);
		case (idopt_T)(-1024 + (int)(.BV_SUA)):
				return (char_u)(generatedB_p_sua);
		case (idopt_T)(-1024 + (int)(.BV_SPC)):
				return (char_u)(ModernizedCProgram.curwin.getW_s().getB_p_spc());
		case (idopt_T)(-1024 + (int)(.BV_BL)):
				return (char_u)(generatedB_p_bl);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_CM)))):
				return generatedB_p_cm != (byte)'\000' ? (char_u)(generatedB_p_cm) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_PVW)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_pvw());
		case (idopt_T)(-1024 + (int)(.BV_VSTS)):
				return (char_u)(generatedB_p_vsts);
		case (idopt_T)(-1024 + (int)(.BV_CSL)):
				return (char_u)(generatedB_p_csl);
		case (idopt_T)(-1024 + (int)(.WV_CULOPT)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_culopt());
		case (idopt_T)(-1024 + (int)(.BV_KMAP)):
				return (char_u)(generatedB_p_keymap);
		case (idopt_T)(-1024 + (int)(.BV_INF)):
				return (char_u)(generatedB_p_inf);
		case (idopt_T)(-1024 + (int)(.BV_SPF)):
				return (char_u)(ModernizedCProgram.curwin.getW_s().getB_p_spf());
		case (idopt_T)(-1024 + (int)(.BV_ML)):
				return (char_u)(generatedB_p_ml);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_INC)))):
				return generatedB_p_inc != (byte)'\000' ? (char_u)(generatedB_p_inc) : generatedVar;
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_LW)))):
				return generatedB_p_lw != (byte)'\000' ? (char_u)(generatedB_p_lw) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_ISK)):
				return (char_u)(generatedB_p_isk);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_MP)))):
				return generatedB_p_mp != (byte)'\000' ? (char_u)(generatedB_p_mp) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_PI)):
				return (char_u)(generatedB_p_pi);
		case (idopt_T)(-1024 + (int)(.WV_WFH)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wfh());
		case (idopt_T)(-1024 + (int)(.WV_NUW)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_nuw());
		case (idopt_T)(-1024 + (int)(.WV_CUC)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_cuc());
		case (idopt_T)(-1024 + (int)(.WV_FML)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fml());
		case (idopt_T)(-1024 + (int)(.BV_ET)):
				return (char_u)(generatedB_p_et);
		case (idopt_T)(-1024 + (int)(.WV_WRAP)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap());
		case (idopt_T)(-1024 + (int)(.BV_IMS)):
				return (char_u)(generatedB_p_imsearch);
		case (idopt_T)(-1024 + (int)(.WV_BRIOPT)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_briopt());
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.WV_SISO)))):
				return ModernizedCProgram.curwin.getW_p_siso() >= 0 ? (char_u)(ModernizedCProgram.curwin.getW_p_siso()) : generatedVar;
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_FP)))):
				return generatedB_p_fp != (byte)'\000' ? (char_u)(generatedB_p_fp) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_CFU)):
				return (char_u)(generatedB_p_cfu);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_PATH)))):
				return generatedB_p_path != (byte)'\000' ? (char_u)(generatedB_p_path) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_FDI)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdi());
		case (idopt_T)(-1024 + (int)(.BV_FEX)):
				return (char_u)(generatedB_p_fex);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_DEF)))):
				return generatedB_p_def != (byte)'\000' ? (char_u)(generatedB_p_def) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_SW)):
				return (char_u)(generatedB_p_sw);
		case (idopt_T)(-1024 + (int)(.BV_MA)):
				return (char_u)(generatedB_p_ma);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_EP)))):
				return generatedB_p_ep != /* global option with local value: use local value if it's been set */(byte)'\000' ? (char_u)generatedB_p_ep : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_BH)):
				return (char_u)(generatedB_p_bh);
		case (idopt_T)(-1024 + (int)(.BV_CINO)):
				return (char_u)(generatedB_p_cino);
		case (idopt_T)(-1024 + (int)(.BV_RO)):
				return (char_u)(generatedB_p_ro);
		case (idopt_T)(-1024 + (int)(.BV_CINW)):
				return (char_u)(generatedB_p_cinw);
		case (idopt_T)(-1024 + (int)(.BV_TS)):
				return (char_u)(generatedB_p_ts);
		case (idopt_T)(-1024 + (int)(.WV_FEN)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fen());
		case (idopt_T)(-1024 + (int)(.BV_SPL)):
				return (char_u)(ModernizedCProgram.curwin.getW_s().getB_p_spl());
		case (idopt_T)(-1024 + (int)(.WV_CRBIND)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_crb());
		case (idopt_T)(-1024 + (int)(.BV_WM)):
				return (char_u)(generatedB_p_wm);
		case (idopt_T)(-1024 + (int)(.BV_VTS)):
				return (char_u)(generatedB_p_vts);
		case (idopt_T)(-1024 + (int)(.WV_RLC)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rlc());
		case (idopt_T)(-1024 + (int)(.WV_FDC)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdc());
		case (idopt_T)(-1024 + (int)(.WV_SCBIND)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scb());
		case (idopt_T)(-1024 + (int)(.WV_FDN)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdn());
		case (idopt_T)(-1024 + (int)(.WV_CC)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_cc());
		case (idopt_T)(-1024 + (int)(.BV_INDK)):
				return (char_u)(generatedB_p_indk);
		case (idopt_T)(-1024 + (int)(.BV_FO)):
				return (char_u)(generatedB_p_fo);
		case (idopt_T)(-1024 + (int)(.BV_TFU)):
				return (char_u)(generatedB_p_tfu);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.WV_SO)))):
				return ModernizedCProgram.curwin.getW_p_so() >= 0 ? (char_u)(ModernizedCProgram.curwin.getW_p_so()) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_QE)):
				return (char_u)(generatedB_p_qe);
		case (idopt_T)(-1024 + (int)(.WV_FDE)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fde());
		case (idopt_T)(-1024 + (int)(.BV_FENC)):
				return (char_u)(generatedB_p_fenc);
		case (idopt_T)(-1024 + (int)(.WV_COLE)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_cole());
		case (idopt_T)(-1024 + (int)(.WV_BRI)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_bri());
		case (idopt_T)(-1024 + (int)(.WV_WCR)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wcr());
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_DICT)))):
				return generatedB_p_dict != (byte)'\000' ? (char_u)(generatedB_p_dict) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_FDM)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdm());
		case (idopt_T)(-1024 + (int)(.BV_CIN)):
				return (char_u)(generatedB_p_cin);
		case (idopt_T)(-1024 + (int)(.WV_FDL)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdl());
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_TC)))):
				return generatedB_p_tc != (byte)'\000' ? (char_u)(generatedB_p_tc) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_BT)):
				return (char_u)(generatedB_p_bt);
		case (idopt_T)(-1024 + (int)(.WV_LBR)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_lbr());
		case (idopt_T)(-1024 + (int)(.WV_RL)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rl());
		case (idopt_T)(-1024 + (int)(.BV_MPS)):
				return (char_u)(generatedB_p_mps);
		case (idopt_T)(-1024 + (int)(.BV_COM)):
				return (char_u)(generatedB_p_com);
		case (idopt_T)(-1024 + (int)(.WV_SCL)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scl());
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_GP)))):
				return generatedB_p_gp != (byte)'\000' ? (char_u)(generatedB_p_gp) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_OFU)):
				return (char_u)(generatedB_p_ofu);
		case (idopt_T)(-1024 + (int)(.WV_DIFF)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_diff());
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_TAGS)))):
				return generatedB_p_tags != (byte)'\000' ? (char_u)(generatedB_p_tags) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_ARAB)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_arab());
		case (idopt_T)(-1024 + (int)(.WV_CUL)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_cul());
		case (idopt_T)(-1024 + (int)(.BV_SWF)):
				return (char_u)(generatedB_p_swf);
		case (idopt_T)(-1024 + (int)(.BV_CPT)):
				return (char_u)(generatedB_p_cpt);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.WV_STL)))):
				return ModernizedCProgram.curwin.getW_onebuf_opt().getWo_stl() != (byte)'\000' ? (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_stl()) : generatedVar;
		case (idopt_T)(-1024 + (int)(.BV_NF)):
				return (char_u)(generatedB_p_nf);
		case (idopt_T)(-1024 + (int)(.BV_BOMB)):
				return (char_u)(generatedB_p_bomb);
		case (idopt_T)(-1024 + (int)(.BV_TX)):
				return (char_u)(generatedB_p_tx);
		case (idopt_T)(-1024 + (int)(.BV_FT)):
				return (char_u)(generatedB_p_ft);
		case (idopt_T)(-1024 + (int)(.WV_RNU)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rnu());
		case (idopt_T)(-1024 + (int)(.WV_LIST)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_list());
		case (idopt_T)(-1024 + (int)(.BV_SMC)):
				return (char_u)(generatedB_p_smc);
		case (idopt_T)(-1024 + (int)((idopt_T)(-1024 + (int)(.BV_UL)))):
				return generatedB_p_ul != -123456 ? (char_u)(generatedB_p_ul) : generatedVar;
		case (idopt_T)(-1024 + (int)(.WV_SPELL)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_spell());
		case (idopt_T)(-1024 + (int)(.BV_CI)):
				return (char_u)(generatedB_p_ci);
		case (idopt_T)(-1024 + (int)(.BV_SYN)):
				return (char_u)(generatedB_p_syn);
		case (idopt_T)(-1024 + (int)(.BV_IMI)):
				return (char_u)(generatedB_p_iminsert);
		case (idopt_T)(-1024 + (int)(.BV_BIN)):
				return (char_u)(generatedB_p_bin);
		case (idopt_T)(-1024 + (int)(.BV_INDE)):
				return (char_u)(generatedB_p_inde);
		case (idopt_T)(-1024 + (int)(.BV_FIXEOL)):
				return (char_u)(generatedB_p_fixeol);
		case (idopt_T)(-1024 + (int)(.BV_FF)):
				return (char_u)(generatedB_p_ff);
		case (idopt_T)(-1024 + (int)(.WV_FMR)):
				return (char_u)(ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fmr());
		default:
				ModernizedCProgram.iemsg(((byte)("E356: get_varp ERROR")));
		}
		return (char_u)(generatedB_p_wm);
	}
	public void option_value2string(int opt_flags) {
		char_u varp = new char_u();
		varp = opp.get_varp_scope(opt_flags);
		Object generatedFlags = this.getFlags();
		Object generatedVar = this.getVar();
		if (generatedFlags & -1024) {
			long wc = 0;
			if (ModernizedCProgram.wc_use_keyname(varp, wc)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ModernizedCProgram.NameBuff), (byte)(ModernizedCProgram.get_special_key_name((int)wc, 0)));
			}  else if (wc != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ModernizedCProgram.NameBuff), (byte)(ModernizedCProgram.transchar((int)wc)));
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.NameBuff, "%ld", (long)varp);
			} 
		} else {
				varp = (char_u)(/* P_STRING */varp);
				if (varp == ((Object)/* just in case */0)) {
					ModernizedCProgram.NameBuff[0] = (byte)'\000';
				}  else if (generatedVar == (char_u)p_key && /* don't show the actual value of 'key', only that it's set */varp) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ModernizedCProgram.NameBuff), (byte)("*****"));
				}  else if (generatedFlags & -1024) {
					((Object)0).home_replace(varp, ModernizedCProgram.NameBuff, 1024, 0);
				}  else if ((char_u)generatedVar == /* Translate 'pastetoggle' into special key names */ModernizedCProgram.p_pt) {
					ModernizedCProgram.str2specialbuf(ModernizedCProgram.p_pt, ModernizedCProgram.NameBuff, 1024);
				} else {
						ModernizedCProgram.vim_strncpy(ModernizedCProgram.NameBuff, varp, 1024 - 1/*
						 * Return TRUE if "varp" points to 'wildchar' or 'wildcharm' and it can be
						 * printed as a keyname.
						 * "*wcp" is set to the value of the option if it's 'wildchar' or 'wildcharm'.
						 */);
				} 
		} 
	}
	public byte[] getFullname() {
		return fullname;
	}
	public void setFullname(byte[] newFullname) {
		fullname = newFullname;
	}
	public Byte getShortname() {
		return shortname;
	}
	public void setShortname(Byte newShortname) {
		shortname = newShortname;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getVar() {
		return var;
	}
	public void setVar(Object newVar) {
		var = newVar;
	}
	public  getIndir() {
		return indir;
	}
	public void setIndir( newIndir) {
		indir = newIndir;
	}
	public Object getDef_val() {
		return def_val;
	}
	public void setDef_val(Object newDef_val) {
		def_val = newDef_val;
	}
}
// P_PRI_MKRC isn't needed here, optval_default()
// always returns TRUE for 'compatible'
// may be changed to "grep -n" in os_win32.c
// Add an extra file name so that grep will always
// insert a file name in the match line.
// Win32 console
// Excluded are: & and ^ are special in cmd.exe
// ( and ) are used in text separating fnames
// UNIX et al.
// TODO: EBCDIC Check this! @ == isalpha()
// TODO: EBCDIC Check this! @ == isalpha()
// all chars above 63 are printable
// untranslated to avoid problems when 'encoding'
// is changed
// set in set_init_1()
// VMS
// binary searching doesn't appear to work on VMS
// terminal output codes
// terminal key codes are not in here
// end marker
// The following is needed to make the gen_opt_test.vim script work.
// {"
