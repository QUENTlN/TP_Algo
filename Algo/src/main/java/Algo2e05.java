import java.util.Scanner;

public class Algo2e05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int pgcd = pgcdAmeliorer(n,n2);
        System.out.println(pgcd);
    }

    static public int pgcd(int n, int n2){
        while (n!=n2){
            if (n < n2){
                n2 -= n;
            }else{
                n -= n2;
            }
        }
        return n;
    }

    static public int pgcdAmeliorer(int n, int n2){
        int reste;

        while ((reste = n%n2) > 0){
            n = n2;
            n2 = reste;
        }

        return n2;
    }
}
