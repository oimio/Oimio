package ch.amaba.model.bo.constants;

/**
 * Type enum pour musique.
 * */
public enum TypeMusiqueEnum {
	POP(1), CLASSIC(2), RAP(3), RNB(4), REGGAE(5), TECHNO(6), ROCK(7), FUNCK(8), MONDE(9);

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
