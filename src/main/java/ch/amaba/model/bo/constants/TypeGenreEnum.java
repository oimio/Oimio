package ch.amaba.model.bo.constants;

/**
 * Type enum pour le genre.
 * */
public enum TypeGenreEnum {
	HETERO((short) 1), HOMO((short) 2), BI((short) 3);

	/**
	 * Id
	 * */
	private final Short id;

	/**
	 * Default constructor.
	 * */
	private TypeGenreEnum(Short id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Short getId() {
		return id;
	}

}
