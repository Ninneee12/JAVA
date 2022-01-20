import java.util.Locale;
import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    System.out.println("Digite o raio: ");
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A are do circulo é: %.4f%n", A);

		sc.close();

	}

}
