package application;

/*
Copyright (C) 2014 by Leonhard Oelke <leonhard@in-verted.de>

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
*/
/**
 * @file
 * @brief header for audio controls
 *
 * @brief Audio controls for use in GUIs
 */
/**
 * @brief Fader types
 */
public enum obs_fader_type {
	OBS_FADER_CUBIC, 
	OBS_FADER_IEC, 
	OBS_FADER_LOG
}
/**
	 * @brief A simple cubic fader for controlling audio levels
	 *
	 * This is a very common type of software fader since it yields good
	 * results while being quite performant.
	 * The input value is mapped to mul values with the simple formula x^3.
	 */
/**
	 * @brief A fader compliant to IEC 60-268-18
	 *
	 * This type of fader has several segments with different slopes that
	 * map deflection linearly to dB values. The segments are defined as
	 * in the following table:
	 *
	@code
	Deflection           | Volume
	------------------------------------------
	[ 100   %, 75   % ]  | [   0 dB,   -9 dB ]
	[  75   %, 50   % ]  | [  -9 dB,  -20 dB ]
	[  50   %, 30   % ]  | [ -20 dB,  -30 dB ]
	[  30   %, 15   % ]  | [ -30 dB,  -40 dB ]
	[  15   %,  7.5 % ]  | [ -40 dB,  -50 dB ]
	[   7.5 %,  2.5 % ]  | [ -50 dB,  -60 dB ]
	[   2.5 %,  0   % ]  | [ -60 dB, -inf dB ]
	@endcode
	 */
