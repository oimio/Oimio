package ch.amaba.model.bo;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractSignedDTO implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	private Long businessObjectId;

	private Long version;

	private Date creationDate;

	private Date lastModificationDate;

	public AbstractSignedDTO() {
		super();
	}

	public Long getBusinessObjectId() {
		return businessObjectId;
	}

	public void setBusinessObjectId(Long businessObjectId) {
		this.businessObjectId = businessObjectId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
		    + ((businessObjectId == null) ? 0 : businessObjectId.hashCode());
		result = prime * result
		    + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime
		    * result
		    + ((lastModificationDate == null) ? 0 : lastModificationDate.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		final AbstractSignedDTO other = (AbstractSignedDTO) obj;
		if (businessObjectId == null) {
			if (other.businessObjectId != null) {
				return false;
			}
		} else if (!businessObjectId.equals(other.businessObjectId)) {
			return false;
		}
		if (creationDate == null) {
			if (other.creationDate != null) {
				return false;
			}
		} else if (!creationDate.equals(other.creationDate)) {
			return false;
		}
		if (lastModificationDate == null) {
			if (other.lastModificationDate != null) {
				return false;
			}
		} else if (!lastModificationDate.equals(other.lastModificationDate)) {
			return false;
		}
		if (version == null) {
			if (other.version != null) {
				return false;
			}
		} else if (!version.equals(other.version)) {
			return false;
		}
		return true;
	}

}
