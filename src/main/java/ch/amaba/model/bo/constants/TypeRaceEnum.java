package ch.amaba.model.bo.constants;

/***/
public enum TypeRaceEnum {

	EUROPEEN(1), AFRICAIN(2), ASIATIQUE(3), ARABE(4), INDIEN(5), HISPANIQUE(6), AUTRE(7);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeRaceEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

	/**
	 * Retourne l'enum par son id. Null si pas trouv�.
	 * 
	 * @param id
	 *          - l'id de l'enum recherch�
	 * @return l'enum correspondant � l'id. Null si pas trouv�.
	 * */
	public static TypeProfessionEnum getEnumById(Integer id) {
		TypeProfessionEnum typeEnum = null;
		for (final TypeProfessionEnum type : TypeProfessionEnum.values()) {
			if (type.getId().equals(id)) {
				typeEnum = type;
				break;
			}
		}
		return typeEnum;
	}
}
