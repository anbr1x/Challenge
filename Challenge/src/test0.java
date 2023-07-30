import java.awt.Component; 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class test0 {
	public static void main(String[] args) {
		DeseaContinuar Continuar = new DeseaContinuar();
		float cantidadDb = 0;
		do {
		do {	//Selecionar Tempertura o Monedas
		    Inicio inicio = new Inicio();
		    inicio.MostrarDisplay();
		    // Ingresa Cantidad a convertir
		    Input Digitacant = new Input();
		    Digitacant.MostrarDisplay();
		    try {
		        cantidadDb = Float.parseFloat(Digitacant.getCantidad());
		        // Si no se produce la excepción, salimos del bucle
		        break;
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(null, "Valor no válido", "alert", JOptionPane.INFORMATION_MESSAGE);
		    }
		} while (true);
		 // Escoje el tipo de cambio
		SeleccionTipodeCambio escojemoneda = new SeleccionTipodeCambio() ;
		escojemoneda.MostrarDisplay();
		
		 // Conviertey muestra resultado
		 cambio C = new cambio();
		 C.Conversion(escojemoneda.getCambioSelected().toString(),cantidadDb);
		
		 //Mensaje si se quiere seguir ejecutando el programa
	     Continuar.MostrarDisplay();
	  
		}while (Continuar.isA()); 
	}
}
	

	
	
