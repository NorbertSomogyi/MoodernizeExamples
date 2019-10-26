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
public class obs_hotkey_name_map_edge {
	private Object prefix_len;
	private Byte prefix;
	private Object compressed_len;
	private Object compressed_prefix;
	private obs_hotkey_name_map_node node;
	
	public obs_hotkey_name_map_edge(Object prefix_len, Byte prefix, Object compressed_len, Object compressed_prefix, obs_hotkey_name_map_node node) {
		setPrefix_len(prefix_len);
		setPrefix(prefix);
		setCompressed_len(compressed_len);
		setCompressed_prefix(compressed_prefix);
		setNode(node);
	}
	public obs_hotkey_name_map_edge() {
	}
	
	public Byte get_prefix() {
		Object generatedPrefix_len = this.getPrefix_len();
		Byte generatedPrefix = this.getPrefix();
		Object generatedCompressed_prefix = this.getCompressed_prefix();
		return generatedPrefix_len >= ( - ) ? generatedPrefix : generatedCompressed_prefix;
	}
	public void set_prefix(Object prefix, Object l) {
		Object generatedPrefix_len = this.getPrefix_len();
		((generatedPrefix_len == 0) ? (Object)0 : ._assert("e->prefix_len == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\obs-hotkey-name-map.c", 97));
		this.setCompressed_len(()l);
		Object generatedCompressed_prefix = this.getCompressed_prefix();
		if (l < ( - )) {
			.strncpy(generatedCompressed_prefix, prefix, l);
		} else {
				this.setPrefix(ModernizedCProgram.bstrdup_n(prefix, l));
		} 
	}
	public obs_hotkey_name_map_edge add_leaf(obs_hotkey_name_map_node node, Object key, Object l, int v) {
		Object generatedChildren = node.getChildren();
		obs_hotkey_name_map_edge_t e = .da_push_back_new(generatedChildren);
		e.set_prefix(key, l);
		obs_hotkey_name_map_node obs_hotkey_name_map_node = new obs_hotkey_name_map_node();
		e.setNode(obs_hotkey_name_map_node.new_leaf());
		obs_hotkey_name_map_node generatedNode = e.getNode();
		generatedNode.setVal(v);
		return e;
	}
	public void shrink_prefix(Object l) {
		Object generatedPrefix_len = this.getPrefix_len();
		 old_comp = generatedPrefix_len < ( - );
		 new_comp = l < ( - );
		byte str = e.get_prefix();
		this.setPrefix_len(()l);
		if (e.get_prefix() != str) {
			.strncpy(e.get_prefix(), str, l);
		} else {
				str[l] = 0;
		} 
		if (!old_comp && new_comp) {
			ModernizedCProgram.bfree(str);
		} 
	}
	public void reduce_edge(Object key, Object l, int v) {
		byte str = e.get_prefix();
		byte str_ = key;
		size_t common_length = 0;
		while (str == str_) {
			common_length += 1;
			str += 1;
			str_ += 1;
		}
		obs_hotkey_name_map_node obs_hotkey_name_map_node = new obs_hotkey_name_map_node();
		obs_hotkey_name_map_node_t new_node_ = obs_hotkey_name_map_node.new_node();
		Object generatedChildren = new_node_.getChildren();
		obs_hotkey_name_map_edge_t tail = .da_push_back_new(generatedChildren);
		obs_hotkey_name_map_node generatedNode = this.getNode();
		ModernizedCProgram.connect(tail, generatedNode);
		Object generatedPrefix_len = this.getPrefix_len();
		tail.set_prefix(str, generatedPrefix_len - common_length);
		obs_hotkey_name_map_edge obs_hotkey_name_map_edge = new obs_hotkey_name_map_edge();
		obs_hotkey_name_map_edge.add_leaf(new_node_, str_, l - common_length, v);
		ModernizedCProgram.connect(e, new_node_);
		e.shrink_prefix(common_length);
	}
	public obs_hotkey_name_map_edge_compare_result compare_prefix(Object key, Object l) {
		Object generatedPrefix_len = this.getPrefix_len();
		 pref_len = generatedPrefix_len;
		byte str = edge.get_prefix();
		size_t i = 0;
		for (; i < l && i < pref_len; i++) {
			if (str[i] != key[i]) {
				break;
			} 
		}
		if (i != 0 && pref_len == i) {
			return l == i ? obs_hotkey_name_map_edge_compare_result.RES_MATCHES : obs_hotkey_name_map_edge_compare_result.RES_PREFIX_MATCHES;
		} 
		if (i != 0) {
			return pref_len == i ? obs_hotkey_name_map_edge_compare_result.RES_PREFIX_MATCHES : obs_hotkey_name_map_edge_compare_result.RES_COMMON_PREFIX;
		} 
		return obs_hotkey_name_map_edge_compare_result.RES_NO_MATCH;
	}
	public void free_edge() {
		obs_hotkey_name_map_node generatedNode = this.getNode();
		generatedNode.free_node(true);
		Object generatedPrefix_len = this.getPrefix_len();
		if (generatedPrefix_len < ( - )) {
			return ;
		} 
		ModernizedCProgram.bfree(edge.get_prefix());
	}
	public Object getPrefix_len() {
		return prefix_len;
	}
	public void setPrefix_len(Object newPrefix_len) {
		prefix_len = newPrefix_len;
	}
	public Byte getPrefix() {
		return prefix;
	}
	public void setPrefix(Byte newPrefix) {
		prefix = newPrefix;
	}
	public Object getCompressed_len() {
		return compressed_len;
	}
	public void setCompressed_len(Object newCompressed_len) {
		compressed_len = newCompressed_len;
	}
	public Object getCompressed_prefix() {
		return compressed_prefix;
	}
	public void setCompressed_prefix(Object newCompressed_prefix) {
		compressed_prefix = newCompressed_prefix;
	}
	public obs_hotkey_name_map_node getNode() {
		return node;
	}
	public void setNode(obs_hotkey_name_map_node newNode) {
		node = newNode;
	}
}
