package ch.amaba.model.bo.exception;

/**
 * Exception lors de l'authentification : l'email n'est pas encore valid� (clic
 * sur le lien fourni dans l'email apr�s enregistrement).
 * */
public class EmailNonValideException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 * */
	public EmailNonValideException() {
		super();
	}
}
