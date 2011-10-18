package ch.amaba.model.bo;

public class CantonDTO extends AbstractSignedDTO {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	private String codeCanton;

	private Integer idPays;

	public String getCodeCanton() {
		return codeCanton;
	}

	public void setCodeCanton(String codeCanton) {
		this.codeCanton = codeCanton;
	}

	public Integer getIdPays() {
		return idPays;
	}

	public void setIdPays(Integer idPays) {
		this.idPays = idPays;
	}
}
