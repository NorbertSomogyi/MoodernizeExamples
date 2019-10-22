package application;

public class flickcurl_collection_s {
	private byte[] id;
	private int child_count;
	private int date_created;
	private byte[] iconlarge;
	private byte[] iconsmall;
	private int server;
	private byte[] secret;
	private byte[] title;
	private byte[] description;
	private flickcurl_photo_s[][] photos;
	private int photos_count;
	private flickcurl_collection_s[][] collections;
	private int collections_count;
	private flickcurl_photoset_s[][] sets;
	private int sets_count;
	
	public flickcurl_collection_s(byte[] id, int child_count, int date_created, byte[] iconlarge, byte[] iconsmall, int server, byte[] secret, byte[] title, byte[] description, flickcurl_photo_s[][] photos, int photos_count, flickcurl_collection_s[][] collections, int collections_count, flickcurl_photoset_s[][] sets, int sets_count) {
		setId(id);
		setChild_count(child_count);
		setDate_created(date_created);
		setIconlarge(iconlarge);
		setIconsmall(iconsmall);
		setServer(server);
		setSecret(secret);
		setTitle(title);
		setDescription(description);
		setPhotos(photos);
		setPhotos_count(photos_count);
		setCollections(collections);
		setCollections_count(collections_count);
		setSets(sets);
		setSets_count(sets_count);
	}
	public flickcurl_collection_s() {
	}
	
