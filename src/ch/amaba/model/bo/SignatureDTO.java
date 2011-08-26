package ch.amaba.model.bo;

import java.io.Serializable;
import java.util.Date;

public class SignatureDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public final static String DTO_ACTIVE_STATE = "A";
	public final static String DTO_DELETED_STATE = "D";

	/**
	 * date de création de l'entité parente
	 */
	private Date creationDate;

	/**
	 * utilisateur ayant créé l'entité partente
	 */
	private String creationUser;

	/**
	 * application ayant crée l'entité parente
	 */
	private String creationApplication;

	/**
	 * dernière date de modification de l'entité parente
	 */
	private Date lastModificationDate;

	/**
	 * dernière personne ayant modifié l'entité parente
	 */
	private String lastModificationUser;

	/**
	 * dernière application ayant modifié l'entité partente
	 */
	private String lastModificationApplication;

	/**
	 * status de l'entité partente
	 */
	private String status;

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final SignatureDTO other = (SignatureDTO) obj;
		if (creationApplication == null) {
			if (other.creationApplication != null) {
				return false;
			}
		} else if (!creationApplication.equals(other.creationApplication)) {
			return false;
		}
		if (creationDate == null) {
			if (other.creationDate != null) {
				return false;
			}
		} else if (!creationDate.equals(other.creationDate)) {
			return false;
		}
		if (creationUser == null) {
			if (other.creationUser != null) {
				return false;
			}
		} else if (!creationUser.equals(other.creationUser)) {
			return false;
		}
		if (lastModificationApplication == null) {
			if (other.lastModificationApplication != null) {
				return false;
			}
		} else if (!lastModificationApplication
		    .equals(other.lastModificationApplication)) {
			return false;
		}
		if (lastModificationDate == null) {
			if (other.lastModificationDate != null) {
				return false;
			}
		} else if (!lastModificationDate.equals(other.lastModificationDate)) {
			return false;
		}
		if (lastModificationUser == null) {
			if (other.lastModificationUser != null) {
				return false;
			}
		} else if (!lastModificationUser.equals(other.lastModificationUser)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		return true;
	}

	public String getCreationApplication() {
		return creationApplication;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public String getCreationUser() {
		return creationUser;
	}

	public String getLastModificationApplication() {
		return lastModificationApplication;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public String getLastModificationUser() {
		return lastModificationUser;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result
		    + (creationApplication == null ? 0 : creationApplication.hashCode());
		result = PRIME * result
		    + (creationDate == null ? 0 : creationDate.hashCode());
		result = PRIME * result
		    + (creationUser == null ? 0 : creationUser.hashCode());
		result = PRIME
		    * result
		    + (lastModificationApplication == null ? 0
		        : lastModificationApplication.hashCode());
		result = PRIME * result
		    + (lastModificationDate == null ? 0 : lastModificationDate.hashCode());
		result = PRIME * result
		    + (lastModificationUser == null ? 0 : lastModificationUser.hashCode());
		result = PRIME * result + (status == null ? 0 : status.hashCode());
		return result;
	}

	public void setCreationApplication(final String creationApplication) {
		this.creationApplication = creationApplication;
	}

	public void setCreationDate(final Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setCreationUser(final String creationUser) {
		this.creationUser = creationUser;
	}

	public void setLastModificationApplication(
	    final String lastModificationApplication) {
		this.lastModificationApplication = lastModificationApplication;
	}

	public void setLastModificationDate(final Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public void setLastModificationUser(final String lastModificationUser) {
		this.lastModificationUser = lastModificationUser;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

}
