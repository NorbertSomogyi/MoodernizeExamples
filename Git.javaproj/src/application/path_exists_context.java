package application;

public class path_exists_context {
	private pathspec pathspec;
	private archiver_args args;
	
	public path_exists_context(pathspec pathspec, archiver_args args) {
		setPathspec(pathspec);
		setArgs(args);
	}
	public path_exists_context() {
	}
	
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public archiver_args getArgs() {
		return args;
	}
	public void setArgs(archiver_args newArgs) {
		args = newArgs;
	}
}
