package application;

public class container {
	private payload payload_first;
	private Object payload_size;
	private node child;
	
	public container(payload payload_first, Object payload_size, node child) {
		setPayload_first(payload_first);
		setPayload_size(payload_size);
		setChild(child);
	}
	public container() {
	}
	
	public container container_create() {
		container container = new container();
		container = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		container.setPayload_first(((Object)0));
		container.setPayload_size(0);
		container.setChild(((Object)0));
		return container;
	}
	public container remove_container(node node, Object idx) {
		container removed = new container();
		container[][] generatedContainers = node.getContainers();
		removed = generatedContainers[idx];
		Object generatedContainer_size = node.getContainer_size();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedContainers[idx], generatedContainers[idx + 1], (generatedContainer_size - idx - 1) * /*Error: Unsupported expression*/);
		generatedContainer_size--;
		return removed;
	}
	public container container_insert(bftree tree, node node, Object container_idx, payload new_payload) {
		payload curr_payload = new payload();
		container target = new container();
		int is_equal;
		key_compare_func compare = new key_compare_func();
		bftree_opts generatedOpts = tree.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		compare = generatedKey_compare;
		Object generatedContainer_size = node.getContainer_size();
		container container = new container();
		container[][] generatedContainers = node.getContainers();
		if (container_idx >= generatedContainer_size) {
			target = container.container_create();
			ModernizedCProgram.insert_after_container(node, target, 0);
		} else {
				target = generatedContainers[container_idx];
		} 
		payload generatedPayload_first = target.getPayload_first();
		Object generatedKey = new_payload.getKey();
		curr_payload = generatedPayload_first.get_payload(generatedKey_compare, generatedKey, is_equal);
		payload generatedNext = curr_payload.getNext();
		Object generatedPayload_size = target.getPayload_size();
		if (is_equal) {
			ModernizedCProgram.payload_replace(tree, curr_payload, new_payload);
		} else {
				if (curr_payload) {
					new_payload.setNext(generatedNext);
					curr_payload.setNext(new_payload);
				} else {
						new_payload.setNext(generatedPayload_first);
						target.setPayload_first(new_payload);
				} 
				generatedPayload_size++;
		} 
		// exist same key, swap value of payload
		int generatedIs_migrated = tree.getIs_migrated();
		node generatedChild = target.getChild();
		if (generatedPayload_size > 100 && generatedIs_migrated) {
			if (generatedChild) {
				ModernizedCProgram.push_to_child(tree, node, target);
			} else {
					ModernizedCProgram.split_container(tree, node, container_idx);
			} 
		} 
		return target;
	}
	public payload getPayload_first() {
		return payload_first;
	}
	public void setPayload_first(payload newPayload_first) {
		payload_first = newPayload_first;
	}
	public Object getPayload_size() {
		return payload_size;
	}
	public void setPayload_size(Object newPayload_size) {
		payload_size = newPayload_size;
	}
	public node getChild() {
		return child;
	}
	public void setChild(node newChild) {
		child = newChild;
	}
}
