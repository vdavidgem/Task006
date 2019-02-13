package comgemdemoHip;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeName {

	private String Fname;
	private String Lname;
	private String Mname;

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	@Override
	public String toString() {
		return "EmployeeName [Fname=" + Fname + ", Lname=" + Lname + ", Mname=" + Mname + "]";
	}

}
