import java.util.Scanner;

public class Algo1e3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int temp = x;
        x = y;
        y = z;
        z = temp;
        System.out.println("x: " + x + " y: " + y + " z: " + z);

    }
}
