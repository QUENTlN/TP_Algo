import java.util.Scanner;

public class Algo2e01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int somme = 0;
        for (int i=1; i<=n; i++){
            somme +=i;
        }
        System.out.println(somme);
    }
}
