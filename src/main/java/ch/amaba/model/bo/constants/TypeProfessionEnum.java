package ch.amaba.model.bo.constants;

/**
 * Type enum pour profession.
 * */
public enum TypeProfessionEnum {
	SANS(1), CADRE(2), FONCTION(3);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeProfessionEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

}
