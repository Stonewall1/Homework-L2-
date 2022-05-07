import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int n = 723;
        int result = 0;
        while(n != 0){
             result += (n % 10);
              n = n/10;
        }
        System.out.println(result);
    }
}
