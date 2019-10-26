package application;

/*
    Copyright (C) 2005, 2006 2008, 2012 Rocky Bernstein <rocky@gnu.org>

    See also rock.c by Eric Youngdale (1993) from GNU/Linux 
    This is Copyright 1993 Yggdrasil Computing, Incorporated

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
   \file rock.h 
   \brief Things related to the Rock Ridge Interchange Protocol (RRIP)

   Applications will probably not include this directly but via 
   the iso9660.h header.
*/
/* __cplusplus */
/*! An enumeration for some of the ISO_ROCK_* \#defines below. This isn't
  really an enumeration one would really use in a program it is to
  be helpful in debuggers where wants just to refer to the ISO_ROCK_*
  names and get something.
*/
public enum iso_rock_enums {
	ISO_ROCK_IRUSR, 
	ISO_ROCK_IWUSR, 
	ISO_ROCK_IXUSR, 
	ISO_ROCK_IRGRP, 
	ISO_ROCK_IWGRP, 
	ISO_ROCK_IXGRP, 
	ISO_ROCK_IROTH, 
	ISO_ROCK_IWOTH, 
	ISO_ROCK_IXOTH, 
	ISO_ROCK_ISUID, 
	ISO_ROCK_ISGID, 
	ISO_ROCK_ISVTX, 
	ISO_ROCK_ISSOCK, 
	ISO_ROCK_ISLNK, 
	ISO_ROCK_ISREG, 
	ISO_ROCK_ISBLK, 
	ISO_ROCK_ISCHR, 
	ISO_ROCK_ISDIR, 
	ISO_ROCK_ISFIFO
}
