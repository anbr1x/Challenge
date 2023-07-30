import javax.swing.JOptionPane;

public class Inicio {
	String Selecion = "";
	public void MostrarDisplay(){
	
    String selectedValue = (String) JOptionPane.showInputDialog(null,
            "Seleccione una opción de conversion", "Menu",
            JOptionPane.INFORMATION_MESSAGE, null,
            Convertir.possibleValues, Convertir.possibleValues[0]);
	 Selecion = selectedValue;
	 
}
	public String getSelecion() {
		return Selecion;
	}
}
