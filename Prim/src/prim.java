import java.io.*;
import java.util.Scanner;
class prim{
	
	public static void main(String args[])throws IOException{
				
		//---------------------------------------------------------------------
        System.out.println( "___________________________" );
		try{
			
			BufferedReader br = new BufferedReader(new FileReader("grafo.txt"));
			while(br.ready()){
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		} 
        System.out.println( "___________________________" );
        //---------------------------------------------------------------------
		Scanner scanner = new Scanner(new FileReader("grafo.txt"));
		//System.out.println( scanner.next() );
        /*while (scanner.hasNext()) {
            System.out.println( scanner.next() );
        }*/
		//---------------------------------------------------------------------
		int size=20;

		int nodes,v1,v2,length,i,j,n;
		int g[][]=new int[size][size];
		
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\nNúmero de vértices");
		
		nodes=Integer.parseInt(scanner.next());
		System.out.println( nodes );
		//nodes=Integer.parseInt(in.readLine());
		
		System.out.println("\nNúmero de arestas");
		
		n=Integer.parseInt(scanner.next());
		System.out.println( n );
		//n=Integer.parseInt(in.readLine());
		
		for(i=0;i<nodes;i++){
			for(j=0;j<nodes;j++){
				g[i][j]=0;
				}
		}
		System.out.println("----------------------------------");
		
		while (scanner.hasNext()) {
			for(i=0;i<n;i++){
				//System.out.println("Informe o primeiro vértice e o segundo vértice:");
				v1=Integer.parseInt(scanner.next());
				v1=v1-1;
				v2=Integer.parseInt(scanner.next());
				v2=v2-1;
				//v1=Integer.parseInt(in.readLine());
				//v2=Integer.parseInt(in.readLine());
				//System.out.println("insira o custo");
				length=Integer.parseInt(scanner.next());
				g[v1][v2]=g[v2][v1]=length;
			}
		}
		operacao ob=new operacao();
		ob.primfun(g,nodes);
	}
}