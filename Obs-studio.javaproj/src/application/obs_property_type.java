package application;

/******************************************************************************
    Copyright (C) 2014 by Hugh Bailey <obs.jim@gmail.com>

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
 * @brief libobs header for the properties system used in libobs
 *
 * @page properties Properties
 * @brief Platform and Toolkit independent settings implementation
 *
 * @section prop_overview_sec Overview
 *
 * libobs uses a property system which lets for example sources specify
 * settings that can be displayed to the user by the UI.
 *
 */
/** Only update when the user presses OK or Apply */
public enum obs_property_type {
	OBS_PROPERTY_INVALID, 
	OBS_PROPERTY_BOOL, 
	OBS_PROPERTY_INT, 
	OBS_PROPERTY_FLOAT, 
	OBS_PROPERTY_TEXT, 
	OBS_PROPERTY_PATH, 
	OBS_PROPERTY_LIST, 
	OBS_PROPERTY_COLOR, 
	OBS_PROPERTY_BUTTON, 
	OBS_PROPERTY_FONT, 
	OBS_PROPERTY_EDITABLE_LIST, 
	OBS_PROPERTY_FRAME_RATE, 
	OBS_PROPERTY_GROUP
}
