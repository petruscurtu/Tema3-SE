package mta.se.tema3.exceptions;

public class NameException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String mesaj;

	public NameException(String string) {
		super(string);
		mesaj=string;
	}
	
	public NameException(){
		super();
		mesaj="no message";
	}
	
	public void printmessage(){
		System.out.println("Custom method : "+mesaj);
	}

}
