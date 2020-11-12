import java.util.Scanner;

public class Algo2e07 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        double res = pi(n);
        System.out.println(res);
    }

    static public double pi(int n){
        double nbr1=1;
        double nbr2=1;

        for(int i=1; i<=n; ++i){
            nbr2 = (double)(-(Math.signum(nbr2)))/(2*i+1);
            nbr1 += nbr2;
        }
        return nbr1*4;
    }
}
