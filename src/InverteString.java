import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = scanner.next();
		String fraseInvertida = new StringBuilder(palavra).reverse().toString();
		
		System.out.println(fraseInvertida);
	}

}
