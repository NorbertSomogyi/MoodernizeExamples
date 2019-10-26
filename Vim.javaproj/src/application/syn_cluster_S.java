package application;

public class syn_cluster_S {
	private Object scl_name;
	private Object scl_name_u;
	private Integer scl_list;
	
	public syn_cluster_S(Object scl_name, Object scl_name_u, Integer scl_list) {
		setScl_name(scl_name);
		setScl_name_u(scl_name_u);
		setScl_list(scl_list);
	}
	public syn_cluster_S() {
	}
	
	public Object getScl_name() {
		return scl_name;
	}
	public void setScl_name(Object newScl_name) {
		scl_name = newScl_name;
	}
	public Object getScl_name_u() {
		return scl_name_u;
	}
	public void setScl_name_u(Object newScl_name_u) {
		scl_name_u = newScl_name_u;
	}
	public Integer getScl_list() {
		return scl_list;
	}
	public void setScl_list(Integer newScl_list) {
		scl_list = newScl_list;
	}
}
