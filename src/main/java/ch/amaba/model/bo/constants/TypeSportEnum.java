package ch.amaba.model.bo.constants;

/**
 * Type enum pour un message.
 * */
public enum TypeSportEnum {
	FOOT(1L), BASKET(2L), NATATION(3L), ESCALADE(4L), COURSE(5L), TENNIS(6L), EQUITATION(7L), VOLLEY(8L), VTT(9L), ROLLER(10L), DANSE(11L);

	/**
	 * Id
	 * */
	private final Long id;

	/**
	 * Default constructor.
	 * */
	private TypeSportEnum(Long id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Long getId() {
		return id;
	}

}
