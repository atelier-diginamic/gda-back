package dev.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collegue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;

	private String prenom;

	private String email;

	private String motDePasse;

	@OneToMany(mappedBy = "collegue", cascade = CascadeType.PERSIST)
	private List<RoleCollegue> roles;

	@OneToMany(mappedBy = "collegue")
	private List<Absence> ListeAbsencesDuCollegue;
	
	private Integer soldesVacances = 60;

	/**
	 * @return the listeAbsencesDuCollegue
	 */
	public List<Absence> getListeAbsencesDuCollegue() {
		return ListeAbsencesDuCollegue;
	}

	/**
	 * @param listeAbsencesDuCollegue the listeAbsencesDuCollegue to set
	 */
	public void setListeAbsencesDuCollegue(List<Absence> listeAbsencesDuCollegue) {
		ListeAbsencesDuCollegue = listeAbsencesDuCollegue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public List<RoleCollegue> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleCollegue> roles) {
		this.roles = roles;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getSoldesVacances() {
		return soldesVacances;
	}

	public void setSoldesVacances(Integer soldesVacances) {
		this.soldesVacances = soldesVacances;
	}
	
	
}
