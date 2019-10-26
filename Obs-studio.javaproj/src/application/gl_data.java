package application;

public class gl_data {
	private Object hdc;
	private Object base_cx;
	private Object base_cy;
	private Object cx;
	private Object cy;
	private Object format;
	private Object fbo;
	private boolean using_shtex;
	private boolean using_scale;
	private boolean shmem_fallback;
	private shtex_data shtex_info;
	private Object d3d11_device;
	private Object d3d11_context;
	private Object d3d11_tex;
	private Object dxgi_swap;
	private Object gl_device;
	private Object gl_dxobj;
	private Object handle;
	private Object hwnd;
	private Object texture;
	private shmem_data shmem_info;
	private int cur_tex;
	private int copy_wait;
	private Object pbos;
	private Object textures;
	private Object texture_ready;
	private Object texture_mapped;
	
	public gl_data(Object hdc, Object base_cx, Object base_cy, Object cx, Object cy, Object format, Object fbo, boolean using_shtex, boolean using_scale, boolean shmem_fallback, shtex_data shtex_info, Object d3d11_device, Object d3d11_context, Object d3d11_tex, Object dxgi_swap, Object gl_device, Object gl_dxobj, Object handle, Object hwnd, Object texture, shmem_data shmem_info, int cur_tex, int copy_wait, Object pbos, Object textures, Object texture_ready, Object texture_mapped) {
		setHdc(hdc);
		setBase_cx(base_cx);
		setBase_cy(base_cy);
		setCx(cx);
		setCy(cy);
		setFormat(format);
		setFbo(fbo);
		setUsing_shtex(using_shtex);
		setUsing_scale(using_scale);
		setShmem_fallback(shmem_fallback);
		setShtex_info(shtex_info);
		setD3d11_device(d3d11_device);
		setD3d11_context(d3d11_context);
		setD3d11_tex(d3d11_tex);
		setDxgi_swap(dxgi_swap);
		setGl_device(gl_device);
		setGl_dxobj(gl_dxobj);
		setHandle(handle);
		setHwnd(hwnd);
		setTexture(texture);
		setShmem_info(shmem_info);
		setCur_tex(cur_tex);
		setCopy_wait(copy_wait);
		setPbos(pbos);
		setTextures(textures);
		setTexture_ready(texture_ready);
		setTexture_mapped(texture_mapped);
	}
	public gl_data() {
	}
	
	public Object getHdc() {
		return hdc;
	}
	public void setHdc(Object newHdc) {
		hdc = newHdc;
	}
	public Object getBase_cx() {
		return base_cx;
	}
	public void setBase_cx(Object newBase_cx) {
		base_cx = newBase_cx;
	}
	public Object getBase_cy() {
		return base_cy;
	}
	public void setBase_cy(Object newBase_cy) {
		base_cy = newBase_cy;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public Object getFbo() {
		return fbo;
	}
	public void setFbo(Object newFbo) {
		fbo = newFbo;
	}
	public boolean getUsing_shtex() {
		return using_shtex;
	}
	public void setUsing_shtex(boolean newUsing_shtex) {
		using_shtex = newUsing_shtex;
	}
	public boolean getUsing_scale() {
		return using_scale;
	}
	public void setUsing_scale(boolean newUsing_scale) {
		using_scale = newUsing_scale;
	}
	public boolean getShmem_fallback() {
		return shmem_fallback;
	}
	public void setShmem_fallback(boolean newShmem_fallback) {
		shmem_fallback = newShmem_fallback;
	}
	public shtex_data getShtex_info() {
		return shtex_info;
	}
	public void setShtex_info(shtex_data newShtex_info) {
		shtex_info = newShtex_info;
	}
	public Object getD3d11_device() {
		return d3d11_device;
	}
	public void setD3d11_device(Object newD3d11_device) {
		d3d11_device = newD3d11_device;
	}
	public Object getD3d11_context() {
		return d3d11_context;
	}
	public void setD3d11_context(Object newD3d11_context) {
		d3d11_context = newD3d11_context;
	}
	public Object getD3d11_tex() {
		return d3d11_tex;
	}
	public void setD3d11_tex(Object newD3d11_tex) {
		d3d11_tex = newD3d11_tex;
	}
	public Object getDxgi_swap() {
		return dxgi_swap;
	}
	public void setDxgi_swap(Object newDxgi_swap) {
		dxgi_swap = newDxgi_swap;
	}
	public Object getGl_device() {
		return gl_device;
	}
	public void setGl_device(Object newGl_device) {
		gl_device = newGl_device;
	}
	public Object getGl_dxobj() {
		return gl_dxobj;
	}
	public void setGl_dxobj(Object newGl_dxobj) {
		gl_dxobj = newGl_dxobj;
	}
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public Object getHwnd() {
		return hwnd;
	}
	public void setHwnd(Object newHwnd) {
		hwnd = newHwnd;
	}
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public shmem_data getShmem_info() {
		return shmem_info;
	}
	public void setShmem_info(shmem_data newShmem_info) {
		shmem_info = newShmem_info;
	}
	public int getCur_tex() {
		return cur_tex;
	}
	public void setCur_tex(int newCur_tex) {
		cur_tex = newCur_tex;
	}
	public int getCopy_wait() {
		return copy_wait;
	}
	public void setCopy_wait(int newCopy_wait) {
		copy_wait = newCopy_wait;
	}
	public Object getPbos() {
		return pbos;
	}
	public void setPbos(Object newPbos) {
		pbos = newPbos;
	}
	public Object getTextures() {
		return textures;
	}
	public void setTextures(Object newTextures) {
		textures = newTextures;
	}
	public Object getTexture_ready() {
		return texture_ready;
	}
	public void setTexture_ready(Object newTexture_ready) {
		texture_ready = newTexture_ready;
	}
	public Object getTexture_mapped() {
		return texture_mapped;
	}
	public void setTexture_mapped(Object newTexture_mapped) {
		texture_mapped = newTexture_mapped;
	}
}
