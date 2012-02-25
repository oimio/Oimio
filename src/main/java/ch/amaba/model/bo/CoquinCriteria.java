package ch.amaba.model.bo;

import java.io.Serializable;

/**
 * Critères pour adultes.
 */
public class CoquinCriteria implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idUser;
	private Short echangiste;
	/** A plusieurs. */
	private Short partouze;
	private Short unSoir;
	private Short adultere;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Short getEchangiste() {
		return echangiste;
	}

	public void setEchangiste(Short echangiste) {
		this.echangiste = echangiste;
	}

	public Short getPartouze() {
		return partouze;
	}

	public void setPartouze(Short partouze) {
		this.partouze = partouze;
	}

	public Short getUnSoir() {
		return unSoir;
	}

	public void setUnSoir(Short unSoir) {
		this.unSoir = unSoir;
	}

	public Short getAdultere() {
		return adultere;
	}

	public void setAdultere(Short adultere) {
		this.adultere = adultere;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adultere == null) ? 0 : adultere.hashCode());
		result = prime * result + ((echangiste == null) ? 0 : echangiste.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result + ((partouze == null) ? 0 : partouze.hashCode());
		result = prime * result + ((unSoir == null) ? 0 : unSoir.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final CoquinCriteria other = (CoquinCriteria) obj;
		if (adultere == null) {
			if (other.adultere != null) {
				return false;
			}
		} else if (!adultere.equals(other.adultere)) {
			return false;
		}
		if (echangiste == null) {
			if (other.echangiste != null) {
				return false;
			}
		} else if (!echangiste.equals(other.echangiste)) {
			return false;
		}
		if (idUser == null) {
			if (other.idUser != null) {
				return false;
			}
		} else if (!idUser.equals(other.idUser)) {
			return false;
		}
		if (partouze == null) {
			if (other.partouze != null) {
				return false;
			}
		} else if (!partouze.equals(other.partouze)) {
			return false;
		}
		if (unSoir == null) {
			if (other.unSoir != null) {
				return false;
			}
		} else if (!unSoir.equals(other.unSoir)) {
			return false;
		}
		return true;
	}

}
