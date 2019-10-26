package application;

public enum obs_text_type {
	OBS_TEXT_DEFAULT, 
	OBS_TEXT_PASSWORD, 
	OBS_TEXT_MULTILINE
}
/**
 * Adds a 'path' property.  Can be a directory or a file.
 *
 * If target is a file path, the filters should be this format, separated by
 * double semi-colens, and extensions separated by space:
 *   "Example types 1 and 2 (*.ex1 *.ex2);;Example type 3 (*.ex3)"
 *
 * @param  props        Properties object
 * @param  name         Settings name
 * @param  description  Description (display name) of the property
 * @param  type         Type of path (directory or file)
 * @param  filter       If type is a file path, then describes the file filter
 *                      that the user can browse.  Items are separated via
 *                      double semi-colens.  If multiple file types in a
 *                      filter, separate with space.
 */
