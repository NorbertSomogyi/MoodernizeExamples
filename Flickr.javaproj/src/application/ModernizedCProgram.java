package application;

public class ModernizedCProgram {
	public static byte program;
	public static byte title_format_string = /* name, has_arg, flag, val */"Skeleton code generator utility %s\n";
	public static raptor_syntax_description[] serializers = new raptor_syntax_description[]{{new raptor_syntax_description("ntriples", ((Object)0)), "N-Triples"}, {new raptor_syntax_description("turtle", ((Object)0)), "Turtle"}};
	public static flickrdf_nspace_s flickrdf_nspace = new flickrdf_nspace_s();
	public static flickrdf_nspace[] namespace_table = new flickrdf_nspace[]{new flickrdf_nspace((byte)"a", (byte)"http://www.w3.org/2000/10/annotation-ns"), new flickrdf_nspace((byte)"acl", (byte)"http://www.w3.org/2001/02/acls#"), new flickrdf_nspace((byte)"blue", (byte)"http://machinetags.org/ns/Blue#"), new flickrdf_nspace((byte)"cell", (byte)"http://machinetags.org/ns/Cell#"), new flickrdf_nspace((byte)"dc", (byte)"http://purl.org/dc/elements/1.1/"), new flickrdf_nspace((byte)"dcterms", (byte)"http://purl.org/dc/terms/"), new flickrdf_nspace((byte)"dopplr", (byte)"http://machinetags.org/ns/Dopplr#"), new flickrdf_nspace((byte)"exif", (byte)"http://nwalsh.com/rdf/exif#"), new flickrdf_nspace((byte)"exifi", (byte)"http://nwalsh.com/rdf/exif-intrinsic#"), new flickrdf_nspace((byte)"flickr", (byte)"http://machinetags.org/ns/Flickr#"), new flickrdf_nspace((byte)"filtr", (byte)"http://machinetags.org/ns/Filtr#"), new flickrdf_nspace((byte)"foaf", (byte)"http://xmlns.com/foaf/0.1/"), new flickrdf_nspace((byte)"geo", (byte)"http://www.w3.org/2003/01/geo/wgs84_pos#"), new flickrdf_nspace((byte)"geonames", (byte)"http://machinetags.org/ns/Geonames#"), new flickrdf_nspace((byte)"i", (byte)"http://www.w3.org/2004/02/image-regions#"), new flickrdf_nspace((byte)"ph", (byte)"http://machinetags.org/ns/Ph#"), new flickrdf_nspace((byte)"places", (byte)"http://machinetags.org/ns/Places#"), new flickrdf_nspace((byte)"rdf", (byte)"http://www.w3.org/1999/02/22-rdf-syntax-ns#"), new flickrdf_nspace((byte)"rdfs", (byte)"http://www.w3.org/2000/01/rdf-schema#"), new flickrdf_nspace((byte)"skos", (byte)"http://www.w3.org/2004/02/skos/core"), new flickrdf_nspace((byte)"upcoming", (byte)"http://machinetags.org/ns/Upcoming#"), new flickrdf_nspace((byte)"xsd", (byte)"http://www.w3.org/2001/XMLSchema#"), new flickrdf_nspace(((Object)0), ((Object)0))};
	public static byte[] flickcurl_person_field_label = new byte[]{"(none)", "isadmin", "ispro", "iconserver", "iconfarm", "username", "realname", "mbox_sha1sum", "location", "photosurl", "profileurl", "mobileurl", "photos_firstdate", "photos_firstdatetaken", "photos_count", "photos_views", "favedate"/**
	 * flickcurl_get_person_field_label:
	 * @field: field enum
	 *
	 * Get label for person field
	 *
	 * Return value: label string or NULL if none valid
	 */};
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
	public static int opterr;
	public static int optind;
	public static int optopt;
	public static byte optarg;
	public static Object MD5Init;
	public static Object MD5Update;
	public static Object MD5Final;
	public static Object MD5Transform;
	public static byte MD5_string;
	public static byte flickcurl_short_copyright_string = /* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * common.c - Flickcurl common functions
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
	 *//* for access() and R_OK */"Copyright 2007-2014 David Beckett.";
	public static byte flickcurl_copyright_string = "Copyright (C) 2007-2014 David Beckett - http://www.dajobe.org/";
	public static byte flickcurl_license_string = "LGPL 2.1 or newer, GPL 2 or newer, Apache 2.0 or newer.\nSee http://librdf.org/flickcurl/ for full terms.";
	public static byte flickcurl_home_url_string = "http://librdf.org/flickcurl/";
	public static byte flickcurl_version_string = VERSION;
	public static byte flickcurl_flickr_service_uri = "https://api.flickr.com/services/rest/";
	public static byte flickcurl_flickr_upload_service_uri = "https://up.flickr.com/services/upload/";
	public static byte flickcurl_flickr_replace_service_uri = "https://up.flickr.com/services/replace/";
	public static byte flickcurl_flickr_oauth_request_token_uri = "https://www.flickr.com/services/oauth/request_token";
	public static byte flickcurl_flickr_oauth_authorize_uri = "https://www.flickr.com/services/oauth/authorize";
	public static byte flickcurl_flickr_oauth_access_token_uri = "https://www.flickr.com/services/oauth/access_token";
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
	public static byte my_vsnprintf;
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
	public static byte[] flickcurl_context_type_element = new byte[]{"---", "set", "pool", "prevphoto", "nextphoto", ((Object)0/**
	 * flickcurl_get_context_type_field_label:
	 * @type: context type
	 *
	 * Get label for context type
	 *
	 * Return value: label string or NULL if none valid
	 */)};
	public static byte[] flickcurl_accuracy_labels = new byte[]{"world", "world", "country", "country", "country", "region", "region", "region", "region", "region", "city", "city", "city", "city", "city", "street"/**
	 * flickcurl_get_location_accuracy_label:
	 * @accuracy: accuracy
	 *
	 * Get label for an accuracy
	 *
	 * Return value: label string or NULL if none valid
	 */};
	public static int getopt;
	public static int command_handler;
	public static flickcurl_cmd[] commands = new flickcurl_cmd();
	public static int flickcurl_cmdline_init;
	public static Object flickcurl_cmdline_finish;
	public static byte flickcurl_cmdline_basename;
	public static byte[] flickcurl_institution_url_type_label = new byte[]{"(none)", "site", "license", "flickr"/**
	 * flickcurl_get_institution_url_type_label:
	 * @url_type: institution url enum
	 *
	 * Get label for institution url type
	 *
	 * Return value: label string or NULL if none valid
	 */};
	public static int flickcurl_oauth_build_key;
	public static byte[] yn_strings = new byte[]{"no", "yes"};
	public static flickcurl_photos_list photoslist_fn = new flickcurl_photos_list();
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
	public static Object SHA1Transform;
	public static Object SHA1Init;
	public static Object SHA1Update;
	public static Object SHA1Final;
	
	
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
		return l_a.getId() - l_b.getId();
	}
	public static void flickcurl_read_licenses(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		 xpathObj = ((Object)0);
		 nodes = new ();
		 xpathExpr = ((Object)0);
		int i;
		int size;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.licenses.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		xpathExpr = ()"/rsp/licenses/license";
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		size = .xmlXPathNodeSetGetLength(nodes);
		fc.setLicenses((flickcurl_license).calloc(1 + size, ));
		for (i = 0; i < size; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_license l = new flickcurl_license();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			l = (flickcurl_license).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					l.setId(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					l.setName(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					if (.strlen(attr_value)) {
						l.setUrl(attr_value);
					} else {
							.free(attr_value);
					} 
				} else {
						.free(attr_value);
				} 
			}
			fc.getLicenses()[i] = l/* for nodes */;
		}
		.qsort(fc.getLicenses(), size, , compare_licenses);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj/**
			 * flickcurl_photos_licenses_getInfo:
			 * @fc: flickcurl context
			 * 
			 * Get a list of available photo licenses for Flickr.
			 *
			 * Implements flickr.photos.licenses.getInfo (0.6)
			 * 
			 * Return value: an array of #flickcurl_license or NULL on failure
			 **/);
		} 
	}
	public static Object flickcurl_photos_licenses_getInfo(Object fc) {
		if (!fc.getLicenses()) {
			ModernizedCProgram.flickcurl_read_licenses(fc);
		} 
		return fc.getLicenses();
	}
	public static Object flickcurl_photos_licenses_getInfo_by_id(Object fc, int id) {
		int i;
		if (!fc.getLicenses()) {
			ModernizedCProgram.flickcurl_read_licenses(fc);
		} 
		if (!fc.getLicenses()) {
			return ((Object)0);
		} 
		for (i = 0; fc.getLicenses()[i]; i++) {
			if (fc.getLicenses()[i].getId() == id) {
				return fc.getLicenses()[i];
			} 
			if (fc.getLicenses()[i].getId() > id) {
				break;
			} 
		}
		return ((Object)0/**
		 * flickcurl_photos_licenses_setLicense:
		 * @fc: flickcurl context
		 * @photo_id: The photo to update the license for.
		 * @license_id: The license to apply, or 0 (zero) to remove the current license.
		 * 
		 * Sets the license for a photo.
		 *
		 * Implements flickr.photos.licenses.setLicense (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/);
	}
	public static int flickcurl_photos_licenses_setLicense(Object fc, Object photo_id, int license_id) {
		 doc = ((Object)0);
		int result = 1;
		byte[] license_id_s = new byte[5];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(license_id_s, "%d", license_id);
		ModernizedCProgram.flickcurl_add_param(fc, "license_id", license_id_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.licenses.setLicense")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * reflection-api.c - Flickr flickr.reflection.* API calls
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
	 * flickcurl_reflection_getMethods:
	 * @fc: flickcurl context
	 * 
	 * Get the list of available API method names
	 *
	 * Implements flickr.reflection.getMethods (0.10)
	 * 
	 * Return value: arry of names or NULL on failure
	 **/
	public static Object flickcurl_reflection_getMethods(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		 xpathObj = ((Object)0);
		 nodes = new ();
		 xpathExpr = ((Object)0);
		int i;
		int size;
		byte methods = ((Object)0);
		int count;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare_noauth(fc, "flickr.reflection.getMethods")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		xpathExpr = ()"/rsp/methods/method";
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		size = .xmlXPathNodeSetGetLength(nodes);
		methods = (byte).calloc(1 + size, );
		count = 0;
		for (i = 0; i < size; i++) {
			 node = nodes.getNodeTab()[i];
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					methods[count] = (byte).malloc(len + 1);
					.memcpy(methods[count], chnode.getContent(), len + 1);
					count++;
					break;
				} 
			}
		}
		methods[count] = ((Object)/* for nodes */0);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj);
		} 
		return methods/**
		 * flickcurl_reflection_getMethodInfo:
		 * @fc: flickcurl context
		 * @name: method name
		 * 
		 * Get information about an API method
		 *
		 * Implements flickr.reflection.getMethodInfo (0.10)
		 * 
		 * Return value: #flickcurl_method or NULL on failure
		 **/;
	}
	public static Object flickcurl_reflection_getMethodInfo(Object fc, Object name) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_method method = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "method_name", name);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.reflection.getMethodInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		method = ModernizedCProgram.flickcurl_build_method(fc, xpathCtx);
		if (fc.getFailed()) {
			if (method) {
				ModernizedCProgram.flickcurl_free_method(method);
			} 
			method = ((Object)0);
		} 
		return method;
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
		.fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message);
		.fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message);
		.fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message/* + makes GNU getopt_long() never permute the arguments */);
		.fprintf((_iob[2]), "%s: ERROR: %s\n", ModernizedCProgram.program, message);
	}
	public static int main(int argc, Object argv) {
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
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = .atoi(ModernizedCProgram.optarg);
					} 
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'v':
					.fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					.fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					.exit(0);
			case 0:
			case (byte)'h':
					help = 1;
					break;
			}
		}
		if (help) {
			;
		} 
		if (argc < 2) {
			.fprintf((_iob[2]), "%s: No API section given\n", ModernizedCProgram.program);
			usage = 1;
		} 
		if (usage) {
			if (usage > 1) {
				.fprintf((_iob[2]), ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
				.fputs("Flickcurl home page: ", (_iob[2]));
				.fputs(ModernizedCProgram.flickcurl_home_url_string, (_iob[2]));
				.fputc((byte)'\n', (_iob[2]));
				.fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[2]));
				.fputs("\nLicense: ", (_iob[2]));
				.fputs(ModernizedCProgram.flickcurl_license_string, (_iob[2]));
				.fputs("\n\n", (_iob[2]));
			} 
			.fprintf((_iob[2]), "Try `%s -h' for more information.\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		fc = ModernizedCProgram.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		ModernizedCProgram.flickcurl_set_error_handler(fc, my_message_handler, ((Object)0));
		if (read_auth && !.access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (ModernizedCProgram.flickcurl_config_read_ini(fc, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		if (request_delay >= 0) {
			ModernizedCProgram.flickcurl_set_request_delay(fc, request_delay);
		} 
		.strcpy(section, "flickr.");
		.strcpy(section + 7, argv[1]);
		for (i = 0; section[i]; /* allow old format commands to work */i++) {
			if (section[i] == (byte)'-') {
				section[i] = (byte)'.';
			} 
		}
		if (!.strncmp(section, "flickr.flickr", 13)) {
			.strcpy(section, section + 7);
		} 
		section_len = .strlen(section);
		.fprintf((_iob[2]), "%s: section '%s'\n", ModernizedCProgram.program, section);
		methods = ModernizedCProgram.flickcurl_reflection_getMethods(fc);
		if (!methods) {
			.fprintf((_iob[2]), "%s: getMethods failed\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		.fprintf((_iob[1]), "/* -*- Mode: c; c-basic-offset: 2 -*-\n *\n * %s-api.c - Flickr %s.* API calls\n *\n", argv[1], section);
		.fprintf((_iob[1]), " * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/\n * \n * This file is licensed under the following three licenses as alternatives:\n *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version\n *   2. GNU General Public License (GPL) V2 or any newer version\n *   3. Apache License, V2.0 or any newer version\n * \n * You may not use this file except in compliance with at least one of\n * the above three licenses.\n * \n * See LICENSE.html or LICENSE.txt at the top of this package for the\n * complete terms and further detail along with the license texts for\n * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.\n * \n */\n\n#include <stdio.h>\n#include <string.h>\n#include <stdarg.h>\n\n#ifdef HAVE_CONFIG_H\n#include <config.h>\n#endif\n\n#ifdef HAVE_STDLIB_H\n#include <stdlib.h>\n#undef HAVE_STDLIB_H\n#endif\n#ifdef HAVE_UNISTD_H\n#include <unistd.h>\n#endif\n\n#include <flickcurl.h>\n#include <flickcurl_internal.h>\n\n\n");
		for (i = 0; methods[i]; i++) {
			flickcurl_method method = new flickcurl_method();
			byte method_name;
			byte[] function_name = new byte[100];
			int c;
			int j;
			int is_write = 0;
			if (.strncmp(methods[i], section, section_len)) {
				continue;
			} 
			method = ModernizedCProgram.flickcurl_reflection_getMethodInfo(fc, methods[i]);
			if (!method) {
				.fprintf((_iob[2]), "%s: getMethodInfo(%s) failed\n", ModernizedCProgram.program, methods[i]);
				rc = 1;
				break;
			} 
			method_name = method.getName();
			if (.strstr(method_name, ".add") || .strstr(method_name, ".create") || .strstr(method_name, ".delete") || .strstr(method_name, ".edit") || .strstr(method_name, ".remove") || .strstr(method_name, ".set")) {
				is_write = 1;
			} 
			.strcpy(function_name, "flickcurl_");
			for (j = 0; (c = methods[i][j + 7]); j++) {
				if (c == (byte)'.') {
					c = (byte)'_';
				} 
				function_name[j + 10] = c;
			}
			function_name[j + 10] = (byte)'\0';
			.fprintf((_iob[1]), "/**\n * %s:\n", function_name);
			.fprintf((_iob[1]), /* fixed arguments */" * @fc: flickcurl context\n");
			if (method.getArgs_count()) {
				int argi;
				for (argi = 0; method.getArgs()[argi]; argi++) {
					flickcurl_arg arg = method.getArgs()[argi];
					if (!.strcmp(arg.getName(), "api_key")) {
						continue;
					} 
					.fprintf((_iob[1]), " * @%s: %s", arg.getName(), arg.getDescription());
					if (arg.getOptional()) {
						.fputs(((!.strcmp(arg.getName(), "per_page") || !.strcmp(arg.getName(), "page")) ? " (or < 0)" : " (or NULL)"), (_iob[1]));
					} 
					.fputc((byte)'\n', (_iob[1]));
				}
			} 
			.fprintf((_iob[1]), " * \n * %s\n *\n * Implements %s (%s)\n", method.getDescription(), method.getName(), ModernizedCProgram.flickcurl_version_string);
			.fprintf((_iob[1]), " * \n * Return value: non-0 on failure\n **/\n");
			.fprintf((_iob[1]), "int\n%s(flickcurl* fc", function_name);
			if (method.getArgs_count()) {
				int argi;
				for (argi = 0; method.getArgs()[argi]; argi++) {
					flickcurl_arg arg = method.getArgs()[argi];
					if (!.strcmp(arg.getName(), "api_key")) {
						continue;
					} 
					if ((!.strcmp(arg.getName(), "per_page") || !.strcmp(arg.getName(), "page"))) {
						.fprintf((_iob[1]), ", int %s", arg.getName());
					} else {
							.fprintf((_iob[1]), ", const char* %s", arg.getName());
					} 
				}
			} 
			.fprintf((_iob[1]), ")\n{\n");
			.fprintf((_iob[1]), "  xmlDocPtr doc = NULL;\n  xmlXPathContextPtr xpathCtx = NULL; \n  void* result = NULL;\n");
			if (method.getArgs_count()) {
				int argi;
				for (argi = 0; method.getArgs()[argi]; argi++) {
					flickcurl_arg arg = method.getArgs()[argi];
					if ((!.strcmp(arg.getName(), "per_page") || !.strcmp(arg.getName(), "page"))) {
						.fprintf((_iob[1]), "  char %s_str[10];\n", arg.getName());
					} 
				}
			} 
			.fputs("\n  flickcurl_init_params(fc, 0);\n\n", (_iob[1]));
			if (method.getArgs_count()) {
				int argi;
				int print_or = 0;
				.fprintf((_iob[1]), "  if(");
				for (argi = 0; method.getArgs()[argi]; argi++) {
					flickcurl_arg arg = method.getArgs()[argi];
					if (!.strcmp(arg.getName(), "api_key")) {
						continue;
					} 
					if (!arg.getOptional()) {
						if (print_or) {
							.fprintf((_iob[1]), " || ");
						} 
						.fprintf((_iob[1]), "!%s", arg.getName());
						print_or = 1;
					} 
				}
				.fprintf((_iob[1]), ")\n    return 1;\n\n");
			} 
			if (method.getArgs_count()) {
				int argi;
				for (argi = 0; method.getArgs()[argi]; argi++) {
					flickcurl_arg arg = method.getArgs()[argi];
					if (!.strcmp(arg.getName(), "api_key")) {
						continue;
					} 
					if (arg.getOptional()) {
						if ((!.strcmp(arg.getName(), "per_page") || !.strcmp(arg.getName(), "page"))) {
							.fprintf((_iob[1]), "  if(%s >= 0) {\n    sprintf(%s_str, \"%%d\", %s);\n    flickcurl_add_param(fc, \"%s\", %s_str);\n  }\n", arg.getName(), arg.getName(), arg.getName(), arg.getName(), arg.getName());
							continue;
						} 
						.fprintf((_iob[1]), "  if(%s)\n", arg.getName());
					} 
					.fprintf((_iob[1]), "  flickcurl_add_param(fc, \"%s\", %s);\n", arg.getName(), arg.getName());
				}
			} 
			.fprintf((_iob[1]), "\n  flickcurl_end_params(fc);\n\n  if(flickcurl_prepare(fc, \"%s\"))\n    goto tidy;\n\n", method.getName());
			if (is_write) {
				.fprintf((_iob[1]), "  flickcurl_set_write(fc, 1);\n  flickcurl_set_data(fc, (void*)\"\", 0);\n\n");
			} 
			.fprintf((_iob[1]), "  doc = flickcurl_invoke(fc);\n  if(!doc)\n    goto tidy;\n\n\n  xpathCtx = xmlXPathNewContext(doc);\n  if(!xpathCtx) {\n    flickcurl_error(fc, \"Failed to create XPath context for document\");\n    fc->failed = 1;\n    goto tidy;\n  }\n\n  result = NULL; /* your code here */\n\n  tidy:\n  if(xpathCtx)\n    xmlXPathFreeContext(xpathCtx);\n\n  if(fc->failed)\n    result = NULL;\n\n  return (result == NULL);\n}\n\n\n");
			ModernizedCProgram.flickcurl_free_method(method);
		}
		if (fc) {
			ModernizedCProgram.flickcurl_free(fc);
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
			case (byte)'v':
					.fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					.fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					.exit(0);
			case 0:
			case (byte)'h':
					help = 1;
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			}
		}
		if (help) {
			;
		} 
		if (argc != 1) {
			.fprintf((_iob[2]), "%s: Extra arguments given\n", ModernizedCProgram.program);
			usage = 1;
		} 
		if (usage) {
			if (usage > 1) {
				.fprintf((_iob[2]), ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
				.fputs("Flickcurl home page: ", (_iob[2]));
				.fputs(ModernizedCProgram.flickcurl_home_url_string, (_iob[2]));
				.fputc((byte)'\n', (_iob[2]));
				.fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[2]));
				.fputs("\nLicense: ", (_iob[2]));
				.fputs(ModernizedCProgram.flickcurl_license_string, (_iob[2]));
				.fputs("\n\n", (_iob[2]));
			} 
			.fprintf((_iob[2]), "Try `%s -h' for more information.\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		fc = ModernizedCProgram.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		ModernizedCProgram.flickcurl_set_error_handler(fc, my_message_handler, ((Object)0));
		if (read_auth && !.access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (ModernizedCProgram.flickcurl_config_read_ini(fc, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		methods = ModernizedCProgram.flickcurl_reflection_getMethods(fc);
		if (!methods) {
			.fprintf((_iob[2]), "%s: getMethods failed\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		for (i = 0; methods[i]; i++) {
			;
		}
		count = i;
		.fprintf((_iob[2]), "%s: Found %d API methods\n", ModernizedCProgram.program, count);
		.qsort(methods, count, , /* it seems to be sorted when returned but ensure it anyway */compare_strings);
		for (i = 0; methods[i]; i++) {
			.fputs((byte)methods[i], (_iob[1]));
			.fputc((byte)'\n', (_iob[1]));
		}
		if (fc) {
			ModernizedCProgram.flickcurl_free(fc);
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
		fc = ModernizedCProgram.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		ModernizedCProgram.flickcurl_set_error_handler(fc, my_message_handler, ((Object)0));
		if (read_auth) {
			if (!.access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
				if (ModernizedCProgram.flickcurl_config_read_ini(fc, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
					rc = 1;
					;
				} 
			} else {
					for (i = 0; i < argc; ++/* Check if the user has requested to see the help message */i) {
						if (!.strcmp(argv[i], "-h") || !.strcmp(argv[i], "--help")) {
							ModernizedCProgram.print_help_string();
						} 
					}
					.fprintf((_iob[2]), "%s: Configuration file %s not found.\n\n1. Visit http://www.flickr.com/services/api/keys/ to get an <API Key>\n    and <Shared Secret>.\n\n2. Create %s in this format:\n[flickr]\noauth_client_key=<Client key / API Key>\noauth_client_secret=<Client secret / Shared Secret>\n\n3. Call this program with:\n  %s oauth.create\n  (or %s oauth.create <Callback URL> if you understand and need that)\nThis gives a <Request Token> <Request Token Secret> and <Authentication URL>\n\n4. Visit the <Authentication URL> and approve the request to get a <Verifier>\n\n5. Call this program with the <Request Token>, <Request Token Secret>\n    and <Verifier>:\n  %s oauth.verify <Request Token> <Request Token Secret> <Verifier>\n\nThis will write the configuration file with the OAuth access tokens.\nSee http://librdf.org/flickcurl/api/flickcurl-auth.html for full instructions.\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.program, ModernizedCProgram.program, ModernizedCProgram.program);
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
			case (byte)'V':
					ModernizedCProgram.verbose = 2;
					break;
			case (byte)'o':
					if (ModernizedCProgram.optarg) {
						ModernizedCProgram.output_filename = ModernizedCProgram.optarg;
						ModernizedCProgram.output_fh = .fopen(ModernizedCProgram.output_filename, "w");
						if (!ModernizedCProgram.output_fh) {
							.fprintf((_iob[2]), "%s: Failed to write to output file %s: %s\n", ModernizedCProgram.program, ModernizedCProgram.output_filename, .strerror(errno));
							rc = 1;
							;
						} 
					} 
					break;
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = .atoi(ModernizedCProgram.optarg);
					} 
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'q':
					ModernizedCProgram.verbose = 0;
					break;
			case (byte)'h':
					help = 1;
					break;
			case 0:
			case (byte)'a':
					auth_token = ModernizedCProgram.flickcurl_auth_getFullToken(fc, /* Exchange the frob for a full token */ModernizedCProgram.optarg);
					if (!auth_token) {
						.fprintf((_iob[2]), "%s: Could not find auth_token in getFullToken response\n", ModernizedCProgram.program);
						rc = 1;
					} else {
							.fprintf((_iob[1]), "%s: Successfully exchanged frob %s for authentication token\n", ModernizedCProgram.program, ModernizedCProgram.optarg);
							ModernizedCProgram.flickcurl_set_auth_token(fc, auth_token);
							rc = ModernizedCProgram.flickcurl_config_write_ini(fc, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section);
							if (!rc) {
								.fprintf((_iob[1]), "%s: Updated configuration file %s with authentication token\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path);
							} 
					} 
					;
			case (byte)'v':
					.fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					.fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					.exit(0);
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
			ModernizedCProgram.flickcurl_set_request_delay(fc, request_delay);
		} 
		command = argv[0];
		for (i = 0; command[i]; /* allow old format commands to work */i++) {
			if (command[i] == (byte)'-') {
				command[i] = (byte)'.';
			} 
		}
		if (!.strncmp(command, "flickr.", 7)) {
			command += 7;
		} 
		if (!.strcmp(command, "places.forUser")) {
			command = (byte)"places.placesForUser";
		} 
		for (i = 0; ModernizedCProgram.commands[i].getName(); i++) {
			if (!.strcmp(command, ModernizedCProgram.commands[i].getName())) {
				cmd_index = i;
				break;
			} 
		}
		if (cmd_index < 0) {
			.fprintf((_iob[2]), "%s: No such command `%s'\n", ModernizedCProgram.program, command);
			usage = 1;
			;
		} 
		if ((argc - 1) < ModernizedCProgram.commands[cmd_index].getMin()) {
			.fprintf((_iob[2]), "%s: Minimum of %d arguments for command `%s'\n  USAGE: %s %s %s\n", ModernizedCProgram.program, ModernizedCProgram.commands[cmd_index].getMin(), command, ModernizedCProgram.program, command, ModernizedCProgram.commands[cmd_index].getArgs());
			usage = 1;
			;
		} 
		if (ModernizedCProgram.commands[cmd_index].getMax() > 0 && (argc - 1) > ModernizedCProgram.commands[cmd_index].getMax()) {
			.fprintf((_iob[2]), "%s: Maxiumum of %d arguments for command `%s'\n  USAGE: %s %s %s\n", ModernizedCProgram.program, ModernizedCProgram.commands[cmd_index].getMax(), command, ModernizedCProgram.program, command, ModernizedCProgram.commands[cmd_index].getArgs());
			usage = 1;
			;
		} 
		if (help) {
			ModernizedCProgram.print_help_string();
			rc = 0;
			;
		} 
		rc = .UNRECOGNIZEDFUNCTIONNAME(fc, argc, /* Perform the API call */argv);
		if (rc) {
			.fprintf((_iob[2]), "%s: Command %s failed\n", ModernizedCProgram.program, argv[0]);
		} 
		if (fc) {
			ModernizedCProgram.flickcurl_free(fc);
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
			if (!.strcmp(argv[1], "-v")) {
				.fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
				.fputc((byte)'\n', (_iob[1]));
				ModernizedCProgram.flickcurl_cmdline_finish();
				.exit(0);
			} 
			if (!.strcmp(argv[1], "-h")) {
				help = 1;
			} else {
					.fprintf((_iob[2]), "%s: Invalid option `%s'\n", ModernizedCProgram.program, argv[1]);
					usage = 1;
			} 
			;
		} 
		if (argc < 2) {
			usage = /* Title and usage */2;
			;
		} 
		if (!.strcmp(argv[1], "manpage")) {
			mode = 0;
		}  else if (!.strcmp(argv[1], "extras")) {
			mode = 1;
		} else {
				.fprintf((_iob[2]), "%s: Invalid mode `%s'\n", ModernizedCProgram.program, argv[1]);
				usage = 1;
		} 
		if (help) {
			.printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
			.puts("Generate manpage for Flickcurl utility.");
			.printf("Usage: %s [OPTIONS] manual | extras\n\n", ModernizedCProgram.program);
			.fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
			.fputs("\nLicense: ", (_iob[1]));
			.puts(ModernizedCProgram.flickcurl_license_string);
			.fputs("Flickcurl home page: ", (_iob[1]));
			.puts(ModernizedCProgram.flickcurl_home_url_string);
			.fputs("\n", (_iob[1]));
			.puts("  -h  Print this help, then exit");
			.puts("  -v  Print the flickcurl version");
			rc = 0;
			;
		} 
		fc = ModernizedCProgram.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		if (mode == 0) {
			ModernizedCProgram.mangen_print_man_page((_iob[/* mode 0 : man page */1]));
		} else {
				ModernizedCProgram.mangen_print_extras((_iob[/* mode 1: extras */1]));
		} 
		ModernizedCProgram.flickcurl_finish();
		return (rc);
		flickcurl fc = ((Object)0);
		int rc = 0;
		int usage = 0;
		int help = 0;
		byte photo_id = ((Object)0);
		byte prefix_uri = "http://www.flickr.com/photos/";
		size_t prefix_uri_len = .strlen(prefix_uri);
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
			case (byte)'v':
					.fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					.fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					.exit(0);
			case (byte)'h':
					help = 1;
					break;
			case (byte)'D':
					ModernizedCProgram.debug = 1;
					break;
			case (byte)'o':
					if (ModernizedCProgram.optarg) {
						if (ModernizedCProgram.raptor_world_is_serializer_name(ModernizedCProgram.rworld, ModernizedCProgram.optarg)) {
							serializer_syntax_name = ModernizedCProgram.optarg;
						} else {
								int i;
								.fprintf((_iob[2]), "%s: invalid argument `%s' for `-o'\n", ModernizedCProgram.program, ModernizedCProgram.optarg);
								.fprintf((_iob[2]), "Valid arguments are:\n");
								for (i = 0; 1; i++) {
									raptor_syntax_description d = new raptor_syntax_description();
									d = ModernizedCProgram.raptor_world_get_serializer_description(ModernizedCProgram.rworld, i);
									if (!d) {
										break;
									} 
									.printf("  %-12s for %s\n", d.getNames()[0], d.getLabel());
								}
								usage = 1;
								break;
						} 
					} 
					break;
			case 0:
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = .atoi(ModernizedCProgram.optarg);
					} 
					break;
			}
		}
		argv += ModernizedCProgram.optind;
		argc -= ModernizedCProgram.optind;
		if (!help && argc < 1) {
			usage = /* Title and usage */2;
		} 
		if (!help && !argc) {
			.fprintf((_iob[2]), "%s: No photo URI given\n", ModernizedCProgram.program);
			usage = 1;
			;
		} 
		if (usage || help) {
			;
		} 
		photo_id = argv[0];
		if (.strncmp(photo_id, prefix_uri, prefix_uri_len)) {
			usage = 1;
		} else {
				size_t len = new size_t();
				photo_id += prefix_uri_len;
				len = .strlen(photo_id);
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
			.fprintf((_iob[2]), "%s: Argument is not a Flickr photo URI like\n  http://www.flickr.com/photos/USER/PHOTO/\n", ModernizedCProgram.program);
			;
		} 
		serializer = ModernizedCProgram.raptor_new_serializer(ModernizedCProgram.rworld, serializer_syntax_name);
		if (!serializer) {
			.fprintf((_iob[2]), "%s: Failed to create raptor serializer type %s\n", ModernizedCProgram.program, serializer_syntax_name);
			return (true);
		} 
		base_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)argv[0]);
		ModernizedCProgram.raptor_serializer_start_to_file_handle(serializer, base_uri, (_iob[1]));
		fc = ModernizedCProgram.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		ModernizedCProgram.flickcurl_set_error_handler(fc, my_message_handler, ((Object)0));
		if (!.access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (ModernizedCProgram.flickcurl_config_read_ini(fc, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		if (help) {
			int i;
			.printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
			.puts("Get Triples from Flickr photos.");
			.printf("Usage: %s [OPTIONS] FLICKR-PHOTO-URI\n\n", ModernizedCProgram.program);
			.fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
			.fputs("\nLicense: ", (_iob[1]));
			.puts(ModernizedCProgram.flickcurl_license_string);
			.fputs("Flickcurl home page: ", (_iob[1]));
			.puts(ModernizedCProgram.flickcurl_home_url_string);
			.fputs("\n", (_iob[1]));
			.puts("  -d  Set delay between requests in milliseconds");
			.puts("  -D  Print lots of output");
			.puts("  -h  Print this help, then exit");
			.puts("  -o  Set output format to one of:");
			for (i = 0; 1; i++) {
				raptor_syntax_description d = new raptor_syntax_description();
				d = ModernizedCProgram.raptor_world_get_serializer_description(ModernizedCProgram.rworld, i);
				if (!d) {
					break;
				} 
				if (!.strcmp(d.getNames()[0], serializer_syntax_name)) {
					.printf("      %-15s %s (default)\n", d.getNames()[0], d.getLabel());
				} else {
						.printf("      %-15s %s\n", d.getNames()[0], d.getLabel());
				} 
			}
			.puts("    via internal RDF serializer");
			.puts("  -v  Print the flickcurl version");
			rc = 0;
			;
		} 
		if (request_delay >= 0) {
			ModernizedCProgram.flickcurl_set_request_delay(fc, request_delay);
		} 
		fs = ModernizedCProgram.flickcurl_new_serializer(fc, serializer, ModernizedCProgram.flickrdf_serializer_factory);
		if (!fs) {
			.fprintf((_iob[2]), "%s: Failed to create Flickcurl serializer\n", ModernizedCProgram.program);
			;
		} 
		photo = ModernizedCProgram.flickcurl_photos_getInfo2(fc, photo_id, ((Object)0));
		if (!photo) {
			;
		} 
		if (ModernizedCProgram.debug) {
			.fprintf((_iob[2]), "%s: Photo with URI %s ID %s has %d tags\n", ModernizedCProgram.program, photo.getUri(), photo.getId(), photo.getTags_count());
		} 
		rc = ModernizedCProgram.flickcurl_serialize_photo(fs, photo);
		if (fs) {
			ModernizedCProgram.flickcurl_free_serializer(fs);
		} 
		if (fc) {
			ModernizedCProgram.flickcurl_free(fc);
		} 
		if (serializer) {
			ModernizedCProgram.raptor_free_serializer(serializer);
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
	 * comments.c - Flickcurl method comment functions
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
	 * flickcurl_free_comment:
	 * @comment_object: comment object
	 *
	 * Destructor for comment object
	 */
	public static void flickcurl_free_comment(Object comment_object) {
		do {
			if (!comment_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_comment is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\comments.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (comment_object.getId()) {
			.free(comment_object.getId());
		} 
		if (comment_object.getAuthor()) {
			.free(comment_object.getAuthor());
		} 
		if (comment_object.getAuthorname()) {
			.free(comment_object.getAuthorname());
		} 
		if (comment_object.getPermalink()) {
			.free(comment_object.getPermalink());
		} 
		if (comment_object.getText()) {
			.free(comment_object.getText());
		} 
		.free(comment_object/**
		 * flickcurl_free_comments:
		 * @comments_object: comment object array
		 *
		 * Destructor for array of comment object
		 */);
	}
	public static void flickcurl_free_comments(Object comments_object) {
		int i;
		do {
			if (!comments_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_comment_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\comments.c", 74, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; comments_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_comment(comments_object[i]);
		}
		.free(comments_object);
	}
	public static Object flickcurl_build_comments(Object fc, Object xpathCtx, Object xpathExpr, Object comment_count_p) {
		flickcurl_comment comments = ((Object)0);
		int nodes_count;
		int comment_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do comments */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		comments = (flickcurl_comment).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_comment comment_object = new flickcurl_comment();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			comment_object = (flickcurl_comment).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					comment_object.setId(attr_value);
				}  else if (!.strcmp(attr_name, "author")) {
					comment_object.setAuthor(attr_value);
				}  else if (!.strcmp(attr_name, "authorname")) {
					comment_object.setAuthorname(attr_value);
				}  else if (!.strcmp(attr_name, "datecreate")) {
					comment_object.setDatecreate(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "permalink")) {
					comment_object.setPermalink(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					comment_object.setText((byte).malloc(len + 1));
					.memcpy(comment_object.getText(), chnode.getContent(), len + 1);
					break;
				} 
			}
			comments[comment_count++] = comment_object/* for nodes */;
		}
		if (comment_count_p) {
			comment_count_p = comment_count;
		} 
		return comments;
	}
	public static int compare_strings(Object a, Object b) {
		return .strcmp(((byte)a), ((byte)b));
	}
	public static Object raptor_new_world() {
		return ((Object)/* -*- Mode: c; c-basic-offset: 2 -*-
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
		 */0);
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
		len = .strlen((byte)uri_string);
		u = (raptor_uri).malloc(len + 1);
		.memcpy(u, uri_string, len + 1);
		return u;
	}
	public static Object raptor_new_uri_from_uri_local_name(Object world, Object uri, Object local_name) {
		size_t len1 = new size_t();
		size_t len2 = new size_t();
		raptor_uri newu = new raptor_uri();
		if (!uri || !local_name) {
			return ((Object)0);
		} 
		len1 = .strlen((byte)uri);
		len2 = .strlen((byte)local_name);
		newu = (raptor_uri).malloc(len1 + len2 + 1);
		.memcpy(newu, uri, len1);
		.memcpy(newu + len1, local_name, len2 + 1);
		return newu;
	}
	public static Object raptor_new_uri_from_uri(Object uri) {
		return ModernizedCProgram.raptor_new_uri(((Object)0), (byte)uri);
	}
	public static void raptor_free_uri(Object u) {
		.free(u);
	}
	public static Object raptor_new_term_from_blank(Object world, Object blank) {
		raptor_term newt = new raptor_term();
		size_t blank_len = new size_t();
		if (!blank) {
			return ((Object)0);
		} 
		blank_len = .strlen((byte)blank);
		newt = (raptor_term).calloc(, 1);
		newt.setType(.RAPTOR_TERM_TYPE_BLANK);
		newt.getValue().getBlank().setString(.malloc(blank_len + 1));
		.memcpy(newt.getValue().getBlank().getString(), blank, blank_len + 1);
		return newt;
	}
	public static Object raptor_new_term_from_uri_string(Object world, Object uri_string) {
		raptor_term newt = new raptor_term();
		if (!uri_string) {
			return ((Object)0);
		} 
		newt = (raptor_term).calloc(, 1);
		newt.setType(.RAPTOR_TERM_TYPE_URI);
		newt.getValue().setUri(ModernizedCProgram.raptor_new_uri(world, uri_string));
		return newt;
	}
	public static Object raptor_new_term_from_uri(Object world, Object uri) {
		return ModernizedCProgram.raptor_new_term_from_uri_string(world, (byte)uri);
	}
	public static Object raptor_new_term_from_literal(Object world, Object literal, Object datatype, Object language) {
		raptor_term newt = new raptor_term();
		size_t literal_len = new size_t();
		if (!literal) {
			return ((Object)0);
		} 
		literal_len = .strlen((byte)literal);
		newt = (raptor_term).calloc(, 1);
		newt.setType(.RAPTOR_TERM_TYPE_LITERAL);
		newt.getValue().getLiteral().setString((byte).malloc(literal_len + 1));
		.memcpy(newt.getValue().getLiteral().getString(), literal, literal_len + 1);
		if (datatype) {
			newt.getValue().getLiteral().setDatatype(ModernizedCProgram.raptor_new_uri_from_uri(datatype));
		} 
		return newt;
	}
	public static void raptor_free_term(Object term) {
		if (term.getType() == .RAPTOR_TERM_TYPE_URI) {
			ModernizedCProgram.raptor_free_uri(term.getValue().getUri());
		} 
		if (term.getType() == .RAPTOR_TERM_TYPE_BLANK) {
			.free(term.getValue().getBlank().getString());
		} 
		if (term.getType() == .RAPTOR_TERM_TYPE_LITERAL) {
			if (term.getValue().getLiteral().getDatatype()) {
				ModernizedCProgram.raptor_free_uri(term.getValue().getLiteral().getDatatype());
			} 
			.free(term.getValue().getLiteral().getString());
		} 
	}
	public static int raptor_world_is_serializer_name(Object world, Object name) {
		int i;
		for (i = 0; i < 2; i++) {
			if (.strcmp(ModernizedCProgram.serializers[i].getNames()[0], name)) {
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
	public static Object raptor_new_serializer(Object world, Object serializer_name) {
		raptor_serializer s = new raptor_serializer();
		s = (raptor_serializer).calloc(, 1);
		s.setOutput_turtle(!.strcmp((byte)serializer_name, "turtle"));
		return s;
	}
	public static void raptor_free_serializer(Object s) {
		.free(s);
	}
	public static void raptor_serializer_set_namespace(Object serializer, Object uri, Object prefix) {
		FILE fh = serializer.getFh();
		if (serializer.getOutput_turtle()) {
			.fprintf(fh, "@prefix %s: <%s> .\n", (byte)prefix, (byte)uri);
		} 
	}
	public static void raptor_serializer_start_to_file_handle(Object serializer, Object base_uri, Object fh) {
		serializer.setFh(fh);
		if (base_uri && serializer.getOutput_turtle()) {
			.fprintf(fh, "@base <%s>\n", (byte)base_uri);
		} 
	}
	public static void raptor_serializer_serialize_statement(Object serializer, Object s) {
		FILE fh = serializer.getFh();
		if (s.getSubject().getType() == .RAPTOR_TERM_TYPE_URI) {
			.fprintf(fh, "<%s>", (byte)s.getSubject().getValue().getUri());
		} else {
				.fprintf(fh, "_:%s", (byte)s.getSubject().getValue().getBlank().getString());
		} 
		.fprintf(fh, " <%s> ", (byte)s.getPredicate().getValue().getUri());
		if (s.getObject().getType() == .RAPTOR_TERM_TYPE_LITERAL) {
			byte p;
			byte c;
			.fputc((byte)'"', fh);
			for (p = (byte)s.getObject().getValue().getLiteral().getString(); (c = p); p++) {
				if (c == (byte)'\n') {
					.fputs("\\\n", fh);
					continue;
				}  else if (c == (byte)'\t') {
					.fputs("\\\t", fh);
					continue;
				} 
				if (c == (byte)'\r') {
					.fputs("\\\r", fh);
					continue;
				}  else if (c == (byte)'"' || c == (byte)'\\') {
					.fputc((byte)'\\', fh);
				} 
				.fputc(c, fh);
			}
			.fputc((byte)'"', fh);
			if (s.getObject().getValue().getLiteral().getDatatype()) {
				.fputs("^^<", fh);
				.fputs((byte)s.getObject().getValue().getLiteral().getDatatype(), fh);
				.fputc((byte)'>', fh);
			} 
		}  else if (s.getObject().getType() == .RAPTOR_TERM_TYPE_URI) {
			.fprintf(fh, "<%s>", (byte)s.getObject().getValue().getUri());
		} else {
				.fprintf(fh, "_:%s", (byte)s.getObject().getValue().getBlank().getString());
		} 
		.fputs(" . \n", fh);
	}
	public static void raptor_serializer_serialize_end(Object serializer) {
		.fflush(serializer.getFh());
	}
	public static void raptor_statement_init(Object statement, Object world) {
		.memset(statement, (byte)'\0', );
		return ;
	}
	public static void raptor_statement_clear(Object statement) {
		ModernizedCProgram.raptor_free_term(statement.getSubject());
		ModernizedCProgram.raptor_free_term(statement.getPredicate());
		ModernizedCProgram.raptor_free_term(statement.getObject());
	}
	public static void flickcurl_serializer_init() {
		int i;
		for (i = 0; ModernizedCProgram.namespace_table[i].getPrefix() != ((Object)0); i++) {
			ModernizedCProgram.namespace_table[i].setUri_len(.strlen(ModernizedCProgram.namespace_table[i].getUri()));
			ModernizedCProgram.namespace_table[i].setPrefix_len(.strlen(ModernizedCProgram.namespace_table[i].getPrefix()));
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
	public static Object flickcurl_new_serializer(Object fc, Object data, Object factory) {
		flickcurl_serializer serializer = new flickcurl_serializer();
		if (!factory || (factory && factory.getVersion() != 1)) {
			return ((Object)0);
		} 
		serializer = (flickcurl_serializer).malloc();
		if (!serializer) {
			return ((Object)0);
		} 
		serializer.setFc(fc);
		serializer.setData(data);
		serializer.setFactory(factory);
		return serializer/**
		 * flickcurl_free_serializer:
		 * @serializer: serializer object
		 *
		 * Destructor for triples serializer object
		 */;
	}
	public static void flickcurl_free_serializer(Object serializer) {
		do {
			if (!serializer) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_serializer is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\serializer.c", 211, __func__);
				return ;
			} 
		} while (0);
		.free(serializer);
	}
	public static Object nspace_add_new(Object list, Object prefix, Object uri) {
		flickrdf_nspace ns = new flickrdf_nspace();
		ns = (flickrdf_nspace).malloc();
		ns.setPrefix_len(.strlen(prefix));
		ns.setUri_len(.strlen(uri));
		ns.setPrefix((byte).malloc(ns.getPrefix_len() + 1));
		.memcpy(ns.getPrefix(), prefix, ns.getPrefix_len() + 1);
		ns.setUri((byte).malloc(ns.getUri_len() + 1));
		.memcpy(ns.getUri(), uri, ns.getUri_len() + 1);
		ns.setNext(list);
		return ns;
	}
	public static Object nspace_add_if_not_declared(Object list, Object prefix, Object nspace_uri) {
		int n;
		flickrdf_nspace ns = new flickrdf_nspace();
		size_t prefix_len = prefix ? .strlen(prefix) : 0;
		size_t uri_len = nspace_uri ? .strlen(nspace_uri) : 0;
		for (ns = list; ns; ns = ns.getNext()) {
			if (nspace_uri && ns.getUri_len() == uri_len && !.strcmp(ns.getUri(), nspace_uri)) {
				break;
			} 
			if (prefix && ns.getPrefix_len() == prefix_len && !.strcmp(ns.getPrefix(), prefix)) {
				break;
			} 
		}
		if (ns) {
			return list;
		} 
		ns = ((Object)0);
		for (n = 0; ModernizedCProgram.namespace_table[n].getUri(); n++) {
			if (prefix && ModernizedCProgram.namespace_table[n].getPrefix_len() == prefix_len && !.strcmp(ModernizedCProgram.namespace_table[n].getPrefix(), prefix)) {
				ns = ModernizedCProgram.namespace_table[n];
				break;
			} 
			if (nspace_uri && ModernizedCProgram.namespace_table[n].getUri_len() == uri_len && !.strcmp(ModernizedCProgram.namespace_table[n].getUri(), nspace_uri)) {
				ns = ModernizedCProgram.namespace_table[n];
				break;
			} 
		}
		if (!ns) {
			return list;
		} 
		return ModernizedCProgram.nspace_add_new(list, ns.getPrefix(), ns.getUri());
	}
	public static Object nspace_get_by_prefix(Object list, Object prefix) {
		flickrdf_nspace ns = new flickrdf_nspace();
		size_t prefix_len = .strlen(prefix);
		for (ns = list; ns; ns = ns.getNext()) {
			if (ns.getPrefix_len() == prefix_len && !.strcmp(ns.getPrefix(), prefix)) {
				break;
			} 
		}
		return ns;
	}
	public static void free_nspaces(Object list) {
		flickrdf_nspace next = new flickrdf_nspace();
		for (; list; list = next) {
			next = list.getNext();
			if (list.getPrefix()) {
				.free(list.getPrefix());
			} 
			.free(list.getUri());
			.free(list/**
			 * flickcurl_serialize_photo:
			 * @fcs: flickcurl serializer object
			 * @photo: photo object
			 *
			 * Serialize photo description to RDF triples
			 *
			 * Return value: non-0 on failure
			 */);
		}
	}
	public static int flickcurl_serialize_photo(Object fcs, Object photo) {
		int i;
		int need_person = 0;
		int need_foaf = 0;
		int need_rdfs = 0;
		flickrdf_nspace nspaces = ((Object)0);
		flickrdf_nspace ns = new flickrdf_nspace();
		flickcurl_serializer_factory fsf = fcs.getFactory();
		flickcurl fc = fcs.getFc();
		flickcurl_size sizes = ((Object)0);
		if (!photo) {
			return 1;
		} 
		nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, ((Object)0), /* Always add XSD, RDF and Flickr namespaces */"http://www.w3.org/2001/XMLSchema#");
		nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, "rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
		nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, "flickr", "http://machinetags.org/ns/Flickr#");
		if (photo.getPlace()) {
			nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, "places", "http://machinetags.org/ns/Places#");
		} 
		sizes = ModernizedCProgram.flickcurl_photos_getSizes(fc, photo.getId());
		if (sizes) {
			need_foaf = 1;
			need_rdfs = 1;
		} 
		for (i = .PHOTO_FIELD_FIRST; i <= .PHOTO_FIELD_LAST; /* mark namespaces used in fields */i++) {
			flickcurl_photo_field_type field = (flickcurl_photo_field_type)i;
			flickcurl_field_value_type datatype = photo.getFields()[field].getType();
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
				nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, ((Object)0), field_table[f].getNspace_uri());
				break;
			}
		}
		for (i = 0; i < photo.getTags_count(); /* in tags look for xmlns:PREFIX = "URI" otherwise look for PREFIX: */i++) {
			byte prefix;
			byte p;
			flickcurl_tag tag = photo.getTags()[i];
			if (!.strncmp(tag.getRaw(), "xmlns:", 6)) {
				prefix = tag.getRaw()[6];
				for (p = prefix; p && p != (byte)'='; p++) {
					;
				}
				if (!/* "xmlns:PREFIX" seen */p) {
					continue;
				} 
				p = /* "xmlns:PREFIX = " seen */(byte)'\0';
				nspaces = ModernizedCProgram.nspace_add_new(nspaces, prefix, p + 1);
				p = (byte)'=';
				continue;
			} 
			prefix = tag.getRaw();
			for (p = prefix; p && p != (byte)':'; p++) {
				;
			}
			if (!/* "PREFIX:" seen */p) {
				continue;
			} 
			p = (byte)'\0';
			nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, prefix, ((Object)0));
			p = (byte)':';
		}
		if (need_person) {
			need_foaf = 1;
			nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, "dc", "http://purl.org/dc/terms/");
		} 
		if (need_foaf) {
			nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, "foaf", "http://xmlns.com/foaf/0.1/");
		} 
		if (need_rdfs) {
			nspaces = ModernizedCProgram.nspace_add_if_not_declared(nspaces, "rdfs", "http://www.w3.org/2000/01/rdf-schema#");
		} 
		for (ns = nspaces; ns; ns = ns.getNext()) {
			.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), ns.getPrefix(), ns.getPrefix_len(), ns.getUri(), ns.getUri_len());
		}
		if (need_person) {
			.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), photo.getUri(), .FLICKCURL_TERM_TYPE_RESOURCE, "http://purl.org/dc/terms/", "creator", "person", .FLICKCURL_TERM_TYPE_BLANK, ((Object)0));
			.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), "person", .FLICKCURL_TERM_TYPE_BLANK, "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "type", "http://xmlns.com/foaf/0.1/Person", .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
			.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), "person", .FLICKCURL_TERM_TYPE_BLANK, "http://xmlns.com/foaf/0.1/", "maker", photo.getUri(), .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
		} 
		for (i = .PHOTO_FIELD_FIRST; i <= .PHOTO_FIELD_LAST; /* generate triples from fields */i++) {
			flickcurl_photo_field_type field = (flickcurl_photo_field_type)i;
			flickcurl_field_value_type datatype = photo.getFields()[field].getType();
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
				object = photo.getFields()[field].getString();
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
					license = ModernizedCProgram.flickcurl_photos_licenses_getInfo_by_id(fc, photo.getFields()[field].getInteger());
					if (!license) {
						if (new_object) {
							.free(new_object);
						} 
						continue;
					} 
					if (license.getUrl()) {
						datatype = .VALUE_TYPE_URI;
						object = license.getUrl();
					} else {
							datatype = .VALUE_TYPE_STRING;
							object = license.getName();
					} 
				} 
				switch (datatype) {
				case .VALUE_TYPE_BOOLEAN:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#boolean";
						break;
				case /* these value can never been seen; code above never sets it */.VALUE_TYPE_NONE:
				case .VALUE_TYPE_PHOTO_ID:
				case .VALUE_TYPE_MEDIA_TYPE:
				case .VALUE_TYPE_TAG_STRING:
				case .VALUE_TYPE_COLLECTION_ID:
				case .VALUE_TYPE_STRING:
						break;
				case .VALUE_TYPE_ICON_PHOTOS:
				case .VALUE_TYPE_DATETIME:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#dateTime";
						break;
				case .VALUE_TYPE_PHOTO_URI:
				case .VALUE_TYPE_PERSON_ID:
				case .VALUE_TYPE_UNIXTIME:
				case .VALUE_TYPE_URI:
						type = .FLICKCURL_TERM_TYPE_RESOURCE;
						break;
				case .VALUE_TYPE_FLOAT:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#double";
						break;
				case .VALUE_TYPE_INTEGER:
						datatype_uri = "http://www.w3.org/2001/XMLSchema#integer";
						break;
				default:
						break;
				}
				if (field_table[f].getFlags() & 1) {
					.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), "person", .FLICKCURL_TERM_TYPE_BLANK, field_table[f].getNspace_uri(), field_table[f].getName(), object, type, datatype_uri);
				} else {
						.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), photo.getUri(), .FLICKCURL_TERM_TYPE_RESOURCE, field_table[f].getNspace_uri(), field_table[f].getName(), object, type, datatype_uri);
				} 
				if (new_object) {
					.free(new_object);
				} 
				break;
			}
		}
		for (i = 0; i < photo.getTags_count(); /* generate triples from tags */i++) {
			flickcurl_tag tag = photo.getTags()[i];
			byte prefix;
			byte p;
			byte f;
			byte v;
			size_t value_len = new size_t();
			prefix = tag.getRaw()[0];
			if (!.strncmp(prefix, "xmlns:", 6)) {
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
			value_len = .strlen(v);
			if (v == (byte)'"') {
				v++;
				if (v[value_len - 1] == (byte)'"') {
					v[--value_len] = (byte)'\0';
				} 
			} 
			ns = ModernizedCProgram.nspace_get_by_prefix(nspaces, prefix);
			if (!ns) {
				continue;
			} 
			.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), photo.getUri(), .FLICKCURL_TERM_TYPE_RESOURCE, ns.getUri(), f, v, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
		}
		if (photo.getPlace()) {
			byte[] place_bnode = new byte[]{(byte)'p', (byte)'l', (byte)'a', (byte)'c', (byte)'e', (byte)'X', (byte)'\0'};
			flickcurl_place place = photo.getPlace();
			for (i = (int)0; i <= (int).FLICKCURL_PLACE_LAST; i++) {
				byte name = place.getNames()[i];
				byte id = place.getIds()[i];
				byte url = place.getUrls()[i];
				byte woe_id = place.getWoe_ids()[i];
				if (!name && !id && !url && !woe_id) {
					continue;
				} 
				place_bnode[5] = (byte)'0' + i;
				.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), photo.getUri(), .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Places#", "place", place_bnode, .FLICKCURL_TERM_TYPE_BLANK, ((Object)0));
				.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "type", "http://machinetags.org/ns/Places#Place", .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "type", ModernizedCProgram.flickcurl_get_place_type_label((flickcurl_place_type)i), .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				if (name) {
					.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "name", name, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				if (id) {
					.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "id", id, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				if (woe_id) {
					.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "placeid", woe_id, .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				if (url) {
					.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), place_bnode, .FLICKCURL_TERM_TYPE_BLANK, "http://machinetags.org/ns/Places#", "url", url, .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				} 
			}
		} 
		if (/* generate triples from sizes */sizes) {
			for (i = 0; sizes[i]; i++) {
				flickcurl_size size = sizes[i];
				byte[] buf = new byte[10];
				int is_photo;
				byte sizePredicate;
				byte sizeClass;
				is_photo = (!.strcmp(size.getMedia(), "photo"));
				sizePredicate = is_photo ? "photo" : "video";
				sizeClass = is_photo ? "http://xmlns.com/foaf/0.1/Image" : "http://machinetags.org/ns/Flickr#Video";
				.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), photo.getUri(), .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Flickr#", sizePredicate, size.getSource(), .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), size.getSource(), .FLICKCURL_TERM_TYPE_RESOURCE, "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "type", sizeClass, .FLICKCURL_TERM_TYPE_RESOURCE, ((Object)0));
				if (size.getLabel()) {
					.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), size.getSource(), .FLICKCURL_TERM_TYPE_RESOURCE, "http://www.w3.org/2000/01/rdf-schema#", "label", size.getLabel(), .FLICKCURL_TERM_TYPE_LITERAL, ((Object)0));
				} 
				.sprintf(buf, "%d", size.getWidth());
				.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), size.getSource(), .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Flickr#", "width", buf, .FLICKCURL_TERM_TYPE_LITERAL, "http://www.w3.org/2001/XMLSchema#integer");
				.sprintf(buf, "%d", size.getHeight());
				.UNRECOGNIZEDFUNCTIONNAME(fcs.getData(), size.getSource(), .FLICKCURL_TERM_TYPE_RESOURCE, "http://machinetags.org/ns/Flickr#", "height", buf, .FLICKCURL_TERM_TYPE_LITERAL, "http://www.w3.org/2001/XMLSchema#integer");
			}
			ModernizedCProgram.flickcurl_free_sizes(sizes);
		} 
		if (nspaces) {
			ModernizedCProgram.free_nspaces(nspaces);
		} 
		if (fsf.getEmit_finish()) {
			.UNRECOGNIZEDFUNCTIONNAME(fcs.getData());
		} 
		return 0;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * favorites-api.c - Flickr flickr.favorites.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_favorites_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add to the user's favorites.
	 * 
	 * Adds a photo to a user's favorites list.
	 *
	 * Implements flickr.favorites.add (1.0)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_favorites_add(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.favorites.add")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		return fc.getFailed();
	}
	public static Object flickcurl_favorites_getContext(Object fc, Object photo_id, Object user_id, int num_prev, int num_next, Object extras) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photos_list photos_lists = ((Object)0);
		byte[] num_prev_str = new byte[10];
		byte[] num_next_str = new byte[10];
		int i;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id || !user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		if (num_prev >= 0) {
			.sprintf(num_prev_str, "%d", num_prev);
			ModernizedCProgram.flickcurl_add_param(fc, "num_prev", num_prev_str);
		} 
		if (num_next >= 0) {
			.sprintf(num_next_str, "%d", num_next);
			ModernizedCProgram.flickcurl_add_param(fc, "num_next", num_next_str/* this is the only standard photos response parameter supported 
			   * so using flickcurl_append_photos_list_params() is not really needed
			   */);
		} 
		if (extras) {
			ModernizedCProgram.flickcurl_add_param(fc, "extras", extras);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.favorites.getContext")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		photos_lists = (flickcurl_photos_list).calloc(, /* 3 lists of photo lists: prev, next and NULL to end the list */3);
		for (i = 0; i < 2; /* Decode the prev and next into photo lists */i++) {
			 xpathExpr = (i == 0) ? ()"/rsp/prevphoto" : ()"/rsp/nextphoto";
			flickcurl_photos_list photos_list = new flickcurl_photos_list();
			 xpathObj = ((Object)0);
			xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
			if (!xpathObj) {
				ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
				fc.setFailed(1);
				;
			} 
			if (!xpathObj.getNodesetval() || !xpathObj.getNodesetval().getNodeTab()) {
				.xmlXPathFreeObject(/* No elements found in content - probably not a failure */xpathObj);
				continue;
			} 
			photos_list = ModernizedCProgram.flickcurl_new_photos_list(fc);
			if (!photos_list) {
				fc.setFailed(1);
				;
			} 
			photos_list.setPage(-1);
			photos_list.setPer_page(-1);
			photos_list.setTotal_count(-1);
			photos_list.setPhotos(ModernizedCProgram.flickcurl_build_photos(fc, xpathCtx, xpathExpr, photos_list.getPhotos_count()));
			.xmlXPathFreeObject(xpathObj);
			photos_lists[i] = photos_list;
		}
		photos_lists[2] = ((Object)0);
		if (fc.getFailed()) {
			if (photos_lists) {
				.free(photos_lists);
			} 
			photos_lists = ((Object)0);
		} 
		return photos_lists/**
		 * flickcurl_favorites_getList_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch the favorites list for. If this argument is omitted, the favorites list for the calling user is returned. (or NULL)
		 * @min_fave_date: Minimum date that a photo was favorited on. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_fave_date: Maximum date that a photo was favorited on. The date should be in the form of a unix timestamp. (or NULL)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of the user's favorite photos.
		 *
		 * Flickcurl 1.6: Added @list_params beyond flickcurl_favorites_getList()
		 * to allow returning raw content if @list_params is present and
		 * field @format is not NULL as announced 2008-08-25
		 * http://code.flickr.com/blog/2008/08/25/api-responses-as-feeds/
		 *
		 * Only photos which the calling user has permission to see are returned.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Parameters @min_fave_date and @max_fave_date were added some time
		 * after 2008.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_favorites_getList2_params(Object fc, Object user_id, Object min_fave_date, Object max_fave_date, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (/* API parameters */user_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		} 
		if (min_fave_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "min_fave_date", min_fave_date);
		} 
		if (max_fave_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "max_fave_date", max_fave_date);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.favorites.getList")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_favorites_getList2(Object fc, Object user_id, Object min_fave_date, Object max_fave_date, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_favorites_getList_params(Object fc, Object user_id, Object list_params) {
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
	public static Object flickcurl_favorites_getList(Object fc, Object user_id, Object extras, int per_page, int page) {
		return ModernizedCProgram.flickcurl_favorites_getList2(fc, user_id, ((Object)/* min_fave_date */0), ((Object)/* max_fave_date */0), extras, per_page, page/**
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
	public static Object flickcurl_favorites_getPublicList_params(Object fc, Object user_id, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", /* API parameters */user_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.favorites.getPublicList")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_favorites_getPublicList(Object fc, Object user_id, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static int flickcurl_favorites_remove(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.favorites.remove")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		return fc.getFailed();
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * auth-api.c - Flickr flickr.auth.* API calls
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
	 * flickcurl_auth_checkToken:
	 * @fc: flickcurl context
	 * @token: token string
	 * 
	 * Get the credentials attached to an authentication token.
	 *
	 * Implements flickr.auth.checkToken (0.9)
	 * Must be signed.
	 * 
	 * FIXME: Cannot confirm this works, get intermittent results.
	 *
	 * Return value: permissions string or NULL on failure
	 **/
	public static Object flickcurl_auth_checkToken(Object fc, Object token) {
		byte perms = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!token) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "auth_token", (byte)token);
		ModernizedCProgram.flickcurl_end_params(fc);
		ModernizedCProgram.flickcurl_set_sign(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.auth.checkToken")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			perms = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/auth/perms");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public static Object flickcurl_auth_getFrob(Object fc) {
		byte frob = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		ModernizedCProgram.flickcurl_set_sign(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.auth.getFrob")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			frob = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/frob");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public static Object flickcurl_auth_getFullToken(Object fc, Object frob) {
		byte auth_token = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "mini_token", (byte)frob);
		ModernizedCProgram.flickcurl_end_params(fc);
		ModernizedCProgram.flickcurl_set_sign(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.auth.getFullToken")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			auth_token = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/auth/token");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public static Object flickcurl_auth_getToken(Object fc, Object frob) {
		byte auth_token = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "frob", (byte)frob);
		ModernizedCProgram.flickcurl_end_params(fc);
		ModernizedCProgram.flickcurl_set_sign(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.auth.getToken")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			auth_token = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/auth/token");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public static int flickcurl_auth_oauth_getAccessToken(Object fc) {
		flickcurl_oauth_data od = fc.getOd();
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int rc = 0;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		ModernizedCProgram.flickcurl_set_sign(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.auth.oauth.getAccessToken")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		if (xpathCtx) {
			byte auth_token;
			byte auth_token_secret;
			auth_token = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/auth/access_token[@oauth_token]");
			auth_token_secret = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/auth/access_token[@oauth_token_secret]");
			od.setClient_secret(fc.getSecret());
			fc.setSecret(((Object)0));
			if (fc.getAuth_token()) {
				.free(fc.getAuth_token());
				fc.setAuth_token(((Object)0));
			} 
			od.setToken(/* Store OAuth token and token secret in the oauth structure */auth_token);
			od.setToken_len(.strlen(auth_token));
			od.setToken_secret(auth_token_secret);
			od.setToken_secret_len(.strlen(auth_token_secret));
			.xmlXPathFreeContext(xpathCtx);
			xpathCtx = ((Object)0);
		} 
		return rc;
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
	public static void flickcurl_free_blog(Object blog) {
		do {
			if (!blog) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 40, __func__);
				return ;
			} 
		} while (0);
		if (blog.getId()) {
			.free(blog.getId());
		} 
		if (blog.getName()) {
			.free(blog.getName());
		} 
		.free(blog/**
		 * flickcurl_free_blogs:
		 * @blogs_object: blog object array
		 *
		 * Destructor for array of blog objects
		 */);
	}
	public static void flickcurl_free_blogs(Object blogs_object) {
		int i;
		do {
			if (!blogs_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 63, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; blogs_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_blog(blogs_object[i]);
		}
		.free(blogs_object);
	}
	public static Object flickcurl_build_blogs(Object fc, Object xpathCtx, Object xpathExpr, Object blog_count_p) {
		flickcurl_blog blogs = ((Object)0);
		int nodes_count;
		int blog_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		blogs = (flickcurl_blog).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_blog b = new flickcurl_blog();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			b = (flickcurl_blog).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					b.setId(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					b.setName(attr_value);
				}  else if (!.strcmp(attr_name, "needspassword")) {
					b.setNeeds_password(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					b.setUrl(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			blogs[blog_count++] = b/* for nodes */;
		}
		if (blog_count_p) {
			blog_count_p = blog_count;
		} 
		return blogs;
	}
	public static void flickcurl_free_blog_service(Object blog_service) {
		do {
			if (!blog_service) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog_service is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 154, __func__);
				return ;
			} 
		} while (0);
		if (blog_service.getId()) {
			.free(blog_service.getId());
		} 
		if (blog_service.getName()) {
			.free(blog_service.getName());
		} 
		.free(blog_service/**
		 * flickcurl_free_blog_services:
		 * @blog_services_object: blog services object array
		 *
		 * Destructor for array of blog services objects
		 */);
	}
	public static void flickcurl_free_blog_services(Object blog_services_object) {
		int i;
		do {
			if (!blog_services_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_blog_service_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\blog.c", 177, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; blog_services_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_blog_service(blog_services_object[i]);
		}
		.free(blog_services_object);
	}
	public static Object flickcurl_build_blog_services(Object fc, Object xpathCtx, Object xpathExpr, Object blog_services_count_p) {
		flickcurl_blog_service blog_services = ((Object)0);
		int nodes_count;
		int blog_services_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		blog_services = (flickcurl_blog_service).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_blog_service b = new flickcurl_blog_service();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			b = (flickcurl_blog_service).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					b.setId(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					b.setName((byte).malloc(len + 1));
					.memcpy(b.getName(), chnode.getContent(), len + 1);
				} 
			}
			blog_services[blog_services_count++] = b/* for nodes */;
		}
		if (blog_services_count_p) {
			blog_services_count_p = blog_services_count;
		} 
		return blog_services;
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
	public static void flickcurl_free_person(Object person) {
		int i;
		do {
			if (!person) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_person is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\person.c", 94, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; i <= .PERSON_FIELD_LAST; i++) {
			if (person.getFields()[i].getString()) {
				.free(person.getFields()[i].getString());
			} 
		}
		if (person.getNsid()) {
			.free(person.getNsid());
		} 
		.free(person/*
		 * The XPaths here are relative, such as prefixed by /rsp/person
		 */);
	}
	public static Object flickcurl_build_persons(Object fc, Object xpathCtx, Object xpathExpr, Object person_count_p) {
		flickcurl_person persons = ((Object)0);
		int nodes_count;
		int person_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		[] full_xpath = new ();
		size_t xpathExpr_len = new size_t();
		int i;
		xpathExpr_len = .strlen((byte)xpathExpr);
		.memcpy(full_xpath, xpathExpr, xpathExpr_len + 1);
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		persons = (flickcurl_person).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			flickcurl_person person = ((Object)0);
			int expri;
			 xpathNodeCtx = ((Object)0);
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			person = (flickcurl_person).calloc(, 1);
			xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
			xpathNodeCtx.setNode(node);
			for (expri = 0; expri <= .PERSON_FIELD_LAST; expri++) {
				if (person.getFields()[expri].getString()) {
					.free(person.getFields()[expri].getString());
				} 
				person.getFields()[expri].setString(((Object)0));
				person.getFields()[expri].setInteger((flickcurl_person_field_type)-1);
				person.getFields()[expri].setType(.VALUE_TYPE_NONE);
			}
			for (expri = 0; person_fields_table[expri].getXpath(); expri++) {
				flickcurl_person_field_type field = person_fields_table[expri].getField();
				flickcurl_field_value_type datatype = person_fields_table[expri].getType();
				byte string_value;
				int int_value = -1;
				time_t unix_time = new time_t();
				string_value = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathNodeCtx, person_fields_table[expri].getXpath());
				if (!string_value) {
					continue;
				} 
				switch (datatype) {
				case .VALUE_TYPE_FLOAT:
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
				case .VALUE_TYPE_TAG_STRING:
				case .VALUE_TYPE_PHOTO_ID:
				case .VALUE_TYPE_UNIXTIME:
				case .VALUE_TYPE_NONE:
				case .VALUE_TYPE_MEDIA_TYPE:
				case .VALUE_TYPE_BOOLEAN:
						int_value = .atoi(string_value);
						break;
				case .VALUE_TYPE_ICON_PHOTOS:
						.abort();
				case .VALUE_TYPE_PERSON_ID:
						person.setNsid(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_INTEGER:
				case .VALUE_TYPE_URI:
						break;
				case .VALUE_TYPE_COLLECTION_ID:
				case .VALUE_TYPE_STRING:
				case .VALUE_TYPE_PHOTO_URI:
				}
				person.getFields()[field].setString(string_value);
				person.getFields()[field].setInteger((flickcurl_person_field_type)int_value);
				person.getFields()[field].setType(datatype);
				if (fc.getFailed()) {
					break;
				} 
			}
			if (fc.getFailed()) {
				if (person) {
					ModernizedCProgram.flickcurl_free_person(person);
				} 
			} else {
					persons[person_count++] = person;
			} 
			.xmlXPathFreeContext(xpathNodeCtx);
			if (fc.getFailed()) {
				;
			} 
		}
		if (/* for persons */person_count_p) {
			person_count_p = person_count;
		} 
		if (fc.getFailed()) {
			if (persons) {
				ModernizedCProgram.flickcurl_free_persons(persons);
			} 
			persons = ((Object)0);
		} 
		return persons;
	}
	public static Object flickcurl_build_person(Object fc, Object xpathCtx, Object root_xpathExpr) {
		flickcurl_person persons = new flickcurl_person();
		flickcurl_person result = ((Object)0);
		persons = ModernizedCProgram.flickcurl_build_persons(fc, xpathCtx, root_xpathExpr, ((Object)0));
		if (persons) {
			result = persons[0];
			.free(persons);
		} 
		return result/**
		 * flickcurl_free_persons:
		 * @persons: person object array
		 *
		 * Destructor for array of person object
		 */;
	}
	public static void flickcurl_free_persons(Object persons) {
		int i;
		do {
			if (!persons) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_person_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\person.c", 423, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; persons[i]; i++) {
			ModernizedCProgram.flickcurl_free_person(persons[i]);
		}
		.free(persons);
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
	public static void flickcurl_free_user_upload_status(Object u) {
		do {
			if (!u) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_user_upload_status is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\user_upload_status.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (u.getUsername()) {
			.free(u.getUsername());
		} 
		if (u.getSets_remaining()) {
			.free(u.getSets_remaining());
		} 
		.free(u);
	}
	public static Object flickcurl_build_user_upload_status(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_user_upload_status u = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do user_upload_status */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		u = (flickcurl_user_upload_status).calloc(, 1);
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			byte node_name = (byte)node.getName();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			if (!.strcmp(node_name, "username")) {
				 chnode = new ();
				for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
					size_t len = .strlen((byte)chnode.getContent());
					if (chnode.getType() != XML_TEXT_NODE) {
						continue;
					} 
					u.setUsername((byte).malloc(len + 1));
					.memcpy(u.getUsername(), chnode.getContent(), len + 1);
					break;
				}
			}  else if (!.strcmp(node_name, "bandwidth")) {
				for (attr = node.getProperties(); attr; attr = attr.getNext()) {
					byte attr_name = (byte)attr.getName();
					int attr_value = .atoi((byte)attr.getChildren().getContent());
					if (!.strcmp(attr_name, "maxbytes")) {
						u.setBandwidth_maxbytes(attr_value);
					}  else if (!.strcmp(attr_name, "maxkb")) {
						u.setBandwidth_maxkb(attr_value);
					}  else if (!.strcmp(attr_name, "usedbytes")) {
						u.setBandwidth_usedbytes(attr_value);
					}  else if (!.strcmp(attr_name, "usedkb")) {
						u.setBandwidth_usedkb(attr_value);
					}  else if (!.strcmp(attr_name, "remainingbytes")) {
						u.setBandwidth_remainingbytes(attr_value);
					}  else if (!.strcmp(attr_name, "remainingkb")) {
						u.setBandwidth_remainingkb(attr_value);
					} 
				}
			}  else if (!.strcmp(node_name, "filesize")) {
				for (attr = node.getProperties(); attr; attr = attr.getNext()) {
					byte attr_name = (byte)attr.getName();
					int attr_value = .atoi((byte)attr.getChildren().getContent());
					if (!.strcmp(attr_name, "maxbytes")) {
						u.setFilesize_maxbytes(attr_value);
					}  else if (!.strcmp(attr_name, "maxkb")) {
						u.setFilesize_maxkb(attr_value);
					} 
				}
			}  else if (!.strcmp(node_name, "sets")) {
				for (attr = node.getProperties(); attr; attr = attr.getNext()) {
					size_t attr_len = .strlen((byte)attr.getChildren().getContent());
					byte attr_name = (byte)attr.getName();
					byte attr_value;
					attr_value = (byte).malloc(attr_len + 1);
					.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
					if (!.strcmp(attr_name, "created")) {
						u.setSets_created(.atoi(attr_value));
						.free(attr_value);
					}  else if (!.strcmp(attr_name, "remaining")) {
						u.setSets_remaining(attr_value);
					} else {
							.free(attr_value/* for nodes */);
					} 
				}
			} 
		}
		return u;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * blogs-api.c - Flickr flickr.blogs.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_blogs_getList:
	 * @fc: flickcurl context
	 * 
	 * Get a list of configured blogs for the calling user.
	 *
	 * Implements flickr.blogs.getList (1.0)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static Object flickcurl_blogs_getList(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_blog blogs = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.blogs.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		blogs = ModernizedCProgram.flickcurl_build_blogs(fc, xpathCtx, ()"/rsp/blogs/blog", ((Object)0));
		return blogs/**
		 * flickcurl_blogs_getServices:
		 * @fc: flickcurl context
		 * 
		 * Return a list of Flickr supported blogging services
		 *
		 * Implements flickr.blogs.getServices (1.12)
		 * 
		 * Return value: list of services or NULL on failure
		 **/;
	}
	public static Object flickcurl_blogs_getServices(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_blog_service services = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.blogs.getServices")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		services = ModernizedCProgram.flickcurl_build_blog_services(fc, xpathCtx, ()"/rsp/services/service", ((Object)0));
		if (fc.getFailed()) {
			if (services) {
				ModernizedCProgram.flickcurl_free_blog_services(services);
			} 
			services = ((Object)0);
		} 
		return services/**
		 * flickcurl_blogs_postPhoto:
		 * @fc: flickcurl context
		 * @blog_id: The id of the blog to post to
		 * @photo_id: The id of the photo to blog
		 * @title: The blog post title
		 * @description: The blog post body
		 * @blog_password: The password for the blog (used when the blog does not have a stored password) (or NULL)
		 *
		 * Post a photo to a blog/
		 *
		 * Implements flickr.blogs.postPhoto (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_blogs_postPhoto(Object fc, Object blog_id, Object photo_id, Object title, Object description, Object blog_password) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!blog_id || !photo_id || !title || !description) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "blog_id", blog_id);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "title", title);
		ModernizedCProgram.flickcurl_add_param(fc, "description", description);
		if (blog_password) {
			ModernizedCProgram.flickcurl_add_param(fc, "blog_password", blog_password);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.blogs.postPhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		return fc.getFailed();
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-comments-api.c - Flickr flickr.photos.comments.* API calls
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
	 * flickcurl_photos_comments_addComment:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add a comment to.
	 * @comment_text: Text of the comment
	 * 
	 * Add comment to a photo as the currently authenticated user.
	 *
	 * Implements flickr.photos.comments.addComment (0.10)
	 * 
	 * Return value: new comment ID or non-NULL on failure
	 **/
	public static Object flickcurl_photos_comments_addComment(Object fc, Object photo_id, Object comment_text) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte id = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !comment_text) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "comment_text", comment_text);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.comments.addComment")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		id = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/comment/@id");
		if (fc.getFailed()) {
			if (id) {
				.free(id);
			} 
			id = ((Object)0);
		} 
		return id/**
		 * flickcurl_photos_comments_deleteComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to edit.
		 * 
		 * Delete a comment as the currently authenticated user.
		 *
		 * Implements flickr.photos.comments.deleteComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_comments_deleteComment(Object fc, Object comment_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!comment_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "comment_id", comment_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.comments.deleteComment")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_comments_editComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to edit.
		 * @comment_text: Update the comment to this text.
		 * 
		 * Edit the text of a comment as the currently authenticated user.
		 *
		 * Implements flickr.photos.comments.editComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_comments_editComment(Object fc, Object comment_id, Object comment_text) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!comment_id || !comment_text) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "comment_id", comment_id);
		ModernizedCProgram.flickcurl_add_param(fc, "comment_text", comment_text);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.comments.editComment")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_comments_getList:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to fetch comments for.
		 * 
		 * Returns the comments for a photo
		 *
		 * Implements flickr.photos.comments.getList (0.10)
		 * 
		 * Return value: array of comments or NULL on failure
		 **/;
	}
	public static Object flickcurl_photos_comments_getList(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_comment comments = ((Object)0);
		int comments_count = 0;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.comments.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		comments = ModernizedCProgram.flickcurl_build_comments(fc, xpathCtx, ()"/rsp/comments/comment", comments_count);
		if (fc.getFailed()) {
			if (comments) {
				ModernizedCProgram.flickcurl_free_comments(comments);
			} 
			comments = ((Object)0);
		} 
		return comments/**
		 * flickcurl_photos_comments_getRecentForContacts_params:
		 * @fc: flickcurl context
		 * @date_lastcomment: Limits the resultset to photos that have been commented on since this date. The date should be in the form of a Unix timestamp. The default, and maximum, offset is (1) hour (or <0)
		 * @contacts_filter: A comma-separated list of contact NSIDs to limit the scope of the query to (or NULL)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Return the list of photos belonging to your contacts that have
		 * been commented on recently.
		 *
		 * Implements flickr.photos.comments.getRecentForContacts (1.12)
		 * 
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public static Object flickcurl_photos_comments_getRecentForContacts_params(Object fc, int date_lastcomment, Object contacts_filter, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		byte[] date_lastcomment_str = new byte[20];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (date_lastcomment >= /* API parameters */0) {
			.sprintf(date_lastcomment_str, "%d", date_lastcomment);
			ModernizedCProgram.flickcurl_add_param(fc, "date_lastcomment", date_lastcomment_str);
		} 
		if (contacts_filter) {
			ModernizedCProgram.flickcurl_add_param(fc, "contacts_filter", contacts_filter);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.comments.getRecentForContacts")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static int flickcurl_photos_geo_batchCorrectLocation(Object fc, Object location, Object place_id, int woe_id) {
		 doc = ((Object)0);
		byte[] latitude_s = new byte[50];
		byte[] longitude_s = new byte[50];
		byte[] accuracy_s = new byte[50];
		byte[] woe_id_str = new byte[10];
		int result = 0;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!place_id || !woe_id) {
			return 1;
		} 
		if (location.getLatitude() < -90.0) {
			location.setLatitude(-90.0);
		} 
		if (location.getLatitude() > 90.0) {
			location.setLatitude(90.0);
		} 
		if (location.getLongitude() < -180.0) {
			location.setLongitude(-180.0);
		} 
		if (location.getLongitude() > 180.0) {
			location.setLongitude(180.0);
		} 
		if (location.getAccuracy() < 1 || location.getAccuracy() > 16) {
			location.setAccuracy(0);
		} 
		.sprintf(latitude_s, "%f", location.getLatitude());
		ModernizedCProgram.flickcurl_add_param(fc, "lat", latitude_s);
		.sprintf(longitude_s, "%f", location.getLongitude());
		ModernizedCProgram.flickcurl_add_param(fc, "lon", longitude_s);
		.sprintf(accuracy_s, "%d", location.getAccuracy());
		ModernizedCProgram.flickcurl_add_param(fc, "accuracy", accuracy_s);
		if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		} 
		if (woe_id > 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.batchCorrectLocation")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
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
	public static int flickcurl_photos_geo_correctLocation(Object fc, Object photo_id, Object place_id, int woe_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		byte[] woe_id_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		if (woe_id > 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.correctLocation")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = ((Object)/* your code here */0);
		if (fc.getFailed()) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_geo_getLocation:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo you want to retrieve location data for.
		 * 
		 * Get the geo data (latitude and longitude and the accuracy level) for a photo.
		 *
		 * Implements flickr.photos.geo.getLocation (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/));
	}
	public static Object flickcurl_photos_geo_getLocation(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_location location = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.getLocation")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		location = ModernizedCProgram.flickcurl_build_location(fc, xpathCtx, ()"/rsp/photo/location");
		if (fc.getFailed()) {
			if (location) {
				ModernizedCProgram.flickcurl_free_location(location);
			} 
			location = ((Object)0);
		} 
		return location/**
		 * flickcurl_photos_geo_getPerms:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to get permissions for.
		 * 
		 * Get permissions for who may view geo data for a photo.
		 *
		 * Implements flickr.photos.geo.getPerms (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_photos_geo_getPerms(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_perms perms = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.getPerms")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		perms = ModernizedCProgram.flickcurl_build_perms(fc, xpathCtx, ()"/rsp/perms");
		if (fc.getFailed()) {
			if (perms) {
				ModernizedCProgram.flickcurl_free_perms(perms);
			} 
			perms = ((Object)0);
		} 
		return perms/**
		 * flickcurl_photos_geo_photosForLocation_params:
		 * @fc: flickcurl context
		 * @location: The location (lat, long, accuracy) of the photos
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get a list of photos for a user at a specific location (latitude, longitude
		 * and accuracy)
		 *
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public static Object flickcurl_photos_geo_photosForLocation_params(Object fc, Object location, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] latitude_s = new byte[50];
		byte[] longitude_s = new byte[50];
		byte[] accuracy_s = new byte[50];
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!location) {
			return ((Object)0);
		} 
		if (location.getLatitude() < -90.0) {
			location.setLatitude(-90.0);
		} 
		if (location.getLatitude() > 90.0) {
			location.setLatitude(90.0);
		} 
		if (location.getLongitude() < -180.0) {
			location.setLongitude(-180.0);
		} 
		if (location.getLongitude() > 180.0) {
			location.setLongitude(180.0);
		} 
		if (location.getAccuracy() < 1 || location.getAccuracy() > 16) {
			location.setAccuracy(0);
		} 
		.sprintf(latitude_s, "%f", location.getLatitude());
		ModernizedCProgram.flickcurl_add_param(fc, "lat", latitude_s);
		.sprintf(longitude_s, "%f", location.getLongitude());
		ModernizedCProgram.flickcurl_add_param(fc, "lon", longitude_s);
		.sprintf(accuracy_s, "%d", location.getAccuracy());
		ModernizedCProgram.flickcurl_add_param(fc, "accuracy", accuracy_s);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.photosForLocation")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_photos_geo_photosForLocation(Object fc, Object location, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static int flickcurl_photos_geo_removeLocation(Object fc, Object photo_id) {
		 doc = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.removeLocation")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
	}
	public static int flickcurl_photos_geo_setContext(Object fc, Object photo_id, int context) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] context_str = new byte[3];
		Object result = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || context < 0 || context > 2) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(context_str, "%d", context);
		ModernizedCProgram.flickcurl_add_param(fc, "context", context_str);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.setContext")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = ((Object)/* your code here */0);
		if (fc.getFailed()) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_geo_setLocation:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set location data for.
		 * @location: The location
		 * 
		 * Sets the geo data (latitude and longitude and, optionally, the
		 * accuracy level) for a photo.
		 *
		 * Implements flickr.photos.geo.setLocation (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/));
	}
	public static int flickcurl_photos_geo_setLocation(Object fc, Object photo_id, Object location) {
		 doc = ((Object)0);
		byte[] latitude_s = new byte[50];
		byte[] longitude_s = new byte[50];
		byte[] accuracy_s = new byte[50];
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		if (location.getLatitude() < -90.0) {
			location.setLatitude(-90.0);
		} 
		if (location.getLatitude() > 90.0) {
			location.setLatitude(90.0);
		} 
		if (location.getLongitude() < -180.0) {
			location.setLongitude(-180.0);
		} 
		if (location.getLongitude() > 180.0) {
			location.setLongitude(180.0);
		} 
		if (location.getAccuracy() < 1 || location.getAccuracy() > 16) {
			location.setAccuracy(0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(latitude_s, "%f", location.getLatitude());
		ModernizedCProgram.flickcurl_add_param(fc, "lat", latitude_s);
		.sprintf(longitude_s, "%f", location.getLongitude());
		ModernizedCProgram.flickcurl_add_param(fc, "lon", longitude_s);
		if (location.getAccuracy() >= 1) {
			.sprintf(accuracy_s, "%d", location.getAccuracy());
			ModernizedCProgram.flickcurl_add_param(fc, "accuracy", accuracy_s);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.setLocation")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
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
	public static int flickcurl_photos_geo_setPerms(Object fc, Object photo_id, Object perms) {
		 doc = ((Object)0);
		byte[] is_public_str = new byte[2];
		byte[] is_contact_str = new byte[2];
		byte[] is_friend_str = new byte[2];
		byte[] is_family_str = new byte[2];
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !perms) {
			return 1;
		} 
		.sprintf(is_public_str, "%d", (perms.getIs_public() ? 1 : 0));
		ModernizedCProgram.flickcurl_add_param(fc, "is_public", is_public_str);
		.sprintf(is_contact_str, "%d", (perms.getIs_contact() ? 1 : 0));
		ModernizedCProgram.flickcurl_add_param(fc, "is_contact", is_contact_str);
		.sprintf(is_friend_str, "%d", (perms.getIs_friend() ? 1 : 0));
		ModernizedCProgram.flickcurl_add_param(fc, "is_friend", is_friend_str);
		.sprintf(is_family_str, "%d", (perms.getIs_family() ? 1 : 0));
		ModernizedCProgram.flickcurl_add_param(fc, "is_family", is_family_str);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.geo.setPerms")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	public static int flickcurl_cmdline_init() {
		size_t config_len = 15;
		byte home;
		if (ModernizedCProgram.flickcurl_cmdline_config_path) {
			return 0;
		} 
		home = .getenv("HOME");
		if (home) {
			config_len += .strlen(home) + 1;
		} 
		ModernizedCProgram.flickcurl_cmdline_config_path = .malloc(config_len + 1);
		if (!ModernizedCProgram.flickcurl_cmdline_config_path) {
			return 1;
		} 
		if (home) {
			.sprintf(ModernizedCProgram.flickcurl_cmdline_config_path, "%s/%s", home, ModernizedCProgram.config_filename);
		} else {
				.memcpy(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.config_filename, config_len + 1);
		} 
		return 0;
	}
	public static void flickcurl_cmdline_finish() {
		if (ModernizedCProgram.flickcurl_cmdline_config_path) {
			.free(ModernizedCProgram.flickcurl_cmdline_config_path);
		} 
	}
	public static Object flickcurl_cmdline_basename(Object name) {
		byte p;
		if ((p = .strrchr(name, (byte)'/'))) {
			name = p + 1;
		}  else if ((p = .strrchr(name, (byte)'\\'))) {
			name = p + 1;
		} 
		return name;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * urls-api.c - Flickr flickr.urls.* API calls
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
	 * flickcurl_urls_getGroup:
	 * @fc: flickcurl context
	 * @group_id: group ID
	 *
	 * Get the url to a group's page.
	 *
	 * Implements flickr.urls.getGroup (0.9)
	 * 
	 * Return value: NSID or NULL on failure
	 **/
	public static Object flickcurl_urls_getGroup(Object fc, Object group_id) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "group_id", group_id, "flickr.urls.getGroup", ()"/rsp/group/@url"/**
		 * flickcurl_urls_getUserPhotos:
		 * @fc: flickcurl context
		 * @user_id: user ID
		 *
		 * Get the url to a user's photos.
		 *
		 * Implements flickr.urls.getUserPhotos (0.9)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public static Object flickcurl_urls_getUserPhotos(Object fc, Object user_id) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "user_id", user_id, "flickr.urls.getUserPhotos", ()"/rsp/user/@url"/**
		 * flickcurl_urls_getUserProfile:
		 * @fc: flickcurl context
		 * @user_id: user ID
		 *
		 * Get the url to a user's profile.
		 *
		 * Implements flickr.urls.getUserProfile (0.9)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public static Object flickcurl_urls_getUserProfile(Object fc, Object user_id) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "user_id", user_id, "flickr.urls.getUserProfile", ()"/rsp/user/@url"/**
		 * flickcurl_urls_lookupGallery:
		 * @fc: flickcurl context
		 * @url: The gallery's URL.
		 * 
		 * Get a gallery ID by url.
		 *
		 * Implements flickr.urls.lookupGallery (1.18)
		 *
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: gallery ID or NULL on failure
		 **/);
	}
	public static Object flickcurl_urls_lookupGallery(Object fc, Object url) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "url", url, "flickr.urls.lookupGallery", ()"/rsp/gallery/@id"/**
		 * flickcurl_urls_lookupGroup:
		 * @fc: flickcurl context
		 * @url: URL of group's page or photo pool
		 *
		 * Get a group NSID, given the url to a group's page or photo pool.
		 *
		 * Implements flickr.urls.lookupGroup (0.9)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public static Object flickcurl_urls_lookupGroup(Object fc, Object url) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "url", url, "flickr.urls.lookupGroup", ()"/rsp/group/@id"/**
		 * flickcurl_urls_lookupUser:
		 * @fc: flickcurl context
		 * @url: URL of user's photo or user's profile
		 * 
		 * Get a user NSID, given the url to a user's photos or profile.
		 *
		 * Implements flickr.urls.lookupUser (0.6)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public static Object flickcurl_urls_lookupUser(Object fc, Object url) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "url", url, "flickr.urls.lookupUser", ()"/rsp/user/@id");
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * groups-members-api.c - Flickr flickr.groups.members.* API calls
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
	 * flickcurl_groups_members_getList:
	 * @fc: flickcurl context
	 * @group_id: Return a list of members for this group.  The group must be viewable by the Flickr member on whose behalf the API call is made.
	 * @membertypes: Comma separated list of member types:  2: member, 3: moderator 4: admin.  By default returns all types.  (Returning super rare member type "1: narwhal" isn't supported by this API method) (or NULL)
	 * @per_page: Number of members to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or < 0)
	 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or < 0)
	 * 
	 * Get a list of the members of a group.
	 *
	 * The call must be signed on behalf of a Flickr member, and the
	 * ability to see the group membership will be determined by the
	 * Flickr member's group privileges.
	 *
	 * Implements flickr.groups.members.getList (1.9)
	 * as announced as an experimental API on 2009-02-24:
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/4749
	 * 
	 * Return value: list of members or NULL on failure
	 **/
	public static Object flickcurl_groups_members_getList(Object fc, Object group_id, Object membertypes, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_member members = ((Object)0);
		int members_count = 0;
		byte[] per_page_s = new byte[10];
		byte[] page_s = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!group_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		if (membertypes) {
			ModernizedCProgram.flickcurl_add_param(fc, "membertypes", membertypes);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_s, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		} 
		if (page >= 0) {
			.sprintf(page_s, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.members.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		members = ModernizedCProgram.flickcurl_build_members(fc, xpathCtx, ()"/rsp/members/member", members_count);
		if (fc.getFailed()) {
			if (members) {
				ModernizedCProgram.flickcurl_free_members(members);
			} 
			members = ((Object)0);
		} 
		return members;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * tag.c - Flickcurl tag functions
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
	 * flickcurl_free_tag:
	 * @t: tag object
	 *
	 * Destructor for tag object
	 */
	public static void flickcurl_free_tag(Object t) {
		do {
			if (!t) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (t.getId()) {
			.free(t.getId());
		} 
		if (t.getAuthor()) {
			.free(t.getAuthor());
		} 
		if (t.getAuthorname()) {
			.free(t.getAuthorname());
		} 
		if (t.getRaw()) {
			.free(t.getRaw());
		} 
		if (t.getCooked()) {
			.free(t.getCooked());
		} 
		.free(t/**
		 * flickcurl_free_tags:
		 * @tags: tag object array
		 *
		 * Destructor for array of tag objects
		 */);
	}
	public static void flickcurl_free_tags(Object tags) {
		int i;
		do {
			if (!tags) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 72, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; tags[i]; i++) {
			ModernizedCProgram.flickcurl_free_tag(tags[i]);
		}
		.free(tags);
	}
	public static Object flickcurl_build_tags(Object fc, Object photo, Object xpathCtx, Object xpathExpr, Object tag_count_p) {
		flickcurl_tag tags = ((Object)0);
		int nodes_count;
		int tag_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do tags */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tags = (flickcurl_tag).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_tag t = new flickcurl_tag();
			int saw_clean = 0;
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			t = (flickcurl_tag).calloc(, 1);
			t.setPhoto(photo);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					t.setId(attr_value);
				}  else if (!.strcmp(attr_name, "author")) {
					t.setAuthor(attr_value);
				}  else if (!.strcmp(attr_name, "authorname")) {
					t.setAuthorname(attr_value);
				}  else if (!.strcmp(attr_name, "raw")) {
					t.setRaw(attr_value);
				}  else if (!.strcmp(attr_name, "clean")) {
					t.setCooked(attr_value/* If we see @clean we are expecting
					         * <tag clean = "cooked"><raw>raw</raw></tag>
					         */);
					saw_clean = 1;
				}  else if (!.strcmp(attr_name, "machine_tag")) {
					t.setMachine_tag(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "count")) {
					t.setCount(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "score")) {
					t.setCount(.atoi(/* from tags.getHotList <tag score = "NN">TAG</tag> */attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (saw_clean && !.strcmp(chnode_name, "raw")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						t.setRaw((byte).malloc(len + 1));
						.memcpy(t.getRaw(), chnode.getChildren().getContent(), len + 1);
					} 
				}  else if (chnode.getType() == XML_TEXT_NODE) {
					if (!saw_clean) {
						size_t len = .strlen((byte)chnode.getContent());
						t.setCooked((byte).malloc(len + 1));
						.memcpy(t.getCooked(), chnode.getContent(), len + 1);
					} 
				} 
			}
			if (fc.getTag_handler()) {
				.UNRECOGNIZEDFUNCTIONNAME(fc.getTag_data(), t);
			} 
			tags[tag_count++] = t/* for nodes */;
		}
		if (tag_count_p) {
			tag_count_p = tag_count;
		} 
		return tags;
	}
	public static Object flickcurl_build_tags_from_string(Object fc, Object photo, Object string, Object tag_count_p) {
		flickcurl_tag tags = ((Object)0);
		int nodes_count;
		int tag_count;
		int i;
		nodes_count = 0;
		for (i = 0; string[i]; i++) {
			if (string[i] == (byte)' ') {
				nodes_count++;
			} 
		}
		tags = (flickcurl_tag).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			flickcurl_tag t = new flickcurl_tag();
			byte p = string;
			size_t len = new size_t();
			t = (flickcurl_tag).calloc(, 1);
			t.setPhoto(photo);
			while (p && p != (byte)' ') {
				p++;
			}
			len = p - string;
			t.setCooked((byte).malloc(len + 1));
			.memcpy(t.getCooked(), string, len);
			t.getCooked()[len] = (byte)'\0';
			if (fc.getTag_handler()) {
				.UNRECOGNIZEDFUNCTIONNAME(fc.getTag_data(), t);
			} 
			tags[tag_count++] = t;
			string = p + /* move past space */1;
		}
		if (tag_count_p) {
			tag_count_p = tag_count;
		} 
		return tags/*
		 * flickcurl_free_tag_cluster:
		 * @tc: tag cluster object
		 *
		 * INTERNAL - Destructor for tag cluster object
		 */;
	}
	public static void flickcurl_free_tag_cluster(Object tc) {
		do {
			if (!tc) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_cluster is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 256, __func__);
				return ;
			} 
		} while (0);
		if (tc.getTags()) {
			int i;
			for (i = 0; tc.getTags()[i]; i++) {
				.free(tc.getTags()[i]);
			}
			.free(tc.getTags());
		} 
		.free(tc/**
		 * flickcurl_free_tag_clusters:
		 * @tcs: tag clusters object
		 *
		 * Destructor for tag clusters object
		 */);
	}
	public static void flickcurl_free_tag_clusters(Object tcs) {
		do {
			if (!tcs) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_clusters is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\tags.c", 277, __func__);
				return ;
			} 
		} while (0);
		if (tcs.getClusters()) {
			int i;
			for (i = 0; tcs.getClusters()[i]; i++) {
				ModernizedCProgram.flickcurl_free_tag_cluster(tcs.getClusters()[i]);
			}
			.free(tcs.getClusters());
		} 
		.free(tcs);
	}
	public static Object flickcurl_build_tag_clusters(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_tag_clusters tcs = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		tcs = (flickcurl_tag_clusters).calloc(, 1);
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tcs.setClusters((flickcurl_tag_cluster).calloc(, nodes_count + 1));
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			 chnode = new ();
			flickcurl_tag_cluster tc = ((Object)0);
			int tags_count = -1;
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			tc = (flickcurl_tag_cluster).calloc(, 1);
			if (!tc) {
				fc.setFailed(1);
				break;
			} 
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte attr_name = (byte)attr.getName();
				byte attr_value = (byte)attr.getChildren().getContent();
				if (!.strcmp(attr_name, "total")) {
					tags_count = .atoi(attr_value);
				} 
			}
			if (tags_count <= 0) {
				.free(tc);
				continue;
			} 
			tc.setTags((byte).calloc(, tags_count + 1));
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE && !.strcmp(chnode_name, "tag")) {
					size_t len = .strlen((byte)chnode.getChildren().getContent());
					byte tag_name = (byte).malloc(len + 1);
					.memcpy(tag_name, (byte)chnode.getChildren().getContent(), len + 1);
					tc.getTags()[tc.getCount()++] = tag_name;
				} 
			}
			tc.getTags()[tc.getCount()] = ((Object)0);
			tcs.getClusters()[tcs.getCount()++] = tc/* for <cluster> nodes */;
		}
		tcs.getClusters()[tcs.getCount()] = ((Object)0);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj);
		} 
		return tcs;
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
	public static int Err(Object name, Object mess, int c) {
		ModernizedCProgram.optopt = c;
		if (ModernizedCProgram.opterr) {
			(Object).fprintf((_iob[2]), "%s: %s -- %c\n", name, mess, c);
		} 
		return /* erroneous-option marker */(byte)'?';
	}
	public static int getopt(int argc, Object argv, Object optstring) {
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
			}  else if (.strcmp(argv[ModernizedCProgram.optind], "--") == 0) {
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
		if (c == (byte)':' || c == /* optstring syntax conflict */(byte)'?' || (cp = .strchr(optstring, c)) == ((Object)/* not found */0)) {
			return ModernizedCProgram.Err(argv[0], "illegal option", c);
		} 
		if (cp[1] == (byte)':'/* option takes parameter */) {
			if (oind == /* reset by end of argument */ModernizedCProgram.optind) {
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
	 * legacy-auth.c - Flickr Legacy authentication
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
	public static int compare_args(Object a, Object b) {
		return .strcmp((byte)a, (byte)b);
		return .strcmp((byte)a, (byte)b);
	}
	public static void flickcurl_sort_args(Object fc) {
		.qsort((Object)fc.getParameters(), fc.getCount(), , compare_args);
		.qsort((Object)fc.getParameters(), fc.getCount(), , compare_args/*
		 * flickcurl_oauth_prepare_common:
		 * ...
		 *
		 * INTERNAL - prepare an oauth request
		 */);
	}
	public static int flickcurl_legacy_prepare_common(Object fc, Object service_uri, Object method, Object upload_field, Object upload_value, int parameters_in_url, int need_auth) {
		int i;
		byte md5_string = ((Object)0);
		size_t values_len = ((Object)0);
		int fc_uri_len = 0;
		int full_uri_len = 0;
		if (!service_uri) {
			return 1;
		} 
		if ((upload_field || upload_value) && (!upload_field || !/* If one is given, both are required */upload_value)) {
			return 1;
		} 
		fc.setFailed(0);
		fc.setError_code(0);
		if (fc.getError_msg()) {
			.free(fc.getError_msg());
			fc.setError_msg(((Object)0));
		} 
		if (fc.getParam_fields()) {
			for (i = 0; fc.getParam_fields()[i]; i++) {
				.free(fc.getParam_fields()[i]);
				.free(fc.getParam_values()[i]);
			}
			.free(fc.getParam_fields());
			.free(fc.getParam_values());
			fc.setParam_fields(((Object)0));
			fc.setParam_values(((Object)0));
			fc.setParameter_count(0);
		} 
		if (fc.getUpload_field()) {
			.free(fc.getUpload_field());
			fc.setUpload_field(((Object)0));
		} 
		if (fc.getUpload_value()) {
			.free(fc.getUpload_value());
			fc.setUpload_value(((Object)0));
		} 
		if (!fc.getSecret()) {
			ModernizedCProgram.flickcurl_error(fc, "No legacy Flickr auth secret");
			return 1;
		} 
		if (!fc.getApi_key()) {
			ModernizedCProgram.flickcurl_error(fc, "No API Key (OAuth Client Key)");
			return 1;
		} 
		if (fc.getMethod()) {
			.free(fc.getMethod());
		} 
		if (method) {
			size_t len = .strlen(method);
			fc.setMethod((byte).malloc(len + 1));
			.memcpy(fc.getMethod(), method, len + 1);
		} else {
				fc.setMethod(((Object)0));
		} 
		if (fc.getMethod()) {
			ModernizedCProgram.flickcurl_add_param(fc, "method", fc.getMethod());
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "api_key", fc.getApi_key());
		if (need_auth && fc.getAuth_token()) {
			ModernizedCProgram.flickcurl_add_param(fc, "auth_token", fc.getAuth_token());
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		fc.setParam_fields((byte).calloc(fc.getCount() + 2, /* +1 for api_sig +1 for NULL terminating pointer */));
		fc.setParam_values((byte).calloc(fc.getCount() + 2, ));
		values_len = (size_t).calloc(fc.getCount() + 2, );
		if ((need_auth && fc.getAuth_token()) || fc.getSign()) {
			ModernizedCProgram.flickcurl_sort_args(fc);
		} 
		fc_uri_len = .strlen(service_uri);
		full_uri_len = fc_uri_len;
		if (parameters_in_url) {
			/* for ? */full_uri_len++;
		} 
		for (i = 0; fc.getParameters()[i][0]; /* Save away the parameters and calculate the value lengths */i++) {
			size_t param_len = .strlen(fc.getParameters()[i][0]);
			if (fc.getParameters()[i][1]) {
				values_len[i] = .strlen(fc.getParameters()[i][1]);
			} else {
					values_len[i] = 0;
					fc.getParameters()[i][1] = "";
			} 
			fc.getParam_fields()[i] = (byte).malloc(param_len + 1);
			.memcpy(fc.getParam_fields()[i], fc.getParameters()[i][0], param_len + 1);
			fc.getParam_values()[i] = (byte).malloc(values_len[i] + 1);
			.memcpy(fc.getParam_values()[i], fc.getParameters()[i][1], values_len[i] + 1);
			full_uri_len += param_len + 1 + 3 * values_len[/* 3x value len is conservative URI %XX escaping on every char *//* = */i];
		}
		if (upload_field) {
			size_t len = .strlen(upload_field);
			fc.setUpload_field((byte).malloc(len + 1));
			.memcpy(fc.getUpload_field(), upload_field, len + 1);
			len = .strlen(upload_value);
			fc.setUpload_value((byte).malloc(len + 1));
			.memcpy(fc.getUpload_value(), upload_value, len + 1);
		} 
		if ((need_auth && fc.getAuth_token()) || fc.getSign()) {
			size_t secret_len = new size_t();
			size_t buf_len = 0;
			byte buf;
			byte p;
			secret_len = .strlen(fc.getSecret());
			buf_len = secret_len;
			for (i = 0; fc.getParameters()[i][0]; i++) {
				buf_len += .strlen(fc.getParameters()[i][0]) + values_len[i];
			}
			buf = (byte).malloc(buf_len + 1);
			p = buf;
			.memcpy(p, fc.getSecret(), secret_len);
			p += secret_len;
			for (i = 0; fc.getParameters()[i][0]; i++) {
				size_t len = .strlen(fc.getParameters()[i][0]);
				.memcpy(p, fc.getParameters()[i][0], len);
				p += len;
				.memcpy(p, fc.getParameters()[i][1], values_len[i]);
				p += values_len[i];
			}
			p = (byte)'\0';
			md5_string = ModernizedCProgram.MD5_string(buf);
			ModernizedCProgram.flickcurl_add_param(fc, "api_sig", md5_string);
			fc.getCount()--;
			values_len[fc.getCount()] = /* Add a new parameter pair *//* MD5 is always 32 */32;
			fc.getParam_fields()[fc.getCount()] = (byte).malloc(7 + /* 7 = strlen(api_sig) */1);
			.memcpy(fc.getParam_fields()[fc.getCount()], fc.getParameters()[fc.getCount()][0], 7 + 1);
			fc.getParam_values()[fc.getCount()] = (byte).malloc(32 + /* 32 = MD5 */1);
			.memcpy(fc.getParam_values()[fc.getCount()], fc.getParameters()[fc.getCount()][1], 32 + 1);
			full_uri_len += 7 + 1 + /* "api_sig" *//* = *//* MD5 value: never escaped */32;
			fc.getCount()++;
			.free(buf);
			ModernizedCProgram.flickcurl_end_params(fc);
		} 
		full_uri_len += fc.getCount() - /* add &s between parameters */1;
		if (fc.getUri_len() < /* reuse or grow uri buffer */full_uri_len) {
			.free(fc.getUri());
			fc.setUri((byte).malloc(full_uri_len + 1));
			fc.setUri_len(full_uri_len);
		} 
		.memcpy(fc.getUri(), service_uri, fc_uri_len);
		fc.getUri()[fc_uri_len] = (byte)'\0';
		if (parameters_in_url) {
			byte p = fc.getUri() + fc_uri_len;
			p++ = (byte)'?';
			for (i = 0; fc.getParameters()[i][0]; i++) {
				byte value = (byte)fc.getParameters()[i][1];
				int value_is_escaped = 0;
				size_t len = new size_t();
				if (!fc.getParameters()[i][1]) {
					continue;
				} 
				len = .strlen(fc.getParameters()[i][0]);
				.memcpy(p, fc.getParameters()[i][0], len);
				p += len;
				p++ = (byte)'=';
				len = values_len[i];
				if (!.strcmp(fc.getParameters()[i][0], "method"/* do not touch method name */)) {
				} else {
						value = .curl_escape(value, len);
						len = .strlen(value);
						value_is_escaped = 1;
				} 
				.memcpy(p, value, len);
				p += len;
				if (value_is_escaped) {
					.curl_free(value);
				} 
				p++ = (byte)'&';
			}
			--p = /* zap last & and terminate fc->url */(byte)'\0';
		} 
		if (md5_string) {
			.free(md5_string);
		} 
		if (values_len) {
			.free(values_len);
		} 
		return 0;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * contacts-api.c - Flickr flickr.contacts.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * Copyright (C) 2007 Vanilla I. Shu <vanilla -at- fatpipi.cirx.org>
	 *   (flickcurl_contacts_getList, flickcurl_contacts_getPublicList)
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
	 * flickcurl_contacts_getList:
	 * @fc: flickcurl context
	 * @filter: An optional filter of the results. The following values are valid:  friends, family, both or neither (or NULL)
	 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or NULL)
	 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 1000. The maximum allowed value is 1000. (or NULL)
	 * 
	 * Get a list of contacts for the calling user.
	 *
	 * Implements flickr.contacts.getList (0.11)
	 * 
	 * Return value: NULL on failure
	 **/
	public static Object flickcurl_contacts_getList(Object fc, Object filter, int page, int per_page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_contact contacts = ((Object)0);
		int contacts_count = 0;
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (filter) {
			ModernizedCProgram.flickcurl_add_param(fc, "filter", filter);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.contacts.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		contacts = ModernizedCProgram.flickcurl_build_contacts(fc, xpathCtx, ()"/rsp/contacts/contact", contacts_count);
		if (fc.getFailed()) {
			if (contacts) {
				ModernizedCProgram.flickcurl_free_contacts(contacts);
			} 
			contacts = ((Object)0);
		} 
		return contacts/**
		 * flickcurl_contacts_getListRecentlyUploaded:
		 * @fc: flickcurl context
		 * @date_lastupload: Limits the results to contacts that have uploaded photos since this date (in the form of a Unix timestamp).  The default, and maximum, offset is 1 hour.  (or < 0)
		 * @filter: Limit the result set to all contacts or only those who are friends or family. Valid options are: ff: friends and family, all: all your contacts. Default value is "all". (or NULL)
		 * 
		 * Return a list of contacts for a user who have recently uploaded
		 * photos along with the total count of photos uploaded.
		 *
		 * This API added 2009-01-14 as announced in
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4668
		 *
		 * Implements flickr.contacts.getListRecentlyUploaded (1.8)
		 * 
		 * Return value: NULL on failure
		 **/;
	}
	public static Object flickcurl_contacts_getListRecentlyUploaded(Object fc, int date_lastupload, Object filter) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_contact contacts = ((Object)0);
		int contacts_count = 0;
		byte[] date_lastupload_str = new byte[20];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (date_lastupload >= 0) {
			.sprintf(date_lastupload_str, "%d", date_lastupload);
			ModernizedCProgram.flickcurl_add_param(fc, "date_lastupload", date_lastupload_str);
		} 
		if (filter) {
			ModernizedCProgram.flickcurl_add_param(fc, "filter", filter);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.contacts.getListRecentlyUploaded")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		contacts = ModernizedCProgram.flickcurl_build_contacts(fc, xpathCtx, ()"/rsp/contacts/contact", contacts_count);
		if (fc.getFailed()) {
			if (contacts) {
				ModernizedCProgram.flickcurl_free_contacts(contacts);
			} 
			contacts = ((Object)0);
		} 
		return contacts/**
		 * flickcurl_contacts_getPublicList:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch the contact list for.
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or NULL)
		 * @per_page: Number of photos to return per page. If this argument is omitted, it defaults to 1000. The maximum allowed value is 1000. (or NULL)
		 * 
		 * Get the contact list for a user.
		 *
		 * Implements flickr.contacts.getPublicList (0.11)
		 * 
		 * Return value: list of contacts or NULL on failure
		 **/;
	}
	public static Object flickcurl_contacts_getPublicList(Object fc, Object user_id, int page, int per_page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_contact contacts = ((Object)0);
		int contacts_count = 0;
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.contacts.getPublicList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		contacts = ModernizedCProgram.flickcurl_build_contacts(fc, xpathCtx, ()"/rsp/contacts/contact", contacts_count);
		if (fc.getFailed()) {
			if (contacts) {
				ModernizedCProgram.flickcurl_free_contacts(contacts);
			} 
			contacts = ((Object)0);
		} 
		return contacts/**
		 * flickcurl_contacts_getTaggingSuggestions:
		 * @fc: flickcurl context
		 * @include_self: Return calling user in the list of suggestions. Default: true. (or NULL)
		 * @include_address_book: Include suggestions from the user's address book. Default: false (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * @per_page: Number of contacts to return per page. If this argument is omitted, all contacts will be returned. (or < 0)
		 * 
		 * Get suggestions for tagging people in photos based on the calling user's contacts.
		 *
		 * Implements flickr.contacts.getTaggingSuggestions (1.25)
		 *
		 * NOTE: Parameter order is @page, @per_page like all other
		 * flickr.contacts.* calls, NOT @per_page, @page like in the API
		 * docs.
		 * 
		 * Return value: list of contacts or NULL on failure
		 **/;
	}
	public static Object flickcurl_contacts_getTaggingSuggestions(Object fc, Object include_self, Object include_address_book, int page, int per_page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_contact contacts = ((Object)0);
		int contacts_count = 0;
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (include_self) {
			ModernizedCProgram.flickcurl_add_param(fc, "include_self", include_self);
		} 
		if (include_address_book) {
			ModernizedCProgram.flickcurl_add_param(fc, "include_address_book", include_address_book);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.contacts.getTaggingSuggestions")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		contacts = ModernizedCProgram.flickcurl_build_contacts(fc, xpathCtx, ()"/rsp/contacts/contact", contacts_count);
		if (fc.getFailed()) {
			if (contacts) {
				ModernizedCProgram.flickcurl_free_contacts(contacts);
			} 
			contacts = ((Object)0);
		} 
		return contacts;
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
	public static void flickcurl_free_member(Object member_object) {
		do {
			if (!member_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_member is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\members.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (member_object.getNsid()) {
			.free(member_object.getNsid());
		} 
		if (member_object.getUsername()) {
			.free(member_object.getUsername());
		} 
		.free(member_object/**
		 * flickcurl_free_members:
		 * @members_object: member object array
		 *
		 * Destructor for array of member object
		 */);
	}
	public static void flickcurl_free_members(Object members_object) {
		int i;
		do {
			if (!members_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_member is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\members.c", 68, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; members_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_member(members_object[i]);
		}
		.free(members_object);
	}
	public static Object flickcurl_build_members(Object fc, Object xpathCtx, Object xpathExpr, Object member_count_p) {
		flickcurl_member members = ((Object)0);
		int nodes_count;
		int member_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do members */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		members = (flickcurl_member).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_member member_object = new flickcurl_member();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			member_object = (flickcurl_member).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "nsid")) {
					member_object.setNsid(attr_value);
				}  else if (!.strcmp(attr_name, "username")) {
					member_object.setUsername(attr_value);
				}  else if (!.strcmp(attr_name, "iconserver")) {
					member_object.setIconserver(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "iconfarm")) {
					member_object.setIconserver(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "membertype")) {
					member_object.setMember_type(.atoi((byte)attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			members[member_count++] = member_object/* for nodes */;
		}
		if (member_count_p) {
			member_count_p = member_count;
		} 
		return members;
	}
	/* WORDS_BIGENDIAN */
	/*
	 * Start MD5 accumulation.  Set bit count to 0 and buffer to mysterious
	 * initialization constants.
	 */
	public static void MD5Init(Object ctx) {
		ctx.getBuf()[0] = -1024;
		ctx.getBuf()[1] = -1024;
		ctx.getBuf()[2] = -1024;
		ctx.getBuf()[3] = -1024;
		ctx.getBits()[0] = 0;
		ctx.getBits()[1] = 0/*
		 * Update context to reflect the concatenation of another buffer full
		 * of bytes.
		 */;
	}
	public static void MD5Update(Object ctx, Object buf, int len) {
		 t = new ();
		t = ctx.getBits()[/* Update bitcount */0];
		if ((ctx.getBits()[0] = t + (()len << 3)) < t) {
			ctx.getBits()[/* Carry from low to high */1]++;
		} 
		ctx.getBits()[1] += len >> 29;
		t = (t >> 3) & /* Bytes already in shsInfo->data */-1024;
		if (/* Handle any leading odd-sized chunks */t) {
			byte p = (byte)ctx.getIn() + t;
			t = 64 - t;
			if (len < t) {
				.memcpy(p, buf, len);
				return ;
			} 
			.memcpy(p, buf, t);
			;
			ModernizedCProgram.MD5Transform(ctx.getBuf(), ()ctx.getIn());
			buf += t;
			len -= t;
		} 
		while (len >= /* Process data in 64-byte chunks */64) {
			.memcpy(ctx.getIn(), buf, 64);
			;
			ModernizedCProgram.MD5Transform(ctx.getBuf(), ()ctx.getIn());
			buf += 64;
			len -= 64;
		}
		.memcpy(ctx.getIn(), buf, /* Handle any remaining bytes of data. */len/*
		 * Final wrapup - pad to 64-byte boundary with the bit pattern 
		 * 1 0* (64-bit count of bits processed, MSB-first)
		 */);
	}
	/* Interface altered by DJB to write digest into pre-allocated context */
	public static void MD5Final(Object ctx) {
		int count;
		byte p;
		count = (ctx.getBits()[0] >> 3) & /* Compute number of bytes mod 64 */-1024;
		p = ctx.getIn() + /* Set the first char of padding to 0x80.  This is safe since there is
		     always at least one byte free */count;
		p++ = -1024;
		count = 64 - 1 - /* Bytes of padding needed to make 64 bytes */count;
		if (count < /* Pad out to 56 mod 64 */8) {
			.memset(p, 0, /* Two lots of padding:  Pad the first block to 64 bytes */count);
			;
			ModernizedCProgram.MD5Transform(ctx.getBuf(), ()ctx.getIn());
			.memset(ctx.getIn(), 0, /* Now fill the next block with 56 bytes */56);
		} else {
				.memset(p, 0, count - /* Pad block to 56 bytes */8);
		} 
		;
		(()ctx.getIn())[14] = ctx.getBits()[/* Append length in bits and transform */0];
		(()ctx.getIn())[15] = ctx.getBits()[1];
		ModernizedCProgram.MD5Transform(ctx.getBuf(), ()ctx.getIn());
		;
		.memcpy(ctx.getDigest(), ctx.getBuf(), 16/* The four core functions - F1 is optimized somewhat *//* #define F1(x, y, z) (x & y | ~x & z) */);
	}
	public static void MD5Transform(Object buf, Object in) {
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
	public static Object MD5_string(Object string) {
		MD5Context md5 = new MD5Context();
		size_t len = .strlen(string);
		byte b = ((Object)0);
		int i;
		ModernizedCProgram.MD5Init(md5);
		ModernizedCProgram.MD5Update(md5, (byte)string, len);
		ModernizedCProgram.MD5Final(md5);
		b = (byte).malloc(1 + (16 << 1));
		if (!b) {
			return ((Object)0);
		} 
		Object generatedDigest = md5.getDigest();
		for (i = 0; i < 16; i++) {
			.sprintf(b + (i << 1), "%02x", (int)generatedDigest[i]);
		}
		b[i << 1] = (byte)'\0';
		return b;
	}
	public static void flickcurl_error_varargs(Object fc, Object message, Object arguments) {
		if (fc && fc.getError_handler()) {
			byte buffer = ModernizedCProgram.my_vsnprintf(message, arguments);
			if (!buffer) {
				.fprintf((_iob[2]), "flickcurl: Out of memory\n");
				return ;
			} 
			.UNRECOGNIZEDFUNCTIONNAME(fc.getError_data(), buffer);
			.free(buffer);
		} else {
				.fprintf((_iob[2]), "flickcurl error - ");
				.vfprintf((_iob[2]), message, arguments);
				.fputc((byte)'\n', (_iob[2]));
		} 
	}
	public static void flickcurl_error(Object fc, Object message) {
		va_list arguments = new va_list();
		.__builtin_va_start(arguments, message);
		ModernizedCProgram.flickcurl_error_varargs(fc, message, arguments);
		.__builtin_va_end(arguments);
	}
	public static Object flickcurl_write_callback(Object ptr, Object size, Object nmemb, Object userdata) {
		flickcurl fc = (flickcurl)userdata;
		int len = size * nmemb;
		int rc = 0;
		if (fc.getFailed()) {
			return 0;
		} 
		fc.getTotal_bytes() += len;
		if (fc.getSave_content()) {
			byte b;
			flickcurl_chunk chunk = new flickcurl_chunk();
			b = (byte).malloc(len);
			chunk = (flickcurl_chunk).malloc();
			if (b && chunk) {
				fc.getChunks_count()++;
				.memcpy(b, ptr, len);
				chunk.setContent(b);
				chunk.setSize(len);
				chunk.setPrev(fc.getChunks());
				fc.setChunks(chunk);
			} else {
					if (b) {
						.free(b);
					} 
					if (chunk) {
						.free(chunk);
					} 
					ModernizedCProgram.flickcurl_error(fc, "Out of memory");
			} 
		} 
		if (fc.getXml_parse_content()) {
			if (!fc.getXc()) {
				 xc = new ();
				xc = .xmlCreatePushParserCtxt(((Object)0), ((Object)0), (byte)ptr, len, (byte)fc.getUri());
				if (!xc) {
					rc = 1;
				} else {
						xc.setReplaceEntities(1);
						xc.setLoadsubset(1);
				} 
				fc.setXc(xc);
			} else {
					rc = .xmlParseChunk(fc.getXc(), (byte)ptr, len, 0);
			} 
			if (rc) {
				ModernizedCProgram.flickcurl_error(fc, "XML Parsing failed");
			} 
		} 
		return len;
	}
	/**
	 * flickcurl_new_with_handle:
	 * @curl_handle: CURL* handle
	 *
	 * Create a Flickcurl sesssion from an existing CURL* handler
	 *
	 * This allows setting up or re-using an existing CURL handle with
	 * Flickcurl, however the library will call curl_easy_setopt to set
	 * options based on the operation being performed.  If these need to
	 * be over-ridden, use flickcurl_set_curl_setopt_handler() to adjust
	 * the options.
	 *
	 * NOTE: The type of @handle is void* so that curl headers are
	 * optional when compiling against flickcurl.
	 *
	 * Return value: new #flickcurl object or NULL on fialure
	 */
	public static Object flickcurl_new_with_handle(Object curl_handle) {
		flickcurl fc = new flickcurl();
		size_t len = new size_t();
		fc = (flickcurl).calloc(1, );
		if (!fc) {
			return ((Object)0);
		} 
		len = .strlen(ModernizedCProgram.flickcurl_flickr_service_uri);
		fc.setService_uri((byte).malloc(len + 1));
		.memcpy(fc.getService_uri(), ModernizedCProgram.flickcurl_flickr_service_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_upload_service_uri);
		fc.setUpload_service_uri((byte).malloc(len + 1));
		.memcpy(fc.getUpload_service_uri(), ModernizedCProgram.flickcurl_flickr_upload_service_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_replace_service_uri);
		fc.setReplace_service_uri((byte).malloc(len + 1));
		.memcpy(fc.getReplace_service_uri(), ModernizedCProgram.flickcurl_flickr_replace_service_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_oauth_request_token_uri);
		fc.setOauth_request_token_uri((byte).malloc(len + 1));
		.memcpy(fc.getOauth_request_token_uri(), ModernizedCProgram.flickcurl_flickr_oauth_request_token_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_oauth_access_token_uri);
		fc.setOauth_access_token_uri((byte).malloc(len + 1));
		.memcpy(fc.getOauth_access_token_uri(), ModernizedCProgram.flickcurl_flickr_oauth_access_token_uri, len + 1);
		fc.setRequest_delay(/* DEFAULT delay between requests is 1000ms i.e 1 request/second max */1000);
		fc.setMt(.flickcurl_mtwist_new());
		if (!fc.getMt()) {
			.free(fc);
			return ((Object)0);
		} 
		.flickcurl_mtwist_init(fc.getMt(), .flickcurl_mtwist_seed_from_system(fc.getMt()));
		fc.setCurl_handle(()curl_handle);
		if (!fc.getCurl_handle()) {
			fc.setCurl_handle(.curl_easy_init());
			fc.setCurl_init_here(1);
		} 
		.curl_easy_setopt(fc.getCurl_handle(), /* send all data to this function  */CURLOPT_WRITEFUNCTION, flickcurl_write_callback);
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_FILE, /* ... using this data pointer */fc);
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_FOLLOWLOCATION, /* Make it follow Location: headers */1);
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_ERRORBUFFER, fc.getError_buffer());
		return fc/**
		 * flickcurl_new:
		 *
		 * Create a Flickcurl sesssion
		 *
		 * Return value: new #flickcurl object or NULL on fialure
		 */;
	}
	public static Object flickcurl_new() {
		return ModernizedCProgram.flickcurl_new_with_handle(((Object)0/**
		 * flickcurl_free:
		 * @fc: flickcurl object
		 * 
		 * Destroy flickcurl session
		 *
		 */));
	}
	public static void flickcurl_free(Object fc) {
		if (fc.getXc()) {
			if (fc.getXc().getMyDoc()) {
				.xmlFreeDoc(fc.getXc().getMyDoc());
				fc.getXc().setMyDoc(((Object)0));
			} 
			.xmlFreeParserCtxt(fc.getXc());
		} 
		if (fc.getSecret()) {
			.free(fc.getSecret());
		} 
		if (fc.getAuth_token()) {
			.free(fc.getAuth_token());
		} 
		if (fc.getMethod()) {
			.free(fc.getMethod());
		} 
		if (fc.getCurl_init_here() && fc.getCurl_handle()) {
			.curl_easy_cleanup(fc.getCurl_handle());
			fc.setCurl_handle(((Object)0));
		} 
		if (fc.getError_msg()) {
			.free(fc.getError_msg());
		} 
		if (fc.getLicenses()) {
			int i;
			flickcurl_license license = new flickcurl_license();
			for (i = 0; (license = fc.getLicenses()[i]); i++) {
				.free(license.getName());
				if (license.getUrl()) {
					.free(license.getUrl());
				} 
				.free(license);
			}
			.free(fc.getLicenses());
		} 
		if (fc.getData()) {
			if (fc.getData_is_xml()) {
				.xmlFree(fc.getData());
			} 
		} 
		if (fc.getParam_fields()) {
			int i;
			for (i = 0; fc.getParam_fields()[i]; i++) {
				.free(fc.getParam_fields()[i]);
				.free(fc.getParam_values()[i]);
			}
			.free(fc.getParam_fields());
			.free(fc.getParam_values());
			fc.setParam_fields(((Object)0));
			fc.setParam_values(((Object)0));
			fc.setParameter_count(0);
		} 
		if (fc.getUpload_field()) {
			.free(fc.getUpload_field());
		} 
		if (fc.getUpload_value()) {
			.free(fc.getUpload_value());
		} 
		if (fc.getService_uri()) {
			.free(fc.getService_uri());
		} 
		if (fc.getUpload_service_uri()) {
			.free(fc.getUpload_service_uri());
		} 
		if (fc.getReplace_service_uri()) {
			.free(fc.getReplace_service_uri());
		} 
		if (fc.getOauth_request_token_uri()) {
			.free(fc.getOauth_request_token_uri());
		} 
		if (fc.getOauth_access_token_uri()) {
			.free(fc.getOauth_access_token_uri());
		} 
		if (fc.getUser_agent()) {
			.free(fc.getUser_agent());
		} 
		if (fc.getUri()) {
			.free(fc.getUri());
		} 
		if (fc.getMt()) {
			.flickcurl_mtwist_free(fc.getMt());
		} 
		ModernizedCProgram.flickcurl_oauth_free(fc.getOd());
		.free(fc/**
		 * flickcurl_init:
		 *
		 * Initialise Flickcurl library.
		 *
		 * Return value: non-0 on failure
		 */);
	}
	public static int flickcurl_init() {
		.curl_global_init(CURL_GLOBAL_ALL);
		.xmlInitParser();
		ModernizedCProgram.flickcurl_serializer_init();
		return 0/**
		 * flickcurl_finish:
		 *
		 * Terminate Flickcurl library.
		 */;
	}
	public static void flickcurl_finish() {
		ModernizedCProgram.flickcurl_serializer_terminate();
		.xmlCleanupParser();
		.curl_global_cleanup();
	}
	public static void flickcurl_set_error_handler(Object fc, Object error_handler, Object error_data) {
		fc.setError_handler(error_handler);
		fc.setError_data(error_data/**
		 * flickcurl_set_tag_handler:
		 * @fc: flickcurl object
		 * @tag_handler: tag handler function
		 * @tag_data: tag handler data
		 *
		 * Set Flickcurl tag handler.
		 */);
	}
	public static void flickcurl_set_tag_handler(Object fc, Object tag_handler, Object tag_data) {
		fc.setTag_handler(tag_handler);
		fc.setTag_data(tag_data/**
		 * flickcurl_set_user_agent:
		 * @fc: flickcurl object
		 * @user_agent: user agent string
		 *
		 * Set Flickcurl HTTP user agent string
		 */);
	}
	public static void flickcurl_set_user_agent(Object fc, Object user_agent) {
		size_t len = .strlen(user_agent);
		byte ua_copy = (byte).malloc(len + 1);
		if (!ua_copy) {
			return ;
		} 
		.memcpy(ua_copy, user_agent, len + 1);
		fc.setUser_agent(ua_copy/**
		 * flickcurl_set_proxy:
		 * @fc: flickcurl object
		 * @proxy: HTTP proxy string
		 *
		 * Set HTTP proxy for flickcurl requests
		 */);
	}
	public static void flickcurl_set_proxy(Object fc, Object proxy) {
		size_t len = .strlen(proxy);
		byte proxy_copy = (byte).malloc(len + 1);
		if (!proxy_copy) {
			return ;
		} 
		.memcpy(proxy_copy, proxy, len + 1);
		fc.setProxy(proxy_copy/**
		 * flickcurl_set_http_accept:
		 * @fc: flickcurl object
		 * @value: HTTP Accept header value
		 *
		 * Set HTTP accept header value for flickcurl requests
		 */);
	}
	public static void flickcurl_set_http_accept(Object fc, Object value) {
		byte value_copy;
		size_t len = /* strlen("Accept:") */7;
		if (value) {
			len += 1 + .strlen(/* " "+value */value);
		} 
		value_copy = (byte).malloc(len + 1);
		if (!value_copy) {
			return ;
		} 
		fc.setHttp_accept(value_copy);
		.memcpy(value_copy, "Accept:", /* copy NUL */8);
		value_copy += 7;
		if (value) {
			value_copy++ = (byte)' ';
			.memcpy(value_copy, value, (len - 8) + 1/**
			 * flickcurl_set_service_uri:
			 * @fc: flickcurl object
			 * @uri: Service URI (or NULL)
			 *
			 * Set Web Service URI for flickcurl requests
			 *
			 * Sets the service to the default (Flickr API web service) if @uri is NULL.
			 */);
		} 
	}
	public static void flickcurl_set_service_uri(Object fc, Object uri) {
		size_t len = new size_t();
		if (!uri) {
			uri = ModernizedCProgram.flickcurl_flickr_service_uri;
		} 
		if (fc.getService_uri()) {
			.free(fc.getService_uri());
		} 
		len = .strlen(uri);
		fc.setService_uri((byte).malloc(len + 1));
		.memcpy(fc.getService_uri(), uri, len + 1/**
		 * flickcurl_set_upload_service_uri:
		 * @fc: flickcurl object
		 * @uri: Upload Service URI (or NULL)
		 *
		 * Set Web Upload Service URI for flickcurl requests
		 *
		 * Sets the upload service to the default (Flickr API web
		 * upload_service) if @uri is NULL.
		 */);
	}
	public static void flickcurl_set_upload_service_uri(Object fc, Object uri) {
		size_t len = new size_t();
		if (!uri) {
			uri = ModernizedCProgram.flickcurl_flickr_upload_service_uri;
		} 
		if (fc.getUpload_service_uri()) {
			.free(fc.getUpload_service_uri());
		} 
		len = .strlen(uri);
		fc.setUpload_service_uri((byte).malloc(len + 1));
		.memcpy(fc.getUpload_service_uri(), uri, len + 1/**
		 * flickcurl_set_replace_service_uri:
		 * @fc: flickcurl object
		 * @uri: Replace Service URI (or NULL)
		 *
		 * Set Web Replace Service URI for flickcurl requests
		 *
		 * Sets the replace service to the default (Flickr API web
		 * replace_service) if @uri is NULL.
		 */);
	}
	public static void flickcurl_set_replace_service_uri(Object fc, Object uri) {
		size_t len = new size_t();
		if (!uri) {
			uri = ModernizedCProgram.flickcurl_flickr_replace_service_uri;
		} 
		if (fc.getReplace_service_uri()) {
			.free(fc.getReplace_service_uri());
		} 
		len = .strlen(uri);
		fc.setReplace_service_uri((byte).malloc(len + 1));
		.memcpy(fc.getReplace_service_uri(), uri, len + 1/**
		 * flickcurl_set_api_key:
		 * @fc: flickcurl object
		 * @api_key: API Key
		 *
		 * Set legacy Flickr auth application API Key (OAuth Client key)
		 *
		 * For OAuth this is not sufficient and
		 * flickcurl_set_oauth_client_key() and
		 * flickcurl_set_oauth_client_secret() be used
		 * to pass both the client key and client secret.
		 */);
	}
	public static void flickcurl_set_api_key(Object fc, Object api_key) {
		size_t len = new size_t();
		if (fc.getOd().getClient_key()) {
			.free(fc.getOd().getClient_key());
		} 
		len = .strlen(api_key);
		fc.getOd().setClient_key((byte).malloc(len + 1));
		.memcpy(fc.getOd().getClient_key(), api_key, len + 1);
		fc.getOd().setClient_key_len(len/* Mainly for flickcurl_auth_oauth_getAccessToken() to sign the call
		   * exchanging tokens 
		   */);
		fc.setApi_key(fc.getOd().getClient_key());
	}
	public static Object flickcurl_get_api_key(Object fc) {
		return fc.getApi_key();
	}
	public static void flickcurl_set_shared_secret(Object fc, Object secret) {
		size_t len = new size_t();
		if (fc.getSecret()) {
			.free(fc.getSecret());
		} 
		len = .strlen(secret);
		fc.setSecret((byte).malloc(len + 1));
		.memcpy(fc.getSecret(), secret, len + 1/**
		 * flickcurl_get_shared_secret:
		 * @fc: flickcurl object
		 *
		 * Get legacy Flickr auth Secret
		 *
		 * Return value: shared secret or NULL if none set
		 */);
	}
	public static Object flickcurl_get_shared_secret(Object fc) {
		return fc.getSecret();
	}
	public static void flickcurl_set_auth_token(Object fc, Object auth_token) {
		size_t len = new size_t();
		if (fc.getAuth_token()) {
			.free(fc.getAuth_token());
		} 
		len = .strlen(auth_token);
		fc.setAuth_token((byte).malloc(len + 1));
		.memcpy(fc.getAuth_token(), auth_token, len + 1/**
		 * flickcurl_get_auth_token:
		 * @fc: flickcurl object
		 *
		 * Get legacy Flickr auth Token
		 *
		 * Return value: auth token or NULL if none set
		 */);
	}
	public static Object flickcurl_get_auth_token(Object fc) {
		return fc.getAuth_token();
	}
	public static void flickcurl_set_sign(Object fc) {
		fc.setSign(1/**
		 * flickcurl_set_request_delay:
		 * @fc: flickcurl object
		 * @delay_msec: web service delay in milliseconds
		 *
		 * Set web service request delay
		 */);
	}
	public static void flickcurl_set_request_delay(Object fc, long delay_msec) {
		if (delay_msec >= 0) {
			fc.setRequest_delay(delay_msec/*
			 * INTERNAL: initialise parameter array
			 */);
		} 
	}
	public static void flickcurl_init_params(Object fc, int is_write) {
		fc.setCount(0);
		fc.getParameters()[fc.getCount()][0] = ((Object)0);
		fc.setIs_write(/* Default is read only */is_write);
		if (fc.getData()) {
			if (fc.getData_is_xml()) {
				.xmlFree(fc.getData());
			} 
			fc.setData(((Object)0));
			fc.setData_length(0);
			fc.setData_is_xml(0);
		} 
		if (is_write) {
			ModernizedCProgram.flickcurl_set_data(fc, (Object)"", 0/*
			 * INTERNAL: add a new (key, value) to array of parameters
			 */);
		} 
	}
	public static void flickcurl_add_param(Object fc, Object key, Object value) {
		fc.getParameters()[fc.getCount()][0] = key;
		fc.getParameters()[fc.getCount()][1] = value;
		fc.getCount()++;
	}
	public static void flickcurl_end_params(Object fc) {
		fc.getParameters()[fc.getCount()][0] = ((Object)0);
	}
	public static int flickcurl_prepare_common(Object fc, Object service_uri, Object method, Object upload_field, Object upload_value, int parameters_in_url, int need_auth) {
		int rc = 1;
		if (fc.getApi_key() && fc.getSecret()) {
			rc = ModernizedCProgram.flickcurl_legacy_prepare_common(fc, service_uri, /* Call with legacy Flickr auth */method, upload_field, upload_value, parameters_in_url, need_auth);
		}  else if (fc.getOd().getToken() && fc.getOd().getToken_secret()) {
			rc = ModernizedCProgram.flickcurl_oauth_prepare_common(fc, service_uri, /* Call with OAuth */method, upload_field, upload_value, parameters_in_url, need_auth);
		} else {
				ModernizedCProgram.flickcurl_error(fc, "No legacy or OAuth authentication tokens or secrets");
		} 
		return rc;
	}
	public static int flickcurl_prepare_noauth(Object fc, Object method) {
		if (!method) {
			ModernizedCProgram.flickcurl_error(fc, "No method to prepare");
			return 1;
		} 
		return ModernizedCProgram.flickcurl_prepare_common(fc, fc.getService_uri(), method, ((Object)0), ((Object)0), /* parameters_in_url */1, /* need_auth */0);
	}
	public static int flickcurl_prepare(Object fc, Object method) {
		if (!method) {
			ModernizedCProgram.flickcurl_error(fc, "No method to prepare");
			return 1;
		} 
		return ModernizedCProgram.flickcurl_prepare_common(fc, fc.getService_uri(), method, ((Object)0), ((Object)0), /* parameters_in_url */1, /* need_auth */1);
	}
	public static int flickcurl_prepare_upload(Object fc, Object url, Object upload_field, Object upload_value) {
		return ModernizedCProgram.flickcurl_prepare_common(fc, url, ((Object)0), upload_field, upload_value, /* parameters_in_url */0, /* need_auth */1/* Need gettimeofday() which is a BSD function not POSIX so may not
		 * be in standard C libraries
		 *//* have it as an external function */);
	}
	/* seconds between 1 Jan 1601 (windows epoch) and 1 Jan 1970 (unix epoch) */
	/* 100 nano-seconds ( = 1/10 usec) in seconds */
	/* factor to convert high-dword count into seconds = NSEC100 * (2<<32) */
	public static int gettimeofday(Object tp, Object tzp) {
		FILETIME ft = new FILETIME();
		double t;
		.GetSystemTimeAsFileTime(/* returns time since windows epoch in 100ns (1/10us) units */ft);
		Object generatedDwHighDateTime = ft.getDwHighDateTime();
		Object generatedDwLowDateTime = ft.getDwLowDateTime();
		t = ((generatedDwHighDateTime * (429.4967296)) - /* convert time into seconds as a double */1.16444736E10) + (generatedDwLowDateTime * (1.0E-7));
		tp.setTv_sec((long)t);
		tp.setTv_usec((long)((t - tp.getTv_sec()) * 1000000.0));
		return /* tzp is ignored */0/* end HAVE_GETTIMEOFDAY *//* Need nanosleep() to wait between service calls */;
	}
	public static int nanosleep(Object rqtp, Object rmtp) {
		int msec;
		int sec;
		sec = rqtp.getTv_sec();
		msec = (rqtp.getTv_nsec() / 1000000);
		msec += 1000 * /* carefully avoid sleeping forever with a sleep(0) */sec;
		if (!msec) {
			msec = 1;
		} 
		.Sleep(msec/* otherwise use sleep() (POSIX) and possibly usleep() (4.3BSD) *//* 0 seconds so ensure msec is at least 1 */);
		return /* use usleep() for fractions of a second only (when available)
		   * since some implementations won't let it sleep for more than a
		   * second.
		   */0/* end HAVE_NANOSLEEP */;
	}
	public static Object flickcurl_curl_header_callback(Object ptr, Object size, Object nmemb, Object userdata) {
		flickcurl fc = (flickcurl)userdata;
		int bytes = size * nmemb/* If flickcurl has already failed, return nothing so that
		   * libcurl will abort the transfer
		   */;
		if (fc.getFailed()) {
			return 0;
		} 
		if (!.strncmp((byte)ptr, "X-FlickrErrCode: ", 17)) {
			fc.setError_code(.atoi((byte)ptr + 17));
		}  else if (!.strncmp((byte)ptr, "X-FlickrErrMessage: ", 20)) {
			int len = bytes - 20;
			if (fc.getError_msg()) {
				.free(fc.getError_msg());
			} 
			fc.setError_msg((byte).malloc(len + 1));
			.memcpy(fc.getError_msg(), (byte)ptr + 20, len + 1);
			fc.getError_msg()[len] = (byte)'\0';
			while (fc.getError_msg()[len - 1] == (byte)'\r' || fc.getError_msg()[len - 1] == (byte)'\n') {
				fc.getError_msg()[len - 1] = (byte)'\0';
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
	public static int flickcurl_get_current_request_wait(Object fc) {
		int wait_usec = 0;
		timeval now = new timeval();
		timeval uwait = new timeval();
		if (!fc.getLast_request_time().getTv_sec()) {
			return 0;
		} 
		ModernizedCProgram.gettimeofday(now, ((Object)0));
		.memcpy(uwait, fc.getLast_request_time(), );
		Object generatedTv_usec = uwait.getTv_usec();
		generatedTv_usec += 1000 * fc.getRequest_delay();
		Object generatedTv_sec = uwait.getTv_sec();
		if (generatedTv_usec >= 1000000) {
			generatedTv_sec += generatedTv_usec / 1000000;
			uwait.setTv_usec(generatedTv_usec % 1000000);
		} 
		if (generatedTv_sec > generatedTv_sec || (generatedTv_sec == generatedTv_sec && generatedTv_usec > generatedTv_usec)) {
			wait_usec = /* No need to delay */0;
		} else {
				uwait.setTv_sec((generatedTv_sec - generatedTv_sec));
				uwait.setTv_usec((generatedTv_usec - generatedTv_usec));
				if (generatedTv_usec < 0) {
					generatedTv_sec--;
					generatedTv_usec += 1000000;
				} 
				if (generatedTv_sec > 247) {
					wait_usec = -/* 'infinity' */1;
				} else {
						wait_usec = generatedTv_sec * 1000000 + generatedTv_usec;
				} 
		} 
		return wait_usec;
	}
	public static int flickcurl_invoke_common(Object fc, Object content_p, Object size_p, Object docptr_p) {
		curl_slist slist = ((Object)0);
		 doc = ((Object)0);
		timeval now = new timeval();
		int rc = 0/* skip "flickr." */;
		if (!fc.getUri()) {
			ModernizedCProgram.flickcurl_error(fc, "No Flickr URI prepared to invoke");
			return 1;
		} 
		if (content_p) {
			fc.setSave_content(1);
		} else {
				fc.setXml_parse_content(1);
		} 
		ModernizedCProgram.gettimeofday(now, ((Object)0));
		Object generatedTv_usec = uwait.getTv_usec();
		Object generatedTv_sec = uwait.getTv_sec();
		long generatedTv_nsec = nwait.getTv_nsec();
		if (fc.getLast_request_time().getTv_sec()) {
			timeval uwait = new timeval();
			.memcpy(uwait, fc.getLast_request_time(), );
			generatedTv_usec += 1000 * fc.getRequest_delay();
			if (generatedTv_usec >= 1000000) {
				generatedTv_sec += generatedTv_usec / 1000000;
				uwait.setTv_usec(generatedTv_usec % 1000000);
			} 
			if (generatedTv_sec > generatedTv_sec || (generatedTv_sec == generatedTv_sec && generatedTv_usec > generatedTv_usec)) {
			} else {
					timespec nwait = new timespec();
					nwait.setTv_sec(generatedTv_sec - generatedTv_sec);
					nwait.setTv_nsec(1000 * (generatedTv_usec - generatedTv_usec));
					if (generatedTv_nsec < 0) {
						generatedTv_sec--;
						generatedTv_nsec += 1000000000/* Wait until timeval 'wait' happens */;
					} 
					while (1) {
						timespec rem = new timespec();
						if (ModernizedCProgram.nanosleep(nwait, rem) < 0 && (._errno()) == EINTR) {
							.memcpy(nwait, rem, );
							continue;
						} 
						break;
					}
			} 
		} 
		.memcpy(fc.getLast_request_time(), now, );
		if (fc.getXc()) {
			if (fc.getXc().getMyDoc()) {
				.xmlFreeDoc(fc.getXc().getMyDoc());
				fc.getXc().setMyDoc(((Object)0));
			} 
			.xmlFreeParserCtxt(fc.getXc());
			fc.setXc(((Object)0));
		} 
		if (fc.getProxy()) {
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_PROXY, fc.getProxy());
		} 
		if (fc.getUser_agent()) {
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_USERAGENT, fc.getUser_agent());
		} 
		if (fc.getHttp_accept()) {
			slist = .curl_slist_append(slist, (byte)fc.getHttp_accept());
		} 
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_URL, fc.getUri());
		fc.setTotal_bytes(0);
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_NOBODY, /* default: read with no data: GET */1);
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_HTTPGET, 1);
		if (fc.getData()) {
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_NOBODY, /* CURLOPT_NOBODY = 0 sets http request to HEAD - do it first to override */0);
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_POST, /* this function only resets no-body flag for curl >= 7.14.1 */1);
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_POSTFIELDS, fc.getData());
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_POSTFIELDSIZE, fc.getData_length());
		}  else if (fc.getIs_write()) {
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_NOBODY, /* CURLOPT_NOBODY = 0 sets http request to HEAD - do it first to override */0);
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_POST, /* this function only resets no-body flag for curl >= 7.14.1 */1);
		} 
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_HTTPHEADER, /* set slist always - either a list of headers or none (NULL) */slist);
		.curl_easy_setopt(fc.getCurl_handle(), /* send all headers to this function */CURLOPT_HEADERFUNCTION, flickcurl_curl_header_callback);
		.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_WRITEHEADER, /* ... using this data pointer */fc);
		if (fc.getUpload_field()) {
			curl_httppost post = ((Object)0);
			curl_httppost last = ((Object)0);
			int i;
			for (i = 0; fc.getParam_fields()[i]; /* Main parameters */i++) {
				.curl_formadd(post, last, CURLFORM_PTRNAME, fc.getParam_fields()[i], CURLFORM_PTRCONTENTS, fc.getParam_values()[i], CURLFORM_END/* Upload parameter */);
			}
			.curl_formadd(post, last, CURLFORM_PTRNAME, fc.getUpload_field(), CURLFORM_FILE, fc.getUpload_value(), CURLFORM_END);
			.curl_easy_setopt(fc.getCurl_handle(), CURLOPT_HTTPPOST, /* Set the form info */post);
		} 
		if (fc.getCurl_setopt_handler()) {
			.UNRECOGNIZEDFUNCTIONNAME(fc.getCurl_handle(), fc.getCurl_setopt_handler_data());
		} 
		if (.curl_easy_perform(fc.getCurl_handle())) {
			fc.setFailed(/* failed */1);
			ModernizedCProgram.flickcurl_error(fc, "Method %s failed with CURL error %s", fc.getMethod(), fc.getError_buffer());
		} else {
				long lstatus;
				fc.setStatus_code(0);
				if (/* Requires pointer to a long */CURLE_OK == .curl_easy_getinfo(fc.getCurl_handle(), CURLINFO_HTTP_CODE, lstatus)) {
					fc.setStatus_code(lstatus);
				} 
				if (fc.getStatus_code() != 200) {
					if (fc.getMethod()) {
						ModernizedCProgram.flickcurl_error(fc, "Method %s failed with error %d - %s (HTTP %d)", fc.getMethod(), fc.getError_code(), fc.getError_msg(), fc.getStatus_code());
					} else {
							ModernizedCProgram.flickcurl_error(fc, "Call failed with error %d - %s (HTTP %d)", fc.getError_code(), fc.getError_msg(), fc.getStatus_code());
					} 
					fc.setFailed(1);
				} 
		} 
		if (slist) {
			.curl_slist_free_all(slist);
		} 
		if (fc.getFailed()) {
			;
		} 
		if (fc.getSave_content()) {
			byte c;
			flickcurl_chunk chunks = new flickcurl_chunk();
			c = (byte).malloc(fc.getTotal_bytes() + /* +1 for NUL */1);
			chunks = (flickcurl_chunk).malloc( * fc.getChunks_count());
			if (c && chunks) {
				flickcurl_chunk chunk = fc.getChunks();
				int i;
				byte p;
				for (i = fc.getChunks_count() - 1; i >= 0; /* create the ordered list of chunks */i--) {
					chunks[i] = chunk;
					chunk = chunk.getPrev();
				}
				p = c;
				for (i = 0; i < fc.getChunks_count(); i++) {
					.memcpy(p, chunks[i].getContent(), chunks[i].getSize());
					p += chunks[i].getSize();
					.free(chunks[i].getContent());
					.free(chunks[i]);
				}
				.free(chunks);
				fc.setChunks(((Object)/* saved chunks list is now freed */0));
				fc.setChunks_count(0);
				p = (byte)'\0';
				if (content_p) {
					content_p = c;
				} else {
						.free(c);
				} 
				if (size_p) {
					size_p = fc.getTotal_bytes();
				} 
			} else {
					if (c) {
						.free(c);
					} 
					if (chunks) {
						.free(chunks);
					} 
					ModernizedCProgram.flickcurl_error(fc, "Out of memory");
			} 
		} 
		if (fc.getXml_parse_content()) {
			 xnp = new ();
			 attr = new ();
			int failed = 0;
			.xmlParseChunk(fc.getXc(), ((Object)0), 0, 1);
			doc = fc.getXc().getMyDoc();
			if (!doc) {
				ModernizedCProgram.flickcurl_error(fc, "Failed to create XML DOM for document");
				fc.setFailed(1);
				;
			} 
			xnp = .xmlDocGetRootElement(doc);
			if (!xnp) {
				ModernizedCProgram.flickcurl_error(fc, "Failed to parse XML");
				fc.setFailed(1);
				;
			} 
			for (attr = xnp.getProperties(); attr; attr = attr.getNext()) {
				if (!.strcmp((byte)attr.getName(), "stat")) {
					byte attr_value = (byte)attr.getChildren().getContent();
					if (.strcmp(attr_value, "ok")) {
						failed = 1;
					} 
					break;
				} 
			}
			if (failed) {
				 err = xnp.getChildren().getNext();
				for (attr = err.getProperties(); attr; attr = attr.getNext()) {
					byte attr_name = (byte)attr.getName();
					byte attr_value = (byte)attr.getChildren().getContent();
					if (!.strcmp(attr_name, "code")) {
						fc.setError_code(.atoi(attr_value));
					}  else if (!.strcmp(attr_name, "msg")) {
						size_t attr_len = .strlen(attr_value);
						fc.setError_msg((byte).malloc(attr_len + 1));
						.memcpy(fc.getError_msg(), attr_value, attr_len + 1);
					} 
				}
				if (fc.getMethod()) {
					ModernizedCProgram.flickcurl_error(fc, "Method %s failed with error %d - %s", fc.getMethod(), fc.getError_code(), fc.getError_msg());
				} else {
						ModernizedCProgram.flickcurl_error(fc, "Call failed with error %d - %s", fc.getError_code(), fc.getError_msg());
				} 
				fc.setFailed(1);
			} else {
					if (/* pass DOM as an output parameter */docptr_p) {
						docptr_p = doc;
					} 
			} 
		} 
		fc.setSign(/* reset special flags */0);
		return rc;
	}
	public static Object flickcurl_invoke(Object fc) {
		 docptr = ((Object)0);
		if (!ModernizedCProgram.flickcurl_invoke_common(fc, ((Object)0), ((Object)0), docptr)) {
			return docptr;
		} 
		return ((Object)0);
	}
	public static Object flickcurl_invoke_get_content(Object fc, Object size_p) {
		byte content = ((Object)0);
		if (!ModernizedCProgram.flickcurl_invoke_common(fc, content, size_p, ((Object)0))) {
			return content;
		} 
		return ((Object)0/*
		 * INTERNAL - free a form.
		 */);
	}
	public static void flickcurl_free_form(Object form) {
		if (!form) {
			return ;
		} 
		if (form[/* free content which is the first key */0]) {
			.free(form[0]);
		} 
		.free(form/*
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
	public static Object flickcurl_invoke_get_form_content(Object fc, Object count_p) {
		byte content = ((Object)0);
		byte form = ((Object)0);
		byte p;
		int count = 0;
		int i;
		if (ModernizedCProgram.flickcurl_invoke_common(fc, content, ((Object)0), ((Object)0))) {
			return ((Object)0);
		} 
		if (content) {
			for (p = content; p; p++) {
				if (p == (byte)'&') {
					count++;
				} 
			}
			/* counting separators so need +1 for number of contents */count/* Allocate 1+ count + 1 sized array of char* (key, value) pointers
			   * The last pair are always (NULL, NULL).
			   *
			   * The pointers are into the 'content' buffer which is kept around
			   * and owned by this array and stored in form[0].
			   */++;
		} 
		form = (byte).calloc(1 + 2 * (count + 1), );
		if (!form) {
			if (content) {
				.free(content);
			} 
			return ((Object)0);
		} 
		form[0] = /* the form owns the content array */content;
		if (content) {
			for (; p; p++) {
				byte start = p;
				while (p && p != (byte)'&' && p != (byte)'=') {
					p++;
				}
				form[i++] = start;
				if (!p) {
					break;
				} 
				p = (byte)'\0';
			}
			form[i++] = ((Object)0);
			form[i] = ((Object)0);
		} 
		if (count_p) {
			count_p = count;
		} 
		return form;
	}
	public static Object flickcurl_unixtime_to_isotime(Object unix_time) {
		tm structured_time = new tm();
		byte[] date_buffer = new byte[20 + 1];
		size_t len = new size_t();
		byte value = ((Object)0);
		structured_time = (tm).gmtime(unix_time);
		len = 20;
		.strftime(date_buffer, len + 1, "%Y-%m-%dT%H:%M:%SZ", structured_time);
		value = (byte).malloc(len + 1);
		.memcpy(value, date_buffer, len + 1);
		return value;
	}
	public static Object flickcurl_unixtime_to_sqltimestamp(Object unix_time) {
		tm structured_time = new tm();
		byte[] date_buffer = new byte[19 + 1];
		size_t len = new size_t();
		byte value = ((Object)0);
		structured_time = (tm).gmtime(unix_time);
		len = 19;
		.strftime(date_buffer, , "%Y %m %d %H:%M:%S", structured_time);
		value = (byte).malloc(len + 1);
		.memcpy(value, date_buffer, len + 1);
		return value;
	}
	public static Object flickcurl_sqltimestamp_to_isotime(Object timestamp) {
		size_t len = /* ISO DATE FORMAT     "%Y-%m-%dT%H:%M:%SZ" (20 chars) */20;
		byte value = ((Object)0);
		value = (byte).malloc(len + 1);
		.memcpy(value, timestamp, 19);
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
	public static Object flickcurl_xpath_eval(Object fc, Object xpathCtx, Object xpathExpr) {
		 xpathObj = ((Object)0);
		 nodes = new ();
		int i;
		byte value = ((Object)0);
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		if (.xmlXPathNodeSetIsEmpty(nodes)) {
			;
		} 
		for (i = 0; i < .xmlXPathNodeSetGetLength(nodes); i++) {
			 node = nodes.getNodeTab()[i];
			if (node.getType() != XML_ATTRIBUTE_NODE && node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			if (node.getChildren()) {
				size_t len = .strlen((byte)node.getChildren().getContent());
				value = (byte).malloc(len + 1);
				.memcpy(value, node.getChildren().getContent(), len + 1);
			} 
			break;
		}
		return value;
	}
	public static Object flickcurl_xpath_eval_to_tree_string(Object fc, Object xpathNodeCtx, Object xpathExpr, Object length_p) {
		 xpathObj = ((Object)0);
		 sd_node = new ();
		 buffer = ((Object)0);
		 save_ctxt = ((Object)0);
		byte value = ((Object)0);
		size_t value_len = 0;
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathNodeCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		if (.xmlXPathNodeSetIsEmpty(nodes)) {
			;
		} 
		sd_node = nodes.getNodeTab()[0];
		buffer = .xmlBufferCreate();
		if (!buffer) {
			;
		} 
		save_ctxt = .xmlSaveToBuffer(buffer, ((Object)0), /* encoding *//* opts */0);
		.xmlSaveTree(save_ctxt, sd_node);
		.xmlSaveFlush(save_ctxt);
		value_len = .xmlBufferLength(buffer);
		if (!value_len) {
			;
		} 
		value = (byte).malloc(value_len + 1);
		if (!value) {
			;
		} 
		.memcpy(value, .xmlBufferContent(buffer), value_len + 1);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj);
		} 
		if (value && length_p) {
			length_p = value_len;
		} 
		return value/**
		 * flickcurl_set_write:
		 * @fc: flickcurl object
		 * @is_write: writeable flag
		 *
		 * Set writeable flag.
		 */;
	}
	public static void flickcurl_set_write(Object fc, int is_write) {
		fc.setIs_write(is_write/**
		 * flickcurl_set_data:
		 * @fc: flickcurl object
		 * @data: data pointer
		 * @data_length: data length
		 *
		 * Set web service request content data.
		 */);
	}
	public static void flickcurl_set_data(Object fc, Object data, Object data_length) {
		if (fc.getData()) {
			if (fc.getData_is_xml()) {
				.xmlFree(fc.getData());
			} 
		} 
		fc.setData(data);
		fc.setData_length(data_length);
		fc.setData_is_xml(0/**
		 * flickcurl_set_xml_data:
		 * @fc: flickcurl object
		 * @doc: XML dom
		 *
		 * Set web service request content data from XML DOM.
		 */);
	}
	public static void flickcurl_set_xml_data(Object fc, Object doc) {
		 mem = new ();
		int size;
		if (fc.getData()) {
			if (fc.getData_is_xml()) {
				.xmlFree(fc.getData());
			} 
		} 
		.xmlDocDumpFormatMemory(doc, mem, size, /* format 1 means indent */1);
		fc.setData(mem);
		fc.setData_length((size_t)size);
		fc.setData_is_xml(1);
	}
	public static Object flickcurl_get_field_value_type_label( datatype) {
		if (datatype <= .VALUE_TYPE_LAST) {
			return ModernizedCProgram.flickcurl_field_value_type_label[(int)datatype];
		} 
		return ((Object)0);
	}
	public static Object flickcurl_call_get_one_string_field(Object fc, Object key, Object value, Object method, Object xpathExpr) {
		byte result = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (key && value) {
			ModernizedCProgram.flickcurl_add_param(fc, key, value);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, method)) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			result = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, xpathExpr);
		} 
		.xmlXPathFreeContext(xpathCtx);
	}
	public static Object flickcurl_array_join(Object array, byte delim) {
		int i;
		int array_size;
		size_t len = 0;
		byte str;
		byte p;
		for (i = 0; array[i]; i++) {
			len += .strlen(array[i]) + 1;
		}
		array_size = i;
		str = (byte).malloc(len + 1);
		if (!str) {
			return ((Object)0);
		} 
		p = str;
		for (i = 0; array[i]; i++) {
			size_t item_len = .strlen(array[i]);
			.memcpy(p, array[i], item_len);
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
	public static Object flickcurl_array_split(Object str, byte delim) {
		int i;
		int array_size = 1;
		byte array;
		for (i = 0; str[i]; i++) {
			if (str[i] == delim) {
				array_size++;
			} 
		}
		array = (byte).malloc( * (array_size + 1));
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
			array[i] = (byte).malloc(item_len + 1);
			if (!array[i]) {
				while (--i >= 0) {
					.free(array[i]);
				}
				.free(array);
				return ((Object)0);
			} 
			.memcpy(array[i], str, item_len);
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
	public static void flickcurl_array_free(Object array) {
		int i;
		for (i = 0; array[i]; i++) {
			.free(array[i]);
		}
		.free(array);
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
		content_type = (int).strtol(content_type_string, endptr, 10);
		if (endptr && /* If not all of string was used - fail */endptr) {
			content_type = -1;
		} 
		if (content_type < 1 || content_type > 3) {
			int i;
			for (i = 1; i < 3; i++) {
				if (!.strcmp(ModernizedCProgram.flickcurl_content_type_labels[i], content_type_string)) {
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
		safety_level = (int).strtol(safety_level_string, endptr, 10);
		if (endptr && /* If not all of string was used - fail */endptr) {
			safety_level = -1;
		} 
		if (safety_level < 1 || safety_level > 4) {
			int i;
			for (i = 1; i < 4; i++) {
				if (!.strcmp(ModernizedCProgram.flickcurl_safety_level_labels[i], safety_level_string)) {
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
		hidden = (int).strtol(hidden_string, endptr, 10);
		if (endptr && /* If not all of string was used - fail */endptr) {
			hidden = -1;
		} 
		if (hidden < 1 || hidden > 2) {
			int i;
			for (i = 1; i < 2; i++) {
				if (!.strcmp(ModernizedCProgram.flickcurl_hidden_labels[i], hidden_string)) {
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
	public static int flickcurl_append_photos_list_params(Object fc, Object list_params, Object format_p) {
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
		if (list_params.getExtras()) {
			ModernizedCProgram.flickcurl_add_param(fc, "extras", list_params.getExtras());
			this_count++;
		} 
		if (list_params.getPer_page()) {
			if (list_params.getPer_page() >= 0 && list_params.getPer_page() <= 999) {
				.sprintf(per_page_s, "%d", list_params.getPer_page());
				ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
				this_count++;
			} 
		} 
		if (list_params.getPage()) {
			if (list_params.getPage() >= 0 && list_params.getPage() <= 999) {
				.sprintf(page_s, "%d", list_params.getPage());
				ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
				this_count++;
			} 
		} 
		if (list_params.getFormat()) {
			ModernizedCProgram.flickcurl_add_param(fc, "format", list_params.getFormat());
			this_count++;
			if (format_p) {
				format_p = list_params.getFormat();
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
	public static int flickcurl_photos_list_params_init(Object list_params) {
		if (!list_params) {
			return 1;
		} 
		.memset(list_params, (byte)'\0', );
		list_params.setVersion(1);
		list_params.setExtras(((Object)0));
		list_params.setFormat(((Object)0));
		list_params.setPage(-1);
		list_params.setPer_page(-1);
		return 0/**
		 * flickcurl_search_params_init:
		 * @params: search params to init
		 *
		 * Initialise an existing search parameters structure
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public static int flickcurl_search_params_init(Object params) {
		.memset(params, (byte)'\0', /* These are the numeric fields and are all set to 0 or 0.0 by the memset() */);
		return /* strictly lat and lon are ignored if radius is 0.0 *//* The remaining fields are pointers and are set to NULL by the memset() */0/**
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
	public static void flickcurl_set_curl_setopt_handler(Object fc, Object curl_handler, Object curl_handler_data) {
		fc.setCurl_setopt_handler(curl_handler);
		fc.setCurl_setopt_handler_data(curl_handler_data);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * groups-pools-api.c - Flickr flickr.groups.pool.* API calls
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
	 * flickcurl_groups_pools_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add to the group pool.
	 * @group_id: The NSID of the group who's pool the photo is to be added to.
	 * 
	 * Add a photo to a group's pool.
	 *
	 * Implements flickr.groups.pools.add (0.12)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_groups_pools_add(Object fc, Object photo_id, Object group_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !group_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.pools.add")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_pools_getContext:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @group_id: group ID
		 * 
		 * Get next and previous photos for a photo in a group pool.
		 * 
		 * Implements flickr.groups.pools.getContext (0.7)
		 *
		 * Return value: an array of size 3 [prev, next, NULL] flickcurl_context*
		 * or NULL on error
		 **/;
	}
	public static Object flickcurl_groups_pools_getContext(Object fc, Object photo_id, Object group_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id || !group_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.pools.getContext")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		contexts = ModernizedCProgram.flickcurl_build_contexts(fc, doc);
		return contexts/**
		 * flickcurl_groups_pools_getGroups:
		 * @fc: flickcurl context
		 * @per_page: Number of groups to return per page (default 400, max 400)
		 * @page: The page of results to return (default 1)
		 * 
		 * Returns a list of groups to which you can add photos.
		 *
		 * Implements flickr.groups.pools.getGroups (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_groups_pools_getGroups(Object fc, int page, int per_page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		byte[] per_page_s = new byte[10];
		byte[] page_s = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		.sprintf(page_s, "%d", page);
		ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		.sprintf(per_page_s, "%d", per_page);
		ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.pools.getGroups")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		groups = ModernizedCProgram.flickcurl_build_groups(fc, xpathCtx, ()"/rsp/groups/group", ((Object)0));
		if (fc.getFailed()) {
			if (groups) {
				ModernizedCProgram.flickcurl_free_groups(groups);
			} 
			groups = ((Object)0);
		} 
		return groups/**
		 * flickcurl_groups_pools_getPhotos_params:
		 * @fc: flickcurl context
		 * @group_id: The id of the group who's pool you which to get the photo list for.
		 * @tags: A tag to filter the pool with. At the moment only one tag at a time is supported. (or NULL)
		 * @user_id: The nsid of a user (or NULL).  If given, retrieves only photos that the user has contributed to the group pool.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of pool photos for a given group.
		 *
		 * Currently supported extra fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format,
		 * last_update, geo, tags, machine_tags.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_groups_pools_getPhotos_params(Object fc, Object group_id, Object tags, Object user_id, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!group_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", /* API parameters */group_id);
		if (tags) {
			ModernizedCProgram.flickcurl_add_param(fc, "tags", tags);
		} 
		if (user_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.pools.getPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_groups_pools_getPhotos(Object fc, Object group_id, Object tags, Object user_id, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static int flickcurl_groups_pools_remove(Object fc, Object photo_id, Object group_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !group_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.pools.remove")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result;
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
	public static Object flickcurl_tags_getClusterPhotos(Object fc, Object tag, Object cluster_id, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!tag || !cluster_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "tag", tag);
		ModernizedCProgram.flickcurl_add_param(fc, "cluster_id", cluster_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getClusterPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_tags_getClusters(Object fc, Object tag) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag_clusters clusters = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!tag) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "tag", tag);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getClusters")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		clusters = ModernizedCProgram.flickcurl_build_tag_clusters(fc, xpathCtx, ()"/rsp/clusters/cluster");
		if (fc.getFailed()) {
			if (clusters) {
				ModernizedCProgram.flickcurl_free_tag_clusters(clusters);
			} 
			clusters = ((Object)0);
		} 
		return clusters/**
		 * flickcurl_tags_getHotList:
		 * @fc: flickcurl context
		 * @period: The period for which to fetch hot tags. Valid values are day and
		 *   week (defaults to day).
		 * @tag_count: The number of tags to return. Defaults to 20. Maximum allowed
		 *   value is 200 (or -1 to leave as default)
		 *
		 * Returns a list of hot tags for the given period.
		 *
		 * Implements flickr.tags.getHotList (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public static Object flickcurl_tags_getHotList(Object fc, Object period, int tag_count) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag tags = ((Object)0);
		byte[] tag_count_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (period) {
			if (!.strcmp(period, "day") || !.strcmp(period, "week")) {
				ModernizedCProgram.flickcurl_add_param(fc, "period", period);
			} else {
					return ((Object)0);
			} 
		} 
		if (tag_count >= 0) {
			.sprintf(tag_count_str, "%d", tag_count);
			ModernizedCProgram.flickcurl_add_param(fc, "count", tag_count_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getHotList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/hottags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListPhoto:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 *
		 * Get the tag list for a given photo.
		 *
		 * Implements flickr.tags.getListPhoto (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public static Object flickcurl_tags_getListPhoto(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag tags = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getListPhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/photo/tags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListUser:
		 * @fc: flickcurl context
		 * @user_id: user NSID (or NULL)
		 *
		 * Get the tag list for a given user (or current user)
		 *
		 * Implements flickr.tags.getListUser (0.9)
		 * 
		 * FIXME: API docs says user_id is optional but it is not.
		 *
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public static Object flickcurl_tags_getListUser(Object fc, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag tags = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (user_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getListUser")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListUserPopular:
		 * @fc: flickcurl context
		 * @user_id: user NSID (or NULL)
		 * @pop_count: number of popular tags to return (or <0 for default)
		 *
		 * Get the popular tag list for a given user (or current user)
		 *
		 * Implements flickr.tags.getListUserPopular (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public static Object flickcurl_tags_getListUserPopular(Object fc, Object user_id, int pop_count) {
		byte[] pop_count_str = new byte[10];
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag tags = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (user_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		} 
		if (pop_count >= 0) {
			.sprintf(pop_count_str, "%d", pop_count);
			ModernizedCProgram.flickcurl_add_param(fc, "count", pop_count_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getListUserPopular")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getListUserRaw:
		 * @fc: flickcurl context
		 * @tag: tag to get raw version of (or NULL for all)
		 *
		 * Get the raw versions of a given tag (or all tags) for the currently logged-in user.
		 *
		 * Implements flickr.tags.getListUserRaw (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public static Object flickcurl_tags_getListUserRaw(Object fc, Object tag) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag tags = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (tag) {
			ModernizedCProgram.flickcurl_add_param(fc, "tag", tag);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getListUserRaw")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getMostFrequentlyUsed:
		 * @fc: flickcurl context
		 *
		 * Returns a list of most frequently used tags for a user.
		 *
		 * Implements flickr.tags.getMostFrequentlyUsed (1.25)
		 *
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public static Object flickcurl_tags_getMostFrequentlyUsed(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag tags = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getMostFrequentlyUsed")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/who/tags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags/**
		 * flickcurl_tags_getRelated:
		 * @fc: flickcurl context
		 * @tag: tag to fetch related tags for
		 *
		 * Get a list of tags 'related' to the given tag, based on clustered usage analysis.
		 *
		 * Implements flickr.tags.getRelated (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	public static Object flickcurl_tags_getRelated(Object fc, Object tag) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag tags = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!tag) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "tag", tag);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.tags.getRelated")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/tags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags;
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
	public static void flickcurl_free_gallery(Object gallery) {
		do {
			if (!gallery) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_gallery is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\gallery.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (gallery.getId()) {
			.free(gallery.getId());
		} 
		if (gallery.getUrl()) {
			.free(gallery.getUrl());
		} 
		if (gallery.getOwner()) {
			.free(gallery.getOwner());
		} 
		if (gallery.getPrimary_photo()) {
			ModernizedCProgram.flickcurl_free_photo(gallery.getPrimary_photo());
		} 
		if (gallery.getTitle()) {
			.free(gallery.getTitle());
		} 
		if (gallery.getDescription()) {
			.free(gallery.getDescription());
		} 
		.free(gallery/**
		 * flickcurl_free_galleries:
		 * @galleries_object: gallery object array
		 *
		 * Destructor for array of gallery objects
		 */);
	}
	public static void flickcurl_free_galleries(Object galleries_object) {
		int i;
		do {
			if (!galleries_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_gallery_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\gallery.c", 80, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; galleries_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_gallery(galleries_object[i]);
		}
		.free(galleries_object);
	}
	public static Object flickcurl_build_galleries(Object fc, Object xpathCtx, Object xpathExpr, Object gallery_count_p) {
		flickcurl_gallery galleries = ((Object)0);
		int nodes_count;
		int gallery_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		galleries = (flickcurl_gallery).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_gallery g = new flickcurl_gallery();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			g = (flickcurl_gallery).calloc(, 1);
			g.setPrimary_photo((flickcurl_photo).calloc(, /* initialise primary photo object */1/* assumes it is a photo */));
			g.getPrimary_photo().setMedia_type((byte).malloc(5 + 1));
			.memcpy(g.getPrimary_photo().getMedia_type(), "photo", 5 + 1);
			g.getPrimary_photo().setTags((flickcurl_tag).calloc(, /* empty list of tags (1 NULL pointer) */1));
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					g.setId(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					g.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "owner")) {
					g.setOwner(attr_value);
				}  else if (!.strcmp(attr_name, "date_create")) {
					g.setDate_create(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "date_update")) {
					g.setDate_update(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_id")) {
					g.getPrimary_photo().setId(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_server")) {
					g.getPrimary_photo().getFields()[.PHOTO_FIELD_server].setInteger((flickcurl_photo_field_type).atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_farm")) {
					g.getPrimary_photo().getFields()[.PHOTO_FIELD_farm].setInteger((flickcurl_photo_field_type).atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_secret")) {
					g.getPrimary_photo().getFields()[.PHOTO_FIELD_secret].setString(attr_value);
				}  else if (!.strcmp(attr_name, "count_photos")) {
					g.setCount_photos(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "count_videos")) {
					g.setCount_videos(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "title")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							g.setTitle((byte).malloc(len + 1));
							.memcpy(g.getTitle(), chnode.getChildren().getContent(), len + 1);
						} 
					}  else if (!.strcmp(chnode_name, "description")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							g.setDescription((byte).malloc(len + 1));
							.memcpy(g.getDescription(), chnode.getChildren().getContent(), len + 1/* end for children of <item> */);
						} 
					} 
				} 
			}
			galleries[gallery_count++] = g/* for nodes */;
		}
		if (gallery_count_p) {
			gallery_count_p = gallery_count;
		} 
		return galleries;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photosets-api.c - Flickr flickr.photosets.* API calls
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
	 * flickcurl_photosets_addPhoto:
	 * @fc: flickcurl context
	 * @photoset_id: The id of the photoset to add a photo to.
	 * @photo_id: The id of the photo to add to the set.
	 * 
	 * Add a photo to the end of an existing photoset.
	 *
	 * Implements flickr.photosets.addPhoto (0.13)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_photosets_addPhoto(Object fc, Object photoset_id, Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id || !photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.addPhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_create:
		 * @fc: flickcurl context
		 * @title: A title for the photoset.
		 * @description: A description of the photoset which may contain limited html (or NULL)
		 * @primary_photo_id: The id of the photo to represent this set. The photo must belong to the calling user.
		 * @photoset_url_p: pointer to variable to store new photoset URL (or NULL)
		 * 
		 * Create a new photoset for the calling user.
		 *
		 * Implements flickr.photosets.create (0.13)
		 * 
		 * Return value: photoset ID or NULL on failure
		 **/;
	}
	public static Object flickcurl_photosets_create(Object fc, Object title, Object description, Object primary_photo_id, Object photoset_url_p) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte photoset_id = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!title || !primary_photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "title", title);
		if (description) {
			ModernizedCProgram.flickcurl_add_param(fc, "description", description);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "primary_photo_id", primary_photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.create")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		photoset_id = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/photoset/@id");
		if (photoset_url_p) {
			photoset_url_p = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/photoset/@url");
		} 
		if (fc.getFailed()) {
			if (photoset_id) {
				.free(photoset_id);
			} 
			photoset_id = ((Object)0);
		} 
		return photoset_id/**
		 * flickcurl_photosets_delete:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to delete. Must be owned by the calling user.
		 * 
		 * Delete a photoset.
		 *
		 * Implements flickr.photosets.delete (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_delete(Object fc, Object photoset_id) {
		 doc = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.delete")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
	}
	public static int flickcurl_photosets_editMeta(Object fc, Object photoset_id, Object title, Object description) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id || !title) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_add_param(fc, "title", title);
		if (description) {
			ModernizedCProgram.flickcurl_add_param(fc, "description", description);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.editMeta")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_editPhotos:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to modify. Must belong to the calling user.
		 * @primary_photo_id: The id of the photo to use as the 'primary' photo for the set. This id must also be passed along in photo_ids list argument.
		 * @photo_ids_array: Array of photo ids to include in the set. They will appear in the set in the order sent. This list MUST contain the primary photo id. All photos must belong to the owner of the set. This list of photos replaces the existing list. Call flickr.photosets.addPhoto to append a photo to a set.
		 * 
		 * Modify the photos in a photoset.
		 *
		 * Use this method to add, remove and re-order photos.
		 *
		 * Implements flickr.photosets.editPhotos (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_editPhotos(Object fc, Object photoset_id, Object primary_photo_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id || !primary_photo_id || !photo_ids_array) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_add_param(fc, "primary_photo_id", primary_photo_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		ModernizedCProgram.flickcurl_add_param(fc, "photo_ids", photo_ids);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.editPhotos")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		if (photo_ids) {
			.free(photo_ids);
		} 
		return result/**
		 * flickcurl_photosets_getContext:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @photoset_id: photoset ID
		 *
		 * Get next and previous photos for a photo in a set.
		 * 
		 * Implements flickr.photosets.getContext (0.7)
		 *
		 * Return value: an array of size 3 [prev, next, NULL] flickcurl_context*
		 * or NULL on error
		 **/;
	}
	public static Object flickcurl_photosets_getContext(Object fc, Object photo_id, Object photoset_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id || !photoset_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.getContext")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		contexts = ModernizedCProgram.flickcurl_build_contexts(fc, doc);
		return contexts/**
		 * flickcurl_photosets_getInfo:
		 * @fc: flickcurl context
		 * @photoset_id: The ID of the photoset to fetch information for.
		 * 
		 * Gets information about a photoset.
		 *
		 * Implements flickr.photosets.getInfo (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_photosets_getInfo(Object fc, Object photoset_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photoset photoset = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photoset_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		photoset = ModernizedCProgram.flickcurl_build_photoset(fc, xpathCtx);
		if (fc.getFailed()) {
			if (photoset) {
				ModernizedCProgram.flickcurl_free_photoset(photoset);
			} 
			photoset = ((Object)0);
		} 
		return photoset/**
		 * flickcurl_photosets_getList:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to get a photoset list for. If none is specified, the calling user is assumed (or NULL)
		 * 
		 * Returns the photosets belonging to the specified user.
		 *
		 * Implements flickr.photosets.getList (0.13)
		 * 
		 * Return value: array of photoset IDs or NULL on failure
		 **/;
	}
	public static Object flickcurl_photosets_getList(Object fc, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photoset photoset_list = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (user_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		photoset_list = ModernizedCProgram.flickcurl_build_photosets(fc, xpathCtx, ()"/rsp/photosets/photoset", ((Object)0));
		if (fc.getFailed()) {
			if (photoset_list) {
				ModernizedCProgram.flickcurl_free_photosets(photoset_list);
			} 
			photoset_list = ((Object)0);
		} 
		return photoset_list/**
		 * flickcurl_photosets_getPhotos_params:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to return the photos for.
		 * @privacy_filter: Return photos only matching a certain privacy level 1-5 (or <0)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get the list of photos in a set.
		 *
		 * Currently supported extra fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format,
		 * last_update.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public static Object flickcurl_photosets_getPhotos_params(Object fc, Object photoset_id, int privacy_filter, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] privacy_filter_str = new byte[2];
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photoset_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", /* API parameters */photoset_id);
		if (privacy_filter >= 1 && privacy_filter <= 5) {
			.sprintf(privacy_filter_str, "%d", privacy_filter);
			ModernizedCProgram.flickcurl_add_param(fc, "privacy_filter", privacy_filter_str);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.getPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photoset", format);
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
	public static Object flickcurl_photosets_getPhotos(Object fc, Object photoset_id, Object extras, int privacy_filter, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static int flickcurl_photosets_orderSets(Object fc, Object photoset_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photoset_ids;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photoset_ids_array) {
			return 1;
		} 
		photoset_ids = ModernizedCProgram.flickcurl_array_join(photoset_ids_array, (byte)',');
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_ids", photoset_ids);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.orderSets")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		if (photoset_ids) {
			.free(photoset_ids);
		} 
		return result/**
		 * flickcurl_photosets_removePhoto:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to remove a photo from.
		 * @photo_id: The id of the photo to remove from the set.
		 * 
		 * Remove a photo from a photoset.
		 *
		 * Implements flickr.photosets.removePhoto (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_removePhoto(Object fc, Object photoset_id, Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id || !photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.removePhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_removePhotos:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to remove photos from.
		 * @photo_ids_array: Array of photo ids to remove from the photoset.
		 * 
		 * Remove multiple photos from a photoset.
		 *
		 * Implements flickr.photosets.removePhotos (1.19)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_removePhotos(Object fc, Object photoset_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id || !photo_ids_array) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		ModernizedCProgram.flickcurl_add_param(fc, "photo_ids", photo_ids);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.removePhotos")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		if (fc.getFailed()) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photosets_reorderPhotos:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to reorder. The photoset must belong to the calling user.
		 * @photo_ids_array: Array of Ordered list of photo ids.  Photos that are not in the list will keep their original order
		 * 
		 * (null)
		 *
		 * Implements flickr.photosets.reorderPhotos (1.19)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_reorderPhotos(Object fc, Object photoset_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photoset_id || !photo_ids_array) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		ModernizedCProgram.flickcurl_add_param(fc, "photo_ids", photo_ids);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.reorderPhotos")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		if (fc.getFailed()) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photosets_setPrimaryPhoto:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to set primary photo to.
		 * @photo_id: The id of the photo to set as primary.
		 * 
		 * Set photoset primary photo
		 *
		 * Implements flickr.photosets.setPrimaryPhoto (1.19)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_setPrimaryPhoto(Object fc, Object photoset_id, Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id || !photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.setPrimaryPhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickr.photos.upload-api.c - Flickr flickr.photos.upload.* API calls
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
	 * flickcurl_photos_upload_checkTickets:
	 * @fc: flickcurl context
	 * @tickets_ids: Array of ticket ids
	 * 
	 * Checks the status of one or more asynchronous photo upload tickets.
	 *
	 * Implements flickr.photos.upload.checkTickets (0.13)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static Object flickcurl_photos_upload_checkTickets(Object fc, Object tickets_ids) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_ticket tickets = ((Object)0);
		byte tickets_ids_string = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!tickets_ids) {
			return ((Object)0);
		} 
		tickets_ids_string = ModernizedCProgram.flickcurl_array_join(tickets_ids, (byte)',');
		ModernizedCProgram.flickcurl_add_param(fc, "tickets", tickets_ids_string);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.upload.checkTickets")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tickets = ModernizedCProgram.flickcurl_build_tickets(fc, xpathCtx, ()"/rsp/uploader/ticket", ((Object)0));
		if (fc.getFailed()) {
			if (tickets) {
				ModernizedCProgram.flickcurl_free_tickets(tickets);
			} 
			tickets = ((Object)0);
		} 
		if (tickets_ids_string) {
			.free(tickets_ids_string);
		} 
		return tickets;
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
	public static void flickcurl_free_perms(Object perms) {
		do {
			if (!perms) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_perms is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\perms.c", 46, __func__);
				return ;
			} 
		} while (0);
		.free(perms);
	}
	public static Object flickcurl_build_perms(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_perms perms = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do perms */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				continue;
			} 
			perms = (flickcurl_perms).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					;
				}  else if (!.strcmp(attr_name, "ispublic")) {
					perms.setIs_public(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "iscontact")) {
					perms.setIs_contact(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "isfriend")) {
					perms.setIs_friend(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "isfamily")) {
					perms.setIs_family(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "permcomment")) {
					perms.setPerm_comment(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "permaddmeta")) {
					perms.setPerm_addmeta(.atoi(attr_value));
				} 
				.free(attr_value);
			}
			break;
		}
		return perms;
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
	public static void flickcurl_free_size(Object size) {
		do {
			if (!size) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_size is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\size.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (size.getLabel()) {
			.free(size.getLabel());
		} 
		if (size.getSource()) {
			.free(size.getSource());
		} 
		if (size.getUrl()) {
			.free(size.getUrl());
		} 
		if (size.getMedia()) {
			.free(size.getMedia());
		} 
		.free(size/**
		 * flickcurl_free_sizes:
		 * @sizes_object: size object array
		 *
		 * Destructor for array of size objects
		 */);
	}
	public static void flickcurl_free_sizes(Object sizes_object) {
		int i;
		do {
			if (!sizes_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_size_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\size.c", 75, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; sizes_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_size(sizes_object[i]);
		}
		.free(sizes_object);
	}
	public static Object flickcurl_build_sizes(Object fc, Object xpathCtx, Object xpathExpr, Object size_count_p) {
		flickcurl_size sizes = ((Object)0);
		int nodes_count;
		int size_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		sizes = (flickcurl_size).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_size s = new flickcurl_size();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			s = (flickcurl_size).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "label")) {
					s.setLabel(attr_value);
				}  else if (!.strcmp(attr_name, "width")) {
					s.setWidth(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "height")) {
					s.setHeight(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "source")) {
					s.setSource(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					s.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "media")) {
					s.setMedia(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			sizes[size_count++] = s/* for nodes */;
		}
		if (size_count_p) {
			size_count_p = size_count;
		} 
		return sizes;
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
	public static void flickcurl_free_photo(Object photo) {
		int i;
		do {
			if (!photo) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photo is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photo.c", 130, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; i <= .PHOTO_FIELD_LAST; i++) {
			if (photo.getFields()[i].getString()) {
				.free(photo.getFields()[i].getString());
			} 
		}
		ModernizedCProgram.flickcurl_free_tags(photo.getTags());
		for (i = 0; i < photo.getNotes_count(); i++) {
			ModernizedCProgram.flickcurl_free_note(photo.getNotes()[i]);
		}
		.free(photo.getNotes());
		if (photo.getId()) {
			.free(photo.getId());
		} 
		if (photo.getUri()) {
			.free(photo.getUri());
		} 
		if (photo.getMedia_type()) {
			.free(photo.getMedia_type());
		} 
		if (photo.getPlace()) {
			ModernizedCProgram.flickcurl_free_place(photo.getPlace());
		} 
		if (photo.getVideo()) {
			ModernizedCProgram.flickcurl_free_video(photo.getVideo());
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
	public static Object flickcurl_photo_as_source_uri(Object photo, Object c) {
		byte[] buf = new byte[512];
		byte result;
		size_t len = new size_t();
		if (c == (byte)'o') {
			.sprintf(buf, /* https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{o-secret}_o.(jpg|gif|png) */"https://farm%s.staticflickr.com/%s/%s_%s_o.%s", photo.getFields()[.PHOTO_FIELD_farm].getString(), photo.getFields()[.PHOTO_FIELD_server].getString(), photo.getId(), photo.getFields()[.PHOTO_FIELD_originalsecret].getString(), photo.getFields()[.PHOTO_FIELD_originalformat].getString());
		}  else if (c == (byte)'m' || c == (byte)'s' || c == (byte)'t' || c == (byte)'b') {
			.sprintf(buf, /* https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}_[mstb].jpg */"https://farm%s.staticflickr.com/%s/%s_%s_%c.jpg", photo.getFields()[.PHOTO_FIELD_farm].getString(), photo.getFields()[.PHOTO_FIELD_server].getString(), photo.getId(), photo.getFields()[.PHOTO_FIELD_secret].getString(), c);
		} else {
				.sprintf(buf, /* https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}.jpg */"https://farm%s.staticflickr.com/%s/%s_%s.jpg", photo.getFields()[.PHOTO_FIELD_farm].getString(), photo.getFields()[.PHOTO_FIELD_server].getString(), photo.getId(), photo.getFields()[.PHOTO_FIELD_secret].getString());
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
	public static Object flickcurl_photo_as_page_uri(Object photo) {
		byte[] buf = new byte[512];
		byte result;
		size_t len = new size_t();
		.sprintf(buf, /* https://www.flickr.com/photos/{owner}/{photo id}/ */"https://www.flickr.com/photos/%s/%s", photo.getFields()[.PHOTO_FIELD_owner_nsid].getString(), photo.getId());
		len = .strlen(buf);
		result = (byte).malloc(len + 1);
		.memcpy(result, buf, len + 1);
		return result;
	}
	public static Object flickcurl_photo_id_as_short_uri(Object photo_id) {
		byte[] buf = new byte[58 + 1];
		int base_count = 58;
		byte p;
		byte r;
		long num = .atoll(photo_id);
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
		result = (byte).malloc((p - buf) + 17 + 1);
		if (!result) {
			return ((Object)0);
		} 
		r = result;
		.memcpy(result, ModernizedCProgram.short_uri_prefix, 17);
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
	public static Object flickcurl_photo_as_short_uri(Object photo) {
		return ModernizedCProgram.flickcurl_photo_id_as_short_uri(photo.getId());
	}
	public static Object flickcurl_source_uri_as_photo_id(Object uri) {
		byte p = uri;
		byte q = ((Object)0);
		byte photo_id = ((Object)0);
		size_t len = 0;
		if (!p) {
			return ((Object)0);
		} 
		if (.memcmp(p, ModernizedCProgram.source_uri_match1, 11)) {
			return ((Object)0);
		} 
		p += 11;
		while (.isdigit(/* now at {farm-id}.static... */p)) {
			p++;
		}
		if (.memcmp(p, ModernizedCProgram.source_uri_match2, 19)) {
			if (.memcmp(p, ModernizedCProgram.source_uri_match3, 18)) {
				return ((Object)0);
			} 
			p += 18;
		} else {
				p += 19;
		} 
		while (.isdigit(/* now at {server-id}/{photo_id}_... */p)) {
			p++;
		}
		if (p++ != (byte)'/') {
			return ((Object)0);
		} 
		q = /* now at {photo_id}_... */p;
		while (.isdigit(q)) {
			q++;
		}
		if (q != (byte)'_') {
			return ((Object)0);
		} 
		len = q - p;
		photo_id = (byte).malloc(len + 1);
		if (!photo_id) {
			return ((Object)0);
		} 
		.memcpy(photo_id, p, len);
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
	public static Object flickcurl_user_icon_uri(int farm, int server, Object nsid) {
		byte[] buf = new byte[512];
		byte result;
		if (server && farm && nsid) {
			size_t len = new size_t();
			.sprintf(buf, /* https://farm{icon-farm}.staticflickr.com/{icon-server}/buddyicons/{nsid}.jpg */"https://farm%d.staticflickr.com/%d/buddyicons/%s.jpg", farm, server, nsid);
			len = .strlen(buf);
			result = (byte).malloc(len + 1);
			.memcpy(result, buf, len + 1);
		} else {
				result = (byte).malloc(42 + 1);
				.memcpy(result, "https://www.flickr.com/images/buddyicon.jpg", 42 + 1);
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
	public static Object flickcurl_photo_as_user_icon_uri(Object photo) {
		return ModernizedCProgram.flickcurl_user_icon_uri(photo.getFields()[.PHOTO_FIELD_owner_iconfarm].getInteger(), photo.getFields()[.PHOTO_FIELD_owner_iconserver].getInteger(), photo.getFields()[.PHOTO_FIELD_owner_nsid].getString());
	}
	public static Object flickcurl_build_photos(Object fc, Object xpathCtx, Object xpathExpr, Object photo_count_p) {
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
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		photos = (flickcurl_photo).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			flickcurl_photo photo = new flickcurl_photo();
			int expri;
			 xpathNodeCtx = ((Object)0);
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			photo = (flickcurl_photo).calloc(, 1);
			xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
			xpathNodeCtx.setNode(node);
			for (expri = 0; expri <= .PHOTO_FIELD_LAST; expri++) {
				if (photo.getFields()[expri].getString()) {
					.free(photo.getFields()[expri].getString());
				} 
				photo.getFields()[expri].setString(((Object)0));
				photo.getFields()[expri].setInteger((flickcurl_photo_field_type)-1);
				photo.getFields()[expri].setType(.VALUE_TYPE_NONE);
			}
			for (expri = 0; photo_fields_table[expri].getXpath(); expri++) {
				byte string_value;
				flickcurl_field_value_type datatype = photo_fields_table[expri].getType();
				int int_value = -1;
				flickcurl_photo_field_type field = photo_fields_table[expri].getField();
				time_t unix_time = new time_t();
				int special = 0;
				string_value = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathNodeCtx, photo_fields_table[expri].getXpath());
				if (!string_value) {
					continue;
				} 
				switch (datatype) {
				case .VALUE_TYPE_PHOTO_ID:
						photo.setId(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_PHOTO_URI:
						photo.setUri(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_ICON_PHOTOS:
						.abort();
				case .VALUE_TYPE_TAG_STRING:
						photo.setTags(ModernizedCProgram.flickcurl_build_tags_from_string(fc, /* A space-separated list of tags */photo, (byte)string_value, photo.getTags_count()));
						.free(string_value);
						special = 1;
						break;
				case .VALUE_TYPE_URI:
						break;
				case .VALUE_TYPE_FLOAT:
				case .VALUE_TYPE_COLLECTION_ID:
				case .VALUE_TYPE_UNIXTIME:
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
				case .VALUE_TYPE_STRING:
				case .VALUE_TYPE_INTEGER:
				case .VALUE_TYPE_BOOLEAN:
						if (!string_value && datatype == .VALUE_TYPE_BOOLEAN) {
							.free(/* skip setting field with a boolean value '' */string_value);
							special = 1;
							break;
						} 
						int_value = .atoi(string_value);
						break;
				case .VALUE_TYPE_MEDIA_TYPE:
						photo.setMedia_type(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_PERSON_ID:
				case .VALUE_TYPE_NONE:
				}
				if (/* If special, do not store here */special) {
					continue;
				} 
				photo.getFields()[field].setString(string_value);
				photo.getFields()[field].setInteger((flickcurl_photo_field_type)int_value);
				photo.getFields()[field].setType(datatype);
				if (fc.getFailed()) {
					;
				} 
			}
			if (!photo.getTags()) {
				photo.setTags(ModernizedCProgram.flickcurl_build_tags(fc, photo, xpathNodeCtx, ()"./tags/tag", photo.getTags_count()));
			} 
			if (!photo.getPlace()) {
				photo.setPlace(ModernizedCProgram.flickcurl_build_place(fc, xpathNodeCtx, ()"./location"));
			} 
			photo.setVideo(ModernizedCProgram.flickcurl_build_video(fc, xpathNodeCtx, ()"./video"));
			photo.setNotes(ModernizedCProgram.flickcurl_build_notes(fc, photo, xpathNodeCtx, ()"./notes/note", photo.getNotes_count()));
			if (!photo.getMedia_type()) {
				photo.setMedia_type((byte).malloc(5 + 1));
				.memcpy(photo.getMedia_type(), "photo", 5 + 1);
			} 
			.xmlXPathFreeContext(xpathNodeCtx);
			photos[photo_count++] = photo/* for photos */;
		}
		if (photo_count_p) {
			photo_count_p = photo_count;
		} 
		if (fc.getFailed()) {
			if (photos) {
				ModernizedCProgram.flickcurl_free_photos(photos);
			} 
			photos = ((Object)0);
		} 
		return photos;
	}
	public static Object flickcurl_build_photo(Object fc, Object xpathCtx) {
		flickcurl_photo photos = new flickcurl_photo();
		flickcurl_photo result = ((Object)0);
		photos = ModernizedCProgram.flickcurl_build_photos(fc, xpathCtx, ()"/rsp/photo", ((Object)0));
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
	public static void flickcurl_free_photos(Object photos) {
		int i;
		do {
			if (!photos) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photo_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photo.c", 1204, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; photos[i]; i++) {
			ModernizedCProgram.flickcurl_free_photo(photos[i]);
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
	public static Object flickcurl_invoke_photos_list(Object fc, Object xpathExpr, Object format) {
		flickcurl_photos_list photos_list = ((Object)0);
		 xpathCtx = ((Object)0);
		 xpathObj = ((Object)0);
		 xpathNodeCtx = ((Object)0);
		byte nformat;
		size_t format_len = new size_t();
		photos_list = ModernizedCProgram.flickcurl_new_photos_list(fc);
		if (!photos_list) {
			return ((Object)0);
		} 
		if (format) {
			nformat = format;
			format_len = .strlen(format);
			photos_list.setContent(ModernizedCProgram.flickcurl_invoke_get_content(fc, photos_list.getContent_length()));
			if (!photos_list.getContent()) {
				fc.setFailed(1);
				;
			} 
		} else {
				 doc = ((Object)0);
				 photos_node = new ();
				size_t xpathExprLen = .strlen((byte)xpathExpr);
				byte value;
				 photosXpathExpr = new ();
				nformat = "xml";
				format_len = 3;
				doc = ModernizedCProgram.flickcurl_invoke(fc);
				if (!doc) {
					;
				} 
				xpathCtx = .xmlXPathNewContext(doc);
				if (!xpathCtx) {
					ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
					fc.setFailed(1);
					;
				} 
				xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
				if (!xpathObj) {
					ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
					fc.setFailed(1);
					;
				} 
				if (!xpathObj.getNodesetval() || !xpathObj.getNodesetval().getNodeTab()) {
					;
				} 
				photos_node = xpathObj.getNodesetval().getNodeTab()[0];
				xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
				if (!xpathNodeCtx) {
					ModernizedCProgram.flickcurl_error(fc, "Unable to create XPath context for XPath \"%s\"", xpathExpr);
					fc.setFailed(1);
					;
				} 
				xpathNodeCtx.setNode(photos_node);
				value = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathNodeCtx, ()"./@page");
				if (value) {
					photos_list.setPage(.atoi(value));
					.free(value);
				} 
				value = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathNodeCtx, ()"./@perpage");
				if (value) {
					photos_list.setPer_page(.atoi(value));
					.free(value);
				} 
				value = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathNodeCtx, ()"./@total");
				if (value) {
					photos_list.setTotal_count(.atoi(value));
					.free(value);
				} 
				.xmlXPathFreeContext(/* finished with these */xpathNodeCtx);
				xpathNodeCtx = ((Object)0);
				.xmlXPathFreeObject(xpathObj);
				xpathObj = ((Object)0);
				photosXpathExpr = ().malloc(xpathExprLen + 6 + 1);
				.memcpy(photosXpathExpr, xpathExpr, xpathExprLen);
				.memcpy(photosXpathExpr + xpathExprLen, "/photo", 6 + 1);
				photos_list.setPhotos(ModernizedCProgram.flickcurl_build_photos(fc, xpathCtx, photosXpathExpr, photos_list.getPhotos_count()));
				.free(photosXpathExpr);
				if (!photos_list.getPhotos()) {
					fc.setFailed(1);
					;
				} 
		} 
		photos_list.setFormat((byte).malloc(format_len + 1));
		if (!photos_list.getFormat()) {
			fc.setFailed(1);
			;
		} 
		.memcpy(photos_list.getFormat(), nformat, format_len + 1);
		if (xpathCtx) {
			.xmlXPathFreeContext(xpathCtx);
		} 
		if (fc.getFailed()) {
			if (photos_list) {
				ModernizedCProgram.flickcurl_free_photos_list(photos_list);
			} 
			photos_list = ((Object)0);
		} 
		return photos_list/*
		 * flickcurl_new_photos_list:
		 * @fc: Flickcurl context
		 *
		 * INTERNAL - constructor for photos list
		 */;
	}
	public static Object flickcurl_new_photos_list(Object fc) {
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		photos_list = (flickcurl_photos_list).calloc(1, );
		if (!photos_list) {
			return ((Object)0);
		} 
		photos_list.setPage(-1);
		photos_list.setPer_page(-1);
		photos_list.setTotal_count(-1);
		return photos_list/**
		 * flickcurl_free_photos_list:
		 * @photos_list: photos list object
		 *
		 * Destructor for photos list
		 */;
	}
	public static void flickcurl_free_photos_list(Object photos_list) {
		do {
			if (!photos_list) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photos_list is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photo.c", 1399, __func__);
				return ;
			} 
		} while (0);
		if (photos_list.getFormat()) {
			.free(photos_list.getFormat());
		} 
		if (photos_list.getPhotos()) {
			ModernizedCProgram.flickcurl_free_photos(photos_list.getPhotos());
		} 
		if (photos_list.getContent()) {
			.free(photos_list.getContent());
		} 
		.free(photos_list);
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
	public static void flickcurl_free_ticket(Object ticket) {
		do {
			if (!ticket) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_ticket is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\ticket.c", 46, __func__);
				return ;
			} 
		} while (0);
		.free(ticket/**
		 * flickcurl_free_tickets:
		 * @tickets_object: ticket object array
		 *
		 * Destructor for array of ticket objects
		 */);
	}
	public static void flickcurl_free_tickets(Object tickets_object) {
		int i;
		do {
			if (!tickets_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_ticket_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\ticket.c", 63, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; tickets_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_ticket(tickets_object[i]);
		}
		.free(tickets_object);
	}
	public static Object flickcurl_build_tickets(Object fc, Object xpathCtx, Object xpathExpr, Object ticket_count_p) {
		flickcurl_ticket tickets = ((Object)0);
		int nodes_count;
		int ticket_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max ticket - it can include nodes that are CDATA */nodes);
		tickets = (flickcurl_ticket).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_ticket t = new flickcurl_ticket();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			t = (flickcurl_ticket).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					t.setId(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "complete")) {
					t.setComplete(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photoid")) {
					t.setPhotoid(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "invalid")) {
					t.setInvalid(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			tickets[ticket_count++] = t/* for nodes */;
		}
		if (ticket_count_p) {
			ticket_count_p = ticket_count;
		} 
		return tickets;
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
	public static Object flickcurl_photos_upload_params(Object fc, Object params) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_upload_status status = ((Object)0);
		byte[] is_public_s = new byte[2];
		byte[] is_friend_s = new byte[2];
		byte[] is_family_s = new byte[2];
		byte[] safety_level_s = new byte[2];
		byte[] content_type_s = new byte[2];
		byte[] hidden_s = new byte[2];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!params.getPhoto_file()) {
			return ((Object)0);
		} 
		if (._access((byte)params.getPhoto_file(), 4)) {
			ModernizedCProgram.flickcurl_error(fc, "Photo file %s cannot be read: %s", params.getPhoto_file(), .strerror((._errno())));
			return ((Object)0);
		} 
		is_public_s[0] = params.getIs_public() ? (byte)'1' : (byte)'0';
		is_public_s[1] = (byte)'\0';
		is_friend_s[0] = params.getIs_friend() ? (byte)'1' : (byte)'0';
		is_friend_s[1] = (byte)'\0';
		is_family_s[0] = params.getIs_family() ? (byte)'1' : (byte)'0';
		is_family_s[1] = (byte)'\0';
		if (params.getSafety_level() >= 1 && params.getSafety_level() <= 3) {
			safety_level_s[0] = (byte)'0' + params.getSafety_level();
			safety_level_s[1] = (byte)'\0';
		} else {
				params.setSafety_level(-1);
		} 
		if (params.getContent_type() >= 1 && params.getContent_type() <= 3) {
			content_type_s[0] = (byte)'0' + params.getContent_type();
			content_type_s[1] = (byte)'\0';
		} else {
				params.setContent_type(-1);
		} 
		if (params.getHidden() >= 1 && params.getHidden() <= 2) {
			hidden_s[0] = (byte)'0' + params.getHidden();
			hidden_s[1] = (byte)'\0';
		} else {
				params.setHidden(-1);
		} 
		if (params.getTitle()) {
			ModernizedCProgram.flickcurl_add_param(fc, "title", params.getTitle());
		} 
		if (params.getDescription()) {
			ModernizedCProgram.flickcurl_add_param(fc, "description", params.getDescription());
		} 
		if (params.getTags()) {
			ModernizedCProgram.flickcurl_add_param(fc, "tags", params.getTags());
		} 
		if (params.getSafety_level() >= 0) {
			ModernizedCProgram.flickcurl_add_param(fc, "safety_level", safety_level_s);
		} 
		if (params.getContent_type() >= 0) {
			ModernizedCProgram.flickcurl_add_param(fc, "content_type", content_type_s);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "is_public", is_public_s);
		ModernizedCProgram.flickcurl_add_param(fc, "is_friend", is_friend_s);
		ModernizedCProgram.flickcurl_add_param(fc, "is_family", is_family_s);
		if (params.getHidden() >= 0) {
			ModernizedCProgram.flickcurl_add_param(fc, "hidden", hidden_s);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare_upload(fc, fc.getUpload_service_uri(), "photo", params.getPhoto_file())) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		status = (flickcurl_upload_status).calloc(1, );
		status.setPhotoid(ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/photoid"));
		status.setTicketid(ModernizedCProgram.flickcurl_xpath_eval(fc, /* when async is true */xpathCtx, ()"/rsp/ticketid"));
		if (fc.getFailed()) {
			if (status) {
				.free(status);
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
	public static Object flickcurl_photos_upload(Object fc, Object photo_file, Object title, Object description, Object tags, int is_public, int is_friend, int is_family) {
		flickcurl_upload_params params = new flickcurl_upload_params();
		.memset(params, (byte)'\0', );
		params.setPhoto_file(photo_file);
		params.setTitle(title);
		params.setDescription(description);
		params.setTags(tags);
		params.setIs_public(is_public);
		params.setIs_friend(is_friend);
		params.setIs_family(is_family);
		params.setSafety_level(-1);
		params.setContent_type(-1);
		params.setHidden(-1);
		return ModernizedCProgram.flickcurl_photos_upload_params(fc, params/**
		 * flickcurl_photos_replace:
		 * @fc: flickcurl context
		 * @photo_file: photo filename
		 * @photo_id: photo ID to replace
		 * @async: upload asynchronously boolean (non-0 true)
		 * 
		 * Replace a photo with a new file.
		 *
		 * Implements Replacing Photos (0.10)
		 * Implements Asynchronous Uploading (0.10)
		 * 
		 * Return value: #flickcurl_upload_status or NULL on failure
		 **/);
	}
	public static Object flickcurl_photos_replace(Object fc, Object photo_file, Object photo_id, int async) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_upload_status status = ((Object)0);
		byte[] async_s = new byte[2];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_file || !photo_id) {
			return ((Object)0);
		} 
		if (._access((byte)photo_file, 4)) {
			ModernizedCProgram.flickcurl_error(fc, "Photo file %s cannot be read: %s", photo_file, .strerror((._errno())));
			return ((Object)0);
		} 
		async_s[0] = async ? (byte)'1' : (byte)'0';
		async_s[1] = (byte)'\0';
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "async", async_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare_upload(fc, fc.getReplace_service_uri(), "photo", photo_file)) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		status = (flickcurl_upload_status).calloc(1, );
		status.setSecret(ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/photoid/@secret"));
		status.setOriginalsecret(ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/photoid/@originalsecret"));
		status.setTicketid(ModernizedCProgram.flickcurl_xpath_eval(fc, /* when async is true */xpathCtx, ()"/rsp/ticketid"));
		if (fc.getFailed()) {
			if (status) {
				.free(status);
			} 
			status = ((Object)0);
		} 
		return status/**
		 * flickcurl_free_upload_status:
		 * @status: status object
		 * 
		 * Destructor - free a #flickcurl_upload_status
		 **/;
	}
	public static void flickcurl_free_upload_status(Object status) {
		do {
			if (!status) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_upload_status is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\upload-api.c", 309, __func__);
				return ;
			} 
		} while (0);
		if (status.getPhotoid()) {
			.free(status.getPhotoid());
		} 
		if (status.getSecret()) {
			.free(status.getSecret());
		} 
		if (status.getOriginalsecret()) {
			.free(status.getOriginalsecret());
		} 
		if (status.getTicketid()) {
			.free(status.getTicketid());
		} 
	}
	public static void flickcurl_upload_status_free(Object status) {
		ModernizedCProgram.flickcurl_free_upload_status(status);
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
	public static void flickcurl_free_tag_namespace(Object tag_nspace) {
		if (tag_nspace.getName()) {
			.free(tag_nspace.getName());
		} 
		.free(tag_nspace);
	}
	public static Object flickcurl_build_tag_namespaces(Object fc, Object xpathCtx, Object xpathExpr, Object namespace_count_p) {
		flickcurl_tag_namespace tag_namespaces = ((Object)0);
		int nodes_count;
		int tag_namespace_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do namespaces */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tag_namespaces = (flickcurl_tag_namespace).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_tag_namespace tn = new flickcurl_tag_namespace();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			tn = (flickcurl_tag_namespace).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, (byte)attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "usage")) {
					tn.setUsage_count(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "predicates")) {
					tn.setPredicates_count(.atoi(attr_value));
				} 
				.free(attr_value);
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					tn.setName((byte).malloc(len + 1));
					.memcpy(tn.getName(), chnode.getContent(), len + 1);
				} 
			}
			tag_namespaces[tag_namespace_count++] = tn/* for nodes */;
		}
		if (namespace_count_p) {
			namespace_count_p = tag_namespace_count;
		} 
		return tag_namespaces;
	}
	public static Object flickcurl_build_tag_namespace(Object fc, Object xpathCtx, Object root_xpathExpr) {
		flickcurl_tag_namespace tag_namespaces = new flickcurl_tag_namespace();
		flickcurl_tag_namespace result = ((Object)0);
		tag_namespaces = ModernizedCProgram.flickcurl_build_tag_namespaces(fc, xpathCtx, root_xpathExpr, ((Object)0));
		if (tag_namespaces) {
			int i;
			result = tag_namespaces[0];
			for (i = 1; tag_namespaces[i]; i++) {
				ModernizedCProgram.flickcurl_free_tag_namespace(tag_namespaces[i]);
			}
			.free(tag_namespaces);
		} 
		return result/**
		 * flickcurl_free_tag_namespaces:
		 * @tag_nspaces: namespace object array
		 *
		 * Destructor for array of namespace object
		 */;
	}
	public static void flickcurl_free_tag_namespaces(Object tag_nspaces) {
		int i;
		do {
			if (!tag_nspaces) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_namespace_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\machinetags.c", 180, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; tag_nspaces[i]; i++) {
			ModernizedCProgram.flickcurl_free_tag_namespace(tag_nspaces[i]);
		}
		.free(tag_nspaces/**
		 * flickcurl_free_tag_predicate_value:
		 * @tag_pv: machinetag predicate_value object
		 *
		 * Destructor for machinetag predicate-value pair  object
		 */);
	}
	public static void flickcurl_free_tag_predicate_value(Object tag_pv) {
		if (tag_pv.getPredicate()) {
			.free(tag_pv.getPredicate());
		} 
		if (tag_pv.getValue()) {
			.free(tag_pv.getValue());
		} 
		.free(tag_pv/*
		 * @content_mode: set use of element content: 1 (predicate), 2 (value) otherwise ignored
		 */);
	}
	public static Object flickcurl_build_tag_predicate_values(Object fc, Object xpathCtx, Object xpathExpr, int content_mode, Object predicate_value_count_p) {
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		int nodes_count;
		int tag_predicate_value_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do predicate_values */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tag_pvs = (flickcurl_tag_predicate_value).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_tag_predicate_value tpv = new flickcurl_tag_predicate_value();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			tpv = (flickcurl_tag_predicate_value).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "usage")) {
					tpv.setUsage_count(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "namespaces")) {
					tpv.setUsed_in_namespace_count(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "predicate")) {
					tpv.setPredicate(attr_value);
				}  else if (!.strcmp(attr_name, "value")) {
					tpv.setValue(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			if (content_mode >= 1 && content_mode <= 2) {
				for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
					if (chnode.getType() == XML_TEXT_NODE) {
						size_t len = .strlen((byte)chnode.getContent());
						byte ptr = (content_mode == 1) ? tpv.getPredicate() : tpv.getValue();
						ptr = (byte).malloc(len + 1);
						.memcpy(ptr, chnode.getContent(), len + 1);
					} 
				}
			} 
			tag_pvs[tag_predicate_value_count++] = tpv/* for nodes */;
		}
		if (predicate_value_count_p) {
			predicate_value_count_p = tag_predicate_value_count;
		} 
		return tag_pvs/**
		 * flickcurl_free_tag_predicate_values:
		 * @tag_pvs: predicate_value object array
		 *
		 * Destructor for array of predicate_value object
		 */;
	}
	public static void flickcurl_free_tag_predicate_values(Object tag_pvs) {
		int i;
		do {
			if (!tag_pvs) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_tag_predicate_value_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\machinetags.c", 316, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; tag_pvs[i]; i++) {
			ModernizedCProgram.flickcurl_free_tag_predicate_value(tag_pvs[i]);
		}
		.free(tag_pvs);
	}
	public static void print_help_string() {
		int i;
		.printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
		.puts("Call the Flickr API to get information.");
		.printf("Usage: %s [OPTIONS] command args...\n\n", ModernizedCProgram.program);
		.fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
		.fputs("\nLicense: ", (_iob[1]));
		.puts(ModernizedCProgram.flickcurl_license_string);
		.fputs("Flickcurl home page: ", (_iob[1]));
		.puts(ModernizedCProgram.flickcurl_home_url_string);
		.fputs("\n", (_iob[1]));
		.puts("  -a  Authenticate with a FROB and write auth config");
		.puts("  -d  Set delay between requests in milliseconds");
		.puts("  -h  Print this help, then exit");
		.puts("  -o  Write format = FORMAT results to FILE");
		.puts("  -q  Print less information while running");
		.puts("  -v  Print the flickcurl version");
		.puts("  -V  Print more information while running");
		.fputs("\nCommands:\n", (_iob[1]));
		for (i = 0; ModernizedCProgram.commands[i].getName(); i++) {
			.printf("    %-28s %s\n      %s\n", ModernizedCProgram.commands[i].getName(), ModernizedCProgram.commands[i].getArgs(), ModernizedCProgram.commands[i].getDescription());
		}
		.fputs("\nNSID is a user's Flickr ID, resembling the form 00000000@N00\n", (_iob[1]));
		.fputs("\nA prefix of `flickr.' may be optionally given in all commands\n", (_iob[1]));
		.fputs("\nParameters for API calls that return lists of photos:\n", (_iob[1]));
		.fputs("\n  EXTRAS is a comma-separated list of optional fields to return from:\n", (_iob[1]));
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_extras_format_info(i, name, label)) {
				break;
			} 
			.printf("    %-16s %s\n", name, label);
		}
		.fputs("\n  GROUP-EXTRAS is a comma-separated list of optional fields to return from:\n", (_iob[1]));
		.fputs("    privacy\n", (_iob[1]));
		.fputs("    throttle\n", (_iob[1]));
		.fputs("    restrictions\n", (_iob[1]));
		.fputs("\n  FORMAT is result syntax format:\n", (_iob[1]));
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_feed_format_info(i, name, label, ((Object)0))) {
				break;
			} 
			.printf("    %-16s %s\n", name, label);
		}
		.fputs("\n  PAGE is result page number or '-' for default (1 = first page)\n\n  PER-PAGE is photos per result page or '-' for default (10)\n", (_iob[1]));
		.fputs("\n", (_iob[/* Extra space for neater distinctions in output */1]));
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * places-api.c - Flickr flickr.places.* API calls
	 *
	 * Places API announced 2008-01-11
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/3688
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_places_find:
	 * @fc: flickcurl context
	 * @query: The query string to use for place ID lookups
	 * 
	 * Return a list of place IDs for a query string.
	 *
	 * The flickr.places.find method is NOT a geocoder. It will round up
	 * to the nearest place type to which place IDs apply. For example,
	 * if you pass it a street level address it will return the city that
	 * contains the address rather than the street, or building, itself.
	 *
	 * This API announced 2008-01-18
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/3716
	 *
	 * Implements flickr.places.find (1.1)
	 * 
	 * Return value: array of places or NULL on failure
	 **/
	public static Object flickcurl_places_find(Object fc, Object query) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!query) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "query", query);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.find")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		places = ModernizedCProgram.flickcurl_build_places(fc, xpathCtx, ()"/rsp/places/place", ((Object)0));
		if (fc.getFailed()) {
			if (places) {
				ModernizedCProgram.flickcurl_free_places(places);
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_findByLatLon:
		 * @fc: flickcurl context
		 * @lat: The latitude whose valid range is -90 to 90. Anything more than 4 decimal places will be truncated.
		 * @lon: The longitude whose valid range is -180 to 180. Anything more than 4 decimal places will be truncated.
		 * @accuracy: Recorded accuracy level of the location information. World level is 1, Country is ~3, Region ~6, City ~11, Street ~16. Current range is 1-16. The default is 16.
		 * 
		 * Return a place ID for a latitude, longitude and accuracy triple.
		 *
		 * The flickr.places.findByLatLon method is not meant to be a
		 * (reverse) geocoder in the traditional sense. It is designed to
		 * allow users to find photos for "places" and will round up to the
		 * nearest place type to which corresponding place IDs apply.
		 *
		 * This API announced 2008-01-23
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/3735
		 *
		 * Implements flickr.places.findByLatLon (1.1)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_places_findByLatLon(Object fc, double lat, double lon, int accuracy) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		byte[] lat_str = new byte[20];
		byte[] lon_str = new byte[20];
		byte[] accuracy_str = new byte[4];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (accuracy < 0 || accuracy > 16) {
			accuracy = 16;
		} 
		.sprintf(lat_str, "%f", lat);
		ModernizedCProgram.flickcurl_add_param(fc, "lat", lat_str);
		.sprintf(lon_str, "%f", lon);
		ModernizedCProgram.flickcurl_add_param(fc, "lon", lon_str);
		.sprintf(accuracy_str, "%d", accuracy);
		ModernizedCProgram.flickcurl_add_param(fc, "accuracy", accuracy_str);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.findByLatLon")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		place = ModernizedCProgram.flickcurl_build_place(fc, xpathCtx, ()"/rsp/places/place");
		if (fc.getFailed()) {
			if (place) {
				ModernizedCProgram.flickcurl_free_place(place);
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_getChildrenWithPhotosPublic:
		 * @fc: flickcurl context
		 * @place_id: A Places ID. (While optional, you must pass either a valid Places ID or a WOE ID.) (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID. (While optional, you must pass either a valid Places ID or a WOE ID.) (or NULL)
		 * 
		 * Return a list of locations with public photos that are parented by a Where on Earth (WOE) or Places ID.
		 *
		 * Implements flickr.places.getChildrenWithPhotosPublic (1.7)
		 * 
		 * @deprecated: Replaced by flickcurl_places_getChildrenWithPhotosPublic2() with integer woe_id argument.
		 *
		 * Return value: array of places or NULL on failure
		 **/;
	}
	public static Object flickcurl_places_getChildrenWithPhotosPublic(Object fc, Object place_id, Object woe_id) {
		int woe_id_i = -1;
		if (woe_id) {
			woe_id_i = .atoi(woe_id);
		} 
		return ModernizedCProgram.flickcurl_places_getChildrenWithPhotosPublic2(fc, place_id, woe_id_i/**
		 * flickcurl_places_getChildrenWithPhotosPublic2:
		 * @fc: flickcurl context
		 * @place_id: A Places ID (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID (or <0)
		 * 
		 * Return a list of locations with public photos that are parented by a Where on Earth (WOE) or Places ID.
		 *
		 * You must pass either a valid Places ID or a WOE ID.
		 *
		 * Replaces flickcurl_places_getChildrenWithPhotosPublic() with integer @woe_id arg.
		 * 
		 * Return value: array of places or NULL on failure
		 **/);
	}
	public static Object flickcurl_places_getChildrenWithPhotosPublic2(Object fc, Object place_id, int woe_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] woe_id_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		}  else if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} else {
				return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.getChildrenWithPhotosPublic")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		places = ModernizedCProgram.flickcurl_build_places(fc, xpathCtx, ()"/rsp/places/place", ((Object)0));
		if (fc.getFailed()) {
			if (places) {
				ModernizedCProgram.flickcurl_free_places(places);
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_getInfo:
		 * @fc: flickcurl context
		 * @place_id: A Places ID (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID. (or NULL)
		 * 
		 * Get information about a place.
		 *
		 * While optional, you must pass either a valid Places ID or a WOE ID.
		 *
		 * Implements flickr.places.getInfo (1.7)
		 * 
		 * Announced 2008-10-30
		 * http://code.flickr.com/blog/2008/10/30/the-shape-of-alpha/
		 * and in detail 2008-11-05
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4510
		 * 
		 * @deprecated: Replaced by flickcurl_places_getInfo2() with integer woe_id argument.
		 *
		 * Return value: new place object or NULL on failure
		 **/;
	}
	public static Object flickcurl_places_getInfo(Object fc, Object place_id, Object woe_id) {
		int woe_id_i = -1;
		if (woe_id) {
			woe_id_i = .atoi(woe_id);
		} 
		return ModernizedCProgram.flickcurl_places_getInfo2(fc, place_id, woe_id_i/**
		 * flickcurl_places_getInfo2:
		 * @fc: flickcurl context
		 * @place_id: A Places ID. (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID (or <0)
		 * 
		 * Get information about a place.
		 *
		 * While optional, you must pass either a valid Places ID or a WOE ID.
		 *
		 * Replaces flickcurl_places_getInfo() with integer woe_id argument.
		 *
		 * Return value: new place object or NULL on failure
		 **/);
	}
	public static Object flickcurl_places_getInfo2(Object fc, Object place_id, int woe_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		byte[] woe_id_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		}  else if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} else {
				return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare_noauth(fc, "flickr.places.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		place = ModernizedCProgram.flickcurl_build_place(fc, xpathCtx, ()"/rsp/place");
		if (fc.getFailed()) {
			if (place) {
				ModernizedCProgram.flickcurl_free_place(place);
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_getInfoByUrl:
		 * @fc: flickcurl context
		 * @url: A flickr.com/places URL in the form of /country/region/city. For example: /Canada/Quebec/Montreal
		 * 
		 * Lookup information about a place, by its flickr.com/places URL.
		 *
		 * Implements flickr.places.getInfoByUrl (1.7)
		 *
		 * Announced 2008-10-30
		 * http://code.flickr.com/blog/2008/10/30/the-shape-of-alpha/
		 * and in detail 2008-11-05
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4510
		 * 
		 * Return value: new place object or NULL on failure
		 **/;
	}
	public static Object flickcurl_places_getInfoByUrl(Object fc, Object url) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!url) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "url", url);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.getInfoByUrl")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		place = ModernizedCProgram.flickcurl_build_place(fc, xpathCtx, ()"/rsp/place");
		if (fc.getFailed()) {
			if (place) {
				ModernizedCProgram.flickcurl_free_place(place);
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_getPlaceTypes:
		 * @fc: flickcurl context
		 * 
		 * Get a list of available place types
		 *
		 * Implements flickr.places.getPlaceTypes (1.8)
		 * 
		 * Return value: array of #flickcurl_place_type_info or NULL on failure
		 **/;
	}
	public static Object flickcurl_places_getPlaceTypes(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place_type_info place_types = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.getPlaceTypes")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		place_types = ModernizedCProgram.flickcurl_build_place_types(fc, xpathCtx, ()"/rsp/place_types/place", ((Object)0));
		if (fc.getFailed()) {
			if (place_types) {
				ModernizedCProgram.flickcurl_free_place_type_infos(place_types);
			} 
			place_types = ((Object)0);
		} 
		return place_types/**
		 * flickcurl_places_getShapeHistory:
		 * @fc: flickcurl context
		 * @place_id: A Flickr Places ID (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID (or <0)
		 * 
		 * Return an historical list of all the shape data generated for a
		 * Places or Where on Earth (WOE) ID.
		 *
		 * While optional, you must pass either a valid Places ID or a WOE ID.
		 *
		 * Implements flickr.places.getShapeHistory (1.8)
		 * 
		 * Announced 2009-01-12 in
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4669
		 * 
		 * Addition of donut holes announced 2009-05-06
		 * http://code.flickr.com/blog/2009/05/06/the-absence-and-the-anchor/
		 *
		 * Return value: NULL on failure
		 **/;
	}
	public static Object flickcurl_places_getShapeHistory(Object fc, Object place_id, int woe_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_shapedata shapes = ((Object)0);
		byte[] woe_id_str = new byte[20];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!place_id && woe_id < 0) {
			return ((Object)0);
		} 
		if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		} 
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.getShapeHistory")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		shapes = ModernizedCProgram.flickcurl_build_shapes(fc, xpathCtx, ()"/rsp/shapes/shapedata|/rsp/shapes/shape", ((Object)0));
		if (fc.getFailed()) {
			if (shapes) {
				ModernizedCProgram.flickcurl_free_shapes(shapes);
			} 
			shapes = ((Object)0);
		} 
		return shapes/**
		 * flickcurl_places_getTopPlacesList:
		 * @fc: flickcurl context
		 * @place_type: The place type to cluster photos by. Valid place types are : neighbourhood, locality, region, country and continent
		 * @date: A valid date in YYYY-MM-DD format. The default is yesterday. (or NULL)
		 * @woe_id: Limit your query to only those top places belonging to a specific Where on Earth (WOE) identifier. (or NULL)
		 * @place_id: Limit your query to only those top places belonging to a specific Flickr Places identifier. (or NULL)
		 * 
		 * Return the top 100 most geotagged places for a day.
		 *
		 * Implements flickr.places.getTopPlacesList (1.12)
		 * 
		 * Return value: array of places or NULL on failure
		 **/;
	}
	public static Object flickcurl_places_getTopPlacesList(Object fc,  place_type, Object date, int woe_id, Object place_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] woe_id_str = new byte[10];
		int place_type_id;
		byte[] place_type_id_str = new byte[3];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return ((Object)0);
		} 
		.sprintf(place_type_id_str, "%d", place_type_id);
		ModernizedCProgram.flickcurl_add_param(fc, "place_type_id", place_type_id_str);
		if (date) {
			ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		} 
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		}  else if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.getTopPlacesList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		places = ModernizedCProgram.flickcurl_build_places(fc, xpathCtx, ()"/rsp/places/place", ((Object)0));
		if (fc.getFailed()) {
			if (places) {
				ModernizedCProgram.flickcurl_free_places(places);
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_placesForBoundingBox:
		 * @fc: flickcurl context
		 * @place_type: The place type to cluster photos by
		 * @minimum_longitude: Bound Box bottom-left corner longitude
		 * @minimum_latitude: Bound Box bottom-left corner latitude
		 * @maximum_longitude: Bound Box top-right corner longitude
		 * @maximum_latitude: Bound Box top-right corner latitude
		 * 
		 * Return all the locations of a matching place type for a bounding box.
		 *
		 * The maximum allowable size of a bounding box (the distance between
		 * the SW and NE corners) is governed by the place type you are
		 * requesting. Allowable sizes are as follows:
		 * neighbourhood: 3km (1.8mi), locality: 7km (4.3mi), county: 50km (31mi),
		 * region: 200km (124mi), country: 500km (310mi), continent: 1500km (932mi)
		 *
		 * Implements flickr.places.placesForBoundingBox (1.8)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_places_placesForBoundingBox(Object fc,  place_type, double minimum_longitude, double minimum_latitude, double maximum_longitude, double maximum_latitude) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] place_type_id_str = new byte[3];
		int place_type_id = -1;
		byte[] bbox = new byte[255];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return ((Object)0);
		} 
		.sprintf(bbox, "%f,%f,%f,%f", minimum_longitude, minimum_latitude, maximum_longitude, maximum_latitude);
		ModernizedCProgram.flickcurl_add_param(fc, "bbox", bbox/* deliberately not using deprecated parameter place_type *//*
		  flickcurl_add_param(fc, "place_type", place_type);
		*/);
		.sprintf(place_type_id_str, "%d", place_type_id);
		ModernizedCProgram.flickcurl_add_param(fc, "place_type_id", place_type_id_str);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.placesForBoundingBox")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		places = ModernizedCProgram.flickcurl_build_places(fc, xpathCtx, ()"/rsp/places/place", ((Object)0));
		if (fc.getFailed()) {
			if (places) {
				ModernizedCProgram.flickcurl_free_places(places);
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_placesForContacts:
		 * @fc: flickcurl context
		 * @place_type: A specific place type to cluster photos by.
		 * @woe_id: A Where on Earth ID to use to filter photo clusters (or NULL)
		 * @place_id: A Places ID to use to filter photo clusters (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used.
		 * @contacts: Search your contacts. Either 'all' or 'ff' for just friends and family. (Default is 'all') (or NULL)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned (or <0)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned (or <0)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned (or <0)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned (or <0)
		 * 
		 * Return a list of the top 100 unique places clustered by a given
		 * placetype for a user's contacts.
		 *
		 * One of @woe_id or @place_id must be given.
		 *
		 * Implements flickr.places.placesForContacts (1.8)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_places_placesForContacts(Object fc,  place_type, int woe_id, Object place_id, int threshold, Object contacts, int min_upload_date, int max_upload_date, int min_taken_date, int max_taken_date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] place_type_id_str = new byte[3];
		int place_type_id;
		byte[] min_upload_date_s = new byte[20];
		byte[] max_upload_date_s = new byte[20];
		byte[] min_taken_date_s = new byte[20];
		byte[] max_taken_date_s = new byte[20];
		byte[] woe_id_str = new byte[10];
		byte[] threshold_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!woe_id && !place_id) {
			return ((Object)0);
		} 
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return ((Object)0/* deliberately not using deprecated parameter place_type */);
		} 
		.sprintf(place_type_id_str, "%d", /*  
		  flickcurl_add_param(fc, "place_type", place_type);
		*/place_type_id);
		ModernizedCProgram.flickcurl_add_param(fc, "place_type_id", place_type_id_str);
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} 
		if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		} 
		.sprintf(threshold_str, "%d", threshold);
		ModernizedCProgram.flickcurl_add_param(fc, "threshold", threshold_str);
		if (contacts) {
			ModernizedCProgram.flickcurl_add_param(fc, "contacts", contacts);
		} 
		if (min_upload_date >= 0) {
			.sprintf(min_upload_date_s, "%d", min_upload_date);
			ModernizedCProgram.flickcurl_add_param(fc, "min_upload_date", min_upload_date_s);
		} 
		if (max_upload_date >= 0) {
			.sprintf(max_upload_date_s, "%d", max_upload_date);
			ModernizedCProgram.flickcurl_add_param(fc, "max_upload_date", max_upload_date_s);
		} 
		if (min_taken_date >= 0) {
			.sprintf(min_taken_date_s, "%d", min_taken_date);
			ModernizedCProgram.flickcurl_add_param(fc, "min_taken_date", min_taken_date_s);
		} 
		if (max_taken_date >= 0) {
			.sprintf(max_taken_date_s, "%d", max_taken_date);
			ModernizedCProgram.flickcurl_add_param(fc, "max_taken_date", max_taken_date_s);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.placesForContacts")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		places = ModernizedCProgram.flickcurl_build_places(fc, xpathCtx, ()"/rsp/places/place", ((Object)0));
		if (fc.getFailed()) {
			if (places) {
				ModernizedCProgram.flickcurl_free_places(places);
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_placesForTags:
		 * @fc: flickcurl context
		 * @place_type: The place type to cluster photos by
		 * @woe_id: A Where on Earth ID to use to filter photo clusters (or NULL)
		 * @place_id: A Places ID to use to filter photo clusters (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used.
		 * @tags: A comma-delimited list of tags. Photos with one or more of the tags listed will be returned. (or NULL)
		 * @tag_mode: Either 'any' for an OR combination of tags, or 'all' for an AND combination. Defaults to 'any' if not specified. (or NULL)
		 * @machine_tags: Multiple machine tags may be queried by passing a comma-separated list. The number of machine tags you can pass in a single query depends on the tag mode (AND or OR) that you are querying with. "AND" queries are limited to (16) machine tags. "OR" queries are limited to (8). See below. (or NULL)
		 * @machine_tag_mode: Either 'any' for an OR combination of tags, or 'all' for an AND combination. Defaults to 'any' if not specified. (or NULL)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned (or NULL)
		 * 
		 * Return a list of the top 100 unique places clustered by a given
		 * placetype for set of tags or machine tags.
		 *
		 * Machine tags extra information.  Aside from passing in a fully
		 * formed machine tag, there is a special syntax for searching on
		 * specific properties :
		 *
		 * <itemizedlist>
		 *   <listitem>Find photos using the 'dc' namespace : <literal>"machine_tags" => "dc:"</literal></listitem>
		 *   <listitem> Find photos with a title in the 'dc' namespace : <literal>"machine_tags" => "dc:title = "</literal></listitem>
		 *   <listitem>Find photos titled "mr. camera" in the 'dc' namespace : <literal>"machine_tags" => "dc:title = \"mr. camera\"</literal></listitem>
		 *   <listitem>Find photos whose value is "mr. camera" : <literal>"machine_tags" => "*:* = \"mr. camera\""</literal></listitem>
		 *   <listitem>Find photos that have a title, in any namespace : <literal>"machine_tags" => "*:title = "</literal></listitem>
		 *   <listitem>Find photos that have a title, in any namespace, whose value is "mr. camera" : <literal>"machine_tags" => "*:title = \"mr. camera\""</literal></listitem>
		 *   <listitem>Find photos, in the 'dc' namespace whose value is "mr. camera" : <literal>"machine_tags" => "dc:* = \"mr. camera\""</literal></listitem>
		 *  </itemizedlist>
		 * 
		 * Implements flickr.places.placesForTags (1.8)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_places_placesForTags(Object fc,  place_type, int woe_id, Object place_id, Object threshold, Object tags, Object tag_mode, Object machine_tags, Object machine_tag_mode, Object min_upload_date, Object max_upload_date, Object min_taken_date, Object max_taken_date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		byte[] place_type_id_str = new byte[3];
		int place_type_id;
		byte[] woe_id_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return 1;
		} 
		.sprintf(place_type_id_str, "%d", place_type_id);
		ModernizedCProgram.flickcurl_add_param(fc, "place_type_id", place_type_id_str);
		.sprintf(woe_id_str, "%d", woe_id);
		ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		ModernizedCProgram.flickcurl_add_param(fc, "threshold", threshold);
		ModernizedCProgram.flickcurl_add_param(fc, "tags", tags);
		ModernizedCProgram.flickcurl_add_param(fc, "tag_mode", tag_mode);
		ModernizedCProgram.flickcurl_add_param(fc, "machine_tags", machine_tags);
		ModernizedCProgram.flickcurl_add_param(fc, "machine_tag_mode", machine_tag_mode);
		ModernizedCProgram.flickcurl_add_param(fc, "min_upload_date", min_upload_date);
		ModernizedCProgram.flickcurl_add_param(fc, "max_upload_date", max_upload_date);
		ModernizedCProgram.flickcurl_add_param(fc, "min_taken_date", min_taken_date);
		ModernizedCProgram.flickcurl_add_param(fc, "max_taken_date", max_taken_date);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.placesForTags")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = ((Object)/* your code here */0);
		if (fc.getFailed()) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_places_resolvePlaceId:
		 * @fc: flickcurl context
		 * @place_id: A Places ID
		 * 
		 * Find places information by Place ID
		 *
		 * Implements flickr.places.resolvePlaceId (1.0)
		 * 
		 * Return value: new place object or NULL on failure
		 **/));
	}
	public static Object flickcurl_places_resolvePlaceId(Object fc, Object place_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!place_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare_noauth(fc, "flickr.places.resolvePlaceId")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		place = ModernizedCProgram.flickcurl_build_place(fc, xpathCtx, ()"/rsp/location");
		if (fc.getFailed()) {
			if (place) {
				ModernizedCProgram.flickcurl_free_place(place);
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_resolvePlaceURL:
		 * @fc: flickcurl context
		 * @url: A Places URL.  Place URLs are of the form /country/region/city
		 * 
		 * Find Places information by Place URL
		 *
		 * Implements flickr.places.resolvePlaceURL (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_places_resolvePlaceURL(Object fc, Object url) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!url) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "url", url);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare_noauth(fc, "flickr.places.resolvePlaceURL")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		place = ModernizedCProgram.flickcurl_build_place(fc, xpathCtx, ()"/rsp/location");
		if (fc.getFailed()) {
			if (place) {
				ModernizedCProgram.flickcurl_free_place(place);
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_placesForUser:
		 * @fc: flickcurl context
		 * @place_type: A specific place type to cluster photos by.  Valid places types are neighbourhood, locality, region or country
		 * @woe_id: A Where on Earth ID to use to filter photo clusters. (or <0)
		 * @place_id: A Places ID to use to filter photo clusters. (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used. (or <0)
		 * 
		 * Return a list of the top 100 unique places clustered by a given place type for a user.
		 *
		 * This API added 2008-09-04 as announced in
		 * http://code.flickr.com/blog/2008/09/04/whos-on-first/
		 *
		 * Implements flickr.places.placesForUser (1.6)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_places_placesForUser(Object fc,  place_type, int woe_id, Object place_id, int threshold) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte place_type_str;
		byte[] woe_id_str = new byte[20];
		byte[] threshold_str = new byte[4];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		place_type_str = ModernizedCProgram.flickcurl_get_place_type_label(place_type);
		if (!place_type_str) {
			ModernizedCProgram.flickcurl_error(fc, "Invalid place type %d", place_type);
			return ((Object)0);
		} 
		if (place_type != .FLICKCURL_PLACE_NEIGHBOURHOOD && place_type != .FLICKCURL_PLACE_LOCALITY && place_type != .FLICKCURL_PLACE_REGION && place_type != .FLICKCURL_PLACE_COUNTRY) {
			ModernizedCProgram.flickcurl_error(fc, "Place type '%s' (%d) is not valid for places.forUser", place_type_str, place_type);
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "place_type", place_type_str);
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} 
		if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		} 
		if (threshold >= 0) {
			.sprintf(threshold_str, "%d", threshold);
			ModernizedCProgram.flickcurl_add_param(fc, "threshold", threshold_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.placesForUser")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		places = ModernizedCProgram.flickcurl_build_places(fc, xpathCtx, ()"/rsp/places/place", ((Object)0));
		if (fc.getFailed()) {
			if (places) {
				ModernizedCProgram.flickcurl_free_places(places);
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_forUser:
		 * @fc: flickcurl context
		 * @place_type: A specific place type to cluster photos by.  Valid places types are neighbourhood, locality, region or country
		 * @woe_id: A Where on Earth ID to use to filter photo clusters. (or <0)
		 * @place_id: A Places ID to use to filter photo clusters. (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used. (or <0)
		 * 
		 * Return a list of the top 100 unique places clustered by a given place type for a user.
		 *
		 * @deprecated: Use flickcurl_places_placesForUser()
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_places_forUser(Object fc,  place_type, int woe_id, Object place_id, int threshold) {
		return ModernizedCProgram.flickcurl_places_placesForUser(fc, place_type, woe_id, place_id, threshold/**
		 * flickcurl_places_tagsForPlace:
		 * @fc: flickcurl context
		 * @woe_id: A Where on Earth identifier to use to filter photo clusters (or <0)
		 * @place_id: A Flickr Places identifier to use to filter photo clusters (or NULL)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * 
		 * Return a list of the top 100 unique tags for a Flickr Places or
		 * Where on Earth (WOE) ID
		 *
		 * (While optional, you must pass either a valid Places ID or a WOE ID.)
		*
		 * Implements flickr.places.tagsForPlace (1.8)
		 * 
		 * Return value: NULL on failure
		 **/);
	}
	public static Object flickcurl_places_tagsForPlace(Object fc, int woe_id, Object place_id, int min_upload_date, int max_upload_date, int min_taken_date, int max_taken_date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] woe_id_str = new byte[20];
		byte[] min_upload_date_str = new byte[20];
		byte[] max_upload_date_str = new byte[20];
		byte[] min_taken_date_str = new byte[20];
		byte[] max_taken_date_str = new byte[20];
		flickcurl_tag tags = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (woe_id < 0 && !place_id) {
			return ((Object)0);
		} 
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_str);
		} 
		if (place_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", place_id);
		} 
		if (min_upload_date) {
			.sprintf(min_upload_date_str, "%d", min_upload_date);
			ModernizedCProgram.flickcurl_add_param(fc, "min_upload_date", min_upload_date_str);
		} 
		if (min_upload_date) {
			.sprintf(min_upload_date_str, "%d", min_upload_date);
			ModernizedCProgram.flickcurl_add_param(fc, "max_upload_date", max_upload_date_str);
		} 
		if (max_upload_date) {
			.sprintf(max_upload_date_str, "%d", max_upload_date);
			ModernizedCProgram.flickcurl_add_param(fc, "min_taken_date", min_taken_date_str);
		} 
		if (min_taken_date) {
			.sprintf(min_taken_date_str, "%d", min_taken_date);
			ModernizedCProgram.flickcurl_add_param(fc, "max_taken_date", max_taken_date_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.places.tagsForPlace")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tags = ModernizedCProgram.flickcurl_build_tags(fc, ((Object)0), xpathCtx, ()"/rsp/tags/tag", ((Object)0));
		if (fc.getFailed()) {
			if (tags) {
				ModernizedCProgram.flickcurl_free_tags(tags);
			} 
			tags = ((Object)0);
		} 
		return tags;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * commons-api.c - Flickr flickr.commons.* API calls
	 *
	 * Commons API announced 2009-01-29
	 * http://flickr.com/groups/api/discuss/72157613093793775/
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
	 * flickcurl_commons_getInstitutions:
	 * @fc: flickcurl context
	 * 
	 * Retrieves a list of the current Commons institutions.
	 *
	 * Implements flickr.commons.getInstitutions (1.8)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static Object flickcurl_commons_getInstitutions(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_institution institutions = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.commons.getInstitutions")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		institutions = ModernizedCProgram.flickcurl_build_institutions(fc, xpathCtx, ()"/rsp/institutions/institution", ((Object)0));
		if (fc.getFailed()) {
			if (institutions) {
				ModernizedCProgram.flickcurl_free_institutions(institutions);
			} 
			institutions = ((Object)0);
		} 
		return institutions;
	}
	public static int mangen_cmd_compare(Object a, Object b) {
		flickcurl_cmd a_cmd = (flickcurl_cmd)a;
		flickcurl_cmd b_cmd = (flickcurl_cmd)b;
		return .strcmp(a_cmd.getName(), b_cmd.getName());
	}
	public static void mangen_print_man_page(Object fh) {
		int i;
		.fputs(".LP\nIn the following list of commands:\n.br\n\\fIPER-PAGE\\fR is photos per result page or '-' for default (10)\n.br\n\\fIPAGE\\fR is result page number or '-' for default (1 = first page)\n", fh);
		.qsort(ModernizedCProgram.commands, 184 - 1, , mangen_cmd_compare);
		for (i = 0; ModernizedCProgram.commands[i].getName(); i++) {
			int d;
			int dc;
			int nl = 1;
			int lastdc = -1;
			.fprintf(fh, ".IP \"\\fB%s\\fP \\fI%s\\fP\"\n", ModernizedCProgram.commands[i].getName(), ModernizedCProgram.commands[i].getArgs());
			for (d = 0; (dc = ModernizedCProgram.commands[i].getDescription()[d]); d++) {
				if (nl && dc == (byte)' ') {
					lastdc = dc;
					continue;
				} 
				if (dc == (byte)' ' && lastdc == (byte)' ') {
					.fputs("\n.br\n", fh);
					do {
						d++;
						dc = ModernizedCProgram.commands[i].getDescription()[d];
					} while (dc == (byte)' ');
				} 
				nl = 0;
				if (dc == (byte)'\n') {
					.fputs("\n.br\n", fh);
					nl = 1;
				} else {
						.fputc(dc, fh);
				} 
				lastdc = dc;
			}
			.fputc((byte)'\n', fh);
		}
		.fputs(".SH Extras Fields\n", fh);
		.fputs("The \\fBEXTRAS\\fP parameter can take a comma-separated set of the following values\n", fh);
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_extras_format_info(i, name, label)) {
				break;
			} 
			.fprintf(fh, ".TP\n\\fB%s\\fP\n%s\n", name, label);
		}
		.fputs(".SH Photos List Feed Formats\n", fh);
		.fputs("The \\fBFORMAT\\fP parameter can take any of the following values\n", fh);
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_feed_format_info(i, name, label, ((Object)0))) {
				break;
			} 
			.fprintf(fh, ".TP\n\\fB%s\\fP\n%s\n", name, label);
		}
	}
	public static void mangen_print_extras(Object fh) {
		int i;
		.fputs("<variablelist>\n", fh);
		for (i = 0; 1; i++) {
			byte name;
			byte label;
			if (ModernizedCProgram.flickcurl_get_extras_format_info(i, name, label)) {
				break;
			} 
			.fprintf(fh, "  <varlistentry>\n    <term>%s</term>\n    <listitem><simpara>%s</simpara></listitem>\n  </varlistentry>\n", name, label);
		}
		.fputs("</variablelist>\n", fh);
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
	public static void flickcurl_free_photoset(Object photoset) {
		do {
			if (!photoset) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photoset is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photoset.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (photoset.getId()) {
			.free(photoset.getId());
		} 
		if (photoset.getPrimary()) {
			.free(photoset.getPrimary());
		} 
		if (photoset.getSecret()) {
			.free(photoset.getSecret());
		} 
		if (photoset.getTitle()) {
			.free(photoset.getTitle());
		} 
		if (photoset.getDescription()) {
			.free(photoset.getDescription());
		} 
		if (photoset.getOwner()) {
			.free(photoset.getOwner());
		} 
		.free(photoset/**
		 * flickcurl_free_photosets:
		 * @photosets_object: photoset object array
		 *
		 * Destructor for array of photoset object
		 */);
	}
	public static void flickcurl_free_photosets(Object photosets_object) {
		int i;
		do {
			if (!photosets_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_photoset_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photoset.c", 81, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; photosets_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_photoset(photosets_object[i]);
		}
		.free(photosets_object);
	}
	public static Object flickcurl_build_photosets(Object fc, Object xpathCtx, Object xpathExpr, Object photoset_count_p) {
		flickcurl_photoset photosets = ((Object)0);
		int nodes_count;
		int photoset_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		photosets = (flickcurl_photoset).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_photoset ps = new flickcurl_photoset();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			ps = (flickcurl_photoset).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					ps.setId(attr_value);
				}  else if (!.strcmp(attr_name, "primary")) {
					ps.setPrimary(attr_value);
				}  else if (!.strcmp(attr_name, "secret")) {
					ps.setSecret(attr_value);
				}  else if (!.strcmp(attr_name, "server")) {
					ps.setServer(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "farm")) {
					ps.setFarm(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photos")) {
					ps.setPhotos_count(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "owner")) {
					ps.setOwner(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "title")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							ps.setTitle((byte).malloc(len + 1));
							.memcpy(ps.getTitle(), chnode.getChildren().getContent(), len + 1);
						} 
					}  else if (!.strcmp(chnode_name, "description")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							ps.setDescription((byte).malloc(len + 1));
							.memcpy(ps.getDescription(), chnode.getChildren().getContent(), len + 1);
						} 
					} 
				} 
			}
			photosets[photoset_count++] = ps/* for nodes */;
		}
		if (photoset_count_p) {
			photoset_count_p = photoset_count;
		} 
		return photosets;
	}
	public static Object flickcurl_build_photoset(Object fc, Object xpathCtx) {
		flickcurl_photoset photosets = new flickcurl_photoset();
		flickcurl_photoset result = ((Object)0);
		photosets = ModernizedCProgram.flickcurl_build_photosets(fc, xpathCtx, ()"/rsp/photoset", ((Object)0));
		if (photosets) {
			result = photosets[0];
			.free(photosets);
		} 
		return result;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * args.c - Flickcurl method arg functions
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
	public static void flickcurl_free_arg(Object arg) {
		do {
			if (!arg) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_arg is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\args.c", 40, __func__);
				return ;
			} 
		} while (0);
		if (arg.getName()) {
			.free(arg.getName());
		} 
		if (arg.getDescription()) {
			.free(arg.getDescription());
		} 
		.free(arg);
	}
	public static Object flickcurl_build_args(Object fc, Object xpathCtx, Object xpathExpr, Object arg_count_p) {
		flickcurl_arg args = ((Object)0);
		int nodes_count;
		int arg_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do args */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		args = (flickcurl_arg).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_arg arg = new flickcurl_arg();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			arg = (flickcurl_arg).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte attr_name = (byte)attr.getName();
				if (!.strcmp(attr_name, "name")) {
					size_t len = .strlen((byte)attr.getChildren().getContent());
					arg.setName((byte).malloc(len + 1));
					.memcpy(arg.getName(), attr.getChildren().getContent(), len + 1);
				}  else if (!.strcmp(attr_name, "optional")) {
					arg.setOptional(.atoi((byte)attr.getChildren().getContent()));
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					arg.setDescription((byte).malloc(len + 1));
					.memcpy(arg.getDescription(), (byte)chnode.getContent(), len + 1);
					break;
				} 
			}
			args[arg_count++] = arg/* for nodes */;
		}
		if (arg_count_p) {
			arg_count_p = arg_count;
		} 
		return args;
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
	public static Object my_vsnprintf(Object message, Object arguments) {
		int len;
		byte buffer = ((Object)0);
		va_list args_copy = new va_list();
		/* copy for re-use */
		int size = /* copy for re-use *//* This vsnprintf doesn't return number of bytes required */2;
		while (1) {
			buffer = (byte).malloc(size + 1);
			if (!buffer) {
				break;
			} 
			.__builtin_va_copy(args_copy, /* copy for re-use */arguments);
			len = ._vsnprintf(buffer, size, message, args_copy);
			.__builtin_va_end(args_copy);
			if (len >= 0) {
				break;
			} 
			.free(buffer);
			size += 4;
		}
		return buffer;
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
	public static void flickcurl_free_category(Object category) {
		do {
			if (!category) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_category is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\category.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (category.getId()) {
			.free(category.getId());
		} 
		if (category.getName()) {
			.free(category.getName());
		} 
		if (category.getCategories()) {
			ModernizedCProgram.flickcurl_free_categories(category.getCategories());
		} 
		if (category.getGroups()) {
			ModernizedCProgram.flickcurl_free_groups(category.getGroups());
		} 
		.free(category/**
		 * flickcurl_free_categories:
		 * @categories_object: category object array
		 *
		 * Destructor for array of category object
		 */);
	}
	public static void flickcurl_free_categories(Object categories_object) {
		int i;
		do {
			if (!categories_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_category is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\category.c", 75, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; categories_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_category(categories_object[i]);
		}
		.free(categories_object);
	}
	public static Object flickcurl_build_categories(Object fc, Object xpathCtx, Object xpathExpr, Object category_count_p) {
		flickcurl_category categories = ((Object)0);
		int nodes_count;
		int category_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		categories = (flickcurl_category).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_category c = new flickcurl_category();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			c = (flickcurl_category).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
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
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * method.c - Flickcurl method functions
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
	 * flickcurl_free_method:
	 * @method: method object
	 *
	 * Destructor for method object
	 */
	public static void flickcurl_free_method(Object method) {
		int i;
		do {
			if (!method) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_method is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\method.c", 48, __func__);
				return ;
			} 
		} while (0);
		if (method.getName()) {
			.free(method.getName());
		} 
		if (method.getDescription()) {
			.free(method.getDescription());
		} 
		if (method.getResponse()) {
			.free(method.getResponse());
		} 
		if (method.getExplanation()) {
			.free(method.getExplanation());
		} 
		for (i = 0; i < method.getArgs_count(); i++) {
			ModernizedCProgram.flickcurl_free_arg(method.getArgs()[i]);
		}
		.free(method);
	}
	public static Object flickcurl_build_method(Object fc, Object xpathCtx) {
		int expri;
		flickcurl_method method = ((Object)0);
		method = (flickcurl_method).calloc(, 1);
		for (expri = 0; method_fields_table[expri].getXpath(); expri++) {
			flickcurl_method_field_type mft = method_fields_table[expri].getField();
			byte string_value = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, method_fields_table[expri].getXpath());
			switch (mft) {
			case .METHOD_FIELD_name:
					method.setName(string_value);
					string_value = ((Object)0);
					break;
			case .METHOD_FIELD_description:
					method.setDescription(string_value);
					string_value = ((Object)0);
					break;
			case .METHOD_FIELD_response:
					method.setResponse(string_value);
					string_value = ((Object)0);
					break;
			case .METHOD_FIELD_needslogin:
					method.setNeedslogin(.atoi(string_value));
					break;
			case .METHOD_FIELD_explanation:
					method.setExplanation(string_value);
					string_value = ((Object)0);
					break;
			default:
					ModernizedCProgram.flickcurl_error(fc, "Unknown method field %d", (int)mft);
					fc.setFailed(1);
			}
			if (string_value) {
				.free(string_value);
			} 
			if (fc.getFailed()) {
				;
			} 
		}
		method.setArgs(ModernizedCProgram.flickcurl_build_args(fc, /* As of 2007-04-15 - the response is different from the docs
		   * There is no /method/arguments element
		   */xpathCtx, ()"/rsp/arguments/argument", method.getArgs_count()));
		return method;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * note.c - Flickcurl note functions
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
	 * flickcurl_free_note:
	 * @note: note object
	 *
	 * Destructor for note object
	 */
	public static void flickcurl_free_note(Object note) {
		do {
			if (!note) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_note is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\note.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (note.getAuthor()) {
			.free(note.getAuthor());
		} 
		if (note.getAuthorname()) {
			.free(note.getAuthorname());
		} 
		if (note.getText()) {
			.free(note.getText());
		} 
		.free(note);
	}
	public static Object flickcurl_build_notes(Object fc, Object photo, Object xpathCtx, Object xpathExpr, Object note_count_p) {
		flickcurl_note notes = ((Object)0);
		int nodes_count;
		int note_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do notes */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		notes = (flickcurl_note).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_note n = new flickcurl_note();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			n = (flickcurl_note).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					n.setId(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "author")) {
					n.setAuthor(attr_value);
				}  else if (!.strcmp(attr_name, "authorname")) {
					n.setAuthorname(attr_value);
				}  else if (!.strcmp(attr_name, "x")) {
					n.setX(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "y")) {
					n.setY(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "w")) {
					n.setW(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "h")) {
					n.setH(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					n.setText((byte).malloc(len + 1));
					.memcpy(n.getText(), chnode.getContent(), len + 1);
				} 
			}
			notes[note_count++] = n/* for nodes */;
		}
		if (note_count_p) {
			note_count_p = note_count;
		} 
		return notes;
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
	public static void flickcurl_free_activity_event(Object activity_event) {
		do {
			if (!activity_event) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_activity_event is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\activity.c", 40, __func__);
				return ;
			} 
		} while (0);
		if (activity_event.getId()) {
			.free(activity_event.getId());
		} 
		if (activity_event.getType()) {
			.free(activity_event.getType());
		} 
		if (activity_event.getUser()) {
			.free(activity_event.getUser());
		} 
		if (activity_event.getUsername()) {
			.free(activity_event.getUsername());
		} 
		if (activity_event.getValue()) {
			.free(activity_event.getValue());
		} 
		.free(activity_event);
	}
	public static void flickcurl_free_activity(Object activity) {
		int i;
		do {
			if (!activity) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_activity is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\activity.c", 60, __func__);
				return ;
			} 
		} while (0);
		if (activity.getType()) {
			.free(activity.getType());
		} 
		if (activity.getId()) {
			.free(activity.getId());
		} 
		if (activity.getOwner()) {
			.free(activity.getOwner());
		} 
		if (activity.getOwner_name()) {
			.free(activity.getOwner_name());
		} 
		if (activity.getPrimary()) {
			.free(activity.getPrimary());
		} 
		if (activity.getSecret()) {
			.free(activity.getSecret());
		} 
		if (activity.getTitle()) {
			.free(activity.getTitle());
		} 
		for (i = 0; activity.getEvents()[i]; i++) {
			ModernizedCProgram.flickcurl_free_activity_event(activity.getEvents()[i]);
		}
		.free(activity/**
		 * flickcurl_free_activities:
		 * @activities_object: activity object array
		 *
		 * Destructor for array of activity objects
		 */);
	}
	public static void flickcurl_free_activities(Object activities_object) {
		int i;
		do {
			if (!activities_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_activity_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\activity.c", 95, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; activities_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_activity(activities_object[i]);
		}
		.free(activities_object);
	}
	public static Object flickcurl_build_activity_event(Object fc, Object node) {
		flickcurl_activity_event ae = new flickcurl_activity_event();
		 attr = new ();
		 chnode = new ();
		ae = (flickcurl_activity_event).calloc(, 1);
		if (!ae) {
			return ((Object)0);
		} 
		for (attr = node.getProperties(); attr; attr = attr.getNext()) {
			size_t attr_len = .strlen((byte)attr.getChildren().getContent());
			byte attr_name = (byte)attr.getName();
			byte attr_value;
			attr_value = (byte).malloc(attr_len + 1);
			.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
			if (!.strcmp(attr_name, "type")) {
				ae.setType(attr_value);
			}  else if (!.strcmp(attr_name, "commentid")) {
				ae.setId(attr_value);
			}  else if (!.strcmp(attr_name, "user")) {
				ae.setUser(attr_value);
			}  else if (!.strcmp(attr_name, "username")) {
				ae.setUsername(attr_value);
			}  else if (!.strcmp(attr_name, "dateadded")) {
				ae.setDate_added(.atoi(attr_value));
				.free(attr_value);
			} else {
					.free(attr_value/* end attributes */);
			} 
		}
		for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
			if (chnode.getType() == XML_TEXT_NODE) {
				size_t len = .strlen((byte)chnode.getContent());
				ae.setValue((byte).malloc(len + 1));
				.memcpy(ae.getValue(), chnode.getContent(), len + 1);
				break;
			} 
		}
		return ae;
	}
	public static Object flickcurl_build_activities(Object fc, Object xpathCtx, Object xpathExpr, Object activity_count_p) {
		flickcurl_activity activities = ((Object)0);
		int nodes_count;
		int activity_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		activities = (flickcurl_activity).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_activity a = new flickcurl_activity();
			 chnode = new ();
			int events_count = 0;
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			a = (flickcurl_activity).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "type")) {
					a.setType(attr_value);
				}  else if (!.strcmp(attr_name, "id")) {
					a.setId(attr_value);
				}  else if (!.strcmp(attr_name, "owner")) {
					a.setOwner(attr_value);
				}  else if (!.strcmp(attr_name, "ownername")) {
					a.setOwner_name(attr_value);
				}  else if (!.strcmp(attr_name, "primary")) {
					a.setPrimary(attr_value);
				}  else if (!.strcmp(attr_name, "secret")) {
					a.setSecret(attr_value);
				}  else if (!.strcmp(attr_name, "server")) {
					a.setServer(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "farm")) {
					a.setFarm(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "commentsold")) {
					a.setComments_old(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "commentsnew")) {
					a.setComments_new(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "notesold")) {
					a.setNotes_old(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "notesnew")) {
					a.setNotes_new(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "views")) {
					a.setViews(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photos")) {
					a.setPhotos(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "faves")) {
					a.setFaves(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "comments")) {
					a.setComments(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "more")) {
					a.setMore(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "title")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						a.setTitle((byte).malloc(len + 1));
						.memcpy(a.getTitle(), chnode.getChildren().getContent(), len + 1);
					}  else if (!.strcmp(chnode_name, "activity")) {
						 chnode2 = new ();
						for (chnode2 = chnode.getChildren(); chnode2; chnode2 = chnode2.getNext()) {
							byte chnode2_name = (byte)chnode2.getName();
							if (chnode2.getType() == XML_ELEMENT_NODE && !.strcmp(chnode2_name, "event")) {
								if (events_count < 20) {
									flickcurl_activity_event ae = ((Object)0);
									ae = ModernizedCProgram.flickcurl_build_activity_event(fc, chnode2);
									if (ae) {
										a.getEvents()[events_count++] = ae/* end for children of <activity> */;
									} 
								} 
							} 
						}
					} 
				} 
			}
			a.getEvents()[events_count] = /* end for children of <item> */0;
			activities[activity_count++] = a/* for nodes */;
		}
		if (activity_count_p) {
			activity_count_p = activity_count;
		} 
		return activities;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickr.panda-api.c - Flickr flickr.panda.* API calls
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
	public static Object flickcurl_build_pandas(Object fc, Object xpathCtx, Object xpathExpr, Object panda_count_p) {
		byte pandas = ((Object)0);
		int nodes_count;
		int panda_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		pandas = (byte).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			byte panda = ((Object)0);
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					panda = (byte).malloc(len + 1);
					.memcpy(panda, chnode.getContent(), len + 1);
					break;
				} 
			}
			if (panda) {
				pandas[panda_count++] = panda;
			} 
		}
		if (/* for nodes */panda_count_p) {
			panda_count_p = panda_count;
		} 
		return pandas/**
		 * flickcurl_panda_getList:
		 * @fc: flickcurl context
		 * 
		 * Get the current list of Flickr Pandas
		 *
		 * Can be used with flickcurl_panda_getPhotos() to get photos for the
		 * given <ulink url="https://www.flickr.com/explore/panda">Flickr Panda</ulink>
		 *
		 * Announced 2009-03-03
		 * http://code.flickr.com/blog/2009/03/03/panda-tuesday-the-history-of-the-panda-new-apis-explore-and-you/
		 *
		 * Implements flickr.panda.getList (1.9)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_panda_getList(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte pandas = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.panda.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		pandas = ModernizedCProgram.flickcurl_build_pandas(fc, xpathCtx, ()"/rsp/pandas/panda", ((Object)0));
		if (fc.getFailed()) {
			if (pandas) {
				.free(pandas);
			} 
			pandas = ((Object)0);
		} 
		return pandas/**
		 * flickcurl_panda_getPhotos:
		 * @fc: flickcurl context
		 * @panda_name: The name of the panda to ask for photos from.
		 * 
		 * Ask the Flickr Pandas for a list of recent public (and "safe") photos.
		 *
		 * Use flickcurl_panda_getList() to get the list of
		 * <ulink url="https://www.flickr.com/explore/panda">Flickr Pandas</ulink>
		 *
		 * Announced 2009-03-03
		 * http://code.flickr.com/blog/2009/03/03/panda-tuesday-the-history-of-the-panda-new-apis-explore-and-you/
		 *
		 * Only "supports the following extras: ownername, license,
		 * date_upload, date_taken, tags, machine_tags, views, media" -
		 * Sergey M., Flickr staff 2011-09-16
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/7203
		 *
		 * Implements flickr.panda.getPhotos (1.9)
		 * 
		 * Return value: photos array or NULL on failure
		 **/;
	}
	public static Object flickcurl_panda_getPhotos(Object fc, Object panda_name) {
		flickcurl_photo photos = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!panda_name) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "panda_name", panda_name);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.panda.getPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
		if (!photos_list) {
			fc.setFailed(1);
		} 
		if (photos_list) {
			photos = photos_list.getPhotos();
			photos_list.setPhotos(((Object)0));
			ModernizedCProgram.flickcurl_free_photos_list(/* photos array is now owned by this function */photos_list);
		} 
		return photos;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * stats-api.c - Flickr flickr.stats.* API calls
	 *
	 * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_stats_getCSVFiles:
	 * @fc: flickcurl context
	 * 
	 * Returns a list of URLs for text files containing historic stats data (from November 26th 2007 to 1 June 2010) for the current user.
	 *
	 * Not implemented since the files that this API call points to stop
	 * working after June 1 2010.
	 *
	 * Implements flickr.stats.getCSVFiles (1.19)
	 *
	 * Announced http://code.flickr.com/blog/2010/05/13/stats-api-redux/
	 * 
	 * Return value: always returns non-0 to signify failure
	 **/
	public static int flickcurl_stats_getCSVFiles(Object fc) {
		return 1/**
		 * flickcurl_stats_getCollectionDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @collection_id: The id of the collection to get stats for. If not provided, stats for all collections will be returned. (or NULL)
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a collection
		 *
		 * Implements flickr.stats.getCollectionDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getCollectionDomains(Object fc, Object date, Object collection_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		if (collection_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "collection_id", collection_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getCollectionDomains")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getCollectionReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @collection_id: The id of the collection to get stats for. If not provided, stats for all collections will be returned. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a collection
		 *
		 * Implements flickr.stats.getCollectionReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getCollectionReferrers(Object fc, Object date, Object domain, Object collection_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_add_param(fc, "domain", domain);
		if (collection_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "collection_id", collection_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getCollectionReferrers")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getCollectionStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according to
		 * Flickr Stats starts at midnight GMT for all users, and timestamps
		 * will automatically be rounded down to the start of the day.
		 * @collection_id: The id of the collection to get stats for.
		 * 
		 * Get the number of views on a collection for a given date.
		 *
		 * Implements flickr.stats.getCollectionStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: views count or <0 on failure
		 **/;
	}
	public static int flickcurl_stats_getCollectionStats(Object fc, Object date, Object collection_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte count_str;
		int count = -1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date || !collection_id) {
			return -1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_add_param(fc, "collection_id", collection_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getCollectionStats")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/@views");
		if (count_str) {
			count = .atoi(count_str);
			.free(count_str);
		} 
		if (fc.getFailed()) {
			count = -1;
		} 
		return count/**
		 * flickcurl_stats_getPhotoDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photo_id: The id of the photo to get stats for. If not provided, stats for all photos will be returned. (or NULL)
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a photo
		 *
		 * Implements flickr.stats.getPhotoDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPhotoDomains(Object fc, Object date, Object photo_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		if (photo_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotoDomains")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotoReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @photo_id: The id of the photo to get stats for. If not provided, stats for all photos will be returned. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a photo
		 *
		 * Implements flickr.stats.getPhotoReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPhotoReferrers(Object fc, Object date, Object domain, Object photo_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_add_param(fc, "domain", domain);
		if (photo_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotoReferrers")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotosetDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photoset_id: The id of the photoset to get stats for. If not provided, stats for all sets will be returned. (or NULL)
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a photoset
		 *
		 * Implements flickr.stats.getPhotosetDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPhotosetDomains(Object fc, Object date, Object photoset_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		if (photoset_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotosetDomains")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotosetReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @photoset_id: The id of the photoset to get stats for. If not provided, stats for all sets will be returned. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a photoset
		 *
		 * Implements flickr.stats.getPhotosetReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPhotosetReferrers(Object fc, Object date, Object domain, Object photoset_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_add_param(fc, "domain", domain);
		if (photoset_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotosetReferrers")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotosetStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photoset_id: The id of the photoset to get stats for.
		 * 
		 * Get the number of views on a photoset for a given date.
		 *
		 * Implements flickr.stats.getPhotosetStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: number of views or <0 on failure
		 **/;
	}
	public static int flickcurl_stats_getPhotosetStats(Object fc, Object date, Object photoset_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte count_str;
		int count = -1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date || !photoset_id) {
			return -1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotosetStats")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/@views");
		if (count_str) {
			count = .atoi(count_str);
			.free(count_str);
		} 
		if (fc.getFailed()) {
			count = -1;
		} 
		return count/**
		 * flickcurl_stats_getPhotoStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photo_id: The id of the photo to get stats for.
		 * 
		 * Get the number of views, comments and favorites on a photo for a given date.
		 *
		 * Implements flickr.stats.getPhotoStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPhotoStats(Object fc, Object date, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		flickcurl_stat stat1 = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date || !photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotoStats")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/stats", ((Object)0));
		if (stats) {
			stat1 = stats[0];
			stats[0] = ((Object)0);
			ModernizedCProgram.flickcurl_free_stats(stats);
		} 
		if (fc.getFailed()) {
			if (stat1) {
				ModernizedCProgram.flickcurl_free_stat(stat1);
			} 
			stat1 = ((Object)0);
		} 
		return stat1/**
		 * flickcurl_stats_getPhotostreamDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100 (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a photostream
		 *
		 * Implements flickr.stats.getPhotostreamDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPhotostreamDomains(Object fc, Object date, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotostreamDomains")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotostreamReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a user's photostream
		 *
		 * Implements flickr.stats.getPhotostreamReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPhotostreamReferrers(Object fc, Object date, Object domain, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_add_param(fc, "domain", domain);
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotostreamReferrers")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		stats = ModernizedCProgram.flickcurl_build_stats(fc, xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		if (fc.getFailed()) {
			if (stats) {
				ModernizedCProgram.flickcurl_free_stats(stats);
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotostreamStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * 
		 * Get the number of views on a user's photostream for a given date.
		 *
		 * Implements flickr.stats.getPhotostreamStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: number of views or <0 on failure
		 **/;
	}
	public static int flickcurl_stats_getPhotostreamStats(Object fc, Object date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte count_str;
		int count = -1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!date) {
			return -1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPhotostreamStats")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/@views");
		if (count_str) {
			count = .atoi(count_str);
			.free(count_str);
		} 
		if (fc.getFailed()) {
			count = -1;
		} 
		return count/**
		 * flickcurl_stats_getPopularPhotos:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.  If no date is provided, all time view counts will be
		 * returned. (or NULL)
		 * @sort: The order in which to sort returned photos. Defaults to views. The possible values are views, comments and favorites.  Other sort options are available through search. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: <code>description</code>, <code>license</code>, <code>date_upload</code>, <code>date_taken</code>, <code>owner_name</code>, <code>icon_server</code>, <code>original_format</code>, <code>last_update</code>, <code>geo</code>, <code>tags</code>, <code>machine_tags</code>, <code>o_dims</code>, <code>views</code>, <code>media</code>, <code>path_alias</code>, <code>url_sq</code>, <code>url_t</code>, <code>url_s</code>, <code>url_m</code>, <code>url_o</code> (or NULL)
		 * 
		 * Get stats for popular photos
		 *
		 * Implements flickr.stats.getPopularPhotos (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_stats_getPopularPhotos(Object fc, Object date, Object sort, int per_page, int page, Object extras) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		byte format = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photo photos = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(extras);
		list_params.setPer_page(per_page);
		list_params.setPage(page);
		if (date) {
			ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		} 
		if (sort) {
			ModernizedCProgram.flickcurl_add_param(fc, "sort", sort);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getPopularPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
		if (photos_list) {
			photos = photos_list.getPhotos();
			photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
			ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_stats_getTotalViews(Object fc, Object date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_view_stats views = ((Object)0);
		byte count_str;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (date) {
			ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.stats.getTotalViews")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		views = (flickcurl_view_stats).calloc(, 1);
		if (!views) {
			fc.setFailed(1);
			;
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/total/@views");
		if (count_str) {
			views.setTotal(.atoi(count_str));
			.free(count_str);
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/photos/@views");
		if (count_str) {
			views.setPhotos(.atoi(count_str));
			.free(count_str);
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/photostream/@views");
		if (count_str) {
			views.setPhotostreams(.atoi(count_str));
			.free(count_str);
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/sets/@views");
		if (count_str) {
			views.setSets(.atoi(count_str));
			.free(count_str);
		} 
		count_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/stats/collections/@views");
		if (count_str) {
			views.setCollections(.atoi(count_str));
			.free(count_str);
		} 
		if (fc.getFailed()) {
			if (views) {
				ModernizedCProgram.flickcurl_free_view_stats(views);
			} 
			views = ((Object)0);
		} 
		return views;
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
	public static Object flickcurl_groups_browse(Object fc, int cat_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_category category = ((Object)0);
		byte[] cat_id_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (cat_id >= 0) {
			.sprintf(cat_id_str, "%d", cat_id);
			ModernizedCProgram.flickcurl_add_param(fc, "cat_id", cat_id_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.browse")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		category = (flickcurl_category).calloc(, 1);
		category.setCategories(ModernizedCProgram.flickcurl_build_categories(fc, xpathCtx, ()"/rsp/category/subcat", category.getCategories_count()));
		category.setGroups(ModernizedCProgram.flickcurl_build_groups(fc, xpathCtx, ()"/rsp/category/group", category.getGroups_count()));
		if (fc.getFailed()) {
			if (category) {
				ModernizedCProgram.flickcurl_free_category(category);
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
	public static Object flickcurl_groups_getInfo(Object fc, Object group_id, Object lang) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		flickcurl_group group = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!group_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		if (lang) {
			ModernizedCProgram.flickcurl_add_param(fc, "lang", lang);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		groups = ModernizedCProgram.flickcurl_build_groups(fc, xpathCtx, ()"/rsp/group", ((Object)0));
		if (groups) {
			group = groups[0];
			.free(groups);
			groups = ((Object)0);
		} 
		if (fc.getFailed()) {
			if (group) {
				ModernizedCProgram.flickcurl_free_group(group);
			} 
			group = ((Object)0);
		} 
		return group/**
		 * flickcurl_groups_join:
		 * @fc: flickcurl context
		 * @group_id: The NSID of the Group in question
		 * @accept_rules: If the group has rules, they must be displayed to the user prior to joining. Passing a true value for this argument specifies that the application has displayed the group rules to the user, and that the user has agreed to them. (See flickr.groups.getInfo). Probably takes a '1' or '0' value (or NULL)
		 * 
		 * Join a public group as a member.
		 *
		 * Implements flickr.groups.join (1.25)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_groups_join(Object fc, Object group_id, Object accept_rules) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!group_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		if (accept_rules) {
			ModernizedCProgram.flickcurl_add_param(fc, "accept_rules", accept_rules);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.join")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_joinRequest:
		 * @fc: flickcurl context
		 * @group_id: The NSID of the group to request joining.
		 * @message: Message to the administrators.
		 * @accept_rules: If the group has rules, they must be displayed to the user prior to joining. Passing a true value for this argument specifies that the application has displayed the group rules to the user, and that the user has agreed to them. (See flickr.groups.getInfo).  Probably takes a '1' or '0' value.
		 * 
		 * Request to join a group that is invitation-only.
		 *
		 * Implements flickr.groups.joinRequest (1.25)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_groups_joinRequest(Object fc, Object group_id, Object message, Object accept_rules) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!group_id || !message || !accept_rules) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		ModernizedCProgram.flickcurl_add_param(fc, "message", message);
		ModernizedCProgram.flickcurl_add_param(fc, "accept_rules", accept_rules);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.joinRequest")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_leave:
		 * @fc: flickcurl context
		 * @group_id: The NSID of the Group to leave
		 * @delete_photos: Delete all photos by this user from the group.  Probably takes a '1' or '0' value (or NULL)
		 * 
		 * Leave a group.
		 *
		 * If the user is the only administrator left, and there are other
		 * members, the oldest member will be promoted to administrator.
		 * 
		 * If the user is the last person in the group, the group will be deleted.
		 *
		 * Implements flickr.groups.leave (1.25)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_groups_leave(Object fc, Object group_id, Object delete_photos) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!group_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "group_id", group_id);
		if (delete_photos) {
			ModernizedCProgram.flickcurl_add_param(fc, "delete_photos", delete_photos);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.leave")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_search:
		 * @fc: flickcurl context
		 * @text: The text to search for.
		 * @per_page: Number of groups to return per page, default 100, max 500 (or NULL)
		 * @page: The page of results to return, default 1 (or NULL)
		 * 
		 * Search for groups. 18+ groups will only be returned for
		 * authenticated calls where the authenticated user is over 18.
		 *
		 * Implements flickr.groups.search (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_groups_search(Object fc, Object text, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		byte[] per_page_s = new byte[10];
		byte[] page_s = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!text) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "text", text);
		.sprintf(per_page_s, "%d", per_page);
		ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.groups.search")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		groups = ModernizedCProgram.flickcurl_build_groups(fc, xpathCtx, ()"/rsp/groups/group", ((Object)0));
		if (fc.getFailed()) {
			if (groups) {
				ModernizedCProgram.flickcurl_free_groups(groups);
			} 
			groups = ((Object)0);
		} 
		return groups;
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
	public static void flickcurl_free_stat(Object stat) {
		do {
			if (!stat) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_stat is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\stat.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (stat.getName()) {
			.free(stat.getName());
		} 
		if (stat.getUrl()) {
			.free(stat.getUrl());
		} 
		if (stat.getSearchterms()) {
			.free(stat.getSearchterms());
		} 
		.free(stat/**
		 * flickcurl_free_stats:
		 * @stats_object: stat object array
		 *
		 * Destructor for array of stat objects
		 */);
	}
	public static void flickcurl_free_stats(Object stats_object) {
		int i;
		do {
			if (!stats_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_stat_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\stat.c", 70, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; stats_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_stat(stats_object[i]);
		}
		.free(stats_object/**
		 * flickcurl_free_view_stats:
		 * @view_stats: view stat object
		 *
		 * Destructor for view stat object
		 */);
	}
	public static void flickcurl_free_view_stats(Object view_stats) {
		do {
			if (!view_stats) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_view_stats is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\stat.c", 88, __func__);
				return ;
			} 
		} while (0);
		.free(view_stats);
	}
	public static Object flickcurl_build_stats(Object fc, Object xpathCtx, Object xpathExpr, Object stat_count_p) {
		flickcurl_stat stats = ((Object)0);
		int nodes_count;
		int stat_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		stats = (flickcurl_stat).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_stat s = new flickcurl_stat();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			s = (flickcurl_stat).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "views")) {
					s.setViews(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "comments")) {
					s.setComments(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "favorites")) {
					s.setFavorites(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					s.setName(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					s.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "searchterms")) {
					s.setSearchterms(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			stats[stat_count++] = s/* for nodes */;
		}
		if (stat_count_p) {
			stat_count_p = stat_count;
		} 
		return stats;
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
	public static void flickcurl_free_context(Object context) {
		do {
			if (!context) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_context is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\context.c", 74, __func__);
				return ;
			} 
		} while (0);
		if (context.getId()) {
			.free(context.getId());
		} 
		if (context.getSecret()) {
			.free(context.getSecret());
		} 
		if (context.getTitle()) {
			.free(context.getTitle());
		} 
		if (context.getUrl()) {
			.free(context.getUrl());
		} 
		if (context.getThumb()) {
			.free(context.getThumb());
		} 
		.free(context/**
		 * flickcurl_free_contexts:
		 * @contexts: context object array
		 *
		 * Destructor for array of context object
		 */);
	}
	public static void flickcurl_free_contexts(Object contexts) {
		int i;
		do {
			if (!contexts) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_context_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\context.c", 101, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; contexts[i]; i++) {
			ModernizedCProgram.flickcurl_free_context(contexts[i]);
		}
		.free(contexts);
	}
	public static Object flickcurl_build_contexts(Object fc, Object doc) {
		flickcurl_context contexts = ((Object)0);
		 xnp = new ();
		 node = new ();
		int i;
		int count = 0;
		int nodes_count = 0;
		xnp = .xmlDocGetRootElement(doc);
		for (node = xnp.getChildren(); node; node = node.getNext()) {
			if (node.getType() == XML_ELEMENT_NODE) {
				nodes_count++;
			} 
		}
		contexts = (flickcurl_context).calloc(, nodes_count + 1);
		xnp = .xmlDocGetRootElement(/* walk children elements of root element */doc);
		for (; node; ) {
			 attr = new ();
			flickcurl_context context = new flickcurl_context();
			flickcurl_context_type type = .FLICKCURL_CONTEXT_NONE;
			int j;
			if (node.getType() != XML_ELEMENT_NODE) {
				continue;
			} 
			for (j = 0; j <= .FLICKCURL_CONTEXT_LAST; j++) {
				if (!.strcmp((byte)node.getName(), ModernizedCProgram.flickcurl_context_type_element[j])) {
					type = (flickcurl_context_type)j;
					break;
				} 
			}
			if (type == .FLICKCURL_CONTEXT_NONE) {
				continue;
			} 
			context = (flickcurl_context).calloc(, 1);
			context.setType(type);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					context.setId(attr_value);
				}  else if (!.strcmp(attr_name, "secret")) {
					context.setSecret(attr_value);
				}  else if (!.strcmp(attr_name, "server")) {
					context.setServer(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "farm")) {
					context.setFarm(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "title")) {
					context.setTitle(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					context.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "thumb")) {
					context.setThumb(attr_value);
				} else {
						.free(attr_value/* for attributes */);
				} 
			}
			contexts[count++] = context/* for nodes */;
		}
		contexts[count] = ((Object)0);
		return contexts;
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
	public static void flickcurl_free_location(Object location) {
		do {
			if (!location) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_location is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\location.c", 52, __func__);
				return ;
			} 
		} while (0);
		.free(location);
	}
	public static Object flickcurl_build_location(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_location location = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do location */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				continue;
			} 
			location = (flickcurl_location).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				size_t attr_value_len = .strlen((byte)attr.getChildren().getContent());
				attr_value = (byte).malloc(attr_value_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_value_len + 1);
				if (!.strcmp(attr_name, "latitude")) {
					location.setLatitude(.atof(attr_value));
				}  else if (!.strcmp(attr_name, "longitude")) {
					location.setLongitude(.atof(attr_value));
				}  else if (!.strcmp(attr_name, "accuracy")) {
					location.setAccuracy(.atoi(attr_value));
				} 
				.free(attr_value);
			}
			break;
		}
		return location;
	}
	public static Object flickcurl_get_location_accuracy_label(int accuracy) {
		if (accuracy >= 1 && accuracy <= 16) {
			return ModernizedCProgram.flickcurl_accuracy_labels[accuracy - 1];
		} 
		return ((Object)0);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * contacts.c - Flickcurl method contact functions
	 *
	 * Copyright (C) 2007-2009, David Beckett http://www.dajobe.org/
	 * Copyright (C) 2007 Vanilla I. Shu 
	 *   (flickcurl_free_contact, flickcurl_free_contacts,
	 *    flickcurl_build_contacts)
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
	 * flickcurl_free_contact:
	 * @contact_object: contact object
	 *
	 * Destructor for contact object
	 */
	public static void flickcurl_free_contact(Object contact_object) {
		do {
			if (!contact_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_contact is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\contacts.c", 49, __func__);
				return ;
			} 
		} while (0);
		if (contact_object.getNsid()) {
			.free(contact_object.getNsid());
		} 
		if (contact_object.getUsername()) {
			.free(contact_object.getUsername());
		} 
		if (contact_object.getRealname()) {
			.free(contact_object.getRealname());
		} 
		.free(contact_object/**
		 * flickcurl_free_contacts:
		 * @contacts_object: contact object array
		 *
		 * Destructor for array of contact object
		 */);
	}
	public static void flickcurl_free_contacts(Object contacts_object) {
		int i;
		do {
			if (!contacts_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_contact is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\contacts.c", 73, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; contacts_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_contact(contacts_object[i]);
		}
		.free(contacts_object);
	}
	public static Object flickcurl_build_contacts(Object fc, Object xpathCtx, Object xpathExpr, Object contact_count_p) {
		flickcurl_contact contacts = ((Object)0);
		int nodes_count;
		int contact_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do contacts */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		contacts = (flickcurl_contact).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_contact contact_object = new flickcurl_contact();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			contact_object = (flickcurl_contact).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "nsid")) {
					contact_object.setNsid(attr_value);
				}  else if (!.strcmp(attr_name, "username")) {
					contact_object.setUsername(attr_value);
				}  else if (!.strcmp(attr_name, "iconserver")) {
					contact_object.setIconserver(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "realname")) {
					contact_object.setRealname(attr_value);
				}  else if (!.strcmp(attr_name, "friend")) {
					contact_object.setIs_friend(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "family")) {
					contact_object.setIs_family(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "ignored")) {
					contact_object.setIgnored(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "uploaded")) {
					contact_object.setUploaded(.atoi((byte)attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			contacts[contact_count++] = contact_object/* for nodes */;
		}
		if (contact_count_p) {
			contact_count_p = contact_count;
		} 
		return contacts;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickr.prefs-api.c - Flickr flickr.prefs.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_prefs_getContentType:
	 * @fc: flickcurl context
	 * 
	 * Returns the default content type preference for the user.
	 *
	 * Implements flickr.prefs.getContentType (1.3)
	 * 
	 * Return value: content type or <0 on failure
	 **/
	public static int flickcurl_prefs_getContentType(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte content_type_str = ((Object)0);
		int content_type = -1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.prefs.getContentType")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		content_type_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/person/@content_type");
		if (content_type_str) {
			content_type = .atoi(content_type_str);
			.free(content_type_str);
		} 
		if (fc.getFailed()) {
			content_type = -1;
		} 
		return content_type/**
		 * flickcurl_prefs_getGeoPerms:
		 * @fc: flickcurl context
		 * 
		 * Returns the default privacy level for geographic information attached to the user's photos. 
		 *
		 * Possible values are: 0: no default, 1: public, 2: contacts only, 3: friends
		 * and family only, 4: friends only, 5: family only, 6: private.
		 *
		 * Implements flickr.prefs.getGeoPerms (1.4)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_prefs_getGeoPerms(Object fc) {
		byte v;
		int r = -1;
		v = ModernizedCProgram.flickcurl_call_get_one_string_field(fc, ((Object)0), ((Object)0), "flickr.prefs.getGeoPerms", ()"/rsp/person/@geoperms");
		if (v) {
			r = .atoi(v);
			.free(v);
		} 
		return r/**
		 * flickcurl_prefs_getHidden:
		 * @fc: flickcurl context
		 * 
		 * Returns the default hidden preference for the user.
		 *
		 * Implements flickr.prefs.getHidden (1.3)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_prefs_getHidden(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte hidden_str = ((Object)0);
		int hidden = -1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.prefs.getHidden")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		hidden_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/person/@hidden");
		if (hidden_str) {
			hidden = .atoi(hidden_str);
			.free(hidden_str);
		} 
		if (fc.getFailed()) {
			hidden = -1;
		} 
		return hidden/**
		 * flickcurl_prefs_getPrivacy:
		 * @fc: flickcurl context
		 * 
		 * Returns the default privacy level preference for the user.
		 * 
		 * Possible values are: Public (1), Friends only (2),  Family only (3)
		 * Friends and Family (4) and Private (5)
		 *
		 * Implements flickr.prefs.getPrivacy (1.3)
		 * 
		 * Return value: privacy level or <0 on failure
		 **/;
	}
	public static int flickcurl_prefs_getPrivacy(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte privacy_level_str = ((Object)0);
		int privacy_level = -1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.prefs.getPrivacy")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		privacy_level_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/person/@privacy");
		if (privacy_level_str) {
			privacy_level = .atoi(privacy_level_str);
			.free(privacy_level_str);
		} 
		if (fc.getFailed()) {
			privacy_level = -1;
		} 
		return privacy_level/**
		 * flickcurl_prefs_getSafetyLevel:
		 * @fc: flickcurl context
		 * 
		 * Returns the default safety level preference for the user.
		 *
		 * Implements flickr.prefs.getSafetyLevel (1.3)
		 * 
		 * Return value: safety level or <0 on failure
		 **/;
	}
	public static int flickcurl_prefs_getSafetyLevel(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte safety_level_str = ((Object)0);
		int safety_level = -1;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.prefs.getSafetyLevel")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		safety_level_str = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/person/@safety_level");
		if (safety_level_str) {
			safety_level = .atoi(safety_level_str);
			.free(safety_level_str);
		} 
		if (fc.getFailed()) {
			safety_level = -1;
		} 
		return safety_level;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * shape.c - Flickr shape support calls
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
	 * flickcurl_free_shape:
	 * @shape: shape object
	 *
	 * Destructor for shape object
	 */
	public static void flickcurl_free_shape(Object shape) {
		int i;
		do {
			if (!shape) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_shapedata is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\shape.c", 56, __func__);
				return ;
			} 
		} while (0);
		if (shape.getData()) {
			.free(shape.getData());
		} 
		if (shape.getFile_urls()) {
			for (i = 0; i < shape.getFile_urls_count(); i++) {
				.free(shape.getFile_urls()[i]);
			}
			.free(shape.getFile_urls());
		} 
		.free(shape/**
		 * flickcurl_free_shapes:
		 * @shapes_object: shape object array
		 *
		 * Destructor for array of shape object
		 */);
	}
	public static void flickcurl_free_shapes(Object shapes_object) {
		int i;
		do {
			if (!shapes_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_shapedata_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\shape.c", 82, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; shapes_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_shape(shapes_object[i]);
		}
		.free(shapes_object);
	}
	/* get shapedata from value */
	public static Object flickcurl_build_shapes(Object fc, Object xpathCtx, Object xpathExpr, Object shape_count_p) {
		flickcurl_shapedata shapes = ((Object)0);
		int nodes_count;
		int shape_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int i;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		shapes = (flickcurl_shapedata).calloc(, nodes_count + 1);
		if (shape_count_p) {
			shape_count_p = shape_count;
		} 
		if (fc.getFailed()) {
			if (shapes) {
				ModernizedCProgram.flickcurl_free_shapes(shapes);
			} 
			shapes = ((Object)0);
		} 
		return shapes;
	}
	public static Object flickcurl_build_shape(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_shapedata shapes = new flickcurl_shapedata();
		flickcurl_shapedata result = ((Object)0);
		shapes = ModernizedCProgram.flickcurl_build_shapes(fc, xpathCtx, xpathExpr, ((Object)0));
		if (shapes) {
			result = shapes[0];
			.free(shapes);
		} 
		return result;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * config.c - INI configuration file handling
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
	 * flickcurl_config_read_ini:
	 * @fc: flickcurl config
	 * @filename: filename
	 * @section: section name to use
	 * @user_data: user data pointer for handler (usually the @fc )
	 * @handler: config variable handler function (usually flickcurl_config_var_handler() )
	 *
	 * Read flickcurl library configuration in .INI format from a filename
	 *
	 * Return value: non-0 on failure
	 */
	public static int flickcurl_config_read_ini(Object fc, Object filename, Object section, Object user_data, Object handler) {
		FILE fh = new FILE();
		byte[] buf = new byte[255 + 1];
		int in_section = 0;
		int lineno = 1;
		size_t section_len = new size_t();
		if (!fc || !filename || !section || !handler) {
			return 1;
		} 
		fh = .fopen(filename, "r");
		if (!fh) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to open %s for reading - %s", filename, .strerror((._errno())));
			return 1;
		} 
		section_len = .strlen(section);
		while (!((fh).get_flag() & -1024)) {
			size_t len = new size_t();
			byte line;
			byte p;
			int warned = 0;
			int c = -1;
			int lastch = -1;
			for (; !((fh).get_flag() & -1024); lastch = c) {
				c = .fgetc(fh);
				if (c == (byte)'\n') {
					/* Line endings: \n or \r\n (\r is removed after this loop) */lineno++;
					break;
				}  else if (lastch == (byte)'\r') {
					.ungetc(c, /* Line ending: \r - need to put back this character */fh);
					line--;
					len--;
					lineno++;
					break;
				} 
				if (len > 255) {
					if (!warned++) {
						.fprintf((_iob[2]), "flickcurl_config_read_ini(): line %d too long - truncated\n", lineno);
					} 
					continue;
				} 
				line++ = c;
				len++;
			}
			line = (byte)'\0';
			if (!len) {
				continue;
			} 
			for (line = /* remove leading spaces */buf; line && (line == (byte)' ' || line == (byte)'\t'); ) {
				;
			}
			if (line[len - 1] == /* remove trailing \r, \n or \r\n */(byte)'\n') {
				line[(len--) - 1] = (byte)'\0';
			} 
			if (line[len - 1] == (byte)'\r') {
				line[(len--) - 1] = (byte)'\0';
			} 
			if (!line || line == /* skip if empty line or all white space OR starts with a comment */(byte)'#') {
				continue;
			} 
			if (!/* Wait for a line '['application']' */in_section) {
				if (line == (byte)'[' && line[len - 1] == (byte)']' && (len - 2) == section_len && !.strncmp(line + 1, section, len - 2)) {
					in_section = 1;
				} 
				continue;
			} 
			if (line == /* End at a line starting with '[' */(byte)'[') {
				break;
			} 
			p = .strchr(line, (byte)'=');
			if (p) {
				byte kchar;
				p = (byte)'\0';
				kchar = (p - /* remove trailing spaces at end of key */1);
				while (kchar >= line && .isspace(kchar)) {
					kchar-- = (byte)'\0';
				}
				/* remove leading spaces at start of value */p++;
				while (p && .isspace(p)) {
					p++;
				}
				if (handler) {
					.handler(user_data, line, p);
				} 
			} 
		}
		.fclose(fh);
		return 0/**
		 * read_ini_config:
		 * @filename: filename
		 * @section: section name to use
		 * @user_data: user data pointer for handler
		 * @handler: config variable handler function
		 *
		 * @Deprecated for flickcurl_config_read_ini()
		 * 
		 * Read .INI config
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public static int read_ini_config(Object filename, Object section, Object user_data, Object handler) {
		return ModernizedCProgram.flickcurl_config_read_ini(((Object)0), filename, section, user_data, handler/**
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
		if (!.strcmp(key, "api_key")) {
			ModernizedCProgram.flickcurl_set_api_key(fc, value);
		}  else if (!.strcmp(key, "secret")) {
			ModernizedCProgram.flickcurl_set_shared_secret(fc, value);
		}  else if (!.strcmp(key, "auth_token")) {
			ModernizedCProgram.flickcurl_set_auth_token(fc, value);
		}  else if (!.strcmp(key, "oauth_client_key")) {
			ModernizedCProgram.flickcurl_set_oauth_client_key(fc, value);
		}  else if (!.strcmp(key, "oauth_client_secret")) {
			ModernizedCProgram.flickcurl_set_oauth_client_secret(fc, value);
		}  else if (!.strcmp(key, "oauth_token")) {
			ModernizedCProgram.flickcurl_set_oauth_token(fc, value);
		}  else if (!.strcmp(key, "oauth_token_secret")) {
			ModernizedCProgram.flickcurl_set_oauth_token_secret(fc, value/**
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
	public static int flickcurl_config_write_ini(Object fc, Object filename, Object section) {
		byte s;
		FILE fh = new FILE();
		if (!fc || !filename || !section) {
			return 1;
		} 
		fh = .fopen(filename, "w");
		if (!fh) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to write to configuration file %s - %s", filename, .strerror((._errno())));
			return 1;
		} 
		.fputc((byte)'[', fh);
		.fputs(section, fh);
		.fputc((byte)']', fh);
		s = ModernizedCProgram.flickcurl_get_oauth_token(fc);
		if (s) {
			.fputs("\noauth_token=", /* OAuth token and secret */fh);
			.fputs(s, fh);
			s = ModernizedCProgram.flickcurl_get_oauth_token_secret(fc);
			if (s) {
				.fputs("\noauth_token_secret=", fh);
				.fputs(s, fh);
			} 
			s = ModernizedCProgram.flickcurl_get_oauth_client_key(fc);
			if (s) {
				.fputs("\noauth_client_key=", fh);
				.fputs(s, fh);
			} 
			s = ModernizedCProgram.flickcurl_get_oauth_client_secret(fc);
			if (s) {
				.fputs("\noauth_client_secret=", fh);
				.fputs(s, fh);
			} 
		} else {
				s = ModernizedCProgram.flickcurl_get_auth_token(/* Legacy Flickr auth */fc);
				if (s) {
					.fputs("\noauth_token=", fh);
					.fputs(s, fh);
				} 
				s = ModernizedCProgram.flickcurl_get_shared_secret(fc);
				if (s) {
					.fputs("\noauth_secret=", fh);
					.fputs(s, fh);
				} 
				s = ModernizedCProgram.flickcurl_get_api_key(fc);
				if (s) {
					.fputs("\napi_key=", fh);
					.fputs(s, fh);
				} 
		} 
		.fputs("\n", fh);
		.fclose(fh);
		return 0;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * galleries-api.c - Flickr flickr.galleries.* API calls
	 *
	 * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_galleries_addPhoto:
	 * @fc: flickcurl context
	 * @gallery_id: The ID of the gallery to add a photo to as returned by flickcurl_galleries_getList() and flickcurl_galleries_getListForPhoto().
	 * @photo_id: The photo ID to add to the gallery.
	 * @comment_text: A short comment or story to accompany the photo (or NULL).
	 * 
	 * Add a photo to a gallery.
	 *
	 * Implements flickr.galleries.addPhoto (1.17)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_galleries_addPhoto(Object fc, Object gallery_id, Object photo_id, Object comment_text) {
		 doc = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!gallery_id || !photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "gallery_id", gallery_id);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		if (comment_text) {
			ModernizedCProgram.flickcurl_add_param(fc, "comment", comment_text);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.addPhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
	}
	public static Object flickcurl_galleries_create(Object fc, Object title, Object description, Object primary_photo_id, Object gallery_url_p) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte gallery_id = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!title || !description) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "title", title);
		ModernizedCProgram.flickcurl_add_param(fc, "description", description);
		if (primary_photo_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "primary_photo_id", primary_photo_id);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.create")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		gallery_id = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/gallery/@id");
		if (gallery_url_p) {
			gallery_url_p = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/gallery/@url");
		} 
		if (fc.getFailed()) {
			if (gallery_id) {
				.free(gallery_id);
			} 
			gallery_id = ((Object)0);
		} 
		return gallery_id/**
		 * flickcurl_galleries_editMeta:
		 * @fc: flickcurl context
		 * @gallery_id: The gallery ID to update.
		 * @title: The new title for the gallery.
		 * @description: The new description for the gallery. (or NULL)
		 * 
		 * Modify the meta-data for a gallery.
		 *
		 * Implements flickr.galleries.editMeta (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_galleries_editMeta(Object fc, Object gallery_id, Object title, Object description) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!gallery_id || !title) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "gallery_id", gallery_id);
		ModernizedCProgram.flickcurl_add_param(fc, "title", title);
		if (description) {
			ModernizedCProgram.flickcurl_add_param(fc, "description", description);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.editMeta")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_galleries_editPhoto:
		 * @fc: flickcurl context
		 * @gallery_id: The ID of the gallery to add a photo to. Note: this is the compound ID returned in methods like flickr.galleries.getList, and flickr.galleries.getListForPhoto.
		 * @photo_id: The photo ID to add to the gallery.
		 * @new_comment: The updated comment the photo.
		 * 
		 * Edit the comment for a gallery photo.
		 *
		 * Implements flickr.galleries.editPhoto (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_galleries_editPhoto(Object fc, Object gallery_id, Object photo_id, Object new_comment) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!gallery_id || !photo_id || !new_comment) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "gallery_id", gallery_id);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "comment", new_comment);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.editPhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_galleries_editPhotos:
		 * @fc: flickcurl context
		 * @gallery_id: The id of the gallery to modify. The gallery must belong to the calling user.
		 * @primary_photo_id: The id of the photo to use as the 'primary' photo for the gallery. This id must also be passed along in photo_ids list argument.
		 * @photo_ids_array: Array of photo ids to include in the gallery. They will appear in the set in the order sent. This list MUST contain the primary photo id. This list of photos replaces the existing list.
		 * 
		 * Modify the photos in a gallery. Use this method to add, remove and re-order photos.
		 *
		 * Implements flickr.galleries.editPhotos (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_galleries_editPhotos(Object fc, Object gallery_id, Object primary_photo_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!gallery_id || !primary_photo_id || !photo_ids_array) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "gallery_id", gallery_id);
		ModernizedCProgram.flickcurl_add_param(fc, "primary_photo_id", primary_photo_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		ModernizedCProgram.flickcurl_add_param(fc, "photo_ids", photo_ids);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.editPhotos")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		if (fc.getFailed()) {
			result = 1;
		} 
		return result/**
		 * flickcurl_galleries_getInfo:
		 * @fc: flickcurl context
		 * @gallery_id: The gallery ID you are requesting information for.
		 * 
		 * Get information for a gallery.
		 *
		 * Implements flickr.galleries.getInfo (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: gallery or NULL on failure
		 **/;
	}
	public static Object flickcurl_galleries_getInfo(Object fc, Object gallery_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_gallery gallery = ((Object)0);
		flickcurl_gallery galleries = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!gallery_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "gallery_id", gallery_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		galleries = ModernizedCProgram.flickcurl_build_galleries(fc, xpathCtx, ()"/rsp/galleries/gallery", ((Object)0));
		if (galleries) {
			gallery = galleries[0];
			galleries[0] = ((Object)0);
			ModernizedCProgram.flickcurl_free_galleries(galleries);
		} 
		if (fc.getFailed()) {
			gallery = ((Object)0);
		} 
		return gallery/**
		 * flickcurl_galleries_getList:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to get a galleries list for. If none is specified, the calling user is assumed.
		 * @per_page: Number of galleries to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Return the list of galleries created by a user.
		 *
		 * Galleries are returned sorted from newest to oldest.
		 *
		 * Implements flickr.galleries.getList (1.17)
		 * 
		 * Return value: array of galleries or NULL on failure
		 **/;
	}
	public static Object flickcurl_galleries_getList(Object fc, Object user_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_gallery galleries = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		galleries = ModernizedCProgram.flickcurl_build_galleries(fc, xpathCtx, ()"/rsp/galleries/gallery", ((Object)0));
		if (fc.getFailed()) {
			if (galleries) {
				ModernizedCProgram.flickcurl_free_galleries(galleries);
			} 
			galleries = ((Object)0);
		} 
		return galleries/**
		 * flickcurl_galleries_getListForPhoto:
		 * @fc: flickcurl context
		 * @photo_id: The ID of the photo to fetch a list of galleries for.
		 * @per_page: Number of galleries to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Return the list of galleries to which a photo has been added.
		 *
		 * Galleries are returned sorted by date which the photo was added to
		 * the gallery.
		 *
		 * Implements flickr.galleries.getListForPhoto (1.17)
		 * 
		 * Return value: array of galleries or NULL on failure
		 **/;
	}
	public static Object flickcurl_galleries_getListForPhoto(Object fc, Object photo_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_gallery galleries = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.getListForPhoto")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		galleries = ModernizedCProgram.flickcurl_build_galleries(fc, xpathCtx, ()"/rsp/galleries/gallery", ((Object)0));
		if (fc.getFailed()) {
			if (galleries) {
				ModernizedCProgram.flickcurl_free_galleries(galleries);
			} 
			galleries = ((Object)0);
		} 
		return galleries/**
		 * flickcurl_galleries_getPhotos_params:
		 * @fc: flickcurl context
		 * @gallery_id: The ID of the gallery of photos to return
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 *
		 * Return the list of photos for a gallery
		 * 
		 * Currently supported extras fields are: description, license,
		 * date_upload, date_taken, owner_name, icon_server, original_format,
		 * last_update, geo, tags, machine_tags, o_dims, views, media,
		 * path_alias, url_sq, url_t, url_s, url_m, url_o
		 *
		 * Return value: list of people public photos or NULL on failure
		 **/;
	}
	public static Object flickcurl_galleries_getPhotos_params(Object fc, Object gallery_id, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!gallery_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "gallery_id", /* API parameters */gallery_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.galleries.getPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/gallery", format);
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
	public static Object flickcurl_galleries_getPhotos(Object fc, Object gallery_id, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return photos;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-notes-api.c - Flickr flickr.photos.notes.* API calls
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
	 * flickcurl_photos_notes_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add a note to
	 * @note_x: The left coordinate of the note
	 * @note_y: The top coordinate of the note
	 * @note_w: The width of the note
	 * @note_h: The height of the note
	 * @note_text: The description of the note
	 * 
	 * Add a note to a photo.
	 *
	 * Coordinates and sizes are in pixels, based on the 500px image size
	 * shown on individual photo pages.
	 *
	 * Implements flickr.photos.notes.add (0.12)
	 * 
	 * Return value: note ID or NULL on failure
	 **/
	public static Object flickcurl_photos_notes_add(Object fc, Object photo_id, int note_x, int note_y, int note_w, int note_h, Object note_text) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte id = ((Object)0);
		byte[] note_x_s = new byte[10];
		byte[] note_y_s = new byte[10];
		byte[] note_w_s = new byte[10];
		byte[] note_h_s = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !note_text) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(note_x_s, "%d", note_x);
		ModernizedCProgram.flickcurl_add_param(fc, "note_x", note_x_s);
		.sprintf(note_y_s, "%d", note_y);
		ModernizedCProgram.flickcurl_add_param(fc, "note_y", note_y_s);
		.sprintf(note_w_s, "%d", note_w);
		ModernizedCProgram.flickcurl_add_param(fc, "note_w", note_w_s);
		.sprintf(note_h_s, "%d", note_h);
		ModernizedCProgram.flickcurl_add_param(fc, "note_h", note_h_s);
		ModernizedCProgram.flickcurl_add_param(fc, "note_text", note_text);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.notes.add")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		id = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/note/@id");
		if (fc.getFailed()) {
			if (id) {
				.free(id);
			} 
			id = ((Object)0);
		} 
		return id/**
		 * flickcurl_photos_notes_delete:
		 * @fc: flickcurl context
		 * @note_id: The id of the note to delete
		 * 
		 * Delete a note from a photo.
		 *
		 * Implements flickr.photos.notes.delete (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_notes_delete(Object fc, Object note_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!note_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "note_id", note_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.notes.delete")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_notes_edit:
		 * @fc: flickcurl context
		 * @note_id: The id of the note to edit
		 * @note_x: The left coordinate of the note
		 * @note_y: The top coordinate of the note
		 * @note_w: The width of the note
		 * @note_h: The height of the note
		 * @note_text: The description of the note
		 * 
		 * Edit a note on a photo. Coordinates and sizes are in pixels, based on the 500px image size shown on individual photo pages.
		
		 *
		 * Implements flickr.photos.notes.edit (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_notes_edit(Object fc, Object note_id, int note_x, int note_y, int note_w, int note_h, Object note_text) {
		 doc = ((Object)0);
		int result = 1;
		byte[] note_x_s = new byte[10];
		byte[] note_y_s = new byte[10];
		byte[] note_w_s = new byte[10];
		byte[] note_h_s = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!note_id || !note_text) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "note_id", note_id);
		.sprintf(note_x_s, "%d", note_x);
		ModernizedCProgram.flickcurl_add_param(fc, "note_x", note_x_s);
		.sprintf(note_y_s, "%d", note_y);
		ModernizedCProgram.flickcurl_add_param(fc, "note_y", note_y_s);
		.sprintf(note_w_s, "%d", note_w);
		ModernizedCProgram.flickcurl_add_param(fc, "note_w", note_w_s);
		.sprintf(note_h_s, "%d", note_h);
		ModernizedCProgram.flickcurl_add_param(fc, "note_h", note_h_s);
		ModernizedCProgram.flickcurl_add_param(fc, "note_text", note_text);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.notes.edit")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result;
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
	public static void flickcurl_free_collection(Object collection) {
		do {
			if (!collection) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_collection is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\collection.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (collection.getCollections()) {
			int i;
			for (i = 0; collection.getCollections()[i]; i++) {
				ModernizedCProgram.flickcurl_free_collection(collection.getCollections()[i]);
			}
		} 
		if (collection.getPhotos()) {
			ModernizedCProgram.flickcurl_free_photos(collection.getPhotos());
		} 
		if (collection.getDescription()) {
			.free(collection.getDescription());
		} 
		if (collection.getTitle()) {
			.free(collection.getTitle());
		} 
		if (collection.getSecret()) {
			.free(collection.getSecret());
		} 
		if (collection.getIconsmall()) {
			.free(collection.getIconsmall());
		} 
		if (collection.getIconlarge()) {
			.free(collection.getIconlarge());
		} 
		if (collection.getId()) {
			.free(collection.getId());
		} 
		.free(collection);
	}
	public static Object flickcurl_build_collections(Object fc, Object xpathCtx, Object xpathExpr, Object collection_count_p) {
		flickcurl_collection collections = ((Object)0);
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
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		collections = (flickcurl_collection).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			flickcurl_collection collection = new flickcurl_collection();
			int expri;
			 xpathNodeCtx = ((Object)0);
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			collection = (flickcurl_collection).calloc(, 1);
			xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
			xpathNodeCtx.setNode(node);
			for (expri = 0; collection_fields_table[expri].getXpath(); expri++) {
				flickcurl_collection_field_type field = collection_fields_table[expri].getField();
				flickcurl_field_value_type datatype = collection_fields_table[expri].getType();
				 field_xpath = collection_fields_table[expri].getXpath();
				byte string_value;
				int int_value = -1;
				time_t unix_time = new time_t();
				if (datatype == .VALUE_TYPE_ICON_PHOTOS) {
					collection.setPhotos(ModernizedCProgram.flickcurl_build_photos(fc, xpathNodeCtx, field_xpath, collection.getPhotos_count()));
					continue;
				} 
				string_value = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathNodeCtx, field_xpath);
				if (!string_value) {
					continue;
				} 
				switch (datatype) {
				case .VALUE_TYPE_INTEGER:
				case .VALUE_TYPE_FLOAT:
				case .VALUE_TYPE_URI:
						break;
				case .VALUE_TYPE_COLLECTION_ID:
				case .VALUE_TYPE_UNIXTIME:
				case .VALUE_TYPE_MEDIA_TYPE:
				case .VALUE_TYPE_BOOLEAN:
						int_value = .atoi(string_value);
						break;
				case .VALUE_TYPE_PHOTO_URI:
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
				case .VALUE_TYPE_PERSON_ID:
						.abort();
				case .VALUE_TYPE_PHOTO_ID:
				case .VALUE_TYPE_STRING:
				case .VALUE_TYPE_TAG_STRING:
				case .VALUE_TYPE_NONE:
				case /* This case is handled above */.VALUE_TYPE_ICON_PHOTOS:
						.abort();
				}
				switch (field) {
				case .COLLECTION_FIELD_child_count:
						collection.setChild_count(int_value);
						break;
				case .COLLECTION_FIELD_description:
						collection.setDescription(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_iconphotos:
						.fprintf((_iob[2]), "Do not know how to handle iconphotos field yet\n");
						break;
				case .COLLECTION_FIELD_secret:
						collection.setSecret(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_iconlarge:
						collection.setIconlarge(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_iconsmall:
						collection.setIconsmall(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_date_created:
						collection.setDate_created(int_value);
						break;
				case .COLLECTION_FIELD_server:
						collection.setServer(int_value);
						break;
				case .COLLECTION_FIELD_title:
						collection.setTitle(string_value);
						string_value = ((Object)0);
						break;
				case .COLLECTION_FIELD_id:
						collection.setId(string_value);
						string_value = ((Object)0);
						break;
				}
				if (string_value) {
					.free(string_value);
				} 
				if (fc.getFailed()) {
					if (collection) {
						ModernizedCProgram.flickcurl_free_collection(collection);
					} 
					;
				} 
			}
			collections[collection_count++] = collection/* for collections */;
		}
		if (collection_count_p) {
			collection_count_p = collection_count;
		} 
		if (fc.getFailed()) {
			if (collections) {
				ModernizedCProgram.flickcurl_free_collections(collections);
			} 
			collections = ((Object)0);
		} 
		return collections;
	}
	public static Object flickcurl_build_collection(Object fc, Object xpathCtx, Object root_xpathExpr) {
		flickcurl_collection collections = new flickcurl_collection();
		flickcurl_collection result = ((Object)0);
		collections = ModernizedCProgram.flickcurl_build_collections(fc, xpathCtx, root_xpathExpr, ((Object)0));
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
	public static void flickcurl_free_collections(Object collections) {
		int i;
		do {
			if (!collections) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_collection_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\collection.c", 393, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; collections[i]; i++) {
			ModernizedCProgram.flickcurl_free_collection(collections[i]);
		}
		.free(collections);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-api.c - Flickr flickr.photos.* API calls
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
	 * flickcurl_photos_addTags:
	 * @fc: flickcurl context
	 * @photo_id: photo ID
	 * @tags: tags to add as a space-separated list
	 *
	 * Add tags to a photo.
	 *
	 * Implements flickr.photos.addTags (0.9)
	 *
	 * Return value: non-0 on failure
	 */
	public static int flickcurl_photos_addTags(Object fc, Object photo_id, Object tags) {
		 doc = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !tags) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "tags", tags);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.addTags")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
	}
	public static int flickcurl_photos_delete(Object fc, Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.delete")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_getAllContexts:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * 
		 * Get all visible sets and pools the photo belongs to.
		 *
		 * Implements flickr.photos.getAllContexts (0.7)
		 *
		 * Returns an array of size 3 [prev, next, NULL] flickcurl_context*
		 * or NULL on error
		 * 
		 * Return value: prev, next contexts or NULL
		 **/;
	}
	public static Object flickcurl_photos_getAllContexts(Object fc, Object photo_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getAllContexts")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		contexts = ModernizedCProgram.flickcurl_build_contexts(fc, doc);
		return contexts/**
		 * flickcurl_photos_getContactsPhotos_params:
		 * @fc: flickcurl context
		 * @contact_count: Number of photos to return (Default 10, maximum 50)
		 * @just_friends: Set to non-0 to only show photos from friends and family (excluding regular contacts).
		 * @single_photo: Set to non-0 to only fetch one photo (the latest) per contact, instead of all photos in chronological order.
		 * @include_self: Set to non-0 to include photos from the calling user.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Fetch a list of recent photos from the calling users' contacts.
		 *
		 * Currently supported extras fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format, last_update
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_photos_getContactsPhotos_params(Object fc, int contact_count, int just_friends, int single_photo, int include_self, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] true_s = "1";
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (contact_count > /* API parameters */1) {
			byte[] count_s = new byte[20];
			.sprintf(count_s, "%d", contact_count);
			ModernizedCProgram.flickcurl_add_param(fc, "count", count_s);
		} 
		if (just_friends) {
			ModernizedCProgram.flickcurl_add_param(fc, "just_friends", true_s);
		} 
		if (single_photo) {
			ModernizedCProgram.flickcurl_add_param(fc, "single_photo", true_s);
		} 
		if (include_self) {
			ModernizedCProgram.flickcurl_add_param(fc, "include_self", true_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getContactsPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_photos_getContactsPhotos(Object fc, int contact_count, int just_friends, int single_photo, int include_self, Object extras) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_photos_getContactsPublicPhotos_params(Object fc, Object user_id, int photo_count, int just_friends, int single_photo, int include_self, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] true_s = "1";
		byte[] photo_count_s = new byte[10];
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", /* API parameters */user_id);
		.sprintf(photo_count_s, "%d", photo_count);
		ModernizedCProgram.flickcurl_add_param(fc, "count", photo_count_s);
		if (just_friends) {
			ModernizedCProgram.flickcurl_add_param(fc, "just_friends", true_s);
		} 
		if (single_photo) {
			ModernizedCProgram.flickcurl_add_param(fc, "single_photo", true_s);
		} 
		if (include_self) {
			ModernizedCProgram.flickcurl_add_param(fc, "include_self", true_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getContactsPublicPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_photos_getContactsPublicPhotos(Object fc, Object user_id, int photo_count, int just_friends, int single_photo, int include_self, Object extras) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_photos_getContext(Object fc, Object photo_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getContext")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		contexts = ModernizedCProgram.flickcurl_build_contexts(fc, doc);
		return contexts;
	}
	public static Object flickcurl_build_photocounts(Object fc, Object xpathCtx, Object xpathExpr, Object photocount_count_p) {
		int photocounts = ((Object)0);
		int nodes_count;
		int photocount_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int row_size = 3;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		photocounts = (int).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			int row;
			int j;
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			row = (int).calloc(, row_size);
			for (j = 0; j < row_size; j++) {
				row[j] = -1;
			}
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "count")) {
					row[0] = .atoi(attr_value);
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "fromdate")) {
					row[1] = .atoi(attr_value);
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "todate")) {
					row[2] = .atoi(attr_value);
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			photocounts[photocount_count++] = row/* for nodes */;
		}
		if (photocount_count_p) {
			photocount_count_p = photocount_count;
		} 
		return photocounts/**
		 * flickcurl_photos_getCounts:
		 * @fc: flickcurl context
		 * @dates_array: A comma delimited list of unix timestamps, denoting the periods to return counts for. They should be specified smallest first. (or NULL)
		 * @taken_dates_array: A comma delimited list of mysql datetimes, denoting the periods to return counts for. They should be specified mallest first. (or NULL)
		 * 
		 * Gets a list of photo counts for the given date ranges for the calling user.
		 *
		 * Implements flickr.photos.getCounts (0.13)
		 * 
		 * The return array fields are:
		 *   [0] count
		 *   [1] fromdate as unixtime
		 *   [2] todate as unixtime
		 *
		 * Return value: array of int[3] or NULL on failure
		 */;
	}
	public static Object flickcurl_photos_getCounts(Object fc, Object dates_array, Object taken_dates_array) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int counts = ((Object)0);
		byte dates = ((Object)0);
		byte taken_dates = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!dates_array && !/* one must be not empty */taken_dates_array) {
			return ((Object)0);
		} 
		if (dates_array) {
			dates = ModernizedCProgram.flickcurl_array_join(dates_array, (byte)',');
			ModernizedCProgram.flickcurl_add_param(fc, "dates", dates);
		} 
		if (taken_dates_array) {
			taken_dates = ModernizedCProgram.flickcurl_array_join(taken_dates_array, (byte)',');
			ModernizedCProgram.flickcurl_add_param(fc, "taken_dates", taken_dates);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getCounts")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		counts = ModernizedCProgram.flickcurl_build_photocounts(fc, xpathCtx, ()"/rsp/photocounts/photocount", ((Object)0));
		if (fc.getFailed()) {
			if (counts) {
				.free(counts);
			} 
			counts = ((Object)0);
		} 
		if (dates) {
			.free(dates);
		} 
		if (taken_dates) {
			.free(taken_dates);
		} 
		return counts/**
		 * flickcurl_photos_getExif:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to fetch information for.
		 * @secret: The secret for the photo (or NULL)
		 *   If the correct secret is passed then permissions checking is
		 *   skipped. This enables the 'sharing' of individual photos by
		 *   passing around the id and secret.
		 *
		 * Retrieves a list of EXIF/TIFF/GPS tags for a given photo.
		 *
		 * Implements flickr.photos.getExif (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_photos_getExif(Object fc, Object photo_id, Object secret) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_exif exifs = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		if (secret) {
			ModernizedCProgram.flickcurl_add_param(fc, "secret", secret);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getExif")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		exifs = ModernizedCProgram.flickcurl_build_exifs(fc, xpathCtx, ()"/rsp/photo/exif", ((Object)0));
		if (fc.getFailed()) {
			if (exifs) {
				ModernizedCProgram.flickcurl_free_exifs(exifs);
			} 
			exifs = ((Object)0);
		} 
		return exifs/**
		 * flickcurl_photos_getFavorites:
		 * @fc: flickcurl context
		 * @photo_id: The ID of the photo to fetch the favoriters list for.
		 * @page: The page of results to return (default 1)
		 * @per_page: Number of users to return per page (default 10, max 50)
		 * 
		 * Returns the list of people who have favorited a given photo.
		 *
		 * Implements flickr.photos.getFavorites (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_photos_getFavorites(Object fc, Object photo_id, int page, int per_page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_person persons = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(page_s, "%d", page);
		ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		.sprintf(per_page_s, "%d", per_page);
		ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getFavorites")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		persons = ModernizedCProgram.flickcurl_build_persons(fc, xpathCtx, ()"/rsp/photo/person", ((Object)0));
		if (fc.getFailed()) {
			if (persons) {
				ModernizedCProgram.flickcurl_free_persons(persons);
			} 
			persons = ((Object)0);
		} 
		return persons/**
		 * flickcurl_photos_getInfo2:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @secret: secret (or NULL)
		 * 
		 * Get information about a photo
		 *
		 * Implements flickr.photos.getInfo (0.5)
		 * 
		 * Return value: #flickcurl_photo or NULL on failure
		 **/;
	}
	public static Object flickcurl_photos_getInfo2(Object fc, Object photo_id, Object secret) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photo photo = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		if (secret) {
			ModernizedCProgram.flickcurl_add_param(fc, "secret", secret);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		photo = ModernizedCProgram.flickcurl_build_photo(fc, xpathCtx);
		if (fc.getFailed()) {
			if (photo) {
				ModernizedCProgram.flickcurl_free_photo(photo);
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
	public static Object flickcurl_photos_getInfo(Object fc, Object photo_id) {
		return ModernizedCProgram.flickcurl_photos_getInfo2(fc, photo_id, ((Object)0));
	}
	public static Object flickcurl_get_photoslist_params(Object fc, Object method, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] min_upload_date_s = new byte[20];
		byte[] max_upload_date_s = new byte[20];
		byte[] privacy_filter_s = new byte[20];
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (min_upload_date > /* API parameters */0) {
			.sprintf(min_upload_date_s, "%d", min_upload_date);
			ModernizedCProgram.flickcurl_add_param(fc, "min_upload_date", min_upload_date_s);
		} 
		if (max_upload_date > 0) {
			.sprintf(max_upload_date_s, "%d", max_upload_date);
			ModernizedCProgram.flickcurl_add_param(fc, "max_upload_date", max_upload_date_s);
		} 
		if (min_taken_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "min_taken_date", min_taken_date);
		} 
		if (max_taken_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "max_taken_date", max_taken_date);
		} 
		if (privacy_filter >= 1 && privacy_filter <= 5) {
			.sprintf(privacy_filter_s, "%d", privacy_filter);
			ModernizedCProgram.flickcurl_add_param(fc, "privacy_filter", privacy_filter_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, method)) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_photos_getNotInSet_params(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object list_params) {
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
	public static Object flickcurl_photos_getNotInSet(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_photos_getPerms(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_perms perms = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getPerms")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		perms = ModernizedCProgram.flickcurl_build_perms(fc, xpathCtx, ()"/rsp/perms");
		if (fc.getFailed()) {
			if (perms) {
				ModernizedCProgram.flickcurl_free_perms(perms);
			} 
			perms = ((Object)0);
		} 
		return perms/**
		 * flickcurl_photos_getRecent_params:
		 * @fc: flickcurl context
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of the latest public photos uploaded to flickr.
		 *
		 * Currently supported extras fields are: license, date_upload, date_taken,
		 * owner_name, icon_server, original_format, last_update, geo, tags,
		 * machine_tags.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_photos_getRecent_params(Object fc, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0/* No API parameters */);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getRecent")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_photos_getRecent(Object fc, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_photos_getSizes(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_size sizes = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.getSizes")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		sizes = ModernizedCProgram.flickcurl_build_sizes(fc, xpathCtx, ()"/rsp/sizes/size", ((Object)0));
		if (fc.getFailed()) {
			if (sizes) {
				ModernizedCProgram.flickcurl_free_sizes(sizes);
			} 
			sizes = ((Object)0);
		} 
		return sizes/**
		 * flickcurl_photos_getUntagged_params:
		 * @fc: flickcurl context
		 * @min_upload_date: Minimum upload date.
		 * @max_upload_date: Maximum upload date.
		 * @min_taken_date: Minimum taken date (or NULL)
		 * @max_taken_date: Maximum taken date (or NULL)
		 * @privacy_filter: Return photos only matching a certain privacy level.
		 * Valid privacy values are: 1 public, 2 friends, 3 family, 4 friends and
		 * family, 5 private
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of your photos with no tags.
		 *
		 * Currently supported extras fields are: license, date_upload, date_taken,
		 * owner_name, icon_server, original_format, last_update, geo, tags,
		 * machine_tags.
		 *
		 * Return value: a list of photos or NULL on failure
		 **/;
	}
	public static Object flickcurl_photos_getUntagged_params(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object list_params) {
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
	public static Object flickcurl_photos_getUntagged(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_photos_getWithGeoData_params(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object list_params) {
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
	public static Object flickcurl_photos_getWithGeoData(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_photos_getWithoutGeoData_params(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object list_params) {
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
	public static Object flickcurl_photos_getWithoutGeoData(Object fc, int min_upload_date, int max_upload_date, Object min_taken_date, Object max_taken_date, int privacy_filter, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_photos_recentlyUpdated_params(Object fc, int min_date, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte[] min_date_s = new byte[20];
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (min_date <= 0) {
			return ((Object)0);
		} 
		if (min_date > /* API parameters */0) {
			.sprintf(min_date_s, "%d", min_date);
			ModernizedCProgram.flickcurl_add_param(fc, "min_date", min_date_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.recentlyUpdated")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_photos_recentlyUpdated(Object fc, int min_date, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static int flickcurl_photos_removeTag(Object fc, Object tag_id) {
		 doc = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!tag_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "tag_id", tag_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.removeTag")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
	}
	public static Object flickcurl_photos_search_params(Object fc, Object params, Object list_params) {
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
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		do {
			if (!params) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_search_params is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\photos-api.c", 1717, __func__);
				return ((Object)0);
			} 
		} while (0);
		if (params.getUser_id()) {
			ModernizedCProgram.flickcurl_add_param(fc, "user_id", params.getUser_id());
		} 
		if (params.getTags()) {
			ModernizedCProgram.flickcurl_add_param(fc, "tags", params.getTags());
		} 
		if (params.getTag_mode()) {
			ModernizedCProgram.flickcurl_add_param(fc, "tag_mode", params.getTag_mode());
		} 
		if (params.getText()) {
			ModernizedCProgram.flickcurl_add_param(fc, "text", params.getText());
		} 
		if (params.getMin_upload_date()) {
			.sprintf(min_upload_date_s, "%d", params.getMin_upload_date());
			ModernizedCProgram.flickcurl_add_param(fc, "min_upload_date", min_upload_date_s);
		} 
		if (params.getMax_upload_date()) {
			.sprintf(max_upload_date_s, "%d", params.getMax_upload_date());
			ModernizedCProgram.flickcurl_add_param(fc, "max_upload_date", max_upload_date_s);
		} 
		if (params.getMin_taken_date()) {
			ModernizedCProgram.flickcurl_add_param(fc, "min_taken_date", params.getMin_taken_date());
		} 
		if (params.getMax_taken_date()) {
			ModernizedCProgram.flickcurl_add_param(fc, "max_taken_date", params.getMax_taken_date());
		} 
		if (params.getLicense()) {
			ModernizedCProgram.flickcurl_add_param(fc, "license", params.getLicense());
		} 
		if (params.getSort()) {
			ModernizedCProgram.flickcurl_add_param(fc, "sort", params.getSort());
		} 
		if (params.getPrivacy_filter()) {
			ModernizedCProgram.flickcurl_add_param(fc, "privacy_filter", params.getPrivacy_filter());
		} 
		if (params.getBbox()) {
			ModernizedCProgram.flickcurl_add_param(fc, "bbox", params.getBbox());
		} 
		if (params.getAccuracy()) {
			if (params.getAccuracy() >= 0 && params.getAccuracy() <= 16) {
				.sprintf(accuracy_s, "%d", params.getAccuracy());
				ModernizedCProgram.flickcurl_add_param(fc, "accuracy", accuracy_s);
			} 
		} 
		if (params.getSafe_search()) {
			if (params.getSafe_search() >= 0 && params.getSafe_search() <= 3) {
				.sprintf(safe_search_s, "%d", params.getSafe_search());
				ModernizedCProgram.flickcurl_add_param(fc, "safe_search", safe_search_s);
			} 
		} 
		if (params.getContent_type()) {
			if (params.getContent_type() >= 0 && params.getContent_type() <= 4) {
				.sprintf(content_type_s, "%d", params.getContent_type());
				ModernizedCProgram.flickcurl_add_param(fc, "content_type", content_type_s);
			} 
		} 
		if (params.getMachine_tags()) {
			ModernizedCProgram.flickcurl_add_param(fc, "machine_tags", params.getMachine_tags());
		} 
		if (params.getMachine_tag_mode()) {
			ModernizedCProgram.flickcurl_add_param(fc, "machine_tag_mode", params.getMachine_tag_mode());
		} 
		if (params.getGroup_id()) {
			ModernizedCProgram.flickcurl_add_param(fc, "group_id", params.getGroup_id());
		} 
		if (params.getPlace_id()) {
			ModernizedCProgram.flickcurl_add_param(fc, "place_id", params.getPlace_id());
		} 
		if (params.getMedia()) {
			ModernizedCProgram.flickcurl_add_param(fc, "media", params.getMedia());
		} 
		if (params.getHas_geo()) {
			ModernizedCProgram.flickcurl_add_param(fc, "has_geo", "1");
		} 
		if (params.getGeo_context() > 0 && params.getGeo_context() < 3) {
			.sprintf(geo_context_s, "%d", params.getGeo_context());
			ModernizedCProgram.flickcurl_add_param(fc, "geo_context", geo_context_s);
		} 
		if (params.getRadius()) {
			if (params.getLat()) {
				.sprintf(lat_s, "%f", params.getLat());
				ModernizedCProgram.flickcurl_add_param(fc, "lat", lat_s);
			} 
			if (params.getLon()) {
				.sprintf(lon_s, "%f", params.getLon());
				ModernizedCProgram.flickcurl_add_param(fc, "lon", lon_s);
			} 
			if (params.getRadius()) {
				.sprintf(radius_s, "%f", params.getRadius());
				ModernizedCProgram.flickcurl_add_param(fc, "radius", radius_s);
				if (params.getRadius_units()) {
					ModernizedCProgram.flickcurl_add_param(fc, "radius_units", params.getRadius_units());
				} 
			} 
		} 
		if (params.getContacts() && params.getUser_id()) {
			ModernizedCProgram.flickcurl_add_param(fc, "contacts", params.getContacts());
		} 
		if (params.getWoe_id() > 0) {
			.sprintf(woe_id_s, "%d", params.getWoe_id());
			ModernizedCProgram.flickcurl_add_param(fc, "woe_id", woe_id_s);
		} 
		if (params.getIs_commons()) {
			ModernizedCProgram.flickcurl_add_param(fc, "is_commons", "");
		} 
		if (params.getIn_gallery()) {
			ModernizedCProgram.flickcurl_add_param(fc, "in_gallery", "");
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.search")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_photos_search(Object fc, Object params) {
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		flickcurl_photo photos = new flickcurl_photo();
		.memset(list_params, (byte)'\0', );
		list_params.setFormat(((Object)0));
		list_params.setExtras(params.getExtras());
		list_params.setPer_page(params.getPer_page());
		list_params.setPage(params.getPage());
		photos_list = ModernizedCProgram.flickcurl_photos_search_params(fc, params, list_params);
		if (!photos_list) {
			return ((Object)0);
		} 
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static int flickcurl_photos_setContentType(Object fc, Object photo_id, int content_type) {
		 doc = ((Object)0);
		int result = 1;
		byte[] content_type_str = new byte[2];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !content_type) {
			return 1;
		} 
		if (content_type < 1 || content_type > 3) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(content_type_str, "%d", content_type);
		ModernizedCProgram.flickcurl_add_param(fc, "content_type", content_type_str);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.setContentType")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_setDates:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to edit dates for.
		 * @date_posted: The date the photo was uploaded to flickr as a unix time (or -1)
		 * @date_taken: The date the photo was taken as a unix time (or -1)
		 * @date_taken_granularity: The granularity of the date the photo was taken: 0 second, 4 month, 6 year (or -1)
		 * 
		 * Set one or both of the dates for a photo.
		 *
		 * Implements flickr.photos.setDates (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_setDates(Object fc, Object photo_id, int date_posted, int date_taken, int date_taken_granularity) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		byte[] date_posted_str = new byte[20];
		byte date_taken_str = ((Object)0);
		byte[] date_taken_granularity_str = new byte[3];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		if (date_posted < 0 && date_taken < 0 && date_taken_granularity < /* Nothing to do */0) {
			return 0;
		} 
		if (date_taken_granularity > 10) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		if (date_posted >= 0) {
			.sprintf(date_posted_str, "%d", /* posted date is always a unix time */date_posted);
			ModernizedCProgram.flickcurl_add_param(fc, "date_posted", date_posted_str);
		} 
		if (date_taken >= 0) {
			date_taken_str = ModernizedCProgram.flickcurl_unixtime_to_sqltimestamp(/* taken date is always a SQL timestamp */date_taken);
			ModernizedCProgram.flickcurl_add_param(fc, "date_taken", date_taken_str);
		} 
		if (date_taken_granularity >= 0) {
			.sprintf(date_taken_granularity_str, "%d", date_taken_granularity);
			ModernizedCProgram.flickcurl_add_param(fc, "date_taken_granularity", date_taken_granularity_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.setDates")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = 0;
		if (fc.getFailed()) {
			result = 1;
		} 
		if (date_taken_str) {
			.free(date_taken_str);
		} 
		return result/**
		 * flickcurl_photos_setMeta:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set information for.
		 * @title: The title for the photo.
		 * @description: The description for the photo.
		 * 
		 * Set the meta information for a photo.
		 *
		 * Implements flickr.photos.setMeta (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_setMeta(Object fc, Object photo_id, Object title, Object description) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !title || !description) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "title", title);
		ModernizedCProgram.flickcurl_add_param(fc, "description", description);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.setMeta")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = 0;
		if (fc.getFailed()) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photos_setPerms:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set permissions for.
		 * @perms: The #flickcurl_perms photo permissions
		 * 
		 * Set permissions for a photo.
		 *
		 * Implements flickr.photos.setPerms (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_setPerms(Object fc, Object photo_id, Object perms) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		byte[] is_public_str = new byte[2];
		byte[] is_friend_str = new byte[2];
		byte[] is_family_str = new byte[2];
		byte[] perm_comment_str = new byte[2];
		byte[] perm_addmeta_str = new byte[2];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !perms) {
			return 1;
		} 
		if (perms.getPerm_comment() < 0 || perms.getPerm_comment() > 3) {
			return 1;
		} 
		if (perms.getPerm_addmeta() < 0 || perms.getPerm_addmeta() > 3) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(is_public_str, "%d", (perms.getIs_public() ? 1 : 0));
		ModernizedCProgram.flickcurl_add_param(fc, "is_public", is_public_str);
		.sprintf(is_friend_str, "%d", (perms.getIs_friend() ? 1 : 0));
		ModernizedCProgram.flickcurl_add_param(fc, "is_friend", is_friend_str);
		.sprintf(is_family_str, "%d", (perms.getIs_family() ? 1 : 0));
		ModernizedCProgram.flickcurl_add_param(fc, "is_family", is_family_str);
		.sprintf(perm_comment_str, "%d", perms.getPerm_comment());
		ModernizedCProgram.flickcurl_add_param(fc, "perm_comment", perm_comment_str);
		.sprintf(perm_addmeta_str, "%d", perms.getPerm_addmeta());
		ModernizedCProgram.flickcurl_add_param(fc, "perm_addmeta", perm_addmeta_str);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.setPerms")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = 0;
		if (fc.getFailed()) {
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
	public static int flickcurl_photos_setSafetyLevel(Object fc, Object photo_id, int safety_level, int hidden) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		byte[] safety_level_str = new byte[2];
		byte[] hidden_str = new byte[2];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id) {
			return 1;
		} 
		if (safety_level <= 0 && hidden < 0) {
			return 0;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		if (safety_level > 0) {
			.sprintf(safety_level_str, "%d", safety_level);
			ModernizedCProgram.flickcurl_add_param(fc, "safety_level", safety_level_str);
		} 
		if (hidden >= 0) {
			.sprintf(hidden_str, "%d", hidden ? 1 : 0);
			ModernizedCProgram.flickcurl_add_param(fc, "hidden", hidden_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.setSafetyLevel")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		result = 0;
		if (fc.getFailed()) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photos_setTags:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @tags: all tags for the photo as a space-separated list
		 *
		 * Set the tags for a photo.
		 *
		 * Note that this replaces all existing tags with the @tags here.
		 *
		 * Implements flickr.photos.setTags (0.9)
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public static int flickcurl_photos_setTags(Object fc, Object photo_id, Object tags) {
		 doc = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !tags) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "tags", tags);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.setTags")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
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
	public static void flickcurl_free_institution(Object institution) {
		int i;
		do {
			if (!institution) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_institution is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\institution.c", 56, __func__);
				return ;
			} 
		} while (0);
		if (institution.getNsid()) {
			.free(institution.getNsid());
		} 
		if (institution.getName()) {
			.free(institution.getName());
		} 
		if (institution.getUrls()) {
			for (i = 0; i <= .FLICKCURL_INSTITUTION_URL_LAST; i++) {
				.free(institution.getUrls()[i]);
			}
			.free(institution.getUrls());
		} 
		.free(institution/**
		 * flickcurl_free_institutions:
		 * @institutions_object: institution object array
		 *
		 * Destructor for array of institution object
		 */);
	}
	public static void flickcurl_free_institutions(Object institutions_object) {
		int i;
		do {
			if (!institutions_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_institution_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\institution.c", 86, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; institutions_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_institution(institutions_object[i]);
		}
		.free(institutions_object);
	}
	/* get shapedata from value */
	public static Object flickcurl_build_institutions(Object fc, Object xpathCtx, Object xpathExpr, Object institution_count_p) {
		flickcurl_institution institutions = ((Object)0);
		int nodes_count;
		int institution_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int i;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		institutions = (flickcurl_institution).calloc(, nodes_count + 1);
		if (institution_count_p) {
			institution_count_p = institution_count;
		} 
		if (fc.getFailed()) {
			if (institutions) {
				ModernizedCProgram.flickcurl_free_institutions(institutions);
			} 
			institutions = ((Object)0);
		} 
		return institutions;
	}
	public static Object flickcurl_build_institution(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_institution institutions = new flickcurl_institution();
		flickcurl_institution result = ((Object)0);
		institutions = ModernizedCProgram.flickcurl_build_institutions(fc, xpathCtx, xpathExpr, ((Object)0));
		if (institutions) {
			result = institutions[0];
			.free(institutions);
		} 
		return result;
	}
	public static Object flickcurl_get_institution_url_type_label( url_type) {
		if (url_type <= .FLICKCURL_INSTITUTION_URL_LAST) {
			return ModernizedCProgram.flickcurl_institution_url_type_label[(int)url_type];
		} 
		return ((Object)0);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * people-api.c - Flickr flickr.people.* API calls
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
	 * flickcurl_people_findByEmail:
	 * @fc: flickcurl context
	 * @email: user email address
	 * 
	 * Get a user's NSID, given their email address
	 *
	 * Implements flickr.people.findByEmail (0.8)
	 * 
	 * Return value: NSID or NULL on failure
	 **/
	public static Object flickcurl_people_findByEmail(Object fc, Object email) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "find_email", email, "flickr.people.findByEmail", ()"/rsp/user/@nsid"/**
		 * flickcurl_people_findByUsername:
		 * @fc: flickcurl context
		 * @username: username
		 * 
		 * Get a user's NSID, given their username address
		 *
		 * Implements flickr.people.findByUsername (0.8)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public static Object flickcurl_people_findByUsername(Object fc, Object username) {
		return ModernizedCProgram.flickcurl_call_get_one_string_field(fc, "username", username, "flickr.people.findByUsername", ()"/rsp/user/@nsid"/**
		 * flickcurl_people_getGroups:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch groups for.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: privacy, throttle, restrictions (or NULL)
		 * 
		 * Returns the list of groups a user is a member of.
		 *
		 * Implements flickr.people.getGroups (1.25)
		 * 
		 * Return value: list of groups or NULL on failure
		 **/);
	}
	public static Object flickcurl_people_getGroups(Object fc, Object user_id, Object extras) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		if (extras) {
			ModernizedCProgram.flickcurl_add_param(fc, "extras", extras);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.people.getGroups")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		groups = ModernizedCProgram.flickcurl_build_groups(fc, xpathCtx, ()"/rsp/groups/group", ((Object)0));
		if (fc.getFailed()) {
			if (groups) {
				ModernizedCProgram.flickcurl_free_groups(groups);
			} 
			groups = ((Object)0);
		} 
		return groups/**
		 * flickcurl_people_getInfo:
		 * @fc: flickcurl context
		 * @user_id: user NSID
		 * 
		 * Get information about a person
		 *
		 * Implements flickr.people.getInfo (0.6)
		 *
		 * NSID can be found by flickcurl_people_findByEmail() or
		 * flickcurl_people_findByUsername().
		 * 
		 * Return value: #flickcurl_person object or NULL on failure
		 **/;
	}
	public static Object flickcurl_people_getInfo(Object fc, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_person person = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.people.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		person = ModernizedCProgram.flickcurl_build_person(fc, xpathCtx, ()"/rsp/person");
		if (fc.getFailed()) {
			if (person) {
				ModernizedCProgram.flickcurl_free_person(person);
			} 
			person = ((Object)0);
		} 
		return person/**
		 * flickcurl_people_getPublicGroups:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch groups for.
		 * 
		 * Returns the list of public groups a user is a member of.
		 *
		 * Implements flickr.people.getPublicGroups (0.13)
		 * 
		 * Return value: list of groups or NULL on failure
		 **/;
	}
	public static Object flickcurl_people_getPublicGroups(Object fc, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.people.getPublicGroups")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		groups = ModernizedCProgram.flickcurl_build_groups(fc, xpathCtx, ()"/rsp/groups/group", ((Object)0));
		if (fc.getFailed()) {
			if (groups) {
				ModernizedCProgram.flickcurl_free_groups(groups);
			} 
			groups = ((Object)0);
		} 
		return groups/**
		 * flickcurl_people_getPublicPhotos_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photos to return.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get a list of public photos for the given user.
		 *
		 * Currently supported extras fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format,
		 * last_update, geo, tags, machine_tags.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: list of people public photos or NULL on failure
		 **/;
	}
	public static Object flickcurl_people_getPublicPhotos_params(Object fc, Object user_id, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", /* API parameters */user_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.people.getPublicPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_people_getPublicPhotos(Object fc, Object user_id, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_people_getUploadStatus(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_user_upload_status status = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.people.getUploadStatus")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		status = ModernizedCProgram.flickcurl_build_user_upload_status(fc, xpathCtx, ()"/rsp/user/*");
		if (fc.getFailed()) {
			if (status) {
				ModernizedCProgram.flickcurl_free_user_upload_status(status);
			} 
			status = ((Object)0);
		} 
		return status/**
		 * flickcurl_people_getPhotos_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photos to return. A value of "me" will return the calling user's photos.
		 * @safe_search: Safe search setting: 1 for safe, 2 for moderate, 3 for restricted. (Please note: Un-authed calls can only see Safe content.) (or < 0)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @content_type: Content Type setting: 1 for photos only, 2 for screenshots only, 3 for 'other' only, 4 for photos and screenshots, 5 for screenshots and 'other', 6 for photos and 'other', 7 for photos, screenshots, and 'other' (all) (or < 0)
		 * @privacy_filter: Return photos only matching a certain privacy level. This only applies when making an authenticated call to view photos you own. Valid values are: 1 public photos, 2 private photos visible to friends, 3 private photos visible to family, 4 private photos visible to friends & family, 5 completely private photos (or < 0)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get photos from the given user's photostream.
		 *
		 * Only photos visible to the calling user will be returned. This
		 * method must be authenticated; to return public photos for a user,
		 * use flickcurl_people_getPublicPhotos().
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_people_getPhotos_params(Object fc, Object user_id, int safe_search, Object min_upload_date, Object max_upload_date, Object min_taken_date, Object max_taken_date, int content_type, int privacy_filter, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		byte[] safe_search_s = new byte[4];
		byte[] content_type_s = new byte[4];
		byte[] privacy_filter_s = new byte[4];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		if (safe_search >= 0 && safe_search < 10) {
			.sprintf(safe_search_s, "%d", safe_search);
			ModernizedCProgram.flickcurl_add_param(fc, "safe_search", safe_search_s);
		} 
		if (min_upload_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "min_upload_date", min_upload_date);
		} 
		if (max_upload_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "max_upload_date", max_upload_date);
		} 
		if (min_taken_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "min_taken_date", min_taken_date);
		} 
		if (max_taken_date) {
			ModernizedCProgram.flickcurl_add_param(fc, "max_taken_date", max_taken_date);
		} 
		if (content_type >= 0 && content_type < 10) {
			.sprintf(content_type_s, "%d", content_type);
			ModernizedCProgram.flickcurl_add_param(fc, "content_type", content_type_s);
		} 
		if (privacy_filter >= 0 && privacy_filter < 10) {
			.sprintf(privacy_filter_s, "%d", privacy_filter);
			ModernizedCProgram.flickcurl_add_param(fc, "privacy_filter", privacy_filter_s);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.people.getPhotos")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_people_getPhotos(Object fc, Object user_id, int safe_search, Object min_upload_date, Object max_upload_date, Object min_taken_date, Object max_taken_date, int content_type, int privacy_filter, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
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
	public static Object flickcurl_people_getPhotosOf_params(Object fc, Object user_id, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!user_id) {
			return photos_list;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.people.getPhotosOf")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_people_getPhotosOf(Object fc, Object user_id, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return photos;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-transform-api.c - Flickr flickr.photos.transform.* API calls
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
	 * flickcurl_photos_transform_rotate:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to rotate.
	 * @degrees: The amount of degrees by which to rotate the photo (clockwise) from it's current orientation. Valid values are 90, 180 and 270.
	 * 
	 * Rotate a photo.
	 *
	 * Implements flickr.photos.transform.rotate (0.13)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_photos_transform_rotate(Object fc, Object photo_id, int degrees) {
		 doc = ((Object)0);
		byte[] degrees_str = new byte[4];
		int result = 0;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id || !(degrees == 90 || degrees == 180 || degrees == 270)) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		.sprintf(degrees_str, "%d", degrees);
		ModernizedCProgram.flickcurl_add_param(fc, "degrees", degrees_str);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.transform.rotate")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result;
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
	public static void flickcurl_free_group(Object group) {
		do {
			if (!group) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_group is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\group.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (group.getNsid()) {
			.free(group.getNsid());
		} 
		if (group.getName()) {
			.free(group.getName());
		} 
		if (group.getDescription()) {
			.free(group.getDescription());
		} 
		if (group.getLang()) {
			.free(group.getLang());
		} 
		if (group.getThrottle_mode()) {
			.free(group.getThrottle_mode());
		} 
		.free(group/**
		 * flickcurl_free_groups:
		 * @groups_object: group object array
		 *
		 * Destructor for array of group object
		 */);
	}
	public static void flickcurl_free_groups(Object groups_object) {
		int i;
		do {
			if (!groups_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_group_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\group.c", 78, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; groups_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_group(groups_object[i]);
		}
		.free(groups_object);
	}
	public static Object flickcurl_build_groups(Object fc, Object xpathCtx, Object xpathExpr, Object group_count_p) {
		flickcurl_group groups = ((Object)0);
		int nodes_count;
		int group_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		groups = (flickcurl_group).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_group g = new flickcurl_group();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			g = (flickcurl_group).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "nsid") || !.strcmp(attr_name, "id")) {
					g.setNsid(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					g.setName(attr_value);
				}  else if (!.strcmp(attr_name, "lang")) {
					g.setLang(attr_value);
				}  else if (!.strcmp(attr_name, "is_admin")) {
					g.setIs_admin(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "is_moderator")) {
					g.setIs_moderator(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "is_member")) {
					g.setIs_member(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "privacy")) {
					g.setPrivacy(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photos")) {
					g.setPhotos(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "iconserver")) {
					g.setIconserver(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "ispoolmoderated")) {
					g.setIs_pool_moderated(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "iconfarm")) {
					g.setIconfarm(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				byte value;
				size_t value_len = new size_t();
				if (chnode.getType() != XML_ELEMENT_NODE) {
					continue;
				} 
				if (!.strcmp(chnode_name, "throttle")) {
					for (attr = chnode.getProperties(); attr; attr = attr.getNext()) {
						size_t attr_len = .strlen((byte)attr.getChildren().getContent());
						byte attr_name = (byte)attr.getName();
						byte attr_value;
						attr_value = (byte).malloc(attr_len + 1);
						.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
						if (!.strcmp(attr_name, "count")) {
							g.setThrottle_count(.atoi(attr_value));
							.free(attr_value);
						}  else if (!.strcmp(attr_name, "mode")) {
							g.setThrottle_mode(attr_value);
						}  else if (!.strcmp(attr_name, "remaining")) {
							g.setThrottle_remaining(.atoi(attr_value));
							.free(attr_value);
						} else {
								.free(attr_value);
						} 
					}
					continue;
				} 
				if (!.strcmp(chnode_name, "restrictions")) {
					for (attr = chnode.getProperties(); attr; attr = attr.getNext()) {
						byte attr_name = (byte)attr.getName();
						byte attr_value = (byte)attr.getChildren().getContent();
						if (!.strcmp(attr_name, "photos_ok")) {
							g.setPhotos_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "videos_ok")) {
							g.setVideos_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "images_ok")) {
							g.setImages_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "screens_ok")) {
							g.setScreens_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "art_ok")) {
							g.setArt_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "safe_ok")) {
							g.setSafe_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "moderate_ok")) {
							g.setModerate_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "restricted_ok")) {
							g.setRestricted_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "has_geo")) {
							g.setHas_geo(.atoi(attr_value));
						} 
					}
				} 
				if (!chnode.getChildren()) {
					continue;
				} 
				value_len = .strlen((byte)chnode.getChildren().getContent());
				value = (byte).malloc(value_len + 1);
				.memcpy(value, chnode.getChildren().getContent(), value_len + 1);
				if (!.strcmp(chnode_name, "name")) {
					g.setName(value);
				}  else if (!.strcmp(chnode_name, "description")) {
					g.setDescription(value);
				}  else if (!.strcmp(chnode_name, "members")) {
					g.setMembers(.atoi(value));
					.free(value);
				}  else if (!.strcmp(chnode_name, "privacy")) {
					g.setPrivacy(.atoi(value));
					.free(value);
				}  else if (!.strcmp(chnode_name, "rules")) {
					g.setRules(value);
				}  else if (!.strcmp(chnode_name, "pool_count")) {
					g.setPool_count(.atoi(value));
					.free(value);
				}  else if (!.strcmp(chnode_name, "topic_count")) {
					g.setTopic_count(.atoi(value));
					.free(value);
				} else {
						.free(value);
				} 
			}
			groups[group_count++] = g/* for nodes */;
		}
		if (group_count_p) {
			group_count_p = group_count;
		} 
		return groups;
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
	public static Object flickcurl_interestingness_getList_params(Object fc, Object date, Object list_params) {
		flickcurl_photos_list photos_list = ((Object)0);
		byte format = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (/* API parameters */date) {
			ModernizedCProgram.flickcurl_add_param(fc, "date", date);
		} 
		ModernizedCProgram.flickcurl_append_photos_list_params(fc, list_params, /* Photos List parameters */format);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.interestingness.getList")) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_invoke_photos_list(fc, ()"/rsp/photos", format);
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
	public static Object flickcurl_interestingness_getList(Object fc, Object date, Object extras, int per_page, int page) {
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
		photos = photos_list.getPhotos();
		photos_list.setPhotos(((Object)0/* photos array is now owned by this function */));
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return photos;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * activity-api.c - Flickr flickr.activity.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_activity_userComments:
	 * @fc: flickcurl context
	 * @per_page: Number of items to return per page. If this argument is omitted, it defaults to 10. The maximum allowed value is 50.
	 * @page: The page of results to return. If this argument is omitted, it defaults to 1.
	 * 
	 * Returns a list of recent activity on photos commented on by the calling user. 
	 *
	 * Implements flickr.activity.userComments (1.0)
	 * 
	 * Return value: non-0 on failure
	 **/
	public static Object flickcurl_activity_userComments(Object fc, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_activity activities = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.activity.userComments")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		activities = ModernizedCProgram.flickcurl_build_activities(fc, xpathCtx, ()"/rsp/items/item", ((Object)0));
		if (fc.getFailed()) {
			if (activities) {
				ModernizedCProgram.flickcurl_free_activities(activities);
			} 
			activities = ((Object)0);
		} 
		return activities/**
		 * flickcurl_activity_userPhotos:
		 * @fc: flickcurl context
		 * @timeframe: The timeframe in which to return updates for. This can be specified in days (<code>'2d'</code>) or hours (<code>'4h'</code>). The default behavoir is to return changes since the beginning of the previous user session. (or NULL)
		 * @per_page: Number of items to return per page. If this argument is omitted, it defaults to 10. The maximum allowed value is 50. (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or NULL)
		 * 
		 * Returns a list of recent activity on photos belonging to the calling user. Do not poll this method more than once an hour.
		 *
		 * Implements flickr.activity.userPhotos (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static Object flickcurl_activity_userPhotos(Object fc, Object timeframe, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_activity activities = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (timeframe) {
			ModernizedCProgram.flickcurl_add_param(fc, "timeframe", timeframe);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			ModernizedCProgram.flickcurl_add_param(fc, "page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.activity.userPhotos")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		activities = ModernizedCProgram.flickcurl_build_activities(fc, xpathCtx, ()"/rsp/items/item", ((Object)0));
		if (fc.getFailed()) {
			if (activities) {
				ModernizedCProgram.flickcurl_free_activities(activities);
			} 
			activities = ((Object)0);
		} 
		return activities;
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
	public static void flickcurl_free_exif(Object exif) {
		do {
			if (!exif) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_exif is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\exif.c", 46, __func__);
				return ;
			} 
		} while (0);
		if (exif.getTagspace()) {
			.free(exif.getTagspace());
		} 
		if (exif.getLabel()) {
			.free(exif.getLabel());
		} 
		if (exif.getRaw()) {
			.free(exif.getRaw());
		} 
		if (exif.getClean()) {
			.free(exif.getClean());
		} 
		.free(exif/**
		 * flickcurl_free_exifs:
		 * @exifs_object: array of exif objects
		 *
		 * Destructor for array of exif objects
		 */);
	}
	public static void flickcurl_free_exifs(Object exifs_object) {
		int i;
		do {
			if (!exifs_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_exif_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\exif.c", 73, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; exifs_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_exif(exifs_object[i]);
		}
		.free(exifs_object);
	}
	public static Object flickcurl_build_exifs(Object fc, Object xpathCtx, Object xpathExpr, Object exif_count_p) {
		flickcurl_exif exifs = ((Object)0);
		int nodes_count;
		int exif_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do exifs */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		exifs = (flickcurl_exif).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_exif e = new flickcurl_exif();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			e = (flickcurl_exif).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "tagspace")) {
					e.setTagspace(attr_value);
				}  else if (!.strcmp(attr_name, "tagspaceid")) {
					e.setTagspaceid(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "tag")) {
					e.setTag(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "label")) {
					e.setLabel(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "raw")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						e.setRaw((byte).malloc(len + 1));
						.memcpy(e.getRaw(), chnode.getChildren().getContent(), len + 1);
					}  else if (!.strcmp(chnode_name, "clean")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						e.setClean((byte).malloc(len + 1));
						.memcpy(e.getClean(), chnode.getChildren().getContent(), len + 1);
					} 
				} 
			}
			exifs[exif_count++] = e/* for nodes */;
		}
		if (exif_count_p) {
			exif_count_p = exif_count;
		} 
		return exifs;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photosets-comments-api.c - Flickr flickr.photosets.comments.* API calls
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
	 * flickcurl_photosets_comments_addComment:
	 * @fc: flickcurl context
	 * @photoset_id: The id of the photoset to add a comment to.
	 * @comment_text: Text of the comment
	 * 
	 * Add a comment to a photoset.
	 *
	 * Implements flickr.photosets.comments.addComment (0.10)
	 * 
	 * Return value: new comment ID or non-NULL on failure
	 **/
	public static Object flickcurl_photosets_comments_addComment(Object fc, Object photoset_id, Object comment_text) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte id = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photoset_id || !comment_text) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_add_param(fc, "comment_text", comment_text);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.comments.addComment")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		id = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/comment/@id");
		if (fc.getFailed()) {
			if (id) {
				.free(id);
			} 
			id = ((Object)0);
		} 
		return id/**
		 * flickcurl_photosets_comments_deleteComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to delete from a photoset.
		 * 
		 * Delete a photoset comment as the currently authenticated user.
		 *
		 * Implements flickr.photosets.comments.deleteComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_comments_deleteComment(Object fc, Object comment_id) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!comment_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "comment_id", comment_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.comments.deleteComment")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_comments_editComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to edit.
		 * @comment_text: Update the comment to this text.
		 * 
		 * Edit the text of a comment as the currently authenticated user.
		 *
		 * Implements flickr.photosets.comments.editComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photosets_comments_editComment(Object fc, Object comment_id, Object comment_text) {
		 doc = ((Object)0);
		int result = 1;
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!comment_id || !comment_text) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "comment_id", comment_id);
		ModernizedCProgram.flickcurl_add_param(fc, "comment_text", comment_text);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.comments.editComment")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_comments_getList:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to fetch comments for.
		 * 
		 * Returns the comments for a photoset.
		 *
		 * Implements flickr.photosets.comments.getList (0.10)
		 * 
		 * Return value: array of comments or NULL on failure
		 **/;
	}
	public static Object flickcurl_photosets_comments_getList(Object fc, Object photoset_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_comment comments = ((Object)0);
		int comments_count = 0;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photoset_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photoset_id", photoset_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photosets.comments.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		comments = ModernizedCProgram.flickcurl_build_comments(fc, xpathCtx, ()"/rsp/comments/comment", comments_count);
		if (fc.getFailed()) {
			if (comments) {
				ModernizedCProgram.flickcurl_free_comments(comments);
			} 
			comments = ((Object)0);
		} 
		return comments;
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
	public static void flickcurl_free_video(Object video) {
		do {
			if (!video) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_video is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\video.c", 54, __func__);
				return ;
			} 
		} while (0);
		.free(video);
	}
	public static Object flickcurl_build_video(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_video v = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int count = 0;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do video */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		v = (flickcurl_video).calloc(1, );
		if (!v) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to allocate the memory needed for video.");
			fc.setFailed(1);
			;
		} 
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			byte node_name = (byte)node.getName();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			if (.strcmp(node_name, "video")) {
				continue;
			} 
			count++;
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte attr_name = (byte)attr.getName();
				int attr_value = .atoi((byte)attr.getChildren().getContent());
				if (!.strcmp(attr_name, "ready")) {
					v.setReady(attr_value);
				}  else if (!.strcmp(attr_name, "failed")) {
					v.setFailed(attr_value);
				}  else if (!.strcmp(attr_name, "pending")) {
					v.setPending(attr_value);
				}  else if (!.strcmp(attr_name, "duration")) {
					v.setDuration(attr_value);
				}  else if (!.strcmp(attr_name, "width")) {
					v.setWidth(attr_value);
				}  else if (!.strcmp(attr_name, "height")) {
					v.setHeight(attr_value);
				} 
			}
		}
		if (!/* for nodes */count) {
			ModernizedCProgram.flickcurl_free_video(v);
			v = ((Object)0);
		} 
		return v;
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
	public static Object flickcurl_base64_encode(Object data, Object len, Object out_len_p) {
		byte out;
		byte p;
		int i;
		if (!data) {
			return ((Object)0);
		} 
		out = (byte).calloc(, (len + 1) * 4 / 3 + /* len + 1 to round up for partial sizes when (len % 3) is not 0 */1);
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
	public static void flickcurl_oauth_free(Object od) {
		if (od.getClient_key()) {
			.free(od.getClient_key());
		} 
		if (od.getClient_secret()) {
			.free(od.getClient_secret());
		} 
		if (od.getRequest_token()) {
			.free(od.getRequest_token());
		} 
		if (od.getRequest_token_secret()) {
			.free(od.getRequest_token_secret());
		} 
		if (od.getToken()) {
			.free(od.getToken());
		} 
		if (od.getToken_secret()) {
			.free(od.getToken_secret());
		} 
		if (od.getNonce()) {
			.free(od.getNonce());
		} 
		if (od.getKey()) {
			.free(od.getKey());
		} 
		if (od.getData()) {
			.free(od.getData());
		} 
		if (od.getUsername()) {
			.free(od.getUsername());
		} 
		if (od.getUser_nsid()) {
			.free(od.getUser_nsid());
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
	public static int flickcurl_oauth_build_key(Object od) {
		byte p;
		if (od.getKey()) {
			.free(od.getKey());
		} 
		od.setKey_len(od.getClient_secret_len() + 1);
		if (od.getRequest_token_secret_len()) {
			od.getKey_len() += od.getRequest_token_secret_len();
		} else {
				od.getKey_len() += od.getToken_secret_len();
		} 
		od.setKey((byte).malloc(od.getKey_len() + /* for NUL */1));
		if (!od.getKey()) {
			return 1;
		} 
		p = od.getKey();
		if (od.getClient_secret() && od.getClient_secret_len()) {
			.memcpy(p, od.getClient_secret(), od.getClient_secret_len());
			p += od.getClient_secret_len();
		} 
		p++ = (byte)'&';
		if (od.getRequest_token_secret() && od.getRequest_token_secret_len()) {
			.memcpy(p, od.getRequest_token_secret(), od.getRequest_token_secret_len());
			p += od.getRequest_token_secret_len();
		}  else if (od.getToken_secret() && od.getToken_secret_len()) {
			.memcpy(p, od.getToken_secret(), od.getToken_secret_len());
			p += od.getToken_secret_len();
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
	public static Object flickcurl_oauth_compute_signature(Object od, Object len_p) {
		byte s1;
		byte result;
		s1 = ModernizedCProgram.flickcurl_hmac_sha1(od.getData(), od.getData_len(), od.getKey(), od.getKey_len());
		if (!s1) {
			return ((Object)0);
		} 
		result = ModernizedCProgram.flickcurl_base64_encode(s1, 20, len_p);
		.free(s1);
		return result;
	}
	public static int flickcurl_oauth_prepare_common(Object fc, Object service_uri, Object method, Object upload_field, Object upload_value, int parameters_in_url, int need_auth) {
		flickcurl_oauth_data od = fc.getOd();
		int i;
		byte signature_string = ((Object)0);
		size_t values_len = ((Object)0);
		int fc_uri_len = /* length of URI path */0;
		int full_uri_len = /* includes ? and paramters */0;
		byte nonce = ((Object)0);
		int free_nonce = 0;
		byte timestamp = ((Object)0);
		int rc = 1;
		int is_oauth_method = 0;
		byte p;
		if (!service_uri) {
			return 1;
		} 
		if ((upload_field || upload_value) && (!upload_field || !/* If one is given, both are required */upload_value)) {
			return 1;
		} 
		fc.setFailed(0);
		fc.setError_code(0);
		if (fc.getError_msg()) {
			.free(fc.getError_msg());
			fc.setError_msg(((Object)0));
		} 
		if (fc.getParam_fields()) {
			for (i = 0; fc.getParam_fields()[i]; i++) {
				.free(fc.getParam_fields()[i]);
				.free(fc.getParam_values()[i]);
			}
			.free(fc.getParam_fields());
			.free(fc.getParam_values());
			fc.setParam_fields(((Object)0));
			fc.setParam_values(((Object)0));
			fc.setParameter_count(0);
		} 
		if (fc.getUpload_field()) {
			.free(fc.getUpload_field());
			fc.setUpload_field(((Object)0));
		} 
		if (fc.getUpload_value()) {
			.free(fc.getUpload_value());
			fc.setUpload_value(((Object)0));
		} 
		if (fc.getMethod()) {
			.free(fc.getMethod());
		} 
		if (method) {
			size_t len = .strlen(method);
			fc.setMethod((byte).malloc(len + 1));
			if (!fc.getMethod()) {
				;
			} 
			.memcpy(fc.getMethod(), method, len + 1);
			is_oauth_method = !.strncmp(method, "flickr.oauth.", 13);
		} else {
				fc.setMethod(((Object)0/* OAuth parameters
				   *
				   * oauth_callback         <URL> or "oob" [request token request]
				   * oauth_consumer_key     API key
				   * oauth_nonce            <random value - different each time>
				   * oauth_signature        [ADDED AFTER COMPUTING]
				   * oauth_signature_method "HMAC-SHA1"
				   * oauth_timestamp        <value of gettimeofday()>
				   * oauth_version          "1.0"
				   *
				   * oauth_verifier         verifier [access token request]
				   * oauth_token            access token or request token
				   */));
		} 
		if (fc.getMethod() && !is_oauth_method) {
			ModernizedCProgram.flickcurl_add_param(fc, "method", fc.getMethod());
		} 
		if (od.getCallback()) {
			ModernizedCProgram.flickcurl_add_param(fc, "oauth_callback", od.getCallback());
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "oauth_consumer_key", od.getClient_key());
		nonce = (byte)od.getNonce();
		if (!nonce) {
			nonce = (byte).malloc(20);
			if (!nonce) {
				;
			} 
			free_nonce = 1;
			.sprintf(nonce, "%ld", .flickcurl_mtwist_u32rand(fc.getMt()));
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "oauth_nonce", nonce);
		ModernizedCProgram.flickcurl_add_param(fc, "oauth_signature_method", /* oauth_signature - computed over these fields */"HMAC-SHA1");
		timestamp = (byte).malloc(20);
		if (!timestamp) {
			;
		} 
		Object generatedTimeval = tp.getTimeval();
		if (od.getTimestamp()) {
			.sprintf(timestamp, "%ld", (long)od.getTimestamp());
		} else {
				timeval tp = new timeval();
				(Object)ModernizedCProgram.gettimeofday(tp, ((Object)0));
				.sprintf(timestamp, "%ld", (long)generatedTimeval);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "oauth_timestamp", timestamp);
		ModernizedCProgram.flickcurl_add_param(fc, "oauth_version", "1.0");
		if (od.getToken()) {
			ModernizedCProgram.flickcurl_add_param(fc, "oauth_token", od.getToken());
		}  else if (od.getRequest_token()) {
			ModernizedCProgram.flickcurl_add_param(fc, "oauth_token", od.getRequest_token());
		} 
		if (od.getVerifier()) {
			ModernizedCProgram.flickcurl_add_param(fc, "oauth_verifier", od.getVerifier());
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		fc.setParam_fields((byte).calloc(fc.getCount() + 8 + 1, /* +FLICKCURL_FLICKCURL_MAX_OAUTH_PARAM_COUNT for oauth fields +1 for NULL terminating pointer */));
		if (!fc.getParam_fields()) {
			;
		} 
		fc.setParam_values((byte).calloc(fc.getCount() + 8 + 1, ));
		if (!fc.getParam_values()) {
			;
		} 
		values_len = (size_t).calloc(fc.getCount() + 8 + 1, );
		if (!values_len) {
			;
		} 
		if ((need_auth && (od.getClient_secret() || od.getToken_secret())) || fc.getSign()) {
			ModernizedCProgram.flickcurl_sort_args(fc);
		} 
		fc_uri_len = .strlen(service_uri);
		full_uri_len = fc_uri_len;
		if (parameters_in_url) {
			full_uri_len++;
		} 
		for (i = 0; fc.getParameters()[i][0]; /* Save away the parameters and calculate the value lengths */i++) {
			size_t param_len = .strlen(fc.getParameters()[i][0]);
			if (fc.getParameters()[i][1]) {
				values_len[i] = .strlen(fc.getParameters()[i][1]);
			} else {
					values_len[i] = 0;
					fc.getParameters()[i][1] = "";
			} 
			fc.getParam_fields()[i] = (byte).malloc(param_len + 1);
			if (!fc.getParam_fields()[i]) {
				;
			} 
			.memcpy(fc.getParam_fields()[i], fc.getParameters()[i][0], param_len + 1);
			fc.getParam_values()[i] = (byte).malloc(values_len[i] + 1);
			if (!fc.getParam_values()[i]) {
				;
			} 
			.memcpy(fc.getParam_values()[i], fc.getParameters()[i][1], values_len[i] + 1);
			full_uri_len += param_len + 1 + 3 * values_len[/* 3x value len is conservative URI %XX escaping on every char *//* = */i];
		}
		if (upload_field) {
			size_t len = .strlen(upload_field);
			fc.setUpload_field((byte).malloc(len + 1));
			if (!fc.getUpload_field()) {
				;
			} 
			.memcpy(fc.getUpload_field(), upload_field, len + 1);
			len = .strlen(upload_value);
			fc.setUpload_value((byte).malloc(len + 1));
			if (!fc.getUpload_value()) {
				;
			} 
			.memcpy(fc.getUpload_value(), upload_value, len + 1);
		} 
		if (((need_auth && (od.getClient_secret() || od.getToken_secret()))) || fc.getSign()) {
			byte buf = ((Object)0);
			size_t buf_len = 0;
			byte param_buf = ((Object)0);
			size_t param_buf_len = 0;
			size_t vlen = 0;
			byte escaped_value = ((Object)0);
			byte http_method;
			size_t http_method_len = new size_t();
			size_t escaped_value_len = new size_t();
			for (i = 0; fc.getParameters()[i][0]; i++) {
				param_buf_len += .strlen(fc.getParameters()[i][0]) + 3 + (3 * values_len[i]) + 3;
			}
			param_buf = (byte).malloc(param_buf_len + 1);
			if (!param_buf) {
				;
			} 
			param_buf = (byte)'\0';
			p = param_buf;
			for (i = 0; fc.getParameters()[i][0]; i++) {
				size_t len = .strlen(fc.getParameters()[i][0]);
				if (i > 0) {
					p++ = (byte)'&';
				} 
				.memcpy(p, fc.getParameters()[i][0], len);
				p += len;
				p++ = (byte)'=';
				escaped_value = .curl_escape(fc.getParameters()[i][1], 0);
				escaped_value_len = .strlen(escaped_value);
				.memcpy(p, escaped_value, escaped_value_len);
				p += escaped_value_len;
				.curl_free(escaped_value);
			}
			p = (byte)'\0';
			http_method = (upload_field || fc.getIs_write()) ? "POST" : "GET";
			http_method_len = (upload_field || fc.getIs_write()) ? 4 : 3;
			buf_len = http_method_len;
			buf_len += /* & */1;
			buf_len += (3 * .strlen(service_uri));
			buf_len += /* & */1;
			buf_len += param_buf_len * 3;
			buf = (byte).malloc(buf_len + 1);
			if (!buf) {
				.free(param_buf);
				;
			} 
			p = buf;
			.memcpy(p, http_method, http_method_len);
			p += http_method_len;
			p++ = (byte)'&';
			escaped_value = .curl_escape(service_uri, 0);
			escaped_value_len = .strlen(escaped_value);
			.memcpy(p, escaped_value, escaped_value_len);
			p += escaped_value_len;
			.curl_free(escaped_value);
			p++ = (byte)'&';
			escaped_value = .curl_escape(param_buf, 0);
			escaped_value_len = .strlen(escaped_value);
			.memcpy(p, escaped_value, escaped_value_len);
			p += escaped_value_len;
			.curl_free(escaped_value);
			p = (byte)'\0';
			.free(param_buf);
			if (ModernizedCProgram.flickcurl_oauth_build_key(od)) {
				.free(buf);
				;
			} 
			od.setData((byte)/* build data */buf);
			od.setData_len(.strlen((byte)od.getData()));
			signature_string = ModernizedCProgram.flickcurl_oauth_compute_signature(od, vlen);
			.free(od.getKey());
			od.setKey(((Object)0));
			ModernizedCProgram.flickcurl_add_param(fc, "oauth_signature", signature_string);
			fc.getCount()--;
			values_len[fc.getCount()] = /* Add a new parameter pair */vlen;
			fc.getParam_fields()[fc.getCount()] = (byte).malloc(15 + /* 15 = strlen(oauth_signature) */1);
			if (!fc.getParam_fields()[fc.getCount()]) {
				;
			} 
			.memcpy(fc.getParam_fields()[fc.getCount()], fc.getParameters()[fc.getCount()][0], 15 + 1);
			fc.getParam_values()[fc.getCount()] = (byte).malloc(vlen + 1);
			if (!fc.getParam_values()[fc.getCount()]) {
				;
			} 
			.memcpy(fc.getParam_values()[fc.getCount()], fc.getParameters()[fc.getCount()][1], vlen + 1);
			full_uri_len += 15 + 1 + /* "oauth_signature" *//* = */vlen;
			fc.getCount()++;
			.free(od.getData());
			od.setData(((Object)0));
			od.setData_len(0);
			ModernizedCProgram.flickcurl_end_params(fc);
		} 
		full_uri_len += fc.getCount() - /* add &s between fc->parameters */1;
		if (fc.getUri_len() < /* reuse or grow uri buffer */full_uri_len) {
			.free(fc.getUri());
			fc.setUri((byte).malloc(full_uri_len + 1));
			if (!fc.getUri()) {
				;
			} 
			fc.setUri_len(full_uri_len);
		} 
		.memcpy(fc.getUri(), service_uri, /* fc_uri_len is strlen(service_uri) at this point */fc_uri_len);
		p = fc.getUri() + fc_uri_len;
		p = (byte)'\0';
		if (parameters_in_url) {
			p++ = (byte)'?';
			for (i = 0; fc.getParameters()[i][0]; i++) {
				byte value = (byte)fc.getParameters()[i][1];
				size_t len = new size_t();
				if (!fc.getParameters()[i][1]) {
					continue;
				} 
				len = .strlen(fc.getParameters()[i][0]);
				.memcpy(p, fc.getParameters()[i][0], len);
				p += len;
				p++ = (byte)'=';
				value = .curl_escape(value, values_len[i]);
				len = .strlen(value);
				.memcpy(p, value, len);
				p += len;
				.curl_free(value);
				p++ = (byte)'&';
			}
			--p = /* zap last & and terminate fc->url */(byte)'\0';
		} 
		rc = 0;
		if (values_len) {
			.free(values_len);
		} 
		if (free_nonce) {
			.free(nonce);
		} 
		if (timestamp) {
			.free(timestamp);
		} 
		return rc/**
		 * flickcurl_oauth_create_request_token:
		 * @fc: flickcurl object
		 * @callback: callback URL or NULL for out of band
		 *
		 * Request an OAuth request token from Flickr for the application API Key/secret
		 *
		 * Requires the OAuth Client key (API key) and Client secret to have
		 * been set with flickcurl_set_oauth_client_key() and
		 * flickcurl_set_oauth_client_secret() respectively.
		 * 
		 * Calls the Flickr OAuth endpoint to get a request token for the
		 * given callback or uses out-of-band if @callback is NULL.
		 *
		 * On success, stores the request token in the @fc structure.
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public static int flickcurl_oauth_create_request_token(Object fc, Object callback) {
		flickcurl_oauth_data od = fc.getOd();
		byte request_token = ((Object)0);
		byte request_token_secret = ((Object)0);
		byte form = ((Object)0);
		int rc = 0;
		byte uri = fc.getOauth_request_token_uri();
		int i;
		int count;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_set_sign(/* Require signature */fc);
		if (!callback || !callback) {
			callback = "oob";
		} 
		od.setCallback(callback);
		rc = ModernizedCProgram.flickcurl_oauth_prepare_common(fc, uri, /* method */"flickr.oauth.request_token", ((Object)/* upload_field */0), ((Object)/* upload_value */0), /* parameters_in_url */1, /* need_auth */1);
		od.setCallback(((Object)0));
		if (rc) {
			;
		} 
		form = ModernizedCProgram.flickcurl_invoke_get_form_content(fc, count);
		if (!form) {
			rc = 1;
			;
		} 
		for (i = 0; i < count; i++) {
			int offset = 1 + (2 * i);
			if (!.strcmp(form[offset], "oauth_token")) {
				request_token = form[offset + 1];
			}  else if (!.strcmp(form[offset], "oauth_token_secret")) {
				request_token_secret = form[offset + 1];
			} 
		}
		if (request_token && request_token_secret) {
			size_t len = .strlen(/* Take copies that are owned by od */request_token);
			od.setRequest_token((byte).malloc(len + 1));
			.memcpy(od.getRequest_token(), request_token, len + 1);
			od.setRequest_token_len(len);
			len = .strlen(request_token_secret);
			od.setRequest_token_secret((byte).malloc(len + 1));
			.memcpy(od.getRequest_token_secret(), request_token_secret, len + 1);
			od.setRequest_token_secret_len(len);
		} else {
				rc = 1;
		} 
		return rc/**
		 * flickcurl_oauth_get_authorize_uri:
		 * @fc: flickcurl object
		 *
		 * Get the URL for the user to authorize Flickr OAuth of an application
		 *
		 * Forms the URL the user needs to start at to authorize the
		 * application.
		 *
		 * This function requires flickcurl_oauth_create_request_token() to have
		 * been called to build a request token / secret pair.
		 *
		 * After this function, the application should pass the verifier to
		 * flickcurl_oauth_create_access_token() for the final step in OAuth along
		 * with the request token and request token secret.
		 *
		 * Return value: authorize URI or NULL on failure
		 */;
	}
	public static Object flickcurl_oauth_get_authorize_uri(Object fc) {
		flickcurl_oauth_data od = fc.getOd();
		byte param = "?oauth_token=";
		size_t len = new size_t();
		byte uri;
		byte p;
		if (!od.getRequest_token()) {
			return ((Object)0);
		} 
		len = .strlen(ModernizedCProgram.flickcurl_flickr_oauth_authorize_uri);
		uri = (byte).malloc(len + 13 + od.getRequest_token_len() + 1);
		if (!uri) {
			return ((Object)0);
		} 
		p = uri;
		.memcpy(p, ModernizedCProgram.flickcurl_flickr_oauth_authorize_uri, len);
		p += len;
		.memcpy(p, param, 13);
		p += 13;
		.memcpy(p, od.getRequest_token(), od.getRequest_token_len());
		p += od.getRequest_token_len();
		p = (byte)'\0';
		return uri/**
		 * flickcurl_oauth_create_access_token:
		 * @fc: flickcurl object
		 * @verifier: verifier from OOB authentication
		 *
		 * Get a Flickr OAuth access token from request token credentials and verifier
		 *
		 * Calls the Flickr OAuth access token endpoint using the verifier
		 * from out of band authentication to get an access token to enable
		 * authenticated calls to the Flickr API.
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public static int flickcurl_oauth_create_access_token(Object fc, Object verifier) {
		flickcurl_oauth_data od = fc.getOd();
		byte access_token = ((Object)0);
		byte access_token_secret = ((Object)0);
		byte username = ((Object)0);
		byte user_nsid = ((Object)0);
		byte form = ((Object)0);
		int rc = 0;
		byte uri = fc.getOauth_access_token_uri();
		int i;
		int count;
		if (!verifier) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_set_sign(/* Require signature */fc);
		od.setVerifier(verifier);
		od.setVerifier_len(.strlen(verifier));
		rc = ModernizedCProgram.flickcurl_oauth_prepare_common(fc, uri, /* method */"flickr.oauth.access_token", ((Object)/* upload_field */0), ((Object)/* upload_value */0), /* parameters_in_url */1, /* need_auth */1);
		od.setVerifier(((Object)0));
		od.setVerifier_len(0);
		if (rc) {
			;
		} 
		form = ModernizedCProgram.flickcurl_invoke_get_form_content(fc, count);
		if (!form) {
			rc = 1;
			;
		} 
		for (i = 0; i < count; i++) {
			int offset = 1 + (2 * i);
			if (!.strcmp(form[offset], "oauth_token")) {
				access_token = form[offset + 1];
			}  else if (!.strcmp(form[offset], "oauth_token_secret")) {
				access_token_secret = form[offset + 1];
			}  else if (!.strcmp(form[offset], "username")) {
				username = form[offset + 1];
			}  else if (!.strcmp(form[offset], "user_nsid")) {
				user_nsid = form[offset + 1/* ignoring: fullname */];
			} 
		}
		if (access_token && access_token_secret) {
			size_t len = .strlen(/* Take copies that are owned by od */access_token);
			od.setToken((byte).malloc(len + 1));
			.memcpy(od.getToken(), access_token, len + 1);
			od.setToken_len(len);
			len = .strlen(access_token_secret);
			od.setToken_secret((byte).malloc(len + 1));
			.memcpy(od.getToken_secret(), access_token_secret, len + 1);
			od.setToken_secret_len(len);
			if (username) {
				len = .strlen(username);
				od.setUsername((byte).malloc(len + 1));
				.memcpy(od.getUsername(), username, len + 1);
				od.setUsername_len(len);
			} else {
					od.setUsername(((Object)0));
					od.setUsername_len(0);
			} 
			if (user_nsid) {
				len = .strlen(user_nsid);
				od.setUser_nsid((byte).malloc(len + 1));
				.memcpy(od.getUser_nsid(), user_nsid, len + 1);
				od.setUser_nsid_len(len);
			} else {
					od.setUser_nsid(((Object)0));
					od.setUser_nsid_len(0);
			} 
			.free(od.getRequest_token());
			od.setRequest_token(((Object)0));
			od.setRequest_token_len(0);
			.free(od.getRequest_token_secret());
			od.setRequest_token_secret(((Object)0));
			od.setRequest_token_secret_len(0);
		} else {
				rc = 1;
		} 
		return rc/**
		 * flickcurl_get_oauth_client_key:
		 * @fc: flickcurl object
		 *
		 * Get OAuth Client Key (aka Consumer key, API Key)
		 *
		 * See also flickcurl_get_oauth_client_secret()
		 *
		 * Return value: client key or NULL if none set
		 */;
	}
	public static Object flickcurl_get_oauth_client_key(Object fc) {
		return fc.getOd().getClient_key();
	}
	public static Object flickcurl_get_oauth_client_secret(Object fc) {
		return fc.getOd().getClient_secret();
	}
	public static void flickcurl_set_oauth_client_key(Object fc, Object client_key) {
		if (fc.getOd().getClient_key()) {
			.free(fc.getOd().getClient_key());
			fc.getOd().setClient_key(((Object)0));
			fc.getOd().setClient_key_len(0);
		} 
		if (client_key) {
			size_t len = .strlen(client_key);
			fc.getOd().setClient_key((byte).malloc(len + 1));
			.memcpy(fc.getOd().getClient_key(), client_key, len + 1);
			fc.getOd().setClient_key_len(len/**
			 * flickcurl_set_oauth_client_secret:
			 * @fc: flickcurl object
			 * @client_secret: client key (shared key)
			 *
			 * Set OAuth client key (aka shared secret)
			 *
			 * See also flickcurl_set_oauth_client_secret()
			 */);
		} 
	}
	public static void flickcurl_set_oauth_client_secret(Object fc, Object client_secret) {
		if (fc.getOd().getClient_secret()) {
			.free(fc.getOd().getClient_secret());
			fc.getOd().setClient_secret(((Object)0));
			fc.getOd().setClient_secret_len(0);
		} 
		if (client_secret) {
			size_t len = .strlen(client_secret);
			fc.getOd().setClient_secret((byte).malloc(len + 1));
			.memcpy(fc.getOd().getClient_secret(), client_secret, len + 1);
			fc.getOd().setClient_secret_len(len/**
			 * flickcurl_get_oauth_token:
			 * @fc: flickcurl object
			 *
			 * Get OAuth Token
			 *
			 * Return value: auth token or NULL if none set
			 */);
		} 
	}
	public static Object flickcurl_get_oauth_token(Object fc) {
		return fc.getOd().getToken();
	}
	public static void flickcurl_set_oauth_token(Object fc, Object token) {
		if (fc.getOd().getToken()) {
			.free(fc.getOd().getToken());
			fc.getOd().setToken(((Object)0));
			fc.getOd().setToken_len(0);
		} 
		if (token) {
			size_t len = .strlen(token);
			fc.getOd().setToken((byte).malloc(len + 1));
			.memcpy(fc.getOd().getToken(), token, len + 1);
			fc.getOd().setToken_len(len/**
			 * flickcurl_get_oauth_token_secret:
			 * @fc: flickcurl object
			 *
			 * Get OAuth token secret
			 *
			 * Return value: secret or NULL if none set
			 */);
		} 
	}
	public static Object flickcurl_get_oauth_token_secret(Object fc) {
		return fc.getOd().getToken_secret();
	}
	public static Object flickcurl_get_oauth_username(Object fc) {
		return fc.getOd().getUsername();
	}
	public static Object flickcurl_get_oauth_user_nsid(Object fc) {
		return fc.getOd().getUser_nsid();
	}
	public static void flickcurl_set_oauth_token_secret(Object fc, Object secret) {
		if (fc.getOd().getToken_secret()) {
			.free(fc.getOd().getToken_secret());
			fc.getOd().setToken_secret(((Object)0));
			fc.getOd().setToken_secret_len(0);
		} 
		if (secret) {
			size_t len = .strlen(secret);
			fc.getOd().setToken_secret((byte).malloc(len + 1));
			.memcpy(fc.getOd().getToken_secret(), secret, len + 1);
			fc.getOd().setToken_secret_len(len/**
			 * flickcurl_get_oauth_request_token:
			 * @fc: flickcurl object
			 *
			 * Get OAuth request token
			 *
			 * Return value: request token or NULL if none set
			 */);
		} 
	}
	public static Object flickcurl_get_oauth_request_token(Object fc) {
		return fc.getOd().getRequest_token();
	}
	public static Object flickcurl_get_oauth_request_token_secret(Object fc) {
		return fc.getOd().getRequest_token_secret();
	}
	public static void flickcurl_set_oauth_request_token(Object fc, Object token) {
		if (fc.getOd().getRequest_token()) {
			.free(fc.getOd().getRequest_token());
			fc.getOd().setRequest_token(((Object)0));
			fc.getOd().setRequest_token_len(0);
		} 
		if (token) {
			size_t len = .strlen(token);
			fc.getOd().setRequest_token((byte).malloc(len + 1));
			.memcpy(fc.getOd().getRequest_token(), token, len + 1);
			fc.getOd().setRequest_token_len(len/**
			 * flickcurl_set_oauth_request_token_secret:
			 * @fc: flickcurl object
			 * @secret: request token secret
			 *
			 * Set OAuth request token secret credentials
			 *
			 * See also flickcurl_get_oauth_request_token_secret()
			 */);
		} 
	}
	public static void flickcurl_set_oauth_request_token_secret(Object fc, Object secret) {
		if (fc.getOd().getRequest_token_secret()) {
			.free(fc.getOd().getRequest_token_secret());
			fc.getOd().setRequest_token_secret(((Object)0));
			fc.getOd().setRequest_token_secret(0);
		} 
		if (secret) {
			size_t len = .strlen(secret);
			fc.getOd().setRequest_token_secret((byte).malloc(len + 1));
			.memcpy(fc.getOd().getRequest_token_secret(), secret, len + 1);
			fc.getOd().setRequest_token_secret_len(len/* Test KEY fields *//* Test DATA fields *//* Expected results *//* Set up test data *//* PESSIMAL; every char %-escaped *//* PESSIMAL *//* for NUL *//* Prepare data *//* Not part of HMAC-SHA1 data *//* calculate actual data len *//* No raptor_basename *//* Initialise the Flickcurl library */);
		} 
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-people-api.c - Flickr flickr.photos.people.* API calls
	 *
	 * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_photos_people_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add a person to.
	 * @user_id: The NSID of the user to add to the photo.
	 * @person_x: The left-most pixel co-ordinate of the box around the person. (or < 0)
	 * @person_y: The top-most pixel co-ordinate of the box around the person. (or < 0)
	 * @person_w: The width (in pixels) of the box around the person. (or < 0)
	 * @person_h: The height (in pixels) of the box around the person. (or < 0)
	 * 
	 * Add a person to a photo. Coordinates and sizes of boxes are optional; they are measured in pixels, based on the 500px image size shown on individual photo pages.
	 *
	 * Implements flickr.photos.people.add (1.17)
	 * 
	 * Announced 2010-01-21
	 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
	 *
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_photos_people_add(Object fc, Object photo_id, Object user_id, int person_x, int person_y, int person_w, int person_h) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int rc = 0;
		byte[] person_x_str = new byte[10];
		byte[] person_y_str = new byte[10];
		byte[] person_w_str = new byte[10];
		byte[] person_h_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !user_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		if (person_x >= 0) {
			.sprintf(person_x_str, "%d", person_x);
			ModernizedCProgram.flickcurl_add_param(fc, "person_x", person_x_str);
		} 
		if (person_y >= 0) {
			.sprintf(person_y_str, "%d", person_y);
			ModernizedCProgram.flickcurl_add_param(fc, "person_y", person_y_str);
		} 
		if (person_w >= 0) {
			.sprintf(person_w_str, "%d", person_w);
			ModernizedCProgram.flickcurl_add_param(fc, "person_w", person_w_str);
		} 
		if (person_h >= 0) {
			.sprintf(person_h_str, "%d", person_h);
			ModernizedCProgram.flickcurl_add_param(fc, "person_h", person_h_str);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.people.add")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		if (fc.getFailed()) {
			rc = 1;
		} 
		return rc/**
		 * flickcurl_photos_people_delete:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to remove a person from.
		 * @user_id: The NSID of the person to remove from the photo.
		 * 
		 * Remove a person from a photo.
		 *
		 * Implements flickr.photos.people.delete (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_photos_people_delete(Object fc, Object photo_id, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !user_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.people.delete")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		if (fc.getFailed()) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_people_deleteCoords:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to edit a person in.
		 * @user_id: The NSID of the person whose bounding box you want to remove.
		 * 
		 * Remove the bounding box from a person in a photo
		 *
		 * Implements flickr.photos.people.deleteCoords (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: non-0 on failure
		 **/));
	}
	public static int flickcurl_photos_people_deleteCoords(Object fc, Object photo_id, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !user_id) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.people.deleteCoords")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		if (fc.getFailed()) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_people_editCoords:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to edit a person in.
		 * @user_id: The NSID of the person to edit in a photo.
		 * @person_x: The left-most pixel co-ordinate of the box around the person.
		 * @person_y: The top-most pixel co-ordinate of the box around the person.
		 * @person_w: The width (in pixels) of the box around the person.
		 * @person_h: The height (in pixels) of the box around the person.
		 * 
		 * Edit the bounding box of an existing person on a photo.
		 *
		 * Implements flickr.photos.people.editCoords (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: non-0 on failure
		 **/));
	}
	public static int flickcurl_photos_people_editCoords(Object fc, Object photo_id, Object user_id, int person_x, int person_y, int person_w, int person_h) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int rc = 0;
		byte[] person_x_str = new byte[10];
		byte[] person_y_str = new byte[10];
		byte[] person_w_str = new byte[10];
		byte[] person_h_str = new byte[10];
		ModernizedCProgram.flickcurl_init_params(fc, 1);
		if (!photo_id || !user_id || person_x < 0 || person_y < 0 || person_w < 0 || person_h < 0) {
			return 1;
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		.sprintf(person_x_str, "%d", person_x);
		ModernizedCProgram.flickcurl_add_param(fc, "person_x", person_x_str);
		.sprintf(person_y_str, "%d", person_y);
		ModernizedCProgram.flickcurl_add_param(fc, "person_y", person_y_str);
		.sprintf(person_w_str, "%d", person_w);
		ModernizedCProgram.flickcurl_add_param(fc, "person_w", person_w_str);
		.sprintf(person_h_str, "%d", person_h);
		ModernizedCProgram.flickcurl_add_param(fc, "person_h", person_h_str);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.people.editCoords")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		if (fc.getFailed()) {
			rc = 1;
		} 
		return rc/**
		 * flickcurl_photos_people_getList:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to get a list of people for.
		 * 
		 * Get a list of people in a given photo.
		 *
		 * Implements flickr.photos.people.getList (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: list of persons or NULL on failure
		 **/;
	}
	public static Object flickcurl_photos_people_getList(Object fc, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_person people = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!photo_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "photo_id", photo_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.photos.people.getList")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		people = ModernizedCProgram.flickcurl_build_persons(fc, xpathCtx, ()"/rsp/people/person", ((Object)0));
		if (fc.getFailed()) {
			if (people) {
				ModernizedCProgram.flickcurl_free_persons(people);
			} 
			people = ((Object)0);
		} 
		return people;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * test-api.c - Flickr flickr.test.* API calls
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
	 * flickcurl_test_echo:
	 * @fc: flickcurl context
	 * @key: test key
	 * @value: test value
	 * 
	 * A testing method which echo's all parameters back in the response.
	 *
	 * Actually prints the returned byte count to stderr.
	 *
	 * Implements flickr.test.echo (0.5)
	 *
	 * Return value: non-0 on failure
	 **/
	public static int flickcurl_test_echo(Object fc, Object key, Object value) {
		 doc = ((Object)0);
		int rc = 0;
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, key, value);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.test.echo")) {
			rc = 1;
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			rc = 1;
			;
		} 
		.fprintf((_iob[2]), "Flickr echo returned %d bytes\n", fc.getTotal_bytes());
	}
	public static Object flickcurl_test_login(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte username = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.test.login")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		username = ModernizedCProgram.flickcurl_xpath_eval(fc, xpathCtx, ()"/rsp/user/username");
		if (fc.getFailed()) {
			if (username) {
				.free(username);
			} 
			username = ((Object)0);
		} 
		return username/**
		 * flickcurl_test_null:
		 * @fc: flickcurl context
		 * 
		 * Null test
		 *
		 * Implements flickr.test.null (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public static int flickcurl_test_null(Object fc) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.test.null")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		return fc.getFailed();
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickcurl utility commands
	 *
	 * Copyright (C) 2007-2014, David Beckett http://www.dajobe.org/
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
	public static int command_test_echo(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_test_echo(fc, argv[1], argv[2]);
	}
	public static int command_test_login(Object fc, int argc, Object argv) {
		byte username;
		username = ModernizedCProgram.flickcurl_test_login(fc);
		if (username) {
			.fprintf((_iob[1]), "%s: Returned username '%s'\n", ModernizedCProgram.program, username);
			.free(username);
		} 
		return (username == ((Object)0));
	}
	public static int command_test_null(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_test_null(fc);
	}
	public static int command_people_findByEmail(Object fc, int argc, Object argv) {
		byte nsid = ((Object)0);
		byte email = argv[1];
		nsid = ModernizedCProgram.flickcurl_people_findByEmail(fc, email);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for user email %s\n", ModernizedCProgram.program, nsid, email);
		} 
		return (nsid == ((Object)0));
	}
	public static int command_people_findByUsername(Object fc, int argc, Object argv) {
		byte nsid = ((Object)0);
		byte user_name = argv[1];
		nsid = ModernizedCProgram.flickcurl_people_findByUsername(fc, user_name);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for username %s\n", ModernizedCProgram.program, nsid, user_name);
		} 
		return (nsid == ((Object)0));
	}
	public static void command_print_person(Object person) {
		int i;
		.fprintf((_iob[1]), "Found person with ID %s\n", person.getNsid());
		for (i = (int).PERSON_FIELD_FIRST; i <= (int).PERSON_FIELD_LAST; i++) {
			flickcurl_person_field_type field = (flickcurl_person_field_type)i;
			flickcurl_field_value_type datatype = person.getFields()[field].getType();
			if (datatype == .VALUE_TYPE_NONE) {
				continue;
			} 
			.fprintf((_iob[1]), "field %s (%d) with %s value: '%s' / %d\n", ModernizedCProgram.flickcurl_get_person_field_label(field), field, ModernizedCProgram.flickcurl_get_field_value_type_label(datatype), person.getFields()[field].getString(), person.getFields()[field].getInteger());
		}
	}
	public static int command_people_getInfo(Object fc, int argc, Object argv) {
		flickcurl_person person = new flickcurl_person();
		person = ModernizedCProgram.flickcurl_people_getInfo(fc, argv[1]);
		if (!person) {
			return 1;
		} 
		ModernizedCProgram.command_print_person(person);
		ModernizedCProgram.flickcurl_free_person(person);
		return 0;
	}
	public static void command_print_tags(Object tags, Object label, Object value) {
		int i;
		if (!tags) {
			return ;
		} 
		if (label) {
			.fprintf((_iob[1]), "%s: %s %s tags\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} else {
				.fprintf((_iob[1]), "tags:\n");
		} 
		for (i = 0; tags[i]; i++) {
			flickcurl_tag tag = tags[i];
			.fprintf((_iob[1]), "%d) %s tag: id %s author ID %s name %s raw '%s' cooked '%s' count %d\n", i, (tag.getMachine_tag() ? "machine" : "regular"), tag.getId(), tag.getAuthor(), (tag.getAuthorname() ? tag.getAuthorname() : "(Unknown)"), tag.getRaw(), tag.getCooked(), tag.getCount());
		}
	}
	public static int command_print_location(Object location) {
		byte accuracy_label;
		accuracy_label = ModernizedCProgram.flickcurl_get_location_accuracy_label(location.getAccuracy());
		if (accuracy_label) {
			.fprintf((_iob[1]), "latitude %f  longitude %f  accuracy %s(%d)\n", location.getLatitude(), location.getLongitude(), accuracy_label, location.getAccuracy());
		} else {
				.fprintf((_iob[1]), "latitude %f  longitude %f  accuracy unknown\n", location.getLatitude(), location.getLongitude());
		} 
		return 0;
	}
	public static void command_print_shape(Object shape) {
		.fprintf((_iob[1]), "created %d  alpha %2.2f  #points %d  #edges %d\n  is donuthole: %d  has donuthole: %d\n", shape.getCreated(), shape.getAlpha(), shape.getPoints(), shape.getEdges(), shape.getIs_donuthole(), shape.getHas_donuthole());
		if (shape.getData_length() > 0) {
			int s;
			s = (shape.getData_length() > 70 ? 70 : shape.getData_length());
			.fprintf((_iob[1]), "  Shapedata (%d bytes):\n    ", (int)shape.getData_length());
			.fwrite(shape.getData(), 1, s, (_iob[1]));
			.fputs("...\n", (_iob[1]));
		} 
		if (shape.getFile_urls_count() > 0) {
			int j;
			.fprintf((_iob[1]), "  Shapefile URLs: %d\n", shape.getFile_urls_count());
			for (j = 0; j < shape.getFile_urls_count(); j++) {
				.fprintf((_iob[1]), "    URL %d: %s\n", j, shape.getFile_urls()[j]);
			}
		} 
	}
	public static void command_print_place(Object place, Object label, Object value, int print_locality) {
		int i;
		if (label) {
			.fprintf((_iob[1]), "%s: %s %s places\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} 
		if (print_locality && place.getType() != .FLICKCURL_PLACE_LOCATION) {
			.fprintf((_iob[1]), "  Type %s (%d)\n", ModernizedCProgram.flickcurl_get_place_type_label(place.getType()), (int)place.getType());
		} 
		if (place.getLocation().getAccuracy() != 0) {
			.fputs("  Location: ", (_iob[1]));
			ModernizedCProgram.command_print_location(place.getLocation());
		} 
		if (place.getTimezone()) {
			.fprintf((_iob[1]), "  Timezone: %s\n", place.getTimezone());
		} 
		if (place.getShape()) {
			ModernizedCProgram.command_print_shape(place.getShape());
		} 
		if (place.getCount() > 0) {
			.fprintf((_iob[1]), "  Photos at Place: %d\n", place.getCount());
		} 
		for (i = (int)0; i <= (int).FLICKCURL_PLACE_LAST; i++) {
			byte name = place.getNames()[i];
			byte id = place.getIds()[i];
			byte url = place.getUrls()[i];
			byte woe_id = place.getWoe_ids()[i];
			if (!name && !id && !url && !woe_id) {
				continue;
			} 
			.fprintf((_iob[1]), "  %d) place %s:", i, ModernizedCProgram.flickcurl_get_place_type_label((flickcurl_place_type)i));
			if (name) {
				.fprintf((_iob[1]), " name '%s'", name);
			} 
			if (id) {
				.fprintf((_iob[1]), " id %s", id);
			} 
			if (woe_id) {
				.fprintf((_iob[1]), " woeid %s", woe_id);
			} 
			if (url) {
				.fprintf((_iob[1]), " url '%s'", url);
			} 
			.fputc((byte)'\n', (_iob[1]));
		}
	}
	public static void command_print_video(Object v) {
		.fprintf((_iob[1]), "video: ready %d  failed %d  pending %d  duration %d  width %d  height %d\n", v.getReady(), v.getFailed(), v.getPending(), v.getDuration(), v.getWidth(), v.getHeight());
	}
	public static void command_print_notes(Object notes, Object label, Object value) {
		int i;
		if (!notes) {
			return ;
		} 
		if (label) {
			.fprintf((_iob[1]), "%s: %s %s notes\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} else {
				.fprintf((_iob[1]), "notes:\n");
		} 
		for (i = 0; notes[i]; i++) {
			flickcurl_note note = notes[i];
			.fprintf((_iob[1]), "%d) id %d note: author ID %s name %s  x %d y %d w %d h %d text '%s'\n", i, note.getId(), note.getAuthor(), (note.getAuthorname() ? note.getAuthorname() : "(Unknown)"), note.getX(), note.getY(), note.getW(), note.getH(), note.getText());
		}
	}
	public static void command_print_photo(Object photo) {
		int i;
		.fprintf((_iob[1]), "%s with URI %s ID %s and %d tags\n", photo.getMedia_type(), (photo.getUri() ? photo.getUri() : "(Unknown)"), photo.getId(), photo.getTags_count());
		for (i = 0; i <= .PHOTO_FIELD_LAST; i++) {
			flickcurl_photo_field_type field = (flickcurl_photo_field_type)i;
			flickcurl_field_value_type datatype = photo.getFields()[field].getType();
			if (datatype == .VALUE_TYPE_NONE) {
				continue;
			} 
			.fprintf((_iob[1]), "    field %s (%d) with %s value: '%s' / %d\n", ModernizedCProgram.flickcurl_get_photo_field_label(field), field, ModernizedCProgram.flickcurl_get_field_value_type_label(datatype), photo.getFields()[field].getString(), photo.getFields()[field].getInteger());
		}
		ModernizedCProgram.command_print_tags(photo.getTags(), ((Object)0), ((Object)0));
		if (photo.getNotes()) {
			ModernizedCProgram.command_print_notes(photo.getNotes(), ((Object)0), ((Object)0));
		} 
		if (photo.getPlace()) {
			ModernizedCProgram.command_print_place(photo.getPlace(), ((Object)0), ((Object)0), 1);
		} 
		if (photo.getVideo()) {
			ModernizedCProgram.command_print_video(photo.getVideo());
		} 
	}
	public static int command_photos_getInfo(Object fc, int argc, Object argv) {
		flickcurl_photo photo = new flickcurl_photo();
		byte secret = ((Object)0);
		if (argv[2]) {
			secret = argv[2];
		} 
		photo = ModernizedCProgram.flickcurl_photos_getInfo2(fc, argv[1], secret);
		if (photo) {
			.fprintf((_iob[1]), "%s: ", ModernizedCProgram.program);
			ModernizedCProgram.command_print_photo(photo);
			ModernizedCProgram.flickcurl_free_photo(photo);
		} 
		return (photo == ((Object)0));
	}
	public static int command_photos_licenses_getInfo(Object fc, int argc, Object argv) {
		flickcurl_license licenses = new flickcurl_license();
		int i;
		licenses = ModernizedCProgram.flickcurl_photos_licenses_getInfo(fc);
		if (licenses) {
			if (ModernizedCProgram.verbose) {
				.fprintf((_iob[1]), "%s: Found licenses\n", ModernizedCProgram.program);
			} 
			for (i = 0; licenses[i]; i++) {
				flickcurl_license license = licenses[i];
				.fprintf((_iob[1]), "%d) license: id %d name '%s' url %s\n", i, license.getId(), license.getName(), license.getUrl() ? license.getUrl() : "(none)");
			}
		} 
		return (licenses == ((Object)0));
	}
	public static int command_urls_lookupUser(Object fc, int argc, Object argv) {
		byte nsid = ((Object)0);
		byte url = argv[1];
		nsid = ModernizedCProgram.flickcurl_urls_lookupUser(fc, url);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for user profile/photo URL %s\n", ModernizedCProgram.program, nsid, url);
		} 
		return (nsid == ((Object)0));
	}
	public static void command_contexts_print(Object fh, Object contexts) {
		flickcurl_context context = new flickcurl_context();
		int i;
		for (i = 0; (context = contexts[i]); i++) {
			byte label = ModernizedCProgram.flickcurl_get_context_type_field_label(context.getType());
			.fprintf(fh, "%d) context type '%s' id %s secret %s server %d farm %d\n  title: %s\n  url: %s\n  thumb: %s\n", i, label, context.getId(), (context.getSecret() ? context.getSecret() : "NULL"), context.getServer(), context.getFarm(), (context.getTitle() ? context.getTitle() : "NULL"), (context.getUrl() ? context.getUrl() : "NULL"), (context.getThumb() ? context.getThumb() : "NULL"));
		}
	}
	public static int command_groups_pools_getContext(Object fc, int argc, Object argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = ModernizedCProgram.flickcurl_groups_pools_getContext(fc, argv[1], argv[2]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Pool context of photo %s in pool %s:\n", ModernizedCProgram.program, argv[1], argv[2]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		ModernizedCProgram.flickcurl_free_contexts(contexts);
		return 0;
	}
	public static int command_photos_getAllContexts(Object fc, int argc, Object argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = ModernizedCProgram.flickcurl_photos_getAllContexts(fc, argv[1]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos %s all contexts:\n", ModernizedCProgram.program, argv[1]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		ModernizedCProgram.flickcurl_free_contexts(contexts);
		return 0;
	}
	public static int command_photos_getContext(Object fc, int argc, Object argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = ModernizedCProgram.flickcurl_photos_getContext(fc, argv[1]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos %s context:\n", ModernizedCProgram.program, argv[1]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		ModernizedCProgram.flickcurl_free_contexts(contexts);
		return 0;
	}
	public static int command_photos_getCounts(Object fc, int argc, Object argv) {
		byte dates_array = ((Object)0);
		byte taken_dates_array = ((Object)0);
		int counts;
		if (argv[1]) {
			dates_array = ModernizedCProgram.flickcurl_array_split(argv[1], (byte)',');
			if (argv[2]) {
				taken_dates_array = ModernizedCProgram.flickcurl_array_split(argv[2], (byte)',');
			} 
		} 
		counts = ModernizedCProgram.flickcurl_photos_getCounts(fc, (byte)dates_array, (byte)taken_dates_array);
		if (counts) {
			int i;
			for (i = 0; counts[i]; i++) {
				.fprintf((_iob[1]), "%s: photocount %i: count %d  fromdate %d  todate %d\n", ModernizedCProgram.program, i, counts[i][0], counts[i][1], counts[i][2]);
			}
			.free(counts);
		} 
		if (dates_array) {
			ModernizedCProgram.flickcurl_array_free(dates_array);
		} 
		if (taken_dates_array) {
			ModernizedCProgram.flickcurl_array_free(taken_dates_array);
		} 
		return (counts == ((Object)0));
	}
	public static int command_photosets_getContext(Object fc, int argc, Object argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = ModernizedCProgram.flickcurl_photosets_getContext(fc, argv[1], argv[2]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photo %s in photoset %s context:\n", ModernizedCProgram.program, argv[1], argv[2]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		ModernizedCProgram.flickcurl_free_contexts(contexts);
		return 0;
	}
	public static int command_auth_getFrob(Object fc, int argc, Object argv) {
		byte frob;
		frob = ModernizedCProgram.flickcurl_auth_getFrob(fc);
		if (!frob) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Got frob: %s\n", ModernizedCProgram.program, frob);
		.free(frob);
		return 0;
	}
	public static int command_auth_checkToken(Object fc, int argc, Object argv) {
		byte perms;
		perms = ModernizedCProgram.flickcurl_auth_checkToken(fc, argv[1]);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Checked token %s and got perms: %s\n", ModernizedCProgram.program, argv[1], perms);
		.free(perms);
		return 0;
	}
	public static int command_auth_getToken(Object fc, int argc, Object argv) {
		byte perms;
		perms = ModernizedCProgram.flickcurl_auth_getToken(fc, argv[1]);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Got token %s perms: %s\n", ModernizedCProgram.program, argv[1], perms);
		.free(perms);
		return 0;
	}
	public static int command_auth_getFullToken(Object fc, int argc, Object argv) {
		byte perms;
		perms = ModernizedCProgram.flickcurl_auth_getFullToken(fc, argv[1]);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Got full token %s perms: %s\n", ModernizedCProgram.program, argv[1], perms);
		.free(perms);
		return 0;
	}
	public static int command_tags_getListPhoto(Object fc, int argc, Object argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte photo_id = argv[1];
		tags = ModernizedCProgram.flickcurl_tags_getListPhoto(fc, photo_id);
		if (!tags) {
			return 1;
		} 
		ModernizedCProgram.command_print_tags(tags, "Photo ID", photo_id);
		.free(tags);
		return 0;
	}
	public static int command_tags_getListUser(Object fc, int argc, Object argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte user_id = argv[1];
		tags = ModernizedCProgram.flickcurl_tags_getListUser(fc, user_id);
		if (!tags) {
			return 1;
		} 
		ModernizedCProgram.command_print_tags(tags, "User ID", user_id);
		.free(tags);
		return 0;
	}
	public static int command_tags_getListUserPopular(Object fc, int argc, Object argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte user_id = ((Object)0);
		int pop_count = -1;
		if (argv[1]) {
			user_id = argv[1];
			if (argv[2]) {
				pop_count = .atoi(argv[2]);
			} 
		} 
		tags = ModernizedCProgram.flickcurl_tags_getListUserPopular(fc, user_id, pop_count);
		if (!tags) {
			return 1;
		} 
		ModernizedCProgram.command_print_tags(tags, "User ID", user_id);
		.free(tags);
		return 0;
	}
	public static int command_tags_getListUserRaw(Object fc, int argc, Object argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte tag = argv[1];
		tags = ModernizedCProgram.flickcurl_tags_getListUserRaw(fc, tag);
		if (!tags) {
			return 1;
		} 
		ModernizedCProgram.command_print_tags(tags, "Tag", tag);
		.free(tags);
		return 0;
	}
	public static int command_tags_getRelated(Object fc, int argc, Object argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte tag = argv[1];
		tags = ModernizedCProgram.flickcurl_tags_getRelated(fc, tag);
		if (!tags) {
			return 1;
		} 
		ModernizedCProgram.command_print_tags(tags, "Related to Tag", tag);
		.free(tags);
		return 0;
	}
	public static int command_urls_getGroup(Object fc, int argc, Object argv) {
		byte nsid = ((Object)0);
		byte url = argv[1];
		nsid = ModernizedCProgram.flickcurl_urls_getGroup(fc, url);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for group profile/photo URL %s\n", ModernizedCProgram.program, nsid, url);
		} 
		return (nsid == ((Object)0));
	}
	public static int command_urls_getUserPhotos(Object fc, int argc, Object argv) {
		byte url = ((Object)0);
		byte user = argv[1];
		url = ModernizedCProgram.flickcurl_urls_getUserPhotos(fc, user);
		if (url) {
			.fprintf((_iob[1]), "%s: photo URL %s for user %s\n", ModernizedCProgram.program, url, user);
		} 
		return (url == ((Object)0));
	}
	public static int command_urls_getUserProfile(Object fc, int argc, Object argv) {
		byte url = ((Object)0);
		byte user = argv[1];
		url = ModernizedCProgram.flickcurl_urls_getUserProfile(fc, user);
		if (url) {
			.fprintf((_iob[1]), "%s: photo URL %s for user %s\n", ModernizedCProgram.program, url, user);
		} 
		return (url == ((Object)0));
	}
	public static int command_urls_lookupGroup(Object fc, int argc, Object argv) {
		byte nsid = ((Object)0);
		byte url = argv[1];
		nsid = ModernizedCProgram.flickcurl_urls_lookupGroup(fc, url);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for group profile/photo URL %s\n", ModernizedCProgram.program, nsid, url);
		} 
		return (url == ((Object)0));
	}
	public static int command_tags_getHotList(Object fc, int argc, Object argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte period = ((Object)0);
		int count = -1;
		if (argv[1]) {
			period = argv[1];
			if (argv[2]) {
				count = .atoi(argv[2]);
			} 
		} 
		tags = ModernizedCProgram.flickcurl_tags_getHotList(fc, period, count);
		if (!tags) {
			return 1;
		} 
		ModernizedCProgram.command_print_tags(tags, "Hot tags for period", (period ? period : "day"));
		.free(tags);
		return 0;
	}
	public static int command_photos_addTags(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte tags = argv[2];
		return ModernizedCProgram.flickcurl_photos_addTags(fc, photo_id, tags);
	}
	public static int command_photos_delete(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		return ModernizedCProgram.flickcurl_photos_delete(fc, photo_id);
	}
	public static int command_photos_removeTag(Object fc, int argc, Object argv) {
		byte tag_id = argv[1];
		return ModernizedCProgram.flickcurl_photos_removeTag(fc, tag_id);
	}
	public static int command_photos_setTags(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte tags = argv[2];
		return ModernizedCProgram.flickcurl_photos_setTags(fc, photo_id, tags);
	}
	public static int command_reflection_getMethodInfo(Object fc, int argc, Object argv) {
		flickcurl_method method = new flickcurl_method();
		method = ModernizedCProgram.flickcurl_reflection_getMethodInfo(fc, argv[1]);
		if (method) {
			.fprintf((_iob[1]), "%s: Found method %s\n", ModernizedCProgram.program, method.getName());
			.fprintf((_iob[1]), "  Needs Login? %s\n", (method.getNeedslogin() ? "yes" : "no"));
			.fprintf((_iob[1]), "  Description: %s\n", method.getDescription());
			.fprintf((_iob[1]), "  Response: '%s'\n", method.getResponse());
			.fprintf((_iob[1]), "  Explanation of Response: %s\n", method.getExplanation() ? method.getExplanation() : "(None)");
			if (method.getArgs_count()) {
				int i;
				.fprintf((_iob[1]), "%s: %d argument%s:\n", ModernizedCProgram.program, method.getArgs_count(), ((method.getArgs_count() != 1) ? "s" : ""));
				for (i = 0; method.getArgs()[i]; i++) {
					flickcurl_arg arg = method.getArgs()[i];
					.fprintf((_iob[1]), "%d) argument '%s' %s description: '%s'\n", i, arg.getName(), (arg.getOptional() ? "" : "(required)"), arg.getDescription());
				}
			} else {
					.fprintf((_iob[1]), "%s: No arguments\n", ModernizedCProgram.program);
			} 
			ModernizedCProgram.flickcurl_free_method(method);
		} 
		return (method == ((Object)0));
	}
	public static int command_reflection_getMethods(Object fc, int argc, Object argv) {
		byte methods;
		methods = ModernizedCProgram.flickcurl_reflection_getMethods(fc);
		if (methods) {
			int i;
			.fprintf((_iob[1]), "%s: Found methods:\n", ModernizedCProgram.program);
			for (i = 0; methods[i]; i++) {
				.printf("%d) %s\n", i, methods[i]);
			}
			for (i = 0; methods[i]; i++) {
				.free(methods[i]);
			}
			.free(methods);
		} 
		return (methods == ((Object)0));
	}
	public static int command_photos_comments_addComment(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte comment_text = argv[2];
		byte id;
		id = ModernizedCProgram.flickcurl_photos_comments_addComment(fc, photo_id, comment_text);
		if (id) {
			.fprintf((_iob[1]), "%s: Added comment '%s' to photo %s giving comment ID %s\n", ModernizedCProgram.program, photo_id, comment_text, id);
		} 
		return (id == ((Object)0));
	}
	public static int command_photos_comments_deleteComment(Object fc, int argc, Object argv) {
		byte comment_id = argv[1];
		return ModernizedCProgram.flickcurl_photos_comments_deleteComment(fc, comment_id);
	}
	public static int command_photos_comments_editComment(Object fc, int argc, Object argv) {
		byte comment_id = argv[1];
		byte comment_text = argv[2];
		return ModernizedCProgram.flickcurl_photos_comments_editComment(fc, comment_id, comment_text);
	}
	public static void command_print_comments(Object comments, Object label, Object value) {
		int i;
		if (label) {
			.fprintf((_iob[1]), "%s: %s %s comments\n", ModernizedCProgram.program, label, (value ? value : "(none)"));
		} 
		for (i = 0; comments[i]; i++) {
			flickcurl_comment comment_object = comments[i];
			.fprintf((_iob[1]), "%d) ID %s author %s authorname %s datecreate %d permalink %s text '%s'\n", i, comment_object.getId(), comment_object.getAuthor(), comment_object.getAuthorname(), comment_object.getDatecreate(), comment_object.getPermalink(), comment_object.getText());
		}
	}
	public static int command_photos_comments_getList(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		flickcurl_comment comments = new flickcurl_comment();
		comments = ModernizedCProgram.flickcurl_photos_comments_getList(fc, photo_id);
		if (!comments) {
			return 1;
		} 
		ModernizedCProgram.command_print_comments(comments, "Photo ID", photo_id);
		ModernizedCProgram.flickcurl_free_comments(comments);
		return 0;
	}
	public static int command_photosets_comments_addComment(Object fc, int argc, Object argv) {
		byte photoset_id = argv[1];
		byte comment_text = argv[2];
		byte id;
		id = ModernizedCProgram.flickcurl_photosets_comments_addComment(fc, photoset_id, comment_text);
		if (id) {
			.fprintf((_iob[1]), "%s: Added comment '%s' to photoset %s giving comment ID %s\n", ModernizedCProgram.program, photoset_id, comment_text, id);
			.free(id);
		} 
		return (id == ((Object)0));
	}
	public static int command_photosets_comments_deleteComment(Object fc, int argc, Object argv) {
		byte comment_id = argv[1];
		return ModernizedCProgram.flickcurl_photosets_comments_deleteComment(fc, comment_id);
	}
	public static int command_photosets_comments_editComment(Object fc, int argc, Object argv) {
		byte comment_id = argv[1];
		byte comment_text = argv[2];
		return ModernizedCProgram.flickcurl_photosets_comments_editComment(fc, comment_id, comment_text);
	}
	public static int command_photosets_comments_getList(Object fc, int argc, Object argv) {
		byte photoset_id = argv[1];
		flickcurl_comment comments = new flickcurl_comment();
		comments = ModernizedCProgram.flickcurl_photosets_comments_getList(fc, photoset_id);
		if (!comments) {
			return 1;
		} 
		ModernizedCProgram.command_print_comments(comments, "Photoset ID", photoset_id);
		ModernizedCProgram.flickcurl_free_comments(comments);
		return 0;
	}
	public static void print_upload_status(Object handle, Object status, Object label) {
		if (label) {
			.fprintf(handle, "%s: %s status\n", ModernizedCProgram.program, label);
		} 
		if (status.getPhotoid()) {
			.fprintf(handle, "  Photo ID: %s\n", status.getPhotoid());
		} 
		if (status.getSecret()) {
			.fprintf(handle, "  Secret: %s\n", status.getSecret());
		} 
		if (status.getOriginalsecret()) {
			.fprintf(handle, "  Original Secret: %s\n", status.getOriginalsecret());
		} 
		if (status.getTicketid()) {
			.fprintf(handle, "  Ticket ID: %s\n", status.getTicketid());
		} 
	}
	public static Object yesno(int v) {
		return ModernizedCProgram.yn_strings[(v ? 1 : 0)];
	}
	public static void print_upload_params(Object handle, Object params, Object label) {
		if (label) {
			.fprintf(handle, "%s: %s\n", ModernizedCProgram.program, label);
		} 
		.fprintf(handle, "  File: %s\n", params.getPhoto_file());
		if (params.getTitle()) {
			.fprintf(handle, "  Title: '%s'\n", params.getTitle());
		} else {
				.fprintf(handle, "  Title: none\n");
		} 
		if (params.getDescription()) {
			.fprintf(handle, "  Description: '%s'\n", params.getDescription());
		} else {
				.fprintf(handle, "  Description: none\n");
		} 
		.fprintf(handle, "  Tags: %s\n", (params.getTags() ? params.getTags() : ""));
		.fprintf(handle, "  Viewable by Public: %s  Friends: %s  Family: %s\n", ModernizedCProgram.yesno(params.getIs_public()), ModernizedCProgram.yesno(params.getIs_friend()), ModernizedCProgram.yesno(params.getIs_family()));
		.fprintf(handle, "  Safety level: %s (%d)\n", ModernizedCProgram.flickcurl_get_safety_level_label(params.getSafety_level()), params.getSafety_level());
		.fprintf(handle, "  Content type: %s (%d)\n", ModernizedCProgram.flickcurl_get_content_type_label(params.getContent_type()), params.getContent_type());
		.fprintf(handle, "  Hidden: %s (%d)\n", ModernizedCProgram.flickcurl_get_hidden_label(params.getHidden()), params.getHidden());
	}
	public static int command_upload(Object fc, int argc, Object argv) {
		byte tags_string = ((Object)0);
		flickcurl_upload_status status = ((Object)0);
		int usage = 0;
		flickcurl_upload_params params = new flickcurl_upload_params();
		.memset(params, (byte)'\0', );
		params.setSafety_level(/* default safe */1);
		params.setContent_type(/* default photo */1);
		params.setHidden(/* default public */1);
		argv++;
		argc--;
		params.setPhoto_file(argv[0]);
		Object generatedPhoto_file = params.getPhoto_file();
		if (.access((byte)generatedPhoto_file, R_OK)) {
			.fprintf((_iob[2]), "%s: Failed to read image filename '%s': %s\n", ModernizedCProgram.program, generatedPhoto_file, .strerror(errno));
			status = ((Object)0);
			;
		} 
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "description")) {
				params.setDescription(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "title")) {
				params.setTitle(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "safety_level")) {
				params.setSafety_level(ModernizedCProgram.flickcurl_get_safety_level_from_string(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "content_type")) {
				params.setContent_type(ModernizedCProgram.flickcurl_get_content_type_from_string(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "hidden")) {
				params.setHidden(ModernizedCProgram.flickcurl_get_hidden_from_string(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "friend")) {
				params.setIs_friend(1);
			}  else if (!.strcmp(field, "family")) {
				params.setIs_family(1);
			}  else if (!.strcmp(field, "public")) {
				params.setIs_public(1);
			}  else if (!.strcmp(field, "tags")) {
				size_t tags_len = 0;
				int i;
				byte p;
				for (i = 0; i < argc; /* tags absorb all remaining parameters */i++) {
					tags_len += .strlen(argv[i]) + 1;
				}
				tags_string = (byte).malloc(tags_len);
				p = tags_string;
				for (i = 0; i < argc; i++) {
					size_t tag_len = .strlen(argv[i]);
					.strncpy(p, argv[i], tag_len);
					p += tag_len;
					p++ = (byte)' ';
				}
				(--p) = (byte)'\0';
				params.setTags(tags_string);
				break;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, field);
					usage = 1;
			} 
		}
		if (usage) {
			status = ((Object)0);
			;
		} 
		if (ModernizedCProgram.verbose == 1) {
			.fprintf((_iob[1]), "%s: Uploading file %s\n", ModernizedCProgram.program, generatedPhoto_file);
		}  else if (ModernizedCProgram.verbose > 1) {
			ModernizedCProgram.print_upload_params((_iob[1]), params, "Photo upload");
		} 
		status = ModernizedCProgram.flickcurl_photos_upload_params(fc, params);
		if (status) {
			ModernizedCProgram.print_upload_status((_iob[1]), status, "Photo upload");
			ModernizedCProgram.flickcurl_free_upload_status(status);
		} 
		return (status == ((Object)0));
	}
	public static int command_replace(Object fc, int argc, Object argv) {
		byte file = argv[1];
		byte photo_id = argv[2];
		int async = 0;
		flickcurl_upload_status status = ((Object)0);
		if (.access((byte)file, R_OK)) {
			.fprintf((_iob[2]), "%s: Failed to read image filename '%s': %s\n", ModernizedCProgram.program, file, .strerror(errno));
			status = ((Object)0);
			;
		} 
		if (argc > 3 && !.strcmp(argv[3], "async")) {
			async = 1;
		} 
		status = ModernizedCProgram.flickcurl_photos_replace(fc, file, photo_id, async);
		if (status) {
			ModernizedCProgram.print_upload_status((_iob[1]), status, "Photo replace");
			ModernizedCProgram.flickcurl_free_upload_status(status);
		} 
	}
	public static int command_photos_setContentType(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte content_type_str = argv[2];
		int content_type;
		content_type = ModernizedCProgram.flickcurl_get_content_type_from_string(content_type_str);
		if (content_type < 0) {
			.fprintf((_iob[2]), "%s: Bad content type '%s'\n", ModernizedCProgram.program, content_type_str);
			return 1;
		} 
		content_type_str = ModernizedCProgram.flickcurl_get_content_type_label(content_type);
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Setting photo %s to content type %d (%s)\n", ModernizedCProgram.program, photo_id, content_type, content_type_str);
		} 
		return ModernizedCProgram.flickcurl_photos_setContentType(fc, photo_id, content_type);
	}
	public static int command_photos_setDates(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int date_posted = -1;
		int date_taken = -1;
		int date_taken_granularity = -1;
		date_posted = .curl_getdate(argv[2], ((Object)0));
		date_taken = .curl_getdate(argv[3], ((Object)0));
		date_taken_granularity = .atoi(argv[4]);
		return ModernizedCProgram.flickcurl_photos_setDates(fc, photo_id, date_posted, date_taken, date_taken_granularity);
	}
	public static int command_photos_setMeta(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte title = argv[2];
		byte description = argv[3];
		return ModernizedCProgram.flickcurl_photos_setMeta(fc, photo_id, title, description);
	}
	public static int parse_bool_param(Object param) {
		byte eptr;
		int b;
		if (!param || (!.strcmp(param, "false") || !.strcmp(param, "no"))) {
			return 0;
		} 
		if (!.strcmp(param, "true") || !.strcmp(param, "yes")) {
			return 1;
		} 
		eptr = ((Object)0);
		b = (int).strtol(param, eptr, 10);
		if (eptr) {
			return 0;
		} 
		return (b != 0);
	}
	public static int command_photos_setPerms(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int is_public = ModernizedCProgram.parse_bool_param(argv[2]);
		int is_friend = ModernizedCProgram.parse_bool_param(argv[3]);
		int is_family = ModernizedCProgram.parse_bool_param(argv[4]);
		int perm_comment = .atoi(argv[5]);
		int perm_addmeta = .atoi(argv[6]);
		flickcurl_perms perms = new flickcurl_perms();
		.memset(perms, (byte)'\0', );
		perms.setIs_public(is_public);
		perms.setIs_friend(is_friend);
		perms.setIs_family(is_family);
		perms.setPerm_comment(perm_comment);
		perms.setPerm_addmeta(perm_addmeta);
		return ModernizedCProgram.flickcurl_photos_setPerms(fc, photo_id, perms);
	}
	public static int command_photos_setSafetyLevel(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte safety_level_str = argv[2];
		int hidden = ModernizedCProgram.parse_bool_param(argv[3]);
		int safety_level;
		safety_level = ModernizedCProgram.flickcurl_get_safety_level_from_string(safety_level_str);
		if (safety_level < 0) {
			.fprintf((_iob[2]), "%s: Bad safety level '%s'\n", ModernizedCProgram.program, safety_level_str);
			return 1;
		} 
		safety_level_str = ModernizedCProgram.flickcurl_get_safety_level_label(safety_level);
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Setting photo %s safety level to %d (%s), hidden %d\n", ModernizedCProgram.program, photo_id, safety_level, safety_level_str, hidden);
		} 
		return ModernizedCProgram.flickcurl_photos_setSafetyLevel(fc, photo_id, safety_level, hidden);
	}
	public static void command_print_perms(Object perms, int show_comment_metadata) {
		byte[] perms_labels = new byte[]{"nobody", "friends and family", "contacts", "everybody"};
		.fprintf((_iob[1]), "view perms: public: %s  contact: %s  friend: %s  family: %s\n", ModernizedCProgram.yesno(perms.getIs_public()), ModernizedCProgram.yesno(perms.getIs_contact()), ModernizedCProgram.yesno(perms.getIs_friend()), ModernizedCProgram.yesno(perms.getIs_family()));
		if (show_comment_metadata) {
			.fprintf((_iob[1]), "add comment: %s\nadd metadata: %s\n", (((perms.getPerm_comment()) >= 0 && (perms.getPerm_comment()) <= 3) ? perms_labels[(perms.getPerm_comment())] : "?"), (((perms.getPerm_addmeta()) >= 0 && (perms.getPerm_addmeta()) <= 3) ? perms_labels[(perms.getPerm_addmeta())] : "?"));
		} 
	}
	public static int command_photos_getPerms(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		flickcurl_perms perms = new flickcurl_perms();
		perms = ModernizedCProgram.flickcurl_photos_getPerms(fc, photo_id);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID %s permissions\n", ModernizedCProgram.program, photo_id);
		ModernizedCProgram.command_print_perms(perms, 1);
		ModernizedCProgram.flickcurl_free_perms(perms);
		return 0;
	}
	public static int command_print_photos_list(Object fc, Object photos_list, Object fh, Object label) {
		int rc = 0;
		int i;
		if (photos_list.getPhotos()) {
			.fprintf((_iob[1]), "%s: %s returned %d photos out of %d, page %d per-page %d\n", ModernizedCProgram.program, label, photos_list.getPhotos_count(), photos_list.getTotal_count(), photos_list.getPage(), photos_list.getPer_page());
			for (i = 0; photos_list.getPhotos()[i]; i++) {
				.fprintf((_iob[1]), "%s: %s photo %d\n", ModernizedCProgram.program, label, i);
				ModernizedCProgram.command_print_photo(photos_list.getPhotos()[i]);
			}
		}  else if (photos_list.getContent()) {
			size_t write_count = new size_t();
			if (ModernizedCProgram.verbose) {
				.fprintf((_iob[1]), "%s: %s returned %d bytes of %s content\n", ModernizedCProgram.program, label, (int)photos_list.getContent_length(), photos_list.getFormat());
			} 
			write_count = .fwrite(photos_list.getContent(), 1, photos_list.getContent_length(), fh);
			if (write_count < photos_list.getContent_length()) {
				.fprintf((_iob[2]), "%s: writing to %s failed\n", ModernizedCProgram.program, ModernizedCProgram.output_filename);
				rc = 1;
			} 
		} else {
				.fprintf((_iob[2]), "%s: %s returned neither photos nor raw content\n", ModernizedCProgram.program, label);
				rc = 1;
		} 
		return rc;
	}
	public static int command_photos_getContactsPhotos(Object fc, int argc, Object argv) {
		int contact_count = 10;
		int just_friends = 0;
		int single_photo = 1;
		int include_self = 0;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 1) {
			list_params.setExtras(argv[1]);
			if (argc > 2) {
				list_params.setFormat(argv[2]);
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_getContactsPhotos_params(fc, contact_count, just_friends, single_photo, include_self, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Contact photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int parse_page_param(Object param) {
		byte eptr;
		int i;
		if (!param || param == (byte)'-') {
			return -1;
		} 
		eptr = ((Object)0);
		i = (int).strtol(param, eptr, 10);
		if (eptr) {
			return -1;
		} 
		return i;
	}
	public static int command_photos_search(Object fc, int argc, Object argv) {
		byte tags_string = ((Object)0);
		int usage = 0;
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_search_params params = new flickcurl_search_params();
		flickcurl_photos_list photos_list = ((Object)0);
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		ModernizedCProgram.flickcurl_search_params_init(params);
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "user")) {
				params.setUser_id(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "tag-mode")) {
				params.setTag_mode(argv[/* "any" or "all" */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "text")) {
				params.setText(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-upload-date")) {
				params.setMin_upload_date(.curl_getdate(argv[0], ((Object)/* timestamp */0)));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload-date")) {
				params.setMax_upload_date(.curl_getdate(argv[0], ((Object)/* timestamp */0)));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken-date")) {
				params.setMin_taken_date(argv[/* MYSQL datetime */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken-date")) {
				params.setMax_taken_date(argv[/* MYSQL datetime */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "license")) {
				params.setLicense(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "sort"/* date-posted-asc, date-posted-desc (default), date-taken-asc,
			       * date-taken-desc, interestingness-desc, interestingness-asc,
			       * and relevance
			       */)) {
				params.setSort(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "privacy")) {
				params.setPrivacy_filter(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "bbox")) {
				params.setBbox(argv[/* "a,b,c,d" */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "accuracy")) {
				params.setAccuracy(.atoi(argv[/* int 1-16 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "safe-search")) {
				params.setSafe_search(.atoi(argv[/* int Safe search setting: 1 safe, 2 moderate, 3 restricted. */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "type"/* int Content Type setting: 1 for photos only, 2 for screenshots
			       * only, 3 for 'other' only, 4 for all types. */)) {
				params.setContent_type(.atoi(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "machine-tags")) {
				params.setMachine_tags(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "machine-tag-mode")) {
				params.setMachine_tag_mode(argv[/* any (default) or all */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "group-id")) {
				params.setGroup_id(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "extras")) {
				list_params.setExtras(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "place-id")) {
				params.setPlace_id(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "media")) {
				params.setMedia(argv[/* "all" (default if missing) or "photos" or "video" */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "has-geo")) {
				params.setHas_geo(1);
			}  else if (!.strcmp(field, "lat")) {
				params.setLat(.atoi(argv[/* double: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "lon")) {
				params.setLon(.atoi(argv[/* double: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "radius")) {
				params.setRadius(.atoi(argv[/* double: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "radius-units")) {
				params.setRadius_units(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "contacts")) {
				params.setContacts(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "woeid")) {
				params.setWoe_id(.atoi(argv[/* int: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "geo-context")) {
				params.setGeo_context(.atoi(argv[/* int: 0 (not defined)  1 (indoors)  2(outdoors) default 0 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "is-commons")) {
				params.setIs_commons(1);
			}  else if (!.strcmp(field, "in-gallery")) {
				params.setIn_gallery(1);
			}  else if (!.strcmp(field, "tags")) {
				size_t tags_len = 0;
				int j;
				byte p;
				for (j = 0; j < argc; /* tags absorb all remaining parameters */j++) {
					tags_len += .strlen(argv[j]) + 1;
				}
				tags_string = (byte).malloc(tags_len);
				p = tags_string;
				for (j = 0; j < argc; j++) {
					size_t tag_len = .strlen(argv[j]);
					.strncpy(p, argv[j], tag_len);
					p += tag_len;
					p++ = (byte)',';
				}
				(--p) = (byte)'\0';
				params.setTags(tags_string);
				break;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			photos_list = ((Object)0);
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_search_params(fc, params, list_params);
		if (!photos_list) {
			.fprintf((_iob[2]), "%s: Searching failed\n", ModernizedCProgram.program);
		} else {
				int rc;
				rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Search result");
				ModernizedCProgram.flickcurl_free_photos_list(photos_list);
				if (rc) {
					photos_list = ((Object)0);
				} 
		} 
		return (photos_list == ((Object)0));
	}
	public static int command_photos_geo_getLocation(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		flickcurl_location location = new flickcurl_location();
		location = ModernizedCProgram.flickcurl_photos_geo_getLocation(fc, photo_id);
		if (!location) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID %s location\n  ", ModernizedCProgram.program, photo_id);
		ModernizedCProgram.command_print_location(location);
		ModernizedCProgram.flickcurl_free_location(location);
		return 0;
	}
	public static int command_photos_geo_getPerms(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		flickcurl_perms perms = new flickcurl_perms();
		perms = ModernizedCProgram.flickcurl_photos_geo_getPerms(fc, photo_id);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID %s geo permissions:\n", ModernizedCProgram.program, photo_id);
		ModernizedCProgram.command_print_perms(perms, 0);
		ModernizedCProgram.flickcurl_free_perms(perms);
		return 0;
	}
	public static int command_photos_geo_removeLocation(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		return ModernizedCProgram.flickcurl_photos_geo_removeLocation(fc, photo_id);
	}
	public static int command_photos_geo_setLocation(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		double latitude = .atof(argv[2]);
		double longitude = .atof(argv[3]);
		int accuracy = .atoi(argv[4]);
		flickcurl_location location = new flickcurl_location();
		.memset(location, (byte)'\0', );
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		location.setAccuracy(accuracy);
		return ModernizedCProgram.flickcurl_photos_geo_setLocation(fc, photo_id, location);
	}
	public static int command_photos_geo_setPerms(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int is_public = ModernizedCProgram.parse_bool_param(argv[2]);
		int is_contact = ModernizedCProgram.parse_bool_param(argv[3]);
		int is_friend = ModernizedCProgram.parse_bool_param(argv[4]);
		int is_family = ModernizedCProgram.parse_bool_param(argv[5]);
		flickcurl_perms perms = new flickcurl_perms();
		.memset(perms, (byte)'\0', );
		perms.setIs_public(is_public);
		perms.setIs_contact(is_contact);
		perms.setIs_friend(is_friend);
		perms.setIs_family(is_family);
		return ModernizedCProgram.flickcurl_photos_geo_setPerms(fc, photo_id, perms);
	}
	public static int command_photos_notes_add(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int note_x = .atoi(argv[2]);
		int note_y = .atoi(argv[3]);
		int note_w = .atoi(argv[4]);
		int note_h = .atoi(argv[5]);
		byte note_text = argv[6];
		byte id;
		id = ModernizedCProgram.flickcurl_photos_notes_add(fc, photo_id, note_x, note_y, note_w, note_h, note_text);
		if (id) {
			if (ModernizedCProgram.verbose) {
				.fprintf((_iob[1]), "%s: Added note '%s' (x:%d y:%d w:%d h:%d) to photo ID %s giving note ID %s\n", ModernizedCProgram.program, note_text, note_x, note_y, note_w, note_h, photo_id, id);
			} 
			.free(id);
		} 
		return (id == ((Object)0));
	}
	public static int command_photos_notes_delete(Object fc, int argc, Object argv) {
		byte note_id = argv[1];
		return ModernizedCProgram.flickcurl_photos_notes_delete(fc, note_id);
	}
	public static int command_photos_notes_edit(Object fc, int argc, Object argv) {
		byte note_id = argv[1];
		int note_x = .atoi(argv[2]);
		int note_y = .atoi(argv[3]);
		int note_w = .atoi(argv[4]);
		int note_h = .atoi(argv[5]);
		byte note_text = argv[6];
		return ModernizedCProgram.flickcurl_photos_notes_edit(fc, note_id, note_x, note_y, note_w, note_h, note_text);
	}
	public static int command_photos_licenses_setLicense(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int license_id = .atoi(argv[2]);
		return ModernizedCProgram.flickcurl_photos_licenses_setLicense(fc, photo_id, license_id);
	}
	public static int command_people_getPublicPhotos(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_people_getPublicPhotos_params(fc, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: User %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_groups_pools_add(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte group_id = argv[2];
		return ModernizedCProgram.flickcurl_groups_pools_add(fc, photo_id, group_id);
	}
	public static void command_print_group(Object g) {
		.fprintf((_iob[1]), "group: nsid %s  name '%s'\n  description '%s'  lang '%s'\n  rules '%s'\n  user is?  admin %d moderator %d member %d\n  pool moderated %d  privacy %d\n  iconserver %d  iconfarm %d\n  photos %d   members %d\n  throttle count %d  mode '%s'  remaining %d\n  pool count %d  topic count %d\n  restrictions photos %d videos %d images %d screens %d art %d\n  restrictions safe %d moderate %d restricted %d\n  restrictions has geo %d\n", g.getNsid(), g.getName(), (g.getDescription() ? g.getDescription() : ""), (g.getLang() ? g.getLang() : ""), (g.getRules() ? g.getRules() : ""), g.getIs_admin(), g.getIs_moderator(), g.getIs_member(), g.getIs_pool_moderated(), g.getPrivacy(), g.getIconserver(), g.getIconfarm(), g.getPhotos(), g.getMembers(), g.getThrottle_count(), (g.getThrottle_mode() ? g.getThrottle_mode() : ""), g.getThrottle_remaining(), g.getPool_count(), g.getTopic_count(), g.getPhotos_ok(), g.getVideos_ok(), g.getImages_ok(), g.getScreens_ok(), g.getArt_ok(), g.getSafe_ok(), g.getModerate_ok(), g.getRestricted_ok(), g.getHas_geo());
	}
	public static int command_groups_pools_getGroups(Object fc, int argc, Object argv) {
		int per_page = 10;
		int page = 0;
		flickcurl_group groups = ((Object)0);
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[1]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[2]);
			} 
		} 
		groups = ModernizedCProgram.flickcurl_groups_pools_getGroups(fc, page, per_page);
		if (groups) {
			int i;
			if (ModernizedCProgram.verbose) {
				.fprintf((_iob[1]), "%s: Groups (page %d, per page %d)\n", ModernizedCProgram.program, page, per_page);
			} 
			for (i = 0; groups[i]; i++) {
				ModernizedCProgram.command_print_group(groups[i]);
			}
			ModernizedCProgram.flickcurl_free_groups(groups);
		} 
		return (groups == ((Object)0));
	}
	public static int command_groups_pools_getPhotos(Object fc, int argc, Object argv) {
		byte group_id = argv[1];
		byte tags = ((Object)0);
		byte user_id = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_groups_pools_getPhotos_params(fc, group_id, tags, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Group %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, group_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_groups_pools_remove(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte group_id = argv[2];
		return ModernizedCProgram.flickcurl_groups_pools_remove(fc, photo_id, group_id);
	}
	public static int command_photos_getContactsPublicPhotos(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		int contact_count = 10;
		int just_friends = 0;
		int single_photo = 1;
		int include_self = 0;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 2) {
			list_params.setFormat(argv[2]);
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_getContactsPublicPhotos_params(fc, user_id, contact_count, just_friends, single_photo, include_self, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Contact Public Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static void command_print_exif(Object e) {
		.fprintf((_iob[1]), "tagspace %s (%d) tag %d label '%s' raw '%s' clean '%s'\n", e.getTagspace(), e.getTagspaceid(), e.getTag(), e.getLabel(), e.getRaw(), e.getClean());
	}
	public static int command_photos_getExif(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte secret = ((Object)0);
		flickcurl_exif exifs = new flickcurl_exif();
		int i;
		exifs = ModernizedCProgram.flickcurl_photos_getExif(fc, photo_id, secret);
		if (!exifs) {
			return 1;
		} 
		for (i = 0; exifs[i]; i++) {
			ModernizedCProgram.command_print_exif(exifs[i]);
		}
		ModernizedCProgram.flickcurl_free_exifs(exifs);
		return 0;
	}
	public static int command_photos_getFavorites(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int i;
		int per_page = 10;
		int page = 0;
		flickcurl_person persons = new flickcurl_person();
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		persons = ModernizedCProgram.flickcurl_photos_getFavorites(fc, photo_id, page, per_page);
		if (!persons) {
			return 1;
		} 
		for (i = 0; persons[i]; i++) {
			ModernizedCProgram.command_print_person(persons[i]);
		}
		ModernizedCProgram.flickcurl_free_persons(persons);
		return 0;
	}
	public static int command_photoslist(Object fc, int argc, Object argv, Object api_fn, Object label) {
		int min_upload_date = -1;
		int max_upload_date = -1;
		byte min_taken_date = ((Object)0);
		byte max_taken_date = ((Object)0);
		int privacy_filter = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 1) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[1]));
			if (argc > 2) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[2]));
				if (argc > 3) {
					list_params.setFormat(argv[3]);
				} 
			} 
		} 
		photos_list = .api_fn(fc, min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_photos_getNotInSet(Object fc, int argc, Object argv) {
		return ModernizedCProgram.command_photoslist(fc, argc, argv, ModernizedCProgram.flickcurl_photos_getNotInSet_params, "Photo not in set");
	}
	public static int command_photos_getSizes(Object fc, int argc, Object argv) {
		flickcurl_size sizes = ((Object)0);
		byte photo_id = argv[1];
		int i;
		sizes = ModernizedCProgram.flickcurl_photos_getSizes(fc, photo_id);
		if (!sizes) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Sizes for photo/video %s\n", ModernizedCProgram.program, photo_id);
		} 
		for (i = 0; sizes[i]; i++) {
			.fprintf((_iob[1]), "%d: type '%s' label '%s' width %d height %d\n  source %s\n  url %s\n", i, sizes[i].getMedia(), sizes[i].getLabel(), sizes[i].getWidth(), sizes[i].getHeight(), sizes[i].getSource(), sizes[i].getUrl());
		}
		ModernizedCProgram.flickcurl_free_sizes(sizes);
		return 0;
	}
	public static int command_photos_getRecent(Object fc, int argc, Object argv) {
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 1) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[1]));
			if (argc > 2) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[2]));
				if (argc > 3) {
					list_params.setFormat(argv[3]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_getRecent_params(fc, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Recent Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_photos_getUntagged(Object fc, int argc, Object argv) {
		return ModernizedCProgram.command_photoslist(fc, argc, argv, ModernizedCProgram.flickcurl_photos_getUntagged_params, "Untagged photo");
	}
	public static int command_photos_getWithGeoData(Object fc, int argc, Object argv) {
		return ModernizedCProgram.command_photoslist(fc, argc, argv, ModernizedCProgram.flickcurl_photos_getWithGeoData_params, "Photo with geo data");
	}
	public static int command_photos_getWithoutGeoData(Object fc, int argc, Object argv) {
		return ModernizedCProgram.command_photoslist(fc, argc, argv, ModernizedCProgram.flickcurl_photos_getWithoutGeoData_params, "Photo without geo data");
	}
	public static int command_photos_recentlyUpdated(Object fc, int argc, Object argv) {
		int min_date = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		min_date = .atoi(argv[1]);
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_recentlyUpdated_params(fc, min_date, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Recently Updated Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static void command_print_photoset(Object photoset) {
		.fprintf((_iob[1]), "%s: Found photoset with ID %s primary photo: '%s' secret: %s server: %d farm: %d photos count: %d title: '%s' description: '%s'\n", ModernizedCProgram.program, photoset.getId(), photoset.getPrimary(), photoset.getSecret(), photoset.getServer(), photoset.getFarm(), photoset.getPhotos_count(), photoset.getTitle(), (photoset.getDescription() ? photoset.getDescription() : "(No description)"));
	}
	public static int command_photosets_getInfo(Object fc, int argc, Object argv) {
		flickcurl_photoset photoset = ((Object)0);
		byte photoset_id = argv[1];
		photoset = ModernizedCProgram.flickcurl_photosets_getInfo(fc, photoset_id);
		if (photoset) {
			ModernizedCProgram.command_print_photoset(photoset);
			ModernizedCProgram.flickcurl_free_photoset(photoset);
		} 
		return (photoset == ((Object)0));
	}
	public static int command_photosets_getList(Object fc, int argc, Object argv) {
		flickcurl_photoset photoset_list = ((Object)0);
		byte user_id = argv[1];
		int i;
		photoset_list = ModernizedCProgram.flickcurl_photosets_getList(fc, user_id);
		if (!photoset_list) {
			return 1;
		} 
		for (i = 0; photoset_list[i]; i++) {
			.fprintf((_iob[1]), "%s: Photoset %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_photoset(photoset_list[i]);
		}
		ModernizedCProgram.flickcurl_free_photosets(photoset_list);
		return 0;
	}
	public static int command_photosets_getPhotos(Object fc, int argc, Object argv) {
		byte photoset_id = argv[1];
		int privacy_filter = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 2) {
			list_params.setExtras(argv[2]);
			if (argc > 3) {
				privacy_filter = .atoi(argv[3]);
				if (argc > 4) {
					list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[4]));
					if (argc > 5) {
						list_params.setPage(ModernizedCProgram.parse_page_param(argv[5]));
						if (argc > 6) {
							list_params.setFormat(argv[6]);
						} 
					} 
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photosets_getPhotos_params(fc, photoset_id, privacy_filter, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photoset %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, photoset_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_photosets_addPhoto(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_photosets_addPhoto(fc, argv[1], argv[2]);
	}
	public static int command_photosets_create(Object fc, int argc, Object argv) {
		byte title = argv[1];
		byte description = argv[2];
		byte primary_photo_id = argv[3];
		byte url = ((Object)0);
		byte id;
		id = ModernizedCProgram.flickcurl_photosets_create(fc, title, description, primary_photo_id, url);
		if (!id) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photoset %s created with URL %s\n", ModernizedCProgram.program, id, url);
		.free(url);
		.free(id);
		return 0;
	}
	public static int command_photosets_delete(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_photosets_delete(fc, argv[1]);
	}
	public static int command_photosets_editMeta(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_photosets_editMeta(fc, argv[1], argv[2], argv[3]);
	}
	public static int command_photosets_editPhotos(Object fc, int argc, Object argv) {
		byte photoset_id = argv[1];
		byte primary_photo_id = argv[2];
		byte photo_ids = ModernizedCProgram.flickcurl_array_split(argv[3], (byte)',');
		int rc;
		rc = ModernizedCProgram.flickcurl_photosets_editPhotos(fc, photoset_id, primary_photo_id, (byte)photo_ids);
		ModernizedCProgram.flickcurl_array_free(photo_ids);
		return rc;
	}
	public static int command_photosets_orderSets(Object fc, int argc, Object argv) {
		byte photoset_ids = ModernizedCProgram.flickcurl_array_split(argv[1], (byte)',');
		int rc;
		rc = ModernizedCProgram.flickcurl_photosets_orderSets(fc, (byte)photoset_ids);
		ModernizedCProgram.flickcurl_array_free(photoset_ids);
		return rc;
	}
	public static int command_photosets_removePhoto(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_photosets_removePhoto(fc, argv[1], argv[2]);
	}
	public static int command_photos_upload_checkTickets(Object fc, int argc, Object argv) {
		flickcurl_ticket tickets = ((Object)0);
		byte tickets_ids = ModernizedCProgram.flickcurl_array_split(argv[1], (byte)',');
		tickets = ModernizedCProgram.flickcurl_photos_upload_checkTickets(fc, (byte)tickets_ids);
		if (tickets) {
			int i;
			for (i = 0; tickets[i]; i++) {
				.fprintf((_iob[1]), "%s: %d) ticket ID %d  photoID %d  complete %d  invalid %d\n", ModernizedCProgram.program, i, tickets[i].getId(), tickets[i].getPhotoid(), tickets[i].getComplete(), tickets[i].getInvalid());
			}
			ModernizedCProgram.flickcurl_free_tickets(tickets);
		} 
		if (tickets_ids) {
			ModernizedCProgram.flickcurl_array_free(tickets_ids);
		} 
		return (tickets != ((Object)0));
	}
	public static void command_print_category(Object c) {
		.fprintf((_iob[1]), "category: id %s  name '%s'  path '%s'  count %d\n", c.getId(), c.getName(), c.getPath(), c.getCount());
		if (c.getCategories()) {
			int i;
			for (i = 0; c.getCategories()[i]; i++) {
				.fprintf((_iob[1]), "%s: Category %d\n", ModernizedCProgram.program, i);
				ModernizedCProgram.command_print_category(c.getCategories()[i]);
			}
		} 
		if (c.getGroups()) {
			int i;
			for (i = 0; c.getGroups()[i]; i++) {
				.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
				ModernizedCProgram.command_print_group(c.getGroups()[i]);
			}
		} 
	}
	public static int command_groups_browse(Object fc, int argc, Object argv) {
		int cat_id = -1;
		flickcurl_category category = ((Object)0);
		if (argv[1]) {
			cat_id = .atoi(argv[1]);
		} 
		category = ModernizedCProgram.flickcurl_groups_browse(fc, cat_id);
		if (category) {
			ModernizedCProgram.command_print_category(category);
			ModernizedCProgram.flickcurl_free_category(category);
		} 
		return (category == ((Object)0));
	}
	public static int command_groups_getInfo(Object fc, int argc, Object argv) {
		flickcurl_group group = ((Object)0);
		byte group_id = argv[1];
		byte lang = argv[2];
		group = ModernizedCProgram.flickcurl_groups_getInfo(fc, group_id, lang);
		if (group) {
			ModernizedCProgram.command_print_group(group);
			ModernizedCProgram.flickcurl_free_group(group);
		} 
		return (group == ((Object)0));
	}
	public static int command_groups_search(Object fc, int argc, Object argv) {
		byte text = argv[1];
		int per_page = -1;
		int page = -1;
		flickcurl_group groups = ((Object)0);
		int i;
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		groups = ModernizedCProgram.flickcurl_groups_search(fc, text, per_page, page);
		if (!groups) {
			return 1;
		} 
		for (i = 0; groups[i]; i++) {
			.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_group(groups[i]);
		}
		ModernizedCProgram.flickcurl_free_groups(groups);
		return 0;
	}
	public static int command_people_getPublicGroups(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		flickcurl_group groups = ((Object)0);
		int i;
		groups = ModernizedCProgram.flickcurl_people_getPublicGroups(fc, user_id);
		if (!groups) {
			return 1;
		} 
		for (i = 0; groups[i]; i++) {
			.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_group(groups[i]);
		}
		ModernizedCProgram.flickcurl_free_groups(groups);
		return 0;
	}
	public static int command_people_getUploadStatus(Object fc, int argc, Object argv) {
		flickcurl_user_upload_status u = new flickcurl_user_upload_status();
		u = ModernizedCProgram.flickcurl_people_getUploadStatus(fc);
		if (!u) {
			return 1;
		} 
		.fprintf((_iob[1]), "user upload status for %s:\n  bandwidth max %d/%d K  used %d/%d K  remaining %d/%d K\n  max filesize %d/%d K  sets created %d remaining %s\n", u.getUsername(), u.getBandwidth_maxbytes(), u.getBandwidth_maxkb(), u.getBandwidth_usedbytes(), u.getBandwidth_usedkb(), u.getBandwidth_remainingbytes(), u.getBandwidth_remainingkb(), u.getFilesize_maxbytes(), u.getFilesize_maxkb(), u.getSets_created(), (u.getSets_remaining() ? u.getSets_remaining() : ""));
		ModernizedCProgram.flickcurl_free_user_upload_status(u);
		return 0;
	}
	public static int command_photos_transform_rotate(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int degrees = .atoi(argv[2]);
		return ModernizedCProgram.flickcurl_photos_transform_rotate(fc, photo_id, degrees);
	}
	public static int command_interestingness_getList(Object fc, int argc, Object argv) {
		int usage = 0;
		byte date = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "date")) {
				date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "extras")) {
				list_params.setExtras(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, field);
					usage = 1;
			} 
		}
		if (usage) {
			photos_list = ((Object)0);
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_interestingness_getList_params(fc, date, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		if (rc) {
			photos_list = ((Object)0);
		} 
	}
	public static int command_places_resolvePlaceId(Object fc, int argc, Object argv) {
		flickcurl_place place = ((Object)0);
		byte place_id = argv[1];
		place = ModernizedCProgram.flickcurl_places_resolvePlaceId(fc, place_id);
		if (place) {
			ModernizedCProgram.command_print_place(place, ((Object)0), ((Object)0), 1);
			ModernizedCProgram.flickcurl_free_place(place);
		} 
		return (place == ((Object)0));
	}
	public static int command_places_resolvePlaceURL(Object fc, int argc, Object argv) {
		flickcurl_place place = ((Object)0);
		byte place_url = argv[1];
		place = ModernizedCProgram.flickcurl_places_resolvePlaceURL(fc, place_url);
		if (place) {
			ModernizedCProgram.command_print_place(place, ((Object)0), ((Object)0), 1);
			ModernizedCProgram.flickcurl_free_place(place);
		} 
		return (place == ((Object)0));
	}
	public static int command_favorites_add(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		return ModernizedCProgram.flickcurl_favorites_add(fc, photo_id);
	}
	public static int command_favorites_getList(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		byte min_fave_date = ((Object)0);
		byte max_fave_date = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				min_fave_date = argv[2];
			} 
			if (argc > 3) {
				if (.strcmp(argv[3], "-")) {
					max_fave_date = argv[3];
				} 
				if (argc > 4) {
					list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[4]));
					if (argc > 5) {
						list_params.setPage(ModernizedCProgram.parse_page_param(argv[5]));
						if (argc > 6) {
							list_params.setFormat(argv[6]);
						} 
					} 
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_favorites_getList2_params(fc, user_id, min_fave_date, max_fave_date, list_params);
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (!photos_list) {
			.fprintf((_iob[2]), "%s: Getting favorites failed\n", ModernizedCProgram.program);
		} else {
				int rc;
				if (ModernizedCProgram.verbose) {
					.fprintf((_iob[1]), "%s: User %s has %d favorite photos (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, photos_list.getPhotos_count(), generatedPer_page, generatedPage);
				} 
				rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Favorite photos");
				ModernizedCProgram.flickcurl_free_photos_list(photos_list);
				if (rc) {
					photos_list = ((Object)0);
				} 
		} 
		return (photos_list == ((Object)0));
	}
	public static int command_favorites_getPublicList(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_favorites_getPublicList_params(fc, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: User %s public favorite photos (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_favorites_remove(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		return ModernizedCProgram.flickcurl_favorites_remove(fc, photo_id);
	}
	public static int command_blogs_getList(Object fc, int argc, Object argv) {
		flickcurl_blog blogs = ((Object)0);
		blogs = ModernizedCProgram.flickcurl_blogs_getList(fc);
		if (blogs) {
			int i;
			for (i = 0; blogs[i]; i++) {
				.fprintf((_iob[1]), "Blog %d) id %s  name '%s'  needs password '%d'  url '%s'\n", i, blogs[i].getId(), blogs[i].getName(), blogs[i].getNeeds_password(), blogs[i].getUrl());
			}
			ModernizedCProgram.flickcurl_free_blogs(blogs);
		} 
		return (blogs == ((Object)0));
	}
	public static int command_blogs_postPhoto(Object fc, int argc, Object argv) {
		byte blog_id = argv[1];
		byte photo_id = argv[2];
		byte title = argv[3];
		byte description = argv[4];
		byte blog_password = argv[5];
		return ModernizedCProgram.flickcurl_blogs_postPhoto(fc, blog_id, photo_id, title, description, blog_password);
	}
	public static void command_print_activity(Object a) {
		int i;
		.fprintf((_iob[1]), "  type %s  id %s  owner %s name '%s'  primary %s\n  secret %s  server %d farm %d\n  comments %d old/new %d/%d  notes old/new %d/%d\n  views %d  photos %d  faves %d  more %d\n  title '%s'\n", a.getType(), a.getId(), a.getOwner(), a.getOwner_name(), (a.getPrimary() ? a.getPrimary() : ""), a.getSecret(), a.getServer(), a.getFarm(), a.getComments(), a.getComments_old(), a.getComments_new(), a.getNotes_old(), a.getNotes_new(), a.getViews(), a.getPhotos(), a.getFaves(), a.getMore(), a.getTitle());
		for (i = 0; a.getEvents()[i]; i++) {
			flickcurl_activity_event ae = a.getEvents()[i];
			.fprintf((_iob[1]), "    activity event %i) type %s  user %s  username %s\n      datetime %d\n      value '%s'\n", i, ae.getType(), ae.getUser(), ae.getUsername(), ae.getDate_added(), ae.getValue());
		}
	}
	public static int command_activity_userComments(Object fc, int argc, Object argv) {
		int per_page = 10;
		int page = 0;
		flickcurl_activity activities = ((Object)0);
		int i;
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[1]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[2]);
			} 
		} 
		activities = ModernizedCProgram.flickcurl_activity_userComments(fc, per_page, page);
		if (!activities) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Comments on the caller's photos (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		for (i = 0; activities[i]; i++) {
			.fprintf((_iob[1]), "%s: Activity %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_activity(activities[i]);
		}
		ModernizedCProgram.flickcurl_free_activities(activities);
		return 0;
	}
	public static int command_activity_userPhotos(Object fc, int argc, Object argv) {
		byte timeframe = argv[1];
		int per_page = 10;
		int page = 0;
		flickcurl_activity activities = ((Object)0);
		int i;
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		activities = ModernizedCProgram.flickcurl_activity_userPhotos(fc, timeframe, per_page, page);
		if (!activities) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Recent activity on the caller's photos (timeframe %s  per_page %d  page %d):\n", ModernizedCProgram.program, timeframe, per_page, page);
		} 
		for (i = 0; activities[i]; i++) {
			.fprintf((_iob[1]), "%s: Activity %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_activity(activities[i]);
		}
		ModernizedCProgram.flickcurl_free_activities(activities);
		return 0;
	}
	public static int command_places_find(Object fc, int argc, Object argv) {
		flickcurl_place places = ((Object)0);
		byte query = argv[1];
		places = ModernizedCProgram.flickcurl_places_find(fc, query);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				ModernizedCProgram.command_print_place(places[i], ((Object)0), ((Object)0), 1);
			}
			ModernizedCProgram.flickcurl_free_places(places);
		} 
		return (places == ((Object)0));
	}
	public static int command_places_findByLatLon(Object fc, int argc, Object argv) {
		flickcurl_place place = ((Object)0);
		double lat = .atof(argv[1]);
		double lon = .atof(argv[2]);
		int accuracy = .atoi(argv[3]);
		place = ModernizedCProgram.flickcurl_places_findByLatLon(fc, lat, lon, accuracy);
		if (place) {
			ModernizedCProgram.command_print_place(place, ((Object)0), ((Object)0), 1);
			ModernizedCProgram.flickcurl_free_place(place);
		} 
		return (place == ((Object)0));
	}
	public static int command_prefs_getContentType(Object fc, int argc, Object argv) {
		int content_type;
		content_type = ModernizedCProgram.flickcurl_prefs_getContentType(fc);
		if (content_type) {
			.fprintf((_iob[1]), "%s: Content type preference is %d\n", ModernizedCProgram.program, content_type);
		} 
		return (content_type < 0);
	}
	public static int command_prefs_getHidden(Object fc, int argc, Object argv) {
		int hidden;
		hidden = ModernizedCProgram.flickcurl_prefs_getHidden(fc);
		if (hidden >= 0) {
			.fprintf((_iob[1]), "%s: Hidden preference is %d\n", ModernizedCProgram.program, hidden);
		} 
		return (hidden < 0);
	}
	public static int command_prefs_getPrivacy(Object fc, int argc, Object argv) {
		int privacy;
		privacy = ModernizedCProgram.flickcurl_prefs_getPrivacy(fc);
		if (privacy >= 0) {
			.fprintf((_iob[1]), "%s: Privacy preference is %d\n", ModernizedCProgram.program, privacy);
		} 
		return (privacy < 0);
	}
	public static int command_prefs_getSafetyLevel(Object fc, int argc, Object argv) {
		int safety_level;
		safety_level = ModernizedCProgram.flickcurl_prefs_getSafetyLevel(fc);
		if (safety_level >= 0) {
			.fprintf((_iob[1]), "%s: Safety level preference is %d\n", ModernizedCProgram.program, safety_level);
		} 
		return (safety_level < 0);
	}
	public static int command_prefs_getGeoPerms(Object fc, int argc, Object argv) {
		int geo_perms;
		geo_perms = ModernizedCProgram.flickcurl_prefs_getGeoPerms(fc);
		if (geo_perms >= 0) {
			.fprintf((_iob[1]), "%s: Geographic information preference is %d\n", ModernizedCProgram.program, geo_perms);
		} 
		return (geo_perms < 0);
	}
	public static int command_tags_getClusters(Object fc, int argc, Object argv) {
		flickcurl_tag_clusters clusters = new flickcurl_tag_clusters();
		flickcurl_tag_cluster cluster = new flickcurl_tag_cluster();
		byte tag = argv[1];
		int clusteri;
		clusters = ModernizedCProgram.flickcurl_tags_getClusters(fc, tag);
		if (!clusters) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Tag %s returned %d clusters\n", ModernizedCProgram.program, tag, clusters.getCount());
		for (clusteri = 0; (cluster = clusters.getClusters()[clusteri]); clusteri++) {
			byte tag_name;
			int tagi;
			.fprintf((_iob[1]), "%s: Cluster #%d - %d tags\n", ModernizedCProgram.program, clusteri, cluster.getCount());
			for (tagi = 0; (tag_name = cluster.getTags()[tagi]); tagi++) {
				.fprintf((_iob[1]), "  %s\n", tag_name);
			}
		}
		ModernizedCProgram.flickcurl_free_tag_clusters(clusters);
		return 0;
	}
	public static int command_places_placesForUser(Object fc, int argc, Object argv) {
		flickcurl_place places = ((Object)0);
		int woe_id = -1;
		int threshold = -1;
		byte place_id = ((Object)0);
		flickcurl_place_type place_type = new flickcurl_place_type();
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
			if (argc > 3) {
				place_id = argv[3];
				if (argc > 4) {
					threshold = .atoi(argv[4]);
				} 
			} 
		} 
		places = ModernizedCProgram.flickcurl_places_placesForUser(fc, place_type, woe_id, place_id, threshold);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				ModernizedCProgram.command_print_place(places[i], ((Object)0), ((Object)0), 0);
			}
			ModernizedCProgram.flickcurl_free_places(places);
		} 
		return (places == ((Object)0));
	}
	public static int command_places_getInfo(Object fc, int argc, Object argv) {
		flickcurl_place place = ((Object)0);
		byte place_id = ((Object)0);
		int woe_id = -1;
		if (.strcmp(argv[1], "-")) {
			place_id = argv[1];
		} 
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
		} 
		if (!place_id && !woe_id) {
			return 1;
		} 
		place = ModernizedCProgram.flickcurl_places_getInfo2(fc, place_id, woe_id);
		if (place) {
			ModernizedCProgram.command_print_place(place, ((Object)0), ((Object)0), 1);
			ModernizedCProgram.flickcurl_free_place(place);
		} 
		return (place == ((Object)0));
	}
	public static int command_places_getInfoByUrl(Object fc, int argc, Object argv) {
		flickcurl_place place = ((Object)0);
		byte url = argv[1];
		place = ModernizedCProgram.flickcurl_places_getInfoByUrl(fc, url);
		if (place) {
			ModernizedCProgram.command_print_place(place, ((Object)0), ((Object)0), 1);
			ModernizedCProgram.flickcurl_free_place(place);
		} 
		return (place == ((Object)0));
	}
	public static int command_places_getChildrenWithPhotosPublic(Object fc, int argc, Object argv) {
		flickcurl_place places = ((Object)0);
		byte place_id = ((Object)0);
		int woe_id = -1;
		if (.strcmp(argv[1], "-")) {
			place_id = argv[1];
		} 
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
		} 
		if (!place_id && !woe_id) {
			return 1;
		} 
		places = ModernizedCProgram.flickcurl_places_getChildrenWithPhotosPublic2(fc, place_id, woe_id);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				ModernizedCProgram.command_print_place(places[i], ((Object)0), ((Object)0), 0);
			}
			ModernizedCProgram.flickcurl_free_places(places);
		} 
		return (places == ((Object)0));
	}
	public static int command_machinetags_getNamespaces(Object fc, int argc, Object argv) {
		byte predicate = ((Object)0);
		int per_page = 10;
		int page = 0;
		flickcurl_tag_namespace tag_namespaces = ((Object)0);
		if (argc > 1) {
			predicate = argv[1];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[3]);
				} 
			} 
		} 
		tag_namespaces = ModernizedCProgram.flickcurl_machinetags_getNamespaces(fc, predicate, per_page, page);
		if (tag_namespaces) {
			int i;
			for (i = 0; tag_namespaces[i]; i++) {
				flickcurl_tag_namespace tn = tag_namespaces[i];
				.fprintf((_iob[1]), "Namespace #%d: name %s usage %d predicates count %d\n", i, tn.getName(), tn.getUsage_count(), tn.getPredicates_count());
			}
			ModernizedCProgram.flickcurl_free_tag_namespaces(tag_namespaces);
		} 
		return (tag_namespaces != ((Object)0));
	}
	public static void command_print_predicate_values(Object tag_pvs, Object label) {
		int i;
		if (label) {
			.fprintf((_iob[1]), "%s: %s\n", ModernizedCProgram.program, label);
		} 
		for (i = 0; tag_pvs[i]; i++) {
			flickcurl_tag_predicate_value tpv = tag_pvs[i];
			.fprintf((_iob[1]), "  #%d) ", i);
			if (tpv.getPredicate()) {
				.fputs("predicate ", (_iob[1]));
				.fputs(tpv.getPredicate(), (_iob[1]));
				.fputc((byte)' ', (_iob[1]));
			} 
			if (tpv.getValue()) {
				.fputs("value ", (_iob[1]));
				.fputs(tpv.getValue(), (_iob[1]));
				.fputc((byte)' ', (_iob[1]));
			} 
			if (tpv.getUsage_count() > 0) {
				.fprintf((_iob[1]), "usage %d", tpv.getUsage_count());
			} 
			if (tpv.getUsed_in_namespace_count() > 0) {
				.fprintf((_iob[1]), "used in %d namespaces", tpv.getUsed_in_namespace_count());
			} 
			.fputc((byte)'\n', (_iob[1]));
		}
	}
	public static int command_machinetags_getPairs(Object fc, int argc, Object argv) {
		byte nspace = ((Object)0);
		byte predicate = ((Object)0);
		int per_page = 10;
		int page = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 1) {
			nspace = argv[1];
			if (argc > 2) {
				predicate = argv[2];
				if (argc > 3) {
					per_page = ModernizedCProgram.parse_page_param(argv[3]);
					if (argc > 4) {
						page = ModernizedCProgram.parse_page_param(argv[4]);
					} 
				} 
			} 
		} 
		tag_pvs = ModernizedCProgram.flickcurl_machinetags_getPairs(fc, nspace, predicate, per_page, page);
		if (tag_pvs) {
			ModernizedCProgram.command_print_predicate_values(tag_pvs, "getPairs returned");
			ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
		} 
		return (tag_pvs == ((Object)0));
	}
	public static int command_machinetags_getPredicates(Object fc, int argc, Object argv) {
		byte nspace = ((Object)0);
		int per_page = 10;
		int page = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 1) {
			nspace = argv[1];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[3]);
				} 
			} 
		} 
		tag_pvs = ModernizedCProgram.flickcurl_machinetags_getPredicates(fc, nspace, per_page, page);
		if (tag_pvs) {
			ModernizedCProgram.command_print_predicate_values(tag_pvs, "getPredicates returned");
			ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
		} 
		return (tag_pvs == ((Object)0));
	}
	public static int command_machinetags_getValues(Object fc, int argc, Object argv) {
		byte nspace = argv[1];
		byte predicate = argv[2];
		int per_page = 10;
		int page = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 3) {
			per_page = ModernizedCProgram.parse_page_param(argv[3]);
			if (argc > 4) {
				page = ModernizedCProgram.parse_page_param(argv[4]);
			} 
		} 
		tag_pvs = ModernizedCProgram.flickcurl_machinetags_getValues(fc, nspace, predicate, per_page, page);
		if (tag_pvs) {
			ModernizedCProgram.command_print_predicate_values(tag_pvs, "getValues returned");
			ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
		} 
		return (tag_pvs == ((Object)0));
	}
	public static int command_places_getPlaceTypes(Object fc, int argc, Object argv) {
		flickcurl_place_type_info place_types = new flickcurl_place_type_info();
		place_types = ModernizedCProgram.flickcurl_places_getPlaceTypes(fc);
		if (place_types) {
			int i;
			for (i = 0; place_types[i]; i++) {
				flickcurl_place_type_info pt = place_types[i];
				.fprintf((_iob[1]), "place type %d): id %d  type %d  name %s\n", i, pt.getId(), pt.getType(), pt.getName());
			}
			ModernizedCProgram.flickcurl_free_place_type_infos(place_types);
		} 
		return (place_types == ((Object)0));
	}
	public static int command_places_placesForBoundingBox(Object fc, int argc, Object argv) {
		flickcurl_place places = ((Object)0);
		double minimum_longitude;
		double minimum_latitude;
		double maximum_longitude;
		double maximum_latitude;
		flickcurl_place_type place_type = .FLICKCURL_PLACE_LOCATION;
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		minimum_longitude = .atof(argv[2]);
		minimum_latitude = .atof(argv[3]);
		maximum_longitude = .atof(argv[4]);
		maximum_latitude = .atof(argv[5]);
		places = ModernizedCProgram.flickcurl_places_placesForBoundingBox(fc, place_type, minimum_longitude, minimum_latitude, maximum_longitude, maximum_latitude);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				ModernizedCProgram.command_print_place(places[i], ((Object)0), ((Object)0), 0);
			}
			ModernizedCProgram.flickcurl_free_places(places);
		} 
		return (places == ((Object)0));
	}
	public static int command_places_placesForContacts(Object fc, int argc, Object argv) {
		int usage = 0;
		flickcurl_place places = ((Object)0);
		flickcurl_place_type place_type = .FLICKCURL_PLACE_LOCATION;
		int woe_id = -1;
		byte place_id = ((Object)0);
		int threshold = -1;
		byte contacts = ((Object)0);
		int min_upload_date = -1;
		int max_upload_date = -1;
		int min_taken_date = -1;
		int max_taken_date = -1;
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		if (.strcmp(argv[2], "-")) {
			woe_id = .atoi(argv[2]);
		} 
		if (.strcmp(argv[3], "-")) {
			place_id = argv[3];
		} 
		threshold = .atoi(argv[4]);
		argv += 5;
		argc -= 5;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "contacts")) {
				contacts = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-upload")) {
				min_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload")) {
				max_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken")) {
				min_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken")) {
				max_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			places = ((Object)0);
			;
		} 
		places = ModernizedCProgram.flickcurl_places_placesForContacts(fc, place_type, woe_id, place_id, threshold, contacts, min_upload_date, max_upload_date, min_taken_date, max_taken_date);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				ModernizedCProgram.command_print_place(places[i], ((Object)0), ((Object)0), 0);
			}
			ModernizedCProgram.flickcurl_free_places(places);
		} 
	}
	public static void command_print_contact(Object contact, int i) {
		.fprintf((_iob[1]), "contact %d: NSID %s username %s iconserver %d realname %s friend %d family %d ignored %d upload count %d\n", i, contact.getNsid(), contact.getUsername(), contact.getIconserver(), contact.getRealname(), contact.getIs_friend(), contact.getIs_family(), contact.getIgnored(), contact.getUploaded());
	}
	public static int command_contacts_getList(Object fc, int argc, Object argv) {
		flickcurl_contact contacts = ((Object)0);
		byte filter = ((Object)0);
		int page = -1;
		int per_page = -1;
		if (argc > 1) {
			filter = argv[1];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[3]);
				} 
			} 
		} 
		contacts = ModernizedCProgram.flickcurl_contacts_getList(fc, filter, page, per_page);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				ModernizedCProgram.command_print_contact(contacts[i], i);
			}
			ModernizedCProgram.flickcurl_free_contacts(contacts);
		} 
		return (contacts == ((Object)0));
	}
	public static int command_contacts_getListRecentlyUploaded(Object fc, int argc, Object argv) {
		flickcurl_contact contacts = ((Object)0);
		int date_lastupload = 1;
		byte filter = ((Object)0);
		if (argc > 1) {
			date_lastupload = .atoi(argv[1]);
			if (argc > 2) {
				filter = argv[2];
			} 
		} 
		contacts = ModernizedCProgram.flickcurl_contacts_getListRecentlyUploaded(fc, date_lastupload, filter);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				ModernizedCProgram.command_print_contact(contacts[i], i);
			}
			ModernizedCProgram.flickcurl_free_contacts(contacts);
		} 
		return (contacts == ((Object)0));
	}
	public static int command_contacts_getPublicList(Object fc, int argc, Object argv) {
		flickcurl_contact contacts = ((Object)0);
		byte user_id = ((Object)0);
		int page = -1;
		int per_page = -1;
		user_id = argv[1];
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		contacts = ModernizedCProgram.flickcurl_contacts_getPublicList(fc, user_id, page, per_page);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				ModernizedCProgram.command_print_contact(contacts[i], i);
			}
			ModernizedCProgram.flickcurl_free_contacts(contacts);
		} 
		return (contacts == ((Object)0));
	}
	public static int command_places_getShapeHistory(Object fc, int argc, Object argv) {
		flickcurl_shapedata shapes = ((Object)0);
		int woe_id = -1;
		byte place_id = ((Object)0);
		if (.strcmp(argv[1], "-")) {
			place_id = argv[1];
		} 
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
		} 
		if (woe_id < 0 && !place_id) {
			return 1;
		} 
		shapes = ModernizedCProgram.flickcurl_places_getShapeHistory(fc, place_id, woe_id);
		if (shapes) {
			int i;
			for (i = 0; shapes[i]; i++) {
				.fprintf((_iob[1]), "Shape %d: ", i);
				ModernizedCProgram.command_print_shape(shapes[i]);
				.fputc((byte)'\n', (_iob[1]));
			}
			ModernizedCProgram.flickcurl_free_shapes(shapes);
		} 
		return (shapes == ((Object)0));
	}
	public static int command_places_tagsForPlace(Object fc, int argc, Object argv) {
		int usage = 0;
		flickcurl_tag tags = ((Object)0);
		int woe_id = -1;
		byte place_id = ((Object)0);
		int min_upload_date = -1;
		int max_upload_date = -1;
		int min_taken_date = -1;
		int max_taken_date = -1;
		argv++;
		argc--;
		if (.strcmp(argv[0], "-")) {
			place_id = argv[0];
		} 
		argv++;
		argc--;
		if (argc) {
			if (.strcmp(argv[0], "-")) {
				woe_id = .atoi(argv[0]);
			} 
		} 
		while (!usage && argc > 0) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "min-upload")) {
				min_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload")) {
				max_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken")) {
				min_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken")) {
				max_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			tags = ((Object)0);
			;
		} 
		tags = ModernizedCProgram.flickcurl_places_tagsForPlace(fc, woe_id, place_id, min_upload_date, max_upload_date, min_taken_date, max_taken_date);
		if (tags) {
			.fprintf((_iob[1]), "%s: Tags for WOE ID %d / place ID %s\n", ModernizedCProgram.program, woe_id, place_id);
			ModernizedCProgram.command_print_tags(tags, ((Object)0), ((Object)0));
			.free(tags);
		} 
	}
	public static void command_print_institution(Object institution, int ix) {
		int i;
		.fprintf((_iob[1]), "Institution %d:\n  NSID: %s\n  Date launch: %d\n  Name: %s\n", ix, institution.getNsid(), institution.getDate_launch(), institution.getName());
		for (i = 0; i <= .FLICKCURL_INSTITUTION_URL_LAST; i++) {
			if (institution.getUrls()[i]) {
				.fprintf((_iob[1]), "  URL %s: %s\n", ModernizedCProgram.flickcurl_get_institution_url_type_label((flickcurl_institution_url_type)i), institution.getUrls()[i]);
			} 
		}
	}
	public static int command_commons_getInstitutions(Object fc, int argc, Object argv) {
		flickcurl_institution institutions = ((Object)0);
		institutions = ModernizedCProgram.flickcurl_commons_getInstitutions(fc);
		if (institutions) {
			int i;
			for (i = 0; institutions[i]; i++) {
				ModernizedCProgram.command_print_institution(institutions[i], i);
			}
			ModernizedCProgram.flickcurl_free_institutions(institutions);
		} 
		return (institutions == ((Object)0));
	}
	public static void command_print_member(Object member, int i) {
		.fprintf((_iob[1]), "member %d: NSID %s username %s iconserver %d iconfarm %d member type %d\n", i, member.getNsid(), member.getUsername(), member.getIconserver(), member.getIconfarm(), member.getMember_type());
	}
	public static int command_groups_members_getList(Object fc, int argc, Object argv) {
		byte group_id = argv[1];
		byte membertypes = ((Object)0);
		int per_page = -1;
		int page = -1;
		flickcurl_member members = new flickcurl_member();
		if (argc > 1) {
			membertypes = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		members = ModernizedCProgram.flickcurl_groups_members_getList(fc, group_id, membertypes, per_page, page);
		if (members) {
			int i;
			for (i = 0; members[i]; i++) {
				ModernizedCProgram.command_print_member(members[i], i);
			}
			ModernizedCProgram.flickcurl_free_members(members);
		} 
		return (members == ((Object)0));
	}
	public static int command_panda_getList(Object fc, int argc, Object argv) {
		int i;
		byte pandas;
		pandas = ModernizedCProgram.flickcurl_panda_getList(fc);
		if (!pandas) {
			return 1;
		} 
		for (i = 0; pandas[i]; i++) {
			.fprintf((_iob[1]), "%s: panda %d: %s\n", ModernizedCProgram.program, i, pandas[i]);
		}
		.free(pandas);
		return 0;
	}
	public static int command_panda_getPhotos(Object fc, int argc, Object argv) {
		byte panda = argv[1];
		flickcurl_photo photos = ((Object)0);
		int i;
		photos = ModernizedCProgram.flickcurl_panda_getPhotos(fc, panda);
		if (!photos) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Panda %s returned photos!\n", ModernizedCProgram.program, panda);
		for (i = 0; photos[i]; i++) {
			.fprintf((_iob[1]), "%s: %s photo %d\n", ModernizedCProgram.program, panda, i);
			ModernizedCProgram.command_print_photo(photos[i]);
		}
		ModernizedCProgram.flickcurl_free_photos(photos);
		return 0;
	}
	public static void command_print_collection(Object collection) {
		.fprintf((_iob[1]), "Collection id %s  secret %s  server %d\n  Title %s\n  Description %s\n  Large icon %s\n  Small Icon %s\n", collection.getId(), collection.getSecret(), collection.getServer(), collection.getTitle(), (collection.getDescription() ? collection.getDescription() : "(None)"), collection.getIconlarge(), collection.getIconsmall());
		if (collection.getPhotos()) {
			int i;
			for (i = 0; collection.getPhotos()[i]; i++) {
				.fprintf((_iob[1]), "  icon photo %d) ", i);
				ModernizedCProgram.command_print_photo(collection.getPhotos()[i]);
			}
		} 
		if (collection.getCollections()) {
			int i;
			for (i = 0; collection.getCollections()[i]; i++) {
				.fprintf((_iob[1]), "  Sub-Collection %d)", i);
				ModernizedCProgram.command_print_collection(collection.getCollections()[i]);
			}
		} 
	}
	public static int command_collections_getInfo(Object fc, int argc, Object argv) {
		byte collection_id = argv[1];
		flickcurl_collection collection = ((Object)0);
		collection = ModernizedCProgram.flickcurl_collections_getInfo(fc, collection_id);
		if (collection) {
			ModernizedCProgram.command_print_collection(collection);
			ModernizedCProgram.flickcurl_free_collection(collection);
		} 
		return (collection == ((Object)0));
	}
	public static int command_collections_getTree(Object fc, int argc, Object argv) {
		byte collection_id = ((Object)0);
		byte user_id = ((Object)0);
		flickcurl_collection collection = ((Object)0);
		if (argc > 1) {
			if (.strcmp(argv[1], "-")) {
				collection_id = argv[1];
			} 
			if (argc > 2) {
				if (.strcmp(argv[2], "-")) {
					user_id = argv[2];
				} 
			} 
		} 
		collection = ModernizedCProgram.flickcurl_collections_getTree(fc, collection_id, user_id);
		if (collection) {
			ModernizedCProgram.command_print_collection(collection);
			ModernizedCProgram.flickcurl_free_collection(collection);
		} 
		return (collection == ((Object)0));
	}
	public static int command_machinetags_getRecentValues(Object fc, int argc, Object argv) {
		byte nspace = ((Object)0);
		byte predicate = ((Object)0);
		int added_since = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 1) {
			if (.strcmp("-", argv[1])) {
				nspace = argv[1];
			} 
			if (argc > 2) {
				if (.strcmp("-", argv[2])) {
					nspace = argv[2];
				} 
				if (argc > 3) {
					added_since = .atoi(argv[3]);
				} 
			} 
		} 
		tag_pvs = ModernizedCProgram.flickcurl_machinetags_getRecentValues(fc, nspace, predicate, added_since);
		if (tag_pvs) {
			ModernizedCProgram.command_print_predicate_values(tag_pvs, "getRecentValues returned");
			ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
		} 
		return (tag_pvs == ((Object)0));
	}
	public static int command_comments_getRecentForContacts(Object fc, int argc, Object argv) {
		int usage = 0;
		int date_lastcomment = -1;
		byte filter = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = ((Object)0);
		int rc = 0;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "since")) {
				date_lastcomment = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "filter")) {
				filter = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_comments_getRecentForContacts_params(fc, date_lastcomment, filter, list_params);
		if (!photos_list) {
			.fprintf((_iob[2]), "%s: Getting recent comments for contacts failed\n", ModernizedCProgram.program);
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Recent content photos");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
	}
	public static int command_short_uri(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte uri;
		uri = ModernizedCProgram.flickcurl_photo_id_as_short_uri(photo_id);
		if (uri) {
			.fprintf((_iob[1]), "%s: Short URI for photo ID %s is %s\n", ModernizedCProgram.program, photo_id, uri);
			.free(uri);
		} else {
				.fprintf((_iob[2]), "%s: Failed to get short URI for photo ID %s\n", ModernizedCProgram.program, photo_id);
				return 1;
		} 
		return 0;
	}
	public static int command_blogs_getServices(Object fc, int argc, Object argv) {
		flickcurl_blog_service blog_services = new flickcurl_blog_service();
		blog_services = ModernizedCProgram.flickcurl_blogs_getServices(fc);
		if (blog_services) {
			int i;
			for (i = 0; blog_services[i]; i++) {
				flickcurl_blog_service blog_service = blog_services[i];
				.fprintf((_iob[1]), "%d) blog service: id %s  name '%s'\n", i, blog_service.getId(), blog_service.getName());
			}
			ModernizedCProgram.flickcurl_free_blog_services(blog_services);
		} 
		return 0;
	}
	public static int command_places_getTopPlacesList(Object fc, int argc, Object argv) {
		flickcurl_place places = ((Object)0);
		flickcurl_place_type place_type = new flickcurl_place_type();
		byte date;
		int woe_id = -1;
		byte place_id = ((Object)0);
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		date = argv[2];
		if (argc > 3) {
			if (.strcmp(argv[3], "-")) {
				woe_id = .atoi(argv[3]);
			} 
			if (argc > 4) {
				place_id = argv[4];
			} 
		} 
		places = ModernizedCProgram.flickcurl_places_getTopPlacesList(fc, place_type, date, woe_id, place_id);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				ModernizedCProgram.command_print_place(places[i], ((Object)0), ((Object)0), 1);
			}
			ModernizedCProgram.flickcurl_free_places(places);
		} 
		return (places == ((Object)0));
	}
	public static int command_source_uri_to_photoid(Object fc, int argc, Object argv) {
		byte uri = argv[1];
		byte photo_id;
		photo_id = ModernizedCProgram.flickcurl_source_uri_as_photo_id(uri);
		if (!photo_id) {
			.fprintf((_iob[2]), "%s: Failed to get photo ID for source URI %s\n", ModernizedCProgram.program, uri);
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID for source URI %s is %s\n", ModernizedCProgram.program, uri, photo_id);
		.free(photo_id);
		return 0;
	}
	public static int command_people_getPhotosOf(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 1) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 2) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 3) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_people_getPhotosOf_params(fc, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos of user %s (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_photos_people_add(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		int person_x = .atoi(argv[3]);
		int person_y = .atoi(argv[4]);
		int person_w = .atoi(argv[5]);
		int person_h = .atoi(argv[6]);
		return ModernizedCProgram.flickcurl_photos_people_add(fc, photo_id, user_id, person_x, person_y, person_w, person_h);
	}
	public static int command_photos_people_delete(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		return ModernizedCProgram.flickcurl_photos_people_delete(fc, photo_id, user_id);
	}
	public static int command_photos_people_deleteCoords(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		return ModernizedCProgram.flickcurl_photos_people_deleteCoords(fc, photo_id, user_id);
	}
	public static int command_photos_people_editCoords(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		int person_x = .atoi(argv[3]);
		int person_y = .atoi(argv[4]);
		int person_w = .atoi(argv[5]);
		int person_h = .atoi(argv[6]);
		return ModernizedCProgram.flickcurl_photos_people_editCoords(fc, photo_id, user_id, person_x, person_y, person_w, person_h);
	}
	public static int command_photos_people_getList(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int i;
		flickcurl_person persons = new flickcurl_person();
		persons = ModernizedCProgram.flickcurl_photos_people_getList(fc, photo_id);
		if (!persons) {
			return 1;
		} 
		for (i = 0; persons[i]; i++) {
			ModernizedCProgram.command_print_person(persons[i]);
		}
		ModernizedCProgram.flickcurl_free_persons(persons);
		return 0;
	}
	public static int command_galleries_addPhoto(Object fc, int argc, Object argv) {
		byte gallery_id = argv[1];
		byte photo_id = argv[2];
		byte comment_text = argv[3];
		return ModernizedCProgram.flickcurl_galleries_addPhoto(fc, gallery_id, photo_id, comment_text);
	}
	public static void command_print_gallery(Object g) {
		.fprintf((_iob[1]), "id %s  url %s  owner %s\n  date create %d  date update %d\n  count of photos %d  count of videos %d\n  title '%s'\n  description '%s'\n", g.getId(), g.getUrl(), g.getOwner(), g.getDate_create(), g.getDate_update(), g.getCount_photos(), g.getCount_videos(), g.getTitle(), g.getDescription());
		.fputs("  primary ", (_iob[1]));
		ModernizedCProgram.command_print_photo(g.getPrimary_photo());
	}
	public static int command_galleries_getList(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		int per_page = 10;
		int page = 0;
		flickcurl_gallery galleries = new flickcurl_gallery();
		int i;
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		galleries = ModernizedCProgram.flickcurl_galleries_getList(fc, user_id, per_page, page);
		if (!galleries) {
			return 1;
		} 
		for (i = 0; galleries[i]; i++) {
			.fprintf((_iob[1]), "%s: Gallery %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_gallery(galleries[i]);
		}
		ModernizedCProgram.flickcurl_free_galleries(galleries);
		return 0;
	}
	public static int command_galleries_getListForPhoto(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		int per_page = 10;
		int page = 0;
		flickcurl_gallery galleries = new flickcurl_gallery();
		int i;
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		galleries = ModernizedCProgram.flickcurl_galleries_getListForPhoto(fc, photo_id, per_page, page);
		if (!galleries) {
			return 1;
		} 
		for (i = 0; galleries[i]; i++) {
			.fprintf((_iob[1]), "%s: Gallery %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_gallery(galleries[i]);
		}
		ModernizedCProgram.flickcurl_free_galleries(galleries);
		return 0;
	}
	public static void command_print_stat(Object s) {
		.fprintf((_iob[1]), "  Views %d  Comments %d  Favorites %d", s.getViews(), s.getComments(), s.getFavorites());
		if (s.getName()) {
			.fprintf((_iob[1]), "  Name %s", s.getName());
		} 
		if (s.getUrl()) {
			.fprintf((_iob[1]), "  Url %s", s.getUrl());
		} 
		if (s.getSearchterms()) {
			.fprintf((_iob[1]), "  Search terms %s", s.getSearchterms());
		} 
		.fputc((byte)'\n', (_iob[1]));
	}
	public static void command_print_stats(Object stats) {
		int i;
		for (i = 0; stats[i]; i++) {
			.fprintf((_iob[1]), "%s: Statistic %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_stat(stats[i]);
		}
	}
	public static int command_stats_getCollectionDomains(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte collection_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			collection_id = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getCollectionDomains(fc, date, collection_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Collection domain stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getCollectionReferrers(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte domain = argv[2];
		byte collection_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			collection_id = argv[3];
			if (argc > 3) {
				per_page = ModernizedCProgram.parse_page_param(argv[4]);
				if (argc > 4) {
					page = ModernizedCProgram.parse_page_param(argv[5]);
				} 
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getCollectionReferrers(fc, date, domain, collection_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Collection referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getCollectionStats(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte collection_id = argv[2];
		int views;
		views = ModernizedCProgram.flickcurl_stats_getCollectionStats(fc, date, collection_id);
		if (views < 0) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Collection view stats: %d\n", ModernizedCProgram.program, views);
		return 0;
	}
	public static int command_stats_getPhotoDomains(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte photo_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			photo_id = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getPhotoDomains(fc, date, photo_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photo domains stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getPhotoReferrers(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte domain = argv[2];
		byte photo_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			photo_id = argv[3];
			if (argc > 3) {
				per_page = ModernizedCProgram.parse_page_param(argv[4]);
				if (argc > 4) {
					page = ModernizedCProgram.parse_page_param(argv[5]);
				} 
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getPhotoReferrers(fc, date, domain, photo_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photo referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getPhotoStats(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte photo_id = argv[2];
		flickcurl_stat stat1 = new flickcurl_stat();
		stat1 = ModernizedCProgram.flickcurl_stats_getPhotoStats(fc, date, photo_id);
		if (!stat1) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo %s on date %s statistics:\n", ModernizedCProgram.program, photo_id, date);
		ModernizedCProgram.command_print_stat(stat1);
		ModernizedCProgram.flickcurl_free_stat(stat1);
		return 0;
	}
	public static int command_stats_getPhotosetDomains(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte photoset_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			photoset_id = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getPhotosetDomains(fc, date, photoset_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photoset domains stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getPhotosetReferrers(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte domain = argv[2];
		byte photoset_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			photoset_id = argv[3];
			if (argc > 3) {
				per_page = ModernizedCProgram.parse_page_param(argv[4]);
				if (argc > 4) {
					page = ModernizedCProgram.parse_page_param(argv[5]);
				} 
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getPhotosetReferrers(fc, date, domain, photoset_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photoset referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getPhotosetStats(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte photoset_id = argv[2];
		int views;
		views = ModernizedCProgram.flickcurl_stats_getPhotosetStats(fc, date, photoset_id);
		if (views < 0) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photoset view stats: %d\n", ModernizedCProgram.program, views);
		return 0;
	}
	public static int command_stats_getPhotostreamDomains(Object fc, int argc, Object argv) {
		byte date = argv[1];
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getPhotostreamDomains(fc, date, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photostream domains stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getPhotostreamReferrers(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte domain = argv[2];
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[3]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[4]);
			} 
		} 
		stats = ModernizedCProgram.flickcurl_stats_getPhotostreamReferrers(fc, date, domain, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photostream referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		ModernizedCProgram.command_print_stats(stats);
		ModernizedCProgram.flickcurl_free_stats(stats);
		return 0;
	}
	public static int command_stats_getPhotostreamStats(Object fc, int argc, Object argv) {
		byte date = argv[1];
		int views;
		views = ModernizedCProgram.flickcurl_stats_getPhotostreamStats(fc, date);
		if (views < 0) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photostream view stats: %d\n", ModernizedCProgram.program, views);
		return 0;
	}
	public static int command_stats_getPopularPhotos(Object fc, int argc, Object argv) {
		byte date = argv[1];
		byte sort = ((Object)0);
		int per_page = -1;
		int page = 0;
		byte extras = ((Object)0);
		flickcurl_photo photos = new flickcurl_photo();
		int i;
		if (argc > 1) {
			sort = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
					if (argc > 4) {
						extras = argv[5];
					} 
				} 
			} 
		} 
		photos = ModernizedCProgram.flickcurl_stats_getPopularPhotos(fc, date, sort, per_page, page, extras);
		if (!photos) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Popular photos:\n", ModernizedCProgram.program);
		for (i = 0; photos[i]; i++) {
			.fprintf((_iob[1]), "%s: popular photo %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_photo(photos[i]);
		}
		ModernizedCProgram.flickcurl_free_photos(photos);
		return 0;
	}
	public static int command_stats_getTotalViews(Object fc, int argc, Object argv) {
		byte date = ((Object)0);
		flickcurl_view_stats view_stats = new flickcurl_view_stats();
		if (argc > 0) {
			date = argv[1];
		} 
		view_stats = ModernizedCProgram.flickcurl_stats_getTotalViews(fc, date);
		if (!view_stats) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Total view stats\n", ModernizedCProgram.program);
		.fprintf((_iob[1]), "  Total: %d\n  Photos: %d\n  Photostreams: %d\n  Sets: %d\n  Collections: %d\n", view_stats.getTotal(), view_stats.getPhotos(), view_stats.getPhotostreams(), view_stats.getSets(), view_stats.getCollections());
		ModernizedCProgram.flickcurl_free_view_stats(view_stats);
		return 0;
	}
	public static int command_people_getPhotos(Object fc, int argc, Object argv) {
		int usage = 0;
		byte user_id;
		int safe_search = -1;
		byte min_upload_date = ((Object)0);
		byte max_upload_date = ((Object)0);
		byte min_taken_date = ((Object)0);
		byte max_taken_date = ((Object)0);
		int content_type = -1;
		int privacy_filter = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc = 0;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		argv++;
		argc--;
		user_id = argv[0];
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "safe-search")) {
				safe_search = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-upload-date")) {
				min_upload_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload-date")) {
				max_upload_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken-date")) {
				min_taken_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken-date")) {
				max_taken_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "content-type")) {
				content_type = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "privacy-filter")) {
				privacy_filter = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_people_getPhotos_params(fc, user_id, safe_search, min_upload_date, max_upload_date, min_taken_date, max_taken_date, content_type, privacy_filter, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos of user %s (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
	}
	public static int command_galleries_create(Object fc, int argc, Object argv) {
		byte title = argv[1];
		byte description = ((Object)0);
		byte primary_photo_id = ((Object)0);
		byte url = ((Object)0);
		byte id;
		if (argc > 1) {
			description = argv[2];
			if (argc > 2) {
				primary_photo_id = argv[3];
			} 
		} 
		id = ModernizedCProgram.flickcurl_galleries_create(fc, title, description, primary_photo_id, url);
		if (!id) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Gallery %s created with URL %s\n", ModernizedCProgram.program, id, url);
		.free(url);
		.free(id);
		return 0;
	}
	public static int command_galleries_editMeta(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_galleries_editMeta(fc, argv[1], argv[2], argv[3]);
	}
	public static int command_galleries_editPhoto(Object fc, int argc, Object argv) {
		byte gallery_id = argv[1];
		byte primary_photo_id = argv[2];
		byte new_comment = argv[3];
		return ModernizedCProgram.flickcurl_galleries_editPhoto(fc, gallery_id, primary_photo_id, new_comment);
	}
	public static int command_galleries_editPhotos(Object fc, int argc, Object argv) {
		byte photoset_id = argv[1];
		byte primary_photo_id = argv[2];
		byte photo_ids = ModernizedCProgram.flickcurl_array_split(argv[3], (byte)',');
		int rc;
		rc = ModernizedCProgram.flickcurl_galleries_editPhotos(fc, photoset_id, primary_photo_id, (byte)photo_ids);
		ModernizedCProgram.flickcurl_array_free(photo_ids);
		return rc;
	}
	public static int command_galleries_getInfo(Object fc, int argc, Object argv) {
		flickcurl_gallery gallery = ((Object)0);
		byte gallery_id = argv[1];
		gallery = ModernizedCProgram.flickcurl_galleries_getInfo(fc, gallery_id);
		if (gallery) {
			ModernizedCProgram.command_print_gallery(gallery);
			ModernizedCProgram.flickcurl_free_gallery(gallery);
		} 
		return (gallery == ((Object)0));
	}
	public static int command_galleries_getPhotos(Object fc, int argc, Object argv) {
		byte gallery_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		ModernizedCProgram.flickcurl_photos_list_params_init(list_params);
		if (argc > 2) {
			list_params.setExtras(argv[2]);
			if (argc > 3) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setPage(ModernizedCProgram.parse_page_param(argv[4]));
					if (argc > 5) {
						list_params.setFormat(argv[5]);
					} 
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_galleries_getPhotos_params(fc, gallery_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Gallery %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, gallery_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		ModernizedCProgram.flickcurl_free_photos_list(photos_list);
		return rc;
	}
	public static int command_photosets_removePhotos(Object fc, int argc, Object argv) {
		byte photoset_ids = ModernizedCProgram.flickcurl_array_split(argv[2], (byte)',');
		int rc;
		rc = ModernizedCProgram.flickcurl_photosets_removePhotos(fc, argv[1], (byte)photoset_ids);
		ModernizedCProgram.flickcurl_array_free(photoset_ids);
		return rc;
	}
	public static int command_photosets_reorderPhotos(Object fc, int argc, Object argv) {
		byte photoset_ids = ModernizedCProgram.flickcurl_array_split(argv[2], (byte)',');
		int rc;
		rc = ModernizedCProgram.flickcurl_photosets_reorderPhotos(fc, argv[1], (byte)photoset_ids);
		ModernizedCProgram.flickcurl_array_free(photoset_ids);
		return rc;
	}
	public static int command_photosets_setPrimaryPhoto(Object fc, int argc, Object argv) {
		return ModernizedCProgram.flickcurl_photosets_setPrimaryPhoto(fc, argv[1], argv[2]);
	}
	public static int command_favorites_getContext(Object fc, int argc, Object argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		int num_prev = -1;
		int num_next = -1;
		byte extras = ((Object)0);
		flickcurl_photos_list photos_lists = ((Object)0);
		if (argc > 3) {
			if (.strcmp(argv[3], "-")) {
				num_prev = .atoi(argv[3]);
			} 
			if (argc > 4) {
				if (.strcmp(argv[4], "-")) {
					num_next = .atoi(argv[4]);
				} 
				if (argc > 5) {
					extras = argv[5];
				} 
			} 
		} 
		photos_lists = ModernizedCProgram.flickcurl_favorites_getContext(fc, photo_id, user_id, num_prev, num_next, extras);
		if (!photos_lists) {
			.fprintf((_iob[2]), "%s: Getting user %s favorite photo %s context failed\n", ModernizedCProgram.program, user_id, photo_id);
		} else {
				int rc;
				if (ModernizedCProgram.verbose) {
					.fprintf((_iob[1]), "%s: Context around user %s favorite photo %s:\n", ModernizedCProgram.program, user_id, photo_id);
				} 
				rc = ModernizedCProgram.command_print_photos_list(fc, photos_lists[0], ModernizedCProgram.output_fh, "Previous photos");
				if (!rc) {
					rc = ModernizedCProgram.command_print_photos_list(fc, photos_lists[1], ModernizedCProgram.output_fh, "Next photos");
				} 
				ModernizedCProgram.flickcurl_free_photos_list(photos_lists[0]);
				ModernizedCProgram.flickcurl_free_photos_list(photos_lists[1]);
				.free(photos_lists);
				if (rc) {
					photos_lists = ((Object)0);
				} 
		} 
		return (photos_lists == ((Object)0));
	}
	public static int command_oauth_create(Object fc, int argc, Object argv) {
		byte callback = ((Object)0);
		byte uri;
		int rc;
		if (argc > 1) {
			callback = argv[1];
		} 
		rc = ModernizedCProgram.flickcurl_oauth_create_request_token(fc, callback);
		if (rc) {
			.fprintf((_iob[2]), "%s: Failed to create OAuth Request token/secret\n", ModernizedCProgram.program);
			return 1;
		} 
		.fprintf((_iob[2]), "%s: OAuth request token details:\n  Request Token: '%s'\n  Request Token Secret: '%s'\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_get_oauth_request_token(fc), ModernizedCProgram.flickcurl_get_oauth_request_token_secret(fc));
		uri = ModernizedCProgram.flickcurl_oauth_get_authorize_uri(fc);
		if (uri) {
			.fprintf((_iob[2]), "%s: OAuth Authentication URL: %s\n", ModernizedCProgram.program, uri);
			.fprintf((_iob[2]), "%s: Visit this, approve the request, get the <Verifier> and run:\n", ModernizedCProgram.program);
			.fprintf((_iob[2]), "  $ %s oauth.verify '%s' '%s' '<Verifier>'\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_get_oauth_request_token(fc), ModernizedCProgram.flickcurl_get_oauth_request_token_secret(fc));
			.free(uri);
		} 
		return 0;
	}
	public static int command_oauth_verify(Object fc, int argc, Object argv) {
		int rc;
		byte request_token = argv[1];
		byte request_token_secret = argv[2];
		byte verifier = argv[3];
		ModernizedCProgram.flickcurl_set_oauth_request_token(fc, request_token);
		ModernizedCProgram.flickcurl_set_oauth_request_token_secret(fc, request_token_secret);
		rc = ModernizedCProgram.flickcurl_oauth_create_access_token(fc, verifier);
		if (rc) {
			.fprintf((_iob[2]), "%s: Failed to verify OAuth Request\n", ModernizedCProgram.program);
			return 1;
		} 
		.fprintf((_iob[2]), "%s: Returned OAuth token '%s' and token secret '%s'\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_get_oauth_token(fc), ModernizedCProgram.flickcurl_get_oauth_token_secret(fc));
		rc = ModernizedCProgram.flickcurl_config_write_ini(fc, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section);
		if (!rc) {
			.fprintf((_iob[1]), "%s: Updated configuration file %s with OAuth tokens\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path);
		} 
		return 0;
	}
	public static int command_oauth_upgrade(Object fc, int argc, Object argv) {
		int rc;
		rc = ModernizedCProgram.flickcurl_auth_oauth_getAccessToken(fc);
		if (rc) {
			.fprintf((_iob[2]), "%s: Failed to upgrade to OAuth\n", ModernizedCProgram.program);
			return 1;
		} 
		.fprintf((_iob[2]), "%s: Upgraded to OAuth token '%s' and token secret '%s'\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_get_oauth_token(fc), ModernizedCProgram.flickcurl_get_oauth_token_secret(fc));
		rc = ModernizedCProgram.flickcurl_config_write_ini(fc, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section);
		if (!rc) {
			.fprintf((_iob[1]), "%s: Updated configuration file %s with OAuth tokens\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path);
		} 
		return 0;
	}
	public static int command_groups_join(Object fc, int argc, Object argv) {
		byte group_id = argv[1];
		byte accept_rules = ((Object)0);
		if (argv[2]) {
			accept_rules = argv[2];
		} 
		return ModernizedCProgram.flickcurl_groups_join(fc, group_id, accept_rules);
	}
	public static int command_groups_joinRequest(Object fc, int argc, Object argv) {
		byte group_id = argv[1];
		byte message = argv[2];
		byte accept_rules = argv[3];
		return ModernizedCProgram.flickcurl_groups_joinRequest(fc, group_id, message, accept_rules);
	}
	public static int command_groups_leave(Object fc, int argc, Object argv) {
		byte group_id = argv[1];
		byte delete_photos = ((Object)0);
		if (argv[2]) {
			delete_photos = argv[2];
		} 
		return ModernizedCProgram.flickcurl_groups_leave(fc, group_id, delete_photos);
	}
	public static int command_contacts_getTaggingSuggestions(Object fc, int argc, Object argv) {
		flickcurl_contact contacts = ((Object)0);
		byte include_self = ((Object)0);
		byte include_address_book = ((Object)0);
		int page = -1;
		int per_page = -1;
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[1]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					include_self = argv[3];
					if (argc > 4) {
						include_address_book = argv[4];
					} 
				} 
			} 
		} 
		contacts = ModernizedCProgram.flickcurl_contacts_getTaggingSuggestions(fc, include_self, include_address_book, page, per_page);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				ModernizedCProgram.command_print_contact(contacts[i], i);
			}
			ModernizedCProgram.flickcurl_free_contacts(contacts);
		} 
		return (contacts == ((Object)0));
	}
	public static int command_people_getGroups(Object fc, int argc, Object argv) {
		byte user_id = argv[1];
		flickcurl_group groups = ((Object)0);
		byte extras = ((Object)0);
		int i;
		groups = ModernizedCProgram.flickcurl_people_getGroups(fc, user_id, extras);
		if (!groups) {
			return 1;
		} 
		for (i = 0; groups[i]; i++) {
			.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
			ModernizedCProgram.command_print_group(groups[i]);
		}
		ModernizedCProgram.flickcurl_free_groups(groups);
		return 0;
	}
	public static int command_tags_getMostFrequentlyUsed(Object fc, int argc, Object argv) {
		flickcurl_tag tags = new flickcurl_tag();
		tags = ModernizedCProgram.flickcurl_tags_getMostFrequentlyUsed(fc);
		if (!tags) {
			return 1;
		} 
		ModernizedCProgram.command_print_tags(tags, ((Object)0), ((Object)0));
		.free(tags);
		return 0;
	}
	/* name, has_arg, flag, val */
	public static void ser_emit_namespace(Object user_data, Object prefix, Object prefix_len, Object uri, Object uri_len) {
		raptor_serializer serializer = (raptor_serializer)user_data;
		raptor_uri ns_uri = ((Object)0);
		ns_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)uri);
		ModernizedCProgram.raptor_serializer_set_namespace(serializer, ns_uri, (byte)prefix);
		ModernizedCProgram.raptor_free_uri(ns_uri);
	}
	public static void ser_emit_triple(Object user_data, Object subject, int subject_type, Object predicate_nspace, Object predicate_name, Object object, int object_type, Object datatype_uri) {
		raptor_serializer serializer = (raptor_serializer)user_data;
		/* static */raptor_statement s = new raptor_statement();
		raptor_uri predicate_ns_uri = new raptor_uri();
		raptor_uri predicate_uri = new raptor_uri();
		ModernizedCProgram.raptor_statement_init(s, ModernizedCProgram.rworld);
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
		ModernizedCProgram.raptor_serializer_serialize_statement(serializer, s);
		ModernizedCProgram.raptor_statement_clear(s);
	}
	public static void ser_emit_finish(Object user_data) {
		raptor_serializer serializer = (raptor_serializer)user_data;
		ModernizedCProgram.raptor_serializer_serialize_end(serializer);
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
			if (!.strcmp(ModernizedCProgram.flickcurl_place_type_label[i], place_label)) {
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
	public static void flickcurl_free_place(Object place) {
		int i;
		do {
			if (!place) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_place is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\place.c", 105, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; i <= .FLICKCURL_PLACE_LAST; i++) {
			if (place.getNames()[i]) {
				.free(place.getNames()[i]);
			} 
			if (place.getIds()[i]) {
				.free(place.getIds()[i]);
			} 
			if (place.getUrls()[i]) {
				.free(place.getUrls()[i]);
			} 
			if (place.getWoe_ids()[i]) {
				.free(place.getWoe_ids()[i]);
			} 
		}
		if (place.getShape()) {
			ModernizedCProgram.flickcurl_free_shape(place.getShape());
		} 
		if (place.getTimezone()) {
			.free(place.getTimezone());
		} 
		.free(place/**
		 * flickcurl_free_places:
		 * @places_object: place object array
		 *
		 * Destructor for array of place object
		 */);
	}
	public static void flickcurl_free_places(Object places_object) {
		int i;
		do {
			if (!places_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_place_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\place.c", 139, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; places_object[i]; i++) {
			ModernizedCProgram.flickcurl_free_place(places_object[i]);
		}
		.free(places_object);
	}
	/* get shapedata from value */
	public static Object flickcurl_build_places(Object fc, Object xpathCtx, Object xpathExpr, Object place_count_p) {
		flickcurl_place places = ((Object)0);
		int nodes_count;
		int place_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int i;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		places = (flickcurl_place).calloc(, nodes_count + 1);
		if (place_count_p) {
			place_count_p = place_count;
		} 
		if (fc.getFailed()) {
			if (places) {
				ModernizedCProgram.flickcurl_free_places(places);
			} 
			places = ((Object)0);
		} 
		return places;
	}
	public static Object flickcurl_build_place(Object fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_place places = new flickcurl_place();
		flickcurl_place result = ((Object)0);
		places = ModernizedCProgram.flickcurl_build_places(fc, xpathCtx, xpathExpr, ((Object)0));
		if (places) {
			result = places[0];
			.free(places);
		} 
		return result/**
		 * flickcurl_place_type_to_id:
		 * @place_type: place type
		 *
		 * Turn a place type into a place ID
		 *
		 * Return value: place ID for type or <0 on failure
		 */;
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
	public static Object flickcurl_build_place_types(Object fc, Object xpathCtx, Object xpathExpr, Object place_type_count_p) {
		flickcurl_place_type_info place_types = ((Object)0);
		int nodes_count;
		int place_type_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do place_types */xpathCtx);
		if (!xpathObj) {
			ModernizedCProgram.flickcurl_error(fc, "Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		place_types = (flickcurl_place_type_info).calloc(nodes_count + 1, );
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_place_type_info pt = new flickcurl_place_type_info();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				ModernizedCProgram.flickcurl_error(fc, "Got unexpected node type %d", node.getType());
				fc.setFailed(1);
				break;
			} 
			pt = (flickcurl_place_type_info).calloc(1, );
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					pt.setId(.atoi(attr_value));
					.free(attr_value);
					pt.setType(ModernizedCProgram.flickcurl_place_id_to_type(pt.getId()));
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					pt.setName((byte).malloc(len + 1));
					.memcpy(pt.getName(), chnode.getContent(), len + 1);
				} 
			}
			.fprintf((_iob[2]), "place_type: id %d  type %d  name %s\n", pt.getId(), pt.getType(), pt.getName());
			place_types[place_type_count++] = pt/* for nodes */;
		}
		if (place_type_count_p) {
			place_type_count_p = place_type_count;
		} 
		return place_types/**
		 * flickcurl_free_place_type_infos:
		 * @ptis_object: list of place type info
		 *
		 * Destructor for place type info list
		 */;
	}
	public static void flickcurl_free_place_type_infos(Object ptis_object) {
		int i;
		do {
			if (!ptis_object) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_place_type_info is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\place.c", 747, __func__);
				return ;
			} 
		} while (0);
		for (i = 0; ptis_object[i]; i++) {
			flickcurl_place_type_info pti = ptis_object[i];
			byte n = pti.getName();
			if (n) {
				.free(n);
			} 
			.free(pti);
		}
		.free(ptis_object);
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * machinetags-api.c - Flickr flickr.machinetags.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
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
	 * flickcurl_machinetags_getNamespaces:
	 * @fc: flickcurl context
	 * @predicate: Limit the list of namespaces returned to those that have the following predicate (or NULL)
	 * @per_page: Number of namespaces to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
	 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
	 * 
	 * Return a list of unique namespaces, optionally limited by a given predicate, in alphabetical order.
	 *
	 * Implements flickr.machinetags.getNamespaces (1.7)
	 *
	 * As announced 2008-11-18
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
	 * and
	 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
	 *
	 * Return value: array of namespaces or NULL on failure
	 **/
	public static Object flickcurl_machinetags_getNamespaces(Object fc, Object predicate, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_namespace tag_namespaces = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "predicate", predicate);
		.sprintf(per_page_s, "%d", per_page);
		ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.machinetags.getNamespaces")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tag_namespaces = ModernizedCProgram.flickcurl_build_tag_namespaces(fc, xpathCtx, ()"/rsp/namespaces/namespace", ((Object)0));
		if (fc.getFailed()) {
			if (tag_namespaces) {
				ModernizedCProgram.flickcurl_free_tag_namespaces(tag_namespaces);
			} 
			tag_namespaces = ((Object)0);
		} 
		return tag_namespaces/**
		 * flickcurl_machinetags_getPairs:
		 * @fc: flickcurl context
		 * @nspace: Limit the list of pairs returned to those that have the following namespace (or NULL)
		 * @predicate: Limit the list of pairs returned to those that have the following predicate (or NULL)
		 * @per_page: Number of pairs to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
		 * 
		 * Return a list of unique namespace and predicate pairs, optionally limited by predicate or namespace, in alphabetical order.
		 *
		 * Implements flickr.machinetags.getPairs (1.7)
		 * 
		 * As announced 2008-11-18
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
		 * and
		 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
		 *
		 * Return value: array of pairs or NULL on failure
		 **/;
	}
	public static Object flickcurl_machinetags_getPairs(Object fc, Object nspace, Object predicate, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "namespace", nspace);
		ModernizedCProgram.flickcurl_add_param(fc, "predicate", predicate);
		.sprintf(per_page_s, "%d", per_page);
		ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.machinetags.getPairs")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tag_pvs = ModernizedCProgram.flickcurl_build_tag_predicate_values(fc, xpathCtx, ()"/rsp/pairs/pair", /* content not used */0, ((Object)0));
		if (fc.getFailed()) {
			if (tag_pvs) {
				ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs/**
		 * flickcurl_machinetags_getPredicates:
		 * @fc: flickcurl context
		 * @nspace: Limit the list of predicates returned to those that have the following namespace (or NULL)
		 * @per_page: Number of predicates to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
		 * 
		 * Return a list of unique predicates, optionally limited by a given namespace.
		 *
		 * Implements flickr.machinetags.getPredicates (1.7)
		 * 
		 * As announced 2008-11-18
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
		 * and
		 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
		 *
		 * Return value: array of predicates or NULL on failure
		 **/;
	}
	public static Object flickcurl_machinetags_getPredicates(Object fc, Object nspace, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		ModernizedCProgram.flickcurl_add_param(fc, "namespace", nspace);
		.sprintf(per_page_s, "%d", per_page);
		ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.machinetags.getPredicates")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tag_pvs = ModernizedCProgram.flickcurl_build_tag_predicate_values(fc, xpathCtx, ()"/rsp/predicates/predicate", /* content is predicate */1, ((Object)0));
		if (fc.getFailed()) {
			if (tag_pvs) {
				ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs/**
		 * flickcurl_machinetags_getValues:
		 * @fc: flickcurl context
		 * @nspace: The namespace that all values should be restricted to.
		 * @predicate: The predicate that all values should be restricted to.
		 * @per_page: Number of values to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
		 * 
		 * Return a list of unique values for a namespace and predicate.
		 *
		 * Implements flickr.machinetags.getValues (1.7)
		 * 
		 * As announced 2008-11-18
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
		 * and
		 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
		 *
		 * Return value: array of values or NULL on failure
		 **/;
	}
	public static Object flickcurl_machinetags_getValues(Object fc, Object nspace, Object predicate, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!nspace || !predicate) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "namespace", nspace);
		ModernizedCProgram.flickcurl_add_param(fc, "predicate", predicate);
		.sprintf(per_page_s, "%d", per_page);
		ModernizedCProgram.flickcurl_add_param(fc, "per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		ModernizedCProgram.flickcurl_add_param(fc, "page", page_s);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.machinetags.getValues")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tag_pvs = ModernizedCProgram.flickcurl_build_tag_predicate_values(fc, xpathCtx, ()"/rsp/values/value", /* content is value */2, ((Object)0));
		if (fc.getFailed()) {
			if (tag_pvs) {
				ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs/**
		 * flickcurl_machinetags_getRecentValues:
		 * @fc: flickcurl context
		 * @nspace: A namespace that all values should be restricted to (or NULL)
		 * @predicate: A predicate that all values should be restricted to (or NULL)
		 * @added_since: Only return machine tags values that have been added since this timestamp, in epoch seconds (or <0)
		 * 
		 * Fetch recently used machine tags values.
		 *
		 * Implements flickr.machinetags.getRecentValues (1.12)
		 * 
		 * Return value: array of values or NULL on failure
		 **/;
	}
	public static Object flickcurl_machinetags_getRecentValues(Object fc, Object nspace, Object predicate, int added_since) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		byte[] added_since_s = new byte[20];
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (nspace) {
			ModernizedCProgram.flickcurl_add_param(fc, "namespace", nspace);
		} 
		if (predicate) {
			ModernizedCProgram.flickcurl_add_param(fc, "predicate", predicate);
		} 
		if (added_since >= 0) {
			.sprintf(added_since_s, "%d", added_since);
			ModernizedCProgram.flickcurl_add_param(fc, "added_since", added_since_s);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.machinetags.getRecentValues")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		tag_pvs = ModernizedCProgram.flickcurl_build_tag_predicate_values(fc, xpathCtx, ()"/rsp/values/value", /* content is value */2, ((Object)0));
		if (fc.getFailed()) {
			if (tag_pvs) {
				ModernizedCProgram.flickcurl_free_tag_predicate_values(tag_pvs);
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs;
	}
	public static void SHA1Transform(Object state, Object buffer) {
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
		e += ((b & (c ^ d)) ^ d) + (block.getL()[0] = ((((block.getL()[0]) << (true)) | ((block.getL()[0]) >> (32 - (true)))) & -1024) | ((((block.getL()[0]) << (true)) | ((block.getL()[0]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (block.getL()[1] = ((((block.getL()[1]) << (true)) | ((block.getL()[1]) >> (32 - (true)))) & -1024) | ((((block.getL()[1]) << (true)) | ((block.getL()[1]) >> (32 - (true)))) & -1024)) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (block.getL()[2] = ((((block.getL()[2]) << (true)) | ((block.getL()[2]) >> (32 - (true)))) & -1024) | ((((block.getL()[2]) << (true)) | ((block.getL()[2]) >> (32 - (true)))) & -1024)) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (block.getL()[3] = ((((block.getL()[3]) << (true)) | ((block.getL()[3]) >> (32 - (true)))) & -1024) | ((((block.getL()[3]) << (true)) | ((block.getL()[3]) >> (32 - (true)))) & -1024)) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (/* 4 rounds of 20 operations each. Loop unrolled. */true))));
		;
		a += ((c & (d ^ e)) ^ e) + (block.getL()[4] = ((((block.getL()[4]) << (true)) | ((block.getL()[4]) >> (32 - (true)))) & -1024) | ((((block.getL()[4]) << (true)) | ((block.getL()[4]) >> (32 - (true)))) & -1024)) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += ((b & (c ^ d)) ^ d) + (block.getL()[5] = ((((block.getL()[5]) << (true)) | ((block.getL()[5]) >> (32 - (true)))) & -1024) | ((((block.getL()[5]) << (true)) | ((block.getL()[5]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (block.getL()[6] = ((((block.getL()[6]) << (true)) | ((block.getL()[6]) >> (32 - (true)))) & -1024) | ((((block.getL()[6]) << (true)) | ((block.getL()[6]) >> (32 - (true)))) & -1024)) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (block.getL()[7] = ((((block.getL()[7]) << (true)) | ((block.getL()[7]) >> (32 - (true)))) & -1024) | ((((block.getL()[7]) << (true)) | ((block.getL()[7]) >> (32 - (true)))) & -1024)) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (block.getL()[8] = ((((block.getL()[8]) << (true)) | ((block.getL()[8]) >> (32 - (true)))) & -1024) | ((((block.getL()[8]) << (true)) | ((block.getL()[8]) >> (32 - (true)))) & -1024)) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += ((c & (d ^ e)) ^ e) + (block.getL()[9] = ((((block.getL()[9]) << (true)) | ((block.getL()[9]) >> (32 - (true)))) & -1024) | ((((block.getL()[9]) << (true)) | ((block.getL()[9]) >> (32 - (true)))) & -1024)) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += ((b & (c ^ d)) ^ d) + (block.getL()[10] = ((((block.getL()[10]) << (true)) | ((block.getL()[10]) >> (32 - (true)))) & -1024) | ((((block.getL()[10]) << (true)) | ((block.getL()[10]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (block.getL()[11] = ((((block.getL()[11]) << (true)) | ((block.getL()[11]) >> (32 - (true)))) & -1024) | ((((block.getL()[11]) << (true)) | ((block.getL()[11]) >> (32 - (true)))) & -1024)) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (block.getL()[12] = ((((block.getL()[12]) << (true)) | ((block.getL()[12]) >> (32 - (true)))) & -1024) | ((((block.getL()[12]) << (true)) | ((block.getL()[12]) >> (32 - (true)))) & -1024)) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (block.getL()[13] = ((((block.getL()[13]) << (true)) | ((block.getL()[13]) >> (32 - (true)))) & -1024) | ((((block.getL()[13]) << (true)) | ((block.getL()[13]) >> (32 - (true)))) & -1024)) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += ((c & (d ^ e)) ^ e) + (block.getL()[14] = ((((block.getL()[14]) << (true)) | ((block.getL()[14]) >> (32 - (true)))) & -1024) | ((((block.getL()[14]) << (true)) | ((block.getL()[14]) >> (32 - (true)))) & -1024)) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += ((b & (c ^ d)) ^ d) + (block.getL()[15] = ((((block.getL()[15]) << (true)) | ((block.getL()[15]) >> (32 - (true)))) & -1024) | ((((block.getL()[15]) << (true)) | ((block.getL()[15]) >> (32 - (true)))) & -1024)) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += ((a & (b ^ c)) ^ c) + (block.getL()[16 & 15] = (((block.getL()[(16 + 13) & 15] ^ block.getL()[(16 + 8) & 15] ^ block.getL()[(16 + 2) & 15] ^ block.getL()[16 & 15]) << (true)) | ((block.getL()[(16 + 13) & 15] ^ block.getL()[(16 + 8) & 15] ^ block.getL()[(16 + 2) & 15] ^ block.getL()[16 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += ((e & (a ^ b)) ^ b) + (block.getL()[17 & 15] = (((block.getL()[(17 + 13) & 15] ^ block.getL()[(17 + 8) & 15] ^ block.getL()[(17 + 2) & 15] ^ block.getL()[17 & 15]) << (true)) | ((block.getL()[(17 + 13) & 15] ^ block.getL()[(17 + 8) & 15] ^ block.getL()[(17 + 2) & 15] ^ block.getL()[17 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += ((d & (e ^ a)) ^ a) + (block.getL()[18 & 15] = (((block.getL()[(18 + 13) & 15] ^ block.getL()[(18 + 8) & 15] ^ block.getL()[(18 + 2) & 15] ^ block.getL()[18 & 15]) << (true)) | ((block.getL()[(18 + 13) & 15] ^ block.getL()[(18 + 8) & 15] ^ block.getL()[(18 + 2) & 15] ^ block.getL()[18 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += ((c & (d ^ e)) ^ e) + (block.getL()[19 & 15] = (((block.getL()[(19 + 13) & 15] ^ block.getL()[(19 + 8) & 15] ^ block.getL()[(19 + 2) & 15] ^ block.getL()[19 & 15]) << (true)) | ((block.getL()[(19 + 13) & 15] ^ block.getL()[(19 + 8) & 15] ^ block.getL()[(19 + 2) & 15] ^ block.getL()[19 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[20 & 15] = (((block.getL()[(20 + 13) & 15] ^ block.getL()[(20 + 8) & 15] ^ block.getL()[(20 + 2) & 15] ^ block.getL()[20 & 15]) << (true)) | ((block.getL()[(20 + 13) & 15] ^ block.getL()[(20 + 8) & 15] ^ block.getL()[(20 + 2) & 15] ^ block.getL()[20 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[21 & 15] = (((block.getL()[(21 + 13) & 15] ^ block.getL()[(21 + 8) & 15] ^ block.getL()[(21 + 2) & 15] ^ block.getL()[21 & 15]) << (true)) | ((block.getL()[(21 + 13) & 15] ^ block.getL()[(21 + 8) & 15] ^ block.getL()[(21 + 2) & 15] ^ block.getL()[21 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[22 & 15] = (((block.getL()[(22 + 13) & 15] ^ block.getL()[(22 + 8) & 15] ^ block.getL()[(22 + 2) & 15] ^ block.getL()[22 & 15]) << (true)) | ((block.getL()[(22 + 13) & 15] ^ block.getL()[(22 + 8) & 15] ^ block.getL()[(22 + 2) & 15] ^ block.getL()[22 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[23 & 15] = (((block.getL()[(23 + 13) & 15] ^ block.getL()[(23 + 8) & 15] ^ block.getL()[(23 + 2) & 15] ^ block.getL()[23 & 15]) << (true)) | ((block.getL()[(23 + 13) & 15] ^ block.getL()[(23 + 8) & 15] ^ block.getL()[(23 + 2) & 15] ^ block.getL()[23 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[24 & 15] = (((block.getL()[(24 + 13) & 15] ^ block.getL()[(24 + 8) & 15] ^ block.getL()[(24 + 2) & 15] ^ block.getL()[24 & 15]) << (true)) | ((block.getL()[(24 + 13) & 15] ^ block.getL()[(24 + 8) & 15] ^ block.getL()[(24 + 2) & 15] ^ block.getL()[24 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[25 & 15] = (((block.getL()[(25 + 13) & 15] ^ block.getL()[(25 + 8) & 15] ^ block.getL()[(25 + 2) & 15] ^ block.getL()[25 & 15]) << (true)) | ((block.getL()[(25 + 13) & 15] ^ block.getL()[(25 + 8) & 15] ^ block.getL()[(25 + 2) & 15] ^ block.getL()[25 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[26 & 15] = (((block.getL()[(26 + 13) & 15] ^ block.getL()[(26 + 8) & 15] ^ block.getL()[(26 + 2) & 15] ^ block.getL()[26 & 15]) << (true)) | ((block.getL()[(26 + 13) & 15] ^ block.getL()[(26 + 8) & 15] ^ block.getL()[(26 + 2) & 15] ^ block.getL()[26 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[27 & 15] = (((block.getL()[(27 + 13) & 15] ^ block.getL()[(27 + 8) & 15] ^ block.getL()[(27 + 2) & 15] ^ block.getL()[27 & 15]) << (true)) | ((block.getL()[(27 + 13) & 15] ^ block.getL()[(27 + 8) & 15] ^ block.getL()[(27 + 2) & 15] ^ block.getL()[27 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[28 & 15] = (((block.getL()[(28 + 13) & 15] ^ block.getL()[(28 + 8) & 15] ^ block.getL()[(28 + 2) & 15] ^ block.getL()[28 & 15]) << (true)) | ((block.getL()[(28 + 13) & 15] ^ block.getL()[(28 + 8) & 15] ^ block.getL()[(28 + 2) & 15] ^ block.getL()[28 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[29 & 15] = (((block.getL()[(29 + 13) & 15] ^ block.getL()[(29 + 8) & 15] ^ block.getL()[(29 + 2) & 15] ^ block.getL()[29 & 15]) << (true)) | ((block.getL()[(29 + 13) & 15] ^ block.getL()[(29 + 8) & 15] ^ block.getL()[(29 + 2) & 15] ^ block.getL()[29 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[30 & 15] = (((block.getL()[(30 + 13) & 15] ^ block.getL()[(30 + 8) & 15] ^ block.getL()[(30 + 2) & 15] ^ block.getL()[30 & 15]) << (true)) | ((block.getL()[(30 + 13) & 15] ^ block.getL()[(30 + 8) & 15] ^ block.getL()[(30 + 2) & 15] ^ block.getL()[30 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[31 & 15] = (((block.getL()[(31 + 13) & 15] ^ block.getL()[(31 + 8) & 15] ^ block.getL()[(31 + 2) & 15] ^ block.getL()[31 & 15]) << (true)) | ((block.getL()[(31 + 13) & 15] ^ block.getL()[(31 + 8) & 15] ^ block.getL()[(31 + 2) & 15] ^ block.getL()[31 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[32 & 15] = (((block.getL()[(32 + 13) & 15] ^ block.getL()[(32 + 8) & 15] ^ block.getL()[(32 + 2) & 15] ^ block.getL()[32 & 15]) << (true)) | ((block.getL()[(32 + 13) & 15] ^ block.getL()[(32 + 8) & 15] ^ block.getL()[(32 + 2) & 15] ^ block.getL()[32 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[33 & 15] = (((block.getL()[(33 + 13) & 15] ^ block.getL()[(33 + 8) & 15] ^ block.getL()[(33 + 2) & 15] ^ block.getL()[33 & 15]) << (true)) | ((block.getL()[(33 + 13) & 15] ^ block.getL()[(33 + 8) & 15] ^ block.getL()[(33 + 2) & 15] ^ block.getL()[33 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[34 & 15] = (((block.getL()[(34 + 13) & 15] ^ block.getL()[(34 + 8) & 15] ^ block.getL()[(34 + 2) & 15] ^ block.getL()[34 & 15]) << (true)) | ((block.getL()[(34 + 13) & 15] ^ block.getL()[(34 + 8) & 15] ^ block.getL()[(34 + 2) & 15] ^ block.getL()[34 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[35 & 15] = (((block.getL()[(35 + 13) & 15] ^ block.getL()[(35 + 8) & 15] ^ block.getL()[(35 + 2) & 15] ^ block.getL()[35 & 15]) << (true)) | ((block.getL()[(35 + 13) & 15] ^ block.getL()[(35 + 8) & 15] ^ block.getL()[(35 + 2) & 15] ^ block.getL()[35 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[36 & 15] = (((block.getL()[(36 + 13) & 15] ^ block.getL()[(36 + 8) & 15] ^ block.getL()[(36 + 2) & 15] ^ block.getL()[36 & 15]) << (true)) | ((block.getL()[(36 + 13) & 15] ^ block.getL()[(36 + 8) & 15] ^ block.getL()[(36 + 2) & 15] ^ block.getL()[36 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[37 & 15] = (((block.getL()[(37 + 13) & 15] ^ block.getL()[(37 + 8) & 15] ^ block.getL()[(37 + 2) & 15] ^ block.getL()[37 & 15]) << (true)) | ((block.getL()[(37 + 13) & 15] ^ block.getL()[(37 + 8) & 15] ^ block.getL()[(37 + 2) & 15] ^ block.getL()[37 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[38 & 15] = (((block.getL()[(38 + 13) & 15] ^ block.getL()[(38 + 8) & 15] ^ block.getL()[(38 + 2) & 15] ^ block.getL()[38 & 15]) << (true)) | ((block.getL()[(38 + 13) & 15] ^ block.getL()[(38 + 8) & 15] ^ block.getL()[(38 + 2) & 15] ^ block.getL()[38 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[39 & 15] = (((block.getL()[(39 + 13) & 15] ^ block.getL()[(39 + 8) & 15] ^ block.getL()[(39 + 2) & 15] ^ block.getL()[39 & 15]) << (true)) | ((block.getL()[(39 + 13) & 15] ^ block.getL()[(39 + 8) & 15] ^ block.getL()[(39 + 2) & 15] ^ block.getL()[39 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (block.getL()[40 & 15] = (((block.getL()[(40 + 13) & 15] ^ block.getL()[(40 + 8) & 15] ^ block.getL()[(40 + 2) & 15] ^ block.getL()[40 & 15]) << (true)) | ((block.getL()[(40 + 13) & 15] ^ block.getL()[(40 + 8) & 15] ^ block.getL()[(40 + 2) & 15] ^ block.getL()[40 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (block.getL()[41 & 15] = (((block.getL()[(41 + 13) & 15] ^ block.getL()[(41 + 8) & 15] ^ block.getL()[(41 + 2) & 15] ^ block.getL()[41 & 15]) << (true)) | ((block.getL()[(41 + 13) & 15] ^ block.getL()[(41 + 8) & 15] ^ block.getL()[(41 + 2) & 15] ^ block.getL()[41 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (block.getL()[42 & 15] = (((block.getL()[(42 + 13) & 15] ^ block.getL()[(42 + 8) & 15] ^ block.getL()[(42 + 2) & 15] ^ block.getL()[42 & 15]) << (true)) | ((block.getL()[(42 + 13) & 15] ^ block.getL()[(42 + 8) & 15] ^ block.getL()[(42 + 2) & 15] ^ block.getL()[42 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (block.getL()[43 & 15] = (((block.getL()[(43 + 13) & 15] ^ block.getL()[(43 + 8) & 15] ^ block.getL()[(43 + 2) & 15] ^ block.getL()[43 & 15]) << (true)) | ((block.getL()[(43 + 13) & 15] ^ block.getL()[(43 + 8) & 15] ^ block.getL()[(43 + 2) & 15] ^ block.getL()[43 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (block.getL()[44 & 15] = (((block.getL()[(44 + 13) & 15] ^ block.getL()[(44 + 8) & 15] ^ block.getL()[(44 + 2) & 15] ^ block.getL()[44 & 15]) << (true)) | ((block.getL()[(44 + 13) & 15] ^ block.getL()[(44 + 8) & 15] ^ block.getL()[(44 + 2) & 15] ^ block.getL()[44 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (block.getL()[45 & 15] = (((block.getL()[(45 + 13) & 15] ^ block.getL()[(45 + 8) & 15] ^ block.getL()[(45 + 2) & 15] ^ block.getL()[45 & 15]) << (true)) | ((block.getL()[(45 + 13) & 15] ^ block.getL()[(45 + 8) & 15] ^ block.getL()[(45 + 2) & 15] ^ block.getL()[45 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (block.getL()[46 & 15] = (((block.getL()[(46 + 13) & 15] ^ block.getL()[(46 + 8) & 15] ^ block.getL()[(46 + 2) & 15] ^ block.getL()[46 & 15]) << (true)) | ((block.getL()[(46 + 13) & 15] ^ block.getL()[(46 + 8) & 15] ^ block.getL()[(46 + 2) & 15] ^ block.getL()[46 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (block.getL()[47 & 15] = (((block.getL()[(47 + 13) & 15] ^ block.getL()[(47 + 8) & 15] ^ block.getL()[(47 + 2) & 15] ^ block.getL()[47 & 15]) << (true)) | ((block.getL()[(47 + 13) & 15] ^ block.getL()[(47 + 8) & 15] ^ block.getL()[(47 + 2) & 15] ^ block.getL()[47 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (block.getL()[48 & 15] = (((block.getL()[(48 + 13) & 15] ^ block.getL()[(48 + 8) & 15] ^ block.getL()[(48 + 2) & 15] ^ block.getL()[48 & 15]) << (true)) | ((block.getL()[(48 + 13) & 15] ^ block.getL()[(48 + 8) & 15] ^ block.getL()[(48 + 2) & 15] ^ block.getL()[48 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (block.getL()[49 & 15] = (((block.getL()[(49 + 13) & 15] ^ block.getL()[(49 + 8) & 15] ^ block.getL()[(49 + 2) & 15] ^ block.getL()[49 & 15]) << (true)) | ((block.getL()[(49 + 13) & 15] ^ block.getL()[(49 + 8) & 15] ^ block.getL()[(49 + 2) & 15] ^ block.getL()[49 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (block.getL()[50 & 15] = (((block.getL()[(50 + 13) & 15] ^ block.getL()[(50 + 8) & 15] ^ block.getL()[(50 + 2) & 15] ^ block.getL()[50 & 15]) << (true)) | ((block.getL()[(50 + 13) & 15] ^ block.getL()[(50 + 8) & 15] ^ block.getL()[(50 + 2) & 15] ^ block.getL()[50 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (block.getL()[51 & 15] = (((block.getL()[(51 + 13) & 15] ^ block.getL()[(51 + 8) & 15] ^ block.getL()[(51 + 2) & 15] ^ block.getL()[51 & 15]) << (true)) | ((block.getL()[(51 + 13) & 15] ^ block.getL()[(51 + 8) & 15] ^ block.getL()[(51 + 2) & 15] ^ block.getL()[51 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (block.getL()[52 & 15] = (((block.getL()[(52 + 13) & 15] ^ block.getL()[(52 + 8) & 15] ^ block.getL()[(52 + 2) & 15] ^ block.getL()[52 & 15]) << (true)) | ((block.getL()[(52 + 13) & 15] ^ block.getL()[(52 + 8) & 15] ^ block.getL()[(52 + 2) & 15] ^ block.getL()[52 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (block.getL()[53 & 15] = (((block.getL()[(53 + 13) & 15] ^ block.getL()[(53 + 8) & 15] ^ block.getL()[(53 + 2) & 15] ^ block.getL()[53 & 15]) << (true)) | ((block.getL()[(53 + 13) & 15] ^ block.getL()[(53 + 8) & 15] ^ block.getL()[(53 + 2) & 15] ^ block.getL()[53 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (block.getL()[54 & 15] = (((block.getL()[(54 + 13) & 15] ^ block.getL()[(54 + 8) & 15] ^ block.getL()[(54 + 2) & 15] ^ block.getL()[54 & 15]) << (true)) | ((block.getL()[(54 + 13) & 15] ^ block.getL()[(54 + 8) & 15] ^ block.getL()[(54 + 2) & 15] ^ block.getL()[54 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (((b | c) & d) | (b & c)) + (block.getL()[55 & 15] = (((block.getL()[(55 + 13) & 15] ^ block.getL()[(55 + 8) & 15] ^ block.getL()[(55 + 2) & 15] ^ block.getL()[55 & 15]) << (true)) | ((block.getL()[(55 + 13) & 15] ^ block.getL()[(55 + 8) & 15] ^ block.getL()[(55 + 2) & 15] ^ block.getL()[55 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (((a | b) & c) | (a & b)) + (block.getL()[56 & 15] = (((block.getL()[(56 + 13) & 15] ^ block.getL()[(56 + 8) & 15] ^ block.getL()[(56 + 2) & 15] ^ block.getL()[56 & 15]) << (true)) | ((block.getL()[(56 + 13) & 15] ^ block.getL()[(56 + 8) & 15] ^ block.getL()[(56 + 2) & 15] ^ block.getL()[56 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (((e | a) & b) | (e & a)) + (block.getL()[57 & 15] = (((block.getL()[(57 + 13) & 15] ^ block.getL()[(57 + 8) & 15] ^ block.getL()[(57 + 2) & 15] ^ block.getL()[57 & 15]) << (true)) | ((block.getL()[(57 + 13) & 15] ^ block.getL()[(57 + 8) & 15] ^ block.getL()[(57 + 2) & 15] ^ block.getL()[57 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (((d | e) & a) | (d & e)) + (block.getL()[58 & 15] = (((block.getL()[(58 + 13) & 15] ^ block.getL()[(58 + 8) & 15] ^ block.getL()[(58 + 2) & 15] ^ block.getL()[58 & 15]) << (true)) | ((block.getL()[(58 + 13) & 15] ^ block.getL()[(58 + 8) & 15] ^ block.getL()[(58 + 2) & 15] ^ block.getL()[58 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (((c | d) & e) | (c & d)) + (block.getL()[59 & 15] = (((block.getL()[(59 + 13) & 15] ^ block.getL()[(59 + 8) & 15] ^ block.getL()[(59 + 2) & 15] ^ block.getL()[59 & 15]) << (true)) | ((block.getL()[(59 + 13) & 15] ^ block.getL()[(59 + 8) & 15] ^ block.getL()[(59 + 2) & 15] ^ block.getL()[59 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[60 & 15] = (((block.getL()[(60 + 13) & 15] ^ block.getL()[(60 + 8) & 15] ^ block.getL()[(60 + 2) & 15] ^ block.getL()[60 & 15]) << (true)) | ((block.getL()[(60 + 13) & 15] ^ block.getL()[(60 + 8) & 15] ^ block.getL()[(60 + 2) & 15] ^ block.getL()[60 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[61 & 15] = (((block.getL()[(61 + 13) & 15] ^ block.getL()[(61 + 8) & 15] ^ block.getL()[(61 + 2) & 15] ^ block.getL()[61 & 15]) << (true)) | ((block.getL()[(61 + 13) & 15] ^ block.getL()[(61 + 8) & 15] ^ block.getL()[(61 + 2) & 15] ^ block.getL()[61 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[62 & 15] = (((block.getL()[(62 + 13) & 15] ^ block.getL()[(62 + 8) & 15] ^ block.getL()[(62 + 2) & 15] ^ block.getL()[62 & 15]) << (true)) | ((block.getL()[(62 + 13) & 15] ^ block.getL()[(62 + 8) & 15] ^ block.getL()[(62 + 2) & 15] ^ block.getL()[62 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[63 & 15] = (((block.getL()[(63 + 13) & 15] ^ block.getL()[(63 + 8) & 15] ^ block.getL()[(63 + 2) & 15] ^ block.getL()[63 & 15]) << (true)) | ((block.getL()[(63 + 13) & 15] ^ block.getL()[(63 + 8) & 15] ^ block.getL()[(63 + 2) & 15] ^ block.getL()[63 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[64 & 15] = (((block.getL()[(64 + 13) & 15] ^ block.getL()[(64 + 8) & 15] ^ block.getL()[(64 + 2) & 15] ^ block.getL()[64 & 15]) << (true)) | ((block.getL()[(64 + 13) & 15] ^ block.getL()[(64 + 8) & 15] ^ block.getL()[(64 + 2) & 15] ^ block.getL()[64 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[65 & 15] = (((block.getL()[(65 + 13) & 15] ^ block.getL()[(65 + 8) & 15] ^ block.getL()[(65 + 2) & 15] ^ block.getL()[65 & 15]) << (true)) | ((block.getL()[(65 + 13) & 15] ^ block.getL()[(65 + 8) & 15] ^ block.getL()[(65 + 2) & 15] ^ block.getL()[65 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[66 & 15] = (((block.getL()[(66 + 13) & 15] ^ block.getL()[(66 + 8) & 15] ^ block.getL()[(66 + 2) & 15] ^ block.getL()[66 & 15]) << (true)) | ((block.getL()[(66 + 13) & 15] ^ block.getL()[(66 + 8) & 15] ^ block.getL()[(66 + 2) & 15] ^ block.getL()[66 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[67 & 15] = (((block.getL()[(67 + 13) & 15] ^ block.getL()[(67 + 8) & 15] ^ block.getL()[(67 + 2) & 15] ^ block.getL()[67 & 15]) << (true)) | ((block.getL()[(67 + 13) & 15] ^ block.getL()[(67 + 8) & 15] ^ block.getL()[(67 + 2) & 15] ^ block.getL()[67 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[68 & 15] = (((block.getL()[(68 + 13) & 15] ^ block.getL()[(68 + 8) & 15] ^ block.getL()[(68 + 2) & 15] ^ block.getL()[68 & 15]) << (true)) | ((block.getL()[(68 + 13) & 15] ^ block.getL()[(68 + 8) & 15] ^ block.getL()[(68 + 2) & 15] ^ block.getL()[68 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[69 & 15] = (((block.getL()[(69 + 13) & 15] ^ block.getL()[(69 + 8) & 15] ^ block.getL()[(69 + 2) & 15] ^ block.getL()[69 & 15]) << (true)) | ((block.getL()[(69 + 13) & 15] ^ block.getL()[(69 + 8) & 15] ^ block.getL()[(69 + 2) & 15] ^ block.getL()[69 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[70 & 15] = (((block.getL()[(70 + 13) & 15] ^ block.getL()[(70 + 8) & 15] ^ block.getL()[(70 + 2) & 15] ^ block.getL()[70 & 15]) << (true)) | ((block.getL()[(70 + 13) & 15] ^ block.getL()[(70 + 8) & 15] ^ block.getL()[(70 + 2) & 15] ^ block.getL()[70 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[71 & 15] = (((block.getL()[(71 + 13) & 15] ^ block.getL()[(71 + 8) & 15] ^ block.getL()[(71 + 2) & 15] ^ block.getL()[71 & 15]) << (true)) | ((block.getL()[(71 + 13) & 15] ^ block.getL()[(71 + 8) & 15] ^ block.getL()[(71 + 2) & 15] ^ block.getL()[71 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[72 & 15] = (((block.getL()[(72 + 13) & 15] ^ block.getL()[(72 + 8) & 15] ^ block.getL()[(72 + 2) & 15] ^ block.getL()[72 & 15]) << (true)) | ((block.getL()[(72 + 13) & 15] ^ block.getL()[(72 + 8) & 15] ^ block.getL()[(72 + 2) & 15] ^ block.getL()[72 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[73 & 15] = (((block.getL()[(73 + 13) & 15] ^ block.getL()[(73 + 8) & 15] ^ block.getL()[(73 + 2) & 15] ^ block.getL()[73 & 15]) << (true)) | ((block.getL()[(73 + 13) & 15] ^ block.getL()[(73 + 8) & 15] ^ block.getL()[(73 + 2) & 15] ^ block.getL()[73 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[74 & 15] = (((block.getL()[(74 + 13) & 15] ^ block.getL()[(74 + 8) & 15] ^ block.getL()[(74 + 2) & 15] ^ block.getL()[74 & 15]) << (true)) | ((block.getL()[(74 + 13) & 15] ^ block.getL()[(74 + 8) & 15] ^ block.getL()[(74 + 2) & 15] ^ block.getL()[74 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		e += (b ^ c ^ d) + (block.getL()[75 & 15] = (((block.getL()[(75 + 13) & 15] ^ block.getL()[(75 + 8) & 15] ^ block.getL()[(75 + 2) & 15] ^ block.getL()[75 & 15]) << (true)) | ((block.getL()[(75 + 13) & 15] ^ block.getL()[(75 + 8) & 15] ^ block.getL()[(75 + 2) & 15] ^ block.getL()[75 & 15]) >> (32 - (true))))) + -1024 + (((a) << (true)) | ((a) >> (32 - (true))));
		b = (((b) << (true)) | ((b) >> (32 - (true))));
		;
		d += (a ^ b ^ c) + (block.getL()[76 & 15] = (((block.getL()[(76 + 13) & 15] ^ block.getL()[(76 + 8) & 15] ^ block.getL()[(76 + 2) & 15] ^ block.getL()[76 & 15]) << (true)) | ((block.getL()[(76 + 13) & 15] ^ block.getL()[(76 + 8) & 15] ^ block.getL()[(76 + 2) & 15] ^ block.getL()[76 & 15]) >> (32 - (true))))) + -1024 + (((e) << (true)) | ((e) >> (32 - (true))));
		a = (((a) << (true)) | ((a) >> (32 - (true))));
		;
		c += (e ^ a ^ b) + (block.getL()[77 & 15] = (((block.getL()[(77 + 13) & 15] ^ block.getL()[(77 + 8) & 15] ^ block.getL()[(77 + 2) & 15] ^ block.getL()[77 & 15]) << (true)) | ((block.getL()[(77 + 13) & 15] ^ block.getL()[(77 + 8) & 15] ^ block.getL()[(77 + 2) & 15] ^ block.getL()[77 & 15]) >> (32 - (true))))) + -1024 + (((d) << (true)) | ((d) >> (32 - (true))));
		e = (((e) << (true)) | ((e) >> (32 - (true))));
		;
		b += (d ^ e ^ a) + (block.getL()[78 & 15] = (((block.getL()[(78 + 13) & 15] ^ block.getL()[(78 + 8) & 15] ^ block.getL()[(78 + 2) & 15] ^ block.getL()[78 & 15]) << (true)) | ((block.getL()[(78 + 13) & 15] ^ block.getL()[(78 + 8) & 15] ^ block.getL()[(78 + 2) & 15] ^ block.getL()[78 & 15]) >> (32 - (true))))) + -1024 + (((c) << (true)) | ((c) >> (32 - (true))));
		d = (((d) << (true)) | ((d) >> (32 - (true))));
		;
		a += (c ^ d ^ e) + (block.getL()[79 & 15] = (((block.getL()[(79 + 13) & 15] ^ block.getL()[(79 + 8) & 15] ^ block.getL()[(79 + 2) & 15] ^ block.getL()[79 & 15]) << (true)) | ((block.getL()[(79 + 13) & 15] ^ block.getL()[(79 + 8) & 15] ^ block.getL()[(79 + 2) & 15] ^ block.getL()[79 & 15]) >> (32 - (true))))) + -1024 + (((b) << (true)) | ((b) >> (32 - (true))));
		c = (((c) << (true)) | ((c) >> (32 - (true))));
		;
		state[0] += /* Add the working vars back into context.state[] */a;
		state[1] += b;
		state[2] += c;
		state[3] += d;
		state[4] += e/* Wipe variables *//* a = b = c = d = e = 0; *//* CLANG: useless */;
	}
	/* SHA1Init - Initialize new context */
	public static void SHA1Init(Object context) {
		context.getState()[0] = /* SHA1 initialization constants */-1024;
		context.getState()[1] = -1024;
		context.getState()[2] = -1024;
		context.getState()[3] = -1024;
		context.getState()[4] = -1024;
		context.getCount()[0] = context.getCount()[1] = 0;
	}
	/* JHB */
	/* Run your data through this. */
	/* JHB */
	public static void SHA1Update(Object context, Object data, Object len) {
		/* JHB */uint32_t i = new uint32_t();
		uint32_t j = new uint32_t();
		j = (context.getCount()[0] >> 3) & 63;
		if ((context.getCount()[0] += len << 3) < (len << 3)) {
			context.getCount()[1]++;
		} 
		context.getCount()[1] += (len >> 29);
		if ((j + len) > 63) {
			.memcpy(context.getBuffer()[j], data, (i = 64 - j));
			ModernizedCProgram.SHA1Transform(context.getState(), context.getBuffer());
			for (; i + 63 < len; i += 64) {
				ModernizedCProgram.SHA1Transform(context.getState(), data[i]);
			}
			j = 0;
		} else {
				i = 0;
		} 
		.memcpy(context.getBuffer()[j], data[i], len - i);
	}
	/* Add padding and return the message digest. */
	public static void SHA1Final(Object context) {
		/* JHB */uint32_t i = new uint32_t();
		byte[] finalcount = new byte[8];
		for (i = 0; i < 8; i++) {
			finalcount[i] = (byte)((context.getCount()[(i >= 4 ? 0 : 1)] >> ((3 - (i & 3)) * 8)) & /* Endian independent */255);
		}
		ModernizedCProgram.SHA1Update(context, (byte)"\200", 1);
		while ((context.getCount()[0] & 504) != 448) {
			ModernizedCProgram.SHA1Update(context, (byte)"\0", 1);
		}
		ModernizedCProgram.SHA1Update(context, finalcount, /* Should cause a SHA1Transform() */8);
		for (i = 0; i < 20; i++) {
			context.getDigest()[i] = (byte)((context.getState()[i >> 2] >> ((3 - (i & 3)) * 8)) & 255);
		}
		.memset(context.getBuffer(), 0, /* Wipe variables *//* i = 0; *//* JHB *//* CLANG: useless */64);
		.memset(context.getState(), 0, 20);
		.memset(context.getCount(), 0, 8);
		.memset(finalcount, 0, /* SWR */8/* make SHA1Transform overwrite it's own static vars *//* DJB code from here *//*
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
		 */);
	}
	/* blk0() and blk() perform the initial expand. */
	/* I got the idea of expanding during the round function from SSLeay */
	public static Object flickcurl_hmac_sha1(Object data, Object data_len, Object key, Object key_len) {
		int i;
		SHA1Context inner = new SHA1Context();
		SHA1Context outer = new SHA1Context();
		SHA1Context key_hash = new SHA1Context();
		byte[] kpad = new byte[64];
		byte result;
		if (!key || !data) {
			return ((Object)0);
		} 
		result = (byte).malloc(20);
		if (!result) {
			return ((Object)0);
		} 
		Object generatedDigest = key_hash.getDigest();
		if (key_len > 64) {
			ModernizedCProgram.SHA1Init(/* When key (K) is > blocksize, key := sha1-hash(key) */key_hash);
			ModernizedCProgram.SHA1Update(key_hash, (byte)key, key_len);
			ModernizedCProgram.SHA1Final(key_hash);
			key = generatedDigest;
			key_len = 20;
		} 
		.memset(kpad, (byte)'\0', );
		.memcpy(kpad, key, key_len);
		for (i = 0; i < 64; i++) {
			kpad[i] ^=  -1024;
		}
		ModernizedCProgram.SHA1Init(/* inner := sha1-hash(ipad // message) */inner);
		ModernizedCProgram.SHA1Update(inner, kpad, 64);
		ModernizedCProgram.SHA1Update(inner, (byte)data, data_len);
		ModernizedCProgram.SHA1Final(inner);
		.memset(kpad, (byte)'\0', );
		.memcpy(kpad, key, key_len);
		for (i = 0; i < 64; i++) {
			kpad[i] ^=  -1024;
		}
		ModernizedCProgram.SHA1Init(/* final outer := sha1-hash(opad // inner) */outer);
		ModernizedCProgram.SHA1Update(outer, kpad, 64);
		ModernizedCProgram.SHA1Update(outer, generatedDigest, /* Result of inner hash is in inner.digest of size SHA1_DIGEST_LENGTH */20);
		ModernizedCProgram.SHA1Final(outer);
		.memcpy(result, generatedDigest, /* copy final digest into result buffer */20);
		return result;
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
	public static Object flickcurl_collections_getInfo(Object fc, Object collection_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_collection collection = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (!collection_id) {
			return ((Object)0);
		} 
		ModernizedCProgram.flickcurl_add_param(fc, "collection_id", collection_id);
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.collections.getInfo")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		collection = ModernizedCProgram.flickcurl_build_collection(fc, xpathCtx, ()"/rsp/collection");
		if (fc.getFailed()) {
			if (collection) {
				ModernizedCProgram.flickcurl_free_collection(collection);
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
	public static Object flickcurl_collections_getTree(Object fc, Object collection_id, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_collection collection = ((Object)0);
		ModernizedCProgram.flickcurl_init_params(fc, 0);
		if (collection_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "collection_id", collection_id);
		} 
		if (user_id) {
			ModernizedCProgram.flickcurl_add_param(fc, "user_id", user_id);
		} 
		ModernizedCProgram.flickcurl_end_params(fc);
		if (ModernizedCProgram.flickcurl_prepare(fc, "flickr.collections.getTree")) {
			;
		} 
		doc = ModernizedCProgram.flickcurl_invoke(fc);
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			ModernizedCProgram.flickcurl_error(fc, "Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		collection = ModernizedCProgram.flickcurl_build_collection(fc, xpathCtx, ()"/rsp/collections/collection");
		if (fc.getFailed()) {
			if (collection) {
				ModernizedCProgram.flickcurl_free_collection(collection);
			} 
			collection = ((Object)0);
		} 
		return collection;
	}
}
