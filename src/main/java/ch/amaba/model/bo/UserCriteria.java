package ch.amaba.model.bo;

import java.util.Date;
import java.util.List;

import ch.amaba.model.bo.constants.TypeGenreEnum;

public class UserCriteria {

	Integer idSexe;
	String nom;
	String prenom;
	String email;
	Date dateNaissance;
	Integer ageMin;
	Integer ageMax;
	List<Integer> idVilles;
	List<Integer> idCantons;
	List<Integer> idInterets;
	List<Integer> idSports;
	List<Integer> idProfessions;
	PhysiqueCriteria physiqueCriteria;
	ProfileCriteria profileCriteria;

	public UserCriteria() {

	}

	public static class ProfileCriteria {
		TypeGenreEnum genre;
		Boolean isMarie;
		Boolean isDivorce;
		Boolean isVeuf;
		Boolean isRechercheRelationSerieuse;
		Integer nombreEnfant;
		// pas très clair
		// null : ne sait pas,1 oui, 0 non
		String codeSerieux;

		public TypeGenreEnum getGenre() {
			return genre;
		}

		public void setGenre(TypeGenreEnum genre) {
			this.genre = genre;
		}

		public Boolean isMarie() {
			return isMarie;
		}

		public void setMarie(Boolean isMarie) {
			this.isMarie = isMarie;
		}

		public Boolean isDivorce() {
			return isDivorce;
		}

		public void setDivorce(Boolean isDivorce) {
			this.isDivorce = isDivorce;
		}

		public Boolean isVeuf() {
			return isVeuf;
		}

		public void setVeuf(Boolean isVeuf) {
			this.isVeuf = isVeuf;
		}

		public Boolean isRechercheRelationSerieuse() {
			return isRechercheRelationSerieuse;
		}

		public void setRechercheRelationSerieuse(Boolean isRechercheRelationSerieuse) {
			this.isRechercheRelationSerieuse = isRechercheRelationSerieuse;
		}

		public String getCodeSerieux() {
			return codeSerieux;
		}

		public void setCodeSerieux(String codeSerieux) {
			this.codeSerieux = codeSerieux;
		}

		public Integer getNombreEnfant() {
			return nombreEnfant;
		}

		public void setNombreEnfant(Integer nombreEnfant) {
			this.nombreEnfant = nombreEnfant;
		}
	}

	public static class PhysiqueCriteria {
		Integer poids;
		Integer Taille;
	}

	public Integer getIdSexe() {
		return idSexe;
	}

	public void setIdSexe(Integer idSexe) {
		this.idSexe = idSexe;
	}

	public Integer getAgeMin() {
		return ageMin;
	}

	public void setAgeMin(Integer ageMin) {
		this.ageMin = ageMin;
	}

	public Integer getAgeMax() {
		return ageMax;
	}

	public void setAgeMax(Integer ageMax) {
		this.ageMax = ageMax;
	}

	public List<Integer> getIdVilles() {
		return idVilles;
	}

	public void setIdVilles(List<Integer> idVilles) {
		this.idVilles = idVilles;
	}

	public List<Integer> getIdCantons() {
		return idCantons;
	}

	public void setIdCantons(List<Integer> idCantons) {
		this.idCantons = idCantons;
	}

	public List<Integer> getIdInterets() {
		return idInterets;
	}

	public void setIdInterets(List<Integer> idInterets) {
		this.idInterets = idInterets;
	}

	public List<Integer> getIdSports() {
		return idSports;
	}

	public void setIdSports(List<Integer> idSports) {
		this.idSports = idSports;
	}

	public List<Integer> getIdProfessions() {
		return idProfessions;
	}

	public void setIdProfessions(List<Integer> idProfessions) {
		this.idProfessions = idProfessions;
	}

	public PhysiqueCriteria getPhysiqueCriteria() {
		return physiqueCriteria;
	}

	public void setPhysiqueCriteria(PhysiqueCriteria physiqueCriteria) {
		this.physiqueCriteria = physiqueCriteria;
	}

	public ProfileCriteria getProfileCriteria() {
		return profileCriteria;
	}

	public void setProfileCriteria(ProfileCriteria profileCriteria) {
		this.profileCriteria = profileCriteria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
}
