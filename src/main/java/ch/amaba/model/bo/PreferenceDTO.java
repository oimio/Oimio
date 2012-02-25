package ch.amaba.model.bo;

import ch.amaba.model.bo.constants.TypePreferenceEnum;

/**
 * Représente une préférence.
 * */
public class PreferenceDTO extends AbstractSignedDTO {

	private static final long serialVersionUID = 1L;

	private long idUser;
	private TypePreferenceEnum typePreferenceEnum;
	private String value;

	public PreferenceDTO() {
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public TypePreferenceEnum getTypePreferenceEnum() {
		return typePreferenceEnum;
	}

	public void setTypePreferenceEnum(TypePreferenceEnum typePreferenceEnum) {
		this.typePreferenceEnum = typePreferenceEnum;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (idUser ^ (idUser >>> 32));
		result = prime * result + ((typePreferenceEnum == null) ? 0 : typePreferenceEnum.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final PreferenceDTO other = (PreferenceDTO) obj;
		if (idUser != other.idUser) {
			return false;
		}
		if (typePreferenceEnum != other.typePreferenceEnum) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}
}
