package algoritmos.recursivos;

import java.util.Scanner;

/*
 * Diseñar un programa recursivo que compruebe una nueva contraseña que se desea
 * ingresar al sistema.... la contraseña será de tipo string, no podra ser vacia 
 * ni nula y al menos debera poseer al menos 6 caracteres 
 * 
 * 
 * */
public class PasswordRecursivoDos {
	
	public static void main(String[] args) {
		
		PasswordRecursivoDos.checkPassword();
		
	}
	
	static void checkPassword () {
		
		System.out.println("\n--- Ingresar un nuevo Password ---");
		Scanner sc = new Scanner(System.in);
		
		String password = sc.next();
		
		
		//para los checks aplicamos ternarios
		boolean checkIsNull = (password == null) ? true :  false;
		boolean checkIsEmpty = (password.isEmpty()) ? true :  false;
		boolean checkLength = (password.length() <= 5) ? true : false;
		
		
		if(checkIsNull || checkIsEmpty || checkLength) {
			System.out.println("\n\n ==== Password No Válido ====");
			checkPassword();
		}else {
			System.out.println("\n\n ==== Password '" + password +"' Válidado Correctamente!!! ====");
		}
		
		
	}

}
