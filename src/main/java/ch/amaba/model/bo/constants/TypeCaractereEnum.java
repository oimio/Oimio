package ch.amaba.model.bo.constants;

/**
 * Type enum pour sport.
 * */
public enum TypeCaractereEnum {
	DROLE(1), JOYEUX(2), TIMIDE(3), ORIGINIAL(4), DYNAMIQUE(5),

	AUTORITAIRE(6), COLEREUX(7), AUDACIEUX(8), PATIENT(9), IMPATIENT(10),

	TRAVAILLEUR(11), PARESSEUX(12), SOCIABLE(13), SOLITAIRE(14), CURIEUX(15),

	IMPULSIF(16), REFLECHI(17), TOLERANT(18);

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
	 * Retourne l'enum par id.
	 * 
	 * @param id
	 *          - id de l'enum
	 * @return TypeSportEnum si trouvé sinon null.
	 */
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
