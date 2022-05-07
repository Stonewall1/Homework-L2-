public class TenthTask {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        int result = (a+b+c+d+e+f+g+h+i+j)/10; // 45/10 != 4
        System.out.println(result);
        double realResult = (double)(a+b+c+d+e+f+g+h+i+j)/10; // 45/10 = 4.5
        System.out.println(realResult);
    }
}
