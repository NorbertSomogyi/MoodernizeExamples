package application;

public class _D3DMATERIAL8 {
	private _D3DCOLORVALUE Diffuse;
	private _D3DCOLORVALUE Ambient;
	private _D3DCOLORVALUE Specular;
	private _D3DCOLORVALUE Emissive;
	private double Power;
	
	public _D3DMATERIAL8(_D3DCOLORVALUE Diffuse, _D3DCOLORVALUE Ambient, _D3DCOLORVALUE Specular, _D3DCOLORVALUE Emissive, double Power) {
		setDiffuse(Diffuse);
		setAmbient(Ambient);
		setSpecular(Specular);
		setEmissive(Emissive);
		setPower(Power);
	}
	public _D3DMATERIAL8() {
	}
	
	public _D3DCOLORVALUE getDiffuse() {
		return Diffuse;
	}
	public void setDiffuse(_D3DCOLORVALUE newDiffuse) {
		Diffuse = newDiffuse;
	}
	public _D3DCOLORVALUE getAmbient() {
		return Ambient;
	}
	public void setAmbient(_D3DCOLORVALUE newAmbient) {
		Ambient = newAmbient;
	}
	public _D3DCOLORVALUE getSpecular() {
		return Specular;
	}
	public void setSpecular(_D3DCOLORVALUE newSpecular) {
		Specular = newSpecular;
	}
	public _D3DCOLORVALUE getEmissive() {
		return Emissive;
	}
	public void setEmissive(_D3DCOLORVALUE newEmissive) {
		Emissive = newEmissive;
	}
	public double getPower() {
		return Power;
	}
	public void setPower(double newPower) {
		Power = newPower;
	}
}
