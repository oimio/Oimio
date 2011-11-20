package ch.amaba.model.bo.constants;

/**
 * Type enum pour sport.
 * */
public enum TypeSportEnum {
	FOOT(1), BASKET(2), NATATION(3), ESCALADE(4), COURSE(5), TENNIS(6), EQUITATION(7), VOLLEY(8), VTT(9), ROLLER(10), DANSE(11), PLONGEE(12), VOILE(13);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeSportEnum(Integer id) {
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
	public static TypeSportEnum getEnumById(Integer id) {
		TypeSportEnum typeSportEnum = null;
		for (final TypeSportEnum type : TypeSportEnum.values()) {
			if (type.getId().equals(id)) {
				typeSportEnum = type;
				break;
			}
		}
		return typeSportEnum;
	}

}
