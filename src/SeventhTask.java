import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextDouble()){
            double n = scanner.nextDouble();
            System.out.println(Math.round(Math.abs(n)));
        }
    }
}
