package application;

public class has_commit_data {
	private repository repo;
	private int result;
	private Object path;
	
	public has_commit_data(repository repo, int result, Object path) {
		setRepo(repo);
		setResult(result);
		setPath(path);
	}
	public has_commit_data() {
	}
	
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int newResult) {
		result = newResult;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
}
