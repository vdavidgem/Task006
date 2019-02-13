package comgemdemoHip;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {

	@Id
	private int adi;

	private EmployeeName aname;

	private String colour;

	public int getAdi() {
		return adi;
	}

	public void setAdi(int adi) {
		this.adi = adi;
	}

	public EmployeeName getAname() {
		return aname;
	}

	public void setAname(EmployeeName aname) {
		this.aname = aname;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Employee [adi=" + adi + ", aname=" + aname + ", colour=" + colour + "]";
	}

}
