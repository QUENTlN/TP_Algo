import java.util.Scanner;

public class Algo2e10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        trouver(x);
    }

    static public void trouver(int x) {
        int rep;
        int inf=1;
        int sup=1000;
        do{
            int mil = (inf + sup) / 2;
            System.out.println("je pense a " + mil);
            rep = sc.nextInt();
            if (rep == 1){
                inf = mil-1;
            }else if (rep == 2){
                sup = mil+1;
            }
        }while (rep != 0);
        System.out.println("trouvé");
    }
}
