import java.util.Scanner;

public class dowhilee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resposta ;

        do{
            System.out.print("Digite o item: ");
            String item = sc.nextLine();
            System.out.println("O item foi: " + item);
            System.out.print("Se deseja digitar mais 1 item digite (s) se não (n): ");
            System.out.println("/n");
            resposta = sc.nextLine().charAt(0); 

            }while(resposta != 'n');
    
        
        


        sc.close();
    }
}
