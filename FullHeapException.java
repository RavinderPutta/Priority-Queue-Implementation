/**
 * @author Ravinder Putta
 */
@SuppressWarnings("serial")
public class FullHeapException extends Exception{

	public FullHeapException(){}

	/**
	 * @param message
	 */
	public FullHeapException(String message){
		super(message);
	}

}