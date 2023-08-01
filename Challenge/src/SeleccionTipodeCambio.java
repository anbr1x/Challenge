import javax.swing.JOptionPane;

public class SeleccionTipodeCambio {
	Object CambioSelected = 0;

	public void MostrarDisplay(String Selecion){
	if(Selecion == "Conversor de monedas") {
		CambioSelected = JOptionPane.showInputDialog(null,
             "Elija la moneda a la que deseas convertir tu dinero", "Monedas",
             JOptionPane.INFORMATION_MESSAGE, null,
             Convertir.TiposDcambio, Convertir.TiposDcambio[0]);}
	if(Selecion == "Conversor de Temperaturas") {
		CambioSelected = JOptionPane.showInputDialog(null,
	            "Elija una opcion para convertir", "Temperaturas",
	            JOptionPane.INFORMATION_MESSAGE, null,
	            Convertir.TiposDcambioT, Convertir.TiposDcambioT[0]);
			}	
		}
	

	public Object getCambioSelected() {
		return CambioSelected;
	}
}
	

