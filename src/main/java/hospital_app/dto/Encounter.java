package hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime admit__date_time;
	private LocalDateTime discharge__date_time;
	private String reason;
	@OneToMany
	private List<Observation> observations;
	@OneToMany
	private List<MedOrder> medOrders;
	@ManyToOne
	private Branch branch;
	@ManyToOne
	private Person person;
	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getAdmit__date_time() {
		return admit__date_time;
	}

	public void setAdmit__date_time(LocalDateTime admit__date_time) {
		this.admit__date_time = admit__date_time;
	}

	public LocalDateTime getDischarge__date_time() {
		return discharge__date_time;
	}

	public void setDischarge__date_time(LocalDateTime discharge__date_time) {
		this.discharge__date_time = discharge__date_time;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public List<MedOrder> getMedOrders() {
		return medOrders;
	}

	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}

}