package application;

public class Split_containerToTry_split_node {
	
	
	private static void split_container(bftree tree, node node, Object container_idx) {
		uint32_t half_count = new uint32_t();
		uint32_t i = new uint32_t();
		container new_container = new container();
		container target = new container();
		payload payload = new payload();
		container container = new container();
		new_container = container.container_create();
		ModernizedCProgram.insert_after_container(node, new_container, container_idx);
		container[][] generatedContainers = node.getContainers();
		target = generatedContainers[container_idx];
		Object generatedPayload_size = target.getPayload_size();
		half_count = generatedPayload_size / 2;
		payload generatedPayload_first = target.getPayload_first();
		payload = generatedPayload_first;
		payload generatedNext = payload.getNext();
		for (i = 0; i < half_count - 1; ++i) {
			payload = generatedNext;
		}
		new_container.setPayload_first(generatedNext);
		payload.setNext((null));
		new_container.setPayload_size(generatedPayload_size - half_count);
		target.setPayload_size(half_count);
		ModernizedCProgram.try_split_node(tree, node);
	}
	private static void insert_after_container(node node, container container, Object container_idx) {
		Object generatedContainer_size = node.getContainer_size();
		Object generatedContainer_count = node.getContainer_count();
		container[][] generatedContainers = node.getContainers();
		if (generatedContainer_size == generatedContainer_count) {
			node.setContainers(/*Error: Function owner not recognized*/realloc(generatedContainers, /*Error: Unsupported expression*/ * generatedContainer_count * 2));
			generatedContainer_count *= 2;
		} 
		if (generatedContainer_size == 0) {
			generatedContainers[generatedContainer_size++] = container;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedContainers[container_idx + 2], generatedContainers[container_idx + 1], (generatedContainer_size - container_idx - 1) * /*Error: Unsupported expression*/);
				generatedContainers[container_idx + 1] = container;
				generatedContainer_size++;
		} 
	}
	private static void try_split_node(bftree tree, node node) {
		uint32_t middle_container_idx = new uint32_t();
		uint32_t parent_container_idx = new uint32_t();
		int i;
		node new_node = new node();
		node new_root = new node();
		container container = new container();
		container new_node_first_container = new container();
		Object generatedContainer_size = node.getContainer_size();
		if (generatedContainer_size < 16) {
			return /*Error: Unsupported expression*/;
		} 
		// the number of container in this node is full
		middle_container_idx = generatedContainer_size / 2;
		node generatedParent = node.getParent();
		new_node = generatedParent.node_create();
		container[][] generatedContainers = node.getContainers();
		new_node_first_container = generatedContainers[middle_container_idx];
		new_node_first_container.setChild(new_node);
		for (i = middle_container_idx + 1; i < generatedContainer_size; ++i) {
			container = generatedContainers[i];
			ModernizedCProgram.insert_after_container(new_node, container, i - middle_container_idx - 2);
		}
		generatedContainer_size -= (i - middle_container_idx);
		node generatedRoot = tree.getRoot();
		Object generatedHeight = tree.getHeight();
		container container = new container();
		bftree_opts generatedOpts = tree.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		payload generatedPayload_first = new_node_first_container.getPayload_first();
		Object generatedKey = generatedPayload_first.getKey();
		if (node == generatedRoot) {
			new_root = (null).node_create();
			tree.setRoot(new_root);
			generatedHeight++;
			node.setParent(new_root);
			new_node.setParent(new_root);
			container = container.remove_container(node, 0);
			container.setChild(node);
			ModernizedCProgram.insert_after_container(new_root, container, 0);
			ModernizedCProgram.insert_after_container(new_root, new_node_first_container, 0);
		} else {
				parent_container_idx = generatedParent.find_container(generatedKey_compare, generatedKey, 0);
				ModernizedCProgram.insert_after_container(generatedParent, new_node_first_container, parent_container_idx);
				ModernizedCProgram.order_container_payload(tree, generatedParent, parent_container_idx, parent_container_idx + 1);
				ModernizedCProgram.try_split_node(tree, generatedParent);
		} 
		// produce new root
	}
}
