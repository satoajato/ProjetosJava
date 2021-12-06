
public class Node {
	private Node proximo;
	private Produto prod;
	private int qtd;
	
	Node(Produto p) {
		this.prod = p;
		this.qtd = 1;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int q) {
		this.qtd = q;
	}
	
	public void IncQtd(){
		this.qtd++;
	}
	
	public Node getProximo() {
		return proximo;
	}
	
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	public Produto getProduto() {
		return prod;
	}
	
	public void setProduto(Produto valor) {
		this.prod = valor;
	}
}
