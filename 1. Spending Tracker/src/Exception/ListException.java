package Exception;

public class ListException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
    public ListException() {
        super();
    }
    
    public ListException(String message) {
        super(message);
    }
    
    public ListException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ListException(Throwable cause) {
        super(cause);
    } 
	
}
