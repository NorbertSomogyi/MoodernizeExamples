package application;

public class re_dfa_t {
	private  nodes;
	private Object nodes_alloc;
	private Object nodes_len;
	private Integer nexts;
	private Integer org_indices;
	private  edests;
	private  eclosures;
	private  inveclosures;
	private re_state_table_entry state_table;
	private re_dfastate_t init_state;
	private re_dfastate_t init_state_word;
	private re_dfastate_t init_state_nl;
	private re_dfastate_t init_state_begbuf;
	private bin_tree_t str_tree;
	private bin_tree_storage_t str_tree_storage;
	private Object sb_char;
	private int str_tree_storage_idx;
	private int state_hash_mask;
	private int init_node;
	private int nbackref;
	private Object used_bkref_map;
	private Object completed_bkref_map;
	private int has_plural_match;
	private int has_mb_node;
	private int is_utf8;
	private int map_notascii;
	private int word_ops_used;
	private int mb_cur_max;
	private Object word_char;
	private Object syntax;
	private Integer subexp_map;
	
	public re_dfa_t( nodes, Object nodes_alloc, Object nodes_len, Integer nexts, Integer org_indices,  edests,  eclosures,  inveclosures, re_state_table_entry state_table, re_dfastate_t init_state, re_dfastate_t init_state_word, re_dfastate_t init_state_nl, re_dfastate_t init_state_begbuf, bin_tree_t str_tree, bin_tree_storage_t str_tree_storage, Object sb_char, int str_tree_storage_idx, int state_hash_mask, int init_node, int nbackref, Object used_bkref_map, Object completed_bkref_map, int has_plural_match, int has_mb_node, int is_utf8, int map_notascii, int word_ops_used, int mb_cur_max, Object word_char, Object syntax, Integer subexp_map) {
		setNodes(nodes);
		setNodes_alloc(nodes_alloc);
		setNodes_len(nodes_len);
		setNexts(nexts);
		setOrg_indices(org_indices);
		setEdests(edests);
		setEclosures(eclosures);
		setInveclosures(inveclosures);
		setState_table(state_table);
		setInit_state(init_state);
		setInit_state_word(init_state_word);
		setInit_state_nl(init_state_nl);
		setInit_state_begbuf(init_state_begbuf);
		setStr_tree(str_tree);
		setStr_tree_storage(str_tree_storage);
		setSb_char(sb_char);
		setStr_tree_storage_idx(str_tree_storage_idx);
		setState_hash_mask(state_hash_mask);
		setInit_node(init_node);
		setNbackref(nbackref);
		setUsed_bkref_map(used_bkref_map);
		setCompleted_bkref_map(completed_bkref_map);
		setHas_plural_match(has_plural_match);
		setHas_mb_node(has_mb_node);
		setIs_utf8(is_utf8);
		setMap_notascii(map_notascii);
		setWord_ops_used(word_ops_used);
		setMb_cur_max(mb_cur_max);
		setWord_char(word_char);
		setSyntax(syntax);
		setSubexp_map(subexp_map);
	}
	public re_dfa_t() {
	}
	
