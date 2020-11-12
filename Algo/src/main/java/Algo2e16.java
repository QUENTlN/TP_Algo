import java.util.Scanner;

public class Algo2e16 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(puissance(x,n));
    }

    public static int puissance(int x, int n){
        int somme = x;
        for (int i =1;i<n;i++){
            int tot = somme;
            for (int j=1;j<x;j++){
                somme += tot;
            }
        }
        return somme;
    }
}
