package vetorPackage;
import java.util.Scanner;

public class Vetor {
	private int[] vet;
    	Scanner ler = new Scanner(System.in);
    
    	public Vetor(int n){
        	vet = new int[n];
    	}
    	public int[] getVet() {
		return vet;
	}

	public void setVet(int[] vet) {
		this.vet = vet;
	}
	
	public void leVetor(String V){
	    for(int i = 0; i<vet.length;i++){
	        vet[i] = ler.nextInt();
	    }
	}
	
	public void imprimeVetor(String V){
	    for(int i = 0; i<vet.length;i++){
	        System.out.print(vet[i] + " ");
	    }
	    System.out.printf("%n");
	}
	
	public void somaElementos(){
	    int soma = 0;
	    for(int i =0;i<vet.length;i++){
	        soma += vet[i];
	    }
	    System.out.println("soma = " + soma);
	}
	
	public void menorElemento(){
	    int menor = vet[0];
	    for(int i =1;i<vet.length;i++){
	        if(menor>vet[i]){
	            menor = vet[i];
	        }
	    }
	    System.out.println("menor = "+ menor);
	}
}
