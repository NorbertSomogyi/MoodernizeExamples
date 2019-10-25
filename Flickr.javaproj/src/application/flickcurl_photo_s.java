package application;

public class flickcurl_photo_s {
	private Object id;
	private Object uri;
	private Object tags;
	private int tags_count;
	private Object fields;
	private Object place;
	private Object video;
	private Object media_type;
	private Object notes;
	private int notes_count;
	
	public flickcurl_photo_s(Object id, Object uri, Object tags, int tags_count, Object fields, Object place, Object video, Object media_type, Object notes, int notes_count) {
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
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getUri() {
		return uri;
	}
	public void setUri(Object newUri) {
		uri = newUri;
	}
	public Object getTags() {
		return tags;
	}
	public void setTags(Object newTags) {
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
	public Object getPlace() {
		return place;
	}
	public void setPlace(Object newPlace) {
		place = newPlace;
	}
	public Object getVideo() {
		return video;
	}
	public void setVideo(Object newVideo) {
		video = newVideo;
	}
	public Object getMedia_type() {
		return media_type;
	}
	public void setMedia_type(Object newMedia_type) {
		media_type = newMedia_type;
	}
	public Object getNotes() {
		return notes;
	}
	public void setNotes(Object newNotes) {
		notes = newNotes;
	}
	public int getNotes_count() {
		return notes_count;
	}
	public void setNotes_count(int newNotes_count) {
		notes_count = newNotes_count;
	}
}
