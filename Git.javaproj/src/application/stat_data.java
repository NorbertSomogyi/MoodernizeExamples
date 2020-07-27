package application;

public class stat_data {
	private cache_time sd_ctime;
	private cache_time sd_mtime;
	private int sd_dev;
	private int sd_ino;
	private int sd_uid;
	private int sd_gid;
	private int sd_size;
	
	public stat_data(cache_time sd_ctime, cache_time sd_mtime, int sd_dev, int sd_ino, int sd_uid, int sd_gid, int sd_size) {
		setSd_ctime(sd_ctime);
		setSd_mtime(sd_mtime);
		setSd_dev(sd_dev);
		setSd_ino(sd_ino);
		setSd_uid(sd_uid);
		setSd_gid(sd_gid);
		setSd_size(sd_size);
	}
	public stat_data() {
	}
	
	public void stat_data_to_disk(Object from) {
		cache_time generatedSd_ctime = this.getSd_ctime();
		generatedSd_ctime.setSec(/*Error: Function owner not recognized*/htonl(from.getSd_ctime().getSec()));
		Object generatedNsec = generatedSd_ctime.getNsec();
		generatedSd_ctime.setNsec(/*Error: Function owner not recognized*/htonl(generatedNsec));
		cache_time generatedSd_mtime = this.getSd_mtime();
		generatedSd_mtime.setSec(/*Error: Function owner not recognized*/htonl(from.getSd_mtime().getSec()));
		generatedSd_mtime.setNsec(/*Error: Function owner not recognized*/htonl(generatedNsec));
		this.setSd_dev(/*Error: Function owner not recognized*/htonl(from.getSd_dev()));
		this.setSd_ino(/*Error: Function owner not recognized*/htonl(from.getSd_ino()));
		this.setSd_uid(/*Error: Function owner not recognized*/htonl(from.getSd_uid()));
		this.setSd_gid(/*Error: Function owner not recognized*/htonl(from.getSd_gid()));
		this.setSd_size(/*Error: Function owner not recognized*/htonl(from.getSd_size()));
	}
	public void stat_data_from_disk(Object data) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(to, data, /*Error: sizeof expression not supported yet*/);
		cache_time generatedSd_ctime = this.getSd_ctime();
		Object generatedSec = generatedSd_ctime.getSec();
		generatedSd_ctime.setSec(/*Error: Function owner not recognized*/ntohl(generatedSec));
		Object generatedNsec = generatedSd_ctime.getNsec();
		generatedSd_ctime.setNsec(/*Error: Function owner not recognized*/ntohl(generatedNsec));
		cache_time generatedSd_mtime = this.getSd_mtime();
		generatedSd_mtime.setSec(/*Error: Function owner not recognized*/ntohl(generatedSec));
		generatedSd_mtime.setNsec(/*Error: Function owner not recognized*/ntohl(generatedNsec));
		int generatedSd_dev = this.getSd_dev();
		this.setSd_dev(/*Error: Function owner not recognized*/ntohl(generatedSd_dev));
		int generatedSd_ino = this.getSd_ino();
		this.setSd_ino(/*Error: Function owner not recognized*/ntohl(generatedSd_ino));
		int generatedSd_uid = this.getSd_uid();
		this.setSd_uid(/*Error: Function owner not recognized*/ntohl(generatedSd_uid));
		int generatedSd_gid = this.getSd_gid();
		this.setSd_gid(/*Error: Function owner not recognized*/ntohl(generatedSd_gid));
		int generatedSd_size = this.getSd_size();
		this.setSd_size(/*Error: Function owner not recognized*/ntohl(generatedSd_size));
	}
	public cache_time getSd_ctime() {
		return sd_ctime;
	}
	public void setSd_ctime(cache_time newSd_ctime) {
		sd_ctime = newSd_ctime;
	}
	public cache_time getSd_mtime() {
		return sd_mtime;
	}
	public void setSd_mtime(cache_time newSd_mtime) {
		sd_mtime = newSd_mtime;
	}
	public int getSd_dev() {
		return sd_dev;
	}
	public void setSd_dev(int newSd_dev) {
		sd_dev = newSd_dev;
	}
	public int getSd_ino() {
		return sd_ino;
	}
	public void setSd_ino(int newSd_ino) {
		sd_ino = newSd_ino;
	}
	public int getSd_uid() {
		return sd_uid;
	}
	public void setSd_uid(int newSd_uid) {
		sd_uid = newSd_uid;
	}
	public int getSd_gid() {
		return sd_gid;
	}
	public void setSd_gid(int newSd_gid) {
		sd_gid = newSd_gid;
	}
	public int getSd_size() {
		return sd_size;
	}
	public void setSd_size(int newSd_size) {
		sd_size = newSd_size;
	}
}
