import java.util.Scanner;


public class Algo2e09 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int k = sc.nextInt();
        int res = kIEme(x,k);
        System.out.println(res);
    }

    static public int kIEme(int x, int k) {
        while(--k > 0){
            x = x/10;
        }
        return x%10;
    }
}


