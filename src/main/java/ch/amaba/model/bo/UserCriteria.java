package ch.amaba.model.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import ch.amaba.model.bo.constants.TypeGenreEnum;
import ch.amaba.model.bo.constants.TypeInteretEnum;
import ch.amaba.model.bo.constants.TypeMusiqueEnum;
import ch.amaba.model.bo.constants.TypeProfessionEnum;
import ch.amaba.model.bo.constants.TypeReligionEnum;
import ch.amaba.model.bo.constants.TypeSportEnum;

public class UserCriteria implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	Integer idSexe;
	String nom;
	String prenom;
	String email;
	Date dateNaissance;
	Integer ageMin;
	Integer ageMax;
	Set<Integer> idVilles;
	Set<Integer> idCantons;
	Set<Integer> idInterets;
	Set<Integer> idSports;
	Set<Integer> idProfessions;
	Set<Integer> idMusiques;
	Set<Integer> idReligions;
	PhysiqueCriteria physiqueCriteria;
	ProfileCriteria profileCriteria;

	/**
	 * For serialization.
	 * */
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

	public Set<Integer> getIdVilles() {
		return idVilles;
	}

	public void setIdVilles(Set<Integer> idVilles) {
		this.idVilles = idVilles;
	}

	public Set<Integer> getIdCantons() {
		return idCantons;
	}

	public void setIdCantons(Set<Integer> idCantons) {
		this.idCantons = idCantons;
	}

	public Set<Integer> getIdInterets() {
		return idInterets;
	}

	public void setIdInterets(Set<Integer> idInterets) {
		this.idInterets = idInterets;
	}

	public Set<Integer> getIdSports() {
		return idSports;
	}

	public void setIdSports(Set<Integer> idSports) {
		this.idSports = idSports;
	}

	public Set<Integer> getIdProfessions() {
		return idProfessions;
	}

	public void setIdProfessions(Set<Integer> idProfessions) {
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

	public Set<Integer> getIdMusiques() {
		return idMusiques;
	}

	public void setIdMusiques(Set<Integer> idMusiques) {
		this.idMusiques = idMusiques;
	}

	public Set<Integer> getIdReligions() {
		return idReligions;
	}

	public void setIdReligions(Set<Integer> idReligions) {
		this.idReligions = idReligions;
	}

	/**
	 * Ajouter un nouveau filtre musique.
	 * */
	public void addMusique(TypeMusiqueEnum typeMusiqueEnum) {
		if (idMusiques == null) {
			idMusiques = new HashSet<Integer>();
		}
		idMusiques.add(typeMusiqueEnum.getId());
	}

	/**
	 * Ajouter un nouveau filtre intérêt.
	 * */
	public void addInteret(final TypeInteretEnum typeInteretEnum) {
		if (idInterets == null) {
			idInterets = new HashSet<Integer>();
		}
		idInterets.add(typeInteretEnum.getId());
	}

	/**
	 * Ajouter un nouveau filtre sport.
	 * */
	public void addSport(final TypeSportEnum typeSportEnum) {
		if (idSports == null) {
			idSports = new HashSet<Integer>();
		}
		idSports.add(typeSportEnum.getId());
	}

	/**
	 * Ajouter un nouveau filtre religion.
	 */
	public void addReligion(final TypeReligionEnum typeReligionEnum) {
		if (idReligions == null) {
			idReligions = new HashSet<Integer>();
		}
		idReligions.add(typeReligionEnum.getId());
	}

	/**
	 * Ajouter un nouveau filtre profession.
	 */
	public void addProfession(final TypeProfessionEnum typeProfessionEnum) {
		if (idReligions == null) {
			idReligions = new HashSet<Integer>();
		}
		idReligions.add(typeProfessionEnum.getId());
	}
}