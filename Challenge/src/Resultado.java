import javax.swing.JOptionPane;

public class Resultado {
	 cambio D = new cambio();
	public void MostrarDisplay(Object DatosdeConversion, String CanitidadConvertidaRendondeado ){
	     String mensaje = String.format("Tienes %s %s %s", 
	    		 (String) D.getMonedaConvertida(), CanitidadConvertidaRendondeado, (String) D.getSimbolMoneda());
	     JOptionPane.showMessageDialog(null, mensaje, "alert", JOptionPane.INFORMATION_MESSAGE);
	}}
