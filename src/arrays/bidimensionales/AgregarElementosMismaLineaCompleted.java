package arrays.bidimensionales;

/* Se desea crear una matriz cuadrada de 2x2 y agregar elementos 
 * sobre la misma linea. Seguidamente imprimirlos en consola*/
public class AgregarElementosMismaLineaCompleted {

	public static void main(String[] args) {
		
		
		//int arrayNumeros[][] = new int[2][2];
		//int arrayNumeros[][] = new int[][] { {12,22} , {44,23} };
		
		//Matriz 2x2
		int arrayNumeros01[][] = { {12,22} , {44,23} };
		
		//Matriz 3x3
		int arrayNumeros02[][] = { {12,22,44} , {44,23,44} , {33,2132,44} };
		
		System.out.println("\n======= ELEMENTOS ARRAY/MATRIZ =======");
		
		
		System.out.println("\nPrimera Fila");
		System.out.println(arrayNumeros02[0][0]);
		System.out.println(arrayNumeros02[0][1]);
		System.out.println(arrayNumeros02[0][2]);
		
		System.out.println("\nSegunda Fila");
		System.out.println(arrayNumeros02[1][0]);
		System.out.println(arrayNumeros02[1][1]);
		System.out.println(arrayNumeros02[1][2]);
		
		System.out.println("\nTercera Fila");
		System.out.println(arrayNumeros02[2][0]);
		System.out.println(arrayNumeros02[2][1]);
		System.out.println(arrayNumeros02[2][2]);
		
		
		
		
		
		
	}
}
