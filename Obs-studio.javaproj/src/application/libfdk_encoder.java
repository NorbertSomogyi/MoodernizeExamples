package application;

public class libfdk_encoder {
	private obs_encoder encoder;
	private int channels;
	private int sample_rate;
	private Object fdkhandle;
	private Object info;
	private Object total_samples;
	private int frame_size_bytes;
	private Object packet_buffer;
	private int packet_buffer_size;
	
	public libfdk_encoder(obs_encoder encoder, int channels, int sample_rate, Object fdkhandle, Object info, Object total_samples, int frame_size_bytes, Object packet_buffer, int packet_buffer_size) {
		setEncoder(encoder);
		setChannels(channels);
		setSample_rate(sample_rate);
		setFdkhandle(fdkhandle);
		setInfo(info);
		setTotal_samples(total_samples);
		setFrame_size_bytes(frame_size_bytes);
		setPacket_buffer(packet_buffer);
		setPacket_buffer_size(packet_buffer_size);
	}
	public libfdk_encoder() {
	}
	
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
	public int getChannels() {
		return channels;
	}
	public void setChannels(int newChannels) {
		channels = newChannels;
	}
	public int getSample_rate() {
		return sample_rate;
	}
	public void setSample_rate(int newSample_rate) {
		sample_rate = newSample_rate;
	}
	public Object getFdkhandle() {
		return fdkhandle;
	}
	public void setFdkhandle(Object newFdkhandle) {
		fdkhandle = newFdkhandle;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object newInfo) {
		info = newInfo;
	}
	public Object getTotal_samples() {
		return total_samples;
	}
	public void setTotal_samples(Object newTotal_samples) {
		total_samples = newTotal_samples;
	}
	public int getFrame_size_bytes() {
		return frame_size_bytes;
	}
	public void setFrame_size_bytes(int newFrame_size_bytes) {
		frame_size_bytes = newFrame_size_bytes;
	}
	public Object getPacket_buffer() {
		return packet_buffer;
	}
	public void setPacket_buffer(Object newPacket_buffer) {
		packet_buffer = newPacket_buffer;
	}
	public int getPacket_buffer_size() {
		return packet_buffer_size;
	}
	public void setPacket_buffer_size(int newPacket_buffer_size) {
		packet_buffer_size = newPacket_buffer_size;
	}
}
