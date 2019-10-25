package application;

public class node {
	private Object parent;
	private Object containers;
	private Object container_count;
	private Object container_size;
	
	public node(Object parent, Object containers, Object container_count, Object container_size) {
		setParent(parent);
		setContainers(containers);
		setContainer_count(container_count);
		setContainer_size(container_size);
	}
	public node() {
	}
	
	public Object getParent() {
		return parent;
	}
	public void setParent(Object newParent) {
		parent = newParent;
	}
	public Object getContainers() {
		return containers;
	}
	public void setContainers(Object newContainers) {
		containers = newContainers;
	}
	public Object getContainer_count() {
		return container_count;
	}
	public void setContainer_count(Object newContainer_count) {
		container_count = newContainer_count;
	}
	public Object getContainer_size() {
		return container_size;
	}
	public void setContainer_size(Object newContainer_size) {
		container_size = newContainer_size;
	}
}
