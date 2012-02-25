package ch.amaba.model.bo.exception;

/**
 * Exception lors de l'authentification : l'email n'est pas encore validé (clic
 * sur le lien fourni dans l'email après enregistrement).
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
