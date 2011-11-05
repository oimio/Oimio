package ch.amaba.model.bo;

import java.io.Serializable;

/**
 * Contient les attribut � 3 valeurs possibles.<br/>
 * 
 * <font color=red>Oui (1), Non(0) ou null pour non renseign�</font>.
 * */
public class ProfileCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	private Short genre;
	/**
	 * Attribut � 3 valeurs possibles.<br/>
	 * 
	 * <font color=red>Oui (1), Non(0) ou null pour non renseign�</font>.
	 * */
	private Short marie;
	/**
	 * Attribut � 3 valeurs possibles.<br/>
	 * 
	 * <font color=red>Oui (1), Non(0) ou null pour non renseign�</font>.
	 * */
	private Short divorce;
	/**
	 * Attribut � 3 valeurs possibles.<br/>
	 * 
	 * <font color=red>Oui (1), Non(0) ou null pour non renseign�</font>.
	 * */
	private Short veuf;
	/**
	 * Attribut � 3 valeurs possibles.<br/>
	 * 
	 * <font color=red>Oui (1), Non(0) ou null pour non renseign�</font>.
	 * */
	private Short rechercheRelationSerieuse;

	/**
	 * Attribut � 3 valeurs possibles.<br/>
	 * 
	 * <font color=red>Oui (1), Non(0) ou null pour non renseign�</font>.
	 * */

	private Short nombreEnfant;
	/**
	 * Attribut � 3 valeurs possibles.<br/>
	 * 
	 * <font color=red>Oui (1), Non(0) ou null pour non renseign�</font>.
	 * */
	private Short serieux;

	public Short getGenre() {
		return genre;
	}

	public void setGenre(Short genre) {
		this.genre = genre;
	}

	public Short getNombreEnfant() {
		return nombreEnfant;
	}

	public void setNombreEnfant(Short nombreEnfant) {
		this.nombreEnfant = nombreEnfant;
	}

	public Short getMarie() {
		return marie;
	}

	public void setMarie(Short marie) {
		this.marie = marie;
	}

	public Short getDivorce() {
		return divorce;
	}

	public void setDivorce(Short divorce) {
		this.divorce = divorce;
	}

	public Short getVeuf() {
		return veuf;
	}

	public void setVeuf(Short veuf) {
		this.veuf = veuf;
	}

	public Short getRechercheRelationSerieuse() {
		return rechercheRelationSerieuse;
	}

	public void setRechercheRelationSerieuse(Short rechercheRelationSerieuse) {
		this.rechercheRelationSerieuse = rechercheRelationSerieuse;
	}

	public Short getSerieux() {
		return serieux;
	}

	public void setSerieux(Short serieux) {
		this.serieux = serieux;
	}

}
