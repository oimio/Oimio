package ch.amaba.model.bo.constants;

/**
 * Type enum pour religion.
 * */
public enum TypeReligionEnum {
	CATHO(1), MUSULM(2), BOUDI(3), ATHE(4), PROTEST(5);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeReligionEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

}
