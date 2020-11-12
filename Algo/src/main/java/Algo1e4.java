import java.util.Scanner;

public class Algo1e4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x >= y) {
            System.out.println((x > z)? x : z);
        }else {
            System.out.println((y >= z)? y : z);
        }

    }
}
