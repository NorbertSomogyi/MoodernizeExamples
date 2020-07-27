package application;

public class AMF3ClassDef {
	private AVal cd_name;
	private byte cd_externalizable;
	private byte cd_dynamic;
	private int cd_num;
	private AVal[] cd_props;
	
	public AMF3ClassDef(AVal cd_name, byte cd_externalizable, byte cd_dynamic, int cd_num, AVal[] cd_props) {
		setCd_name(cd_name);
		setCd_externalizable(cd_externalizable);
		setCd_dynamic(cd_dynamic);
		setCd_num(cd_num);
		setCd_props(cd_props);
	}
	public AMF3ClassDef() {
	}
	
	public AVal getCd_name() {
		return cd_name;
	}
	public void setCd_name(AVal newCd_name) {
		cd_name = newCd_name;
	}
	public byte getCd_externalizable() {
		return cd_externalizable;
	}
	public void setCd_externalizable(byte newCd_externalizable) {
		cd_externalizable = newCd_externalizable;
	}
	public byte getCd_dynamic() {
		return cd_dynamic;
	}
	public void setCd_dynamic(byte newCd_dynamic) {
		cd_dynamic = newCd_dynamic;
	}
	public int getCd_num() {
		return cd_num;
	}
	public void setCd_num(int newCd_num) {
		cd_num = newCd_num;
	}
	public AVal[] getCd_props() {
		return cd_props;
	}
	public void setCd_props(AVal[] newCd_props) {
		cd_props = newCd_props;
	}
}
