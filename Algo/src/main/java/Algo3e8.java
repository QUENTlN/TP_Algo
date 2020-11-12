import java.util.Scanner;

public class Algo3e8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        decomposition(i);
    }

    public static void decomposition(int x) {
        int[] tab = new int[x];
        int lg = x;
        for (int i=0; i<x; i++){
            tab[i] = 1;
        }
        while (tab[0] <= x){
            //affiche tableau
            int somme = 0;
            for (int j:tab) {
                if (somme < x) {
                    System.out.print(j + " ");
                }
                somme += j;
            }
            System.out.println();

            if (lg == 1) {
                break;
            }

            lg--;
            tab[lg-1]++;

            int nb1 = tab[lg] - 1;
            tab[lg] = 1;
            lg += nb1;
        }
    }
}
