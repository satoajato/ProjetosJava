import java.util.Scanner;

public class cesar {
		
	public static void main (String[] args) {
	
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		
		while(continuar) {
			System.out.println("Você quer 1-cifrar ou 2-descifrar? (0-para o programa)");
			int x = sc.nextInt();
			switch (x) {
				case 0: //parar
					continuar = false;
					break;
					
				case 1: //cifra
					System.out.println("Seu texto cifrado é: "+Cifra());
					break;
					
				case 2: //descifra
					System.out.println("Seu texto descifrado é: "+Decifra());
					break;
			}
		}
		
	}
	
	public static String Cifra() {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Digite o código a ser encriptado: ");
		String msg = sc1.nextLine();
	    
	    System.out.println("Agora digite um número que será a chave: ");
	    int chave = sc1.nextInt();
		
	    if(chave>26) {
	    	chave = chave %26;
	    }
	    
	    StringBuilder textoCifrado = new StringBuilder();

	    for (int c = 0; c < msg.length(); c++) {
	        int letraCifradaASCII = ((int) msg.charAt(c)) + chave;
	        	if(msg.charAt(c)<91) {
	        		while (letraCifradaASCII > 90) {
	    	            letraCifradaASCII -= 26;
	    	        }
	        	}
	        	
	        	else if(msg.charAt(c)>96) {
	        		while (letraCifradaASCII > 122) {
	    	            letraCifradaASCII -= 26;
	    	        }
	        	}

	        textoCifrado.append((char) letraCifradaASCII);
	    }

	    return textoCifrado.toString();
	}
	
	public static String Decifra() {
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Digite o código a ser decriptado: ");
		String msg = sc2.nextLine();
	    
	    System.out.println("Agora digite um número que será a chave: ");
	    int chave = sc2.nextInt();
	    
	    if(chave>26) {
	    	chave = chave %26;
	    }
		
	    StringBuilder textoCifrado = new StringBuilder();

	    for (int c = 0; c < msg.length(); c++) {
	        int letraCifradaASCII = ((int) msg.charAt(c)) - chave;
	        	if(msg.charAt(c)<91) {
	        		while (letraCifradaASCII < 65) {
	    	            letraCifradaASCII += 26;
	    	        }
	        	}
	        	
	        	else if(msg.charAt(c)>96) {
	        		while (letraCifradaASCII < 97) {
	    	            letraCifradaASCII += 26;
	    	        }
	        	}

	        textoCifrado.append((char) letraCifradaASCII);
	    }

	    return textoCifrado.toString();
	}
}
