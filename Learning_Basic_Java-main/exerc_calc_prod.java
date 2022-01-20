import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, q1, q2;
		double v1,v2, t1, t2;
		System.out.println("----------------Calculo da Peça R$-------------------");
		System.out.println("Digite o codigo da primeira peça:");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade:");
		q1 = sc.nextInt();
		System.out.println("Digite o valor unitario");
		v1 = sc.nextDouble();
		t1 = q1 * v1;
		System.out.println("O total da primeira peça é: R$ " + t1);
				
		System.out.println("---------------------------------------");
		
		System.out.println("Digite o codigo da segunda peça:");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade:");
		q2 = sc.nextInt();
		System.out.println("Digite o valor unitario");
		v2 = sc.nextDouble();
		t2 = q2 *v2;
		System.out.println("O total da primeira peça é: R$" + t2);
		
		sc.close();

	}

}
