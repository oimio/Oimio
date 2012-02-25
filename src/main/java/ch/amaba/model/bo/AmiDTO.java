package ch.amaba.model.bo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AmiDTO extends AbstractSignedDTO {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	private String prenom;
	private Date dateNaissance;
	private Set<Integer> idCantons;
	private Set<PhotoDTO> photos;

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
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
	 * Ajouter une nouvelle photo.
	 */
	public void addPhoto(final PhotoDTO photoDTO) {
		if (photos == null) {
			photos = new HashSet<PhotoDTO>();
		}
		photos.add(photoDTO);
	}

	public String getPrenom() {
		return prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public Set<Integer> getIdCantons() {
		return idCantons;
	}

	public Set<PhotoDTO> getPhotos() {
		return photos;
	}

	/** Retourne l'url de la photo principale, null si pas trouvée. */
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

}