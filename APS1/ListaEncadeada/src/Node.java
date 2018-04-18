
public class Node<T> {
	T dado;
	private Node proximo;
	private Node anterior;
	
	public Node(T dado, Node proximo) {
		super();
		this.dado = dado;
		this.proximo = proximo;
		this.anterior = anterior;
	}
		
	public Node(T dado) {
		super();
		this.dado = dado;
	}


	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	
	
	
	
	
	
	
}
