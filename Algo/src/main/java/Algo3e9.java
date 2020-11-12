import java.util.Scanner;

public class Algo3e9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        int j = sc.nextInt();
        sousEnsemble(i, j);
    }

    public static void sousEnsemble(int n, int p) {

        int[] tab = new int[n];
        boolean[] atteint = new boolean[n];
        for (int i = 0; i < n; i++) {
            tab[i] = i;
            atteint[i] = false;
        }

        int[] sousTab = new int[p];
        for (int i = 0; i < p; i++) {
            sousTab[i] = i;
        }

        int index = p - 1;
        afficherTab(sousTab);
        while (index > 0) {
            if (sousTab[index] == tab[(n-1)-((p-1)-index)]){
                if(!atteint[(n-1)-((p-1)-index)]){
                    atteint[(n-1)-((p-1)-index)] = true;
                    index--;
                    sousTab[index]++;
                    while(index<p - 1){
                        index++;
                        sousTab[index]--;
                    }
                }else{
                    index--;
                    sousTab[index]++;
                }
            }else{
                sousTab[index]++;
            }
            afficherTab(sousTab);
        }
    }

    public static void afficherTab(int[] tab){
        for (int x : tab) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
