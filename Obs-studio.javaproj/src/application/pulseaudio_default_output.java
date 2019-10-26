package application;

/*
Copyright (C) 2014 by Leonhard Oelke <leonhard@in-verted.de>
Copyright (C) 2017 by Fabio Madia <admshao@gmail.com>

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
public class pulseaudio_default_output {
	private Byte default_sink_name;
	
	public pulseaudio_default_output(Byte default_sink_name) {
		setDefault_sink_name(default_sink_name);
	}
	public pulseaudio_default_output() {
	}
	
	public Byte getDefault_sink_name() {
		return default_sink_name;
	}
	public void setDefault_sink_name(Byte newDefault_sink_name) {
		default_sink_name = newDefault_sink_name;
	}
}
