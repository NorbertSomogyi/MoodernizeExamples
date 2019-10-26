package application;

/******************************************************************************
    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>

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
/*
 *   This is a set of helper functions to more easily render to textures
 * without having to duplicate too much code.
 */
public class gs_texture_render {
	private gs_texture target;
	private gs_texture prev_target;
	private gs_zstencil_buffer zs;
	private gs_zstencil_buffer prev_zs;
	private Object cx;
	private Object cy;
	private gs_color_format format;
	private gs_zstencil_format zsformat;
	private Object rendered;
	
	public gs_texture_render(gs_texture target, gs_texture prev_target, gs_zstencil_buffer zs, gs_zstencil_buffer prev_zs, Object cx, Object cy, gs_color_format format, gs_zstencil_format zsformat, Object rendered) {
		setTarget(target);
		setPrev_target(prev_target);
		setZs(zs);
		setPrev_zs(prev_zs);
		setCx(cx);
		setCy(cy);
		setFormat(format);
		setZsformat(zsformat);
		setRendered(rendered);
	}
	public gs_texture_render() {
	}
	
	public gs_texture_render gs_texrender_create(gs_color_format format, gs_zstencil_format zsformat) {
		gs_texture_render texrender = new gs_texture_render();
		texrender = ModernizedCProgram.bzalloc();
		texrender.setFormat(gs_color_format.format);
		texrender.setZsformat(gs_zstencil_format.zsformat);
		return texrender;
	}
	public void gs_texrender_destroy() {
		gs_texture generatedTarget = this.getTarget();
		gs_zstencil_buffer generatedZs = this.getZs();
		if (texrender) {
			ModernizedCProgram.gs_texture_destroy(generatedTarget);
			ModernizedCProgram.gs_zstencil_destroy(generatedZs);
			ModernizedCProgram.bfree(texrender);
		} 
	}
	public Object texrender_resetbuffer(Object cx, Object cy) {
		if (!texrender) {
			return false;
		} 
		gs_texture generatedTarget = this.getTarget();
		ModernizedCProgram.gs_texture_destroy(generatedTarget);
		gs_zstencil_buffer generatedZs = this.getZs();
		ModernizedCProgram.gs_zstencil_destroy(generatedZs);
		this.setTarget(NULL);
		this.setZs(NULL);
		this.setCx(cx);
		this.setCy(cy);
		gs_color_format generatedFormat = this.getFormat();
		gs_texture gs_texture = new gs_texture();
		this.setTarget(gs_texture.gs_texture_create(cx, cy, generatedFormat, 1, NULL, (1 << 2)));
		if (!generatedTarget) {
			return false;
		} 
		gs_zstencil_format generatedZsformat = this.getZsformat();
		gs_zstencil_buffer gs_zstencil_buffer = new gs_zstencil_buffer();
		if (generatedZsformat != gs_zstencil_format.GS_ZS_NONE) {
			this.setZs(gs_zstencil_buffer.gs_zstencil_create(cx, cy, generatedZsformat));
			if (!generatedZs) {
				ModernizedCProgram.gs_texture_destroy(generatedTarget);
				this.setTarget(NULL);
				return false;
			} 
		} 
		return true;
	}
	public Object gs_texrender_begin(Object cx, Object cy) {
		Object generatedRendered = this.getRendered();
		if (!texrender || generatedRendered) {
			return false;
		} 
		if (!cx || !cy) {
			return false;
		} 
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		if (generatedCx != cx || generatedCy != cy) {
			if (!texrender.texrender_resetbuffer(cx, cy)) {
				return false;
			} 
		} 
		gs_texture generatedTarget = this.getTarget();
		if (!generatedTarget) {
			return false;
		} 
		ModernizedCProgram.gs_viewport_push();
		ModernizedCProgram.gs_projection_push();
		ModernizedCProgram.gs_matrix_push();
		ModernizedCProgram.gs_matrix_identity();
		gs_texture gs_texture = new gs_texture();
		this.setPrev_target(gs_texture.gs_get_render_target());
		gs_zstencil_buffer gs_zstencil_buffer = new gs_zstencil_buffer();
		this.setPrev_zs(gs_zstencil_buffer.gs_get_zstencil_target());
		gs_zstencil_buffer generatedZs = this.getZs();
		ModernizedCProgram.gs_set_render_target(generatedTarget, generatedZs);
		ModernizedCProgram.gs_set_viewport(0, 0, generatedCx, generatedCy);
		return true;
	}
	public void gs_texrender_end() {
		if (!texrender) {
			return ;
		} 
		gs_texture generatedPrev_target = this.getPrev_target();
		gs_zstencil_buffer generatedPrev_zs = this.getPrev_zs();
		ModernizedCProgram.gs_set_render_target(generatedPrev_target, generatedPrev_zs);
		ModernizedCProgram.gs_matrix_pop();
		ModernizedCProgram.gs_projection_pop();
		ModernizedCProgram.gs_viewport_pop();
		this.setRendered(true);
	}
	public void gs_texrender_reset() {
		if (texrender) {
			this.setRendered(false);
		} 
	}
	public gs_texture getTarget() {
		return target;
	}
	public void setTarget(gs_texture newTarget) {
		target = newTarget;
	}
	public gs_texture getPrev_target() {
		return prev_target;
	}
	public void setPrev_target(gs_texture newPrev_target) {
		prev_target = newPrev_target;
	}
	public gs_zstencil_buffer getZs() {
		return zs;
	}
	public void setZs(gs_zstencil_buffer newZs) {
		zs = newZs;
	}
	public gs_zstencil_buffer getPrev_zs() {
		return prev_zs;
	}
	public void setPrev_zs(gs_zstencil_buffer newPrev_zs) {
		prev_zs = newPrev_zs;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public gs_color_format getFormat() {
		return format;
	}
	public void setFormat(gs_color_format newFormat) {
		format = newFormat;
	}
	public gs_zstencil_format getZsformat() {
		return zsformat;
	}
	public void setZsformat(gs_zstencil_format newZsformat) {
		zsformat = newZsformat;
	}
	public Object getRendered() {
		return rendered;
	}
	public void setRendered(Object newRendered) {
		rendered = newRendered;
	}
}
