import java.util.Scanner;

public class Algo1e1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp = x;

        x = y;
        y = temp;
        System.out.println("x vaut " + x + " et y vaut " + y);

    }
}
