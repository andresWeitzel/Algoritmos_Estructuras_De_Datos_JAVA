package arrays.unidimensionales;

public class EliminarElementos {

	public static void main(String[] args) {
		
		
		int array[] = new int[20];
		
		int arrayTemporal[] = new int[array.length];

		
		
		
		
		System.out.println("\n=== Array de Números ===");
		for (int i = 0; i < array.length; i++) {

			array[i] = 1 + i;

			System.out.println(array[i]);
		}

		
		
		
		
		
		System.out.println("\n==== Eliminando Elementos ====");

		for (int i = 0; i < array.length; i++) {

			if (array[i] <= array.length) {

				if (array[i] == 12) {

					array[i] = 0;
					
				    //System.out.println(array[i]);;
					
					arrayTemporal[i] = array[i+1] ;

				}

				else if ((!(array[i] == 0)) && (!(arrayTemporal[i] == arrayTemporal[0]))) {

					if((arrayTemporal[i] == arrayTemporal[i - 1])) {
						
						
						arrayTemporal[i] = array[i+1];

						System.out.println(array[i]);

					}else {
						
						arrayTemporal[i] = array[i] ;
						
						System.out.println(array[i]);
						
					}
					
				}else if(arrayTemporal[i] == arrayTemporal[0]){
				
					arrayTemporal[i] = array[i] ;
					
					System.out.println(array[i]);
				
				}else {
				

					return;
					//arrayTemporal[i] = arrayTemporal[i];
					//arrayTemporal[i] = array[i+1] ;
				}

			}

		}
		
		

		System.out.println("\n=== Array Depurado ===");

		for (int i = 0; i < arrayTemporal.length; i++) {

			System.out.println(arrayTemporal[i]);

		}


	}

}
