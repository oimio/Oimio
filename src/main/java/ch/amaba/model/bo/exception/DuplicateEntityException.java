package ch.amaba.model.bo.exception;

/**
 * Exception lorsque l'unicité n'est pas respectée.
 * */
public class DuplicateEntityException extends Exception {

	private static final long serialVersionUID = 1L;

	public DuplicateEntityException(String message) {
		super(message);
	}
}
