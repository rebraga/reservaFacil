package exception;

/**
 * The Class OperacaoException.
 */
public class OperacaoException extends Exception{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5172406957960124573L;

	/** The codigo. */
	private String codigo;
	
	/** The message. */
	private String message;
		

	/**
	 * Instantiates a new operacao exception.
	 *
	 * @param codigo the codigo
	 * @param message the message
	 */
	public OperacaoException(String message) {
		super();
		this.message = message;
	}

	/**
	 * Gets the codigo.
	 *
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param codigo the new codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
