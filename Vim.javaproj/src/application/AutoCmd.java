package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * autocmd.c: Autocommand related functions
 */
/*
 * The autocommands are stored in a list for each event.
 * Autocommands for the same pattern, that are consecutive, are joined
 * together, to avoid having to match the pattern too often.
 * The result is an array of Autopat lists, which point to AutoCmd lists:
 *
 * last_autopat[0]  -----------------------------+
 *						 V
 * first_autopat[0] --> Autopat.next  -->  Autopat.next -->  NULL
 *			Autopat.cmds	   Autopat.cmds
 *			    |			 |
 *			    V			 V
 *			AutoCmd.next	   AutoCmd.next
 *			    |			 |
 *			    V			 V
 *			AutoCmd.next		NULL
 *			    |
 *			    V
 *			   NULL
 *
 * last_autopat[1]  --------+
 *			    V
 * first_autopat[1] --> Autopat.next  -->  NULL
 *			Autopat.cmds
 *			    |
 *			    V
 *			AutoCmd.next
 *			    |
 *			    V
 *			   NULL
 *   etc.
 *
 *   The order of AutoCmds is important, this is the order in which they were
 *   defined and will have to be executed.
 */
// next AutoCmd in list
public class AutoCmd {
	private Object cmd;
	private byte once;
	private byte nested;
	private byte last;
	private  script_ctx;
	private AutoCmd next;
	
	public AutoCmd(Object cmd, byte once, byte nested, byte last,  script_ctx, AutoCmd next) {
		setCmd(cmd);
		setOnce(once);
		setNested(nested);
		setLast(last);
		setScript_ctx(script_ctx);
		setNext(next);
	}
	public AutoCmd() {
	}
	
	// Delete one command from an autocmd pattern.
	public void au_del_cmd() {
		Object generatedCmd = this.getCmd();
		do {
			if ((generatedCmd) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedCmd);
				(generatedCmd) = ((Object)0);
			} 
		} while (0);
		ModernizedCProgram.au_need_clean = 1/*
		 * Cleanup autocommands and patterns that have been deleted.
		 * This is only done when not executing autocommands.
		 */;
	}
	public Object getCmd() {
		return cmd;
	}
	public void setCmd(Object newCmd) {
		cmd = newCmd;
	}
	public byte getOnce() {
		return once;
	}
	public void setOnce(byte newOnce) {
		once = newOnce;
	}
	public byte getNested() {
		return nested;
	}
	public void setNested(byte newNested) {
		nested = newNested;
	}
	public byte getLast() {
		return last;
	}
	public void setLast(byte newLast) {
		last = newLast;
	}
	public  getScript_ctx() {
		return script_ctx;
	}
	public void setScript_ctx( newScript_ctx) {
		script_ctx = newScript_ctx;
	}
	public AutoCmd getNext() {
		return next;
	}
	public void setNext(AutoCmd newNext) {
		next = newNext;
	}
}
