package com.companyinfo;

public class Company {

	static String Companyname = "TATA";
	static String faculty = "TATA Sales";
	static String eligibility = "12th pass or Graduated";

	@Override
	public String toString() {
		return "Company []";
	}

	public static String displayInfo() {
		return "COMPANY"+"\n"+Companyname +" \nWe Stand With You "+"\nWe are hiring candidtaes for Faculty: "+ faculty +"\nThe Eligibility criteria for Joining is: "+eligibility             ;
		

	}

}
