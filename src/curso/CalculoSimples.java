package curso;
import java.util.Scanner;
public class CalculoSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int codigoPecaUm = teclado.nextInt();
		int quantidadePecaUm = teclado.nextInt();
		double valorPecaUm = teclado.nextDouble();
		
		int codigoPecaDois = teclado.nextInt();
		int quantidadePecaDois = teclado.nextInt();
		double valorPecaDois = teclado.nextDouble();
		
		double valor1 = quantidadePecaUm * valorPecaUm;
		double valor2 = quantidadePecaDois * valorPecaDois;
		double valorFinal = valor1 + valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
		
		teclado.close();
		
		
		
		
	

	}

}
