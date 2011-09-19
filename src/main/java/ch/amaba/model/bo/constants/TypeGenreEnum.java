package ch.amaba.model.bo.constants;

/**
 * Type enum pour un message.
 * */
public enum TypeGenreEnum {
	HETERO(1L), HOMO(2L), BI(3L);

	/**
	 * Id
	 * */
	private final Long id;

	/**
	 * Default constructor.
	 * */
	private TypeGenreEnum(Long id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Long getId() {
		return id;
	}

}
