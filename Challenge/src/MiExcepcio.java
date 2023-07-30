import javax.swing.JOptionPane;

public class MiExcepcio extends RuntimeException {

	public MiExcepcio() {
		super();
	}
	
	public MiExcepcio(String message) {
		super(message);
	}
	
}
