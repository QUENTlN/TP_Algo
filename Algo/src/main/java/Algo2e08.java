import java.util.Scanner;

public class Algo2e08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        double res = e(n);
        System.out.println(res);
    }

    static public double e(int x){
        double somme=1;

        for(int i=1; i<=x; ++i){
            somme += (double)(x^i)/factorielle(i);
        }
        return somme;
    }

    private static int factorielle(int n) {
        int factorielle = 1;
        for (int i=2; i<=n; i++){
            factorielle *=i;
        }
        return factorielle;
    }
}
