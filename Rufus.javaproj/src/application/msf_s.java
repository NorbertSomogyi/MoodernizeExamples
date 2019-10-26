package application;

/*
    Copyright (C) 2002, 2003, 2004, 2005, 2006, 2008, 2012, 2017
                  Rocky Bernstein <rocky@gnu.org>
    Copyright (C) 2000 Herbert Valerio Riedel <hvr@gnu.org>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/** \file types.h
 *  \brief  Common type definitions used pervasively in libcdio.
 */
/* __cplusplus */
/* If <sys/types.h> is not available on your platform please
   contact the libcdio mailing list so that we can fix it! */
/* If <stdint.h> is not available on your platform please
   contact the libcdio mailing list so that we can fix it!
   For MSVC, you can find both a public domain stdint.h and
   inttypes.h in the MSVC/missing directory of libcdio. */
/* MSVC does not define mode_t and ssize_t by default. The way
   to compensate for missing UNIX types is to include a custom
   unistd.h that defines them. Such a file is provided with
   the libcdio source, in the MSVC/missing directory */
/* default HP/UX macros are broken */
/* if it's still not defined, take a good guess... should work for
     most 32bit and 64bit archs */
/* All the stdbool.h seem to define those */
/* All the stdbool.h seem to define those */
/* __bool_true_false_are_defined */
/*C++*/
/* some GCC optimizations -- gcc 2.5+ */
/* !__GNUC__ */
/* !__GNUC__ */
/* should work with GCC > 4.0 clang and most EDG-frontend based C
        and C++ compilers */
/* neither gcc nor _Pragma() available... */
/* ...so let's be naive and hope the regression testsuite is run... */
/*
   * user directed static branch prediction gcc 2.96+
   */
/** Provide a notice for deprecated elements. Before gcc 4.5 'deprecated'
   takes no arguments. */
/** our own offsetof()-like macro */
/*!
    \brief MSF (minute/second/frame) structure

    One CD-ROMs addressing scheme especially used in audio formats
    (Red Book) is an address by minute, sector and frame which
    BCD-encoded in three bytes. An alternative format is an lba_t.

    Note: the fields in this structure are BCD encoded. Use
    cdio_to_bcd8() or cdio_from_bcd8() to convert an integer into or
    out of this format. The format specifier %x (not %d) can be used
    if you need to format or print values in this structure.

    @see lba_t
  */
public class msf_s {
	private Object m;
	private Object s;
	private Object f;
	
	public msf_s(Object m, Object s, Object f) {
		setM(m);
		setS(s);
		setF(f);
	}
	public msf_s() {
	}
	
	public Object getM() {
		return m;
	}
	public void setM(Object newM) {
		m = newM;
	}
	public Object getS() {
		return s;
	}
	public void setS(Object newS) {
		s = newS;
	}
	public Object getF() {
		return f;
	}
	public void setF(Object newF) {
		f = newF;
	}
}
/*!
    \brief UTF-8 char definition

    Type to denote UTF-8 strings.
  */
