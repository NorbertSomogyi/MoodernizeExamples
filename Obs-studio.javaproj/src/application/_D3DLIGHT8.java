package application;

public class _D3DLIGHT8 {
	private _D3DLIGHTTYPE Type;
	private _D3DCOLORVALUE Diffuse;
	private _D3DCOLORVALUE Specular;
	private _D3DCOLORVALUE Ambient;
	private _D3DVECTOR Position;
	private _D3DVECTOR Direction;
	private double Range;
	private double Falloff;
	private double Attenuation0;
	private double Attenuation1;
	private double Attenuation2;
	private double Theta;
	private double Phi;
	
	public _D3DLIGHT8(_D3DLIGHTTYPE Type, _D3DCOLORVALUE Diffuse, _D3DCOLORVALUE Specular, _D3DCOLORVALUE Ambient, _D3DVECTOR Position, _D3DVECTOR Direction, double Range, double Falloff, double Attenuation0, double Attenuation1, double Attenuation2, double Theta, double Phi) {
		setType(Type);
		setDiffuse(Diffuse);
		setSpecular(Specular);
		setAmbient(Ambient);
		setPosition(Position);
		setDirection(Direction);
		setRange(Range);
		setFalloff(Falloff);
		setAttenuation0(Attenuation0);
		setAttenuation1(Attenuation1);
		setAttenuation2(Attenuation2);
		setTheta(Theta);
		setPhi(Phi);
	}
	public _D3DLIGHT8() {
	}
	
	public _D3DLIGHTTYPE getType() {
		return Type;
	}
	public void setType(_D3DLIGHTTYPE newType) {
		Type = newType;
	}
	public _D3DCOLORVALUE getDiffuse() {
		return Diffuse;
	}
	public void setDiffuse(_D3DCOLORVALUE newDiffuse) {
		Diffuse = newDiffuse;
	}
	public _D3DCOLORVALUE getSpecular() {
		return Specular;
	}
	public void setSpecular(_D3DCOLORVALUE newSpecular) {
		Specular = newSpecular;
	}
	public _D3DCOLORVALUE getAmbient() {
		return Ambient;
	}
	public void setAmbient(_D3DCOLORVALUE newAmbient) {
		Ambient = newAmbient;
	}
	public _D3DVECTOR getPosition() {
		return Position;
	}
	public void setPosition(_D3DVECTOR newPosition) {
		Position = newPosition;
	}
	public _D3DVECTOR getDirection() {
		return Direction;
	}
	public void setDirection(_D3DVECTOR newDirection) {
		Direction = newDirection;
	}
	public double getRange() {
		return Range;
	}
	public void setRange(double newRange) {
		Range = newRange;
	}
	public double getFalloff() {
		return Falloff;
	}
	public void setFalloff(double newFalloff) {
		Falloff = newFalloff;
	}
	public double getAttenuation0() {
		return Attenuation0;
	}
	public void setAttenuation0(double newAttenuation0) {
		Attenuation0 = newAttenuation0;
	}
	public double getAttenuation1() {
		return Attenuation1;
	}
	public void setAttenuation1(double newAttenuation1) {
		Attenuation1 = newAttenuation1;
	}
	public double getAttenuation2() {
		return Attenuation2;
	}
	public void setAttenuation2(double newAttenuation2) {
		Attenuation2 = newAttenuation2;
	}
	public double getTheta() {
		return Theta;
	}
	public void setTheta(double newTheta) {
		Theta = newTheta;
	}
	public double getPhi() {
		return Phi;
	}
	public void setPhi(double newPhi) {
		Phi = newPhi;
	}
}
