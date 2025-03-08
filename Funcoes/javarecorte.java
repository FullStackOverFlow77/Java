public class javarecorte {
    public static void main(String[] args) {
        String original = "abc  fghk  IJbc EPQR    ";

        String s01 = original.substring(2);

        String s02 = original.substring(2,9);
        
        String s03 = original.replace("a","x");
        
        String s04 = original.replace("abc","xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        
        

        System.out.println("\n Versão substring:  -" + s01 + "-\n");
        System.out.println("\n Versão substring(2):  -" + s02 + "-\n");
        System.out.println("\n Versão replace:  -" + s03 + "-\n");
        System.out.println("\n Versão replace(2):  -" + s04 + "-\n");
        System.out.println("\n Versão indexOF:  " + i );
        System.out.println("\n Versão lastIndexOf: ):  " + j );


    }
}
