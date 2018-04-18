
public class LinkedList<T> {
	
	 private Node<?> primeiro;
	 private Node<?> ultimo;
	 private int tamanho;
	 private int totalDeElementos;
	 
	 
	  
	 public LinkedList() {
		super();
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}
	 
	 public void adicionaNoComeco(T elemento) {
		  if(this.totalDeElementos == 0){
		    Node novo = new Node(elemento);
		    this.primeiro = novo;
		    this.ultimo = novo;
		  } else {
		    Node nova = new Node(elemento, this.primeiro);
		    this.primeiro.setAnterior(nova);
		    this.primeiro = nova;
		  }
		  this.totalDeElementos++;
		}
	 
	 public void adicionaFinal(T elemento) {
		  if (this.totalDeElementos == 0) {
		    this.adicionaNoComeco(elemento);
		  } else {
		    Node novo = new Node(elemento);
		    this.ultimo.setProximo(novo);
		    novo.setAnterior(this.ultimo);
		    this.ultimo = novo;
		    this.totalDeElementos++;
		  }
		}
	 public void adiciona(T elemento) {
		    if (this.totalDeElementos == 0) {
		      this.adicionaNoComeco(elemento);
		    } else {
		      Node novo = new Node(elemento);
		      this.ultimo.setProximo(novo);
		      this.ultimo = novo;
		      this.totalDeElementos++;
		    }
		  }
	 public void adiciona(int posicao, T elemento) {
		  if(posicao == 0){ // No começo.
		    this.adicionaNoComeco(elemento);
		  } else if(posicao == this.totalDeElementos){ // No fim.
		    this.adiciona(elemento);
		  } else {
		    Node anterior = this.pegaNode(posicao - 1);
		    Node proximo = anterior.getProximo();
		    Node novo = new Node(elemento, anterior.getProximo());
		    novo.setAnterior(anterior);
		    anterior.setProximo(novo);
		    proximo.setAnterior(novo);
		    this.totalDeElementos++;
		  }
		}
	
	 private boolean posicaoOcupada(int posicao){
		  return posicao >= 0 && posicao < this.totalDeElementos;
		}
	 private Node pegaNode(int posicao) {
		 if(!this.posicaoOcupada(posicao)){
			    throw new IllegalArgumentException("Posição não existe");
			  }

			  Node atual = primeiro;
			  for (int i = 0; i < posicao; i++) {
			    atual = atual.getProximo();
			  }
			  return atual;
	}

	public void mostrarLista(){
		 if(this.tamanho == 0){
			 System.out.println("[]");
		 }else{
			 System.out.print("[");
			 Node aux = this.primeiro;
			 for(int i=0;i<this.totalDeElementos-1;i++){
				 System.out.print(aux.getDado()+", ");
				 aux = aux.getProximo();
			 }
			 System.out.println(aux.getDado()+"]");
		 }
	 }
	public String toString() {

		  // Verificando se a Lista está vazia
		  if(this.totalDeElementos == 0){
		    return "[]";
		  }
		  
		  StringBuilder builder = new StringBuilder("[");
		  Node atual = primeiro;

		  // Percorrendo até o penúltimo elemento.
		  for (int i = 0; i < this.totalDeElementos - 1; i++) {
		    builder.append(atual.getDado());
		    builder.append(", ");
		    atual = atual.getProximo();
		  }

		  // último elemento
		  builder.append(atual.getDado());
		  builder.append("]");
		  
		  return builder.toString();
		}

	public void efficientSort(LinkedList<String> lista) {
		// TODO Auto-generated method stub
		
	}

	public void stableSort(LinkedList<String> lista) {
		// TODO Auto-generated method stub
		
	}
}
