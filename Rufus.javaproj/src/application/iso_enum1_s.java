package application;

/*
    Copyright (C) 2003-2008, 2012-2013, 2017
                  Rocky Bernstein <rocky@gnu.org>
    Copyright (C) 2000 Herbert Valerio Riedel <hvr@gnu.org>

    See also iso9660.h by Eric Youngdale (1993).

    Copyright 1993 Yggdrasil Computing, Incorporated

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
/*!
 * \file iso9660.h
 *
 * \brief The top-level interface header for libiso9660: the ISO-9660
 * filesystem library; applications include this.
 *
 * See also the ISO-9660 specification. The freely available European
 * equivalant standard is called ECMA-119.
*/
/** \brief ISO 9660 Integer and Character types

These are described in the section 7 of the ISO 9660 (or ECMA 119)
specification.
*/
/*! See section 7.1.1 */
/*! See section 7.1.2 */
/*! See section 7.2.1 */
/*! See section 7.2.2 */
/*! See section 7.2.3 */
/*! See section 7.3.1 */
/*! See section 7.3.2 */
/*! See section 7.3.3 */
/*! See section 7.4.1 */
/*! See section 7.4.1 */
/* This part borrowed from the bsd386 isofs */
/*! The below isn't really an enumeration one would really use in a
    program; things are done this way so that in a debugger one can to
    refer to the enumeration value names such as in a debugger
    expression and get something. With the more common a \#define
    mechanism, the name/value assocation is lost at run time.
  */
public enum iso_enum1_s {
	ISO_PVD_SECTOR, 
	ISO_EVD_SECTOR, 
	LEN_ISONAME, 
	ISO_MAX_SYSTEM_ID, 
	MAX_ISONAME, 
	ISO_MAX_PREPARER_ID, 
	MAX_ISOPATHNAME, 
	ISO_BLOCKSIZE
}
