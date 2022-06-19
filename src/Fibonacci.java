import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 1;
		int soma;
		int numeroEscolhido;
		ArrayList<Integer> listaFibonacci = new ArrayList<>();
		listaFibonacci.add(numero1);
		listaFibonacci.add(numero2);
		
		System.out.println("Digite um numero, e descubra se ele pertence a sequencia de fibonacci: ");
		numeroEscolhido = scanner.nextInt();
		int tamanho = numeroEscolhido + 10;
		
		for(int i = 2; i < tamanho; i++) {
			soma = numero1 + numero2;
			numero1 = numero2;
			numero2 = soma;		
			listaFibonacci.add(numero1);
			listaFibonacci.add(numero2);
		}
		if(listaFibonacci.contains(numeroEscolhido)) {
			System.out.println("Seu numero pertence a sequencia de Fibonacci");
		}
		else {
			System.out.println("Seu numero não pertence a sequencia de Fibonacci");
		}
		
	}

}
