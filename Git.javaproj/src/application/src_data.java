package application;

/* merge data per repository where the merged tips came from */
public class src_data {
	private string_list branch;
	private string_list tag;
	private string_list r_branch;
	private string_list generic;
	private int head_status;
	
	public src_data(string_list branch, string_list tag, string_list r_branch, string_list generic, int head_status) {
		setBranch(branch);
		setTag(tag);
		setR_branch(r_branch);
		setGeneric(generic);
		setHead_status(head_status);
	}
	public src_data() {
	}
	
	public void init_src_data() {
		string_list generatedBranch = this.getBranch();
		generatedBranch.setStrdup_strings(1);
		string_list generatedTag = this.getTag();
		generatedTag.setStrdup_strings(1);
		string_list generatedR_branch = this.getR_branch();
		generatedR_branch.setStrdup_strings(1);
		string_list generatedGeneric = this.getGeneric();
		generatedGeneric.setStrdup_strings(1);
	}
	public string_list getBranch() {
		return branch;
	}
	public void setBranch(string_list newBranch) {
		branch = newBranch;
	}
	public string_list getTag() {
		return tag;
	}
	public void setTag(string_list newTag) {
		tag = newTag;
	}
	public string_list getR_branch() {
		return r_branch;
	}
	public void setR_branch(string_list newR_branch) {
		r_branch = newR_branch;
	}
	public string_list getGeneric() {
		return generic;
	}
	public void setGeneric(string_list newGeneric) {
		generic = newGeneric;
	}
	public int getHead_status() {
		return head_status;
	}
	public void setHead_status(int newHead_status) {
		head_status = newHead_status;
	}
}
