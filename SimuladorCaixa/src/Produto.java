
public class Produto {
	int id;
	String descricao;
	double preco;
	
	Produto() {
	}
	
	Produto(int iden, String desc, double pr) {
		this.id = iden;
		this.descricao = desc;
		this.preco = pr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
