import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		
		int x,y,t;
		System.out.println("Digite um numero:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		System.out.println("Digite outro numero:");
	    y = sc.nextInt();
	    sc.close();
	    
		t = x + y;
		
		System.out.println("A soma entre esses dois numeros é: " + t);
				

	}

}
