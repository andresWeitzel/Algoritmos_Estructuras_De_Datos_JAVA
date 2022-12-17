package algoritmos.recursivos;

import java.util.Scanner;

/*
 * Diseñar un programa recursivo que compruebe una nueva contraseña que se desea
 * ingresar al sistema.... la contraseña será de tipo string, no podra ser vacia 
 * ni nula y al menos debera poseer al menos 6 caracteres, contener una mayuscula 
 * , una minuscula, un numero y algun caracter especial
 * 
 * */
public class PasswordRecursivoTres {
	public static void main(String[] args) {
		
		
		
		PasswordRecursivoTres.checkPassword();
		
		
	}


static void checkPassword () {
	
	System.out.println("\n--- Ingresar un nuevo Password ---");
	System.out.println("Debe contener al menos 1 mayuscula, 1 minuscula"
			+ ", 1 numero y un caracter especial. Longitud minima es de 6 caracteres.");
	Scanner sc = new Scanner(System.in);
	
	String password = sc.next();
	
	
	//para los checks aplicamos ternarios
	boolean checkIsNull = (password == null) ? true :  false;
	boolean checkIsEmpty = (password.isEmpty()) ? true :  false;
	boolean checkLength = (password.length() <= 5) ? true : false;
	
	//Para simplificar codigo trabajamos con REGEX
	//https://support.google.com/a/answer/1371415?hl=es
	//https://www3.ntu.edu.sg/home/ehchua/programming/howto/Regexe.html#:~:text=Special%20Regex%20Characters%3A%20These%20characters,with%20a%20backslash%20(%20%5C%20).
	
	// . --> cualquier caracter individual
	// * --> uno o mas caracteres 
	//[] --> limitacion de regex
	
	//Al menos Numeros
	boolean checkNumber = !(password.matches(".*[0-9].*")) ? true : false;
	
	//mayusc/minus juntas --> [A-Za-z]
	
	//Al menos Letras (Mayus)
	boolean checkMayusc = !(password.matches(".*[A-Z].*")) ? true : false;
	
	//Al menos Letras (Mayus)
	boolean checkMinusc = !(password.matches(".*[a-z].*")) ? true : false;
		

	boolean checkSpecialCharacts = !(password.matches(".*[!\"`'#%&,:;<>=@{}~\\$\\(\\)\\*\\+\\/\\\\\\?\\[\\]\\^\\|].*")) ? true : false;
	
	
	
	if(checkIsNull 
			|| checkIsEmpty 
			|| checkLength
			||  checkNumber
			|| checkMayusc
			|| checkMinusc
			|| checkSpecialCharacts
			) {
		System.out.println("\n\n ==== Password No Válido ====");
		checkPassword();
	}else {
		System.out.println("\n\n ==== Password '" + password +"' Validado Correctamente!!! ====");
	}
	
	
}


}