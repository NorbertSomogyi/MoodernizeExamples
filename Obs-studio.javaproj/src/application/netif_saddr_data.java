package application;

public class netif_saddr_data {
	private Object ;
	
	public netif_saddr_data(Object ) {
		set();
	}
	public netif_saddr_data() {
	}
	
	public void netif_saddr_data_free() {
		for (size_t i = 0;
		 i < ModernizedCProgram.data.getAddrs().getNum(); i++) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getAddrs().getArray()[i].getName());
			ModernizedCProgram.bfree(ModernizedCProgram.data.getAddrs().getArray()[i].getAddr());
		}
		.da_free(ModernizedCProgram.data.getAddrs());
	}
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
	public void netif_saddr_data_push_back(Object ip, Object adapter) {
		netif_saddr_item item = new netif_saddr_item();
		dstr full_name = new dstr(0);
		byte ip_dup = ModernizedCProgram.bstrdup(ip);
		if (adapter && adapter) {
			full_name.dstr_printf("[%s] %s", adapter, ip);
		} else {
				full_name.dstr_copy(ip);
		} 
		Object generatedDstr = full_name.getDstr();
		item.setName(generatedDstr);
		item.setAddr(ip_dup);
		Object generatedAddrs = this.getAddrs();
		.da_push_back(generatedAddrs, item);
	}
	public void netif_log_saddrs() {
		Object generatedAddrs = this.getAddrs();
		for (size_t i = 0;
		 i < generatedAddrs.getNum(); i++) {
			ModernizedCProgram.blog(LOG_INFO, "[net if] \t\t%s", generatedAddrs.getArray()[i].getName());
		}
	}
	public void netif_get_addrs_win32() {
		 adapter = ModernizedCProgram.get_adapters();
		 unicast = ((Object)0);
		 cur_adap = ((Object)0);
		SOCKET_ADDRESS socket_addr = new SOCKET_ADDRESS();
		int family;
		if (!adapter) {
			return ;
		} 
		Object generatedLpSockaddr = socket_addr.getLpSockaddr();
		for (cur_adap = adapter; !!cur_adap; cur_adap = cur_adap.getNext()) {
			byte adap_name = ((Object)0);
			if (cur_adap.getOperStatus() != IfOperStatusUp || cur_adap.getIfType() == 24) {
				continue;
			} 
			ModernizedCProgram.os_wcs_to_utf8_ptr(cur_adap.getFriendlyName(), 0, adap_name);
			unicast = cur_adap.getFirstUnicastAddress();
			for (; !!unicast; unicast = unicast.getNext()) {
				socket_addr = unicast.getAddress();
				family = generatedLpSockaddr.getSa_family();
				if (family == 2 || family == 23) {
					ModernizedCProgram.netif_push(generatedLpSockaddr, ifaddrs, adap_name);
				} 
			}
			ModernizedCProgram.bfree(adap_name);
		}
		ModernizedCProgram.bfree(adapter);
	}
	public void netif_get_addrs() {
		Object generatedAddrs = this.getAddrs();
		.da_init(generatedAddrs);
		ifaddrs.netif_get_addrs_win32();
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
