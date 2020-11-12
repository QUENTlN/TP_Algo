import java.util.Scanner;

public class Algo2e13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        bonnet(i);
    }

    public static void bonnet(int x) {
        for (int j=1; j<=x; j++){
            for(int i = 1; i<=x*2; i++){
                if (i<=j || i>(x*2-j)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
