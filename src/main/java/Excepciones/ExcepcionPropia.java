package Excepciones;


//extends Exception para que se convierta en una excepcion
public class ExcepcionPropia extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionPropia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExcepcionPropia(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionPropia(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionPropia(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionPropia(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
