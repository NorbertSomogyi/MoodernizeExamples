package application;

/**
 * \struct _NV_ENC_PRESET_CONFIG
 * Encoder preset config
 */
public class _NV_ENC_PRESET_CONFIG {
	private Object version;
	private _NV_ENC_CONFIG presetCfg;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_PRESET_CONFIG(Object version, _NV_ENC_CONFIG presetCfg, Object reserved1, Object reserved2) {
		setVersion(version);
		setPresetCfg(presetCfg);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_PRESET_CONFIG() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _NV_ENC_CONFIG getPresetCfg() {
		return presetCfg;
	}
	public void setPresetCfg(_NV_ENC_CONFIG newPresetCfg) {
		presetCfg = newPresetCfg;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
