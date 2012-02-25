package ch.amaba.model.bo.constants;

public enum TypeCouleurYeux {
	MARRON(1), NOIR(2), BLEU(3), VERT(4), ROUGE(5), BLANC(6), GRIS(7), JAUNE(8);

	private final Integer id;

	private TypeCouleurYeux(final Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}
