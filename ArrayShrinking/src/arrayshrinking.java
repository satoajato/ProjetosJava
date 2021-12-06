import java.util.Arrays;
import java.util.Scanner;

public class arrayshrinking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuar = true;
		
		System.out.println("Qual o tamanho do array?");
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		Integer[] array = new Integer[tam];
		do {
			System.out.println("Este é o seu vetor: " + Arrays.toString(array));
			System.out.println("Deseja adicionar números ao vetor? (0-parar o programa; 1-sim)");
			int z = sc.nextInt();
			
			switch (z) {
				case 0: {
					continuar = false;
					sc.close();
					break;
				}
				
				case 1:{
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
				}
			}
		}
		while(continuar);

	}
	
	public static Integer[] Shrinking(Integer[] array) {
		Integer[] arrayShrink = new Integer[array.length/2];
		for (int i = 0; i<arrayShrink.length; i++) {
			arrayShrink[i] = array[i];
		}
		return arrayShrink;
	}

}
