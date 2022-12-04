package model.exception;

public class AccountErrorException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AccountErrorException(String msg) {
		super(msg);
	}
}
