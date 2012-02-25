package ch.amaba.model.bo.constants;

public enum TypePreferenceEnum {

	HIDE_PHOTO(1), HIDE_EMAIL(2), HIDE_NOM(3),

	/** Ne plus apparaître dans la recherche */
	INVISIBLE(4),
	/** Cacher la photo principale du profile. */
	H_PHOT_PRI(5),

	/** Cacher le profile principal. */
	H_PROFILE(6),

	H_RELIGION(7)

	, H_AMIS(8);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypePreferenceEnum(Integer id) {
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
