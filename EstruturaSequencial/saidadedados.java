import java.util.Locale;

public class saidadedados{
    public static void main (String[]args){
        int y = 32;
        double x = 10.524;
        
        
        System.out.println("Olá Mundo");
        
        System.out.println(y);
        
        System.out.println(x);
    
        System.out.printf("%.2f%n",x);

        System.out.printf("%.1f%n",x);

        Locale.setDefault(Locale.US);

        System.out.println("Resultado: " + x + " Metros");

        System.out.printf("Resultado %.2f Metros%n" , x);

        System.out.println("PrimeiraLinha\nSegundaLinha");

        System.out.printf("Terceira Linha%nQuarta Linha");
    }
    
}
