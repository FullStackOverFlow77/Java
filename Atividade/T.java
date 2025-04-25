import java.util.Scanner;


public class T{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 

        

        int a = ler.nextInt(); 
        int b = ler.nextInt(); 
        int c = ler.nextInt(); 

        int maioria = guardar(a,b,c); 

        lerMetodo(maioria);
        
        ler.close();
    }
        
        public static int guardar(int a , int b , int c){
            int manter; 

            if(a > b && a > c){
                manter = a; 
            }
            
            else if(b >  a && b > c){
                manter = b; 
            }
            else{
                manter = c ;
            }

            return manter; 

        }

        public static void lerMetodo(int valor) {
            System.out.println("O maior valor é " + valor);
        }
    }


