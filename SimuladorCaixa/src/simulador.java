import java.util.ArrayList;
import java.util.Scanner;

public class simulador {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Shampoo", 30.0);
		Produto p2 = new Produto(2, "Calculadora", 30.0);
		Produto p3 = new Produto(3, "Celular", 1500.0);
		Produto p4 = new Produto(4, "Frango", 20.0);
		Produto p5 = new Produto(5, "Detergente", 5.0);
		Produto p6 = new Produto(6, "Crack", 1.0);
		
		ArrayList<Produto> listaProd = new ArrayList<>();
		listaProd.add(p1);
		listaProd.add(p2);
		listaProd.add(p3);
		listaProd.add(p4);
		listaProd.add(p5);
		listaProd.add(p6);
		
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		Lista encad = new Lista();

		do{
			System.out.println("Você quer 1-Adicionar produtos na lista ou 2-remover? (0-para o programa e imprime a lista)");
			int x = sc.nextInt();
			
			switch(x) {
				case 0: //parar
					continuar = false;
					break;
					
				case 1: //adicionar
					System.out.println("Digite o id do produto para adicionar na lista:");
					int z = sc.nextInt();
					Produto aux = listaProd.get(z-1);
					encad.adicionar(aux);
					break;
				
				case 2: //remover
					System.out.println("Digite o Id do produto que você quer remover");
					int y = sc.nextInt();
					encad.remover(y);
					break;
			}
			encad.Imprimir();
		}
		while(continuar);

	}

}
