package application;

// don't copy location list
/*
 * arguments for gui_set_shellsize()
 */
// resize vertically
// resize horizontally
// resize in both directions
/*
 * flags for check_changed()
 */
// do autowrite if buffer was changed
// check also when several wins for the buf
// ! used
// may write all buffers
// may suggest using !
/*
 * "flags" values for option-setting functions.
 * When OPT_GLOBAL and OPT_LOCAL are both missing, set both local and global
 * values, get local value.
 */
// free old value if it was allocated
// use global value
// use local value
// option in modeline
// only set window-local options
// don't set window-local options
// Magic chars used in confirm dialog strings
// Values for "starting"
// no screen updating yet
// not all buffers loaded yet
//			0	   not starting anymore
// Values for swap_exists_action: what to do when swap file already exists
// don't use dialog
// use dialog when possible
// quit editing the file
// recover the file
/*
 * Minimal size for block 0 of a swap file.
 * NOTE: This depends on size of struct block0! It's not done with a sizeof(),
 * because struct block0 is defined in memline.c (Sorry).
 * The maximal block size is arbitrary.
 */
// Special values for current_sctx.sc_sid.
// when using a modeline
// for "--cmd" argument
// for "-c" argument
// for sourcing environment variable
// option was reset because of an error
// don't set scriptID
/*
 * Events for autocommands.
 */
