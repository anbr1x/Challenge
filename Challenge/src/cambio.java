import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class cambio {
     public String convertidoa = " ";
     public float ValorConvertido;
     public String Caracter = " ";

     public  void  Conversion(String Cambioto, Float cantidad) {
         // Aquie el switch case
    	 switch (Cambioto) {
    	    case "De Soles a Dólar":
    	    	convertidoa = "Dolares";
    	        Caracter = "$";
    	        ValorConvertido = cantidad*(float) 0.27477514;
    	        break;
    	    case "De Soles a Euro":
    	    	convertidoa = "Euros";
    	        Caracter = "€";
    	        ValorConvertido = cantidad*(float) 0.25300141;
    	        break;
    	    case "De Soles a Libra":
    	    	convertidoa = "Libras";
    	        Caracter = "£";
    	        ValorConvertido = cantidad*(float) 0.21701829;
    	        break;
    	    case "De Soles a Yen":
    	    	convertidoa = "Yenes";
    	        Caracter = "£";
    	        ValorConvertido = cantidad*(float) 39.356357;
    	        break;
    	    case "De Soles a Won Coreano":
    	    	convertidoa = "Wones Coreanos";
    	        Caracter = "₩";
    	        ValorConvertido = cantidad*(float) 355.05115 ;
    	        break;
    	    case "De Dólar a Soles":
    	    	convertidoa = "Soles";
    	        Caracter = "S/";
    	        ValorConvertido = cantidad*(float) 3.5869993;
    	        break;
    	    case "De Euro a Soles":
    	    	convertidoa = "Soles";
    	        Caracter = "S/";
    	        ValorConvertido = cantidad*(float) 3.9548752;
    	        break;
    	    case "De Libras a Soles":
    	    	convertidoa = "Soles";
    	        Caracter = "S/";
    	        ValorConvertido = cantidad*(float) 4.6077171;
    	    	break;
    	    case "De Yen a Soles":
    	    	convertidoa = "Soles";
    	        Caracter = "S/";
    	        ValorConvertido = cantidad*(float) 0.025408856;
    	    	break;
    	    case "De Won Coreano a Soles":
    	    	convertidoa = "Soles";
    	        Caracter = "S/";
    	        ValorConvertido = cantidad*(float) 0.0028164956;
    	    	break;
    	    	// Convertir de Celsius a Fahrenheit
    	    case "Celsius a Fahrenheit":
    	        convertidoa = "Fahrenheit";
    	        Caracter = "°F";
    	        ValorConvertido = (cantidad * 9/5) + 32;
    	        break;

    	    // Convertir de Celsius a Kelvin
    	    case "Celsius a Kelvin":
    	        convertidoa = "Kelvin";
    	        Caracter = "°C";
    	        ValorConvertido = (float) (cantidad + 273.15);
    	        break;

    	    // Convertir de Fahrenheit a Celsius
    	    case "Fahrenheit a Celsius":
    	        convertidoa = "Celsius";
    	        Caracter = "°F";
    	        ValorConvertido = (cantidad - 32) * 5/9;
    	        break;

    	    // Convertir de Fahrenheit a Kelvin
    	    case "Fahrenheit a Kelvin":
    	        convertidoa = "Kelvin";
    	        Caracter = "°F";
    	        ValorConvertido = (float) ((cantidad - 32) * 5/9 + 273.15);
    	        break;

    	    // Convertir de Kelvin a Celsius
    	    case "Kelvin a Celsius":
    	        convertidoa = "Celsius";
    	        Caracter = "K";
    	        ValorConvertido = (float) (cantidad - 273.15);
    	        break;

    	    // Convertir de Kelvin a Fahrenheit
    	    case "Kelvin a Fahrenheit":
    	        convertidoa = "Fahrenheit";
    	        Caracter = "K";
    	        ValorConvertido = (float) ((cantidad - 273.15) * 9/5 + 32);
    	        break;

    	    default:
    	        System.out.println("Valor inválido");
    	}
		 DecimalFormat df = new DecimalFormat("0.00");
		 String ValorConvertidoStr = df.format(ValorConvertido);
		 
    	 String mensaje = String.format("Son %s %s %s", 
    			 ValorConvertidoStr,Caracter,convertidoa );
	     JOptionPane.showMessageDialog(null, mensaje, "alert", JOptionPane.INFORMATION_MESSAGE);
}

	public String getSimbolMoneda() {
		return Caracter;
	}




	public String getMonedaConvertida() {
		return convertidoa;
	}
}

