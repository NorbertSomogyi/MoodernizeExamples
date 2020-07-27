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
 * quickfix.c: functions for quickfix mode, using a file with error messages
 */
public class dir_stack_T {
	private dir_stack_T next;
	private Object dirname;
	
	public dir_stack_T(dir_stack_T next, Object dirname) {
		setNext(next);
		setDirname(dirname);
	}
	public dir_stack_T() {
	}
	
	public Object qf_push_dir(Object dirbuf, int is_file_stack) {
		dir_stack_T ds_new = new dir_stack_T();
		dir_stack_T ds_ptr = new dir_stack_T();
		// allocate new stack element and hook it in// allocate new stack element and hook it inds_new = (dir_stack_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/);
		if (ds_new == ((Object)0)) {
			return ((Object)0);
		} 
		ds_new.setNext(stackptr);
		stackptr = ds_new;
		dir_stack_T generatedNext = (stackptr).getNext();
		Object generatedDirname = (stackptr).getDirname();
		// store directory on the stackif (ModernizedCProgram.vim_isAbsName(dirbuf) || generatedNext == ((Object)0) || (stackptr && is_file_stack)) {
			(stackptr).setDirname(ModernizedCProgram.vim_strsave(dirbuf));
		} else {
				ds_new = generatedNext;
				(stackptr).setDirname(((Object)0));
				while (ds_new) {
					ModernizedCProgram.vim_free(generatedDirname);
					(stackptr).setDirname(ModernizedCProgram.concat_fnames(generatedDirname, dirbuf, 1));
					if (ModernizedCProgram.mch_isdir(generatedDirname) == 1) {
						break;
					} 
					ds_new = generatedNext;
				}
				while (generatedNext != ds_new) {
					ds_ptr = generatedNext;
					(stackptr).setNext(generatedNext);
					ModernizedCProgram.vim_free(generatedDirname);
					ModernizedCProgram.vim_free(ds_ptr);
				}
				if (ds_new == ((Object)0)) {
					ModernizedCProgram.vim_free(generatedDirname);
					(stackptr).setDirname(ModernizedCProgram.vim_strsave(dirbuf));
				} 
		} 
		if (generatedDirname != ((Object)0)) {
			return generatedDirname;
		} else {
				ds_ptr = stackptr;
				stackptr = generatedNext;
				ModernizedCProgram.vim_free(ds_ptr);
				return ((Object)0/*
				 * pop dirbuf from the directory stack and return previous directory or NULL if
				 * stack is empty
				 */);
		} 
	}
	public Object qf_pop_dir() {
		dir_stack_T ds_ptr = new dir_stack_T();
		// TODO: Should we check if dirbuf is the directory on top of the stack?// What to do if it isn't?
		dir_stack_T generatedNext = (stackptr).getNext();
		Object generatedDirname = ds_ptr.getDirname();
		// pop top element and free itif (stackptr != ((Object)0)) {
			ds_ptr = stackptr;
			stackptr = generatedNext;
			ModernizedCProgram.vim_free(generatedDirname);
			ModernizedCProgram.vim_free(ds_ptr);
		} 
		// return NEW top element as current dir or NULL if stack is emptyreturn stackptr ? generatedDirname : ((Object)0/*
		 * clean up directory stack
		 */);
	}
	public void qf_clean_dir_stack() {
		dir_stack_T ds_ptr = new dir_stack_T();
		dir_stack_T generatedNext = (stackptr).getNext();
		Object generatedDirname = ds_ptr.getDirname();
		while ((ds_ptr = stackptr) != ((Object)0)) {
			stackptr = generatedNext;
			ModernizedCProgram.vim_free(generatedDirname);
			ModernizedCProgram.vim_free(ds_ptr/*
			 * Check in which directory of the directory stack the given file can be
			 * found.
			 * Returns a pointer to the directory name or NULL if not found.
			 * Cleans up intermediate directory entries.
			 *
			 * TODO: How to solve the following problem?
			 * If we have this directory tree:
			 *     ./
			 *     ./aa
			 *     ./aa/bb
			 *     ./bb
			 *     ./bb/x.c
			 * and make says:
			 *     making all in aa
			 *     making all in bb
			 *     x.c:9: Error
			 * Then qf_push_dir thinks we are in ./aa/bb, but we are in ./bb.
			 * qf_guess_filepath will return NULL.
			 */);
		}
	}
	public dir_stack_T getNext() {
		return next;
	}
	public void setNext(dir_stack_T newNext) {
		next = newNext;
	}
	public Object getDirname() {
		return dirname;
	}
	public void setDirname(Object newDirname) {
		dirname = newDirname;
	}
}
