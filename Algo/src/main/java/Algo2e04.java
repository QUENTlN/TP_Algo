import java.util.Scanner;

public class Algo2e04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int quotien;
        int reste = n;
        for (quotien=0;reste >= n2;quotien++, reste -= n2);
        System.out.println("quotien: " + quotien + "  reste : " + reste);
    }
}
