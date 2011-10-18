package ch.amaba.model.bo.constants;

/**
 * Type enum pour un message.
 * */
public enum TypeMessageStatutEnum {
	NON_LU(1), LU(2), ENVOYE(3), SUPPRIME(4);
	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeMessageStatutEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

}
