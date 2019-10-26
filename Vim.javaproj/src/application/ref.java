package application;

/* This appears to be new in Tcl 8.4. */
/*
 *  List of Tcl interpreters who reference a vim window or buffer.
 *  Each buffer and window has its own list in the w_tcl_ref or b_tcl_ref
 *  struct member.  We need this because Tcl can create sub-interpreters with
 *  the "interp" command, and each interpreter can reference all windows and
 *  buffers.
 */
/* dummy object for deleted ref list */
public class ref {
	private ref next;
	private Object interp;
	private Object cmd;
	private Object delcmd;
	private Object vimobj;
	
	public ref(ref next, Object interp, Object cmd, Object delcmd, Object vimobj) {
		setNext(next);
		setInterp(interp);
		setCmd(cmd);
		setDelcmd(delcmd);
		setVimobj(vimobj);
	}
	public ref() {
	}
	
	public int tclsetdelcmd(Object interp, Object vimobj, Object delcmd) {
		if (reflist == ModernizedCProgram.refsdeleted) {
			.Tcl_SetResult(interp, ((byte)("cannot register callback command: buffer/window is already being deleted")), TCL_STATIC);
			return TCL_ERROR;
		} 
		Object generatedInterp = this.getInterp();
		Object generatedVimobj = this.getVimobj();
		Object generatedDelcmd = this.getDelcmd();
		ref generatedNext = this.getNext();
		while (reflist != ((Object)0)) {
			if (generatedInterp == interp && generatedVimobj == vimobj) {
				if (generatedDelcmd) {
					.Tcl_DecrRefCount(generatedDelcmd);
				} 
				.Tcl_IncrRefCount(delcmd);
				this.setDelcmd(delcmd);
				return TCL_OK;
			} 
			reflist = generatedNext;
		}
		ModernizedCProgram.emsg(((byte)(/* This should never happen.  Famous last word? */"E280: TCL FATAL ERROR: reflist corrupt!? Please report this to vim-dev@vim.org")));
		.Tcl_SetResult(interp, ((byte)("cannot register callback command: buffer/window reference not found")), TCL_STATIC);
		return TCL_ERROR/*******************************************
		    I/O Channel
		********************************************/;
	}
	public void tcldelallrefs() {
		ref next = new ref();
		int err;
		byte result;
		/* TODO: this code currently crashes Vim on exit */
		ref generatedNext = this.getNext();
		Object generatedInterp = this.getInterp();
		Object generatedDelcmd = this.getDelcmd();
		Object generatedCmd = this.getCmd();
		while (ref != ((Object)0)) {
			next = generatedNext;
			if (generatedInterp) {
				if (generatedDelcmd) {
					err = .Tcl_GlobalEvalObj(generatedInterp, generatedDelcmd);
					if (err != TCL_OK) {
						result = (byte).Tcl_GetStringResult(generatedInterp);
						if (result) {
							ModernizedCProgram.tclerrmsg(result);
						} 
					} 
					.Tcl_DecrRefCount(generatedDelcmd);
					this.setDelcmd(((Object)0));
				} 
				.Tcl_DeleteCommandFromToken(generatedInterp, generatedCmd);
			} 
			.Tcl_Free((byte)ref);
			ref = next;
		}
	}
	public ref getNext() {
		return next;
	}
	public void setNext(ref newNext) {
		next = newNext;
	}
	public Object getInterp() {
		return interp;
	}
	public void setInterp(Object newInterp) {
		interp = newInterp;
	}
	public Object getCmd() {
		return cmd;
	}
	public void setCmd(Object newCmd) {
		cmd = newCmd;
	}
	public Object getDelcmd() {
		return delcmd;
	}
	public void setDelcmd(Object newDelcmd) {
		delcmd = newDelcmd;
	}
	public Object getVimobj() {
		return vimobj;
	}
	public void setVimobj(Object newVimobj) {
		vimobj = newVimobj;
	}
}
/*****************************************************************************
 * TCL interface manager
 ****************************************************************************/
/* Just generating prototypes */
/*
 * Declare HANDLE for tcl.dll and function pointers.
 */
/*
 * Table of name to function pointer of tcl.
 */
