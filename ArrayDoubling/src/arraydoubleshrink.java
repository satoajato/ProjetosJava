import java.util.Arrays;
import java.util.Scanner;

public class arraydoubleshrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuar = true;
		boolean doubled = false;
		int cont = 0;
		
		System.out.println("Qual o tamanho do array?");
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		Integer[] array = new Integer[tam];
		do {
			System.out.println("Este é o seu vetor: " + Arrays.toString(array));
			System.out.println("Como deseja manipular o array? (0- Para o programa; 1- ArrayDoubling; 2- ArrayShrinking; 3- Reescreve o vetor)");
			int z = sc.nextInt();
			
			switch (z) {
				case 0: {
					continuar = false;
					sc.close();
					break;
				}
				
				case 1:{
					if(!doubled) {
						System.out.println("Preencha o vetor: ");
						for (int i = 0; i < array.length; i++) {
							array[i] = sc.nextInt();
						}
						cont = 0;
						for(int i=0; i<=array.length-1; i++){
							if(!(array[i].equals(null))){
								cont++;
							}
						}
						if(cont == array.length) {
							System.out.println("A capacidade de armazenamento do array foi dobrada");
							doubled = true;
							array = Doubling(array);
						}
					}
					else {
						System.out.println("Continue preenchendo o vetor: ");
						for (int i = cont; i < array.length; i++) {
							array[i] = sc.nextInt();
						}
						cont = 0;
						for(int i=0; i<=array.length-1; i++){
							if(!(array[i].equals(null))){
								cont++;
							}
						}
						if(cont == array.length) {
							System.out.println("A capacidade de armazenamento do array foi dobrada");
							doubled = true;
							array = Doubling(array);
						}
					}
					break;
				}
				
				case 2:{
					doubled = false;
					System.out.println("Preencha o vetor: ");
					for (int i = 0; i < array.length; i++) {
						if(i == array.length/3) {
							System.out.println("O vetor foi dividido na metade!");
							array = Shrinking(array);
							break;
						}
						else {
							array[i] = sc.nextInt();
						}
					}
					break;
				}
				
				case 3:{
					doubled = false;
					System.out.println("Reescreva o vetor:");
					for (int i = 0; i < array.length; i++) {
							array[i] = sc.nextInt();
					}
					break;
				}
			}
		}
		while(continuar);

	}
	
	public static Integer[] Doubling(Integer[] array) {
		Integer[] arrayDouble = new Integer[array.length*2];
		for (int i = 0; i<array.length; i++) {
			arrayDouble[i] = array[i];
		}
		return arrayDouble;
	}
	
	public static Integer[] Shrinking(Integer[] array) {
		Integer[] arrayShrink = new Integer[array.length/2];
		for (int i = 0; i<arrayShrink.length; i++) {
			arrayShrink[i] = array[i];
		}
		return arrayShrink;
	}

}
