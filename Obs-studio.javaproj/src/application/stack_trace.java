package application;

/******************************************************************************
    Copyright (C) 2015 by Hugh Bailey <obs.jim@gmail.com>

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
public class stack_trace {
	private _CONTEXT context;
	private Object instruction_ptr;
	private Object frame;
	private Object image_type;
	
	public stack_trace(_CONTEXT context, Object instruction_ptr, Object frame, Object image_type) {
		setContext(context);
		setInstruction_ptr(instruction_ptr);
		setFrame(frame);
		setImage_type(image_type);
	}
	public stack_trace() {
	}
	
	public void init_instruction_data() {
		_CONTEXT generatedContext = this.getContext();
		Object generatedEip = generatedContext.getEip();
		this.setInstruction_ptr(generatedEip);
		Object generatedInstruction_ptr = this.getInstruction_ptr();
		Object generatedFrame = this.getFrame();
		generatedFrame.getAddrPC().setOffset(generatedInstruction_ptr);
		Object generatedEbp = generatedContext.getEbp();
		generatedFrame.getAddrFrame().setOffset(generatedEbp);
		Object generatedEsp = generatedContext.getEsp();
		generatedFrame.getAddrStack().setOffset(generatedEsp);
		this.setImage_type(-1024);
		generatedFrame.getAddrFrame().setMode(AddrModeFlat);
		generatedFrame.getAddrPC().setMode(AddrModeFlat);
		generatedFrame.getAddrStack().setMode(AddrModeFlat);
	}
	public _CONTEXT getContext() {
		return context;
	}
	public void setContext(_CONTEXT newContext) {
		context = newContext;
	}
	public Object getInstruction_ptr() {
		return instruction_ptr;
	}
	public void setInstruction_ptr(Object newInstruction_ptr) {
		instruction_ptr = newInstruction_ptr;
	}
	public Object getFrame() {
		return frame;
	}
	public void setFrame(Object newFrame) {
		frame = newFrame;
	}
	public Object getImage_type() {
		return image_type;
	}
	public void setImage_type(Object newImage_type) {
		image_type = newImage_type;
	}
}
