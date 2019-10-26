package application;

/*! \brief Unix stat-like version of iso9660_dir

   The iso9660_stat structure is not part of the ISO-9660
   specification. We use it for our to communicate information
   in a C-library friendly way, e.g struct tm time structures and
   a C-style filename string.

   @see iso9660_dir
*/
/* big endian!! */
public class iso9660_stat_s {
	private Object rr;
	private tm tm;
	private Object size;
	private Object extents;
	private Object lsn;
	private Object extsize;
	private Object secsize;
	private Object xa;
	private  type;
	private Object b_xa;
	private Object filename;
	
	public iso9660_stat_s(Object rr, tm tm, Object size, Object extents, Object lsn, Object extsize, Object secsize, Object xa,  type, Object b_xa, Object filename) {
		setRr(rr);
		setTm(tm);
		setSize(size);
		setExtents(extents);
		setLsn(lsn);
		setExtsize(extsize);
		setSecsize(secsize);
		setXa(xa);
		setType(type);
		setB_xa(b_xa);
		setFilename(filename);
	}
	public iso9660_stat_s() {
	}
	
	public Object getRr() {
		return rr;
	}
	public void setRr(Object newRr) {
		rr = newRr;
	}
	public tm getTm() {
		return tm;
	}
	public void setTm(tm newTm) {
		tm = newTm;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getExtents() {
		return extents;
	}
	public void setExtents(Object newExtents) {
		extents = newExtents;
	}
	public Object getLsn() {
		return lsn;
	}
	public void setLsn(Object newLsn) {
		lsn = newLsn;
	}
	public Object getExtsize() {
		return extsize;
	}
	public void setExtsize(Object newExtsize) {
		extsize = newExtsize;
	}
	public Object getSecsize() {
		return secsize;
	}
	public void setSecsize(Object newSecsize) {
		secsize = newSecsize;
	}
	public Object getXa() {
		return xa;
	}
	public void setXa(Object newXa) {
		xa = newXa;
	}
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
	public Object getB_xa() {
		return b_xa;
	}
	public void setB_xa(Object newB_xa) {
		b_xa = newB_xa;
	}
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
}
/*! \brief Format of an ISO-9660 directory record

 Section 9.1 of ECMA 119.

 This structure may have an odd length depending on how many
 characters there are in the filename!  Some compilers (e.g. on
 Sun3/mc68020) pad the structures to an even length.  For this reason,
 we cannot use sizeof (struct iso_path_table) or sizeof (struct
 iso_directory_record) to compute on disk sizes.  Instead, we use
 offsetof(..., name) and add the name size.  See mkisofs.h of the
 cdrtools package.

  @see iso9660_stat
*/
