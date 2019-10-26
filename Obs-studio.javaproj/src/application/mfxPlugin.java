package application;

public class mfxPlugin {
	private Object pthis;
	private Object PluginInit;
	private Object PluginClose;
	private Object GetPluginParam;
	private Object Submit;
	private Object Execute;
	private Object FreeResources;
	private mfxVideoCodecPlugin Video;
	private mfxAudioCodecPlugin Audio;
	private Object reserved;
	
	public mfxPlugin(Object pthis, Object PluginInit, Object PluginClose, Object GetPluginParam, Object Submit, Object Execute, Object FreeResources, mfxVideoCodecPlugin Video, mfxAudioCodecPlugin Audio, Object reserved) {
		setPthis(pthis);
		setPluginInit(PluginInit);
		setPluginClose(PluginClose);
		setGetPluginParam(GetPluginParam);
		setSubmit(Submit);
		setExecute(Execute);
		setFreeResources(FreeResources);
		setVideo(Video);
		setAudio(Audio);
		setReserved(reserved);
	}
	public mfxPlugin() {
	}
	
	public Object getPthis() {
		return pthis;
	}
	public void setPthis(Object newPthis) {
		pthis = newPthis;
	}
	public Object getPluginInit() {
		return PluginInit;
	}
	public void setPluginInit(Object newPluginInit) {
		PluginInit = newPluginInit;
	}
	public Object getPluginClose() {
		return PluginClose;
	}
	public void setPluginClose(Object newPluginClose) {
		PluginClose = newPluginClose;
	}
	public Object getGetPluginParam() {
		return GetPluginParam;
	}
	public void setGetPluginParam(Object newGetPluginParam) {
		GetPluginParam = newGetPluginParam;
	}
	public Object getSubmit() {
		return Submit;
	}
	public void setSubmit(Object newSubmit) {
		Submit = newSubmit;
	}
	public Object getExecute() {
		return Execute;
	}
	public void setExecute(Object newExecute) {
		Execute = newExecute;
	}
	public Object getFreeResources() {
		return FreeResources;
	}
	public void setFreeResources(Object newFreeResources) {
		FreeResources = newFreeResources;
	}
	public mfxVideoCodecPlugin getVideo() {
		return Video;
	}
	public void setVideo(mfxVideoCodecPlugin newVideo) {
		Video = newVideo;
	}
	public mfxAudioCodecPlugin getAudio() {
		return Audio;
	}
	public void setAudio(mfxAudioCodecPlugin newAudio) {
		Audio = newAudio;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
