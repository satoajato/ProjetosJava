public class Lista {
	private Node primeiro;
	
	Lista() {
		this.primeiro = null;
	}
	
	public void adicionar(Produto p) {
		Node aux = buscar(p.getId());
		if(aux == null) {
			Node no = new Node(p);
			
			no.setProximo(this.primeiro);
			this.primeiro=no;
		}
		else if(aux!=null){
			aux.IncQtd();
		}
	}
	
	public Node remover(int i) {
		Node aux = primeiro;
		Node aux2 = null;
		
		while((aux != null) && (aux.getProduto().getId() != i)) {
			aux2 = aux;
			aux = aux.getProximo();
		}
		
		if(aux == this.primeiro) {
			Node retorna = this.primeiro;
			this.primeiro = this.primeiro.getProximo();
			return retorna;
		}
		
		else if(aux != null) {
			aux2.setProximo(aux.getProximo());
		}
		
		return aux2;
	}
	
	public Node buscar(int i) {
		Node aux = this.primeiro;
		while((aux != null) && (aux.getProduto().getId() != i)) {
			aux = aux.getProximo();
		}
		return aux;
	}
	
	public void Imprimir() {
		double total = 0;
		Node aux = this.primeiro;
		while(aux != null) {
			System.out.println(aux.getProduto().getDescricao() + " - " + aux.getQtd() + " x " + aux.getProduto().getPreco() + " = " + aux.getQtd()*aux.getProduto().getPreco());
			total += aux.getQtd() * aux.getProduto().getPreco();
			aux = aux.getProximo();
		}
		System.out.println("-------TOTAL: " + total + "--------");
	}
}