	public void command_print_collection(flickcurl_collection_s[] collection) {
		byte[] generatedId = collection.getId();
		byte[] generatedSecret = collection.getSecret();
		int generatedServer = collection.getServer();
		byte[] generatedTitle = collection.getTitle();
		byte[] generatedDescription = collection.getDescription();
		byte[] generatedIconlarge = collection.getIconlarge();
		byte[] generatedIconsmall = collection.getIconsmall();
		.fprintf((_iob[1]), "Collection id %s  secret %s  server %d\n  Title %s\n  Description %s\n  Large icon %s\n  Small Icon %s\n", generatedId, generatedSecret, generatedServer, generatedTitle, (generatedDescription ? generatedDescription : "(None)"), generatedIconlarge, generatedIconsmall);
		flickcurl_photo_s[][] generatedPhotos = collection.getPhotos();
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		if (generatedPhotos) {
			int i;
			for (i = 0; generatedPhotos[i]; i++) {
				.fprintf((_iob[1]), "  icon photo %d) ", i);
				flickcurl_photo_s.command_print_photo(generatedPhotos[i]);
			}
		} 
		flickcurl_collection_s[][] generatedCollections = collection.getCollections();
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		if (generatedCollections) {
			int i;
			for (i = 0; generatedCollections[i]; i++) {
				.fprintf((_iob[1]), "  Sub-Collection %d)", i);
				flickcurl_collection_s.command_print_collection(generatedCollections[i]);
			}
		} 
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * collection.c - Flickcurl collection functions
	 *
	 * Copyright (C) 2009-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_collection:
	 * @collection: collection
	 *
	 * Destructor collection
	 */
	public void flickcurl_free_collection(flickcurl_collection_s[] collection) {
		do {
			if (!collection) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_collection is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\collection.c", 46, __func__);
				return ;
			} 
		} while (0);
		flickcurl_collection_s[][] generatedCollections = collection.getCollections();
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		if (generatedCollections) {
			int i;
			for (i = 0; generatedCollections[i]; i++) {
				flickcurl_collection_s.flickcurl_free_collection(generatedCollections[i]);
			}
		} 
		flickcurl_photo_s[][] generatedPhotos = collection.getPhotos();
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		if (generatedPhotos) {
			flickcurl_photo_s.flickcurl_free_photos(generatedPhotos);
		} 
		byte[] generatedDescription = collection.getDescription();
		if (generatedDescription) {
			.free(generatedDescription);
		} 
		byte[] generatedTitle = collection.getTitle();
		if (generatedTitle) {
			.free(generatedTitle);
		} 
		byte[] generatedSecret = collection.getSecret();
		if (generatedSecret) {
			.free(generatedSecret);
		} 
		byte[] generatedIconsmall = collection.getIconsmall();
		if (generatedIconsmall) {
			.free(generatedIconsmall);
		} 
		byte[] generatedIconlarge = collection.getIconlarge();
		if (generatedIconlarge) {
			.free(generatedIconlarge);
		} 
		byte[] generatedId = collection.getId();
		if (generatedId) {
			.free(generatedId);
		} 
		.free(collection);
	}
	public flickcurl_collection_s[][] flickcurl_build_collections(flickcurl_s[] fc, Object xpathCtx, Object[] xpathExpr, Integer collection_count_p) {
		flickcurl_collection[][] collections = ((Object)0);
		int nodes_count;
		int collection_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		[] full_xpath = new ();
		size_t xpathExpr_len = new size_t();
		int i;
		xpathExpr_len = .strlen((byte)xpathExpr);
		.memcpy(full_xpath, xpathExpr, xpathExpr_len + 1);
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (!xpathObj) {
			flickcurl_s.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		collections = (flickcurl_collection).calloc(, nodes_count + 1);
		int generatedPhotos_count = collection.getPhotos_count();
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		flickcurl_s flickcurl_s = new flickcurl_s();
		int generatedFailed = fc.getFailed();
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			flickcurl_collection[] collection = new flickcurl_collection();
			int expri;
			 xpathNodeCtx = ((Object)0);
			if (node.getType() != XML_ELEMENT_NODE) {
				flickcurl_s.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			collection = (flickcurl_collection).calloc(, 1);
			xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
			xpathNodeCtx.setNode(node);
			for (expri = 0; collection_fields_table[expri].getXpath(); expri++) {
				flickcurl_collection_field_type field = collection_fields_table[expri].getField();
				flickcurl_field_value_type datatype = collection_fields_table[expri].getType();
				[] field_xpath = collection_fields_table[expri].getXpath();
				byte[] string_value;
				int int_value = -1;
				time_t unix_time = new time_t();
				if (datatype == .VALUE_TYPE_ICON_PHOTOS) {
					collection.setPhotos(flickcurl_photo_s.flickcurl_build_photos(fc, xpathNodeCtx, field_xpath, generatedPhotos_count));
					continue;
				} 
				string_value = flickcurl_s.flickcurl_xpath_eval(fc, xpathNodeCtx, field_xpath);
				if (!string_value) {
					continue;
				} 
				switch (datatype) {
				case .VALUE_TYPE_TAG_STRING:
				case /* This case is handled above */.VALUE_TYPE_ICON_PHOTOS:
						.abort();
				case .VALUE_TYPE_PHOTO_ID:
				case .VALUE_TYPE_BOOLEAN:
						int_value = .atoi(string_value);
						break;
				case .VALUE_TYPE_STRING:
				case .VALUE_TYPE_PHOTO_URI:
				case .VALUE_TYPE_PERSON_ID:
						.abort();
				case .VALUE_TYPE_MEDIA_TYPE:
				case .VALUE_TYPE_COLLECTION_ID:
				case .VALUE_TYPE_FLOAT:
				case .VALUE_TYPE_NONE:
				case .VALUE_TYPE_URI:
						break;
				case .VALUE_TYPE_INTEGER:
				case .VALUE_TYPE_UNIXTIME:
				case .VALUE_TYPE_DATETIME:
						if (datatype == .VALUE_TYPE_UNIXTIME) {
							unix_time = .atoi(string_value);
						} else {
								unix_time = .curl_getdate((byte)string_value, ((Object)0));
						} 
						if (unix_time >= 0) {
							int_value = (int)unix_time;
						} else {
								int_value = -/* else failed to convert */1;
						} 
						break;
				}
				switch (field) {
				case .COLLECTION_FIELD_child_count:
						collection.setChild_count(int_value);
						break;
				case .COLLECTION_FIELD_description:
						collection.setDescription(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_secret:
						collection.setSecret(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_title:
						collection.setTitle(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_iconlarge:
						collection.setIconlarge(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_id:
						collection.setId(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_server:
						collection.setServer(int_value);
						break;
				case .COLLECTION_FIELD_iconphotos:
						.fprintf((_iob[2]), "Do not know how to handle iconphotos field yet\n");
						break;
				case .COLLECTION_FIELD_date_created:
						collection.setDate_created(int_value);
						break;
				case .COLLECTION_FIELD_iconsmall:
						collection.setIconsmall(string_value);
						string_value = ((Object)0);
						break;
				}
				if (string_value) {
					.free(string_value);
				} 
				if (generatedFailed) {
					if (collection) {
						flickcurl_collection_s.flickcurl_free_collection(collection);
					} 
					;
				} 
			}
			collections[collection_count++] = collection/* for collections */;
		}
		if (collection_count_p) {
			collection_count_p = collection_count;
		} 
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		if (generatedFailed) {
			if (collections) {
				flickcurl_collection_s.flickcurl_free_collections(collections);
			} 
			collections = ((Object)0);
		} 
		return collections;
	}
	public flickcurl_collection_s[] flickcurl_build_collection(flickcurl_s[] fc, Object xpathCtx, Object[] root_xpathExpr) {
		flickcurl_collection[][] collections = new flickcurl_collection();
		flickcurl_collection[] result = ((Object)0);
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		collections = flickcurl_collection_s.flickcurl_build_collections(fc, xpathCtx, root_xpathExpr, ((Object)0));
		if (collections) {
			result = collections[0];
			.free(collections);
		} 
		return result/**
		 * flickcurl_free_collections:
		 * @collections: collection object array
		 *
		 * Destructor for array of collection object
		 */;
	}
	public void flickcurl_free_collections(flickcurl_collection_s[][] collections) {
		int i;
		do {
			if (!collections) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_collection_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\collection.c", 393, __func__);
				return ;
			} 
		} while (0);
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		for (i = 0; collections[i]; i++) {
			flickcurl_collection_s.flickcurl_free_collection(collections[i]);
		}
		.free(collections);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * collections-api.c - Flickr flickr.collections.* API calls
	 *
	 * Copyright (C) 2009-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_collections_getInfo:
	 * @fc: flickcurl context
	 * @collection_id: The ID of the collection to fetch information for.
	 * 
	 * Returns information for a single collection.  Currently can only
	 * be called by the collection owner, this may change.
	 *
	 * Implements flickr.collections.getInfo (1.12)
	 * 
	 * Return value: a collection or NULL on failure
	 **/
	public flickcurl_collection_s[] flickcurl_collections_getInfo(flickcurl_s[] fc, Object[] collection_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_collection[] collection = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		if (!collection_id) {
			return ((Object)0);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_add_param(fc, "collection_id", collection_id);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.collections.getInfo")) {
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
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		collection = flickcurl_collection_s.flickcurl_build_collection(fc, xpathCtx, ()"/rsp/collection");
		int generatedFailed = fc.getFailed();
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		if (generatedFailed) {
			if (collection) {
				flickcurl_collection_s.flickcurl_free_collection(collection);
			} 
			collection = ((Object)0);
		} 
		return collection/**
		 * flickcurl_collections_getTree:
		 * @fc: flickcurl context
		 * @collection_id: The ID of the collection to fetch a tree for, or zero to fetch the root collection. Defaults to zero. (or NULL)
		 * @user_id: The ID of the account to fetch the collection tree for. Deafults to the calling user. (or NULL)
		 * 
		 * Returns a tree (or sub tree) of collections belonging to a given user.
		 *
		 * Implements flickr.collections.getTree (1.12)
		 * 
		 * Return value: a collection or NULL on failure
		 **/;
	}
	public flickcurl_collection_s[] flickcurl_collections_getTree(flickcurl_s[] fc, Object[] collection_id, Object[] user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_collection[] collection = ((Object)0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_init_params(fc, 0);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (collection_id) {
			flickcurl_s.flickcurl_add_param(fc, "collection_id", collection_id);
		} 
		if (user_id) {
			flickcurl_s.flickcurl_add_param(fc, "user_id", user_id);
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		flickcurl_s.flickcurl_end_params(fc);
		flickcurl_s flickcurl_s = new flickcurl_s();
		if (flickcurl_s.flickcurl_prepare(fc, "flickr.collections.getTree")) {
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
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		collection = flickcurl_collection_s.flickcurl_build_collection(fc, xpathCtx, ()"/rsp/collections/collection");
		int generatedFailed = fc.getFailed();
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		if (generatedFailed) {
			if (collection) {
				flickcurl_collection_s.flickcurl_free_collection(collection);
			} 
			collection = ((Object)0);
		} 
		return collection;
	}
	public byte[] getId() {
		return id;
	}
	public void setId(byte[] newId) {
		id = newId;
	}
	public int getChild_count() {
		return child_count;
	}
	public void setChild_count(int newChild_count) {
		child_count = newChild_count;
	}
	public int getDate_created() {
		return date_created;
	}
	public void setDate_created(int newDate_created) {
		date_created = newDate_created;
	}
	public byte[] getIconlarge() {
		return iconlarge;
	}
	public void setIconlarge(byte[] newIconlarge) {
		iconlarge = newIconlarge;
	}
	public byte[] getIconsmall() {
		return iconsmall;
	}
	public void setIconsmall(byte[] newIconsmall) {
		iconsmall = newIconsmall;
	}
	public int getServer() {
		return server;
	}
	public void setServer(int newServer) {
		server = newServer;
	}
	public byte[] getSecret() {
		return secret;
	}
	public void setSecret(byte[] newSecret) {
		secret = newSecret;
	}
	public byte[] getTitle() {
		return title;
	}
	public void setTitle(byte[] newTitle) {
		title = newTitle;
	}
	public byte[] getDescription() {
		return description;
	}
	public void setDescription(byte[] newDescription) {
		description = newDescription;
	}
	public flickcurl_photo_s[][] getPhotos() {
		return photos;
	}
	public void setPhotos(flickcurl_photo_s[][] newPhotos) {
		photos = newPhotos;
	}
	public int getPhotos_count() {
		return photos_count;
	}
	public void setPhotos_count(int newPhotos_count) {
		photos_count = newPhotos_count;
	}
	public flickcurl_collection_s[][] getCollections() {
		return collections;
	}
	public void setCollections(flickcurl_collection_s[][] newCollections) {
		collections = newCollections;
	}
	public int getCollections_count() {
		return collections_count;
	}
	public void setCollections_count(int newCollections_count) {
		collections_count = newCollections_count;
	}
	public flickcurl_photoset_s[][] getSets() {
		return sets;
	}
	public void setSets(flickcurl_photoset_s[][] newSets) {
		sets = newSets;
	}
	public int getSets_count() {
		return sets_count;
	}
	public void setSets_count(int newSets_count) {
		sets_count = newSets_count;
	}
}
/**
 * flickcurl_person_field_type:
 * @PERSON_FIELD_isadmin: is admin field boolean
 * @PERSON_FIELD_ispro:  is pro field boolean
 * @PERSON_FIELD_iconserver: icon server integer
 * @PERSON_FIELD_iconfarm: icon farm integer
 * @PERSON_FIELD_username: username
 * @PERSON_FIELD_realname: real name
 * @PERSON_FIELD_mbox_sha1sum: Email SHA1 sum
 * @PERSON_FIELD_location: location
 * @PERSON_FIELD_photosurl: photos URL
 * @PERSON_FIELD_profileurl: profile URL
 * @PERSON_FIELD_mobileurl: mobile URL
 * @PERSON_FIELD_photos_firstdate: photos first date
 * @PERSON_FIELD_photos_firstdatetaken: photos first date taken
 * @PERSON_FIELD_photos_count: photos count
 * @PERSON_FIELD_photos_views: photos views
 * @PERSON_FIELD_favedate: favorite date
 * @PERSON_FIELD_none: internal
 * @PERSON_FIELD_FIRST: internal offset to first in enum list
 * @PERSON_FIELD_LAST: internal offset to last in enum list
 *
 * Fields of a flickcurl_person*
 */
