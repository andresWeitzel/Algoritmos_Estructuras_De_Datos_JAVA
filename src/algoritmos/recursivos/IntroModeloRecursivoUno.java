package algoritmos.recursivos;

import java.util.Scanner;

public class IntroModeloRecursivoUno {
	
	//http://cpp.aprende-web.net/basico/basico5/basico5_6.php#:~:text=Se%20dice%20que%20una%20funci%C3%B3n,llamada%20a%20la%20propia%20funci%C3%B3n.
	/*
	 * 
	 * Se dice que una funci�n es recursiva cuando dentro de su bloque de sentencias
	 *  hay una llamada a la propia funci�n.

En principio cualquer funci�n puede hacerse una llamada a s� misma, sin embargo 
tiene que estar especialmente dise�ada para que funcione correctamente, ya que 
al llamarse a s� misma provoca que �sta se vuelva a ejecutar, y dentro de sus 
instrucciones se vuelve a llamar, creando un bucle que si no est� controlado 
se vuelve infinito.

Por lo tanto una funci�n recursiva forma un bucle al ser llamada a si misma. 
Este bucle debe ser controlado de alguna manera para poder salir de �l y no caer
 en estructuras indeseadas como bucles infinitos o estructuras que se autorreplican
  indefinidamente.
	 * 
	 * */
	public static void main(String[] args) {
		
		IntroModeloRecursivoUno.iterador();
		
	}
	
	


static void iterador () {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese un valor entero: ");
	
	int valor = sc.nextInt();
	
	
	if(valor < 100) {
		
		for(int i=0; i <= valor ; i++) {
			System.out.println("Iteración Nro : "+i);
		}
		return;
	}
	else {
		iterador();
	}
	
}

}
