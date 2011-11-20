package ch.amaba.model.bo.constants;

/**
 * Type enum pour musique.
 * */
public enum TypeMusiqueEnum {

	POP(1), CLASSIC(2),

	RAP(3),

	FUNK(4),

	DISCO(5),

	TECHNO(6),

	MONDE(7),

	JAZZ(8),

	CHFRAN(9),

	REGGAE(10),

	HARD(11), BLUES(12);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeMusiqueEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

}
