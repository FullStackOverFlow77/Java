public class javaformat{
    public static void main(String[] args) {
        String original = "ABCD  efgj  IJKL EPQR    ";

        String formato = original.toLowerCase();
        String formato2 = original.toUpperCase();
        String formato3 = original.trim();

        System.out.println("\nVersão original: -" + original + "-\n" );
        System.out.println("Versão Lower: -" + formato + "-\n");
        System.out.println("Versão Upper: -" + formato2 + "-\n");
        System.out.println("Versão trim: -" + formato3 + "-\n");
    }
}