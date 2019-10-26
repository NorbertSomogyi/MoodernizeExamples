package application;

public class obs_sceneitem_order_info {
	private obs_scene_item group;
	private obs_scene_item item;
	
	public obs_sceneitem_order_info(obs_scene_item group, obs_scene_item item) {
		setGroup(group);
		setItem(item);
	}
	public obs_sceneitem_order_info() {
	}
	
	public obs_scene_item getGroup() {
		return group;
	}
	public void setGroup(obs_scene_item newGroup) {
		group = newGroup;
	}
	public obs_scene_item getItem() {
		return item;
	}
	public void setItem(obs_scene_item newItem) {
		item = newItem;
	}
}
