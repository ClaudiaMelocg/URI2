package curso;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		int horas = teclado.nextInt();
		double valor = teclado.nextDouble();
		
		double salario = horas * valor;
		
		System.out.println("NUMBER " + numero);
		System.out.println("SALARY = U$" + salario);
		
		teclado.close();

	}

}
