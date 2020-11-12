import java.util.Scanner;

public class Algo3e5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] polynome = {13, 7, 6, 45, 21, 9, 101, 102};
        int x = sc.nextInt();
        System.out.println("résultat = " + evaluerPolynome(polynome, x));

    }

    public static int evaluerPolynome(int[] tab, int x){
        int res = 0;
        int px = 1;

        for(int i = 0, p = tab.length-1; i < tab.length; i++, p--){
            res += tab[i] * px;
            px = px * x;
        }

        return res;
    }

}
