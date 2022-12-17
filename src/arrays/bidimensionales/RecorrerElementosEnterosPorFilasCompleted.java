package arrays.bidimensionales;

/*Recorrer los elementos por sus filas de la siguiente matriz 2x2 

*
	 (			
	 	6,7
	 	4,55
	 		)
	
*/

public class RecorrerElementosEnterosPorFilasCompleted {

	public static void main(String[] args) {

		// Matriz 2x2
		int arrayNumeros01[][] = { { 6, 7 }, { 4, 55 } };


		System.out.println("\n======= ELEMENTOS ARRAY/MATRIZ POR INDICE=======");

		System.out.println("\nPrimera Fila");
		System.out.println(arrayNumeros01[0][0]);
		System.out.println(arrayNumeros01[0][1]);

		System.out.println("\nSegunda Fila");
		System.out.println(arrayNumeros01[1][0]);
		System.out.println(arrayNumeros01[1][1]);
		
		
		System.out.println("\n======= RECORRIDO ELEMENTOS ARRAY/MATRIZ POR FILAS=======");
		
		System.out.println("---Fila 0---");
		for(int i=0 ; i < arrayNumeros01.length; i++ ) {
			
			System.out.println(arrayNumeros01[0][i]);
		}
		
		
		System.out.println("---Fila 1---");
		for(int i=0 ; i < arrayNumeros01.length; i++ ) {
			
			System.out.println(arrayNumeros01[1][i]);
		}
		
		System.out.println("\n======= RECORRIDO ELEMENTO A ELEMENTO ARRAY/MATRIZ POR FILAS (EFICIENTE)=======");
		
		for(int i=0 ; i < arrayNumeros01.length; i++ ) {
			
			System.out.println("----FILAS"+i+"-----");
			
			for(int j=0 ; j<arrayNumeros01.length ; j++) {
				System.out.println("----COLUMNAS"+j+"-----");
				
				System.out.println(arrayNumeros01[i][j]);
			}
		}
		
		

	}

}
