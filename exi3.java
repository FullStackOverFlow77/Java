
import java.util.Scanner; 
public class exi3{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int conta1 = sc.nextInt();
        int conta2 = sc.nextInt();
        
        int soma= conta1 + conta2; 
        System.out.println(soma);

        sc.close();
    }
}