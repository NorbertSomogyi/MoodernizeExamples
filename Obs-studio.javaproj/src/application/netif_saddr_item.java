package application;

/******************************************************************************
    Copyright (C) 2016 B. Lee <bl4@postpile.net>

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
//_GNU_SOURCE
//__FreeBSD__
public class netif_saddr_item {
	private Byte name;
	private Byte addr;
	
	public netif_saddr_item(Byte name, Byte addr) {
		setName(name);
		setAddr(addr);
	}
	public netif_saddr_item() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getAddr() {
		return addr;
	}
	public void setAddr(Byte newAddr) {
		addr = newAddr;
	}
}
