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
/* how obs scene! */
public class item_action {
	private Object visible;
	private Object timestamp;
	
	public item_action(Object visible, Object timestamp) {
		setVisible(visible);
		setTimestamp(timestamp);
	}
	public item_action() {
	}
	
	public Object getVisible() {
		return visible;
	}
	public void setVisible(Object newVisible) {
		visible = newVisible;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
