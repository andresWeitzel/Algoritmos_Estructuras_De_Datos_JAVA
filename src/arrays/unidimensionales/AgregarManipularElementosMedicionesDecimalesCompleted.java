package arrays.unidimensionales;

import java.util.Arrays;

/*
 * De la siguiente lista de Mediciones se necesita guardar 
 * solo los valores decimales mayores a una temperatura de 28 grados 
 * y no los enteros ni tampoco las mediciones menores a 28 grados. 
 * Filtrar dichos requerimientos y almacenarlos dentro de un array.
 * 
 * 
 * String arrayMediciones[] = {
 * "12", "14.4", "17.6", "15.2", "16", "17",
 * "23.6", "18.4", "17", "11", "17.2", "23",
 * "33", "32.1", "11", "32.5", "30.2", "29.22"
 * };
 * */

public class AgregarManipularElementosMedicionesDecimalesCompleted {
	
	public static void main(String[] args) {
		
		  String arrayMediciones[] = {
				  "12", "14.4", "17.6", "15.2", "16", "17",
				  "23.6", "18.4", "17", "11", "17.2", "23",
				  "33", "32.1", "11", "32.5", "30.2", "29.22"
				  };
		  
		double arrayMedicionesDecimales[] = new double[arrayMediciones.length];  
		  
		
	
		for( int i=0; i < arrayMediciones.length ; i++) {
			
			//Nos aseguramos que sea decimal
			if(arrayMediciones[i].contains(".") || arrayMediciones[i].contains(",")){
				
				//Guardamos el vaslor el formato decimal por cada iteracion
				double valorTemperatura = Double.parseDouble(arrayMediciones[i]);
				
				
				//Filtramos las mediciones mayores a 28 grados y lo guardamos en el nuevo array
				if (valorTemperatura > 28.0) {
					
					arrayMedicionesDecimales[i] = valorTemperatura;
					
					System.out.println(arrayMedicionesDecimales[i]);
					
				}
				
				
			}
			
		}
		
		  
		
	}
	
	

}
