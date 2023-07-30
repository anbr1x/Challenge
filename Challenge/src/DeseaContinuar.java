import javax.swing.JOptionPane;

public class DeseaContinuar {
	boolean a = true;
	public void MostrarDisplay(){
		  int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",
	                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (respuesta == JOptionPane.YES_OPTION) {
			a= true;
		}
        else if (respuesta == JOptionPane.NO_OPTION) {
       	 JOptionPane.showMessageDialog(null, "Programa Finalizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
           a= false;
       } else if (respuesta == JOptionPane.CANCEL_OPTION) {
       	 JOptionPane.showMessageDialog(null, "Programa Finalizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
         a= false;
       } else {
           System.out.println("Opción no válida o cerrar el cuadro de diálogo...");
   		a= true;

           }
}
	public boolean isA() {
		return a;
	}
	public void setA(boolean a) {
		this.a = a;
	}
}
