package vetorPackage;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		
		Vetor vet1 = new Vetor(n);
        	vet1.leVetor("V");
        	vet1.imprimeVetor("V");
        	vet1.somaElementos();
        	vet1.menorElemento();
        
	}

}
