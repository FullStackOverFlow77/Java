import java.util.Scanner;
import java.util.Locale;
public class entradadados {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x= sc.next();
        
        int y;
        y = sc.nextInt();
        
        double z ; 
        z = sc.nextDouble();

        char a;
        a = sc.next().charAt(0);

        
        System.out.println("Você digitou: " + x);

        System.out.println("Você digitou: " + y);
        
        System.out.println("Você digitou: " + z);
        
        System.out.println("Você digitou: " + a );

//String x;
//int y;
//double z;

//x = sc.next();
//y = sc.nextInt();
//z = sc.nextDouble();

//System.out.println("Dados digitados:");
//System.out.println(x);
//System.out.println(y);
//System.out.println(z);

// 

        


        sc.close();
    }
    
}
