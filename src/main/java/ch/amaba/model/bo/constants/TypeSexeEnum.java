package ch.amaba.model.bo.constants;

/**
 * Type enum pour le genre.
 * */
public enum TypeSexeEnum {
	MASCULIN(1), FEMININ(2);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeSexeEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

}
