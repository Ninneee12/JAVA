import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, S1, S2;
		
		System.out.println("Digite quatro numeros:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		S1 = (A * B) - (C * D);
		
		System.out.println(" A diferença é: " + S1);
		
		sc.close();
		
		

	}

}
