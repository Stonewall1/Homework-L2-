import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = 20;
        double result = 0.9*(A + B);
        System.out.println(result);
        double discount = (A + B)/10;
        System.out.println(discount);
    }
}
