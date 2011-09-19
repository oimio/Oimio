package ch.amaba.model.bo.constants;

/**
 * Type enum pour un message.
 * */
public enum TypeMessageStatutEnum {
	LU(2L), NON_LU(1L), ENVOYE(3L), SUPPRIME(4L);
	/**
	 * Id
	 * */
	private final Long id;

	/**
	 * Default constructor.
	 * */
	private TypeMessageStatutEnum(Long id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Long getId() {
		return id;
	}

}
