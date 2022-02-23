package arrays.unidimensionales;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Generar 200 elementos de tipo decimal y guardar 100 elementos en un array
 * y otros 100 en otro array. 
 * 
 * En el primer array se deberan cambiar los valores decimales que sean 12.4 a un 
 * nuevo valor 13.3 y los que esten en el rango de 37.2 a 39.6 reemplazar por 36.0.
 * 
 * En el segundo array se deberan cambiar los elementos que esten en el rango de
 * 20.0 a 21.0  por 22.0 y los que sean mayores a 40.0 reemplazados por 40.0
 * 
 * Ademas para ambos arrays se deberan redondear los valores que esten en el rango
 * de 15.5 a 24.5 reemplazandolos por el siguente valor de cada medicion .
 *  Ej: 15.5 --> 16  17.8 --> 18 etc
 * 
 * Se deberan mostrar los indices y valores en la salida de la consola
 * */

public class AgregarManipularElementosMedicionesDecimalesParteDosCompleted {
	public static void main(String[] args) {

		double primerArrayDecimales[] = new double[100];
		double segundoArrayDecimales[] = new double[100];

		double decimalAleatorio;

		NumberFormat formato = new DecimalFormat("#.0", new DecimalFormatSymbols(Locale.ENGLISH));

		// ================= LLENAMOS LOS ARRAYS ======================

		for (int i = 0; i < primerArrayDecimales.length; i++) {

			// El numero min aleatorio es el 2.0 y el Maximo es 51.0 (49.0 + 2.0)
			decimalAleatorio = Math.random() * 49.0 + 2.0;

			// Guardamos el decimal en el array con el formato deseado
			primerArrayDecimales[i] = Double.valueOf(formato.format(decimalAleatorio));

			// System.out.println(primerArrayDecimales[i]);

		}

		System.out.println("========================");

		for (int i = 0; i < segundoArrayDecimales.length; i++) {

			// El numero min aleatorio es el 2.0 y el Maximo es 51.0 (49.0 + 2.0)
			decimalAleatorio = Math.random() * 49.0 + 2.0;

			// Guardamos el decimal en el array con el formato deseado
			segundoArrayDecimales[i] = Double.valueOf(formato.format(decimalAleatorio));

			// System.out.println(segundoArrayDecimales[i]);

		}

	
		
		
		// =============== RECORREMOS LOS ARRAYS Y FILTRAMOS MEDICIONES ==============

		for (int i = 0; i < primerArrayDecimales.length; i++) {

			if (primerArrayDecimales[i] == 12.4) {

				primerArrayDecimales[i] = 13.3;

			}else if (primerArrayDecimales[i] >= 15.5 && primerArrayDecimales[i] <= 17.8) {
				
				//Redondeamos
				primerArrayDecimales[i] = Math.ceil(primerArrayDecimales[i]);
				
			} else if (primerArrayDecimales[i] >= 37.0 && primerArrayDecimales[i] <= 39.6) {

				primerArrayDecimales[i] = 36.0;
				
			}else {
				primerArrayDecimales[i] = primerArrayDecimales[i];
			}
			
	
			System.out.println(primerArrayDecimales[i]);

		}
		
		
System.out.println("================================");
	
		
		for (int i = 0; i < segundoArrayDecimales.length; i++) {

			if (segundoArrayDecimales[i] >= 20.0 && segundoArrayDecimales[i] <= 21.0) {

				segundoArrayDecimales[i] = 22.0;

			}else if (segundoArrayDecimales[i] >= 15.5 && segundoArrayDecimales[i] <= 17.8) {
				
				//Redondeamos
				segundoArrayDecimales[i] = Math.ceil(segundoArrayDecimales[i]);
				
			} else if (segundoArrayDecimales[i] >= 40.0) {

				segundoArrayDecimales[i] = 40.0;
				
			}else {
				segundoArrayDecimales[i] = segundoArrayDecimales[i];
			}
			
	
			System.out.println(segundoArrayDecimales[i]);

		}

	}
}
