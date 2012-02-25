package ch.amaba.model.bo.constants;

public enum TypeCouleurCheveux {
	BRUN(1), BLOND(2), CHATAIN(3), ROUX(4), BLANC(5), ROUGE(6), BLEU(7), VIOLET(8);

	private final Integer id;

	private TypeCouleurCheveux(final Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}
