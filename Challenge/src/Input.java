import javax.swing.JOptionPane;

public class Input {
	String Cantidad = "";
	boolean Cancel = true;
	public void MostrarDisplay(String Seleccion){
		if(Seleccion == "Conversor de monedas") {
		String CantidadConvertirStr =
				JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
		Cantidad = CantidadConvertirStr;
}		if(Seleccion == "Conversor de Temperaturas") {
		String CantidadConvertirStr =
				JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
		Cantidad = CantidadConvertirStr;
		}
		if(Seleccion == null) {
			System.exit(0);
		}
}
	public String getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	public boolean getCancel() {
		return Cancel;
	}
}