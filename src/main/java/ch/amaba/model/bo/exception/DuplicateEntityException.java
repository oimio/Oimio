package ch.amaba.model.bo.exception;

/**
 * Exception lorsque l'unicit� n'est pas respect�e.
 * */
public class DuplicateEntityException extends Exception {

	private static final long serialVersionUID = 1L;

	public DuplicateEntityException(String message) {
		super(message);
	}
}
