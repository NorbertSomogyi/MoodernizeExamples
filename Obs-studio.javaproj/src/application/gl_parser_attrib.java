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
 *   Parses shaders into GLSL.  Shaders are almost identical to HLSL
 * model 5 so it requires quite a bit of tweaking to convert correctly.
 * Takes the parsed shader data, and builds a GLSL string out of it.
 */
public class gl_parser_attrib {
	private dstr name;
	private Object mapping;
	private Object input;
	
	public gl_parser_attrib(dstr name, Object mapping, Object input) {
		setName(name);
		setMapping(mapping);
		setInput(input);
	}
	public gl_parser_attrib() {
	}
	
	public void gl_parser_attrib_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(attr, 0, /*Error: Unsupported expression*/);
	}
	public void gl_parser_attrib_free() {
		dstr generatedName = this.getName();
		generatedName.dstr_free();
	}
	public dstr getName() {
		return name;
	}
	public void setName(dstr newName) {
		name = newName;
	}
	public Object getMapping() {
		return mapping;
	}
	public void setMapping(Object newMapping) {
		mapping = newMapping;
	}
	public Object getInput() {
		return input;
	}
	public void setInput(Object newInput) {
		input = newInput;
	}
}
