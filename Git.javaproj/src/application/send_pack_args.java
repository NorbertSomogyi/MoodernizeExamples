package application;

public class send_pack_args {
	private Object url;
	private int verbose;
	private int quiet;
	private int porcelain;
	private int progress;
	private int send_mirror;
	private int force_update;
	private int use_thin_pack;
	private int use_ofs_delta;
	private int dry_run;
	private int push_cert;
	private int stateless_rpc;
	private int atomic;
	private Object push_options;
	
	public send_pack_args(Object url, int verbose, int quiet, int porcelain, int progress, int send_mirror, int force_update, int use_thin_pack, int use_ofs_delta, int dry_run, int push_cert, int stateless_rpc, int atomic, Object push_options) {
		setUrl(url);
		setVerbose(verbose);
		setQuiet(quiet);
		setPorcelain(porcelain);
		setProgress(progress);
		setSend_mirror(send_mirror);
		setForce_update(force_update);
		setUse_thin_pack(use_thin_pack);
		setUse_ofs_delta(use_ofs_delta);
		setDry_run(dry_run);
		setPush_cert(push_cert);
		setStateless_rpc(stateless_rpc);
		setAtomic(atomic);
		setPush_options(push_options);
	}
	public send_pack_args() {
	}
	
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getPorcelain() {
		return porcelain;
	}
	public void setPorcelain(int newPorcelain) {
		porcelain = newPorcelain;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int newProgress) {
		progress = newProgress;
	}
	public int getSend_mirror() {
		return send_mirror;
	}
	public void setSend_mirror(int newSend_mirror) {
		send_mirror = newSend_mirror;
	}
	public int getForce_update() {
		return force_update;
	}
	public void setForce_update(int newForce_update) {
		force_update = newForce_update;
	}
	public int getUse_thin_pack() {
		return use_thin_pack;
	}
	public void setUse_thin_pack(int newUse_thin_pack) {
		use_thin_pack = newUse_thin_pack;
	}
	public int getUse_ofs_delta() {
		return use_ofs_delta;
	}
	public void setUse_ofs_delta(int newUse_ofs_delta) {
		use_ofs_delta = newUse_ofs_delta;
	}
	public int getDry_run() {
		return dry_run;
	}
	public void setDry_run(int newDry_run) {
		dry_run = newDry_run;
	}
	public int getPush_cert() {
		return push_cert;
	}
	public void setPush_cert(int newPush_cert) {
		push_cert = newPush_cert;
	}
	public int getStateless_rpc() {
		return stateless_rpc;
	}
	public void setStateless_rpc(int newStateless_rpc) {
		stateless_rpc = newStateless_rpc;
	}
	public int getAtomic() {
		return atomic;
	}
	public void setAtomic(int newAtomic) {
		atomic = newAtomic;
	}
	public Object getPush_options() {
		return push_options;
	}
	public void setPush_options(Object newPush_options) {
		push_options = newPush_options;
	}
}