	public  getNodes() {
		return nodes;
	}
	public void setNodes( newNodes) {
		nodes = newNodes;
	}
	public Object getNodes_alloc() {
		return nodes_alloc;
	}
	public void setNodes_alloc(Object newNodes_alloc) {
		nodes_alloc = newNodes_alloc;
	}
	public Object getNodes_len() {
		return nodes_len;
	}
	public void setNodes_len(Object newNodes_len) {
		nodes_len = newNodes_len;
	}
	public Integer getNexts() {
		return nexts;
	}
	public void setNexts(Integer newNexts) {
		nexts = newNexts;
	}
	public Integer getOrg_indices() {
		return org_indices;
	}
	public void setOrg_indices(Integer newOrg_indices) {
		org_indices = newOrg_indices;
	}
	public  getEdests() {
		return edests;
	}
	public void setEdests( newEdests) {
		edests = newEdests;
	}
	public  getEclosures() {
		return eclosures;
	}
	public void setEclosures( newEclosures) {
		eclosures = newEclosures;
	}
	public  getInveclosures() {
		return inveclosures;
	}
	public void setInveclosures( newInveclosures) {
		inveclosures = newInveclosures;
	}
	public re_state_table_entry getState_table() {
		return state_table;
	}
	public void setState_table(re_state_table_entry newState_table) {
		state_table = newState_table;
	}
	public re_dfastate_t getInit_state() {
		return init_state;
	}
	public void setInit_state(re_dfastate_t newInit_state) {
		init_state = newInit_state;
	}
	public re_dfastate_t getInit_state_word() {
		return init_state_word;
	}
	public void setInit_state_word(re_dfastate_t newInit_state_word) {
		init_state_word = newInit_state_word;
	}
	public re_dfastate_t getInit_state_nl() {
		return init_state_nl;
	}
	public void setInit_state_nl(re_dfastate_t newInit_state_nl) {
		init_state_nl = newInit_state_nl;
	}
	public re_dfastate_t getInit_state_begbuf() {
		return init_state_begbuf;
	}
	public void setInit_state_begbuf(re_dfastate_t newInit_state_begbuf) {
		init_state_begbuf = newInit_state_begbuf;
	}
	public bin_tree_t getStr_tree() {
		return str_tree;
	}
	public void setStr_tree(bin_tree_t newStr_tree) {
		str_tree = newStr_tree;
	}
	public bin_tree_storage_t getStr_tree_storage() {
		return str_tree_storage;
	}
	public void setStr_tree_storage(bin_tree_storage_t newStr_tree_storage) {
		str_tree_storage = newStr_tree_storage;
	}
	public Object getSb_char() {
		return sb_char;
	}
	public void setSb_char(Object newSb_char) {
		sb_char = newSb_char;
	}
	public int getStr_tree_storage_idx() {
		return str_tree_storage_idx;
	}
	public void setStr_tree_storage_idx(int newStr_tree_storage_idx) {
		str_tree_storage_idx = newStr_tree_storage_idx;
	}
	public int getState_hash_mask() {
		return state_hash_mask;
	}
	public void setState_hash_mask(int newState_hash_mask) {
		state_hash_mask = newState_hash_mask;
	}
	public int getInit_node() {
		return init_node;
	}
	public void setInit_node(int newInit_node) {
		init_node = newInit_node;
	}
	public int getNbackref() {
		return nbackref;
	}
	public void setNbackref(int newNbackref) {
		nbackref = newNbackref;
	}
	public Object getUsed_bkref_map() {
		return used_bkref_map;
	}
	public void setUsed_bkref_map(Object newUsed_bkref_map) {
		used_bkref_map = newUsed_bkref_map;
	}
	public Object getCompleted_bkref_map() {
		return completed_bkref_map;
	}
	public void setCompleted_bkref_map(Object newCompleted_bkref_map) {
		completed_bkref_map = newCompleted_bkref_map;
	}
	public int getHas_plural_match() {
		return has_plural_match;
	}
	public void setHas_plural_match(int newHas_plural_match) {
		has_plural_match = newHas_plural_match;
	}
	public int getHas_mb_node() {
		return has_mb_node;
	}
	public void setHas_mb_node(int newHas_mb_node) {
		has_mb_node = newHas_mb_node;
	}
	public int getIs_utf8() {
		return is_utf8;
	}
	public void setIs_utf8(int newIs_utf8) {
		is_utf8 = newIs_utf8;
	}
	public int getMap_notascii() {
		return map_notascii;
	}
	public void setMap_notascii(int newMap_notascii) {
		map_notascii = newMap_notascii;
	}
	public int getWord_ops_used() {
		return word_ops_used;
	}
	public void setWord_ops_used(int newWord_ops_used) {
		word_ops_used = newWord_ops_used;
	}
	public int getMb_cur_max() {
		return mb_cur_max;
	}
	public void setMb_cur_max(int newMb_cur_max) {
		mb_cur_max = newMb_cur_max;
	}
	public Object getWord_char() {
		return word_char;
	}
	public void setWord_char(Object newWord_char) {
		word_char = newWord_char;
	}
	public Object getSyntax() {
		return syntax;
	}
	public void setSyntax(Object newSyntax) {
		syntax = newSyntax;
	}
	public Integer getSubexp_map() {
		return subexp_map;
	}
	public void setSubexp_map(Integer newSubexp_map) {
		subexp_map = newSubexp_map;
	}
}
