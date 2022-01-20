import java.util.Scanner;

public class exerc08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero para saber se ele é par ou impar");
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O numero digitado é par");
		}else {
			System.out.println("O numero digitado é impar");
		}

	}

}
