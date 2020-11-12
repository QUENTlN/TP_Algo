import java.util.Scanner;

public class Algo1e7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int valeur = sc.nextInt();
        int n;
        int pb = 20;

        while(valeur > 0){
            n = valeur/pb;
            System.out.println(n + " billet(s)/piece(s) de " + pb);
            valeur = valeur % pb;
            pb /= 2;
        }
    }
}
