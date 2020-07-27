package application;

public class ModernizedCProgram {
	public static Object SHA1Transform;
	public static Object SHA1Init;
	public static Object SHA1Update;
	public static Object SHA1Final;
	public static byte config_filename = /* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickcurl command line utility functions
	 *
	 * Copyright (C) 2014, David Beckett http://www.dajobe.org/
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
	 *//* private to this module */".flickcurl.conf";
	public static byte flickcurl_cmdline_config_section = /* external */"flickr";
	public static byte flickcurl_cmdline_config_path = ((Object)0);
	public static byte my_vsnprintf;
	public static int flickcurl_oauth_build_key;
	public static byte program;
	public static byte title_format_string = /* name, has_arg, flag, val */"Skeleton code generator utility %s\n";
	public static byte[] flickcurl_photo_field_label = new byte[]{"(none)", "dateuploaded", "farm", "isfavorite", "license", "originalformat", "rotation", "server", "dates_lastupdate", "dates_posted", "dates_taken", "dates_takengranularity", "description", "editability_canaddmeta", "editability_cancomment", "geoperms_iscontact", "geoperms_isfamily", "geoperms_isfriend", "geoperms_ispublic", "location_accuracy", "location_latitude", "location_longitude", "owner_location", "owner_nsid", "owner_realname", "owner_username", "title", "visibility_isfamily", "visibility_isfriend", "visibility_ispublic", "secret", "originalsecret", "location_neighbourhood", "location_locality", "location_county", "location_region", "location_country", "location_placeid", "neighbourhood_placeid", "locality_placeid", "county_placeid", "region_placeid", "country_placeid", "location_woeid", "neighbourhood_woeid", "locality_woeid", "county_woeid", "region_woeid", "country_woeid", "usage_candownload", "usage_canblog", "usage_canprint", "owner_iconserver", "owner_iconfarm", "original_width", "original_height", "views", "comments", "favorites", "gallery_comment"/**
	 * flickcurl_get_photo_field_label:
	 * @field: field enum
	 *
	 * Get label for photo field.
	 *
	 * Return value: label string or NULL if none valid
	 */};
	public static byte[] short_uri_alphabet = "123456789abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ";
	public static byte[] short_uri_prefix = "http://flic.kr/p/"/**
	 * flickcurl_photo_id_as_short_uri:
	 * @photo_id: photo ID
	 *
	 * Get a short URI for a photo ID
	 *
	 * Encoded based on description given in
	 * http://www.flickr.com/groups/api/discuss/72157616713786392/
	 *
	 * Return value: new short URI string or NULL on failure
	 */;
	public static byte[] source_uri_match1 = "http://farm";
	public static byte[] source_uri_match2 = ".static.flickr.com/";
	public static byte[] source_uri_match3 = ".staticflickr.com/"/**
	 * flickcurl_source_uri_as_photo_id:
	 * @uri: source uri
	 *
	 * Get a photo ID from an image source URI
	 *
	 * Turns an URL that points to the photo into a photo ID.
	 * i.e. given an URI like these:
	 * <code>https://farm{farm-id}.static.flickr.com/{server-id}/{photo-id}_{o-secret}_o.(jpg|gif|png)</code> or
	 * <code>https://farm{farm-id}.static.flickr.com/{server-id}/{photo-id}_{secret}_[mstb].jpg</code>
	 * <code>https://farm{farm-id}.static.flickr.com/{server-id}/{photo-id}_{secret}.jpg</code>
	 * (or the same with staticflickr.com)
	 * returns the {photo-id}
	 *
	 * Return value: new photo ID string or NULL on failure
	 */;
	public static byte[] flickcurl_context_type_element = new byte[]{"---", "set", "pool", "prevphoto", "nextphoto", ((Object)0/**
	 * flickcurl_get_context_type_field_label:
	 * @type: context type
	 *
	 * Get label for context type
	 *
	 * Return value: label string or NULL if none valid
	 */)};
	public static flickcurl_s flickcurl = new flickcurl_s();
	public static flickcurl_category_s flickcurl_category = new flickcurl_category_s();
	public static flickcurl_collection_s flickcurl_collection = new flickcurl_collection_s();
	public static flickcurl_serializer_s flickcurl_serializer = new flickcurl_serializer_s();
	public static flickcurl_serializer flickcurl_new_serializer = new flickcurl_serializer();
	public static Object flickcurl_free_serializer;
	public static int flickcurl_serialize_photo;
	public static Object flickcurl_message_handler;
	public static Object flickcurl_tag_handler;
	public static Object flickcurl_curl_setopt_handler;
	public static byte flickcurl_short_copyright_string;
	public static byte flickcurl_copyright_string;
	public static byte flickcurl_license_string;
	public static byte flickcurl_home_url_string;
	public static byte flickcurl_version_string;
	public static byte flickcurl_flickr_service_uri;
	public static byte flickcurl_flickr_upload_service_uri;
	public static byte flickcurl_flickr_replace_service_uri;
	public static byte flickcurl_flickr_oauth_request_token_uri;
	public static byte flickcurl_flickr_oauth_authorize_uri;
	public static byte flickcurl_flickr_oauth_access_token_uri;
	public static int flickcurl_init;
	public static Object flickcurl_finish;
	public static flickcurl flickcurl_new = new flickcurl();
	public static flickcurl flickcurl_new_with_handle = new flickcurl();
	public static Object flickcurl_free;
	public static Object flickcurl_set_curl_setopt_handler;
	public static Object flickcurl_set_service_uri;
	public static Object flickcurl_set_upload_service_uri;
	public static Object flickcurl_set_replace_service_uri;
	public static Object flickcurl_set_api_key;
	public static Object flickcurl_set_auth_token;
	public static Object flickcurl_set_data;
	public static Object flickcurl_set_error_handler;
	public static Object flickcurl_set_http_accept;
	public static Object flickcurl_set_proxy;
	public static Object flickcurl_set_request_delay;
	public static Object flickcurl_set_shared_secret;
	public static Object flickcurl_set_sign;
	public static Object flickcurl_set_tag_handler;
	public static Object flickcurl_set_user_agent;
	public static Object flickcurl_set_write;
	public static Object flickcurl_set_xml_data;
	public static int flickcurl_get_current_request_wait;
	public static byte flickcurl_get_api_key;
	public static byte flickcurl_get_shared_secret;
	public static byte flickcurl_get_auth_token;
	public static Object flickcurl_free_collection;
	public static Object flickcurl_free_collections;
	public static Object flickcurl_free_gallery;
	public static Object flickcurl_free_tag_namespace;
	public static Object flickcurl_free_tag_namespaces;
	public static Object flickcurl_free_tag;
	public static Object flickcurl_free_tags;
	public static Object flickcurl_free_tag_clusters;
	public static Object flickcurl_free_photo;
	public static Object flickcurl_free_photos;
	public static Object flickcurl_free_photos_list;
	public static Object flickcurl_free_photoset;
	public static Object flickcurl_free_photosets;
	public static Object flickcurl_free_person;
	public static Object flickcurl_free_persons;
	public static Object flickcurl_free_context;
	public static Object flickcurl_free_contexts;
	public static Object flickcurl_free_institution;
	public static Object flickcurl_free_institutions;
	public static Object flickcurl_free_perms;
	public static Object flickcurl_free_location;
	public static Object flickcurl_free_exif;
	public static Object flickcurl_free_exifs;
	public static Object flickcurl_free_ticket;
	public static Object flickcurl_free_tickets;
	public static Object flickcurl_free_user_upload_status;
	public static Object flickcurl_free_place;
	public static Object flickcurl_free_places;
	public static Object flickcurl_free_place_type_infos;
	public static Object flickcurl_free_shape;
	public static Object flickcurl_free_shapes;
	public static Object flickcurl_free_video;
	public static Object flickcurl_free_tag_predicate_value;
	public static Object flickcurl_free_tag_predicate_values;
	public static byte flickcurl_photo_as_source_uri;
	public static byte flickcurl_source_uri_as_photo_id;
	public static byte flickcurl_photo_as_page_uri;
	public static byte flickcurl_user_icon_uri;
	public static byte flickcurl_photo_as_user_icon_uri;
	public static byte flickcurl_photo_id_as_short_uri;
	public static byte flickcurl_photo_as_short_uri;
	public static byte flickcurl_get_photo_field_label;
	public static byte flickcurl_get_person_field_label;
	public static byte flickcurl_get_field_value_type_label;
	public static byte flickcurl_get_context_type_field_label;
	public static byte flickcurl_get_content_type_label;
	public static int flickcurl_get_content_type_from_string;
	public static byte flickcurl_get_safety_level_label;
	public static int flickcurl_get_safety_level_from_string;
	public static byte flickcurl_get_hidden_label;
	public static int flickcurl_get_hidden_from_string;
	public static int flickcurl_get_feed_format_info;
	public static int flickcurl_get_extras_format_info;
	public static int flickcurl_photos_list_params_init;
	public static int flickcurl_search_params_init;
	public static Object set_config_var_handler;
	public static int read_ini_config;
	public static int flickcurl_config_read_ini;
	public static Object flickcurl_config_var_handler;
	public static int flickcurl_config_write_ini;
	public static flickcurl_activity flickcurl_activity_userComments = new flickcurl_activity();
	public static flickcurl_activity flickcurl_activity_userPhotos = new flickcurl_activity();
	public static Object flickcurl_free_activities;
	public static byte flickcurl_auth_checkToken;
	public static byte flickcurl_auth_getFrob;
	public static byte flickcurl_auth_getFullToken;
	public static byte flickcurl_auth_getToken;
	public static int flickcurl_auth_oauth_getAccessToken;
	public static byte flickcurl_get_oauth_token;
	public static Object flickcurl_set_oauth_token;
	public static byte flickcurl_get_oauth_token_secret;
	public static Object flickcurl_set_oauth_token_secret;
	public static byte flickcurl_get_oauth_client_key;
	public static byte flickcurl_get_oauth_client_secret;
	public static Object flickcurl_set_oauth_client_key;
	public static Object flickcurl_set_oauth_client_secret;
	public static byte flickcurl_get_oauth_request_token;
	public static byte flickcurl_get_oauth_request_token_secret;
	public static Object flickcurl_set_oauth_request_token;
	public static Object flickcurl_set_oauth_request_token_secret;
	public static byte flickcurl_get_oauth_username;
	public static byte flickcurl_get_oauth_user_nsid;
	public static int flickcurl_oauth_create_request_token;
	public static byte flickcurl_oauth_get_authorize_uri;
	public static int flickcurl_oauth_create_access_token;
	public static flickcurl_blog flickcurl_blogs_getList = new flickcurl_blog();
	public static int flickcurl_blogs_postPhoto;
	public static Object flickcurl_free_blogs;
	public static flickcurl_blog_service flickcurl_blogs_getServices = new flickcurl_blog_service();
	public static Object flickcurl_free_blog_services;
	public static flickcurl_collection flickcurl_collections_getInfo = new flickcurl_collection();
	public static flickcurl_collection flickcurl_collections_getTree = new flickcurl_collection();
	public static flickcurl_institution flickcurl_commons_getInstitutions = new flickcurl_institution();
	public static byte flickcurl_get_institution_url_type_label;
	public static int flickcurl_favorites_add;
	public static flickcurl_photos_list flickcurl_favorites_getContext = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_favorites_getList2 = new flickcurl_photo();
	public static flickcurl_photo flickcurl_favorites_getList = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_favorites_getList2_params = new flickcurl_photos_list();
	public static flickcurl_photos_list flickcurl_favorites_getList_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_favorites_getPublicList = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_favorites_getPublicList_params = new flickcurl_photos_list();
	public static int flickcurl_favorites_remove;
	public static int flickcurl_galleries_addPhoto;
	public static byte flickcurl_galleries_create;
	public static int flickcurl_galleries_editMeta;
	public static int flickcurl_galleries_editPhoto;
	public static int flickcurl_galleries_editPhotos;
	public static flickcurl_gallery flickcurl_galleries_getInfo = new flickcurl_gallery();
	public static flickcurl_gallery flickcurl_galleries_getList = new flickcurl_gallery();
	public static flickcurl_gallery flickcurl_galleries_getListForPhoto = new flickcurl_gallery();
	public static flickcurl_photos_list flickcurl_galleries_getPhotos_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_galleries_getPhotos = new flickcurl_photo();
	public static Object flickcurl_free_galleries;
	public static Object flickcurl_free_category;
	public static Object flickcurl_free_categories;
	public static flickcurl_category flickcurl_groups_browse = new flickcurl_category();
	public static flickcurl_group flickcurl_groups_getInfo = new flickcurl_group();
	public static int flickcurl_groups_join;
	public static int flickcurl_groups_joinRequest;
	public static int flickcurl_groups_leave;
	public static flickcurl_group flickcurl_groups_search = new flickcurl_group();
	public static Object flickcurl_free_member;
	public static Object flickcurl_free_members;
	public static flickcurl_member flickcurl_groups_members_getList = new flickcurl_member();
	public static int flickcurl_groups_pools_add;
	public static flickcurl_context flickcurl_groups_pools_getContext = new flickcurl_context();
	public static flickcurl_group flickcurl_groups_pools_getGroups = new flickcurl_group();
	public static flickcurl_photo flickcurl_groups_pools_getPhotos = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_groups_pools_getPhotos_params = new flickcurl_photos_list();
	public static int flickcurl_groups_pools_remove;
	public static Object flickcurl_free_group;
	public static Object flickcurl_free_groups;
	public static flickcurl_photo flickcurl_interestingness_getList = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_interestingness_getList_params = new flickcurl_photos_list();
	public static flickcurl_tag_namespace flickcurl_machinetags_getNamespaces = new flickcurl_tag_namespace();
	public static flickcurl_tag_predicate_value flickcurl_machinetags_getPairs = new flickcurl_tag_predicate_value();
	public static flickcurl_tag_predicate_value flickcurl_machinetags_getPredicates = new flickcurl_tag_predicate_value();
	public static flickcurl_tag_predicate_value flickcurl_machinetags_getValues = new flickcurl_tag_predicate_value();
	public static flickcurl_tag_predicate_value flickcurl_machinetags_getRecentValues = new flickcurl_tag_predicate_value();
	public static byte flickcurl_panda_getList;
	public static flickcurl_photo flickcurl_panda_getPhotos = new flickcurl_photo();
	public static Object flickcurl_free_size;
	public static Object flickcurl_free_sizes;
	public static byte flickcurl_people_findByEmail;
	public static byte flickcurl_people_findByUsername;
	public static flickcurl_group flickcurl_people_getGroups = new flickcurl_group();
	public static flickcurl_person flickcurl_people_getInfo = new flickcurl_person();
	public static flickcurl_photos_list flickcurl_people_getPhotos_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_people_getPhotos = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_people_getPhotosOf_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_people_getPhotosOf = new flickcurl_photo();
	public static flickcurl_group flickcurl_people_getPublicGroups = new flickcurl_group();
	public static flickcurl_photo flickcurl_people_getPublicPhotos = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_people_getPublicPhotos_params = new flickcurl_photos_list();
	public static flickcurl_user_upload_status flickcurl_people_getUploadStatus = new flickcurl_user_upload_status();
	public static int flickcurl_photos_addTags;
	public static int flickcurl_photos_delete;
	public static flickcurl_context flickcurl_photos_getAllContexts = new flickcurl_context();
	public static flickcurl_photo flickcurl_photos_getContactsPhotos = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_getContactsPhotos_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_photos_getContactsPublicPhotos = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_getContactsPublicPhotos_params = new flickcurl_photos_list();
	public static flickcurl_context flickcurl_photos_getContext = new flickcurl_context();
	public static int flickcurl_photos_getCounts;
	public static flickcurl_exif flickcurl_photos_getExif = new flickcurl_exif();
	public static flickcurl_person flickcurl_photos_getFavorites = new flickcurl_person();
	public static flickcurl_photo flickcurl_photos_getInfo2 = new flickcurl_photo();
	public static flickcurl_photo flickcurl_photos_getInfo = new flickcurl_photo();
	public static flickcurl_photo flickcurl_photos_getNotInSet = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_getNotInSet_params = new flickcurl_photos_list();
	public static flickcurl_perms flickcurl_photos_getPerms = new flickcurl_perms();
	public static flickcurl_photo flickcurl_photos_getRecent = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_getRecent_params = new flickcurl_photos_list();
	public static flickcurl_size flickcurl_photos_getSizes = new flickcurl_size();
	public static flickcurl_photo flickcurl_photos_getUntagged = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_getUntagged_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_photos_getWithGeoData = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_getWithGeoData_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_photos_getWithoutGeoData = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_getWithoutGeoData_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_photos_recentlyUpdated = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_recentlyUpdated_params = new flickcurl_photos_list();
	public static int flickcurl_photos_removeTag;
	public static flickcurl_photo flickcurl_photos_search = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photos_search_params = new flickcurl_photos_list();
	public static int flickcurl_photos_setContentType;
	public static int flickcurl_photos_setDates;
	public static int flickcurl_photos_setMeta;
	public static int flickcurl_photos_setPerms;
	public static int flickcurl_photos_setSafetyLevel;
	public static int flickcurl_photos_setTags;
	public static int flickcurl_photos_people_add;
	public static int flickcurl_photos_people_delete;
	public static int flickcurl_photos_people_deleteCoords;
	public static int flickcurl_photos_people_editCoords;
	public static flickcurl_person flickcurl_photos_people_getList = new flickcurl_person();
	public static flickcurl_place flickcurl_places_find = new flickcurl_place();
	public static flickcurl_place flickcurl_places_findByLatLon = new flickcurl_place();
	public static flickcurl_place flickcurl_places_getChildrenWithPhotosPublic = new flickcurl_place();
	public static flickcurl_place flickcurl_places_getChildrenWithPhotosPublic2 = new flickcurl_place();
	public static flickcurl_place flickcurl_places_getInfo = new flickcurl_place();
	public static flickcurl_place flickcurl_places_getInfo2 = new flickcurl_place();
	public static flickcurl_place flickcurl_places_getTopPlacesList = new flickcurl_place();
	public static flickcurl_place flickcurl_places_getInfoByUrl = new flickcurl_place();
	public static flickcurl_place flickcurl_places_resolvePlaceId = new flickcurl_place();
	public static flickcurl_place flickcurl_places_resolvePlaceURL = new flickcurl_place();
	public static byte flickcurl_get_place_type_label;
	public static flickcurl_place_type flickcurl_get_place_type_by_label = new flickcurl_place_type();
	public static flickcurl_place_type_info flickcurl_places_getPlaceTypes = new flickcurl_place_type_info();
	public static flickcurl_shapedata flickcurl_places_getShapeHistory = new flickcurl_shapedata();
	public static flickcurl_place flickcurl_places_placesForBoundingBox = new flickcurl_place();
	public static flickcurl_place flickcurl_places_placesForContacts = new flickcurl_place();
	public static int flickcurl_places_placesForTags;
	public static flickcurl_place flickcurl_places_placesForUser = new flickcurl_place();
	public static flickcurl_place flickcurl_places_forUser = new flickcurl_place();
	public static flickcurl_tag flickcurl_places_tagsForPlace = new flickcurl_tag();
	public static int flickcurl_place_type_to_id;
	public static flickcurl_place_type flickcurl_place_id_to_type = new flickcurl_place_type();
	public static Object flickcurl_free_contact;
	public static Object flickcurl_free_contacts;
	public static flickcurl_contact flickcurl_contacts_getList = new flickcurl_contact();
	public static flickcurl_contact flickcurl_contacts_getListRecentlyUploaded = new flickcurl_contact();
	public static flickcurl_contact flickcurl_contacts_getPublicList = new flickcurl_contact();
	public static flickcurl_contact flickcurl_contacts_getTaggingSuggestions = new flickcurl_contact();
	public static Object flickcurl_free_comment;
	public static Object flickcurl_free_comments;
	public static byte flickcurl_photos_comments_addComment;
	public static int flickcurl_photos_comments_deleteComment;
	public static int flickcurl_photos_comments_editComment;
	public static flickcurl_comment flickcurl_photos_comments_getList = new flickcurl_comment();
	public static flickcurl_photos_list flickcurl_photos_comments_getRecentForContacts_params = new flickcurl_photos_list();
	public static int flickcurl_photos_geo_batchCorrectLocation;
	public static int flickcurl_photos_geo_correctLocation;
	public static flickcurl_location flickcurl_photos_geo_getLocation = new flickcurl_location();
	public static flickcurl_perms flickcurl_photos_geo_getPerms = new flickcurl_perms();
	public static flickcurl_photos_list flickcurl_photos_geo_photosForLocation_params = new flickcurl_photos_list();
	public static flickcurl_photo flickcurl_photos_geo_photosForLocation = new flickcurl_photo();
	public static int flickcurl_photos_geo_removeLocation;
	public static int flickcurl_photos_geo_setContext;
	public static int flickcurl_photos_geo_setLocation;
	public static int flickcurl_photos_geo_setPerms;
	public static byte flickcurl_get_location_accuracy_label;
	public static flickcurl_license flickcurl_photos_licenses_getInfo = new flickcurl_license();
	public static flickcurl_license flickcurl_photos_licenses_getInfo_by_id = new flickcurl_license();
	public static int flickcurl_photos_licenses_setLicense;
	public static byte flickcurl_photos_notes_add;
	public static int flickcurl_photos_notes_delete;
	public static int flickcurl_photos_notes_edit;
	public static flickcurl_ticket flickcurl_photos_upload_checkTickets = new flickcurl_ticket();
	public static int flickcurl_photos_transform_rotate;
	public static int flickcurl_photosets_addPhoto;
	public static byte flickcurl_photosets_create;
	public static int flickcurl_photosets_delete;
	public static int flickcurl_photosets_editMeta;
	public static int flickcurl_photosets_editPhotos;
	public static flickcurl_context flickcurl_photosets_getContext = new flickcurl_context();
	public static flickcurl_photoset flickcurl_photosets_getInfo = new flickcurl_photoset();
	public static flickcurl_photoset flickcurl_photosets_getList = new flickcurl_photoset();
	public static flickcurl_photo flickcurl_photosets_getPhotos = new flickcurl_photo();
	public static flickcurl_photos_list flickcurl_photosets_getPhotos_params = new flickcurl_photos_list();
	public static int flickcurl_photosets_orderSets;
	public static int flickcurl_photosets_removePhoto;
	public static int flickcurl_photosets_removePhotos;
	public static int flickcurl_photosets_reorderPhotos;
	public static int flickcurl_photosets_setPrimaryPhoto;
	public static byte flickcurl_photosets_comments_addComment;
	public static int flickcurl_photosets_comments_deleteComment;
	public static int flickcurl_photosets_comments_editComment;
	public static flickcurl_comment flickcurl_photosets_comments_getList = new flickcurl_comment();
	public static int flickcurl_prefs_getContentType;
	public static int flickcurl_prefs_getGeoPerms;
	public static int flickcurl_prefs_getHidden;
	public static int flickcurl_prefs_getPrivacy;
	public static int flickcurl_prefs_getSafetyLevel;
	public static Object flickcurl_free_method;
	public static byte flickcurl_reflection_getMethods;
	public static flickcurl_method flickcurl_reflection_getMethodInfo = new flickcurl_method();
	public static int flickcurl_stats_getCSVFiles;
	public static flickcurl_stat flickcurl_stats_getCollectionDomains = new flickcurl_stat();
	public static flickcurl_stat flickcurl_stats_getCollectionReferrers = new flickcurl_stat();
	public static int flickcurl_stats_getCollectionStats;
	public static flickcurl_stat flickcurl_stats_getPhotoDomains = new flickcurl_stat();
	public static flickcurl_stat flickcurl_stats_getPhotoReferrers = new flickcurl_stat();
	public static flickcurl_stat flickcurl_stats_getPhotoStats = new flickcurl_stat();
	public static flickcurl_stat flickcurl_stats_getPhotosetDomains = new flickcurl_stat();
	public static flickcurl_stat flickcurl_stats_getPhotosetReferrers = new flickcurl_stat();
	public static int flickcurl_stats_getPhotosetStats;
	public static flickcurl_stat flickcurl_stats_getPhotostreamDomains = new flickcurl_stat();
	public static flickcurl_stat flickcurl_stats_getPhotostreamReferrers = new flickcurl_stat();
	public static int flickcurl_stats_getPhotostreamStats;
	public static flickcurl_photo flickcurl_stats_getPopularPhotos = new flickcurl_photo();
	public static flickcurl_view_stats flickcurl_stats_getTotalViews = new flickcurl_view_stats();
	public static Object flickcurl_free_stat;
	public static Object flickcurl_free_stats;
	public static Object flickcurl_free_view_stats;
	public static flickcurl_photos_list flickcurl_tags_getClusterPhotos = new flickcurl_photos_list();
	public static flickcurl_tag_clusters flickcurl_tags_getClusters = new flickcurl_tag_clusters();
	public static flickcurl_tag flickcurl_tags_getHotList = new flickcurl_tag();
	public static flickcurl_tag flickcurl_tags_getListPhoto = new flickcurl_tag();
	public static flickcurl_tag flickcurl_tags_getListUser = new flickcurl_tag();
	public static flickcurl_tag flickcurl_tags_getListUserPopular = new flickcurl_tag();
	public static flickcurl_tag flickcurl_tags_getListUserRaw = new flickcurl_tag();
	public static flickcurl_tag flickcurl_tags_getMostFrequentlyUsed = new flickcurl_tag();
	public static flickcurl_tag flickcurl_tags_getRelated = new flickcurl_tag();
	public static int flickcurl_test_echo;
	public static byte flickcurl_test_login;
	public static int flickcurl_test_null;
	public static byte flickcurl_urls_getGroup;
	public static byte flickcurl_urls_getUserPhotos;
	public static byte flickcurl_urls_getUserProfile;
	public static byte flickcurl_urls_lookupGallery;
	public static byte flickcurl_urls_lookupGroup;
	public static byte flickcurl_urls_lookupUser;
	public static flickcurl_upload_status flickcurl_photos_upload = new flickcurl_upload_status();
	public static flickcurl_upload_status flickcurl_photos_upload_params = new flickcurl_upload_status();
	public static flickcurl_upload_status flickcurl_photos_replace = new flickcurl_upload_status();
	public static Object flickcurl_free_upload_status;
	public static Object flickcurl_upload_status_free;
	public static byte flickcurl_array_join;
	public static byte flickcurl_array_split;
	public static Object flickcurl_array_free;
	public static byte[] yn_strings = new byte[]{"no", "yes"};
	public static flickcurl_photos_list photoslist_fn = new flickcurl_photos_list();
	public static flickcurl_cmd[] commands = new flickcurl_cmd[]{new flickcurl_cmd("auth.checkToken", "TOKEN", "Get the credentials attached to an authentication TOKEN.", command_auth_checkToken, 1, 1), new flickcurl_cmd("auth.getFrob", "", "Get a frob to be used during authentication.", command_auth_getFrob, 0, 0), new flickcurl_cmd("auth.getFullToken", "MINI-TOKEN", "Get the full authentication token for MINI-TOKEN.", command_auth_getFullToken, 0, 0), new flickcurl_cmd("auth.getToken", "TOKEN", "Get the auth token for the FROB, if one has been attached.", command_auth_getToken, 0, 0), new flickcurl_cmd("activity.userComments", "[PER-PAGE [PAGE]]", "Get photos commented on by the caller.", command_activity_userComments, 0, 2), new flickcurl_cmd("activity.userPhotos", "[TIMEFRAME [PER-PAGE [PAGE]]]", "Get recent activity on the caller's photos.", command_activity_userPhotos, 0, 3), new flickcurl_cmd("blogs.getList", "", "Get a list of configured blogs for the calling user.", command_blogs_getList, 0, 0), new flickcurl_cmd("blogs.getServices", "", "Get a list of blog services.", command_blogs_getServices, 0, 0), new flickcurl_cmd("blogs.postPhoto", "BLOG-ID PHOTO-ID TITLE DESCRIPTION [BLOG-PASSWORD]", "Post PHOTO-ID to blog BLOG-ID with TITLE, DESCRIPTION and optional password.", command_blogs_postPhoto, 4, 5), new flickcurl_cmd("commons.getInstitutions", "", "Get list of institutions", command_commons_getInstitutions, 0, 0), new flickcurl_cmd("collections.getInfo", "COLLECTION-ID", "Get information on collection COLLECTION-ID", command_collections_getInfo, 1, 1), new flickcurl_cmd("collections.getTree", "[COLLECTION-ID|- [USER-ID|-]]", "Get tree of collections COLLECTION-ID for USER-ID", command_collections_getTree, 0, 2), new flickcurl_cmd("contacts.getList", "[FILTER [PER-PAGE [PAGE]]]", "Get a list of contacts with optional FILTER", command_contacts_getList, 0, 3), new flickcurl_cmd("contacts.getListRecentlyUploaded", "[DATE-LAST-UPLOAD [FILTER]]", "Get a list of recent uploading contacts since DATE-LAST-UPLOAD with optional FILTER", command_contacts_getListRecentlyUploaded, 0, 2), new flickcurl_cmd("contacts.getPublicList", "USER-NSID [PER-PAGE [PAGE]]", "Get the contact list for user USER-NSID", command_contacts_getPublicList, 1, 3), new flickcurl_cmd("contacts.getTaggingSuggestions", "[PER_PAGE [PAGE [INCLUDE-SELF [INCLUDE-ADDRESS-BOOK]]]]", "Get tagging suggestions", command_contacts_getTaggingSuggestions, 0, 4), new flickcurl_cmd("favorites.add", "PHOTO-ID", "Adds PHOTO-ID to the current user's favorites.", command_favorites_add, 1, 1), new flickcurl_cmd("favorites.getContext", "PHOTO-ID USER-NSID [NUM-PREV [NUM-NEXT [EXTRAS]]]", "Get context photos around USER-ID's favorite PHOTO-ID.", command_favorites_getContext, 2, 5), new flickcurl_cmd("favorites.getList", "USER-NSID [MIN-FAVE-DATE|- [MAX-FAVE-DATE|- [PER-PAGE [PAGE [FORMAT]]]]]", "Get a list of USER-NSID's favorite photos.", command_favorites_getList, 1, 6), new flickcurl_cmd("favorites.getPublicList", "USER-NSID [PER-PAGE [PAGE [FORMAT]]]", "Get a list of USER-NSID's favorite public photos.", command_favorites_getPublicList, 1, 4), new flickcurl_cmd("favorites.remove", "PHOTO-ID", "Removes PHOTO-ID to the current user's favorites.", command_favorites_remove, 1, 1), new flickcurl_cmd("galleries.addPhoto", "GALLERY-ID PHOTO-ID TEXT", "Add photo PHOTO-ID to galleries GALLERY-ID with TEXT", command_galleries_addPhoto, 3, 3), new flickcurl_cmd("galleries.create", "TITLE [DESCRIPTION [PRIMARY-PHOTO-ID]", "Create a new gallery with TITLE, DESCRIPTION and PRIMARY-PHOTO_ID.", command_galleries_create, 1, 3), new flickcurl_cmd("galleries.editMeta", "GALLERY-ID TITLE [DESCRIPTION]", "Set the TITLE and/or DESCRIPTION of a GALLERY-ID.", command_galleries_editMeta, 2, 3), new flickcurl_cmd("galleries.editPhoto", "GALLERY-ID PHOTO-ID COMMENT", "Set the COMMENT for PHOTO-ID in GALLERY-ID.", command_galleries_editPhoto, 3, 3), new flickcurl_cmd("galleries.editPhotos", "GALLERY-ID PRIMARY-PHOTO-ID PHOTO-IDS,...", "Set the PHOTO-IDs of a GALLERY-ID and PRIMARY-PHOTO-ID.", command_galleries_editPhotos, 3, 3), new flickcurl_cmd("galleries.getInfo", "GALLERY-ID", "Get information about GALLERY-ID.", command_galleries_getInfo, 1, 1), new flickcurl_cmd("galleries.getList", "USER-ID [PER-PAGE [PAGE]]", "Get list of galleries for a USER-ID with optional paging", command_galleries_getList, 1, 3), new flickcurl_cmd("galleries.getListForPhoto", "PHOTO-ID [PER-PAGE [PAGE]]", "Get list of galleries PHOTO-ID appears in with optional paging", command_galleries_getListForPhoto, 1, 3), new flickcurl_cmd("galleries.getPhotos", "GALLERY-ID [EXTRAS [PER-PAGE [PAGE [FORMAT]]]]", "Get the list of photos in GALLERY-ID with options.", command_galleries_getPhotos, 1, 5), new flickcurl_cmd("groups.browse", "[CAT-ID]", "Browse groups below category CAT-ID (or root).", command_groups_browse, 0, 1), new flickcurl_cmd("groups.getInfo", "GROUP-ID [LANG]", "Get information on group GROUP-ID with language LANG.", command_groups_getInfo, 1, 2), new flickcurl_cmd("groups.join", "GROUP-ID [ACCEPT-RULES]", "Join a group GROUP-ID with optional accepting of rules.", command_groups_join, 1, 2), new flickcurl_cmd("groups.joinRequest", "GROUP-ID MESSAGE ACCEPT-RULES", "Request to join a group GROUP-ID using MESSAGE and accept rules.", command_groups_joinRequest, 3, 3), new flickcurl_cmd("groups.leave", "GROUP-ID [DELETE-PHOTOS]", "Leave a group GROUP-ID and optionally delete photos.", command_groups_leave, 1, 1), new flickcurl_cmd("groups.search", "TEXT [PER-PAGE [PAGE]]", "Search for groups matching TEXT paging PER-PAGE and PAGE.", command_groups_search, 1, 3), new flickcurl_cmd("groups.members.getList", "GROUP-ID [MEMBER-TYPES [PER-PAGE [PAGE]]]", "Get list of MEMBER-TYPES types members of group GROUP-ID.", command_groups_members_getList, 1, 4), new flickcurl_cmd("groups.pools.add", "PHOTO-ID GROUP-ID", "Add PHOTO-ID in GROUP-ID pool.", command_groups_pools_add, 2, 2), new flickcurl_cmd("groups.pools.getContext", "PHOTO-ID GROUP-ID", "Get next and previous photos for PHOTO-ID in GROUP-ID pool.", command_groups_pools_getContext, 2, 2), new flickcurl_cmd("groups.pools.getGroups", "[PER-PAGE [PAGE]]", "Get list of groups a user can add to.", command_groups_pools_getGroups, 0, 2), new flickcurl_cmd("groups.pools.getPhotos", "GROUP-ID [PER-PAGE [PAGE [FORMAT]]]", "Get list of photos in GROUP-ID.", command_groups_pools_getPhotos, 1, 4), new flickcurl_cmd("groups.pools.remove", "PHOTO-ID GROUP-ID", "Remove PHOTO-ID from group GROUP-ID.", command_groups_pools_remove, 2, 2), new flickcurl_cmd("interestingness.getList", "[PARAMS]", "Get interesting photos with optional parameters\n  date DATE  extras EXTRAS  per-page PER-PAGE  page PAGE  format FORMAT", command_interestingness_getList, 1, 0), new flickcurl_cmd("machinetags.getNamespaces", "[PREDICATE [PER-PAGE [PAGE]]]", "Get a list of namespaces with optional PREDICATE", command_machinetags_getNamespaces, 0, 3), new flickcurl_cmd("machinetags.getPairs", "[NAMESPACE [PREDICATE [PER-PAGE [PAGE]]]]", "Get a list of unique NAMESPACE and PREDICATE pairs", command_machinetags_getPairs, 0, 4), new flickcurl_cmd("machinetags.getPredicates", "[NAMESPACE [PER-PAGE [PAGE]]]", "Get a list of unique predicates optionally by NAMESPACE", command_machinetags_getPredicates, 0, 3), new flickcurl_cmd("machinetags.getValues", "NAMESPACE PREDICATE [PER-PAGE [PAGE]]", "Get a list of unique values for a NAMESPACE and PREDICATE", command_machinetags_getValues, 2, 4), new flickcurl_cmd("machinetags.getRecentValues", "[NAMESPACE|- [PREDICATE|- [ADDED-SINCE]]]", "Get a list of recent machinetags for NAMESPACE and PREDICATE since ADDED-SINCE", command_machinetags_getRecentValues, 0, 3), new flickcurl_cmd("panda.getList", "", "get the current list of pandas", command_panda_getList, 0, 0), new flickcurl_cmd("panda.getPhotos", "PANDA", "ask a PANDA for a list of recent public and safe photos", command_panda_getPhotos, 1, 1), new flickcurl_cmd("people.findByEmail", "EMAIL", "get a user's NSID from their EMAIL address", command_people_findByEmail, 1, 1), new flickcurl_cmd("people.findByUsername", "USERNAME", "get a user's NSID from their USERNAME", command_people_findByUsername, 1, 1), new flickcurl_cmd("people.getGroups", "USER-ID [GROUP-EXTRAS]", "Get list of groups USER-ID is a member of", command_people_getGroups, 1, 2), new flickcurl_cmd("people.getInfo", "USER-NSID", "Get information about one person with id USER-NSID", command_people_getInfo, 1, 1), new flickcurl_cmd("people.getPhotos", "USER-NSID", "Get photos from user USER-NSID with optional parameters\n  safe-search 1-3  min-upload-date DATE  max-upload-date DATE\n  min-taken date DATE  max-taken-date DATE  content-type 1-7\n  privacy-filter 1-5  per-page PER-PAGE  page PAGE  format FORMAT", command_people_getPhotos, 1, 0), new flickcurl_cmd("people.getPhotosOf", "USER-NSID [PER-PAGE [PAGE [FORMAT]]]", "Get public photos of a user USER-NSID", command_people_getPhotosOf, 1, 4), new flickcurl_cmd("people.getPublicGroups", "USER-NSID", "Get list of public groups a user is a member of", command_people_getPublicGroups, 1, 1), new flickcurl_cmd("people.getPublicPhotos", "USER-NSID [PER-PAGE [PAGE [FORMAT]]]", "Get public photos for a user USER-NSID", command_people_getPublicPhotos, 1, 4), new flickcurl_cmd("people.getUploadStatus", "", "Get calling user upload status", command_people_getUploadStatus, 0, 0), new flickcurl_cmd("photos.addTags", "PHOTO-ID TAGS", "Add TAGS to a PHOTO-ID.", command_photos_addTags, 2, 2), new flickcurl_cmd("photos.delete", "PHOTO-ID", "Delete a PHOTO-ID.", command_photos_delete, 1, 1), new flickcurl_cmd("photos.getAllContexts", "PHOTO-ID", "Get all visible sets and pools the PHOTO-ID belongs to.", command_photos_getAllContexts, 1, 1), new flickcurl_cmd("photos.getContactsPhotos", "", "Get a list of recent photos from the calling users' contacts", command_photos_getContactsPhotos, 0, 0), new flickcurl_cmd("photos.getContactsPublicPhotos", "USER-NSID [FORMAT]", "Get a list of recent public photos from USER-NSID's contacts", command_photos_getContactsPublicPhotos, 1, 2), new flickcurl_cmd("photos.getContext", "PHOTO-ID", "Get next and previous photos for a PHOTO-ID in a photostream.", command_photos_getContext, 1, 1), new flickcurl_cmd("photos.getCounts", "DATES TAKEN-DATES", "Get the counts for a set of DATES or TAKEN-DATES.", command_photos_getCounts, 0, 2), new flickcurl_cmd("photos.getExif", "PHOTO-ID", "Get EXIF information about one photo with id PHOTO-ID", command_photos_getExif, 1, 1), new flickcurl_cmd("photos.getFavorites", "PHOTO-ID [PER-PAGE [PAGE]]", "Get favourites information about one photo with id PHOTO-ID", command_photos_getFavorites, 1, 3), new flickcurl_cmd("photos.getInfo", "PHOTO-ID [SECRET]", "Get information about one photo PHOTO-ID with optional SECRET", command_photos_getInfo, 1, 2), new flickcurl_cmd("photos.getNotInSet", "[PER-PAGE [PAGE [FORMAT]]]", "Get list of photos that are not in any set", command_photos_getNotInSet, 0, 3), new flickcurl_cmd("photos.getPerms", "PHOTO-ID", "Get a photo viewing and commenting permissions", command_photos_getPerms, 1, 1), new flickcurl_cmd("photos.getRecent", "[PER-PAGE [PAGE [FORMAT]]]", "Get list of recent photos", command_photos_getRecent, 0, 3), new flickcurl_cmd("photos.getSizes", "PHOTO-ID", "Get sizes of a PHOTO-ID", command_photos_getSizes, 1, 1), new flickcurl_cmd("photos.getUntagged", "[PER-PAGE [PAGE [FORMAT]]]", "Get list of photos that are not tagged", command_photos_getUntagged, 0, 3), new flickcurl_cmd("photos.getWithGeoData", "[PER-PAGE [PAGE [FORMAT]]]", "Get list of photos that have geo data", command_photos_getWithGeoData, 0, 3), new flickcurl_cmd("photos.getWithoutGeoData", "[PER-PAGE [PAGE [FORMAT]]]", "Get list of photos that do not have geo data", command_photos_getWithoutGeoData, 0, 3), new flickcurl_cmd("photos.recentlyUpdated", "MIN-DATE [PER-PAGE [PAGE [FORMAT]]]", "Get list of photos that were recently updated", command_photos_recentlyUpdated, 1, 4), new flickcurl_cmd("photos.removeTag", "PHOTO-ID TAG-ID", "Remove a tag TAG-ID from a photo.", command_photos_removeTag, 2, 2), new flickcurl_cmd("photos.search", "[PARAMS] tags TAGS...", "Search for photos/videos with many optional parameters\n        user USER  tag-mode any|all  text TEXT\n        (min|max)-(upload|taken)-date DATE\n        license LICENSE  privacy PRIVACY  bbox a,b,c,d\n        sort date-(posted|taken)-(asc|desc)|interestingness-(desc|asc)|relevance\n        accuracy 1-16  safe-search 1-3  type 1-4\n        machine-tags TAGS  machine-tag-mode any|all\n        group-id ID  place-id ID  extras EXTRAS\n        per-page PER-PAGE  page PAGES\n        media all|photos|videos  has-geo\n        lat LAT lon LON radius RADIUS radius-units km|mi\n        contacts (all|ff)\n        format FORMAT  woeid WOEID\n        geo-context 1-2\n        in-commons  in-gallery", command_photos_search, 1, 0), new flickcurl_cmd("photos.setContentType", "PHOTO-ID TYPE", "Set photo TYPE to one of 'photo', 'screenshot' or 'other'", command_photos_setContentType, 2, 2), new flickcurl_cmd("photos.setDates", "PHOTO-ID POSTED TAKEN GRANULARITY", "Set a photo POSTED date, TAKEN date with GRANULARITY", command_photos_setDates, 4, 4), new flickcurl_cmd("photos.setMeta", "PHOTO-ID TITLE DESCRIPTION", "Set a photo TITLE and DESCRIPTION", command_photos_setMeta, 3, 3), new flickcurl_cmd("photos.setPerms", "PHOTO-ID IS-PUBLIC IS-FRIEND IS-FAMILY PERM-COMMENT PERM-ADDMETA", "Set a photo viewing and commenting permissions", command_photos_setPerms, 6, 6), new flickcurl_cmd("photos.setSafetyLevel", "PHOTO-ID SAFETY-LEVEL HIDDEN", "Set a photo's SAFETY-LEVEL and HIDDEN flag", command_photos_setSafetyLevel, 3, 3), new flickcurl_cmd("photos.setTags", "PHOTO-ID TAGS", "Set the tags for a PHOTO-ID to TAGS.", command_photos_setTags, 2, 2), new flickcurl_cmd("photos.comments.addComment", "PHOTO-ID TEXT", "Add a photo comment TEXT to PHOTO-ID.", command_photos_comments_addComment, 2, 2), new flickcurl_cmd("photos.comments.deleteComment", "COMMENT-ID", "Delete a photo comment COMMENT-ID.", command_photos_comments_deleteComment, 1, 1), new flickcurl_cmd("photos.comments.editComment", "COMMENT-ID TEXT", "Edit a photo comment COMMENT-ID to have new TEXT.", command_photos_comments_editComment, 2, 2), new flickcurl_cmd("photos.comments.getList", "PHOTO-ID", "Get the comments for a photo PHOTO-ID.", command_photos_comments_getList, 1, 1), new flickcurl_cmd("photos.comments.getRecentForContacts", "[PARAMS]", "Get the list of photos for user contacts with recent comments\n      since DATE-LAST-COMMENT filter CONTACTS-FILTER\n      per-page PER-PAGE page PAGE format FORMAT", command_comments_getRecentForContacts, 0, 0), new flickcurl_cmd("photos.geo.getLocation", "PHOTO-ID", "Get the geo location for a photo PHOTO-ID.", command_photos_geo_getLocation, 1, 1), new flickcurl_cmd("photos.geo.getPerms", "PHOTO-ID", "Get the geo perms for a photo PHOTO-ID.", command_photos_geo_getPerms, 1, 1), new flickcurl_cmd("photos.geo.removeLocation", "PHOTO-ID", "Remove the location for a photo PHOTO-ID.", command_photos_geo_removeLocation, 1, 1), new flickcurl_cmd("photos.geo.setLocation", "PHOTO-ID LAT LONG ACCURACY", "Set the location for a photo PHOTO-ID.", command_photos_geo_setLocation, 4, 4), new flickcurl_cmd("photos.geo.setPerms", "PHOTO-ID IS-PUBLIC IS-CONTACT IS-FRIEND IS-FAMILY", "Set the geo perms for a photo PHOTO-ID.", command_photos_geo_setPerms, 5, 5), new flickcurl_cmd("photos.licenses.getInfo", "", "Get list of available photo licenses", command_photos_licenses_getInfo, 0, 0), new flickcurl_cmd("photos.licenses.setLicense", "PHOTO-ID LICENSE-ID", "Get photo PHOTO-ID license to LICENSE-ID", command_photos_licenses_setLicense, 2, 2), new flickcurl_cmd("photos.notes.add", "PHOTO-ID X Y W H TEXT", "Add a note (X, Y, W, H, TEXT) to a photo with id PHOTO-ID", command_photos_notes_add, 6, 6), new flickcurl_cmd("photos.notes.delete", "NOTE-ID", "Delete a note with id NOTE-ID", command_photos_notes_delete, 1, 1), new flickcurl_cmd("photos.notes.edit", "NOTE-ID X Y W H TEXT", "Edit note NOTE-ID to (X, Y, W, H, TEXT)", command_photos_notes_edit, 6, 6), new flickcurl_cmd("photos.people.add", "PHOTO-ID USER-ID X Y W H", "Mark USER-ID appearing in PHOTO-ID at (X, Y, W, H)", command_photos_people_add, 6, 6), new flickcurl_cmd("photos.people.delete", "PHOTO-ID USER-ID", "Mark USER-ID as not appearing in PHOTO-ID", command_photos_people_delete, 2, 2), new flickcurl_cmd("photos.people.deleteCoords", "PHOTO-ID USER-ID", "Mark USER-ID as not appearing at coordinates in PHOTO-ID", command_photos_people_deleteCoords, 2, 2), new flickcurl_cmd("photos.people.editCoords", "PHOTO-ID USER-ID X Y W H", "Update USER-ID appearing in PHOTO-ID to coords (X, Y, W, H)", command_photos_people_editCoords, 6, 6), new flickcurl_cmd("photos.people.getList", "PHOTO-ID", "Get list of users appearing in PHOTO-ID", command_photos_people_getList, 1, 1), new flickcurl_cmd("photos.transform.rotate", "PHOTO-ID DEGREES", "Rotate PHOTO-ID by 90/180/270 DEGREES", command_photos_transform_rotate, 2, 2), new flickcurl_cmd("photos.upload.checkTickets", "TICKET-IDS...", "Get the status of upload TICKET-IDS", command_photos_upload_checkTickets, 1, 1), new flickcurl_cmd("photosets.addPhoto", "PHOTOSET-ID PHOTO-ID", "Add PHOTO-ID to a PHOTOSET-ID.", command_photosets_addPhoto, 2, 2), new flickcurl_cmd("photosets.create", "TITLE DESCRIPTION PRIMARY-PHOTO-ID", "Create a photoset with TITLE, DESCRIPTION and PRIMARY-PHOTO-ID.", command_photosets_create, 3, 3), new flickcurl_cmd("photosets.delete", "PHOTOSET-ID", "Delete a photoset with PHOTOSET-ID.", command_photosets_delete, 1, 1), new flickcurl_cmd("photosets.editMeta", "PHOTOSET-ID TITLE DESCRIPTION", "Set the TITLE and/or DESCRIPTION of a PHOTOSET-ID.", command_photosets_editMeta, 3, 3), new flickcurl_cmd("photosets.editPhotos", "PHOTOSET-ID PRIMARY-PHOTO-ID PHOTO-IDS,...", "Set the PHOTO-IDs of a PHOTOSET-ID and PRIMARY-PHOTO-ID.", command_photosets_editPhotos, 3, 3), new flickcurl_cmd("photosets.getContext", "PHOTO-ID PHOTOSET-ID", "Get next and previous photos for PHOTO-ID in PHOTOSET-ID.", command_photosets_getContext, 2, 2), new flickcurl_cmd("photosets.getInfo", "PHOTOSET-ID", "Get information about PHOTOSET-ID.", command_photosets_getInfo, 1, 1), new flickcurl_cmd("photosets.getList", "[USER-NSID]", "Get the list of photosets for the USER-NSID.", command_photosets_getList, 0, 1), new flickcurl_cmd("photosets.getPhotos", "PHOTOSET-ID [EXTRAS [PRIVACY [PER-PAGE [PAGE [FORMAT]]]]]", "Get the list of photos in PHOTOSET-ID with options.", command_photosets_getPhotos, 1, 6), new flickcurl_cmd("photosets.orderSets", "PHOTOSET-IDS...", "Set the order of sets PHOTOSET-IDS.", command_photosets_orderSets, 1, 1), new flickcurl_cmd("photosets.removePhoto", "PHOTOSET-ID PHOTO-ID", "Remove PHOTO-ID from PHOTOSET-ID.", command_photosets_removePhoto, 2, 2), new flickcurl_cmd("photosets.removePhotos", "PHOTOSET-ID PHOTO-IDS...", "Remove PHOTO-IDS from PHOTOSET-ID.", command_photosets_removePhotos, 2, 2), new flickcurl_cmd("photosets.reorderPhotos", "PHOTOSET-ID PHOTO-IDS...", "Reorder PHOTO-IDS from PHOTOSET-ID.", command_photosets_reorderPhotos, 2, 2), new flickcurl_cmd("photosets.setPrimaryPhoto", "PHOTOSET-ID PHOTO-ID", "Set photoset PHOTOSET-ID primary photo to PHOTO-ID.", command_photosets_setPrimaryPhoto, 2, 2), new flickcurl_cmd("photosets.comments.addComment", "PHOTOSET-ID TEXT", "Add a comment TEXT to photoset PHOTOSET-ID.", command_photosets_comments_addComment, 2, 2), new flickcurl_cmd("photosets.comments.deleteComment", "COMMENT-ID", "Delete a photoset comment COMMENT-ID.", command_photosets_comments_deleteComment, 1, 1), new flickcurl_cmd("photosets.comments.editComment", "COMMENT-ID TEXT", "Edit a photoset comment COMMENT-ID to have new TEXT.", command_photosets_comments_editComment, 2, 2), new flickcurl_cmd("photosets.comments.getList", "PHOTOSET-ID", "Get the comments for a photoset PHOTOSET-ID.", command_photosets_comments_getList, 1, 1), new flickcurl_cmd("places.find", "TEXT", "Find places by TEXT query.", command_places_find, 1, 1), new flickcurl_cmd("places.findByLatLon", "LAT LON ACCURACY", "Find places by LAT and LON with ACCURACY 1-16.", command_places_findByLatLon, 3, 3), new flickcurl_cmd("places.getChildrenWithPhotosPublic", "PLACE-ID|- [WOE-ID|-]", "Find child places with public photos by PLACE-ID or WOE-ID", command_places_getChildrenWithPhotosPublic, 1, 2), new flickcurl_cmd("places.getInfo", "PLACE-ID|- [WOE-ID|-]", "Find place by PLACE-ID or WOE-ID", command_places_getInfo, 1, 2), new flickcurl_cmd("places.getInfoByUrl", "URL", "Find place by place URL", command_places_getInfoByUrl, 1, 1), new flickcurl_cmd("places.getPlaceTypes", "URL", "Get a list of available place types", command_places_getPlaceTypes, 0, 0), new flickcurl_cmd("places.getShapeHistory", "PLACE-ID|- [WOE-ID|-]", "Get history of shapes for a place by PLACE-ID or WOE-ID", command_places_getShapeHistory, 1, 0), new flickcurl_cmd("places.getTopPlacesList", "PLACE-TYPE [DATE [WOE-ID|- [PLACE-ID]]]", "Get the top 100 most geotagged places for a DATE (or yesterday).", command_places_getTopPlacesList, 1, 4), new flickcurl_cmd("places.placesForBoundingBox", "PLACE-TYPE MIN-LONG MIN-LAT MAX-LONG MAX-LAT", "Find user places of PLACE-TYPE in bbox.", command_places_placesForBoundingBox, 5, 5), new flickcurl_cmd("places.placesForContacts", "PLACE-TYPE WOE-ID|- PLACE-ID|- THRESHOLD [PARAMS]", "Find top 100 unique places clustered by a given PLACE-TYPE for a\nuser's contacts with optional parameters\n  contacts CONTACTS  min-upload MIN-UPLOAD-DATE  max-upload MAX-UPLOAD-DATE\n  min-taken MIN-TAKEN-DATE  max-taken MAX-TAKEN-DATE", command_places_placesForContacts, 4, 0), new flickcurl_cmd("places.placesForUser", "PLACE-TYPE [WOE-ID] [PLACE-ID [THRESHOLD]]]", "Find user places of PLACE-TYPE.", command_places_placesForUser, 1, 4), new flickcurl_cmd("places.resolvePlaceId", "PLACE-ID  / WOE-ID", "Find places information by PLACE-ID or WOE-ID (number).", command_places_resolvePlaceId, 1, 1), new flickcurl_cmd("places.resolvePlaceURL", "PLACE-URL", "Find places information by PLACE-URL.", command_places_resolvePlaceURL, 1, 1), new flickcurl_cmd("places.tagsForPlace", "PLACE-ID|- [WOE-ID|-]", "Get tags for a place by PLACE-ID or WOE-ID with optional parameters\n  min-upload MIN-UPLOAD-DATE  max-upload MAX-UPLOAD-DATE\n  min-taken MIN-TAKEN-DATE  max-taken MAX-TAKEN-DATE", command_places_tagsForPlace, 1, 0), new flickcurl_cmd("prefs.getContentType", "", "Get default content type preference for user.", command_prefs_getContentType, 0, 0), new flickcurl_cmd("prefs.getGeoPerms", "", "Get default privacy level for geographic info for user.", command_prefs_getGeoPerms, 0, 0), new flickcurl_cmd("prefs.getHidden", "", "Get default hidden preference for user.", command_prefs_getHidden, 0, 0), new flickcurl_cmd("prefs.getPrivacy", "", "Get default privacy preference for user.", command_prefs_getPrivacy, 0, 0), new flickcurl_cmd("prefs.getSafetyLevel", "", "Get default safety level for user.", command_prefs_getSafetyLevel, 0, 0), new flickcurl_cmd("reflection.getMethods", "", "Get API methods", command_reflection_getMethods, 0, 0), new flickcurl_cmd("reflection.getMethodInfo", "NAME", "Get information about an API method NAME", command_reflection_getMethodInfo, 1, 1), new flickcurl_cmd("stats.getCollectionDomains", "DATE [COLLECTION-ID [PER-PAGE [PAGE]]]", "Get collection domains stats", command_stats_getCollectionDomains, 1, 4), new flickcurl_cmd("stats.getCollectionReferrers", "DATE DOMAIN [COLLECTION-ID [PER-PAGE [PAGE]]]", "Get collection referrers stats", command_stats_getCollectionReferrers, 2, 5), new flickcurl_cmd("stats.getCollectionStats", "DATE COLLECTION-ID", "Get collection view count stats", command_stats_getCollectionStats, 2, 2), new flickcurl_cmd("stats.getPhotoDomains", "DATE [PHOTO-ID [PER-PAGE [PAGE]]]", "Get photo domains stats", command_stats_getPhotoDomains, 1, 4), new flickcurl_cmd("stats.getPhotoReferrers", "DATE DOMAIN [PHOTO-ID [PER-PAGE [PAGE]]]", "Get photo referrers stats", command_stats_getPhotoReferrers, 2, 5), new flickcurl_cmd("stats.getPhotoStats", "DATE PHOTO-ID", "Get photo view count stats", command_stats_getPhotoStats, 2, 2), new flickcurl_cmd("stats.getPhotosetDomains", "DATE [PHOTOSET-ID [PER-PAGE [PAGE]]]", "Get photoset domains stats", command_stats_getPhotosetDomains, 1, 4), new flickcurl_cmd("stats.getPhotosetReferrers", "DATE DOMAIN [PHOTOSET-ID [PER-PAGE [PAGE]]]", "Get photoset referrers stats", command_stats_getPhotosetReferrers, 2, 5), new flickcurl_cmd("stats.getPhotosetStats", "DATE PHOTOSET-ID", "Get photoset view count stats", command_stats_getPhotosetStats, 2, 2), new flickcurl_cmd("stats.getPhotostreamDomains", "DATE [PER-PAGE [PAGE]]", "Get photostream domains stats", command_stats_getPhotostreamDomains, 1, 3), new flickcurl_cmd("stats.getPhotostreamReferrers", "DATE DOMAIN [PER-PAGE [PAGE]]", "Get photostream referrers stats", command_stats_getPhotostreamReferrers, 2, 4), new flickcurl_cmd("stats.getPhotostreamStats", "DATE", "Get photostream view count stats", command_stats_getPhotostreamStats, 1, 1), new flickcurl_cmd("stats.getPopularPhotos", "[DATE [SORT [PER-PAGE [PAGE [EXTRAS]]]]]", "Get popular photos stats", command_stats_getPopularPhotos, 0, 5), new flickcurl_cmd("stats.getTotalViews", "[DATE]", "Get total stats", command_stats_getTotalViews, 0, 1), new flickcurl_cmd("tags.getClusters", "TAG", "Get list of tag clusters for TAG", command_tags_getClusters, 1, 1), new flickcurl_cmd("tags.getHotList", "[PERIOD [COUNT]]", "Get the list of hot tags for the given PERIOD (day, week)", command_tags_getHotList, 0, 2), new flickcurl_cmd("tags.getListPhoto", "PHOTO-ID", "Get the tag list for a PHOTO-ID.", command_tags_getListPhoto, 1, 1), new flickcurl_cmd("tags.getListUser", "[USER-NSID]", "Get the tag list for a USER-NSID (or current user).", command_tags_getListUser, 0, 1), new flickcurl_cmd("tags.getListUserPopular", "[USER-NSID [COUNT]]", "Get the popular tag list for a USER-NSID (or current user).", command_tags_getListUserPopular, 0, 2), new flickcurl_cmd("tags.getListUserRaw", "[TAG]", "Get the raw versions of a TAG (or all tags) for the current user.", command_tags_getListUserRaw, 0, 1), new flickcurl_cmd("tags.getMostFrequentlyUsed", "", "Get the most frequently used tags for the current user.", command_tags_getMostFrequentlyUsed, 0, 0), new flickcurl_cmd("tags.getRelated", "TAG", "Get a list of tags 'related' to TAG based on clustered usage analysis.", command_tags_getRelated, 1, 1), new flickcurl_cmd("test.echo", "KEY VALUE", "Test echo API call; echos KEY VALUE", command_test_echo, 2, 2), new flickcurl_cmd("test.login", "", "Test login API call: returns username", command_test_login, 0, 0), new flickcurl_cmd("test.null", "KEY VALUE", "Test null API call: no return", command_test_null, 0, 0), new flickcurl_cmd("urls.getGroup", "GROUP-ID", "Get the url of the group page for GROUP-ID.", command_urls_getGroup, 1, 1), new flickcurl_cmd("urls.getUserPhotos", "USER-NSID", "Get the url of the photo page for USER-NSID.", command_urls_getUserPhotos, 1, 1), new flickcurl_cmd("urls.getUserProfile", "USER-NSID", "Get the url of the profile page for USER-NSID.", command_urls_getUserProfile, 1, 1), new flickcurl_cmd("urls.lookupGroup", "URL", "Get a group NSID from the URL to a group's page or photo pool.", command_urls_lookupGroup, 1, 1), new flickcurl_cmd("urls.lookupUser", "URL", "Get a user NSID from the URL to a user's photo", command_urls_lookupUser, 1, 1), new flickcurl_cmd("upload", "FILE [PARAMS...]", "Upload a photo FILE with optional parameters PARAM or PARAM VALUE\n        title TITLE\n        description DESC\n        safety_level 'safe' (default) or 'moderate' or 'restricted'\n        content_type 'photo' (default) or screenshot' or 'other'\n        hidden 'public' (default) or 'hidden'\n        friend\n        public\n        family\n        tags TAGS... [must be last param]", command_upload, 1, 0), new flickcurl_cmd("replace", "FILE PHOTO-ID [async]", "Replace a photo PHOTO-ID with a new FILE (async)", command_replace, 2, 3), new flickcurl_cmd("shorturi", "PHOTO-ID", "Get the http://flic.kr short uri for PHOTO-ID", command_short_uri, 1, 1), new flickcurl_cmd("getphotoid", "IMAGE-URL", "Get the photo id from a raw flickr farm IMAGE-URL", command_source_uri_to_photoid, 1, 1), new flickcurl_cmd("oauth.create", "[CALLBACK]", "Create OAuth request token/secret pair and show the authentication URL", command_oauth_create, 0, 1), new flickcurl_cmd("oauth.verify", "REQUEST-TOKEN REQUEST-TOKEN-SECRET VERIFIER", "Verify an OAuth request from `oauth.create'", command_oauth_verify, 3, 3), new flickcurl_cmd("oauth.upgrade", "", "Upgrade legacy authentication to OAuth", command_oauth_upgrade, 0, 0), new flickcurl_cmd(((Object)0), ((Object)0), ((Object)0), ((Object)0), 0, 0)};
	public static int opterr;
	public static int optind;
	public static int optopt;
	public static byte optarg;
	public static raptor_syntax_description[] serializers = new raptor_syntax_description[]{{new raptor_syntax_description("ntriples", ((Object)0)), "N-Triples"}, {new raptor_syntax_description("turtle", ((Object)0)), "Turtle"}};
	public static int verbose = /* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickcurl utility - Invoke the Flickcurl library
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
	 *
	 * USAGE: flickcurl [OPTIONS] flickr-api-command args...
	 *
	 * ~/.flickcurl.conf should contain the authentication details in the form:
	 * [flickr]
	 * oauth_token=1234567-8901234567890123
	 * oauth_token_secret=fedcba9876543210
	 * oauth_client_key=0123456789abcdef0123456789abcdef
	 * oauth_client_secret=fedcba9876543210
	 *
	 * If the old Flickr auth is used the values will be:
	 * api_key=0123456789abcdef0123456789abcdef
	 * auth_token=1234567-8901234567890123
	 * secret=fedcba9876543210
	 *
	 * To authenticate from a FROB - to generate an auth_token from a FROB use:
	 *   flickcurl -a FROB
	 * FROB like 123-456-789
	 * which will write a new ~/.flickcurl.conf with the auth_token received
	 *
	 * API calls are invoked like:
	 *
	 * flickcurl test.echo KEY VALUE
	 *   This method does not require authentication.
	 * Echoes back the KEY and VALUE received - an API test.
	 *
	 * flickcurl photo.getinfo PHOTO-ID
	 *   PHOTO-ID like 123456789
	 *   This method does not require authentication.
	 *   -- http://www.flickr.com/services/api/flickr.photos.getInfo.html
	 * Gets information about a photo including its tags
	 *
	 * See the help message for full list of supported Flickr API Calls.
	 *
	 *//* many places for getopt *//* exported to commands.c */1;
	public static FILE output_fh = new FILE();
	public static byte output_filename = "<stdout>";
	public static int command_handler;
	public static int flickcurl_cmdline_init;
	public static Object flickcurl_cmdline_finish;
	public static byte flickcurl_cmdline_basename;
	public static int getopt;
	public static Object MD5Init;
	public static Object MD5Update;
	public static Object MD5Final;
	public static Object MD5Transform;
	public static byte MD5_string;
	public static int flickcurl_prepare;
	public static int flickcurl_prepare_noauth;
	public static int flickcurl_prepare_upload;
	public static  flickcurl_invoke = new ();
	public static byte flickcurl_invoke_get_content;
	public static byte flickcurl_invoke_get_form_content;
	public static Object flickcurl_free_form;
	public static Object flickcurl_free_arg;
	public static  flickcurl_build_args = new ();
	public static  flickcurl_build_blogs = new ();
	public static  flickcurl_build_blog_services = new ();
	public static  flickcurl_build_collections = new ();
	public static  flickcurl_build_collection = new ();
	public static Object flickcurl_error;
	public static byte flickcurl_unixtime_to_isotime;
	public static byte flickcurl_unixtime_to_sqltimestamp;
	public static byte flickcurl_sqltimestamp_to_isotime;
	public static byte flickcurl_xpath_eval;
	public static byte flickcurl_xpath_eval_to_tree_string;
	public static byte flickcurl_call_get_one_string_field;
	public static int flickcurl_append_photos_list_params;
	public static Object flickcurl_init_params;
	public static Object flickcurl_add_param;
	public static Object flickcurl_end_params;
	public static  flickcurl_build_activities = new ();
	public static  flickcurl_build_categories = new ();
	public static  flickcurl_build_comments = new ();
	public static  flickcurl_build_contacts = new ();
	public static  flickcurl_build_contexts = new ();
	public static  flickcurl_build_exifs = new ();
	public static  flickcurl_build_galleries = new ();
	public static  flickcurl_build_groups = new ();
	public static  flickcurl_build_institutions = new ();
	public static  flickcurl_build_institution = new ();
	public static  flickcurl_build_location = new ();
	public static  flickcurl_build_tag_namespaces = new ();
	public static  flickcurl_build_tag_namespace = new ();
	public static  flickcurl_build_tag_predicate_values = new ();
	public static  flickcurl_build_user_upload_status = new ();
	public static  flickcurl_build_members = new ();
	public static  flickcurl_build_method = new ();
	public static Object flickcurl_free_note;
	public static  flickcurl_build_notes = new ();
	public static  flickcurl_build_perms = new ();
	public static  flickcurl_build_persons = new ();
	public static  flickcurl_build_person = new ();
	public static  flickcurl_new_photos_list = new ();
	public static  flickcurl_build_photos = new ();
	public static  flickcurl_build_photo = new ();
	public static  flickcurl_invoke_photos_list = new ();
	public static  flickcurl_build_photosets = new ();
	public static  flickcurl_build_photoset = new ();
	public static  flickcurl_build_places = new ();
	public static  flickcurl_build_place = new ();
	public static  flickcurl_build_place_types = new ();
	public static  flickcurl_build_shapes = new ();
	public static  flickcurl_build_shape = new ();
	public static  flickcurl_build_sizes = new ();
	public static  flickcurl_build_stats = new ();
	public static  flickcurl_build_tags = new ();
	public static  flickcurl_build_tags_from_string = new ();
	public static  flickcurl_build_tag_clusters = new ();
	public static  flickcurl_build_tickets = new ();
	public static  flickcurl_build_video = new ();
	public static flickcurl_chunk_s flickcurl_chunk = new flickcurl_chunk_s();
	public static Object flickcurl_serializer_init;
	public static Object flickcurl_serializer_terminate;
	public static byte flickcurl_hmac_sha1;
	public static int flickcurl_legacy_prepare_common;
	public static Object flickcurl_oauth_free;
	public static byte flickcurl_oauth_compute_signature;
	public static int flickcurl_oauth_prepare_common;
	public static byte[] flickcurl_accuracy_labels = new byte[]{"world", "world", "country", "country", "country", "region", "region", "region", "region", "region", "city", "city", "city", "city", "city", "street"/**
	 * flickcurl_get_location_accuracy_label:
	 * @accuracy: accuracy
	 *
	 * Get label for an accuracy
	 *
	 * Return value: label string or NULL if none valid
	 */};
	public static byte[] flickcurl_field_value_type_label = new byte[]{"(none)", "photo id", "photo URI", "unix time", "boolean", "dateTime", "float", "integer", "string", "uri", "<internal>person ID", "<internal>media type", "<internal>tag string", "<internal>collection id", "<internal>icon photos"/**
	 * flickcurl_get_field_value_type_label:
	 * @datatype: datatype enum
	 *
	 * Get label for datatype
	 *
	 * Return value: label string or NULL if none valid
	 */};
	public static byte[] flickcurl_content_type_labels = new byte[]{"unknown", "photo", "screenshot", "other"/**
	 * flickcurl_get_content_type_label:
	 * @content_type: safety level index
	 * 
	 * Get label for a content type.
	 *
	 * Return value: pointer to shared string label for content type or "unknown"
	 **/};
	public static byte[] flickcurl_safety_level_labels = new byte[]{"unknown", "safe", "moderate", "restricted", "(no change)"/**
	 * flickcurl_get_safety_level_label:
	 * @safety_level: safety level index
	 * 
	 * Get label for a safety level.
	 *
	 * Return value: pointer to shared string label for safety level or "unknown"
	 **/};
	public static byte[] flickcurl_hidden_labels = new byte[]{"unknown", "public", "hidden"/**
	 * flickcurl_get_hidden_label:
	 * @hidden: safety level index
	 * 
	 * Get label for a hidden status
	 *
	 * Return value: pointer to shared string label for hidden status or "unknown"
	 **/};
	public static byte[] flickcurl_institution_url_type_label = new byte[]{"(none)", "site", "license", "flickr"/**
	 * flickcurl_get_institution_url_type_label:
	 * @url_type: institution url enum
	 *
	 * Get label for institution url type
	 *
	 * Return value: label string or NULL if none valid
	 */};
	public static byte[] flickcurl_person_field_label = new byte[]{"(none)", "isadmin", "ispro", "iconserver", "iconfarm", "username", "realname", "mbox_sha1sum", "location", "photosurl", "profileurl", "mobileurl", "photos_firstdate", "photos_firstdatetaken", "photos_count", "photos_views", "favedate"/**
	 * flickcurl_get_person_field_label:
	 * @field: field enum
	 *
	 * Get label for person field
	 *
	 * Return value: label string or NULL if none valid
	 */};
	public static Object raptor_world;
	public static byte raptor_uri;
	public static raptor_world raptor_new_world = new raptor_world();
	public static int raptor_world_open;
	public static Object raptor_free_world;
	public static int raptor_world_is_serializer_name;
	public static raptor_syntax_description raptor_world_get_serializer_description = new raptor_syntax_description();
	public static raptor_uri raptor_new_uri = new raptor_uri();
	public static raptor_uri raptor_new_uri_from_uri_local_name = new raptor_uri();
	public static raptor_uri raptor_new_uri_from_uri = new raptor_uri();
	public static Object raptor_free_uri;
	public static raptor_term raptor_new_term_from_blank = new raptor_term();
	public static raptor_term raptor_new_term_from_uri_string = new raptor_term();
	public static raptor_term raptor_new_term_from_uri = new raptor_term();
	public static raptor_term raptor_new_term_from_literal = new raptor_term();
	public static Object raptor_free_term;
	public static raptor_serializer raptor_new_serializer = new raptor_serializer();
	public static Object raptor_free_serializer;
	public static Object raptor_serializer_set_namespace;
	public static Object raptor_serializer_start_to_file_handle;
	public static Object raptor_serializer_serialize_statement;
	public static Object raptor_serializer_serialize_end;
	public static Object raptor_statement_init;
	public static Object raptor_statement_clear;
	public static flickrdf_nspace_s flickrdf_nspace = new flickrdf_nspace_s();
	public static flickrdf_nspace[] namespace_table = new flickrdf_nspace[]{new flickrdf_nspace((byte)"a", (byte)"http://www.w3.org/2000/10/annotation-ns"), new flickrdf_nspace((byte)"acl", (byte)"http://www.w3.org/2001/02/acls#"), new flickrdf_nspace((byte)"blue", (byte)"http://machinetags.org/ns/Blue#"), new flickrdf_nspace((byte)"cell", (byte)"http://machinetags.org/ns/Cell#"), new flickrdf_nspace((byte)"dc", (byte)"http://purl.org/dc/elements/1.1/"), new flickrdf_nspace((byte)"dcterms", (byte)"http://purl.org/dc/terms/"), new flickrdf_nspace((byte)"dopplr", (byte)"http://machinetags.org/ns/Dopplr#"), new flickrdf_nspace((byte)"exif", (byte)"http://nwalsh.com/rdf/exif#"), new flickrdf_nspace((byte)"exifi", (byte)"http://nwalsh.com/rdf/exif-intrinsic#"), new flickrdf_nspace((byte)"flickr", (byte)"http://machinetags.org/ns/Flickr#"), new flickrdf_nspace((byte)"filtr", (byte)"http://machinetags.org/ns/Filtr#"), new flickrdf_nspace((byte)"foaf", (byte)"http://xmlns.com/foaf/0.1/"), new flickrdf_nspace((byte)"geo", (byte)"http://www.w3.org/2003/01/geo/wgs84_pos#"), new flickrdf_nspace((byte)"geonames", (byte)"http://machinetags.org/ns/Geonames#"), new flickrdf_nspace((byte)"i", (byte)"http://www.w3.org/2004/02/image-regions#"), new flickrdf_nspace((byte)"ph", (byte)"http://machinetags.org/ns/Ph#"), new flickrdf_nspace((byte)"places", (byte)"http://machinetags.org/ns/Places#"), new flickrdf_nspace((byte)"rdf", (byte)"http://www.w3.org/1999/02/22-rdf-syntax-ns#"), new flickrdf_nspace((byte)"rdfs", (byte)"http://www.w3.org/2000/01/rdf-schema#"), new flickrdf_nspace((byte)"skos", (byte)"http://www.w3.org/2004/02/skos/core"), new flickrdf_nspace((byte)"upcoming", (byte)"http://machinetags.org/ns/Upcoming#"), new flickrdf_nspace((byte)"xsd", (byte)"http://www.w3.org/2001/XMLSchema#"), new flickrdf_nspace(((Object)0), ((Object)0))};
	public static int debug = /* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickrdf - Triples from Flickrs
	 *
	 * Copyright (C) 2011-2012, David Beckett http://www.dajobe.org/
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
	 *
	 * USAGE: flickrdf [OPTIONS] FLICKR-PHOTO-URI
	 *
	 *
	 *//* many places for getopt */0;
	public static raptor_world rworld = new raptor_world();
	public static flickcurl_serializer_factory flickrdf_serializer_factory = new flickcurl_serializer_factory(1, ser_emit_namespace, ser_emit_triple, ser_emit_finish);
	public static byte[] flickcurl_place_type_label = new byte[]{"location", "neighbourhood", "locality", "county", "region", "country", "continent"/**
	 * flickcurl_get_place_type_label:
	 * @place_type: place type
	 *
	 * Get label for a place type
	 *
	 * Return value: label string or NULL if none valid
	 */};
	
	
	public static  flickcurl_favorites_getList2_params(flickcurl_s fc, Object user_id, Object min_fave_date, Object max_fave_date,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (/* API parameters */user_id) {
			fc.flickcurl_add_param("user_id", user_id);
		} 
		if (min_fave_date) {
			fc.flickcurl_add_param("min_fave_date", min_fave_date);
		} 
		if (max_fave_date) {
			fc.flickcurl_add_param("max_fave_date", max_fave_date);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.favorites.getList")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_favorites_getList2:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch the favorites list for. If this argument is omitted, the favorites list for the calling user is returned. (or NULL)
		 * @min_fave_date: Minimum date that a photo was favorited on. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_fave_date: Maximum date that a photo was favorited on. The date should be in the form of a unix timestamp. (or NULL)
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: license, date_upload, date_taken, owner_name, icon_server, original_format, last_update, geo, tags, machine_tags. (or NULL)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or NULL)
		 * 
		 * Returns a list of the user's favorite photos.
		 *
		 * See flickcurl_favorites_getList2_params() for details of parameters.
		 *
		 * Implements flickr.favorites.getList (1.27)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static  flickcurl_favorites_getList_params(flickcurl_s fc, Object user_id,  list_params) {
		return ModernizedCProgram.flickcurl_favorites_getList2_params(fc, user_id, ((Object)/* min_fave_date */0), ((Object)/* max_fave_date */0), list_params/**
		 * flickcurl_favorites_getList:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch the favorites list for. If this argument is omitted, the favorites list for the calling user is returned. (or NULL)
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: license, date_upload, date_taken, owner_name, icon_server, original_format, last_update, geo, tags, machine_tags. (or NULL)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or NULL)
		 *
		 * Returns a list of the user's favorite photos.
		 *
		 * See flickcurl_favorites_getList2_params() for details of parameters.
		 *
		 * Deprecated for @flickcurl_favorites_getList2 that adds newer parameters.
		 *
		 * Return value: non-0 on failure
		 **/);
	}
	public static  flickcurl_favorites_getPublicList_params(flickcurl_s fc, Object user_id,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("user_id", /* API parameters */user_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.favorites.getPublicList")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_favorites_getPublicList:
		 * @fc: flickcurl context
		 * @user_id: The user to fetch the favorites list for.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: license, date_upload, date_taken, owner_name, icon_server, original_format, last_update, geo, tags, machine_tags. (or NULL)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or NULL)
		 * 
		 * Returns a list of favorite public photos for the given user.
		 *
		 * See flickcurl_favorites_getPublicList_params() for details of parameters.
		 *
		 * Implements flickr.favorites.getPublicList (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * members.c - Flickcurl method member functions
	 *
	 * Copyright (C) 2009, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_member:
	 * @member_object: member object
	 *
	 * Destructor for member object
	 */
	public static void flickcurl_free_member() {
		do {
			if (!member_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_member is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\members.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedNsid = this.getNsid();
		if (generatedNsid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedNsid);
		} 
		Object generatedUsername = this.getUsername();
		if (generatedUsername) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUsername);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(member_object/**
		 * flickcurl_free_members:
		 * @members_object: member object array
		 *
		 * Destructor for array of member object
		 */);
	}
	public static void flickcurl_free_members() {
		int i;
		do {
			if (!members_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_member is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\members.c", 68, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; members_object[i]; i++) {
			members_object[i].flickcurl_free_member();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(members_object);
	}
	public static void SHA1Transform(Object[] state, Object buffer) {
		uint32_t a = new uint32_t();
		uint32_t b = new uint32_t();
		uint32_t c = new uint32_t();
		uint32_t d = new uint32_t();
		uint32_t e = new uint32_t();
		Object CHAR64LONG16;
		CHAR64LONG16 block = new CHAR64LONG16();
		block = (CHAR64LONG16)buffer;
		a = state[/* Copy context->state[] to working vars */0];
		b = state[1];
		c = state[2];
		d = state[3];
		e = state[4];
		Object generatedL = block.getL();
		e += ((b & (c ^ d)) ^ d) + (generatedL[0] = ((((generatedL[0]) << (true)) | ((generatedL[0]) >> (32 - (true)))) & -1024) | ((((generatedL[0]) << (true)) | ((generatedL[0]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (generatedL[1] = ((((generatedL[1]) << (true)) | ((generatedL[1]) >> (32 - (true)))) & -1024) | ((((generatedL[1]) << (true)) | ((generatedL[1]) >> (32 - (true)))) & -1024)) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (generatedL[2] = ((((generatedL[2]) << (true)) | ((generatedL[2]) >> (32 - (true)))) & -1024) | ((((generatedL[2]) << (true)) | ((generatedL[2]) >> (32 - (true)))) & -1024)) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (generatedL[3] = ((((generatedL[3]) << (true)) | ((generatedL[3]) >> (32 - (true)))) & -1024) | ((((generatedL[3]) << (true)) | ((generatedL[3]) >> (32 - (true)))) & -1024)) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (/* 4 rounds of 20 operations each. Loop unrolled. */true))));
		;
		a += ((c & (d ^ e)) ^ e) + (generatedL[4] = ((((generatedL[4]) << (true)) | ((generatedL[4]) >> (32 - (true)))) & -1024) | ((((generatedL[4]) << (true)) | ((generatedL[4]) >> (32 - (true)))) & -1024)) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += ((b & (c ^ d)) ^ d) + (generatedL[5] = ((((generatedL[5]) << (true)) | ((generatedL[5]) >> (32 - (true)))) & -1024) | ((((generatedL[5]) << (true)) | ((generatedL[5]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (generatedL[6] = ((((generatedL[6]) << (true)) | ((generatedL[6]) >> (32 - (true)))) & -1024) | ((((generatedL[6]) << (true)) | ((generatedL[6]) >> (32 - (true)))) & -1024)) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (generatedL[7] = ((((generatedL[7]) << (true)) | ((generatedL[7]) >> (32 - (true)))) & -1024) | ((((generatedL[7]) << (true)) | ((generatedL[7]) >> (32 - (true)))) & -1024)) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (generatedL[8] = ((((generatedL[8]) << (true)) | ((generatedL[8]) >> (32 - (true)))) & -1024) | ((((generatedL[8]) << (true)) | ((generatedL[8]) >> (32 - (true)))) & -1024)) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += ((c & (d ^ e)) ^ e) + (generatedL[9] = ((((generatedL[9]) << (true)) | ((generatedL[9]) >> (32 - (true)))) & -1024) | ((((generatedL[9]) << (true)) | ((generatedL[9]) >> (32 - (true)))) & -1024)) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += ((b & (c ^ d)) ^ d) + (generatedL[10] = ((((generatedL[10]) << (true)) | ((generatedL[10]) >> (32 - (true)))) & -1024) | ((((generatedL[10]) << (true)) | ((generatedL[10]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (generatedL[11] = ((((generatedL[11]) << (true)) | ((generatedL[11]) >> (32 - (true)))) & -1024) | ((((generatedL[11]) << (true)) | ((generatedL[11]) >> (32 - (true)))) & -1024)) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (generatedL[12] = ((((generatedL[12]) << (true)) | ((generatedL[12]) >> (32 - (true)))) & -1024) | ((((generatedL[12]) << (true)) | ((generatedL[12]) >> (32 - (true)))) & -1024)) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (generatedL[13] = ((((generatedL[13]) << (true)) | ((generatedL[13]) >> (32 - (true)))) & -1024) | ((((generatedL[13]) << (true)) | ((generatedL[13]) >> (32 - (true)))) & -1024)) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += ((c & (d ^ e)) ^ e) + (generatedL[14] = ((((generatedL[14]) << (true)) | ((generatedL[14]) >> (32 - (true)))) & -1024) | ((((generatedL[14]) << (true)) | ((generatedL[14]) >> (32 - (true)))) & -1024)) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += ((b & (c ^ d)) ^ d) + (generatedL[15] = ((((generatedL[15]) << (true)) | ((generatedL[15]) >> (32 - (true)))) & -1024) | ((((generatedL[15]) << (true)) | ((generatedL[15]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (generatedL[16 & 15] = (((generatedL[(16 + 13) & 15] ^ generatedL[(16 + 8) & 15] ^ generatedL[(16 + 2) & 15] ^ generatedL[16 & 15]) << (true)) | ((generatedL[(16 + 13) & 15] ^ generatedL[(16 + 8) & 15] ^ generatedL[(16 + 2) & 15] ^ generatedL[16 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (generatedL[17 & 15] = (((generatedL[(17 + 13) & 15] ^ generatedL[(17 + 8) & 15] ^ generatedL[(17 + 2) & 15] ^ generatedL[17 & 15]) << (true)) | ((generatedL[(17 + 13) & 15] ^ generatedL[(17 + 8) & 15] ^ generatedL[(17 + 2) & 15] ^ generatedL[17 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (generatedL[18 & 15] = (((generatedL[(18 + 13) & 15] ^ generatedL[(18 + 8) & 15] ^ generatedL[(18 + 2) & 15] ^ generatedL[18 & 15]) << (true)) | ((generatedL[(18 + 13) & 15] ^ generatedL[(18 + 8) & 15] ^ generatedL[(18 + 2) & 15] ^ generatedL[18 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += ((c & (d ^ e)) ^ e) + (generatedL[19 & 15] = (((generatedL[(19 + 13) & 15] ^ generatedL[(19 + 8) & 15] ^ generatedL[(19 + 2) & 15] ^ generatedL[19 & 15]) << (true)) | ((generatedL[(19 + 13) & 15] ^ generatedL[(19 + 8) & 15] ^ generatedL[(19 + 2) & 15] ^ generatedL[19 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[20 & 15] = (((generatedL[(20 + 13) & 15] ^ generatedL[(20 + 8) & 15] ^ generatedL[(20 + 2) & 15] ^ generatedL[20 & 15]) << (true)) | ((generatedL[(20 + 13) & 15] ^ generatedL[(20 + 8) & 15] ^ generatedL[(20 + 2) & 15] ^ generatedL[20 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[21 & 15] = (((generatedL[(21 + 13) & 15] ^ generatedL[(21 + 8) & 15] ^ generatedL[(21 + 2) & 15] ^ generatedL[21 & 15]) << (true)) | ((generatedL[(21 + 13) & 15] ^ generatedL[(21 + 8) & 15] ^ generatedL[(21 + 2) & 15] ^ generatedL[21 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[22 & 15] = (((generatedL[(22 + 13) & 15] ^ generatedL[(22 + 8) & 15] ^ generatedL[(22 + 2) & 15] ^ generatedL[22 & 15]) << (true)) | ((generatedL[(22 + 13) & 15] ^ generatedL[(22 + 8) & 15] ^ generatedL[(22 + 2) & 15] ^ generatedL[22 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[23 & 15] = (((generatedL[(23 + 13) & 15] ^ generatedL[(23 + 8) & 15] ^ generatedL[(23 + 2) & 15] ^ generatedL[23 & 15]) << (true)) | ((generatedL[(23 + 13) & 15] ^ generatedL[(23 + 8) & 15] ^ generatedL[(23 + 2) & 15] ^ generatedL[23 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[24 & 15] = (((generatedL[(24 + 13) & 15] ^ generatedL[(24 + 8) & 15] ^ generatedL[(24 + 2) & 15] ^ generatedL[24 & 15]) << (true)) | ((generatedL[(24 + 13) & 15] ^ generatedL[(24 + 8) & 15] ^ generatedL[(24 + 2) & 15] ^ generatedL[24 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[25 & 15] = (((generatedL[(25 + 13) & 15] ^ generatedL[(25 + 8) & 15] ^ generatedL[(25 + 2) & 15] ^ generatedL[25 & 15]) << (true)) | ((generatedL[(25 + 13) & 15] ^ generatedL[(25 + 8) & 15] ^ generatedL[(25 + 2) & 15] ^ generatedL[25 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[26 & 15] = (((generatedL[(26 + 13) & 15] ^ generatedL[(26 + 8) & 15] ^ generatedL[(26 + 2) & 15] ^ generatedL[26 & 15]) << (true)) | ((generatedL[(26 + 13) & 15] ^ generatedL[(26 + 8) & 15] ^ generatedL[(26 + 2) & 15] ^ generatedL[26 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[27 & 15] = (((generatedL[(27 + 13) & 15] ^ generatedL[(27 + 8) & 15] ^ generatedL[(27 + 2) & 15] ^ generatedL[27 & 15]) << (true)) | ((generatedL[(27 + 13) & 15] ^ generatedL[(27 + 8) & 15] ^ generatedL[(27 + 2) & 15] ^ generatedL[27 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[28 & 15] = (((generatedL[(28 + 13) & 15] ^ generatedL[(28 + 8) & 15] ^ generatedL[(28 + 2) & 15] ^ generatedL[28 & 15]) << (true)) | ((generatedL[(28 + 13) & 15] ^ generatedL[(28 + 8) & 15] ^ generatedL[(28 + 2) & 15] ^ generatedL[28 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[29 & 15] = (((generatedL[(29 + 13) & 15] ^ generatedL[(29 + 8) & 15] ^ generatedL[(29 + 2) & 15] ^ generatedL[29 & 15]) << (true)) | ((generatedL[(29 + 13) & 15] ^ generatedL[(29 + 8) & 15] ^ generatedL[(29 + 2) & 15] ^ generatedL[29 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[30 & 15] = (((generatedL[(30 + 13) & 15] ^ generatedL[(30 + 8) & 15] ^ generatedL[(30 + 2) & 15] ^ generatedL[30 & 15]) << (true)) | ((generatedL[(30 + 13) & 15] ^ generatedL[(30 + 8) & 15] ^ generatedL[(30 + 2) & 15] ^ generatedL[30 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[31 & 15] = (((generatedL[(31 + 13) & 15] ^ generatedL[(31 + 8) & 15] ^ generatedL[(31 + 2) & 15] ^ generatedL[31 & 15]) << (true)) | ((generatedL[(31 + 13) & 15] ^ generatedL[(31 + 8) & 15] ^ generatedL[(31 + 2) & 15] ^ generatedL[31 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[32 & 15] = (((generatedL[(32 + 13) & 15] ^ generatedL[(32 + 8) & 15] ^ generatedL[(32 + 2) & 15] ^ generatedL[32 & 15]) << (true)) | ((generatedL[(32 + 13) & 15] ^ generatedL[(32 + 8) & 15] ^ generatedL[(32 + 2) & 15] ^ generatedL[32 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[33 & 15] = (((generatedL[(33 + 13) & 15] ^ generatedL[(33 + 8) & 15] ^ generatedL[(33 + 2) & 15] ^ generatedL[33 & 15]) << (true)) | ((generatedL[(33 + 13) & 15] ^ generatedL[(33 + 8) & 15] ^ generatedL[(33 + 2) & 15] ^ generatedL[33 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[34 & 15] = (((generatedL[(34 + 13) & 15] ^ generatedL[(34 + 8) & 15] ^ generatedL[(34 + 2) & 15] ^ generatedL[34 & 15]) << (true)) | ((generatedL[(34 + 13) & 15] ^ generatedL[(34 + 8) & 15] ^ generatedL[(34 + 2) & 15] ^ generatedL[34 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[35 & 15] = (((generatedL[(35 + 13) & 15] ^ generatedL[(35 + 8) & 15] ^ generatedL[(35 + 2) & 15] ^ generatedL[35 & 15]) << (true)) | ((generatedL[(35 + 13) & 15] ^ generatedL[(35 + 8) & 15] ^ generatedL[(35 + 2) & 15] ^ generatedL[35 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[36 & 15] = (((generatedL[(36 + 13) & 15] ^ generatedL[(36 + 8) & 15] ^ generatedL[(36 + 2) & 15] ^ generatedL[36 & 15]) << (true)) | ((generatedL[(36 + 13) & 15] ^ generatedL[(36 + 8) & 15] ^ generatedL[(36 + 2) & 15] ^ generatedL[36 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[37 & 15] = (((generatedL[(37 + 13) & 15] ^ generatedL[(37 + 8) & 15] ^ generatedL[(37 + 2) & 15] ^ generatedL[37 & 15]) << (true)) | ((generatedL[(37 + 13) & 15] ^ generatedL[(37 + 8) & 15] ^ generatedL[(37 + 2) & 15] ^ generatedL[37 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[38 & 15] = (((generatedL[(38 + 13) & 15] ^ generatedL[(38 + 8) & 15] ^ generatedL[(38 + 2) & 15] ^ generatedL[38 & 15]) << (true)) | ((generatedL[(38 + 13) & 15] ^ generatedL[(38 + 8) & 15] ^ generatedL[(38 + 2) & 15] ^ generatedL[38 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[39 & 15] = (((generatedL[(39 + 13) & 15] ^ generatedL[(39 + 8) & 15] ^ generatedL[(39 + 2) & 15] ^ generatedL[39 & 15]) << (true)) | ((generatedL[(39 + 13) & 15] ^ generatedL[(39 + 8) & 15] ^ generatedL[(39 + 2) & 15] ^ generatedL[39 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (generatedL[40 & 15] = (((generatedL[(40 + 13) & 15] ^ generatedL[(40 + 8) & 15] ^ generatedL[(40 + 2) & 15] ^ generatedL[40 & 15]) << (true)) | ((generatedL[(40 + 13) & 15] ^ generatedL[(40 + 8) & 15] ^ generatedL[(40 + 2) & 15] ^ generatedL[40 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (generatedL[41 & 15] = (((generatedL[(41 + 13) & 15] ^ generatedL[(41 + 8) & 15] ^ generatedL[(41 + 2) & 15] ^ generatedL[41 & 15]) << (true)) | ((generatedL[(41 + 13) & 15] ^ generatedL[(41 + 8) & 15] ^ generatedL[(41 + 2) & 15] ^ generatedL[41 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (generatedL[42 & 15] = (((generatedL[(42 + 13) & 15] ^ generatedL[(42 + 8) & 15] ^ generatedL[(42 + 2) & 15] ^ generatedL[42 & 15]) << (true)) | ((generatedL[(42 + 13) & 15] ^ generatedL[(42 + 8) & 15] ^ generatedL[(42 + 2) & 15] ^ generatedL[42 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (generatedL[43 & 15] = (((generatedL[(43 + 13) & 15] ^ generatedL[(43 + 8) & 15] ^ generatedL[(43 + 2) & 15] ^ generatedL[43 & 15]) << (true)) | ((generatedL[(43 + 13) & 15] ^ generatedL[(43 + 8) & 15] ^ generatedL[(43 + 2) & 15] ^ generatedL[43 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (generatedL[44 & 15] = (((generatedL[(44 + 13) & 15] ^ generatedL[(44 + 8) & 15] ^ generatedL[(44 + 2) & 15] ^ generatedL[44 & 15]) << (true)) | ((generatedL[(44 + 13) & 15] ^ generatedL[(44 + 8) & 15] ^ generatedL[(44 + 2) & 15] ^ generatedL[44 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (generatedL[45 & 15] = (((generatedL[(45 + 13) & 15] ^ generatedL[(45 + 8) & 15] ^ generatedL[(45 + 2) & 15] ^ generatedL[45 & 15]) << (true)) | ((generatedL[(45 + 13) & 15] ^ generatedL[(45 + 8) & 15] ^ generatedL[(45 + 2) & 15] ^ generatedL[45 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (generatedL[46 & 15] = (((generatedL[(46 + 13) & 15] ^ generatedL[(46 + 8) & 15] ^ generatedL[(46 + 2) & 15] ^ generatedL[46 & 15]) << (true)) | ((generatedL[(46 + 13) & 15] ^ generatedL[(46 + 8) & 15] ^ generatedL[(46 + 2) & 15] ^ generatedL[46 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (generatedL[47 & 15] = (((generatedL[(47 + 13) & 15] ^ generatedL[(47 + 8) & 15] ^ generatedL[(47 + 2) & 15] ^ generatedL[47 & 15]) << (true)) | ((generatedL[(47 + 13) & 15] ^ generatedL[(47 + 8) & 15] ^ generatedL[(47 + 2) & 15] ^ generatedL[47 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (generatedL[48 & 15] = (((generatedL[(48 + 13) & 15] ^ generatedL[(48 + 8) & 15] ^ generatedL[(48 + 2) & 15] ^ generatedL[48 & 15]) << (true)) | ((generatedL[(48 + 13) & 15] ^ generatedL[(48 + 8) & 15] ^ generatedL[(48 + 2) & 15] ^ generatedL[48 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (generatedL[49 & 15] = (((generatedL[(49 + 13) & 15] ^ generatedL[(49 + 8) & 15] ^ generatedL[(49 + 2) & 15] ^ generatedL[49 & 15]) << (true)) | ((generatedL[(49 + 13) & 15] ^ generatedL[(49 + 8) & 15] ^ generatedL[(49 + 2) & 15] ^ generatedL[49 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (generatedL[50 & 15] = (((generatedL[(50 + 13) & 15] ^ generatedL[(50 + 8) & 15] ^ generatedL[(50 + 2) & 15] ^ generatedL[50 & 15]) << (true)) | ((generatedL[(50 + 13) & 15] ^ generatedL[(50 + 8) & 15] ^ generatedL[(50 + 2) & 15] ^ generatedL[50 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (generatedL[51 & 15] = (((generatedL[(51 + 13) & 15] ^ generatedL[(51 + 8) & 15] ^ generatedL[(51 + 2) & 15] ^ generatedL[51 & 15]) << (true)) | ((generatedL[(51 + 13) & 15] ^ generatedL[(51 + 8) & 15] ^ generatedL[(51 + 2) & 15] ^ generatedL[51 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (generatedL[52 & 15] = (((generatedL[(52 + 13) & 15] ^ generatedL[(52 + 8) & 15] ^ generatedL[(52 + 2) & 15] ^ generatedL[52 & 15]) << (true)) | ((generatedL[(52 + 13) & 15] ^ generatedL[(52 + 8) & 15] ^ generatedL[(52 + 2) & 15] ^ generatedL[52 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (generatedL[53 & 15] = (((generatedL[(53 + 13) & 15] ^ generatedL[(53 + 8) & 15] ^ generatedL[(53 + 2) & 15] ^ generatedL[53 & 15]) << (true)) | ((generatedL[(53 + 13) & 15] ^ generatedL[(53 + 8) & 15] ^ generatedL[(53 + 2) & 15] ^ generatedL[53 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (generatedL[54 & 15] = (((generatedL[(54 + 13) & 15] ^ generatedL[(54 + 8) & 15] ^ generatedL[(54 + 2) & 15] ^ generatedL[54 & 15]) << (true)) | ((generatedL[(54 + 13) & 15] ^ generatedL[(54 + 8) & 15] ^ generatedL[(54 + 2) & 15] ^ generatedL[54 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (generatedL[55 & 15] = (((generatedL[(55 + 13) & 15] ^ generatedL[(55 + 8) & 15] ^ generatedL[(55 + 2) & 15] ^ generatedL[55 & 15]) << (true)) | ((generatedL[(55 + 13) & 15] ^ generatedL[(55 + 8) & 15] ^ generatedL[(55 + 2) & 15] ^ generatedL[55 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (generatedL[56 & 15] = (((generatedL[(56 + 13) & 15] ^ generatedL[(56 + 8) & 15] ^ generatedL[(56 + 2) & 15] ^ generatedL[56 & 15]) << (true)) | ((generatedL[(56 + 13) & 15] ^ generatedL[(56 + 8) & 15] ^ generatedL[(56 + 2) & 15] ^ generatedL[56 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (generatedL[57 & 15] = (((generatedL[(57 + 13) & 15] ^ generatedL[(57 + 8) & 15] ^ generatedL[(57 + 2) & 15] ^ generatedL[57 & 15]) << (true)) | ((generatedL[(57 + 13) & 15] ^ generatedL[(57 + 8) & 15] ^ generatedL[(57 + 2) & 15] ^ generatedL[57 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (generatedL[58 & 15] = (((generatedL[(58 + 13) & 15] ^ generatedL[(58 + 8) & 15] ^ generatedL[(58 + 2) & 15] ^ generatedL[58 & 15]) << (true)) | ((generatedL[(58 + 13) & 15] ^ generatedL[(58 + 8) & 15] ^ generatedL[(58 + 2) & 15] ^ generatedL[58 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (generatedL[59 & 15] = (((generatedL[(59 + 13) & 15] ^ generatedL[(59 + 8) & 15] ^ generatedL[(59 + 2) & 15] ^ generatedL[59 & 15]) << (true)) | ((generatedL[(59 + 13) & 15] ^ generatedL[(59 + 8) & 15] ^ generatedL[(59 + 2) & 15] ^ generatedL[59 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[60 & 15] = (((generatedL[(60 + 13) & 15] ^ generatedL[(60 + 8) & 15] ^ generatedL[(60 + 2) & 15] ^ generatedL[60 & 15]) << (true)) | ((generatedL[(60 + 13) & 15] ^ generatedL[(60 + 8) & 15] ^ generatedL[(60 + 2) & 15] ^ generatedL[60 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[61 & 15] = (((generatedL[(61 + 13) & 15] ^ generatedL[(61 + 8) & 15] ^ generatedL[(61 + 2) & 15] ^ generatedL[61 & 15]) << (true)) | ((generatedL[(61 + 13) & 15] ^ generatedL[(61 + 8) & 15] ^ generatedL[(61 + 2) & 15] ^ generatedL[61 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[62 & 15] = (((generatedL[(62 + 13) & 15] ^ generatedL[(62 + 8) & 15] ^ generatedL[(62 + 2) & 15] ^ generatedL[62 & 15]) << (true)) | ((generatedL[(62 + 13) & 15] ^ generatedL[(62 + 8) & 15] ^ generatedL[(62 + 2) & 15] ^ generatedL[62 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[63 & 15] = (((generatedL[(63 + 13) & 15] ^ generatedL[(63 + 8) & 15] ^ generatedL[(63 + 2) & 15] ^ generatedL[63 & 15]) << (true)) | ((generatedL[(63 + 13) & 15] ^ generatedL[(63 + 8) & 15] ^ generatedL[(63 + 2) & 15] ^ generatedL[63 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[64 & 15] = (((generatedL[(64 + 13) & 15] ^ generatedL[(64 + 8) & 15] ^ generatedL[(64 + 2) & 15] ^ generatedL[64 & 15]) << (true)) | ((generatedL[(64 + 13) & 15] ^ generatedL[(64 + 8) & 15] ^ generatedL[(64 + 2) & 15] ^ generatedL[64 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[65 & 15] = (((generatedL[(65 + 13) & 15] ^ generatedL[(65 + 8) & 15] ^ generatedL[(65 + 2) & 15] ^ generatedL[65 & 15]) << (true)) | ((generatedL[(65 + 13) & 15] ^ generatedL[(65 + 8) & 15] ^ generatedL[(65 + 2) & 15] ^ generatedL[65 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[66 & 15] = (((generatedL[(66 + 13) & 15] ^ generatedL[(66 + 8) & 15] ^ generatedL[(66 + 2) & 15] ^ generatedL[66 & 15]) << (true)) | ((generatedL[(66 + 13) & 15] ^ generatedL[(66 + 8) & 15] ^ generatedL[(66 + 2) & 15] ^ generatedL[66 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[67 & 15] = (((generatedL[(67 + 13) & 15] ^ generatedL[(67 + 8) & 15] ^ generatedL[(67 + 2) & 15] ^ generatedL[67 & 15]) << (true)) | ((generatedL[(67 + 13) & 15] ^ generatedL[(67 + 8) & 15] ^ generatedL[(67 + 2) & 15] ^ generatedL[67 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[68 & 15] = (((generatedL[(68 + 13) & 15] ^ generatedL[(68 + 8) & 15] ^ generatedL[(68 + 2) & 15] ^ generatedL[68 & 15]) << (true)) | ((generatedL[(68 + 13) & 15] ^ generatedL[(68 + 8) & 15] ^ generatedL[(68 + 2) & 15] ^ generatedL[68 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[69 & 15] = (((generatedL[(69 + 13) & 15] ^ generatedL[(69 + 8) & 15] ^ generatedL[(69 + 2) & 15] ^ generatedL[69 & 15]) << (true)) | ((generatedL[(69 + 13) & 15] ^ generatedL[(69 + 8) & 15] ^ generatedL[(69 + 2) & 15] ^ generatedL[69 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[70 & 15] = (((generatedL[(70 + 13) & 15] ^ generatedL[(70 + 8) & 15] ^ generatedL[(70 + 2) & 15] ^ generatedL[70 & 15]) << (true)) | ((generatedL[(70 + 13) & 15] ^ generatedL[(70 + 8) & 15] ^ generatedL[(70 + 2) & 15] ^ generatedL[70 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[71 & 15] = (((generatedL[(71 + 13) & 15] ^ generatedL[(71 + 8) & 15] ^ generatedL[(71 + 2) & 15] ^ generatedL[71 & 15]) << (true)) | ((generatedL[(71 + 13) & 15] ^ generatedL[(71 + 8) & 15] ^ generatedL[(71 + 2) & 15] ^ generatedL[71 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[72 & 15] = (((generatedL[(72 + 13) & 15] ^ generatedL[(72 + 8) & 15] ^ generatedL[(72 + 2) & 15] ^ generatedL[72 & 15]) << (true)) | ((generatedL[(72 + 13) & 15] ^ generatedL[(72 + 8) & 15] ^ generatedL[(72 + 2) & 15] ^ generatedL[72 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[73 & 15] = (((generatedL[(73 + 13) & 15] ^ generatedL[(73 + 8) & 15] ^ generatedL[(73 + 2) & 15] ^ generatedL[73 & 15]) << (true)) | ((generatedL[(73 + 13) & 15] ^ generatedL[(73 + 8) & 15] ^ generatedL[(73 + 2) & 15] ^ generatedL[73 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[74 & 15] = (((generatedL[(74 + 13) & 15] ^ generatedL[(74 + 8) & 15] ^ generatedL[(74 + 2) & 15] ^ generatedL[74 & 15]) << (true)) | ((generatedL[(74 + 13) & 15] ^ generatedL[(74 + 8) & 15] ^ generatedL[(74 + 2) & 15] ^ generatedL[74 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (generatedL[75 & 15] = (((generatedL[(75 + 13) & 15] ^ generatedL[(75 + 8) & 15] ^ generatedL[(75 + 2) & 15] ^ generatedL[75 & 15]) << (true)) | ((generatedL[(75 + 13) & 15] ^ generatedL[(75 + 8) & 15] ^ generatedL[(75 + 2) & 15] ^ generatedL[75 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (generatedL[76 & 15] = (((generatedL[(76 + 13) & 15] ^ generatedL[(76 + 8) & 15] ^ generatedL[(76 + 2) & 15] ^ generatedL[76 & 15]) << (true)) | ((generatedL[(76 + 13) & 15] ^ generatedL[(76 + 8) & 15] ^ generatedL[(76 + 2) & 15] ^ generatedL[76 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (generatedL[77 & 15] = (((generatedL[(77 + 13) & 15] ^ generatedL[(77 + 8) & 15] ^ generatedL[(77 + 2) & 15] ^ generatedL[77 & 15]) << (true)) | ((generatedL[(77 + 13) & 15] ^ generatedL[(77 + 8) & 15] ^ generatedL[(77 + 2) & 15] ^ generatedL[77 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (generatedL[78 & 15] = (((generatedL[(78 + 13) & 15] ^ generatedL[(78 + 8) & 15] ^ generatedL[(78 + 2) & 15] ^ generatedL[78 & 15]) << (true)) | ((generatedL[(78 + 13) & 15] ^ generatedL[(78 + 8) & 15] ^ generatedL[(78 + 2) & 15] ^ generatedL[78 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (generatedL[79 & 15] = (((generatedL[(79 + 13) & 15] ^ generatedL[(79 + 8) & 15] ^ generatedL[(79 + 2) & 15] ^ generatedL[79 & 15]) << (true)) | ((generatedL[(79 + 13) & 15] ^ generatedL[(79 + 8) & 15] ^ generatedL[(79 + 2) & 15] ^ generatedL[79 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		state[0] += /* Add the working vars back into context.state[] */a;
		state[1] += b;
		state[2] += c;
		state[3] += d;
		state[4] += e/* Wipe variables *//* a = b = c = d = e = 0; *//* CLANG: useless */;
	}
	/* SHA1Init - Initialize new context */
	public static void SHA1Init() {
		Object generatedState = this.getState();
		generatedState[0] = /* SHA1 initialization constants */-1024;
		generatedState[1] = -1024;
		generatedState[2] = -1024;
		generatedState[3] = -1024;
		generatedState[4] = -1024;
		Object generatedCount = this.getCount();
		generatedCount[0] = generatedCount[1] = 0;
	}
	/* JHB */
	/* Run your data through this. */
	/* JHB */
	public static void SHA1Update(Object[] data, Object len) {
		/* JHB */uint32_t i = new uint32_t();
		uint32_t j = new uint32_t();
		Object generatedCount = this.getCount();
		j = (generatedCount[0] >> 3) & 63;
		if ((generatedCount[0] += len << 3) < (len << 3)) {
			generatedCount[1]++;
		} 
		generatedCount[1] += (len >> 29);
		Object generatedBuffer = this.getBuffer();
		Object generatedState = this.getState();
		if ((j + len) > 63) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuffer[j], data, (i = 64 - j));
			ModernizedCProgram.SHA1Transform(generatedState, generatedBuffer);
			for (; i + 63 < len; i += 64) {
				ModernizedCProgram.SHA1Transform(generatedState, data[i]);
			}
			j = 0;
		} else {
				i = 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuffer[j], data[i], len - i);
	}
	/* Add padding and return the message digest. */
	public static void SHA1Final() {
		/* JHB */uint32_t i = new uint32_t();
		byte[] finalcount = new byte[8];
		Object generatedCount = this.getCount();
		for (i = 0; i < 8; i++) {
			finalcount[i] = (byte)((generatedCount[(i >= 4 ? 0 : 1)] >> ((3 - (i & 3)) * 8)) & /* Endian independent */255);
		}
		context.SHA1Update((byte)"\200", 1);
		while ((generatedCount[0] & 504) != 448) {
			context.SHA1Update((byte)"\0", 1);
		}
		context.SHA1Update(finalcount, /* Should cause a SHA1Transform() */8);
		Object generatedDigest = this.getDigest();
		Object generatedState = this.getState();
		for (i = 0; i < 20; i++) {
			generatedDigest[i] = (byte)((generatedState[i >> 2] >> ((3 - (i & 3)) * 8)) & 255);
		}
		Object generatedBuffer = this.getBuffer();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedBuffer, 0, /* Wipe variables *//* i = 0; *//* JHB *//* CLANG: useless */64);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedState, 0, 20);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedCount, 0, 8);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(finalcount, 0, /* SWR */8/* make SHA1Transform overwrite it's own static vars */)/* DJB code from here */;/* DJB code from here */
	}
	/* blk0() and blk() perform the initial expand. */
	/* I got the idea of expanding during the round function from SSLeay */
	/*
	 * flickcurl_hmac_sha1:
	 * @data: data
	 * @data_size: size of data in bytes
	 * @key: key
	 * @key_len: size of key in bytes
	 *
	 * INTERNAL - Calculate the HMAC-SHA1 digest of key and data
	 *
	 * Based on specification at http://tools.ietf.org/html/rfc2104
	 * Section 2. "Definition of HMAC" where B=64 H=SHA1 L=SHA1_DIGEST_LENGTH (20)
	 *
	 * Return value: buffer of size SHA1_DIGEST_LENGTH or NULL on failure 
	 */
	public static Byte flickcurl_hmac_sha1(Object data, Object data_len, Object key, Object key_len) {
		int i;
		SHA1Context inner = new SHA1Context();
		SHA1Context outer = new SHA1Context();
		SHA1Context key_hash = new SHA1Context();
		byte[] kpad = new byte[64];
		byte result;
		if (!key || !data) {
			return ((Object)0);
		} 
		result = (byte)/*Error: Function owner not recognized*/malloc(20);
		if (!result) {
			return ((Object)0);
		} 
		Object generatedDigest = key_hash.getDigest();
		if (key_len > 64) {
			/* When key (K) is > blocksize, key := sha1-hash(key) */key_hash.SHA1Init();
			key_hash.SHA1Update((byte)key, key_len);
			key_hash.SHA1Final();
			key = generatedDigest;
			key_len = 20;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(kpad, (byte)'\0', /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(kpad, key, key_len);
		for (i = 0; i < 64; i++) {
			kpad[i] ^=  -1024;
		}
		/* inner := sha1-hash(ipad // message) */inner.SHA1Init();
		inner.SHA1Update(kpad, 64);
		inner.SHA1Update((byte)data, data_len);
		inner.SHA1Final();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(kpad, (byte)'\0', /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(kpad, key, key_len);
		for (i = 0; i < 64; i++) {
			kpad[i] ^=  -1024;
		}
		/* final outer := sha1-hash(opad // inner) */outer.SHA1Init();
		outer.SHA1Update(kpad, 64);
		outer.SHA1Update(generatedDigest, /* Result of inner hash is in inner.digest of size SHA1_DIGEST_LENGTH */20);
		outer.SHA1Final();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(result, generatedDigest, /* copy final digest into result buffer */20);
		return result;
	}
	public static int flickcurl_cmdline_init() {
		size_t config_len = 15;
		byte home;
		if (ModernizedCProgram.flickcurl_cmdline_config_path) {
			return 0;
		} 
		home = /*Error: Function owner not recognized*/getenv("HOME");
		if (home) {
			config_len += /*Error: Function owner not recognized*/strlen(home) + 1;
		} 
		ModernizedCProgram.flickcurl_cmdline_config_path = /*Error: Function owner not recognized*/malloc(config_len + 1);
		if (!ModernizedCProgram.flickcurl_cmdline_config_path) {
			return 1;
		} 
		if (home) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ModernizedCProgram.flickcurl_cmdline_config_path, "%s/%s", home, ModernizedCProgram.config_filename);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.config_filename, config_len + 1);
		} 
		return 0;
	}
	public static void flickcurl_cmdline_finish() {
		if (ModernizedCProgram.flickcurl_cmdline_config_path) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.flickcurl_cmdline_config_path);
		} 
	}
	public static Object flickcurl_cmdline_basename(Object name) {
		byte p;
		if ((p = /*Error: Function owner not recognized*/strrchr(name, (byte)'/'))) {
			name = p + 1;
		}  else if ((p = /*Error: Function owner not recognized*/strrchr(name, (byte)'\\'))) {
			name = p + 1;
		} 
		return name;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photoset.c - Flickcurl photoset functions
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
	 * flickcurl_free_photoset:
	 * @photoset: photoset object
	 *
	 * Destructor for photoset object
	 */
	public static void flickcurl_free_photoset() {
		do {
			if (!photoset) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photoset is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photoset.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Object generatedPrimary = this.getPrimary();
		if (generatedPrimary) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedPrimary);
		} 
		Object generatedSecret = this.getSecret();
		if (generatedSecret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedSecret);
		} 
		Object generatedTitle = this.getTitle();
		if (generatedTitle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTitle);
		} 
		Object generatedDescription = this.getDescription();
		if (generatedDescription) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedDescription);
		} 
		Object generatedOwner = this.getOwner();
		if (generatedOwner) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedOwner);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(photoset/**
		 * flickcurl_free_photosets:
		 * @photosets_object: photoset object array
		 *
		 * Destructor for array of photoset object
		 */);
	}
	public static void flickcurl_free_photosets() {
		int i;
		do {
			if (!photosets_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photoset_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photoset.c", 81, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; photosets_object[i]; i++) {
			photosets_object[i].flickcurl_free_photoset();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(photosets_object);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * vsnprintf.c - vsnprintf implementation
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
	/* 
	 * Thanks to the patch in this Debian bug for the solution
	 * to the crash inside vsnprintf on some architectures.
	 *
	 * "reuse of args inside the while(1) loop is in violation of the
	 * specs and only happens to work by accident on other systems."
	 *
	 * http://bugs.debian.org/cgi-bin/bugreport.cgi?bug = 104325 
	 */
	public static Byte my_vsnprintf(Object message, Object arguments) {
		int len;
		byte buffer = ((Object)0);
		va_list args_copy = new va_list();
		/* copy for re-use */
		/* copy for re-use */int size = /* This vsnprintf doesn't return number of bytes required */2;
		while (1) {
			buffer = (byte)/*Error: Function owner not recognized*/malloc(size + 1);
			if (!buffer) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_copy(args_copy, /* copy for re-use */arguments);
			len = /*Error: Function owner not recognized*/_vsnprintf(buffer, size, message, args_copy);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(args_copy);
			if (len >= 0) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buffer);
			size += 4;
		}
		return buffer;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * upload-api.c - Flickr photo upload API calls
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
	 * flickcurl_photos_upload_params:
	 * @fc: flickcurl context
	 * @params: upload parameters
	 * 
	 * Uploads a photo with safety level and content type
	 *
	 * Return value: #flickcurl_upload_status or NULL on failure
	 **/
	public static  flickcurl_photos_upload_params(flickcurl_s fc,  params) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_upload_status status = ((Object)0);
		byte[] is_public_s = new byte[2];
		byte[] is_friend_s = new byte[2];
		byte[] is_family_s = new byte[2];
		byte[] safety_level_s = new byte[2];
		byte[] content_type_s = new byte[2];
		byte[] hidden_s = new byte[2];
		fc.flickcurl_init_params(1);
		Object generatedPhoto_file = params.getPhoto_file();
		if (!generatedPhoto_file) {
			return ((Object)0);
		} 
		if (/*Error: Function owner not recognized*/_access((byte)generatedPhoto_file, 4)) {
			fc.flickcurl_error("Photo file %s cannot be read: %s", generatedPhoto_file, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return ((Object)0);
		} 
		Object generatedIs_public = params.getIs_public();
		is_public_s[0] = generatedIs_public ? (byte)'1' : (byte)'0';
		is_public_s[1] = (byte)'\0';
		Object generatedIs_friend = params.getIs_friend();
		is_friend_s[0] = generatedIs_friend ? (byte)'1' : (byte)'0';
		is_friend_s[1] = (byte)'\0';
		Object generatedIs_family = params.getIs_family();
		is_family_s[0] = generatedIs_family ? (byte)'1' : (byte)'0';
		is_family_s[1] = (byte)'\0';
		Object generatedSafety_level = params.getSafety_level();
		if (generatedSafety_level >= 1 && generatedSafety_level <= 3) {
			safety_level_s[0] = (byte)'0' + generatedSafety_level;
			safety_level_s[1] = (byte)'\0';
		} else {
				params.setSafety_level(-1);
		} 
		Object generatedContent_type = params.getContent_type();
		if (generatedContent_type >= 1 && generatedContent_type <= 3) {
			content_type_s[0] = (byte)'0' + generatedContent_type;
			content_type_s[1] = (byte)'\0';
		} else {
				params.setContent_type(-1);
		} 
		Object generatedHidden = params.getHidden();
		if (generatedHidden >= 1 && generatedHidden <= 2) {
			hidden_s[0] = (byte)'0' + generatedHidden;
			hidden_s[1] = (byte)'\0';
		} else {
				params.setHidden(-1);
		} 
		Object generatedTitle = params.getTitle();
		if (generatedTitle) {
			fc.flickcurl_add_param("title", generatedTitle);
		} 
		Object generatedDescription = params.getDescription();
		if (generatedDescription) {
			fc.flickcurl_add_param("description", generatedDescription);
		} 
		Object generatedTags = params.getTags();
		if (generatedTags) {
			fc.flickcurl_add_param("tags", generatedTags);
		} 
		if (generatedSafety_level >= 0) {
			fc.flickcurl_add_param("safety_level", safety_level_s);
		} 
		if (generatedContent_type >= 0) {
			fc.flickcurl_add_param("content_type", content_type_s);
		} 
		fc.flickcurl_add_param("is_public", is_public_s);
		fc.flickcurl_add_param("is_friend", is_friend_s);
		fc.flickcurl_add_param("is_family", is_family_s);
		if (generatedHidden >= 0) {
			fc.flickcurl_add_param("hidden", hidden_s);
		} 
		fc.flickcurl_end_params();
		Byte generatedUpload_service_uri = fc.getUpload_service_uri();
		if (fc.flickcurl_prepare_upload(generatedUpload_service_uri, "photo", generatedPhoto_file)) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = /*Error: Function owner not recognized*/xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		status = (flickcurl_upload_status)/*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/);
		status.setPhotoid(fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/photoid"));
		status.setTicketid(fc.flickcurl_xpath_eval(/* when async is true */xpathCtx, ()"/rsp/ticketid"));
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			if (status) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(status);
			} 
			status = ((Object)0);
		} 
		return status/**
		 * flickcurl_photos_upload:
		 * @fc: flickcurl context
		 * @photo_file: photo filename
		 * @title: title or NULL
		 * @description: description of photo (HTML) (or NULL)
		 * @tags: space-separated list of tags (or NULL)
		 * @is_public: is public photo boolean (non-0 true)
		 * @is_friend: is friend photo boolean (non-0 true)
		 * @is_family: is family photo boolean (non-0 true)
		 * 
		 * Uploads a photo
		 *
		 * Implements Uploading Photos (0.10)
		 * 
		 * See flickcurl_photos_upload_params() to set additional upload
		 * parameters such as safety level and content type.
		 *
		 * @deprecated: Replaced by flickcurl_photos_upload_params() with
		 * #flickcurl_upload_params argument.
		 *
		 * Return value: #flickcurl_upload_status or NULL on failure
		 **/;
	}
	public static void flickcurl_free_upload_status() {
		do {
			if (!status) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_upload_status is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\upload-api.c", 309, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedPhotoid = this.getPhotoid();
		if (generatedPhotoid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedPhotoid);
		} 
		Object generatedSecret = this.getSecret();
		if (generatedSecret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedSecret);
		} 
		Object generatedOriginalsecret = this.getOriginalsecret();
		if (generatedOriginalsecret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedOriginalsecret);
		} 
		Object generatedTicketid = this.getTicketid();
		if (generatedTicketid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTicketid);
		} 
	}
	public static void flickcurl_upload_status_free() {
		status.flickcurl_free_upload_status();
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * video.c - Flickr video support calls
	 *
	 * Copyright (C) 2008, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_video:
	 * @video: video object
	 *
	 * Destructor for video object
	 */
	public static void flickcurl_free_video() {
		do {
			if (!video) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_video is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\video.c", 54, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(video);
	}
	public static byte flickcurl_base64_encode_digit(byte c) {
		if (c < 26) {
			return (byte)'A' + c;
		}  else if (c < 52) {
			return (byte)'a' + (c - 26);
		}  else if (c < 62) {
			return (byte)'0' + (c - 52);
		}  else if (c == 62) {
			return (byte)'+';
		} else {
				return (byte)'/'/*
				 * flickcurl_base64_encode:
				 * @data: The data to base64 encode
				 * @len: The size of the data in src
				 * @out_len_p: pointer to store output length (or NULL)
				 *
				 * INTERNAL - Base64 encode data into a new string.
				 *
				 * Return value: base64 encoded string or NULL on failure
				 */;
		} 
	}
	public static Byte flickcurl_base64_encode(Object[] data, Object len, Object out_len_p) {
		byte out;
		byte p;
		int i;
		if (!data) {
			return ((Object)0);
		} 
		out = (byte)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, (len + 1) * 4 / 3 + /* len + 1 to round up for partial sizes when (len % 3) is not 0 */1);
		if (!out) {
			return ((Object)0/* Encode 1-3 input bytes at a time (8, 16 or 24 input bits) into
			   * 2-4 output chars
			   */);
		} 
		p = out;
		for (i = 0; i < len; i += 3) {
			byte in_char_1 = data[i];
			byte in_char_2 = ((i + 1) < len) ? data[i + 1] : 0;
			byte in_char_3 = ((i + 2) < len) ? data[i + 2] : 0;
			byte out_digit_1;
			byte out_digit_2;
			byte out_digit_3;
			byte out_digit_4;
			out_digit_1 = in_char_1 >> 2;
			out_digit_2 = ((in_char_1 & -1024) << 4) | (in_char_2 >> 4);
			out_digit_3 = ((in_char_2 & -1024) << 2) | (in_char_3 >> 6);
			out_digit_4 = in_char_3 & -1024;
			p++ = ModernizedCProgram.flickcurl_base64_encode_digit(out_digit_1);
			p++ = ModernizedCProgram.flickcurl_base64_encode_digit(out_digit_2);
			if ((i + 1) < len) {
				p++ = ModernizedCProgram.flickcurl_base64_encode_digit(out_digit_3);
			} else {
					p++ = (byte)'=';
			} 
			if ((i + 2) < len) {
				p++ = ModernizedCProgram.flickcurl_base64_encode_digit(out_digit_4);
			} else {
					p++ = (byte)'=';
			} 
		}
		p = (byte)'\0';
		if (out_len_p) {
			out_len_p = p - out;
		} 
		return out/*
		 * flickcurl_oauth_free:
		 * @od: oauth data
		 *
		 * INTERNAL - Free OAuth data
		 *
		 */;
	}
	public static void flickcurl_oauth_free() {
		Object generatedClient_key = this.getClient_key();
		if (generatedClient_key) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedClient_key);
		} 
		Object generatedClient_secret = this.getClient_secret();
		if (generatedClient_secret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedClient_secret);
		} 
		Object generatedRequest_token = this.getRequest_token();
		if (generatedRequest_token) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedRequest_token);
		} 
		Object generatedRequest_token_secret = this.getRequest_token_secret();
		if (generatedRequest_token_secret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedRequest_token_secret);
		} 
		Object generatedToken = this.getToken();
		if (generatedToken) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedToken);
		} 
		Object generatedToken_secret = this.getToken_secret();
		if (generatedToken_secret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedToken_secret);
		} 
		Object generatedNonce = this.getNonce();
		if (generatedNonce) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedNonce);
		} 
		Object generatedKey = this.getKey();
		if (generatedKey) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedKey);
		} 
		Object generatedData = this.getData();
		if (generatedData) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedData);
		} 
		Object generatedUsername = this.getUsername();
		if (generatedUsername) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUsername);
		} 
		Object generatedUser_nsid = this.getUser_nsid();
		if (generatedUser_nsid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUser_nsid);
		} 
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * oauth.c - OAuth 1.0 for Flickr
	 *
	 * Copyright (C) 2011-2012, David Beckett http://www.dajobe.org/
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
	/* Only used in the test in this file so needs to be in the library */
	public static int flickcurl_oauth_build_key() {
		byte p;
		Object generatedKey = this.getKey();
		if (generatedKey) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedKey);
		} 
		Object generatedClient_secret_len = this.getClient_secret_len();
		this.setKey_len(generatedClient_secret_len + 1);
		Object generatedRequest_token_secret_len = this.getRequest_token_secret_len();
		Object generatedKey_len = this.getKey_len();
		Object generatedToken_secret_len = this.getToken_secret_len();
		if (generatedRequest_token_secret_len) {
			generatedKey_len += generatedRequest_token_secret_len;
		} else {
				generatedKey_len += generatedToken_secret_len;
		} 
		this.setKey((byte)/*Error: Function owner not recognized*/malloc(generatedKey_len + /* for NUL */1));
		if (!generatedKey) {
			return 1;
		} 
		p = generatedKey;
		Object generatedClient_secret = this.getClient_secret();
		if (generatedClient_secret && generatedClient_secret_len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, generatedClient_secret, generatedClient_secret_len);
			p += generatedClient_secret_len;
		} 
		p++ = (byte)'&';
		Object generatedRequest_token_secret = this.getRequest_token_secret();
		Object generatedToken_secret = this.getToken_secret();
		if (generatedRequest_token_secret && generatedRequest_token_secret_len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, generatedRequest_token_secret, generatedRequest_token_secret_len);
			p += generatedRequest_token_secret_len;
		}  else if (generatedToken_secret && generatedToken_secret_len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, generatedToken_secret, generatedToken_secret_len);
			p += generatedToken_secret_len;
		} 
		p = /* Not part of HMAC-SHA1 data */(byte)'\0';
		return 0/*
		 * flickcurl_oauth_compute_signature:
		 * @od: oauth data
		 * @len_p: pointer to store size of result
		 *
		 * INTERNAL - Compute OAuth signature over 'key' and 'data' fields of @od
		 *
		 * Result: signature string or NULL on failure
		 *
		 */;
	}
	/*
	 * flickcurl_base64_encode_digit:
	 * @c: input digit 0..63
	 *
	 * INTERNAL - base64 encode a digit
	 *
	 * Note: this the output is not URL safe since '+' and '/' will need
	 * %-escaping
	 *
	 * Return value: base64 encoded char of input value
	 */
	/*
	 * flickcurl_base64_encode_digit:
	 * @c: input digit 0..63
	 *
	 * INTERNAL - base64 encode a digit
	 *
	 * Note: this the output is not URL safe since '+' and '/' will need
	 * %-escaping
	 *
	 * Return value: base64 encoded char of input value
	 */
	public static Byte flickcurl_oauth_compute_signature(Object len_p) {
		byte s1;
		byte result;
		Object generatedData = this.getData();
		Object generatedData_len = this.getData_len();
		Object generatedKey = this.getKey();
		Object generatedKey_len = this.getKey_len();
		s1 = ModernizedCProgram.flickcurl_hmac_sha1(generatedData, generatedData_len, generatedKey, generatedKey_len);
		if (!s1) {
			return ((Object)0);
		} 
		result = ModernizedCProgram.flickcurl_base64_encode(s1, 20, len_p);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s1);
		return result;
	}
	public static int compare_args(Object a, Object b) {
		return /*Error: Function owner not recognized*/strcmp((byte)a, (byte)b);
		return /*Error: Function owner not recognized*/strcmp((byte)a, (byte)b);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * codegen utility - Make C code from Flickr API by reflection
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
	 *
	 * USAGE: codegen [OPTIONS] flickr.section
	 *
	 */
	/* many places for getopt */
	public static void my_message_handler(Object user_data, Object message) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message);
	}
	public static int main(int argc, byte[][] argv) {
		flickcurl fc = ((Object)0);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int read_auth = 1;
		int i;
		int request_delay = -1;
		byte[] section = new byte[50];
		size_t section_len = new size_t();
		byte methods = ((Object)0);
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		while (!usage && !help) {
			int c;
			c = ModernizedCProgram.getopt(argc, argv, "d:hv");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = /*Error: Function owner not recognized*/atoi(ModernizedCProgram.optarg);
					} 
					break;
			case 0:
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'h':
					help = 1;
					break;
			}
		}
		if (help) {
			;
		} 
		if (argc < 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: No API section given\n", ModernizedCProgram.program);
			usage = 1;
		} 
		if (usage) {
			if (usage > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_home_url_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_license_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n\n", (_iob[2]));
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Try `%s -h' for more information.\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, ((Object)0));
		if (read_auth && !/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		if (request_delay >= 0) {
			fc.flickcurl_set_request_delay(request_delay);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(section, "flickr.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(section + 7, argv[1]);
		for (i = 0; section[i]; /* allow old format commands to work */i++) {
			if (section[i] == (byte)'-') {
				section[i] = (byte)'.';
			} 
		}
		if (!/*Error: Function owner not recognized*/strncmp(section, "flickr.flickr", 13)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(section, section + 7);
		} 
		section_len = /*Error: Function owner not recognized*/strlen(section);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: section '%s'\n", ModernizedCProgram.program, section);
		methods = fc.flickcurl_reflection_getMethods();
		if (!methods) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: getMethods failed\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "/* -*- Mode: c; c-basic-offset: 2 -*-\n *\n * %s-api.c - Flickr %s.* API calls\n *\n", argv[1], section);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/\n * \n * This file is licensed under the following three licenses as alternatives:\n *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version\n *   2. GNU General Public License (GPL) V2 or any newer version\n *   3. Apache License, V2.0 or any newer version\n * \n * You may not use this file except in compliance with at least one of\n * the above three licenses.\n * \n * See LICENSE.html or LICENSE.txt at the top of this package for the\n * complete terms and further detail along with the license texts for\n * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.\n * \n */\n\n#include <stdio.h>\n#include <string.h>\n#include <stdarg.h>\n\n#ifdef HAVE_CONFIG_H\n#include <config.h>\n#endif\n\n#ifdef HAVE_STDLIB_H\n#include <stdlib.h>\n#undef HAVE_STDLIB_H\n#endif\n#ifdef HAVE_UNISTD_H\n#include <unistd.h>\n#endif\n\n#include <flickcurl.h>\n#include <flickcurl_internal.h>\n\n\n");
		flickcurl_method_s flickcurl_method_s = new flickcurl_method_s();
		Byte generatedName = method.getName();
		int generatedArgs_count = method.getArgs_count();
		flickcurl_arg_s[][] generatedArgs = method.getArgs();
		Byte generatedDescription = arg.getDescription();
		int generatedOptional = arg.getOptional();
		for (i = 0; methods[i]; i++) {
			flickcurl_method method = new flickcurl_method();
			byte method_name;
			byte[] function_name = new byte[100];
			int c;
			int j;
			int is_write = 0;
			if (/*Error: Function owner not recognized*/strncmp(methods[i], section, section_len)) {
				continue;
			} 
			method = flickcurl_method_s.flickcurl_reflection_getMethodInfo(fc, methods[i]);
			if (!method) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: getMethodInfo(%s) failed\n", ModernizedCProgram.program, methods[i]);
				rc = 1;
				break;
			} 
			method_name = generatedName;
			if (/*Error: Function owner not recognized*/strstr(method_name, ".add") || /*Error: Function owner not recognized*/strstr(method_name, ".create") || /*Error: Function owner not recognized*/strstr(method_name, ".delete") || /*Error: Function owner not recognized*/strstr(method_name, ".edit") || /*Error: Function owner not recognized*/strstr(method_name, ".remove") || /*Error: Function owner not recognized*/strstr(method_name, ".set")) {
				is_write = 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(function_name, "flickcurl_");
			for (j = 0; (c = methods[i][j + 7]); j++) {
				if (c == (byte)'.') {
					c = (byte)'_';
				} 
				function_name[j + 10] = c;
			}
			function_name[j + 10] = (byte)'\0';
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "/**\n * %s:\n", function_name);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), /* fixed arguments */" * @fc: flickcurl context\n");
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * @%s: %s", generatedName, generatedDescription);
					if (generatedOptional) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page")) ? " (or < 0)" : " (or NULL)"), (_iob[1]));
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * \n * %s\n *\n * Implements %s (%s)\n", generatedDescription, generatedName, ModernizedCProgram.flickcurl_version_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * \n * Return value: non-0 on failure\n **/\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "int\n%s(flickcurl* fc", function_name);
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					if ((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page"))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ", int %s", generatedName);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ", const char* %s", generatedName);
					} 
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ")\n{\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  xmlDocPtr doc = NULL;\n  xmlXPathContextPtr xpathCtx = NULL; \n  void* result = NULL;\n");
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if ((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page"))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  char %s_str[10];\n", generatedName);
					} 
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n  flickcurl_init_params(fc, 0);\n\n", (_iob[1]));
			if (generatedArgs_count) {
				int argi;
				int print_or = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  if(");
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					if (!generatedOptional) {
						if (print_or) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " || ");
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "!%s", generatedName);
						print_or = 1;
					} 
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ")\n    return 1;\n\n");
			} 
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					if (generatedOptional) {
						if ((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page"))) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  if(%s >= 0) {\n    sprintf(%s_str, \"%%d\", %s);\n    flickcurl_add_param(fc, \"%s\", %s_str);\n  }\n", generatedName, generatedName, generatedName, generatedName, generatedName);
							continue;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  if(%s)\n", generatedName);
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  flickcurl_add_param(fc, \"%s\", %s);\n", generatedName, generatedName);
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "\n  flickcurl_end_params(fc);\n\n  if(flickcurl_prepare(fc, \"%s\"))\n    goto tidy;\n\n", generatedName);
			if (is_write) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  flickcurl_set_write(fc, 1);\n  flickcurl_set_data(fc, (void*)\"\", 0);\n\n");
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  doc = flickcurl_invoke(fc);\n  if(!doc)\n    goto tidy;\n\n\n  xpathCtx = xmlXPathNewContext(doc);\n  if(!xpathCtx) {\n    flickcurl_error(fc, \"Failed to create XPath context for document\");\n    fc->failed = 1;\n    goto tidy;\n  }\n\n  result = NULL; /* your code here */\n\n  tidy:\n  if(xpathCtx)\n    xmlXPathFreeContext(xpathCtx);\n\n  if(fc->failed)\n    result = NULL;\n\n  return (result == NULL);\n}\n\n\n");
			method.flickcurl_free_method();
		}
		if (fc) {
			fc.flickcurl_free();
		} 
		ModernizedCProgram.flickcurl_finish();
		ModernizedCProgram.flickcurl_cmdline_finish();
		return (rc);
		flickcurl fc = ((Object)0);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int read_auth = 1;
		int i;
		byte methods = ((Object)0);
		int count = 0;
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		while (!usage && !help) {
			int c;
			c = ModernizedCProgram.getopt(argc, argv, "hv");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case 0:
			case (byte)'h':
					help = 1;
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			}
		}
		if (help) {
			;
		} 
		if (argc != 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Extra arguments given\n", ModernizedCProgram.program);
			usage = 1;
		} 
		if (usage) {
			if (usage > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_home_url_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_license_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n\n", (_iob[2]));
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Try `%s -h' for more information.\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, ((Object)0));
		if (read_auth && !/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		methods = fc.flickcurl_reflection_getMethods();
		if (!methods) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: getMethods failed\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		for (i = 0; methods[i]; i++) {
			;
		}
		count = i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Found %d API methods\n", ModernizedCProgram.program, count);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(methods, count, /*Error: Unsupported expression*/, /* it seems to be sorted when returned but ensure it anyway */compare_strings);
		for (i = 0; methods[i]; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs((byte)methods[i], (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
		}
		if (fc) {
			fc.flickcurl_free();
		} 
		ModernizedCProgram.flickcurl_finish();
		return (rc);
		flickcurl fc = ((Object)0);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int cmd_index = -1;
		int read_auth = 1;
		int i;
		int request_delay = -1;
		byte command = ((Object)0);
		ModernizedCProgram.output_fh = (_iob[1]);
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, ((Object)0));
		if (read_auth) {
			if (!/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
				if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
					rc = 1;
					;
				} 
			} else {
					for (i = 0; i < argc; ++/* Check if the user has requested to see the help message */i) {
						if (!/*Error: Function owner not recognized*/strcmp(argv[i], "-h") || !/*Error: Function owner not recognized*/strcmp(argv[i], "--help")) {
							ModernizedCProgram.print_help_string();
						} 
					}
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Configuration file %s not found.\n\n1. Visit http://www.flickr.com/services/api/keys/ to get an <API Key>\n    and <Shared Secret>.\n\n2. Create %s in this format:\n[flickr]\noauth_client_key=<Client key / API Key>\noauth_client_secret=<Client secret / Shared Secret>\n\n3. Call this program with:\n  %s oauth.create\n  (or %s oauth.create <Callback URL> if you understand and need that)\nThis gives a <Request Token> <Request Token Secret> and <Authentication URL>\n\n4. Visit the <Authentication URL> and approve the request to get a <Verifier>\n\n5. Call this program with the <Request Token>, <Request Token Secret>\n    and <Verifier>:\n  %s oauth.verify <Request Token> <Request Token Secret> <Verifier>\n\nThis will write the configuration file with the OAuth access tokens.\nSee http://librdf.org/flickcurl/api/flickcurl-auth.html for full instructions.\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.program, ModernizedCProgram.program, ModernizedCProgram.program);
					rc = 1;
					;
			} 
		} 
		while (!usage && !help) {
			int c;
			byte auth_token = ((Object)0);
			c = ModernizedCProgram.getopt(argc, argv, "a:d:ho:qvV");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = /*Error: Function owner not recognized*/atoi(ModernizedCProgram.optarg);
					} 
					break;
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			case (byte)'h':
					help = 1;
					break;
			case (byte)'o':
					if (ModernizedCProgram.optarg) {
						ModernizedCProgram.output_filename = ModernizedCProgram.optarg;
						ModernizedCProgram.output_fh = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.output_filename, "w");
						if (!ModernizedCProgram.output_fh) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Failed to write to output file %s: %s\n", ModernizedCProgram.program, ModernizedCProgram.output_filename, /*Error: Function owner not recognized*/strerror(errno));
							rc = 1;
							;
						} 
					} 
					break;
			case (byte)'q':
					ModernizedCProgram.verbose = 0;
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case 0:
			case (byte)'V':
					ModernizedCProgram.verbose = 2;
					break;
			case (byte)'a':
					auth_token = fc.flickcurl_auth_getFullToken(/* Exchange the frob for a full token */ModernizedCProgram.optarg);
					if (!auth_token) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Could not find auth_token in getFullToken response\n", ModernizedCProgram.program);
						rc = 1;
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: Successfully exchanged frob %s for authentication token\n", ModernizedCProgram.program, ModernizedCProgram.optarg);
							fc.flickcurl_set_auth_token(auth_token);
							rc = fc.flickcurl_config_write_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section);
							if (!rc) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: Updated configuration file %s with authentication token\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path);
							} 
					} 
					;
			}
		}
		argv += ModernizedCProgram.optind;
		argc -= ModernizedCProgram.optind;
		if (!help && !argc) {
			usage = /* Title and usage */2;
			;
		} 
		if (usage || help) {
			;
		} 
		if (request_delay >= 0) {
			fc.flickcurl_set_request_delay(request_delay);
		} 
		command = argv[0];
		for (i = 0; command[i]; /* allow old format commands to work */i++) {
			if (command[i] == (byte)'-') {
				command[i] = (byte)'.';
			} 
		}
		if (!/*Error: Function owner not recognized*/strncmp(command, "flickr.", 7)) {
			command += 7;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(command, "places.forUser")) {
			command = (byte)"places.placesForUser";
		} 
		for (i = 0; ModernizedCProgram.commands[i].getName(); i++) {
			if (!/*Error: Function owner not recognized*/strcmp(command, ModernizedCProgram.commands[i].getName())) {
				cmd_index = i;
				break;
			} 
		}
		if (cmd_index < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: No such command `%s'\n", ModernizedCProgram.program, command);
			usage = 1;
			;
		} 
		if ((argc - 1) < ModernizedCProgram.commands[cmd_index].getMin()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Minimum of %d arguments for command `%s'\n  USAGE: %s %s %s\n", ModernizedCProgram.program, ModernizedCProgram.commands[cmd_index].getMin(), command, ModernizedCProgram.program, command, ModernizedCProgram.commands[cmd_index].getArgs());
			usage = 1;
			;
		} 
		if (ModernizedCProgram.commands[cmd_index].getMax() > 0 && (argc - 1) > ModernizedCProgram.commands[cmd_index].getMax()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Maxiumum of %d arguments for command `%s'\n  USAGE: %s %s %s\n", ModernizedCProgram.program, ModernizedCProgram.commands[cmd_index].getMax(), command, ModernizedCProgram.program, command, ModernizedCProgram.commands[cmd_index].getArgs());
			usage = 1;
			;
		} 
		if (help) {
			ModernizedCProgram.print_help_string();
			rc = 0;
			;
		} 
		rc = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fc, argc, /* Perform the API call */argv);
		if (rc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Command %s failed\n", ModernizedCProgram.program, argv[0]);
		} 
		if (fc) {
			fc.flickcurl_free();
		} 
		ModernizedCProgram.flickcurl_finish();
		ModernizedCProgram.flickcurl_cmdline_finish();
		return (rc);
		flickcurl fc = ((Object)0);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int mode = 0;
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		if (argc > 1 && argv[1] == (byte)'-') {
			if (!/*Error: Function owner not recognized*/strcmp(argv[1], "-v")) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
				ModernizedCProgram.flickcurl_cmdline_finish();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argv[1], "-h")) {
				help = 1;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Invalid option `%s'\n", ModernizedCProgram.program, argv[1]);
					usage = 1;
			} 
			;
		} 
		if (argc < 2) {
			usage = /* Title and usage */2;
			;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(argv[1], "manpage")) {
			mode = 0;
		}  else if (!/*Error: Function owner not recognized*/strcmp(argv[1], "extras")) {
			mode = 1;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Invalid mode `%s'\n", ModernizedCProgram.program, argv[1]);
				usage = 1;
		} 
		if (help) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Generate manpage for Flickcurl utility.");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s [OPTIONS] manual | extras\n\n", ModernizedCProgram.program);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_license_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_home_url_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -h  Print this help, then exit");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -v  Print the flickcurl version");
			rc = 0;
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		if (mode == 0) {
			(_iob[/* mode 0 : man page */1]).mangen_print_man_page();
		} else {
				(_iob[/* mode 1: extras */1]).mangen_print_extras();
		} 
		ModernizedCProgram.flickcurl_finish();
		return (rc);
		flickcurl fc = ((Object)0);
		int rc = 0;
		int usage = 0;
		int help = 0;
		byte photo_id = ((Object)0);
		byte prefix_uri = "http://www.flickr.com/photos/";
		size_t prefix_uri_len = /*Error: Function owner not recognized*/strlen(prefix_uri);
		byte serializer_syntax_name = "ntriples";
		raptor_uri base_uri = ((Object)0);
		raptor_serializer serializer = ((Object)0);
		int request_delay = -1;
		flickcurl_serializer fs = ((Object)0);
		flickcurl_photo photo = ((Object)0);
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		ModernizedCProgram.rworld = ModernizedCProgram.raptor_new_world();
		ModernizedCProgram.raptor_world_open(ModernizedCProgram.rworld);
		while (!usage && !help) {
			int c;
			c = ModernizedCProgram.getopt(argc, argv, "Dd:ho:v");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case (byte)'h':
					help = 1;
					break;
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = /*Error: Function owner not recognized*/atoi(ModernizedCProgram.optarg);
					} 
					break;
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			case 0:
			case (byte)'o':
					if (ModernizedCProgram.optarg) {
						if (ModernizedCProgram.raptor_world_is_serializer_name(ModernizedCProgram.rworld, ModernizedCProgram.optarg)) {
							serializer_syntax_name = ModernizedCProgram.optarg;
						} else {
								int i;
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: invalid argument `%s' for `-o'\n", ModernizedCProgram.program, ModernizedCProgram.optarg);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Valid arguments are:\n");
								for (i = 0; 1; i++) {
									raptor_syntax_description d = new raptor_syntax_description();
									d = ModernizedCProgram.raptor_world_get_serializer_description(ModernizedCProgram.rworld, i);
									if (!d) {
										break;
									} 
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("  %-12s for %s\n", d.getNames()[0], d.getLabel());
								}
								usage = 1;
								break;
						} 
					} 
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'D':
					ModernizedCProgram.debug = 1;
					break;
			}
		}
		argv += ModernizedCProgram.optind;
		argc -= ModernizedCProgram.optind;
		if (!help && argc < 1) {
			usage = /* Title and usage */2;
		} 
		if (!help && !argc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: No photo URI given\n", ModernizedCProgram.program);
			usage = 1;
			;
		} 
		if (usage || help) {
			;
		} 
		photo_id = argv[0];
		if (/*Error: Function owner not recognized*/strncmp(photo_id, prefix_uri, prefix_uri_len)) {
			usage = 1;
		} else {
				size_t len = new size_t();
				photo_id += prefix_uri_len;
				len = /*Error: Function owner not recognized*/strlen(photo_id);
				if (!len) {
					usage = 1;
				} else {
						if (photo_id[len - 1] == (byte)'/') {
							photo_id[--len] = (byte)'\0';
						} 
						while (photo_id && photo_id != (byte)'/') {
							photo_id++;
						}
						if (!photo_id) {
							usage = 1;
						} else {
								photo_id++;
						} 
				} 
		} 
		if (usage) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Argument is not a Flickr photo URI like\n  http://www.flickr.com/photos/USER/PHOTO/\n", ModernizedCProgram.program);
			;
		} 
		serializer = ModernizedCProgram.raptor_new_serializer(ModernizedCProgram.rworld, serializer_syntax_name);
		if (!serializer) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Failed to create raptor serializer type %s\n", ModernizedCProgram.program, serializer_syntax_name);
			return (true);
		} 
		base_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)argv[0]);
		ModernizedCProgram.raptor_serializer_start_to_file_handle(serializer, base_uri, (_iob[1]));
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, ((Object)0));
		if (!/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		if (help) {
			int i;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Get Triples from Flickr photos.");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s [OPTIONS] FLICKR-PHOTO-URI\n\n", ModernizedCProgram.program);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_license_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_home_url_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -d  Set delay between requests in milliseconds");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -D  Print lots of output");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -h  Print this help, then exit");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -o  Set output format to one of:");
			for (i = 0; 1; i++) {
				raptor_syntax_description d = new raptor_syntax_description();
				d = ModernizedCProgram.raptor_world_get_serializer_description(ModernizedCProgram.rworld, i);
				if (!d) {
					break;
				} 
				if (!/*Error: Function owner not recognized*/strcmp(d.getNames()[0], serializer_syntax_name)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("      %-15s %s (default)\n", d.getNames()[0], d.getLabel());
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("      %-15s %s\n", d.getNames()[0], d.getLabel());
				} 
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    via internal RDF serializer");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -v  Print the flickcurl version");
			rc = 0;
			;
		} 
		if (request_delay >= 0) {
			fc.flickcurl_set_request_delay(request_delay);
		} 
		flickcurl_serializer_s flickcurl_serializer_s = new flickcurl_serializer_s();
		fs = flickcurl_serializer_s.flickcurl_new_serializer(fc, serializer, ModernizedCProgram.flickrdf_serializer_factory);
		if (!fs) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Failed to create Flickcurl serializer\n", ModernizedCProgram.program);
			;
		} 
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		photo = flickcurl_photo_s.flickcurl_photos_getInfo2(fc, photo_id, ((Object)0));
		if (!photo) {
			;
		} 
		Byte generatedUri = photo.getUri();
		Byte generatedId = photo.getId();
		int generatedTags_count = photo.getTags_count();
		if (ModernizedCProgram.debug) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Photo with URI %s ID %s has %d tags\n", ModernizedCProgram.program, generatedUri, generatedId, generatedTags_count);
		} 
		rc = ModernizedCProgram.flickcurl_serialize_photo(fs, photo);
		if (fs) {
			fs.flickcurl_free_serializer();
		} 
		if (fc) {
			fc.flickcurl_free();
		} 
		if (serializer) {
			serializer.raptor_free_serializer();
		} 
		if (base_uri) {
			ModernizedCProgram.raptor_free_uri(base_uri);
		} 
		if (ModernizedCProgram.rworld) {
			ModernizedCProgram.raptor_free_world(ModernizedCProgram.rworld);
		} 
		ModernizedCProgram.flickcurl_finish();
		ModernizedCProgram.flickcurl_cmdline_finish();
		return (rc);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * perms.c - Flickcurl method perms functions
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
	 * flickcurl_free_perms:
	 * @perms: perms object
	 *
	 * Destructor for perms object
	 */
	public static void flickcurl_free_perms() {
		do {
			if (!perms) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_perms is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\perms.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(perms);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * namespace.c - Flickr machinetag support calls
	 *
	 * Copyright (C) 2008, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_tag_namespace:
	 * @tag_nspace: machinetag namespace object
	 *
	 * Destructor for machinetag namespace object
	 */
	public static void flickcurl_free_tag_namespace() {
		Object generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedName);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tag_nspace);
	}
	public static void flickcurl_free_tag_namespaces() {
		int i;
		do {
			if (!tag_nspaces) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_namespace_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\machinetags.c", 180, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; tag_nspaces[i]; i++) {
			tag_nspaces[i].flickcurl_free_tag_namespace();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tag_nspaces/**
		 * flickcurl_free_tag_predicate_value:
		 * @tag_pv: machinetag predicate_value object
		 *
		 * Destructor for machinetag predicate-value pair  object
		 */);
	}
	public static void flickcurl_free_tag_predicate_value() {
		Object generatedPredicate = this.getPredicate();
		if (generatedPredicate) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedPredicate);
		} 
		Object generatedValue = this.getValue();
		if (generatedValue) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedValue);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tag_pv/*
		 * @content_mode: set use of element content: 1 (predicate), 2 (value) otherwise ignored
		 */);
	}
	public static void flickcurl_free_tag_predicate_values() {
		int i;
		do {
			if (!tag_pvs) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_predicate_value_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\machinetags.c", 316, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; tag_pvs[i]; i++) {
			tag_pvs[i].flickcurl_free_tag_predicate_value();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tag_pvs);
	}
	public static Object flickcurl_get_photo_field_label( field) {
		if (field <= .PHOTO_FIELD_LAST) {
			return ModernizedCProgram.flickcurl_photo_field_label[(int)field];
		} 
		return ((Object)0/**
		 * flickcurl_free_photo:
		 * @photo: photo object
		 *
		 * Destructor for photo object
		 */);
	}
	public static Byte flickcurl_photo_id_as_short_uri(Byte photo_id) {
		byte[] buf = new byte[58 + 1];
		int base_count = 58;
		byte p;
		byte r;
		long num = /*Error: Function owner not recognized*/atoll(photo_id);
		byte result;
		if (num <= 0) {
			return ((Object)0/* http://flic.kr/p/{base58-photo id}/ */);
		} 
		p = /* construct the encoding in reverse order into buf */buf;
		while (num >= base_count) {
			double divisor = num / base_count;
			long modulus = (num - (base_count * (long)divisor));
			p++ = ModernizedCProgram.short_uri_alphabet[modulus];
			num = (long)divisor;
		}
		if (num) {
			p++ = ModernizedCProgram.short_uri_alphabet[num];
		} 
		result = (byte)/*Error: Function owner not recognized*/malloc((p - buf) + 17 + 1);
		if (!result) {
			return ((Object)0);
		} 
		r = result;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(result, ModernizedCProgram.short_uri_prefix, 17);
		r += 17;
		while (p != /* now copy it backwards into new result string */buf) {
			r++ = --p;
		}
		r = (byte)'\0';
		return result/**
		 * flickcurl_photo_as_short_uri:
		 * @photo: photo object
		 *
		 * Get a short URI for a photo
		 *
		 * Encoded based on description given in
		 * http://www.flickr.com/groups/api/discuss/72157616713786392/
		 *
		 * Return value: new short URI string or NULL on failure
		 */;
	}
	public static Byte flickcurl_source_uri_as_photo_id(Object uri) {
		byte p = uri;
		byte q = ((Object)0);
		byte photo_id = ((Object)0);
		size_t len = 0;
		if (!p) {
			return ((Object)0);
		} 
		if (/*Error: Function owner not recognized*/memcmp(p, ModernizedCProgram.source_uri_match1, 11)) {
			return ((Object)0);
		} 
		p += 11;
		while (/*Error: Function owner not recognized*/isdigit(/* now at {farm-id}.static... */p)) {
			p++;
		}
		if (/*Error: Function owner not recognized*/memcmp(p, ModernizedCProgram.source_uri_match2, 19)) {
			if (/*Error: Function owner not recognized*/memcmp(p, ModernizedCProgram.source_uri_match3, 18)) {
				return ((Object)0);
			} 
			p += 18;
		} else {
				p += 19;
		} 
		while (/*Error: Function owner not recognized*/isdigit(/* now at {server-id}/{photo_id}_... */p)) {
			p++;
		}
		if (p++ != (byte)'/') {
			return ((Object)0);
		} 
		q = /* now at {photo_id}_... */p;
		while (/*Error: Function owner not recognized*/isdigit(q)) {
			q++;
		}
		if (q != (byte)'_') {
			return ((Object)0);
		} 
		len = q - p;
		photo_id = (byte)/*Error: Function owner not recognized*/malloc(len + 1);
		if (!photo_id) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(photo_id, p, len);
		photo_id[len] = (byte)'\0';
		return photo_id/**
		 * flickcurl_user_icon_uri:
		 * @farm: user icon farm
		 * @server: user icon server or 0
		 * @nsid: user nsid
		 *
		 * Get the user's icon URI
		 *
		 * The icon URI returned is always a 48x48 pixel JPEG.
		 *
		 * If @server is 0 (or the other fields are NULL), the default icon URI of
		 * https://www.flickr.com/images/buddyicon.jpg is returned.
		 *
		 * Defined by https://www.flickr.com/services/api/misc.buddyicons.html
		 *
		 * Return value: new icon URI string or NULL on failure
		 */;
	}
	public static Byte flickcurl_user_icon_uri(int farm, int server, Byte nsid) {
		byte[] buf = new byte[512];
		byte result;
		if (server && farm && nsid) {
			size_t len = new size_t();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(buf, /* https://farm{icon-farm}.staticflickr.com/{icon-server}/buddyicons/{nsid}.jpg */"https://farm%d.staticflickr.com/%d/buddyicons/%s.jpg", farm, server, nsid);
			len = /*Error: Function owner not recognized*/strlen(buf);
			result = (byte)/*Error: Function owner not recognized*/malloc(len + 1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(result, buf, len + 1);
		} else {
				result = (byte)/*Error: Function owner not recognized*/malloc(42 + 1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(result, "https://www.flickr.com/images/buddyicon.jpg", 42 + 1);
		} 
		return result/**
		 * flickcurl_photo_as_user_icon_uri:
		 * @photo: photo object
		 *
		 * Get the user's icon URI
		 *
		 * The icon URI returned is always a 48x48 pixel JPEG
		 *
		 * Return value: new icon URI string or NULL on failure
		 */;
	}
	public static void flickcurl_free_photos_list() {
		do {
			if (!photos_list) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photos_list is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photo.c", 1399, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedFormat = this.getFormat();
		if (generatedFormat) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedFormat);
		} 
		Object generatedPhotos = this.getPhotos();
		if (generatedPhotos) {
			generatedPhotos.flickcurl_free_photos();
		} 
		Object generatedContent = this.getContent();
		if (generatedContent) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedContent);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(photos_list);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-geo-api.c - Flickr flickr.photos.geo.* API calls
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
	 * flickcurl_photos_geo_batchCorrectLocation:
	 * @fc: flickcurl context
	 * @location: The location (lat, long, accuracy) of the photos to update.
	 * @place_id: A Flickr Places ID (or NULL)
	 * @woe_id: A Where On Earth (WOE) ID (or 0)
	 *
	 * Correct the places hierarchy for all the photos for a user at a
	 * given location (latitude, longitude and accuracy).
	 *
	 * You must pass either a valid Places ID in @place_id or a WOE ID in
	 * @woe_id.
	 * 
	 * Batch corrections are processed in a delayed queue so it may take
	 * a few minutes before the changes are reflected in a user's photos.
	 *
	 * Implements flickr.photos.geo.batchCorrectLocation (1.8)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_photos_geo_batchCorrectLocation(flickcurl_s fc,  location, Object place_id, int woe_id) {
		 doc = ((Object)0);
		byte[] latitude_s = new byte[50];
		byte[] longitude_s = new byte[50];
		byte[] accuracy_s = new byte[50];
		byte[] woe_id_str = new byte[10];
		int result = 0;
		fc.flickcurl_init_params(1);
		if (!place_id || !woe_id) {
			return 1;
		} 
		Object generatedLatitude = location.getLatitude();
		if (generatedLatitude < -90.0) {
			location.setLatitude(-90.0);
		} 
		if (generatedLatitude > 90.0) {
			location.setLatitude(90.0);
		} 
		Object generatedLongitude = location.getLongitude();
		if (generatedLongitude < -180.0) {
			location.setLongitude(-180.0);
		} 
		if (generatedLongitude > 180.0) {
			location.setLongitude(180.0);
		} 
		Object generatedAccuracy = location.getAccuracy();
		if (generatedAccuracy < 1 || generatedAccuracy > 16) {
			location.setAccuracy(0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(latitude_s, "%f", generatedLatitude);
		fc.flickcurl_add_param("lat", latitude_s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(longitude_s, "%f", generatedLongitude);
		fc.flickcurl_add_param("lon", longitude_s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(accuracy_s, "%d", generatedAccuracy);
		fc.flickcurl_add_param("accuracy", accuracy_s);
		if (place_id) {
			fc.flickcurl_add_param("place_id", place_id);
		} 
		if (woe_id > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.batchCorrectLocation")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_geo_correctLocation:
		 * @fc: flickcurl context
		 * @photo_id: The ID of the photo whose WOE location is being corrected.
		 * @place_id: A Flickr Places ID (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID (or NULL)
		 * 
		 * Correct a photo location.
		 *
		 * You must pass either a valid Places ID in @place_id or a WOE ID in @woe_id.
		 * 
		 * Implements flickr.photos.geo.correctLocation (1.8)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static  flickcurl_photos_geo_photosForLocation_params(flickcurl_s fc,  location,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] latitude_s = new byte[50];
		byte[] longitude_s = new byte[50];
		byte[] accuracy_s = new byte[50];
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!location) {
			return ((Object)0);
		} 
		Object generatedLatitude = location.getLatitude();
		if (generatedLatitude < -90.0) {
			location.setLatitude(-90.0);
		} 
		if (generatedLatitude > 90.0) {
			location.setLatitude(90.0);
		} 
		Object generatedLongitude = location.getLongitude();
		if (generatedLongitude < -180.0) {
			location.setLongitude(-180.0);
		} 
		if (generatedLongitude > 180.0) {
			location.setLongitude(180.0);
		} 
		Object generatedAccuracy = location.getAccuracy();
		if (generatedAccuracy < 1 || generatedAccuracy > 16) {
			location.setAccuracy(0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(latitude_s, "%f", generatedLatitude);
		fc.flickcurl_add_param("lat", latitude_s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(longitude_s, "%f", generatedLongitude);
		fc.flickcurl_add_param("lon", longitude_s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(accuracy_s, "%d", generatedAccuracy);
		fc.flickcurl_add_param("accuracy", accuracy_s);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.photosForLocation")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_photos_geo_photosForLocation:
		 * @fc: flickcurl context
		 * @location: The location (lat, long, accuracy) of the photos
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: license, date_upload, date_taken, owner_name, icon_server, original_format, last_update, geo, tags, machine_tags, o_dims, views, media (or NULL)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
		 * 
		 * Get a list of photos for a user at a specific location (latitude,
		 * longitude and accuracy)
		 *
		 * Implements flickr.photos.geo.photosForLocation (1.8)
		 * 
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public static int flickcurl_photos_geo_setLocation(flickcurl_s fc, Object photo_id,  location) {
		 doc = ((Object)0);
		byte[] latitude_s = new byte[50];
		byte[] longitude_s = new byte[50];
		byte[] accuracy_s = new byte[50];
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		Object generatedLatitude = location.getLatitude();
		if (generatedLatitude < -90.0) {
			location.setLatitude(-90.0);
		} 
		if (generatedLatitude > 90.0) {
			location.setLatitude(90.0);
		} 
		Object generatedLongitude = location.getLongitude();
		if (generatedLongitude < -180.0) {
			location.setLongitude(-180.0);
		} 
		if (generatedLongitude > 180.0) {
			location.setLongitude(180.0);
		} 
		Object generatedAccuracy = location.getAccuracy();
		if (generatedAccuracy < 1 || generatedAccuracy > 16) {
			location.setAccuracy(0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(latitude_s, "%f", generatedLatitude);
		fc.flickcurl_add_param("lat", latitude_s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(longitude_s, "%f", generatedLongitude);
		fc.flickcurl_add_param("lon", longitude_s);
		if (generatedAccuracy >= 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(accuracy_s, "%d", generatedAccuracy);
			fc.flickcurl_add_param("accuracy", accuracy_s);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.setLocation")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_geo_setPerms:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to get permissions for.
		 * @perms: Geo permissions
		 * 
		 * Set the permission for who may view the geo data associated with a photo.
		 *
		 * Implements flickr.photos.geo.setPerms (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_geo_setPerms(flickcurl_s fc, Object photo_id,  perms) {
		 doc = ((Object)0);
		byte[] is_public_str = new byte[2];
		byte[] is_contact_str = new byte[2];
		byte[] is_friend_str = new byte[2];
		byte[] is_family_str = new byte[2];
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photo_id || !perms) {
			return 1;
		} 
		Object generatedIs_public = perms.getIs_public();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(is_public_str, "%d", (generatedIs_public ? 1 : 0));
		fc.flickcurl_add_param("is_public", is_public_str);
		Object generatedIs_contact = perms.getIs_contact();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(is_contact_str, "%d", (generatedIs_contact ? 1 : 0));
		fc.flickcurl_add_param("is_contact", is_contact_str);
		Object generatedIs_friend = perms.getIs_friend();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(is_friend_str, "%d", (generatedIs_friend ? 1 : 0));
		fc.flickcurl_add_param("is_friend", is_friend_str);
		Object generatedIs_family = perms.getIs_family();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(is_family_str, "%d", (generatedIs_family ? 1 : 0));
		fc.flickcurl_add_param("is_family", is_family_str);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.setPerms")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * user_upload_status.c - Flickcurl user_upload_status functions
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
	 * flickcurl_free_user_upload_status:
	 * @u: user upload status object
	 *
	 * Destructor for user upload status object
	 */
	public static void flickcurl_free_user_upload_status() {
		do {
			if (!u) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_user_upload_status is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\user_upload_status.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedUsername = this.getUsername();
		if (generatedUsername) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUsername);
		} 
		Object generatedSets_remaining = this.getSets_remaining();
		if (generatedSets_remaining) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedSets_remaining);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(u);
	}
	public static Object flickcurl_get_context_type_field_label( type) {
		if (type > .FLICKCURL_CONTEXT_NONE && type <= .FLICKCURL_CONTEXT_LAST) {
			return ModernizedCProgram.flickcurl_context_type_element[(int)type];
		} 
		return ((Object)0/**
		 * flickcurl_free_context:
		 * @context: context object
		 *
		 * Destructor for context object
		 */);
	}
	public static void flickcurl_free_context() {
		do {
			if (!context) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_context is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\context.c", 74, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Object generatedSecret = this.getSecret();
		if (generatedSecret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedSecret);
		} 
		Object generatedTitle = this.getTitle();
		if (generatedTitle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTitle);
		} 
		Object generatedUrl = this.getUrl();
		if (generatedUrl) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
		} 
		Object generatedThumb = this.getThumb();
		if (generatedThumb) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedThumb);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(context/**
		 * flickcurl_free_contexts:
		 * @contexts: context object array
		 *
		 * Destructor for array of context object
		 */);
	}
	public static void flickcurl_free_contexts() {
		int i;
		do {
			if (!contexts) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_context_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\context.c", 101, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; contexts[i]; i++) {
			contexts[i].flickcurl_free_context();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(contexts);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-licenses.c - Flickr flickr.photos.licenses.* API calls
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
	public static int compare_licenses(Object a, Object b) {
		flickcurl_license l_a = (flickcurl_license)a;
		flickcurl_license l_b = (flickcurl_license)b;
		Object generatedId = l_a.getId();
		return generatedId - generatedId;
	}
	public static int compare_strings(Object a, Object b) {
		return /*Error: Function owner not recognized*/strcmp(((byte)a), ((byte)b));
	}
	public static void command_print_person() {
		int i;
		Object generatedNsid = this.getNsid();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Found person with ID %s\n", generatedNsid);
		Object generatedFields = this.getFields();
		for (i = (int).PERSON_FIELD_FIRST; i <= (int).PERSON_FIELD_LAST; i++) {
			flickcurl_person_field_type field = (flickcurl_person_field_type)i;
			flickcurl_field_value_type datatype = generatedFields[field].getType();
			if (datatype == .VALUE_TYPE_NONE) {
				continue;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "field %s (%d) with %s value: '%s' / %d\n", ModernizedCProgram.flickcurl_get_person_field_label(field), field, ModernizedCProgram.flickcurl_get_field_value_type_label(datatype), generatedFields[field].getString(), generatedFields[field].getInteger());
		}
	}
	public static int command_print_location() {
		byte accuracy_label;
		Object generatedAccuracy = this.getAccuracy();
		accuracy_label = ModernizedCProgram.flickcurl_get_location_accuracy_label(generatedAccuracy);
		Object generatedLatitude = this.getLatitude();
		Object generatedLongitude = this.getLongitude();
		if (accuracy_label) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "latitude %f  longitude %f  accuracy %s(%d)\n", generatedLatitude, generatedLongitude, accuracy_label, generatedAccuracy);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "latitude %f  longitude %f  accuracy unknown\n", generatedLatitude, generatedLongitude);
		} 
		return 0;
	}
	public static void command_print_place(Object label, Object value, int print_locality) {
		int i;
		if (label) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: %s %s places\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} 
		Object generatedType = this.getType();
		if (print_locality && generatedType != .FLICKCURL_PLACE_LOCATION) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Type %s (%d)\n", ModernizedCProgram.flickcurl_get_place_type_label(generatedType), (int)generatedType);
		} 
		Object generatedLocation = this.getLocation();
		if (generatedLocation.getAccuracy() != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("  Location: ", (_iob[1]));
			generatedLocation.command_print_location();
		} 
		Object generatedTimezone = this.getTimezone();
		if (generatedTimezone) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Timezone: %s\n", generatedTimezone);
		} 
		Object generatedShape = this.getShape();
		if (generatedShape) {
			generatedShape.command_print_shape();
		} 
		Object generatedCount = this.getCount();
		if (generatedCount > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Photos at Place: %d\n", generatedCount);
		} 
		Object generatedNames = this.getNames();
		Object generatedIds = this.getIds();
		Object generatedUrls = this.getUrls();
		Object generatedWoe_ids = this.getWoe_ids();
		for (i = (int)0; i <= (int).FLICKCURL_PLACE_LAST; i++) {
			byte name = generatedNames[i];
			byte id = generatedIds[i];
			byte url = generatedUrls[i];
			byte woe_id = generatedWoe_ids[i];
			if (!name && !id && !url && !woe_id) {
				continue;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  %d) place %s:", i, ModernizedCProgram.flickcurl_get_place_type_label((flickcurl_place_type)i));
			if (name) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " name '%s'", name);
			} 
			if (id) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " id %s", id);
			} 
			if (woe_id) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " woeid %s", woe_id);
			} 
			if (url) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " url '%s'", url);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
		}
	}
	public static void command_print_video() {
		Object generatedReady = this.getReady();
		Object generatedFailed = this.getFailed();
		Object generatedPending = this.getPending();
		Object generatedDuration = this.getDuration();
		Object generatedWidth = this.getWidth();
		Object generatedHeight = this.getHeight();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "video: ready %d  failed %d  pending %d  duration %d  width %d  height %d\n", generatedReady, generatedFailed, generatedPending, generatedDuration, generatedWidth, generatedHeight);
	}
	public static void command_contexts_print(_iobuf fh, [][] contexts) {
		flickcurl_context context = new flickcurl_context();
		int i;
		Object generatedType = context.getType();
		Object generatedId = context.getId();
		Object generatedSecret = context.getSecret();
		Object generatedServer = context.getServer();
		Object generatedFarm = context.getFarm();
		Object generatedTitle = context.getTitle();
		Object generatedUrl = context.getUrl();
		Object generatedThumb = context.getThumb();
		for (i = 0; (context = contexts[i]); i++) {
			byte label = ModernizedCProgram.flickcurl_get_context_type_field_label(generatedType);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "%d) context type '%s' id %s secret %s server %d farm %d\n  title: %s\n  url: %s\n  thumb: %s\n", i, label, generatedId, (generatedSecret ? generatedSecret : "NULL"), generatedServer, generatedFarm, (generatedTitle ? generatedTitle : "NULL"), (generatedUrl ? generatedUrl : "NULL"), (generatedThumb ? generatedThumb : "NULL"));
		}
	}
	public static void print_upload_status(_iobuf handle,  status, Object label) {
		if (label) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "%s: %s status\n", ModernizedCProgram.program, label);
		} 
		Object generatedPhotoid = status.getPhotoid();
		if (generatedPhotoid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Photo ID: %s\n", generatedPhotoid);
		} 
		Object generatedSecret = status.getSecret();
		if (generatedSecret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Secret: %s\n", generatedSecret);
		} 
		Object generatedOriginalsecret = status.getOriginalsecret();
		if (generatedOriginalsecret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Original Secret: %s\n", generatedOriginalsecret);
		} 
		Object generatedTicketid = status.getTicketid();
		if (generatedTicketid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Ticket ID: %s\n", generatedTicketid);
		} 
	}
	public static Object yesno(int v) {
		return ModernizedCProgram.yn_strings[(v ? 1 : 0)];
	}
	public static void print_upload_params(_iobuf handle,  params, Object label) {
		if (label) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "%s: %s\n", ModernizedCProgram.program, label);
		} 
		Object generatedPhoto_file = params.getPhoto_file();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  File: %s\n", generatedPhoto_file);
		Object generatedTitle = params.getTitle();
		if (generatedTitle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Title: '%s'\n", generatedTitle);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Title: none\n");
		} 
		Object generatedDescription = params.getDescription();
		if (generatedDescription) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Description: '%s'\n", generatedDescription);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Description: none\n");
		} 
		Object generatedTags = params.getTags();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Tags: %s\n", (generatedTags ? generatedTags : ""));
		Object generatedIs_public = params.getIs_public();
		Object generatedIs_friend = params.getIs_friend();
		Object generatedIs_family = params.getIs_family();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Viewable by Public: %s  Friends: %s  Family: %s\n", ModernizedCProgram.yesno(generatedIs_public), ModernizedCProgram.yesno(generatedIs_friend), ModernizedCProgram.yesno(generatedIs_family));
		Object generatedSafety_level = params.getSafety_level();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Safety level: %s (%d)\n", ModernizedCProgram.flickcurl_get_safety_level_label(generatedSafety_level), generatedSafety_level);
		Object generatedContent_type = params.getContent_type();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Content type: %s (%d)\n", ModernizedCProgram.flickcurl_get_content_type_label(generatedContent_type), generatedContent_type);
		Object generatedHidden = params.getHidden();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(handle, "  Hidden: %s (%d)\n", ModernizedCProgram.flickcurl_get_hidden_label(generatedHidden), generatedHidden);
	}
	public static int parse_bool_param(Object param) {
		byte eptr;
		int b;
		if (!param || (!/*Error: Function owner not recognized*/strcmp(param, "false") || !/*Error: Function owner not recognized*/strcmp(param, "no"))) {
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(param, "true") || !/*Error: Function owner not recognized*/strcmp(param, "yes")) {
			return 1;
		} 
		eptr = ((Object)0);
		b = (int)/*Error: Function owner not recognized*/strtol(param, eptr, 10);
		if (eptr) {
			return 0;
		} 
		return (b != 0);
	}
	public static void command_print_perms(int show_comment_metadata) {
		byte[] perms_labels = new byte[]{"nobody", "friends and family", "contacts", "everybody"};
		Object generatedIs_public = this.getIs_public();
		Object generatedIs_contact = this.getIs_contact();
		Object generatedIs_friend = this.getIs_friend();
		Object generatedIs_family = this.getIs_family();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "view perms: public: %s  contact: %s  friend: %s  family: %s\n", ModernizedCProgram.yesno(generatedIs_public), ModernizedCProgram.yesno(generatedIs_contact), ModernizedCProgram.yesno(generatedIs_friend), ModernizedCProgram.yesno(generatedIs_family));
		Object generatedPerm_comment = this.getPerm_comment();
		Object generatedPerm_addmeta = this.getPerm_addmeta();
		if (show_comment_metadata) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "add comment: %s\nadd metadata: %s\n", (((generatedPerm_comment) >= 0 && (generatedPerm_comment) <= 3) ? perms_labels[(generatedPerm_comment)] : "?"), (((generatedPerm_addmeta) >= 0 && (generatedPerm_addmeta) <= 3) ? perms_labels[(generatedPerm_addmeta)] : "?"));
		} 
	}
	public static int command_print_photos_list(flickcurl_s fc,  photos_list, _iobuf fh, Object label) {
		int rc = 0;
		int i;
		Object generatedPhotos = photos_list.getPhotos();
		Object generatedPhotos_count = photos_list.getPhotos_count();
		Object generatedTotal_count = photos_list.getTotal_count();
		Object generatedPage = photos_list.getPage();
		Object generatedPer_page = photos_list.getPer_page();
		Object generatedContent = photos_list.getContent();
		Object generatedContent_length = photos_list.getContent_length();
		Object generatedFormat = photos_list.getFormat();
		if (generatedPhotos) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: %s returned %d photos out of %d, page %d per-page %d\n", ModernizedCProgram.program, label, generatedPhotos_count, generatedTotal_count, generatedPage, generatedPer_page);
			for (i = 0; generatedPhotos[i]; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: %s photo %d\n", ModernizedCProgram.program, label, i);
				generatedPhotos[i].command_print_photo();
			}
		}  else if (generatedContent) {
			size_t write_count = new size_t();
			if (ModernizedCProgram.verbose) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: %s returned %d bytes of %s content\n", ModernizedCProgram.program, label, (int)generatedContent_length, generatedFormat);
			} 
			write_count = /*Error: Function owner not recognized*/fwrite(generatedContent, 1, generatedContent_length, fh);
			if (write_count < generatedContent_length) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: writing to %s failed\n", ModernizedCProgram.program, ModernizedCProgram.output_filename);
				rc = 1;
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: %s returned neither photos nor raw content\n", ModernizedCProgram.program, label);
				rc = 1;
		} 
		return rc;
	}
	public static int parse_page_param(Object param) {
		byte eptr;
		int i;
		if (!param || param == (byte)'-') {
			return -1;
		} 
		eptr = ((Object)0);
		i = (int)/*Error: Function owner not recognized*/strtol(param, eptr, 10);
		if (eptr) {
			return -1;
		} 
		return i;
	}
	public static void command_print_group() {
		Object generatedNsid = this.getNsid();
		Object generatedName = this.getName();
		Object generatedDescription = this.getDescription();
		Object generatedLang = this.getLang();
		Object generatedRules = this.getRules();
		Object generatedIs_admin = this.getIs_admin();
		Object generatedIs_moderator = this.getIs_moderator();
		Object generatedIs_member = this.getIs_member();
		Object generatedIs_pool_moderated = this.getIs_pool_moderated();
		Object generatedPrivacy = this.getPrivacy();
		Object generatedIconserver = this.getIconserver();
		Object generatedIconfarm = this.getIconfarm();
		Object generatedPhotos = this.getPhotos();
		Object generatedMembers = this.getMembers();
		Object generatedThrottle_count = this.getThrottle_count();
		Object generatedThrottle_mode = this.getThrottle_mode();
		Object generatedThrottle_remaining = this.getThrottle_remaining();
		Object generatedPool_count = this.getPool_count();
		Object generatedTopic_count = this.getTopic_count();
		Object generatedPhotos_ok = this.getPhotos_ok();
		Object generatedVideos_ok = this.getVideos_ok();
		Object generatedImages_ok = this.getImages_ok();
		Object generatedScreens_ok = this.getScreens_ok();
		Object generatedArt_ok = this.getArt_ok();
		Object generatedSafe_ok = this.getSafe_ok();
		Object generatedModerate_ok = this.getModerate_ok();
		Object generatedRestricted_ok = this.getRestricted_ok();
		Object generatedHas_geo = this.getHas_geo();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "group: nsid %s  name '%s'\n  description '%s'  lang '%s'\n  rules '%s'\n  user is?  admin %d moderator %d member %d\n  pool moderated %d  privacy %d\n  iconserver %d  iconfarm %d\n  photos %d   members %d\n  throttle count %d  mode '%s'  remaining %d\n  pool count %d  topic count %d\n  restrictions photos %d videos %d images %d screens %d art %d\n  restrictions safe %d moderate %d restricted %d\n  restrictions has geo %d\n", generatedNsid, generatedName, (generatedDescription ? generatedDescription : ""), (generatedLang ? generatedLang : ""), (generatedRules ? generatedRules : ""), generatedIs_admin, generatedIs_moderator, generatedIs_member, generatedIs_pool_moderated, generatedPrivacy, generatedIconserver, generatedIconfarm, generatedPhotos, generatedMembers, generatedThrottle_count, (generatedThrottle_mode ? generatedThrottle_mode : ""), generatedThrottle_remaining, generatedPool_count, generatedTopic_count, generatedPhotos_ok, generatedVideos_ok, generatedImages_ok, generatedScreens_ok, generatedArt_ok, generatedSafe_ok, generatedModerate_ok, generatedRestricted_ok, generatedHas_geo);
	}
	public static void command_print_exif() {
		Object generatedTagspace = this.getTagspace();
		Object generatedTagspaceid = this.getTagspaceid();
		Object generatedTag = this.getTag();
		Object generatedLabel = this.getLabel();
		Object generatedRaw = this.getRaw();
		Object generatedClean = this.getClean();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "tagspace %s (%d) tag %d label '%s' raw '%s' clean '%s'\n", generatedTagspace, generatedTagspaceid, generatedTag, generatedLabel, generatedRaw, generatedClean);
	}
	public static void command_print_photoset() {
		Object generatedId = this.getId();
		Object generatedPrimary = this.getPrimary();
		Object generatedSecret = this.getSecret();
		Object generatedServer = this.getServer();
		Object generatedFarm = this.getFarm();
		Object generatedPhotos_count = this.getPhotos_count();
		Object generatedTitle = this.getTitle();
		Object generatedDescription = this.getDescription();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: Found photoset with ID %s primary photo: '%s' secret: %s server: %d farm: %d photos count: %d title: '%s' description: '%s'\n", ModernizedCProgram.program, generatedId, generatedPrimary, generatedSecret, generatedServer, generatedFarm, generatedPhotos_count, generatedTitle, (generatedDescription ? generatedDescription : "(No description)"));
	}
	public static void command_print_activity() {
		int i;
		Object generatedType = this.getType();
		Object generatedId = this.getId();
		Object generatedOwner = this.getOwner();
		Object generatedOwner_name = this.getOwner_name();
		Object generatedPrimary = this.getPrimary();
		Object generatedSecret = this.getSecret();
		Object generatedServer = this.getServer();
		Object generatedFarm = this.getFarm();
		Object generatedComments = this.getComments();
		Object generatedComments_old = this.getComments_old();
		Object generatedComments_new = this.getComments_new();
		Object generatedNotes_old = this.getNotes_old();
		Object generatedNotes_new = this.getNotes_new();
		Object generatedViews = this.getViews();
		Object generatedPhotos = this.getPhotos();
		Object generatedFaves = this.getFaves();
		Object generatedMore = this.getMore();
		Object generatedTitle = this.getTitle();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  type %s  id %s  owner %s name '%s'  primary %s\n  secret %s  server %d farm %d\n  comments %d old/new %d/%d  notes old/new %d/%d\n  views %d  photos %d  faves %d  more %d\n  title '%s'\n", generatedType, generatedId, generatedOwner, generatedOwner_name, (generatedPrimary ? generatedPrimary : ""), generatedSecret, generatedServer, generatedFarm, generatedComments, generatedComments_old, generatedComments_new, generatedNotes_old, generatedNotes_new, generatedViews, generatedPhotos, generatedFaves, generatedMore, generatedTitle);
		Object generatedEvents = this.getEvents();
		Object generatedUser = ae.getUser();
		Object generatedUsername = ae.getUsername();
		Object generatedDate_added = ae.getDate_added();
		Object generatedValue = ae.getValue();
		for (i = 0; generatedEvents[i]; i++) {
			flickcurl_activity_event ae = generatedEvents[i];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "    activity event %i) type %s  user %s  username %s\n      datetime %d\n      value '%s'\n", i, generatedType, generatedUser, generatedUsername, generatedDate_added, generatedValue);
		}
	}
	public static void command_print_predicate_values(Object label) {
		int i;
		if (label) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: %s\n", ModernizedCProgram.program, label);
		} 
		Object generatedPredicate = tpv.getPredicate();
		Object generatedValue = tpv.getValue();
		Object generatedUsage_count = tpv.getUsage_count();
		Object generatedUsed_in_namespace_count = tpv.getUsed_in_namespace_count();
		for (i = 0; tag_pvs[i]; i++) {
			flickcurl_tag_predicate_value tpv = tag_pvs[i];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  #%d) ", i);
			if (generatedPredicate) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("predicate ", (_iob[1]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(generatedPredicate, (_iob[1]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)' ', (_iob[1]));
			} 
			if (generatedValue) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("value ", (_iob[1]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(generatedValue, (_iob[1]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)' ', (_iob[1]));
			} 
			if (generatedUsage_count > 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "usage %d", generatedUsage_count);
			} 
			if (generatedUsed_in_namespace_count > 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "used in %d namespaces", generatedUsed_in_namespace_count);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
		}
	}
	public static void command_print_institution(int ix) {
		int i;
		Object generatedNsid = this.getNsid();
		Object generatedDate_launch = this.getDate_launch();
		Object generatedName = this.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Institution %d:\n  NSID: %s\n  Date launch: %d\n  Name: %s\n", ix, generatedNsid, generatedDate_launch, generatedName);
		Object generatedUrls = this.getUrls();
		for (i = 0; i <= .FLICKCURL_INSTITUTION_URL_LAST; i++) {
			if (generatedUrls[i]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  URL %s: %s\n", ModernizedCProgram.flickcurl_get_institution_url_type_label((flickcurl_institution_url_type)i), generatedUrls[i]);
			} 
		}
	}
	public static void command_print_member(int i) {
		Object generatedNsid = this.getNsid();
		Object generatedUsername = this.getUsername();
		Object generatedIconserver = this.getIconserver();
		Object generatedIconfarm = this.getIconfarm();
		Object generatedMember_type = this.getMember_type();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "member %d: NSID %s username %s iconserver %d iconfarm %d member type %d\n", i, generatedNsid, generatedUsername, generatedIconserver, generatedIconfarm, generatedMember_type);
	}
	public static void command_print_gallery() {
		Object generatedId = this.getId();
		Object generatedUrl = this.getUrl();
		Object generatedOwner = this.getOwner();
		Object generatedDate_create = this.getDate_create();
		Object generatedDate_update = this.getDate_update();
		Object generatedCount_photos = this.getCount_photos();
		Object generatedCount_videos = this.getCount_videos();
		Object generatedTitle = this.getTitle();
		Object generatedDescription = this.getDescription();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "id %s  url %s  owner %s\n  date create %d  date update %d\n  count of photos %d  count of videos %d\n  title '%s'\n  description '%s'\n", generatedId, generatedUrl, generatedOwner, generatedDate_create, generatedDate_update, generatedCount_photos, generatedCount_videos, generatedTitle, generatedDescription);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("  primary ", (_iob[1]));
		Object generatedPrimary_photo = this.getPrimary_photo();
		generatedPrimary_photo.command_print_photo();
	}
	public static void command_print_stat() {
		Object generatedViews = this.getViews();
		Object generatedComments = this.getComments();
		Object generatedFavorites = this.getFavorites();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Views %d  Comments %d  Favorites %d", generatedViews, generatedComments, generatedFavorites);
		Object generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Name %s", generatedName);
		} 
		Object generatedUrl = this.getUrl();
		if (generatedUrl) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Url %s", generatedUrl);
		} 
		Object generatedSearchterms = this.getSearchterms();
		if (generatedSearchterms) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Search terms %s", generatedSearchterms);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
	}
	public static void command_print_stats() {
		int i;
		for (i = 0; stats[i]; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: Statistic %d\n", ModernizedCProgram.program, i);
			stats[i].command_print_stat();
		}
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * interestingness-api.c - Flickr flickr.interestingness.* API calls
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
	 * flickcurl_interestingness_getList_params:
	 * @fc: flickcurl context
	 * @date: A specific date, formatted as YYYY-MM-DD, to return interesting photos for. (or NULL)
	 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
	 * 
	 * Returns the list of interesting photos for the most recent day or a user-specified date.
	 *
	 * Optional extra type 'media' that will return an extra media = VALUE
	 * for VALUE "photo" or "video".  API addition 2008-04-07.
	 *
	 * Return value: non-0 on failure
	 **/
	public static  flickcurl_interestingness_getList_params(flickcurl_s fc, Object date,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (/* API parameters */date) {
			fc.flickcurl_add_param("date", date);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.interestingness.getList")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_interestingness_getList:
		 * @fc: flickcurl context
		 * @date: A specific date, formatted as YYYY-MM-DD, to return interesting photos for. (or NULL)
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. See #flickcurl_photos_list_params for the full list (or NULL)
		 * @per_page: Number of photos to return per page default 100, max 500
		 * @page: The page of results to return, default 1
		 * 
		 * Returns the list of interesting photos for the most recent day or a user-specified date.
		 *
		 * See flickcurl_interestingness_getList() for full description of arguments.
		 *
		 * Implements flickr.interestingness.getList (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	/* 
	 * Public Domain getopt - history below
	 *
	 */
	/*
	 * From: gwyn@brl-tgr.ARPA (Doug Gwyn <gwyn>) Newsgroups: net.sources
	 * Subject: getopt library routine Date: 30 Mar 85 04:45:33 GMT
	 */
	/*
	 * getopt -- public domain version of standard System V routine
	 * 
	 * Strictly enforces the System V Command Syntax Standard; provided by D A
	 * Gwyn of BRL for generic ANSI C implementations
	 * 
	 * #define STRICT to prevent acceptance of clustered options with arguments
	 * and ommision of whitespace between option and arg.
	 */
	/*
	 * Modified by Manuel Novoa III on 1/5/01 to use weak symbols.
	 * Programs needing long options will link gnu_getopt instead.
	 */
	/*
	 * Last public domain version 1.5 downloaded from uclibc CVS:
	 * http://www.uclibc.org/cgi-bin/cvsweb/uClibc/libc/unistd/getopt.c
	 * on 2003-02-18 by Dave Beckett and tidied:
	 *   Ran through "indent getopt.c -gnu" then fixed up the mess
	 *   Removed register - compilers are smart these days
	 *   ANSI-fied the declarations
	 *   Prefixed with flickcurl_ so that it doesn't clash with any getopt
	 *   linked in later.
	 */
	/* error => print message */
	/* next argv[] index */
	/* Set for unknown arguments */
	/* option parameter if any */
	/*
	 * Err:
	 * program name argv[0]
	 * specific message
	 * defective option letter
	 */
	/* returns '?' */
	public static int Err(Byte name, Byte mess, int c) {
		ModernizedCProgram.optopt = c;
		if (ModernizedCProgram.opterr) {
			(Object)/*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: %s -- %c\n", name, mess, c);
		} 
		return /* erroneous-option marker */(byte)'?';
	}
	public static int getopt(int argc, byte[][] argv, Object optstring) {
		int sp = /* position within argument */1;
		/* saved `sp' for param test */int osp;
		/* saved `optind' for param test */int oind;
		/* option letter */int c;
		/* -> option in `optstring' */byte cp;
		ModernizedCProgram.optarg = ((Object)0);
		if (ModernizedCProgram.optind == /* initialise getopt vars */0) {
			ModernizedCProgram.optind = 1;
			ModernizedCProgram.opterr = 1;
			ModernizedCProgram.optopt = 1;
			ModernizedCProgram.optarg = ((Object)0);
		} 
		if (sp == 1) {
			if (ModernizedCProgram.optind >= /* fresh argument *//* no more arguments */argc || argv[ModernizedCProgram.optind][0] != /* no more options */(byte)'-' || argv[ModernizedCProgram.optind][1] == /* not option; stdin */(byte)'\0') {
				return (true);
			}  else if (/*Error: Function owner not recognized*/strcmp(argv[ModernizedCProgram.optind], "--") == 0) {
				++/* skip over "--" */ModernizedCProgram.optind;
				return (/* "--" marks end of options */true);
			} 
		} 
		c = argv[ModernizedCProgram.optind][/* option letter */sp];
		osp = /* get ready for next letter */sp++;
		oind = /* save optind for param test */ModernizedCProgram.optind;
		if (argv[ModernizedCProgram.optind][sp] == (byte)'\0') {
			++/* end of argument *//* get ready for next try */ModernizedCProgram.optind;
			sp = /* beginning of next argument */1;
		} 
		if (c == (byte)':' || c == /* optstring syntax conflict */(byte)'?' || (cp = /*Error: Function owner not recognized*/strchr(optstring, c)) == ((Object)/* not found */0)) {
			return ModernizedCProgram.Err(argv[0], "illegal option", c);
		} 
		if (cp[1] == (byte)':'/* option takes parameter */) {
			if (oind == ModernizedCProgram.optind) {
				ModernizedCProgram.optarg = argv[ModernizedCProgram.optind][/* argument w/o whitespace */sp];
				sp = /* beginning of next argument */1;
			}  else if (ModernizedCProgram.optind >= argc) {
				return ModernizedCProgram.Err(argv[0], "option requires an argument", c);
			} else {
					ModernizedCProgram.optarg = argv[/* argument w/ whitespace */ModernizedCProgram.optind];
			} 
			++/* skip over parameter */ModernizedCProgram.optind;
		} 
		return c;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * raptor_fake.c - Fake Raptor V2 - just enough for flickrdf.c
	 *
	 * Copyright (C) 2011-2012, David Beckett http://www.dajobe.org/
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
	public static Object raptor_new_world() {
		return ((Object)0);
	}
	public static int raptor_world_open(Object world) {
		return 0;
	}
	public static void raptor_free_world(Object world) {
	}
	public static Object raptor_new_uri(Object world, Object uri_string) {
		size_t len = new size_t();
		raptor_uri u = new raptor_uri();
		if (!uri_string) {
			return ((Object)0);
		} 
		len = /*Error: Function owner not recognized*/strlen((byte)uri_string);
		u = (raptor_uri)/*Error: Function owner not recognized*/malloc(len + 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(u, uri_string, len + 1);
		return u;
	}
	public static Object raptor_new_uri_from_uri_local_name(Object world, Object uri, Object local_name) {
		size_t len1 = new size_t();
		size_t len2 = new size_t();
		raptor_uri newu = new raptor_uri();
		if (!uri || !local_name) {
			return ((Object)0);
		} 
		len1 = /*Error: Function owner not recognized*/strlen((byte)uri);
		len2 = /*Error: Function owner not recognized*/strlen((byte)local_name);
		newu = (raptor_uri)/*Error: Function owner not recognized*/malloc(len1 + len2 + 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(newu, uri, len1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(newu + len1, local_name, len2 + 1);
		return newu;
	}
	public static Object raptor_new_uri_from_uri(Object uri) {
		return ModernizedCProgram.raptor_new_uri(((Object)0), (byte)uri);
	}
	public static void raptor_free_uri(Object u) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(u);
	}
	public static  raptor_new_term_from_blank(Object world, Object blank) {
		raptor_term newt = new raptor_term();
		size_t blank_len = new size_t();
		if (!blank) {
			return ((Object)0);
		} 
		blank_len = /*Error: Function owner not recognized*/strlen((byte)blank);
		newt = (raptor_term)/*Error: Function owner not recognized*/calloc(/*Error: sizeof expression not supported yet*/, 1);
		newt.setType(.RAPTOR_TERM_TYPE_BLANK);
		Object generatedValue = newt.getValue();
		generatedValue.getBlank().setString(/*Error: Function owner not recognized*/malloc(blank_len + 1));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedValue.getBlank().getString(), blank, blank_len + 1);
		return newt;
	}
	public static  raptor_new_term_from_uri_string(Object world, Object uri_string) {
		raptor_term newt = new raptor_term();
		if (!uri_string) {
			return ((Object)0);
		} 
		newt = (raptor_term)/*Error: Function owner not recognized*/calloc(/*Error: sizeof expression not supported yet*/, 1);
		newt.setType(.RAPTOR_TERM_TYPE_URI);
		Object generatedValue = newt.getValue();
		generatedValue.setUri(ModernizedCProgram.raptor_new_uri(world, uri_string));
		return newt;
	}
	public static  raptor_new_term_from_uri(Object world, Object uri) {
		return ModernizedCProgram.raptor_new_term_from_uri_string(world, (byte)uri);
	}
	public static  raptor_new_term_from_literal(Object world, Object literal, Object datatype, Object language) {
		raptor_term newt = new raptor_term();
		size_t literal_len = new size_t();
		if (!literal) {
			return ((Object)0);
		} 
		literal_len = /*Error: Function owner not recognized*/strlen((byte)literal);
		newt = (raptor_term)/*Error: Function owner not recognized*/calloc(/*Error: sizeof expression not supported yet*/, 1);
		newt.setType(.RAPTOR_TERM_TYPE_LITERAL);
		Object generatedValue = newt.getValue();
		generatedValue.getLiteral().setString((byte)/*Error: Function owner not recognized*/malloc(literal_len + 1));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedValue.getLiteral().getString(), literal, literal_len + 1);
		if (datatype) {
			generatedValue.getLiteral().setDatatype(ModernizedCProgram.raptor_new_uri_from_uri(datatype));
		} 
		return newt;
	}
	public static void raptor_free_term() {
		Object generatedType = this.getType();
		Object generatedValue = this.getValue();
		if (generatedType == .RAPTOR_TERM_TYPE_URI) {
			ModernizedCProgram.raptor_free_uri(generatedValue.getUri());
		} 
		if (generatedType == .RAPTOR_TERM_TYPE_BLANK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedValue.getBlank().getString());
		} 
		if (generatedType == .RAPTOR_TERM_TYPE_LITERAL) {
			if (generatedValue.getLiteral().getDatatype()) {
				ModernizedCProgram.raptor_free_uri(generatedValue.getLiteral().getDatatype());
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedValue.getLiteral().getString());
		} 
	}
	public static int raptor_world_is_serializer_name(Object world, Object name) {
		int i;
		for (i = 0; i < 2; i++) {
			if (/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.serializers[i].getNames()[0], name)) {
				return 1;
			} 
		}
		return 0;
	}
	public static Object raptor_world_get_serializer_description(Object world, int counter) {
		if (counter > (2 - 1)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.serializers[counter];
	}
	public static  raptor_new_serializer(Object world, Object serializer_name) {
		raptor_serializer s = new raptor_serializer();
		s = (raptor_serializer)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
		s.setOutput_turtle(!/*Error: Function owner not recognized*/strcmp((byte)serializer_name, "turtle"));
		return s;
	}
	public static void raptor_free_serializer() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s);
	}
	public static void raptor_serializer_set_namespace(Object uri, Object prefix) {
		Object generatedFh = this.getFh();
		FILE fh = generatedFh;
		Object generatedOutput_turtle = this.getOutput_turtle();
		if (generatedOutput_turtle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "@prefix %s: <%s> .\n", (byte)prefix, (byte)uri);
		} 
	}
	public static void raptor_serializer_start_to_file_handle( serializer, Object base_uri, _iobuf fh) {
		serializer.setFh(fh);
		Object generatedOutput_turtle = serializer.getOutput_turtle();
		if (base_uri && generatedOutput_turtle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "@base <%s>\n", (byte)base_uri);
		} 
	}
	public static void raptor_serializer_serialize_statement( s) {
		Object generatedFh = this.getFh();
		FILE fh = generatedFh;
		Object generatedSubject = s.getSubject();
		if (generatedSubject.getType() == .RAPTOR_TERM_TYPE_URI) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "<%s>", (byte)generatedSubject.getValue().getUri());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "_:%s", (byte)generatedSubject.getValue().getBlank().getString());
		} 
		Object generatedPredicate = s.getPredicate();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, " <%s> ", (byte)generatedPredicate.getValue().getUri());
		Object generatedObject = s.getObject();
		if (generatedObject.getType() == .RAPTOR_TERM_TYPE_LITERAL) {
			byte p;
			byte c;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'"', fh);
			for (p = (byte)generatedObject.getValue().getLiteral().getString(); (c = p); p++) {
				if (c == (byte)'\n') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\\\n", fh);
					continue;
				}  else if (c == (byte)'\t') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\\\t", fh);
					continue;
				} 
				if (c == (byte)'\r') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\\\r", fh);
					continue;
				}  else if (c == (byte)'"' || c == (byte)'\\') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\\', fh);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc(c, fh);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'"', fh);
			if (generatedObject.getValue().getLiteral().getDatatype()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("^^<", fh);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs((byte)generatedObject.getValue().getLiteral().getDatatype(), fh);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'>', fh);
			} 
		}  else if (generatedObject.getType() == .RAPTOR_TERM_TYPE_URI) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "<%s>", (byte)generatedObject.getValue().getUri());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "_:%s", (byte)generatedObject.getValue().getBlank().getString());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(" . \n", fh);
	}
	public static void raptor_serializer_serialize_end() {
		Object generatedFh = this.getFh();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fflush(generatedFh);
	}
	public static void raptor_statement_init(Object world) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(statement, (byte)'\0', /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
	}
	public static void raptor_statement_clear() {
		Object generatedSubject = this.getSubject();
		generatedSubject.raptor_free_term();
		Object generatedPredicate = this.getPredicate();
		generatedPredicate.raptor_free_term();
		Object generatedObject = this.getObject();
		generatedObject.raptor_free_term();
	}
	public static void print_help_string() {
		int i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Call the Flickr API to get information.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s [OPTIONS] command args...\n\n", ModernizedCProgram.program);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_license_string);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_home_url_string);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -a  Authenticate with a FROB and write auth config");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -d  Set delay between requests in milliseconds");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -h  Print this help, then exit");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -o  Write format = FORMAT results to FILE");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -q  Print less information while running");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -v  Print the flickcurl version");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -V  Print more information while running");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nCommands:\n", (_iob[1]));
		for (i = 0; ModernizedCProgram.commands[i].getName(); i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("    %-28s %s\n      %s\n", ModernizedCProgram.commands[i].getName(), ModernizedCProgram.commands[i].getArgs(), ModernizedCProgram.commands[i].getDescription());
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nNSID is a user's Flickr ID, resembling the form 00000000@N00\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nA prefix of `flickr.' may be optionally given in all commands\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nParameters for API calls that return lists of photos:\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n  EXTRAS is a comma-separated list of optional fields to return from:\n", (_iob[1]));
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_extras_format_info(i, name, label)) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("    %-16s %s\n", name, label);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n  GROUP-EXTRAS is a comma-separated list of optional fields to return from:\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("    privacy\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("    throttle\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("    restrictions\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n  FORMAT is result syntax format:\n", (_iob[1]));
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_feed_format_info(i, name, label, ((Object)0))) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("    %-16s %s\n", name, label);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n  PAGE is result page number or '-' for default (1 = first page)\n\n  PER-PAGE is photos per result page or '-' for default (10)\n", (_iob[1]));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", (_iob[/* Extra space for neater distinctions in output */1]));
	}
	public static  flickcurl_people_getPublicPhotos_params(flickcurl_s fc, Object user_id,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("user_id", /* API parameters */user_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.people.getPublicPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_people_getPublicPhotos:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photos to return.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record.
		 * @per_page: Number of photos to return per page (default 100, max 500)
		 * @page: The page of results to return (default 1)
		 * 
		 * Get a list of public photos for the given user.
		 *
		 * See flickcurl_people_getPublicPhotos_params() for details of extras.
		 *
		 * Implements flickr.people.getPublicPhotos (0.12)
		 * 
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public static  flickcurl_people_getPhotos_params(flickcurl_s fc, Object user_id, int safe_search, Object min_upload_date, Object max_upload_date, Object min_taken_date, Object max_taken_date, int content_type, int privacy_filter,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		byte[] safe_search_s = new byte[4];
		byte[] content_type_s = new byte[4];
		byte[] privacy_filter_s = new byte[4];
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("user_id", user_id);
		if (safe_search >= 0 && safe_search < 10) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(safe_search_s, "%d", safe_search);
			fc.flickcurl_add_param("safe_search", safe_search_s);
		} 
		if (min_upload_date) {
			fc.flickcurl_add_param("min_upload_date", min_upload_date);
		} 
		if (max_upload_date) {
			fc.flickcurl_add_param("max_upload_date", max_upload_date);
		} 
		if (min_taken_date) {
			fc.flickcurl_add_param("min_taken_date", min_taken_date);
		} 
		if (max_taken_date) {
			fc.flickcurl_add_param("max_taken_date", max_taken_date);
		} 
		if (content_type >= 0 && content_type < 10) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(content_type_s, "%d", content_type);
			fc.flickcurl_add_param("content_type", content_type_s);
		} 
		if (privacy_filter >= 0 && privacy_filter < 10) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(privacy_filter_s, "%d", privacy_filter);
			fc.flickcurl_add_param("privacy_filter", privacy_filter_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.people.getPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_people_getPhotos:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photos to return. A value of "me" will return the calling user's photos.
		 * @safe_search: Safe search setting: 1 for safe, 2 for moderate, 3 for restricted. (Please note: Un-authed calls can only see Safe content.) (or < 0)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @content_type: Content Type setting: 1 for photos only, 2 for screenshots only, 3 for 'other' only, 4 for photos and screenshots, 5 for screenshots and 'other', 6 for photos and 'other', 7 for photos, screenshots, and 'other' (all) (or < 0)
		 * @privacy_filter: Return photos only matching a certain privacy level. This only applies when making an authenticated call to view photos you own. Valid values are: 1 public photos, 2 private photos visible to friends, 3 private photos visible to family, 4 private photos visible to friends & family, 5 completely private photo (or < 0)
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: <code>description</code>, <code>license</code>, <code>date_upload</code>, <code>date_taken</code>, <code>owner_name</code>, <code>icon_server</code>, <code>original_format</code>, <code>last_update</code>, <code>geo</code>, <code>tags</code>, <code>machine_tags</code>, <code>o_dims</code>, <code>views</code>, <code>media</code>, <code>path_alias</code>, <code>url_sq</code>, <code>url_t</code>, <code>url_s</code>, <code>url_m</code>, <code>url_o</code> (or NULL)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get photos from the given user's photostream.
		 *
		 * Only photos visible to the calling user will be returned. This
		 * method must be authenticated; to return public photos for a user,
		 * use flickcurl_people_getPublicPhotos().
		 *
		 * Implements flickr.people.getPhotos (1.18)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static  flickcurl_people_getPhotosOf_params(flickcurl_s fc, Object user_id,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return photos_list;
		} 
		fc.flickcurl_add_param("user_id", user_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.people.getPhotosOf")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_people_getPhotosOf:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photo to search. A value of "me" will search against the calling user's photos for authenticated calls.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Returns a list of photos containing a particular Flickr member.
		 *
		 * Implements flickr.people.getPhotosOf (1.17) 
		 *
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 * 
		 * Return value: photos array or NULL on failure
		 **/;
	}
	public static int read_ini_config(Object filename, Object section, Object user_data, Object handler) {
		return ((Object)0).flickcurl_config_read_ini(filename, section, user_data, handler/**
		 * flickcurl_config_var_handler:
		 * @userdata: user data pointing to #flickcurl object
		 * @key: var key
		 * @value: var value
		 *
		 * Standard handler for flickcurl_config_read_ini()
		 *
		 */);
	}
	public static void flickcurl_config_var_handler(Object userdata, Object key, Object value) {
		flickcurl fc = (flickcurl)userdata;
		if (!/*Error: Function owner not recognized*/strcmp(key, "api_key")) {
			fc.flickcurl_set_api_key(value);
		}  else if (!/*Error: Function owner not recognized*/strcmp(key, "secret")) {
			fc.flickcurl_set_shared_secret(value);
		}  else if (!/*Error: Function owner not recognized*/strcmp(key, "auth_token")) {
			fc.flickcurl_set_auth_token(value);
		}  else if (!/*Error: Function owner not recognized*/strcmp(key, "oauth_client_key")) {
			fc.flickcurl_set_oauth_client_key(value);
		}  else if (!/*Error: Function owner not recognized*/strcmp(key, "oauth_client_secret")) {
			fc.flickcurl_set_oauth_client_secret(value);
		}  else if (!/*Error: Function owner not recognized*/strcmp(key, "oauth_token")) {
			fc.flickcurl_set_oauth_token(value);
		}  else if (!/*Error: Function owner not recognized*/strcmp(key, "oauth_token_secret")) {
			fc.flickcurl_set_oauth_token_secret(value/**
			 * flickcurl_config_write_ini:
			 * @fc: #flickcurl object
			 * @filename: filename
			 * @section: section name to use
			 *
			 * Write flickcurl library configuration in INI file format to the given file
			 *
			 * Return value: non-0 on failure
			 *
			 */);
		} 
	}
	public static void flickcurl_free_tag_cluster() {
		do {
			if (!tc) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_cluster is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 256, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedTags = this.getTags();
		if (generatedTags) {
			int i;
			for (i = 0; generatedTags[i]; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTags[i]);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTags);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tc/**
		 * flickcurl_free_tag_clusters:
		 * @tcs: tag clusters object
		 *
		 * Destructor for tag clusters object
		 */);
	}
	public static void flickcurl_free_tag_clusters() {
		do {
			if (!tcs) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_clusters is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 277, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedClusters = this.getClusters();
		if (generatedClusters) {
			int i;
			for (i = 0; generatedClusters[i]; i++) {
				generatedClusters[i].flickcurl_free_tag_cluster();
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedClusters);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tcs);
	}
	public static  flickcurl_groups_pools_getPhotos_params(flickcurl_s fc, Object group_id, Object tags, Object user_id,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!group_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("group_id", /* API parameters */group_id);
		if (tags) {
			fc.flickcurl_add_param("tags", tags);
		} 
		if (user_id) {
			fc.flickcurl_add_param("user_id", user_id);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.pools.getPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_groups_pools_getPhotos:
		 * @fc: flickcurl context
		 * @group_id: The id of the group who's pool you which to get the photo list for.
		 * @tags: A tag to filter the pool with. At the moment only one tag at a time is supported. (or NULL)
		 * @user_id: The nsid of a user (or NULL).  If given, retrieves only photos that the user has contributed to the group pool.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * @per_page: Number of photos to return per page (default 100, max 500)
		 * @page: The page of results to return (default 1)
		 * 
		 * Returns a list of pool photos for a given group.
		 *
		 * See flickcurl_groups_pools_getPhotos_params() for details
		 * of the fields.
		 *
		 * Implements flickr.groups.pools.getPhotos (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static void MD5Transform(Object[] buf, Object in) {
		 a = new ();
		 b = new ();
		 c = new ();
		 d = new ();
		a = buf[0];
		b = buf[1];
		c = buf[2];
		d = buf[3];
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		();
		buf[0] += a;
		buf[1] += b;
		buf[2] += c;
		buf[3] += d;
	}
	/* my code from here */
	public static Byte MD5_string(Byte string) {
		MD5Context md5 = new MD5Context();
		size_t len = /*Error: Function owner not recognized*/strlen(string);
		byte b = ((Object)0);
		int i;
		md5.MD5Init();
		md5.MD5Update((byte)string, len);
		md5.MD5Final();
		b = (byte)/*Error: Function owner not recognized*/malloc(1 + (16 << 1));
		if (!b) {
			return ((Object)0);
		} 
		Object generatedDigest = md5.getDigest();
		for (i = 0; i < 16; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(b + (i << 1), "%02x", (int)generatedDigest[i]);
		}
		b[i << 1] = (byte)'\0';
		return b;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * blog.c - Flickcurl blog functions
	 *
	 * Copyright (C) 2008, David Beckett http://www.dajobe.org/
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
	public static void flickcurl_free_blog() {
		do {
			if (!blog) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 40, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Object generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedName);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(blog/**
		 * flickcurl_free_blogs:
		 * @blogs_object: blog object array
		 *
		 * Destructor for array of blog objects
		 */);
	}
	public static void flickcurl_free_blogs() {
		int i;
		do {
			if (!blogs_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 63, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; blogs_object[i]; i++) {
			blogs_object[i].flickcurl_free_blog();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(blogs_object);
	}
	public static void flickcurl_free_blog_service() {
		do {
			if (!blog_service) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog_service is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 154, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Object generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedName);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(blog_service/**
		 * flickcurl_free_blog_services:
		 * @blog_services_object: blog services object array
		 *
		 * Destructor for array of blog services objects
		 */);
	}
	public static void flickcurl_free_blog_services() {
		int i;
		do {
			if (!blog_services_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog_service_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 177, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; blog_services_object[i]; i++) {
			blog_services_object[i].flickcurl_free_blog_service();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(blog_services_object);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * stat.c - Flickcurl statistic functions
	 *
	 * Copyright (C) 2010, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_stat:
	 * @stat: stat object
	 *
	 * Destructor for stat object
	 */
	public static void flickcurl_free_stat() {
		do {
			if (!stat) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_stat is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\stat.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedName);
		} 
		Object generatedUrl = this.getUrl();
		if (generatedUrl) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
		} 
		Object generatedSearchterms = this.getSearchterms();
		if (generatedSearchterms) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedSearchterms);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(stat/**
		 * flickcurl_free_stats:
		 * @stats_object: stat object array
		 *
		 * Destructor for array of stat objects
		 */);
	}
	public static void flickcurl_free_stats() {
		int i;
		do {
			if (!stats_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_stat_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\stat.c", 70, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; stats_object[i]; i++) {
			stats_object[i].flickcurl_free_stat();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(stats_object/**
		 * flickcurl_free_view_stats:
		 * @view_stats: view stat object
		 *
		 * Destructor for view stat object
		 */);
	}
	public static void flickcurl_free_view_stats() {
		do {
			if (!view_stats) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_view_stats is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\stat.c", 88, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(view_stats);
	}
	public static  flickcurl_photos_getContactsPhotos_params(flickcurl_s fc, int contact_count, int just_friends, int single_photo, int include_self,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] true_s = "1";
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (contact_count > /* API parameters */1) {
			byte[] count_s = new byte[20];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(count_s, "%d", contact_count);
			fc.flickcurl_add_param("count", count_s);
		} 
		if (just_friends) {
			fc.flickcurl_add_param("just_friends", true_s);
		} 
		if (single_photo) {
			fc.flickcurl_add_param("single_photo", true_s);
		} 
		if (include_self) {
			fc.flickcurl_add_param("include_self", true_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getContactsPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_photos_getContactsPhotos:
		 * @fc: flickcurl context
		 * @contact_count: Number of photos to return (Default 10, maximum 50)
		 * @just_friends: Set to non-0 to only show photos from friends and family (excluding regular contacts).
		 * @single_photo: Set to non-0 to only fetch one photo (the latest) per contact, instead of all photos in chronological order.
		 * @include_self: Set to non-0 to include photos from the calling user.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * 
		 * Fetch a list of recent photos from the calling users' contacts.
		 *
		 * See flickcurl_photos_getContactsPhotos() for details of parameters.
		 *
		 * Implements flickr.photos.getContactsPhotos (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static  flickcurl_photos_getContactsPublicPhotos_params(flickcurl_s fc, Object user_id, int photo_count, int just_friends, int single_photo, int include_self,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] true_s = "1";
		byte[] photo_count_s = new byte[10];
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("user_id", /* API parameters */user_id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(photo_count_s, "%d", photo_count);
		fc.flickcurl_add_param("count", photo_count_s);
		if (just_friends) {
			fc.flickcurl_add_param("just_friends", true_s);
		} 
		if (single_photo) {
			fc.flickcurl_add_param("single_photo", true_s);
		} 
		if (include_self) {
			fc.flickcurl_add_param("include_self", true_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getContactsPublicPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_photos_getContactsPublicPhotos:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch photos for.
		 * @photo_count: Number of photos to return (Default 10, maximum 50)
		 * @just_friends: Set to non-0 to only show photos from friends and family (excluding regular contacts)
		 * @single_photo: Set to non-0 to only fetch one photo (the latest) per contact, instead of all photos in chronological order.
		 * @include_self: Set to non-0 to include photos from the user specified by user_id.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * 
		 * Fetch a list of recent public photos from a users' contacts.
		 *
		 * See flickcurl_photos_getContactsPublicPhotos() for details of
		 * parameters.
		 *
		 * Implements flickr.photos.getContactsPublicPhotos (0.12)
		 * 
		 * Return value: a list of photos or NULL on failure
		 **/;
	}
	public static  flickcurl_get_photoslist_params(flickcurl_s fc, Object method, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] min_upload_date_s = new byte[20];
		byte[] max_upload_date_s = new byte[20];
		byte[] privacy_filter_s = new byte[20];
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (min_upload_date > /* API parameters */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(min_upload_date_s, "%d", min_upload_date);
			fc.flickcurl_add_param("min_upload_date", min_upload_date_s);
		} 
		if (max_upload_date > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(max_upload_date_s, "%d", max_upload_date);
			fc.flickcurl_add_param("max_upload_date", max_upload_date_s);
		} 
		if (min_taken_date) {
			fc.flickcurl_add_param("min_taken_date", min_taken_date);
		} 
		if (max_taken_date) {
			fc.flickcurl_add_param("max_taken_date", max_taken_date);
		} 
		if (privacy_filter >= 1 && privacy_filter <= 5) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(privacy_filter_s, "%d", privacy_filter);
			fc.flickcurl_add_param("privacy_filter", privacy_filter_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare(method)) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_photos_getNotInSet_params:
		 * @fc: flickcurl context
		 * @min_upload_date: Minimum upload date.
		 * @max_upload_date: Maximum upload date.
		 * @min_taken_date: Minimum taken date (or NULL).
		 * @max_taken_date: Maximum taken date (or NULL).
		 * @privacy_filter: Return photos only matching a certain privacy level.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of your photos that are not part of any sets.
		 *
		 * Currently supported extras fields are: license, date_upload, date_taken,
		 *  owner_name, icon_server, original_format, last_update, geo, tags,
		 *  machine_tags.
		 *
		 * Return value: a list of photos or NULL on failure
		 **/;
	}
	public static  flickcurl_photos_getNotInSet_params(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter,  list_params) {
		return ModernizedCProgram.flickcurl_get_photoslist_params(fc, "flickr.photos.getNotInSet", min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params/**
		 * flickcurl_photos_getNotInSet:
		 * @fc: flickcurl context
		 * @min_upload_date: Minimum upload date.
		 * @max_upload_date: Maximum upload date.
		 * @min_taken_date: Minimum taken date (or NULL).
		 * @max_taken_date: Maximum taken date (or NULL).
		 * @privacy_filter: Return photos only matching a certain privacy level.
		 * Valid privacy values are: 1 public, 2 friends, 3 family, 4 friends and
		 * family, 5 private
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * @per_page: Number of photos to return per page (default 100, max 500).
		 * @page: The page of results to return (default 1).
		 * 
		 * Returns a list of your photos that are not part of any sets.
		 *
		 * See flickcurl_photos_getNotInSet_params() for details of parameters.
		 *
		 * Implements flickr.photos.getNotInSet (0.12)
		 * 
		 * Return value: a list of photos or NULL on failure
		 **/);
	}
	public static  flickcurl_photos_getRecent_params(flickcurl_s fc,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0/* No API parameters */);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getRecent")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_photos_getRecent:
		 * @fc: flickcurl context
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * @per_page: Number of photos to return per page (default 100, max 500)
		 * @page: The page of results to return (default 1)
		 * 
		 * Returns a list of the latest public photos uploaded to flickr.
		 *
		 * See flickcurl_photos_getRecent_params() for details of parameters.
		 *
		 * Implements flickr.photos.getRecent (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static  flickcurl_photos_getUntagged_params(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter,  list_params) {
		return ModernizedCProgram.flickcurl_get_photoslist_params(fc, "flickr.photos.getUntagged", min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params/**
		 * flickcurl_photos_getUntagged:
		 * @fc: flickcurl context
		 * @min_upload_date: Minimum upload date.
		 * @max_upload_date: Maximum upload date.
		 * @min_taken_date: Minimum taken date (or NULL)
		 * @max_taken_date: Maximum taken date (or NULL)
		 * @privacy_filter: Return photos only matching a certain privacy level.
		 * Valid privacy values are: 1 public, 2 friends, 3 family, 4 friends and
		 * family, 5 private
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * @per_page: Number of photos to return per page (default 100, max 500).
		 * @page: The page of results to return (default 1).
		 * 
		 * Returns a list of your photos with no tags.
		 *
		 * See flickcurl_photos_getUntagged_params() for details of parameters.
		 *
		 * Implements flickr.photos.getUntagged (0.12)
		 * 
		 * Return value: a list of photos or NULL on failure
		 **/);
	}
	public static  flickcurl_photos_getWithGeoData_params(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter,  list_params) {
		return ModernizedCProgram.flickcurl_get_photoslist_params(fc, "flickr.photos.getWithGeoData", min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params/**
		 * flickcurl_photos_getWithGeoData:
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
		 * @extras: A comma-delimited list of extra information to fetch for each returned record.
		 * @per_page: Number of photos to return per page.
		 * @page: The page of results to return.
		 * 
		 * Returns a list of your geo-tagged photos.
		 *
		 * See flickcurl_photos_getWithGeoData_params() for details of parameters.
		 *
		 * Implements flickr.photos.getWithGeoData (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/);
	}
	public static  flickcurl_photos_getWithoutGeoData_params(flickcurl_s fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter,  list_params) {
		return ModernizedCProgram.flickcurl_get_photoslist_params(fc, "flickr.photos.getWithoutGeoData", min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params/**
		 * flickcurl_photos_getWithoutGeoData:
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
		 * @extras: A comma-delimited list of extra information to fetch for each returned record.
		 * @per_page: Number of photos to return per page.
		 * @page: The page of results to return.
		 * 
		 * Returns a list of your photos which haven't been geo-tagged.
		 *
		 * See flickcurl_photos_getWithoutGeoData_params() for details of parameters.
		 *
		 * Implements flickr.photos.getWithoutGeoData (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/);
	}
	public static  flickcurl_photos_recentlyUpdated_params(flickcurl_s fc, int min_date,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] min_date_s = new byte[20];
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (min_date <= 0) {
			return ((Object)0);
		} 
		if (min_date > /* API parameters */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(min_date_s, "%d", min_date);
			fc.flickcurl_add_param("min_date", min_date_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.recentlyUpdated")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_photos_recentlyUpdated:
		 * @fc: flickcurl context
		 * @min_date: A Unix timestamp indicating the date from which modifications should be compared.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * @per_page: Number of photos to return per page (default 100, max 500)
		 * @page: The page of results to return (default 1)
		 * 
		 * Return a list of your photos that have been recently created or which have been recently modified
		 * 
		 * See flickcurl_photos_recentlyUpdated() for details of parameters.
		 *
		 * Implements flickr.photos.recentlyUpdated (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static  flickcurl_photos_search_params(flickcurl_s fc,  params,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] min_upload_date_s = new byte[15];
		byte[] max_upload_date_s = new byte[15];
		byte[] accuracy_s = new byte[3];
		byte[] safe_search_s = new byte[2];
		byte[] content_type_s = new byte[2];
		byte[] lat_s = new byte[32];
		byte[] lon_s = new byte[32];
		byte[] radius_s = new byte[32];
		byte[] woe_id_s = new byte[32];
		byte[] geo_context_s = new byte[2];
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		do {
			if (!params) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_search_params is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photos-api.c", 1717, __func__);
				return ((Object)0);
			} 
		} while (0);
		Object generatedUser_id = params.getUser_id();
		if (generatedUser_id) {
			fc.flickcurl_add_param("user_id", generatedUser_id);
		} 
		Object generatedTags = params.getTags();
		if (generatedTags) {
			fc.flickcurl_add_param("tags", generatedTags);
		} 
		Object generatedTag_mode = params.getTag_mode();
		if (generatedTag_mode) {
			fc.flickcurl_add_param("tag_mode", generatedTag_mode);
		} 
		Object generatedText = params.getText();
		if (generatedText) {
			fc.flickcurl_add_param("text", generatedText);
		} 
		Object generatedMin_upload_date = params.getMin_upload_date();
		if (generatedMin_upload_date) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(min_upload_date_s, "%d", generatedMin_upload_date);
			fc.flickcurl_add_param("min_upload_date", min_upload_date_s);
		} 
		Object generatedMax_upload_date = params.getMax_upload_date();
		if (generatedMax_upload_date) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(max_upload_date_s, "%d", generatedMax_upload_date);
			fc.flickcurl_add_param("max_upload_date", max_upload_date_s);
		} 
		Object generatedMin_taken_date = params.getMin_taken_date();
		if (generatedMin_taken_date) {
			fc.flickcurl_add_param("min_taken_date", generatedMin_taken_date);
		} 
		Object generatedMax_taken_date = params.getMax_taken_date();
		if (generatedMax_taken_date) {
			fc.flickcurl_add_param("max_taken_date", generatedMax_taken_date);
		} 
		Object generatedLicense = params.getLicense();
		if (generatedLicense) {
			fc.flickcurl_add_param("license", generatedLicense);
		} 
		Object generatedSort = params.getSort();
		if (generatedSort) {
			fc.flickcurl_add_param("sort", generatedSort);
		} 
		Object generatedPrivacy_filter = params.getPrivacy_filter();
		if (generatedPrivacy_filter) {
			fc.flickcurl_add_param("privacy_filter", generatedPrivacy_filter);
		} 
		Object generatedBbox = params.getBbox();
		if (generatedBbox) {
			fc.flickcurl_add_param("bbox", generatedBbox);
		} 
		Object generatedAccuracy = params.getAccuracy();
		if (generatedAccuracy) {
			if (generatedAccuracy >= 0 && generatedAccuracy <= 16) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(accuracy_s, "%d", generatedAccuracy);
				fc.flickcurl_add_param("accuracy", accuracy_s);
			} 
		} 
		Object generatedSafe_search = params.getSafe_search();
		if (generatedSafe_search) {
			if (generatedSafe_search >= 0 && generatedSafe_search <= 3) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(safe_search_s, "%d", generatedSafe_search);
				fc.flickcurl_add_param("safe_search", safe_search_s);
			} 
		} 
		Object generatedContent_type = params.getContent_type();
		if (generatedContent_type) {
			if (generatedContent_type >= 0 && generatedContent_type <= 4) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(content_type_s, "%d", generatedContent_type);
				fc.flickcurl_add_param("content_type", content_type_s);
			} 
		} 
		Object generatedMachine_tags = params.getMachine_tags();
		if (generatedMachine_tags) {
			fc.flickcurl_add_param("machine_tags", generatedMachine_tags);
		} 
		Object generatedMachine_tag_mode = params.getMachine_tag_mode();
		if (generatedMachine_tag_mode) {
			fc.flickcurl_add_param("machine_tag_mode", generatedMachine_tag_mode);
		} 
		Object generatedGroup_id = params.getGroup_id();
		if (generatedGroup_id) {
			fc.flickcurl_add_param("group_id", generatedGroup_id);
		} 
		Object generatedPlace_id = params.getPlace_id();
		if (generatedPlace_id) {
			fc.flickcurl_add_param("place_id", generatedPlace_id);
		} 
		Object generatedMedia = params.getMedia();
		if (generatedMedia) {
			fc.flickcurl_add_param("media", generatedMedia);
		} 
		Object generatedHas_geo = params.getHas_geo();
		if (generatedHas_geo) {
			fc.flickcurl_add_param("has_geo", "1");
		} 
		Object generatedGeo_context = params.getGeo_context();
		if (generatedGeo_context > 0 && generatedGeo_context < 3) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(geo_context_s, "%d", generatedGeo_context);
			fc.flickcurl_add_param("geo_context", geo_context_s);
		} 
		Object generatedRadius = params.getRadius();
		Object generatedLat = params.getLat();
		Object generatedLon = params.getLon();
		Object generatedRadius_units = params.getRadius_units();
		if (generatedRadius) {
			if (generatedLat) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(lat_s, "%f", generatedLat);
				fc.flickcurl_add_param("lat", lat_s);
			} 
			if (generatedLon) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(lon_s, "%f", generatedLon);
				fc.flickcurl_add_param("lon", lon_s);
			} 
			if (generatedRadius) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(radius_s, "%f", generatedRadius);
				fc.flickcurl_add_param("radius", radius_s);
				if (generatedRadius_units) {
					fc.flickcurl_add_param("radius_units", generatedRadius_units);
				} 
			} 
		} 
		Object generatedContacts = params.getContacts();
		if (generatedContacts && generatedUser_id) {
			fc.flickcurl_add_param("contacts", generatedContacts);
		} 
		Object generatedWoe_id = params.getWoe_id();
		if (generatedWoe_id > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(woe_id_s, "%d", generatedWoe_id);
			fc.flickcurl_add_param("woe_id", woe_id_s);
		} 
		Object generatedIs_commons = params.getIs_commons();
		if (generatedIs_commons) {
			fc.flickcurl_add_param("is_commons", "");
		} 
		Object generatedIn_gallery = params.getIn_gallery();
		if (generatedIn_gallery) {
			fc.flickcurl_add_param("in_gallery", "");
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.search")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_photos_search:
		 * @fc: flickcurl context
		 * @params: #flickcurl_search_params search parameters
		 * 
		 * Return a list of photos matching some criteria.
		 * 
		 * Only photos visible to the calling user will be returned. To
		 * return private or semi-private photos, the caller must be
		 * authenticated with 'read' permissions, and have permission to view
		 * the photos. Unauthenticated calls will only return public photos.
		 *
		 * Implements flickr.photos.search (0.11)
		 *
		 * Flickcurl 1.0: Added place_id for places API as announced 2008-01-11
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/3688
		 *
		 * See flickcurl_photos_search_params() for details on the the search
		 * parameters.
		 *
		 * Ensure the @params object is propertly initialized to zeros/NULLs
		 * or use flickcurl_search_params_init() to initialize this.
		 * 
		 * Return value: an array of #flickcurl_photo pointers (may be length 0) or NULL on failure
		 **/;
	}
	public static int flickcurl_photos_setPerms(flickcurl_s fc, Object photo_id,  perms) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		byte[] is_public_str = new byte[2];
		byte[] is_friend_str = new byte[2];
		byte[] is_family_str = new byte[2];
		byte[] perm_comment_str = new byte[2];
		byte[] perm_addmeta_str = new byte[2];
		fc.flickcurl_init_params(1);
		if (!photo_id || !perms) {
			return 1;
		} 
		Object generatedPerm_comment = perms.getPerm_comment();
		if (generatedPerm_comment < 0 || generatedPerm_comment > 3) {
			return 1;
		} 
		Object generatedPerm_addmeta = perms.getPerm_addmeta();
		if (generatedPerm_addmeta < 0 || generatedPerm_addmeta > 3) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		Object generatedIs_public = perms.getIs_public();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(is_public_str, "%d", (generatedIs_public ? 1 : 0));
		fc.flickcurl_add_param("is_public", is_public_str);
		Object generatedIs_friend = perms.getIs_friend();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(is_friend_str, "%d", (generatedIs_friend ? 1 : 0));
		fc.flickcurl_add_param("is_friend", is_friend_str);
		Object generatedIs_family = perms.getIs_family();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(is_family_str, "%d", (generatedIs_family ? 1 : 0));
		fc.flickcurl_add_param("is_family", is_family_str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(perm_comment_str, "%d", generatedPerm_comment);
		fc.flickcurl_add_param("perm_comment", perm_comment_str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(perm_addmeta_str, "%d", generatedPerm_addmeta);
		fc.flickcurl_add_param("perm_addmeta", perm_addmeta_str);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.setPerms")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = /*Error: Function owner not recognized*/xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = 0;
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photos_setSafetyLevel:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set the adultness of.
		 * @safety_level: The safety level of the photo.  1 for Safe, 2 for Moderate, and 3 for Restricted (or <0 for no change)
		 * @hidden: >0 to hide the photo from public searches. 0 to not. <0 for no change.
		 * 
		 * Set the safety level of a photo.
		 *
		 * Implements flickr.photos.setSafetyLevel (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * location.c - Flickcurl method location functions
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
	/* for atof() */
	/**
	 * flickcurl_free_location:
	 * @location: location object
	 *
	 * Destructor for location object
	 */
	public static void flickcurl_free_location() {
		do {
			if (!location) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_location is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\location.c", 52, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(location);
	}
	public static Object flickcurl_get_location_accuracy_label(int accuracy) {
		if (accuracy >= 1 && accuracy <= 16) {
			return ModernizedCProgram.flickcurl_accuracy_labels[accuracy - 1];
		} 
		return ((Object)0);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * activity.c - Flickcurl activity functions
	 *
	 * Copyright (C) 2008, David Beckett http://www.dajobe.org/
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
	public static void flickcurl_free_activity_event() {
		do {
			if (!activity_event) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_activity_event is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\activity.c", 40, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Object generatedType = this.getType();
		if (generatedType) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedType);
		} 
		Object generatedUser = this.getUser();
		if (generatedUser) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUser);
		} 
		Object generatedUsername = this.getUsername();
		if (generatedUsername) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUsername);
		} 
		Object generatedValue = this.getValue();
		if (generatedValue) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedValue);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(activity_event);
	}
	public static void flickcurl_free_activity() {
		int i;
		do {
			if (!activity) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_activity is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\activity.c", 60, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedType = this.getType();
		if (generatedType) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedType);
		} 
		Object generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Object generatedOwner = this.getOwner();
		if (generatedOwner) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedOwner);
		} 
		Object generatedOwner_name = this.getOwner_name();
		if (generatedOwner_name) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedOwner_name);
		} 
		Object generatedPrimary = this.getPrimary();
		if (generatedPrimary) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedPrimary);
		} 
		Object generatedSecret = this.getSecret();
		if (generatedSecret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedSecret);
		} 
		Object generatedTitle = this.getTitle();
		if (generatedTitle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTitle);
		} 
		Object generatedEvents = this.getEvents();
		for (i = 0; generatedEvents[i]; i++) {
			generatedEvents[i].flickcurl_free_activity_event();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(activity/**
		 * flickcurl_free_activities:
		 * @activities_object: activity object array
		 *
		 * Destructor for array of activity objects
		 */);
	}
	public static void flickcurl_free_activities() {
		int i;
		do {
			if (!activities_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_activity_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\activity.c", 95, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; activities_object[i]; i++) {
			activities_object[i].flickcurl_free_activity();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(activities_object);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * tags-api.c - Flickr flickr.tags.* API calls
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
	 * flickcurl_tags_getClusterPhotos:
	 * @fc: flickcurl context
	 * @tag: The tag that this cluster belongs to.
	 * @cluster_id: The top three tags for the cluster, separated by dashes (just like the url).
	 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
	 * 
	 * Returns the first 24 photos for a given tag cluster
	 *
	 * Implements flickr.tags.getClusterPhotos (1.7)
	 *
	 * Added to API (not announced) some time between 2008-09-04 and 2008-09-19
	 * 
	 * Return value: non-0 on failure
	 **/
	public static  flickcurl_tags_getClusterPhotos(flickcurl_s fc, Object tag, Object cluster_id,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!tag || !cluster_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("tag", tag);
		fc.flickcurl_add_param("cluster_id", cluster_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.tags.getClusterPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
		return photos_list/**
		 * flickcurl_tags_getClusters:
		 * @fc: flickcurl context
		 * @tag: The tag to fetch clusters for.
		 * 
		 * Gives you a list of tag clusters for the given tag.
		 *
		 * Implements flickr.tags.getClusters (1.5)
		 *
		 * "There is no pagination for this method as the number of clusters
		 * for a single tag is capped at 5 and each cluster may contain
		 * between 1 - 50 tags (give or take)."
		 *
		 * As announced 2008-07-17
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4218
		 * 
		 * Return value: NULL on failure
		 **/;
	}
	public static Object flickcurl_write_callback(Object ptr, Object size, Object nmemb, Object userdata) {
		flickcurl fc = (flickcurl)userdata;
		int len = size * nmemb;
		int rc = 0;
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			return 0;
		} 
		int generatedTotal_bytes = fc.getTotal_bytes();
		generatedTotal_bytes += len;
		int generatedSave_content = fc.getSave_content();
		int generatedChunks_count = fc.getChunks_count();
		flickcurl_chunk_s generatedChunks = fc.getChunks();
		if (generatedSave_content) {
			byte b;
			flickcurl_chunk chunk = new flickcurl_chunk();
			b = (byte)/*Error: Function owner not recognized*/malloc(len);
			chunk = (flickcurl_chunk)/*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
			if (b && chunk) {
				generatedChunks_count++;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(b, ptr, len);
				chunk.setContent(b);
				chunk.setSize(len);
				chunk.setPrev(generatedChunks);
				fc.setChunks(chunk);
			} else {
					if (b) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(b);
					} 
					if (chunk) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(chunk);
					} 
					fc.flickcurl_error("Out of memory");
			} 
		} 
		int generatedXml_parse_content = fc.getXml_parse_content();
		Object generatedXc = fc.getXc();
		byte[] generatedUri = fc.getUri();
		if (generatedXml_parse_content) {
			if (!generatedXc) {
				 xc = new ();
				xc = /*Error: Function owner not recognized*/xmlCreatePushParserCtxt(((Object)0), ((Object)0), (byte)ptr, len, (byte)generatedUri);
				if (!xc) {
					rc = 1;
				} else {
						xc.setReplaceEntities(1);
						xc.setLoadsubset(1);
				} 
				fc.setXc(xc);
			} else {
					rc = /*Error: Function owner not recognized*/xmlParseChunk(generatedXc, (byte)ptr, len, 0);
			} 
			if (rc) {
				fc.flickcurl_error("XML Parsing failed");
			} 
		} 
		return len;
	}
	public static int flickcurl_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_global_init(CURL_GLOBAL_ALL);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/xmlInitParser();
		ModernizedCProgram.flickcurl_serializer_init();
		return 0/**
		 * flickcurl_finish:
		 *
		 * Terminate Flickcurl library.
		 */;
	}
	public static void flickcurl_finish() {
		ModernizedCProgram.flickcurl_serializer_terminate();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/xmlCleanupParser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_global_cleanup();
	}
	/* have it as an external function */
	/* seconds between 1 Jan 1601 (windows epoch) and 1 Jan 1970 (unix epoch) */
	/* 100 nano-seconds ( = 1/10 usec) in seconds */
	/* factor to convert high-dword count into seconds = NSEC100 * (2<<32) */
	public static int gettimeofday(Object tzp) {
		FILETIME ft = new FILETIME();
		double t;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetSystemTimeAsFileTime(/* returns time since windows epoch in 100ns (1/10us) units */ft);
		Object generatedDwHighDateTime = ft.getDwHighDateTime();
		Object generatedDwLowDateTime = ft.getDwLowDateTime();
		t = ((generatedDwHighDateTime * (429.4967296)) - /* convert time into seconds as a double */1.16444736E10) + (generatedDwLowDateTime * (1.0E-7));
		this.setTv_sec((long)t);
		Object generatedTv_sec = this.getTv_sec();
		this.setTv_usec((long)((t - generatedTv_sec) * 1000000.0));
		return /* tzp is ignored */0/* end HAVE_GETTIMEOFDAY */;/* Need nanosleep() to wait between service calls */
	}
	public static Object flickcurl_curl_header_callback(Object ptr, Object size, Object nmemb, Object userdata) {
		flickcurl fc = (flickcurl)userdata;
		int bytes = size * nmemb/* If flickcurl has already failed, return nothing so that
		   * libcurl will abort the transfer
		   */;
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			return 0;
		} 
		byte[] generatedError_msg = fc.getError_msg();
		if (!/*Error: Function owner not recognized*/strncmp((byte)ptr, "X-FlickrErrCode: ", 17)) {
			fc.setError_code(/*Error: Function owner not recognized*/atoi((byte)ptr + 17));
		}  else if (!/*Error: Function owner not recognized*/strncmp((byte)ptr, "X-FlickrErrMessage: ", 20)) {
			int len = bytes - 20;
			if (generatedError_msg) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedError_msg);
			} 
			fc.setError_msg((byte)/*Error: Function owner not recognized*/malloc(len + 1));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedError_msg, (byte)ptr + 20, len + 1);
			generatedError_msg[len] = (byte)'\0';
			while (generatedError_msg[len - 1] == (byte)'\r' || generatedError_msg[len - 1] == (byte)'\n') {
				generatedError_msg[len - 1] = (byte)'\0';
				len--;
			}
		} 
		return bytes/**
		 * flickcurl_get_current_request_wait:
		 * @fc: flickcurl object
		 *
		 * Get current wait that would be applied for a web service request called now
		 *
		 * Returns the wait time that would be applied in order to delay a
		 * web service request such that the web service rate limit is met.
		 *
		 * See flickcurl_set_request_delay() which by default is set to 1000ms.
		 * 
		 * Return value: delay in usecs or < 0 if delay is more than 247 seconds ('infinity')
		 */;
	}
	public static void flickcurl_free_form(byte[][] form) {
		if (!form) {
			return /*Error: Unsupported expression*/;
		} 
		if (form[/* free content which is the first key */0]) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(form[0]);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(form/*
		* flickcurl_invoke_get_form_content:
		* @fc: flickcurl object
		* @count_p: pointer to store count (or NULL)
		*
		* INTERNAL - decoded content from current request as HTTP FORM and return fields
		*
		* NOTE: The result may be an empty array with just two NULL
		* terminating pointers if there are no fields or no content.
		*
		* If @count_p is not NULL, *@count_p is set to the number of pairs of
		* fields.
		*
		* Index 0 is used to store the raw content.
		*
		* Return value: NULL on failure or an array of [char* field name,
		* char* field value] starting at index 1, terminated by a NULL pair.
		*
		*/);
	}
	public static Byte flickcurl_unixtime_to_isotime(Object unix_time) {
		tm structured_time = new tm();
		byte[] date_buffer = new byte[20 + 1];
		size_t len = new size_t();
		byte value = ((Object)0);
		structured_time = (tm)/*Error: Function owner not recognized*/gmtime(unix_time);
		len = 20;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strftime(date_buffer, len + 1, "%Y-%m-%dT%H:%M:%SZ", structured_time);
		value = (byte)/*Error: Function owner not recognized*/malloc(len + 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(value, date_buffer, len + 1);
		return value;
	}
	public static Byte flickcurl_unixtime_to_sqltimestamp(Object unix_time) {
		tm structured_time = new tm();
		byte[] date_buffer = new byte[19 + 1];
		size_t len = new size_t();
		byte value = ((Object)0);
		structured_time = (tm)/*Error: Function owner not recognized*/gmtime(unix_time);
		len = 19;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strftime(date_buffer, /*Error: sizeof expression not supported yet*/, "%Y %m %d %H:%M:%S", structured_time);
		value = (byte)/*Error: Function owner not recognized*/malloc(len + 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(value, date_buffer, len + 1);
		return value;
	}
	public static Byte flickcurl_sqltimestamp_to_isotime(Object timestamp) {
		size_t len = /* ISO DATE FORMAT     "%Y-%m-%dT%H:%M:%SZ" (20 chars) */20;
		byte value = ((Object)0);
		value = (byte)/*Error: Function owner not recognized*/malloc(len + 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(value, timestamp, 19);
		value[4] = (byte)'-';
		value[7] = (byte)'-';
		value[10] = (byte)'T';
		value[13] = (byte)':';
		value[16] = (byte)':';
		value[19] = (byte)'Z';
		value[20] = (byte)'\0';
		return value;
	}
	/* SQL DATETIME FORMAT "%Y %m %d %H:%M:%S"  (19 chars) */
	public static Object flickcurl_get_field_value_type_label( datatype) {
		if (datatype <= .VALUE_TYPE_LAST) {
			return ModernizedCProgram.flickcurl_field_value_type_label[(int)datatype];
		} 
		return ((Object)0);
	}
	public static Byte flickcurl_array_join(Object[][] array, byte delim) {
		int i;
		int array_size;
		size_t len = 0;
		byte str;
		byte p;
		for (i = 0; array[i]; i++) {
			len += /*Error: Function owner not recognized*/strlen(array[i]) + 1;
		}
		array_size = i;
		str = (byte)/*Error: Function owner not recognized*/malloc(len + 1);
		if (!str) {
			return ((Object)0);
		} 
		p = str;
		for (i = 0; array[i]; i++) {
			size_t item_len = /*Error: Function owner not recognized*/strlen(array[i]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, array[i], item_len);
			p += item_len;
			if (i < array_size - 1) {
				p++ = delim;
			} 
		}
		p = (byte)'\0';
		return str/**
		 * flickcurl_array_split:
		 * @str: string
		 * @delim: delimeter character
		 *
		 * Split a string into a C array
		 *
		 * Return value: newly allocated array or NULL on failure
		 */;
	}
	public static Byte flickcurl_array_split(Object[] str, byte delim) {
		int i;
		int array_size = 1;
		byte array;
		for (i = 0; str[i]; i++) {
			if (str[i] == delim) {
				array_size++;
			} 
		}
		array = (byte)/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ * (array_size + 1));
		if (!array) {
			return ((Object)0);
		} 
		for (i = 0; str; i++) {
			size_t item_len = new size_t();
			byte p;
			for (p = str; p && p != delim; p++) {
				;
			}
			item_len = p - str;
			array[i] = (byte)/*Error: Function owner not recognized*/malloc(item_len + 1);
			if (!array[i]) {
				while (--i >= 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(array[i]);
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(array);
				return ((Object)0);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(array[i], str, item_len);
			array[i][item_len] = (byte)'\0';
			str += item_len;
			if (str == delim) {
				str++;
			} 
		}
		array[i] = ((Object)0);
		return array/**
		 * flickcurl_array_free:
		 * @array: C array
		 *
		 * Free an array.
		 */;
	}
	public static void flickcurl_array_free(byte[][] array) {
		int i;
		for (i = 0; array[i]; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(array[i]);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(array);
	}
	public static Object flickcurl_get_content_type_label(int content_type) {
		if (content_type < 1 || content_type > 3) {
			content_type = 0;
		} 
		return ModernizedCProgram.flickcurl_content_type_labels[content_type/**
		 * flickcurl_get_content_type_from_string:
		 * @content_type_string: string
		 * 
		 * Get the enumeration value for a content type string.
		 *
		 * Parses the string value into a content type either from an
		 * integer form like '1' or a label like 'photo'.
		 * 
		 * Returns: content type enumeration value or <0 on error
		 **/];
	}
	public static int flickcurl_get_content_type_from_string(Object content_type_string) {
		byte endptr = ((Object)0);
		int content_type = -1;
		content_type = (int)/*Error: Function owner not recognized*/strtol(content_type_string, endptr, 10);
		if (endptr && /* If not all of string was used - fail */endptr) {
			content_type = -1;
		} 
		if (content_type < 1 || content_type > 3) {
			int i;
			for (i = 1; i < 3; i++) {
				if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.flickcurl_content_type_labels[i], content_type_string)) {
					content_type = i;
					break;
				} 
			}
		} 
		return content_type;
	}
	public static Object flickcurl_get_safety_level_label(int safety_level) {
		if (safety_level < 1 || safety_level > 4) {
			safety_level = 0;
		} 
		return ModernizedCProgram.flickcurl_safety_level_labels[safety_level/**
		 * flickcurl_get_safety_level_from_string:
		 * @safety_level_string: string
		 * 
		 * Get the enumeration value for a safety level string.
		 *
		 * Parses the string value into a safety level either from an
		 * integer form like '1' or a label like 'safe'.
		 * 
		 * Returns: safety level enumeration value or <0 on error
		 **/];
	}
	public static int flickcurl_get_safety_level_from_string(Object safety_level_string) {
		byte endptr = ((Object)0);
		int safety_level = -1;
		safety_level = (int)/*Error: Function owner not recognized*/strtol(safety_level_string, endptr, 10);
		if (endptr && /* If not all of string was used - fail */endptr) {
			safety_level = -1;
		} 
		if (safety_level < 1 || safety_level > 4) {
			int i;
			for (i = 1; i < 4; i++) {
				if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.flickcurl_safety_level_labels[i], safety_level_string)) {
					safety_level = i;
					break;
				} 
			}
		} 
		return safety_level;
	}
	public static Object flickcurl_get_hidden_label(int hidden) {
		if (hidden < 1 || hidden > 2) {
			hidden = 0;
		} 
		return ModernizedCProgram.flickcurl_hidden_labels[hidden/**
		 * flickcurl_get_hidden_from_string:
		 * @hidden_string: string
		 * 
		 * Get the enumeration value for a hidden status string.
		 *
		 * Parses the string value into a safety level either from an
		 * integer form like '1' or a label like 'hidden'.
		 * 
		 * Returns: safety level enumeration value or <0 on error
		 **/];
	}
	public static int flickcurl_get_hidden_from_string(Object hidden_string) {
		byte endptr = ((Object)0);
		int hidden = -1;
		hidden = (int)/*Error: Function owner not recognized*/strtol(hidden_string, endptr, 10);
		if (endptr && /* If not all of string was used - fail */endptr) {
			hidden = -1;
		} 
		if (hidden < 1 || hidden > 2) {
			int i;
			for (i = 1; i < 2; i++) {
				if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.flickcurl_hidden_labels[i], hidden_string)) {
					hidden = i;
					break;
				} 
			}
		} 
		return hidden;
	}
	public static int flickcurl_get_feed_format_info(int feed_format, Object name_p, Object label_p, Object mime_type_p) {
		if (feed_format < 0 || feed_format >= 8) {
			return 1;
		} 
		if (name_p) {
			name_p = flickcurl_feed_format_info[feed_format].getName();
		} 
		if (label_p) {
			label_p = flickcurl_feed_format_info[feed_format].getLabel();
		} 
		if (mime_type_p) {
			mime_type_p = flickcurl_feed_format_info[feed_format].getMime_type();
		} 
		return 0/*
		 * flickcurl_append_photos_list_params:
		 * @fc: fc
		 * @list_params: in parameter - photos list paramater
		 * @format_p: out parameter - result format requested or NULL
		 *
		 * INTERNAL - append #flickcurl_photos_list_params to parameter list for API call
		 *
		 * Return value: number of parameters added
		 */;
	}
	public static int flickcurl_append_photos_list_params(flickcurl_s fc,  list_params, Object format_p) {
		byte[] per_page_s = new byte[/* NOTE: These are SHARED and pointed to by flickcurl_prepare() to
		   * build the URL */4];
		byte[] page_s = new byte[4];
		int this_count = 0;
		if (format_p) {
			format_p = ((Object)0);
		} 
		if (!list_params) {
			return 0;
		} 
		Object generatedExtras = list_params.getExtras();
		if (generatedExtras) {
			fc.flickcurl_add_param("extras", generatedExtras);
			this_count++;
		} 
		Object generatedPer_page = list_params.getPer_page();
		if (generatedPer_page) {
			if (generatedPer_page >= 0 && generatedPer_page <= 999) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(per_page_s, "%d", generatedPer_page);
				fc.flickcurl_add_param("per_page", per_page_s);
				this_count++;
			} 
		} 
		Object generatedPage = list_params.getPage();
		if (generatedPage) {
			if (generatedPage >= 0 && generatedPage <= 999) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(page_s, "%d", generatedPage);
				fc.flickcurl_add_param("page", page_s);
				this_count++;
			} 
		} 
		Object generatedFormat = list_params.getFormat();
		if (generatedFormat) {
			fc.flickcurl_add_param("format", generatedFormat);
			this_count++;
			if (format_p) {
				format_p = generatedFormat;
			} 
		} 
		return this_count;
	}
	public static int flickcurl_get_extras_format_info(int extras_format, Object name_p, Object label_p) {
		if (extras_format < 0 || extras_format >= 22) {
			return 1;
		} 
		if (name_p) {
			name_p = flickcurl_extras_format_info[extras_format].getName();
		} 
		if (label_p) {
			label_p = flickcurl_extras_format_info[extras_format].getLabel();
		} 
		return 0/**
		 * flickcurl_photos_list_params_init:
		 * @list_params: photos list params to init
		 *
		 * Initialise an existing photos list parameter structure
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public static int flickcurl_photos_list_params_init() {
		if (!list_params) {
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(list_params, (byte)'\0', /*Error: sizeof expression not supported yet*/);
		this.setVersion(1);
		this.setExtras(((Object)0));
		this.setFormat(((Object)0));
		this.setPage(-1);
		this.setPer_page(-1);
		return 0/**
		 * flickcurl_search_params_init:
		 * @params: search params to init
		 *
		 * Initialise an existing search parameters structure
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public static int flickcurl_search_params_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(params, (byte)'\0', /*Error: Unsupported expression*//* These are the numeric fields and are all set to 0 or 0.0 by the memset() */);
		/* strictly lat and lon are ignored if radius is 0.0 */return /* The remaining fields are pointers and are set to NULL by the memset() */0/**
		 * flickcurl_set_curl_setopt_handler:
		 * @fc: flickcurl object
		 * @curl_handler: curl set options handler (or NULL)
		 * @curl_handler_data: user data for handler (or NULL)
		 *
		 * Set curl set option callback handler.
		 *
		 * This handler is called for every curl request after all internal
		 * curl_easy_setopt calls are made on the internal CURL* handle and
		 * just before curl_easy_perform is invoked to start the retrieval.
		 * Thus, this callback can override any internal configuration.
		 *
		 * If a simple once-only CURL configuration is needed, using
		 * flickcurl_new_with_handle() may be easier.
		 *
		 * WARNING: The @curl_handler callback is called with 2 void args in
		 * the order user data (@curl_handler_data value), curl_handle (CURL*
		 * pointer) - take care to use them correct in implementation.
		 *
		 */;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * institution.c - Flickr institution support calls
	 *
	 * Copyright (C) 2009, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_institution:
	 * @institution: institution object
	 *
	 * Destructor for institution object
	 */
	public static void flickcurl_free_institution() {
		int i;
		do {
			if (!institution) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_institution is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\institution.c", 56, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedNsid = this.getNsid();
		if (generatedNsid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedNsid);
		} 
		Object generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedName);
		} 
		Object generatedUrls = this.getUrls();
		if (generatedUrls) {
			for (i = 0; i <= .FLICKCURL_INSTITUTION_URL_LAST; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrls[i]);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrls);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(institution/**
		 * flickcurl_free_institutions:
		 * @institutions_object: institution object array
		 *
		 * Destructor for array of institution object
		 */);
	}
	public static void flickcurl_free_institutions() {
		int i;
		do {
			if (!institutions_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_institution_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\institution.c", 86, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; institutions_object[i]; i++) {
			institutions_object[i].flickcurl_free_institution();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(institutions_object);
	}
	public static Object flickcurl_get_institution_url_type_label( url_type) {
		if (url_type <= .FLICKCURL_INSTITUTION_URL_LAST) {
			return ModernizedCProgram.flickcurl_institution_url_type_label[(int)url_type];
		} 
		return ((Object)0);
	}
	public static int mangen_cmd_compare(Object a, Object b) {
		flickcurl_cmd a_cmd = (flickcurl_cmd)a;
		flickcurl_cmd b_cmd = (flickcurl_cmd)b;
		Object generatedName = a_cmd.getName();
		return /*Error: Function owner not recognized*/strcmp(generatedName, generatedName);
	}
	public static void mangen_print_man_page() {
		int i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(".LP\nIn the following list of commands:\n.br\n\\fIPER-PAGE\\fR is photos per result page or '-' for default (10)\n.br\n\\fIPAGE\\fR is result page number or '-' for default (1 = first page)\n", fh);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(ModernizedCProgram.commands, 184 - 1, /*Error: Unsupported expression*/, mangen_cmd_compare);
		for (i = 0; ModernizedCProgram.commands[i].getName(); i++) {
			int d;
			int dc;
			int nl = 1;
			int lastdc = -1;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, ".IP \"\\fB%s\\fP \\fI%s\\fP\"\n", ModernizedCProgram.commands[i].getName(), ModernizedCProgram.commands[i].getArgs());
			for (d = 0; (dc = ModernizedCProgram.commands[i].getDescription()[d]); d++) {
				if (nl && dc == (byte)' ') {
					lastdc = dc;
					continue;
				} 
				if (dc == (byte)' ' && lastdc == (byte)' ') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n.br\n", fh);
					do {
						d++;
						dc = ModernizedCProgram.commands[i].getDescription()[d];
					} while (dc == (byte)' ');
				} 
				nl = 0;
				if (dc == (byte)'\n') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n.br\n", fh);
					nl = 1;
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc(dc, fh);
				} 
				lastdc = dc;
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', fh);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(".SH Extras Fields\n", fh);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("The \\fBEXTRAS\\fP parameter can take a comma-separated set of the following values\n", fh);
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_extras_format_info(i, name, label)) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, ".TP\n\\fB%s\\fP\n%s\n", name, label);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(".SH Photos List Feed Formats\n", fh);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("The \\fBFORMAT\\fP parameter can take any of the following values\n", fh);
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_feed_format_info(i, name, label, ((Object)0))) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, ".TP\n\\fB%s\\fP\n%s\n", name, label);
		}
	}
	public static void mangen_print_extras() {
		int i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("<variablelist>\n", fh);
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_extras_format_info(i, name, label)) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "  <varlistentry>\n    <term>%s</term>\n    <listitem><simpara>%s</simpara></listitem>\n  </varlistentry>\n", name, label);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("</variablelist>\n", fh);
	}
	public static Object flickcurl_get_person_field_label( field) {
		if (field <= .PERSON_FIELD_LAST) {
			return ModernizedCProgram.flickcurl_person_field_label[(int)field];
		} 
		return ((Object)0/**
		 * flickcurl_free_person:
		 * @person: person object
		 *
		 * Destructor for person object
		 */);
	}
	public static void flickcurl_free_person() {
		int i;
		do {
			if (!person) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_person is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\person.c", 94, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedFields = this.getFields();
		for (i = 0; i <= .PERSON_FIELD_LAST; i++) {
			if (generatedFields[i].getString()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedFields[i].getString());
			} 
		}
		Object generatedNsid = this.getNsid();
		if (generatedNsid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedNsid);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(person/*
		 * The XPaths here are relative, such as prefixed by /rsp/person
		 */);
	}
	public static void flickcurl_free_persons() {
		int i;
		do {
			if (!persons) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_person_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\person.c", 423, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; persons[i]; i++) {
			persons[i].flickcurl_free_person();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(persons);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * ticket.c - Flickcurl ticket functions
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
	 * flickcurl_free_ticket:
	 * @ticket: ticket object
	 *
	 * Destructor for ticket object
	 */
	public static void flickcurl_free_ticket() {
		do {
			if (!ticket) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_ticket is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\ticket.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ticket/**
		 * flickcurl_free_tickets:
		 * @tickets_object: ticket object array
		 *
		 * Destructor for array of ticket objects
		 */);
	}
	public static void flickcurl_free_tickets() {
		int i;
		do {
			if (!tickets_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_ticket_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\ticket.c", 63, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; tickets_object[i]; i++) {
			tickets_object[i].flickcurl_free_ticket();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tickets_object);
	}
	public static  flickcurl_photos_comments_getRecentForContacts_params(flickcurl_s fc, int date_lastcomment, Object contacts_filter,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		byte[] date_lastcomment_str = new byte[20];
		fc.flickcurl_init_params(0);
		if (date_lastcomment >= /* API parameters */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(date_lastcomment_str, "%d", date_lastcomment);
			fc.flickcurl_add_param("date_lastcomment", date_lastcomment_str);
		} 
		if (contacts_filter) {
			fc.flickcurl_add_param("contacts_filter", contacts_filter);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.comments.getRecentForContacts")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photos", format);
	}
	public static  flickcurl_galleries_getPhotos_params(flickcurl_s fc, Object gallery_id,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!gallery_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("gallery_id", /* API parameters */gallery_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.getPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/gallery", format);
		return photos_list/**
		 * flickcurl_galleries_getPhotos:
		 * @fc: flickcurl context
		 * @gallery_id: The ID of the gallery of photos to return
		 * @extras: A comma-delimited list of extra information to fetch for each returned record.
		 * @per_page: Number of photos to return per page (default 100, max 500)
		 * @page: The page of results to return (default 1)
		 * 
		 * Return the list of photos for a gallery
		 *
		 * See flickcurl_galleries_getPhotos_params() for details of @extras.
		 *
		 * Implements flickr.galleries.getPhotos (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * gallery.c - Flickcurl gallery functions
	 *
	 * Copyright (C) 2010, David Beckett http://www.dajobe.org/
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
	 * flickcurl_free_gallery:
	 * @gallery: gallery object
	 *
	 * Destructor for gallery object
	 */
	public static void flickcurl_free_gallery() {
		do {
			if (!gallery) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_gallery is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\gallery.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedId = this.getId();
		if (generatedId) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedId);
		} 
		Object generatedUrl = this.getUrl();
		if (generatedUrl) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
		} 
		Object generatedOwner = this.getOwner();
		if (generatedOwner) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedOwner);
		} 
		Object generatedPrimary_photo = this.getPrimary_photo();
		if (generatedPrimary_photo) {
			generatedPrimary_photo.flickcurl_free_photo();
		} 
		Object generatedTitle = this.getTitle();
		if (generatedTitle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTitle);
		} 
		Object generatedDescription = this.getDescription();
		if (generatedDescription) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedDescription);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(gallery/**
		 * flickcurl_free_galleries:
		 * @galleries_object: gallery object array
		 *
		 * Destructor for array of gallery objects
		 */);
	}
	public static void flickcurl_free_galleries() {
		int i;
		do {
			if (!galleries_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_gallery_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\gallery.c", 80, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; galleries_object[i]; i++) {
			galleries_object[i].flickcurl_free_gallery();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(galleries_object);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * group.c - Flickcurl group functions
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
	 * flickcurl_free_group:
	 * @group: group object
	 *
	 * Destructor for group object
	 */
	public static void flickcurl_free_group() {
		do {
			if (!group) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_group is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\group.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedNsid = this.getNsid();
		if (generatedNsid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedNsid);
		} 
		Object generatedName = this.getName();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedName);
		} 
		Object generatedDescription = this.getDescription();
		if (generatedDescription) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedDescription);
		} 
		Object generatedLang = this.getLang();
		if (generatedLang) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedLang);
		} 
		Object generatedThrottle_mode = this.getThrottle_mode();
		if (generatedThrottle_mode) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedThrottle_mode);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(group/**
		 * flickcurl_free_groups:
		 * @groups_object: group object array
		 *
		 * Destructor for array of group object
		 */);
	}
	public static void flickcurl_free_groups() {
		int i;
		do {
			if (!groups_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_group_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\group.c", 78, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; groups_object[i]; i++) {
			groups_object[i].flickcurl_free_group();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(groups_object);
	}
	public static void flickcurl_serializer_init() {
		int i;
		for (i = 0; ModernizedCProgram.namespace_table[i].getPrefix() != ((Object)0); i++) {
			ModernizedCProgram.namespace_table[i].setUri_len(/*Error: Function owner not recognized*/strlen(ModernizedCProgram.namespace_table[i].getUri()));
			ModernizedCProgram.namespace_table[i].setPrefix_len(/*Error: Function owner not recognized*/strlen(ModernizedCProgram.namespace_table[i].getPrefix()));
		}
	}
	public static void flickcurl_serializer_terminate() {
	}
	/**
	 * flickcurl_new_serializer:
	 * @fc: flickcurl object
	 * @data: user data for factory methods
	 * @factory: triples serializer factory
	 *
	 * Create a new triples serializer for generating a RDF triples
	 * representation of a Flickr photo.
	 *
	 * The factory must contain the methods and the correct factory API
	 * version as described in #flickcurl_serializer_factory
	 *
	 * Return value: a new serializer object or NULL on failure
	 *
	*/
	public static int flickcurl_serialize_photo(flickcurl_serializer_s fcs, flickcurl_photo_s photo) {
		int i;
		int need_person = 0;
		int need_foaf = 0;
		int need_rdfs = 0;
		flickrdf_nspace nspaces = ((Object)0);
		flickrdf_nspace ns = new flickrdf_nspace();
		Object generatedFactory = fcs.getFactory();
		flickcurl_serializer_factory fsf = generatedFactory;
		Object generatedFc = fcs.getFc();
		flickcurl fc = generatedFc;
		flickcurl_size sizes = ((Object)0);
		if (!photo) {
			return 1;
		} 
		nspaces = nspaces.nspace_add_if_not_declared(((Object)0), /* Always add XSD, RDF and Flickr namespaces */"http://www.w3.org/2001/XMLSchema#");
		nspaces = nspaces.nspace_add_if_not_declared("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
		nspaces = nspaces.nspace_add_if_not_declared("flickr", "http://machinetags.org/ns/Flickr#");
		 generatedPlace = photo.getPlace();
		if (generatedPlace) {
			nspaces = nspaces.nspace_add_if_not_declared("places", "http://machinetags.org/ns/Places#");
		} 
		Byte generatedId = photo.getId();
		sizes = fc.flickcurl_photos_getSizes(generatedId);
		if (sizes) {
			need_foaf = 1;
			need_rdfs = 1;
		} 
		Object generatedFields = photo.getFields();
		for (i = .PHOTO_FIELD_FIRST; i <= .PHOTO_FIELD_LAST; /* mark namespaces used in fields */i++) {
			flickcurl_photo_field_type field = (flickcurl_photo_field_type)i;
			flickcurl_field_value_type datatype = generatedFields[field].getType();
			int f;
			if (datatype == .VALUE_TYPE_NONE) {
				continue;
			} 
			for (f = 0; field_table[f].getField() != .PHOTO_FIELD_none; f++) {
				if (field_table[f].getField() != field) {
					continue;
				} 
				if (field_table[f].getFlags() & 1) {
					need_person = 1;
				} 
				nspaces = nspaces.nspace_add_if_not_declared(((Object)0), field_table[f].getNspace_uri());
				break;
			}
		}
		int generatedTags_count = photo.getTags_count();
		flickcurl_tag_s[][] generatedTags = photo.getTags();
		byte[] generatedRaw = tag.getRaw();
		for (i = 0; i < generatedTags_count; /* in tags look for xmlns:PREFIX = "URI" otherwise look for PREFIX: */i++) {
			byte prefix;
			byte p;
			flickcurl_tag tag = generatedTags[i];
			if (!/*Error: Function owner not recognized*/strncmp(generatedRaw, "xmlns:", 6)) {
				prefix = generatedRaw[6];
				for (p = prefix; p && p != (byte)'='; p++) {
					;
				}
				if (!/* "xmlns:PREFIX" seen */p) {
					continue;
				} 
				p = /* "xmlns:PREFIX = " seen */(byte)'\0';
				nspaces = nspaces.nspace_add_new(prefix, p + 1);
				p = (byte)'=';
				continue;
			} 
			prefix = generatedRaw;
			for (p = prefix; p && p != (byte)':'; p++) {
				;
			}
			if (!/* "PREFIX:" seen */p) {
				continue;
			} 
			p = (byte)'\0';
			nspaces = nspaces.nspace_add_if_not_declared(prefix, ((Object)0));
			p = (byte)':';
		}
		if (need_person) {
			need_foaf = 1;
			nspaces = nspaces.nspace_add_if_not_declared("dc", "http://purl.org/dc/terms/");
		} 
		if (need_foaf) {
			nspaces = nspaces.nspace_add_if_not_declared("foaf", "http://xmlns.com/foaf/0.1/");
		} 
		if (need_rdfs) {
			nspaces = nspaces.nspace_add_if_not_declared("rdfs", "http://www.w3.org/2000/01/rdf-schema#");
		} 
		Object generatedData = fcs.getData();
		Byte generatedPrefix = ns.getPrefix();
		Object generatedPrefix_len = ns.getPrefix_len();
		Byte generatedUri = ns.getUri();
		Object generatedUri_len = ns.getUri_len();
		flickrdf_nspace_s generatedNext = ns.getNext();
		for (ns = nspaces; ns; ns = generatedNext) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedPrefix, generatedPrefix_len, generatedUri, generatedUri_len);
		}
		if (need_person) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedUri, .FLICKCURL_TERM_TYPE_RESOURCE, "http://purl.org/dc/terms/", "creator", "person", .FLICKCURL_TERM_TYPE_BLANK, ((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, "person", .FLICKCURL_TERM_TYPE_BLANK, "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "type", "http://xmlns.com/foaf/0.1/Person", .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, "person", .FLICKCURL_TERM_TYPE_BLANK, "http://xmlns.com/foaf/0.1/", "maker", generatedUri, .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
		} 
		Object generatedUrl = license.getUrl();
		Object generatedName = license.getName();
		for (i = .PHOTO_FIELD_FIRST; i <= .PHOTO_FIELD_LAST; /* generate triples from fields */i++) {
			flickcurl_photo_field_type field = (flickcurl_photo_field_type)i;
			flickcurl_field_value_type datatype = generatedFields[field].getType();
			int f;
			if (datatype == .VALUE_TYPE_NONE) {
				continue;
			} 
			for (f = 0; field_table[f].getField() != .PHOTO_FIELD_none; f++) {
				byte datatype_uri = ((Object)0);
				byte object = ((Object)0);
				byte new_object = ((Object)0);
				int type = .FLICKCURL_TERM_TYPE_LITERAL;
				if (field_table[f].getField() != field) {
					continue;
				} 
				object = generatedFields[field].getString();
				if (field_table[f].getFlags() & 2) {
					datatype = .VALUE_TYPE_STRING;
				}  else if (field_table[f].getFlags() & 8) {
					datatype = .VALUE_TYPE_FLOAT;
				}  else if (field_table[f].getFlags() & 4) {
					new_object = ModernizedCProgram.flickcurl_sqltimestamp_to_isotime(object);
					object = new_object;
					datatype = .VALUE_TYPE_DATETIME;
				} 
				if (field == .PHOTO_FIELD_license) {
					flickcurl_license license = new flickcurl_license();
					license = fc.flickcurl_photos_licenses_getInfo_by_id(generatedFields[field].getInteger());
					if (!license) {
						if (new_object) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(new_object);
						} 
						continue;
					} 
					if (generatedUrl) {
						datatype = .VALUE_TYPE_URI;
						object = generatedUrl;
					} else {
							datatype = .VALUE_TYPE_STRING;
							object = generatedName;
					} 
				} 
				switch (datatype) {
				case .VALUE_TYPE_PHOTO_URI:
				case .VALUE_TYPE_PHOTO_ID:
				case .VALUE_TYPE_PERSON_ID:
				case .VALUE_TYPE_COLLECTION_ID:
				case /* these value can never been seen; code above never sets it */.VALUE_TYPE_NONE:
				case .VALUE_TYPE_ICON_PHOTOS:
				case .VALUE_TYPE_URI:
						type = .FLICKCURL_TERM_TYPE_RESOURCE;
						break;
				case .VALUE_TYPE_INTEGER:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#integer";
						break;
				case .VALUE_TYPE_DATETIME:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#dateTime";
						break;
				case .VALUE_TYPE_UNIXTIME:
				case .VALUE_TYPE_TAG_STRING:
				case .VALUE_TYPE_BOOLEAN:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#boolean";
						break;
				case .VALUE_TYPE_FLOAT:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#double";
						break;
				case .VALUE_TYPE_MEDIA_TYPE:
				case .VALUE_TYPE_STRING:
						break;
				default:
						break;
				}
				if (field_table[f].getFlags() & 1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, "person", .FLICKCURL_TERM_TYPE_BLANK, field_table[f].getNspace_uri(), generatedName, object, type, datatype_uri);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedUri, .FLICKCURL_TERM_TYPE_RESOURCE, field_table[f].getNspace_uri(), generatedName, object, type, datatype_uri);
				} 
				if (new_object) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(new_object);
				} 
				break;
			}
		}
		for (i = 0; i < generatedTags_count; /* generate triples from tags */i++) {
			flickcurl_tag tag = generatedTags[i];
			byte prefix;
			byte p;
			byte f;
			byte v;
			size_t value_len = new size_t();
			prefix = generatedRaw[0];
			if (!/*Error: Function owner not recognized*/strncmp(prefix, "xmlns:", 6)) {
				continue;
			} 
			for (p = prefix; p && p != (byte)':'; p++) {
				;
			}
			if (!/* No ':' found */p) {
				continue;
			} 
			p = /* ":" seen */(byte)'\0';
			f = p + 1;
			for (v = f; v && v != (byte)'='; v++) {
				;
			}
			if (!/* "prefix:name" seen with no value */v) {
				continue;
			} 
			v++ = /* zap = */(byte)'\0';
			value_len = /*Error: Function owner not recognized*/strlen(v);
			if (v == (byte)'"') {
				v++;
				if (v[value_len - 1] == (byte)'"') {
					v[--value_len] = (byte)'\0';
				} 
			} 
			ns = nspaces.nspace_get_by_prefix(prefix);
			if (!ns) {
				continue;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedUri, .FLICKCURL_TERM_TYPE_RESOURCE, generatedUri, f, v, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
		}
		Object generatedNames = place.getNames();
		Object generatedIds = place.getIds();
		Object generatedUrls = place.getUrls();
		Object generatedWoe_ids = place.getWoe_ids();
		if (generatedPlace) {
			byte[] place_bnode = new byte[]{(byte)'p', (byte)'l', (byte)'a', (byte)'c', (byte)'e', (byte)'X', (byte)'\0'};
			flickcurl_place place = generatedPlace;
			for (i = (int)0; i <= (int).FLICKCURL_PLACE_LAST; i++) {
				byte name = generatedNames[i];
				byte id = generatedIds[i];
				byte url = generatedUrls[i];
				byte woe_id = generatedWoe_ids[i];
				if (!name && !id && !url && !woe_id) {
					continue;
				} 
				place_bnode[5] = (byte)'0' + i;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedUri, .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Places#", "place", place_bnode, .FLICKCURL_TERM_TYPE_BLANK, ((Object)0));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "type", "http://machinetags.org/ns/Places#Place", .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "type", ModernizedCProgram.flickcurl_get_place_type_label((flickcurl_place_type)i), .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				if (name) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "name", name, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				if (id) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "id", id, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				if (woe_id) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "placeid", woe_id, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				if (url) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "url", url, .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				} 
			}
		} 
		Object generatedMedia = size.getMedia();
		Object generatedSource = size.getSource();
		Object generatedLabel = size.getLabel();
		Object generatedWidth = size.getWidth();
		Object generatedHeight = size.getHeight();
		if (/* generate triples from sizes */sizes) {
			for (i = 0; sizes[i]; i++) {
				flickcurl_size size = sizes[i];
				byte[] buf = new byte[10];
				int is_photo;
				byte sizePredicate;
				byte sizeClass;
				is_photo = (!/*Error: Function owner not recognized*/strcmp(generatedMedia, "photo"));
				sizePredicate = is_photo ? "photo" : "video";
				sizeClass = is_photo ? "http://xmlns.com/foaf/0.1/Image" : "http://machinetags.org/ns/Flickr#Video";
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedUri, .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Flickr#", sizePredicate, generatedSource, .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedSource, .FLICKCURL_TERM_TYPE_RESOURCE, "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "type", sizeClass, .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				if (generatedLabel) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedSource, .FLICKCURL_TERM_TYPE_RESOURCE, "http://www.w3.org/2000/01/rdf-schema#", "label", generatedLabel, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(buf, "%d", generatedWidth);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedSource, .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Flickr#", "width", buf, .FLICKCURL_TERM_TYPE_LITERAL, "http://www.w3.org/2001/XMLSchema#integer");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(buf, "%d", generatedHeight);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedSource, .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Flickr#", "height", buf, .FLICKCURL_TERM_TYPE_LITERAL, "http://www.w3.org/2001/XMLSchema#integer");
			}
			sizes.flickcurl_free_sizes();
		} 
		if (nspaces) {
			nspaces.free_nspaces();
		} 
		Object generatedEmit_finish = fsf.getEmit_finish();
		if (generatedEmit_finish) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData);
		} 
		return 0;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * exif.c - Flickcurl EXIF functions
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
	 * flickcurl_free_exif:
	 * @exif: exif object
	 *
	 * Destructor for exif object
	 */
	public static void flickcurl_free_exif() {
		do {
			if (!exif) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_exif is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\exif.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedTagspace = this.getTagspace();
		if (generatedTagspace) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTagspace);
		} 
		Object generatedLabel = this.getLabel();
		if (generatedLabel) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedLabel);
		} 
		Object generatedRaw = this.getRaw();
		if (generatedRaw) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedRaw);
		} 
		Object generatedClean = this.getClean();
		if (generatedClean) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedClean);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(exif/**
		 * flickcurl_free_exifs:
		 * @exifs_object: array of exif objects
		 *
		 * Destructor for array of exif objects
		 */);
	}
	public static void flickcurl_free_exifs() {
		int i;
		do {
			if (!exifs_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_exif_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\exif.c", 73, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; exifs_object[i]; i++) {
			exifs_object[i].flickcurl_free_exif();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(exifs_object);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * size.c - Flickcurl size functions
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
	 * flickcurl_free_size:
	 * @size: size object
	 *
	 * Destructor for size object
	 */
	public static void flickcurl_free_size() {
		do {
			if (!size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_size is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\size.c", 46, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedLabel = this.getLabel();
		if (generatedLabel) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedLabel);
		} 
		Object generatedSource = this.getSource();
		if (generatedSource) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedSource);
		} 
		Object generatedUrl = this.getUrl();
		if (generatedUrl) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
		} 
		Object generatedMedia = this.getMedia();
		if (generatedMedia) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedMedia);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(size/**
		 * flickcurl_free_sizes:
		 * @sizes_object: size object array
		 *
		 * Destructor for array of size objects
		 */);
	}
	public static void flickcurl_free_sizes() {
		int i;
		do {
			if (!sizes_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_size_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\size.c", 75, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; sizes_object[i]; i++) {
			sizes_object[i].flickcurl_free_size();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(sizes_object);
	}
	/* name, has_arg, flag, val */
	public static void ser_emit_namespace(Object user_data, Object prefix, Object prefix_len, Object uri, Object uri_len) {
		raptor_serializer serializer = (raptor_serializer)user_data;
		raptor_uri ns_uri = ((Object)0);
		ns_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)uri);
		serializer.raptor_serializer_set_namespace(ns_uri, (byte)prefix);
		ModernizedCProgram.raptor_free_uri(ns_uri);
	}
	public static void ser_emit_triple(Object user_data, Object subject, int subject_type, Object predicate_nspace, Object predicate_name, Object object, int object_type, Object datatype_uri) {
		raptor_serializer serializer = (raptor_serializer)user_data;
		/* static */raptor_statement s = new raptor_statement();
		raptor_uri predicate_ns_uri = new raptor_uri();
		raptor_uri predicate_uri = new raptor_uri();
		s.raptor_statement_init(ModernizedCProgram.rworld);
		if (subject_type == .FLICKCURL_TERM_TYPE_RESOURCE) {
			s.setSubject(ModernizedCProgram.raptor_new_term_from_uri_string(ModernizedCProgram.rworld, (byte)subject));
		} else {
				s.setSubject(ModernizedCProgram.raptor_new_term_from_blank(ModernizedCProgram.rworld, (byte)/* blank node */subject));
		} 
		predicate_ns_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)predicate_nspace);
		predicate_uri = ModernizedCProgram.raptor_new_uri_from_uri_local_name(ModernizedCProgram.rworld, predicate_ns_uri, (byte)predicate_name);
		s.setPredicate(ModernizedCProgram.raptor_new_term_from_uri(ModernizedCProgram.rworld, predicate_uri));
		ModernizedCProgram.raptor_free_uri(predicate_uri);
		ModernizedCProgram.raptor_free_uri(predicate_ns_uri);
		if (object_type == .FLICKCURL_TERM_TYPE_RESOURCE) {
			s.setObject(ModernizedCProgram.raptor_new_term_from_uri_string(ModernizedCProgram.rworld, (byte)object));
		}  else if (object_type == .FLICKCURL_TERM_TYPE_BLANK) {
			s.setObject(ModernizedCProgram.raptor_new_term_from_blank(ModernizedCProgram.rworld, (byte)subject));
		} else {
				raptor_uri raptor_datatype_uri = ((Object)/* literal */0);
				if (datatype_uri) {
					raptor_datatype_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)datatype_uri);
				} 
				s.setObject(ModernizedCProgram.raptor_new_term_from_literal(ModernizedCProgram.rworld, (byte)object, raptor_datatype_uri, ((Object)/* language */0)));
				ModernizedCProgram.raptor_free_uri(raptor_datatype_uri);
		} 
		serializer.raptor_serializer_serialize_statement(s);
		s.raptor_statement_clear();
	}
	public static void ser_emit_finish(Object user_data) {
		raptor_serializer serializer = (raptor_serializer)user_data;
		serializer.raptor_serializer_serialize_end();
	}
	public static  flickcurl_photosets_getPhotos_params(flickcurl_s fc, Object photoset_id, int privacy_filter,  list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] privacy_filter_str = new byte[2];
		byte format = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photoset_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photoset_id", /* API parameters */photoset_id);
		if (privacy_filter >= 1 && privacy_filter <= 5) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(privacy_filter_str, "%d", privacy_filter);
			fc.flickcurl_add_param("privacy_filter", privacy_filter_str);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.getPhotos")) {
			;
		} 
		photos_list = fc.flickcurl_invoke_photos_list(()"/rsp/photoset", format);
		return photos_list/**
		 * flickcurl_photosets_getPhotos:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to return the photos for.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record (or NULL)
		 * @privacy_filter: Return photos only matching a certain privacy level 1-5 (or <0)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 500. The maximum allowed value is 500. (or <0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or <0)
		 * 
		 * Get the list of photos in a set.
		 *
		 * See flickcurl_photosets_getPhotos_params() for details of parameters.
		 *
		 * Implements flickr.photosets.getPhotos (0.13)
		 * 
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public static Object flickcurl_get_place_type_label( place_type) {
		if (place_type <= .FLICKCURL_PLACE_LAST) {
			return ModernizedCProgram.flickcurl_place_type_label[(int)place_type];
		} 
		return ((Object)0/**
		 * flickcurl_get_place_type_by_label:
		 * @place_label: place type
		 *
		 * Get a place type by label
		 *
		 * Return value: place type
		 */);
	}
	public static  flickcurl_get_place_type_by_label(Object place_label) {
		int i;
		for (i = 0; ModernizedCProgram.flickcurl_place_type_label[i]; i++) {
			if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.flickcurl_place_type_label[i], place_label)) {
				return (flickcurl_place_type)i;
			} 
		}
		return .FLICKCURL_PLACE_LOCATION/**
		 * flickcurl_free_place:
		 * @place: place object
		 *
		 * Destructor for place object
		 */;
	}
	public static void flickcurl_free_place() {
		int i;
		do {
			if (!place) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_place is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\place.c", 105, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedNames = this.getNames();
		Object generatedIds = this.getIds();
		Object generatedUrls = this.getUrls();
		Object generatedWoe_ids = this.getWoe_ids();
		for (i = 0; i <= .FLICKCURL_PLACE_LAST; i++) {
			if (generatedNames[i]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedNames[i]);
			} 
			if (generatedIds[i]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedIds[i]);
			} 
			if (generatedUrls[i]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrls[i]);
			} 
			if (generatedWoe_ids[i]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedWoe_ids[i]);
			} 
		}
		Object generatedShape = this.getShape();
		if (generatedShape) {
			generatedShape.flickcurl_free_shape();
		} 
		Object generatedTimezone = this.getTimezone();
		if (generatedTimezone) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTimezone);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(place/**
		 * flickcurl_free_places:
		 * @places_object: place object array
		 *
		 * Destructor for array of place object
		 */);
	}
	public static void flickcurl_free_places() {
		int i;
		do {
			if (!places_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_place_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\place.c", 139, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; places_object[i]; i++) {
			places_object[i].flickcurl_free_place();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(places_object);
	}
	public static int flickcurl_place_type_to_id( place_type) {
		int place_type_id = -1;
		if (place_type == .FLICKCURL_PLACE_NEIGHBORHOOD) {
			place_type_id = 22;
		}  else if (place_type == .FLICKCURL_PLACE_LOCALITY) {
			place_type_id = 7;
		}  else if (place_type == .FLICKCURL_PLACE_REGION) {
			place_type_id = 8;
		}  else if (place_type == .FLICKCURL_PLACE_COUNTRY) {
			place_type_id = 12;
		}  else if (place_type == .FLICKCURL_PLACE_CONTINENT) {
			place_type_id = 29;
		} else {
				place_type_id = -1;
		} 
		return place_type_id/**
		 * flickcurl_place_id_to_type:
		 * @place_type_id: place type ID
		 *
		 * Turn a place type into a place ID
		 *
		 * Return value: place type for fID or FLICKCURL_PLACE_LOCATION on failure
		 */;
	}
	public static  flickcurl_place_id_to_type(int place_type_id) {
		flickcurl_place_type place_type = .FLICKCURL_PLACE_LOCATION;
		if (place_type_id == 22) {
			place_type = .FLICKCURL_PLACE_NEIGHBORHOOD;
		}  else if (place_type_id == 7) {
			place_type = .FLICKCURL_PLACE_LOCALITY;
		}  else if (place_type_id == 8) {
			place_type = .FLICKCURL_PLACE_REGION;
		}  else if (place_type_id == 12) {
			place_type = .FLICKCURL_PLACE_COUNTRY;
		}  else if (place_type_id == 29) {
			place_type = .FLICKCURL_PLACE_CONTINENT;
		} else {
				place_type = .FLICKCURL_PLACE_LOCATION;
		} 
		return place_type;
	}
	public static void flickcurl_free_place_type_infos() {
		int i;
		do {
			if (!ptis_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_place_type_info is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\place.c", 747, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Object generatedName = pti.getName();
		for (i = 0; ptis_object[i]; i++) {
			flickcurl_place_type_info pti = ptis_object[i];
			byte n = generatedName;
			if (n) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(n);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(pti);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptis_object);
	}
}
