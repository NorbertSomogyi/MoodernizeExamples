package application;

/*****************************************************************************
Copyright (C) 2016 by c3r1c3 <c3r1c3@nevermindonline.com>

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
*****************************************************************************/
/* clang-format off */
/* clang-format on */
public class color_correction_filter_data {
	private obs_source context;
	private Object effect;
	private Object gamma_param;
	private Object final_matrix_param;
	private vec3 gamma;
	private double contrast;
	private double brightness;
	private double saturation;
	private double hue_shift;
	private double opacity;
	private vec4 color;
	private matrix4 con_matrix;
	private matrix4 bright_matrix;
	private matrix4 sat_matrix;
	private matrix4 hue_op_matrix;
	private matrix4 color_matrix;
	private matrix4 final_matrix;
	private vec3 rot_quaternion;
	private double rot_quaternion_w;
	private vec3 cross;
	private vec3 square;
	private vec3 wimag;
	private vec3 diag;
	private vec3 a_line;
	private vec3 b_line;
	private vec3 half_unit;
	
	public color_correction_filter_data(obs_source context, Object effect, Object gamma_param, Object final_matrix_param, vec3 gamma, double contrast, double brightness, double saturation, double hue_shift, double opacity, vec4 color, matrix4 con_matrix, matrix4 bright_matrix, matrix4 sat_matrix, matrix4 hue_op_matrix, matrix4 color_matrix, matrix4 final_matrix, vec3 rot_quaternion, double rot_quaternion_w, vec3 cross, vec3 square, vec3 wimag, vec3 diag, vec3 a_line, vec3 b_line, vec3 half_unit) {
		setContext(context);
		setEffect(effect);
		setGamma_param(gamma_param);
		setFinal_matrix_param(final_matrix_param);
		setGamma(gamma);
		setContrast(contrast);
		setBrightness(brightness);
		setSaturation(saturation);
		setHue_shift(hue_shift);
		setOpacity(opacity);
		setColor(color);
		setCon_matrix(con_matrix);
		setBright_matrix(bright_matrix);
		setSat_matrix(sat_matrix);
		setHue_op_matrix(hue_op_matrix);
		setColor_matrix(color_matrix);
		setFinal_matrix(final_matrix);
		setRot_quaternion(rot_quaternion);
		setRot_quaternion_w(rot_quaternion_w);
		setCross(cross);
		setSquare(square);
		setWimag(wimag);
		setDiag(diag);
		setA_line(a_line);
		setB_line(b_line);
		setHalf_unit(half_unit);
	}
	public color_correction_filter_data() {
	}
	
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public Object getEffect() {
		return effect;
	}
	public void setEffect(Object newEffect) {
		effect = newEffect;
	}
	public Object getGamma_param() {
		return gamma_param;
	}
	public void setGamma_param(Object newGamma_param) {
		gamma_param = newGamma_param;
	}
	public Object getFinal_matrix_param() {
		return final_matrix_param;
	}
	public void setFinal_matrix_param(Object newFinal_matrix_param) {
		final_matrix_param = newFinal_matrix_param;
	}
	public vec3 getGamma() {
		return gamma;
	}
	public void setGamma(vec3 newGamma) {
		gamma = newGamma;
	}
	public double getContrast() {
		return contrast;
	}
	public void setContrast(double newContrast) {
		contrast = newContrast;
	}
	public double getBrightness() {
		return brightness;
	}
	public void setBrightness(double newBrightness) {
		brightness = newBrightness;
	}
	public double getSaturation() {
		return saturation;
	}
	public void setSaturation(double newSaturation) {
		saturation = newSaturation;
	}
	public double getHue_shift() {
		return hue_shift;
	}
	public void setHue_shift(double newHue_shift) {
		hue_shift = newHue_shift;
	}
	public double getOpacity() {
		return opacity;
	}
	public void setOpacity(double newOpacity) {
		opacity = newOpacity;
	}
	public vec4 getColor() {
		return color;
	}
	public void setColor(vec4 newColor) {
		color = newColor;
	}
	public matrix4 getCon_matrix() {
		return con_matrix;
	}
	public void setCon_matrix(matrix4 newCon_matrix) {
		con_matrix = newCon_matrix;
	}
	public matrix4 getBright_matrix() {
		return bright_matrix;
	}
	public void setBright_matrix(matrix4 newBright_matrix) {
		bright_matrix = newBright_matrix;
	}
	public matrix4 getSat_matrix() {
		return sat_matrix;
	}
	public void setSat_matrix(matrix4 newSat_matrix) {
		sat_matrix = newSat_matrix;
	}
	public matrix4 getHue_op_matrix() {
		return hue_op_matrix;
	}
	public void setHue_op_matrix(matrix4 newHue_op_matrix) {
		hue_op_matrix = newHue_op_matrix;
	}
	public matrix4 getColor_matrix() {
		return color_matrix;
	}
	public void setColor_matrix(matrix4 newColor_matrix) {
		color_matrix = newColor_matrix;
	}
	public matrix4 getFinal_matrix() {
		return final_matrix;
	}
	public void setFinal_matrix(matrix4 newFinal_matrix) {
		final_matrix = newFinal_matrix;
	}
	public vec3 getRot_quaternion() {
		return rot_quaternion;
	}
	public void setRot_quaternion(vec3 newRot_quaternion) {
		rot_quaternion = newRot_quaternion;
	}
	public double getRot_quaternion_w() {
		return rot_quaternion_w;
	}
	public void setRot_quaternion_w(double newRot_quaternion_w) {
		rot_quaternion_w = newRot_quaternion_w;
	}
	public vec3 getCross() {
		return cross;
	}
	public void setCross(vec3 newCross) {
		cross = newCross;
	}
	public vec3 getSquare() {
		return square;
	}
	public void setSquare(vec3 newSquare) {
		square = newSquare;
	}
	public vec3 getWimag() {
		return wimag;
	}
	public void setWimag(vec3 newWimag) {
		wimag = newWimag;
	}
	public vec3 getDiag() {
		return diag;
	}
	public void setDiag(vec3 newDiag) {
		diag = newDiag;
	}
	public vec3 getA_line() {
		return a_line;
	}
	public void setA_line(vec3 newA_line) {
		a_line = newA_line;
	}
	public vec3 getB_line() {
		return b_line;
	}
	public void setB_line(vec3 newB_line) {
		b_line = newB_line;
	}
	public vec3 getHalf_unit() {
		return half_unit;
	}
	public void setHalf_unit(vec3 newHalf_unit) {
		half_unit = newHalf_unit;
	}
}
