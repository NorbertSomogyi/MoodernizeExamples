package application;

public class menu_stuff {
	private menu_stuff_type type;
	private int nr;
	private Object stuff;
	
	public menu_stuff(menu_stuff_type type, int nr, Object stuff) {
		setType(type);
		setNr(nr);
		setStuff(stuff);
	}
	public menu_stuff() {
	}
	
	public void print_highlight_menu_stuff(int chosen) {
		string_list menu_list = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		strbuf menu = new strbuf(, , );
		menu_item menu_item = new menu_item();
		string_list_item string_list_item = new string_list_item();
		int i;
		Object generatedStuff = this.getStuff();
		int generatedNr = this.getNr();
		Object generatedTitle = menu_item.getTitle();
		int generatedSelected = menu_item.getSelected();
		byte generatedHotkey = menu_item.getHotkey();
		byte generatedBuf = menu.getBuf();
		byte generatedString = string_list_item.getString();
		menu_stuff_type generatedType = this.getType();
		switch (generatedType) {
		case menu_stuff_type.MENU_STUFF_TYPE_MENU_ITEM:
				menu_item = (menu_item)generatedStuff;
				for (i = 0; i < generatedNr; ) {
					byte p;
					int highlighted = 0;
					p = generatedTitle;
					if ((chosen)[i] < 0) {
						(chosen)[i] = generatedSelected ? 1 : 0;
					} 
					menu.strbuf_addf("%s%2d: ", (chosen)[i] ? "*" : " ", i + 1);
					for (; p; p++) {
						if (!highlighted && p == generatedHotkey) {
							menu.strbuf_addstr(ModernizedCProgram.clean_get_color(color_clean.CLEAN_COLOR_PROMPT));
							menu.strbuf_addch(p);
							menu.strbuf_addstr(ModernizedCProgram.clean_get_color(color_clean.CLEAN_COLOR_RESET));
							highlighted = 1;
						} else {
								menu.strbuf_addch(p);
						} 
					}
					menu_list.string_list_append(generatedBuf);
					menu.strbuf_setlen(0);
				}
				break;
		case menu_stuff_type.MENU_STUFF_TYPE_STRING_LIST:
				i = 0;
				for (string_list_item = ((string_list)generatedStuff).getItems(); string_list_item && string_list_item < ((string_list)generatedStuff).getItems() + generatedNr; ++string_list_item) {
					if ((chosen)[i] < 0) {
						(chosen)[i] = 0;
					} 
					menu.strbuf_addf("%s%2d: %s", (chosen)[i] ? "*" : " ", i + 1, generatedString);
					menu_list.string_list_append(generatedBuf);
					menu.strbuf_setlen(0);
					i++;
				}
				break;
		default:
				ModernizedCProgram.die("Bad type of menu_stuff when print menu");
		}
		menu_list.pretty_print_menus();
		menu.strbuf_release();
		menu_list.string_list_clear(0);
	}
	public int find_unique(Object choice) {
		menu_item menu_item = new menu_item();
		string_list_item string_list_item = new string_list_item();
		int i;
		int len;
		int found = 0;
		len = .strlen(choice);
		Object generatedStuff = this.getStuff();
		int generatedNr = this.getNr();
		byte generatedHotkey = menu_item.getHotkey();
		Object generatedTitle = menu_item.getTitle();
		byte generatedString = string_list_item.getString();
		menu_stuff_type generatedType = this.getType();
		switch (generatedType) {
		case menu_stuff_type.MENU_STUFF_TYPE_STRING_LIST:
				string_list_item = ((string_list)generatedStuff).getItems();
				for (i = 0; i < generatedNr; ) {
					if (!.strncasecmp(choice, generatedString, len)) {
						if (found) {
							found = 0;
							break;
						} 
						found = i + 1;
					} 
				}
				break;
		case menu_stuff_type.MENU_STUFF_TYPE_MENU_ITEM:
				menu_item = (menu_item)generatedStuff;
				for (i = 0; i < generatedNr; ) {
					if (len == 1 && choice == generatedHotkey) {
						found = i + 1;
						break;
					} 
					if (!.strncasecmp(choice, generatedTitle, len)) {
						if (found) {
							if (len == 1) {
								found = -/* continue for hotkey matching */1;
							} else {
									found = 0;
									break;
							} 
						} else {
								found = i + 1;
						} 
					} 
				}
				break;
		default:
				ModernizedCProgram.die("Bad type of menu_stuff when parse choice");
		}
		return found/*
		 * Parse user input, and return choice(s) for menu (menu_stuff).
		 *
		 * Input
		 *     (for single choice)
		 *         1          - select a numbered item
		 *         foo        - select item based on menu title
		 *                    - (empty) select nothing
		 *
		 *     (for multiple choice)
		 *         1          - select a single item
		 *         3-5        - select a range of items
		 *         2-3,6-9    - select multiple ranges
		 *         foo        - select item based on menu title
		 *         -...       - unselect specified items
		 *         *          - choose all items
		 *                    - (empty) finish selecting
		 *
		 * The parse result will be saved in array **chosen, and
		 * return number of total selections.
		 */;
	}
	public menu_stuff_type getType() {
		return type;
	}
	public void setType(menu_stuff_type newType) {
		type = newType;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public Object getStuff() {
		return stuff;
	}
	public void setStuff(Object newStuff) {
		stuff = newStuff;
	}
}
