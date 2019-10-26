package application;

public class obs_audio_info {
	private Object samples_per_sec;
	private speaker_layout speakers;
	
	public obs_audio_info(Object samples_per_sec, speaker_layout speakers) {
		setSamples_per_sec(samples_per_sec);
		setSpeakers(speakers);
	}
	public obs_audio_info() {
	}
	
	public Object obs_get_audio_info() {
		obs_core_audio audio = ModernizedCProgram.obs.getAudio();
		audio_output_info info = new audio_output_info();
		Object generatedAudio = audio.getAudio();
		if (!ModernizedCProgram.obs || !oai || !generatedAudio) {
			return false;
		} 
		info = ModernizedCProgram.audio_output_get_info(generatedAudio);
		this.setSamples_per_sec(info.getAudio_output_info());
		this.setSpeakers(info.getAudio_output_info());
		return true;
	}
	public Object getSamples_per_sec() {
		return samples_per_sec;
	}
	public void setSamples_per_sec(Object newSamples_per_sec) {
		samples_per_sec = newSamples_per_sec;
	}
	public speaker_layout getSpeakers() {
		return speakers;
	}
	public void setSpeakers(speaker_layout newSpeakers) {
		speakers = newSpeakers;
	}
}
