package ch.amaba.model.bo.constants;

/**
 * Type enum pour un message.
 * */
public enum TypeMessageStatutEnum {
	NON_LU(1), LU(2), ENVOYE(3), SUPPRIME(4), RECU(5);
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

	/**
	 * Retourne l'enum par son id. Null si pas trouvé.
	 * 
	 * @param id
	 *          - l'id de l'enum recherché
	 * @return l'enum correspondant à l'id. Null si pas trouvé.
	 * */
	public static TypeMessageStatutEnum getEnumById(Integer id) {
		TypeMessageStatutEnum typeEnum = null;
		for (final TypeMessageStatutEnum type : TypeMessageStatutEnum.values()) {
			if (type.getId().equals(id)) {
				typeEnum = type;
				break;
			}
		}
		return typeEnum;
	}

}
