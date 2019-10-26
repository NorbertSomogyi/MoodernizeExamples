package application;

public class RTMP_LNK {
	private Object streams;
	private int nStreams;
	private int curStreamIdx;
	private int playingStreams;
	private AVal hostname;
	private AVal sockshost;
	private AVal tcUrl;
	private AVal swfUrl;
	private AVal pageUrl;
	private AVal app;
	private AVal auth;
	private AVal flashVer;
	private AVal subscribepath;
	private AVal usherToken;
	private AVal token;
	private AVal pubUser;
	private AVal pubPasswd;
	private AMFObject extras;
	private int edepth;
	private int seekTime;
	private int stopTime;
	private int lFlags;
	private int swfAge;
	private int protocol;
	private int timeout;
	private int pFlags;
	private int socksport;
	private int port;
	private Object dh;
	private Object rc4keyIn;
	private Object rc4keyOut;
	private Object SWFSize;
	private Object SWFHash;
	private Object SWFVerificationResponse;
	
	public RTMP_LNK(Object streams, int nStreams, int curStreamIdx, int playingStreams, AVal hostname, AVal sockshost, AVal tcUrl, AVal swfUrl, AVal pageUrl, AVal app, AVal auth, AVal flashVer, AVal subscribepath, AVal usherToken, AVal token, AVal pubUser, AVal pubPasswd, AMFObject extras, int edepth, int seekTime, int stopTime, int lFlags, int swfAge, int protocol, int timeout, int pFlags, int socksport, int port, Object dh, Object rc4keyIn, Object rc4keyOut, Object SWFSize, Object SWFHash, Object SWFVerificationResponse) {
		setStreams(streams);
		setNStreams(nStreams);
		setCurStreamIdx(curStreamIdx);
		setPlayingStreams(playingStreams);
		setHostname(hostname);
		setSockshost(sockshost);
		setTcUrl(tcUrl);
		setSwfUrl(swfUrl);
		setPageUrl(pageUrl);
		setApp(app);
		setAuth(auth);
		setFlashVer(flashVer);
		setSubscribepath(subscribepath);
		setUsherToken(usherToken);
		setToken(token);
		setPubUser(pubUser);
		setPubPasswd(pubPasswd);
		setExtras(extras);
		setEdepth(edepth);
		setSeekTime(seekTime);
		setStopTime(stopTime);
		setLFlags(lFlags);
		setSwfAge(swfAge);
		setProtocol(protocol);
		setTimeout(timeout);
		setPFlags(pFlags);
		setSocksport(socksport);
		setPort(port);
		setDh(dh);
		setRc4keyIn(rc4keyIn);
		setRc4keyOut(rc4keyOut);
		setSWFSize(SWFSize);
		setSWFHash(SWFHash);
		setSWFVerificationResponse(SWFVerificationResponse);
	}
	public RTMP_LNK() {
	}
	
