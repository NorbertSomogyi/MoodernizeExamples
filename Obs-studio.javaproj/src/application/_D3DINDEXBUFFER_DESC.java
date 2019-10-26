package application;

/* Index Buffer Description */
public class _D3DINDEXBUFFER_DESC {
	private _D3DFORMAT Format;
	private _D3DRESOURCETYPE Type;
	private Object Usage;
	private _D3DPOOL Pool;
	private Object Size;
	
	public _D3DINDEXBUFFER_DESC(_D3DFORMAT Format, _D3DRESOURCETYPE Type, Object Usage, _D3DPOOL Pool, Object Size) {
		setFormat(Format);
		setType(Type);
		setUsage(Usage);
		setPool(Pool);
		setSize(Size);
	}
	public _D3DINDEXBUFFER_DESC() {
	}
	
	public _D3DFORMAT getFormat() {
		return Format;
	}
	public void setFormat(_D3DFORMAT newFormat) {
		Format = newFormat;
	}
	public _D3DRESOURCETYPE getType() {
		return Type;
	}
	public void setType(_D3DRESOURCETYPE newType) {
		Type = newType;
	}
	public Object getUsage() {
		return Usage;
	}
	public void setUsage(Object newUsage) {
		Usage = newUsage;
	}
	public _D3DPOOL getPool() {
		return Pool;
	}
	public void setPool(_D3DPOOL newPool) {
		Pool = newPool;
	}
	public Object getSize() {
		return Size;
	}
	public void setSize(Object newSize) {
		Size = newSize;
	}
}
