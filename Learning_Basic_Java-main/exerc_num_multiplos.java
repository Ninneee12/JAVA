import java.util.Scanner;
public class exerc09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite um numero");
		A = sc.nextInt();
		
		System.out.println("Digite outro numero");
		B = sc.nextInt();
		
		if ( A % B == 0 || B % A == 0) {
			
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
sc.close();
	}

}
