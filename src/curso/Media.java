package curso;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		int peso = 11;
		double nota1 = (a*3.5)+(b*7.5);
		double nota2 = nota1 / peso;
		
		System.out.printf("MEDIA = %.5f%n", nota2);
		
		teclado.close();
		
		

	}

}
