
public class Pilha {
	char elementos[];
	int topo;
	
	public Pilha(int x) { //construtor
		elementos = new char[2*x];
		topo = -1;
	}
	
	public void push(char e) { //adiciona elemento
		topo++;
		elementos[topo] = e;
	}
	
	public char pop() { //remove elemento
		char e;
		e = elementos[topo];
		topo--;
		return e;
		
	}
	
	public int size() { //retorna tamanho da pilha
		return topo+1;
	}
	
	public boolean isEmpty() { 
		return (topo == -1);
	}
	
	public boolean isFull() {
		return (topo == elementos.length-1);
	}
	
	public char top() {
		return elementos[topo];
	}
}
