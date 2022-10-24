package dataProvider;

public class AutoData {

	private String insuranceType;
	private String zip;
	private String firstName;
	private String lastName;
	private char middleName;
	private String suffix;
	private String address;
	private String apt;
	private String dOB;
	private boolean radioButton;

	public AutoData(String insuranceType, String zip, String firstName, String lastName, char middleName, String suffix,
			String address, String apt, String dOB, boolean radioButton) {
		
		this.insuranceType = insuranceType;
		this.zip = zip;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.suffix = suffix;
		this.address = address;
		this.apt = apt;
		this.dOB = dOB;
		this.radioButton = radioButton;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public String getZip() {
		return zip;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public char getMiddleName() {
		return middleName;
	}

	public String getSuffix() {
		return suffix;
	}

	public String getAddress() {
		return address;
	}

	public String getApt() {
		return apt;
	}

	public String getdOB() {
		return dOB;
	}

	public boolean getisRadioButton() {
		return radioButton;
	}
}