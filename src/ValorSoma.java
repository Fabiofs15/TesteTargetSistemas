
public class ValorSoma {

	public static void main(String[] args) {
		int soma = 0;
		for(int indice = 13, k = 0; k < indice; k += 1) {
			soma += k;
		}
		System.out.println("O resultado da soma foi de " + soma);
	}
}
