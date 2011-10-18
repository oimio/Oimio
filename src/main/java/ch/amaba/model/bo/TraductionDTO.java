package ch.amaba.model.bo;

/**
 * Représentation d'une traduction.
 * */
public class TraductionDTO extends AbstractSignedDTO {

	private static final long serialVersionUID = 1L;

	/**
	 * Exemple : PAYS
	 * */
	private String codeType;

	/**
	 * Exemple : FR ou DE ou IT
	 * */
	private String codeCle;

	private String codeLangue;

	private String traduction;

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCodeCle() {
		return codeCle;
	}

	public void setCodeCle(String codeCle) {
		this.codeCle = codeCle;
	}

	public String getCodeLangue() {
		return codeLangue;
	}

	public void setCodeLangue(String codeLangue) {
		this.codeLangue = codeLangue;
	}

	public String getTraduction() {
		return traduction;
	}

	public void setTraduction(String traduction) {
		this.traduction = traduction;
	}

}
