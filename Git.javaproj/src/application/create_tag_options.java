package application;

public class create_tag_options {
	private int message_given;
	private int use_editor;
	private int sign;
	private  cleanup_mode;
	
	public create_tag_options(int message_given, int use_editor, int sign,  cleanup_mode) {
		setMessage_given(message_given);
		setUse_editor(use_editor);
		setSign(sign);
		setCleanup_mode(cleanup_mode);
	}
	public create_tag_options() {
	}
	
	public int getMessage_given() {
		return message_given;
	}
	public void setMessage_given(int newMessage_given) {
		message_given = newMessage_given;
	}
	public int getUse_editor() {
		return use_editor;
	}
	public void setUse_editor(int newUse_editor) {
		use_editor = newUse_editor;
	}
	public int getSign() {
		return sign;
	}
	public void setSign(int newSign) {
		sign = newSign;
	}
	public  getCleanup_mode() {
		return cleanup_mode;
	}
	public void setCleanup_mode( newCleanup_mode) {
		cleanup_mode = newCleanup_mode;
	}
}