	public Object getStreams() {
		return streams;
	}
	public void setStreams(Object newStreams) {
		streams = newStreams;
	}
	public int getNStreams() {
		return nStreams;
	}
	public void setNStreams(int newNStreams) {
		nStreams = newNStreams;
	}
	public int getCurStreamIdx() {
		return curStreamIdx;
	}
	public void setCurStreamIdx(int newCurStreamIdx) {
		curStreamIdx = newCurStreamIdx;
	}
	public int getPlayingStreams() {
		return playingStreams;
	}
	public void setPlayingStreams(int newPlayingStreams) {
		playingStreams = newPlayingStreams;
	}
	public AVal getHostname() {
		return hostname;
	}
	public void setHostname(AVal newHostname) {
		hostname = newHostname;
	}
	public AVal getSockshost() {
		return sockshost;
	}
	public void setSockshost(AVal newSockshost) {
		sockshost = newSockshost;
	}
	public AVal getTcUrl() {
		return tcUrl;
	}
	public void setTcUrl(AVal newTcUrl) {
		tcUrl = newTcUrl;
	}
	public AVal getSwfUrl() {
		return swfUrl;
	}
	public void setSwfUrl(AVal newSwfUrl) {
		swfUrl = newSwfUrl;
	}
	public AVal getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(AVal newPageUrl) {
		pageUrl = newPageUrl;
	}
	public AVal getApp() {
		return app;
	}
	public void setApp(AVal newApp) {
		app = newApp;
	}
	public AVal getAuth() {
		return auth;
	}
	public void setAuth(AVal newAuth) {
		auth = newAuth;
	}
	public AVal getFlashVer() {
		return flashVer;
	}
	public void setFlashVer(AVal newFlashVer) {
		flashVer = newFlashVer;
	}
	public AVal getSubscribepath() {
		return subscribepath;
	}
	public void setSubscribepath(AVal newSubscribepath) {
		subscribepath = newSubscribepath;
	}
	public AVal getUsherToken() {
		return usherToken;
	}
	public void setUsherToken(AVal newUsherToken) {
		usherToken = newUsherToken;
	}
	public AVal getToken() {
		return token;
	}
	public void setToken(AVal newToken) {
		token = newToken;
	}
	public AVal getPubUser() {
		return pubUser;
	}
	public void setPubUser(AVal newPubUser) {
		pubUser = newPubUser;
	}
	public AVal getPubPasswd() {
		return pubPasswd;
	}
	public void setPubPasswd(AVal newPubPasswd) {
		pubPasswd = newPubPasswd;
	}
	public AMFObject getExtras() {
		return extras;
	}
	public void setExtras(AMFObject newExtras) {
		extras = newExtras;
	}
	public int getEdepth() {
		return edepth;
	}
	public void setEdepth(int newEdepth) {
		edepth = newEdepth;
	}
	public int getSeekTime() {
		return seekTime;
	}
	public void setSeekTime(int newSeekTime) {
		seekTime = newSeekTime;
	}
	public int getStopTime() {
		return stopTime;
	}
	public void setStopTime(int newStopTime) {
		stopTime = newStopTime;
	}
	public int getLFlags() {
		return lFlags;
	}
	public void setLFlags(int newLFlags) {
		lFlags = newLFlags;
	}
	public int getSwfAge() {
		return swfAge;
	}
	public void setSwfAge(int newSwfAge) {
		swfAge = newSwfAge;
	}
	public int getProtocol() {
		return protocol;
	}
	public void setProtocol(int newProtocol) {
		protocol = newProtocol;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int newTimeout) {
		timeout = newTimeout;
	}
	public int getPFlags() {
		return pFlags;
	}
	public void setPFlags(int newPFlags) {
		pFlags = newPFlags;
	}
	public int getSocksport() {
		return socksport;
	}
	public void setSocksport(int newSocksport) {
		socksport = newSocksport;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
	public Object getDh() {
		return dh;
	}
	public void setDh(Object newDh) {
		dh = newDh;
	}
	public Object getRc4keyIn() {
		return rc4keyIn;
	}
	public void setRc4keyIn(Object newRc4keyIn) {
		rc4keyIn = newRc4keyIn;
	}
	public Object getRc4keyOut() {
		return rc4keyOut;
	}
	public void setRc4keyOut(Object newRc4keyOut) {
		rc4keyOut = newRc4keyOut;
	}
	public Object getSWFSize() {
		return SWFSize;
	}
	public void setSWFSize(Object newSWFSize) {
		SWFSize = newSWFSize;
	}
	public Object getSWFHash() {
		return SWFHash;
	}
	public void setSWFHash(Object newSWFHash) {
		SWFHash = newSWFHash;
	}
	public Object getSWFVerificationResponse() {
		return SWFVerificationResponse;
	}
	public void setSWFVerificationResponse(Object newSWFVerificationResponse) {
		SWFVerificationResponse = newSWFVerificationResponse;
	}
}
