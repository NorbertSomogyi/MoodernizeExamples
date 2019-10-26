package application;

public class obs_data_number {
	private obs_data_number_type type;
	private int int_val;
	private double double_val;
	
	public obs_data_number(obs_data_number_type type, int int_val, double double_val) {
		setType(type);
		setInt_val(int_val);
		setDouble_val(double_val);
	}
	public obs_data_number() {
	}
	
	public obs_data_number_type getType() {
		return type;
	}
	public void setType(obs_data_number_type newType) {
		type = newType;
	}
	public int getInt_val() {
		return int_val;
	}
	public void setInt_val(int newInt_val) {
		int_val = newInt_val;
	}
	public double getDouble_val() {
		return double_val;
	}
	public void setDouble_val(double newDouble_val) {
		double_val = newDouble_val;
	}
}
