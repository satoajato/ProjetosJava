
public class Fila {
	private int[] valores;
	private int first, last, total;
	
	public Fila(int tamanho) {
		valores = new int[tamanho];
		first = 0;
		last = 0;
		total = 0;
	}
	
	public void inserir(int elem) {
		valores[last] = elem;
		last = (last+1)%valores.length;
		total++;
	}
	
	public int retirar() {
		int elem = valores[first];
		first = (first+1)%valores.length;
		total--;
		return elem;
	}
	
	public int primeiro() {
		return valores[first];
	}
	
	public int ultimo() {
		return valores[last];
	}
	
	public int size() {
		return total;
	}
	
	public boolean isEmpty() {
		return total==0;
	}
	
	public boolean isFull() {
		return total==valores.length;
	}
	
	public String toString() {
		String txt = "";
		for(int x=0; x<total; x++) {
			txt = txt + " " + valores[x];
		}
		return txt;
	}
}
