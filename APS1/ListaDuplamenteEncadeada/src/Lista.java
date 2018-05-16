import java.util.Comparator;

public class Lista {

private No inicio;
private No fim;


public Lista(){

	inicializa();

}

public void inicializa(){

	inicio=null;
	fim=null;

}



public void insereNoFim(Object info){

	No box = new No(inicio,null,info);
	if (inicio==null)
		inicio = fim = box;
	else{
		
		fim.setProx(box);
		fim = box;
	}
}


public void insereNoComeco(Object info){

	No box = new No(null,inicio,info);
	if (inicio==null)//
		inicio = fim = box;
	else{
		
		inicio.setAnt(box);
		inicio = box;
	}
}

public void exibeLista(){
	No aux;
	aux=inicio;
	while (aux!=null){
		System.out.println(aux.getInfo());
		aux=aux.getProx();
	}
}



	public static int[] insertionSort(int[] input){
	    
	    int temp;
	    for (int i = 1; i < input.length; i++) {
	        for(int j = i ; j > 0 ; j--){
	            if(input[j] < input[j-1]){
	                temp = input[j];
	                input[j] = input[j-1];
	                input[j-1] = temp;
	            }
	        }
	    }
	    return input;
	}
			
	


	




}