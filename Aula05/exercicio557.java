import java.util.*;

public class exercicio557 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Introduza um valor: ");
		int valorA = sc.nextInt();
		
		System.out.print("Insira agora o outro: ");
		int valorB = sc.nextInt();
		
		maximoDivisorComum (valorA, valorB);
		
	}
	
	public static void maximoDivisorComum (int valorA, int valorB) {

		int temp, c;
		
		if(valorA<valorB){
			temp=valorA;
			valorA=valorB;
			valorB=temp;
		}
		
		do{
			
			c=valorA % valorB;
			if(c==0) System.out.println("O maior divisor comum é " + valorB + ".");
			else valorB=c;

		}while(c!=0);
		
	}
}