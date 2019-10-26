package application;

public class gs_vb_data {
	private Object num;
	private vec3 points;
	private vec3 normals;
	private vec3 tangents;
	private Object colors;
	private Object num_tex;
	private gs_tvertarray tvarray;
	
	public gs_vb_data(Object num, vec3 points, vec3 normals, vec3 tangents, Object colors, Object num_tex, gs_tvertarray tvarray) {
		setNum(num);
		setPoints(points);
		setNormals(normals);
		setTangents(tangents);
		setColors(colors);
		setNum_tex(num_tex);
		setTvarray(tvarray);
	}
	public gs_vb_data() {
	}
	
	public gs_vb_data gs_vbdata_create() {
		return (gs_vb_data)ModernizedCProgram.bzalloc();
	}
	public void gs_vbdata_destroy() {
		 i = new ();
		if (!ModernizedCProgram.data) {
			return ;
		} 
		ModernizedCProgram.bfree(ModernizedCProgram.data.getPoints());
		ModernizedCProgram.bfree(ModernizedCProgram.data.getNormals());
		ModernizedCProgram.bfree(ModernizedCProgram.data.getTangents());
		ModernizedCProgram.bfree(ModernizedCProgram.data.getColors());
		for (i = 0; i < ModernizedCProgram.data.getNum_tex(); i++) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getTvarray()[i].getArray());
		}
		ModernizedCProgram.bfree(ModernizedCProgram.data.getTvarray());
		ModernizedCProgram.bfree(ModernizedCProgram.data);
	}
	public gs_vb_data gs_vertexbuffer_get_data(Object vb) {
		return vb.getData();
		if (!(ModernizedCProgram.gs_valid("gs_vertexbuffer_get_data") && ModernizedCProgram.gs_obj_valid(vertbuffer, "gs_vertexbuffer_get_data", "vertbuffer"))) {
			return ((Object)0);
		} 
		return .UNRECOGNIZEDFUNCTIONNAME(vertbuffer);
	}
	public void build_sprite(double fcx, double fcy, double start_u, double end_u, double start_v, double end_v) {
		vec2 tvarray = ModernizedCProgram.data.getTvarray()[0].getArray();
		ModernizedCProgram.data.getPoints().vec3_zero();
		ModernizedCProgram.data.getPoints() + 1.vec3_set(fcx, 0.0, 0.0);
		ModernizedCProgram.data.getPoints() + 2.vec3_set(0.0, fcy, 0.0);
		ModernizedCProgram.data.getPoints() + 3.vec3_set(fcx, fcy, 0.0);
		tvarray.vec2_set(start_u, start_v);
		tvarray + 1.vec2_set(end_u, start_v);
		tvarray + 2.vec2_set(start_u, end_v);
		tvarray + 3.vec2_set(end_u, end_v);
	}
	public void build_sprite_norm(double fcx, double fcy, Object flip) {
		double start_u;
		double end_u;
		double start_v;
		double end_v;
		ModernizedCProgram.assign_sprite_uv(start_u, end_u, (flip & (1 << 0)) != 0);
		ModernizedCProgram.assign_sprite_uv(start_v, end_v, (flip & (1 << 1)) != 0);
		ModernizedCProgram.data.build_sprite(fcx, fcy, start_u, end_u, start_v, end_v);
	}
	public void build_subsprite_norm(double fsub_x, double fsub_y, double fsub_cx, double fsub_cy, double fcx, double fcy, Object flip) {
		double start_u;
		double end_u;
		double start_v;
		double end_v;
		if ((flip & (1 << 0)) == 0) {
			start_u = fsub_x / fcx;
			end_u = (fsub_x + fsub_cx) / fcx;
		} else {
				start_u = (fsub_x + fsub_cx) / fcx;
				end_u = fsub_x / fcx;
		} 
		if ((flip & (1 << 1)) == 0) {
			start_v = fsub_y / fcy;
			end_v = (fsub_y + fsub_cy) / fcy;
		} else {
				start_v = (fsub_y + fsub_cy) / fcy;
				end_v = fsub_y / fcy;
		} 
		ModernizedCProgram.data.build_sprite(fsub_cx, fsub_cy, start_u, end_u, start_v, end_v);
	}
	public Object getNum() {
		return num;
	}
	public void setNum(Object newNum) {
		num = newNum;
	}
	public vec3 getPoints() {
		return points;
	}
	public void setPoints(vec3 newPoints) {
		points = newPoints;
	}
	public vec3 getNormals() {
		return normals;
	}
	public void setNormals(vec3 newNormals) {
		normals = newNormals;
	}
	public vec3 getTangents() {
		return tangents;
	}
	public void setTangents(vec3 newTangents) {
		tangents = newTangents;
	}
	public Object getColors() {
		return colors;
	}
	public void setColors(Object newColors) {
		colors = newColors;
	}
	public Object getNum_tex() {
		return num_tex;
	}
	public void setNum_tex(Object newNum_tex) {
		num_tex = newNum_tex;
	}
	public gs_tvertarray getTvarray() {
		return tvarray;
	}
	public void setTvarray(gs_tvertarray newTvarray) {
		tvarray = newTvarray;
	}
}
