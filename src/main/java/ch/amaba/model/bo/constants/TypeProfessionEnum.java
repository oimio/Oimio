package ch.amaba.model.bo.constants;

/**
 * Type enum pour profession.
 * */
public enum TypeProfessionEnum {
	ACCUEIL(1), ACHAT(2), ADMIN(3), ASSU(4), BANQUE(5), BAT(6), CADRE(7), COMMER(8), COM(9), COMPTA(10), QUALITE(11), EDU(12), HORLO(13), HOTEL(14), HUMA(15), IMMO(
	    16), INDUSTRIE(17), INF(18), JURI(19), LOGISTIC(20), MARKETING(21), MEDICAL(22), NEGOCE(23), SECURITE(24), RH(25), SERVICE(26), SOIN(27), TRAD(28), TRANS(
	    29), VENTE(30);

	/**
	 * Id
	 * */
	private final Integer id;

	/**
	 * Default constructor.
	 * */
	private TypeProfessionEnum(Integer id) {
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

	public static void main(String[] args) {
		final TypeProfessionEnum[] values = TypeProfessionEnum.values();
		for (final TypeProfessionEnum typeProfessionEnum : values) {
			System.out.println("INSERT INTO PROFESSION (idprofession, cdprofession) select " + typeProfessionEnum.getId() + ", '" + typeProfessionEnum.name()
			    + "' from dual;");
		}
	}

}
