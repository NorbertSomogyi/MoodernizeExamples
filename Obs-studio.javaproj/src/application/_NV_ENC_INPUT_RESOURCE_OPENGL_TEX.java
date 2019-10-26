package application;

/**
 * \struct _NV_ENC_INPUT_RESOURCE_OPENGL_TEX
 * NV_ENC_REGISTER_RESOURCE::resourceToRegister must be a pointer to a variable of this type,
 * when NV_ENC_REGISTER_RESOURCE::resourceType is NV_ENC_INPUT_RESOURCE_TYPE_OPENGL_TEX
 */
public class _NV_ENC_INPUT_RESOURCE_OPENGL_TEX {
	private Object texture;
	private Object target;
	
	public _NV_ENC_INPUT_RESOURCE_OPENGL_TEX(Object texture, Object target) {
		setTexture(texture);
		setTarget(target);
	}
	public _NV_ENC_INPUT_RESOURCE_OPENGL_TEX() {
	}
	
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object newTarget) {
		target = newTarget;
	}
}
