package ch.amaba.model.bo.constants;

/**
 * Type enum pour sport.
 * */
public enum TypeCaractereEnum {
	DROLE(1), JOYEUX(2), TIMIDE(3), ORIGINIAL(4), DYNAMIQUE(5),

	AUTORIT(6), COLEREUX(7), AUDACIEUX(8), PATIENT(9), IMPATIENT(10),

	TRAVAIL(11), PARESSEUX(12), SOCIABLE(13), SOLITAIRE(14), CURIEUX(15),

	IMPULSIF(16), REFLECHI(17), TOLERANT(18), AMBI(19);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeCaractereEnum(Integer id) {
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
	public static TypeCaractereEnum getEnumById(Integer id) {
		TypeCaractereEnum typeSportEnum = null;
		for (final TypeCaractereEnum type : TypeCaractereEnum.values()) {
			if (type.getId().equals(id)) {
				typeSportEnum = type;
				break;
			}
		}
		return typeSportEnum;
	}

}
