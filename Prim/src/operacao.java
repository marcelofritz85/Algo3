class operacao
{
void primfun(int g[][],int nodes){
	int infinity=9999;
	int size=20;
	int tree[]=new int[size];
	
	int i,j,k,min_dist,v1=0,v2=0,total=0;
	
	for(i=0;i<nodes;i++){
		tree[i]=0;
	}

	System.out.println("Árvore geradora mínima:\n");
	tree[0]=1;
	
	for(k=1;k<=nodes-1;k++){
		min_dist=infinity;
		for(i=0;i<=nodes-1;i++){
			for(j=0;j<=nodes-1;j++){
				if(g[i][j]!=0&&((tree[i]==0&&tree[j]!=0)||(tree[i]!=0&&tree[j]==0))){
					if(g[i][j]<min_dist){
						min_dist=g[i][j];
						v1=i;
						v2=j;
					}
				}
			}
		}
		/*v1=v1+1;
		v2=v2+1;
		
		System.out.println("vértice "+v1+" para vértice "+v2+" custo "+min_dist);*/
		tree[v1]=tree[v2]=1;
		total=total+min_dist;
		
		v1=v1+1;
		v2=v2+1;
		
		System.out.println("vértice "+v1+" para vértice "+v2+" custo "+min_dist);
	}
	System.out.println("----------------------------------");
	System.out.println("O comprimento total do caminho é "+total);
	System.out.println("----------------------------------");
	
	}
}