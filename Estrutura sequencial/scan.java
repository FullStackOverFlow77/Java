import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("\nDados digitados:");
        System.out.println("1ª: " + s1);
        System.out.println("2ª: " + s2);
        System.out.println("3ª: " + s3);

        sc.close();
    }
}
