import javax.swing.JOptionPane;

public class Input {
	String Cantidad = "";
	public void MostrarDisplay(){
	String CantidadConvertirStr =
            JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
	Cantidad = CantidadConvertirStr;
}
	public String getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
}