package ch.amaba.model.bo.constants;

/**
 * Type enum pour religion.
 * */
public enum TypeReligionEnum {
	CATHO(1), MUSULM(2), BOUDI(3), ATHE(4), HIND(5), JUDAI(6), CONF(7);

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

	/**
	 * Retourne l'enum par son id. Null si pas trouv�.
	 * 
	 * @param id
	 *          - l'id de l'enum recherch�
	 * @return l'enum correspondant � l'id. Null si pas trouv�.
	 * */
	public static TypeReligionEnum getEnumById(Integer id) {
		TypeReligionEnum typeEnum = null;
		for (final TypeReligionEnum type : TypeReligionEnum.values()) {
			if (type.getId().equals(id)) {
				typeEnum = type;
				break;
			}
		}
		return typeEnum;
	}

}
