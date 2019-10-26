package application;

/******************************************************************************
    Copyright (C) 2014 by Ruwen Hahn <palana@stunned.de>

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
public class media_remux_job {
	private Object in_size;
	private Object ifmt_ctx;
	private Object ofmt_ctx;
	
	public media_remux_job(Object in_size, Object ifmt_ctx, Object ofmt_ctx) {
		setIn_size(in_size);
		setIfmt_ctx(ifmt_ctx);
		setOfmt_ctx(ofmt_ctx);
	}
	public media_remux_job() {
	}
	
	public Object getIn_size() {
		return in_size;
	}
	public void setIn_size(Object newIn_size) {
		in_size = newIn_size;
	}
	public Object getIfmt_ctx() {
		return ifmt_ctx;
	}
	public void setIfmt_ctx(Object newIfmt_ctx) {
		ifmt_ctx = newIfmt_ctx;
	}
	public Object getOfmt_ctx() {
		return ofmt_ctx;
	}
	public void setOfmt_ctx(Object newOfmt_ctx) {
		ofmt_ctx = newOfmt_ctx;
	}
}
