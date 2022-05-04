public class Elemento<T> {
    private T valor;
    private Elemento<T> esquerda;
    private Elemento<T> direita;

    public Elemento(T value) {
        this.valor = value;
        this.direita = null;
        this.esquerda = null;
    }

    public T getValor(){
        return valor;
    }

    public void setValor(T value) {
        this.valor = value;
    }

    public Elemento<T> getEsquerda(){
        return esquerda;
    }

    public void setEsquerda(Elemento<T> left) {
        this.esquerda = left;
    }

    public Elemento<T> getDireita(){
        return direita;
    }

    public void setDireita(Elemento<T> right){
        this.direita = right;
    }
}