// after writing to a filter
// before writing to a filter
// got the focus
// lost the focus to another app
// if calling a function which doesn't exist
// after starting the GUI
// after starting the GUI failed
// when changing Insert/Replace mode
// before inserting a char
// when entering Insert mode
// when leaving Insert mode
// just before popup menu is displayed
// option was set
// after :make, :grep etc.
// before :make, :grep etc.
// before :quit
// upon string reception from a remote vim
// going to wait for a character
// still waiting for a character
// after loading a session file
// after ":!cmd"
// after ":1,2!cmd", ":w !cmd", ":r !cmd".
// sourcing a Vim script using command
// before sourcing a Vim script
// after sourcing a Vim script
// spell file missing
// after reading from stdin
// before reading from stdin
// found existing swap file
// syntax selected
// after closing a tab page
// after entering a tab page
// before leaving a tab page
// when entering a new tab page
// after changing 'term'
// after a terminal buffer was created
// after setting "v:termresponse"
// text was modified not in Insert mode
// text was modified in Insert mode
// TextChangedI with popup menu visible
// after some text was yanked
// user defined autocommand
// after starting Vim
// before exiting Vim
// before exiting Vim and writing .viminfo
// after Vim window was resized
// after entering a window
// before leaving a window
// when entering a new window
// MUST be the last one
public enum auto_event {
	EVENT_BUFADD, 
	EVENT_BUFDELETE, 
	EVENT_BUFENTER, 
	EVENT_BUFFILEPOST, 
	EVENT_BUFFILEPRE, 
	EVENT_BUFHIDDEN, 
	EVENT_BUFLEAVE, 
	EVENT_BUFNEW, 
	EVENT_BUFNEWFILE, 
	EVENT_BUFREADCMD, 
	EVENT_BUFREADPOST, 
	EVENT_BUFREADPRE, 
	EVENT_BUFUNLOAD, 
	EVENT_BUFWINENTER, 
	EVENT_BUFWINLEAVE, 
	EVENT_BUFWIPEOUT, 
	EVENT_BUFWRITECMD, 
	EVENT_BUFWRITEPOST, 
	EVENT_BUFWRITEPRE, 
	EVENT_CMDLINECHANGED, 
	EVENT_CMDLINEENTER, 
	EVENT_CMDLINELEAVE, 
	EVENT_CMDUNDEFINED, 
	EVENT_CMDWINENTER, 
	EVENT_CMDWINLEAVE, 
	EVENT_COLORSCHEME, 
	EVENT_COLORSCHEMEPRE, 
	EVENT_COMPLETECHANGED, 
	EVENT_COMPLETEDONE, 
	EVENT_CURSORHOLD, 
	EVENT_CURSORHOLDI, 
	EVENT_CURSORMOVED, 
	EVENT_CURSORMOVEDI, 
	EVENT_DIFFUPDATED, 
	EVENT_DIRCHANGED, 
	EVENT_ENCODINGCHANGED, 
	EVENT_EXITPRE, 
	EVENT_FILEAPPENDCMD, 
	EVENT_FILEAPPENDPOST, 
	EVENT_FILEAPPENDPRE, 
	EVENT_FILECHANGEDRO, 
	EVENT_FILECHANGEDSHELL, 
	EVENT_FILECHANGEDSHELLPOST, 
	EVENT_FILEREADCMD, 
	EVENT_FILEREADPOST, 
	EVENT_FILEREADPRE, 
	EVENT_FILETYPE, 
	EVENT_FILEWRITECMD, 
	EVENT_FILEWRITEPOST, 
	EVENT_FILEWRITEPRE, 
	EVENT_FILTERREADPOST, 
	EVENT_FILTERREADPRE, 
	EVENT_FILTERWRITEPOST, 
	EVENT_FILTERWRITEPRE, 
	EVENT_FOCUSGAINED, 
	EVENT_FOCUSLOST, 
	EVENT_FUNCUNDEFINED, 
	EVENT_GUIENTER, 
	EVENT_GUIFAILED, 
	EVENT_INSERTCHANGE, 
	EVENT_INSERTCHARPRE, 
	EVENT_INSERTENTER, 
	EVENT_INSERTLEAVE, 
	EVENT_MENUPOPUP, 
	EVENT_OPTIONSET, 
	EVENT_QUICKFIXCMDPOST, 
	EVENT_QUICKFIXCMDPRE, 
	EVENT_QUITPRE, 
	EVENT_REMOTEREPLY, 
	EVENT_SAFESTATE, 
	EVENT_SAFESTATEAGAIN, 
	EVENT_SESSIONLOADPOST, 
	EVENT_SHELLCMDPOST, 
	EVENT_SHELLFILTERPOST, 
	EVENT_SOURCECMD, 
	EVENT_SOURCEPRE, 
	EVENT_SOURCEPOST, 
	EVENT_SPELLFILEMISSING, 
	EVENT_STDINREADPOST, 
	EVENT_STDINREADPRE, 
	EVENT_SWAPEXISTS, 
	EVENT_SYNTAX, 
	EVENT_TABCLOSED, 
	EVENT_TABENTER, 
	EVENT_TABLEAVE, 
	EVENT_TABNEW, 
	EVENT_TERMCHANGED, 
	EVENT_TERMINALOPEN, 
	EVENT_TERMRESPONSE, 
	EVENT_TEXTCHANGED, 
	EVENT_TEXTCHANGEDI, 
	EVENT_TEXTCHANGEDP, 
	EVENT_TEXTYANKPOST, 
	EVENT_USER, 
	EVENT_VIMENTER, 
	EVENT_VIMLEAVE, 
	EVENT_VIMLEAVEPRE, 
	EVENT_VIMRESIZED, 
	EVENT_WINENTER, 
	EVENT_WINLEAVE, 
	EVENT_WINNEW, 
	NUM_EVENTS
}
// after adding a buffer to the buffer list
// deleting a buffer from the buffer list
// after entering a buffer
// after renaming a buffer
// before renaming a buffer
// just after buffer becomes hidden
// before leaving a buffer
// after creating any buffer
// when creating a buffer for a new file
// read buffer using command
// after reading a buffer
// before reading a buffer
// just before unloading a buffer
// after showing a buffer in a window
// just after buffer removed from window
// just before really deleting a buffer
// write buffer using command
// after writing a buffer
// before writing a buffer
// command line was modified
// after entering the command line
// before leaving the command line
// command undefined
// after entering the cmdline window
// before leaving the cmdline window
// after loading a colorscheme
// before loading a colorscheme
// after completion popup menu changed
// after finishing insert complete
// cursor in same position for a while
// idem, in Insert mode
// cursor was moved
// cursor was moved in Insert mode
// after diffs were updated
// after user changed directory
// after changing the 'encoding' option
// before exiting
// append to a file using command
// after appending to a file
// before appending to a file
// before first change to read-only file
// after shell command that changed file
// after (not) reloading changed file
// read from a file using command
// after reading a file
// before reading a file
// new file type detected (user defined)
// write to a file using command
// after writing a file
// before writing a file
// after reading from a filter
// before reading from a filter
/*
 * Values for index in highlight_attr[].
 * When making changes, also update HL_FLAGS below!  And update the default
 * value of 'highlight' in option.c.
 */
