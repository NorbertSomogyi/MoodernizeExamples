package application;

/*
 * Rufus: The Reliable USB Formatting Utility
 * Process search functionality
 *
 * Modified from Process Hacker:
 *   https://github.com/processhacker2/processhacker2/
 * Copyright © 2017-2019 Pete Batard <pete@akeo.ie>
 * Copyright © 2017 dmex
 * Copyright © 2009-2016 wj32
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//#define STATUS_INVALID_HANDLE			((NTSTATUS)0xC0000008L)
// MinGW doesn't know this one yet
public class _SYSTEM_HANDLE_TABLE_ENTRY_INFO_EX {
	private Object Object;
	private Object UniqueProcessId;
	private Object HandleValue;
	private Object GrantedAccess;
	private Object CreatorBackTraceIndex;
	private Object ObjectTypeIndex;
	private Object HandleAttributes;
	private Object Reserved;
	
	public _SYSTEM_HANDLE_TABLE_ENTRY_INFO_EX(Object Object, Object UniqueProcessId, Object HandleValue, Object GrantedAccess, Object CreatorBackTraceIndex, Object ObjectTypeIndex, Object HandleAttributes, Object Reserved) {
		setObject(Object);
		setUniqueProcessId(UniqueProcessId);
		setHandleValue(HandleValue);
		setGrantedAccess(GrantedAccess);
		setCreatorBackTraceIndex(CreatorBackTraceIndex);
		setObjectTypeIndex(ObjectTypeIndex);
		setHandleAttributes(HandleAttributes);
		setReserved(Reserved);
	}
	public _SYSTEM_HANDLE_TABLE_ENTRY_INFO_EX() {
	}
	
	public Object getObject() {
		return Object;
	}
	public void setObject(Object newObject) {
		Object = newObject;
	}
	public Object getUniqueProcessId() {
		return UniqueProcessId;
	}
	public void setUniqueProcessId(Object newUniqueProcessId) {
		UniqueProcessId = newUniqueProcessId;
	}
	public Object getHandleValue() {
		return HandleValue;
	}
	public void setHandleValue(Object newHandleValue) {
		HandleValue = newHandleValue;
	}
	public Object getGrantedAccess() {
		return GrantedAccess;
	}
	public void setGrantedAccess(Object newGrantedAccess) {
		GrantedAccess = newGrantedAccess;
	}
	public Object getCreatorBackTraceIndex() {
		return CreatorBackTraceIndex;
	}
	public void setCreatorBackTraceIndex(Object newCreatorBackTraceIndex) {
		CreatorBackTraceIndex = newCreatorBackTraceIndex;
	}
	public Object getObjectTypeIndex() {
		return ObjectTypeIndex;
	}
	public void setObjectTypeIndex(Object newObjectTypeIndex) {
		ObjectTypeIndex = newObjectTypeIndex;
	}
	public Object getHandleAttributes() {
		return HandleAttributes;
	}
	public void setHandleAttributes(Object newHandleAttributes) {
		HandleAttributes = newHandleAttributes;
	}
	public Object getReserved() {
		return Reserved;
	}
	public void setReserved(Object newReserved) {
		Reserved = newReserved;
	}
}
