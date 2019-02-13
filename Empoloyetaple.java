package Com.gem.Demohib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empoloyetaple {
	@Id
	private int adi;
	private String aname;
	private String color;

	public int getAdi() {
		return adi;
	}

	public void setAdi(int adi) {
		this.adi = adi;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
