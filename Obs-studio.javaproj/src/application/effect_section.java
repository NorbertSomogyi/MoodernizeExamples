package application;

/******************************************************************************
    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>

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
/*
 * Effects introduce a means of bundling together shader text into one
 * file with shared functions and parameters.  This is done because often
 * shaders must be duplicated when you need to alter minor aspects of the code
 * that cannot be done via constants.  Effects allow developers to easily
 * switch shaders and set constants that can be used between shaders.
 *
 * Effects are built via the effect parser, and shaders are automatically
 * generated for each technique's pass.
 */
/* ------------------------------------------------------------------------- */
public enum effect_section {
	EFFECT_PARAM, 
	EFFECT_TECHNIQUE, 
	EFFECT_SAMPLER, 
	EFFECT_PASS, 
	EFFECT_ANNOTATION
}
