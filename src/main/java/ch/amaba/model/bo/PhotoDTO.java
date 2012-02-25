package ch.amaba.model.bo;

import java.util.Date;

/**
 * Représente une photo.
 */
public class PhotoDTO extends AbstractSignedDTO {

	private static final long serialVersionUID = 1L;

	private String fileName;

	private boolean isPrincipale;

	private Long idUser;

	private Date dateUpload;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isPrincipale() {
		return isPrincipale;
	}

	public void setPrincipale(boolean isPrincipale) {
		this.isPrincipale = isPrincipale;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer().append("id=" + getBusinessObjectId()).append(" fileName=" + getFileName()).append(" idUser=" + getIdUser())
		    .append(" isPrincipale=" + isPrincipale()).toString();
	}

	public Date getDateUpload() {
		return dateUpload;
	}

	public void setDateUpload(Date dateUpload) {
		this.dateUpload = dateUpload;
	}

}
