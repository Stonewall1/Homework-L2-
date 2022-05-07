import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a
       double A1 = scanner.nextDouble();
       double B1 = 30;
       double resultA = (10*(A1*0.85)) + (2*B1);
       System.out.println(resultA);
       //b
        double A2 = scanner.nextDouble();
        double B2 = 12.5;
        double resultB = (7*(A1*0.50)) + (1*B2);
        System.out.println(resultB);
        //c
        double A3 = scanner.nextDouble();
        double B3 = 19;
        double resultC = (2*(A3*0.90)) + (3*B3);
        System.out.println(resultC);
    }
}
