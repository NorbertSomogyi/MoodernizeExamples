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
public enum obs_interaction_flags {
	INTERACT_NONE, 
	INTERACT_CAPS_KEY, 
	INTERACT_SHIFT_KEY, 
	INTERACT_CONTROL_KEY, 
	INTERACT_ALT_KEY, 
	INTERACT_MOUSE_LEFT, 
	INTERACT_MOUSE_MIDDLE, 
	INTERACT_MOUSE_RIGHT, 
	INTERACT_COMMAND_KEY, 
	INTERACT_NUMLOCK_KEY, 
	INTERACT_IS_KEY_PAD, 
	INTERACT_IS_LEFT, 
	INTERACT_IS_RIGHT
}
