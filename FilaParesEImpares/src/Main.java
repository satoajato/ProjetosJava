import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4,32,34,543,3456,654,567,87,6789,98,199};
		System.out.println(Printar(array));
	}

	private static String Printar(int[] array) {
		// TODO Auto-generated method stub
		String filas = "";
		Fila par = new Fila(array.length);
		Fila impar = new Fila(array.length);
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) { //caso par
				par.inserir(array[i]);
			}
			else { //caso impar
				impar.inserir(array[i]);
			}
		}
		
		System.out.println("Fila de Par: " + par.toString() + "\nFila de Impar: " + impar.toString());
		System.out.println("--------------------------------------------------");
		
		par = OrdenarCrescente(par);
		impar = OrdenarDecrescente(impar);
		
		filas = "Fila de Par Ordenado: " + par.toString() + "\nFila de Impar Ordenado: " + impar.toString();
		return filas;
	}
	
	private static Fila OrdenarCrescente(Fila q1) {
		Fila FilaAux = new Fila(q1.size());
	    int min=Integer.MAX_VALUE;
	    
	    while (!q1.isEmpty()) {
	        q1.inserir(-1);
	        while(q1.primeiro() != -1) {
	            if (q1.primeiro() < min) {
	                min=q1.primeiro();
	            }
	            q1.inserir(q1.retirar());

	        }
	        q1.retirar();
	        while (q1.primeiro() != min)
	        {
	            q1.inserir(q1.retirar());
	        }
	        min = Integer.MAX_VALUE;
	        FilaAux.inserir(q1.retirar()); 
	    }
	    return FilaAux;
	}
	
	private static Fila OrdenarDecrescente(Fila q1) {
		Fila FilaAux = new Fila(q1.size());
	    int max=Integer.MIN_VALUE;
	    
	    while (!q1.isEmpty()) {
	        q1.inserir(-1);
	        while(q1.primeiro() != -1) {
	            if (q1.primeiro() > max) {
	                max=q1.primeiro();
	            }
	            q1.inserir(q1.retirar());

	        }
	        q1.retirar();
	        while (q1.primeiro() != max)
	        {
	            q1.inserir(q1.retirar());
	        }
	        max = Integer.MIN_VALUE;
	        FilaAux.inserir(q1.retirar());
	    }
	    return FilaAux;
	}

}
