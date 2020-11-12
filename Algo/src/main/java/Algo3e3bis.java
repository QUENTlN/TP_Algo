import java.util.Arrays;
import java.util.Scanner;

public class Algo3e3bis {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr);
        System.out.println(chercheElement(i, arr));
    }

    public static boolean chercheElement(int x,int[] tab) {
        int inf = 0;
        int sup = tab.length - 1;
        while (inf < sup){
            int mil = (inf+sup)/2;
            if (x > tab[mil]){
                inf = mil+1;
            }else{
                sup = mil;
            }
        }
        return tab[inf] == x;
    }
}
