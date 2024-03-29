package ch.amaba.model.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserCriteria implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	Long idUser;
	Integer idSexe;
	String nom;
	String prenom;
	String email;
	Date dateNaissance;
	Integer ageMin;
	Integer ageMax;
	String password;
	String ip;
	Set<Integer> idVilles;
	Set<Integer> idCantons;
	Set<Integer> idInterets;
	Set<Integer> idSports;
	Set<Integer> idProfessions;
	Set<Integer> idMusiques;
	Set<Integer> idReligions;
	Set<Integer> idCaracteres;
	PhysiqueCriteria physiqueCriteria;
	ProfileCriteria profileCriteria;
	CoquinCriteria coquinCriteria;
	Set<PhotoDTO> photos;
	Set<AmiDTO> amis;

	/**
	 * For serialization.
	 * */
	public UserCriteria() {
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
	public void addMusique(Integer id) {
		if (idMusiques == null) {
			idMusiques = new HashSet<Integer>();
		}
		idMusiques.add(id);
	}

	/**
	 * Ajouter un nouveau filtre caractere.
	 * */
	public void addCaractere(Integer id) {
		if (idCaracteres == null) {
			idCaracteres = new HashSet<Integer>();
		}
		idCaracteres.add(id);
	}

	/**
	 * Ajouter un nouveau filtre int�r�t.
	 * */
	public void addInteret(final Integer id) {
		if (idInterets == null) {
			idInterets = new HashSet<Integer>();
		}
		idInterets.add(id);
	}

	/**
	 * Ajouter un nouveau filtre sport.
	 * */
	public void addSport(final Integer idSport) {
		if (idSports == null) {
			idSports = new HashSet<Integer>();
		}
		idSports.add(idSport);
	}

	/**
	 * Ajouter un nouveau filtre religion.
	 */
	public void addReligion(final Integer id) {
		if (idReligions == null) {
			idReligions = new HashSet<Integer>();
		}
		idReligions.add(id);
	}

	/**
	 * Ajouter un nouveau filtre profession.
	 */
	public void addProfession(final Integer id) {
		if (idProfessions == null) {
			idProfessions = new HashSet<Integer>();
		}
		idProfessions.add(id);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	/**
	 * Ajouter un nouveau filtre religion.
	 */
	public void addCanton(final Integer idCanton) {
		if (idCantons == null) {
			idCantons = new HashSet<Integer>();
		}
		idCantons.add(idCanton);
	}

	/**
	 * Clear les properties interet, music, profession, religion et sport.
	 * */
	public void clearUserProperties() {
		clearSet(idInterets);
		clearSet(idSports);
		clearSet(idProfessions);
		clearSet(idMusiques);
		clearSet(idReligions);
		clearSet(idCaracteres);
	}

	public void clearSet(Set<?> set) {
		if (set != null) {
			set.clear();
		}
	}

	public Set<Integer> getIdCaracteres() {
		return idCaracteres;
	}

	public void setIdCaracteres(Set<Integer> idCaracteres) {
		this.idCaracteres = idCaracteres;
	}

	public Set<PhotoDTO> getPhotos() {
		return photos;
	}

	public void setPhotos(Set<PhotoDTO> photos) {
		this.photos = photos;
	}

	/**
	 * Ajouter une nouvelle photo.
	 */
	public void addPhoto(final PhotoDTO photoDTO) {
		if (photos == null) {
			photos = new HashSet<PhotoDTO>();
		}
		photos.add(photoDTO);
	}

	/** Retourne l'url de la photo principale, null si pas trouv�e. */
	public String getPhotoPrincipaleFileName() {
		String fileName = null;
		if (photos != null) {
			for (final PhotoDTO photoDTO : photos) {
				if (photoDTO.isPrincipale()) {
					fileName = photoDTO.getFileName();
					break;
				}
			}
		}
		return fileName;
	}

	public CoquinCriteria getCoquinCriteria() {
		return coquinCriteria;
	}

	public void setCoquinCriteria(CoquinCriteria coquinCriteria) {
		this.coquinCriteria = coquinCriteria;
	}

	public void setAmis(Set<AmiDTO> amis) {
		this.amis = amis;
	}

	public Set<AmiDTO> getAmis() {
		return amis;
	}

	public void ajouterAmi(final AmiDTO ami) {
		if (amis == null) {
			amis = new HashSet<AmiDTO>();
		}
		amis.add(ami);
	}

}