package application;

/* Bin types, widths and sizes */
/* The global malloc_state used for all non-"mspace" calls */
public class malloc_state {
	private Object smallmap;
	private Object treemap;
	private Object dvsize;
	private Object topsize;
	private Byte least_addr;
	private Object dv;
	private Object top;
	private Object trim_check;
	private Object release_checks;
	private Object magic;
	private Object smallbins;
	private Object treebins;
	private Object footprint;
	private Object max_footprint;
	private Object mflags;
	private malloc_segment seg;
	private Object extp;
	private Object exts;
	
	public malloc_state(Object smallmap, Object treemap, Object dvsize, Object topsize, Byte least_addr, Object dv, Object top, Object trim_check, Object release_checks, Object magic, Object smallbins, Object treebins, Object footprint, Object max_footprint, Object mflags, malloc_segment seg, Object extp, Object exts) {
		setSmallmap(smallmap);
		setTreemap(treemap);
		setDvsize(dvsize);
		setTopsize(topsize);
		setLeast_addr(least_addr);
		setDv(dv);
		setTop(top);
		setTrim_check(trim_check);
		setRelease_checks(release_checks);
		setMagic(magic);
		setSmallbins(smallbins);
		setTreebins(treebins);
		setFootprint(footprint);
		setMax_footprint(max_footprint);
		setMflags(mflags);
		setSeg(seg);
		setExtp(extp);
		setExts(exts);
	}
	public malloc_state() {
	}
	
	public Object getSmallmap() {
		return smallmap;
	}
	public void setSmallmap(Object newSmallmap) {
		smallmap = newSmallmap;
	}
	public Object getTreemap() {
		return treemap;
	}
	public void setTreemap(Object newTreemap) {
		treemap = newTreemap;
	}
	public Object getDvsize() {
		return dvsize;
	}
	public void setDvsize(Object newDvsize) {
		dvsize = newDvsize;
	}
	public Object getTopsize() {
		return topsize;
	}
	public void setTopsize(Object newTopsize) {
		topsize = newTopsize;
	}
	public Byte getLeast_addr() {
		return least_addr;
	}
	public void setLeast_addr(Byte newLeast_addr) {
		least_addr = newLeast_addr;
	}
	public Object getDv() {
		return dv;
	}
	public void setDv(Object newDv) {
		dv = newDv;
	}
	public Object getTop() {
		return top;
	}
	public void setTop(Object newTop) {
		top = newTop;
	}
	public Object getTrim_check() {
		return trim_check;
	}
	public void setTrim_check(Object newTrim_check) {
		trim_check = newTrim_check;
	}
	public Object getRelease_checks() {
		return release_checks;
	}
	public void setRelease_checks(Object newRelease_checks) {
		release_checks = newRelease_checks;
	}
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getSmallbins() {
		return smallbins;
	}
	public void setSmallbins(Object newSmallbins) {
		smallbins = newSmallbins;
	}
	public Object getTreebins() {
		return treebins;
	}
	public void setTreebins(Object newTreebins) {
		treebins = newTreebins;
	}
	public Object getFootprint() {
		return footprint;
	}
	public void setFootprint(Object newFootprint) {
		footprint = newFootprint;
	}
	public Object getMax_footprint() {
		return max_footprint;
	}
	public void setMax_footprint(Object newMax_footprint) {
		max_footprint = newMax_footprint;
	}
	public Object getMflags() {
		return mflags;
	}
	public void setMflags(Object newMflags) {
		mflags = newMflags;
	}
	public malloc_segment getSeg() {
		return seg;
	}
	public void setSeg(malloc_segment newSeg) {
		seg = newSeg;
	}
	public Object getExtp() {
		return extp;
	}
	public void setExtp(Object newExtp) {
		extp = newExtp;
	}
	public Object getExts() {
		return exts;
	}
	public void setExts(Object newExts) {
		exts = newExts;
	}
}
/* ------------- Global malloc_state and malloc_params ------------------- */
/*
  malloc_params holds global properties, including those that can be
  dynamically set using mallopt. There is a single instance, mparams,
  initialized in init_mparams. Note that the non-zeroness of "magic"
  also serves as an initialization flag.
*/
/* !ONLY_MSPACES */
/* -------------------------- system alloc setup ------------------------- */
/* Operations on mflags */
/* page-align a size */
