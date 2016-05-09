package ucuenca.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logger {
	
	public void metodo() {
	    try {
	        ...
	        Logger.getLogger(getClass().getName()).log(
	            Level.INFO, "Mensaje informativo...");
	        ...
	    } catch (Exception err) {
	        ...
	        Logger.getLogger(getClass().getName()).log(
	            Level.SEVERE, "Mensaje crítico...", err);
	        ...
	    }
	}
	
}
