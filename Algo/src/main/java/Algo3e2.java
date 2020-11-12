import java.util.Scanner;

public class Algo3e2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        enBinaire(i);
    }

    public static void enBinaire(int x) {
        int[] tab = new int[32];
        int i = 0;
        while (x>0){
            tab[i++] = x%2;
            x /= 2;
        }

        while (--i >= 0){
            System.out.print(tab[i]);
        }

    }
}
