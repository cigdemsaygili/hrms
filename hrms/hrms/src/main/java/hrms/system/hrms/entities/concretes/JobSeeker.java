package hrms.system.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobseeker")
public class JobSeeker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String nameOfSeeker;
	
	@Column
	private String surname;

	
	public JobSeeker() {}

	public JobSeeker(int id, String name, String surname) {
		super();
		this.id = id;
		this.nameOfSeeker = nameOfSeeker ;
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfSeeker() {
		return nameOfSeeker ;
	}

	public void setNameOfSeeker(String name) {
		this.nameOfSeeker = nameOfSeeker ;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
