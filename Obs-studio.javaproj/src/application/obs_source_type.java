package application;

/******************************************************************************
    Copyright (C) 2013-2014 by Hugh Bailey <obs.jim@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
/**
 * @file
 * @brief header for modules implementing sources.
 *
 * Sources are modules that either feed data to libobs or modify it.
 */
public enum obs_source_type {
	OBS_SOURCE_TYPE_INPUT, 
	OBS_SOURCE_TYPE_FILTER, 
	OBS_SOURCE_TYPE_TRANSITION, 
	OBS_SOURCE_TYPE_SCENE
}
