package application;

/* Alternate Permissions (ECMA 167r3 4/14.10.4) */
public class alt_perms_s {
	private Object attr_type;
	private Object attr_subtype;
	private Object[] reserved;
	private Object attrLength;
	private Object owner_id;
	private Object group_id;
	private Object permission;
	
	public alt_perms_s(Object attr_type, Object attr_subtype, Object[] reserved, Object attrLength, Object owner_id, Object group_id, Object permission) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setOwner_id(owner_id);
		setGroup_id(group_id);
		setPermission(permission);
	}
	public alt_perms_s() {
	}
	
	public Object getAttr_type() {
		return attr_type;
	}
	public void setAttr_type(Object newAttr_type) {
		attr_type = newAttr_type;
	}
	public Object getAttr_subtype() {
		return attr_subtype;
	}
	public void setAttr_subtype(Object newAttr_subtype) {
		attr_subtype = newAttr_subtype;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
	public Object getAttrLength() {
		return attrLength;
	}
	public void setAttrLength(Object newAttrLength) {
		attrLength = newAttrLength;
	}
	public Object getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(Object newOwner_id) {
		owner_id = newOwner_id;
	}
	public Object getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Object newGroup_id) {
		group_id = newGroup_id;
	}
	public Object getPermission() {
		return permission;
	}
	public void setPermission(Object newPermission) {
		permission = newPermission;
	}
}
