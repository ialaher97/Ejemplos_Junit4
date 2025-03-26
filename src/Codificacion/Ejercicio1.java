package Codificacion;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		compress("abc");

	
			

	}
	public static void compress(String a) {
		String vacio = "";
		String copiaCadena = a;
		int cont = 0;
		int contPos = 0;
		
		for(int i=0;i<a.length();i++) { 
			for(int j=0;j<a.length();j++) {
				if(a.charAt(i) == a.charAt(j)) {
					cont++;
                    contPos++;
					
				}
			}
			a = a.substring(contPos-1,a.length());
	        String caracter = String.valueOf(a.charAt(i));
	        vacio += caracter+cont;
	        cont = 0;
	        contPos= 0;
		}
		if(a.length()<=copiaCadena.length()){
            System.out.print("cadena comprimida: "+vacio);
        }else {
            System.out.println(copiaCadena);
        }
		
	}
}



