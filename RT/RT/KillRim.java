package RT;
import java.util.Scanner;

public class KillRim{
    public static void main(String[] args) {
        Scanner vsfd = new Scanner(System.in);

        System.out.println("Nome de pessoas:"); 
        String name = vsfd.nextLine();  
        
        
        
        System.out.println("Digite o numero de pessoas: ");
        int age = vsfd.nextInt();
        
        ClassKill luiz = new ClassKill(name,age);

        System.out.println(luiz);

        vsfd.close();

    }
}