import java.util.Scanner;

public class Algo2e02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int fact = factorielle(n);
        System.out.println(fact);
    }

    static public int factorielle(int n){
        int factorielle = 1;
        for (int i=2; i<=n; i++){
            factorielle *=i;
        }
        return factorielle;
    }
}
