package application;

public class ddraw_offsets {
	private Object surface_create;
	private Object surface_restore;
	private Object surface_release;
	private Object surface_unlock;
	private Object surface_blt;
	private Object surface_flip;
	private Object surface_set_palette;
	private Object palette_set_entries;
	
	public ddraw_offsets(Object surface_create, Object surface_restore, Object surface_release, Object surface_unlock, Object surface_blt, Object surface_flip, Object surface_set_palette, Object palette_set_entries) {
		setSurface_create(surface_create);
		setSurface_restore(surface_restore);
		setSurface_release(surface_release);
		setSurface_unlock(surface_unlock);
		setSurface_blt(surface_blt);
		setSurface_flip(surface_flip);
		setSurface_set_palette(surface_set_palette);
		setPalette_set_entries(palette_set_entries);
	}
	public ddraw_offsets() {
	}
	
	public Object getSurface_create() {
		return surface_create;
	}
	public void setSurface_create(Object newSurface_create) {
		surface_create = newSurface_create;
	}
	public Object getSurface_restore() {
		return surface_restore;
	}
	public void setSurface_restore(Object newSurface_restore) {
		surface_restore = newSurface_restore;
	}
	public Object getSurface_release() {
		return surface_release;
	}
	public void setSurface_release(Object newSurface_release) {
		surface_release = newSurface_release;
	}
	public Object getSurface_unlock() {
		return surface_unlock;
	}
	public void setSurface_unlock(Object newSurface_unlock) {
		surface_unlock = newSurface_unlock;
	}
	public Object getSurface_blt() {
		return surface_blt;
	}
	public void setSurface_blt(Object newSurface_blt) {
		surface_blt = newSurface_blt;
	}
	public Object getSurface_flip() {
		return surface_flip;
	}
	public void setSurface_flip(Object newSurface_flip) {
		surface_flip = newSurface_flip;
	}
	public Object getSurface_set_palette() {
		return surface_set_palette;
	}
	public void setSurface_set_palette(Object newSurface_set_palette) {
		surface_set_palette = newSurface_set_palette;
	}
	public Object getPalette_set_entries() {
		return palette_set_entries;
	}
	public void setPalette_set_entries(Object newPalette_set_entries) {
		palette_set_entries = newPalette_set_entries;
	}
}
