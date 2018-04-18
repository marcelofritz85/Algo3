
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> lista = new LinkedList<String>();
		
		
		//------------------------------
		
		lista.adicionaNoComeco("1->");
		lista.adicionaNoComeco("2->");
		lista.adicionaNoComeco("3->");
		lista.adicionaNoComeco("4->");
		lista.adicionaNoComeco("5->");
		lista.adicionaNoComeco("6->");
		
		lista.adicionaFinal("<-1");
		lista.adicionaFinal("<-2");
		lista.adicionaFinal("<-3");
		lista.adicionaFinal("<-4");
		lista.adicionaFinal("<-5");
		lista.adicionaFinal("<-6");
		
		
		
		lista.efficientSort(lista);
		lista.stableSort(lista);
		
		System.out.println(lista);
		
		
	}

}
