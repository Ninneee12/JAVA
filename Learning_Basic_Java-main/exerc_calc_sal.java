import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id;
		double h, v, s;
		System.out.println("Digite o seu ID:");
		id = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhads:");
		h = sc.nextDouble();
		System.out.println("Digite o valor das horas trabalhadas:");
		v = sc.nextDouble();
		
		s = h * v;
		System.out.println("ID: " + id + " Salario: R$" + s);
		
		sc.close();
		

	}

}
