import java.util.Scanner;

public class VectorHeH{
    public static void main(String[] args) {
        Scanner vsfd = new Scanner(System.in);

        int n = vsfd.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = vsfd.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.println(avg);


        vsfd.close();
    }
}