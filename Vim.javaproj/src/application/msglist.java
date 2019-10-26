package application;

// nothing pending in ":finally" clause
// an error is pending
// an interrupt is pending
// a throw is pending
// ":break" is pending
// ":continue" is pending
// ":return" is pending
// ":finish" is pending
/*
 * Flags for the cs_lflags item in struct condstack.
 */
// just found ":while" or ":for"
// just found ":endwhile" or ":endfor"
// just found ":continue"
// just found ":finally"
/*
 * A list of error messages that can be converted to an exception.  "throw_msg"
 * is only set in the first element of the list.  Usually, it points to the
 * original message stored in that element, but sometimes it points to a later
 * message in the list.  See cause_errthrow() below.
 */
// next of several messages in a row
// message(s) causing error exception
public class msglist {
	private Byte msg;
	private Byte throw_msg;
	private msglist next;
	
	public msglist(Byte msg, Byte throw_msg, msglist next) {
		setMsg(msg);
		setThrow_msg(throw_msg);
		setNext(next);
	}
	public msglist() {
	}
	
	public void free_msglist() {
		msglist messages = new msglist();
		msglist next = new msglist();
		messages = ModernizedCProgram.l;
		msglist generatedNext = messages.getNext();
		Byte generatedMsg = messages.getMsg();
		while (messages != ((Object)0)) {
			next = generatedNext;
			ModernizedCProgram.vim_free(generatedMsg);
			ModernizedCProgram.vim_free(messages);
			messages = next/*
			 * Free global "*msg_list" and the messages it contains, then set "*msg_list"
			 * to NULL.
			 */;
		}
	}
	public Byte getMsg() {
		return msg;
	}
	public void setMsg(Byte newMsg) {
		msg = newMsg;
	}
	public Byte getThrow_msg() {
		return throw_msg;
	}
	public void setThrow_msg(Byte newThrow_msg) {
		throw_msg = newThrow_msg;
	}
	public msglist getNext() {
		return next;
	}
	public void setNext(msglist newNext) {
		next = newNext;
	}
}
/*
 * The exception types.
 */
// exception caused by ":throw" command
