package curso;
import java.util.Scanner;
public class Media2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		double peso = 10;
		
		double nota1 = (a*2)+(b*3)+(c*5);
		double nota2 = nota1 / peso;
		
		System.out.printf("MEDIA = %.1f%n", nota2);
		
		teclado.close();
		

	}

}
