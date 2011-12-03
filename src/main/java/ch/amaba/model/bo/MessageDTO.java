package ch.amaba.model.bo;

import java.util.Date;

import ch.amaba.model.bo.constants.TypeMessageStatutEnum;

/**
 * Représente un message. Contient les informations de l'expéditeur, le sujet,
 * la date et le contenu du message.
 * */
public class MessageDTO extends AbstractSignedDTO {

	private static final long serialVersionUID = 1L;

	private Date date;

	private String sujet;

	private String message;

	private TypeMessageStatutEnum typeMessageStatutEnum;

	/** Le nom du correspondant. */
	private String nomCorrespondant;

	/** Le prénom du correspondant. */
	private String prenomCorrespondant;

	/** L'id du correspondant. */
	private Integer idCorrespondant;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public TypeMessageStatutEnum getTypeMessageStatutEnum() {
		return typeMessageStatutEnum;
	}

	public void setTypeMessageStatutEnum(TypeMessageStatutEnum typeMessageStatutEnum) {
		this.typeMessageStatutEnum = typeMessageStatutEnum;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNomCorrespondant() {
		return nomCorrespondant;
	}

	public void setNomCorrespondant(String nomCorrespondant) {
		this.nomCorrespondant = nomCorrespondant;
	}

	public String getPrenomCorrespondant() {
		return prenomCorrespondant;
	}

	public void setPrenomCorrespondant(String prenomCorrespondant) {
		this.prenomCorrespondant = prenomCorrespondant;
	}

	public Integer getIdCorrespondant() {
		return idCorrespondant;
	}

	public void setIdCorrespondant(Integer idCorrespondant) {
		this.idCorrespondant = idCorrespondant;
	}

	@Override
	public String toString() {
		return new StringBuffer().append("date=" + date).append("sujet=" + sujet).append("message=" + message).append("nomCorrespondant=" + nomCorrespondant)
		    .append("prenomCorrespondant=" + prenomCorrespondant).append("idCorrespondant=" + idCorrespondant).toString();
	}

}
