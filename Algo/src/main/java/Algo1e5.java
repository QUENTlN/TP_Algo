import java.util.Scanner;

public class Algo1e5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        trie(x,y,z);
    }

    static public void trie(int x, int y, int z) {
        int temp;
        if (y > z){
            temp = z;
            z = y;
            y = temp;
        }
        if (x > y){
            temp = y;
            y = x;
            x = temp;
        }
        if (y > z){
            temp = z;
            z = y;
            y = temp;
        }
        System.out.println(x + " " + y + " " + z);
    }
}
