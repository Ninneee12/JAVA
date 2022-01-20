import java.util.Scanner;
public class exerc10 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start , end, dur;
    
    System.out.println("Digite a hora inicial");
    start = sc.nextInt();
    System.out.println("Digite a hora final");
    end = sc.nextInt();
    dur =  end - start;
    
    System.out.println("O jogo durou " + dur + " Hora(s)" );
    
    sc.close();
   
	}

}
