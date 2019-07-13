package curso;
import java.util.Scanner;
public class SalarioBonus {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome = teclado.next();
		double salario = teclado.nextDouble();
		double vendas = teclado.nextDouble();
		
		double salarioTotal = (vendas * 0.15) + salario;
		
		System.out.println("TOTAL = " + salarioTotal);
		
		teclado.close();
		

	}

}
