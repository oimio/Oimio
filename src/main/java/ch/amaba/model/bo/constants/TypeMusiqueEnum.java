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

	/**
	 * Retourne l'enum par son id. Null si pas trouvé.
	 * 
	 * @param id
	 *          - l'id de l'enum recherché
	 * @return l'enum correspondant à l'id. Null si pas trouvé.
	 * */
	public static TypeMusiqueEnum getEnumById(Integer id) {
		TypeMusiqueEnum typeEnum = null;
		for (final TypeMusiqueEnum type : TypeMusiqueEnum.values()) {
			if (type.getId().equals(id)) {
				typeEnum = type;
				break;
			}
		}
		return typeEnum;
	}

}
