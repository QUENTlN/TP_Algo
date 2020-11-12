import java.util.Scanner;

public class Algo2e14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(newton(i,j));
    }

    public static double newton(int a, int j) {
        double xn = 1;
        for (int i=0; i<j; i++){
            xn = (xn + ((double)a/xn))/2;
        }
        return (double)Math.round(xn * 100000000) / 100000000;
    }
}
