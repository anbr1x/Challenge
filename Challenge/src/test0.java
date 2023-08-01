import java.awt.Component; 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class test0 {
	public static void main(String[] args) {
		DeseaContinuar Continuar = new DeseaContinuar();
		Input Digitacant = new Input();
	    Inicio inicio = new Inicio();

		float cantidadDb = 0;
		do {
		do {	//Selecionar Tempertura o Monedas
		    inicio.MostrarDisplay();
		    
		    String Seleccion = inicio.getSelecion();
		    // Ingresa Cantidad a convertir
		    Digitacant.MostrarDisplay(Seleccion);
		    try {
		        cantidadDb = Float.parseFloat(Digitacant.getCantidad());
		        break;
		        // Si no se produce la excepción, salimos del bucle
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(null, "Valor no válido", "alert", JOptionPane.INFORMATION_MESSAGE);
		    }
		} while (true);
		 // Escoje el tipo de cambio
		SeleccionTipodeCambio escojeCambio = new SeleccionTipodeCambio() ;
		escojeCambio.MostrarDisplay(inicio.getSelecion());
		
		 // Conviertey muestra resultado
		 cambio C = new cambio();
		 C.Conversion(escojeCambio.getCambioSelected().toString(),cantidadDb);
		
		 
		 
		 //Mensaje si se quiere seguir ejecutando el programa
	     Continuar.MostrarDisplay();
	  
		}while (Continuar.isA()); 
	}
}
	

	
	
