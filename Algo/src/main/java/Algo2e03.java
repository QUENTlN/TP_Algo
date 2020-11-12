import java.util.Scanner;

public class Algo2e03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int produit = produit(n,n2);
        System.out.println(produit);
    }

    static public int produit(int n, int n2){
        int produit = 0;
        for (int i=1; i<=n2; i++){
            produit += n;
        }
        return produit;
    }
}
