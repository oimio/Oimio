package ch.amaba.model.bo;

import java.io.Serializable;

import ch.amaba.model.bo.constants.TypeGenreEnum;

public class ProfileCriteria implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;
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
