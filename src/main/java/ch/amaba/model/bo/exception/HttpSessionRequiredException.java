package ch.amaba.model.bo.exception;

/**
 * Exception thrown when an HTTP request handler requires a pre-existing
 * session.
 */
public class HttpSessionRequiredException extends Exception {

	private static final long serialVersionUID = 1L;

	public HttpSessionRequiredException() {
		super();
	}

}
