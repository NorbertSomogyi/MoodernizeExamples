package application;

public class flickcurl_method_s {
	private Object name;
	private int needslogin;
	private Object description;
	private Object response;
	private Object explanation;
	private Object args;
	private int args_count;
	
	public flickcurl_method_s(Object name, int needslogin, Object description, Object response, Object explanation, Object args, int args_count) {
		setName(name);
		setNeedslogin(needslogin);
		setDescription(description);
		setResponse(response);
		setExplanation(explanation);
		setArgs(args);
		setArgs_count(args_count);
	}
	public flickcurl_method_s() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getNeedslogin() {
		return needslogin;
	}
	public void setNeedslogin(int newNeedslogin) {
		needslogin = newNeedslogin;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object newDescription) {
		description = newDescription;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object newResponse) {
		response = newResponse;
	}
	public Object getExplanation() {
		return explanation;
	}
	public void setExplanation(Object newExplanation) {
		explanation = newExplanation;
	}
	public Object getArgs() {
		return args;
	}
	public void setArgs(Object newArgs) {
		args = newArgs;
	}
	public int getArgs_count() {
		return args_count;
	}
	public void setArgs_count(int newArgs_count) {
		args_count = newArgs_count;
	}
}
