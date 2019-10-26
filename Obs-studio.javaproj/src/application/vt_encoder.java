package application;

public class vt_encoder {
	private Object name;
	private Object disp_name;
	private Object id;
	private Object codec_name;
	
	public vt_encoder(Object name, Object disp_name, Object id, Object codec_name) {
		setName(name);
		setDisp_name(disp_name);
		setId(id);
		setCodec_name(codec_name);
	}
	public vt_encoder() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getDisp_name() {
		return disp_name;
	}
	public void setDisp_name(Object newDisp_name) {
		disp_name = newDisp_name;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getCodec_name() {
		return codec_name;
	}
	public void setCodec_name(Object newCodec_name) {
		codec_name = newCodec_name;
	}
}
