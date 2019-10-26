package application;

public class node {
	private node parent;
	private container containers;
	private Object container_count;
	private Object container_size;
	
	public node(node parent, container containers, Object container_count, Object container_size) {
		setParent(parent);
		setContainers(containers);
		setContainer_count(container_count);
		setContainer_size(container_size);
	}
	public node() {
	}
	
	public node node_create() {
		node node = new node();
		node = .malloc();
		node.setParent(parent_node);
		node.setContainers(.malloc( * 16));
		node.setContainer_count(16);
		node.setContainer_size(0);
		return node;
	}
	public Object find_container(Object compare, Object key, Object start_container) {
		int left;
		int right;
		int middle;
		int result;
		int compared;
		container containers = new container();
		left = start_container;
		Object generatedContainer_size = this.getContainer_size();
		right = generatedContainer_size - 1;
		container generatedContainers = this.getContainers();
		containers = generatedContainers;
		compared = 0;
		while (left <= right) {
			middle = (left + right) / 2;
			compared = .compare(key, containers[middle].getPayload_first().getKey());
			if (compared < 0) {
				right = middle - 1;
			}  else if (compared > 0) {
				left = middle + 1;
			} else {
					right = middle;
					break;
			} 
		}
		if (compared > 0) {
			result = left - 1;
		}  else if (compared < 0) {
			result = right;
		} else {
				result = right;
		} 
		if (result == 0) {
			return 0;
		} 
		return right - 1;
	}
	// ========================== Debug Area ==========================
	// ================================================================
	public void validate_containers(Object compare) {
		int i;
		payload curr = new payload();
		payload prev = new payload();
		Object generatedContainer_size = this.getContainer_size();
		container generatedContainers = this.getContainers();
		payload generatedNext = prev.getNext();
		Object generatedKey = prev.getKey();
		for (i = 0; i < generatedContainer_size; i++) {
			prev = generatedContainers[i].getPayload_first();
			curr = generatedNext;
			while (curr) {
				((.compare(generatedKey, generatedKey) < 0) ? (Object)0 : ._assert("compare(prev->key, curr->key) < 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\buffered_tree.c", 601));
				prev = curr;
				curr = generatedNext;
			}
			if (i == 0) {
				continue;
			} 
			((.compare(generatedKey, generatedKey) < 0) ? (Object)0 : ._assert("compare(node->containers[i-1]->payload_first->key, node->containers[i]->payload_first->key) < 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\buffered_tree.c", 608));
		}
	}
	public void bftree_node_print() {
		int i;
		payload payload = new payload();
		Object generatedContainer_size = this.getContainer_size();
		container generatedContainers = this.getContainers();
		Object generatedKey = payload.getKey();
		Object generatedVal = payload.getVal();
		payload generatedNext = payload.getNext();
		for (i = 0; i < generatedContainer_size; ++i) {
			.printf("container%d %d %s\t", i, generatedContainers[i].getPayload_size(), generatedContainers[i].getPayload_first().getKey());
			payload = generatedContainers[i].getPayload_first();
			while (payload) {
				.printf("%s => %s ", generatedKey, generatedVal);
				payload = generatedNext;
			}
			.printf("\n");
		}
		.printf("\n")// ================================================================// ========================== Map Type Area =======================;// ================================================================// ========================== Map Type Area =======================
	}
	public node getParent() {
		return parent;
	}
	public void setParent(node newParent) {
		parent = newParent;
	}
	public container getContainers() {
		return containers;
	}
	public void setContainers(container newContainers) {
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
