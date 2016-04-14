
public class TankIsEmptyException extends Exception {
	public TankIsEmptyException(){
		super("TankIsFullException error");
	}
	
	public TankIsEmptyException(String s){
		super(s);
	}
}
