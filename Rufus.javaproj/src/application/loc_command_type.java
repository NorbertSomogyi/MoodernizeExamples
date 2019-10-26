package application;

// Commands that take a control ID *MUST* be at the top
// The last command with a control ID *MUST* be LC_TEXT
public enum loc_command_type {
	LC_GROUP, 
	LC_TEXT, 
	LC_VERSION, 
	LC_LOCALE, 
	LC_BASE, 
	LC_FONT, 
	LC_ATTRIBUTES
}
// Delimits commands that take a Control ID and commands that don't