// Meta & special keys listed with ":map", text that is
// displayed different from what it is
// after the last line in the buffer
// @ characters at end of screen, characters that
// don't really exist in the text
// directories in CTRL-D listing
// error messages
// obsolete, ignored
// incremental search
// last search string
// "--More--" message
// Mode (e.g., "-- INSERT --")
// line number for ":number" and ":#" commands
// current line number
// return to continue message and yes/no questions
// status lines
// status lines of not-current windows
// column to separate vertically split windows
// Titles for output from ":set all", ":autocmd" etc.
// Visual mode
// Visual mode, autoselecting and not clipboard owner
// warning messages
// Wildmenu highlight
// Folded line
// Fold column
// Added diff line
// Changed diff line
// Deleted diff line
// Text Changed in diff line
// Concealed text
// Sign column
// SpellBad
// SpellCap
// SpellRare
// SpellLocal
// popup menu normal item
// popup menu selected item
// popup menu scrollbar
// popup menu scrollbar thumb
// tabpage line
// tabpage line selected
// tabpage line filler
// 'cursorcolumn'
// 'cursorline'
// 'colorcolumn'
// quickfix window line currently selected
// status lines of terminal windows
// status lines of not-current terminal windows
// MUST be the last one
// The HL_FLAGS must be in the same order as the HLF_ enums!
// When changing this also adjust the default for 'highlight'.
// note: this is an int, not a long!
// sometimes used for a variant on TRUE
// no pending operation
// "d"  delete operator
// "y"  yank operator
// "c"  change operator
// "<"  left shift operator
// ">"  right shift operator
// "!"  filter operator
// "g~" switch case operator
// "="  indent operator
// "gq" format operator
// ":"  colon operator
// "gU" make upper case operator
// "gu" make lower case operator
// "J"  join operator, only for Visual mode
// "gJ"  join operator, only for Visual mode
// "g?" rot-13 encoding
// "r"  replace chars, only for Visual mode
// "I"  Insert column, only for Visual mode
// "A"  Append column, only for Visual mode
// "zf" define a fold
// "zo" open folds
// "zO" open folds recursively
// "zc" close folds
// "zC" close folds recursively
// "zd" delete folds
// "zD" delete folds recursively
// "gw" format operator, keeps cursor pos
// "g@" call 'operatorfunc'
// "<C-A>" Add to the number or alphabetic
// character (OP_ADD conflicts with Perl)
// "<C-X>" Subtract from the number or
// alphabetic character
// character-wise movement/register
// line-wise movement/register
// block-wise register
// Decide between MLINE/MCHAR
// minimal columns for screen
// minimal lines for screen
// height of a status line under a window
// height of a status line under a window
// default height for quickfix window
// size of the command processing buffer
// max. size of a line in the tags file
// file i/o and sprintf buffer size
// buffer size for dialog_msg()
// length of buffer for small messages
// cell length (worst case: utf-8
// takes 6 bytes for one cell)
// buffer size for get_foldtext()
// Size of the buffer used for tgetent().  Unfortunately this is largely
// undocumented, some systems use 1024.  Using a buffer that is too small
// causes a buffer overrun and a crash.  Use the maximum known value to stay
// on the safe side.
// buffer size for termcap entry
// Size in bytes of the hash used in the undo file.
// no CR-LF translation
// for systems that don't have W_OK in unistd.h
// for systems that don't have R_OK in unistd.h
// Allocate memory for one type and cast the returned pointer to have the
// compiler check the types.
// Like strcpy() but allows overlapped source and destination.
// We need to call mb_stricmp() even when we aren't dealing with a multi-byte
// encoding because mb_stricmp() takes care of all ascii and non-ascii
// encodings, including characters with umlauts in latin1, etc., while
// STRICMP() only handles the system locale version, which often does not
// handle non-ascii properly.
// Prefer using emsgf(), because perror() may send the output to the wrong
// destination and mess up the screen.
// line number type
// column number type
// display tick type
// maximum column number, 30 bits
// maximum (invalid) line number
// maximum column number
// maximum (invalid) line number
// columns needed by shown command
// max nr of %<flag> in statusline
