package application;

public class flickcurl_category_s {
	private Object id;
	private Object name;
	private Object path;
	private int count;
	private Object categories;
	private int categories_count;
	private Object groups;
	private int groups_count;
	
	public flickcurl_category_s(Object id, Object name, Object path, int count, Object categories, int categories_count, Object groups, int groups_count) {
		setId(id);
		setName(name);
		setPath(path);
		setCount(count);
		setCategories(categories);
		setCategories_count(categories_count);
		setGroups(groups);
		setGroups_count(groups_count);
	}
	public flickcurl_category_s() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public Object getCategories() {
		return categories;
	}
	public void setCategories(Object newCategories) {
		categories = newCategories;
	}
	public int getCategories_count() {
		return categories_count;
	}
	public void setCategories_count(int newCategories_count) {
		categories_count = newCategories_count;
	}
	public Object getGroups() {
		return groups;
	}
	public void setGroups(Object newGroups) {
		groups = newGroups;
	}
	public int getGroups_count() {
		return groups_count;
	}
	public void setGroups_count(int newGroups_count) {
		groups_count = newGroups_count;
	}
}
/**
 * flickcurl_gallery: 
 * @id: gallery ID
 * @url: URL of gallery
 * @owner: owner NSID
 * @date_create: creation date of gallery
 * @date_update: update / last modified date of gallery
 * @primary_photo: primary photo for the gallery
 * @count_photos: number of photos in the gallery
 * @count_videos: number of photos in the gallery
 * @title: Gallery title
 * @description: Gallery description
 *
 * A photo gallery.
 *
 * The list of photos in the gallery is available via the API calls
 * flickcurl_galleries_getPhotos() or
 * flickcurl_galleries_getPhotos_params()
 *
 */
