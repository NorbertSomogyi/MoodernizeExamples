package application;

/******************************************************************************
    Copyright (C) 2017 by Hugh Bailey <obs.jim@gmail.com>

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
public class null_output {
	private obs_output output;
	private Object stop_thread;
	private Object stop_thread_active;
	
	public null_output(obs_output output, Object stop_thread, Object stop_thread_active) {
		setOutput(output);
		setStop_thread(stop_thread);
		setStop_thread_active(stop_thread_active);
	}
	public null_output() {
	}
	
	public obs_output getOutput() {
		return output;
	}
	public void setOutput(obs_output newOutput) {
		output = newOutput;
	}
	public Object getStop_thread() {
		return stop_thread;
	}
	public void setStop_thread(Object newStop_thread) {
		stop_thread = newStop_thread;
	}
	public Object getStop_thread_active() {
		return stop_thread_active;
	}
	public void setStop_thread_active(Object newStop_thread_active) {
		stop_thread_active = newStop_thread_active;
	}
}
