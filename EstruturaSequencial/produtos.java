import java.util.Locale;

public class produtos {
    public static void main(String[]args){
        String product1 = "Computador";
        String product2 = "Desk Oficial";
        int age = 29 ; 
        int code  = 5249 ; 
        char gender = 'F';
        double price1 = 2100.0; 
        double price2 = 650.00; 
        double measure = 53.234567 ; 

        System.out.printf("Products: %n %s  Whice price is %f %n %s Whice price is %f %n" ,product1, price1 , product2 , price2 ); 

        System.out.printf("Record: %d years old , code %d and gender :%c%n " , age , code , gender);

        Locale.setDefault(Locale.US);

        System.out.printf("Measure with eight decimal places: %f%n Rouded (Three decimal places): %.3f%n" , measure , measure);

        

        


        

        



    }
    
}
