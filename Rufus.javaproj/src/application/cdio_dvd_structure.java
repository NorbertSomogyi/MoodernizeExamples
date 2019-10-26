package application;

/*
    Copyright (C) 2004, 2010 Rocky Bernstein <rocky@gnu.org>
    Modeled after GNU/Linux definitions in linux/cdrom.h

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
/**
   \file dvd.h 
   \brief Definitions for DVD access.

   The documents we make use of are described Multi-Media Commands
   (MMC). This document generally has a numeric level number
   appended. For example MMC-5 refers to ``Multi-Media Commands - 5'
   which is the current version in 2010.

*/
/**
   Values used in a READ DVD STRUCTURE
 */
public enum cdio_dvd_structure {
	CDIO_DVD_STRUCT_PHYSICAL, 
	CDIO_DVD_STRUCT_COPYRIGHT, 
	CDIO_DVD_STRUCT_DISCKEY, 
	CDIO_DVD_STRUCT_BCA, 
	CDIO_DVD_STRUCT_MANUFACT
}
