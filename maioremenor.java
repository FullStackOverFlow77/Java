import java.util.Scanner;
public class maioremenor{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int soma = x + y ; 
		
		if (x > y) {
            System.out.println("X:" + x + " X é maior que Y " + y);
        }
        else {
            System.out.println("Y" + y + " Y é maior que X" + x);
        }
		
		System.out.println("Soma total:  " + soma);
		sc.close();
		
		
	}
}