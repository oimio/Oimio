package ch.amaba.model.bo.constants;

/**
 * Type enum pour le genre.
 * */
public enum TypeGenreEnum {
	HETERO(1), HOMO(2), BI(3);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeGenreEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

}
