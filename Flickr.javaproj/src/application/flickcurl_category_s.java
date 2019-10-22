package application;

public class flickcurl_category_s {
	private byte[] id;
	private byte[] name;
	private byte[] path;
	private int count;
	private flickcurl_category_s[][] categories;
	private int categories_count;
	private [][] groups;
	private int groups_count;
	
	public flickcurl_category_s(byte[] id, byte[] name, byte[] path, int count, flickcurl_category_s[][] categories, int categories_count, [][] groups, int groups_count) {
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
	
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * groups-api.c - Flickr flickr.groups.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_groups_browse:
	 * @fc: flickcurl context
	 * @cat_id: The category id to fetch a list of groups and sub-categories for. If not specified, it defaults to zero, the root of the category tree. (or NULL)
	 * 
	 * Browse the group category tree, finding groups and sub-categories.
	 *
	 * Implements flickr.groups.browse (0.13)
	 * 
	 * Return value: non-0 on failure
	 **/
	public flickcurl_category_s[] flickcurl_groups_browse(flickcurl_s[] fc, int cat_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_category[] category = ((Object)0);
		byte[] cat_id_str = new byte[10];
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (cat_id >= 0) {
			.sprintf(cat_id_str, "%d", cat_id);
			flickcurl_s.flickcurl_add_param(fc, "cat_id", cat_id_str);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.groups.browse")) {
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		doc = flickcurl_s.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathCtx) {
			flickcurl_s.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		category = (flickcurl_category).calloc(, 1);
		int generatedCategories_count = category.getCategories_count();
		flickcurl_category_s flickcurl_category_s = new flickcurl_category_s();
		category.setCategories(flickcurl_category_s.flickcurl_build_categories(fc, xpathCtx, ()"/rsp/category/subcat", generatedCategories_count));
		int generatedGroups_count = category.getGroups_count();
		flickcurl_s flickcurl_s = new flickcurl_s();
		category.setGroups(flickcurl_s.flickcurl_build_groups(fc, xpathCtx, ()"/rsp/category/group", generatedGroups_count));
		int generatedFailed = fc.getFailed();
		flickcurl_category_s flickcurl_category_s = new flickcurl_category_s();
		if (generatedFailed) {
			if (category) {
				flickcurl_category_s.flickcurl_free_category(category);
			} 
			category = ((Object)0);
		} 
		return category/**
		 * flickcurl_groups_getInfo:
		 * @fc: flickcurl context
		 * @group_id: The NSID of the group to fetch information for.
		 * @lang: The language of the group name and description to fetch.  If the language is not found, the primary language of the group will be returned (or NULL)
		 *
		 * Get information about a group.
		 *
		 * Implements flickr.groups.getInfo (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * category.c - Flickcurl category functions
	 *
	 * Copyright (C) 2007-2008, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_free_category:
	 * @category: category object
	 *
	 * Destructor for category object
	 */
	public void flickcurl_free_category(flickcurl_category_s[] category) {
		do {
			if (!category) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_category is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\category.c", 46, __func__);
				return ;
			} 
		} while (0);
		byte[] generatedId = category.getId();
		if (generatedId) {
			.free(generatedId);
		} 
		byte[] generatedName = category.getName();
		if (generatedName) {
			.free(generatedName);
		} 
		flickcurl_category_s[][] generatedCategories = category.getCategories();
		flickcurl_category_s flickcurl_category_s = new flickcurl_category_s();
		if (generatedCategories) {
			flickcurl_category_s.flickcurl_free_categories(generatedCategories);
		} 
		[][] generatedGroups = category.getGroups();
		if (generatedGroups) {
			ModernizedCProgram.flickcurl_free_groups(generatedGroups);
		} 
		.free(category/**
		 * flickcurl_free_categories:
		 * @categories_object: category object array
		 *
		 * Destructor for array of category object
		 */);
	}
	public void flickcurl_free_categories(flickcurl_category_s[][] categories_object) {
		int i;
		do {
			if (!categories_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_category is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\category.c", 75, __func__);
				return ;
			} 
		} while (0);
		flickcurl_category_s flickcurl_category_s = new flickcurl_category_s();
		for (i = 0; categories_object[i]; i++) {
			flickcurl_category_s.flickcurl_free_category(categories_object[i]);
		}
		.free(categories_object);
	}
	public flickcurl_category_s[][] flickcurl_build_categories(flickcurl_s[] fc, Object xpathCtx, Object[] xpathExpr, Integer category_count_p) {
		flickcurl_category[][] categories = ((Object)0);
		int nodes_count;
		int category_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathObj) {
			flickcurl_s.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		categories = (flickcurl_category).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			[] attr = new ();
			flickcurl_category[] c = new flickcurl_category();
			if (node.getType() != XML_ELEMENT_NODE) {
				flickcurl_s.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			c = (flickcurl_category).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte[] attr_name = (byte)attr.getName();
				byte[] attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					c.setId(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					c.setName(attr_value);
				}  else if (!.strcmp(attr_name, "path")) {
					c.setPath(attr_value);
				}  else if (!.strcmp(attr_name, "count")) {
					c.setCount(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			categories[category_count++] = c/* for nodes */;
		}
		if (category_count_p) {
			category_count_p = category_count;
		} 
		return categories;
	}
	public void command_print_category(flickcurl_category_s[] c) {
		byte[] generatedId = c.getId();
		byte[] generatedName = c.getName();
		byte[] generatedPath = c.getPath();
		int generatedCount = c.getCount();
		.fprintf((_iob[1]), "category: id %s  name '%s'  path '%s'  count %d\n", generatedId, generatedName, generatedPath, generatedCount);
		flickcurl_category_s[][] generatedCategories = c.getCategories();
		flickcurl_category_s flickcurl_category_s = new flickcurl_category_s();
		if (generatedCategories) {
			int i;
			for (i = 0; generatedCategories[i]; i++) {
				.fprintf((_iob[1]), "%s: Category %d\n", ModernizedCProgram.program, i);
				flickcurl_category_s.command_print_category(generatedCategories[i]);
			}
		} 
		[][] generatedGroups = c.getGroups();
		if (generatedGroups) {
			int i;
			for (i = 0; generatedGroups[i]; i++) {
				.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
				ModernizedCProgram.command_print_group(generatedGroups[i]);
			}
		} 
	}
	public byte[] getId() {
		return id;
	}
	public void setId(byte[] newId) {
		id = newId;
	}
	public byte[] getName() {
		return name;
	}
	public void setName(byte[] newName) {
		name = newName;
	}
	public byte[] getPath() {
		return path;
	}
	public void setPath(byte[] newPath) {
		path = newPath;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public flickcurl_category_s[][] getCategories() {
		return categories;
	}
	public void setCategories(flickcurl_category_s[][] newCategories) {
		categories = newCategories;
	}
	public int getCategories_count() {
		return categories_count;
	}
	public void setCategories_count(int newCategories_count) {
		categories_count = newCategories_count;
	}
	public [][] getGroups() {
		return groups;
	}
	public void setGroups([][] newGroups) {
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
