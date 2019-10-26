package application;

/* Resize Optional Parameters */
public class _D3DPRESENT_PARAMETERS_ {
	private Object BackBufferWidth;
	private Object BackBufferHeight;
	private _D3DFORMAT BackBufferFormat;
	private Object BackBufferCount;
	private _D3DMULTISAMPLE_TYPE MultiSampleType;
	private _D3DSWAPEFFECT SwapEffect;
	private Object hDeviceWindow;
	private Object Windowed;
	private Object EnableAutoDepthStencil;
	private _D3DFORMAT AutoDepthStencilFormat;
	private Object Flags;
	private Object FullScreen_RefreshRateInHz;
	private Object FullScreen_PresentationInterval;
	
	public _D3DPRESENT_PARAMETERS_(Object BackBufferWidth, Object BackBufferHeight, _D3DFORMAT BackBufferFormat, Object BackBufferCount, _D3DMULTISAMPLE_TYPE MultiSampleType, _D3DSWAPEFFECT SwapEffect, Object hDeviceWindow, Object Windowed, Object EnableAutoDepthStencil, _D3DFORMAT AutoDepthStencilFormat, Object Flags, Object FullScreen_RefreshRateInHz, Object FullScreen_PresentationInterval) {
		setBackBufferWidth(BackBufferWidth);
		setBackBufferHeight(BackBufferHeight);
		setBackBufferFormat(BackBufferFormat);
		setBackBufferCount(BackBufferCount);
		setMultiSampleType(MultiSampleType);
		setSwapEffect(SwapEffect);
		setHDeviceWindow(hDeviceWindow);
		setWindowed(Windowed);
		setEnableAutoDepthStencil(EnableAutoDepthStencil);
		setAutoDepthStencilFormat(AutoDepthStencilFormat);
		setFlags(Flags);
		setFullScreen_RefreshRateInHz(FullScreen_RefreshRateInHz);
		setFullScreen_PresentationInterval(FullScreen_PresentationInterval);
	}
	public _D3DPRESENT_PARAMETERS_() {
	}
	
	public Object getBackBufferWidth() {
		return BackBufferWidth;
	}
	public void setBackBufferWidth(Object newBackBufferWidth) {
		BackBufferWidth = newBackBufferWidth;
	}
	public Object getBackBufferHeight() {
		return BackBufferHeight;
	}
	public void setBackBufferHeight(Object newBackBufferHeight) {
		BackBufferHeight = newBackBufferHeight;
	}
	public _D3DFORMAT getBackBufferFormat() {
		return BackBufferFormat;
	}
	public void setBackBufferFormat(_D3DFORMAT newBackBufferFormat) {
		BackBufferFormat = newBackBufferFormat;
	}
	public Object getBackBufferCount() {
		return BackBufferCount;
	}
	public void setBackBufferCount(Object newBackBufferCount) {
		BackBufferCount = newBackBufferCount;
	}
	public _D3DMULTISAMPLE_TYPE getMultiSampleType() {
		return MultiSampleType;
	}
	public void setMultiSampleType(_D3DMULTISAMPLE_TYPE newMultiSampleType) {
		MultiSampleType = newMultiSampleType;
	}
	public _D3DSWAPEFFECT getSwapEffect() {
		return SwapEffect;
	}
	public void setSwapEffect(_D3DSWAPEFFECT newSwapEffect) {
		SwapEffect = newSwapEffect;
	}
	public Object getHDeviceWindow() {
		return hDeviceWindow;
	}
	public void setHDeviceWindow(Object newHDeviceWindow) {
		hDeviceWindow = newHDeviceWindow;
	}
	public Object getWindowed() {
		return Windowed;
	}
	public void setWindowed(Object newWindowed) {
		Windowed = newWindowed;
	}
	public Object getEnableAutoDepthStencil() {
		return EnableAutoDepthStencil;
	}
	public void setEnableAutoDepthStencil(Object newEnableAutoDepthStencil) {
		EnableAutoDepthStencil = newEnableAutoDepthStencil;
	}
	public _D3DFORMAT getAutoDepthStencilFormat() {
		return AutoDepthStencilFormat;
	}
	public void setAutoDepthStencilFormat(_D3DFORMAT newAutoDepthStencilFormat) {
		AutoDepthStencilFormat = newAutoDepthStencilFormat;
	}
	public Object getFlags() {
		return Flags;
	}
	public void setFlags(Object newFlags) {
		Flags = newFlags;
	}
	public Object getFullScreen_RefreshRateInHz() {
		return FullScreen_RefreshRateInHz;
	}
	public void setFullScreen_RefreshRateInHz(Object newFullScreen_RefreshRateInHz) {
		FullScreen_RefreshRateInHz = newFullScreen_RefreshRateInHz;
	}
	public Object getFullScreen_PresentationInterval() {
		return FullScreen_PresentationInterval;
	}
	public void setFullScreen_PresentationInterval(Object newFullScreen_PresentationInterval) {
		FullScreen_PresentationInterval = newFullScreen_PresentationInterval;
	}
}
