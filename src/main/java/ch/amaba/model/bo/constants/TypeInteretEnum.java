package ch.amaba.model.bo.constants;

/**
 * Type enum pour interet.
 * */
public enum TypeInteretEnum {
	CINE(1), SPORT(2), VOYAGE(3), SPORT_MECA(4), SEXE(5), MODE(6), JEUXVIDEO(7),

	INFORMATI(8), THEATRE(9),

	PEINTURE(10), MONTAGNE(11), DANSE(12), INTERNET(13), CUISINE(14), LITERATURE(15), PONGEE(16), MUSIQUE(17);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeInteretEnum(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne l'identifiant unique
	 * */
	public Integer getId() {
		return id;
	}

	/**
	 * Retourne l'enum par id.
	 * 
	 * @param id
	 *          - id de l'enum
	 * @return TypeEnum si trouvé sinon null.
	 */
	public static TypeInteretEnum getEnumById(Integer id) {
		TypeInteretEnum typeEnum = null;
		for (final TypeInteretEnum type : TypeInteretEnum.values()) {
			if (type.getId().equals(id)) {
				typeEnum = type;
				break;
			}
		}
		return typeEnum;
	}

}
