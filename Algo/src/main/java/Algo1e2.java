import java.util.Scanner;

public class Algo1e2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int x = sc.nextInt();
        int y = sc.nextInt();

        x = x + y; //17 = 10 + 7
        y = x - y; //10 = 17 - 7
        x = x - y; //7  = 17 - 10

        System.out.println("x vaut " + x + " et y vaut " + y);

    }
}
