package application;

/*
    Copyright (C) 2003, 2004, 2005, 2006, 2008, 2012
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
/*!
   \file sector.h 
   \brief Things related to CD-ROM layout: tracks, sector sizes, MSFs, LBAs.

  A CD-ROM physical sector size is 2048, 2052, 2056, 2324, 2332, 2336,
  2340, or 2352 bytes long.

  Sector types of the standard CD-ROM data formats:

\verbatim 
  format   sector type               user data size (bytes)
  -----------------------------------------------------------------------------
    1     (Red Book)    CD-DA          2352    (CDIO_CD_FRAMESIZE_RAW)
    2     (Yellow Book) Mode1 Form1    2048    (CDIO_CD_FRAMESIZE)
    3     (Yellow Book) Mode1 Form2    2336    (M2RAW_SECTOR_SIZE)
    4     (Green Book)  Mode2 Form1    2048    (CDIO_CD_FRAMESIZE)
    5     (Green Book)  Mode2 Form2    2328    (2324+4 spare bytes)
 
 
        The layout of the standard CD-ROM data formats:
  -----------------------------------------------------------------------------
  - audio (red):                  | audio_sample_bytes |
                                  |        2352        |
 
  - data (yellow, mode1):         | sync - head - data - EDC - zero - ECC |
                                  |  12  -   4  - 2048 -  4  -   8  - 276 |
 
  - data (yellow, mode2):         | sync - head - data |
                                 |  12  -   4  - 2336 |
 
  - XA data (green, mode2 form1): | sync - head - sub - data - EDC - ECC |
                                  |  12  -   4  -  8  - 2048 -  4  - 276 |
 
  - XA data (green, mode2 form2): | sync - head - sub - data - Spare |
                                  |  12  -   4  -  8  - 2324 -  4    |
\endverbatim
 

*/
/*! Information that can be obtained through a Read Subchannel
        command.
      */
public enum cdio_subchannel {
	CDIO_SUBCHANNEL_SUBQ_DATA, 
	CDIO_SUBCHANNEL_CURRENT_POSITION, 
	CDIO_SUBCHANNEL_MEDIA_CATALOG, 
	CDIO_SUBCHANNEL_TRACK_ISRC
}
