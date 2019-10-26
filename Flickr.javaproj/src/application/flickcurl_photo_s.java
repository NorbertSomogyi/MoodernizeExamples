package application;

public class flickcurl_photo_s {
	private Byte id;
	private Byte uri;
	private flickcurl_tag_s tags;
	private int tags_count;
	private Object fields;
	private  place;
	private  video;
	private Byte media_type;
	private flickcurl_note_s notes;
	private int notes_count;
	
	public flickcurl_photo_s(Byte id, Byte uri, flickcurl_tag_s tags, int tags_count, Object fields,  place,  video, Byte media_type, flickcurl_note_s notes, int notes_count) {
		setId(id);
		setUri(uri);
		setTags(tags);
		setTags_count(tags_count);
		setFields(fields);
		setPlace(place);
		setVideo(video);
		setMedia_type(media_type);
		setNotes(notes);
		setNotes_count(notes_count);
	}
	public flickcurl_photo_s() {
	}
	
	public flickcurl_photo_s flickcurl_favorites_getList2(flickcurl_s fc, Object user_id, Object min_fave_date, Object max_fave_date, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_favorites_getList2_params(fc, user_id, min_fave_date, max_fave_date, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_favorites_getList_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch the favorites list for. If this argument is omitted, the favorites list for the calling user is returned. (or NULL)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 *
		 * Returns a list of the user's favorite photos.
		 *
		 * Deprecated for @flickcurl_favorites_getList2_params that takes extra
		 * parameters.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_favorites_getList(flickcurl_s fc, Object user_id, Object extras, int per_page, int page) {
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		return flickcurl_photo_s.flickcurl_favorites_getList2(fc, user_id, ((Object)/* min_fave_date */0), ((Object)/* max_fave_date */0), extras, per_page, page/**
		 * flickcurl_favorites_getPublicList_params:
		 * @fc: flickcurl context
		 * @user_id: The user to fetch the favorites list for.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of favorite public photos for the given user.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/);
	}
	public flickcurl_photo_s flickcurl_favorites_getPublicList(flickcurl_s fc, Object user_id, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_favorites_getPublicList_params(fc, user_id, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_favorites_remove:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to remove from the user's favorites.
		 * 
		 * Removes a photo from a user's favorites list.
		 *
		 * Implements flickr.favorites.remove (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_panda_getPhotos(flickcurl_s fc, Object panda_name) {
		flickcurl_photo photos = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!panda_name) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("panda_name", panda_name);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.panda.getPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		if (!photos_list) {
			fc.setFailed(1);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		if (photos_list) {
			photos = generatedPhotos;
			photos_list.setPhotos(((Object)0));
			/* photos array is now owned by this function */photos_list.flickcurl_free_photos_list();
		} 
		return photos;
	}
	public flickcurl_photo_s flickcurl_people_getPublicPhotos(flickcurl_s fc, Object user_id, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_people_getPublicPhotos_params(fc, user_id, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_people_getUploadStatus:
		 * @fc: flickcurl context
		 * 
		 * Returns information for the calling user related to photo uploads.
		 *
		 * Implements flickr.people.getUploadStatus (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_people_getPhotos(flickcurl_s fc, Object user_id, int safe_search, Object min_upload_date, Object max_upload_date, Object min_taken_date, Object max_taken_date, int content_type, int privacy_filter, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_people_getPhotos_params(fc, user_id, safe_search, min_upload_date, max_upload_date, min_taken_date, max_taken_date, content_type, privacy_filter, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_people_getPhotosOf_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photo to search. A value of "me" will search against the calling user's photos for authenticated calls.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of photos containing a particular Flickr member.
		 *
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 * 
		 * Return value: photos list or NULL on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_people_getPhotosOf(flickcurl_s fc, Object user_id, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_people_getPhotosOf_params(fc, user_id, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos;
	}
	public flickcurl_photo_s flickcurl_photos_getContactsPhotos(flickcurl_s fc, int contact_count, int just_friends, int single_photo, int include_self, Object extras) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(-1);
		list_params.setPage(-1);
		photos_list = ModernizedCProgram.flickcurl_photos_getContactsPhotos_params(fc, contact_count, just_friends, single_photo, include_self, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_getContactsPublicPhotos_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch photos for.
		 * @photo_count: Number of photos to return (Default 10, maximum 50)
		 * @just_friends: Set to non-0 to only show photos from friends and family (excluding regular contacts)
		 * @single_photo: Set to non-0 to only fetch one photo (the latest) per contact, instead of all photos in chronological order.
		 * @include_self: Set to non-0 to include photos from the user specified by user_id.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Fetch a list of recent public photos from a users' contacts.
		 *
		 * Currently supported extras fields are: license,
		 * date_upload, date_taken, owner_name, icon_server, original_format,
		 * last_update.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: a list of photos or NULL on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_photos_getContactsPublicPhotos(flickcurl_s fc, Object user_id, int photo_count, int just_friends, int single_photo, int include_self, Object extras) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(-1);
		list_params.setPage(-1);
		photos_list = ModernizedCProgram.flickcurl_photos_getContactsPublicPhotos_params(fc, user_id, photo_count, just_friends, single_photo, include_self, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_getContext:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * 
		 * Get next and previous photos for a photo in a photostream.
		 *
		 * Implements flickr.photos.getContext (0.7)
		 *
		 * Returns an array of size 3 [prev, next, NULL] flickcurl_context*
		 * or NULL on error
		 * 
		 * Return value: prev, next contexts or NULL
		 **/;
	}
	public flickcurl_photo_s flickcurl_photos_getInfo2(flickcurl_s fc, Object photo_id, Object secret) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photo photo = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("photo_id", photo_id);
		if (secret) {
			fc.flickcurl_add_param("secret", secret);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		photo = flickcurl_photo_s.flickcurl_build_photo(fc, xpathCtx);
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			if (photo) {
				photo.flickcurl_free_photo();
			} 
			photo = ((Object)0);
		} 
		return photo/**
		 * flickcurl_photos_getInfo:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * 
		 * Get information about a photo
		 *
		 * Deprecated for flickcurl_photos_getInfo2() that allows passing the
		 * optional secret.
		 * 
		 * Return value: #flickcurl_photo or NULL on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_photos_getInfo(flickcurl_s fc, Object photo_id) {
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		return flickcurl_photo_s.flickcurl_photos_getInfo2(fc, photo_id, ((Object)0));
	}
	public flickcurl_photo_s flickcurl_photos_getNotInSet(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_get_photoslist_params(fc, "flickr.photos.getNotInSet", min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_getPerms:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to get permissions for.
		 * 
		 * Get permissions for a photo.
		 *
		 * Implements flickr.photos.getPerms (0.11)
		 * 
		 * Return value: permissions or NULL on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_photos_getRecent(flickcurl_s fc, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_photos_getRecent_params(fc, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_getSizes:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to fetch size information for.
		 * 
		 * Returns the available sizes for a photo.  The calling user must have permission to view the photo.
		 *
		 * Implements flickr.photos.getSizes (0.13)
		 * 
		 * Return value: non-0 on failure
		 */;
	}
	public flickcurl_photo_s flickcurl_photos_getUntagged(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_get_photoslist_params(fc, "flickr.photos.getUntagged", min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_getWithGeoData_params:
		 * @fc: flickcurl context
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @privacy_filter: Return photos only matching a certain privacy level. Valid values are:
		1 public photos;
		2 private photos visible to friends;
		3 private photos visible to family;
		4 private photos visible to friends and family;
		5 completely private photos. (or NULL)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of your geo-tagged photos.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_photos_getWithGeoData(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_photos_getWithGeoData_params(fc, min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_getWithoutGeoData_params:
		 * @fc: flickcurl context
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @privacy_filter: Return photos only matching a certain privacy level. Valid values are:
		1 public photos;
		2 private photos visible to friends;
		3 private photos visible to family;
		4 private photos visible to friends and family;
		5 completely private photos.
		 (or NULL)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of your photos which haven't been geo-tagged.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_photos_getWithoutGeoData(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_photos_getWithoutGeoData_params(fc, min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_recentlyUpdated_params:
		 * @fc: flickcurl context
		 * @min_date: A Unix timestamp indicating the date from which modifications should be compared.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Return a list of your photos that have been recently created or which have been recently modified
		 * 
		 * Recently modified may mean that the photo's metadata (title,
		 * description, tags) may have been changed or a comment has been
		 * added (or just modified somehow :-)
		 *
		 * Currently supported extra fields are: license, date_upload, date_taken,
		 * owner_name, icon_server, original_format, last_update, geo, tags,
		 * machine_tags.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_photos_recentlyUpdated(flickcurl_s fc, int min_date, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_photos_recentlyUpdated_params(fc, min_date, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_removeTag:
		 * @fc: flickcurl context
		 * @tag_id: tag ID to remove from the photo
		 *
		 * Remove a tag from a photo.
		 *
		 * The @tag_id is returned such as from flickcurl_photos_getInfo()
		 *
		 * Implements flickr.photos.removeTag (0.9)
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public flickcurl_photo_s flickcurl_photos_search(flickcurl_s fc,  params) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		Object generatedExtras = params.getExtras();
		list_params.setExtras(generatedExtras);
		Object generatedPer_page = params.getPer_page();
		list_params.setPer_page(generatedPer_page);
		Object generatedPage = params.getPage();
		list_params.setPage(generatedPage);
		photos_list = ModernizedCProgram.flickcurl_photos_search_params(fc, params, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_setContentType:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set the adultness of.
		 * @content_type: The content type of the photo: 1 for Photo, 2 for Screenshot, and 3 for Other.
		 * 
		 * Set the content type of a photo.
		 *
		 * Implements flickr.photos.setContentType (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public void flickcurl_free_photo() {
		int i;
		do {
			if (!photo) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photo is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photo.c", 130, __func__);
				return ;
			} 
		} while (0);
		Object generatedFields = this.getFields();
		for (i = 0; i <= .PHOTO_FIELD_LAST; i++) {
			if (generatedFields[i].getString()) {
				.free(generatedFields[i].getString());
			} 
		}
		flickcurl_tag_s generatedTags = this.getTags();
		generatedTags.flickcurl_free_tags();
		int generatedNotes_count = this.getNotes_count();
		flickcurl_note_s generatedNotes = this.getNotes();
		for (i = 0; i < generatedNotes_count; i++) {
			generatedNotes[i].flickcurl_free_note();
		}
		.free(generatedNotes);
		Byte generatedId = this.getId();
		if (generatedId) {
			.free(generatedId);
		} 
		Byte generatedUri = this.getUri();
		if (generatedUri) {
			.free(generatedUri);
		} 
		Byte generatedMedia_type = this.getMedia_type();
		if (generatedMedia_type) {
			.free(generatedMedia_type);
		} 
		 generatedPlace = this.getPlace();
		if (generatedPlace) {
			generatedPlace.flickcurl_free_place();
		} 
		 generatedVideo = this.getVideo();
		if (generatedVideo) {
			generatedVideo.flickcurl_free_video();
		} 
		.free(photo/**
		 * flickcurl_photo_as_source_uri:
		 * @photo: photo object
		 * @c: size s, m, t or b
		 *
		 * Get a photo's image source URIs
		 *
		 * @c can be s,m,t,b for sizes, o for original, otherwise default
		 * https://www.flickr.com/services/api/misc.urls.html
		 *
		 * Return value: new source URI string or NULL on failure
		 */);
	}
	public Byte flickcurl_photo_as_source_uri(Object c) {
		byte[] buf = new byte[512];
		byte result;
		size_t len = new size_t();
		Object generatedFields = this.getFields();
		Byte generatedId = this.getId();
		if (c == (byte)'o') {
			.sprintf(buf, /* https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{o-secret}_o.(jpg|gif|png) */"https://farm%s.staticflickr.com/%s/%s_%s_o.%s", generatedFields[.PHOTO_FIELD_farm].getString(), generatedFields[.PHOTO_FIELD_server].getString(), generatedId, generatedFields[.PHOTO_FIELD_originalsecret].getString(), generatedFields[.PHOTO_FIELD_originalformat].getString());
		}  else if (c == (byte)'m' || c == (byte)'s' || c == (byte)'t' || c == (byte)'b') {
			.sprintf(buf, /* https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}_[mstb].jpg */"https://farm%s.staticflickr.com/%s/%s_%s_%c.jpg", generatedFields[.PHOTO_FIELD_farm].getString(), generatedFields[.PHOTO_FIELD_server].getString(), generatedId, generatedFields[.PHOTO_FIELD_secret].getString(), c);
		} else {
				.sprintf(buf, /* https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}.jpg */"https://farm%s.staticflickr.com/%s/%s_%s.jpg", generatedFields[.PHOTO_FIELD_farm].getString(), generatedFields[.PHOTO_FIELD_server].getString(), generatedId, generatedFields[.PHOTO_FIELD_secret].getString());
		} 
		len = .strlen(buf);
		result = (byte).malloc(len + 1);
		.memcpy(result, buf, len + 1);
		return result/**
		 * flickcurl_photo_as_page_uri:
		 * @photo: photo object
		 *
		 * Get a photo's page URI
		 *
		 * Return value: new source URI string or NULL on failure
		 */;
	}
	public Byte flickcurl_photo_as_page_uri() {
		byte[] buf = new byte[512];
		byte result;
		size_t len = new size_t();
		Object generatedFields = this.getFields();
		Byte generatedId = this.getId();
		.sprintf(buf, /* https://www.flickr.com/photos/{owner}/{photo id}/ */"https://www.flickr.com/photos/%s/%s", generatedFields[.PHOTO_FIELD_owner_nsid].getString(), generatedId);
		len = .strlen(buf);
		result = (byte).malloc(len + 1);
		.memcpy(result, buf, len + 1);
		return result;
	}
	public Byte flickcurl_photo_as_short_uri() {
		Byte generatedId = this.getId();
		return ModernizedCProgram.flickcurl_photo_id_as_short_uri(generatedId);
	}
	public Byte flickcurl_photo_as_user_icon_uri() {
		Object generatedFields = this.getFields();
		return ModernizedCProgram.flickcurl_user_icon_uri(generatedFields[.PHOTO_FIELD_owner_iconfarm].getInteger(), generatedFields[.PHOTO_FIELD_owner_iconserver].getInteger(), generatedFields[.PHOTO_FIELD_owner_nsid].getString());
	}
	public flickcurl_photo_s flickcurl_build_photos(flickcurl_s fc, Object xpathCtx, Object xpathExpr, int photo_count_p) {
		flickcurl_photo photos = ((Object)0);
		int nodes_count;
		int photo_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		[] full_xpath = new ();
		size_t xpathExpr_len = new size_t();
		int i;
		xpathExpr_len = .strlen((byte)xpathExpr);
		.memcpy(full_xpath, xpathExpr, xpathExpr_len + 1);
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		photos = (flickcurl_photo).calloc(, nodes_count + 1);
		Object generatedFields = photo.getFields();
		int generatedTags_count = photo.getTags_count();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		int generatedFailed = fc.getFailed();
		flickcurl_tag_s generatedTags = photo.getTags();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		 generatedPlace = photo.getPlace();
		int generatedNotes_count = photo.getNotes_count();
		flickcurl_note_s flickcurl_note_s = new flickcurl_note_s();
		Byte generatedMedia_type = photo.getMedia_type();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			flickcurl_photo photo = new flickcurl_photo();
			int expri;
			 xpathNodeCtx = ((Object)0);
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			photo = (flickcurl_photo).calloc(, 1);
			xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
			xpathNodeCtx.setNode(node);
			for (expri = 0; expri <= .PHOTO_FIELD_LAST; expri++) {
				if (generatedFields[expri].getString()) {
					.free(generatedFields[expri].getString());
				} 
				generatedFields[expri].setString(((Object)0));
				generatedFields[expri].setInteger((flickcurl_photo_field_type)-1);
				generatedFields[expri].setType(.VALUE_TYPE_NONE);
			}
			for (expri = 0; photo_fields_table[expri].getXpath(); expri++) {
				byte string_value;
				flickcurl_field_value_type datatype = photo_fields_table[expri].getType();
				int int_value = -1;
				flickcurl_photo_field_type field = photo_fields_table[expri].getField();
				time_t unix_time = new time_t();
				int special = 0;
				string_value = fc.flickcurl_xpath_eval(xpathNodeCtx, photo_fields_table[expri].getXpath());
				if (!string_value) {
					continue;
				} 
				switch (datatype) {
				case .VALUE_TYPE_COLLECTION_ID:
				case .VALUE_TYPE_URI:
						break;
				case .VALUE_TYPE_STRING:
				case .VALUE_TYPE_PERSON_ID:
				case .VALUE_TYPE_BOOLEAN:
						if (!string_value && datatype == .VALUE_TYPE_BOOLEAN) {
							.free(/* skip setting field with a boolean value '' */string_value);
							special = 1;
							break;
						} 
						int_value = .atoi(string_value);
						break;
				case .VALUE_TYPE_TAG_STRING:
						photo.setTags(flickcurl_tag_s.flickcurl_build_tags_from_string(fc, /* A space-separated list of tags */photo, (byte)string_value, generatedTags_count));
						.free(string_value);
						special = 1;
						break;
				case .VALUE_TYPE_NONE:
				case .VALUE_TYPE_FLOAT:
				case .VALUE_TYPE_PHOTO_URI:
						photo.setUri(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_INTEGER:
				case .VALUE_TYPE_UNIXTIME:
				case .VALUE_TYPE_MEDIA_TYPE:
						photo.setMedia_type(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_ICON_PHOTOS:
						.abort();
				case .VALUE_TYPE_PHOTO_ID:
						photo.setId(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_DATETIME:
						if (datatype == .VALUE_TYPE_UNIXTIME) {
							unix_time = .atoi(string_value);
						} else {
								unix_time = .curl_getdate((byte)string_value, ((Object)0));
						} 
						if (unix_time >= 0) {
							byte new_value = ModernizedCProgram.flickcurl_unixtime_to_isotime(unix_time);
							.free(string_value);
							string_value = new_value;
							int_value = (int)unix_time;
							datatype = .VALUE_TYPE_DATETIME;
						} else {
								datatype = /* failed to convert, make it a string */.VALUE_TYPE_STRING;
						} 
						break;
				}
				if (/* If special, do not store here */special) {
					continue;
				} 
				generatedFields[field].setString(string_value);
				generatedFields[field].setInteger((flickcurl_photo_field_type)int_value);
				generatedFields[field].setType(datatype);
				if (generatedFailed) {
					;
				} 
			}
			if (!generatedTags) {
				photo.setTags(flickcurl_tag_s.flickcurl_build_tags(fc, photo, xpathNodeCtx, ()"./tags/tag", generatedTags_count));
			} 
			if (!generatedPlace) {
				photo.setPlace(fc.flickcurl_build_place(xpathNodeCtx, ()"./location"));
			} 
			photo.setVideo(fc.flickcurl_build_video(xpathNodeCtx, ()"./video"));
			photo.setNotes(flickcurl_note_s.flickcurl_build_notes(fc, photo, xpathNodeCtx, ()"./notes/note", generatedNotes_count));
			if (!generatedMedia_type) {
				photo.setMedia_type((byte).malloc(5 + 1));
				.memcpy(generatedMedia_type, "photo", 5 + 1);
			} 
			.xmlXPathFreeContext(xpathNodeCtx);
			photos[photo_count++] = photo/* for photos */;
		}
		if (photo_count_p) {
			photo_count_p = photo_count;
		} 
		if (generatedFailed) {
			if (photos) {
				photos.flickcurl_free_photos();
			} 
			photos = ((Object)0);
		} 
		return photos;
	}
	public flickcurl_photo_s flickcurl_build_photo(flickcurl_s fc, Object xpathCtx) {
		flickcurl_photo photos = new flickcurl_photo();
		flickcurl_photo result = ((Object)0);
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		photos = flickcurl_photo_s.flickcurl_build_photos(fc, xpathCtx, ()"/rsp/photo", ((Object)0));
		if (photos) {
			result = photos[0];
			.free(photos);
		} 
		return result/**
		 * flickcurl_free_photos:
		 * @photos: photo object array
		 *
		 * Destructor for array of photo objects
		 */;
	}
	public void flickcurl_free_photos() {
		int i;
		do {
			if (!photos) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photo_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photo.c", 1204, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; photos[i]; i++) {
			photos[i].flickcurl_free_photo();
		}
		.free(photos/*
		 * flickcurl_invoke_photos_list:
		 * @fc: Flickcurl context
		 * @xpathExpr: Xpath to the list of photos e.g. '/rsp/photos' or '/rsp/gallery'.  The /photos suffix is added internally.
		 * @format: result format wanted
		 *
		 * INTERNAL - Build photos list from XML or get format content result from web service response document
		 *
		 * Return value: new photos list or NULL on failure
		 */);
	}
	public void command_print_photo() {
		int i;
		Byte generatedMedia_type = this.getMedia_type();
		Byte generatedUri = this.getUri();
		Byte generatedId = this.getId();
		int generatedTags_count = this.getTags_count();
		.fprintf((_iob[1]), "%s with URI %s ID %s and %d tags\n", generatedMedia_type, (generatedUri ? generatedUri : "(Unknown)"), generatedId, generatedTags_count);
		Object generatedFields = this.getFields();
		for (i = 0; i <= .PHOTO_FIELD_LAST; i++) {
			flickcurl_photo_field_type field = (flickcurl_photo_field_type)i;
			flickcurl_field_value_type datatype = generatedFields[field].getType();
			if (datatype == .VALUE_TYPE_NONE) {
				continue;
			} 
			.fprintf((_iob[1]), "    field %s (%d) with %s value: '%s' / %d\n", ModernizedCProgram.flickcurl_get_photo_field_label(field), field, ModernizedCProgram.flickcurl_get_field_value_type_label(datatype), generatedFields[field].getString(), generatedFields[field].getInteger());
		}
		flickcurl_tag_s generatedTags = this.getTags();
		generatedTags.command_print_tags(((Object)0), ((Object)0));
		flickcurl_note_s generatedNotes = this.getNotes();
		if (generatedNotes) {
			generatedNotes.command_print_notes(((Object)0), ((Object)0));
		} 
		 generatedPlace = this.getPlace();
		if (generatedPlace) {
			generatedPlace.command_print_place(((Object)0), ((Object)0), 1);
		} 
		 generatedVideo = this.getVideo();
		if (generatedVideo) {
			generatedVideo.command_print_video();
		} 
	}
	public flickcurl_photo_s flickcurl_galleries_getPhotos(flickcurl_s fc, Object gallery_id, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_galleries_getPhotos_params(fc, gallery_id, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos;
	}
	public flickcurl_photo_s flickcurl_photosets_getPhotos(flickcurl_s fc, Object photoset_id, Object extras, int privacy_filter, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_photosets_getPhotos_params(fc, photoset_id, privacy_filter, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photosets_orderSets:
		 * @fc: flickcurl context
		 * @photoset_ids_array: Array of photoset IDs, ordered with the set to show first, first in the list. Any set IDs not given in the list will be set to appear at the end of the list, ordered by their IDs.
		 * 
		 * Set the order of photosets for the calling user.
		 *
		 * Implements flickr.photosets.orderSets (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_groups_pools_getPhotos(flickcurl_s fc, Object group_id, Object tags, Object user_id, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_groups_pools_getPhotos_params(fc, group_id, tags, user_id, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_groups_pools_remove:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to remove from the group pool.
		 * @group_id: The NSID of the group who's pool the photo is to removed from.
		 * 
		 * Remove a photo from a group pool.
		 *
		 * Implements flickr.groups.pools.remove (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_interestingness_getList(flickcurl_s fc, Object date, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_interestingness_getList_params(fc, date, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos;
	}
	public flickcurl_photo_s flickcurl_photos_geo_photosForLocation(flickcurl_s fc,  location, Object extras, int per_page, int page) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		photos_list = ModernizedCProgram.flickcurl_photos_geo_photosForLocation_params(fc, location, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedPhotos = photos_list.getPhotos();
		photos = generatedPhotos;
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		photos_list.flickcurl_free_photos_list();
		return photos/**
		 * flickcurl_photos_geo_removeLocation:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo you want to remove location data from.
		 * 
		 * Removes the geo data associated with a photo.
		 *
		 * Implements flickr.photos.geo.removeLocation (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public flickcurl_photo_s flickcurl_stats_getPopularPhotos(flickcurl_s fc, Object date, Object sort, int per_page, int page, Object extras) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		byte format = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photo photos = ((Object)0);
		fc.flickcurl_init_params(0);
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		if (date) {
			fc.flickcurl_add_param("date", date);
		} 
		if (sort) {
			fc.flickcurl_add_param("sort", sort);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPopularPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		Object generatedPhotos = photos_list.getPhotos();
		if (photos_list) {
			photos = generatedPhotos;
			photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
			photos_list.flickcurl_free_photos_list();
		} 
		return photos/**
		 * flickcurl_stats_getTotalViews:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.  If no date is provided, all time view counts will be
		 * returned. (or NULL)
		 * 
		 * Get the overall view counts for an account
		 *
		 * Implements flickr.stats.getTotalViews (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: view count or <0 on failure
		 **/;
	}
	public Byte getId() {
		return id;
	}
	public void setId(Byte newId) {
		id = newId;
	}
	public Byte getUri() {
		return uri;
	}
	public void setUri(Byte newUri) {
		uri = newUri;
	}
	public flickcurl_tag_s getTags() {
		return tags;
	}
	public void setTags(flickcurl_tag_s newTags) {
		tags = newTags;
	}
	public int getTags_count() {
		return tags_count;
	}
	public void setTags_count(int newTags_count) {
		tags_count = newTags_count;
	}
	public Object getFields() {
		return fields;
	}
	public void setFields(Object newFields) {
		fields = newFields;
	}
	public  getPlace() {
		return place;
	}
	public void setPlace( newPlace) {
		place = newPlace;
	}
	public  getVideo() {
		return video;
	}
	public void setVideo( newVideo) {
		video = newVideo;
	}
	public Byte getMedia_type() {
		return media_type;
	}
	public void setMedia_type(Byte newMedia_type) {
		media_type = newMedia_type;
	}
	public flickcurl_note_s getNotes() {
		return notes;
	}
	public void setNotes(flickcurl_note_s newNotes) {
		notes = newNotes;
	}
	public int getNotes_count() {
		return notes_count;
	}
	public void setNotes_count(int newNotes_count) {
		notes_count = newNotes_count;
	}
}
