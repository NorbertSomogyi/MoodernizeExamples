package application;

/**< scales to the height */
/**< no scaling, maximum size only */
public class obs_transform_info {
	private vec2 pos;
	private double rot;
	private vec2 scale;
	private Object alignment;
	private obs_bounds_type bounds_type;
	private Object bounds_alignment;
	private vec2 bounds;
	
	public obs_transform_info(vec2 pos, double rot, vec2 scale, Object alignment, obs_bounds_type bounds_type, Object bounds_alignment, vec2 bounds) {
		setPos(pos);
		setRot(rot);
		setScale(scale);
		setAlignment(alignment);
		setBounds_type(bounds_type);
		setBounds_alignment(bounds_alignment);
		setBounds(bounds);
	}
	public obs_transform_info() {
	}
	
	public void obs_sceneitem_get_info(Object item) {
		if (item && info) {
			this.setPos(item.getPos());
			this.setRot(item.getRot());
			this.setScale(item.getScale());
			this.setAlignment(item.getAlign());
			this.setBounds_type(item.getBounds_type());
			this.setBounds_alignment(item.getBounds_align());
			this.setBounds(item.getBounds());
		} 
	}
	public vec2 getPos() {
		return pos;
	}
	public void setPos(vec2 newPos) {
		pos = newPos;
	}
	public double getRot() {
		return rot;
	}
	public void setRot(double newRot) {
		rot = newRot;
	}
	public vec2 getScale() {
		return scale;
	}
	public void setScale(vec2 newScale) {
		scale = newScale;
	}
	public Object getAlignment() {
		return alignment;
	}
	public void setAlignment(Object newAlignment) {
		alignment = newAlignment;
	}
	public obs_bounds_type getBounds_type() {
		return bounds_type;
	}
	public void setBounds_type(obs_bounds_type newBounds_type) {
		bounds_type = newBounds_type;
	}
	public Object getBounds_alignment() {
		return bounds_alignment;
	}
	public void setBounds_alignment(Object newBounds_alignment) {
		bounds_alignment = newBounds_alignment;
	}
	public vec2 getBounds() {
		return bounds;
	}
	public void setBounds(vec2 newBounds) {
		bounds = newBounds;
	}
}
