package ch.amaba.model.bo.constants;

/**
 * Type enum pour un message.
 * */
public enum TypeContactEnum {
	MOBILE(1L), GTALK(2L), FIXE(3L), SKYPE(4L), MSN(5L), FACEBOOK(6L);

	/**
	 * Id
	 * */
	private final Long id;

	/**
	 * Default constructor.
	 * */
	private TypeContactEnum(Long id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Long getId() {
		return id;
	}

}
