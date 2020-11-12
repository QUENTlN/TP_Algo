import java.util.Scanner;

public class Algo2e06 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int res = fibonacci(n);
        System.out.println(res);
    }

    static public int fibonacci(int n) {
        int nbr1 = 0, nbr2 = 1, nbr3 = n;

        for (int i = 2; i <= n; i++) {
            nbr3 = nbr1 + nbr2;
            nbr1 = nbr2;
            nbr2 = nbr3;
        }
        return nbr3;
    }
}
