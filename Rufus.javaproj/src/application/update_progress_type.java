package application;

/*
 * Rufus: The Reliable USB Formatting Utility
 * UI-related function calls
 * Copyright © 2018 Pete Batard <pete@akeo.ie>
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
// Progress bar colors
// Toolbar icons main color
// Toolbar default style
// Types of update progress we report
public enum update_progress_type {
	UPT_PERCENT, 
	UPT_SPEED, 
	UPT_ETA, 
	UPT_MAX
}
// Size of the download speed history ring.
// The minimum time length of a history sample. By default, each sample is at least 150ms long,
// which means that, over the course of 20 samples, "current" download speed spans at least 3s
// into the past.
// The time after which the download starts to be considered "stalled", i.e. the current
// bandwidth is not printed and the recent download speeds are scratched.
// Time between screen refreshes will not be shorter than this.
