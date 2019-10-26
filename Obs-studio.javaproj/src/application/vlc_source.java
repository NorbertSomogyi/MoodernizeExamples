package application;

public class vlc_source {
	private obs_source source;
	private Object media_player;
	private Object media_list_player;
	private obs_source_frame frame;
	private obs_source_audio audio;
	private Object audio_capacity;
	private Object mutex;
	private Object ;
	private behavior behavior;
	private Object loop;
	private Object shuffle;
	private Object play_pause_hotkey;
	private Object restart_hotkey;
	private Object stop_hotkey;
	private Object playlist_next_hotkey;
	private Object playlist_prev_hotkey;
	
	public vlc_source(obs_source source, Object media_player, Object media_list_player, obs_source_frame frame, obs_source_audio audio, Object audio_capacity, Object mutex, Object,  behavior behavior, Object loop, Object shuffle, Object play_pause_hotkey, Object restart_hotkey, Object stop_hotkey, Object playlist_next_hotkey, Object playlist_prev_hotkey) {
		setSource(source);
		setMedia_player(media_player);
		setMedia_list_player(media_list_player);
		setFrame(frame);
		setAudio(audio);
		setAudio_capacity(audio_capacity);
		setMutex(mutex);
		set();
		setBehavior(behavior);
		setLoop(loop);
		setShuffle(shuffle);
		setPlay_pause_hotkey(play_pause_hotkey);
		setRestart_hotkey(restart_hotkey);
		setStop_hotkey(stop_hotkey);
		setPlaylist_next_hotkey(playlist_next_hotkey);
		setPlaylist_prev_hotkey(playlist_prev_hotkey);
	}
	public vlc_source() {
	}
	
	public void add_file(Object array, Object path, int network_caching, int track_index, int subtitle_index, Object subtitle_enable) {
		media_file_data data = new media_file_data();
		dstr new_path = new dstr(0);
		 new_media = new ();
		 is_url = path && .strstr(path, "://") != NULL;
		new_files.setDa(array);
		new_path.dstr_copy(path);
		if (!is_url) {
			new_path.dstr_replace("/", "\\");
		} 
		Object generatedDstr = new_path.getDstr();
		path = generatedDstr;
		Object generatedFiles = this.getFiles();
		new_media = ModernizedCProgram.get_media(generatedFiles.getDa(), path);
		if (!new_media) {
			new_media = ModernizedCProgram.get_media(new_files.getDa(), path);
		} 
		if (!new_media) {
			new_media = ModernizedCProgram.create_media_from_file(path);
		} 
		if (new_media) {
			if (is_url) {
				dstr network_caching_option = new dstr(0);
				network_caching_option.dstr_catf(":network-caching=%d", network_caching);
				.libvlc_media_add_option_(new_media, generatedDstr);
				network_caching_option.dstr_free();
			} 
			dstr track_option = new dstr(0);
			track_option.dstr_catf(":audio-track=%d", track_index - 1);
			.libvlc_media_add_option_(new_media, generatedDstr);
			track_option.dstr_free();
			dstr sub_option = new dstr(0);
			if (subtitle_enable) {
				sub_option.dstr_catf(":sub-track=%d", subtitle_index - 1);
			} 
			.libvlc_media_add_option_(new_media, generatedDstr);
			sub_option.dstr_free();
			data.setPath(generatedDstr);
			data.setMedia(new_media);
			.da_push_back(new_files, data);
		} else {
				new_path.dstr_free();
		} 
		array = new_files.getDa();
		image_file_data data = new image_file_data();
		obs_source_t new_source = new obs_source_t();
		new_files.setDa(array);
		Object generatedMutex = ss.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedFiles = ss.getFiles();
		obs_source obs_source = new obs_source();
		new_source = obs_source.get_source(generatedFiles.getDa(), path);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		if (!new_source) {
			new_source = obs_source.get_source(new_files.getDa(), path);
		} 
		obs_source obs_source = new obs_source();
		if (!new_source) {
			new_source = obs_source.create_source_from_file(path);
		} 
		Object generatedMem_usage = ss.getMem_usage();
		if (new_source) {
			 new_cx = new_source.obs_source_get_width();
			 new_cy = new_source.obs_source_get_height();
			data.setPath(ModernizedCProgram.bstrdup(path));
			data.setSource(new_source);
			.da_push_back(new_files, data);
			if (new_cx > cx) {
				cx = new_cx;
			} 
			if (new_cy > cy) {
				cy = new_cy;
			} 
			Object source_data = ModernizedCProgram.obs_obj_get_data(new_source);
			generatedMem_usage += ModernizedCProgram.image_source_get_memory_usage(source_data);
		} 
		array = new_files.getDa();
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getMedia_player() {
		return media_player;
	}
	public void setMedia_player(Object newMedia_player) {
		media_player = newMedia_player;
	}
	public Object getMedia_list_player() {
		return media_list_player;
	}
	public void setMedia_list_player(Object newMedia_list_player) {
		media_list_player = newMedia_list_player;
	}
	public obs_source_frame getFrame() {
		return frame;
	}
	public void setFrame(obs_source_frame newFrame) {
		frame = newFrame;
	}
	public obs_source_audio getAudio() {
		return audio;
	}
	public void setAudio(obs_source_audio newAudio) {
		audio = newAudio;
	}
	public Object getAudio_capacity() {
		return audio_capacity;
	}
	public void setAudio_capacity(Object newAudio_capacity) {
		audio_capacity = newAudio_capacity;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public behavior getBehavior() {
		return behavior;
	}
	public void setBehavior(behavior newBehavior) {
		behavior = newBehavior;
	}
	public Object getLoop() {
		return loop;
	}
	public void setLoop(Object newLoop) {
		loop = newLoop;
	}
	public Object getShuffle() {
		return shuffle;
	}
	public void setShuffle(Object newShuffle) {
		shuffle = newShuffle;
	}
	public Object getPlay_pause_hotkey() {
		return play_pause_hotkey;
	}
	public void setPlay_pause_hotkey(Object newPlay_pause_hotkey) {
		play_pause_hotkey = newPlay_pause_hotkey;
	}
	public Object getRestart_hotkey() {
		return restart_hotkey;
	}
	public void setRestart_hotkey(Object newRestart_hotkey) {
		restart_hotkey = newRestart_hotkey;
	}
	public Object getStop_hotkey() {
		return stop_hotkey;
	}
	public void setStop_hotkey(Object newStop_hotkey) {
		stop_hotkey = newStop_hotkey;
	}
	public Object getPlaylist_next_hotkey() {
		return playlist_next_hotkey;
	}
	public void setPlaylist_next_hotkey(Object newPlaylist_next_hotkey) {
		playlist_next_hotkey = newPlaylist_next_hotkey;
	}
	public Object getPlaylist_prev_hotkey() {
		return playlist_prev_hotkey;
	}
	public void setPlaylist_prev_hotkey(Object newPlaylist_prev_hotkey) {
		playlist_prev_hotkey = newPlaylist_prev_hotkey;
	}
}
