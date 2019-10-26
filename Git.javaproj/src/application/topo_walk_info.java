package application;

public class topo_walk_info {
	private Object min_generation;
	private prio_queue explore_queue;
	private prio_queue indegree_queue;
	private prio_queue topo_queue;
	private indegree_slab indegree;
	private author_date_slab author_date;
	
	public topo_walk_info(Object min_generation, prio_queue explore_queue, prio_queue indegree_queue, prio_queue topo_queue, indegree_slab indegree, author_date_slab author_date) {
		setMin_generation(min_generation);
		setExplore_queue(explore_queue);
		setIndegree_queue(indegree_queue);
		setTopo_queue(topo_queue);
		setIndegree(indegree);
		setAuthor_date(author_date);
	}
	public topo_walk_info() {
	}
	
	public Object getMin_generation() {
		return min_generation;
	}
	public void setMin_generation(Object newMin_generation) {
		min_generation = newMin_generation;
	}
	public prio_queue getExplore_queue() {
		return explore_queue;
	}
	public void setExplore_queue(prio_queue newExplore_queue) {
		explore_queue = newExplore_queue;
	}
	public prio_queue getIndegree_queue() {
		return indegree_queue;
	}
	public void setIndegree_queue(prio_queue newIndegree_queue) {
		indegree_queue = newIndegree_queue;
	}
	public prio_queue getTopo_queue() {
		return topo_queue;
	}
	public void setTopo_queue(prio_queue newTopo_queue) {
		topo_queue = newTopo_queue;
	}
	public indegree_slab getIndegree() {
		return indegree;
	}
	public void setIndegree(indegree_slab newIndegree) {
		indegree = newIndegree;
	}
	public author_date_slab getAuthor_date() {
		return author_date;
	}
	public void setAuthor_date(author_date_slab newAuthor_date) {
		author_date = newAuthor_date;
	}
}
