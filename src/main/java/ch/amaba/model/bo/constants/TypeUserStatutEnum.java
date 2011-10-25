package ch.amaba.model.bo.constants;

/**
 * Type enum pour le statut du user (NEW, VALID ou BLOCK).
 * */
public enum TypeUserStatutEnum {
	NEW(1), VALID(2), BLOCK(3),
	/**
	 * L'email a été validé, attente de la validation admin manuelle.
	 * */
	WAIT(4);

	/**
	 * Id
	 * */
	private final Integer statut;

	/**
	 * Default constructor.
	 * */
	private TypeUserStatutEnum(Integer statut) {
		this.statut = statut;
	}

	/**
	 * Retourne le statut.
	 * */
	public Integer getStatut() {
		return statut;
	}

}
