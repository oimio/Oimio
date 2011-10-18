package ch.amaba.model.bo.constants;

/**
 * Type enum pour contact.
 * */
public enum TypeContactEnum {
	MOBILE(1), GTALK(2), FIXE(3), SKYPE(4), MSN(5), FACEBOOK(6), EMAIL(7);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeContactEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

}
