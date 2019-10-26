package application;

public class obs_core {
	private obs_module first_module;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object signals;
	private Object procs;
	private Byte locale;
	private Byte module_config_path;
	private Object name_store_owned;
	private Object name_store;
	private obs_core_video video;
	private obs_core_audio audio;
	private obs_core_data data;
	private obs_core_hotkeys hotkeys;
	
	public obs_core(obs_module first_module, Object,  Object,  Object,  Object,  Object,  Object,  Object,  Object,  Object,  Object,  Object signals, Object procs, Byte locale, Byte module_config_path, Object name_store_owned, Object name_store, obs_core_video video, obs_core_audio audio, obs_core_data data, obs_core_hotkeys hotkeys) {
		setFirst_module(first_module);
		set();
		set();
		set();
		set();
		set();
		set();
		set();
		set();
		set();
		set();
		setSignals(signals);
		setProcs(procs);
		setLocale(locale);
		setModule_config_path(module_config_path);
		setName_store_owned(name_store_owned);
		setName_store(name_store);
		setVideo(video);
		setAudio(audio);
		setData(data);
		setHotkeys(hotkeys);
	}
	public obs_core() {
	}
	
	public obs_module getFirst_module() {
		return first_module;
	}
	public void setFirst_module(obs_module newFirst_module) {
		first_module = newFirst_module;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getSignals() {
		return signals;
	}
	public void setSignals(Object newSignals) {
		signals = newSignals;
	}
	public Object getProcs() {
		return procs;
	}
	public void setProcs(Object newProcs) {
		procs = newProcs;
	}
	public Byte getLocale() {
		return locale;
	}
	public void setLocale(Byte newLocale) {
		locale = newLocale;
	}
	public Byte getModule_config_path() {
		return module_config_path;
	}
	public void setModule_config_path(Byte newModule_config_path) {
		module_config_path = newModule_config_path;
	}
	public Object getName_store_owned() {
		return name_store_owned;
	}
	public void setName_store_owned(Object newName_store_owned) {
		name_store_owned = newName_store_owned;
	}
	public Object getName_store() {
		return name_store;
	}
	public void setName_store(Object newName_store) {
		name_store = newName_store;
	}
	public obs_core_video getVideo() {
		return video;
	}
	public void setVideo(obs_core_video newVideo) {
		video = newVideo;
	}
	public obs_core_audio getAudio() {
		return audio;
	}
	public void setAudio(obs_core_audio newAudio) {
		audio = newAudio;
	}
	public obs_core_data getData() {
		return data;
	}
	public void setData(obs_core_data newData) {
		data = newData;
	}
	public obs_core_hotkeys getHotkeys() {
		return hotkeys;
	}
	public void setHotkeys(obs_core_hotkeys newHotkeys) {
		hotkeys = newHotkeys;
	}
}
