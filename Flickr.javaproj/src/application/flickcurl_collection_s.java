package application;

public class flickcurl_collection_s {
	private Object id;
	private int child_count;
	private int date_created;
	private Object iconlarge;
	private Object iconsmall;
	private int server;
	private Object secret;
	private Object title;
	private Object description;
	private Object photos;
	private int photos_count;
	private Object collections;
	private int collections_count;
	private Object sets;
	private int sets_count;
	
	public flickcurl_collection_s(Object id, int child_count, int date_created, Object iconlarge, Object iconsmall, int server, Object secret, Object title, Object description, Object photos, int photos_count, Object collections, int collections_count, Object sets, int sets_count) {
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
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
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
	public Object getIconlarge() {
		return iconlarge;
	}
	public void setIconlarge(Object newIconlarge) {
		iconlarge = newIconlarge;
	}
	public Object getIconsmall() {
		return iconsmall;
	}
	public void setIconsmall(Object newIconsmall) {
		iconsmall = newIconsmall;
	}
	public int getServer() {
		return server;
	}
	public void setServer(int newServer) {
		server = newServer;
	}
	public Object getSecret() {
		return secret;
	}
	public void setSecret(Object newSecret) {
		secret = newSecret;
	}
	public Object getTitle() {
		return title;
	}
	public void setTitle(Object newTitle) {
		title = newTitle;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object newDescription) {
		description = newDescription;
	}
	public Object getPhotos() {
		return photos;
	}
	public void setPhotos(Object newPhotos) {
		photos = newPhotos;
	}
	public int getPhotos_count() {
		return photos_count;
	}
	public void setPhotos_count(int newPhotos_count) {
		photos_count = newPhotos_count;
	}
	public Object getCollections() {
		return collections;
	}
	public void setCollections(Object newCollections) {
		collections = newCollections;
	}
	public int getCollections_count() {
		return collections_count;
	}
	public void setCollections_count(int newCollections_count) {
		collections_count = newCollections_count;
	}
	public Object getSets() {
		return sets;
	}
	public void setSets(Object newSets) {
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
